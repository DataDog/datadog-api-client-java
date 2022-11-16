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
 * ISO8601 formatted time (HH:MM) to send the report, using the time zone specified in the <code>
 * timezone</code> field.
 */
@JsonSerialize(
    using = DashboardReportScheduleRepeatAt.DashboardReportScheduleRepeatAtSerializer.class)
public class DashboardReportScheduleRepeatAt {

  public static final DashboardReportScheduleRepeatAt DASHBOARD_REPORT_SCHEDULE_REPEAT_AT_00_00 =
      new DashboardReportScheduleRepeatAt("00:00");
  public static final DashboardReportScheduleRepeatAt DASHBOARD_REPORT_SCHEDULE_REPEAT_AT_00_30 =
      new DashboardReportScheduleRepeatAt("00:30");
  public static final DashboardReportScheduleRepeatAt DASHBOARD_REPORT_SCHEDULE_REPEAT_AT_01_00 =
      new DashboardReportScheduleRepeatAt("01:00");
  public static final DashboardReportScheduleRepeatAt DASHBOARD_REPORT_SCHEDULE_REPEAT_AT_01_30 =
      new DashboardReportScheduleRepeatAt("01:30");
  public static final DashboardReportScheduleRepeatAt DASHBOARD_REPORT_SCHEDULE_REPEAT_AT_02_00 =
      new DashboardReportScheduleRepeatAt("02:00");
  public static final DashboardReportScheduleRepeatAt DASHBOARD_REPORT_SCHEDULE_REPEAT_AT_02_30 =
      new DashboardReportScheduleRepeatAt("02:30");
  public static final DashboardReportScheduleRepeatAt DASHBOARD_REPORT_SCHEDULE_REPEAT_AT_03_00 =
      new DashboardReportScheduleRepeatAt("03:00");
  public static final DashboardReportScheduleRepeatAt DASHBOARD_REPORT_SCHEDULE_REPEAT_AT_03_30 =
      new DashboardReportScheduleRepeatAt("03:30");
  public static final DashboardReportScheduleRepeatAt DASHBOARD_REPORT_SCHEDULE_REPEAT_AT_04_00 =
      new DashboardReportScheduleRepeatAt("04:00");
  public static final DashboardReportScheduleRepeatAt DASHBOARD_REPORT_SCHEDULE_REPEAT_AT_04_30 =
      new DashboardReportScheduleRepeatAt("04:30");
  public static final DashboardReportScheduleRepeatAt DASHBOARD_REPORT_SCHEDULE_REPEAT_AT_05_00 =
      new DashboardReportScheduleRepeatAt("05:00");
  public static final DashboardReportScheduleRepeatAt DASHBOARD_REPORT_SCHEDULE_REPEAT_AT_05_30 =
      new DashboardReportScheduleRepeatAt("05:30");
  public static final DashboardReportScheduleRepeatAt DASHBOARD_REPORT_SCHEDULE_REPEAT_AT_06_00 =
      new DashboardReportScheduleRepeatAt("06:00");
  public static final DashboardReportScheduleRepeatAt DASHBOARD_REPORT_SCHEDULE_REPEAT_AT_06_30 =
      new DashboardReportScheduleRepeatAt("06:30");
  public static final DashboardReportScheduleRepeatAt DASHBOARD_REPORT_SCHEDULE_REPEAT_AT_07_00 =
      new DashboardReportScheduleRepeatAt("07:00");
  public static final DashboardReportScheduleRepeatAt DASHBOARD_REPORT_SCHEDULE_REPEAT_AT_07_30 =
      new DashboardReportScheduleRepeatAt("07:30");
  public static final DashboardReportScheduleRepeatAt DASHBOARD_REPORT_SCHEDULE_REPEAT_AT_08_00 =
      new DashboardReportScheduleRepeatAt("08:00");
  public static final DashboardReportScheduleRepeatAt DASHBOARD_REPORT_SCHEDULE_REPEAT_AT_08_30 =
      new DashboardReportScheduleRepeatAt("08:30");
  public static final DashboardReportScheduleRepeatAt DASHBOARD_REPORT_SCHEDULE_REPEAT_AT_09_00 =
      new DashboardReportScheduleRepeatAt("09:00");
  public static final DashboardReportScheduleRepeatAt DASHBOARD_REPORT_SCHEDULE_REPEAT_AT_09_30 =
      new DashboardReportScheduleRepeatAt("09:30");
  public static final DashboardReportScheduleRepeatAt DASHBOARD_REPORT_SCHEDULE_REPEAT_AT_10_00 =
      new DashboardReportScheduleRepeatAt("10:00");
  public static final DashboardReportScheduleRepeatAt DASHBOARD_REPORT_SCHEDULE_REPEAT_AT_10_30 =
      new DashboardReportScheduleRepeatAt("10:30");
  public static final DashboardReportScheduleRepeatAt DASHBOARD_REPORT_SCHEDULE_REPEAT_AT_11_00 =
      new DashboardReportScheduleRepeatAt("11:00");
  public static final DashboardReportScheduleRepeatAt DASHBOARD_REPORT_SCHEDULE_REPEAT_AT_11_30 =
      new DashboardReportScheduleRepeatAt("11:30");
  public static final DashboardReportScheduleRepeatAt DASHBOARD_REPORT_SCHEDULE_REPEAT_AT_12_00 =
      new DashboardReportScheduleRepeatAt("12:00");
  public static final DashboardReportScheduleRepeatAt DASHBOARD_REPORT_SCHEDULE_REPEAT_AT_12_30 =
      new DashboardReportScheduleRepeatAt("12:30");
  public static final DashboardReportScheduleRepeatAt DASHBOARD_REPORT_SCHEDULE_REPEAT_AT_13_00 =
      new DashboardReportScheduleRepeatAt("13:00");
  public static final DashboardReportScheduleRepeatAt DASHBOARD_REPORT_SCHEDULE_REPEAT_AT_13_30 =
      new DashboardReportScheduleRepeatAt("13:30");
  public static final DashboardReportScheduleRepeatAt DASHBOARD_REPORT_SCHEDULE_REPEAT_AT_14_00 =
      new DashboardReportScheduleRepeatAt("14:00");
  public static final DashboardReportScheduleRepeatAt DASHBOARD_REPORT_SCHEDULE_REPEAT_AT_14_30 =
      new DashboardReportScheduleRepeatAt("14:30");
  public static final DashboardReportScheduleRepeatAt DASHBOARD_REPORT_SCHEDULE_REPEAT_AT_15_00 =
      new DashboardReportScheduleRepeatAt("15:00");
  public static final DashboardReportScheduleRepeatAt DASHBOARD_REPORT_SCHEDULE_REPEAT_AT_15_30 =
      new DashboardReportScheduleRepeatAt("15:30");
  public static final DashboardReportScheduleRepeatAt DASHBOARD_REPORT_SCHEDULE_REPEAT_AT_16_00 =
      new DashboardReportScheduleRepeatAt("16:00");
  public static final DashboardReportScheduleRepeatAt DASHBOARD_REPORT_SCHEDULE_REPEAT_AT_16_30 =
      new DashboardReportScheduleRepeatAt("16:30");
  public static final DashboardReportScheduleRepeatAt DASHBOARD_REPORT_SCHEDULE_REPEAT_AT_17_00 =
      new DashboardReportScheduleRepeatAt("17:00");
  public static final DashboardReportScheduleRepeatAt DASHBOARD_REPORT_SCHEDULE_REPEAT_AT_17_30 =
      new DashboardReportScheduleRepeatAt("17:30");
  public static final DashboardReportScheduleRepeatAt DASHBOARD_REPORT_SCHEDULE_REPEAT_AT_18_00 =
      new DashboardReportScheduleRepeatAt("18:00");
  public static final DashboardReportScheduleRepeatAt DASHBOARD_REPORT_SCHEDULE_REPEAT_AT_18_30 =
      new DashboardReportScheduleRepeatAt("18:30");
  public static final DashboardReportScheduleRepeatAt DASHBOARD_REPORT_SCHEDULE_REPEAT_AT_19_00 =
      new DashboardReportScheduleRepeatAt("19:00");
  public static final DashboardReportScheduleRepeatAt DASHBOARD_REPORT_SCHEDULE_REPEAT_AT_19_30 =
      new DashboardReportScheduleRepeatAt("19:30");
  public static final DashboardReportScheduleRepeatAt DASHBOARD_REPORT_SCHEDULE_REPEAT_AT_20_00 =
      new DashboardReportScheduleRepeatAt("20:00");
  public static final DashboardReportScheduleRepeatAt DASHBOARD_REPORT_SCHEDULE_REPEAT_AT_20_30 =
      new DashboardReportScheduleRepeatAt("20:30");
  public static final DashboardReportScheduleRepeatAt DASHBOARD_REPORT_SCHEDULE_REPEAT_AT_21_00 =
      new DashboardReportScheduleRepeatAt("21:00");
  public static final DashboardReportScheduleRepeatAt DASHBOARD_REPORT_SCHEDULE_REPEAT_AT_21_30 =
      new DashboardReportScheduleRepeatAt("21:30");
  public static final DashboardReportScheduleRepeatAt DASHBOARD_REPORT_SCHEDULE_REPEAT_AT_22_00 =
      new DashboardReportScheduleRepeatAt("22:00");
  public static final DashboardReportScheduleRepeatAt DASHBOARD_REPORT_SCHEDULE_REPEAT_AT_22_30 =
      new DashboardReportScheduleRepeatAt("22:30");
  public static final DashboardReportScheduleRepeatAt DASHBOARD_REPORT_SCHEDULE_REPEAT_AT_23_00 =
      new DashboardReportScheduleRepeatAt("23:00");
  public static final DashboardReportScheduleRepeatAt DASHBOARD_REPORT_SCHEDULE_REPEAT_AT_23_30 =
      new DashboardReportScheduleRepeatAt("23:30");

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "00:00", "00:30", "01:00", "01:30", "02:00", "02:30", "03:00", "03:30", "04:00",
              "04:30", "05:00", "05:30", "06:00", "06:30", "07:00", "07:30", "08:00", "08:30",
              "09:00", "09:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00",
              "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30",
              "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00", "21:30", "22:00",
              "22:30", "23:00", "23:30"));

  private String value;

  public boolean isValid() {
    return allowedValues.contains(this.value);
  }

  DashboardReportScheduleRepeatAt(String value) {
    this.value = value;
  }

  public static class DashboardReportScheduleRepeatAtSerializer
      extends StdSerializer<DashboardReportScheduleRepeatAt> {
    public DashboardReportScheduleRepeatAtSerializer(Class<DashboardReportScheduleRepeatAt> t) {
      super(t);
    }

    public DashboardReportScheduleRepeatAtSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        DashboardReportScheduleRepeatAt value, JsonGenerator jgen, SerializerProvider provider)
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

  /** Return true if this DashboardReportScheduleRepeatAt object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return this.value.equals(((DashboardReportScheduleRepeatAt) o).value);
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
  public static DashboardReportScheduleRepeatAt fromValue(String value) {
    return new DashboardReportScheduleRepeatAt(value);
  }
}
