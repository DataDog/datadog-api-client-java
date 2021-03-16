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

/** Aggregation methods for event platform queries. */
public enum FormulaAndFunctionEventAggregation {
  COUNT("count"),

  CARDINALITY("cardinality"),

  PC75("pc75"),

  PC90("pc90"),

  PC95("pc95"),

  PC98("pc98"),

  PC99("pc99"),

  SUM("sum"),

  MIN("min"),

  MAX("max"),

  AVG("avg");

  private String value;

  FormulaAndFunctionEventAggregation(String value) {
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
  public static FormulaAndFunctionEventAggregation fromValue(String value) {
    for (FormulaAndFunctionEventAggregation b : FormulaAndFunctionEventAggregation.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}
