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

/** Operation supported by an AI Gateway model. */
@JsonSerialize(using = AiGatewaySupportedOperation.AiGatewaySupportedOperationSerializer.class)
public class AiGatewaySupportedOperation extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "ANTHROPIC_MESSAGES",
              "ANTHROPIC_COUNT_TOKENS",
              "OPENAI_CHAT_COMPLETIONS",
              "OPENAI_RESPONSES",
              "OPENAI_WEB_SEARCH",
              "OPENAI_EMBEDDINGS",
              "GEMINI_GENERATE_CONTENT",
              "GEMINI_RAW_PREDICTIONS"));

  public static final AiGatewaySupportedOperation ANTHROPIC_MESSAGES =
      new AiGatewaySupportedOperation("ANTHROPIC_MESSAGES");
  public static final AiGatewaySupportedOperation ANTHROPIC_COUNT_TOKENS =
      new AiGatewaySupportedOperation("ANTHROPIC_COUNT_TOKENS");
  public static final AiGatewaySupportedOperation OPENAI_CHAT_COMPLETIONS =
      new AiGatewaySupportedOperation("OPENAI_CHAT_COMPLETIONS");
  public static final AiGatewaySupportedOperation OPENAI_RESPONSES =
      new AiGatewaySupportedOperation("OPENAI_RESPONSES");
  public static final AiGatewaySupportedOperation OPENAI_WEB_SEARCH =
      new AiGatewaySupportedOperation("OPENAI_WEB_SEARCH");
  public static final AiGatewaySupportedOperation OPENAI_EMBEDDINGS =
      new AiGatewaySupportedOperation("OPENAI_EMBEDDINGS");
  public static final AiGatewaySupportedOperation GEMINI_GENERATE_CONTENT =
      new AiGatewaySupportedOperation("GEMINI_GENERATE_CONTENT");
  public static final AiGatewaySupportedOperation GEMINI_RAW_PREDICTIONS =
      new AiGatewaySupportedOperation("GEMINI_RAW_PREDICTIONS");

  AiGatewaySupportedOperation(String value) {
    super(value, allowedValues);
  }

  public static class AiGatewaySupportedOperationSerializer
      extends StdSerializer<AiGatewaySupportedOperation> {
    public AiGatewaySupportedOperationSerializer(Class<AiGatewaySupportedOperation> t) {
      super(t);
    }

    public AiGatewaySupportedOperationSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        AiGatewaySupportedOperation value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static AiGatewaySupportedOperation fromValue(String value) {
    return new AiGatewaySupportedOperation(value);
  }
}
