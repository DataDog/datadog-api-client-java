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

/** Recurrence settings returned in a Synthetics downtime time slot response. */
@JsonPropertyOrder({
  SyntheticsDowntimeTimeSlotRecurrenceResponse.JSON_PROPERTY_FREQUENCY,
  SyntheticsDowntimeTimeSlotRecurrenceResponse.JSON_PROPERTY_INTERVAL,
  SyntheticsDowntimeTimeSlotRecurrenceResponse.JSON_PROPERTY_UNTIL,
  SyntheticsDowntimeTimeSlotRecurrenceResponse.JSON_PROPERTY_WEEKDAYS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsDowntimeTimeSlotRecurrenceResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FREQUENCY = "frequency";
  private SyntheticsDowntimeFrequency frequency;

  public static final String JSON_PROPERTY_INTERVAL = "interval";
  private Long interval;

  public static final String JSON_PROPERTY_UNTIL = "until";
  private SyntheticsDowntimeTimeSlotDate until;

  public static final String JSON_PROPERTY_WEEKDAYS = "weekdays";
  private List<SyntheticsDowntimeWeekday> weekdays = new ArrayList<>();

  public SyntheticsDowntimeTimeSlotRecurrenceResponse() {}

  @JsonCreator
  public SyntheticsDowntimeTimeSlotRecurrenceResponse(
      @JsonProperty(required = true, value = JSON_PROPERTY_FREQUENCY)
          SyntheticsDowntimeFrequency frequency,
      @JsonProperty(required = true, value = JSON_PROPERTY_INTERVAL) Long interval,
      @JsonProperty(required = true, value = JSON_PROPERTY_WEEKDAYS)
          List<SyntheticsDowntimeWeekday> weekdays) {
    this.frequency = frequency;
    this.unparsed |= !frequency.isValid();
    this.interval = interval;
    this.weekdays = weekdays;
  }

  public SyntheticsDowntimeTimeSlotRecurrenceResponse frequency(
      SyntheticsDowntimeFrequency frequency) {
    this.frequency = frequency;
    this.unparsed |= !frequency.isValid();
    return this;
  }

  /**
   * The recurrence frequency of a Synthetics downtime time slot.
   *
   * @return frequency
   */
  @JsonProperty(JSON_PROPERTY_FREQUENCY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SyntheticsDowntimeFrequency getFrequency() {
    return frequency;
  }

  public void setFrequency(SyntheticsDowntimeFrequency frequency) {
    if (!frequency.isValid()) {
      this.unparsed = true;
    }
    this.frequency = frequency;
  }

  public SyntheticsDowntimeTimeSlotRecurrenceResponse interval(Long interval) {
    this.interval = interval;
    return this;
  }

  /**
   * The interval between recurrences, relative to the frequency.
   *
   * @return interval
   */
  @JsonProperty(JSON_PROPERTY_INTERVAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getInterval() {
    return interval;
  }

  public void setInterval(Long interval) {
    this.interval = interval;
  }

  public SyntheticsDowntimeTimeSlotRecurrenceResponse until(SyntheticsDowntimeTimeSlotDate until) {
    this.until = until;
    this.unparsed |= until.unparsed;
    return this;
  }

  /**
   * A specific date and time used to define the start or end of a Synthetics downtime time slot.
   *
   * @return until
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UNTIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsDowntimeTimeSlotDate getUntil() {
    return until;
  }

  public void setUntil(SyntheticsDowntimeTimeSlotDate until) {
    this.until = until;
  }

  public SyntheticsDowntimeTimeSlotRecurrenceResponse weekdays(
      List<SyntheticsDowntimeWeekday> weekdays) {
    this.weekdays = weekdays;
    return this;
  }

  public SyntheticsDowntimeTimeSlotRecurrenceResponse addWeekdaysItem(
      SyntheticsDowntimeWeekday weekdaysItem) {
    this.weekdays.add(weekdaysItem);
    this.unparsed |= !weekdaysItem.isValid();
    return this;
  }

  /**
   * Days of the week for a Synthetics downtime recurrence schedule.
   *
   * @return weekdays
   */
  @JsonProperty(JSON_PROPERTY_WEEKDAYS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<SyntheticsDowntimeWeekday> getWeekdays() {
    return weekdays;
  }

  public void setWeekdays(List<SyntheticsDowntimeWeekday> weekdays) {
    this.weekdays = weekdays;
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
   * @return SyntheticsDowntimeTimeSlotRecurrenceResponse
   */
  @JsonAnySetter
  public SyntheticsDowntimeTimeSlotRecurrenceResponse putAdditionalProperty(
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

  /** Return true if this SyntheticsDowntimeTimeSlotRecurrenceResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsDowntimeTimeSlotRecurrenceResponse syntheticsDowntimeTimeSlotRecurrenceResponse =
        (SyntheticsDowntimeTimeSlotRecurrenceResponse) o;
    return Objects.equals(this.frequency, syntheticsDowntimeTimeSlotRecurrenceResponse.frequency)
        && Objects.equals(this.interval, syntheticsDowntimeTimeSlotRecurrenceResponse.interval)
        && Objects.equals(this.until, syntheticsDowntimeTimeSlotRecurrenceResponse.until)
        && Objects.equals(this.weekdays, syntheticsDowntimeTimeSlotRecurrenceResponse.weekdays)
        && Objects.equals(
            this.additionalProperties,
            syntheticsDowntimeTimeSlotRecurrenceResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(frequency, interval, until, weekdays, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsDowntimeTimeSlotRecurrenceResponse {\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    until: ").append(toIndentedString(until)).append("\n");
    sb.append("    weekdays: ").append(toIndentedString(weekdays)).append("\n");
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
