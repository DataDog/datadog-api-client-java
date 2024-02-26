/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Project relationships */
@JsonPropertyOrder({
  ProjectRelationships.JSON_PROPERTY_MEMBER_TEAM,
  ProjectRelationships.JSON_PROPERTY_MEMBER_USER
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ProjectRelationships {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_MEMBER_TEAM = "member_team";
  private RelationshipToTeamLinks memberTeam;

  public static final String JSON_PROPERTY_MEMBER_USER = "member_user";
  private UsersRelationship memberUser;

  public ProjectRelationships memberTeam(RelationshipToTeamLinks memberTeam) {
    this.memberTeam = memberTeam;
    this.unparsed |= memberTeam.unparsed;
    return this;
  }

  /**
   * Relationship between a team and a team link
   *
   * @return memberTeam
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MEMBER_TEAM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RelationshipToTeamLinks getMemberTeam() {
    return memberTeam;
  }

  public void setMemberTeam(RelationshipToTeamLinks memberTeam) {
    this.memberTeam = memberTeam;
  }

  public ProjectRelationships memberUser(UsersRelationship memberUser) {
    this.memberUser = memberUser;
    this.unparsed |= memberUser.unparsed;
    return this;
  }

  /**
   * Relationship to users.
   *
   * @return memberUser
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MEMBER_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public UsersRelationship getMemberUser() {
    return memberUser;
  }

  public void setMemberUser(UsersRelationship memberUser) {
    this.memberUser = memberUser;
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
   * @return ProjectRelationships
   */
  @JsonAnySetter
  public ProjectRelationships putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ProjectRelationships object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectRelationships projectRelationships = (ProjectRelationships) o;
    return Objects.equals(this.memberTeam, projectRelationships.memberTeam)
        && Objects.equals(this.memberUser, projectRelationships.memberUser)
        && Objects.equals(this.additionalProperties, projectRelationships.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(memberTeam, memberUser, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectRelationships {\n");
    sb.append("    memberTeam: ").append(toIndentedString(memberTeam)).append("\n");
    sb.append("    memberUser: ").append(toIndentedString(memberUser)).append("\n");
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
