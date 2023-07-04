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

/** Data source for metrics queries. */
@JsonSerialize(
    using = FormulaAndFunctionMetricDataSource.FormulaAndFunctionMetricDataSourceSerializer.class)
public class FormulaAndFunctionMetricDataSource extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("metrics"));

  public static final FormulaAndFunctionMetricDataSource METRICS =
      new FormulaAndFunctionMetricDataSource("metrics");

  FormulaAndFunctionMetricDataSource(String value) {
    super(value, allowedValues);
  }

  public static class FormulaAndFunctionMetricDataSourceSerializer
      extends StdSerializer<FormulaAndFunctionMetricDataSource> {
    public FormulaAndFunctionMetricDataSourceSerializer(
        Class<FormulaAndFunctionMetricDataSource> t) {
      super(t);
    }

    public FormulaAndFunctionMetricDataSourceSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        FormulaAndFunctionMetricDataSource value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static FormulaAndFunctionMetricDataSource fromValue(String value) {
    return new FormulaAndFunctionMetricDataSource(value);
  }
}
