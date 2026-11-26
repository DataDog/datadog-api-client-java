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

/** Data for upserting an external team permission setting default. */
@JsonPropertyOrder({
  ExternalTeamPermissionSettingDefaultUpdateData.JSON_PROPERTY_ATTRIBUTES,
  ExternalTeamPermissionSettingDefaultUpdateData.JSON_PROPERTY_ID,
  ExternalTeamPermissionSettingDefaultUpdateData.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ExternalTeamPermissionSettingDefaultUpdateData {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private ExternalTeamPermissionSettingDefaultUpdateAttributes attributes;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_TYPE = "type";
  private ExternalTeamPermissionSettingDefaultsType type;

  public ExternalTeamPermissionSettingDefaultUpdateData() {}

  @JsonCreator
  public ExternalTeamPermissionSettingDefaultUpdateData(
      @JsonProperty(required = true, value = JSON_PROPERTY_ATTRIBUTES)
          ExternalTeamPermissionSettingDefaultUpdateAttributes attributes,
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) String id,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          ExternalTeamPermissionSettingDefaultsType type) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    this.id = id;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public ExternalTeamPermissionSettingDefaultUpdateData attributes(
      ExternalTeamPermissionSettingDefaultUpdateAttributes attributes) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    return this;
  }

  /**
   * Attributes for upserting an external team permission setting default.
   *
   * @return attributes
   */
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ExternalTeamPermissionSettingDefaultUpdateAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(ExternalTeamPermissionSettingDefaultUpdateAttributes attributes) {
    this.attributes = attributes;
    if (attributes != null) {
      this.unparsed |= attributes.unparsed;
    }
  }

  public ExternalTeamPermissionSettingDefaultUpdateData id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The resource identifier, formatted as <code>{source}:{action}</code>. Must match the path
   * parameters.
   *
   * @return id
   */
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ExternalTeamPermissionSettingDefaultUpdateData type(
      ExternalTeamPermissionSettingDefaultsType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Resource type for external team permission setting defaults.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ExternalTeamPermissionSettingDefaultsType getType() {
    return type;
  }

  public void setType(ExternalTeamPermissionSettingDefaultsType type) {
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
   * @return ExternalTeamPermissionSettingDefaultUpdateData
   */
  @JsonAnySetter
  public ExternalTeamPermissionSettingDefaultUpdateData putAdditionalProperty(
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

  /** Return true if this ExternalTeamPermissionSettingDefaultUpdateData object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalTeamPermissionSettingDefaultUpdateData externalTeamPermissionSettingDefaultUpdateData =
        (ExternalTeamPermissionSettingDefaultUpdateData) o;
    return Objects.equals(
            this.attributes, externalTeamPermissionSettingDefaultUpdateData.attributes)
        && Objects.equals(this.id, externalTeamPermissionSettingDefaultUpdateData.id)
        && Objects.equals(this.type, externalTeamPermissionSettingDefaultUpdateData.type)
        && Objects.equals(
            this.additionalProperties,
            externalTeamPermissionSettingDefaultUpdateData.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, id, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalTeamPermissionSettingDefaultUpdateData {\n");
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
