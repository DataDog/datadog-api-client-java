/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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

/** Supported metrics for monthly usage attribution requests. */
@JsonSerialize(
    using =
        MonthlyUsageAttributionSupportedMetrics.MonthlyUsageAttributionSupportedMetricsSerializer
            .class)
public class MonthlyUsageAttributionSupportedMetrics {

  public static final MonthlyUsageAttributionSupportedMetrics API_USAGE =
      new MonthlyUsageAttributionSupportedMetrics("api_usage");
  public static final MonthlyUsageAttributionSupportedMetrics API_PERCENTAGE =
      new MonthlyUsageAttributionSupportedMetrics("api_percentage");
  public static final MonthlyUsageAttributionSupportedMetrics APM_FARGATE_USAGE =
      new MonthlyUsageAttributionSupportedMetrics("apm_fargate_usage");
  public static final MonthlyUsageAttributionSupportedMetrics APM_FARGATE_PERCENTAGE =
      new MonthlyUsageAttributionSupportedMetrics("apm_fargate_percentage");
  public static final MonthlyUsageAttributionSupportedMetrics APM_HOST_USAGE =
      new MonthlyUsageAttributionSupportedMetrics("apm_host_usage");
  public static final MonthlyUsageAttributionSupportedMetrics APM_HOST_PERCENTAGE =
      new MonthlyUsageAttributionSupportedMetrics("apm_host_percentage");
  public static final MonthlyUsageAttributionSupportedMetrics APPSEC_USAGE =
      new MonthlyUsageAttributionSupportedMetrics("appsec_usage");
  public static final MonthlyUsageAttributionSupportedMetrics APPSEC_PERCENTAGE =
      new MonthlyUsageAttributionSupportedMetrics("appsec_percentage");
  public static final MonthlyUsageAttributionSupportedMetrics BROWSER_USAGE =
      new MonthlyUsageAttributionSupportedMetrics("browser_usage");
  public static final MonthlyUsageAttributionSupportedMetrics BROWSER_PERCENTAGE =
      new MonthlyUsageAttributionSupportedMetrics("browser_percentage");
  public static final MonthlyUsageAttributionSupportedMetrics CONTAINER_USAGE =
      new MonthlyUsageAttributionSupportedMetrics("container_usage");
  public static final MonthlyUsageAttributionSupportedMetrics CONTAINER_PERCENTAGE =
      new MonthlyUsageAttributionSupportedMetrics("container_percentage");
  public static final MonthlyUsageAttributionSupportedMetrics CSPM_CONTAINERS_PERCENTAGE =
      new MonthlyUsageAttributionSupportedMetrics("cspm_containers_percentage");
  public static final MonthlyUsageAttributionSupportedMetrics CSPM_CONTAINERS_USAGE =
      new MonthlyUsageAttributionSupportedMetrics("cspm_containers_usage");
  public static final MonthlyUsageAttributionSupportedMetrics CSPM_HOSTS_PERCENTAGE =
      new MonthlyUsageAttributionSupportedMetrics("cspm_hosts_percentage");
  public static final MonthlyUsageAttributionSupportedMetrics CSPM_HOSTS_USAGE =
      new MonthlyUsageAttributionSupportedMetrics("cspm_hosts_usage");
  public static final MonthlyUsageAttributionSupportedMetrics CUSTOM_TIMESERIES_USAGE =
      new MonthlyUsageAttributionSupportedMetrics("custom_timeseries_usage");
  public static final MonthlyUsageAttributionSupportedMetrics CUSTOM_TIMESERIES_PERCENTAGE =
      new MonthlyUsageAttributionSupportedMetrics("custom_timeseries_percentage");
  public static final MonthlyUsageAttributionSupportedMetrics CWS_CONTAINERS_PERCENTAGE =
      new MonthlyUsageAttributionSupportedMetrics("cws_containers_percentage");
  public static final MonthlyUsageAttributionSupportedMetrics CWS_CONTAINERS_USAGE =
      new MonthlyUsageAttributionSupportedMetrics("cws_containers_usage");
  public static final MonthlyUsageAttributionSupportedMetrics CWS_HOSTS_PERCENTAGE =
      new MonthlyUsageAttributionSupportedMetrics("cws_hosts_percentage");
  public static final MonthlyUsageAttributionSupportedMetrics CWS_HOSTS_USAGE =
      new MonthlyUsageAttributionSupportedMetrics("cws_hosts_usage");
  public static final MonthlyUsageAttributionSupportedMetrics DBM_HOSTS_PERCENTAGE =
      new MonthlyUsageAttributionSupportedMetrics("dbm_hosts_percentage");
  public static final MonthlyUsageAttributionSupportedMetrics DBM_HOSTS_USAGE =
      new MonthlyUsageAttributionSupportedMetrics("dbm_hosts_usage");
  public static final MonthlyUsageAttributionSupportedMetrics DBM_QUERIES_PERCENTAGE =
      new MonthlyUsageAttributionSupportedMetrics("dbm_queries_percentage");
  public static final MonthlyUsageAttributionSupportedMetrics DBM_QUERIES_USAGE =
      new MonthlyUsageAttributionSupportedMetrics("dbm_queries_usage");
  public static final MonthlyUsageAttributionSupportedMetrics ESTIMATED_INDEXED_LOGS_USAGE =
      new MonthlyUsageAttributionSupportedMetrics("estimated_indexed_logs_usage");
  public static final MonthlyUsageAttributionSupportedMetrics ESTIMATED_INDEXED_LOGS_PERCENTAGE =
      new MonthlyUsageAttributionSupportedMetrics("estimated_indexed_logs_percentage");
  public static final MonthlyUsageAttributionSupportedMetrics ESTIMATED_INGESTED_LOGS_USAGE =
      new MonthlyUsageAttributionSupportedMetrics("estimated_ingested_logs_usage");
  public static final MonthlyUsageAttributionSupportedMetrics ESTIMATED_INGESTED_LOGS_PERCENTAGE =
      new MonthlyUsageAttributionSupportedMetrics("estimated_ingested_logs_percentage");
  public static final MonthlyUsageAttributionSupportedMetrics ESTIMATED_INDEXED_SPANS_USAGE =
      new MonthlyUsageAttributionSupportedMetrics("estimated_indexed_spans_usage");
  public static final MonthlyUsageAttributionSupportedMetrics ESTIMATED_INDEXED_SPANS_PERCENTAGE =
      new MonthlyUsageAttributionSupportedMetrics("estimated_indexed_spans_percentage");
  public static final MonthlyUsageAttributionSupportedMetrics ESTIMATED_INGESTED_SPANS_USAGE =
      new MonthlyUsageAttributionSupportedMetrics("estimated_ingested_spans_usage");
  public static final MonthlyUsageAttributionSupportedMetrics ESTIMATED_INGESTED_SPANS_PERCENTAGE =
      new MonthlyUsageAttributionSupportedMetrics("estimated_ingested_spans_percentage");
  public static final MonthlyUsageAttributionSupportedMetrics FARGATE_USAGE =
      new MonthlyUsageAttributionSupportedMetrics("fargate_usage");
  public static final MonthlyUsageAttributionSupportedMetrics FARGATE_PERCENTAGE =
      new MonthlyUsageAttributionSupportedMetrics("fargate_percentage");
  public static final MonthlyUsageAttributionSupportedMetrics FUNCTIONS_USAGE =
      new MonthlyUsageAttributionSupportedMetrics("functions_usage");
  public static final MonthlyUsageAttributionSupportedMetrics FUNCTIONS_PERCENTAGE =
      new MonthlyUsageAttributionSupportedMetrics("functions_percentage");
  public static final MonthlyUsageAttributionSupportedMetrics INDEXED_LOGS_USAGE =
      new MonthlyUsageAttributionSupportedMetrics("indexed_logs_usage");
  public static final MonthlyUsageAttributionSupportedMetrics INDEXED_LOGS_PERCENTAGE =
      new MonthlyUsageAttributionSupportedMetrics("indexed_logs_percentage");
  public static final MonthlyUsageAttributionSupportedMetrics INFRA_HOST_USAGE =
      new MonthlyUsageAttributionSupportedMetrics("infra_host_usage");
  public static final MonthlyUsageAttributionSupportedMetrics INFRA_HOST_PERCENTAGE =
      new MonthlyUsageAttributionSupportedMetrics("infra_host_percentage");
  public static final MonthlyUsageAttributionSupportedMetrics INVOCATIONS_USAGE =
      new MonthlyUsageAttributionSupportedMetrics("invocations_usage");
  public static final MonthlyUsageAttributionSupportedMetrics INVOCATIONS_PERCENTAGE =
      new MonthlyUsageAttributionSupportedMetrics("invocations_percentage");
  public static final MonthlyUsageAttributionSupportedMetrics NPM_HOST_USAGE =
      new MonthlyUsageAttributionSupportedMetrics("npm_host_usage");
  public static final MonthlyUsageAttributionSupportedMetrics NPM_HOST_PERCENTAGE =
      new MonthlyUsageAttributionSupportedMetrics("npm_host_percentage");
  public static final MonthlyUsageAttributionSupportedMetrics PROFILED_CONTAINER_USAGE =
      new MonthlyUsageAttributionSupportedMetrics("profiled_container_usage");
  public static final MonthlyUsageAttributionSupportedMetrics PROFILED_CONTAINER_PERCENTAGE =
      new MonthlyUsageAttributionSupportedMetrics("profiled_container_percentage");
  public static final MonthlyUsageAttributionSupportedMetrics PROFILED_HOST_USAGE =
      new MonthlyUsageAttributionSupportedMetrics("profiled_host_usage");
  public static final MonthlyUsageAttributionSupportedMetrics PROFILED_HOST_PERCENTAGE =
      new MonthlyUsageAttributionSupportedMetrics("profiled_host_percentage");
  public static final MonthlyUsageAttributionSupportedMetrics SNMP_USAGE =
      new MonthlyUsageAttributionSupportedMetrics("snmp_usage");
  public static final MonthlyUsageAttributionSupportedMetrics SNMP_PERCENTAGE =
      new MonthlyUsageAttributionSupportedMetrics("snmp_percentage");
  public static final MonthlyUsageAttributionSupportedMetrics ALL =
      new MonthlyUsageAttributionSupportedMetrics("*");

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "api_usage",
              "api_percentage",
              "apm_fargate_usage",
              "apm_fargate_percentage",
              "apm_host_usage",
              "apm_host_percentage",
              "appsec_usage",
              "appsec_percentage",
              "browser_usage",
              "browser_percentage",
              "container_usage",
              "container_percentage",
              "cspm_containers_percentage",
              "cspm_containers_usage",
              "cspm_hosts_percentage",
              "cspm_hosts_usage",
              "custom_timeseries_usage",
              "custom_timeseries_percentage",
              "cws_containers_percentage",
              "cws_containers_usage",
              "cws_hosts_percentage",
              "cws_hosts_usage",
              "dbm_hosts_percentage",
              "dbm_hosts_usage",
              "dbm_queries_percentage",
              "dbm_queries_usage",
              "estimated_indexed_logs_usage",
              "estimated_indexed_logs_percentage",
              "estimated_ingested_logs_usage",
              "estimated_ingested_logs_percentage",
              "estimated_indexed_spans_usage",
              "estimated_indexed_spans_percentage",
              "estimated_ingested_spans_usage",
              "estimated_ingested_spans_percentage",
              "fargate_usage",
              "fargate_percentage",
              "functions_usage",
              "functions_percentage",
              "indexed_logs_usage",
              "indexed_logs_percentage",
              "infra_host_usage",
              "infra_host_percentage",
              "invocations_usage",
              "invocations_percentage",
              "npm_host_usage",
              "npm_host_percentage",
              "profiled_container_usage",
              "profiled_container_percentage",
              "profiled_host_usage",
              "profiled_host_percentage",
              "snmp_usage",
              "snmp_percentage",
              "*"));

  private String value;

  public boolean isValid() {
    return allowedValues.contains(this.value);
  }

  MonthlyUsageAttributionSupportedMetrics(String value) {
    this.value = value;
  }

  public static class MonthlyUsageAttributionSupportedMetricsSerializer
      extends StdSerializer<MonthlyUsageAttributionSupportedMetrics> {
    public MonthlyUsageAttributionSupportedMetricsSerializer(
        Class<MonthlyUsageAttributionSupportedMetrics> t) {
      super(t);
    }

    public MonthlyUsageAttributionSupportedMetricsSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        MonthlyUsageAttributionSupportedMetrics value,
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

  /** Return true if this MonthlyUsageAttributionSupportedMetrics object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return this.value.equals(((MonthlyUsageAttributionSupportedMetrics) o).value);
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
  public static MonthlyUsageAttributionSupportedMetrics fromValue(String value) {
    return new MonthlyUsageAttributionSupportedMetrics(value);
  }
}
