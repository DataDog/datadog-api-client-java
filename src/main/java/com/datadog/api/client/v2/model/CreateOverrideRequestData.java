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

/** Data for creating an on-call schedule override. */
@JsonPropertyOrder({
  CreateOverrideRequestData.JSON_PROPERTY_ATTRIBUTES,
  CreateOverrideRequestData.JSON_PROPERTY_RELATIONSHIPS,
  CreateOverrideRequestData.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CreateOverrideRequestData {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private CreateOverrideRequestAttributes attributes;

  public static final String JSON_PROPERTY_RELATIONSHIPS = "relationships";
  private CreateOverrideRequestRelationships relationships;

  public static final String JSON_PROPERTY_TYPE = "type";
  private OverrideDataType type = OverrideDataType.OVERRIDES;

  public CreateOverrideRequestData() {}

  @JsonCreator
  public CreateOverrideRequestData(
      @JsonProperty(required = true, value = JSON_PROPERTY_ATTRIBUTES)
          CreateOverrideRequestAttributes attributes,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) OverrideDataType type) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public CreateOverrideRequestData attributes(CreateOverrideRequestAttributes attributes) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    return this;
  }

  /**
   * Attributes for creating an on-call schedule override.
   *
   * @return attributes
   */
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public CreateOverrideRequestAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(CreateOverrideRequestAttributes attributes) {
    this.attributes = attributes;
    if (attributes != null) {
      this.unparsed |= attributes.unparsed;
    }
  }

  public CreateOverrideRequestData relationships(CreateOverrideRequestRelationships relationships) {
    this.relationships = relationships;
    this.unparsed |= relationships.unparsed;
    return this;
  }

  /**
   * Relationships to set when creating an on-call schedule override.
   *
   * @return relationships
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RELATIONSHIPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CreateOverrideRequestRelationships getRelationships() {
    return relationships;
  }

  public void setRelationships(CreateOverrideRequestRelationships relationships) {
    this.relationships = relationships;
    if (relationships != null) {
      this.unparsed |= relationships.unparsed;
    }
  }

  public CreateOverrideRequestData type(OverrideDataType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Indicates that the resource is of type 'overrides'.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OverrideDataType getType() {
    return type;
  }

  public void setType(OverrideDataType type) {
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
   * @return CreateOverrideRequestData
   */
  @JsonAnySetter
  public CreateOverrideRequestData putAdditionalProperty(String key, Object value) {
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

  /** Return true if this CreateOverrideRequestData object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateOverrideRequestData createOverrideRequestData = (CreateOverrideRequestData) o;
    return Objects.equals(this.attributes, createOverrideRequestData.attributes)
        && Objects.equals(this.relationships, createOverrideRequestData.relationships)
        && Objects.equals(this.type, createOverrideRequestData.type)
        && Objects.equals(
            this.additionalProperties, createOverrideRequestData.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, relationships, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateOverrideRequestData {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    relationships: ").append(toIndentedString(relationships)).append("\n");
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
