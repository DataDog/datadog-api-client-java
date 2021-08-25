/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.datadog.api.v1.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Supported fields for usage attribution requests (valid requests contain one or more metrics, or
 * &#x60;*&#x60; for all).
 */
public enum UsageAttributionSupportedMetrics {
  CUSTOM_TIMESERIES_USAGE("custom_timeseries_usage"),

  CONTAINER_USAGE("container_usage"),

  SNMP_PERCENTAGE("snmp_percentage"),

  APM_HOST_USAGE("apm_host_usage"),

  BROWSER_USAGE("browser_usage"),

  NPM_HOST_PERCENTAGE("npm_host_percentage"),

  INFRA_HOST_USAGE("infra_host_usage"),

  CUSTOM_TIMESERIES_PERCENTAGE("custom_timeseries_percentage"),

  CONTAINER_PERCENTAGE("container_percentage"),

  LAMBDA_USAGE("lambda_usage"),

  API_USAGE("api_usage"),

  APM_HOST_PERCENTAGE("apm_host_percentage"),

  INFRA_HOST_PERCENTAGE("infra_host_percentage"),

  SNMP_USAGE("snmp_usage"),

  BROWSER_PERCENTAGE("browser_percentage"),

  API_PERCENTAGE("api_percentage"),

  LAMBDA_PERCENTAGE("lambda_percentage"),

  NPM_HOST_USAGE("npm_host_usage"),

  LAMBDA_FUNCTIONS_USAGE("lambda_functions_usage"),

  LAMBDA_FUNCTIONS_PERCENTAGE("lambda_functions_percentage"),

  LAMBDA_INVOCATIONS_USAGE("lambda_invocations_usage"),

  LAMBDA_INVOCATIONS_PERCENTAGE("lambda_invocations_percentage"),

  FARGATE_USAGE("fargate_usage"),

  FARGATE_PERCENTAGE("fargate_percentage"),

  PROFILED_HOST_USAGE("profiled_host_usage"),

  PROFILED_HOST_PERCENTAGE("profiled_host_percentage"),

  PROFILED_CONTAINER_USAGE("profiled_container_usage"),

  PROFILED_CONTAINER_PERCENTAGE("profiled_container_percentage"),

  DBM_HOST_USAGE("dbm_host_usage"),

  DBM_HOST_PERCENTAGE("dbm_host_percentage"),

  DBM_QUERIES_USAGE("dbm_queries_usage"),

  DBM_QUERIES_PERCENTAGE("dbm_queries_percentage"),

  ALL("*");

  private String value;

  UsageAttributionSupportedMetrics(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static UsageAttributionSupportedMetrics fromValue(String value) {
    for (UsageAttributionSupportedMetrics b : UsageAttributionSupportedMetrics.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}
