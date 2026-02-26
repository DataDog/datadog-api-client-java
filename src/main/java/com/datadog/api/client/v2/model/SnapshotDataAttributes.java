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
  SnapshotDataAttributes.JSON_PROPERTY_APPLICATION_ID,
  SnapshotDataAttributes.JSON_PROPERTY_CREATED_AT,
  SnapshotDataAttributes.JSON_PROPERTY_CREATED_BY,
  SnapshotDataAttributes.JSON_PROPERTY_CREATED_BY_HANDLE,
  SnapshotDataAttributes.JSON_PROPERTY_CREATED_BY_USER_ID,
  SnapshotDataAttributes.JSON_PROPERTY_DEVICE_TYPE,
  SnapshotDataAttributes.JSON_PROPERTY_EVENT_ID,
  SnapshotDataAttributes.JSON_PROPERTY_IS_DEVICE_TYPE_SELECTED_BY_USER,
  SnapshotDataAttributes.JSON_PROPERTY_MODIFIED_AT,
  SnapshotDataAttributes.JSON_PROPERTY_ORG_ID,
  SnapshotDataAttributes.JSON_PROPERTY_SESSION_ID,
  SnapshotDataAttributes.JSON_PROPERTY_SNAPSHOT_NAME,
  SnapshotDataAttributes.JSON_PROPERTY_START,
  SnapshotDataAttributes.JSON_PROPERTY_VIEW_ID,
  SnapshotDataAttributes.JSON_PROPERTY_VIEW_NAME
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SnapshotDataAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_APPLICATION_ID = "application_id";
  private String applicationId;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_CREATED_BY = "created_by";
  private String createdBy;

  public static final String JSON_PROPERTY_CREATED_BY_HANDLE = "created_by_handle";
  private String createdByHandle;

  public static final String JSON_PROPERTY_CREATED_BY_USER_ID = "created_by_user_id";
  private Long createdByUserId;

  public static final String JSON_PROPERTY_DEVICE_TYPE = "device_type";
  private String deviceType;

  public static final String JSON_PROPERTY_EVENT_ID = "event_id";
  private String eventId;

  public static final String JSON_PROPERTY_IS_DEVICE_TYPE_SELECTED_BY_USER = "is_device_type_selected_by_user";
  private Boolean isDeviceTypeSelectedByUser;

  public static final String JSON_PROPERTY_MODIFIED_AT = "modified_at";
  private OffsetDateTime modifiedAt;

  public static final String JSON_PROPERTY_ORG_ID = "org_id";
  private Long orgId;

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

  public SnapshotDataAttributes applicationId(String applicationId) {
    this.applicationId = applicationId;
    return this;
  }

  /**
   * <p>GetapplicationId</p>
   * @return applicationId
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_APPLICATION_ID)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getApplicationId() {
        return applicationId;
      }
  public void setApplicationId(String applicationId) {
    this.applicationId = applicationId;
  }

  /**
   * <p>GetcreatedAt</p>
   * @return createdAt
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CREATED_AT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public OffsetDateTime getCreatedAt() {
        return createdAt;
      }

  /**
   * <p>GetcreatedBy</p>
   * @return createdBy
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CREATED_BY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getCreatedBy() {
        return createdBy;
      }

  /**
   * <p>GetcreatedByHandle</p>
   * @return createdByHandle
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CREATED_BY_HANDLE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getCreatedByHandle() {
        return createdByHandle;
      }

  /**
   * <p>GetcreatedByUserId</p>
   * @return createdByUserId
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CREATED_BY_USER_ID)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getCreatedByUserId() {
        return createdByUserId;
      }
  public SnapshotDataAttributes deviceType(String deviceType) {
    this.deviceType = deviceType;
    return this;
  }

  /**
   * <p>GetdeviceType</p>
   * @return deviceType
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_DEVICE_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getDeviceType() {
        return deviceType;
      }
  public void setDeviceType(String deviceType) {
    this.deviceType = deviceType;
  }
  public SnapshotDataAttributes eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

  /**
   * <p>GeteventId</p>
   * @return eventId
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_EVENT_ID)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getEventId() {
        return eventId;
      }
  public void setEventId(String eventId) {
    this.eventId = eventId;
  }
  public SnapshotDataAttributes isDeviceTypeSelectedByUser(Boolean isDeviceTypeSelectedByUser) {
    this.isDeviceTypeSelectedByUser = isDeviceTypeSelectedByUser;
    return this;
  }

  /**
   * <p>GetisDeviceTypeSelectedByUser</p>
   * @return isDeviceTypeSelectedByUser
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_IS_DEVICE_TYPE_SELECTED_BY_USER)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getIsDeviceTypeSelectedByUser() {
        return isDeviceTypeSelectedByUser;
      }
  public void setIsDeviceTypeSelectedByUser(Boolean isDeviceTypeSelectedByUser) {
    this.isDeviceTypeSelectedByUser = isDeviceTypeSelectedByUser;
  }

  /**
   * <p>GetmodifiedAt</p>
   * @return modifiedAt
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_MODIFIED_AT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public OffsetDateTime getModifiedAt() {
        return modifiedAt;
      }

  /**
   * <p>GetorgId</p>
   * @return orgId
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ORG_ID)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getOrgId() {
        return orgId;
      }
  public SnapshotDataAttributes sessionId(String sessionId) {
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
  public SnapshotDataAttributes snapshotName(String snapshotName) {
    this.snapshotName = snapshotName;
    return this;
  }

  /**
   * <p>GetsnapshotName</p>
   * @return snapshotName
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SNAPSHOT_NAME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getSnapshotName() {
        return snapshotName;
      }
  public void setSnapshotName(String snapshotName) {
    this.snapshotName = snapshotName;
  }
  public SnapshotDataAttributes start(Long start) {
    this.start = start;
    return this;
  }

  /**
   * <p>Getstart</p>
   * @return start
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_START)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getStart() {
        return start;
      }
  public void setStart(Long start) {
    this.start = start;
  }
  public SnapshotDataAttributes viewId(String viewId) {
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
  public SnapshotDataAttributes viewName(String viewName) {
    this.viewName = viewName;
    return this;
  }

  /**
   * <p>GetviewName</p>
   * @return viewName
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_VIEW_NAME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
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
   * @return SnapshotDataAttributes
   */
  @JsonAnySetter
  public SnapshotDataAttributes putAdditionalProperty(String key, Object value) {
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
   * Return true if this SnapshotDataAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SnapshotDataAttributes snapshotDataAttributes = (SnapshotDataAttributes) o;
    return Objects.equals(this.applicationId, snapshotDataAttributes.applicationId) && Objects.equals(this.createdAt, snapshotDataAttributes.createdAt) && Objects.equals(this.createdBy, snapshotDataAttributes.createdBy) && Objects.equals(this.createdByHandle, snapshotDataAttributes.createdByHandle) && Objects.equals(this.createdByUserId, snapshotDataAttributes.createdByUserId) && Objects.equals(this.deviceType, snapshotDataAttributes.deviceType) && Objects.equals(this.eventId, snapshotDataAttributes.eventId) && Objects.equals(this.isDeviceTypeSelectedByUser, snapshotDataAttributes.isDeviceTypeSelectedByUser) && Objects.equals(this.modifiedAt, snapshotDataAttributes.modifiedAt) && Objects.equals(this.orgId, snapshotDataAttributes.orgId) && Objects.equals(this.sessionId, snapshotDataAttributes.sessionId) && Objects.equals(this.snapshotName, snapshotDataAttributes.snapshotName) && Objects.equals(this.start, snapshotDataAttributes.start) && Objects.equals(this.viewId, snapshotDataAttributes.viewId) && Objects.equals(this.viewName, snapshotDataAttributes.viewName) && Objects.equals(this.additionalProperties, snapshotDataAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(applicationId,createdAt,createdBy,createdByHandle,createdByUserId,deviceType,eventId,isDeviceTypeSelectedByUser,modifiedAt,orgId,sessionId,snapshotName,start,viewId,viewName, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SnapshotDataAttributes {\n");
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdByHandle: ").append(toIndentedString(createdByHandle)).append("\n");
    sb.append("    createdByUserId: ").append(toIndentedString(createdByUserId)).append("\n");
    sb.append("    deviceType: ").append(toIndentedString(deviceType)).append("\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    isDeviceTypeSelectedByUser: ").append(toIndentedString(isDeviceTypeSelectedByUser)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
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
