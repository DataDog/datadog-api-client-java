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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** A configured account for an LLM provider integration. */
@JsonPropertyOrder({
  LLMObsIntegrationAccount.JSON_PROPERTY_ACCOUNT_ID,
  LLMObsIntegrationAccount.JSON_PROPERTY_ACCOUNT_NAME,
  LLMObsIntegrationAccount.JSON_PROPERTY_ACCOUNT_REGION,
  LLMObsIntegrationAccount.JSON_PROPERTY_AZURE_OPENAI_METADATA,
  LLMObsIntegrationAccount.JSON_PROPERTY_ID,
  LLMObsIntegrationAccount.JSON_PROPERTY_INTEGRATION,
  LLMObsIntegrationAccount.JSON_PROPERTY_VERTEX_AI_METADATA
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LLMObsIntegrationAccount {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACCOUNT_ID = "account_id";
  private String accountId;

  public static final String JSON_PROPERTY_ACCOUNT_NAME = "account_name";
  private String accountName;

  public static final String JSON_PROPERTY_ACCOUNT_REGION = "account_region";
  private String accountRegion;

  public static final String JSON_PROPERTY_AZURE_OPENAI_METADATA = "azure_openai_metadata";
  private LLMObsAzureOpenAIMetadata azureOpenaiMetadata;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_INTEGRATION = "integration";
  private String integration;

  public static final String JSON_PROPERTY_VERTEX_AI_METADATA = "vertex_ai_metadata";
  private LLMObsVertexAIMetadata vertexAiMetadata;

  public LLMObsIntegrationAccount() {}

  @JsonCreator
  public LLMObsIntegrationAccount(
      @JsonProperty(required = true, value = JSON_PROPERTY_ACCOUNT_ID) String accountId,
      @JsonProperty(required = true, value = JSON_PROPERTY_ACCOUNT_NAME) String accountName,
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) String id,
      @JsonProperty(required = true, value = JSON_PROPERTY_INTEGRATION) String integration) {
    this.accountId = accountId;
    this.accountName = accountName;
    this.id = id;
    this.integration = integration;
  }

  public LLMObsIntegrationAccount accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * Provider-specific account identifier.
   *
   * @return accountId
   */
  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public LLMObsIntegrationAccount accountName(String accountName) {
    this.accountName = accountName;
    return this;
  }

  /**
   * Human-readable name for the integration account.
   *
   * @return accountName
   */
  @JsonProperty(JSON_PROPERTY_ACCOUNT_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getAccountName() {
    return accountName;
  }

  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }

  public LLMObsIntegrationAccount accountRegion(String accountRegion) {
    this.accountRegion = accountRegion;
    return this;
  }

  /**
   * Provider region associated with the account, if applicable.
   *
   * @return accountRegion
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCOUNT_REGION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAccountRegion() {
    return accountRegion;
  }

  public void setAccountRegion(String accountRegion) {
    this.accountRegion = accountRegion;
  }

  public LLMObsIntegrationAccount azureOpenaiMetadata(
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

  public LLMObsIntegrationAccount id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier for the integration account.
   *
   * @return id
   */
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public LLMObsIntegrationAccount integration(String integration) {
    this.integration = integration;
    return this;
  }

  /**
   * The name of the LLM provider integration.
   *
   * @return integration
   */
  @JsonProperty(JSON_PROPERTY_INTEGRATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getIntegration() {
    return integration;
  }

  public void setIntegration(String integration) {
    this.integration = integration;
  }

  public LLMObsIntegrationAccount vertexAiMetadata(LLMObsVertexAIMetadata vertexAiMetadata) {
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
   * @return LLMObsIntegrationAccount
   */
  @JsonAnySetter
  public LLMObsIntegrationAccount putAdditionalProperty(String key, Object value) {
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

  /** Return true if this LLMObsIntegrationAccount object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LLMObsIntegrationAccount llmObsIntegrationAccount = (LLMObsIntegrationAccount) o;
    return Objects.equals(this.accountId, llmObsIntegrationAccount.accountId)
        && Objects.equals(this.accountName, llmObsIntegrationAccount.accountName)
        && Objects.equals(this.accountRegion, llmObsIntegrationAccount.accountRegion)
        && Objects.equals(this.azureOpenaiMetadata, llmObsIntegrationAccount.azureOpenaiMetadata)
        && Objects.equals(this.id, llmObsIntegrationAccount.id)
        && Objects.equals(this.integration, llmObsIntegrationAccount.integration)
        && Objects.equals(this.vertexAiMetadata, llmObsIntegrationAccount.vertexAiMetadata)
        && Objects.equals(this.additionalProperties, llmObsIntegrationAccount.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        accountId,
        accountName,
        accountRegion,
        azureOpenaiMetadata,
        id,
        integration,
        vertexAiMetadata,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LLMObsIntegrationAccount {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    accountRegion: ").append(toIndentedString(accountRegion)).append("\n");
    sb.append("    azureOpenaiMetadata: ")
        .append(toIndentedString(azureOpenaiMetadata))
        .append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    integration: ").append(toIndentedString(integration)).append("\n");
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
