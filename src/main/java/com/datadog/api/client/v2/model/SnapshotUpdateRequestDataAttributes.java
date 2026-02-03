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

/** */
@JsonPropertyOrder({
  SnapshotUpdateRequestDataAttributes.JSON_PROPERTY_EVENT_ID,
  SnapshotUpdateRequestDataAttributes.JSON_PROPERTY_IS_DEVICE_TYPE_SELECTED_BY_USER,
  SnapshotUpdateRequestDataAttributes.JSON_PROPERTY_SESSION_ID,
  SnapshotUpdateRequestDataAttributes.JSON_PROPERTY_START,
  SnapshotUpdateRequestDataAttributes.JSON_PROPERTY_VIEW_ID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SnapshotUpdateRequestDataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_EVENT_ID = "event_id";
  private String eventId;

  public static final String JSON_PROPERTY_IS_DEVICE_TYPE_SELECTED_BY_USER =
      "is_device_type_selected_by_user";
  private Boolean isDeviceTypeSelectedByUser;

  public static final String JSON_PROPERTY_SESSION_ID = "session_id";
  private String sessionId;

  public static final String JSON_PROPERTY_START = "start";
  private Long start;

  public static final String JSON_PROPERTY_VIEW_ID = "view_id";
  private String viewId;

  public SnapshotUpdateRequestDataAttributes() {}

  @JsonCreator
  public SnapshotUpdateRequestDataAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_EVENT_ID) String eventId,
      @JsonProperty(required = true, value = JSON_PROPERTY_IS_DEVICE_TYPE_SELECTED_BY_USER)
          Boolean isDeviceTypeSelectedByUser,
      @JsonProperty(required = true, value = JSON_PROPERTY_START) Long start) {
    this.eventId = eventId;
    this.isDeviceTypeSelectedByUser = isDeviceTypeSelectedByUser;
    this.start = start;
  }

  public SnapshotUpdateRequestDataAttributes eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

  /**
   * GeteventId
   *
   * @return eventId
   */
  @JsonProperty(JSON_PROPERTY_EVENT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getEventId() {
    return eventId;
  }

  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  public SnapshotUpdateRequestDataAttributes isDeviceTypeSelectedByUser(
      Boolean isDeviceTypeSelectedByUser) {
    this.isDeviceTypeSelectedByUser = isDeviceTypeSelectedByUser;
    return this;
  }

  /**
   * GetisDeviceTypeSelectedByUser
   *
   * @return isDeviceTypeSelectedByUser
   */
  @JsonProperty(JSON_PROPERTY_IS_DEVICE_TYPE_SELECTED_BY_USER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getIsDeviceTypeSelectedByUser() {
    return isDeviceTypeSelectedByUser;
  }

  public void setIsDeviceTypeSelectedByUser(Boolean isDeviceTypeSelectedByUser) {
    this.isDeviceTypeSelectedByUser = isDeviceTypeSelectedByUser;
  }

  public SnapshotUpdateRequestDataAttributes sessionId(String sessionId) {
    this.sessionId = sessionId;
    return this;
  }

  /**
   * GetsessionId
   *
   * @return sessionId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SESSION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSessionId() {
    return sessionId;
  }

  public void setSessionId(String sessionId) {
    this.sessionId = sessionId;
  }

  public SnapshotUpdateRequestDataAttributes start(Long start) {
    this.start = start;
    return this;
  }

  /**
   * Getstart
   *
   * @return start
   */
  @JsonProperty(JSON_PROPERTY_START)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getStart() {
    return start;
  }

  public void setStart(Long start) {
    this.start = start;
  }

  public SnapshotUpdateRequestDataAttributes viewId(String viewId) {
    this.viewId = viewId;
    return this;
  }

  /**
   * GetviewId
   *
   * @return viewId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VIEW_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getViewId() {
    return viewId;
  }

  public void setViewId(String viewId) {
    this.viewId = viewId;
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
   * @return SnapshotUpdateRequestDataAttributes
   */
  @JsonAnySetter
  public SnapshotUpdateRequestDataAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SnapshotUpdateRequestDataAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SnapshotUpdateRequestDataAttributes snapshotUpdateRequestDataAttributes =
        (SnapshotUpdateRequestDataAttributes) o;
    return Objects.equals(this.eventId, snapshotUpdateRequestDataAttributes.eventId)
        && Objects.equals(
            this.isDeviceTypeSelectedByUser,
            snapshotUpdateRequestDataAttributes.isDeviceTypeSelectedByUser)
        && Objects.equals(this.sessionId, snapshotUpdateRequestDataAttributes.sessionId)
        && Objects.equals(this.start, snapshotUpdateRequestDataAttributes.start)
        && Objects.equals(this.viewId, snapshotUpdateRequestDataAttributes.viewId)
        && Objects.equals(
            this.additionalProperties, snapshotUpdateRequestDataAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        eventId, isDeviceTypeSelectedByUser, sessionId, start, viewId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SnapshotUpdateRequestDataAttributes {\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    isDeviceTypeSelectedByUser: ")
        .append(toIndentedString(isDeviceTypeSelectedByUser))
        .append("\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    viewId: ").append(toIndentedString(viewId)).append("\n");
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
