/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/**
 * Configuration options for the evaluation window. If <code>hour_starts</code> is set, no other
 * fields may be set. Otherwise, <code>day_starts</code> and <code>month_starts</code> must be set
 * together.
 */
@JsonPropertyOrder({
  MonitorOptionsSchedulingOptionsEvaluationWindow.JSON_PROPERTY_DAY_STARTS,
  MonitorOptionsSchedulingOptionsEvaluationWindow.JSON_PROPERTY_HOUR_STARTS,
  MonitorOptionsSchedulingOptionsEvaluationWindow.JSON_PROPERTY_MONTH_STARTS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class MonitorOptionsSchedulingOptionsEvaluationWindow {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DAY_STARTS = "day_starts";
  private String dayStarts;

  public static final String JSON_PROPERTY_HOUR_STARTS = "hour_starts";
  private Integer hourStarts;

  public static final String JSON_PROPERTY_MONTH_STARTS = "month_starts";
  private Integer monthStarts;

  public MonitorOptionsSchedulingOptionsEvaluationWindow dayStarts(String dayStarts) {
    this.dayStarts = dayStarts;
    return this;
  }

  /**
   * The time of the day at which a one day cumulative evaluation window starts. Must be defined in
   * UTC time in <code>HH:mm</code> format.
   *
   * @return dayStarts
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DAY_STARTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDayStarts() {
    return dayStarts;
  }

  public void setDayStarts(String dayStarts) {
    this.dayStarts = dayStarts;
  }

  public MonitorOptionsSchedulingOptionsEvaluationWindow hourStarts(Integer hourStarts) {
    this.hourStarts = hourStarts;
    return this;
  }

  /**
   * The minute of the hour at which a one hour cumulative evaluation window starts. minimum: 0
   * maximum: 59
   *
   * @return hourStarts
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HOUR_STARTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getHourStarts() {
    return hourStarts;
  }

  public void setHourStarts(Integer hourStarts) {
    this.hourStarts = hourStarts;
  }

  public MonitorOptionsSchedulingOptionsEvaluationWindow monthStarts(Integer monthStarts) {
    this.monthStarts = monthStarts;
    return this;
  }

  /**
   * The day of the month at which a one month cumulative evaluation window starts. minimum: 1
   * maximum: 1
   *
   * @return monthStarts
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MONTH_STARTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getMonthStarts() {
    return monthStarts;
  }

  public void setMonthStarts(Integer monthStarts) {
    this.monthStarts = monthStarts;
  }

  /** Return true if this MonitorOptionsSchedulingOptionsEvaluationWindow object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MonitorOptionsSchedulingOptionsEvaluationWindow
        monitorOptionsSchedulingOptionsEvaluationWindow =
            (MonitorOptionsSchedulingOptionsEvaluationWindow) o;
    return Objects.equals(this.dayStarts, monitorOptionsSchedulingOptionsEvaluationWindow.dayStarts)
        && Objects.equals(
            this.hourStarts, monitorOptionsSchedulingOptionsEvaluationWindow.hourStarts)
        && Objects.equals(
            this.monthStarts, monitorOptionsSchedulingOptionsEvaluationWindow.monthStarts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dayStarts, hourStarts, monthStarts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonitorOptionsSchedulingOptionsEvaluationWindow {\n");
    sb.append("    dayStarts: ").append(toIndentedString(dayStarts)).append("\n");
    sb.append("    hourStarts: ").append(toIndentedString(hourStarts)).append("\n");
    sb.append("    monthStarts: ").append(toIndentedString(monthStarts)).append("\n");
    sb.append("}");
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
