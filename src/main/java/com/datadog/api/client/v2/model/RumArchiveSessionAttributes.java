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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/** Archived session metadata. */
@JsonPropertyOrder({
  RumArchiveSessionAttributes.JSON_PROPERTY_ACCOUNT_ID,
  RumArchiveSessionAttributes.JSON_PROPERTY_ANONYMOUS_ID,
  RumArchiveSessionAttributes.JSON_PROPERTY_APPLICATION_ID,
  RumArchiveSessionAttributes.JSON_PROPERTY_COUNTRY,
  RumArchiveSessionAttributes.JSON_PROPERTY_RECOVERY_STATUS,
  RumArchiveSessionAttributes.JSON_PROPERTY_SERVICE,
  RumArchiveSessionAttributes.JSON_PROPERTY_SESSION_ID,
  RumArchiveSessionAttributes.JSON_PROPERTY_TIMESTAMP,
  RumArchiveSessionAttributes.JSON_PROPERTY_USER_ID,
  RumArchiveSessionAttributes.JSON_PROPERTY_VERSION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RumArchiveSessionAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACCOUNT_ID = "account_id";
  private String accountId;

  public static final String JSON_PROPERTY_ANONYMOUS_ID = "anonymous_id";
  private String anonymousId;

  public static final String JSON_PROPERTY_APPLICATION_ID = "application_id";
  private UUID applicationId;

  public static final String JSON_PROPERTY_COUNTRY = "country";
  private String country;

  public static final String JSON_PROPERTY_RECOVERY_STATUS = "recovery_status";
  private RumArchiveSessionRecoveryStatus recoveryStatus;

  public static final String JSON_PROPERTY_SERVICE = "service";
  private String service;

  public static final String JSON_PROPERTY_SESSION_ID = "session_id";
  private String sessionId;

  public static final String JSON_PROPERTY_TIMESTAMP = "timestamp";
  private Long timestamp;

  public static final String JSON_PROPERTY_USER_ID = "user_id";
  private String userId;

  public static final String JSON_PROPERTY_VERSION = "version";
  private String version;

  public RumArchiveSessionAttributes() {}

  @JsonCreator
  public RumArchiveSessionAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_ACCOUNT_ID) String accountId,
      @JsonProperty(required = true, value = JSON_PROPERTY_ANONYMOUS_ID) String anonymousId,
      @JsonProperty(required = true, value = JSON_PROPERTY_APPLICATION_ID) UUID applicationId,
      @JsonProperty(required = true, value = JSON_PROPERTY_COUNTRY) String country,
      @JsonProperty(required = true, value = JSON_PROPERTY_RECOVERY_STATUS)
          RumArchiveSessionRecoveryStatus recoveryStatus,
      @JsonProperty(required = true, value = JSON_PROPERTY_SERVICE) String service,
      @JsonProperty(required = true, value = JSON_PROPERTY_SESSION_ID) String sessionId,
      @JsonProperty(required = true, value = JSON_PROPERTY_TIMESTAMP) Long timestamp,
      @JsonProperty(required = true, value = JSON_PROPERTY_USER_ID) String userId,
      @JsonProperty(required = true, value = JSON_PROPERTY_VERSION) String version) {
    this.accountId = accountId;
    if (accountId != null) {}
    this.anonymousId = anonymousId;
    if (anonymousId != null) {}
    this.applicationId = applicationId;
    this.country = country;
    if (country != null) {}
    this.recoveryStatus = recoveryStatus;
    if (recoveryStatus != null) {
      this.unparsed |= recoveryStatus.unparsed;
    }
    this.service = service;
    this.sessionId = sessionId;
    this.timestamp = timestamp;
    this.userId = userId;
    if (userId != null) {}
    this.version = version;
    if (version != null) {}
  }

  public RumArchiveSessionAttributes accountId(String accountId) {
    this.accountId = accountId;
    if (accountId != null) {}
    return this;
  }

  /**
   * Session account id, or null when unavailable.
   *
   * @return accountId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public RumArchiveSessionAttributes anonymousId(String anonymousId) {
    this.anonymousId = anonymousId;
    if (anonymousId != null) {}
    return this;
  }

  /**
   * Session anonymous id, or null when unavailable.
   *
   * @return anonymousId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ANONYMOUS_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getAnonymousId() {
    return anonymousId;
  }

  public void setAnonymousId(String anonymousId) {
    this.anonymousId = anonymousId;
  }

  public RumArchiveSessionAttributes applicationId(UUID applicationId) {
    this.applicationId = applicationId;
    return this;
  }

  /**
   * Application UUID.
   *
   * @return applicationId
   */
  @JsonProperty(JSON_PROPERTY_APPLICATION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public UUID getApplicationId() {
    return applicationId;
  }

  public void setApplicationId(UUID applicationId) {
    this.applicationId = applicationId;
  }

  public RumArchiveSessionAttributes country(String country) {
    this.country = country;
    if (country != null) {}
    return this;
  }

  /**
   * Session country, or null when unavailable.
   *
   * @return country
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public RumArchiveSessionAttributes recoveryStatus(
      RumArchiveSessionRecoveryStatus recoveryStatus) {
    this.recoveryStatus = recoveryStatus;
    if (recoveryStatus != null) {
      this.unparsed |= recoveryStatus.unparsed;
    }
    return this;
  }

  /**
   * Session recovery state. A missing recovery record can be represented as null. Optional
   * request_id and recovered_at are omitted when unavailable.
   *
   * @return recoveryStatus
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RECOVERY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public RumArchiveSessionRecoveryStatus getRecoveryStatus() {
    return recoveryStatus;
  }

  public void setRecoveryStatus(RumArchiveSessionRecoveryStatus recoveryStatus) {
    this.recoveryStatus = recoveryStatus;
    if (recoveryStatus != null) {
      this.unparsed |= recoveryStatus.unparsed;
    }
  }

  public RumArchiveSessionAttributes service(String service) {
    this.service = service;
    return this;
  }

  /**
   * Service name.
   *
   * @return service
   */
  @JsonProperty(JSON_PROPERTY_SERVICE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getService() {
    return service;
  }

  public void setService(String service) {
    this.service = service;
  }

  public RumArchiveSessionAttributes sessionId(String sessionId) {
    this.sessionId = sessionId;
    return this;
  }

  /**
   * Session identifier.
   *
   * @return sessionId
   */
  @JsonProperty(JSON_PROPERTY_SESSION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getSessionId() {
    return sessionId;
  }

  public void setSessionId(String sessionId) {
    this.sessionId = sessionId;
  }

  public RumArchiveSessionAttributes timestamp(Long timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * Session timestamp in Unix milliseconds.
   *
   * @return timestamp
   */
  @JsonProperty(JSON_PROPERTY_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
  }

  public RumArchiveSessionAttributes userId(String userId) {
    this.userId = userId;
    if (userId != null) {}
    return this;
  }

  /**
   * Session user id, or null when unavailable.
   *
   * @return userId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public RumArchiveSessionAttributes version(String version) {
    this.version = version;
    if (version != null) {}
    return this;
  }

  /**
   * Session version, or null when unavailable.
   *
   * @return version
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
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
   * @return RumArchiveSessionAttributes
   */
  @JsonAnySetter
  public RumArchiveSessionAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this RumArchiveSessionAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RumArchiveSessionAttributes rumArchiveSessionAttributes = (RumArchiveSessionAttributes) o;
    return Objects.equals(this.accountId, rumArchiveSessionAttributes.accountId)
        && Objects.equals(this.anonymousId, rumArchiveSessionAttributes.anonymousId)
        && Objects.equals(this.applicationId, rumArchiveSessionAttributes.applicationId)
        && Objects.equals(this.country, rumArchiveSessionAttributes.country)
        && Objects.equals(this.recoveryStatus, rumArchiveSessionAttributes.recoveryStatus)
        && Objects.equals(this.service, rumArchiveSessionAttributes.service)
        && Objects.equals(this.sessionId, rumArchiveSessionAttributes.sessionId)
        && Objects.equals(this.timestamp, rumArchiveSessionAttributes.timestamp)
        && Objects.equals(this.userId, rumArchiveSessionAttributes.userId)
        && Objects.equals(this.version, rumArchiveSessionAttributes.version)
        && Objects.equals(
            this.additionalProperties, rumArchiveSessionAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        accountId,
        anonymousId,
        applicationId,
        country,
        recoveryStatus,
        service,
        sessionId,
        timestamp,
        userId,
        version,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RumArchiveSessionAttributes {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    anonymousId: ").append(toIndentedString(anonymousId)).append("\n");
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    recoveryStatus: ").append(toIndentedString(recoveryStatus)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
