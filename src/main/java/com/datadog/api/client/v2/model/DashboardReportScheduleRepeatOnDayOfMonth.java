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
 * Defines which day of the month to send the monthly report. If the frequency field uses months
 * (for example, <code>1mo</code>), this field is required. If the frequency field does not use
 * months (for example <code>1d</code>, <code>1w</code>), then this field must be <code>null</code>
 * (if provided). If this field is not provided in an update request, and the update request changes
 * the frequency to use days or weeks (for example, <code>1d</code>, <code>1w</code>), then this
 * field is automatically set to <code>null</code>. This field is mutually exclusive with <code>
 * repeat_on_day_of_week</code>, and cannot be defined in the same request that includes a non-null
 * value for <code>repeat_on_day_of_week</code>.
 */
@JsonSerialize(
    using =
        DashboardReportScheduleRepeatOnDayOfMonth
            .DashboardReportScheduleRepeatOnDayOfMonthSerializer.class)
public class DashboardReportScheduleRepeatOnDayOfMonth {

  public static final DashboardReportScheduleRepeatOnDayOfMonth
      DASHBOARD_REPORT_SCHEDULE_REPEAT_ON_DAY_OF_MONTH_1ST =
          new DashboardReportScheduleRepeatOnDayOfMonth("1st");
  public static final DashboardReportScheduleRepeatOnDayOfMonth
      DASHBOARD_REPORT_SCHEDULE_REPEAT_ON_DAY_OF_MONTH_15TH =
          new DashboardReportScheduleRepeatOnDayOfMonth("15th");

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("1st", "15th"));

  private String value;

  public boolean isValid() {
    return allowedValues.contains(this.value);
  }

  DashboardReportScheduleRepeatOnDayOfMonth(String value) {
    this.value = value;
  }

  public static class DashboardReportScheduleRepeatOnDayOfMonthSerializer
      extends StdSerializer<DashboardReportScheduleRepeatOnDayOfMonth> {
    public DashboardReportScheduleRepeatOnDayOfMonthSerializer(
        Class<DashboardReportScheduleRepeatOnDayOfMonth> t) {
      super(t);
    }

    public DashboardReportScheduleRepeatOnDayOfMonthSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        DashboardReportScheduleRepeatOnDayOfMonth value,
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

  /** Return true if this DashboardReportScheduleRepeatOnDayOfMonth object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return this.value.equals(((DashboardReportScheduleRepeatOnDayOfMonth) o).value);
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
  public static DashboardReportScheduleRepeatOnDayOfMonth fromValue(String value) {
    return new DashboardReportScheduleRepeatOnDayOfMonth(value);
  }
}
