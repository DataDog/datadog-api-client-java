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

/**
 * Name of the LLM integration provider. Use <code>deterministic</code> for a code evaluator, which
 * runs <code>llm_judge_config.user_specified_json_post_processing_function</code> instead of
 * calling an LLM. <code>insights_sponsored</code> is returned for evaluators that Datadog manages
 * and cannot be set.
 */
@JsonSerialize(
    using =
        LLMObsCustomEvalConfigIntegrationProvider
            .LLMObsCustomEvalConfigIntegrationProviderSerializer.class)
public class LLMObsCustomEvalConfigIntegrationProvider extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "openai",
              "amazon_bedrock",
              "anthropic",
              "azure_openai",
              "vertex_ai",
              "llmproxy",
              "deterministic",
              "typesafe",
              "datadog",
              "datadog_ai_gateway",
              "insights_sponsored"));

  public static final LLMObsCustomEvalConfigIntegrationProvider OPENAI =
      new LLMObsCustomEvalConfigIntegrationProvider("openai");
  public static final LLMObsCustomEvalConfigIntegrationProvider AMAZON_BEDROCK =
      new LLMObsCustomEvalConfigIntegrationProvider("amazon_bedrock");
  public static final LLMObsCustomEvalConfigIntegrationProvider ANTHROPIC =
      new LLMObsCustomEvalConfigIntegrationProvider("anthropic");
  public static final LLMObsCustomEvalConfigIntegrationProvider AZURE_OPENAI =
      new LLMObsCustomEvalConfigIntegrationProvider("azure_openai");
  public static final LLMObsCustomEvalConfigIntegrationProvider VERTEX_AI =
      new LLMObsCustomEvalConfigIntegrationProvider("vertex_ai");
  public static final LLMObsCustomEvalConfigIntegrationProvider LLM_PROXY =
      new LLMObsCustomEvalConfigIntegrationProvider("llmproxy");
  public static final LLMObsCustomEvalConfigIntegrationProvider DETERMINISTIC =
      new LLMObsCustomEvalConfigIntegrationProvider("deterministic");
  public static final LLMObsCustomEvalConfigIntegrationProvider TYPESAFE =
      new LLMObsCustomEvalConfigIntegrationProvider("typesafe");
  public static final LLMObsCustomEvalConfigIntegrationProvider DATADOG =
      new LLMObsCustomEvalConfigIntegrationProvider("datadog");
  public static final LLMObsCustomEvalConfigIntegrationProvider DATADOG_AI_GATEWAY =
      new LLMObsCustomEvalConfigIntegrationProvider("datadog_ai_gateway");
  public static final LLMObsCustomEvalConfigIntegrationProvider INSIGHTS_SPONSORED =
      new LLMObsCustomEvalConfigIntegrationProvider("insights_sponsored");

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
