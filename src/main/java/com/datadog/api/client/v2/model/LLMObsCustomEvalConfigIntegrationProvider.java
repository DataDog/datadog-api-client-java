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

/** Name of the LLM integration provider. */
@JsonSerialize(
    using =
        LLMObsCustomEvalConfigIntegrationProvider
            .LLMObsCustomEvalConfigIntegrationProviderSerializer.class)
public class LLMObsCustomEvalConfigIntegrationProvider extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "openai", "amazon-bedrock", "anthropic", "azure-openai", "vertex-ai", "llm-proxy"));

  public static final LLMObsCustomEvalConfigIntegrationProvider OPENAI =
      new LLMObsCustomEvalConfigIntegrationProvider("openai");
  public static final LLMObsCustomEvalConfigIntegrationProvider AMAZON_BEDROCK =
      new LLMObsCustomEvalConfigIntegrationProvider("amazon-bedrock");
  public static final LLMObsCustomEvalConfigIntegrationProvider ANTHROPIC =
      new LLMObsCustomEvalConfigIntegrationProvider("anthropic");
  public static final LLMObsCustomEvalConfigIntegrationProvider AZURE_OPENAI =
      new LLMObsCustomEvalConfigIntegrationProvider("azure-openai");
  public static final LLMObsCustomEvalConfigIntegrationProvider VERTEX_AI =
      new LLMObsCustomEvalConfigIntegrationProvider("vertex-ai");
  public static final LLMObsCustomEvalConfigIntegrationProvider LLM_PROXY =
      new LLMObsCustomEvalConfigIntegrationProvider("llm-proxy");

  LLMObsCustomEvalConfigIntegrationProvider(String value) {
    super(value, allowedValues);
  }

  public static class LLMObsCustomEvalConfigIntegrationProviderSerializer
      extends StdSerializer<LLMObsCustomEvalConfigIntegrationProvider> {
    public LLMObsCustomEvalConfigIntegrationProviderSerializer(
        Class<LLMObsCustomEvalConfigIntegrationProvider> t) {
      super(t);
    }

    public LLMObsCustomEvalConfigIntegrationProviderSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        LLMObsCustomEvalConfigIntegrationProvider value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static LLMObsCustomEvalConfigIntegrationProvider fromValue(String value) {
    return new LLMObsCustomEvalConfigIntegrationProvider(value);
  }
}
