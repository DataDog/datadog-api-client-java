/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** Report schedule-specific configuration that defines when and how often a report is sent. */
@JsonPropertyOrder({
  DashboardReportSchedule.JSON_PROPERTY_ACTIVE,
  DashboardReportSchedule.JSON_PROPERTY_FREQUENCY,
  DashboardReportSchedule.JSON_PROPERTY_REPEAT_AT,
  DashboardReportSchedule.JSON_PROPERTY_REPEAT_ON_DAY_OF_MONTH,
  DashboardReportSchedule.JSON_PROPERTY_REPEAT_ON_DAY_OF_WEEK,
  DashboardReportSchedule.JSON_PROPERTY_TIMEZONE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DashboardReportSchedule {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACTIVE = "active";
  private Boolean active;

  public static final String JSON_PROPERTY_FREQUENCY = "frequency";
  private DashboardReportScheduleFrequency frequency;

  public static final String JSON_PROPERTY_REPEAT_AT = "repeat_at";
  private DashboardReportScheduleRepeatAt repeatAt;

  public static final String JSON_PROPERTY_REPEAT_ON_DAY_OF_MONTH = "repeat_on_day_of_month";
  private JsonNullable<DashboardReportScheduleRepeatOnDayOfMonth> repeatOnDayOfMonth =
      JsonNullable.<DashboardReportScheduleRepeatOnDayOfMonth>undefined();

  public static final String JSON_PROPERTY_REPEAT_ON_DAY_OF_WEEK = "repeat_on_day_of_week";
  private JsonNullable<DashboardReportScheduleRepeatOnDayOfWeek> repeatOnDayOfWeek =
      JsonNullable.<DashboardReportScheduleRepeatOnDayOfWeek>undefined();

  public static final String JSON_PROPERTY_TIMEZONE = "timezone";
  private String timezone;

  public DashboardReportSchedule active(Boolean active) {
    this.active = active;
    return this;
  }

  /**
   * Enables or disables automatic report sending as configured in the report's schedule. If set to
   * <code>false</code>, schedule is paused and reports are not sent.
   *
   * @return active
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public DashboardReportSchedule frequency(DashboardReportScheduleFrequency frequency) {
    this.frequency = frequency;
    this.unparsed |= !frequency.isValid();
    return this;
  }

  /**
   * Frequency with which to send the report.
   *
   * @return frequency
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FREQUENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public DashboardReportScheduleFrequency getFrequency() {
    return frequency;
  }

  public void setFrequency(DashboardReportScheduleFrequency frequency) {
    if (!frequency.isValid()) {
      this.unparsed = true;
    }
    this.frequency = frequency;
  }

  public DashboardReportSchedule repeatAt(DashboardReportScheduleRepeatAt repeatAt) {
    this.repeatAt = repeatAt;
    this.unparsed |= !repeatAt.isValid();
    return this;
  }

  /**
   * ISO8601 formatted time (HH:MM) to send the report, using the time zone specified in the <code>
   * timezone</code> field.
   *
   * @return repeatAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REPEAT_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public DashboardReportScheduleRepeatAt getRepeatAt() {
    return repeatAt;
  }

  public void setRepeatAt(DashboardReportScheduleRepeatAt repeatAt) {
    if (!repeatAt.isValid()) {
      this.unparsed = true;
    }
    this.repeatAt = repeatAt;
  }

  public DashboardReportSchedule repeatOnDayOfMonth(
      DashboardReportScheduleRepeatOnDayOfMonth repeatOnDayOfMonth) {
    this.repeatOnDayOfMonth =
        JsonNullable.<DashboardReportScheduleRepeatOnDayOfMonth>of(repeatOnDayOfMonth);
    return this;
  }

  /**
   * Defines which day of the month to send the monthly report. If the frequency field uses months
   * (for example, <code>1mo</code>), this field is required. If the frequency field does not use
   * months (for example <code>1d</code>, <code>1w</code>), then this field must be <code>null
   * </code> (if provided). If this field is not provided in an update request, and the update
   * request changes the frequency to use days or weeks (for example, <code>1d</code>, <code>1w
   * </code>), then this field is automatically set to <code>null</code>. This field is mutually
   * exclusive with <code>repeat_on_day_of_week</code>, and cannot be defined in the same request
   * that includes a non-null value for <code>repeat_on_day_of_week</code>.
   *
   * @return repeatOnDayOfMonth
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public DashboardReportScheduleRepeatOnDayOfMonth getRepeatOnDayOfMonth() {
    return repeatOnDayOfMonth.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_REPEAT_ON_DAY_OF_MONTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<DashboardReportScheduleRepeatOnDayOfMonth>
      getRepeatOnDayOfMonth_JsonNullable() {
    return repeatOnDayOfMonth;
  }

  @JsonProperty(JSON_PROPERTY_REPEAT_ON_DAY_OF_MONTH)
  public void setRepeatOnDayOfMonth_JsonNullable(
      JsonNullable<DashboardReportScheduleRepeatOnDayOfMonth> repeatOnDayOfMonth) {
    this.repeatOnDayOfMonth = repeatOnDayOfMonth;
  }

  public void setRepeatOnDayOfMonth(DashboardReportScheduleRepeatOnDayOfMonth repeatOnDayOfMonth) {
    if (!repeatOnDayOfMonth.isValid()) {
      this.unparsed = true;
    }
    this.repeatOnDayOfMonth =
        JsonNullable.<DashboardReportScheduleRepeatOnDayOfMonth>of(repeatOnDayOfMonth);
  }

  public DashboardReportSchedule repeatOnDayOfWeek(
      DashboardReportScheduleRepeatOnDayOfWeek repeatOnDayOfWeek) {
    this.repeatOnDayOfWeek =
        JsonNullable.<DashboardReportScheduleRepeatOnDayOfWeek>of(repeatOnDayOfWeek);
    return this;
  }

  /**
   * Defines which day of the week to send the weekly report. If the frequency field uses weeks
   * (such as <code>1w</code>), this field is required and defines which day of the week to send the
   * report. If the frequency field does not use weeks (for example, <code>1d</code>, <code>1mo
   * </code>), then this field must be <code>null</code> (if provided). If this field is not
   * provided in an update request, and the update request changes the frequency to use days or
   * months (for example, <code>1d</code>, <code>1mo</code>), then this field is automatically set
   * to <code>null</code>. This field is mutually exclusive with <code>repeat_on_day_of_month</code>
   * and cannot be defined in the same request that includes a non-null value for <code>
   * repeat_on_day_of_month</code>.
   *
   * @return repeatOnDayOfWeek
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public DashboardReportScheduleRepeatOnDayOfWeek getRepeatOnDayOfWeek() {
    return repeatOnDayOfWeek.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_REPEAT_ON_DAY_OF_WEEK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<DashboardReportScheduleRepeatOnDayOfWeek>
      getRepeatOnDayOfWeek_JsonNullable() {
    return repeatOnDayOfWeek;
  }

  @JsonProperty(JSON_PROPERTY_REPEAT_ON_DAY_OF_WEEK)
  public void setRepeatOnDayOfWeek_JsonNullable(
      JsonNullable<DashboardReportScheduleRepeatOnDayOfWeek> repeatOnDayOfWeek) {
    this.repeatOnDayOfWeek = repeatOnDayOfWeek;
  }

  public void setRepeatOnDayOfWeek(DashboardReportScheduleRepeatOnDayOfWeek repeatOnDayOfWeek) {
    if (!repeatOnDayOfWeek.isValid()) {
      this.unparsed = true;
    }
    this.repeatOnDayOfWeek =
        JsonNullable.<DashboardReportScheduleRepeatOnDayOfWeek>of(repeatOnDayOfWeek);
  }

  public DashboardReportSchedule timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

  /**
   * Time zone to use for repeat_at. Must be a valid Time Zone Database
   * (https://www.iana.org/time-zones) name
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

  /** Return true if this DashboardReportSchedule object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DashboardReportSchedule dashboardReportSchedule = (DashboardReportSchedule) o;
    return Objects.equals(this.active, dashboardReportSchedule.active)
        && Objects.equals(this.frequency, dashboardReportSchedule.frequency)
        && Objects.equals(this.repeatAt, dashboardReportSchedule.repeatAt)
        && Objects.equals(this.repeatOnDayOfMonth, dashboardReportSchedule.repeatOnDayOfMonth)
        && Objects.equals(this.repeatOnDayOfWeek, dashboardReportSchedule.repeatOnDayOfWeek)
        && Objects.equals(this.timezone, dashboardReportSchedule.timezone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        active, frequency, repeatAt, repeatOnDayOfMonth, repeatOnDayOfWeek, timezone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DashboardReportSchedule {\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    repeatAt: ").append(toIndentedString(repeatAt)).append("\n");
    sb.append("    repeatOnDayOfMonth: ").append(toIndentedString(repeatOnDayOfMonth)).append("\n");
    sb.append("    repeatOnDayOfWeek: ").append(toIndentedString(repeatOnDayOfWeek)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
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
