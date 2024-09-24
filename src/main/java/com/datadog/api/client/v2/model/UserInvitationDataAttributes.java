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
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** Attributes of a user invitation. */
@JsonPropertyOrder({
  UserInvitationDataAttributes.JSON_PROPERTY_CREATED_AT,
  UserInvitationDataAttributes.JSON_PROPERTY_EXPIRES_AT,
  UserInvitationDataAttributes.JSON_PROPERTY_INVITE_TYPE,
  UserInvitationDataAttributes.JSON_PROPERTY_LOGIN_METHOD,
  UserInvitationDataAttributes.JSON_PROPERTY_UUID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class UserInvitationDataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_EXPIRES_AT = "expires_at";
  private OffsetDateTime expiresAt;

  public static final String JSON_PROPERTY_INVITE_TYPE = "invite_type";
  private String inviteType;

  public static final String JSON_PROPERTY_LOGIN_METHOD = "login_method";
  private JsonNullable<String> loginMethod = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_UUID = "uuid";
  private String uuid;

  public UserInvitationDataAttributes createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Creation time of the user invitation.
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

  public UserInvitationDataAttributes expiresAt(OffsetDateTime expiresAt) {
    this.expiresAt = expiresAt;
    return this;
  }

  /**
   * Time of invitation expiration.
   *
   * @return expiresAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXPIRES_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getExpiresAt() {
    return expiresAt;
  }

  public void setExpiresAt(OffsetDateTime expiresAt) {
    this.expiresAt = expiresAt;
  }

  public UserInvitationDataAttributes inviteType(String inviteType) {
    this.inviteType = inviteType;
    return this;
  }

  /**
   * Type of invitation.
   *
   * @return inviteType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INVITE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getInviteType() {
    return inviteType;
  }

  public void setInviteType(String inviteType) {
    this.inviteType = inviteType;
  }

  public UserInvitationDataAttributes loginMethod(String loginMethod) {
    this.loginMethod = JsonNullable.<String>of(loginMethod);
    return this;
  }

  /**
   * The <code>UserInvitationDataAttributes</code> <code>login_method</code>.
   *
   * @return loginMethod
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getLoginMethod() {
    return loginMethod.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LOGIN_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getLoginMethod_JsonNullable() {
    return loginMethod;
  }

  @JsonProperty(JSON_PROPERTY_LOGIN_METHOD)
  public void setLoginMethod_JsonNullable(JsonNullable<String> loginMethod) {
    this.loginMethod = loginMethod;
  }

  public void setLoginMethod(String loginMethod) {
    this.loginMethod = JsonNullable.<String>of(loginMethod);
  }

  public UserInvitationDataAttributes uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

  /**
   * UUID of the user invitation.
   *
   * @return uuid
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UUID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
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
   * @return UserInvitationDataAttributes
   */
  @JsonAnySetter
  public UserInvitationDataAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this UserInvitationDataAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserInvitationDataAttributes userInvitationDataAttributes = (UserInvitationDataAttributes) o;
    return Objects.equals(this.createdAt, userInvitationDataAttributes.createdAt)
        && Objects.equals(this.expiresAt, userInvitationDataAttributes.expiresAt)
        && Objects.equals(this.inviteType, userInvitationDataAttributes.inviteType)
        && Objects.equals(this.loginMethod, userInvitationDataAttributes.loginMethod)
        && Objects.equals(this.uuid, userInvitationDataAttributes.uuid)
        && Objects.equals(
            this.additionalProperties, userInvitationDataAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, expiresAt, inviteType, loginMethod, uuid, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserInvitationDataAttributes {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
    sb.append("    inviteType: ").append(toIndentedString(inviteType)).append("\n");
    sb.append("    loginMethod: ").append(toIndentedString(loginMethod)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
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
