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

/** An aggregation function */
@JsonSerialize(using = LogsAggregationFunction.LogsAggregationFunctionSerializer.class)
public class LogsAggregationFunction {

  public static final LogsAggregationFunction COUNT = new LogsAggregationFunction("count");
  public static final LogsAggregationFunction CARDINALITY =
      new LogsAggregationFunction("cardinality");
  public static final LogsAggregationFunction PERCENTILE_75 = new LogsAggregationFunction("pc75");
  public static final LogsAggregationFunction PERCENTILE_90 = new LogsAggregationFunction("pc90");
  public static final LogsAggregationFunction PERCENTILE_95 = new LogsAggregationFunction("pc95");
  public static final LogsAggregationFunction PERCENTILE_98 = new LogsAggregationFunction("pc98");
  public static final LogsAggregationFunction PERCENTILE_99 = new LogsAggregationFunction("pc99");
  public static final LogsAggregationFunction SUM = new LogsAggregationFunction("sum");
  public static final LogsAggregationFunction MIN = new LogsAggregationFunction("min");
  public static final LogsAggregationFunction MAX = new LogsAggregationFunction("max");
  public static final LogsAggregationFunction AVG = new LogsAggregationFunction("avg");
  public static final LogsAggregationFunction MEDIAN = new LogsAggregationFunction("median");

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

  LogsAggregationFunction(String value) {
    this.value = value;
  }

  public static class LogsAggregationFunctionSerializer
      extends StdSerializer<LogsAggregationFunction> {
    public LogsAggregationFunctionSerializer(Class<LogsAggregationFunction> t) {
      super(t);
    }

    public LogsAggregationFunctionSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        LogsAggregationFunction value, JsonGenerator jgen, SerializerProvider provider)
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

  /** Return true if this LogsAggregationFunction object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return this.value.equals(((LogsAggregationFunction) o).value);
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
  public static LogsAggregationFunction fromValue(String value) {
    return new LogsAggregationFunction(value);
  }
}
