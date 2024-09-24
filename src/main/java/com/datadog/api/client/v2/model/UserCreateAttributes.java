/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Attributes of the created user. */
@JsonPropertyOrder({
  UserCreateAttributes.JSON_PROPERTY_CREATED_AT,
  UserCreateAttributes.JSON_PROPERTY_DISABLED,
  UserCreateAttributes.JSON_PROPERTY_EMAIL,
  UserCreateAttributes.JSON_PROPERTY_HANDLE,
  UserCreateAttributes.JSON_PROPERTY_MODIFIED_AT,
  UserCreateAttributes.JSON_PROPERTY_NAME,
  UserCreateAttributes.JSON_PROPERTY_SERVICE_ACCOUNT,
  UserCreateAttributes.JSON_PROPERTY_TITLE,
  UserCreateAttributes.JSON_PROPERTY_VERIFIED
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class UserCreateAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_DISABLED = "disabled";
  private Boolean disabled;

  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;

  public static final String JSON_PROPERTY_HANDLE = "handle";
  private String handle;

  public static final String JSON_PROPERTY_MODIFIED_AT = "modified_at";
  private OffsetDateTime modifiedAt;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SERVICE_ACCOUNT = "service_account";
  private Boolean serviceAccount;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_VERIFIED = "verified";
  private Boolean verified;

  public UserCreateAttributes() {}

  @JsonCreator
  public UserCreateAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_EMAIL) String email) {
    this.email = email;
  }

  public UserCreateAttributes createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The <code>UserCreateAttributes</code> <code>created_at</code>.
   *
   * @return createdAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public UserCreateAttributes disabled(Boolean disabled) {
    this.disabled = disabled;
    return this;
  }

  /**
   * The <code>UserCreateAttributes</code> <code>disabled</code>.
   *
   * @return disabled
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getDisabled() {
    return disabled;
  }

  public void setDisabled(Boolean disabled) {
    this.disabled = disabled;
  }

  public UserCreateAttributes email(String email) {
    this.email = email;
    return this;
  }

  /**
   * The email of the user.
   *
   * @return email
   */
  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public UserCreateAttributes handle(String handle) {
    this.handle = handle;
    return this;
  }

  /**
   * The <code>UserCreateAttributes</code> <code>handle</code>.
   *
   * @return handle
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HANDLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getHandle() {
    return handle;
  }

  public void setHandle(String handle) {
    this.handle = handle;
  }

  public UserCreateAttributes modifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
    return this;
  }

  /**
   * The <code>UserCreateAttributes</code> <code>modified_at</code>.
   *
   * @return modifiedAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODIFIED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getModifiedAt() {
    return modifiedAt;
  }

  public void setModifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
  }

  public UserCreateAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the user.
   *
   * @return name
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UserCreateAttributes serviceAccount(Boolean serviceAccount) {
    this.serviceAccount = serviceAccount;
    return this;
  }

  /**
   * The <code>UserCreateAttributes</code> <code>service_account</code>.
   *
   * @return serviceAccount
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVICE_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getServiceAccount() {
    return serviceAccount;
  }

  public void setServiceAccount(Boolean serviceAccount) {
    this.serviceAccount = serviceAccount;
  }

  public UserCreateAttributes title(String title) {
    this.title = title;
    return this;
  }

  /**
   * The title of the user.
   *
   * @return title
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public UserCreateAttributes verified(Boolean verified) {
    this.verified = verified;
    return this;
  }

  /**
   * The <code>UserCreateAttributes</code> <code>verified</code>.
   *
   * @return verified
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERIFIED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getVerified() {
    return verified;
  }

  public void setVerified(Boolean verified) {
    this.verified = verified;
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
   * @return UserCreateAttributes
   */
  @JsonAnySetter
  public UserCreateAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this UserCreateAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserCreateAttributes userCreateAttributes = (UserCreateAttributes) o;
    return Objects.equals(this.createdAt, userCreateAttributes.createdAt)
        && Objects.equals(this.disabled, userCreateAttributes.disabled)
        && Objects.equals(this.email, userCreateAttributes.email)
        && Objects.equals(this.handle, userCreateAttributes.handle)
        && Objects.equals(this.modifiedAt, userCreateAttributes.modifiedAt)
        && Objects.equals(this.name, userCreateAttributes.name)
        && Objects.equals(this.serviceAccount, userCreateAttributes.serviceAccount)
        && Objects.equals(this.title, userCreateAttributes.title)
        && Objects.equals(this.verified, userCreateAttributes.verified)
        && Objects.equals(this.additionalProperties, userCreateAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        createdAt,
        disabled,
        email,
        handle,
        modifiedAt,
        name,
        serviceAccount,
        title,
        verified,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserCreateAttributes {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    handle: ").append(toIndentedString(handle)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    serviceAccount: ").append(toIndentedString(serviceAccount)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    verified: ").append(toIndentedString(verified)).append("\n");
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
