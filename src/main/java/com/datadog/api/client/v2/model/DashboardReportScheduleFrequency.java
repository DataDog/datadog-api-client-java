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

/** Frequency with which to send the report. */
@JsonSerialize(
    using = DashboardReportScheduleFrequency.DashboardReportScheduleFrequencySerializer.class)
public class DashboardReportScheduleFrequency {

  public static final DashboardReportScheduleFrequency DASHBOARD_REPORT_SCHEDULE_FREQUENCY_1D =
      new DashboardReportScheduleFrequency("1d");
  public static final DashboardReportScheduleFrequency DASHBOARD_REPORT_SCHEDULE_FREQUENCY_2D =
      new DashboardReportScheduleFrequency("2d");
  public static final DashboardReportScheduleFrequency DASHBOARD_REPORT_SCHEDULE_FREQUENCY_3D =
      new DashboardReportScheduleFrequency("3d");
  public static final DashboardReportScheduleFrequency DASHBOARD_REPORT_SCHEDULE_FREQUENCY_4D =
      new DashboardReportScheduleFrequency("4d");
  public static final DashboardReportScheduleFrequency DASHBOARD_REPORT_SCHEDULE_FREQUENCY_5D =
      new DashboardReportScheduleFrequency("5d");
  public static final DashboardReportScheduleFrequency DASHBOARD_REPORT_SCHEDULE_FREQUENCY_6D =
      new DashboardReportScheduleFrequency("6d");
  public static final DashboardReportScheduleFrequency DASHBOARD_REPORT_SCHEDULE_FREQUENCY_1W =
      new DashboardReportScheduleFrequency("1w");
  public static final DashboardReportScheduleFrequency DASHBOARD_REPORT_SCHEDULE_FREQUENCY_2W =
      new DashboardReportScheduleFrequency("2w");
  public static final DashboardReportScheduleFrequency DASHBOARD_REPORT_SCHEDULE_FREQUENCY_3W =
      new DashboardReportScheduleFrequency("3w");
  public static final DashboardReportScheduleFrequency DASHBOARD_REPORT_SCHEDULE_FREQUENCY_1MO =
      new DashboardReportScheduleFrequency("1mo");
  public static final DashboardReportScheduleFrequency DASHBOARD_REPORT_SCHEDULE_FREQUENCY_2MO =
      new DashboardReportScheduleFrequency("2mo");
  public static final DashboardReportScheduleFrequency DASHBOARD_REPORT_SCHEDULE_FREQUENCY_3MO =
      new DashboardReportScheduleFrequency("3mo");
  public static final DashboardReportScheduleFrequency DASHBOARD_REPORT_SCHEDULE_FREQUENCY_4MO =
      new DashboardReportScheduleFrequency("4mo");
  public static final DashboardReportScheduleFrequency DASHBOARD_REPORT_SCHEDULE_FREQUENCY_5MO =
      new DashboardReportScheduleFrequency("5mo");
  public static final DashboardReportScheduleFrequency DASHBOARD_REPORT_SCHEDULE_FREQUENCY_6MO =
      new DashboardReportScheduleFrequency("6mo");
  public static final DashboardReportScheduleFrequency DASHBOARD_REPORT_SCHEDULE_FREQUENCY_7MO =
      new DashboardReportScheduleFrequency("7mo");
  public static final DashboardReportScheduleFrequency DASHBOARD_REPORT_SCHEDULE_FREQUENCY_8MO =
      new DashboardReportScheduleFrequency("8mo");
  public static final DashboardReportScheduleFrequency DASHBOARD_REPORT_SCHEDULE_FREQUENCY_9MO =
      new DashboardReportScheduleFrequency("9mo");
  public static final DashboardReportScheduleFrequency DASHBOARD_REPORT_SCHEDULE_FREQUENCY_10MO =
      new DashboardReportScheduleFrequency("10mo");
  public static final DashboardReportScheduleFrequency DASHBOARD_REPORT_SCHEDULE_FREQUENCY_11MO =
      new DashboardReportScheduleFrequency("11mo");
  public static final DashboardReportScheduleFrequency DASHBOARD_REPORT_SCHEDULE_FREQUENCY_12MO =
      new DashboardReportScheduleFrequency("12mo");

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "1d", "2d", "3d", "4d", "5d", "6d", "1w", "2w", "3w", "1mo", "2mo", "3mo", "4mo",
              "5mo", "6mo", "7mo", "8mo", "9mo", "10mo", "11mo", "12mo"));

  private String value;

  public boolean isValid() {
    return allowedValues.contains(this.value);
  }

  DashboardReportScheduleFrequency(String value) {
    this.value = value;
  }

  public static class DashboardReportScheduleFrequencySerializer
      extends StdSerializer<DashboardReportScheduleFrequency> {
    public DashboardReportScheduleFrequencySerializer(Class<DashboardReportScheduleFrequency> t) {
      super(t);
    }

    public DashboardReportScheduleFrequencySerializer() {
      this(null);
    }

    @Override
    public void serialize(
        DashboardReportScheduleFrequency value, JsonGenerator jgen, SerializerProvider provider)
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

  /** Return true if this DashboardReportScheduleFrequency object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return this.value.equals(((DashboardReportScheduleFrequency) o).value);
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
  public static DashboardReportScheduleFrequency fromValue(String value) {
    return new DashboardReportScheduleFrequency(value);
  }
}
