/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;

public class PaginationIterator<T> implements Iterator<T> {
  private int currentIndex = 0;
  private int totalCount = 0;
  private Boolean hasNextPage;
  private ArrayList data;
  private PaginationIterable iterable;
  private Method requestMethod;

  PaginationIterator(PaginationIterable iterable) {
    this.iterable = iterable;
    this.requestMethod = buildRequestMethod();

    // Populate initial data
    getNextPage();
  }

  private Method buildRequestMethod() {
    Method[] methods = this.iterable.requestClass.getClass().getDeclaredMethods();
    for (Method m : methods) {
      if (m.getName().equals(this.iterable.requestName)) {
        if (m.getParameterTypes().length == this.iterable.args.keySet().size()) {
          m.setAccessible(true);
          return m;
        }
      }
    }

    throw new RuntimeException("Unable to find request method " + this.iterable.requestName);
  }

  private void setNextPageValue(Object response) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
    Object value = response;

    Object temp;
    int i;
    if (this.iterable.valueSetterParamOptional) {
      temp = this.iterable.args.get("optionalParams");
      i = 0;
    } else {
      // First accessor is the arg. Skip the first item in list.
      temp = this.iterable.args.get(this.iterable.valueSetterPath[0]);
      i = 1;
    }

    // Get the correct object with the setter method
    for (; i < this.iterable.valueSetterPath.length - 1; i++) {
      try {
        // Check if field else fallback to method
        Field f = temp.getClass().getDeclaredField(this.iterable.valueSetterPath[i]);
        f.setAccessible(true);
        temp = f.get(temp);
      } catch (Exception e) {
        temp = temp.getClass().getMethod(this.iterable.valueSetterPath[i]).invoke(temp);
      }
    }

    // Get setter method.
    Method setterMethod = null;
    for (Method m : temp.getClass().getDeclaredMethods()) {
      if (m.getName().equals(this.iterable.valueSetterPath[i])) {
        setterMethod = m;
        break;
      }
    }

    assert setterMethod != null;

    if (this.iterable.valueGetterPath.length > 0) {
      for (String path : this.iterable.valueGetterPath) {
        value = value.getClass().getMethod(path).invoke(value);
      }
    } else {
      // fallback to pageOffset = totalCount;
      // We cast the type based on the setterMethod parameter type
      String pType = setterMethod.getParameterTypes()[0].getSimpleName();
      if ("Long".equals(pType)) {
        value = (long) this.totalCount;
      } else {
        value = this.totalCount;
      }
    }

    // Set the value
    setterMethod.invoke(temp, value);

    this.hasNextPage = true;
  }

  private void getNextPage() {
    Object response;
    try {
      response = this.requestMethod.invoke(iterable.requestClass, iterable.args.values().toArray());
      Object resultData = response;

      if (this.iterable.resultsPath != null) {
        for (String path : this.iterable.resultsPath) {
          resultData = resultData.getClass().getMethod(path).invoke(resultData);
        }
      }

      this.data = ((ArrayList) resultData);
      if (this.iterable.offsetPageIncrement) {
        this.totalCount += this.data.size();
      } else {
        this.totalCount += 1;
      }
      // Reset the index back to zero
      this.currentIndex = 0;
    } catch (Exception e) {
      throw new RuntimeException("Unable to preload results: " + e.getMessage(), e);
    }

    try {
      setNextPageValue(response);
    } catch (Exception e) {
      this.hasNextPage = false;
    }
  }

  private static int convertToInt(Object arg) {
    if ("Long".equals(arg.getClass().getSimpleName())) {
      long value;
      value = Long.parseLong(arg.toString());
      return (int) value;
    }
    return (int) arg;
  }

  @Override
  public boolean hasNext() {
    if (this.currentIndex < this.data.size()) {
      return true;
    }

    if (this.data.size() < convertToInt(this.iterable.limit)) {
      return false;
    }

    if (this.hasNextPage) {
      getNextPage();
      return this.data.size() != 0;
    }

    return false;
  }

  @Override
  public T next() {
    this.currentIndex++;
    return ((T) data.get(currentIndex - 1));
  }
}