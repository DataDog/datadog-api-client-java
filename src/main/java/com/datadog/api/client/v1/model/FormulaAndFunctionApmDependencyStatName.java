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

/** APM statistic. */
@JsonSerialize(
    using =
        FormulaAndFunctionApmDependencyStatName.FormulaAndFunctionApmDependencyStatNameSerializer
            .class)
public class FormulaAndFunctionApmDependencyStatName extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "avg_duration",
              "avg_root_duration",
              "avg_spans_per_trace",
              "error_rate",
              "pct_exec_time",
              "pct_of_traces",
              "total_traces_count"));

  public static final FormulaAndFunctionApmDependencyStatName AVG_DURATION =
      new FormulaAndFunctionApmDependencyStatName("avg_duration");
  public static final FormulaAndFunctionApmDependencyStatName AVG_ROOT_DURATION =
      new FormulaAndFunctionApmDependencyStatName("avg_root_duration");
  public static final FormulaAndFunctionApmDependencyStatName AVG_SPANS_PER_TRACE =
      new FormulaAndFunctionApmDependencyStatName("avg_spans_per_trace");
  public static final FormulaAndFunctionApmDependencyStatName ERROR_RATE =
      new FormulaAndFunctionApmDependencyStatName("error_rate");
  public static final FormulaAndFunctionApmDependencyStatName PCT_EXEC_TIME =
      new FormulaAndFunctionApmDependencyStatName("pct_exec_time");
  public static final FormulaAndFunctionApmDependencyStatName PCT_OF_TRACES =
      new FormulaAndFunctionApmDependencyStatName("pct_of_traces");
  public static final FormulaAndFunctionApmDependencyStatName TOTAL_TRACES_COUNT =
      new FormulaAndFunctionApmDependencyStatName("total_traces_count");

  FormulaAndFunctionApmDependencyStatName(String value) {
    super(value, allowedValues);
  }

  public static class FormulaAndFunctionApmDependencyStatNameSerializer
      extends StdSerializer<FormulaAndFunctionApmDependencyStatName> {
    public FormulaAndFunctionApmDependencyStatNameSerializer(
        Class<FormulaAndFunctionApmDependencyStatName> t) {
      super(t);
    }

    public FormulaAndFunctionApmDependencyStatNameSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        FormulaAndFunctionApmDependencyStatName value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static FormulaAndFunctionApmDependencyStatName fromValue(String value) {
    return new FormulaAndFunctionApmDependencyStatName(value);
  }
}
