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

/** Type of the subtest resource. */
@JsonSerialize(
    using = SyntheticsApiMultistepSubtestType.SyntheticsApiMultistepSubtestTypeSerializer.class)
public class SyntheticsApiMultistepSubtestType extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("subtest"));

  public static final SyntheticsApiMultistepSubtestType SUBTEST =
      new SyntheticsApiMultistepSubtestType("subtest");

  SyntheticsApiMultistepSubtestType(String value) {
    super(value, allowedValues);
  }

  public static class SyntheticsApiMultistepSubtestTypeSerializer
      extends StdSerializer<SyntheticsApiMultistepSubtestType> {
    public SyntheticsApiMultistepSubtestTypeSerializer(Class<SyntheticsApiMultistepSubtestType> t) {
      super(t);
    }

    public SyntheticsApiMultistepSubtestTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SyntheticsApiMultistepSubtestType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SyntheticsApiMultistepSubtestType fromValue(String value) {
    return new SyntheticsApiMultistepSubtestType(value);
  }
}
