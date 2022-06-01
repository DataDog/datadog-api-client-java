/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.v1.client.model;

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

/** Supported products for hourly usage attribution requests. */
@JsonSerialize(
    using = HourlyUsageAttributionUsageType.HourlyUsageAttributionUsageTypeSerializer.class)
public class HourlyUsageAttributionUsageType {

  public static final HourlyUsageAttributionUsageType API_USAGE =
      new HourlyUsageAttributionUsageType("api_usage");
  public static final HourlyUsageAttributionUsageType APM_HOST_USAGE =
      new HourlyUsageAttributionUsageType("apm_host_usage");
  public static final HourlyUsageAttributionUsageType BROWSER_USAGE =
      new HourlyUsageAttributionUsageType("browser_usage");
  public static final HourlyUsageAttributionUsageType CONTAINER_USAGE =
      new HourlyUsageAttributionUsageType("container_usage");
  public static final HourlyUsageAttributionUsageType CUSTOM_TIMESERIES_USAGE =
      new HourlyUsageAttributionUsageType("custom_timeseries_usage");
  public static final HourlyUsageAttributionUsageType ESTIMATED_INDEXED_LOGS_USAGE =
      new HourlyUsageAttributionUsageType("estimated_indexed_logs_usage");
  public static final HourlyUsageAttributionUsageType FARGATE_USAGE =
      new HourlyUsageAttributionUsageType("fargate_usage");
  public static final HourlyUsageAttributionUsageType FUNCTIONS_USAGE =
      new HourlyUsageAttributionUsageType("functions_usage");
  public static final HourlyUsageAttributionUsageType INDEXED_LOGS_USAGE =
      new HourlyUsageAttributionUsageType("indexed_logs_usage");
  public static final HourlyUsageAttributionUsageType INFRA_HOST_USAGE =
      new HourlyUsageAttributionUsageType("infra_host_usage");
  public static final HourlyUsageAttributionUsageType INVOCATIONS_USAGE =
      new HourlyUsageAttributionUsageType("invocations_usage");
  public static final HourlyUsageAttributionUsageType NPM_HOST_USAGE =
      new HourlyUsageAttributionUsageType("npm_host_usage");
  public static final HourlyUsageAttributionUsageType PROFILED_CONTAINER_USAGE =
      new HourlyUsageAttributionUsageType("profiled_container_usage");
  public static final HourlyUsageAttributionUsageType PROFILED_HOST_USAGE =
      new HourlyUsageAttributionUsageType("profiled_host_usage");
  public static final HourlyUsageAttributionUsageType SNMP_USAGE =
      new HourlyUsageAttributionUsageType("snmp_usage");

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "api_usage",
              "apm_host_usage",
              "browser_usage",
              "container_usage",
              "custom_timeseries_usage",
              "estimated_indexed_logs_usage",
              "fargate_usage",
              "functions_usage",
              "indexed_logs_usage",
              "infra_host_usage",
              "invocations_usage",
              "npm_host_usage",
              "profiled_container_usage",
              "profiled_host_usage",
              "snmp_usage"));

  private String value;

  public boolean isValid() {
    return allowedValues.contains(this.value);
  }

  HourlyUsageAttributionUsageType(String value) {
    this.value = value;
  }

  public static class HourlyUsageAttributionUsageTypeSerializer
      extends StdSerializer<HourlyUsageAttributionUsageType> {
    public HourlyUsageAttributionUsageTypeSerializer(Class<HourlyUsageAttributionUsageType> t) {
      super(t);
    }

    public HourlyUsageAttributionUsageTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        HourlyUsageAttributionUsageType value, JsonGenerator jgen, SerializerProvider provider)
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

  /** Return true if this HourlyUsageAttributionUsageType object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return this.value.equals(((HourlyUsageAttributionUsageType) o).value);
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
  public static HourlyUsageAttributionUsageType fromValue(String value) {
    return new HourlyUsageAttributionUsageType(value);
  }
}
