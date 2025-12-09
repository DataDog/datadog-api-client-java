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

/**
 * Semantic mode for metrics queries. This determines how metrics from different sources are
 * combined or displayed.
 */
@JsonSerialize(
    using =
        FormulaAndFunctionMetricSemanticMode.FormulaAndFunctionMetricSemanticModeSerializer.class)
public class FormulaAndFunctionMetricSemanticMode extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("combined", "native"));

  public static final FormulaAndFunctionMetricSemanticMode COMBINED =
      new FormulaAndFunctionMetricSemanticMode("combined");
  public static final FormulaAndFunctionMetricSemanticMode NATIVE =
      new FormulaAndFunctionMetricSemanticMode("native");

  FormulaAndFunctionMetricSemanticMode(String value) {
    super(value, allowedValues);
  }

  public static class FormulaAndFunctionMetricSemanticModeSerializer
      extends StdSerializer<FormulaAndFunctionMetricSemanticMode> {
    public FormulaAndFunctionMetricSemanticModeSerializer(
        Class<FormulaAndFunctionMetricSemanticMode> t) {
      super(t);
    }

    public FormulaAndFunctionMetricSemanticModeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        FormulaAndFunctionMetricSemanticMode value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static FormulaAndFunctionMetricSemanticMode fromValue(String value) {
    return new FormulaAndFunctionMetricSemanticMode(value);
  }
}
