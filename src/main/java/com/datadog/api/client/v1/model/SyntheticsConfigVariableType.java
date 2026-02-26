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

/** Type of the configuration variable. */
@JsonSerialize(using = SyntheticsConfigVariableType.SyntheticsConfigVariableTypeSerializer.class)
public class SyntheticsConfigVariableType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("global", "text", "email"));

  public static final SyntheticsConfigVariableType GLOBAL =
      new SyntheticsConfigVariableType("global");
  public static final SyntheticsConfigVariableType TEXT = new SyntheticsConfigVariableType("text");
  public static final SyntheticsConfigVariableType EMAIL =
      new SyntheticsConfigVariableType("email");

  SyntheticsConfigVariableType(String value) {
    super(value, allowedValues);
  }

  public static class SyntheticsConfigVariableTypeSerializer
      extends StdSerializer<SyntheticsConfigVariableType> {
    public SyntheticsConfigVariableTypeSerializer(Class<SyntheticsConfigVariableType> t) {
      super(t);
    }

    public SyntheticsConfigVariableTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SyntheticsConfigVariableType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SyntheticsConfigVariableType fromValue(String value) {
    return new SyntheticsConfigVariableType(value);
  }
}
