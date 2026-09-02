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

/** The definition of <code>InputSchemaParametersType</code> object. */
@JsonSerialize(using = InputSchemaParametersType.InputSchemaParametersTypeSerializer.class)
public class InputSchemaParametersType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "STRING",
              "NUMBER",
              "BOOLEAN",
              "OBJECT",
              "ARRAY_STRING",
              "ARRAY_NUMBER",
              "ARRAY_BOOLEAN",
              "ARRAY_OBJECT"));

  public static final InputSchemaParametersType STRING = new InputSchemaParametersType("STRING");
  public static final InputSchemaParametersType NUMBER = new InputSchemaParametersType("NUMBER");
  public static final InputSchemaParametersType BOOLEAN = new InputSchemaParametersType("BOOLEAN");
  public static final InputSchemaParametersType OBJECT = new InputSchemaParametersType("OBJECT");
  public static final InputSchemaParametersType ARRAY_STRING =
      new InputSchemaParametersType("ARRAY_STRING");
  public static final InputSchemaParametersType ARRAY_NUMBER =
      new InputSchemaParametersType("ARRAY_NUMBER");
  public static final InputSchemaParametersType ARRAY_BOOLEAN =
      new InputSchemaParametersType("ARRAY_BOOLEAN");
  public static final InputSchemaParametersType ARRAY_OBJECT =
      new InputSchemaParametersType("ARRAY_OBJECT");

  InputSchemaParametersType(String value) {
    super(value, allowedValues);
  }

  public static class InputSchemaParametersTypeSerializer
      extends StdSerializer<InputSchemaParametersType> {
    public InputSchemaParametersTypeSerializer(Class<InputSchemaParametersType> t) {
      super(t);
    }

    public InputSchemaParametersTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        InputSchemaParametersType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static InputSchemaParametersType fromValue(String value) {
    return new InputSchemaParametersType(value);
  }
}
