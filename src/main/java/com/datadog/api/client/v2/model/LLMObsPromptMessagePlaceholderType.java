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

/** Type of the chat-template item. */
@JsonSerialize(
    using = LLMObsPromptMessagePlaceholderType.LLMObsPromptMessagePlaceholderTypeSerializer.class)
public class LLMObsPromptMessagePlaceholderType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("placeholder"));

  public static final LLMObsPromptMessagePlaceholderType PLACEHOLDER =
      new LLMObsPromptMessagePlaceholderType("placeholder");

  LLMObsPromptMessagePlaceholderType(String value) {
    super(value, allowedValues);
  }

  public static class LLMObsPromptMessagePlaceholderTypeSerializer
      extends StdSerializer<LLMObsPromptMessagePlaceholderType> {
    public LLMObsPromptMessagePlaceholderTypeSerializer(
        Class<LLMObsPromptMessagePlaceholderType> t) {
      super(t);
    }

    public LLMObsPromptMessagePlaceholderTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        LLMObsPromptMessagePlaceholderType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static LLMObsPromptMessagePlaceholderType fromValue(String value) {
    return new LLMObsPromptMessagePlaceholderType(value);
  }
}
