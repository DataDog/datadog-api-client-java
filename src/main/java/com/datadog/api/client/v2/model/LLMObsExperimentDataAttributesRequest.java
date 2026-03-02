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

/** Attributes for creating an LLM Observability experiment. */
@JsonPropertyOrder({
  LLMObsExperimentDataAttributesRequest.JSON_PROPERTY_CONFIG,
  LLMObsExperimentDataAttributesRequest.JSON_PROPERTY_DATASET_ID,
  LLMObsExperimentDataAttributesRequest.JSON_PROPERTY_DATASET_VERSION,
  LLMObsExperimentDataAttributesRequest.JSON_PROPERTY_DESCRIPTION,
  LLMObsExperimentDataAttributesRequest.JSON_PROPERTY_ENSURE_UNIQUE,
  LLMObsExperimentDataAttributesRequest.JSON_PROPERTY_METADATA,
  LLMObsExperimentDataAttributesRequest.JSON_PROPERTY_NAME,
  LLMObsExperimentDataAttributesRequest.JSON_PROPERTY_PROJECT_ID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LLMObsExperimentDataAttributesRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CONFIG = "config";
  private Map<String, Object> config = null;

  public static final String JSON_PROPERTY_DATASET_ID = "dataset_id";
  private String datasetId;

  public static final String JSON_PROPERTY_DATASET_VERSION = "dataset_version";
  private Long datasetVersion;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_ENSURE_UNIQUE = "ensure_unique";
  private Boolean ensureUnique;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private Map<String, Object> metadata = null;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PROJECT_ID = "project_id";
  private String projectId;

  public LLMObsExperimentDataAttributesRequest() {}

  @JsonCreator
  public LLMObsExperimentDataAttributesRequest(
      @JsonProperty(required = true, value = JSON_PROPERTY_DATASET_ID) String datasetId,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_PROJECT_ID) String projectId) {
    this.datasetId = datasetId;
    this.name = name;
    this.projectId = projectId;
  }

  public LLMObsExperimentDataAttributesRequest config(Map<String, Object> config) {
    this.config = config;
    return this;
  }

  public LLMObsExperimentDataAttributesRequest putConfigItem(String key, Object configItem) {
    if (this.config == null) {
      this.config = new HashMap<>();
    }
    this.config.put(key, configItem);
    return this;
  }

  /**
   * Configuration parameters for the experiment.
   *
   * @return config
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, Object> getConfig() {
    return config;
  }

  public void setConfig(Map<String, Object> config) {
    this.config = config;
  }

  public LLMObsExperimentDataAttributesRequest datasetId(String datasetId) {
    this.datasetId = datasetId;
    return this;
  }

  /**
   * Identifier of the dataset used in this experiment.
   *
   * @return datasetId
   */
  @JsonProperty(JSON_PROPERTY_DATASET_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getDatasetId() {
    return datasetId;
  }

  public void setDatasetId(String datasetId) {
    this.datasetId = datasetId;
  }

  public LLMObsExperimentDataAttributesRequest datasetVersion(Long datasetVersion) {
    this.datasetVersion = datasetVersion;
    return this;
  }

  /**
   * Version of the dataset to use. Defaults to the current version if not specified.
   *
   * @return datasetVersion
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATASET_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getDatasetVersion() {
    return datasetVersion;
  }

  public void setDatasetVersion(Long datasetVersion) {
    this.datasetVersion = datasetVersion;
  }

  public LLMObsExperimentDataAttributesRequest description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the experiment.
   *
   * @return description
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public LLMObsExperimentDataAttributesRequest ensureUnique(Boolean ensureUnique) {
    this.ensureUnique = ensureUnique;
    return this;
  }

  /**
   * Whether to ensure the experiment name is unique. Defaults to <code>true</code>.
   *
   * @return ensureUnique
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENSURE_UNIQUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getEnsureUnique() {
    return ensureUnique;
  }

  public void setEnsureUnique(Boolean ensureUnique) {
    this.ensureUnique = ensureUnique;
  }

  public LLMObsExperimentDataAttributesRequest metadata(Map<String, Object> metadata) {
    this.metadata = metadata;
    return this;
  }

  public LLMObsExperimentDataAttributesRequest putMetadataItem(String key, Object metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

  /**
   * Arbitrary metadata associated with the experiment.
   *
   * @return metadata
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, Object> getMetadata() {
    return metadata;
  }

  public void setMetadata(Map<String, Object> metadata) {
    this.metadata = metadata;
  }

  public LLMObsExperimentDataAttributesRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the experiment.
   *
   * @return name
   */
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LLMObsExperimentDataAttributesRequest projectId(String projectId) {
    this.projectId = projectId;
    return this;
  }

  /**
   * Identifier of the project this experiment belongs to.
   *
   * @return projectId
   */
  @JsonProperty(JSON_PROPERTY_PROJECT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getProjectId() {
    return projectId;
  }

  public void setProjectId(String projectId) {
    this.projectId = projectId;
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
   * @return LLMObsExperimentDataAttributesRequest
   */
  @JsonAnySetter
  public LLMObsExperimentDataAttributesRequest putAdditionalProperty(String key, Object value) {
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

  /** Return true if this LLMObsExperimentDataAttributesRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LLMObsExperimentDataAttributesRequest llmObsExperimentDataAttributesRequest =
        (LLMObsExperimentDataAttributesRequest) o;
    return Objects.equals(this.config, llmObsExperimentDataAttributesRequest.config)
        && Objects.equals(this.datasetId, llmObsExperimentDataAttributesRequest.datasetId)
        && Objects.equals(this.datasetVersion, llmObsExperimentDataAttributesRequest.datasetVersion)
        && Objects.equals(this.description, llmObsExperimentDataAttributesRequest.description)
        && Objects.equals(this.ensureUnique, llmObsExperimentDataAttributesRequest.ensureUnique)
        && Objects.equals(this.metadata, llmObsExperimentDataAttributesRequest.metadata)
        && Objects.equals(this.name, llmObsExperimentDataAttributesRequest.name)
        && Objects.equals(this.projectId, llmObsExperimentDataAttributesRequest.projectId)
        && Objects.equals(
            this.additionalProperties, llmObsExperimentDataAttributesRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        config,
        datasetId,
        datasetVersion,
        description,
        ensureUnique,
        metadata,
        name,
        projectId,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LLMObsExperimentDataAttributesRequest {\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    datasetId: ").append(toIndentedString(datasetId)).append("\n");
    sb.append("    datasetVersion: ").append(toIndentedString(datasetVersion)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    ensureUnique: ").append(toIndentedString(ensureUnique)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
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
