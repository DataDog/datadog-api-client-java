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
   * <p>Attributes of the shared dashboard invitation</p>
 */
@JsonPropertyOrder({
  SharedDashboardInvitesDataObjectAttributes.JSON_PROPERTY_CREATED_AT,
  SharedDashboardInvitesDataObjectAttributes.JSON_PROPERTY_EMAIL,
  SharedDashboardInvitesDataObjectAttributes.JSON_PROPERTY_HAS_SESSION,
  SharedDashboardInvitesDataObjectAttributes.JSON_PROPERTY_INVITATION_EXPIRY,
  SharedDashboardInvitesDataObjectAttributes.JSON_PROPERTY_SESSION_EXPIRY,
  SharedDashboardInvitesDataObjectAttributes.JSON_PROPERTY_SHARE_TOKEN
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SharedDashboardInvitesDataObjectAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;

  public static final String JSON_PROPERTY_HAS_SESSION = "has_session";
  private Boolean hasSession;

  public static final String JSON_PROPERTY_INVITATION_EXPIRY = "invitation_expiry";
  private OffsetDateTime invitationExpiry;

  public static final String JSON_PROPERTY_SESSION_EXPIRY = "session_expiry";
  private JsonNullable<OffsetDateTime> sessionExpiry = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_SHARE_TOKEN = "share_token";
  private String shareToken;


  /**
   * <p>When the invitation was sent.</p>
   * @return createdAt
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CREATED_AT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public OffsetDateTime getCreatedAt() {
        return createdAt;
      }
  public SharedDashboardInvitesDataObjectAttributes email(String email) {
    this.email = email;
    return this;
  }

  /**
   * <p>An email address that an invitation has been (or if used in invitation request, will be) sent to.</p>
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

  /**
   * <p>Indicates whether an active session exists for the invitation (produced when a user clicks the link in the email).</p>
   * @return hasSession
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_HAS_SESSION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getHasSession() {
        return hasSession;
      }

  /**
   * <p>When the invitation expires.</p>
   * @return invitationExpiry
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_INVITATION_EXPIRY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public OffsetDateTime getInvitationExpiry() {
        return invitationExpiry;
      }

  /**
   * <p>When the invited user's session expires. null if the invitation has no associated session.</p>
   * @return sessionExpiry
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public OffsetDateTime getSessionExpiry() {

        if (sessionExpiry == null) {
          sessionExpiry = JsonNullable.<OffsetDateTime>undefined();
        }
        return sessionExpiry.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_SESSION_EXPIRY)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<OffsetDateTime> getSessionExpiry_JsonNullable() {
    return sessionExpiry;
  }
  @JsonProperty(JSON_PROPERTY_SESSION_EXPIRY)private void setSessionExpiry_JsonNullable(JsonNullable<OffsetDateTime> sessionExpiry) {
    this.sessionExpiry = sessionExpiry;
  }

  /**
   * <p>The unique token of the shared dashboard that was (or is to be) shared.</p>
   * @return shareToken
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SHARE_TOKEN)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getShareToken() {
        return shareToken;
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
   * @return SharedDashboardInvitesDataObjectAttributes
   */
  @JsonAnySetter
  public SharedDashboardInvitesDataObjectAttributes putAdditionalProperty(String key, Object value) {
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
   * Return true if this SharedDashboardInvitesDataObjectAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SharedDashboardInvitesDataObjectAttributes sharedDashboardInvitesDataObjectAttributes = (SharedDashboardInvitesDataObjectAttributes) o;
    return Objects.equals(this.createdAt, sharedDashboardInvitesDataObjectAttributes.createdAt) && Objects.equals(this.email, sharedDashboardInvitesDataObjectAttributes.email) && Objects.equals(this.hasSession, sharedDashboardInvitesDataObjectAttributes.hasSession) && Objects.equals(this.invitationExpiry, sharedDashboardInvitesDataObjectAttributes.invitationExpiry) && Objects.equals(this.sessionExpiry, sharedDashboardInvitesDataObjectAttributes.sessionExpiry) && Objects.equals(this.shareToken, sharedDashboardInvitesDataObjectAttributes.shareToken) && Objects.equals(this.additionalProperties, sharedDashboardInvitesDataObjectAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(createdAt,email,hasSession,invitationExpiry,sessionExpiry,shareToken, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SharedDashboardInvitesDataObjectAttributes {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    hasSession: ").append(toIndentedString(hasSession)).append("\n");
    sb.append("    invitationExpiry: ").append(toIndentedString(invitationExpiry)).append("\n");
    sb.append("    sessionExpiry: ").append(toIndentedString(sessionExpiry)).append("\n");
    sb.append("    shareToken: ").append(toIndentedString(shareToken)).append("\n");
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
