/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** Resources related to a team */
@JsonPropertyOrder({
  TeamRelationships.JSON_PROPERTY_TEAM_LINKS,
  TeamRelationships.JSON_PROPERTY_USER_TEAM_PERMISSIONS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TeamRelationships {
  @JsonIgnore public boolean unparsed = false;
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
   * Relationship between a team and a team link
   *
   * @return teamLinks
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEAM_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RelationshipToTeamLinks getTeamLinks() {
    return teamLinks;
  }

  public void setTeamLinks(RelationshipToTeamLinks teamLinks) {
    this.teamLinks = teamLinks;
  }

  public TeamRelationships userTeamPermissions(
      RelationshipToUserTeamPermission userTeamPermissions) {
    this.userTeamPermissions = userTeamPermissions;
    this.unparsed |= userTeamPermissions.unparsed;
    return this;
  }

  /**
   * Relationship between a user team permission and a team
   *
   * @return userTeamPermissions
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USER_TEAM_PERMISSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RelationshipToUserTeamPermission getUserTeamPermissions() {
    return userTeamPermissions;
  }

  public void setUserTeamPermissions(RelationshipToUserTeamPermission userTeamPermissions) {
    this.userTeamPermissions = userTeamPermissions;
  }

  /** Return true if this TeamRelationships object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TeamRelationships teamRelationships = (TeamRelationships) o;
    return Objects.equals(this.teamLinks, teamRelationships.teamLinks)
        && Objects.equals(this.userTeamPermissions, teamRelationships.userTeamPermissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(teamLinks, userTeamPermissions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeamRelationships {\n");
    sb.append("    teamLinks: ").append(toIndentedString(teamLinks)).append("\n");
    sb.append("    userTeamPermissions: ")
        .append(toIndentedString(userTeamPermissions))
        .append("\n");
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
