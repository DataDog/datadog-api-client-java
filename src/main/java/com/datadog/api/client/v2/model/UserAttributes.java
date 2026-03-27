/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

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
   * <p>Attributes of user object returned by the API.</p>
 */
@JsonPropertyOrder({
  UserAttributes.JSON_PROPERTY_CREATED_AT,
  UserAttributes.JSON_PROPERTY_DISABLED,
  UserAttributes.JSON_PROPERTY_EMAIL,
  UserAttributes.JSON_PROPERTY_HANDLE,
  UserAttributes.JSON_PROPERTY_ICON,
  UserAttributes.JSON_PROPERTY_LAST_LOGIN_TIME,
  UserAttributes.JSON_PROPERTY_MFA_ENABLED,
  UserAttributes.JSON_PROPERTY_MODIFIED_AT,
  UserAttributes.JSON_PROPERTY_NAME,
  UserAttributes.JSON_PROPERTY_SERVICE_ACCOUNT,
  UserAttributes.JSON_PROPERTY_STATUS,
  UserAttributes.JSON_PROPERTY_TITLE,
  UserAttributes.JSON_PROPERTY_VERIFIED
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class UserAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_DISABLED = "disabled";
  private Boolean disabled;

  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;

  public static final String JSON_PROPERTY_HANDLE = "handle";
  private String handle;

  public static final String JSON_PROPERTY_ICON = "icon";
  private String icon;

  public static final String JSON_PROPERTY_LAST_LOGIN_TIME = "last_login_time";
  private JsonNullable<OffsetDateTime> lastLoginTime = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_MFA_ENABLED = "mfa_enabled";
  private Boolean mfaEnabled;

  public static final String JSON_PROPERTY_MODIFIED_AT = "modified_at";
  private OffsetDateTime modifiedAt;

  public static final String JSON_PROPERTY_NAME = "name";
  private JsonNullable<String> name = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SERVICE_ACCOUNT = "service_account";
  private Boolean serviceAccount;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public static final String JSON_PROPERTY_TITLE = "title";
  private JsonNullable<String> title = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_VERIFIED = "verified";
  private Boolean verified;

  public UserAttributes createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * <p>Creation time of the user.</p>
   * @return createdAt
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CREATED_AT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public OffsetDateTime getCreatedAt() {
        return createdAt;
      }
  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }
  public UserAttributes disabled(Boolean disabled) {
    this.disabled = disabled;
    return this;
  }

  /**
   * <p>Whether the user is disabled.</p>
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
  public UserAttributes email(String email) {
    this.email = email;
    return this;
  }

  /**
   * <p>Email of the user.</p>
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
  public UserAttributes handle(String handle) {
    this.handle = handle;
    return this;
  }

  /**
   * <p>Handle of the user.</p>
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
  public UserAttributes icon(String icon) {
    this.icon = icon;
    return this;
  }

  /**
   * <p>URL of the user's icon.</p>
   * @return icon
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ICON)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getIcon() {
        return icon;
      }
  public void setIcon(String icon) {
    this.icon = icon;
  }

  /**
   * <p>The last time the user logged in.</p>
   * @return lastLoginTime
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public OffsetDateTime getLastLoginTime() {

        if (lastLoginTime == null) {
          lastLoginTime = JsonNullable.<OffsetDateTime>undefined();
        }
        return lastLoginTime.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_LAST_LOGIN_TIME)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<OffsetDateTime> getLastLoginTime_JsonNullable() {
    return lastLoginTime;
  }
  @JsonProperty(JSON_PROPERTY_LAST_LOGIN_TIME)private void setLastLoginTime_JsonNullable(JsonNullable<OffsetDateTime> lastLoginTime) {
    this.lastLoginTime = lastLoginTime;
  }

  /**
   * <p>If user has MFA enabled.</p>
   * @return mfaEnabled
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_MFA_ENABLED)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getMfaEnabled() {
        return mfaEnabled;
      }
  public UserAttributes modifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
    return this;
  }

  /**
   * <p>Time that the user was last modified.</p>
   * @return modifiedAt
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_MODIFIED_AT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public OffsetDateTime getModifiedAt() {
        return modifiedAt;
      }
  public void setModifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
  }
  public UserAttributes name(String name) {
    this.name = JsonNullable.<String>of(name);
    return this;
  }

  /**
   * <p>Name of the user.</p>
   * @return name
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public String getName() {
        return name.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getName_JsonNullable() {
    return name;
  }
  @JsonProperty(JSON_PROPERTY_NAME)public void setName_JsonNullable(JsonNullable<String> name) {
    this.name = name;
  }
  public void setName(String name) {
    this.name = JsonNullable.<String>of(name);
  }
  public UserAttributes serviceAccount(Boolean serviceAccount) {
    this.serviceAccount = serviceAccount;
    return this;
  }

  /**
   * <p>Whether the user is a service account.</p>
   * @return serviceAccount
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SERVICE_ACCOUNT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getServiceAccount() {
        return serviceAccount;
      }
  public void setServiceAccount(Boolean serviceAccount) {
    this.serviceAccount = serviceAccount;
  }
  public UserAttributes status(String status) {
    this.status = status;
    return this;
  }

  /**
   * <p>Status of the user.</p>
   * @return status
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_STATUS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getStatus() {
        return status;
      }
  public void setStatus(String status) {
    this.status = status;
  }
  public UserAttributes title(String title) {
    this.title = JsonNullable.<String>of(title);
    return this;
  }

  /**
   * <p>Title of the user.</p>
   * @return title
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public String getTitle() {
        return title.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getTitle_JsonNullable() {
    return title;
  }
  @JsonProperty(JSON_PROPERTY_TITLE)public void setTitle_JsonNullable(JsonNullable<String> title) {
    this.title = title;
  }
  public void setTitle(String title) {
    this.title = JsonNullable.<String>of(title);
  }
  public UserAttributes verified(Boolean verified) {
    this.verified = verified;
    return this;
  }

  /**
   * <p>Whether the user is verified.</p>
   * @return verified
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_VERIFIED)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getVerified() {
        return verified;
      }
  public void setVerified(Boolean verified) {
    this.verified = verified;
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
   * @return UserAttributes
   */
  @JsonAnySetter
  public UserAttributes putAdditionalProperty(String key, Object value) {
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
   * Return true if this UserAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserAttributes userAttributes = (UserAttributes) o;
    return Objects.equals(this.createdAt, userAttributes.createdAt) && Objects.equals(this.disabled, userAttributes.disabled) && Objects.equals(this.email, userAttributes.email) && Objects.equals(this.handle, userAttributes.handle) && Objects.equals(this.icon, userAttributes.icon) && Objects.equals(this.lastLoginTime, userAttributes.lastLoginTime) && Objects.equals(this.mfaEnabled, userAttributes.mfaEnabled) && Objects.equals(this.modifiedAt, userAttributes.modifiedAt) && Objects.equals(this.name, userAttributes.name) && Objects.equals(this.serviceAccount, userAttributes.serviceAccount) && Objects.equals(this.status, userAttributes.status) && Objects.equals(this.title, userAttributes.title) && Objects.equals(this.verified, userAttributes.verified) && Objects.equals(this.additionalProperties, userAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(createdAt,disabled,email,handle,icon,lastLoginTime,mfaEnabled,modifiedAt,name,serviceAccount,status,title,verified, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserAttributes {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    handle: ").append(toIndentedString(handle)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    lastLoginTime: ").append(toIndentedString(lastLoginTime)).append("\n");
    sb.append("    mfaEnabled: ").append(toIndentedString(mfaEnabled)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    serviceAccount: ").append(toIndentedString(serviceAccount)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
