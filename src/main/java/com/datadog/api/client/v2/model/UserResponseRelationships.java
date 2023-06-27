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

/** Relationships of the user object returned by the API. */
@JsonPropertyOrder({
  UserResponseRelationships.JSON_PROPERTY_ORG,
  UserResponseRelationships.JSON_PROPERTY_OTHER_ORGS,
  UserResponseRelationships.JSON_PROPERTY_OTHER_USERS,
  UserResponseRelationships.JSON_PROPERTY_ROLES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class UserResponseRelationships {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ORG = "org";
  private RelationshipToOrganization org;

  public static final String JSON_PROPERTY_OTHER_ORGS = "other_orgs";
  private RelationshipToOrganizations otherOrgs;

  public static final String JSON_PROPERTY_OTHER_USERS = "other_users";
  private RelationshipToUsers otherUsers;

  public static final String JSON_PROPERTY_ROLES = "roles";
  private RelationshipToRoles roles;

  public UserResponseRelationships org(RelationshipToOrganization org) {
    this.org = org;
    this.unparsed |= org.unparsed;
    return this;
  }

  /**
   * Relationship to an organization.
   *
   * @return org
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ORG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RelationshipToOrganization getOrg() {
    return org;
  }

  public void setOrg(RelationshipToOrganization org) {
    this.org = org;
  }

  public UserResponseRelationships otherOrgs(RelationshipToOrganizations otherOrgs) {
    this.otherOrgs = otherOrgs;
    this.unparsed |= otherOrgs.unparsed;
    return this;
  }

  /**
   * Relationship to organizations.
   *
   * @return otherOrgs
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OTHER_ORGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RelationshipToOrganizations getOtherOrgs() {
    return otherOrgs;
  }

  public void setOtherOrgs(RelationshipToOrganizations otherOrgs) {
    this.otherOrgs = otherOrgs;
  }

  public UserResponseRelationships otherUsers(RelationshipToUsers otherUsers) {
    this.otherUsers = otherUsers;
    this.unparsed |= otherUsers.unparsed;
    return this;
  }

  /**
   * Relationship to users.
   *
   * @return otherUsers
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OTHER_USERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RelationshipToUsers getOtherUsers() {
    return otherUsers;
  }

  public void setOtherUsers(RelationshipToUsers otherUsers) {
    this.otherUsers = otherUsers;
  }

  public UserResponseRelationships roles(RelationshipToRoles roles) {
    this.roles = roles;
    this.unparsed |= roles.unparsed;
    return this;
  }

  /**
   * Relationship to roles.
   *
   * @return roles
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ROLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RelationshipToRoles getRoles() {
    return roles;
  }

  public void setRoles(RelationshipToRoles roles) {
    this.roles = roles;
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
   * @return UserResponseRelationships
   */
  @JsonAnySetter
  public UserResponseRelationships putAdditionalProperty(String key, Object value) {
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

  /** Return true if this UserResponseRelationships object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserResponseRelationships userResponseRelationships = (UserResponseRelationships) o;
    return Objects.equals(this.org, userResponseRelationships.org)
        && Objects.equals(this.otherOrgs, userResponseRelationships.otherOrgs)
        && Objects.equals(this.otherUsers, userResponseRelationships.otherUsers)
        && Objects.equals(this.roles, userResponseRelationships.roles)
        && Objects.equals(
            this.additionalProperties, userResponseRelationships.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(org, otherOrgs, otherUsers, roles, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserResponseRelationships {\n");
    sb.append("    org: ").append(toIndentedString(org)).append("\n");
    sb.append("    otherOrgs: ").append(toIndentedString(otherOrgs)).append("\n");
    sb.append("    otherUsers: ").append(toIndentedString(otherUsers)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
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
