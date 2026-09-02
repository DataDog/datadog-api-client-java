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

/** Data sources that rely on the process backend. */
@JsonSerialize(
    using =
        FormulaAndFunctionProcessQueryDataSource.FormulaAndFunctionProcessQueryDataSourceSerializer
            .class)
public class FormulaAndFunctionProcessQueryDataSource extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("process", "container"));

  public static final FormulaAndFunctionProcessQueryDataSource PROCESS =
      new FormulaAndFunctionProcessQueryDataSource("process");
  public static final FormulaAndFunctionProcessQueryDataSource CONTAINER =
      new FormulaAndFunctionProcessQueryDataSource("container");

  FormulaAndFunctionProcessQueryDataSource(String value) {
    super(value, allowedValues);
  }

  public static class FormulaAndFunctionProcessQueryDataSourceSerializer
      extends StdSerializer<FormulaAndFunctionProcessQueryDataSource> {
    public FormulaAndFunctionProcessQueryDataSourceSerializer(
        Class<FormulaAndFunctionProcessQueryDataSource> t) {
      super(t);
    }

    public FormulaAndFunctionProcessQueryDataSourceSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        FormulaAndFunctionProcessQueryDataSource value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static FormulaAndFunctionProcessQueryDataSource fromValue(String value) {
    return new FormulaAndFunctionProcessQueryDataSource(value);
  }
}
