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

/** The definition of <code>InputSchemaDataType</code> object. */
@JsonSerialize(using = InputSchemaDataType.InputSchemaDataTypeSerializer.class)
public class InputSchemaDataType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("inputSchema"));

  public static final InputSchemaDataType INPUTSCHEMA = new InputSchemaDataType("inputSchema");

  InputSchemaDataType(String value) {
    super(value, allowedValues);
  }

  public static class InputSchemaDataTypeSerializer extends StdSerializer<InputSchemaDataType> {
    public InputSchemaDataTypeSerializer(Class<InputSchemaDataType> t) {
      super(t);
    }

    public InputSchemaDataTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        InputSchemaDataType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static InputSchemaDataType fromValue(String value) {
    return new InputSchemaDataType(value);
  }
}
