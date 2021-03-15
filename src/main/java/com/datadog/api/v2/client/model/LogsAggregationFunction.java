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

/** An aggregation function */
public enum LogsAggregationFunction {
  COUNT("count"),

  CARDINALITY("cardinality"),

  PERCENTILE_75("pc75"),

  PERCENTILE_90("pc90"),

  PERCENTILE_95("pc95"),

  PERCENTILE_98("pc98"),

  PERCENTILE_99("pc99"),

  SUM("sum"),

  MIN("min"),

  MAX("max"),

  AVG("avg");

  private String value;

  LogsAggregationFunction(String value) {
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
  public static LogsAggregationFunction fromValue(String value) {
    for (LogsAggregationFunction b : LogsAggregationFunction.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}
