/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** Create, edit, and disable users. */
@JsonPropertyOrder({
  User.JSON_PROPERTY_ACCESS_ROLE,
  User.JSON_PROPERTY_DISABLED,
  User.JSON_PROPERTY_EMAIL,
  User.JSON_PROPERTY_HANDLE,
  User.JSON_PROPERTY_ICON,
  User.JSON_PROPERTY_NAME,
  User.JSON_PROPERTY_VERIFIED
})
@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class User {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACCESS_ROLE = "access_role";
  private AccessRole accessRole = AccessRole.STANDARD;

  public static final String JSON_PROPERTY_DISABLED = "disabled";
  private Boolean disabled;

  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;

  public static final String JSON_PROPERTY_HANDLE = "handle";
  private String handle;

  public static final String JSON_PROPERTY_ICON = "icon";
  private String icon;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_VERIFIED = "verified";
  private Boolean verified;

  public User accessRole(AccessRole accessRole) {
    this.accessRole = accessRole;
    this.unparsed |= !accessRole.isValid();
    return this;
  }

  /**
   * The access role of the user. Options are <strong>st</strong> (standard user),
   * <strong>adm</strong> (admin user), or <strong>ro</strong> (read-only user).
   *
   * @return accessRole
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCESS_ROLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AccessRole getAccessRole() {
    return accessRole;
  }

  public void setAccessRole(AccessRole accessRole) {
    if (!accessRole.isValid()) {
      this.unparsed = true;
    }
    this.accessRole = accessRole;
  }

  public User disabled(Boolean disabled) {
    this.disabled = disabled;
    return this;
  }

  /**
   * The new disabled status of the user.
   *
   * @return disabled
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getDisabled() {
    return disabled;
  }

  public void setDisabled(Boolean disabled) {
    this.disabled = disabled;
  }

  public User email(String email) {
    this.email = email;
    return this;
  }

  /**
   * The new email of the user.
   *
   * @return email
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public User handle(String handle) {
    this.handle = handle;
    return this;
  }

  /**
   * The user handle, must be a valid email.
   *
   * @return handle
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HANDLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getHandle() {
    return handle;
  }

  public void setHandle(String handle) {
    this.handle = handle;
  }

  /**
   * Gravatar icon associated to the user.
   *
   * @return icon
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ICON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getIcon() {
    return icon;
  }

  public User name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the user.
   *
   * @return name
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * Whether or not the user logged in Datadog at least once.
   *
   * @return verified
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERIFIED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getVerified() {
    return verified;
  }

  /** Return true if this User object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return Objects.equals(this.accessRole, user.accessRole)
        && Objects.equals(this.disabled, user.disabled)
        && Objects.equals(this.email, user.email)
        && Objects.equals(this.handle, user.handle)
        && Objects.equals(this.icon, user.icon)
        && Objects.equals(this.name, user.name)
        && Objects.equals(this.verified, user.verified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessRole, disabled, email, handle, icon, name, verified);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    sb.append("    accessRole: ").append(toIndentedString(accessRole)).append("\n");
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    handle: ").append(toIndentedString(handle)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    verified: ").append(toIndentedString(verified)).append("\n");
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
