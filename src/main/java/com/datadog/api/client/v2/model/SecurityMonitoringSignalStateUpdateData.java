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

/** Data containing the patch for changing the state of a signal. */
@JsonPropertyOrder({
  SecurityMonitoringSignalStateUpdateData.JSON_PROPERTY_ATTRIBUTES,
  SecurityMonitoringSignalStateUpdateData.JSON_PROPERTY_ID,
  SecurityMonitoringSignalStateUpdateData.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SecurityMonitoringSignalStateUpdateData {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private SecurityMonitoringSignalStateUpdateAttributes attributes;

  public static final String JSON_PROPERTY_ID = "id";
  private Object id = null;

  public static final String JSON_PROPERTY_TYPE = "type";
  private SecurityMonitoringSignalMetadataType type =
      SecurityMonitoringSignalMetadataType.SIGNAL_METADATA;

  public SecurityMonitoringSignalStateUpdateData() {}

  @JsonCreator
  public SecurityMonitoringSignalStateUpdateData(
      @JsonProperty(required = true, value = JSON_PROPERTY_ATTRIBUTES)
          SecurityMonitoringSignalStateUpdateAttributes attributes) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
  }

  public SecurityMonitoringSignalStateUpdateData attributes(
      SecurityMonitoringSignalStateUpdateAttributes attributes) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    return this;
  }

  /**
   * Attributes describing the change of state of a security signal.
   *
   * @return attributes
   */
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SecurityMonitoringSignalStateUpdateAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(SecurityMonitoringSignalStateUpdateAttributes attributes) {
    this.attributes = attributes;
  }

  public SecurityMonitoringSignalStateUpdateData id(Object id) {
    this.id = id;
    return this;
  }

  /**
   * The unique ID of the security signal.
   *
   * @return id
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Object getId() {
    return id;
  }

  public void setId(Object id) {
    this.id = id;
  }

  public SecurityMonitoringSignalStateUpdateData type(SecurityMonitoringSignalMetadataType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * The type of event.
   *
   * @return type
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SecurityMonitoringSignalMetadataType getType() {
    return type;
  }

  public void setType(SecurityMonitoringSignalMetadataType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
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
   * @return SecurityMonitoringSignalStateUpdateData
   */
  @JsonAnySetter
  public SecurityMonitoringSignalStateUpdateData putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SecurityMonitoringSignalStateUpdateData object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityMonitoringSignalStateUpdateData securityMonitoringSignalStateUpdateData =
        (SecurityMonitoringSignalStateUpdateData) o;
    return Objects.equals(this.attributes, securityMonitoringSignalStateUpdateData.attributes)
        && Objects.equals(this.id, securityMonitoringSignalStateUpdateData.id)
        && Objects.equals(this.type, securityMonitoringSignalStateUpdateData.type)
        && Objects.equals(
            this.additionalProperties,
            securityMonitoringSignalStateUpdateData.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, id, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityMonitoringSignalStateUpdateData {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
