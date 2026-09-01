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

/** Type discriminator for a <code>frontend</code> interaction. */
@JsonSerialize(using = LLMObsFrontendInteractionType.LLMObsFrontendInteractionTypeSerializer.class)
public class LLMObsFrontendInteractionType extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("frontend"));

  public static final LLMObsFrontendInteractionType FRONTEND =
      new LLMObsFrontendInteractionType("frontend");

  LLMObsFrontendInteractionType(String value) {
    super(value, allowedValues);
  }

  public static class LLMObsFrontendInteractionTypeSerializer
      extends StdSerializer<LLMObsFrontendInteractionType> {
    public LLMObsFrontendInteractionTypeSerializer(Class<LLMObsFrontendInteractionType> t) {
      super(t);
    }

    public LLMObsFrontendInteractionTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        LLMObsFrontendInteractionType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static LLMObsFrontendInteractionType fromValue(String value) {
    return new LLMObsFrontendInteractionType(value);
  }
}
