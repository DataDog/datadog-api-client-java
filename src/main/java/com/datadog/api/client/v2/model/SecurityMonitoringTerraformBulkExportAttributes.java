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

/** Attributes for the bulk export request. */
@JsonPropertyOrder({SecurityMonitoringTerraformBulkExportAttributes.JSON_PROPERTY_RESOURCE_IDS})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SecurityMonitoringTerraformBulkExportAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_RESOURCE_IDS = "resource_ids";
  private List<String> resourceIds = new ArrayList<>();

  public SecurityMonitoringTerraformBulkExportAttributes() {}

  @JsonCreator
  public SecurityMonitoringTerraformBulkExportAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_RESOURCE_IDS) List<String> resourceIds) {
    this.resourceIds = resourceIds;
  }

  public SecurityMonitoringTerraformBulkExportAttributes resourceIds(List<String> resourceIds) {
    this.resourceIds = resourceIds;
    return this;
  }

  public SecurityMonitoringTerraformBulkExportAttributes addResourceIdsItem(
      String resourceIdsItem) {
    this.resourceIds.add(resourceIdsItem);
    return this;
  }

  /**
   * The list of resource IDs to export. Maximum 1000 items.
   *
   * @return resourceIds
   */
  @JsonProperty(JSON_PROPERTY_RESOURCE_IDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getResourceIds() {
    return resourceIds;
  }

  public void setResourceIds(List<String> resourceIds) {
    this.resourceIds = resourceIds;
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
   * @return SecurityMonitoringTerraformBulkExportAttributes
   */
  @JsonAnySetter
  public SecurityMonitoringTerraformBulkExportAttributes putAdditionalProperty(
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

  /** Return true if this SecurityMonitoringTerraformBulkExportAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityMonitoringTerraformBulkExportAttributes
        securityMonitoringTerraformBulkExportAttributes =
            (SecurityMonitoringTerraformBulkExportAttributes) o;
    return Objects.equals(
            this.resourceIds, securityMonitoringTerraformBulkExportAttributes.resourceIds)
        && Objects.equals(
            this.additionalProperties,
            securityMonitoringTerraformBulkExportAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceIds, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityMonitoringTerraformBulkExportAttributes {\n");
    sb.append("    resourceIds: ").append(toIndentedString(resourceIds)).append("\n");
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
