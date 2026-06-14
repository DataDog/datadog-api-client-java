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

/** The JSON:API data object representing a report schedule in a list response. */
@JsonPropertyOrder({
  ReportScheduleListResponseData.JSON_PROPERTY_ATTRIBUTES,
  ReportScheduleListResponseData.JSON_PROPERTY_ID,
  ReportScheduleListResponseData.JSON_PROPERTY_RELATIONSHIPS,
  ReportScheduleListResponseData.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ReportScheduleListResponseData {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private ReportScheduleListResponseAttributes attributes;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_RELATIONSHIPS = "relationships";
  private ReportScheduleListResponseRelationships relationships;

  public static final String JSON_PROPERTY_TYPE = "type";
  private ReportScheduleType type;

  public ReportScheduleListResponseData() {}

  @JsonCreator
  public ReportScheduleListResponseData(
      @JsonProperty(required = true, value = JSON_PROPERTY_ATTRIBUTES)
          ReportScheduleListResponseAttributes attributes,
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) String id,
      @JsonProperty(required = true, value = JSON_PROPERTY_RELATIONSHIPS)
          ReportScheduleListResponseRelationships relationships,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) ReportScheduleType type) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    this.id = id;
    this.relationships = relationships;
    this.unparsed |= relationships.unparsed;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public ReportScheduleListResponseData attributes(
      ReportScheduleListResponseAttributes attributes) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    return this;
  }

  /**
   * The configuration and derived state of a report schedule in a list response.
   *
   * @return attributes
   */
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ReportScheduleListResponseAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(ReportScheduleListResponseAttributes attributes) {
    this.attributes = attributes;
  }

  public ReportScheduleListResponseData id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The unique identifier of the report schedule.
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

  public ReportScheduleListResponseData relationships(
      ReportScheduleListResponseRelationships relationships) {
    this.relationships = relationships;
    this.unparsed |= relationships.unparsed;
    return this;
  }

  /**
   * Relationships for a report schedule in a list response.
   *
   * @return relationships
   */
  @JsonProperty(JSON_PROPERTY_RELATIONSHIPS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ReportScheduleListResponseRelationships getRelationships() {
    return relationships;
  }

  public void setRelationships(ReportScheduleListResponseRelationships relationships) {
    this.relationships = relationships;
  }

  public ReportScheduleListResponseData type(ReportScheduleType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * JSON:API resource type for report schedules.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ReportScheduleType getType() {
    return type;
  }

  public void setType(ReportScheduleType type) {
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
   * @return ReportScheduleListResponseData
   */
  @JsonAnySetter
  public ReportScheduleListResponseData putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ReportScheduleListResponseData object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportScheduleListResponseData reportScheduleListResponseData =
        (ReportScheduleListResponseData) o;
    return Objects.equals(this.attributes, reportScheduleListResponseData.attributes)
        && Objects.equals(this.id, reportScheduleListResponseData.id)
        && Objects.equals(this.relationships, reportScheduleListResponseData.relationships)
        && Objects.equals(this.type, reportScheduleListResponseData.type)
        && Objects.equals(
            this.additionalProperties, reportScheduleListResponseData.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, id, relationships, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportScheduleListResponseData {\n");
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
