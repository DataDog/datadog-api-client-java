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

/** Attributes for dataset dependency. */
@JsonPropertyOrder({
  SecurityMonitoringDatasetDependencyAttributesResponse.JSON_PROPERTY_COUNT,
  SecurityMonitoringDatasetDependencyAttributesResponse.JSON_PROPERTY_IDS,
  SecurityMonitoringDatasetDependencyAttributesResponse.JSON_PROPERTY_RESOURCE_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SecurityMonitoringDatasetDependencyAttributesResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COUNT = "count";
  private Long count;

  public static final String JSON_PROPERTY_IDS = "ids";
  private List<String> ids = new ArrayList<>();

  public static final String JSON_PROPERTY_RESOURCE_TYPE = "resource_type";
  private String resourceType;

  public SecurityMonitoringDatasetDependencyAttributesResponse() {}

  @JsonCreator
  public SecurityMonitoringDatasetDependencyAttributesResponse(
      @JsonProperty(required = true, value = JSON_PROPERTY_COUNT) Long count,
      @JsonProperty(required = true, value = JSON_PROPERTY_IDS) List<String> ids,
      @JsonProperty(required = true, value = JSON_PROPERTY_RESOURCE_TYPE) String resourceType) {
    this.count = count;
    this.ids = ids;
    this.resourceType = resourceType;
  }

  public SecurityMonitoringDatasetDependencyAttributesResponse count(Long count) {
    this.count = count;
    return this;
  }

  /**
   * The count of resources that depend on the dataset.
   *
   * @return count
   */
  @JsonProperty(JSON_PROPERTY_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getCount() {
    return count;
  }

  public void setCount(Long count) {
    this.count = count;
  }

  public SecurityMonitoringDatasetDependencyAttributesResponse ids(List<String> ids) {
    this.ids = ids;
    return this;
  }

  public SecurityMonitoringDatasetDependencyAttributesResponse addIdsItem(String idsItem) {
    this.ids.add(idsItem);
    return this;
  }

  /**
   * Array of IDs of resources that depend on the dataset.
   *
   * @return ids
   */
  @JsonProperty(JSON_PROPERTY_IDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getIds() {
    return ids;
  }

  public void setIds(List<String> ids) {
    this.ids = ids;
  }

  public SecurityMonitoringDatasetDependencyAttributesResponse resourceType(String resourceType) {
    this.resourceType = resourceType;
    return this;
  }

  /**
   * The type of resource that depends on the dataset.
   *
   * @return resourceType
   */
  @JsonProperty(JSON_PROPERTY_RESOURCE_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getResourceType() {
    return resourceType;
  }

  public void setResourceType(String resourceType) {
    this.resourceType = resourceType;
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
   * @return SecurityMonitoringDatasetDependencyAttributesResponse
   */
  @JsonAnySetter
  public SecurityMonitoringDatasetDependencyAttributesResponse putAdditionalProperty(
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
   * Return true if this SecurityMonitoringDatasetDependencyAttributesResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityMonitoringDatasetDependencyAttributesResponse
        securityMonitoringDatasetDependencyAttributesResponse =
            (SecurityMonitoringDatasetDependencyAttributesResponse) o;
    return Objects.equals(this.count, securityMonitoringDatasetDependencyAttributesResponse.count)
        && Objects.equals(this.ids, securityMonitoringDatasetDependencyAttributesResponse.ids)
        && Objects.equals(
            this.resourceType, securityMonitoringDatasetDependencyAttributesResponse.resourceType)
        && Objects.equals(
            this.additionalProperties,
            securityMonitoringDatasetDependencyAttributesResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, ids, resourceType, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityMonitoringDatasetDependencyAttributesResponse {\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
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
