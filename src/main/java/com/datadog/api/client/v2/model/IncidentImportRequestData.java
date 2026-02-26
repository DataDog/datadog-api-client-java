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

/** Incident data for an import request. */
@JsonPropertyOrder({
  IncidentImportRequestData.JSON_PROPERTY_ATTRIBUTES,
  IncidentImportRequestData.JSON_PROPERTY_RELATIONSHIPS,
  IncidentImportRequestData.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IncidentImportRequestData {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private IncidentImportRequestAttributes attributes;

  public static final String JSON_PROPERTY_RELATIONSHIPS = "relationships";
  private IncidentImportRelationships relationships;

  public static final String JSON_PROPERTY_TYPE = "type";
  private IncidentType type = IncidentType.INCIDENTS;

  public IncidentImportRequestData() {}

  @JsonCreator
  public IncidentImportRequestData(
      @JsonProperty(required = true, value = JSON_PROPERTY_ATTRIBUTES)
          IncidentImportRequestAttributes attributes,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) IncidentType type) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public IncidentImportRequestData attributes(IncidentImportRequestAttributes attributes) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    return this;
  }

  /**
   * The incident's attributes for an import request.
   *
   * @return attributes
   */
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public IncidentImportRequestAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(IncidentImportRequestAttributes attributes) {
    this.attributes = attributes;
  }

  public IncidentImportRequestData relationships(IncidentImportRelationships relationships) {
    this.relationships = relationships;
    this.unparsed |= relationships.unparsed;
    return this;
  }

  /**
   * The relationships for an incident import request.
   *
   * @return relationships
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RELATIONSHIPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public IncidentImportRelationships getRelationships() {
    return relationships;
  }

  public void setRelationships(IncidentImportRelationships relationships) {
    this.relationships = relationships;
  }

  public IncidentImportRequestData type(IncidentType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Incident resource type.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public IncidentType getType() {
    return type;
  }

  public void setType(IncidentType type) {
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
   * @return IncidentImportRequestData
   */
  @JsonAnySetter
  public IncidentImportRequestData putAdditionalProperty(String key, Object value) {
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

  /** Return true if this IncidentImportRequestData object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentImportRequestData incidentImportRequestData = (IncidentImportRequestData) o;
    return Objects.equals(this.attributes, incidentImportRequestData.attributes)
        && Objects.equals(this.relationships, incidentImportRequestData.relationships)
        && Objects.equals(this.type, incidentImportRequestData.type)
        && Objects.equals(
            this.additionalProperties, incidentImportRequestData.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, relationships, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentImportRequestData {\n");
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
