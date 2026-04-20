/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** LLM provider configuration for a custom evaluator. */
@JsonPropertyOrder({
  LLMObsCustomEvalConfigLLMProvider.JSON_PROPERTY_BEDROCK,
  LLMObsCustomEvalConfigLLMProvider.JSON_PROPERTY_INTEGRATION_ACCOUNT_ID,
  LLMObsCustomEvalConfigLLMProvider.JSON_PROPERTY_INTEGRATION_PROVIDER,
  LLMObsCustomEvalConfigLLMProvider.JSON_PROPERTY_MODEL_NAME,
  LLMObsCustomEvalConfigLLMProvider.JSON_PROPERTY_VERTEX_AI
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LLMObsCustomEvalConfigLLMProvider {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_BEDROCK = "bedrock";
  private LLMObsCustomEvalConfigBedrockOptions bedrock;

  public static final String JSON_PROPERTY_INTEGRATION_ACCOUNT_ID = "integration_account_id";
  private String integrationAccountId;

  public static final String JSON_PROPERTY_INTEGRATION_PROVIDER = "integration_provider";
  private LLMObsCustomEvalConfigIntegrationProvider integrationProvider;

  public static final String JSON_PROPERTY_MODEL_NAME = "model_name";
  private String modelName;

  public static final String JSON_PROPERTY_VERTEX_AI = "vertex_ai";
  private LLMObsCustomEvalConfigVertexAIOptions vertexAi;

  public LLMObsCustomEvalConfigLLMProvider bedrock(LLMObsCustomEvalConfigBedrockOptions bedrock) {
    this.bedrock = bedrock;
    this.unparsed |= bedrock.unparsed;
    return this;
  }

  /**
   * AWS Bedrock-specific options for LLM provider configuration.
   *
   * @return bedrock
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BEDROCK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public LLMObsCustomEvalConfigBedrockOptions getBedrock() {
    return bedrock;
  }

  public void setBedrock(LLMObsCustomEvalConfigBedrockOptions bedrock) {
    this.bedrock = bedrock;
  }

  public LLMObsCustomEvalConfigLLMProvider integrationAccountId(String integrationAccountId) {
    this.integrationAccountId = integrationAccountId;
    return this;
  }

  /**
   * Integration account identifier.
   *
   * @return integrationAccountId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INTEGRATION_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getIntegrationAccountId() {
    return integrationAccountId;
  }

  public void setIntegrationAccountId(String integrationAccountId) {
    this.integrationAccountId = integrationAccountId;
  }

  public LLMObsCustomEvalConfigLLMProvider integrationProvider(
      LLMObsCustomEvalConfigIntegrationProvider integrationProvider) {
    this.integrationProvider = integrationProvider;
    this.unparsed |= !integrationProvider.isValid();
    return this;
  }

  /**
   * Name of the LLM integration provider.
   *
   * @return integrationProvider
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INTEGRATION_PROVIDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public LLMObsCustomEvalConfigIntegrationProvider getIntegrationProvider() {
    return integrationProvider;
  }

  public void setIntegrationProvider(
      LLMObsCustomEvalConfigIntegrationProvider integrationProvider) {
    if (!integrationProvider.isValid()) {
      this.unparsed = true;
    }
    this.integrationProvider = integrationProvider;
  }

  public LLMObsCustomEvalConfigLLMProvider modelName(String modelName) {
    this.modelName = modelName;
    return this;
  }

  /**
   * Name of the LLM model.
   *
   * @return modelName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODEL_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getModelName() {
    return modelName;
  }

  public void setModelName(String modelName) {
    this.modelName = modelName;
  }

  public LLMObsCustomEvalConfigLLMProvider vertexAi(
      LLMObsCustomEvalConfigVertexAIOptions vertexAi) {
    this.vertexAi = vertexAi;
    this.unparsed |= vertexAi.unparsed;
    return this;
  }

  /**
   * Google Vertex AI-specific options for LLM provider configuration.
   *
   * @return vertexAi
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERTEX_AI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public LLMObsCustomEvalConfigVertexAIOptions getVertexAi() {
    return vertexAi;
  }

  public void setVertexAi(LLMObsCustomEvalConfigVertexAIOptions vertexAi) {
    this.vertexAi = vertexAi;
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
   * @return LLMObsCustomEvalConfigLLMProvider
   */
  @JsonAnySetter
  public LLMObsCustomEvalConfigLLMProvider putAdditionalProperty(String key, Object value) {
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

  /** Return true if this LLMObsCustomEvalConfigLLMProvider object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LLMObsCustomEvalConfigLLMProvider llmObsCustomEvalConfigLlmProvider =
        (LLMObsCustomEvalConfigLLMProvider) o;
    return Objects.equals(this.bedrock, llmObsCustomEvalConfigLlmProvider.bedrock)
        && Objects.equals(
            this.integrationAccountId, llmObsCustomEvalConfigLlmProvider.integrationAccountId)
        && Objects.equals(
            this.integrationProvider, llmObsCustomEvalConfigLlmProvider.integrationProvider)
        && Objects.equals(this.modelName, llmObsCustomEvalConfigLlmProvider.modelName)
        && Objects.equals(this.vertexAi, llmObsCustomEvalConfigLlmProvider.vertexAi)
        && Objects.equals(
            this.additionalProperties, llmObsCustomEvalConfigLlmProvider.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        bedrock,
        integrationAccountId,
        integrationProvider,
        modelName,
        vertexAi,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LLMObsCustomEvalConfigLLMProvider {\n");
    sb.append("    bedrock: ").append(toIndentedString(bedrock)).append("\n");
    sb.append("    integrationAccountId: ")
        .append(toIndentedString(integrationAccountId))
        .append("\n");
    sb.append("    integrationProvider: ")
        .append(toIndentedString(integrationProvider))
        .append("\n");
    sb.append("    modelName: ").append(toIndentedString(modelName)).append("\n");
    sb.append("    vertexAi: ").append(toIndentedString(vertexAi)).append("\n");
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
