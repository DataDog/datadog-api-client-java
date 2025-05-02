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

/**
 * Represents the top-level data object for team routing rules, containing the ID, relationships,
 * and resource type.
 */
@JsonPropertyOrder({
  TeamRoutingRulesData.JSON_PROPERTY_ID,
  TeamRoutingRulesData.JSON_PROPERTY_RELATIONSHIPS,
  TeamRoutingRulesData.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TeamRoutingRulesData {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_RELATIONSHIPS = "relationships";
  private TeamRoutingRulesDataRelationships relationships;

  public static final String JSON_PROPERTY_TYPE = "type";
  private TeamRoutingRulesDataType type = TeamRoutingRulesDataType.TEAM_ROUTING_RULES;

  public TeamRoutingRulesData() {}

  @JsonCreator
  public TeamRoutingRulesData(
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) TeamRoutingRulesDataType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public TeamRoutingRulesData id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Specifies the unique identifier of this team routing rules record.
   *
   * @return id
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public TeamRoutingRulesData relationships(TeamRoutingRulesDataRelationships relationships) {
    this.relationships = relationships;
    this.unparsed |= relationships.unparsed;
    return this;
  }

  /**
   * Specifies relationships for team routing rules, including rule references.
   *
   * @return relationships
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RELATIONSHIPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TeamRoutingRulesDataRelationships getRelationships() {
    return relationships;
  }

  public void setRelationships(TeamRoutingRulesDataRelationships relationships) {
    this.relationships = relationships;
  }

  public TeamRoutingRulesData type(TeamRoutingRulesDataType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Team routing rules resource type.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public TeamRoutingRulesDataType getType() {
    return type;
  }

  public void setType(TeamRoutingRulesDataType type) {
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
   * @return TeamRoutingRulesData
   */
  @JsonAnySetter
  public TeamRoutingRulesData putAdditionalProperty(String key, Object value) {
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

  /** Return true if this TeamRoutingRulesData object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TeamRoutingRulesData teamRoutingRulesData = (TeamRoutingRulesData) o;
    return Objects.equals(this.id, teamRoutingRulesData.id)
        && Objects.equals(this.relationships, teamRoutingRulesData.relationships)
        && Objects.equals(this.type, teamRoutingRulesData.type)
        && Objects.equals(this.additionalProperties, teamRoutingRulesData.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, relationships, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeamRoutingRulesData {\n");
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
