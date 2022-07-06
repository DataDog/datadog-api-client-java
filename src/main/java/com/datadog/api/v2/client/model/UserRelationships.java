/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.v2.client.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** Relationships of the user object. */
@JsonPropertyOrder({UserRelationships.JSON_PROPERTY_ROLES})
@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class UserRelationships {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ROLES = "roles";
  private RelationshipToRoles roles;

  public UserRelationships roles(RelationshipToRoles roles) {
    this.roles = roles;
    this.unparsed |= roles.unparsed;
    return this;
  }

  /**
   * Relationship to roles.
   *
   * @return roles
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ROLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RelationshipToRoles getRoles() {
    return roles;
  }

  public void setRoles(RelationshipToRoles roles) {
    this.roles = roles;
  }

  /** Return true if this UserRelationships object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserRelationships userRelationships = (UserRelationships) o;
    return Objects.equals(this.roles, userRelationships.roles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(roles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserRelationships {\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
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
