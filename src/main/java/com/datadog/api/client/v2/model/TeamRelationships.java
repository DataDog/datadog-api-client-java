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
   * <p>Resources related to a team</p>
 */
@JsonPropertyOrder({
  TeamRelationships.JSON_PROPERTY_TEAM_LINKS,
  TeamRelationships.JSON_PROPERTY_USER_TEAM_PERMISSIONS
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TeamRelationships {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_TEAM_LINKS = "team_links";
  private RelationshipToTeamLinks teamLinks;

  public static final String JSON_PROPERTY_USER_TEAM_PERMISSIONS = "user_team_permissions";
  private RelationshipToUserTeamPermission userTeamPermissions;

  public TeamRelationships teamLinks(RelationshipToTeamLinks teamLinks) {
    this.teamLinks = teamLinks;
    this.unparsed |= teamLinks.unparsed;
    return this;
  }

  /**
   * <p>Relationship between a team and a team link</p>
   * @return teamLinks
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TEAM_LINKS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public RelationshipToTeamLinks getTeamLinks() {
        return teamLinks;
      }
  public void setTeamLinks(RelationshipToTeamLinks teamLinks) {
    this.teamLinks = teamLinks;
  }
  public TeamRelationships userTeamPermissions(RelationshipToUserTeamPermission userTeamPermissions) {
    this.userTeamPermissions = userTeamPermissions;
    this.unparsed |= userTeamPermissions.unparsed;
    return this;
  }

  /**
   * <p>Relationship between a user team permission and a team</p>
   * @return userTeamPermissions
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_USER_TEAM_PERMISSIONS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public RelationshipToUserTeamPermission getUserTeamPermissions() {
        return userTeamPermissions;
      }
  public void setUserTeamPermissions(RelationshipToUserTeamPermission userTeamPermissions) {
    this.userTeamPermissions = userTeamPermissions;
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
   * @return TeamRelationships
   */
  @JsonAnySetter
  public TeamRelationships putAdditionalProperty(String key, Object value) {
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
   * Return true if this TeamRelationships object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TeamRelationships teamRelationships = (TeamRelationships) o;
    return Objects.equals(this.teamLinks, teamRelationships.teamLinks) && Objects.equals(this.userTeamPermissions, teamRelationships.userTeamPermissions) && Objects.equals(this.additionalProperties, teamRelationships.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(teamLinks,userTeamPermissions, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeamRelationships {\n");
    sb.append("    teamLinks: ").append(toIndentedString(teamLinks)).append("\n");
    sb.append("    userTeamPermissions: ").append(toIndentedString(userTeamPermissions)).append("\n");
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
