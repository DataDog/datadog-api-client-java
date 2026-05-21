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

/** Azure OpenAI-specific metadata for an integration account or inference request. */
@JsonPropertyOrder({
  LLMObsAzureOpenAIMetadata.JSON_PROPERTY_DEPLOYMENT_ID,
  LLMObsAzureOpenAIMetadata.JSON_PROPERTY_MODEL_VERSION,
  LLMObsAzureOpenAIMetadata.JSON_PROPERTY_RESOURCE_NAME
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LLMObsAzureOpenAIMetadata {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DEPLOYMENT_ID = "deployment_id";
  private String deploymentId;

  public static final String JSON_PROPERTY_MODEL_VERSION = "model_version";
  private String modelVersion;

  public static final String JSON_PROPERTY_RESOURCE_NAME = "resource_name";
  private String resourceName;

  public LLMObsAzureOpenAIMetadata deploymentId(String deploymentId) {
    this.deploymentId = deploymentId;
    return this;
  }

  /**
   * The Azure OpenAI deployment ID.
   *
   * @return deploymentId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEPLOYMENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDeploymentId() {
    return deploymentId;
  }

  public void setDeploymentId(String deploymentId) {
    this.deploymentId = deploymentId;
  }

  public LLMObsAzureOpenAIMetadata modelVersion(String modelVersion) {
    this.modelVersion = modelVersion;
    return this;
  }

  /**
   * The model version deployed in Azure.
   *
   * @return modelVersion
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODEL_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getModelVersion() {
    return modelVersion;
  }

  public void setModelVersion(String modelVersion) {
    this.modelVersion = modelVersion;
  }

  public LLMObsAzureOpenAIMetadata resourceName(String resourceName) {
    this.resourceName = resourceName;
    return this;
  }

  /**
   * The Azure OpenAI resource name.
   *
   * @return resourceName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESOURCE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getResourceName() {
    return resourceName;
  }

  public void setResourceName(String resourceName) {
    this.resourceName = resourceName;
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
   * @return LLMObsAzureOpenAIMetadata
   */
  @JsonAnySetter
  public LLMObsAzureOpenAIMetadata putAdditionalProperty(String key, Object value) {
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

  /** Return true if this LLMObsAzureOpenAIMetadata object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LLMObsAzureOpenAIMetadata llmObsAzureOpenAiMetadata = (LLMObsAzureOpenAIMetadata) o;
    return Objects.equals(this.deploymentId, llmObsAzureOpenAiMetadata.deploymentId)
        && Objects.equals(this.modelVersion, llmObsAzureOpenAiMetadata.modelVersion)
        && Objects.equals(this.resourceName, llmObsAzureOpenAiMetadata.resourceName)
        && Objects.equals(
            this.additionalProperties, llmObsAzureOpenAiMetadata.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deploymentId, modelVersion, resourceName, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LLMObsAzureOpenAIMetadata {\n");
    sb.append("    deploymentId: ").append(toIndentedString(deploymentId)).append("\n");
    sb.append("    modelVersion: ").append(toIndentedString(modelVersion)).append("\n");
    sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
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
