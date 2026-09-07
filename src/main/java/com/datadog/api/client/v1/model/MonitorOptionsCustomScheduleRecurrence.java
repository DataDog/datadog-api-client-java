/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Configuration for a recurrence set on the monitor options for custom schedule. */
@JsonPropertyOrder({
  MonitorOptionsCustomScheduleRecurrence.JSON_PROPERTY_RRULE,
  MonitorOptionsCustomScheduleRecurrence.JSON_PROPERTY_START,
  MonitorOptionsCustomScheduleRecurrence.JSON_PROPERTY_TIMEZONE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class MonitorOptionsCustomScheduleRecurrence {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_RRULE = "rrule";
  private String rrule;

  public static final String JSON_PROPERTY_START = "start";
  private String start;

  public static final String JSON_PROPERTY_TIMEZONE = "timezone";
  private String timezone;

  public MonitorOptionsCustomScheduleRecurrence rrule(String rrule) {
    this.rrule = rrule;
    return this;
  }

  /**
   * Defines the recurrence rule (RRULE) for a given schedule.
   *
   * @return rrule
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RRULE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getRrule() {
    return rrule;
  }

  public void setRrule(String rrule) {
    this.rrule = rrule;
  }

  public MonitorOptionsCustomScheduleRecurrence start(String start) {
    this.start = start;
    return this;
  }

  /**
   * Defines the start date and time of the recurring schedule.
   *
   * @return start
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_START)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getStart() {
    return start;
  }

  public void setStart(String start) {
    this.start = start;
  }

  public MonitorOptionsCustomScheduleRecurrence timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

  /**
   * Defines the timezone the schedule runs on.
   *
   * @return timezone
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIMEZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTimezone() {
    return timezone;
  }

  public void setTimezone(String timezone) {
    this.timezone = timezone;
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
   * @return MonitorOptionsCustomScheduleRecurrence
   */
  @JsonAnySetter
  public MonitorOptionsCustomScheduleRecurrence putAdditionalProperty(String key, Object value) {
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

  /** Return true if this MonitorOptionsCustomScheduleRecurrence object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MonitorOptionsCustomScheduleRecurrence monitorOptionsCustomScheduleRecurrence =
        (MonitorOptionsCustomScheduleRecurrence) o;
    return Objects.equals(this.rrule, monitorOptionsCustomScheduleRecurrence.rrule)
        && Objects.equals(this.start, monitorOptionsCustomScheduleRecurrence.start)
        && Objects.equals(this.timezone, monitorOptionsCustomScheduleRecurrence.timezone)
        && Objects.equals(
            this.additionalProperties, monitorOptionsCustomScheduleRecurrence.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rrule, start, timezone, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonitorOptionsCustomScheduleRecurrence {\n");
    sb.append("    rrule: ").append(toIndentedString(rrule)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
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
