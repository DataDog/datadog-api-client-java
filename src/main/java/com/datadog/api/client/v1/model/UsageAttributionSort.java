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

/** The field to sort by. */
@JsonSerialize(using = UsageAttributionSort.UsageAttributionSortSerializer.class)
public class UsageAttributionSort {

  public static final UsageAttributionSort API_PERCENTAGE =
      new UsageAttributionSort("api_percentage");
  public static final UsageAttributionSort SNMP_USAGE = new UsageAttributionSort("snmp_usage");
  public static final UsageAttributionSort APM_HOST_USAGE =
      new UsageAttributionSort("apm_host_usage");
  public static final UsageAttributionSort API_USAGE = new UsageAttributionSort("api_usage");
  public static final UsageAttributionSort APPSEC_USAGE = new UsageAttributionSort("appsec_usage");
  public static final UsageAttributionSort APPSEC_PERCENTAGE =
      new UsageAttributionSort("appsec_percentage");
  public static final UsageAttributionSort CONTAINER_USAGE =
      new UsageAttributionSort("container_usage");
  public static final UsageAttributionSort CUSTOM_TIMESERIES_PERCENTAGE =
      new UsageAttributionSort("custom_timeseries_percentage");
  public static final UsageAttributionSort CONTAINER_PERCENTAGE =
      new UsageAttributionSort("container_percentage");
  public static final UsageAttributionSort APM_HOST_PERCENTAGE =
      new UsageAttributionSort("apm_host_percentage");
  public static final UsageAttributionSort NPM_HOST_PERCENTAGE =
      new UsageAttributionSort("npm_host_percentage");
  public static final UsageAttributionSort BROWSER_PERCENTAGE =
      new UsageAttributionSort("browser_percentage");
  public static final UsageAttributionSort BROWSER_USAGE =
      new UsageAttributionSort("browser_usage");
  public static final UsageAttributionSort INFRA_HOST_PERCENTAGE =
      new UsageAttributionSort("infra_host_percentage");
  public static final UsageAttributionSort SNMP_PERCENTAGE =
      new UsageAttributionSort("snmp_percentage");
  public static final UsageAttributionSort NPM_HOST_USAGE =
      new UsageAttributionSort("npm_host_usage");
  public static final UsageAttributionSort INFRA_HOST_USAGE =
      new UsageAttributionSort("infra_host_usage");
  public static final UsageAttributionSort CUSTOM_TIMESERIES_USAGE =
      new UsageAttributionSort("custom_timeseries_usage");
  public static final UsageAttributionSort LAMBDA_FUNCTIONS_USAGE =
      new UsageAttributionSort("lambda_functions_usage");
  public static final UsageAttributionSort LAMBDA_FUNCTIONS_PERCENTAGE =
      new UsageAttributionSort("lambda_functions_percentage");
  public static final UsageAttributionSort LAMBDA_INVOCATIONS_USAGE =
      new UsageAttributionSort("lambda_invocations_usage");
  public static final UsageAttributionSort LAMBDA_INVOCATIONS_PERCENTAGE =
      new UsageAttributionSort("lambda_invocations_percentage");
  public static final UsageAttributionSort ESTIMATED_INDEXED_LOGS_USAGE =
      new UsageAttributionSort("estimated_indexed_logs_usage");
  public static final UsageAttributionSort ESTIMATED_INDEXED_LOGS_PERCENTAGE =
      new UsageAttributionSort("estimated_indexed_logs_percentage");
  public static final UsageAttributionSort ESTIMATED_INGESTED_LOGS_USAGE =
      new UsageAttributionSort("estimated_ingested_logs_usage");
  public static final UsageAttributionSort ESTIMATED_INGESTED_LOGS_PERCENTAGE =
      new UsageAttributionSort("estimated_ingested_logs_percentage");
  public static final UsageAttributionSort ESTIMATED_INDEXED_SPANS_USAGE =
      new UsageAttributionSort("estimated_indexed_spans_usage");
  public static final UsageAttributionSort ESTIMATED_INDEXED_SPANS_PERCENTAGE =
      new UsageAttributionSort("estimated_indexed_spans_percentage");
  public static final UsageAttributionSort ESTIMATED_INGESTED_SPANS_USAGE =
      new UsageAttributionSort("estimated_ingested_spans_usage");
  public static final UsageAttributionSort ESTIMATED_INGESTED_SPANS_PERCENTAGE =
      new UsageAttributionSort("estimated_ingested_spans_percentage");
  public static final UsageAttributionSort APM_FARGATE_USAGE =
      new UsageAttributionSort("apm_fargate_usage");
  public static final UsageAttributionSort APM_FARGATE_PERCENTAGE =
      new UsageAttributionSort("apm_fargate_percentage");

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "api_percentage",
              "snmp_usage",
              "apm_host_usage",
              "api_usage",
              "appsec_usage",
              "appsec_percentage",
              "container_usage",
              "custom_timeseries_percentage",
              "container_percentage",
              "apm_host_percentage",
              "npm_host_percentage",
              "browser_percentage",
              "browser_usage",
              "infra_host_percentage",
              "snmp_percentage",
              "npm_host_usage",
              "infra_host_usage",
              "custom_timeseries_usage",
              "lambda_functions_usage",
              "lambda_functions_percentage",
              "lambda_invocations_usage",
              "lambda_invocations_percentage",
              "estimated_indexed_logs_usage",
              "estimated_indexed_logs_percentage",
              "estimated_ingested_logs_usage",
              "estimated_ingested_logs_percentage",
              "estimated_indexed_spans_usage",
              "estimated_indexed_spans_percentage",
              "estimated_ingested_spans_usage",
              "estimated_ingested_spans_percentage",
              "apm_fargate_usage",
              "apm_fargate_percentage"));

  private String value;

  public boolean isValid() {
    return allowedValues.contains(this.value);
  }

  UsageAttributionSort(String value) {
    this.value = value;
  }

  public static class UsageAttributionSortSerializer extends StdSerializer<UsageAttributionSort> {
    public UsageAttributionSortSerializer(Class<UsageAttributionSort> t) {
      super(t);
    }

    public UsageAttributionSortSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        UsageAttributionSort value, JsonGenerator jgen, SerializerProvider provider)
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

  /** Return true if this UsageAttributionSort object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return this.value.equals(((UsageAttributionSort) o).value);
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
  public static UsageAttributionSort fromValue(String value) {
    return new UsageAttributionSort(value);
  }
}
