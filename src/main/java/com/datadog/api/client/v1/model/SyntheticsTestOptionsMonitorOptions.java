/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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
   * <p>Object containing the options for a Synthetic test as a monitor
   * (for example, renotification).</p>
 */
@JsonPropertyOrder({
  SyntheticsTestOptionsMonitorOptions.JSON_PROPERTY_ESCALATION_MESSAGE,
  SyntheticsTestOptionsMonitorOptions.JSON_PROPERTY_NOTIFICATION_PRESET_NAME,
  SyntheticsTestOptionsMonitorOptions.JSON_PROPERTY_RENOTIFY_INTERVAL,
  SyntheticsTestOptionsMonitorOptions.JSON_PROPERTY_RENOTIFY_OCCURRENCES
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsTestOptionsMonitorOptions {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_ESCALATION_MESSAGE = "escalation_message";
  private String escalationMessage;

  public static final String JSON_PROPERTY_NOTIFICATION_PRESET_NAME = "notification_preset_name";
  private SyntheticsTestOptionsMonitorOptionsNotificationPresetName notificationPresetName;

  public static final String JSON_PROPERTY_RENOTIFY_INTERVAL = "renotify_interval";
  private Long renotifyInterval;

  public static final String JSON_PROPERTY_RENOTIFY_OCCURRENCES = "renotify_occurrences";
  private Long renotifyOccurrences;

  public SyntheticsTestOptionsMonitorOptions escalationMessage(String escalationMessage) {
    this.escalationMessage = escalationMessage;
    return this;
  }

  /**
   * <p>Message to include in the escalation notification.</p>
   * @return escalationMessage
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ESCALATION_MESSAGE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getEscalationMessage() {
        return escalationMessage;
      }
  public void setEscalationMessage(String escalationMessage) {
    this.escalationMessage = escalationMessage;
  }
  public SyntheticsTestOptionsMonitorOptions notificationPresetName(SyntheticsTestOptionsMonitorOptionsNotificationPresetName notificationPresetName) {
    this.notificationPresetName = notificationPresetName;
    this.unparsed |= !notificationPresetName.isValid();
    return this;
  }

  /**
   * <p>The name of the preset for the notification for the monitor.</p>
   * @return notificationPresetName
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_NOTIFICATION_PRESET_NAME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public SyntheticsTestOptionsMonitorOptionsNotificationPresetName getNotificationPresetName() {
        return notificationPresetName;
      }
  public void setNotificationPresetName(SyntheticsTestOptionsMonitorOptionsNotificationPresetName notificationPresetName) {
    if (!notificationPresetName.isValid()) {
        this.unparsed = true;
    }
    this.notificationPresetName = notificationPresetName;
  }
  public SyntheticsTestOptionsMonitorOptions renotifyInterval(Long renotifyInterval) {
    this.renotifyInterval = renotifyInterval;
    return this;
  }

  /**
   * <p>Time interval before renotifying if the test is still failing
   * (in minutes).</p>
   * minimum: 0
   * @return renotifyInterval
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_RENOTIFY_INTERVAL)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getRenotifyInterval() {
        return renotifyInterval;
      }
  public void setRenotifyInterval(Long renotifyInterval) {
    this.renotifyInterval = renotifyInterval;
  }
  public SyntheticsTestOptionsMonitorOptions renotifyOccurrences(Long renotifyOccurrences) {
    this.renotifyOccurrences = renotifyOccurrences;
    return this;
  }

  /**
   * <p>The number of times to renotify if the test is still failing.</p>
   * @return renotifyOccurrences
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_RENOTIFY_OCCURRENCES)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getRenotifyOccurrences() {
        return renotifyOccurrences;
      }
  public void setRenotifyOccurrences(Long renotifyOccurrences) {
    this.renotifyOccurrences = renotifyOccurrences;
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
   * @return SyntheticsTestOptionsMonitorOptions
   */
  @JsonAnySetter
  public SyntheticsTestOptionsMonitorOptions putAdditionalProperty(String key, Object value) {
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
   * Return true if this SyntheticsTestOptionsMonitorOptions object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsTestOptionsMonitorOptions syntheticsTestOptionsMonitorOptions = (SyntheticsTestOptionsMonitorOptions) o;
    return Objects.equals(this.escalationMessage, syntheticsTestOptionsMonitorOptions.escalationMessage) && Objects.equals(this.notificationPresetName, syntheticsTestOptionsMonitorOptions.notificationPresetName) && Objects.equals(this.renotifyInterval, syntheticsTestOptionsMonitorOptions.renotifyInterval) && Objects.equals(this.renotifyOccurrences, syntheticsTestOptionsMonitorOptions.renotifyOccurrences) && Objects.equals(this.additionalProperties, syntheticsTestOptionsMonitorOptions.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(escalationMessage,notificationPresetName,renotifyInterval,renotifyOccurrences, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsTestOptionsMonitorOptions {\n");
    sb.append("    escalationMessage: ").append(toIndentedString(escalationMessage)).append("\n");
    sb.append("    notificationPresetName: ").append(toIndentedString(notificationPresetName)).append("\n");
    sb.append("    renotifyInterval: ").append(toIndentedString(renotifyInterval)).append("\n");
    sb.append("    renotifyOccurrences: ").append(toIndentedString(renotifyOccurrences)).append("\n");
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
