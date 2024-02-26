/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** An RRULE-based recurring downtime. */
@JsonPropertyOrder({
  DowntimeScheduleRecurrenceResponse.JSON_PROPERTY_DURATION,
  DowntimeScheduleRecurrenceResponse.JSON_PROPERTY_RRULE,
  DowntimeScheduleRecurrenceResponse.JSON_PROPERTY_START
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DowntimeScheduleRecurrenceResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DURATION = "duration";
  private String duration;

  public static final String JSON_PROPERTY_RRULE = "rrule";
  private String rrule;

  public static final String JSON_PROPERTY_START = "start";
  private String start;

  public DowntimeScheduleRecurrenceResponse duration(String duration) {
    this.duration = duration;
    return this;
  }

  /**
   * The length of the downtime. Must begin with an integer and end with one of 'm', 'h', d', or
   * 'w'.
   *
   * @return duration
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDuration() {
    return duration;
  }

  public void setDuration(String duration) {
    this.duration = duration;
  }

  public DowntimeScheduleRecurrenceResponse rrule(String rrule) {
    this.rrule = rrule;
    return this;
  }

  /**
   * The <code>RRULE</code> standard for defining recurring events. For example, to have a recurring
   * event on the first day of each month, set the type to <code>rrule</code> and set the <code>FREQ
   * </code> to <code>MONTHLY</code> and <code>BYMONTHDAY</code> to <code>1</code>. Most common
   * <code>rrule</code> options from the <a href="https://tools.ietf.org/html/rfc5545">iCalendar
   * Spec</a> are supported.
   *
   * <p><strong>Note</strong>: Attributes specifying the duration in <code>RRULE</code> are not
   * supported (for example, <code>DTSTART</code>, <code>DTEND</code>, <code>DURATION</code>). More
   * examples available in this <a
   * href="https://docs.datadoghq.com/monitors/guide/suppress-alert-with-downtimes/?tab=api">downtime
   * guide</a>.
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

  public DowntimeScheduleRecurrenceResponse start(String start) {
    this.start = start;
    return this;
  }

  /**
   * ISO-8601 Datetime to start the downtime. Must not include a UTC offset. If not provided, the
   * downtime starts the moment it is created.
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
   * @return DowntimeScheduleRecurrenceResponse
   */
  @JsonAnySetter
  public DowntimeScheduleRecurrenceResponse putAdditionalProperty(String key, Object value) {
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

  /** Return true if this DowntimeScheduleRecurrenceResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DowntimeScheduleRecurrenceResponse downtimeScheduleRecurrenceResponse =
        (DowntimeScheduleRecurrenceResponse) o;
    return Objects.equals(this.duration, downtimeScheduleRecurrenceResponse.duration)
        && Objects.equals(this.rrule, downtimeScheduleRecurrenceResponse.rrule)
        && Objects.equals(this.start, downtimeScheduleRecurrenceResponse.start)
        && Objects.equals(
            this.additionalProperties, downtimeScheduleRecurrenceResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(duration, rrule, start, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DowntimeScheduleRecurrenceResponse {\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    rrule: ").append(toIndentedString(rrule)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
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
