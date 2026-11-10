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

/**
 * The BigQuery table the committed use discount (CUD) metadata is read from. Only returned when CUD
 * metadata is configured for the account.
 */
@JsonPropertyOrder({
  GCPCudMetadataConfig.JSON_PROPERTY_DATASET_ID,
  GCPCudMetadataConfig.JSON_PROPERTY_PROJECT_ID,
  GCPCudMetadataConfig.JSON_PROPERTY_TABLE_ID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class GCPCudMetadataConfig {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATASET_ID = "dataset_id";
  private String datasetId;

  public static final String JSON_PROPERTY_PROJECT_ID = "project_id";
  private String projectId;

  public static final String JSON_PROPERTY_TABLE_ID = "table_id";
  private String tableId;

  public GCPCudMetadataConfig() {}

  @JsonCreator
  public GCPCudMetadataConfig(
      @JsonProperty(required = true, value = JSON_PROPERTY_DATASET_ID) String datasetId,
      @JsonProperty(required = true, value = JSON_PROPERTY_PROJECT_ID) String projectId,
      @JsonProperty(required = true, value = JSON_PROPERTY_TABLE_ID) String tableId) {
    this.datasetId = datasetId;
    this.projectId = projectId;
    this.tableId = tableId;
  }

  public GCPCudMetadataConfig datasetId(String datasetId) {
    this.datasetId = datasetId;
    return this;
  }

  /**
   * The BigQuery dataset ID of the CUD metadata export.
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

  public GCPCudMetadataConfig projectId(String projectId) {
    this.projectId = projectId;
    return this;
  }

  /**
   * The Google Cloud project ID of the CUD metadata export.
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

  public GCPCudMetadataConfig tableId(String tableId) {
    this.tableId = tableId;
    return this;
  }

  /**
   * The BigQuery table ID of the CUD metadata export.
   *
   * @return tableId
   */
  @JsonProperty(JSON_PROPERTY_TABLE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getTableId() {
    return tableId;
  }

  public void setTableId(String tableId) {
    this.tableId = tableId;
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
   * @return GCPCudMetadataConfig
   */
  @JsonAnySetter
  public GCPCudMetadataConfig putAdditionalProperty(String key, Object value) {
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

  /** Return true if this GCPCudMetadataConfig object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GCPCudMetadataConfig gcpCudMetadataConfig = (GCPCudMetadataConfig) o;
    return Objects.equals(this.datasetId, gcpCudMetadataConfig.datasetId)
        && Objects.equals(this.projectId, gcpCudMetadataConfig.projectId)
        && Objects.equals(this.tableId, gcpCudMetadataConfig.tableId)
        && Objects.equals(this.additionalProperties, gcpCudMetadataConfig.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(datasetId, projectId, tableId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GCPCudMetadataConfig {\n");
    sb.append("    datasetId: ").append(toIndentedString(datasetId)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    tableId: ").append(toIndentedString(tableId)).append("\n");
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
