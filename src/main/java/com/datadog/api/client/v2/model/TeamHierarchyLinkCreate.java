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

/** Data provided when creating a team hierarchy link */
@JsonPropertyOrder({
  TeamHierarchyLinkCreate.JSON_PROPERTY_RELATIONSHIPS,
  TeamHierarchyLinkCreate.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TeamHierarchyLinkCreate {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_RELATIONSHIPS = "relationships";
  private TeamHierarchyLinkCreateRelationships relationships;

  public static final String JSON_PROPERTY_TYPE = "type";
  private TeamHierarchyLinkType type = TeamHierarchyLinkType.TEAM_HIERARCHY_LINKS;

  public TeamHierarchyLinkCreate() {}

  @JsonCreator
  public TeamHierarchyLinkCreate(
      @JsonProperty(required = true, value = JSON_PROPERTY_RELATIONSHIPS)
          TeamHierarchyLinkCreateRelationships relationships,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) TeamHierarchyLinkType type) {
    this.relationships = relationships;
    this.unparsed |= relationships.unparsed;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public TeamHierarchyLinkCreate relationships(TeamHierarchyLinkCreateRelationships relationships) {
    this.relationships = relationships;
    this.unparsed |= relationships.unparsed;
    return this;
  }

  /**
   * The related teams that will be connected by the team hierarchy link
   *
   * @return relationships
   */
  @JsonProperty(JSON_PROPERTY_RELATIONSHIPS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public TeamHierarchyLinkCreateRelationships getRelationships() {
    return relationships;
  }

  public void setRelationships(TeamHierarchyLinkCreateRelationships relationships) {
    this.relationships = relationships;
  }

  public TeamHierarchyLinkCreate type(TeamHierarchyLinkType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Team hierarchy link type
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public TeamHierarchyLinkType getType() {
    return type;
  }

  public void setType(TeamHierarchyLinkType type) {
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
   * @return TeamHierarchyLinkCreate
   */
  @JsonAnySetter
  public TeamHierarchyLinkCreate putAdditionalProperty(String key, Object value) {
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

  /** Return true if this TeamHierarchyLinkCreate object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TeamHierarchyLinkCreate teamHierarchyLinkCreate = (TeamHierarchyLinkCreate) o;
    return Objects.equals(this.relationships, teamHierarchyLinkCreate.relationships)
        && Objects.equals(this.type, teamHierarchyLinkCreate.type)
        && Objects.equals(this.additionalProperties, teamHierarchyLinkCreate.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(relationships, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeamHierarchyLinkCreate {\n");
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
