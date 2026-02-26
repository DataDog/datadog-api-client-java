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
   * <p>The allowlisted invitees for an INVITE-only shared dashboard.</p>
 */
@JsonPropertyOrder({
  SharedDashboardInviteesItems.JSON_PROPERTY_ACCESS_EXPIRATION,
  SharedDashboardInviteesItems.JSON_PROPERTY_CREATED_AT,
  SharedDashboardInviteesItems.JSON_PROPERTY_EMAIL
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SharedDashboardInviteesItems {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACCESS_EXPIRATION = "access_expiration";
  private JsonNullable<OffsetDateTime> accessExpiration = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;

  public SharedDashboardInviteesItems() {}

  @JsonCreator
  public SharedDashboardInviteesItems(
            @JsonProperty(required=true, value=JSON_PROPERTY_EMAIL)String email) {
        this.email = email;
  }
  public SharedDashboardInviteesItems accessExpiration(OffsetDateTime accessExpiration) {
    this.accessExpiration = JsonNullable.<OffsetDateTime>of(accessExpiration);
    return this;
  }

  /**
   * <p>Time of the invitee expiration. Null means the invite will not expire.</p>
   * @return accessExpiration
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public OffsetDateTime getAccessExpiration() {
        return accessExpiration.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_ACCESS_EXPIRATION)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<OffsetDateTime> getAccessExpiration_JsonNullable() {
    return accessExpiration;
  }
  @JsonProperty(JSON_PROPERTY_ACCESS_EXPIRATION)public void setAccessExpiration_JsonNullable(JsonNullable<OffsetDateTime> accessExpiration) {
    this.accessExpiration = accessExpiration;
  }
  public void setAccessExpiration(OffsetDateTime accessExpiration) {
    this.accessExpiration = JsonNullable.<OffsetDateTime>of(accessExpiration);
  }

  /**
   * <p>Time that the invitee was created.</p>
   * @return createdAt
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CREATED_AT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public OffsetDateTime getCreatedAt() {
        return createdAt;
      }
  public SharedDashboardInviteesItems email(String email) {
    this.email = email;
    return this;
  }

  /**
   * <p>Email of the invitee.</p>
   * @return email
  **/
      @JsonProperty(JSON_PROPERTY_EMAIL)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getEmail() {
        return email;
      }
  public void setEmail(String email) {
    this.email = email;
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
   * @return SharedDashboardInviteesItems
   */
  @JsonAnySetter
  public SharedDashboardInviteesItems putAdditionalProperty(String key, Object value) {
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
   * Return true if this SharedDashboardInviteesItems object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SharedDashboardInviteesItems sharedDashboardInviteesItems = (SharedDashboardInviteesItems) o;
    return Objects.equals(this.accessExpiration, sharedDashboardInviteesItems.accessExpiration) && Objects.equals(this.createdAt, sharedDashboardInviteesItems.createdAt) && Objects.equals(this.email, sharedDashboardInviteesItems.email) && Objects.equals(this.additionalProperties, sharedDashboardInviteesItems.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(accessExpiration,createdAt,email, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SharedDashboardInviteesItems {\n");
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
