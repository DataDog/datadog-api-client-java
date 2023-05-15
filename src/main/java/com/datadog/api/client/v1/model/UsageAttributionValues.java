/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** Fields in Usage Summary by tag(s). */
@JsonPropertyOrder({
  UsageAttributionValues.JSON_PROPERTY_API_PERCENTAGE,
  UsageAttributionValues.JSON_PROPERTY_API_USAGE,
  UsageAttributionValues.JSON_PROPERTY_APM_FARGATE_PERCENTAGE,
  UsageAttributionValues.JSON_PROPERTY_APM_FARGATE_USAGE,
  UsageAttributionValues.JSON_PROPERTY_APM_HOST_PERCENTAGE,
  UsageAttributionValues.JSON_PROPERTY_APM_HOST_USAGE,
  UsageAttributionValues.JSON_PROPERTY_APPSEC_FARGATE_PERCENTAGE,
  UsageAttributionValues.JSON_PROPERTY_APPSEC_FARGATE_USAGE,
  UsageAttributionValues.JSON_PROPERTY_APPSEC_PERCENTAGE,
  UsageAttributionValues.JSON_PROPERTY_APPSEC_USAGE,
  UsageAttributionValues.JSON_PROPERTY_BROWSER_PERCENTAGE,
  UsageAttributionValues.JSON_PROPERTY_BROWSER_USAGE,
  UsageAttributionValues.JSON_PROPERTY_CONTAINER_PERCENTAGE,
  UsageAttributionValues.JSON_PROPERTY_CONTAINER_USAGE,
  UsageAttributionValues.JSON_PROPERTY_CSPM_CONTAINER_PERCENTAGE,
  UsageAttributionValues.JSON_PROPERTY_CSPM_CONTAINER_USAGE,
  UsageAttributionValues.JSON_PROPERTY_CSPM_HOST_PERCENTAGE,
  UsageAttributionValues.JSON_PROPERTY_CSPM_HOST_USAGE,
  UsageAttributionValues.JSON_PROPERTY_CUSTOM_TIMESERIES_PERCENTAGE,
  UsageAttributionValues.JSON_PROPERTY_CUSTOM_TIMESERIES_USAGE,
  UsageAttributionValues.JSON_PROPERTY_CWS_CONTAINER_PERCENTAGE,
  UsageAttributionValues.JSON_PROPERTY_CWS_CONTAINER_USAGE,
  UsageAttributionValues.JSON_PROPERTY_CWS_HOST_PERCENTAGE,
  UsageAttributionValues.JSON_PROPERTY_CWS_HOST_USAGE,
  UsageAttributionValues.JSON_PROPERTY_DBM_HOSTS_PERCENTAGE,
  UsageAttributionValues.JSON_PROPERTY_DBM_HOSTS_USAGE,
  UsageAttributionValues.JSON_PROPERTY_DBM_QUERIES_PERCENTAGE,
  UsageAttributionValues.JSON_PROPERTY_DBM_QUERIES_USAGE,
  UsageAttributionValues.JSON_PROPERTY_ESTIMATED_INDEXED_LOGS_PERCENTAGE,
  UsageAttributionValues.JSON_PROPERTY_ESTIMATED_INDEXED_LOGS_USAGE,
  UsageAttributionValues.JSON_PROPERTY_ESTIMATED_INDEXED_SPANS_PERCENTAGE,
  UsageAttributionValues.JSON_PROPERTY_ESTIMATED_INDEXED_SPANS_USAGE,
  UsageAttributionValues.JSON_PROPERTY_ESTIMATED_INGESTED_LOGS_PERCENTAGE,
  UsageAttributionValues.JSON_PROPERTY_ESTIMATED_INGESTED_LOGS_USAGE,
  UsageAttributionValues.JSON_PROPERTY_ESTIMATED_INGESTED_SPANS_PERCENTAGE,
  UsageAttributionValues.JSON_PROPERTY_ESTIMATED_INGESTED_SPANS_USAGE,
  UsageAttributionValues.JSON_PROPERTY_ESTIMATED_RUM_SESSIONS_PERCENTAGE,
  UsageAttributionValues.JSON_PROPERTY_ESTIMATED_RUM_SESSIONS_USAGE,
  UsageAttributionValues.JSON_PROPERTY_INFRA_HOST_PERCENTAGE,
  UsageAttributionValues.JSON_PROPERTY_INFRA_HOST_USAGE,
  UsageAttributionValues.JSON_PROPERTY_LAMBDA_FUNCTIONS_PERCENTAGE,
  UsageAttributionValues.JSON_PROPERTY_LAMBDA_FUNCTIONS_USAGE,
  UsageAttributionValues.JSON_PROPERTY_LAMBDA_INVOCATIONS_PERCENTAGE,
  UsageAttributionValues.JSON_PROPERTY_LAMBDA_INVOCATIONS_USAGE,
  UsageAttributionValues.JSON_PROPERTY_NPM_HOST_PERCENTAGE,
  UsageAttributionValues.JSON_PROPERTY_NPM_HOST_USAGE,
  UsageAttributionValues.JSON_PROPERTY_PROFILED_CONTAINER_PERCENTAGE,
  UsageAttributionValues.JSON_PROPERTY_PROFILED_CONTAINER_USAGE,
  UsageAttributionValues.JSON_PROPERTY_PROFILED_HOSTS_PERCENTAGE,
  UsageAttributionValues.JSON_PROPERTY_PROFILED_HOSTS_USAGE,
  UsageAttributionValues.JSON_PROPERTY_SNMP_PERCENTAGE,
  UsageAttributionValues.JSON_PROPERTY_SNMP_USAGE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class UsageAttributionValues {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_API_PERCENTAGE = "api_percentage";
  private JsonNullable<Double> apiPercentage = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_API_USAGE = "api_usage";
  private JsonNullable<Double> apiUsage = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_APM_FARGATE_PERCENTAGE = "apm_fargate_percentage";
  private JsonNullable<Double> apmFargatePercentage = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_APM_FARGATE_USAGE = "apm_fargate_usage";
  private JsonNullable<Double> apmFargateUsage = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_APM_HOST_PERCENTAGE = "apm_host_percentage";
  private JsonNullable<Double> apmHostPercentage = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_APM_HOST_USAGE = "apm_host_usage";
  private JsonNullable<Double> apmHostUsage = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_APPSEC_FARGATE_PERCENTAGE = "appsec_fargate_percentage";
  private JsonNullable<Double> appsecFargatePercentage = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_APPSEC_FARGATE_USAGE = "appsec_fargate_usage";
  private JsonNullable<Double> appsecFargateUsage = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_APPSEC_PERCENTAGE = "appsec_percentage";
  private JsonNullable<Double> appsecPercentage = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_APPSEC_USAGE = "appsec_usage";
  private JsonNullable<Double> appsecUsage = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_BROWSER_PERCENTAGE = "browser_percentage";
  private JsonNullable<Double> browserPercentage = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_BROWSER_USAGE = "browser_usage";
  private JsonNullable<Double> browserUsage = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_CONTAINER_PERCENTAGE = "container_percentage";
  private JsonNullable<Double> containerPercentage = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_CONTAINER_USAGE = "container_usage";
  private JsonNullable<Double> containerUsage = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_CSPM_CONTAINER_PERCENTAGE = "cspm_container_percentage";
  private JsonNullable<Double> cspmContainerPercentage = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_CSPM_CONTAINER_USAGE = "cspm_container_usage";
  private JsonNullable<Double> cspmContainerUsage = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_CSPM_HOST_PERCENTAGE = "cspm_host_percentage";
  private JsonNullable<Double> cspmHostPercentage = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_CSPM_HOST_USAGE = "cspm_host_usage";
  private JsonNullable<Double> cspmHostUsage = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_CUSTOM_TIMESERIES_PERCENTAGE =
      "custom_timeseries_percentage";
  private JsonNullable<Double> customTimeseriesPercentage = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_CUSTOM_TIMESERIES_USAGE = "custom_timeseries_usage";
  private JsonNullable<Double> customTimeseriesUsage = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_CWS_CONTAINER_PERCENTAGE = "cws_container_percentage";
  private JsonNullable<Double> cwsContainerPercentage = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_CWS_CONTAINER_USAGE = "cws_container_usage";
  private JsonNullable<Double> cwsContainerUsage = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_CWS_HOST_PERCENTAGE = "cws_host_percentage";
  private JsonNullable<Double> cwsHostPercentage = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_CWS_HOST_USAGE = "cws_host_usage";
  private JsonNullable<Double> cwsHostUsage = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_DBM_HOSTS_PERCENTAGE = "dbm_hosts_percentage";
  private JsonNullable<Double> dbmHostsPercentage = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_DBM_HOSTS_USAGE = "dbm_hosts_usage";
  private JsonNullable<Double> dbmHostsUsage = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_DBM_QUERIES_PERCENTAGE = "dbm_queries_percentage";
  private JsonNullable<Double> dbmQueriesPercentage = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_DBM_QUERIES_USAGE = "dbm_queries_usage";
  private JsonNullable<Double> dbmQueriesUsage = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_ESTIMATED_INDEXED_LOGS_PERCENTAGE =
      "estimated_indexed_logs_percentage";
  private JsonNullable<Double> estimatedIndexedLogsPercentage = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_ESTIMATED_INDEXED_LOGS_USAGE =
      "estimated_indexed_logs_usage";
  private JsonNullable<Double> estimatedIndexedLogsUsage = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_ESTIMATED_INDEXED_SPANS_PERCENTAGE =
      "estimated_indexed_spans_percentage";
  private JsonNullable<Double> estimatedIndexedSpansPercentage = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_ESTIMATED_INDEXED_SPANS_USAGE =
      "estimated_indexed_spans_usage";
  private JsonNullable<Double> estimatedIndexedSpansUsage = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_ESTIMATED_INGESTED_LOGS_PERCENTAGE =
      "estimated_ingested_logs_percentage";
  private JsonNullable<Double> estimatedIngestedLogsPercentage = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_ESTIMATED_INGESTED_LOGS_USAGE =
      "estimated_ingested_logs_usage";
  private JsonNullable<Double> estimatedIngestedLogsUsage = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_ESTIMATED_INGESTED_SPANS_PERCENTAGE =
      "estimated_ingested_spans_percentage";
  private JsonNullable<Double> estimatedIngestedSpansPercentage = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_ESTIMATED_INGESTED_SPANS_USAGE =
      "estimated_ingested_spans_usage";
  private JsonNullable<Double> estimatedIngestedSpansUsage = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_ESTIMATED_RUM_SESSIONS_PERCENTAGE =
      "estimated_rum_sessions_percentage";
  private JsonNullable<Double> estimatedRumSessionsPercentage = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_ESTIMATED_RUM_SESSIONS_USAGE =
      "estimated_rum_sessions_usage";
  private JsonNullable<Double> estimatedRumSessionsUsage = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_INFRA_HOST_PERCENTAGE = "infra_host_percentage";
  private JsonNullable<Double> infraHostPercentage = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_INFRA_HOST_USAGE = "infra_host_usage";
  private JsonNullable<Double> infraHostUsage = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_LAMBDA_FUNCTIONS_PERCENTAGE =
      "lambda_functions_percentage";
  private JsonNullable<Double> lambdaFunctionsPercentage = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_LAMBDA_FUNCTIONS_USAGE = "lambda_functions_usage";
  private JsonNullable<Double> lambdaFunctionsUsage = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_LAMBDA_INVOCATIONS_PERCENTAGE =
      "lambda_invocations_percentage";
  private JsonNullable<Double> lambdaInvocationsPercentage = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_LAMBDA_INVOCATIONS_USAGE = "lambda_invocations_usage";
  private JsonNullable<Double> lambdaInvocationsUsage = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_NPM_HOST_PERCENTAGE = "npm_host_percentage";
  private JsonNullable<Double> npmHostPercentage = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_NPM_HOST_USAGE = "npm_host_usage";
  private JsonNullable<Double> npmHostUsage = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_PROFILED_CONTAINER_PERCENTAGE =
      "profiled_container_percentage";
  private JsonNullable<Double> profiledContainerPercentage = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_PROFILED_CONTAINER_USAGE = "profiled_container_usage";
  private JsonNullable<Double> profiledContainerUsage = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_PROFILED_HOSTS_PERCENTAGE = "profiled_hosts_percentage";
  private JsonNullable<Double> profiledHostsPercentage = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_PROFILED_HOSTS_USAGE = "profiled_hosts_usage";
  private JsonNullable<Double> profiledHostsUsage = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_SNMP_PERCENTAGE = "snmp_percentage";
  private JsonNullable<Double> snmpPercentage = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_SNMP_USAGE = "snmp_usage";
  private JsonNullable<Double> snmpUsage = JsonNullable.<Double>undefined();

  public UsageAttributionValues apiPercentage(Double apiPercentage) {
    this.apiPercentage = JsonNullable.<Double>of(apiPercentage);
    return this;
  }

  /**
   * The percentage of synthetic API test usage by tag(s).
   *
   * @return apiPercentage
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Double getApiPercentage() {
    return apiPercentage.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_API_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getApiPercentage_JsonNullable() {
    return apiPercentage;
  }

  @JsonProperty(JSON_PROPERTY_API_PERCENTAGE)
  public void setApiPercentage_JsonNullable(JsonNullable<Double> apiPercentage) {
    this.apiPercentage = apiPercentage;
  }

  public void setApiPercentage(Double apiPercentage) {
    this.apiPercentage = JsonNullable.<Double>of(apiPercentage);
  }

  public UsageAttributionValues apiUsage(Double apiUsage) {
    this.apiUsage = JsonNullable.<Double>of(apiUsage);
    return this;
  }

  /**
   * The synthetic API test usage by tag(s).
   *
   * @return apiUsage
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Double getApiUsage() {
    return apiUsage.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_API_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getApiUsage_JsonNullable() {
    return apiUsage;
  }

  @JsonProperty(JSON_PROPERTY_API_USAGE)
  public void setApiUsage_JsonNullable(JsonNullable<Double> apiUsage) {
    this.apiUsage = apiUsage;
  }

  public void setApiUsage(Double apiUsage) {
    this.apiUsage = JsonNullable.<Double>of(apiUsage);
  }

  public UsageAttributionValues apmFargatePercentage(Double apmFargatePercentage) {
    this.apmFargatePercentage = JsonNullable.<Double>of(apmFargatePercentage);
    return this;
  }

  /**
   * The percentage of APM ECS Fargate task usage by tag(s).
   *
   * @return apmFargatePercentage
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Double getApmFargatePercentage() {
    return apmFargatePercentage.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_APM_FARGATE_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getApmFargatePercentage_JsonNullable() {
    return apmFargatePercentage;
  }

  @JsonProperty(JSON_PROPERTY_APM_FARGATE_PERCENTAGE)
  public void setApmFargatePercentage_JsonNullable(JsonNullable<Double> apmFargatePercentage) {
    this.apmFargatePercentage = apmFargatePercentage;
  }

  public void setApmFargatePercentage(Double apmFargatePercentage) {
    this.apmFargatePercentage = JsonNullable.<Double>of(apmFargatePercentage);
  }

  public UsageAttributionValues apmFargateUsage(Double apmFargateUsage) {
    this.apmFargateUsage = JsonNullable.<Double>of(apmFargateUsage);
    return this;
  }

  /**
   * The APM ECS Fargate task usage by tag(s).
   *
   * @return apmFargateUsage
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Double getApmFargateUsage() {
    return apmFargateUsage.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_APM_FARGATE_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getApmFargateUsage_JsonNullable() {
    return apmFargateUsage;
  }

  @JsonProperty(JSON_PROPERTY_APM_FARGATE_USAGE)
  public void setApmFargateUsage_JsonNullable(JsonNullable<Double> apmFargateUsage) {
    this.apmFargateUsage = apmFargateUsage;
  }

  public void setApmFargateUsage(Double apmFargateUsage) {
    this.apmFargateUsage = JsonNullable.<Double>of(apmFargateUsage);
  }

  public UsageAttributionValues apmHostPercentage(Double apmHostPercentage) {
    this.apmHostPercentage = JsonNullable.<Double>of(apmHostPercentage);
    return this;
  }

  /**
   * The percentage of APM host usage by tag(s).
   *
   * @return apmHostPercentage
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Double getApmHostPercentage() {
    return apmHostPercentage.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_APM_HOST_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getApmHostPercentage_JsonNullable() {
    return apmHostPercentage;
  }

  @JsonProperty(JSON_PROPERTY_APM_HOST_PERCENTAGE)
  public void setApmHostPercentage_JsonNullable(JsonNullable<Double> apmHostPercentage) {
    this.apmHostPercentage = apmHostPercentage;
  }

  public void setApmHostPercentage(Double apmHostPercentage) {
    this.apmHostPercentage = JsonNullable.<Double>of(apmHostPercentage);
  }

  public UsageAttributionValues apmHostUsage(Double apmHostUsage) {
    this.apmHostUsage = JsonNullable.<Double>of(apmHostUsage);
    return this;
  }

  /**
   * The APM host usage by tag(s).
   *
   * @return apmHostUsage
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Double getApmHostUsage() {
    return apmHostUsage.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_APM_HOST_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getApmHostUsage_JsonNullable() {
    return apmHostUsage;
  }

  @JsonProperty(JSON_PROPERTY_APM_HOST_USAGE)
  public void setApmHostUsage_JsonNullable(JsonNullable<Double> apmHostUsage) {
    this.apmHostUsage = apmHostUsage;
  }

  public void setApmHostUsage(Double apmHostUsage) {
    this.apmHostUsage = JsonNullable.<Double>of(apmHostUsage);
  }

  public UsageAttributionValues appsecFargatePercentage(Double appsecFargatePercentage) {
    this.appsecFargatePercentage = JsonNullable.<Double>of(appsecFargatePercentage);
    return this;
  }

  /**
   * The percentage of Application Security Monitoring ECS Fargate task usage by tag(s).
   *
   * @return appsecFargatePercentage
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Double getAppsecFargatePercentage() {
    return appsecFargatePercentage.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_APPSEC_FARGATE_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getAppsecFargatePercentage_JsonNullable() {
    return appsecFargatePercentage;
  }

  @JsonProperty(JSON_PROPERTY_APPSEC_FARGATE_PERCENTAGE)
  public void setAppsecFargatePercentage_JsonNullable(
      JsonNullable<Double> appsecFargatePercentage) {
    this.appsecFargatePercentage = appsecFargatePercentage;
  }

  public void setAppsecFargatePercentage(Double appsecFargatePercentage) {
    this.appsecFargatePercentage = JsonNullable.<Double>of(appsecFargatePercentage);
  }

  public UsageAttributionValues appsecFargateUsage(Double appsecFargateUsage) {
    this.appsecFargateUsage = JsonNullable.<Double>of(appsecFargateUsage);
    return this;
  }

  /**
   * The Application Security Monitoring ECS Fargate task usage by tag(s).
   *
   * @return appsecFargateUsage
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Double getAppsecFargateUsage() {
    return appsecFargateUsage.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_APPSEC_FARGATE_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getAppsecFargateUsage_JsonNullable() {
    return appsecFargateUsage;
  }

  @JsonProperty(JSON_PROPERTY_APPSEC_FARGATE_USAGE)
  public void setAppsecFargateUsage_JsonNullable(JsonNullable<Double> appsecFargateUsage) {
    this.appsecFargateUsage = appsecFargateUsage;
  }

  public void setAppsecFargateUsage(Double appsecFargateUsage) {
    this.appsecFargateUsage = JsonNullable.<Double>of(appsecFargateUsage);
  }

  public UsageAttributionValues appsecPercentage(Double appsecPercentage) {
    this.appsecPercentage = JsonNullable.<Double>of(appsecPercentage);
    return this;
  }

  /**
   * The percentage of Application Security Monitoring host usage by tag(s).
   *
   * @return appsecPercentage
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Double getAppsecPercentage() {
    return appsecPercentage.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_APPSEC_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getAppsecPercentage_JsonNullable() {
    return appsecPercentage;
  }

  @JsonProperty(JSON_PROPERTY_APPSEC_PERCENTAGE)
  public void setAppsecPercentage_JsonNullable(JsonNullable<Double> appsecPercentage) {
    this.appsecPercentage = appsecPercentage;
  }

  public void setAppsecPercentage(Double appsecPercentage) {
    this.appsecPercentage = JsonNullable.<Double>of(appsecPercentage);
  }

  public UsageAttributionValues appsecUsage(Double appsecUsage) {
    this.appsecUsage = JsonNullable.<Double>of(appsecUsage);
    return this;
  }

  /**
   * The Application Security Monitoring host usage by tag(s).
   *
   * @return appsecUsage
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Double getAppsecUsage() {
    return appsecUsage.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_APPSEC_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getAppsecUsage_JsonNullable() {
    return appsecUsage;
  }

  @JsonProperty(JSON_PROPERTY_APPSEC_USAGE)
  public void setAppsecUsage_JsonNullable(JsonNullable<Double> appsecUsage) {
    this.appsecUsage = appsecUsage;
  }

  public void setAppsecUsage(Double appsecUsage) {
    this.appsecUsage = JsonNullable.<Double>of(appsecUsage);
  }

  public UsageAttributionValues browserPercentage(Double browserPercentage) {
    this.browserPercentage = JsonNullable.<Double>of(browserPercentage);
    return this;
  }

  /**
   * The percentage of synthetic browser test usage by tag(s).
   *
   * @return browserPercentage
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Double getBrowserPercentage() {
    return browserPercentage.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_BROWSER_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getBrowserPercentage_JsonNullable() {
    return browserPercentage;
  }

  @JsonProperty(JSON_PROPERTY_BROWSER_PERCENTAGE)
  public void setBrowserPercentage_JsonNullable(JsonNullable<Double> browserPercentage) {
    this.browserPercentage = browserPercentage;
  }

  public void setBrowserPercentage(Double browserPercentage) {
    this.browserPercentage = JsonNullable.<Double>of(browserPercentage);
  }

  public UsageAttributionValues browserUsage(Double browserUsage) {
    this.browserUsage = JsonNullable.<Double>of(browserUsage);
    return this;
  }

  /**
   * The synthetic browser test usage by tag(s).
   *
   * @return browserUsage
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Double getBrowserUsage() {
    return browserUsage.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_BROWSER_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getBrowserUsage_JsonNullable() {
    return browserUsage;
  }

  @JsonProperty(JSON_PROPERTY_BROWSER_USAGE)
  public void setBrowserUsage_JsonNullable(JsonNullable<Double> browserUsage) {
    this.browserUsage = browserUsage;
  }

  public void setBrowserUsage(Double browserUsage) {
    this.browserUsage = JsonNullable.<Double>of(browserUsage);
  }

  public UsageAttributionValues containerPercentage(Double containerPercentage) {
    this.containerPercentage = JsonNullable.<Double>of(containerPercentage);
    return this;
  }

  /**
   * The percentage of container usage by tag(s).
   *
   * @return containerPercentage
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Double getContainerPercentage() {
    return containerPercentage.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CONTAINER_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getContainerPercentage_JsonNullable() {
    return containerPercentage;
  }

  @JsonProperty(JSON_PROPERTY_CONTAINER_PERCENTAGE)
  public void setContainerPercentage_JsonNullable(JsonNullable<Double> containerPercentage) {
    this.containerPercentage = containerPercentage;
  }

  public void setContainerPercentage(Double containerPercentage) {
    this.containerPercentage = JsonNullable.<Double>of(containerPercentage);
  }

  public UsageAttributionValues containerUsage(Double containerUsage) {
    this.containerUsage = JsonNullable.<Double>of(containerUsage);
    return this;
  }

  /**
   * The container usage by tag(s).
   *
   * @return containerUsage
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Double getContainerUsage() {
    return containerUsage.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CONTAINER_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getContainerUsage_JsonNullable() {
    return containerUsage;
  }

  @JsonProperty(JSON_PROPERTY_CONTAINER_USAGE)
  public void setContainerUsage_JsonNullable(JsonNullable<Double> containerUsage) {
    this.containerUsage = containerUsage;
  }

  public void setContainerUsage(Double containerUsage) {
    this.containerUsage = JsonNullable.<Double>of(containerUsage);
  }

  public UsageAttributionValues cspmContainerPercentage(Double cspmContainerPercentage) {
    this.cspmContainerPercentage = JsonNullable.<Double>of(cspmContainerPercentage);
    return this;
  }

  /**
   * The percentage of Cloud Security Posture Management container usage by tag(s)
   *
   * @return cspmContainerPercentage
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Double getCspmContainerPercentage() {
    return cspmContainerPercentage.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CSPM_CONTAINER_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getCspmContainerPercentage_JsonNullable() {
    return cspmContainerPercentage;
  }

  @JsonProperty(JSON_PROPERTY_CSPM_CONTAINER_PERCENTAGE)
  public void setCspmContainerPercentage_JsonNullable(
      JsonNullable<Double> cspmContainerPercentage) {
    this.cspmContainerPercentage = cspmContainerPercentage;
  }

  public void setCspmContainerPercentage(Double cspmContainerPercentage) {
    this.cspmContainerPercentage = JsonNullable.<Double>of(cspmContainerPercentage);
  }

  public UsageAttributionValues cspmContainerUsage(Double cspmContainerUsage) {
    this.cspmContainerUsage = JsonNullable.<Double>of(cspmContainerUsage);
    return this;
  }

  /**
   * The Cloud Security Posture Management container usage by tag(s)
   *
   * @return cspmContainerUsage
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Double getCspmContainerUsage() {
    return cspmContainerUsage.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CSPM_CONTAINER_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getCspmContainerUsage_JsonNullable() {
    return cspmContainerUsage;
  }

  @JsonProperty(JSON_PROPERTY_CSPM_CONTAINER_USAGE)
  public void setCspmContainerUsage_JsonNullable(JsonNullable<Double> cspmContainerUsage) {
    this.cspmContainerUsage = cspmContainerUsage;
  }

  public void setCspmContainerUsage(Double cspmContainerUsage) {
    this.cspmContainerUsage = JsonNullable.<Double>of(cspmContainerUsage);
  }

  public UsageAttributionValues cspmHostPercentage(Double cspmHostPercentage) {
    this.cspmHostPercentage = JsonNullable.<Double>of(cspmHostPercentage);
    return this;
  }

  /**
   * The percentage of Cloud Security Posture Management host usage by tag(s)
   *
   * @return cspmHostPercentage
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Double getCspmHostPercentage() {
    return cspmHostPercentage.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CSPM_HOST_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getCspmHostPercentage_JsonNullable() {
    return cspmHostPercentage;
  }

  @JsonProperty(JSON_PROPERTY_CSPM_HOST_PERCENTAGE)
  public void setCspmHostPercentage_JsonNullable(JsonNullable<Double> cspmHostPercentage) {
    this.cspmHostPercentage = cspmHostPercentage;
  }

  public void setCspmHostPercentage(Double cspmHostPercentage) {
    this.cspmHostPercentage = JsonNullable.<Double>of(cspmHostPercentage);
  }

  public UsageAttributionValues cspmHostUsage(Double cspmHostUsage) {
    this.cspmHostUsage = JsonNullable.<Double>of(cspmHostUsage);
    return this;
  }

  /**
   * The Cloud Security Posture Management host usage by tag(s)
   *
   * @return cspmHostUsage
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Double getCspmHostUsage() {
    return cspmHostUsage.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CSPM_HOST_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getCspmHostUsage_JsonNullable() {
    return cspmHostUsage;
  }

  @JsonProperty(JSON_PROPERTY_CSPM_HOST_USAGE)
  public void setCspmHostUsage_JsonNullable(JsonNullable<Double> cspmHostUsage) {
    this.cspmHostUsage = cspmHostUsage;
  }

  public void setCspmHostUsage(Double cspmHostUsage) {
    this.cspmHostUsage = JsonNullable.<Double>of(cspmHostUsage);
  }

  public UsageAttributionValues customTimeseriesPercentage(Double customTimeseriesPercentage) {
    this.customTimeseriesPercentage = JsonNullable.<Double>of(customTimeseriesPercentage);
    return this;
  }

  /**
   * The percentage of custom metrics usage by tag(s).
   *
   * @return customTimeseriesPercentage
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Double getCustomTimeseriesPercentage() {
    return customTimeseriesPercentage.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CUSTOM_TIMESERIES_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getCustomTimeseriesPercentage_JsonNullable() {
    return customTimeseriesPercentage;
  }

  @JsonProperty(JSON_PROPERTY_CUSTOM_TIMESERIES_PERCENTAGE)
  public void setCustomTimeseriesPercentage_JsonNullable(
      JsonNullable<Double> customTimeseriesPercentage) {
    this.customTimeseriesPercentage = customTimeseriesPercentage;
  }

  public void setCustomTimeseriesPercentage(Double customTimeseriesPercentage) {
    this.customTimeseriesPercentage = JsonNullable.<Double>of(customTimeseriesPercentage);
  }

  public UsageAttributionValues customTimeseriesUsage(Double customTimeseriesUsage) {
    this.customTimeseriesUsage = JsonNullable.<Double>of(customTimeseriesUsage);
    return this;
  }

  /**
   * The custom metrics usage by tag(s).
   *
   * @return customTimeseriesUsage
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Double getCustomTimeseriesUsage() {
    return customTimeseriesUsage.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CUSTOM_TIMESERIES_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getCustomTimeseriesUsage_JsonNullable() {
    return customTimeseriesUsage;
  }

  @JsonProperty(JSON_PROPERTY_CUSTOM_TIMESERIES_USAGE)
  public void setCustomTimeseriesUsage_JsonNullable(JsonNullable<Double> customTimeseriesUsage) {
    this.customTimeseriesUsage = customTimeseriesUsage;
  }

  public void setCustomTimeseriesUsage(Double customTimeseriesUsage) {
    this.customTimeseriesUsage = JsonNullable.<Double>of(customTimeseriesUsage);
  }

  public UsageAttributionValues cwsContainerPercentage(Double cwsContainerPercentage) {
    this.cwsContainerPercentage = JsonNullable.<Double>of(cwsContainerPercentage);
    return this;
  }

  /**
   * The percentage of Cloud Workload Security container usage by tag(s)
   *
   * @return cwsContainerPercentage
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Double getCwsContainerPercentage() {
    return cwsContainerPercentage.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CWS_CONTAINER_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getCwsContainerPercentage_JsonNullable() {
    return cwsContainerPercentage;
  }

  @JsonProperty(JSON_PROPERTY_CWS_CONTAINER_PERCENTAGE)
  public void setCwsContainerPercentage_JsonNullable(JsonNullable<Double> cwsContainerPercentage) {
    this.cwsContainerPercentage = cwsContainerPercentage;
  }

  public void setCwsContainerPercentage(Double cwsContainerPercentage) {
    this.cwsContainerPercentage = JsonNullable.<Double>of(cwsContainerPercentage);
  }

  public UsageAttributionValues cwsContainerUsage(Double cwsContainerUsage) {
    this.cwsContainerUsage = JsonNullable.<Double>of(cwsContainerUsage);
    return this;
  }

  /**
   * The Cloud Workload Security container usage by tag(s)
   *
   * @return cwsContainerUsage
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Double getCwsContainerUsage() {
    return cwsContainerUsage.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CWS_CONTAINER_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getCwsContainerUsage_JsonNullable() {
    return cwsContainerUsage;
  }

  @JsonProperty(JSON_PROPERTY_CWS_CONTAINER_USAGE)
  public void setCwsContainerUsage_JsonNullable(JsonNullable<Double> cwsContainerUsage) {
    this.cwsContainerUsage = cwsContainerUsage;
  }

  public void setCwsContainerUsage(Double cwsContainerUsage) {
    this.cwsContainerUsage = JsonNullable.<Double>of(cwsContainerUsage);
  }

  public UsageAttributionValues cwsHostPercentage(Double cwsHostPercentage) {
    this.cwsHostPercentage = JsonNullable.<Double>of(cwsHostPercentage);
    return this;
  }

  /**
   * The percentage of Cloud Workload Security host usage by tag(s)
   *
   * @return cwsHostPercentage
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Double getCwsHostPercentage() {
    return cwsHostPercentage.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CWS_HOST_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getCwsHostPercentage_JsonNullable() {
    return cwsHostPercentage;
  }

  @JsonProperty(JSON_PROPERTY_CWS_HOST_PERCENTAGE)
  public void setCwsHostPercentage_JsonNullable(JsonNullable<Double> cwsHostPercentage) {
    this.cwsHostPercentage = cwsHostPercentage;
  }

  public void setCwsHostPercentage(Double cwsHostPercentage) {
    this.cwsHostPercentage = JsonNullable.<Double>of(cwsHostPercentage);
  }

  public UsageAttributionValues cwsHostUsage(Double cwsHostUsage) {
    this.cwsHostUsage = JsonNullable.<Double>of(cwsHostUsage);
    return this;
  }

  /**
   * The Cloud Workload Security host usage by tag(s)
   *
   * @return cwsHostUsage
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Double getCwsHostUsage() {
    return cwsHostUsage.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CWS_HOST_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getCwsHostUsage_JsonNullable() {
    return cwsHostUsage;
  }

  @JsonProperty(JSON_PROPERTY_CWS_HOST_USAGE)
  public void setCwsHostUsage_JsonNullable(JsonNullable<Double> cwsHostUsage) {
    this.cwsHostUsage = cwsHostUsage;
  }

  public void setCwsHostUsage(Double cwsHostUsage) {
    this.cwsHostUsage = JsonNullable.<Double>of(cwsHostUsage);
  }

  public UsageAttributionValues dbmHostsPercentage(Double dbmHostsPercentage) {
    this.dbmHostsPercentage = JsonNullable.<Double>of(dbmHostsPercentage);
    return this;
  }

  /**
   * The percentage of Database Monitoring host usage by tag(s).
   *
   * @return dbmHostsPercentage
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Double getDbmHostsPercentage() {
    return dbmHostsPercentage.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DBM_HOSTS_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getDbmHostsPercentage_JsonNullable() {
    return dbmHostsPercentage;
  }

  @JsonProperty(JSON_PROPERTY_DBM_HOSTS_PERCENTAGE)
  public void setDbmHostsPercentage_JsonNullable(JsonNullable<Double> dbmHostsPercentage) {
    this.dbmHostsPercentage = dbmHostsPercentage;
  }

  public void setDbmHostsPercentage(Double dbmHostsPercentage) {
    this.dbmHostsPercentage = JsonNullable.<Double>of(dbmHostsPercentage);
  }

  public UsageAttributionValues dbmHostsUsage(Double dbmHostsUsage) {
    this.dbmHostsUsage = JsonNullable.<Double>of(dbmHostsUsage);
    return this;
  }

  /**
   * The Database Monitoring host usage by tag(s).
   *
   * @return dbmHostsUsage
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Double getDbmHostsUsage() {
    return dbmHostsUsage.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DBM_HOSTS_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getDbmHostsUsage_JsonNullable() {
    return dbmHostsUsage;
  }

  @JsonProperty(JSON_PROPERTY_DBM_HOSTS_USAGE)
  public void setDbmHostsUsage_JsonNullable(JsonNullable<Double> dbmHostsUsage) {
    this.dbmHostsUsage = dbmHostsUsage;
  }

  public void setDbmHostsUsage(Double dbmHostsUsage) {
    this.dbmHostsUsage = JsonNullable.<Double>of(dbmHostsUsage);
  }

  public UsageAttributionValues dbmQueriesPercentage(Double dbmQueriesPercentage) {
    this.dbmQueriesPercentage = JsonNullable.<Double>of(dbmQueriesPercentage);
    return this;
  }

  /**
   * The percentage of Database Monitoring normalized queries usage by tag(s).
   *
   * @return dbmQueriesPercentage
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Double getDbmQueriesPercentage() {
    return dbmQueriesPercentage.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DBM_QUERIES_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getDbmQueriesPercentage_JsonNullable() {
    return dbmQueriesPercentage;
  }

  @JsonProperty(JSON_PROPERTY_DBM_QUERIES_PERCENTAGE)
  public void setDbmQueriesPercentage_JsonNullable(JsonNullable<Double> dbmQueriesPercentage) {
    this.dbmQueriesPercentage = dbmQueriesPercentage;
  }

  public void setDbmQueriesPercentage(Double dbmQueriesPercentage) {
    this.dbmQueriesPercentage = JsonNullable.<Double>of(dbmQueriesPercentage);
  }

  public UsageAttributionValues dbmQueriesUsage(Double dbmQueriesUsage) {
    this.dbmQueriesUsage = JsonNullable.<Double>of(dbmQueriesUsage);
    return this;
  }

  /**
   * The Database Monitoring normalized queries usage by tag(s).
   *
   * @return dbmQueriesUsage
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Double getDbmQueriesUsage() {
    return dbmQueriesUsage.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DBM_QUERIES_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getDbmQueriesUsage_JsonNullable() {
    return dbmQueriesUsage;
  }

  @JsonProperty(JSON_PROPERTY_DBM_QUERIES_USAGE)
  public void setDbmQueriesUsage_JsonNullable(JsonNullable<Double> dbmQueriesUsage) {
    this.dbmQueriesUsage = dbmQueriesUsage;
  }

  public void setDbmQueriesUsage(Double dbmQueriesUsage) {
    this.dbmQueriesUsage = JsonNullable.<Double>of(dbmQueriesUsage);
  }

  public UsageAttributionValues estimatedIndexedLogsPercentage(
      Double estimatedIndexedLogsPercentage) {
    this.estimatedIndexedLogsPercentage = JsonNullable.<Double>of(estimatedIndexedLogsPercentage);
    return this;
  }

  /**
   * The percentage of estimated live indexed logs usage by tag(s).
   *
   * @return estimatedIndexedLogsPercentage
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Double getEstimatedIndexedLogsPercentage() {
    return estimatedIndexedLogsPercentage.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ESTIMATED_INDEXED_LOGS_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getEstimatedIndexedLogsPercentage_JsonNullable() {
    return estimatedIndexedLogsPercentage;
  }

  @JsonProperty(JSON_PROPERTY_ESTIMATED_INDEXED_LOGS_PERCENTAGE)
  public void setEstimatedIndexedLogsPercentage_JsonNullable(
      JsonNullable<Double> estimatedIndexedLogsPercentage) {
    this.estimatedIndexedLogsPercentage = estimatedIndexedLogsPercentage;
  }

  public void setEstimatedIndexedLogsPercentage(Double estimatedIndexedLogsPercentage) {
    this.estimatedIndexedLogsPercentage = JsonNullable.<Double>of(estimatedIndexedLogsPercentage);
  }

  public UsageAttributionValues estimatedIndexedLogsUsage(Double estimatedIndexedLogsUsage) {
    this.estimatedIndexedLogsUsage = JsonNullable.<Double>of(estimatedIndexedLogsUsage);
    return this;
  }

  /**
   * The estimated live indexed logs usage by tag(s).
   *
   * @return estimatedIndexedLogsUsage
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Double getEstimatedIndexedLogsUsage() {
    return estimatedIndexedLogsUsage.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ESTIMATED_INDEXED_LOGS_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getEstimatedIndexedLogsUsage_JsonNullable() {
    return estimatedIndexedLogsUsage;
  }

  @JsonProperty(JSON_PROPERTY_ESTIMATED_INDEXED_LOGS_USAGE)
  public void setEstimatedIndexedLogsUsage_JsonNullable(
      JsonNullable<Double> estimatedIndexedLogsUsage) {
    this.estimatedIndexedLogsUsage = estimatedIndexedLogsUsage;
  }

  public void setEstimatedIndexedLogsUsage(Double estimatedIndexedLogsUsage) {
    this.estimatedIndexedLogsUsage = JsonNullable.<Double>of(estimatedIndexedLogsUsage);
  }

  public UsageAttributionValues estimatedIndexedSpansPercentage(
      Double estimatedIndexedSpansPercentage) {
    this.estimatedIndexedSpansPercentage = JsonNullable.<Double>of(estimatedIndexedSpansPercentage);
    return this;
  }

  /**
   * The percentage of estimated indexed spans usage by tag(s).
   *
   * @return estimatedIndexedSpansPercentage
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Double getEstimatedIndexedSpansPercentage() {
    return estimatedIndexedSpansPercentage.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ESTIMATED_INDEXED_SPANS_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getEstimatedIndexedSpansPercentage_JsonNullable() {
    return estimatedIndexedSpansPercentage;
  }

  @JsonProperty(JSON_PROPERTY_ESTIMATED_INDEXED_SPANS_PERCENTAGE)
  public void setEstimatedIndexedSpansPercentage_JsonNullable(
      JsonNullable<Double> estimatedIndexedSpansPercentage) {
    this.estimatedIndexedSpansPercentage = estimatedIndexedSpansPercentage;
  }

  public void setEstimatedIndexedSpansPercentage(Double estimatedIndexedSpansPercentage) {
    this.estimatedIndexedSpansPercentage = JsonNullable.<Double>of(estimatedIndexedSpansPercentage);
  }

  public UsageAttributionValues estimatedIndexedSpansUsage(Double estimatedIndexedSpansUsage) {
    this.estimatedIndexedSpansUsage = JsonNullable.<Double>of(estimatedIndexedSpansUsage);
    return this;
  }

  /**
   * The estimated indexed spans usage by tag(s).
   *
   * @return estimatedIndexedSpansUsage
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Double getEstimatedIndexedSpansUsage() {
    return estimatedIndexedSpansUsage.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ESTIMATED_INDEXED_SPANS_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getEstimatedIndexedSpansUsage_JsonNullable() {
    return estimatedIndexedSpansUsage;
  }

  @JsonProperty(JSON_PROPERTY_ESTIMATED_INDEXED_SPANS_USAGE)
  public void setEstimatedIndexedSpansUsage_JsonNullable(
      JsonNullable<Double> estimatedIndexedSpansUsage) {
    this.estimatedIndexedSpansUsage = estimatedIndexedSpansUsage;
  }

  public void setEstimatedIndexedSpansUsage(Double estimatedIndexedSpansUsage) {
    this.estimatedIndexedSpansUsage = JsonNullable.<Double>of(estimatedIndexedSpansUsage);
  }

  public UsageAttributionValues estimatedIngestedLogsPercentage(
      Double estimatedIngestedLogsPercentage) {
    this.estimatedIngestedLogsPercentage = JsonNullable.<Double>of(estimatedIngestedLogsPercentage);
    return this;
  }

  /**
   * The percentage of estimated live ingested logs usage by tag(s).
   *
   * @return estimatedIngestedLogsPercentage
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Double getEstimatedIngestedLogsPercentage() {
    return estimatedIngestedLogsPercentage.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ESTIMATED_INGESTED_LOGS_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getEstimatedIngestedLogsPercentage_JsonNullable() {
    return estimatedIngestedLogsPercentage;
  }

  @JsonProperty(JSON_PROPERTY_ESTIMATED_INGESTED_LOGS_PERCENTAGE)
  public void setEstimatedIngestedLogsPercentage_JsonNullable(
      JsonNullable<Double> estimatedIngestedLogsPercentage) {
    this.estimatedIngestedLogsPercentage = estimatedIngestedLogsPercentage;
  }

  public void setEstimatedIngestedLogsPercentage(Double estimatedIngestedLogsPercentage) {
    this.estimatedIngestedLogsPercentage = JsonNullable.<Double>of(estimatedIngestedLogsPercentage);
  }

  public UsageAttributionValues estimatedIngestedLogsUsage(Double estimatedIngestedLogsUsage) {
    this.estimatedIngestedLogsUsage = JsonNullable.<Double>of(estimatedIngestedLogsUsage);
    return this;
  }

  /**
   * The estimated live ingested logs usage by tag(s).
   *
   * @return estimatedIngestedLogsUsage
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Double getEstimatedIngestedLogsUsage() {
    return estimatedIngestedLogsUsage.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ESTIMATED_INGESTED_LOGS_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getEstimatedIngestedLogsUsage_JsonNullable() {
    return estimatedIngestedLogsUsage;
  }

  @JsonProperty(JSON_PROPERTY_ESTIMATED_INGESTED_LOGS_USAGE)
  public void setEstimatedIngestedLogsUsage_JsonNullable(
      JsonNullable<Double> estimatedIngestedLogsUsage) {
    this.estimatedIngestedLogsUsage = estimatedIngestedLogsUsage;
  }

  public void setEstimatedIngestedLogsUsage(Double estimatedIngestedLogsUsage) {
    this.estimatedIngestedLogsUsage = JsonNullable.<Double>of(estimatedIngestedLogsUsage);
  }

  public UsageAttributionValues estimatedIngestedSpansPercentage(
      Double estimatedIngestedSpansPercentage) {
    this.estimatedIngestedSpansPercentage =
        JsonNullable.<Double>of(estimatedIngestedSpansPercentage);
    return this;
  }

  /**
   * The percentage of estimated ingested spans usage by tag(s).
   *
   * @return estimatedIngestedSpansPercentage
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Double getEstimatedIngestedSpansPercentage() {
    return estimatedIngestedSpansPercentage.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ESTIMATED_INGESTED_SPANS_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getEstimatedIngestedSpansPercentage_JsonNullable() {
    return estimatedIngestedSpansPercentage;
  }

  @JsonProperty(JSON_PROPERTY_ESTIMATED_INGESTED_SPANS_PERCENTAGE)
  public void setEstimatedIngestedSpansPercentage_JsonNullable(
      JsonNullable<Double> estimatedIngestedSpansPercentage) {
    this.estimatedIngestedSpansPercentage = estimatedIngestedSpansPercentage;
  }

  public void setEstimatedIngestedSpansPercentage(Double estimatedIngestedSpansPercentage) {
    this.estimatedIngestedSpansPercentage =
        JsonNullable.<Double>of(estimatedIngestedSpansPercentage);
  }

  public UsageAttributionValues estimatedIngestedSpansUsage(Double estimatedIngestedSpansUsage) {
    this.estimatedIngestedSpansUsage = JsonNullable.<Double>of(estimatedIngestedSpansUsage);
    return this;
  }

  /**
   * The estimated ingested spans usage by tag(s).
   *
   * @return estimatedIngestedSpansUsage
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Double getEstimatedIngestedSpansUsage() {
    return estimatedIngestedSpansUsage.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ESTIMATED_INGESTED_SPANS_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getEstimatedIngestedSpansUsage_JsonNullable() {
    return estimatedIngestedSpansUsage;
  }

  @JsonProperty(JSON_PROPERTY_ESTIMATED_INGESTED_SPANS_USAGE)
  public void setEstimatedIngestedSpansUsage_JsonNullable(
      JsonNullable<Double> estimatedIngestedSpansUsage) {
    this.estimatedIngestedSpansUsage = estimatedIngestedSpansUsage;
  }

  public void setEstimatedIngestedSpansUsage(Double estimatedIngestedSpansUsage) {
    this.estimatedIngestedSpansUsage = JsonNullable.<Double>of(estimatedIngestedSpansUsage);
  }

  public UsageAttributionValues estimatedRumSessionsPercentage(
      Double estimatedRumSessionsPercentage) {
    this.estimatedRumSessionsPercentage = JsonNullable.<Double>of(estimatedRumSessionsPercentage);
    return this;
  }

  /**
   * The percentage of estimated rum sessions usage by tag(s).
   *
   * @return estimatedRumSessionsPercentage
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Double getEstimatedRumSessionsPercentage() {
    return estimatedRumSessionsPercentage.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ESTIMATED_RUM_SESSIONS_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getEstimatedRumSessionsPercentage_JsonNullable() {
    return estimatedRumSessionsPercentage;
  }

  @JsonProperty(JSON_PROPERTY_ESTIMATED_RUM_SESSIONS_PERCENTAGE)
  public void setEstimatedRumSessionsPercentage_JsonNullable(
      JsonNullable<Double> estimatedRumSessionsPercentage) {
    this.estimatedRumSessionsPercentage = estimatedRumSessionsPercentage;
  }

  public void setEstimatedRumSessionsPercentage(Double estimatedRumSessionsPercentage) {
    this.estimatedRumSessionsPercentage = JsonNullable.<Double>of(estimatedRumSessionsPercentage);
  }

  public UsageAttributionValues estimatedRumSessionsUsage(Double estimatedRumSessionsUsage) {
    this.estimatedRumSessionsUsage = JsonNullable.<Double>of(estimatedRumSessionsUsage);
    return this;
  }

  /**
   * The estimated rum sessions usage by tag(s).
   *
   * @return estimatedRumSessionsUsage
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Double getEstimatedRumSessionsUsage() {
    return estimatedRumSessionsUsage.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ESTIMATED_RUM_SESSIONS_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getEstimatedRumSessionsUsage_JsonNullable() {
    return estimatedRumSessionsUsage;
  }

  @JsonProperty(JSON_PROPERTY_ESTIMATED_RUM_SESSIONS_USAGE)
  public void setEstimatedRumSessionsUsage_JsonNullable(
      JsonNullable<Double> estimatedRumSessionsUsage) {
    this.estimatedRumSessionsUsage = estimatedRumSessionsUsage;
  }

  public void setEstimatedRumSessionsUsage(Double estimatedRumSessionsUsage) {
    this.estimatedRumSessionsUsage = JsonNullable.<Double>of(estimatedRumSessionsUsage);
  }

  public UsageAttributionValues infraHostPercentage(Double infraHostPercentage) {
    this.infraHostPercentage = JsonNullable.<Double>of(infraHostPercentage);
    return this;
  }

  /**
   * The percentage of infrastructure host usage by tag(s).
   *
   * @return infraHostPercentage
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Double getInfraHostPercentage() {
    return infraHostPercentage.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_INFRA_HOST_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getInfraHostPercentage_JsonNullable() {
    return infraHostPercentage;
  }

  @JsonProperty(JSON_PROPERTY_INFRA_HOST_PERCENTAGE)
  public void setInfraHostPercentage_JsonNullable(JsonNullable<Double> infraHostPercentage) {
    this.infraHostPercentage = infraHostPercentage;
  }

  public void setInfraHostPercentage(Double infraHostPercentage) {
    this.infraHostPercentage = JsonNullable.<Double>of(infraHostPercentage);
  }

  public UsageAttributionValues infraHostUsage(Double infraHostUsage) {
    this.infraHostUsage = JsonNullable.<Double>of(infraHostUsage);
    return this;
  }

  /**
   * The infrastructure host usage by tag(s).
   *
   * @return infraHostUsage
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Double getInfraHostUsage() {
    return infraHostUsage.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_INFRA_HOST_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getInfraHostUsage_JsonNullable() {
    return infraHostUsage;
  }

  @JsonProperty(JSON_PROPERTY_INFRA_HOST_USAGE)
  public void setInfraHostUsage_JsonNullable(JsonNullable<Double> infraHostUsage) {
    this.infraHostUsage = infraHostUsage;
  }

  public void setInfraHostUsage(Double infraHostUsage) {
    this.infraHostUsage = JsonNullable.<Double>of(infraHostUsage);
  }

  public UsageAttributionValues lambdaFunctionsPercentage(Double lambdaFunctionsPercentage) {
    this.lambdaFunctionsPercentage = JsonNullable.<Double>of(lambdaFunctionsPercentage);
    return this;
  }

  /**
   * The percentage of Lambda function usage by tag(s).
   *
   * @return lambdaFunctionsPercentage
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Double getLambdaFunctionsPercentage() {
    return lambdaFunctionsPercentage.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LAMBDA_FUNCTIONS_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getLambdaFunctionsPercentage_JsonNullable() {
    return lambdaFunctionsPercentage;
  }

  @JsonProperty(JSON_PROPERTY_LAMBDA_FUNCTIONS_PERCENTAGE)
  public void setLambdaFunctionsPercentage_JsonNullable(
      JsonNullable<Double> lambdaFunctionsPercentage) {
    this.lambdaFunctionsPercentage = lambdaFunctionsPercentage;
  }

  public void setLambdaFunctionsPercentage(Double lambdaFunctionsPercentage) {
    this.lambdaFunctionsPercentage = JsonNullable.<Double>of(lambdaFunctionsPercentage);
  }

  public UsageAttributionValues lambdaFunctionsUsage(Double lambdaFunctionsUsage) {
    this.lambdaFunctionsUsage = JsonNullable.<Double>of(lambdaFunctionsUsage);
    return this;
  }

  /**
   * The Lambda function usage by tag(s).
   *
   * @return lambdaFunctionsUsage
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Double getLambdaFunctionsUsage() {
    return lambdaFunctionsUsage.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LAMBDA_FUNCTIONS_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getLambdaFunctionsUsage_JsonNullable() {
    return lambdaFunctionsUsage;
  }

  @JsonProperty(JSON_PROPERTY_LAMBDA_FUNCTIONS_USAGE)
  public void setLambdaFunctionsUsage_JsonNullable(JsonNullable<Double> lambdaFunctionsUsage) {
    this.lambdaFunctionsUsage = lambdaFunctionsUsage;
  }

  public void setLambdaFunctionsUsage(Double lambdaFunctionsUsage) {
    this.lambdaFunctionsUsage = JsonNullable.<Double>of(lambdaFunctionsUsage);
  }

  public UsageAttributionValues lambdaInvocationsPercentage(Double lambdaInvocationsPercentage) {
    this.lambdaInvocationsPercentage = JsonNullable.<Double>of(lambdaInvocationsPercentage);
    return this;
  }

  /**
   * The percentage of Lambda invocation usage by tag(s).
   *
   * @return lambdaInvocationsPercentage
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Double getLambdaInvocationsPercentage() {
    return lambdaInvocationsPercentage.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LAMBDA_INVOCATIONS_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getLambdaInvocationsPercentage_JsonNullable() {
    return lambdaInvocationsPercentage;
  }

  @JsonProperty(JSON_PROPERTY_LAMBDA_INVOCATIONS_PERCENTAGE)
  public void setLambdaInvocationsPercentage_JsonNullable(
      JsonNullable<Double> lambdaInvocationsPercentage) {
    this.lambdaInvocationsPercentage = lambdaInvocationsPercentage;
  }

  public void setLambdaInvocationsPercentage(Double lambdaInvocationsPercentage) {
    this.lambdaInvocationsPercentage = JsonNullable.<Double>of(lambdaInvocationsPercentage);
  }

  public UsageAttributionValues lambdaInvocationsUsage(Double lambdaInvocationsUsage) {
    this.lambdaInvocationsUsage = JsonNullable.<Double>of(lambdaInvocationsUsage);
    return this;
  }

  /**
   * The Lambda invocation usage by tag(s).
   *
   * @return lambdaInvocationsUsage
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Double getLambdaInvocationsUsage() {
    return lambdaInvocationsUsage.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LAMBDA_INVOCATIONS_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getLambdaInvocationsUsage_JsonNullable() {
    return lambdaInvocationsUsage;
  }

  @JsonProperty(JSON_PROPERTY_LAMBDA_INVOCATIONS_USAGE)
  public void setLambdaInvocationsUsage_JsonNullable(JsonNullable<Double> lambdaInvocationsUsage) {
    this.lambdaInvocationsUsage = lambdaInvocationsUsage;
  }

  public void setLambdaInvocationsUsage(Double lambdaInvocationsUsage) {
    this.lambdaInvocationsUsage = JsonNullable.<Double>of(lambdaInvocationsUsage);
  }

  public UsageAttributionValues npmHostPercentage(Double npmHostPercentage) {
    this.npmHostPercentage = JsonNullable.<Double>of(npmHostPercentage);
    return this;
  }

  /**
   * The percentage of network host usage by tag(s).
   *
   * @return npmHostPercentage
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Double getNpmHostPercentage() {
    return npmHostPercentage.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NPM_HOST_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getNpmHostPercentage_JsonNullable() {
    return npmHostPercentage;
  }

  @JsonProperty(JSON_PROPERTY_NPM_HOST_PERCENTAGE)
  public void setNpmHostPercentage_JsonNullable(JsonNullable<Double> npmHostPercentage) {
    this.npmHostPercentage = npmHostPercentage;
  }

  public void setNpmHostPercentage(Double npmHostPercentage) {
    this.npmHostPercentage = JsonNullable.<Double>of(npmHostPercentage);
  }

  public UsageAttributionValues npmHostUsage(Double npmHostUsage) {
    this.npmHostUsage = JsonNullable.<Double>of(npmHostUsage);
    return this;
  }

  /**
   * The network host usage by tag(s).
   *
   * @return npmHostUsage
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Double getNpmHostUsage() {
    return npmHostUsage.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NPM_HOST_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getNpmHostUsage_JsonNullable() {
    return npmHostUsage;
  }

  @JsonProperty(JSON_PROPERTY_NPM_HOST_USAGE)
  public void setNpmHostUsage_JsonNullable(JsonNullable<Double> npmHostUsage) {
    this.npmHostUsage = npmHostUsage;
  }

  public void setNpmHostUsage(Double npmHostUsage) {
    this.npmHostUsage = JsonNullable.<Double>of(npmHostUsage);
  }

  public UsageAttributionValues profiledContainerPercentage(Double profiledContainerPercentage) {
    this.profiledContainerPercentage = JsonNullable.<Double>of(profiledContainerPercentage);
    return this;
  }

  /**
   * The percentage of profiled containers usage by tag(s).
   *
   * @return profiledContainerPercentage
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Double getProfiledContainerPercentage() {
    return profiledContainerPercentage.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PROFILED_CONTAINER_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getProfiledContainerPercentage_JsonNullable() {
    return profiledContainerPercentage;
  }

  @JsonProperty(JSON_PROPERTY_PROFILED_CONTAINER_PERCENTAGE)
  public void setProfiledContainerPercentage_JsonNullable(
      JsonNullable<Double> profiledContainerPercentage) {
    this.profiledContainerPercentage = profiledContainerPercentage;
  }

  public void setProfiledContainerPercentage(Double profiledContainerPercentage) {
    this.profiledContainerPercentage = JsonNullable.<Double>of(profiledContainerPercentage);
  }

  public UsageAttributionValues profiledContainerUsage(Double profiledContainerUsage) {
    this.profiledContainerUsage = JsonNullable.<Double>of(profiledContainerUsage);
    return this;
  }

  /**
   * The profiled container usage by tag(s).
   *
   * @return profiledContainerUsage
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Double getProfiledContainerUsage() {
    return profiledContainerUsage.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PROFILED_CONTAINER_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getProfiledContainerUsage_JsonNullable() {
    return profiledContainerUsage;
  }

  @JsonProperty(JSON_PROPERTY_PROFILED_CONTAINER_USAGE)
  public void setProfiledContainerUsage_JsonNullable(JsonNullable<Double> profiledContainerUsage) {
    this.profiledContainerUsage = profiledContainerUsage;
  }

  public void setProfiledContainerUsage(Double profiledContainerUsage) {
    this.profiledContainerUsage = JsonNullable.<Double>of(profiledContainerUsage);
  }

  public UsageAttributionValues profiledHostsPercentage(Double profiledHostsPercentage) {
    this.profiledHostsPercentage = JsonNullable.<Double>of(profiledHostsPercentage);
    return this;
  }

  /**
   * The percentage of profiled hosts usage by tag(s).
   *
   * @return profiledHostsPercentage
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Double getProfiledHostsPercentage() {
    return profiledHostsPercentage.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PROFILED_HOSTS_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getProfiledHostsPercentage_JsonNullable() {
    return profiledHostsPercentage;
  }

  @JsonProperty(JSON_PROPERTY_PROFILED_HOSTS_PERCENTAGE)
  public void setProfiledHostsPercentage_JsonNullable(
      JsonNullable<Double> profiledHostsPercentage) {
    this.profiledHostsPercentage = profiledHostsPercentage;
  }

  public void setProfiledHostsPercentage(Double profiledHostsPercentage) {
    this.profiledHostsPercentage = JsonNullable.<Double>of(profiledHostsPercentage);
  }

  public UsageAttributionValues profiledHostsUsage(Double profiledHostsUsage) {
    this.profiledHostsUsage = JsonNullable.<Double>of(profiledHostsUsage);
    return this;
  }

  /**
   * The profiled host usage by tag(s).
   *
   * @return profiledHostsUsage
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Double getProfiledHostsUsage() {
    return profiledHostsUsage.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PROFILED_HOSTS_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getProfiledHostsUsage_JsonNullable() {
    return profiledHostsUsage;
  }

  @JsonProperty(JSON_PROPERTY_PROFILED_HOSTS_USAGE)
  public void setProfiledHostsUsage_JsonNullable(JsonNullable<Double> profiledHostsUsage) {
    this.profiledHostsUsage = profiledHostsUsage;
  }

  public void setProfiledHostsUsage(Double profiledHostsUsage) {
    this.profiledHostsUsage = JsonNullable.<Double>of(profiledHostsUsage);
  }

  public UsageAttributionValues snmpPercentage(Double snmpPercentage) {
    this.snmpPercentage = JsonNullable.<Double>of(snmpPercentage);
    return this;
  }

  /**
   * The percentage of network device usage by tag(s).
   *
   * @return snmpPercentage
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Double getSnmpPercentage() {
    return snmpPercentage.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SNMP_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getSnmpPercentage_JsonNullable() {
    return snmpPercentage;
  }

  @JsonProperty(JSON_PROPERTY_SNMP_PERCENTAGE)
  public void setSnmpPercentage_JsonNullable(JsonNullable<Double> snmpPercentage) {
    this.snmpPercentage = snmpPercentage;
  }

  public void setSnmpPercentage(Double snmpPercentage) {
    this.snmpPercentage = JsonNullable.<Double>of(snmpPercentage);
  }

  public UsageAttributionValues snmpUsage(Double snmpUsage) {
    this.snmpUsage = JsonNullable.<Double>of(snmpUsage);
    return this;
  }

  /**
   * The network device usage by tag(s).
   *
   * @return snmpUsage
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Double getSnmpUsage() {
    return snmpUsage.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SNMP_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getSnmpUsage_JsonNullable() {
    return snmpUsage;
  }

  @JsonProperty(JSON_PROPERTY_SNMP_USAGE)
  public void setSnmpUsage_JsonNullable(JsonNullable<Double> snmpUsage) {
    this.snmpUsage = snmpUsage;
  }

  public void setSnmpUsage(Double snmpUsage) {
    this.snmpUsage = JsonNullable.<Double>of(snmpUsage);
  }

  /** Return true if this UsageAttributionValues object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsageAttributionValues usageAttributionValues = (UsageAttributionValues) o;
    return Objects.equals(this.apiPercentage, usageAttributionValues.apiPercentage)
        && Objects.equals(this.apiUsage, usageAttributionValues.apiUsage)
        && Objects.equals(this.apmFargatePercentage, usageAttributionValues.apmFargatePercentage)
        && Objects.equals(this.apmFargateUsage, usageAttributionValues.apmFargateUsage)
        && Objects.equals(this.apmHostPercentage, usageAttributionValues.apmHostPercentage)
        && Objects.equals(this.apmHostUsage, usageAttributionValues.apmHostUsage)
        && Objects.equals(
            this.appsecFargatePercentage, usageAttributionValues.appsecFargatePercentage)
        && Objects.equals(this.appsecFargateUsage, usageAttributionValues.appsecFargateUsage)
        && Objects.equals(this.appsecPercentage, usageAttributionValues.appsecPercentage)
        && Objects.equals(this.appsecUsage, usageAttributionValues.appsecUsage)
        && Objects.equals(this.browserPercentage, usageAttributionValues.browserPercentage)
        && Objects.equals(this.browserUsage, usageAttributionValues.browserUsage)
        && Objects.equals(this.containerPercentage, usageAttributionValues.containerPercentage)
        && Objects.equals(this.containerUsage, usageAttributionValues.containerUsage)
        && Objects.equals(
            this.cspmContainerPercentage, usageAttributionValues.cspmContainerPercentage)
        && Objects.equals(this.cspmContainerUsage, usageAttributionValues.cspmContainerUsage)
        && Objects.equals(this.cspmHostPercentage, usageAttributionValues.cspmHostPercentage)
        && Objects.equals(this.cspmHostUsage, usageAttributionValues.cspmHostUsage)
        && Objects.equals(
            this.customTimeseriesPercentage, usageAttributionValues.customTimeseriesPercentage)
        && Objects.equals(this.customTimeseriesUsage, usageAttributionValues.customTimeseriesUsage)
        && Objects.equals(
            this.cwsContainerPercentage, usageAttributionValues.cwsContainerPercentage)
        && Objects.equals(this.cwsContainerUsage, usageAttributionValues.cwsContainerUsage)
        && Objects.equals(this.cwsHostPercentage, usageAttributionValues.cwsHostPercentage)
        && Objects.equals(this.cwsHostUsage, usageAttributionValues.cwsHostUsage)
        && Objects.equals(this.dbmHostsPercentage, usageAttributionValues.dbmHostsPercentage)
        && Objects.equals(this.dbmHostsUsage, usageAttributionValues.dbmHostsUsage)
        && Objects.equals(this.dbmQueriesPercentage, usageAttributionValues.dbmQueriesPercentage)
        && Objects.equals(this.dbmQueriesUsage, usageAttributionValues.dbmQueriesUsage)
        && Objects.equals(
            this.estimatedIndexedLogsPercentage,
            usageAttributionValues.estimatedIndexedLogsPercentage)
        && Objects.equals(
            this.estimatedIndexedLogsUsage, usageAttributionValues.estimatedIndexedLogsUsage)
        && Objects.equals(
            this.estimatedIndexedSpansPercentage,
            usageAttributionValues.estimatedIndexedSpansPercentage)
        && Objects.equals(
            this.estimatedIndexedSpansUsage, usageAttributionValues.estimatedIndexedSpansUsage)
        && Objects.equals(
            this.estimatedIngestedLogsPercentage,
            usageAttributionValues.estimatedIngestedLogsPercentage)
        && Objects.equals(
            this.estimatedIngestedLogsUsage, usageAttributionValues.estimatedIngestedLogsUsage)
        && Objects.equals(
            this.estimatedIngestedSpansPercentage,
            usageAttributionValues.estimatedIngestedSpansPercentage)
        && Objects.equals(
            this.estimatedIngestedSpansUsage, usageAttributionValues.estimatedIngestedSpansUsage)
        && Objects.equals(
            this.estimatedRumSessionsPercentage,
            usageAttributionValues.estimatedRumSessionsPercentage)
        && Objects.equals(
            this.estimatedRumSessionsUsage, usageAttributionValues.estimatedRumSessionsUsage)
        && Objects.equals(this.infraHostPercentage, usageAttributionValues.infraHostPercentage)
        && Objects.equals(this.infraHostUsage, usageAttributionValues.infraHostUsage)
        && Objects.equals(
            this.lambdaFunctionsPercentage, usageAttributionValues.lambdaFunctionsPercentage)
        && Objects.equals(this.lambdaFunctionsUsage, usageAttributionValues.lambdaFunctionsUsage)
        && Objects.equals(
            this.lambdaInvocationsPercentage, usageAttributionValues.lambdaInvocationsPercentage)
        && Objects.equals(
            this.lambdaInvocationsUsage, usageAttributionValues.lambdaInvocationsUsage)
        && Objects.equals(this.npmHostPercentage, usageAttributionValues.npmHostPercentage)
        && Objects.equals(this.npmHostUsage, usageAttributionValues.npmHostUsage)
        && Objects.equals(
            this.profiledContainerPercentage, usageAttributionValues.profiledContainerPercentage)
        && Objects.equals(
            this.profiledContainerUsage, usageAttributionValues.profiledContainerUsage)
        && Objects.equals(
            this.profiledHostsPercentage, usageAttributionValues.profiledHostsPercentage)
        && Objects.equals(this.profiledHostsUsage, usageAttributionValues.profiledHostsUsage)
        && Objects.equals(this.snmpPercentage, usageAttributionValues.snmpPercentage)
        && Objects.equals(this.snmpUsage, usageAttributionValues.snmpUsage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        apiPercentage,
        apiUsage,
        apmFargatePercentage,
        apmFargateUsage,
        apmHostPercentage,
        apmHostUsage,
        appsecFargatePercentage,
        appsecFargateUsage,
        appsecPercentage,
        appsecUsage,
        browserPercentage,
        browserUsage,
        containerPercentage,
        containerUsage,
        cspmContainerPercentage,
        cspmContainerUsage,
        cspmHostPercentage,
        cspmHostUsage,
        customTimeseriesPercentage,
        customTimeseriesUsage,
        cwsContainerPercentage,
        cwsContainerUsage,
        cwsHostPercentage,
        cwsHostUsage,
        dbmHostsPercentage,
        dbmHostsUsage,
        dbmQueriesPercentage,
        dbmQueriesUsage,
        estimatedIndexedLogsPercentage,
        estimatedIndexedLogsUsage,
        estimatedIndexedSpansPercentage,
        estimatedIndexedSpansUsage,
        estimatedIngestedLogsPercentage,
        estimatedIngestedLogsUsage,
        estimatedIngestedSpansPercentage,
        estimatedIngestedSpansUsage,
        estimatedRumSessionsPercentage,
        estimatedRumSessionsUsage,
        infraHostPercentage,
        infraHostUsage,
        lambdaFunctionsPercentage,
        lambdaFunctionsUsage,
        lambdaInvocationsPercentage,
        lambdaInvocationsUsage,
        npmHostPercentage,
        npmHostUsage,
        profiledContainerPercentage,
        profiledContainerUsage,
        profiledHostsPercentage,
        profiledHostsUsage,
        snmpPercentage,
        snmpUsage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageAttributionValues {\n");
    sb.append("    apiPercentage: ").append(toIndentedString(apiPercentage)).append("\n");
    sb.append("    apiUsage: ").append(toIndentedString(apiUsage)).append("\n");
    sb.append("    apmFargatePercentage: ")
        .append(toIndentedString(apmFargatePercentage))
        .append("\n");
    sb.append("    apmFargateUsage: ").append(toIndentedString(apmFargateUsage)).append("\n");
    sb.append("    apmHostPercentage: ").append(toIndentedString(apmHostPercentage)).append("\n");
    sb.append("    apmHostUsage: ").append(toIndentedString(apmHostUsage)).append("\n");
    sb.append("    appsecFargatePercentage: ")
        .append(toIndentedString(appsecFargatePercentage))
        .append("\n");
    sb.append("    appsecFargateUsage: ").append(toIndentedString(appsecFargateUsage)).append("\n");
    sb.append("    appsecPercentage: ").append(toIndentedString(appsecPercentage)).append("\n");
    sb.append("    appsecUsage: ").append(toIndentedString(appsecUsage)).append("\n");
    sb.append("    browserPercentage: ").append(toIndentedString(browserPercentage)).append("\n");
    sb.append("    browserUsage: ").append(toIndentedString(browserUsage)).append("\n");
    sb.append("    containerPercentage: ")
        .append(toIndentedString(containerPercentage))
        .append("\n");
    sb.append("    containerUsage: ").append(toIndentedString(containerUsage)).append("\n");
    sb.append("    cspmContainerPercentage: ")
        .append(toIndentedString(cspmContainerPercentage))
        .append("\n");
    sb.append("    cspmContainerUsage: ").append(toIndentedString(cspmContainerUsage)).append("\n");
    sb.append("    cspmHostPercentage: ").append(toIndentedString(cspmHostPercentage)).append("\n");
    sb.append("    cspmHostUsage: ").append(toIndentedString(cspmHostUsage)).append("\n");
    sb.append("    customTimeseriesPercentage: ")
        .append(toIndentedString(customTimeseriesPercentage))
        .append("\n");
    sb.append("    customTimeseriesUsage: ")
        .append(toIndentedString(customTimeseriesUsage))
        .append("\n");
    sb.append("    cwsContainerPercentage: ")
        .append(toIndentedString(cwsContainerPercentage))
        .append("\n");
    sb.append("    cwsContainerUsage: ").append(toIndentedString(cwsContainerUsage)).append("\n");
    sb.append("    cwsHostPercentage: ").append(toIndentedString(cwsHostPercentage)).append("\n");
    sb.append("    cwsHostUsage: ").append(toIndentedString(cwsHostUsage)).append("\n");
    sb.append("    dbmHostsPercentage: ").append(toIndentedString(dbmHostsPercentage)).append("\n");
    sb.append("    dbmHostsUsage: ").append(toIndentedString(dbmHostsUsage)).append("\n");
    sb.append("    dbmQueriesPercentage: ")
        .append(toIndentedString(dbmQueriesPercentage))
        .append("\n");
    sb.append("    dbmQueriesUsage: ").append(toIndentedString(dbmQueriesUsage)).append("\n");
    sb.append("    estimatedIndexedLogsPercentage: ")
        .append(toIndentedString(estimatedIndexedLogsPercentage))
        .append("\n");
    sb.append("    estimatedIndexedLogsUsage: ")
        .append(toIndentedString(estimatedIndexedLogsUsage))
        .append("\n");
    sb.append("    estimatedIndexedSpansPercentage: ")
        .append(toIndentedString(estimatedIndexedSpansPercentage))
        .append("\n");
    sb.append("    estimatedIndexedSpansUsage: ")
        .append(toIndentedString(estimatedIndexedSpansUsage))
        .append("\n");
    sb.append("    estimatedIngestedLogsPercentage: ")
        .append(toIndentedString(estimatedIngestedLogsPercentage))
        .append("\n");
    sb.append("    estimatedIngestedLogsUsage: ")
        .append(toIndentedString(estimatedIngestedLogsUsage))
        .append("\n");
    sb.append("    estimatedIngestedSpansPercentage: ")
        .append(toIndentedString(estimatedIngestedSpansPercentage))
        .append("\n");
    sb.append("    estimatedIngestedSpansUsage: ")
        .append(toIndentedString(estimatedIngestedSpansUsage))
        .append("\n");
    sb.append("    estimatedRumSessionsPercentage: ")
        .append(toIndentedString(estimatedRumSessionsPercentage))
        .append("\n");
    sb.append("    estimatedRumSessionsUsage: ")
        .append(toIndentedString(estimatedRumSessionsUsage))
        .append("\n");
    sb.append("    infraHostPercentage: ")
        .append(toIndentedString(infraHostPercentage))
        .append("\n");
    sb.append("    infraHostUsage: ").append(toIndentedString(infraHostUsage)).append("\n");
    sb.append("    lambdaFunctionsPercentage: ")
        .append(toIndentedString(lambdaFunctionsPercentage))
        .append("\n");
    sb.append("    lambdaFunctionsUsage: ")
        .append(toIndentedString(lambdaFunctionsUsage))
        .append("\n");
    sb.append("    lambdaInvocationsPercentage: ")
        .append(toIndentedString(lambdaInvocationsPercentage))
        .append("\n");
    sb.append("    lambdaInvocationsUsage: ")
        .append(toIndentedString(lambdaInvocationsUsage))
        .append("\n");
    sb.append("    npmHostPercentage: ").append(toIndentedString(npmHostPercentage)).append("\n");
    sb.append("    npmHostUsage: ").append(toIndentedString(npmHostUsage)).append("\n");
    sb.append("    profiledContainerPercentage: ")
        .append(toIndentedString(profiledContainerPercentage))
        .append("\n");
    sb.append("    profiledContainerUsage: ")
        .append(toIndentedString(profiledContainerUsage))
        .append("\n");
    sb.append("    profiledHostsPercentage: ")
        .append(toIndentedString(profiledHostsPercentage))
        .append("\n");
    sb.append("    profiledHostsUsage: ").append(toIndentedString(profiledHostsUsage)).append("\n");
    sb.append("    snmpPercentage: ").append(toIndentedString(snmpPercentage)).append("\n");
    sb.append("    snmpUsage: ").append(toIndentedString(snmpUsage)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
