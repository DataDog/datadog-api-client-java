/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.datadog.api.v1.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The timeframe of the threshold associated with this error or \&quot;all\&quot; if all thresholds
 * are affected.
 */
public enum SLOErrorTimeframe {
  SEVEN_DAYS("7d"),

  THIRTY_DAYS("30d"),

  NINETY_DAYS("90d"),

  ALL("all");

  private String value;

  SLOErrorTimeframe(String value) {
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
  public static SLOErrorTimeframe fromValue(String value) {
    for (SLOErrorTimeframe b : SLOErrorTimeframe.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}
