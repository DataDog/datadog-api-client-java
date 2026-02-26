/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

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

 */
@JsonPropertyOrder({
  SnapshotCreateRequestDataAttributes.JSON_PROPERTY_APPLICATION_ID,
  SnapshotCreateRequestDataAttributes.JSON_PROPERTY_DEVICE_TYPE,
  SnapshotCreateRequestDataAttributes.JSON_PROPERTY_EVENT_ID,
  SnapshotCreateRequestDataAttributes.JSON_PROPERTY_IS_DEVICE_TYPE_SELECTED_BY_USER,
  SnapshotCreateRequestDataAttributes.JSON_PROPERTY_SESSION_ID,
  SnapshotCreateRequestDataAttributes.JSON_PROPERTY_SNAPSHOT_NAME,
  SnapshotCreateRequestDataAttributes.JSON_PROPERTY_START,
  SnapshotCreateRequestDataAttributes.JSON_PROPERTY_VIEW_ID,
  SnapshotCreateRequestDataAttributes.JSON_PROPERTY_VIEW_NAME
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SnapshotCreateRequestDataAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_APPLICATION_ID = "application_id";
  private String applicationId;

  public static final String JSON_PROPERTY_DEVICE_TYPE = "device_type";
  private String deviceType;

  public static final String JSON_PROPERTY_EVENT_ID = "event_id";
  private String eventId;

  public static final String JSON_PROPERTY_IS_DEVICE_TYPE_SELECTED_BY_USER = "is_device_type_selected_by_user";
  private Boolean isDeviceTypeSelectedByUser;

  public static final String JSON_PROPERTY_SESSION_ID = "session_id";
  private String sessionId;

  public static final String JSON_PROPERTY_SNAPSHOT_NAME = "snapshot_name";
  private String snapshotName;

  public static final String JSON_PROPERTY_START = "start";
  private Long start;

  public static final String JSON_PROPERTY_VIEW_ID = "view_id";
  private String viewId;

  public static final String JSON_PROPERTY_VIEW_NAME = "view_name";
  private String viewName;

  public SnapshotCreateRequestDataAttributes() {}

  @JsonCreator
  public SnapshotCreateRequestDataAttributes(
            @JsonProperty(required=true, value=JSON_PROPERTY_APPLICATION_ID)String applicationId,
            @JsonProperty(required=true, value=JSON_PROPERTY_DEVICE_TYPE)String deviceType,
            @JsonProperty(required=true, value=JSON_PROPERTY_EVENT_ID)String eventId,
            @JsonProperty(required=true, value=JSON_PROPERTY_IS_DEVICE_TYPE_SELECTED_BY_USER)Boolean isDeviceTypeSelectedByUser,
            @JsonProperty(required=true, value=JSON_PROPERTY_SNAPSHOT_NAME)String snapshotName,
            @JsonProperty(required=true, value=JSON_PROPERTY_START)Long start,
            @JsonProperty(required=true, value=JSON_PROPERTY_VIEW_NAME)String viewName) {
        this.applicationId = applicationId;
        this.deviceType = deviceType;
        this.eventId = eventId;
        this.isDeviceTypeSelectedByUser = isDeviceTypeSelectedByUser;
        this.snapshotName = snapshotName;
        this.start = start;
        this.viewName = viewName;
  }
  public SnapshotCreateRequestDataAttributes applicationId(String applicationId) {
    this.applicationId = applicationId;
    return this;
  }

  /**
   * <p>GetapplicationId</p>
   * @return applicationId
  **/
      @JsonProperty(JSON_PROPERTY_APPLICATION_ID)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getApplicationId() {
        return applicationId;
      }
  public void setApplicationId(String applicationId) {
    this.applicationId = applicationId;
  }
  public SnapshotCreateRequestDataAttributes deviceType(String deviceType) {
    this.deviceType = deviceType;
    return this;
  }

  /**
   * <p>GetdeviceType</p>
   * @return deviceType
  **/
      @JsonProperty(JSON_PROPERTY_DEVICE_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getDeviceType() {
        return deviceType;
      }
  public void setDeviceType(String deviceType) {
    this.deviceType = deviceType;
  }
  public SnapshotCreateRequestDataAttributes eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

  /**
   * <p>GeteventId</p>
   * @return eventId
  **/
      @JsonProperty(JSON_PROPERTY_EVENT_ID)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getEventId() {
        return eventId;
      }
  public void setEventId(String eventId) {
    this.eventId = eventId;
  }
  public SnapshotCreateRequestDataAttributes isDeviceTypeSelectedByUser(Boolean isDeviceTypeSelectedByUser) {
    this.isDeviceTypeSelectedByUser = isDeviceTypeSelectedByUser;
    return this;
  }

  /**
   * <p>GetisDeviceTypeSelectedByUser</p>
   * @return isDeviceTypeSelectedByUser
  **/
      @JsonProperty(JSON_PROPERTY_IS_DEVICE_TYPE_SELECTED_BY_USER)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public Boolean getIsDeviceTypeSelectedByUser() {
        return isDeviceTypeSelectedByUser;
      }
  public void setIsDeviceTypeSelectedByUser(Boolean isDeviceTypeSelectedByUser) {
    this.isDeviceTypeSelectedByUser = isDeviceTypeSelectedByUser;
  }
  public SnapshotCreateRequestDataAttributes sessionId(String sessionId) {
    this.sessionId = sessionId;
    return this;
  }

  /**
   * <p>GetsessionId</p>
   * @return sessionId
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SESSION_ID)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getSessionId() {
        return sessionId;
      }
  public void setSessionId(String sessionId) {
    this.sessionId = sessionId;
  }
  public SnapshotCreateRequestDataAttributes snapshotName(String snapshotName) {
    this.snapshotName = snapshotName;
    return this;
  }

  /**
   * <p>GetsnapshotName</p>
   * @return snapshotName
  **/
      @JsonProperty(JSON_PROPERTY_SNAPSHOT_NAME)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getSnapshotName() {
        return snapshotName;
      }
  public void setSnapshotName(String snapshotName) {
    this.snapshotName = snapshotName;
  }
  public SnapshotCreateRequestDataAttributes start(Long start) {
    this.start = start;
    return this;
  }

  /**
   * <p>Getstart</p>
   * @return start
  **/
      @JsonProperty(JSON_PROPERTY_START)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public Long getStart() {
        return start;
      }
  public void setStart(Long start) {
    this.start = start;
  }
  public SnapshotCreateRequestDataAttributes viewId(String viewId) {
    this.viewId = viewId;
    return this;
  }

  /**
   * <p>GetviewId</p>
   * @return viewId
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_VIEW_ID)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getViewId() {
        return viewId;
      }
  public void setViewId(String viewId) {
    this.viewId = viewId;
  }
  public SnapshotCreateRequestDataAttributes viewName(String viewName) {
    this.viewName = viewName;
    return this;
  }

  /**
   * <p>GetviewName</p>
   * @return viewName
  **/
      @JsonProperty(JSON_PROPERTY_VIEW_NAME)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getViewName() {
        return viewName;
      }
  public void setViewName(String viewName) {
    this.viewName = viewName;
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
   * @return SnapshotCreateRequestDataAttributes
   */
  @JsonAnySetter
  public SnapshotCreateRequestDataAttributes putAdditionalProperty(String key, Object value) {
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
   * Return true if this SnapshotCreateRequestDataAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SnapshotCreateRequestDataAttributes snapshotCreateRequestDataAttributes = (SnapshotCreateRequestDataAttributes) o;
    return Objects.equals(this.applicationId, snapshotCreateRequestDataAttributes.applicationId) && Objects.equals(this.deviceType, snapshotCreateRequestDataAttributes.deviceType) && Objects.equals(this.eventId, snapshotCreateRequestDataAttributes.eventId) && Objects.equals(this.isDeviceTypeSelectedByUser, snapshotCreateRequestDataAttributes.isDeviceTypeSelectedByUser) && Objects.equals(this.sessionId, snapshotCreateRequestDataAttributes.sessionId) && Objects.equals(this.snapshotName, snapshotCreateRequestDataAttributes.snapshotName) && Objects.equals(this.start, snapshotCreateRequestDataAttributes.start) && Objects.equals(this.viewId, snapshotCreateRequestDataAttributes.viewId) && Objects.equals(this.viewName, snapshotCreateRequestDataAttributes.viewName) && Objects.equals(this.additionalProperties, snapshotCreateRequestDataAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(applicationId,deviceType,eventId,isDeviceTypeSelectedByUser,sessionId,snapshotName,start,viewId,viewName, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SnapshotCreateRequestDataAttributes {\n");
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
    sb.append("    deviceType: ").append(toIndentedString(deviceType)).append("\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    isDeviceTypeSelectedByUser: ").append(toIndentedString(isDeviceTypeSelectedByUser)).append("\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
    sb.append("    snapshotName: ").append(toIndentedString(snapshotName)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    viewId: ").append(toIndentedString(viewId)).append("\n");
    sb.append("    viewName: ").append(toIndentedString(viewName)).append("\n");
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
