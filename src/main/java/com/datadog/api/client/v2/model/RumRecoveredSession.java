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

/** Progress for one targeted session. */
@JsonPropertyOrder({
  RumRecoveredSession.JSON_PROPERTY_APPLICATION_ID,
  RumRecoveredSession.JSON_PROPERTY_ERROR_MESSAGE,
  RumRecoveredSession.JSON_PROPERTY_EVENTS_RECOVERED,
  RumRecoveredSession.JSON_PROPERTY_SESSION_ID,
  RumRecoveredSession.JSON_PROPERTY_STATUS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RumRecoveredSession {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_APPLICATION_ID = "application_id";
  private UUID applicationId;

  public static final String JSON_PROPERTY_ERROR_MESSAGE = "error_message";
  private String errorMessage;

  public static final String JSON_PROPERTY_EVENTS_RECOVERED = "events_recovered";
  private Long eventsRecovered;

  public static final String JSON_PROPERTY_SESSION_ID = "session_id";
  private UUID sessionId;

  public static final String JSON_PROPERTY_STATUS = "status";
  private RumRecoverySessionStatus status;

  public RumRecoveredSession() {}

  @JsonCreator
  public RumRecoveredSession(
      @JsonProperty(required = true, value = JSON_PROPERTY_APPLICATION_ID) UUID applicationId,
      @JsonProperty(required = true, value = JSON_PROPERTY_EVENTS_RECOVERED) Long eventsRecovered,
      @JsonProperty(required = true, value = JSON_PROPERTY_SESSION_ID) UUID sessionId,
      @JsonProperty(required = true, value = JSON_PROPERTY_STATUS)
          RumRecoverySessionStatus status) {
    this.applicationId = applicationId;
    this.eventsRecovered = eventsRecovered;
    this.sessionId = sessionId;
    this.status = status;
    this.unparsed |= !status.isValid();
  }

  public RumRecoveredSession applicationId(UUID applicationId) {
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

  public RumRecoveredSession errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

  /**
   * Failure details, if present.
   *
   * @return errorMessage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ERROR_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  public RumRecoveredSession eventsRecovered(Long eventsRecovered) {
    this.eventsRecovered = eventsRecovered;
    return this;
  }

  /**
   * Recovered event count. minimum: 0
   *
   * @return eventsRecovered
   */
  @JsonProperty(JSON_PROPERTY_EVENTS_RECOVERED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getEventsRecovered() {
    return eventsRecovered;
  }

  public void setEventsRecovered(Long eventsRecovered) {
    this.eventsRecovered = eventsRecovered;
  }

  public RumRecoveredSession sessionId(UUID sessionId) {
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
  public UUID getSessionId() {
    return sessionId;
  }

  public void setSessionId(UUID sessionId) {
    this.sessionId = sessionId;
  }

  public RumRecoveredSession status(RumRecoverySessionStatus status) {
    this.status = status;
    this.unparsed |= !status.isValid();
    return this;
  }

  /**
   * Session availability or recovery state. <code>RECOVERED</code> indicates that the session is
   * ready to query.
   *
   * @return status
   */
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public RumRecoverySessionStatus getStatus() {
    return status;
  }

  public void setStatus(RumRecoverySessionStatus status) {
    if (!status.isValid()) {
      this.unparsed = true;
    }
    this.status = status;
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
   * @return RumRecoveredSession
   */
  @JsonAnySetter
  public RumRecoveredSession putAdditionalProperty(String key, Object value) {
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

  /** Return true if this RumRecoveredSession object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RumRecoveredSession rumRecoveredSession = (RumRecoveredSession) o;
    return Objects.equals(this.applicationId, rumRecoveredSession.applicationId)
        && Objects.equals(this.errorMessage, rumRecoveredSession.errorMessage)
        && Objects.equals(this.eventsRecovered, rumRecoveredSession.eventsRecovered)
        && Objects.equals(this.sessionId, rumRecoveredSession.sessionId)
        && Objects.equals(this.status, rumRecoveredSession.status)
        && Objects.equals(this.additionalProperties, rumRecoveredSession.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        applicationId, errorMessage, eventsRecovered, sessionId, status, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RumRecoveredSession {\n");
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    eventsRecovered: ").append(toIndentedString(eventsRecovered)).append("\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
