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

/** A time slot for a Synthetics downtime create or update request. */
@JsonPropertyOrder({
  SyntheticsDowntimeTimeSlotRequest.JSON_PROPERTY_DURATION,
  SyntheticsDowntimeTimeSlotRequest.JSON_PROPERTY_NAME,
  SyntheticsDowntimeTimeSlotRequest.JSON_PROPERTY_RECURRENCE,
  SyntheticsDowntimeTimeSlotRequest.JSON_PROPERTY_START,
  SyntheticsDowntimeTimeSlotRequest.JSON_PROPERTY_TIMEZONE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsDowntimeTimeSlotRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DURATION = "duration";
  private Long duration;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_RECURRENCE = "recurrence";
  private SyntheticsDowntimeTimeSlotRecurrenceRequest recurrence;

  public static final String JSON_PROPERTY_START = "start";
  private SyntheticsDowntimeTimeSlotDate start;

  public static final String JSON_PROPERTY_TIMEZONE = "timezone";
  private String timezone;

  public SyntheticsDowntimeTimeSlotRequest() {}

  @JsonCreator
  public SyntheticsDowntimeTimeSlotRequest(
      @JsonProperty(required = true, value = JSON_PROPERTY_DURATION) Long duration,
      @JsonProperty(required = true, value = JSON_PROPERTY_START)
          SyntheticsDowntimeTimeSlotDate start,
      @JsonProperty(required = true, value = JSON_PROPERTY_TIMEZONE) String timezone) {
    this.duration = duration;
    this.start = start;
    this.unparsed |= start.unparsed;
    this.timezone = timezone;
  }

  public SyntheticsDowntimeTimeSlotRequest duration(Long duration) {
    this.duration = duration;
    return this;
  }

  /**
   * The duration of the time slot in seconds, between 60 and 604800.
   *
   * @return duration
   */
  @JsonProperty(JSON_PROPERTY_DURATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getDuration() {
    return duration;
  }

  public void setDuration(Long duration) {
    this.duration = duration;
  }

  public SyntheticsDowntimeTimeSlotRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * An optional label for the time slot.
   *
   * @return name
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SyntheticsDowntimeTimeSlotRequest recurrence(
      SyntheticsDowntimeTimeSlotRecurrenceRequest recurrence) {
    this.recurrence = recurrence;
    this.unparsed |= recurrence.unparsed;
    return this;
  }

  /**
   * Recurrence settings for a Synthetics downtime time slot.
   *
   * @return recurrence
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RECURRENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsDowntimeTimeSlotRecurrenceRequest getRecurrence() {
    return recurrence;
  }

  public void setRecurrence(SyntheticsDowntimeTimeSlotRecurrenceRequest recurrence) {
    this.recurrence = recurrence;
  }

  public SyntheticsDowntimeTimeSlotRequest start(SyntheticsDowntimeTimeSlotDate start) {
    this.start = start;
    this.unparsed |= start.unparsed;
    return this;
  }

  /**
   * A specific date and time used to define the start or end of a Synthetics downtime time slot.
   *
   * @return start
   */
  @JsonProperty(JSON_PROPERTY_START)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SyntheticsDowntimeTimeSlotDate getStart() {
    return start;
  }

  public void setStart(SyntheticsDowntimeTimeSlotDate start) {
    this.start = start;
  }

  public SyntheticsDowntimeTimeSlotRequest timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

  /**
   * The IANA timezone name for the time slot.
   *
   * @return timezone
   */
  @JsonProperty(JSON_PROPERTY_TIMEZONE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
   * @return SyntheticsDowntimeTimeSlotRequest
   */
  @JsonAnySetter
  public SyntheticsDowntimeTimeSlotRequest putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SyntheticsDowntimeTimeSlotRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsDowntimeTimeSlotRequest syntheticsDowntimeTimeSlotRequest =
        (SyntheticsDowntimeTimeSlotRequest) o;
    return Objects.equals(this.duration, syntheticsDowntimeTimeSlotRequest.duration)
        && Objects.equals(this.name, syntheticsDowntimeTimeSlotRequest.name)
        && Objects.equals(this.recurrence, syntheticsDowntimeTimeSlotRequest.recurrence)
        && Objects.equals(this.start, syntheticsDowntimeTimeSlotRequest.start)
        && Objects.equals(this.timezone, syntheticsDowntimeTimeSlotRequest.timezone)
        && Objects.equals(
            this.additionalProperties, syntheticsDowntimeTimeSlotRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(duration, name, recurrence, start, timezone, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsDowntimeTimeSlotRequest {\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    recurrence: ").append(toIndentedString(recurrence)).append("\n");
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
