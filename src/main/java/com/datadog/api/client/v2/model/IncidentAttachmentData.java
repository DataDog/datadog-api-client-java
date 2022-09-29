/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** A single incident attachment. */
@JsonPropertyOrder({
  IncidentAttachmentData.JSON_PROPERTY_ATTRIBUTES,
  IncidentAttachmentData.JSON_PROPERTY_ID,
  IncidentAttachmentData.JSON_PROPERTY_RELATIONSHIPS,
  IncidentAttachmentData.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IncidentAttachmentData {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private IncidentAttachmentAttributes attributes;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_RELATIONSHIPS = "relationships";
  private IncidentAttachmentRelationships relationships;

  public static final String JSON_PROPERTY_TYPE = "type";
  private IncidentAttachmentType type = IncidentAttachmentType.INCIDENT_ATTACHMENTS;

  public IncidentAttachmentData() {}

  @JsonCreator
  public IncidentAttachmentData(
      @JsonProperty(required = true, value = JSON_PROPERTY_ATTRIBUTES)
          IncidentAttachmentAttributes attributes,
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) String id,
      @JsonProperty(required = true, value = JSON_PROPERTY_RELATIONSHIPS)
          IncidentAttachmentRelationships relationships,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) IncidentAttachmentType type) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    this.id = id;
    this.relationships = relationships;
    this.unparsed |= relationships.unparsed;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public IncidentAttachmentData attributes(IncidentAttachmentAttributes attributes) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    return this;
  }

  /**
   * The attributes object for an attachment.
   *
   * @return attributes
   */
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public IncidentAttachmentAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(IncidentAttachmentAttributes attributes) {
    this.attributes = attributes;
  }

  public IncidentAttachmentData id(String id) {
    this.id = id;
    return this;
  }

  /**
   * A unique identifier that represents the incident attachment.
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

  public IncidentAttachmentData relationships(IncidentAttachmentRelationships relationships) {
    this.relationships = relationships;
    this.unparsed |= relationships.unparsed;
    return this;
  }

  /**
   * The incident attachment's relationships.
   *
   * @return relationships
   */
  @JsonProperty(JSON_PROPERTY_RELATIONSHIPS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public IncidentAttachmentRelationships getRelationships() {
    return relationships;
  }

  public void setRelationships(IncidentAttachmentRelationships relationships) {
    this.relationships = relationships;
  }

  public IncidentAttachmentData type(IncidentAttachmentType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * The incident attachment resource type.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public IncidentAttachmentType getType() {
    return type;
  }

  public void setType(IncidentAttachmentType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /** Return true if this IncidentAttachmentData object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentAttachmentData incidentAttachmentData = (IncidentAttachmentData) o;
    return Objects.equals(this.attributes, incidentAttachmentData.attributes)
        && Objects.equals(this.id, incidentAttachmentData.id)
        && Objects.equals(this.relationships, incidentAttachmentData.relationships)
        && Objects.equals(this.type, incidentAttachmentData.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, id, relationships, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentAttachmentData {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
