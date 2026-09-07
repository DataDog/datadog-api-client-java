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
   * <p>Defines a single time restriction rule with start and end times and the applicable weekdays.</p>
 */
@JsonPropertyOrder({
  TimeRestriction.JSON_PROPERTY_END_DAY,
  TimeRestriction.JSON_PROPERTY_END_TIME,
  TimeRestriction.JSON_PROPERTY_START_DAY,
  TimeRestriction.JSON_PROPERTY_START_TIME
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TimeRestriction {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_END_DAY = "end_day";
  private Weekday endDay;

  public static final String JSON_PROPERTY_END_TIME = "end_time";
  private String endTime;

  public static final String JSON_PROPERTY_START_DAY = "start_day";
  private Weekday startDay;

  public static final String JSON_PROPERTY_START_TIME = "start_time";
  private String startTime;

  public TimeRestriction endDay(Weekday endDay) {
    this.endDay = endDay;
    this.unparsed |= !endDay.isValid();
    return this;
  }

  /**
   * <p>A day of the week.</p>
   * @return endDay
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_END_DAY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Weekday getEndDay() {
        return endDay;
      }
  public void setEndDay(Weekday endDay) {
    if (!endDay.isValid()) {
        this.unparsed = true;
    }
    this.endDay = endDay;
  }
  public TimeRestriction endTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * <p>Specifies the ending time for this restriction.</p>
   * @return endTime
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_END_TIME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getEndTime() {
        return endTime;
      }
  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }
  public TimeRestriction startDay(Weekday startDay) {
    this.startDay = startDay;
    this.unparsed |= !startDay.isValid();
    return this;
  }

  /**
   * <p>A day of the week.</p>
   * @return startDay
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_START_DAY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Weekday getStartDay() {
        return startDay;
      }
  public void setStartDay(Weekday startDay) {
    if (!startDay.isValid()) {
        this.unparsed = true;
    }
    this.startDay = startDay;
  }
  public TimeRestriction startTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * <p>Specifies the starting time for this restriction.</p>
   * @return startTime
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_START_TIME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getStartTime() {
        return startTime;
      }
  public void setStartTime(String startTime) {
    this.startTime = startTime;
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
   * @return TimeRestriction
   */
  @JsonAnySetter
  public TimeRestriction putAdditionalProperty(String key, Object value) {
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
   * Return true if this TimeRestriction object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeRestriction timeRestriction = (TimeRestriction) o;
    return Objects.equals(this.endDay, timeRestriction.endDay) && Objects.equals(this.endTime, timeRestriction.endTime) && Objects.equals(this.startDay, timeRestriction.startDay) && Objects.equals(this.startTime, timeRestriction.startTime) && Objects.equals(this.additionalProperties, timeRestriction.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(endDay,endTime,startDay,startTime, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeRestriction {\n");
    sb.append("    endDay: ").append(toIndentedString(endDay)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    startDay: ").append(toIndentedString(startDay)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
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
