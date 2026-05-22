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

/** A Zoom meeting associated with an incident. */
@JsonPropertyOrder({
  IncidentZoomMeeting.JSON_PROPERTY_HOST_ID,
  IncidentZoomMeeting.JSON_PROPERTY_JOIN_URL,
  IncidentZoomMeeting.JSON_PROPERTY_MEETING_ID,
  IncidentZoomMeeting.JSON_PROPERTY_PASSWORD,
  IncidentZoomMeeting.JSON_PROPERTY_RECORDING_URL
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IncidentZoomMeeting {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_HOST_ID = "host_id";
  private String hostId;

  public static final String JSON_PROPERTY_JOIN_URL = "join_url";
  private String joinUrl;

  public static final String JSON_PROPERTY_MEETING_ID = "meeting_id";
  private Long meetingId;

  public static final String JSON_PROPERTY_PASSWORD = "password";
  private String password;

  public static final String JSON_PROPERTY_RECORDING_URL = "recording_url";
  private String recordingUrl;

  public IncidentZoomMeeting() {}

  @JsonCreator
  public IncidentZoomMeeting(
      @JsonProperty(required = true, value = JSON_PROPERTY_JOIN_URL) String joinUrl,
      @JsonProperty(required = true, value = JSON_PROPERTY_MEETING_ID) Long meetingId) {
    this.joinUrl = joinUrl;
    this.meetingId = meetingId;
  }

  public IncidentZoomMeeting hostId(String hostId) {
    this.hostId = hostId;
    return this;
  }

  /**
   * The Zoom host identifier.
   *
   * @return hostId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HOST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getHostId() {
    return hostId;
  }

  public void setHostId(String hostId) {
    this.hostId = hostId;
  }

  public IncidentZoomMeeting joinUrl(String joinUrl) {
    this.joinUrl = joinUrl;
    return this;
  }

  /**
   * The URL to join the meeting.
   *
   * @return joinUrl
   */
  @JsonProperty(JSON_PROPERTY_JOIN_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getJoinUrl() {
    return joinUrl;
  }

  public void setJoinUrl(String joinUrl) {
    this.joinUrl = joinUrl;
  }

  public IncidentZoomMeeting meetingId(Long meetingId) {
    this.meetingId = meetingId;
    return this;
  }

  /**
   * The Zoom meeting identifier.
   *
   * @return meetingId
   */
  @JsonProperty(JSON_PROPERTY_MEETING_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getMeetingId() {
    return meetingId;
  }

  public void setMeetingId(Long meetingId) {
    this.meetingId = meetingId;
  }

  public IncidentZoomMeeting password(String password) {
    this.password = password;
    return this;
  }

  /**
   * The meeting password.
   *
   * @return password
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public IncidentZoomMeeting recordingUrl(String recordingUrl) {
    this.recordingUrl = recordingUrl;
    return this;
  }

  /**
   * The URL of the meeting recording.
   *
   * @return recordingUrl
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RECORDING_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getRecordingUrl() {
    return recordingUrl;
  }

  public void setRecordingUrl(String recordingUrl) {
    this.recordingUrl = recordingUrl;
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
   * @return IncidentZoomMeeting
   */
  @JsonAnySetter
  public IncidentZoomMeeting putAdditionalProperty(String key, Object value) {
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

  /** Return true if this IncidentZoomMeeting object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentZoomMeeting incidentZoomMeeting = (IncidentZoomMeeting) o;
    return Objects.equals(this.hostId, incidentZoomMeeting.hostId)
        && Objects.equals(this.joinUrl, incidentZoomMeeting.joinUrl)
        && Objects.equals(this.meetingId, incidentZoomMeeting.meetingId)
        && Objects.equals(this.password, incidentZoomMeeting.password)
        && Objects.equals(this.recordingUrl, incidentZoomMeeting.recordingUrl)
        && Objects.equals(this.additionalProperties, incidentZoomMeeting.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hostId, joinUrl, meetingId, password, recordingUrl, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentZoomMeeting {\n");
    sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
    sb.append("    joinUrl: ").append(toIndentedString(joinUrl)).append("\n");
    sb.append("    meetingId: ").append(toIndentedString(meetingId)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    recordingUrl: ").append(toIndentedString(recordingUrl)).append("\n");
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
