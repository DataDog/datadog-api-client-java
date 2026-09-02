/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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
   * <p>Create, edit, and disable users.</p>
 */
@JsonPropertyOrder({
  User.JSON_PROPERTY_ACCESS_ROLE,
  User.JSON_PROPERTY_DISABLED,
  User.JSON_PROPERTY_EMAIL,
  User.JSON_PROPERTY_HANDLE,
  User.JSON_PROPERTY_ICON,
  User.JSON_PROPERTY_NAME,
  User.JSON_PROPERTY_VERIFIED
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class User {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACCESS_ROLE = "access_role";
  private JsonNullable<AccessRole> accessRole = JsonNullable.<AccessRole>undefined();

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
    this.accessRole = JsonNullable.<AccessRole>of(accessRole);
    return this;
  }

  /**
   * <p>The access role of the user. Options are <strong>st</strong> (standard user), <strong>adm</strong> (admin user), or <strong>ro</strong> (read-only user).</p>
   * @return accessRole
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public AccessRole getAccessRole() {
        return accessRole.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_ACCESS_ROLE)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<AccessRole> getAccessRole_JsonNullable() {
    return accessRole;
  }
  @JsonProperty(JSON_PROPERTY_ACCESS_ROLE)public void setAccessRole_JsonNullable(JsonNullable<AccessRole> accessRole) {
    this.accessRole = accessRole;
  }
  public void setAccessRole(AccessRole accessRole) {
    if (!accessRole.isValid()) {
        this.unparsed = true;
    }
    this.accessRole = JsonNullable.<AccessRole>of(accessRole);
  }
  public User disabled(Boolean disabled) {
    this.disabled = disabled;
    return this;
  }

  /**
   * <p>The new disabled status of the user.</p>
   * @return disabled
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_DISABLED)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
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
   * <p>The new email of the user.</p>
   * @return email
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_EMAIL)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
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
   * <p>The user handle, must be a valid email.</p>
   * @return handle
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_HANDLE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getHandle() {
        return handle;
      }
  public void setHandle(String handle) {
    this.handle = handle;
  }

  /**
   * <p>Gravatar icon associated to the user.</p>
   * @return icon
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ICON)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getIcon() {
        return icon;
      }
  public User name(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>The name of the user.</p>
   * @return name
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_NAME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getName() {
        return name;
      }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * <p>Whether or not the user logged in Datadog at least once.</p>
   * @return verified
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_VERIFIED)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getVerified() {
        return verified;
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
   * @return User
   */
  @JsonAnySetter
  public User putAdditionalProperty(String key, Object value) {
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
   * Return true if this User object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return Objects.equals(this.accessRole, user.accessRole) && Objects.equals(this.disabled, user.disabled) && Objects.equals(this.email, user.email) && Objects.equals(this.handle, user.handle) && Objects.equals(this.icon, user.icon) && Objects.equals(this.name, user.name) && Objects.equals(this.verified, user.verified) && Objects.equals(this.additionalProperties, user.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(accessRole,disabled,email,handle,icon,name,verified, additionalProperties);
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
