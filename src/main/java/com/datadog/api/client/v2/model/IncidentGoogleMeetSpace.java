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

/** A Google Meet space associated with an incident. */
@JsonPropertyOrder({
  IncidentGoogleMeetSpace.JSON_PROPERTY_JOIN_URL,
  IncidentGoogleMeetSpace.JSON_PROPERTY_MEETING_CODE,
  IncidentGoogleMeetSpace.JSON_PROPERTY_NAME
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IncidentGoogleMeetSpace {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_JOIN_URL = "join_url";
  private String joinUrl;

  public static final String JSON_PROPERTY_MEETING_CODE = "meeting_code";
  private String meetingCode;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public IncidentGoogleMeetSpace() {}

  @JsonCreator
  public IncidentGoogleMeetSpace(
      @JsonProperty(required = true, value = JSON_PROPERTY_JOIN_URL) String joinUrl,
      @JsonProperty(required = true, value = JSON_PROPERTY_MEETING_CODE) String meetingCode,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name) {
    this.joinUrl = joinUrl;
    this.meetingCode = meetingCode;
    this.name = name;
  }

  public IncidentGoogleMeetSpace joinUrl(String joinUrl) {
    this.joinUrl = joinUrl;
    return this;
  }

  /**
   * The URL to join the Google Meet space.
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

  public IncidentGoogleMeetSpace meetingCode(String meetingCode) {
    this.meetingCode = meetingCode;
    return this;
  }

  /**
   * The meeting code for the space.
   *
   * @return meetingCode
   */
  @JsonProperty(JSON_PROPERTY_MEETING_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getMeetingCode() {
    return meetingCode;
  }

  public void setMeetingCode(String meetingCode) {
    this.meetingCode = meetingCode;
  }

  public IncidentGoogleMeetSpace name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the Google Meet space.
   *
   * @return name
   */
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
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
   * @return IncidentGoogleMeetSpace
   */
  @JsonAnySetter
  public IncidentGoogleMeetSpace putAdditionalProperty(String key, Object value) {
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

  /** Return true if this IncidentGoogleMeetSpace object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentGoogleMeetSpace incidentGoogleMeetSpace = (IncidentGoogleMeetSpace) o;
    return Objects.equals(this.joinUrl, incidentGoogleMeetSpace.joinUrl)
        && Objects.equals(this.meetingCode, incidentGoogleMeetSpace.meetingCode)
        && Objects.equals(this.name, incidentGoogleMeetSpace.name)
        && Objects.equals(this.additionalProperties, incidentGoogleMeetSpace.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(joinUrl, meetingCode, name, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentGoogleMeetSpace {\n");
    sb.append("    joinUrl: ").append(toIndentedString(joinUrl)).append("\n");
    sb.append("    meetingCode: ").append(toIndentedString(meetingCode)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
