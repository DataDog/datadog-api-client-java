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

/** Relationships of the role object. */
@JsonPropertyOrder({
  RoleRelationships.JSON_PROPERTY_PERMISSIONS,
  RoleRelationships.JSON_PROPERTY_USERS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RoleRelationships {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_PERMISSIONS = "permissions";
  private RelationshipToPermissions permissions;

  public static final String JSON_PROPERTY_USERS = "users";
  private RelationshipToUsers users;

  public RoleRelationships permissions(RelationshipToPermissions permissions) {
    this.permissions = permissions;
    this.unparsed |= permissions.unparsed;
    return this;
  }

  /**
   * Relationship to multiple permissions objects.
   *
   * @return permissions
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PERMISSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RelationshipToPermissions getPermissions() {
    return permissions;
  }

  public void setPermissions(RelationshipToPermissions permissions) {
    this.permissions = permissions;
  }

  public RoleRelationships users(RelationshipToUsers users) {
    this.users = users;
    this.unparsed |= users.unparsed;
    return this;
  }

  /**
   * Relationship to users.
   *
   * @return users
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RelationshipToUsers getUsers() {
    return users;
  }

  public void setUsers(RelationshipToUsers users) {
    this.users = users;
  }

  /** Return true if this RoleRelationships object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoleRelationships roleRelationships = (RoleRelationships) o;
    return Objects.equals(this.permissions, roleRelationships.permissions)
        && Objects.equals(this.users, roleRelationships.users);
  }

  @Override
  public int hashCode() {
    return Objects.hash(permissions, users);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoleRelationships {\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
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
