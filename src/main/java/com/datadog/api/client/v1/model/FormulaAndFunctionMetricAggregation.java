/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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

/** The aggregation methods available for metrics queries. */
@JsonSerialize(
    using = FormulaAndFunctionMetricAggregation.FormulaAndFunctionMetricAggregationSerializer.class)
public class FormulaAndFunctionMetricAggregation extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList("avg", "min", "max", "sum", "last", "area", "l2norm", "percentile"));

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

  FormulaAndFunctionMetricAggregation(String value) {
    super(value, allowedValues);
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

  @JsonCreator
  public static FormulaAndFunctionMetricAggregation fromValue(String value) {
    return new FormulaAndFunctionMetricAggregation(value);
  }
}
