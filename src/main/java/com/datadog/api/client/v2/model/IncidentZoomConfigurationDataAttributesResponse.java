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

/** Attributes of a Zoom configuration. */
@JsonPropertyOrder({
  IncidentZoomConfigurationDataAttributesResponse.JSON_PROPERTY_CREATED_AT,
  IncidentZoomConfigurationDataAttributesResponse.JSON_PROPERTY_MANUAL_MEETING_CREATION,
  IncidentZoomConfigurationDataAttributesResponse.JSON_PROPERTY_MEETING_CHAT_TIMELINE_SYNC,
  IncidentZoomConfigurationDataAttributesResponse.JSON_PROPERTY_MODIFIED_AT,
  IncidentZoomConfigurationDataAttributesResponse.JSON_PROPERTY_POST_MEETING_SUMMARY
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IncidentZoomConfigurationDataAttributesResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_MANUAL_MEETING_CREATION = "manual_meeting_creation";
  private Boolean manualMeetingCreation;

  public static final String JSON_PROPERTY_MEETING_CHAT_TIMELINE_SYNC =
      "meeting_chat_timeline_sync";
  private Boolean meetingChatTimelineSync;

  public static final String JSON_PROPERTY_MODIFIED_AT = "modified_at";
  private OffsetDateTime modifiedAt;

  public static final String JSON_PROPERTY_POST_MEETING_SUMMARY = "post_meeting_summary";
  private Boolean postMeetingSummary;

  public IncidentZoomConfigurationDataAttributesResponse() {}

  @JsonCreator
  public IncidentZoomConfigurationDataAttributesResponse(
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_AT) OffsetDateTime createdAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_MANUAL_MEETING_CREATION)
          Boolean manualMeetingCreation,
      @JsonProperty(required = true, value = JSON_PROPERTY_MEETING_CHAT_TIMELINE_SYNC)
          Boolean meetingChatTimelineSync,
      @JsonProperty(required = true, value = JSON_PROPERTY_MODIFIED_AT) OffsetDateTime modifiedAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_POST_MEETING_SUMMARY)
          Boolean postMeetingSummary) {
    this.createdAt = createdAt;
    this.manualMeetingCreation = manualMeetingCreation;
    this.meetingChatTimelineSync = meetingChatTimelineSync;
    this.modifiedAt = modifiedAt;
    this.postMeetingSummary = postMeetingSummary;
  }

  public IncidentZoomConfigurationDataAttributesResponse createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Timestamp when the configuration was created.
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

  public IncidentZoomConfigurationDataAttributesResponse manualMeetingCreation(
      Boolean manualMeetingCreation) {
    this.manualMeetingCreation = manualMeetingCreation;
    return this;
  }

  /**
   * Whether manual meeting creation is enabled.
   *
   * @return manualMeetingCreation
   */
  @JsonProperty(JSON_PROPERTY_MANUAL_MEETING_CREATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getManualMeetingCreation() {
    return manualMeetingCreation;
  }

  public void setManualMeetingCreation(Boolean manualMeetingCreation) {
    this.manualMeetingCreation = manualMeetingCreation;
  }

  public IncidentZoomConfigurationDataAttributesResponse meetingChatTimelineSync(
      Boolean meetingChatTimelineSync) {
    this.meetingChatTimelineSync = meetingChatTimelineSync;
    return this;
  }

  /**
   * Whether meeting chat timeline sync is enabled.
   *
   * @return meetingChatTimelineSync
   */
  @JsonProperty(JSON_PROPERTY_MEETING_CHAT_TIMELINE_SYNC)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getMeetingChatTimelineSync() {
    return meetingChatTimelineSync;
  }

  public void setMeetingChatTimelineSync(Boolean meetingChatTimelineSync) {
    this.meetingChatTimelineSync = meetingChatTimelineSync;
  }

  public IncidentZoomConfigurationDataAttributesResponse modifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
    return this;
  }

  /**
   * Timestamp when the configuration was last modified.
   *
   * @return modifiedAt
   */
  @JsonProperty(JSON_PROPERTY_MODIFIED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getModifiedAt() {
    return modifiedAt;
  }

  public void setModifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
  }

  public IncidentZoomConfigurationDataAttributesResponse postMeetingSummary(
      Boolean postMeetingSummary) {
    this.postMeetingSummary = postMeetingSummary;
    return this;
  }

  /**
   * Whether post-meeting summary is enabled.
   *
   * @return postMeetingSummary
   */
  @JsonProperty(JSON_PROPERTY_POST_MEETING_SUMMARY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getPostMeetingSummary() {
    return postMeetingSummary;
  }

  public void setPostMeetingSummary(Boolean postMeetingSummary) {
    this.postMeetingSummary = postMeetingSummary;
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
   * @return IncidentZoomConfigurationDataAttributesResponse
   */
  @JsonAnySetter
  public IncidentZoomConfigurationDataAttributesResponse putAdditionalProperty(
      String key, Object value) {
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

  /** Return true if this IncidentZoomConfigurationDataAttributesResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentZoomConfigurationDataAttributesResponse
        incidentZoomConfigurationDataAttributesResponse =
            (IncidentZoomConfigurationDataAttributesResponse) o;
    return Objects.equals(this.createdAt, incidentZoomConfigurationDataAttributesResponse.createdAt)
        && Objects.equals(
            this.manualMeetingCreation,
            incidentZoomConfigurationDataAttributesResponse.manualMeetingCreation)
        && Objects.equals(
            this.meetingChatTimelineSync,
            incidentZoomConfigurationDataAttributesResponse.meetingChatTimelineSync)
        && Objects.equals(
            this.modifiedAt, incidentZoomConfigurationDataAttributesResponse.modifiedAt)
        && Objects.equals(
            this.postMeetingSummary,
            incidentZoomConfigurationDataAttributesResponse.postMeetingSummary)
        && Objects.equals(
            this.additionalProperties,
            incidentZoomConfigurationDataAttributesResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        createdAt,
        manualMeetingCreation,
        meetingChatTimelineSync,
        modifiedAt,
        postMeetingSummary,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentZoomConfigurationDataAttributesResponse {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    manualMeetingCreation: ")
        .append(toIndentedString(manualMeetingCreation))
        .append("\n");
    sb.append("    meetingChatTimelineSync: ")
        .append(toIndentedString(meetingChatTimelineSync))
        .append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    postMeetingSummary: ").append(toIndentedString(postMeetingSummary)).append("\n");
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
