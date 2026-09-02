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
import java.util.UUID;

/** Timestamp override data in a response. */
@JsonPropertyOrder({
  IncidentTimestampOverrideDataResponse.JSON_PROPERTY_ATTRIBUTES,
  IncidentTimestampOverrideDataResponse.JSON_PROPERTY_ID,
  IncidentTimestampOverrideDataResponse.JSON_PROPERTY_RELATIONSHIPS,
  IncidentTimestampOverrideDataResponse.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IncidentTimestampOverrideDataResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private IncidentTimestampOverrideDataAttributesResponse attributes;

  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_RELATIONSHIPS = "relationships";
  private IncidentTimestampOverrideRelationships relationships;

  public static final String JSON_PROPERTY_TYPE = "type";
  private IncidentTimestampOverrideType type;

  public IncidentTimestampOverrideDataResponse() {}

  @JsonCreator
  public IncidentTimestampOverrideDataResponse(
      @JsonProperty(required = true, value = JSON_PROPERTY_ATTRIBUTES)
          IncidentTimestampOverrideDataAttributesResponse attributes,
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) UUID id,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          IncidentTimestampOverrideType type) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    this.id = id;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public IncidentTimestampOverrideDataResponse attributes(
      IncidentTimestampOverrideDataAttributesResponse attributes) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    return this;
  }

  /**
   * Attributes of a timestamp override in a response.
   *
   * @return attributes
   */
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public IncidentTimestampOverrideDataAttributesResponse getAttributes() {
    return attributes;
  }

  public void setAttributes(IncidentTimestampOverrideDataAttributesResponse attributes) {
    this.attributes = attributes;
    if (attributes != null) {
      this.unparsed |= attributes.unparsed;
    }
  }

  public IncidentTimestampOverrideDataResponse id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * The timestamp override identifier.
   *
   * @return id
   */
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public IncidentTimestampOverrideDataResponse relationships(
      IncidentTimestampOverrideRelationships relationships) {
    this.relationships = relationships;
    this.unparsed |= relationships.unparsed;
    return this;
  }

  /**
   * Relationships for a timestamp override.
   *
   * @return relationships
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RELATIONSHIPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public IncidentTimestampOverrideRelationships getRelationships() {
    return relationships;
  }

  public void setRelationships(IncidentTimestampOverrideRelationships relationships) {
    this.relationships = relationships;
    if (relationships != null) {
      this.unparsed |= relationships.unparsed;
    }
  }

  public IncidentTimestampOverrideDataResponse type(IncidentTimestampOverrideType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Incident timestamp override resource type.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public IncidentTimestampOverrideType getType() {
    return type;
  }

  public void setType(IncidentTimestampOverrideType type) {
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
   * @return IncidentTimestampOverrideDataResponse
   */
  @JsonAnySetter
  public IncidentTimestampOverrideDataResponse putAdditionalProperty(String key, Object value) {
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

  /** Return true if this IncidentTimestampOverrideDataResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentTimestampOverrideDataResponse incidentTimestampOverrideDataResponse =
        (IncidentTimestampOverrideDataResponse) o;
    return Objects.equals(this.attributes, incidentTimestampOverrideDataResponse.attributes)
        && Objects.equals(this.id, incidentTimestampOverrideDataResponse.id)
        && Objects.equals(this.relationships, incidentTimestampOverrideDataResponse.relationships)
        && Objects.equals(this.type, incidentTimestampOverrideDataResponse.type)
        && Objects.equals(
            this.additionalProperties, incidentTimestampOverrideDataResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, id, relationships, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentTimestampOverrideDataResponse {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
