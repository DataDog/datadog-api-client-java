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
import java.time.OffsetDateTime;
import java.util.Objects;

/** Attributes of a user invitation. */
@JsonPropertyOrder({
  UserInvitationDataAttributes.JSON_PROPERTY_CREATED_AT,
  UserInvitationDataAttributes.JSON_PROPERTY_EXPIRES_AT,
  UserInvitationDataAttributes.JSON_PROPERTY_INVITE_TYPE,
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
        && Objects.equals(this.uuid, userInvitationDataAttributes.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, expiresAt, inviteType, uuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserInvitationDataAttributes {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
    sb.append("    inviteType: ").append(toIndentedString(inviteType)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
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
