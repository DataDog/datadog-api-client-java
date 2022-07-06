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

/** The aggregation methods available for metrics queries. */
@JsonSerialize(
    using = FormulaAndFunctionMetricAggregation.FormulaAndFunctionMetricAggregationSerializer.class)
public class FormulaAndFunctionMetricAggregation {

  public static final FormulaAndFunctionMetricAggregation AVG =
      new FormulaAndFunctionMetricAggregation("avg");
  public static final FormulaAndFunctionMetricAggregation MIN =
      new FormulaAndFunctionMetricAggregation("min");
  public static final FormulaAndFunctionMetricAggregation MAX =
      new FormulaAndFunctionMetricAggregation("max");
  public static final FormulaAndFunctionMetricAggregation SUM =
      new FormulaAndFunctionMetricAggregation("sum");
  public static final FormulaAndFunctionMetricAggregation LAST =
      new FormulaAndFunctionMetricAggregation("last");
  public static final FormulaAndFunctionMetricAggregation AREA =
      new FormulaAndFunctionMetricAggregation("area");
  public static final FormulaAndFunctionMetricAggregation L2NORM =
      new FormulaAndFunctionMetricAggregation("l2norm");
  public static final FormulaAndFunctionMetricAggregation PERCENTILE =
      new FormulaAndFunctionMetricAggregation("percentile");

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList("avg", "min", "max", "sum", "last", "area", "l2norm", "percentile"));

  private String value;

  public boolean isValid() {
    return allowedValues.contains(this.value);
  }

  FormulaAndFunctionMetricAggregation(String value) {
    this.value = value;
  }

  public static class FormulaAndFunctionMetricAggregationSerializer
      extends StdSerializer<FormulaAndFunctionMetricAggregation> {
    public FormulaAndFunctionMetricAggregationSerializer(
        Class<FormulaAndFunctionMetricAggregation> t) {
      super(t);
    }

    public FormulaAndFunctionMetricAggregationSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        FormulaAndFunctionMetricAggregation value, JsonGenerator jgen, SerializerProvider provider)
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

  /** Return true if this FormulaAndFunctionMetricAggregation object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return this.value.equals(((FormulaAndFunctionMetricAggregation) o).value);
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
  public static FormulaAndFunctionMetricAggregation fromValue(String value) {
    return new FormulaAndFunctionMetricAggregation(value);
  }
}
