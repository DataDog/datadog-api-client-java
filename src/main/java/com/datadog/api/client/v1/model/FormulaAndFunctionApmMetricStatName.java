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

/** APM metric stat name. */
@JsonSerialize(
    using = FormulaAndFunctionApmMetricStatName.FormulaAndFunctionApmMetricStatNameSerializer.class)
public class FormulaAndFunctionApmMetricStatName extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "errors",
              "error_rate",
              "errors_per_second",
              "latency_avg",
              "latency_max",
              "latency_p50",
              "latency_p75",
              "latency_p90",
              "latency_p95",
              "latency_p99",
              "latency_p999",
              "latency_distribution",
              "hits",
              "hits_per_second",
              "total_time",
              "apdex"));

  public static final FormulaAndFunctionApmMetricStatName ERRORS =
      new FormulaAndFunctionApmMetricStatName("errors");
  public static final FormulaAndFunctionApmMetricStatName ERROR_RATE =
      new FormulaAndFunctionApmMetricStatName("error_rate");
  public static final FormulaAndFunctionApmMetricStatName ERRORS_PER_SECOND =
      new FormulaAndFunctionApmMetricStatName("errors_per_second");
  public static final FormulaAndFunctionApmMetricStatName LATENCY_AVG =
      new FormulaAndFunctionApmMetricStatName("latency_avg");
  public static final FormulaAndFunctionApmMetricStatName LATENCY_MAX =
      new FormulaAndFunctionApmMetricStatName("latency_max");
  public static final FormulaAndFunctionApmMetricStatName LATENCY_P50 =
      new FormulaAndFunctionApmMetricStatName("latency_p50");
  public static final FormulaAndFunctionApmMetricStatName LATENCY_P75 =
      new FormulaAndFunctionApmMetricStatName("latency_p75");
  public static final FormulaAndFunctionApmMetricStatName LATENCY_P90 =
      new FormulaAndFunctionApmMetricStatName("latency_p90");
  public static final FormulaAndFunctionApmMetricStatName LATENCY_P95 =
      new FormulaAndFunctionApmMetricStatName("latency_p95");
  public static final FormulaAndFunctionApmMetricStatName LATENCY_P99 =
      new FormulaAndFunctionApmMetricStatName("latency_p99");
  public static final FormulaAndFunctionApmMetricStatName LATENCY_P999 =
      new FormulaAndFunctionApmMetricStatName("latency_p999");
  public static final FormulaAndFunctionApmMetricStatName LATENCY_DISTRIBUTION =
      new FormulaAndFunctionApmMetricStatName("latency_distribution");
  public static final FormulaAndFunctionApmMetricStatName HITS =
      new FormulaAndFunctionApmMetricStatName("hits");
  public static final FormulaAndFunctionApmMetricStatName HITS_PER_SECOND =
      new FormulaAndFunctionApmMetricStatName("hits_per_second");
  public static final FormulaAndFunctionApmMetricStatName TOTAL_TIME =
      new FormulaAndFunctionApmMetricStatName("total_time");
  public static final FormulaAndFunctionApmMetricStatName APDEX =
      new FormulaAndFunctionApmMetricStatName("apdex");

  FormulaAndFunctionApmMetricStatName(String value) {
    super(value, allowedValues);
  }

  public static class FormulaAndFunctionApmMetricStatNameSerializer
      extends StdSerializer<FormulaAndFunctionApmMetricStatName> {
    public FormulaAndFunctionApmMetricStatNameSerializer(
        Class<FormulaAndFunctionApmMetricStatName> t) {
      super(t);
    }

    public FormulaAndFunctionApmMetricStatNameSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        FormulaAndFunctionApmMetricStatName value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static FormulaAndFunctionApmMetricStatName fromValue(String value) {
    return new FormulaAndFunctionApmMetricStatName(value);
  }
}
