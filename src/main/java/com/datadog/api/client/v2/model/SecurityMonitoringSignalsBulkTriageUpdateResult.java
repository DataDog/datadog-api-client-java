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

/** The result payload of a bulk signal triage update. */
@JsonPropertyOrder({
  SecurityMonitoringSignalsBulkTriageUpdateResult.JSON_PROPERTY_COUNT,
  SecurityMonitoringSignalsBulkTriageUpdateResult.JSON_PROPERTY_EVENTS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SecurityMonitoringSignalsBulkTriageUpdateResult {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COUNT = "count";
  private Long count;

  public static final String JSON_PROPERTY_EVENTS = "events";
  private List<SecurityMonitoringSignalsBulkTriageEvent> events = new ArrayList<>();

  public SecurityMonitoringSignalsBulkTriageUpdateResult() {}

  @JsonCreator
  public SecurityMonitoringSignalsBulkTriageUpdateResult(
      @JsonProperty(required = true, value = JSON_PROPERTY_COUNT) Long count,
      @JsonProperty(required = true, value = JSON_PROPERTY_EVENTS)
          List<SecurityMonitoringSignalsBulkTriageEvent> events) {
    this.count = count;
    this.events = events;
  }

  public SecurityMonitoringSignalsBulkTriageUpdateResult count(Long count) {
    this.count = count;
    return this;
  }

  /**
   * The number of signals updated.
   *
   * @return count
   */
  @JsonProperty(JSON_PROPERTY_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getCount() {
    return count;
  }

  public void setCount(Long count) {
    this.count = count;
  }

  public SecurityMonitoringSignalsBulkTriageUpdateResult events(
      List<SecurityMonitoringSignalsBulkTriageEvent> events) {
    this.events = events;
    for (SecurityMonitoringSignalsBulkTriageEvent item : events) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SecurityMonitoringSignalsBulkTriageUpdateResult addEventsItem(
      SecurityMonitoringSignalsBulkTriageEvent eventsItem) {
    this.events.add(eventsItem);
    this.unparsed |= eventsItem.unparsed;
    return this;
  }

  /**
   * The list of updated signals.
   *
   * @return events
   */
  @JsonProperty(JSON_PROPERTY_EVENTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<SecurityMonitoringSignalsBulkTriageEvent> getEvents() {
    return events;
  }

  public void setEvents(List<SecurityMonitoringSignalsBulkTriageEvent> events) {
    this.events = events;
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
   * @return SecurityMonitoringSignalsBulkTriageUpdateResult
   */
  @JsonAnySetter
  public SecurityMonitoringSignalsBulkTriageUpdateResult putAdditionalProperty(
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

  /** Return true if this SecurityMonitoringSignalsBulkTriageUpdateResult object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityMonitoringSignalsBulkTriageUpdateResult
        securityMonitoringSignalsBulkTriageUpdateResult =
            (SecurityMonitoringSignalsBulkTriageUpdateResult) o;
    return Objects.equals(this.count, securityMonitoringSignalsBulkTriageUpdateResult.count)
        && Objects.equals(this.events, securityMonitoringSignalsBulkTriageUpdateResult.events)
        && Objects.equals(
            this.additionalProperties,
            securityMonitoringSignalsBulkTriageUpdateResult.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, events, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityMonitoringSignalsBulkTriageUpdateResult {\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
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
