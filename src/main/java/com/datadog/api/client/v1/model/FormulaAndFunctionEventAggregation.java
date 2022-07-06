/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/** Aggregation methods for event platform queries. */
@JsonSerialize(
    using = FormulaAndFunctionEventAggregation.FormulaAndFunctionEventAggregationSerializer.class)
public class FormulaAndFunctionEventAggregation {

  public static final FormulaAndFunctionEventAggregation COUNT =
      new FormulaAndFunctionEventAggregation("count");
  public static final FormulaAndFunctionEventAggregation CARDINALITY =
      new FormulaAndFunctionEventAggregation("cardinality");
  public static final FormulaAndFunctionEventAggregation MEDIAN =
      new FormulaAndFunctionEventAggregation("median");
  public static final FormulaAndFunctionEventAggregation PC75 =
      new FormulaAndFunctionEventAggregation("pc75");
  public static final FormulaAndFunctionEventAggregation PC90 =
      new FormulaAndFunctionEventAggregation("pc90");
  public static final FormulaAndFunctionEventAggregation PC95 =
      new FormulaAndFunctionEventAggregation("pc95");
  public static final FormulaAndFunctionEventAggregation PC98 =
      new FormulaAndFunctionEventAggregation("pc98");
  public static final FormulaAndFunctionEventAggregation PC99 =
      new FormulaAndFunctionEventAggregation("pc99");
  public static final FormulaAndFunctionEventAggregation SUM =
      new FormulaAndFunctionEventAggregation("sum");
  public static final FormulaAndFunctionEventAggregation MIN =
      new FormulaAndFunctionEventAggregation("min");
  public static final FormulaAndFunctionEventAggregation MAX =
      new FormulaAndFunctionEventAggregation("max");
  public static final FormulaAndFunctionEventAggregation AVG =
      new FormulaAndFunctionEventAggregation("avg");

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "count",
              "cardinality",
              "median",
              "pc75",
              "pc90",
              "pc95",
              "pc98",
              "pc99",
              "sum",
              "min",
              "max",
              "avg"));

  private String value;

  public boolean isValid() {
    return allowedValues.contains(this.value);
  }

  FormulaAndFunctionEventAggregation(String value) {
    this.value = value;
  }

  public static class FormulaAndFunctionEventAggregationSerializer
      extends StdSerializer<FormulaAndFunctionEventAggregation> {
    public FormulaAndFunctionEventAggregationSerializer(
        Class<FormulaAndFunctionEventAggregation> t) {
      super(t);
    }

    public FormulaAndFunctionEventAggregationSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        FormulaAndFunctionEventAggregation value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonValue
  public String getValue() {
    return this.value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  /** Return true if this FormulaAndFunctionEventAggregation object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return this.value.equals(((FormulaAndFunctionEventAggregation) o).value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value);
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static FormulaAndFunctionEventAggregation fromValue(String value) {
    return new FormulaAndFunctionEventAggregation(value);
  }
}
