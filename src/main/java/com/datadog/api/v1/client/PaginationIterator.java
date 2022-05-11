/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.datadog.api.v1.client;

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

  private static int converToInt(Object arg) {
    switch (arg.toString()) {
      case "java.lang.Long":
        Long value;
        value = Long.parseLong(arg.toString());
        return value.intValue();
      case "string":
      case "java.lang.String":
        return Integer.parseInt(arg.toString());
      default:
        return (int) arg;
    }
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

  private void setNextPageValue(Object response)
      throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
    Object value = response;

    if (this.iterable.valueGetterPath.length > 0) {
      for (String path : this.iterable.valueGetterPath) {
        value = value.getClass().getMethod(path).invoke(value);
      }
    } else {
      // will fallback to pageOffset = totalCount;
      value = null;
    }

    Object temp;
    int i;
    if (this.iterable.valueSetterParamOptional) {
      temp = this.iterable.args.get("optionalParams");
      i = 0;
    } else {
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

    // Set the fallback pageOffset value
    // We cast the type based on the setterMethod parameter type
    if (value == null) {
      Method[] methods = temp.getClass().getDeclaredMethods();
      Method setterMethod = null;
      for (Method m : methods) {
        if (m.getName().equals(this.iterable.valueSetterPath[i])) {
          setterMethod = m;
          break;
        }
      }

      assert setterMethod != null;
      String pType = setterMethod.getParameterTypes()[0].toString();
      switch (pType) {
        case "long":
        case "java.lang.Long":
          value = (long) this.totalCount;
          break;
        case "string":
        case "java.lang.String":
          value = String.valueOf(this.totalCount);
          break;
        default:
          value = this.totalCount;
      }
    }

    // Set the value
    temp.getClass()
        .getMethod(
            this.iterable.valueSetterPath[this.iterable.valueSetterPath.length - 1],
            value.getClass())
        .invoke(temp, value);

    this.hasNextPage = true;
  }

  private void getNextPage() {
    Object response;
    try {
      response = this.requestMethod.invoke(iterable.requestClass, iterable.args.values().toArray());
      Object resultData = response;

      for (String path : this.iterable.resultsPath) {
        resultData = resultData.getClass().getMethod(path).invoke(resultData);
      }

      this.data = ((ArrayList) resultData);
      this.totalCount += this.data.size();
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

  @Override
  public boolean hasNext() {
    if (this.currentIndex < this.data.size()) {
      return true;
    }

    if (this.data.size() < converToInt(this.iterable.limit)) {
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
