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

/** APM resource stat name. */
@JsonSerialize(
    using =
        FormulaAndFunctionApmResourceStatName.FormulaAndFunctionApmResourceStatNameSerializer.class)
public class FormulaAndFunctionApmResourceStatName extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "errors",
              "error_rate",
              "hits",
              "latency_avg",
              "latency_distribution",
              "latency_max",
              "latency_p50",
              "latency_p75",
              "latency_p90",
              "latency_p95",
              "latency_p99"));

  public static final FormulaAndFunctionApmResourceStatName ERRORS =
      new FormulaAndFunctionApmResourceStatName("errors");
  public static final FormulaAndFunctionApmResourceStatName ERROR_RATE =
      new FormulaAndFunctionApmResourceStatName("error_rate");
  public static final FormulaAndFunctionApmResourceStatName HITS =
      new FormulaAndFunctionApmResourceStatName("hits");
  public static final FormulaAndFunctionApmResourceStatName LATENCY_AVG =
      new FormulaAndFunctionApmResourceStatName("latency_avg");
  public static final FormulaAndFunctionApmResourceStatName LATENCY_DISTRIBUTION =
      new FormulaAndFunctionApmResourceStatName("latency_distribution");
  public static final FormulaAndFunctionApmResourceStatName LATENCY_MAX =
      new FormulaAndFunctionApmResourceStatName("latency_max");
  public static final FormulaAndFunctionApmResourceStatName LATENCY_P50 =
      new FormulaAndFunctionApmResourceStatName("latency_p50");
  public static final FormulaAndFunctionApmResourceStatName LATENCY_P75 =
      new FormulaAndFunctionApmResourceStatName("latency_p75");
  public static final FormulaAndFunctionApmResourceStatName LATENCY_P90 =
      new FormulaAndFunctionApmResourceStatName("latency_p90");
  public static final FormulaAndFunctionApmResourceStatName LATENCY_P95 =
      new FormulaAndFunctionApmResourceStatName("latency_p95");
  public static final FormulaAndFunctionApmResourceStatName LATENCY_P99 =
      new FormulaAndFunctionApmResourceStatName("latency_p99");

  FormulaAndFunctionApmResourceStatName(String value) {
    super(value, allowedValues);
  }

  public static class FormulaAndFunctionApmResourceStatNameSerializer
      extends StdSerializer<FormulaAndFunctionApmResourceStatName> {
    public FormulaAndFunctionApmResourceStatNameSerializer(
        Class<FormulaAndFunctionApmResourceStatName> t) {
      super(t);
    }

    public FormulaAndFunctionApmResourceStatNameSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        FormulaAndFunctionApmResourceStatName value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static FormulaAndFunctionApmResourceStatName fromValue(String value) {
    return new FormulaAndFunctionApmResourceStatName(value);
  }
}
