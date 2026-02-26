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
@JsonSerialize(using = CIAppAggregationFunction.CIAppAggregationFunctionSerializer.class)
public class CIAppAggregationFunction extends ModelEnum<String> {

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
              "median",
              "latest",
              "earliest",
              "most_frequent",
              "delta"));

  public static final CIAppAggregationFunction COUNT = new CIAppAggregationFunction("count");
  public static final CIAppAggregationFunction CARDINALITY =
      new CIAppAggregationFunction("cardinality");
  public static final CIAppAggregationFunction PERCENTILE_75 = new CIAppAggregationFunction("pc75");
  public static final CIAppAggregationFunction PERCENTILE_90 = new CIAppAggregationFunction("pc90");
  public static final CIAppAggregationFunction PERCENTILE_95 = new CIAppAggregationFunction("pc95");
  public static final CIAppAggregationFunction PERCENTILE_98 = new CIAppAggregationFunction("pc98");
  public static final CIAppAggregationFunction PERCENTILE_99 = new CIAppAggregationFunction("pc99");
  public static final CIAppAggregationFunction SUM = new CIAppAggregationFunction("sum");
  public static final CIAppAggregationFunction MIN = new CIAppAggregationFunction("min");
  public static final CIAppAggregationFunction MAX = new CIAppAggregationFunction("max");
  public static final CIAppAggregationFunction AVG = new CIAppAggregationFunction("avg");
  public static final CIAppAggregationFunction MEDIAN = new CIAppAggregationFunction("median");
  public static final CIAppAggregationFunction LATEST = new CIAppAggregationFunction("latest");
  public static final CIAppAggregationFunction EARLIEST = new CIAppAggregationFunction("earliest");
  public static final CIAppAggregationFunction MOST_FREQUENT =
      new CIAppAggregationFunction("most_frequent");
  public static final CIAppAggregationFunction DELTA = new CIAppAggregationFunction("delta");

  CIAppAggregationFunction(String value) {
    super(value, allowedValues);
  }

  public static class CIAppAggregationFunctionSerializer
      extends StdSerializer<CIAppAggregationFunction> {
    public CIAppAggregationFunctionSerializer(Class<CIAppAggregationFunction> t) {
      super(t);
    }

    public CIAppAggregationFunctionSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        CIAppAggregationFunction value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static CIAppAggregationFunction fromValue(String value) {
    return new CIAppAggregationFunction(value);
  }
}
