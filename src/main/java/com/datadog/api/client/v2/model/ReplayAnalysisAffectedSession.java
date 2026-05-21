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
import org.openapitools.jackson.nullable.JsonNullable;

/** A session affected by a replay analysis issue. */
@JsonPropertyOrder({
  ReplayAnalysisAffectedSession.JSON_PROPERTY_SESSION_ID,
  ReplayAnalysisAffectedSession.JSON_PROPERTY_SESSION_START_TIMESTAMP_MS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ReplayAnalysisAffectedSession {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_SESSION_ID = "session_id";
  private String sessionId;

  public static final String JSON_PROPERTY_SESSION_START_TIMESTAMP_MS =
      "session_start_timestamp_ms";
  private JsonNullable<Long> sessionStartTimestampMs = JsonNullable.<Long>undefined();

  public ReplayAnalysisAffectedSession() {}

  @JsonCreator
  public ReplayAnalysisAffectedSession(
      @JsonProperty(required = true, value = JSON_PROPERTY_SESSION_ID) String sessionId) {
    this.sessionId = sessionId;
  }

  public ReplayAnalysisAffectedSession sessionId(String sessionId) {
    this.sessionId = sessionId;
    return this;
  }

  /**
   * Unique identifier of the affected session.
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

  public ReplayAnalysisAffectedSession sessionStartTimestampMs(Long sessionStartTimestampMs) {
    this.sessionStartTimestampMs = JsonNullable.<Long>of(sessionStartTimestampMs);
    return this;
  }

  /**
   * Session start timestamp in milliseconds.
   *
   * @return sessionStartTimestampMs
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getSessionStartTimestampMs() {
    return sessionStartTimestampMs.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SESSION_START_TIMESTAMP_MS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getSessionStartTimestampMs_JsonNullable() {
    return sessionStartTimestampMs;
  }

  @JsonProperty(JSON_PROPERTY_SESSION_START_TIMESTAMP_MS)
  public void setSessionStartTimestampMs_JsonNullable(JsonNullable<Long> sessionStartTimestampMs) {
    this.sessionStartTimestampMs = sessionStartTimestampMs;
  }

  public void setSessionStartTimestampMs(Long sessionStartTimestampMs) {
    this.sessionStartTimestampMs = JsonNullable.<Long>of(sessionStartTimestampMs);
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
   * @return ReplayAnalysisAffectedSession
   */
  @JsonAnySetter
  public ReplayAnalysisAffectedSession putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ReplayAnalysisAffectedSession object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReplayAnalysisAffectedSession replayAnalysisAffectedSession = (ReplayAnalysisAffectedSession) o;
    return Objects.equals(this.sessionId, replayAnalysisAffectedSession.sessionId)
        && Objects.equals(
            this.sessionStartTimestampMs, replayAnalysisAffectedSession.sessionStartTimestampMs)
        && Objects.equals(
            this.additionalProperties, replayAnalysisAffectedSession.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sessionId, sessionStartTimestampMs, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReplayAnalysisAffectedSession {\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
    sb.append("    sessionStartTimestampMs: ")
        .append(toIndentedString(sessionStartTimestampMs))
        .append("\n");
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
