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

/** */
@JsonPropertyOrder({
  ViewershipHistorySessionDataAttributes.JSON_PROPERTY_EVENT_ID,
  ViewershipHistorySessionDataAttributes.JSON_PROPERTY_LAST_WATCHED_AT,
  ViewershipHistorySessionDataAttributes.JSON_PROPERTY_SESSION_EVENT,
  ViewershipHistorySessionDataAttributes.JSON_PROPERTY_TRACK
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ViewershipHistorySessionDataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_EVENT_ID = "event_id";
  private String eventId;

  public static final String JSON_PROPERTY_LAST_WATCHED_AT = "last_watched_at";
  private OffsetDateTime lastWatchedAt;

  public static final String JSON_PROPERTY_SESSION_EVENT = "session_event";
  private Map<String, Object> sessionEvent = null;

  public static final String JSON_PROPERTY_TRACK = "track";
  private String track;

  public ViewershipHistorySessionDataAttributes() {}

  @JsonCreator
  public ViewershipHistorySessionDataAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_LAST_WATCHED_AT)
          OffsetDateTime lastWatchedAt) {
    this.lastWatchedAt = lastWatchedAt;
  }

  public ViewershipHistorySessionDataAttributes eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

  /**
   * GeteventId
   *
   * @return eventId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EVENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getEventId() {
    return eventId;
  }

  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  public ViewershipHistorySessionDataAttributes lastWatchedAt(OffsetDateTime lastWatchedAt) {
    this.lastWatchedAt = lastWatchedAt;
    return this;
  }

  /**
   * GetlastWatchedAt
   *
   * @return lastWatchedAt
   */
  @JsonProperty(JSON_PROPERTY_LAST_WATCHED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getLastWatchedAt() {
    return lastWatchedAt;
  }

  public void setLastWatchedAt(OffsetDateTime lastWatchedAt) {
    this.lastWatchedAt = lastWatchedAt;
  }

  public ViewershipHistorySessionDataAttributes sessionEvent(Map<String, Object> sessionEvent) {
    this.sessionEvent = sessionEvent;
    return this;
  }

  public ViewershipHistorySessionDataAttributes putSessionEventItem(
      String key, Object sessionEventItem) {
    if (this.sessionEvent == null) {
      this.sessionEvent = new HashMap<>();
    }
    this.sessionEvent.put(key, sessionEventItem);
    return this;
  }

  /**
   * GetsessionEvent
   *
   * @return sessionEvent
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SESSION_EVENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, Object> getSessionEvent() {
    return sessionEvent;
  }

  public void setSessionEvent(Map<String, Object> sessionEvent) {
    this.sessionEvent = sessionEvent;
  }

  public ViewershipHistorySessionDataAttributes track(String track) {
    this.track = track;
    return this;
  }

  /**
   * Gettrack
   *
   * @return track
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRACK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTrack() {
    return track;
  }

  public void setTrack(String track) {
    this.track = track;
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
   * @return ViewershipHistorySessionDataAttributes
   */
  @JsonAnySetter
  public ViewershipHistorySessionDataAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ViewershipHistorySessionDataAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ViewershipHistorySessionDataAttributes viewershipHistorySessionDataAttributes =
        (ViewershipHistorySessionDataAttributes) o;
    return Objects.equals(this.eventId, viewershipHistorySessionDataAttributes.eventId)
        && Objects.equals(this.lastWatchedAt, viewershipHistorySessionDataAttributes.lastWatchedAt)
        && Objects.equals(this.sessionEvent, viewershipHistorySessionDataAttributes.sessionEvent)
        && Objects.equals(this.track, viewershipHistorySessionDataAttributes.track)
        && Objects.equals(
            this.additionalProperties, viewershipHistorySessionDataAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventId, lastWatchedAt, sessionEvent, track, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ViewershipHistorySessionDataAttributes {\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    lastWatchedAt: ").append(toIndentedString(lastWatchedAt)).append("\n");
    sb.append("    sessionEvent: ").append(toIndentedString(sessionEvent)).append("\n");
    sb.append("    track: ").append(toIndentedString(track)).append("\n");
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
