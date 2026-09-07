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

/** The attributes of a dataset dependencies request. */
@JsonPropertyOrder({
  SecurityMonitoringDatasetDependenciesRequestAttributes.JSON_PROPERTY_DATASET_IDS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SecurityMonitoringDatasetDependenciesRequestAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATASET_IDS = "datasetIds";
  private List<String> datasetIds = new ArrayList<>();

  public SecurityMonitoringDatasetDependenciesRequestAttributes() {}

  @JsonCreator
  public SecurityMonitoringDatasetDependenciesRequestAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_DATASET_IDS) List<String> datasetIds) {
    this.datasetIds = datasetIds;
  }

  public SecurityMonitoringDatasetDependenciesRequestAttributes datasetIds(
      List<String> datasetIds) {
    this.datasetIds = datasetIds;
    return this;
  }

  public SecurityMonitoringDatasetDependenciesRequestAttributes addDatasetIdsItem(
      String datasetIdsItem) {
    this.datasetIds.add(datasetIdsItem);
    return this;
  }

  /**
   * The list of dataset UUIDs to query dependencies for. Must contain between 1 and 100 items.
   *
   * @return datasetIds
   */
  @JsonProperty(JSON_PROPERTY_DATASET_IDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getDatasetIds() {
    return datasetIds;
  }

  public void setDatasetIds(List<String> datasetIds) {
    this.datasetIds = datasetIds;
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
   * @return SecurityMonitoringDatasetDependenciesRequestAttributes
   */
  @JsonAnySetter
  public SecurityMonitoringDatasetDependenciesRequestAttributes putAdditionalProperty(
      String key, Object value) {
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

  /**
   * Return true if this SecurityMonitoringDatasetDependenciesRequestAttributes object is equal to
   * o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityMonitoringDatasetDependenciesRequestAttributes
        securityMonitoringDatasetDependenciesRequestAttributes =
            (SecurityMonitoringDatasetDependenciesRequestAttributes) o;
    return Objects.equals(
            this.datasetIds, securityMonitoringDatasetDependenciesRequestAttributes.datasetIds)
        && Objects.equals(
            this.additionalProperties,
            securityMonitoringDatasetDependenciesRequestAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(datasetIds, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityMonitoringDatasetDependenciesRequestAttributes {\n");
    sb.append("    datasetIds: ").append(toIndentedString(datasetIds)).append("\n");
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
