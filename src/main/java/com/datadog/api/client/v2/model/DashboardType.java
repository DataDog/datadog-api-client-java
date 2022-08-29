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

/** The type of the dashboard. */
@JsonSerialize(using = DashboardType.DashboardTypeSerializer.class)
public class DashboardType {

  public static final DashboardType CUSTOM_TIMEBOARD = new DashboardType("custom_timeboard");
  public static final DashboardType CUSTOM_SCREENBOARD = new DashboardType("custom_screenboard");
  public static final DashboardType INTEGRATION_SCREENBOARD =
      new DashboardType("integration_screenboard");
  public static final DashboardType INTEGRATION_TIMEBOARD =
      new DashboardType("integration_timeboard");
  public static final DashboardType HOST_TIMEBOARD = new DashboardType("host_timeboard");

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "custom_timeboard",
              "custom_screenboard",
              "integration_screenboard",
              "integration_timeboard",
              "host_timeboard"));

  private String value;

  public boolean isValid() {
    return allowedValues.contains(this.value);
  }

  DashboardType(String value) {
    this.value = value;
  }

  public static class DashboardTypeSerializer extends StdSerializer<DashboardType> {
    public DashboardTypeSerializer(Class<DashboardType> t) {
      super(t);
    }

    public DashboardTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(DashboardType value, JsonGenerator jgen, SerializerProvider provider)
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

  /** Return true if this DashboardType object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return this.value.equals(((DashboardType) o).value);
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
  public static DashboardType fromValue(String value) {
    return new DashboardType(value);
  }
}
