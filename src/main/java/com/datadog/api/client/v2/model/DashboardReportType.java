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

/** JSON:API type of the dashboard report. */
@JsonSerialize(using = DashboardReportType.DashboardReportTypeSerializer.class)
public class DashboardReportType {

  public static final DashboardReportType DASHBOARD_REPORTS_TYPE =
      new DashboardReportType("dashboard_reports");

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("dashboard_reports"));

  private String value;

  public boolean isValid() {
    return allowedValues.contains(this.value);
  }

  DashboardReportType(String value) {
    this.value = value;
  }

  public static class DashboardReportTypeSerializer extends StdSerializer<DashboardReportType> {
    public DashboardReportTypeSerializer(Class<DashboardReportType> t) {
      super(t);
    }

    public DashboardReportTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        DashboardReportType value, JsonGenerator jgen, SerializerProvider provider)
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

  /** Return true if this DashboardReportType object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return this.value.equals(((DashboardReportType) o).value);
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
  public static DashboardReportType fromValue(String value) {
    return new DashboardReportType(value);
  }
}
