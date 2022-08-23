/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

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

/** An aggregation function. */
@JsonSerialize(using = RUMAggregationFunction.RUMAggregationFunctionSerializer.class)
public class RUMAggregationFunction {

  public static final RUMAggregationFunction COUNT = new RUMAggregationFunction("count");
  public static final RUMAggregationFunction CARDINALITY =
      new RUMAggregationFunction("cardinality");
  public static final RUMAggregationFunction PERCENTILE_75 = new RUMAggregationFunction("pc75");
  public static final RUMAggregationFunction PERCENTILE_90 = new RUMAggregationFunction("pc90");
  public static final RUMAggregationFunction PERCENTILE_95 = new RUMAggregationFunction("pc95");
  public static final RUMAggregationFunction PERCENTILE_98 = new RUMAggregationFunction("pc98");
  public static final RUMAggregationFunction PERCENTILE_99 = new RUMAggregationFunction("pc99");
  public static final RUMAggregationFunction SUM = new RUMAggregationFunction("sum");
  public static final RUMAggregationFunction MIN = new RUMAggregationFunction("min");
  public static final RUMAggregationFunction MAX = new RUMAggregationFunction("max");
  public static final RUMAggregationFunction AVG = new RUMAggregationFunction("avg");
  public static final RUMAggregationFunction MEDIAN = new RUMAggregationFunction("median");

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "count",
              "cardinality",
              "pc75",
              "pc90",
              "pc95",
              "pc98",
              "pc99",
              "sum",
              "min",
              "max",
              "avg",
              "median"));

  private String value;

  public boolean isValid() {
    return allowedValues.contains(this.value);
  }

  RUMAggregationFunction(String value) {
    this.value = value;
  }

  public static class RUMAggregationFunctionSerializer
      extends StdSerializer<RUMAggregationFunction> {
    public RUMAggregationFunctionSerializer(Class<RUMAggregationFunction> t) {
      super(t);
    }

    public RUMAggregationFunctionSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        RUMAggregationFunction value, JsonGenerator jgen, SerializerProvider provider)
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

  /** Return true if this RUMAggregationFunction object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return this.value.equals(((RUMAggregationFunction) o).value);
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
  public static RUMAggregationFunction fromValue(String value) {
    return new RUMAggregationFunction(value);
  }
}
