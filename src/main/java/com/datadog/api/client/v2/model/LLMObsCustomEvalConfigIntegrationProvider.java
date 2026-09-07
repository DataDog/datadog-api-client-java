/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.UUID;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.openapitools.jackson.nullable.JsonNullable;

import com.datadog.api.client.JsonTimeSerializer;

import com.datadog.api.client.ModelEnum;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;

import java.util.Set;
import java.util.HashSet;

/**
   * <p>Name of the LLM integration provider.</p>
 */
@JsonSerialize(using = LLMObsCustomEvalConfigIntegrationProvider.LLMObsCustomEvalConfigIntegrationProviderSerializer.class)
public class LLMObsCustomEvalConfigIntegrationProvider extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("openai", "amazon-bedrock", "anthropic", "azure-openai", "vertex-ai", "llm-proxy"));

  public static final LLMObsCustomEvalConfigIntegrationProvider OPENAI = new LLMObsCustomEvalConfigIntegrationProvider("openai");
  public static final LLMObsCustomEvalConfigIntegrationProvider AMAZON_BEDROCK = new LLMObsCustomEvalConfigIntegrationProvider("amazon-bedrock");
  public static final LLMObsCustomEvalConfigIntegrationProvider ANTHROPIC = new LLMObsCustomEvalConfigIntegrationProvider("anthropic");
  public static final LLMObsCustomEvalConfigIntegrationProvider AZURE_OPENAI = new LLMObsCustomEvalConfigIntegrationProvider("azure-openai");
  public static final LLMObsCustomEvalConfigIntegrationProvider VERTEX_AI = new LLMObsCustomEvalConfigIntegrationProvider("vertex-ai");
  public static final LLMObsCustomEvalConfigIntegrationProvider LLM_PROXY = new LLMObsCustomEvalConfigIntegrationProvider("llm-proxy");


  LLMObsCustomEvalConfigIntegrationProvider(String value) {
    super(value, allowedValues);
  }

  public static class LLMObsCustomEvalConfigIntegrationProviderSerializer extends StdSerializer<LLMObsCustomEvalConfigIntegrationProvider> {
      public LLMObsCustomEvalConfigIntegrationProviderSerializer(Class<LLMObsCustomEvalConfigIntegrationProvider> t) {
          super(t);
      }

      public LLMObsCustomEvalConfigIntegrationProviderSerializer() {
          this(null);
      }

      @Override
      public void serialize(LLMObsCustomEvalConfigIntegrationProvider value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
          jgen.writeObject(value.value);
      }
  }

  @JsonCreator
  public static LLMObsCustomEvalConfigIntegrationProvider fromValue(String value) {
    return new LLMObsCustomEvalConfigIntegrationProvider(value);
  }
}
