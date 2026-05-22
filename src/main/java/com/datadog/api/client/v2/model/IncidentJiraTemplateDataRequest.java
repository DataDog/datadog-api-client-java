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

/** Incident Jira template data for a create or update request. */
@JsonPropertyOrder({
  IncidentJiraTemplateDataRequest.JSON_PROPERTY_ATTRIBUTES,
  IncidentJiraTemplateDataRequest.JSON_PROPERTY_RELATIONSHIPS,
  IncidentJiraTemplateDataRequest.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IncidentJiraTemplateDataRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private IncidentJiraTemplateDataAttributesRequest attributes;

  public static final String JSON_PROPERTY_RELATIONSHIPS = "relationships";
  private IncidentJiraTemplateRelationships relationships;

  public static final String JSON_PROPERTY_TYPE = "type";
  private IncidentJiraTemplateType type;

  public IncidentJiraTemplateDataRequest() {}

  @JsonCreator
  public IncidentJiraTemplateDataRequest(
      @JsonProperty(required = true, value = JSON_PROPERTY_ATTRIBUTES)
          IncidentJiraTemplateDataAttributesRequest attributes,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) IncidentJiraTemplateType type) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public IncidentJiraTemplateDataRequest attributes(
      IncidentJiraTemplateDataAttributesRequest attributes) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    return this;
  }

  /**
   * Attributes for creating or updating an incident Jira template.
   *
   * @return attributes
   */
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public IncidentJiraTemplateDataAttributesRequest getAttributes() {
    return attributes;
  }

  public void setAttributes(IncidentJiraTemplateDataAttributesRequest attributes) {
    this.attributes = attributes;
  }

  public IncidentJiraTemplateDataRequest relationships(
      IncidentJiraTemplateRelationships relationships) {
    this.relationships = relationships;
    this.unparsed |= relationships.unparsed;
    return this;
  }

  /**
   * Relationships for an incident Jira template.
   *
   * @return relationships
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RELATIONSHIPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public IncidentJiraTemplateRelationships getRelationships() {
    return relationships;
  }

  public void setRelationships(IncidentJiraTemplateRelationships relationships) {
    this.relationships = relationships;
  }

  public IncidentJiraTemplateDataRequest type(IncidentJiraTemplateType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Incident Jira template resource type.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public IncidentJiraTemplateType getType() {
    return type;
  }

  public void setType(IncidentJiraTemplateType type) {
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
   * @return IncidentJiraTemplateDataRequest
   */
  @JsonAnySetter
  public IncidentJiraTemplateDataRequest putAdditionalProperty(String key, Object value) {
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

  /** Return true if this IncidentJiraTemplateDataRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentJiraTemplateDataRequest incidentJiraTemplateDataRequest =
        (IncidentJiraTemplateDataRequest) o;
    return Objects.equals(this.attributes, incidentJiraTemplateDataRequest.attributes)
        && Objects.equals(this.relationships, incidentJiraTemplateDataRequest.relationships)
        && Objects.equals(this.type, incidentJiraTemplateDataRequest.type)
        && Objects.equals(
            this.additionalProperties, incidentJiraTemplateDataRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, relationships, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentJiraTemplateDataRequest {\n");
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
