/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * Defines which day of the week to send the weekly report. If the frequency field uses weeks (such
 * as <code>1w</code>), this field is required and defines which day of the week to send the report.
 * If the frequency field does not use weeks (for example, <code>1d</code>, <code>1mo</code>), then
 * this field must be <code>null</code> (if provided). If this field is not provided in an update
 * request, and the update request changes the frequency to use days or months (for example, <code>
 * 1d</code>, <code>1mo</code>), then this field is automatically set to <code>null</code>. This
 * field is mutually exclusive with <code>repeat_on_day_of_month</code> and cannot be defined in the
 * same request that includes a non-null value for <code>repeat_on_day_of_month</code>.
 */
@JsonSerialize(
    using =
        DashboardReportScheduleRepeatOnDayOfWeek.DashboardReportScheduleRepeatOnDayOfWeekSerializer
            .class)
public class DashboardReportScheduleRepeatOnDayOfWeek {

  public static final DashboardReportScheduleRepeatOnDayOfWeek
      DASHBOARD_REPORT_SCHEDULE_REPEAT_ON_DAY_OF_WEEK_MONDAY =
          new DashboardReportScheduleRepeatOnDayOfWeek("Monday");
  public static final DashboardReportScheduleRepeatOnDayOfWeek
      DASHBOARD_REPORT_SCHEDULE_REPEAT_ON_DAY_OF_WEEK_TUESDAY =
          new DashboardReportScheduleRepeatOnDayOfWeek("Tuesday");
  public static final DashboardReportScheduleRepeatOnDayOfWeek
      DASHBOARD_REPORT_SCHEDULE_REPEAT_ON_DAY_OF_WEEK_WEDNESDAY =
          new DashboardReportScheduleRepeatOnDayOfWeek("Wednesday");
  public static final DashboardReportScheduleRepeatOnDayOfWeek
      DASHBOARD_REPORT_SCHEDULE_REPEAT_ON_DAY_OF_WEEK_THURSDAY =
          new DashboardReportScheduleRepeatOnDayOfWeek("Thursday");
  public static final DashboardReportScheduleRepeatOnDayOfWeek
      DASHBOARD_REPORT_SCHEDULE_REPEAT_ON_DAY_OF_WEEK_FRIDAY =
          new DashboardReportScheduleRepeatOnDayOfWeek("Friday");
  public static final DashboardReportScheduleRepeatOnDayOfWeek
      DASHBOARD_REPORT_SCHEDULE_REPEAT_ON_DAY_OF_WEEK_SATURDAY =
          new DashboardReportScheduleRepeatOnDayOfWeek("Saturday");
  public static final DashboardReportScheduleRepeatOnDayOfWeek
      DASHBOARD_REPORT_SCHEDULE_REPEAT_ON_DAY_OF_WEEK_SUNDAY =
          new DashboardReportScheduleRepeatOnDayOfWeek("Sunday");

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"));

  private String value;

  public boolean isValid() {
    return allowedValues.contains(this.value);
  }

  DashboardReportScheduleRepeatOnDayOfWeek(String value) {
    this.value = value;
  }

  public static class DashboardReportScheduleRepeatOnDayOfWeekSerializer
      extends StdSerializer<DashboardReportScheduleRepeatOnDayOfWeek> {
    public DashboardReportScheduleRepeatOnDayOfWeekSerializer(
        Class<DashboardReportScheduleRepeatOnDayOfWeek> t) {
      super(t);
    }

    public DashboardReportScheduleRepeatOnDayOfWeekSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        DashboardReportScheduleRepeatOnDayOfWeek value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonValue
  public String getValue() {
    return this.value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  /** Return true if this DashboardReportScheduleRepeatOnDayOfWeek object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return this.value.equals(((DashboardReportScheduleRepeatOnDayOfWeek) o).value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value);
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static DashboardReportScheduleRepeatOnDayOfWeek fromValue(String value) {
    return new DashboardReportScheduleRepeatOnDayOfWeek(value);
  }
}
