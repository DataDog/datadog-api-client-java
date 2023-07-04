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

/** Type of parser for a Synthetic global variable from a synthetics test. */
@JsonSerialize(
    using = SyntheticsGlobalVariableParserType.SyntheticsGlobalVariableParserTypeSerializer.class)
public class SyntheticsGlobalVariableParserType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("raw", "json_path", "regex", "x_path"));

  public static final SyntheticsGlobalVariableParserType RAW =
      new SyntheticsGlobalVariableParserType("raw");
  public static final SyntheticsGlobalVariableParserType JSON_PATH =
      new SyntheticsGlobalVariableParserType("json_path");
  public static final SyntheticsGlobalVariableParserType REGEX =
      new SyntheticsGlobalVariableParserType("regex");
  public static final SyntheticsGlobalVariableParserType X_PATH =
      new SyntheticsGlobalVariableParserType("x_path");

  SyntheticsGlobalVariableParserType(String value) {
    super(value, allowedValues);
  }

  public static class SyntheticsGlobalVariableParserTypeSerializer
      extends StdSerializer<SyntheticsGlobalVariableParserType> {
    public SyntheticsGlobalVariableParserTypeSerializer(
        Class<SyntheticsGlobalVariableParserType> t) {
      super(t);
    }

    public SyntheticsGlobalVariableParserTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SyntheticsGlobalVariableParserType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SyntheticsGlobalVariableParserType fromValue(String value) {
    return new SyntheticsGlobalVariableParserType(value);
  }
}
