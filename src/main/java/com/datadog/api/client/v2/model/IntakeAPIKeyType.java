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

/** The resource type for an intake API key. */
@JsonSerialize(using = IntakeAPIKeyType.IntakeAPIKeyTypeSerializer.class)
public class IntakeAPIKeyType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("intake_api_key"));

  public static final IntakeAPIKeyType INTAKE_API_KEY = new IntakeAPIKeyType("intake_api_key");

  IntakeAPIKeyType(String value) {
    super(value, allowedValues);
  }

  public static class IntakeAPIKeyTypeSerializer extends StdSerializer<IntakeAPIKeyType> {
    public IntakeAPIKeyTypeSerializer(Class<IntakeAPIKeyType> t) {
      super(t);
    }

    public IntakeAPIKeyTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(IntakeAPIKeyType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static IntakeAPIKeyType fromValue(String value) {
    return new IntakeAPIKeyType(value);
  }
}
