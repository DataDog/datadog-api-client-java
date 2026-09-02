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

/** Invitee that can access an invite-only shared dashboard. */
@JsonPropertyOrder({
  SharedDashboardInvitee.JSON_PROPERTY_ACCESS_EXPIRATION,
  SharedDashboardInvitee.JSON_PROPERTY_CREATED_AT,
  SharedDashboardInvitee.JSON_PROPERTY_EMAIL
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SharedDashboardInvitee {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACCESS_EXPIRATION = "access_expiration";
  private OffsetDateTime accessExpiration;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;

  public SharedDashboardInvitee() {}

  @JsonCreator
  public SharedDashboardInvitee(
      @JsonProperty(required = true, value = JSON_PROPERTY_ACCESS_EXPIRATION)
          OffsetDateTime accessExpiration,
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_AT) OffsetDateTime createdAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_EMAIL) String email) {
    this.accessExpiration = accessExpiration;
    if (accessExpiration != null) {}
    this.createdAt = createdAt;
    this.email = email;
  }

  public SharedDashboardInvitee accessExpiration(OffsetDateTime accessExpiration) {
    this.accessExpiration = accessExpiration;
    if (accessExpiration != null) {}
    return this;
  }

  /**
   * Time when the invitee's access expires.
   *
   * @return accessExpiration
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCESS_EXPIRATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getAccessExpiration() {
    return accessExpiration;
  }

  public void setAccessExpiration(OffsetDateTime accessExpiration) {
    this.accessExpiration = accessExpiration;
  }

  public SharedDashboardInvitee createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Time when the invitee was added.
   *
   * @return createdAt
   */
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public SharedDashboardInvitee email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Email address of the invitee.
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
   * @return SharedDashboardInvitee
   */
  @JsonAnySetter
  public SharedDashboardInvitee putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SharedDashboardInvitee object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SharedDashboardInvitee sharedDashboardInvitee = (SharedDashboardInvitee) o;
    return Objects.equals(this.accessExpiration, sharedDashboardInvitee.accessExpiration)
        && Objects.equals(this.createdAt, sharedDashboardInvitee.createdAt)
        && Objects.equals(this.email, sharedDashboardInvitee.email)
        && Objects.equals(this.additionalProperties, sharedDashboardInvitee.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessExpiration, createdAt, email, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SharedDashboardInvitee {\n");
    sb.append("    accessExpiration: ").append(toIndentedString(accessExpiration)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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
