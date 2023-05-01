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

/** User team permission attributes */
@JsonPropertyOrder({UserTeamPermissionAttributes.JSON_PROPERTY_PERMISSIONS})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class UserTeamPermissionAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_PERMISSIONS = "permissions";
  private Object permissions;

  /**
   * Object of team permission actions and boolean values indicating of the currently logged in user
   * can perform them on this team
   *
   * @return permissions
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PERMISSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Object getPermissions() {
    return permissions;
  }

  /** Return true if this UserTeamPermissionAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserTeamPermissionAttributes userTeamPermissionAttributes = (UserTeamPermissionAttributes) o;
    return Objects.equals(this.permissions, userTeamPermissionAttributes.permissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(permissions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserTeamPermissionAttributes {\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
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
