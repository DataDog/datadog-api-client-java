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

/** Time period covered by the widgets in the dashboard report, at the time of report generation. */
@JsonSerialize(using = DashboardReportTimeframe.DashboardReportTimeframeSerializer.class)
public class DashboardReportTimeframe {

  public static final DashboardReportTimeframe DASHBOARD_REPORT_TIMEFRAME_5M =
      new DashboardReportTimeframe("5m");
  public static final DashboardReportTimeframe DASHBOARD_REPORT_TIMEFRAME_15M =
      new DashboardReportTimeframe("15m");
  public static final DashboardReportTimeframe DASHBOARD_REPORT_TIMEFRAME_30M =
      new DashboardReportTimeframe("30m");
  public static final DashboardReportTimeframe DASHBOARD_REPORT_TIMEFRAME_1H =
      new DashboardReportTimeframe("1h");
  public static final DashboardReportTimeframe DASHBOARD_REPORT_TIMEFRAME_4H =
      new DashboardReportTimeframe("4h");
  public static final DashboardReportTimeframe DASHBOARD_REPORT_TIMEFRAME_1D =
      new DashboardReportTimeframe("1d");
  public static final DashboardReportTimeframe DASHBOARD_REPORT_TIMEFRAME_2D =
      new DashboardReportTimeframe("2d");
  public static final DashboardReportTimeframe DASHBOARD_REPORT_TIMEFRAME_1W =
      new DashboardReportTimeframe("1w");
  public static final DashboardReportTimeframe DASHBOARD_REPORT_TIMEFRAME_1MO =
      new DashboardReportTimeframe("1mo");

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("5m", "15m", "30m", "1h", "4h", "1d", "2d", "1w", "1mo"));

  private String value;

  public boolean isValid() {
    return allowedValues.contains(this.value);
  }

  DashboardReportTimeframe(String value) {
    this.value = value;
  }

  public static class DashboardReportTimeframeSerializer
      extends StdSerializer<DashboardReportTimeframe> {
    public DashboardReportTimeframeSerializer(Class<DashboardReportTimeframe> t) {
      super(t);
    }

    public DashboardReportTimeframeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        DashboardReportTimeframe value, JsonGenerator jgen, SerializerProvider provider)
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

  /** Return true if this DashboardReportTimeframe object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return this.value.equals(((DashboardReportTimeframe) o).value);
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
  public static DashboardReportTimeframe fromValue(String value) {
    return new DashboardReportTimeframe(value);
  }
}
