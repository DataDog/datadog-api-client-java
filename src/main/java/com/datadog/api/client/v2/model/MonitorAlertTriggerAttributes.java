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

/** Attributes for a monitor alert trigger. */
@JsonPropertyOrder({
  MonitorAlertTriggerAttributes.JSON_PROPERTY_EVENT_ID,
  MonitorAlertTriggerAttributes.JSON_PROPERTY_EVENT_TS,
  MonitorAlertTriggerAttributes.JSON_PROPERTY_MONITOR_ID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class MonitorAlertTriggerAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_EVENT_ID = "event_id";
  private String eventId;

  public static final String JSON_PROPERTY_EVENT_TS = "event_ts";
  private Long eventTs;

  public static final String JSON_PROPERTY_MONITOR_ID = "monitor_id";
  private Long monitorId;

  public MonitorAlertTriggerAttributes() {}

  @JsonCreator
  public MonitorAlertTriggerAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_EVENT_ID) String eventId,
      @JsonProperty(required = true, value = JSON_PROPERTY_EVENT_TS) Long eventTs,
      @JsonProperty(required = true, value = JSON_PROPERTY_MONITOR_ID) Long monitorId) {
    this.eventId = eventId;
    this.eventTs = eventTs;
    this.monitorId = monitorId;
  }

  public MonitorAlertTriggerAttributes eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

  /**
   * The event ID associated with the monitor alert.
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

  public MonitorAlertTriggerAttributes eventTs(Long eventTs) {
    this.eventTs = eventTs;
    return this;
  }

  /**
   * The timestamp of the event in Unix milliseconds.
   *
   * @return eventTs
   */
  @JsonProperty(JSON_PROPERTY_EVENT_TS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getEventTs() {
    return eventTs;
  }

  public void setEventTs(Long eventTs) {
    this.eventTs = eventTs;
  }

  public MonitorAlertTriggerAttributes monitorId(Long monitorId) {
    this.monitorId = monitorId;
    return this;
  }

  /**
   * The monitor ID that triggered the alert.
   *
   * @return monitorId
   */
  @JsonProperty(JSON_PROPERTY_MONITOR_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getMonitorId() {
    return monitorId;
  }

  public void setMonitorId(Long monitorId) {
    this.monitorId = monitorId;
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
   * @return MonitorAlertTriggerAttributes
   */
  @JsonAnySetter
  public MonitorAlertTriggerAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this MonitorAlertTriggerAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MonitorAlertTriggerAttributes monitorAlertTriggerAttributes = (MonitorAlertTriggerAttributes) o;
    return Objects.equals(this.eventId, monitorAlertTriggerAttributes.eventId)
        && Objects.equals(this.eventTs, monitorAlertTriggerAttributes.eventTs)
        && Objects.equals(this.monitorId, monitorAlertTriggerAttributes.monitorId)
        && Objects.equals(
            this.additionalProperties, monitorAlertTriggerAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventId, eventTs, monitorId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonitorAlertTriggerAttributes {\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    eventTs: ").append(toIndentedString(eventTs)).append("\n");
    sb.append("    monitorId: ").append(toIndentedString(monitorId)).append("\n");
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
