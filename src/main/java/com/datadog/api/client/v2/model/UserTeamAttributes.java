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
import org.openapitools.jackson.nullable.JsonNullable;

/** Team membership attributes */
@JsonPropertyOrder({UserTeamAttributes.JSON_PROPERTY_ROLE})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class UserTeamAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ROLE = "role";
  private JsonNullable<UserTeamRole> role = JsonNullable.<UserTeamRole>undefined();

  public UserTeamAttributes role(UserTeamRole role) {
    this.role = JsonNullable.<UserTeamRole>of(role);
    return this;
  }

  /**
   * The user's role within the team
   *
   * @return role
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public UserTeamRole getRole() {
    return role.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ROLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<UserTeamRole> getRole_JsonNullable() {
    return role;
  }

  @JsonProperty(JSON_PROPERTY_ROLE)
  public void setRole_JsonNullable(JsonNullable<UserTeamRole> role) {
    this.role = role;
  }

  public void setRole(UserTeamRole role) {
    if (!role.isValid()) {
      this.unparsed = true;
    }
    this.role = JsonNullable.<UserTeamRole>of(role);
  }

  /** Return true if this UserTeamAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserTeamAttributes userTeamAttributes = (UserTeamAttributes) o;
    return Objects.equals(this.role, userTeamAttributes.role);
  }

  @Override
  public int hashCode() {
    return Objects.hash(role);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserTeamAttributes {\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
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
