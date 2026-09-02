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

/** The reasoning effort level for OpenAI models that support it. */
@JsonSerialize(using = LLMObsOpenAIReasoningEffort.LLMObsOpenAIReasoningEffortSerializer.class)
public class LLMObsOpenAIReasoningEffort extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("none", "low", "medium", "high", "xhigh"));

  public static final LLMObsOpenAIReasoningEffort NONE = new LLMObsOpenAIReasoningEffort("none");
  public static final LLMObsOpenAIReasoningEffort LOW = new LLMObsOpenAIReasoningEffort("low");
  public static final LLMObsOpenAIReasoningEffort MEDIUM =
      new LLMObsOpenAIReasoningEffort("medium");
  public static final LLMObsOpenAIReasoningEffort HIGH = new LLMObsOpenAIReasoningEffort("high");
  public static final LLMObsOpenAIReasoningEffort XHIGH = new LLMObsOpenAIReasoningEffort("xhigh");

  LLMObsOpenAIReasoningEffort(String value) {
    super(value, allowedValues);
  }

  public static class LLMObsOpenAIReasoningEffortSerializer
      extends StdSerializer<LLMObsOpenAIReasoningEffort> {
    public LLMObsOpenAIReasoningEffortSerializer(Class<LLMObsOpenAIReasoningEffort> t) {
      super(t);
    }

    public LLMObsOpenAIReasoningEffortSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        LLMObsOpenAIReasoningEffort value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static LLMObsOpenAIReasoningEffort fromValue(String value) {
    return new LLMObsOpenAIReasoningEffort(value);
  }
}
