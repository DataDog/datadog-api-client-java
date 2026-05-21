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

/** A model available for a given LLM provider integration and account. */
@JsonPropertyOrder({
  LLMObsIntegrationModel.JSON_PROPERTY_HAS_ACCESS,
  LLMObsIntegrationModel.JSON_PROPERTY_ID,
  LLMObsIntegrationModel.JSON_PROPERTY_INTEGRATION,
  LLMObsIntegrationModel.JSON_PROPERTY_INTEGRATION_DISPLAY_NAME,
  LLMObsIntegrationModel.JSON_PROPERTY_JSON_SCHEMA,
  LLMObsIntegrationModel.JSON_PROPERTY_MODEL_DISPLAY_NAME,
  LLMObsIntegrationModel.JSON_PROPERTY_MODEL_ID,
  LLMObsIntegrationModel.JSON_PROPERTY_PROVIDER,
  LLMObsIntegrationModel.JSON_PROPERTY_PROVIDER_DISPLAY_NAME,
  LLMObsIntegrationModel.JSON_PROPERTY_REGION_PREFIX_OVERRIDES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LLMObsIntegrationModel {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_HAS_ACCESS = "has_access";
  private Boolean hasAccess;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_INTEGRATION = "integration";
  private String integration;

  public static final String JSON_PROPERTY_INTEGRATION_DISPLAY_NAME = "integration_display_name";
  private String integrationDisplayName;

  public static final String JSON_PROPERTY_JSON_SCHEMA = "json_schema";
  private Boolean jsonSchema;

  public static final String JSON_PROPERTY_MODEL_DISPLAY_NAME = "model_display_name";
  private String modelDisplayName;

  public static final String JSON_PROPERTY_MODEL_ID = "model_id";
  private String modelId;

  public static final String JSON_PROPERTY_PROVIDER = "provider";
  private String provider;

  public static final String JSON_PROPERTY_PROVIDER_DISPLAY_NAME = "provider_display_name";
  private String providerDisplayName;

  public static final String JSON_PROPERTY_REGION_PREFIX_OVERRIDES = "region_prefix_overrides";
  private Map<String, String> regionPrefixOverrides = null;

  public LLMObsIntegrationModel() {}

  @JsonCreator
  public LLMObsIntegrationModel(
      @JsonProperty(required = true, value = JSON_PROPERTY_HAS_ACCESS) Boolean hasAccess,
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) String id,
      @JsonProperty(required = true, value = JSON_PROPERTY_INTEGRATION) String integration,
      @JsonProperty(required = true, value = JSON_PROPERTY_INTEGRATION_DISPLAY_NAME)
          String integrationDisplayName,
      @JsonProperty(required = true, value = JSON_PROPERTY_JSON_SCHEMA) Boolean jsonSchema,
      @JsonProperty(required = true, value = JSON_PROPERTY_MODEL_DISPLAY_NAME)
          String modelDisplayName,
      @JsonProperty(required = true, value = JSON_PROPERTY_MODEL_ID) String modelId,
      @JsonProperty(required = true, value = JSON_PROPERTY_PROVIDER) String provider,
      @JsonProperty(required = true, value = JSON_PROPERTY_PROVIDER_DISPLAY_NAME)
          String providerDisplayName) {
    this.hasAccess = hasAccess;
    this.id = id;
    this.integration = integration;
    this.integrationDisplayName = integrationDisplayName;
    this.jsonSchema = jsonSchema;
    this.modelDisplayName = modelDisplayName;
    this.modelId = modelId;
    this.provider = provider;
    this.providerDisplayName = providerDisplayName;
  }

  public LLMObsIntegrationModel hasAccess(Boolean hasAccess) {
    this.hasAccess = hasAccess;
    return this;
  }

  /**
   * Whether the account has access to this model.
   *
   * @return hasAccess
   */
  @JsonProperty(JSON_PROPERTY_HAS_ACCESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getHasAccess() {
    return hasAccess;
  }

  public void setHasAccess(Boolean hasAccess) {
    this.hasAccess = hasAccess;
  }

  public LLMObsIntegrationModel id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier for the model entry.
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

  public LLMObsIntegrationModel integration(String integration) {
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

  public LLMObsIntegrationModel integrationDisplayName(String integrationDisplayName) {
    this.integrationDisplayName = integrationDisplayName;
    return this;
  }

  /**
   * Human-readable name of the LLM provider integration.
   *
   * @return integrationDisplayName
   */
  @JsonProperty(JSON_PROPERTY_INTEGRATION_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getIntegrationDisplayName() {
    return integrationDisplayName;
  }

  public void setIntegrationDisplayName(String integrationDisplayName) {
    this.integrationDisplayName = integrationDisplayName;
  }

  public LLMObsIntegrationModel jsonSchema(Boolean jsonSchema) {
    this.jsonSchema = jsonSchema;
    return this;
  }

  /**
   * Whether the model supports structured output via JSON schema.
   *
   * @return jsonSchema
   */
  @JsonProperty(JSON_PROPERTY_JSON_SCHEMA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getJsonSchema() {
    return jsonSchema;
  }

  public void setJsonSchema(Boolean jsonSchema) {
    this.jsonSchema = jsonSchema;
  }

  public LLMObsIntegrationModel modelDisplayName(String modelDisplayName) {
    this.modelDisplayName = modelDisplayName;
    return this;
  }

  /**
   * Human-readable model name.
   *
   * @return modelDisplayName
   */
  @JsonProperty(JSON_PROPERTY_MODEL_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getModelDisplayName() {
    return modelDisplayName;
  }

  public void setModelDisplayName(String modelDisplayName) {
    this.modelDisplayName = modelDisplayName;
  }

  public LLMObsIntegrationModel modelId(String modelId) {
    this.modelId = modelId;
    return this;
  }

  /**
   * Provider-specific model identifier used in inference calls.
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

  public LLMObsIntegrationModel provider(String provider) {
    this.provider = provider;
    return this;
  }

  /**
   * The underlying model provider.
   *
   * @return provider
   */
  @JsonProperty(JSON_PROPERTY_PROVIDER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getProvider() {
    return provider;
  }

  public void setProvider(String provider) {
    this.provider = provider;
  }

  public LLMObsIntegrationModel providerDisplayName(String providerDisplayName) {
    this.providerDisplayName = providerDisplayName;
    return this;
  }

  /**
   * Human-readable name of the underlying model provider.
   *
   * @return providerDisplayName
   */
  @JsonProperty(JSON_PROPERTY_PROVIDER_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getProviderDisplayName() {
    return providerDisplayName;
  }

  public void setProviderDisplayName(String providerDisplayName) {
    this.providerDisplayName = providerDisplayName;
  }

  public LLMObsIntegrationModel regionPrefixOverrides(Map<String, String> regionPrefixOverrides) {
    this.regionPrefixOverrides = regionPrefixOverrides;
    return this;
  }

  public LLMObsIntegrationModel putRegionPrefixOverridesItem(
      String key, String regionPrefixOverridesItem) {
    if (this.regionPrefixOverrides == null) {
      this.regionPrefixOverrides = new HashMap<>();
    }
    this.regionPrefixOverrides.put(key, regionPrefixOverridesItem);
    return this;
  }

  /**
   * Map of region-specific model ID prefix overrides.
   *
   * @return regionPrefixOverrides
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REGION_PREFIX_OVERRIDES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, String> getRegionPrefixOverrides() {
    return regionPrefixOverrides;
  }

  public void setRegionPrefixOverrides(Map<String, String> regionPrefixOverrides) {
    this.regionPrefixOverrides = regionPrefixOverrides;
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
   * @return LLMObsIntegrationModel
   */
  @JsonAnySetter
  public LLMObsIntegrationModel putAdditionalProperty(String key, Object value) {
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

  /** Return true if this LLMObsIntegrationModel object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LLMObsIntegrationModel llmObsIntegrationModel = (LLMObsIntegrationModel) o;
    return Objects.equals(this.hasAccess, llmObsIntegrationModel.hasAccess)
        && Objects.equals(this.id, llmObsIntegrationModel.id)
        && Objects.equals(this.integration, llmObsIntegrationModel.integration)
        && Objects.equals(
            this.integrationDisplayName, llmObsIntegrationModel.integrationDisplayName)
        && Objects.equals(this.jsonSchema, llmObsIntegrationModel.jsonSchema)
        && Objects.equals(this.modelDisplayName, llmObsIntegrationModel.modelDisplayName)
        && Objects.equals(this.modelId, llmObsIntegrationModel.modelId)
        && Objects.equals(this.provider, llmObsIntegrationModel.provider)
        && Objects.equals(this.providerDisplayName, llmObsIntegrationModel.providerDisplayName)
        && Objects.equals(this.regionPrefixOverrides, llmObsIntegrationModel.regionPrefixOverrides)
        && Objects.equals(this.additionalProperties, llmObsIntegrationModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        hasAccess,
        id,
        integration,
        integrationDisplayName,
        jsonSchema,
        modelDisplayName,
        modelId,
        provider,
        providerDisplayName,
        regionPrefixOverrides,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LLMObsIntegrationModel {\n");
    sb.append("    hasAccess: ").append(toIndentedString(hasAccess)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    integration: ").append(toIndentedString(integration)).append("\n");
    sb.append("    integrationDisplayName: ")
        .append(toIndentedString(integrationDisplayName))
        .append("\n");
    sb.append("    jsonSchema: ").append(toIndentedString(jsonSchema)).append("\n");
    sb.append("    modelDisplayName: ").append(toIndentedString(modelDisplayName)).append("\n");
    sb.append("    modelId: ").append(toIndentedString(modelId)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    providerDisplayName: ")
        .append(toIndentedString(providerDisplayName))
        .append("\n");
    sb.append("    regionPrefixOverrides: ")
        .append(toIndentedString(regionPrefixOverrides))
        .append("\n");
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
