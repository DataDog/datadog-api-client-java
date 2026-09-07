/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.datadog.api.client.ModelEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/** An aggregation function. */
@JsonSerialize(using = SpansAggregationFunction.SpansAggregationFunctionSerializer.class)
public class SpansAggregationFunction extends ModelEnum<String> {

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

  public static final SpansAggregationFunction COUNT = new SpansAggregationFunction("count");
  public static final SpansAggregationFunction CARDINALITY =
      new SpansAggregationFunction("cardinality");
  public static final SpansAggregationFunction PERCENTILE_75 = new SpansAggregationFunction("pc75");
  public static final SpansAggregationFunction PERCENTILE_90 = new SpansAggregationFunction("pc90");
  public static final SpansAggregationFunction PERCENTILE_95 = new SpansAggregationFunction("pc95");
  public static final SpansAggregationFunction PERCENTILE_98 = new SpansAggregationFunction("pc98");
  public static final SpansAggregationFunction PERCENTILE_99 = new SpansAggregationFunction("pc99");
  public static final SpansAggregationFunction SUM = new SpansAggregationFunction("sum");
  public static final SpansAggregationFunction MIN = new SpansAggregationFunction("min");
  public static final SpansAggregationFunction MAX = new SpansAggregationFunction("max");
  public static final SpansAggregationFunction AVG = new SpansAggregationFunction("avg");
  public static final SpansAggregationFunction MEDIAN = new SpansAggregationFunction("median");

  SpansAggregationFunction(String value) {
    super(value, allowedValues);
  }

  public static class SpansAggregationFunctionSerializer
      extends StdSerializer<SpansAggregationFunction> {
    public SpansAggregationFunctionSerializer(Class<SpansAggregationFunction> t) {
      super(t);
    }

    public SpansAggregationFunctionSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SpansAggregationFunction value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SpansAggregationFunction fromValue(String value) {
    return new SpansAggregationFunction(value);
  }
}
