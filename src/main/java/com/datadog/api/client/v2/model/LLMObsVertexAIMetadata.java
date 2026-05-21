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

/** Vertex AI-specific metadata for an integration account or inference request. */
@JsonPropertyOrder({
  LLMObsVertexAIMetadata.JSON_PROPERTY_LOCATION,
  LLMObsVertexAIMetadata.JSON_PROPERTY_PROJECT,
  LLMObsVertexAIMetadata.JSON_PROPERTY_PROJECT_IDS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LLMObsVertexAIMetadata {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_LOCATION = "location";
  private String location;

  public static final String JSON_PROPERTY_PROJECT = "project";
  private String project;

  public static final String JSON_PROPERTY_PROJECT_IDS = "project_ids";
  private List<String> projectIds = null;

  public LLMObsVertexAIMetadata location(String location) {
    this.location = location;
    return this;
  }

  /**
   * The Vertex AI region.
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

  public LLMObsVertexAIMetadata project(String project) {
    this.project = project;
    return this;
  }

  /**
   * The Google Cloud project ID.
   *
   * @return project
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROJECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getProject() {
    return project;
  }

  public void setProject(String project) {
    this.project = project;
  }

  public LLMObsVertexAIMetadata projectIds(List<String> projectIds) {
    this.projectIds = projectIds;
    return this;
  }

  public LLMObsVertexAIMetadata addProjectIdsItem(String projectIdsItem) {
    if (this.projectIds == null) {
      this.projectIds = new ArrayList<>();
    }
    this.projectIds.add(projectIdsItem);
    return this;
  }

  /**
   * List of Google Cloud project IDs available to the service account.
   *
   * @return projectIds
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROJECT_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getProjectIds() {
    return projectIds;
  }

  public void setProjectIds(List<String> projectIds) {
    this.projectIds = projectIds;
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
   * @return LLMObsVertexAIMetadata
   */
  @JsonAnySetter
  public LLMObsVertexAIMetadata putAdditionalProperty(String key, Object value) {
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

  /** Return true if this LLMObsVertexAIMetadata object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LLMObsVertexAIMetadata llmObsVertexAiMetadata = (LLMObsVertexAIMetadata) o;
    return Objects.equals(this.location, llmObsVertexAiMetadata.location)
        && Objects.equals(this.project, llmObsVertexAiMetadata.project)
        && Objects.equals(this.projectIds, llmObsVertexAiMetadata.projectIds)
        && Objects.equals(this.additionalProperties, llmObsVertexAiMetadata.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(location, project, projectIds, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LLMObsVertexAIMetadata {\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    projectIds: ").append(toIndentedString(projectIds)).append("\n");
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
