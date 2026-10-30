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

/** The type of the content part. */
@JsonSerialize(using = AIGuardContentPartType.AIGuardContentPartTypeSerializer.class)
public class AIGuardContentPartType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("text", "image_url"));

  public static final AIGuardContentPartType TEXT = new AIGuardContentPartType("text");
  public static final AIGuardContentPartType IMAGE_URL = new AIGuardContentPartType("image_url");

  AIGuardContentPartType(String value) {
    super(value, allowedValues);
  }

  public static class AIGuardContentPartTypeSerializer
      extends StdSerializer<AIGuardContentPartType> {
    public AIGuardContentPartTypeSerializer(Class<AIGuardContentPartType> t) {
      super(t);
    }

    public AIGuardContentPartTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        AIGuardContentPartType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static AIGuardContentPartType fromValue(String value) {
    return new AIGuardContentPartType(value);
  }
}
