/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1_20270101.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonPropertyOrder({
  TimeseriesXAxisDateFormat.JSON_PROPERTY_DAY,
  TimeseriesXAxisDateFormat.JSON_PROPERTY_MONTH
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TimeseriesXAxisDateFormat {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DAY = "day";
  private TimeseriesXAxisDayDateFormat day;

  public static final String JSON_PROPERTY_MONTH = "month";
  private TimeseriesXAxisMonthDateFormat month;

  public TimeseriesXAxisDateFormat day(TimeseriesXAxisDayDateFormat day) {
    this.day = day;
    this.unparsed |= !day.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return day
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TimeseriesXAxisDayDateFormat getDay() {
    return day;
  }

  public void setDay(TimeseriesXAxisDayDateFormat day) {
    if (!day.isValid()) {
      this.unparsed = true;
    }
    this.day = day;
  }

  public TimeseriesXAxisDateFormat month(TimeseriesXAxisMonthDateFormat month) {
    this.month = month;
    this.unparsed |= !month.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return month
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MONTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TimeseriesXAxisMonthDateFormat getMonth() {
    return month;
  }

  public void setMonth(TimeseriesXAxisMonthDateFormat month) {
    if (!month.isValid()) {
      this.unparsed = true;
    }
    this.month = month;
  }

  /** Return true if this TimeseriesXAxisDateFormat object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeseriesXAxisDateFormat timeseriesXAxisDateFormat = (TimeseriesXAxisDateFormat) o;
    return Objects.equals(this.day, timeseriesXAxisDateFormat.day)
        && Objects.equals(this.month, timeseriesXAxisDateFormat.month);
  }

  @Override
  public int hashCode() {
    return Objects.hash(day, month);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeseriesXAxisDateFormat {\n");
    sb.append("    day: ").append(toIndentedString(day)).append("\n");
    sb.append("    month: ").append(toIndentedString(month)).append("\n");
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
