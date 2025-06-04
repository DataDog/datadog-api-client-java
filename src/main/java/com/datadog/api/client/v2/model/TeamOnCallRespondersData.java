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

/** Defines the main on-call responder object for a team, including relationships and metadata. */
@JsonPropertyOrder({
  TeamOnCallRespondersData.JSON_PROPERTY_ID,
  TeamOnCallRespondersData.JSON_PROPERTY_RELATIONSHIPS,
  TeamOnCallRespondersData.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TeamOnCallRespondersData {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_RELATIONSHIPS = "relationships";
  private TeamOnCallRespondersDataRelationships relationships;

  public static final String JSON_PROPERTY_TYPE = "type";
  private TeamOnCallRespondersDataType type = TeamOnCallRespondersDataType.TEAM_ONCALL_RESPONDERS;

  public TeamOnCallRespondersData() {}

  @JsonCreator
  public TeamOnCallRespondersData(
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          TeamOnCallRespondersDataType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public TeamOnCallRespondersData id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of the on-call responder configuration.
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

  public TeamOnCallRespondersData relationships(
      TeamOnCallRespondersDataRelationships relationships) {
    this.relationships = relationships;
    this.unparsed |= relationships.unparsed;
    return this;
  }

  /**
   * Relationship objects linked to a team's on-call responder configuration, including escalations
   * and responders.
   *
   * @return relationships
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RELATIONSHIPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TeamOnCallRespondersDataRelationships getRelationships() {
    return relationships;
  }

  public void setRelationships(TeamOnCallRespondersDataRelationships relationships) {
    this.relationships = relationships;
  }

  public TeamOnCallRespondersData type(TeamOnCallRespondersDataType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Represents the resource type for a group of users assigned to handle on-call duties within a
   * team.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public TeamOnCallRespondersDataType getType() {
    return type;
  }

  public void setType(TeamOnCallRespondersDataType type) {
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
   * @return TeamOnCallRespondersData
   */
  @JsonAnySetter
  public TeamOnCallRespondersData putAdditionalProperty(String key, Object value) {
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

  /** Return true if this TeamOnCallRespondersData object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TeamOnCallRespondersData teamOnCallRespondersData = (TeamOnCallRespondersData) o;
    return Objects.equals(this.id, teamOnCallRespondersData.id)
        && Objects.equals(this.relationships, teamOnCallRespondersData.relationships)
        && Objects.equals(this.type, teamOnCallRespondersData.type)
        && Objects.equals(this.additionalProperties, teamOnCallRespondersData.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, relationships, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeamOnCallRespondersData {\n");
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
