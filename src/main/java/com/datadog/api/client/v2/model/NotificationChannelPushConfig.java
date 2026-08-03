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
   * <p>Push notification channel configuration</p>
 */
@JsonPropertyOrder({
  NotificationChannelPushConfig.JSON_PROPERTY_APPLICATION_NAME,
  NotificationChannelPushConfig.JSON_PROPERTY_DEVICE_NAME,
  NotificationChannelPushConfig.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class NotificationChannelPushConfig {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_APPLICATION_NAME = "application_name";
  private String applicationName;

  public static final String JSON_PROPERTY_DEVICE_NAME = "device_name";
  private String deviceName;

  public static final String JSON_PROPERTY_TYPE = "type";
  private NotificationChannelPushConfigType type = NotificationChannelPushConfigType.PUSH;

  public NotificationChannelPushConfig() {}

  @JsonCreator
  public NotificationChannelPushConfig(
            @JsonProperty(required=true, value=JSON_PROPERTY_APPLICATION_NAME)String applicationName,
            @JsonProperty(required=true, value=JSON_PROPERTY_DEVICE_NAME)String deviceName,
            @JsonProperty(required=true, value=JSON_PROPERTY_TYPE)NotificationChannelPushConfigType type) {
        this.applicationName = applicationName;
        this.deviceName = deviceName;
        this.type = type;
        this.unparsed |= !type.isValid();
  }
  public NotificationChannelPushConfig applicationName(String applicationName) {
    this.applicationName = applicationName;
    return this;
  }

  /**
   * <p>The name of the application used to receive push notifications</p>
   * @return applicationName
  **/
      @JsonProperty(JSON_PROPERTY_APPLICATION_NAME)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getApplicationName() {
        return applicationName;
      }
  public void setApplicationName(String applicationName) {
    this.applicationName = applicationName;
  }
  public NotificationChannelPushConfig deviceName(String deviceName) {
    this.deviceName = deviceName;
    return this;
  }

  /**
   * <p>The name of the mobile device being used</p>
   * @return deviceName
  **/
      @JsonProperty(JSON_PROPERTY_DEVICE_NAME)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getDeviceName() {
        return deviceName;
      }
  public void setDeviceName(String deviceName) {
    this.deviceName = deviceName;
  }
  public NotificationChannelPushConfig type(NotificationChannelPushConfigType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * <p>Indicates that the notification channel is a mobile device for push notifications</p>
   * @return type
  **/
      @JsonProperty(JSON_PROPERTY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public NotificationChannelPushConfigType getType() {
        return type;
      }
  public void setType(NotificationChannelPushConfigType type) {
    if (!type.isValid()) {
        this.unparsed = true;
    }
    this.type = type;
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
   * @return NotificationChannelPushConfig
   */
  @JsonAnySetter
  public NotificationChannelPushConfig putAdditionalProperty(String key, Object value) {
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
   * Return true if this NotificationChannelPushConfig object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationChannelPushConfig notificationChannelPushConfig = (NotificationChannelPushConfig) o;
    return Objects.equals(this.applicationName, notificationChannelPushConfig.applicationName) && Objects.equals(this.deviceName, notificationChannelPushConfig.deviceName) && Objects.equals(this.type, notificationChannelPushConfig.type) && Objects.equals(this.additionalProperties, notificationChannelPushConfig.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(applicationName,deviceName,type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationChannelPushConfig {\n");
    sb.append("    applicationName: ").append(toIndentedString(applicationName)).append("\n");
    sb.append("    deviceName: ").append(toIndentedString(deviceName)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
