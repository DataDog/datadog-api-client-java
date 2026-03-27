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

/** Team hierarchy link relationships */
@JsonPropertyOrder({
  TeamHierarchyLinkRelationships.JSON_PROPERTY_PARENT_TEAM,
  TeamHierarchyLinkRelationships.JSON_PROPERTY_SUB_TEAM
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TeamHierarchyLinkRelationships {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_PARENT_TEAM = "parent_team";
  private TeamHierarchyLinkTeamRelationship parentTeam;

  public static final String JSON_PROPERTY_SUB_TEAM = "sub_team";
  private TeamHierarchyLinkTeamRelationship subTeam;

  public TeamHierarchyLinkRelationships() {}

  @JsonCreator
  public TeamHierarchyLinkRelationships(
      @JsonProperty(required = true, value = JSON_PROPERTY_PARENT_TEAM)
          TeamHierarchyLinkTeamRelationship parentTeam,
      @JsonProperty(required = true, value = JSON_PROPERTY_SUB_TEAM)
          TeamHierarchyLinkTeamRelationship subTeam) {
    this.parentTeam = parentTeam;
    this.unparsed |= parentTeam.unparsed;
    this.subTeam = subTeam;
    this.unparsed |= subTeam.unparsed;
  }

  public TeamHierarchyLinkRelationships parentTeam(TeamHierarchyLinkTeamRelationship parentTeam) {
    this.parentTeam = parentTeam;
    this.unparsed |= parentTeam.unparsed;
    return this;
  }

  /**
   * Team hierarchy link team relationship
   *
   * @return parentTeam
   */
  @JsonProperty(JSON_PROPERTY_PARENT_TEAM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public TeamHierarchyLinkTeamRelationship getParentTeam() {
    return parentTeam;
  }

  public void setParentTeam(TeamHierarchyLinkTeamRelationship parentTeam) {
    this.parentTeam = parentTeam;
  }

  public TeamHierarchyLinkRelationships subTeam(TeamHierarchyLinkTeamRelationship subTeam) {
    this.subTeam = subTeam;
    this.unparsed |= subTeam.unparsed;
    return this;
  }

  /**
   * Team hierarchy link team relationship
   *
   * @return subTeam
   */
  @JsonProperty(JSON_PROPERTY_SUB_TEAM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public TeamHierarchyLinkTeamRelationship getSubTeam() {
    return subTeam;
  }

  public void setSubTeam(TeamHierarchyLinkTeamRelationship subTeam) {
    this.subTeam = subTeam;
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
   * @return TeamHierarchyLinkRelationships
   */
  @JsonAnySetter
  public TeamHierarchyLinkRelationships putAdditionalProperty(String key, Object value) {
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

  /** Return true if this TeamHierarchyLinkRelationships object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TeamHierarchyLinkRelationships teamHierarchyLinkRelationships =
        (TeamHierarchyLinkRelationships) o;
    return Objects.equals(this.parentTeam, teamHierarchyLinkRelationships.parentTeam)
        && Objects.equals(this.subTeam, teamHierarchyLinkRelationships.subTeam)
        && Objects.equals(
            this.additionalProperties, teamHierarchyLinkRelationships.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parentTeam, subTeam, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeamHierarchyLinkRelationships {\n");
    sb.append("    parentTeam: ").append(toIndentedString(parentTeam)).append("\n");
    sb.append("    subTeam: ").append(toIndentedString(subTeam)).append("\n");
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
