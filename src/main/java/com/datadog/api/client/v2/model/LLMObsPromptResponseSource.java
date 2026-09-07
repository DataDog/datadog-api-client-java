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

/** Whether the prompt was created from the registry or discovered from observed LLM calls. */
@JsonSerialize(using = LLMObsPromptResponseSource.LLMObsPromptResponseSourceSerializer.class)
public class LLMObsPromptResponseSource extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("registry", "code"));

  public static final LLMObsPromptResponseSource REGISTRY =
      new LLMObsPromptResponseSource("registry");
  public static final LLMObsPromptResponseSource CODE = new LLMObsPromptResponseSource("code");

  LLMObsPromptResponseSource(String value) {
    super(value, allowedValues);
  }

  public static class LLMObsPromptResponseSourceSerializer
      extends StdSerializer<LLMObsPromptResponseSource> {
    public LLMObsPromptResponseSourceSerializer(Class<LLMObsPromptResponseSource> t) {
      super(t);
    }

    public LLMObsPromptResponseSourceSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        LLMObsPromptResponseSource value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static LLMObsPromptResponseSource fromValue(String value) {
    return new LLMObsPromptResponseSource(value);
  }
}
