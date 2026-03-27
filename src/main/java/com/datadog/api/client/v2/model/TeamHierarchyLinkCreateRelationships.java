/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.UUID;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.openapitools.jackson.nullable.JsonNullable;

import com.datadog.api.client.JsonTimeSerializer;


/**
   * <p>The related teams that will be connected by the team hierarchy link</p>
 */
@JsonPropertyOrder({
  TeamHierarchyLinkCreateRelationships.JSON_PROPERTY_PARENT_TEAM,
  TeamHierarchyLinkCreateRelationships.JSON_PROPERTY_SUB_TEAM
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TeamHierarchyLinkCreateRelationships {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_PARENT_TEAM = "parent_team";
  private TeamHierarchyLinkCreateTeamRelationship parentTeam;

  public static final String JSON_PROPERTY_SUB_TEAM = "sub_team";
  private TeamHierarchyLinkCreateTeamRelationship subTeam;

  public TeamHierarchyLinkCreateRelationships() {}

  @JsonCreator
  public TeamHierarchyLinkCreateRelationships(
            @JsonProperty(required=true, value=JSON_PROPERTY_PARENT_TEAM)TeamHierarchyLinkCreateTeamRelationship parentTeam,
            @JsonProperty(required=true, value=JSON_PROPERTY_SUB_TEAM)TeamHierarchyLinkCreateTeamRelationship subTeam) {
        this.parentTeam = parentTeam;
        this.unparsed |= parentTeam.unparsed;
        this.subTeam = subTeam;
        this.unparsed |= subTeam.unparsed;
  }
  public TeamHierarchyLinkCreateRelationships parentTeam(TeamHierarchyLinkCreateTeamRelationship parentTeam) {
    this.parentTeam = parentTeam;
    this.unparsed |= parentTeam.unparsed;
    return this;
  }

  /**
   * <p>Data about each team that will be connected by the team hierarchy link</p>
   * @return parentTeam
  **/
      @JsonProperty(JSON_PROPERTY_PARENT_TEAM)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public TeamHierarchyLinkCreateTeamRelationship getParentTeam() {
        return parentTeam;
      }
  public void setParentTeam(TeamHierarchyLinkCreateTeamRelationship parentTeam) {
    this.parentTeam = parentTeam;
  }
  public TeamHierarchyLinkCreateRelationships subTeam(TeamHierarchyLinkCreateTeamRelationship subTeam) {
    this.subTeam = subTeam;
    this.unparsed |= subTeam.unparsed;
    return this;
  }

  /**
   * <p>Data about each team that will be connected by the team hierarchy link</p>
   * @return subTeam
  **/
      @JsonProperty(JSON_PROPERTY_SUB_TEAM)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public TeamHierarchyLinkCreateTeamRelationship getSubTeam() {
        return subTeam;
      }
  public void setSubTeam(TeamHierarchyLinkCreateTeamRelationship subTeam) {
    this.subTeam = subTeam;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return TeamHierarchyLinkCreateRelationships
   */
  @JsonAnySetter
  public TeamHierarchyLinkCreateRelationships putAdditionalProperty(String key, Object value) {
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

  /**
   * Return true if this TeamHierarchyLinkCreateRelationships object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TeamHierarchyLinkCreateRelationships teamHierarchyLinkCreateRelationships = (TeamHierarchyLinkCreateRelationships) o;
    return Objects.equals(this.parentTeam, teamHierarchyLinkCreateRelationships.parentTeam) && Objects.equals(this.subTeam, teamHierarchyLinkCreateRelationships.subTeam) && Objects.equals(this.additionalProperties, teamHierarchyLinkCreateRelationships.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(parentTeam,subTeam, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeamHierarchyLinkCreateRelationships {\n");
    sb.append("    parentTeam: ").append(toIndentedString(parentTeam)).append("\n");
    sb.append("    subTeam: ").append(toIndentedString(subTeam)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append('}');
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
