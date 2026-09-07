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

/** Group mode to query measures. */
@JsonSerialize(
    using = FormulaAndFunctionSLOGroupMode.FormulaAndFunctionSLOGroupModeSerializer.class)
public class FormulaAndFunctionSLOGroupMode extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("overall", "components"));

  public static final FormulaAndFunctionSLOGroupMode OVERALL =
      new FormulaAndFunctionSLOGroupMode("overall");
  public static final FormulaAndFunctionSLOGroupMode COMPONENTS =
      new FormulaAndFunctionSLOGroupMode("components");

  FormulaAndFunctionSLOGroupMode(String value) {
    super(value, allowedValues);
  }

  public static class FormulaAndFunctionSLOGroupModeSerializer
      extends StdSerializer<FormulaAndFunctionSLOGroupMode> {
    public FormulaAndFunctionSLOGroupModeSerializer(Class<FormulaAndFunctionSLOGroupMode> t) {
      super(t);
    }

    public FormulaAndFunctionSLOGroupModeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        FormulaAndFunctionSLOGroupMode value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static FormulaAndFunctionSLOGroupMode fromValue(String value) {
    return new FormulaAndFunctionSLOGroupMode(value);
  }
}
