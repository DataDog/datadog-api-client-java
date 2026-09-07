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

/** A specific date and time used to define the start or end of a Synthetics downtime time slot. */
@JsonPropertyOrder({
  SyntheticsDowntimeTimeSlotDate.JSON_PROPERTY_DAY,
  SyntheticsDowntimeTimeSlotDate.JSON_PROPERTY_HOUR,
  SyntheticsDowntimeTimeSlotDate.JSON_PROPERTY_MINUTE,
  SyntheticsDowntimeTimeSlotDate.JSON_PROPERTY_MONTH,
  SyntheticsDowntimeTimeSlotDate.JSON_PROPERTY_YEAR
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsDowntimeTimeSlotDate {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DAY = "day";
  private Long day;

  public static final String JSON_PROPERTY_HOUR = "hour";
  private Long hour;

  public static final String JSON_PROPERTY_MINUTE = "minute";
  private Long minute;

  public static final String JSON_PROPERTY_MONTH = "month";
  private Long month;

  public static final String JSON_PROPERTY_YEAR = "year";
  private Long year;

  public SyntheticsDowntimeTimeSlotDate() {}

  @JsonCreator
  public SyntheticsDowntimeTimeSlotDate(
      @JsonProperty(required = true, value = JSON_PROPERTY_DAY) Long day,
      @JsonProperty(required = true, value = JSON_PROPERTY_HOUR) Long hour,
      @JsonProperty(required = true, value = JSON_PROPERTY_MINUTE) Long minute,
      @JsonProperty(required = true, value = JSON_PROPERTY_MONTH) Long month,
      @JsonProperty(required = true, value = JSON_PROPERTY_YEAR) Long year) {
    this.day = day;
    this.hour = hour;
    this.minute = minute;
    this.month = month;
    this.year = year;
  }

  public SyntheticsDowntimeTimeSlotDate day(Long day) {
    this.day = day;
    return this;
  }

  /**
   * The day component of the date (1-31).
   *
   * @return day
   */
  @JsonProperty(JSON_PROPERTY_DAY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getDay() {
    return day;
  }

  public void setDay(Long day) {
    this.day = day;
  }

  public SyntheticsDowntimeTimeSlotDate hour(Long hour) {
    this.hour = hour;
    return this;
  }

  /**
   * The hour component of the time (0-23).
   *
   * @return hour
   */
  @JsonProperty(JSON_PROPERTY_HOUR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getHour() {
    return hour;
  }

  public void setHour(Long hour) {
    this.hour = hour;
  }

  public SyntheticsDowntimeTimeSlotDate minute(Long minute) {
    this.minute = minute;
    return this;
  }

  /**
   * The minute component of the time (0-59).
   *
   * @return minute
   */
  @JsonProperty(JSON_PROPERTY_MINUTE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getMinute() {
    return minute;
  }

  public void setMinute(Long minute) {
    this.minute = minute;
  }

  public SyntheticsDowntimeTimeSlotDate month(Long month) {
    this.month = month;
    return this;
  }

  /**
   * The month component of the date (1-12).
   *
   * @return month
   */
  @JsonProperty(JSON_PROPERTY_MONTH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getMonth() {
    return month;
  }

  public void setMonth(Long month) {
    this.month = month;
  }

  public SyntheticsDowntimeTimeSlotDate year(Long year) {
    this.year = year;
    return this;
  }

  /**
   * The year component of the date.
   *
   * @return year
   */
  @JsonProperty(JSON_PROPERTY_YEAR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getYear() {
    return year;
  }

  public void setYear(Long year) {
    this.year = year;
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
   * @return SyntheticsDowntimeTimeSlotDate
   */
  @JsonAnySetter
  public SyntheticsDowntimeTimeSlotDate putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SyntheticsDowntimeTimeSlotDate object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsDowntimeTimeSlotDate syntheticsDowntimeTimeSlotDate =
        (SyntheticsDowntimeTimeSlotDate) o;
    return Objects.equals(this.day, syntheticsDowntimeTimeSlotDate.day)
        && Objects.equals(this.hour, syntheticsDowntimeTimeSlotDate.hour)
        && Objects.equals(this.minute, syntheticsDowntimeTimeSlotDate.minute)
        && Objects.equals(this.month, syntheticsDowntimeTimeSlotDate.month)
        && Objects.equals(this.year, syntheticsDowntimeTimeSlotDate.year)
        && Objects.equals(
            this.additionalProperties, syntheticsDowntimeTimeSlotDate.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(day, hour, minute, month, year, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsDowntimeTimeSlotDate {\n");
    sb.append("    day: ").append(toIndentedString(day)).append("\n");
    sb.append("    hour: ").append(toIndentedString(hour)).append("\n");
    sb.append("    minute: ").append(toIndentedString(minute)).append("\n");
    sb.append("    month: ").append(toIndentedString(month)).append("\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
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
