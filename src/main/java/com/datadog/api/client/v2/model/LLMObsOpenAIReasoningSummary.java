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

/** The verbosity of the reasoning summary. */
@JsonSerialize(using = LLMObsOpenAIReasoningSummary.LLMObsOpenAIReasoningSummarySerializer.class)
public class LLMObsOpenAIReasoningSummary extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("auto", "concise", "detailed"));

  public static final LLMObsOpenAIReasoningSummary AUTO = new LLMObsOpenAIReasoningSummary("auto");
  public static final LLMObsOpenAIReasoningSummary CONCISE =
      new LLMObsOpenAIReasoningSummary("concise");
  public static final LLMObsOpenAIReasoningSummary DETAILED =
      new LLMObsOpenAIReasoningSummary("detailed");

  LLMObsOpenAIReasoningSummary(String value) {
    super(value, allowedValues);
  }

  public static class LLMObsOpenAIReasoningSummarySerializer
      extends StdSerializer<LLMObsOpenAIReasoningSummary> {
    public LLMObsOpenAIReasoningSummarySerializer(Class<LLMObsOpenAIReasoningSummary> t) {
      super(t);
    }

    public LLMObsOpenAIReasoningSummarySerializer() {
      this(null);
    }

    @Override
    public void serialize(
        LLMObsOpenAIReasoningSummary value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static LLMObsOpenAIReasoningSummary fromValue(String value) {
    return new LLMObsOpenAIReasoningSummary(value);
  }
}
