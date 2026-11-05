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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Provider-specific integration configuration. */
@JsonPropertyOrder({
  AiGatewayProviderIntegrationConfig.JSON_PROPERTY_BEDROCK_REGION,
  AiGatewayProviderIntegrationConfig.JSON_PROPERTY_FOUNDRY_PROJECT,
  AiGatewayProviderIntegrationConfig.JSON_PROPERTY_FOUNDRY_RESOURCE_ID,
  AiGatewayProviderIntegrationConfig.JSON_PROPERTY_LOCATION,
  AiGatewayProviderIntegrationConfig.JSON_PROPERTY_PROJECT_ID,
  AiGatewayProviderIntegrationConfig.JSON_PROPERTY_SUPPORTED_OPERATIONS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AiGatewayProviderIntegrationConfig {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_BEDROCK_REGION = "bedrock_region";
  private String bedrockRegion;

  public static final String JSON_PROPERTY_FOUNDRY_PROJECT = "foundry_project";
  private String foundryProject;

  public static final String JSON_PROPERTY_FOUNDRY_RESOURCE_ID = "foundry_resource_id";
  private String foundryResourceId;

  public static final String JSON_PROPERTY_LOCATION = "location";
  private String location;

  public static final String JSON_PROPERTY_PROJECT_ID = "project_id";
  private String projectId;

  public static final String JSON_PROPERTY_SUPPORTED_OPERATIONS = "supported_operations";
  private List<AiGatewayCustomProviderSupportedOperation> supportedOperations = null;

  public AiGatewayProviderIntegrationConfig bedrockRegion(String bedrockRegion) {
    this.bedrockRegion = bedrockRegion;
    return this;
  }

  /**
   * AWS region used for Bedrock model discovery, routing, and request signing.
   *
   * @return bedrockRegion
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BEDROCK_REGION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getBedrockRegion() {
    return bedrockRegion;
  }

  public void setBedrockRegion(String bedrockRegion) {
    this.bedrockRegion = bedrockRegion;
  }

  public AiGatewayProviderIntegrationConfig foundryProject(String foundryProject) {
    this.foundryProject = foundryProject;
    return this;
  }

  /**
   * Azure AI Foundry project name, used to call the project's agents.
   *
   * @return foundryProject
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FOUNDRY_PROJECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getFoundryProject() {
    return foundryProject;
  }

  public void setFoundryProject(String foundryProject) {
    this.foundryProject = foundryProject;
  }

  public AiGatewayProviderIntegrationConfig foundryResourceId(String foundryResourceId) {
    this.foundryResourceId = foundryResourceId;
    return this;
  }

  /**
   * ARM resource ID of the Azure AI Foundry resource, such as <code>
   * /subscriptions/&lt;id&gt;/resourceGroups/&lt;group&gt;/providers/Microsoft.CognitiveServices/accounts/&lt;name&gt;
   * </code>. Required for <code>azure_foundry</code> providers.
   *
   * @return foundryResourceId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FOUNDRY_RESOURCE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getFoundryResourceId() {
    return foundryResourceId;
  }

  public void setFoundryResourceId(String foundryResourceId) {
    this.foundryResourceId = foundryResourceId;
  }

  public AiGatewayProviderIntegrationConfig location(String location) {
    this.location = location;
    return this;
  }

  /**
   * GCP location used for Gemini model discovery and credential resolution.
   *
   * @return location
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public AiGatewayProviderIntegrationConfig projectId(String projectId) {
    this.projectId = projectId;
    return this;
  }

  /**
   * GCP project ID used for Gemini model discovery and credential resolution.
   *
   * @return projectId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROJECT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getProjectId() {
    return projectId;
  }

  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }

  public AiGatewayProviderIntegrationConfig supportedOperations(
      List<AiGatewayCustomProviderSupportedOperation> supportedOperations) {
    this.supportedOperations = supportedOperations;
    return this;
  }

  public AiGatewayProviderIntegrationConfig addSupportedOperationsItem(
      AiGatewayCustomProviderSupportedOperation supportedOperationsItem) {
    if (this.supportedOperations == null) {
      this.supportedOperations = new ArrayList<>();
    }
    this.supportedOperations.add(supportedOperationsItem);
    this.unparsed |= !supportedOperationsItem.isValid();
    return this;
  }

  /**
   * Custom provider default for discovered and new manual models. Omit to use Chat Completions. An
   * empty list is invalid.
   *
   * @return supportedOperations
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUPPORTED_OPERATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<AiGatewayCustomProviderSupportedOperation> getSupportedOperations() {
    return supportedOperations;
  }

  public void setSupportedOperations(
      List<AiGatewayCustomProviderSupportedOperation> supportedOperations) {
    this.supportedOperations = supportedOperations;
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
   * @return AiGatewayProviderIntegrationConfig
   */
  @JsonAnySetter
  public AiGatewayProviderIntegrationConfig putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AiGatewayProviderIntegrationConfig object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiGatewayProviderIntegrationConfig aiGatewayProviderIntegrationConfig =
        (AiGatewayProviderIntegrationConfig) o;
    return Objects.equals(this.bedrockRegion, aiGatewayProviderIntegrationConfig.bedrockRegion)
        && Objects.equals(this.foundryProject, aiGatewayProviderIntegrationConfig.foundryProject)
        && Objects.equals(
            this.foundryResourceId, aiGatewayProviderIntegrationConfig.foundryResourceId)
        && Objects.equals(this.location, aiGatewayProviderIntegrationConfig.location)
        && Objects.equals(this.projectId, aiGatewayProviderIntegrationConfig.projectId)
        && Objects.equals(
            this.supportedOperations, aiGatewayProviderIntegrationConfig.supportedOperations)
        && Objects.equals(
            this.additionalProperties, aiGatewayProviderIntegrationConfig.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        bedrockRegion,
        foundryProject,
        foundryResourceId,
        location,
        projectId,
        supportedOperations,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiGatewayProviderIntegrationConfig {\n");
    sb.append("    bedrockRegion: ").append(toIndentedString(bedrockRegion)).append("\n");
    sb.append("    foundryProject: ").append(toIndentedString(foundryProject)).append("\n");
    sb.append("    foundryResourceId: ").append(toIndentedString(foundryResourceId)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    supportedOperations: ")
        .append(toIndentedString(supportedOperations))
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
