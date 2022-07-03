/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.v2.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** Incident data for a create request. */
@JsonPropertyOrder({
  IncidentCreateData.JSON_PROPERTY_ATTRIBUTES,
  IncidentCreateData.JSON_PROPERTY_RELATIONSHIPS,
  IncidentCreateData.JSON_PROPERTY_TYPE
})
@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IncidentCreateData {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private IncidentCreateAttributes attributes;

  public static final String JSON_PROPERTY_RELATIONSHIPS = "relationships";
  private IncidentCreateRelationships relationships;

  public static final String JSON_PROPERTY_TYPE = "type";
  private IncidentType type = IncidentType.INCIDENTS;

  public IncidentCreateData() {}

  @JsonCreator
  public IncidentCreateData(
      @JsonProperty(required = true, value = JSON_PROPERTY_ATTRIBUTES)
          IncidentCreateAttributes attributes,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) IncidentType type) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public IncidentCreateData attributes(IncidentCreateAttributes attributes) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    return this;
  }

  /**
   * The incident's attributes for a create request.
   *
   * @return attributes
   */
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public IncidentCreateAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(IncidentCreateAttributes attributes) {
    this.attributes = attributes;
  }

  public IncidentCreateData relationships(IncidentCreateRelationships relationships) {
    this.relationships = relationships;
    this.unparsed |= relationships.unparsed;
    return this;
  }

  /**
   * The relationships the incident will have with other resources once created.
   *
   * @return relationships
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RELATIONSHIPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public IncidentCreateRelationships getRelationships() {
    return relationships;
  }

  public void setRelationships(IncidentCreateRelationships relationships) {
    this.relationships = relationships;
  }

  public IncidentCreateData type(IncidentType type) {
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

  /** Return true if this IncidentCreateData object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentCreateData incidentCreateData = (IncidentCreateData) o;
    return Objects.equals(this.attributes, incidentCreateData.attributes)
        && Objects.equals(this.relationships, incidentCreateData.relationships)
        && Objects.equals(this.type, incidentCreateData.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, relationships, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentCreateData {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    relationships: ").append(toIndentedString(relationships)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("}");
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
