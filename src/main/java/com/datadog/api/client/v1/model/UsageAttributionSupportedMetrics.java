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

/**
 * Supported fields for usage attribution requests (valid requests contain one or more metrics, or
 * <code>*</code> for all).
 */
@JsonSerialize(
    using = UsageAttributionSupportedMetrics.UsageAttributionSupportedMetricsSerializer.class)
public class UsageAttributionSupportedMetrics {

  public static final UsageAttributionSupportedMetrics CUSTOM_TIMESERIES_USAGE =
      new UsageAttributionSupportedMetrics("custom_timeseries_usage");
  public static final UsageAttributionSupportedMetrics CONTAINER_USAGE =
      new UsageAttributionSupportedMetrics("container_usage");
  public static final UsageAttributionSupportedMetrics SNMP_PERCENTAGE =
      new UsageAttributionSupportedMetrics("snmp_percentage");
  public static final UsageAttributionSupportedMetrics APM_HOST_USAGE =
      new UsageAttributionSupportedMetrics("apm_host_usage");
  public static final UsageAttributionSupportedMetrics BROWSER_USAGE =
      new UsageAttributionSupportedMetrics("browser_usage");
  public static final UsageAttributionSupportedMetrics NPM_HOST_PERCENTAGE =
      new UsageAttributionSupportedMetrics("npm_host_percentage");
  public static final UsageAttributionSupportedMetrics INFRA_HOST_USAGE =
      new UsageAttributionSupportedMetrics("infra_host_usage");
  public static final UsageAttributionSupportedMetrics CUSTOM_TIMESERIES_PERCENTAGE =
      new UsageAttributionSupportedMetrics("custom_timeseries_percentage");
  public static final UsageAttributionSupportedMetrics CONTAINER_PERCENTAGE =
      new UsageAttributionSupportedMetrics("container_percentage");
  public static final UsageAttributionSupportedMetrics API_USAGE =
      new UsageAttributionSupportedMetrics("api_usage");
  public static final UsageAttributionSupportedMetrics APM_HOST_PERCENTAGE =
      new UsageAttributionSupportedMetrics("apm_host_percentage");
  public static final UsageAttributionSupportedMetrics INFRA_HOST_PERCENTAGE =
      new UsageAttributionSupportedMetrics("infra_host_percentage");
  public static final UsageAttributionSupportedMetrics SNMP_USAGE =
      new UsageAttributionSupportedMetrics("snmp_usage");
  public static final UsageAttributionSupportedMetrics BROWSER_PERCENTAGE =
      new UsageAttributionSupportedMetrics("browser_percentage");
  public static final UsageAttributionSupportedMetrics API_PERCENTAGE =
      new UsageAttributionSupportedMetrics("api_percentage");
  public static final UsageAttributionSupportedMetrics NPM_HOST_USAGE =
      new UsageAttributionSupportedMetrics("npm_host_usage");
  public static final UsageAttributionSupportedMetrics LAMBDA_FUNCTIONS_USAGE =
      new UsageAttributionSupportedMetrics("lambda_functions_usage");
  public static final UsageAttributionSupportedMetrics LAMBDA_FUNCTIONS_PERCENTAGE =
      new UsageAttributionSupportedMetrics("lambda_functions_percentage");
  public static final UsageAttributionSupportedMetrics LAMBDA_INVOCATIONS_USAGE =
      new UsageAttributionSupportedMetrics("lambda_invocations_usage");
  public static final UsageAttributionSupportedMetrics LAMBDA_INVOCATIONS_PERCENTAGE =
      new UsageAttributionSupportedMetrics("lambda_invocations_percentage");
  public static final UsageAttributionSupportedMetrics FARGATE_USAGE =
      new UsageAttributionSupportedMetrics("fargate_usage");
  public static final UsageAttributionSupportedMetrics FARGATE_PERCENTAGE =
      new UsageAttributionSupportedMetrics("fargate_percentage");
  public static final UsageAttributionSupportedMetrics PROFILED_HOST_USAGE =
      new UsageAttributionSupportedMetrics("profiled_host_usage");
  public static final UsageAttributionSupportedMetrics PROFILED_HOST_PERCENTAGE =
      new UsageAttributionSupportedMetrics("profiled_host_percentage");
  public static final UsageAttributionSupportedMetrics PROFILED_CONTAINER_USAGE =
      new UsageAttributionSupportedMetrics("profiled_container_usage");
  public static final UsageAttributionSupportedMetrics PROFILED_CONTAINER_PERCENTAGE =
      new UsageAttributionSupportedMetrics("profiled_container_percentage");
  public static final UsageAttributionSupportedMetrics DBM_HOSTS_USAGE =
      new UsageAttributionSupportedMetrics("dbm_hosts_usage");
  public static final UsageAttributionSupportedMetrics DBM_HOSTS_PERCENTAGE =
      new UsageAttributionSupportedMetrics("dbm_hosts_percentage");
  public static final UsageAttributionSupportedMetrics DBM_QUERIES_USAGE =
      new UsageAttributionSupportedMetrics("dbm_queries_usage");
  public static final UsageAttributionSupportedMetrics DBM_QUERIES_PERCENTAGE =
      new UsageAttributionSupportedMetrics("dbm_queries_percentage");
  public static final UsageAttributionSupportedMetrics ESTIMATED_INDEXED_LOGS_USAGE =
      new UsageAttributionSupportedMetrics("estimated_indexed_logs_usage");
  public static final UsageAttributionSupportedMetrics ESTIMATED_INDEXED_LOGS_PERCENTAGE =
      new UsageAttributionSupportedMetrics("estimated_indexed_logs_percentage");
  public static final UsageAttributionSupportedMetrics ESTIMATED_INGESTED_LOGS_USAGE =
      new UsageAttributionSupportedMetrics("estimated_ingested_logs_usage");
  public static final UsageAttributionSupportedMetrics ESTIMATED_INGESTED_LOGS_PERCENTAGE =
      new UsageAttributionSupportedMetrics("estimated_ingested_logs_percentage");
  public static final UsageAttributionSupportedMetrics APPSEC_USAGE =
      new UsageAttributionSupportedMetrics("appsec_usage");
  public static final UsageAttributionSupportedMetrics APPSEC_PERCENTAGE =
      new UsageAttributionSupportedMetrics("appsec_percentage");
  public static final UsageAttributionSupportedMetrics ESTIMATED_INDEXED_SPANS_USAGE =
      new UsageAttributionSupportedMetrics("estimated_indexed_spans_usage");
  public static final UsageAttributionSupportedMetrics ESTIMATED_INDEXED_SPANS_PERCENTAGE =
      new UsageAttributionSupportedMetrics("estimated_indexed_spans_percentage");
  public static final UsageAttributionSupportedMetrics ESTIMATED_INGESTED_SPANS_USAGE =
      new UsageAttributionSupportedMetrics("estimated_ingested_spans_usage");
  public static final UsageAttributionSupportedMetrics ESTIMATED_INGESTED_SPANS_PERCENTAGE =
      new UsageAttributionSupportedMetrics("estimated_ingested_spans_percentage");
  public static final UsageAttributionSupportedMetrics APM_FARGATE_USAGE =
      new UsageAttributionSupportedMetrics("apm_fargate_usage");
  public static final UsageAttributionSupportedMetrics APM_FARGATE_PERCENTAGE =
      new UsageAttributionSupportedMetrics("apm_fargate_percentage");
  public static final UsageAttributionSupportedMetrics ALL =
      new UsageAttributionSupportedMetrics("*");

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "custom_timeseries_usage",
              "container_usage",
              "snmp_percentage",
              "apm_host_usage",
              "browser_usage",
              "npm_host_percentage",
              "infra_host_usage",
              "custom_timeseries_percentage",
              "container_percentage",
              "api_usage",
              "apm_host_percentage",
              "infra_host_percentage",
              "snmp_usage",
              "browser_percentage",
              "api_percentage",
              "npm_host_usage",
              "lambda_functions_usage",
              "lambda_functions_percentage",
              "lambda_invocations_usage",
              "lambda_invocations_percentage",
              "fargate_usage",
              "fargate_percentage",
              "profiled_host_usage",
              "profiled_host_percentage",
              "profiled_container_usage",
              "profiled_container_percentage",
              "dbm_hosts_usage",
              "dbm_hosts_percentage",
              "dbm_queries_usage",
              "dbm_queries_percentage",
              "estimated_indexed_logs_usage",
              "estimated_indexed_logs_percentage",
              "estimated_ingested_logs_usage",
              "estimated_ingested_logs_percentage",
              "appsec_usage",
              "appsec_percentage",
              "estimated_indexed_spans_usage",
              "estimated_indexed_spans_percentage",
              "estimated_ingested_spans_usage",
              "estimated_ingested_spans_percentage",
              "apm_fargate_usage",
              "apm_fargate_percentage",
              "*"));

  private String value;

  public boolean isValid() {
    return allowedValues.contains(this.value);
  }

  UsageAttributionSupportedMetrics(String value) {
    this.value = value;
  }

  public static class UsageAttributionSupportedMetricsSerializer
      extends StdSerializer<UsageAttributionSupportedMetrics> {
    public UsageAttributionSupportedMetricsSerializer(Class<UsageAttributionSupportedMetrics> t) {
      super(t);
    }

    public UsageAttributionSupportedMetricsSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        UsageAttributionSupportedMetrics value, JsonGenerator jgen, SerializerProvider provider)
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

  /** Return true if this UsageAttributionSupportedMetrics object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return this.value.equals(((UsageAttributionSupportedMetrics) o).value);
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
  public static UsageAttributionSupportedMetrics fromValue(String value) {
    return new UsageAttributionSupportedMetrics(value);
  }
}
