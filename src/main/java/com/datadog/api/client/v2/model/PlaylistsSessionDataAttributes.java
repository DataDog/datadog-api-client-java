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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** */
@JsonPropertyOrder({
  PlaylistsSessionDataAttributes.JSON_PROPERTY_SESSION_EVENT,
  PlaylistsSessionDataAttributes.JSON_PROPERTY_TRACK
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class PlaylistsSessionDataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_SESSION_EVENT = "session_event";
  private Map<String, Object> sessionEvent = null;

  public static final String JSON_PROPERTY_TRACK = "track";
  private String track;

  public PlaylistsSessionDataAttributes sessionEvent(Map<String, Object> sessionEvent) {
    this.sessionEvent = sessionEvent;
    return this;
  }

  public PlaylistsSessionDataAttributes putSessionEventItem(String key, Object sessionEventItem) {
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

  public PlaylistsSessionDataAttributes track(String track) {
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
   * @return PlaylistsSessionDataAttributes
   */
  @JsonAnySetter
  public PlaylistsSessionDataAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this PlaylistsSessionDataAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlaylistsSessionDataAttributes playlistsSessionDataAttributes =
        (PlaylistsSessionDataAttributes) o;
    return Objects.equals(this.sessionEvent, playlistsSessionDataAttributes.sessionEvent)
        && Objects.equals(this.track, playlistsSessionDataAttributes.track)
        && Objects.equals(
            this.additionalProperties, playlistsSessionDataAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sessionEvent, track, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlaylistsSessionDataAttributes {\n");
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
