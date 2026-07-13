/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** The result of an LLM inference request, including input parameters and the model response. */
@JsonPropertyOrder({
  LLMObsIntegrationInferenceResponse.JSON_PROPERTY_ANTHROPIC_METADATA,
  LLMObsIntegrationInferenceResponse.JSON_PROPERTY_AZURE_OPENAI_METADATA,
  LLMObsIntegrationInferenceResponse.JSON_PROPERTY_BEDROCK_METADATA,
  LLMObsIntegrationInferenceResponse.JSON_PROPERTY_ERROR_RESPONSE,
  LLMObsIntegrationInferenceResponse.JSON_PROPERTY_FREQUENCY_PENALTY,
  LLMObsIntegrationInferenceResponse.JSON_PROPERTY_JSON_SCHEMA,
  LLMObsIntegrationInferenceResponse.JSON_PROPERTY_MAX_COMPLETION_TOKENS,
  LLMObsIntegrationInferenceResponse.JSON_PROPERTY_MAX_TOKENS,
  LLMObsIntegrationInferenceResponse.JSON_PROPERTY_MESSAGES,
  LLMObsIntegrationInferenceResponse.JSON_PROPERTY_MODEL_ID,
  LLMObsIntegrationInferenceResponse.JSON_PROPERTY_OPENAI_METADATA,
  LLMObsIntegrationInferenceResponse.JSON_PROPERTY_PRESENCE_PENALTY,
  LLMObsIntegrationInferenceResponse.JSON_PROPERTY_RESPONSE,
  LLMObsIntegrationInferenceResponse.JSON_PROPERTY_TEMPERATURE,
  LLMObsIntegrationInferenceResponse.JSON_PROPERTY_TOOLS,
  LLMObsIntegrationInferenceResponse.JSON_PROPERTY_TOP_K,
  LLMObsIntegrationInferenceResponse.JSON_PROPERTY_TOP_P,
  LLMObsIntegrationInferenceResponse.JSON_PROPERTY_VERTEX_AI_METADATA
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LLMObsIntegrationInferenceResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ANTHROPIC_METADATA = "anthropic_metadata";
  private LLMObsAnthropicMetadata anthropicMetadata;

  public static final String JSON_PROPERTY_AZURE_OPENAI_METADATA = "azure_openai_metadata";
  private LLMObsAzureOpenAIMetadata azureOpenaiMetadata;

  public static final String JSON_PROPERTY_BEDROCK_METADATA = "bedrock_metadata";
  private LLMObsBedrockMetadata bedrockMetadata;

  public static final String JSON_PROPERTY_ERROR_RESPONSE = "error_response";
  private LLMObsInferenceErrorResponse errorResponse;

  public static final String JSON_PROPERTY_FREQUENCY_PENALTY = "frequency_penalty";
  private JsonNullable<Double> frequencyPenalty = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_JSON_SCHEMA = "json_schema";
  private JsonNullable<String> jsonSchema = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_MAX_COMPLETION_TOKENS = "max_completion_tokens";
  private JsonNullable<Long> maxCompletionTokens = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_MAX_TOKENS = "max_tokens";
  private JsonNullable<Long> maxTokens = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_MESSAGES = "messages";
  private List<LLMObsInferenceMessage> messages = new ArrayList<>();

  public static final String JSON_PROPERTY_MODEL_ID = "model_id";
  private String modelId;

  public static final String JSON_PROPERTY_OPENAI_METADATA = "openai_metadata";
  private LLMObsOpenAIMetadata openaiMetadata;

  public static final String JSON_PROPERTY_PRESENCE_PENALTY = "presence_penalty";
  private JsonNullable<Double> presencePenalty = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_RESPONSE = "response";
  private LLMObsInferenceRunResult response;

  public static final String JSON_PROPERTY_TEMPERATURE = "temperature";
  private JsonNullable<Double> temperature = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_TOOLS = "tools";
  private List<LLMObsInferenceTool> tools = null;

  public static final String JSON_PROPERTY_TOP_K = "top_k";
  private JsonNullable<Long> topK = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_TOP_P = "top_p";
  private JsonNullable<Double> topP = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_VERTEX_AI_METADATA = "vertex_ai_metadata";
  private LLMObsVertexAIMetadata vertexAiMetadata;

  public LLMObsIntegrationInferenceResponse() {}

  @JsonCreator
  public LLMObsIntegrationInferenceResponse(
      @JsonProperty(required = true, value = JSON_PROPERTY_MESSAGES)
          List<LLMObsInferenceMessage> messages,
      @JsonProperty(required = true, value = JSON_PROPERTY_MODEL_ID) String modelId,
      @JsonProperty(required = true, value = JSON_PROPERTY_RESPONSE)
          LLMObsInferenceRunResult response) {
    this.messages = messages;
    for (LLMObsInferenceMessage item : messages) {
      this.unparsed |= item.unparsed;
    }
    this.modelId = modelId;
    this.response = response;
    this.unparsed |= response.unparsed;
  }

  public LLMObsIntegrationInferenceResponse anthropicMetadata(
      LLMObsAnthropicMetadata anthropicMetadata) {
    this.anthropicMetadata = anthropicMetadata;
    this.unparsed |= anthropicMetadata.unparsed;
    return this;
  }

  /**
   * Anthropic-specific metadata for an inference request.
   *
   * @return anthropicMetadata
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ANTHROPIC_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public LLMObsAnthropicMetadata getAnthropicMetadata() {
    return anthropicMetadata;
  }

  public void setAnthropicMetadata(LLMObsAnthropicMetadata anthropicMetadata) {
    this.anthropicMetadata = anthropicMetadata;
    if (anthropicMetadata != null) {
      this.unparsed |= anthropicMetadata.unparsed;
    }
  }

  public LLMObsIntegrationInferenceResponse azureOpenaiMetadata(
      LLMObsAzureOpenAIMetadata azureOpenaiMetadata) {
    this.azureOpenaiMetadata = azureOpenaiMetadata;
    this.unparsed |= azureOpenaiMetadata.unparsed;
    return this;
  }

  /**
   * Azure OpenAI-specific metadata for an integration account or inference request.
   *
   * @return azureOpenaiMetadata
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AZURE_OPENAI_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public LLMObsAzureOpenAIMetadata getAzureOpenaiMetadata() {
    return azureOpenaiMetadata;
  }

  public void setAzureOpenaiMetadata(LLMObsAzureOpenAIMetadata azureOpenaiMetadata) {
    this.azureOpenaiMetadata = azureOpenaiMetadata;
    if (azureOpenaiMetadata != null) {
      this.unparsed |= azureOpenaiMetadata.unparsed;
    }
  }

  public LLMObsIntegrationInferenceResponse bedrockMetadata(LLMObsBedrockMetadata bedrockMetadata) {
    this.bedrockMetadata = bedrockMetadata;
    this.unparsed |= bedrockMetadata.unparsed;
    return this;
  }

  /**
   * Amazon Bedrock-specific metadata for an inference request.
   *
   * @return bedrockMetadata
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BEDROCK_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public LLMObsBedrockMetadata getBedrockMetadata() {
    return bedrockMetadata;
  }

  public void setBedrockMetadata(LLMObsBedrockMetadata bedrockMetadata) {
    this.bedrockMetadata = bedrockMetadata;
    if (bedrockMetadata != null) {
      this.unparsed |= bedrockMetadata.unparsed;
    }
  }

  public LLMObsIntegrationInferenceResponse errorResponse(
      LLMObsInferenceErrorResponse errorResponse) {
    this.errorResponse = errorResponse;
    this.unparsed |= errorResponse.unparsed;
    return this;
  }

  /**
   * Error details returned when an inference provider returns an error.
   *
   * @return errorResponse
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ERROR_RESPONSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public LLMObsInferenceErrorResponse getErrorResponse() {
    return errorResponse;
  }

  public void setErrorResponse(LLMObsInferenceErrorResponse errorResponse) {
    this.errorResponse = errorResponse;
    if (errorResponse != null) {
      this.unparsed |= errorResponse.unparsed;
    }
  }

  public LLMObsIntegrationInferenceResponse frequencyPenalty(Double frequencyPenalty) {
    this.frequencyPenalty = JsonNullable.<Double>of(frequencyPenalty);
    return this;
  }

  /**
   * Frequency penalty that was applied.
   *
   * @return frequencyPenalty
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Double getFrequencyPenalty() {
    return frequencyPenalty.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FREQUENCY_PENALTY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getFrequencyPenalty_JsonNullable() {
    return frequencyPenalty;
  }

  @JsonProperty(JSON_PROPERTY_FREQUENCY_PENALTY)
  public void setFrequencyPenalty_JsonNullable(JsonNullable<Double> frequencyPenalty) {
    this.frequencyPenalty = frequencyPenalty;
  }

  public void setFrequencyPenalty(Double frequencyPenalty) {
    this.frequencyPenalty = JsonNullable.<Double>of(frequencyPenalty);
  }

  public LLMObsIntegrationInferenceResponse jsonSchema(String jsonSchema) {
    this.jsonSchema = JsonNullable.<String>of(jsonSchema);
    return this;
  }

  /**
   * JSON schema that was applied for structured output.
   *
   * @return jsonSchema
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getJsonSchema() {
    return jsonSchema.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_JSON_SCHEMA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getJsonSchema_JsonNullable() {
    return jsonSchema;
  }

  @JsonProperty(JSON_PROPERTY_JSON_SCHEMA)
  public void setJsonSchema_JsonNullable(JsonNullable<String> jsonSchema) {
    this.jsonSchema = jsonSchema;
  }

  public void setJsonSchema(String jsonSchema) {
    this.jsonSchema = JsonNullable.<String>of(jsonSchema);
  }

  public LLMObsIntegrationInferenceResponse maxCompletionTokens(Long maxCompletionTokens) {
    this.maxCompletionTokens = JsonNullable.<Long>of(maxCompletionTokens);
    return this;
  }

  /**
   * Maximum number of completion tokens that were configured.
   *
   * @return maxCompletionTokens
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getMaxCompletionTokens() {
    return maxCompletionTokens.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MAX_COMPLETION_TOKENS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getMaxCompletionTokens_JsonNullable() {
    return maxCompletionTokens;
  }

  @JsonProperty(JSON_PROPERTY_MAX_COMPLETION_TOKENS)
  public void setMaxCompletionTokens_JsonNullable(JsonNullable<Long> maxCompletionTokens) {
    this.maxCompletionTokens = maxCompletionTokens;
  }

  public void setMaxCompletionTokens(Long maxCompletionTokens) {
    this.maxCompletionTokens = JsonNullable.<Long>of(maxCompletionTokens);
  }

  public LLMObsIntegrationInferenceResponse maxTokens(Long maxTokens) {
    this.maxTokens = JsonNullable.<Long>of(maxTokens);
    return this;
  }

  /**
   * Maximum number of tokens that were configured.
   *
   * @return maxTokens
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getMaxTokens() {
    return maxTokens.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MAX_TOKENS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getMaxTokens_JsonNullable() {
    return maxTokens;
  }

  @JsonProperty(JSON_PROPERTY_MAX_TOKENS)
  public void setMaxTokens_JsonNullable(JsonNullable<Long> maxTokens) {
    this.maxTokens = maxTokens;
  }

  public void setMaxTokens(Long maxTokens) {
    this.maxTokens = JsonNullable.<Long>of(maxTokens);
  }

  public LLMObsIntegrationInferenceResponse messages(List<LLMObsInferenceMessage> messages) {
    this.messages = messages;
    for (LLMObsInferenceMessage item : messages) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public LLMObsIntegrationInferenceResponse addMessagesItem(LLMObsInferenceMessage messagesItem) {
    this.messages.add(messagesItem);
    this.unparsed |= messagesItem.unparsed;
    return this;
  }

  /**
   * List of messages in an inference conversation.
   *
   * @return messages
   */
  @JsonProperty(JSON_PROPERTY_MESSAGES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<LLMObsInferenceMessage> getMessages() {
    return messages;
  }

  public void setMessages(List<LLMObsInferenceMessage> messages) {
    this.messages = messages;
    if (messages != null) {
      for (LLMObsInferenceMessage item : messages) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public LLMObsIntegrationInferenceResponse modelId(String modelId) {
    this.modelId = modelId;
    return this;
  }

  /**
   * The model identifier used for inference.
   *
   * @return modelId
   */
  @JsonProperty(JSON_PROPERTY_MODEL_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getModelId() {
    return modelId;
  }

  public void setModelId(String modelId) {
    this.modelId = modelId;
  }

  public LLMObsIntegrationInferenceResponse openaiMetadata(LLMObsOpenAIMetadata openaiMetadata) {
    this.openaiMetadata = openaiMetadata;
    this.unparsed |= openaiMetadata.unparsed;
    return this;
  }

  /**
   * OpenAI-specific metadata for an inference request.
   *
   * @return openaiMetadata
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OPENAI_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public LLMObsOpenAIMetadata getOpenaiMetadata() {
    return openaiMetadata;
  }

  public void setOpenaiMetadata(LLMObsOpenAIMetadata openaiMetadata) {
    this.openaiMetadata = openaiMetadata;
    if (openaiMetadata != null) {
      this.unparsed |= openaiMetadata.unparsed;
    }
  }

  public LLMObsIntegrationInferenceResponse presencePenalty(Double presencePenalty) {
    this.presencePenalty = JsonNullable.<Double>of(presencePenalty);
    return this;
  }

  /**
   * Presence penalty that was applied.
   *
   * @return presencePenalty
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Double getPresencePenalty() {
    return presencePenalty.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PRESENCE_PENALTY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getPresencePenalty_JsonNullable() {
    return presencePenalty;
  }

  @JsonProperty(JSON_PROPERTY_PRESENCE_PENALTY)
  public void setPresencePenalty_JsonNullable(JsonNullable<Double> presencePenalty) {
    this.presencePenalty = presencePenalty;
  }

  public void setPresencePenalty(Double presencePenalty) {
    this.presencePenalty = JsonNullable.<Double>of(presencePenalty);
  }

  public LLMObsIntegrationInferenceResponse response(LLMObsInferenceRunResult response) {
    this.response = response;
    this.unparsed |= response.unparsed;
    return this;
  }

  /**
   * The output of a completed LLM inference call.
   *
   * @return response
   */
  @JsonProperty(JSON_PROPERTY_RESPONSE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public LLMObsInferenceRunResult getResponse() {
    return response;
  }

  public void setResponse(LLMObsInferenceRunResult response) {
    this.response = response;
    if (response != null) {
      this.unparsed |= response.unparsed;
    }
  }

  public LLMObsIntegrationInferenceResponse temperature(Double temperature) {
    this.temperature = JsonNullable.<Double>of(temperature);
    return this;
  }

  /**
   * Sampling temperature that was used.
   *
   * @return temperature
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Double getTemperature() {
    return temperature.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TEMPERATURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getTemperature_JsonNullable() {
    return temperature;
  }

  @JsonProperty(JSON_PROPERTY_TEMPERATURE)
  public void setTemperature_JsonNullable(JsonNullable<Double> temperature) {
    this.temperature = temperature;
  }

  public void setTemperature(Double temperature) {
    this.temperature = JsonNullable.<Double>of(temperature);
  }

  public LLMObsIntegrationInferenceResponse tools(List<LLMObsInferenceTool> tools) {
    this.tools = tools;
    for (LLMObsInferenceTool item : tools) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public LLMObsIntegrationInferenceResponse addToolsItem(LLMObsInferenceTool toolsItem) {
    if (this.tools == null) {
      this.tools = new ArrayList<>();
    }
    this.tools.add(toolsItem);
    this.unparsed |= toolsItem.unparsed;
    return this;
  }

  /**
   * List of tools available to the model.
   *
   * @return tools
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOOLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<LLMObsInferenceTool> getTools() {
    return tools;
  }

  public void setTools(List<LLMObsInferenceTool> tools) {
    this.tools = tools;
    if (tools != null) {
      for (LLMObsInferenceTool item : tools) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public LLMObsIntegrationInferenceResponse topK(Long topK) {
    this.topK = JsonNullable.<Long>of(topK);
    return this;
  }

  /**
   * Top-K sampling parameter that was used.
   *
   * @return topK
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getTopK() {
    return topK.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TOP_K)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getTopK_JsonNullable() {
    return topK;
  }

  @JsonProperty(JSON_PROPERTY_TOP_K)
  public void setTopK_JsonNullable(JsonNullable<Long> topK) {
    this.topK = topK;
  }

  public void setTopK(Long topK) {
    this.topK = JsonNullable.<Long>of(topK);
  }

  public LLMObsIntegrationInferenceResponse topP(Double topP) {
    this.topP = JsonNullable.<Double>of(topP);
    return this;
  }

  /**
   * Nucleus sampling parameter that was used.
   *
   * @return topP
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Double getTopP() {
    return topP.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TOP_P)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getTopP_JsonNullable() {
    return topP;
  }

  @JsonProperty(JSON_PROPERTY_TOP_P)
  public void setTopP_JsonNullable(JsonNullable<Double> topP) {
    this.topP = topP;
  }

  public void setTopP(Double topP) {
    this.topP = JsonNullable.<Double>of(topP);
  }

  public LLMObsIntegrationInferenceResponse vertexAiMetadata(
      LLMObsVertexAIMetadata vertexAiMetadata) {
    this.vertexAiMetadata = vertexAiMetadata;
    this.unparsed |= vertexAiMetadata.unparsed;
    return this;
  }

  /**
   * Vertex AI-specific metadata for an integration account or inference request.
   *
   * @return vertexAiMetadata
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERTEX_AI_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public LLMObsVertexAIMetadata getVertexAiMetadata() {
    return vertexAiMetadata;
  }

  public void setVertexAiMetadata(LLMObsVertexAIMetadata vertexAiMetadata) {
    this.vertexAiMetadata = vertexAiMetadata;
    if (vertexAiMetadata != null) {
      this.unparsed |= vertexAiMetadata.unparsed;
    }
  }

  /**
   * A container for additional, undeclared properties. This is a holder for any undeclared
   * properties as specified with the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value. If the property
   * does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return LLMObsIntegrationInferenceResponse
   */
  @JsonAnySetter
  public LLMObsIntegrationInferenceResponse putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
      this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return The additional properties
   */
  @JsonAnyGetter
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key The arbitrary key to get
   * @return The specific additional property for the given key
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
      return null;
    }
    return this.additionalProperties.get(key);
  }

  /** Return true if this LLMObsIntegrationInferenceResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LLMObsIntegrationInferenceResponse llmObsIntegrationInferenceResponse =
        (LLMObsIntegrationInferenceResponse) o;
    return Objects.equals(
            this.anthropicMetadata, llmObsIntegrationInferenceResponse.anthropicMetadata)
        && Objects.equals(
            this.azureOpenaiMetadata, llmObsIntegrationInferenceResponse.azureOpenaiMetadata)
        && Objects.equals(this.bedrockMetadata, llmObsIntegrationInferenceResponse.bedrockMetadata)
        && Objects.equals(this.errorResponse, llmObsIntegrationInferenceResponse.errorResponse)
        && Objects.equals(
            this.frequencyPenalty, llmObsIntegrationInferenceResponse.frequencyPenalty)
        && Objects.equals(this.jsonSchema, llmObsIntegrationInferenceResponse.jsonSchema)
        && Objects.equals(
            this.maxCompletionTokens, llmObsIntegrationInferenceResponse.maxCompletionTokens)
        && Objects.equals(this.maxTokens, llmObsIntegrationInferenceResponse.maxTokens)
        && Objects.equals(this.messages, llmObsIntegrationInferenceResponse.messages)
        && Objects.equals(this.modelId, llmObsIntegrationInferenceResponse.modelId)
        && Objects.equals(this.openaiMetadata, llmObsIntegrationInferenceResponse.openaiMetadata)
        && Objects.equals(this.presencePenalty, llmObsIntegrationInferenceResponse.presencePenalty)
        && Objects.equals(this.response, llmObsIntegrationInferenceResponse.response)
        && Objects.equals(this.temperature, llmObsIntegrationInferenceResponse.temperature)
        && Objects.equals(this.tools, llmObsIntegrationInferenceResponse.tools)
        && Objects.equals(this.topK, llmObsIntegrationInferenceResponse.topK)
        && Objects.equals(this.topP, llmObsIntegrationInferenceResponse.topP)
        && Objects.equals(
            this.vertexAiMetadata, llmObsIntegrationInferenceResponse.vertexAiMetadata)
        && Objects.equals(
            this.additionalProperties, llmObsIntegrationInferenceResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        anthropicMetadata,
        azureOpenaiMetadata,
        bedrockMetadata,
        errorResponse,
        frequencyPenalty,
        jsonSchema,
        maxCompletionTokens,
        maxTokens,
        messages,
        modelId,
        openaiMetadata,
        presencePenalty,
        response,
        temperature,
        tools,
        topK,
        topP,
        vertexAiMetadata,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LLMObsIntegrationInferenceResponse {\n");
    sb.append("    anthropicMetadata: ").append(toIndentedString(anthropicMetadata)).append("\n");
    sb.append("    azureOpenaiMetadata: ")
        .append(toIndentedString(azureOpenaiMetadata))
        .append("\n");
    sb.append("    bedrockMetadata: ").append(toIndentedString(bedrockMetadata)).append("\n");
    sb.append("    errorResponse: ").append(toIndentedString(errorResponse)).append("\n");
    sb.append("    frequencyPenalty: ").append(toIndentedString(frequencyPenalty)).append("\n");
    sb.append("    jsonSchema: ").append(toIndentedString(jsonSchema)).append("\n");
    sb.append("    maxCompletionTokens: ")
        .append(toIndentedString(maxCompletionTokens))
        .append("\n");
    sb.append("    maxTokens: ").append(toIndentedString(maxTokens)).append("\n");
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
    sb.append("    modelId: ").append(toIndentedString(modelId)).append("\n");
    sb.append("    openaiMetadata: ").append(toIndentedString(openaiMetadata)).append("\n");
    sb.append("    presencePenalty: ").append(toIndentedString(presencePenalty)).append("\n");
    sb.append("    response: ").append(toIndentedString(response)).append("\n");
    sb.append("    temperature: ").append(toIndentedString(temperature)).append("\n");
    sb.append("    tools: ").append(toIndentedString(tools)).append("\n");
    sb.append("    topK: ").append(toIndentedString(topK)).append("\n");
    sb.append("    topP: ").append(toIndentedString(topP)).append("\n");
    sb.append("    vertexAiMetadata: ").append(toIndentedString(vertexAiMetadata)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append('}');
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
