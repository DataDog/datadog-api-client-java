/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.datadog.api.v2.client.model;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Sorting options */
public enum ApplicationKeysSort {
  CREATED_AT_ASCENDING("created_at"),

  CREATED_AT_DESCENDING("-created_at"),

  LAST4_ASCENDING("last4"),

  LAST4_DESCENDING("-last4"),

  NAME_ASCENDING("name"),

  NAME_DESCENDING("-name");

  private String value;

  ApplicationKeysSort(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ApplicationKeysSort fromValue(String value) {
    for (ApplicationKeysSort b : ApplicationKeysSort.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}
