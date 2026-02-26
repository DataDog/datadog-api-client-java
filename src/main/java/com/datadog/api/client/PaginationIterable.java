/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client;

import java.util.LinkedHashMap;

public class PaginationIterable<T> implements Iterable<T> {
  Object requestClass;
  String requestName;
  String[] resultsPath = null;
  String[] valueGetterPath;
  String[] valueSetterPath;
  Boolean valueSetterParamOptional;
  Boolean offsetPageIncrement;
  Object limit;
  LinkedHashMap<String, Object> args;

  public PaginationIterable(
      Object requestClass,
      String requestName,
      String resultsPath,
      String valueGetterPath,
      String valueSetterPath,
      Boolean valueSetterParamOptional,
      Boolean offsetPageIncrement,
      Object limit,
      LinkedHashMap<String, Object> args) {

    this.requestClass = requestClass;
    this.requestName = requestName;
    if (resultsPath != "") {
      this.resultsPath = resultsPath.split("\\.");
    }
    if (!valueGetterPath.isEmpty()) {
      this.valueGetterPath = valueGetterPath.split("\\.");
    } else {
      this.valueGetterPath = new String[0];
    }
    this.valueSetterPath = valueSetterPath.split("\\.");
    this.valueSetterParamOptional = valueSetterParamOptional;
    this.offsetPageIncrement = offsetPageIncrement;
    this.limit = limit;
    this.args = args;
  }

  @Override
  public PaginationIterator<T> iterator() {
    return new PaginationIterator<T>(this);
  }
}
