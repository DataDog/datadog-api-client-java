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

/** Attributes for updating a security monitoring dataset. */
@JsonPropertyOrder({
  SecurityMonitoringDatasetUpdateAttributesRequest.JSON_PROPERTY_DEFINITION,
  SecurityMonitoringDatasetUpdateAttributesRequest.JSON_PROPERTY_DESCRIPTION,
  SecurityMonitoringDatasetUpdateAttributesRequest.JSON_PROPERTY_VERSION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SecurityMonitoringDatasetUpdateAttributesRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DEFINITION = "definition";
  private SecurityMonitoringDatasetDefinition definition;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_VERSION = "version";
  private Long version;

  public SecurityMonitoringDatasetUpdateAttributesRequest() {}

  @JsonCreator
  public SecurityMonitoringDatasetUpdateAttributesRequest(
      @JsonProperty(required = true, value = JSON_PROPERTY_DEFINITION)
          SecurityMonitoringDatasetDefinition definition,
      @JsonProperty(required = true, value = JSON_PROPERTY_DESCRIPTION) String description) {
    this.definition = definition;
    this.unparsed |= definition.unparsed;
    this.description = description;
  }

  public SecurityMonitoringDatasetUpdateAttributesRequest definition(
      SecurityMonitoringDatasetDefinition definition) {
    this.definition = definition;
    this.unparsed |= definition.unparsed;
    return this;
  }

  /**
   * The definition of a dataset, including its data source, name, indexes, and columns.
   *
   * @return definition
   */
  @JsonProperty(JSON_PROPERTY_DEFINITION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SecurityMonitoringDatasetDefinition getDefinition() {
    return definition;
  }

  public void setDefinition(SecurityMonitoringDatasetDefinition definition) {
    this.definition = definition;
  }

  public SecurityMonitoringDatasetUpdateAttributesRequest description(String description) {
    this.description = description;
    return this;
  }

  /**
   * A description of the dataset (maximum 255 characters).
   *
   * @return description
   */
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public SecurityMonitoringDatasetUpdateAttributesRequest version(Long version) {
    this.version = version;
    return this;
  }

  /**
   * The expected version of the dataset for concurrent modification detection.
   *
   * @return version
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getVersion() {
    return version;
  }

  public void setVersion(Long version) {
    this.version = version;
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
   * @return SecurityMonitoringDatasetUpdateAttributesRequest
   */
  @JsonAnySetter
  public SecurityMonitoringDatasetUpdateAttributesRequest putAdditionalProperty(
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

  /** Return true if this SecurityMonitoringDatasetUpdateAttributesRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityMonitoringDatasetUpdateAttributesRequest
        securityMonitoringDatasetUpdateAttributesRequest =
            (SecurityMonitoringDatasetUpdateAttributesRequest) o;
    return Objects.equals(
            this.definition, securityMonitoringDatasetUpdateAttributesRequest.definition)
        && Objects.equals(
            this.description, securityMonitoringDatasetUpdateAttributesRequest.description)
        && Objects.equals(this.version, securityMonitoringDatasetUpdateAttributesRequest.version)
        && Objects.equals(
            this.additionalProperties,
            securityMonitoringDatasetUpdateAttributesRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(definition, description, version, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityMonitoringDatasetUpdateAttributesRequest {\n");
    sb.append("    definition: ").append(toIndentedString(definition)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
