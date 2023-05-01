/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** A user's permissions for a given team */
@JsonPropertyOrder({
  UserTeamPermission.JSON_PROPERTY_ATTRIBUTES,
  UserTeamPermission.JSON_PROPERTY_ID,
  UserTeamPermission.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class UserTeamPermission {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private UserTeamPermissionAttributes attributes;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_TYPE = "type";
  private UserTeamPermissionType type = UserTeamPermissionType.USER_TEAM_PERMISSIONS;

  public UserTeamPermission() {}

  @JsonCreator
  public UserTeamPermission(
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) String id,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) UserTeamPermissionType type) {
    this.id = id;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public UserTeamPermission attributes(UserTeamPermissionAttributes attributes) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    return this;
  }

  /**
   * User team permission attributes
   *
   * @return attributes
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public UserTeamPermissionAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(UserTeamPermissionAttributes attributes) {
    this.attributes = attributes;
  }

  public UserTeamPermission id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The user team permission's identifier
   *
   * @return id
   */
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public UserTeamPermission type(UserTeamPermissionType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * User team permission type
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public UserTeamPermissionType getType() {
    return type;
  }

  public void setType(UserTeamPermissionType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /** Return true if this UserTeamPermission object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserTeamPermission userTeamPermission = (UserTeamPermission) o;
    return Objects.equals(this.attributes, userTeamPermission.attributes)
        && Objects.equals(this.id, userTeamPermission.id)
        && Objects.equals(this.type, userTeamPermission.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, id, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserTeamPermission {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
