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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** The notification settings for a single event type on a control. */
@JsonPropertyOrder({
  ControlNotificationEventSetting.JSON_PROPERTY_ENABLED,
  ControlNotificationEventSetting.JSON_PROPERTY_EVENT_TYPE,
  ControlNotificationEventSetting.JSON_PROPERTY_TARGETS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ControlNotificationEventSetting {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public static final String JSON_PROPERTY_EVENT_TYPE = "event_type";
  private String eventType;

  public static final String JSON_PROPERTY_TARGETS = "targets";
  private List<ControlNotificationTarget> targets = new ArrayList<>();

  public ControlNotificationEventSetting() {}

  @JsonCreator
  public ControlNotificationEventSetting(
      @JsonProperty(required = true, value = JSON_PROPERTY_ENABLED) Boolean enabled,
      @JsonProperty(required = true, value = JSON_PROPERTY_EVENT_TYPE) String eventType,
      @JsonProperty(required = true, value = JSON_PROPERTY_TARGETS)
          List<ControlNotificationTarget> targets) {
    this.enabled = enabled;
    this.eventType = eventType;
    this.targets = targets;
  }

  public ControlNotificationEventSetting enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Whether notifications are enabled for this event type.
   *
   * @return enabled
   */
  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public ControlNotificationEventSetting eventType(String eventType) {
    this.eventType = eventType;
    return this;
  }

  /**
   * The event type the notification settings apply to, such as <code>new_detection</code>.
   *
   * @return eventType
   */
  @JsonProperty(JSON_PROPERTY_EVENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getEventType() {
    return eventType;
  }

  public void setEventType(String eventType) {
    this.eventType = eventType;
  }

  public ControlNotificationEventSetting targets(List<ControlNotificationTarget> targets) {
    this.targets = targets;
    for (ControlNotificationTarget item : targets) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public ControlNotificationEventSetting addTargetsItem(ControlNotificationTarget targetsItem) {
    this.targets.add(targetsItem);
    this.unparsed |= targetsItem.unparsed;
    return this;
  }

  /**
   * The destinations that receive notifications for an event type.
   *
   * @return targets
   */
  @JsonProperty(JSON_PROPERTY_TARGETS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<ControlNotificationTarget> getTargets() {
    return targets;
  }

  public void setTargets(List<ControlNotificationTarget> targets) {
    this.targets = targets;
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
   * @return ControlNotificationEventSetting
   */
  @JsonAnySetter
  public ControlNotificationEventSetting putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ControlNotificationEventSetting object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ControlNotificationEventSetting controlNotificationEventSetting =
        (ControlNotificationEventSetting) o;
    return Objects.equals(this.enabled, controlNotificationEventSetting.enabled)
        && Objects.equals(this.eventType, controlNotificationEventSetting.eventType)
        && Objects.equals(this.targets, controlNotificationEventSetting.targets)
        && Objects.equals(
            this.additionalProperties, controlNotificationEventSetting.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, eventType, targets, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ControlNotificationEventSetting {\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    targets: ").append(toIndentedString(targets)).append("\n");
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
