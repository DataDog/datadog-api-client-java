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

/** The name of a supported LLM provider integration. */
@JsonSerialize(using = LLMObsIntegrationName.LLMObsIntegrationNameSerializer.class)
public class LLMObsIntegrationName extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "openai", "amazon_bedrock", "anthropic", "azure_openai", "vertex_ai", "llmproxy"));

  public static final LLMObsIntegrationName OPENAI = new LLMObsIntegrationName("openai");
  public static final LLMObsIntegrationName AMAZON_BEDROCK =
      new LLMObsIntegrationName("amazon_bedrock");
  public static final LLMObsIntegrationName ANTHROPIC = new LLMObsIntegrationName("anthropic");
  public static final LLMObsIntegrationName AZURE_OPENAI =
      new LLMObsIntegrationName("azure_openai");
  public static final LLMObsIntegrationName VERTEX_AI = new LLMObsIntegrationName("vertex_ai");
  public static final LLMObsIntegrationName LLMPROXY = new LLMObsIntegrationName("llmproxy");

  LLMObsIntegrationName(String value) {
    super(value, allowedValues);
  }

  public static class LLMObsIntegrationNameSerializer extends StdSerializer<LLMObsIntegrationName> {
    public LLMObsIntegrationNameSerializer(Class<LLMObsIntegrationName> t) {
      super(t);
    }

    public LLMObsIntegrationNameSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        LLMObsIntegrationName value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static LLMObsIntegrationName fromValue(String value) {
    return new LLMObsIntegrationName(value);
  }
}
