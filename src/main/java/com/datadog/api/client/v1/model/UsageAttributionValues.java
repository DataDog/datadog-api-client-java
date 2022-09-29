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

/** Fields in Usage Summary by tag(s). */
@JsonPropertyOrder({
  UsageAttributionValues.JSON_PROPERTY_API_PERCENTAGE,
  UsageAttributionValues.JSON_PROPERTY_API_USAGE,
  UsageAttributionValues.JSON_PROPERTY_APM_FARGATE_PERCENTAGE,
  UsageAttributionValues.JSON_PROPERTY_APM_FARGATE_USAGE,
  UsageAttributionValues.JSON_PROPERTY_APM_HOST_PERCENTAGE,
  UsageAttributionValues.JSON_PROPERTY_APM_HOST_USAGE,
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
  private Double apiPercentage;

  public static final String JSON_PROPERTY_API_USAGE = "api_usage";
  private Double apiUsage;

  public static final String JSON_PROPERTY_APM_FARGATE_PERCENTAGE = "apm_fargate_percentage";
  private Double apmFargatePercentage;

  public static final String JSON_PROPERTY_APM_FARGATE_USAGE = "apm_fargate_usage";
  private Double apmFargateUsage;

  public static final String JSON_PROPERTY_APM_HOST_PERCENTAGE = "apm_host_percentage";
  private Double apmHostPercentage;

  public static final String JSON_PROPERTY_APM_HOST_USAGE = "apm_host_usage";
  private Double apmHostUsage;

  public static final String JSON_PROPERTY_APPSEC_PERCENTAGE = "appsec_percentage";
  private Double appsecPercentage;

  public static final String JSON_PROPERTY_APPSEC_USAGE = "appsec_usage";
  private Double appsecUsage;

  public static final String JSON_PROPERTY_BROWSER_PERCENTAGE = "browser_percentage";
  private Double browserPercentage;

  public static final String JSON_PROPERTY_BROWSER_USAGE = "browser_usage";
  private Double browserUsage;

  public static final String JSON_PROPERTY_CONTAINER_PERCENTAGE = "container_percentage";
  private Double containerPercentage;

  public static final String JSON_PROPERTY_CONTAINER_USAGE = "container_usage";
  private Double containerUsage;

  public static final String JSON_PROPERTY_CSPM_CONTAINER_PERCENTAGE = "cspm_container_percentage";
  private Double cspmContainerPercentage;

  public static final String JSON_PROPERTY_CSPM_CONTAINER_USAGE = "cspm_container_usage";
  private Double cspmContainerUsage;

  public static final String JSON_PROPERTY_CSPM_HOST_PERCENTAGE = "cspm_host_percentage";
  private Double cspmHostPercentage;

  public static final String JSON_PROPERTY_CSPM_HOST_USAGE = "cspm_host_usage";
  private Double cspmHostUsage;

  public static final String JSON_PROPERTY_CUSTOM_TIMESERIES_PERCENTAGE =
      "custom_timeseries_percentage";
  private Double customTimeseriesPercentage;

  public static final String JSON_PROPERTY_CUSTOM_TIMESERIES_USAGE = "custom_timeseries_usage";
  private Double customTimeseriesUsage;

  public static final String JSON_PROPERTY_CWS_CONTAINER_PERCENTAGE = "cws_container_percentage";
  private Double cwsContainerPercentage;

  public static final String JSON_PROPERTY_CWS_CONTAINER_USAGE = "cws_container_usage";
  private Double cwsContainerUsage;

  public static final String JSON_PROPERTY_CWS_HOST_PERCENTAGE = "cws_host_percentage";
  private Double cwsHostPercentage;

  public static final String JSON_PROPERTY_CWS_HOST_USAGE = "cws_host_usage";
  private Double cwsHostUsage;

  public static final String JSON_PROPERTY_DBM_HOSTS_PERCENTAGE = "dbm_hosts_percentage";
  private Double dbmHostsPercentage;

  public static final String JSON_PROPERTY_DBM_HOSTS_USAGE = "dbm_hosts_usage";
  private Double dbmHostsUsage;

  public static final String JSON_PROPERTY_DBM_QUERIES_PERCENTAGE = "dbm_queries_percentage";
  private Double dbmQueriesPercentage;

  public static final String JSON_PROPERTY_DBM_QUERIES_USAGE = "dbm_queries_usage";
  private Double dbmQueriesUsage;

  public static final String JSON_PROPERTY_ESTIMATED_INDEXED_LOGS_PERCENTAGE =
      "estimated_indexed_logs_percentage";
  private Double estimatedIndexedLogsPercentage;

  public static final String JSON_PROPERTY_ESTIMATED_INDEXED_LOGS_USAGE =
      "estimated_indexed_logs_usage";
  private Double estimatedIndexedLogsUsage;

  public static final String JSON_PROPERTY_ESTIMATED_INDEXED_SPANS_PERCENTAGE =
      "estimated_indexed_spans_percentage";
  private Double estimatedIndexedSpansPercentage;

  public static final String JSON_PROPERTY_ESTIMATED_INDEXED_SPANS_USAGE =
      "estimated_indexed_spans_usage";
  private Double estimatedIndexedSpansUsage;

  public static final String JSON_PROPERTY_ESTIMATED_INGESTED_LOGS_PERCENTAGE =
      "estimated_ingested_logs_percentage";
  private Double estimatedIngestedLogsPercentage;

  public static final String JSON_PROPERTY_ESTIMATED_INGESTED_LOGS_USAGE =
      "estimated_ingested_logs_usage";
  private Double estimatedIngestedLogsUsage;

  public static final String JSON_PROPERTY_ESTIMATED_INGESTED_SPANS_PERCENTAGE =
      "estimated_ingested_spans_percentage";
  private Double estimatedIngestedSpansPercentage;

  public static final String JSON_PROPERTY_ESTIMATED_INGESTED_SPANS_USAGE =
      "estimated_ingested_spans_usage";
  private Double estimatedIngestedSpansUsage;

  public static final String JSON_PROPERTY_INFRA_HOST_PERCENTAGE = "infra_host_percentage";
  private Double infraHostPercentage;

  public static final String JSON_PROPERTY_INFRA_HOST_USAGE = "infra_host_usage";
  private Double infraHostUsage;

  public static final String JSON_PROPERTY_LAMBDA_FUNCTIONS_PERCENTAGE =
      "lambda_functions_percentage";
  private Double lambdaFunctionsPercentage;

  public static final String JSON_PROPERTY_LAMBDA_FUNCTIONS_USAGE = "lambda_functions_usage";
  private Double lambdaFunctionsUsage;

  public static final String JSON_PROPERTY_LAMBDA_INVOCATIONS_PERCENTAGE =
      "lambda_invocations_percentage";
  private Double lambdaInvocationsPercentage;

  public static final String JSON_PROPERTY_LAMBDA_INVOCATIONS_USAGE = "lambda_invocations_usage";
  private Double lambdaInvocationsUsage;

  public static final String JSON_PROPERTY_NPM_HOST_PERCENTAGE = "npm_host_percentage";
  private Double npmHostPercentage;

  public static final String JSON_PROPERTY_NPM_HOST_USAGE = "npm_host_usage";
  private Double npmHostUsage;

  public static final String JSON_PROPERTY_PROFILED_CONTAINER_PERCENTAGE =
      "profiled_container_percentage";
  private Double profiledContainerPercentage;

  public static final String JSON_PROPERTY_PROFILED_CONTAINER_USAGE = "profiled_container_usage";
  private Double profiledContainerUsage;

  public static final String JSON_PROPERTY_PROFILED_HOSTS_PERCENTAGE = "profiled_hosts_percentage";
  private Double profiledHostsPercentage;

  public static final String JSON_PROPERTY_PROFILED_HOSTS_USAGE = "profiled_hosts_usage";
  private Double profiledHostsUsage;

  public static final String JSON_PROPERTY_SNMP_PERCENTAGE = "snmp_percentage";
  private Double snmpPercentage;

  public static final String JSON_PROPERTY_SNMP_USAGE = "snmp_usage";
  private Double snmpUsage;

  public UsageAttributionValues apiPercentage(Double apiPercentage) {
    this.apiPercentage = apiPercentage;
    return this;
  }

  /**
   * The percentage of synthetic API test usage by tag(s).
   *
   * @return apiPercentage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_API_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getApiPercentage() {
    return apiPercentage;
  }

  public void setApiPercentage(Double apiPercentage) {
    this.apiPercentage = apiPercentage;
  }

  public UsageAttributionValues apiUsage(Double apiUsage) {
    this.apiUsage = apiUsage;
    return this;
  }

  /**
   * The synthetic API test usage by tag(s).
   *
   * @return apiUsage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_API_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getApiUsage() {
    return apiUsage;
  }

  public void setApiUsage(Double apiUsage) {
    this.apiUsage = apiUsage;
  }

  public UsageAttributionValues apmFargatePercentage(Double apmFargatePercentage) {
    this.apmFargatePercentage = apmFargatePercentage;
    return this;
  }

  /**
   * The percentage of APM ECS Fargate task usage by tag(s).
   *
   * @return apmFargatePercentage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APM_FARGATE_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getApmFargatePercentage() {
    return apmFargatePercentage;
  }

  public void setApmFargatePercentage(Double apmFargatePercentage) {
    this.apmFargatePercentage = apmFargatePercentage;
  }

  public UsageAttributionValues apmFargateUsage(Double apmFargateUsage) {
    this.apmFargateUsage = apmFargateUsage;
    return this;
  }

  /**
   * The APM ECS Fargate task usage by tag(s).
   *
   * @return apmFargateUsage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APM_FARGATE_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getApmFargateUsage() {
    return apmFargateUsage;
  }

  public void setApmFargateUsage(Double apmFargateUsage) {
    this.apmFargateUsage = apmFargateUsage;
  }

  public UsageAttributionValues apmHostPercentage(Double apmHostPercentage) {
    this.apmHostPercentage = apmHostPercentage;
    return this;
  }

  /**
   * The percentage of APM host usage by tag(s).
   *
   * @return apmHostPercentage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APM_HOST_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getApmHostPercentage() {
    return apmHostPercentage;
  }

  public void setApmHostPercentage(Double apmHostPercentage) {
    this.apmHostPercentage = apmHostPercentage;
  }

  public UsageAttributionValues apmHostUsage(Double apmHostUsage) {
    this.apmHostUsage = apmHostUsage;
    return this;
  }

  /**
   * The APM host usage by tag(s).
   *
   * @return apmHostUsage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APM_HOST_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getApmHostUsage() {
    return apmHostUsage;
  }

  public void setApmHostUsage(Double apmHostUsage) {
    this.apmHostUsage = apmHostUsage;
  }

  public UsageAttributionValues appsecPercentage(Double appsecPercentage) {
    this.appsecPercentage = appsecPercentage;
    return this;
  }

  /**
   * The percentage of Application Security Monitoring host usage by tag(s).
   *
   * @return appsecPercentage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APPSEC_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getAppsecPercentage() {
    return appsecPercentage;
  }

  public void setAppsecPercentage(Double appsecPercentage) {
    this.appsecPercentage = appsecPercentage;
  }

  public UsageAttributionValues appsecUsage(Double appsecUsage) {
    this.appsecUsage = appsecUsage;
    return this;
  }

  /**
   * The Application Security Monitoring host usage by tag(s).
   *
   * @return appsecUsage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APPSEC_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getAppsecUsage() {
    return appsecUsage;
  }

  public void setAppsecUsage(Double appsecUsage) {
    this.appsecUsage = appsecUsage;
  }

  public UsageAttributionValues browserPercentage(Double browserPercentage) {
    this.browserPercentage = browserPercentage;
    return this;
  }

  /**
   * The percentage of synthetic browser test usage by tag(s).
   *
   * @return browserPercentage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BROWSER_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getBrowserPercentage() {
    return browserPercentage;
  }

  public void setBrowserPercentage(Double browserPercentage) {
    this.browserPercentage = browserPercentage;
  }

  public UsageAttributionValues browserUsage(Double browserUsage) {
    this.browserUsage = browserUsage;
    return this;
  }

  /**
   * The synthetic browser test usage by tag(s).
   *
   * @return browserUsage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BROWSER_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getBrowserUsage() {
    return browserUsage;
  }

  public void setBrowserUsage(Double browserUsage) {
    this.browserUsage = browserUsage;
  }

  public UsageAttributionValues containerPercentage(Double containerPercentage) {
    this.containerPercentage = containerPercentage;
    return this;
  }

  /**
   * The percentage of container usage by tag(s).
   *
   * @return containerPercentage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTAINER_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getContainerPercentage() {
    return containerPercentage;
  }

  public void setContainerPercentage(Double containerPercentage) {
    this.containerPercentage = containerPercentage;
  }

  public UsageAttributionValues containerUsage(Double containerUsage) {
    this.containerUsage = containerUsage;
    return this;
  }

  /**
   * The container usage by tag(s).
   *
   * @return containerUsage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTAINER_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getContainerUsage() {
    return containerUsage;
  }

  public void setContainerUsage(Double containerUsage) {
    this.containerUsage = containerUsage;
  }

  public UsageAttributionValues cspmContainerPercentage(Double cspmContainerPercentage) {
    this.cspmContainerPercentage = cspmContainerPercentage;
    return this;
  }

  /**
   * The percentage of Cloud Security Posture Management container usage by tag(s)
   *
   * @return cspmContainerPercentage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CSPM_CONTAINER_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getCspmContainerPercentage() {
    return cspmContainerPercentage;
  }

  public void setCspmContainerPercentage(Double cspmContainerPercentage) {
    this.cspmContainerPercentage = cspmContainerPercentage;
  }

  public UsageAttributionValues cspmContainerUsage(Double cspmContainerUsage) {
    this.cspmContainerUsage = cspmContainerUsage;
    return this;
  }

  /**
   * The Cloud Security Posture Management container usage by tag(s)
   *
   * @return cspmContainerUsage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CSPM_CONTAINER_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getCspmContainerUsage() {
    return cspmContainerUsage;
  }

  public void setCspmContainerUsage(Double cspmContainerUsage) {
    this.cspmContainerUsage = cspmContainerUsage;
  }

  public UsageAttributionValues cspmHostPercentage(Double cspmHostPercentage) {
    this.cspmHostPercentage = cspmHostPercentage;
    return this;
  }

  /**
   * The percentage of Cloud Security Posture Management host usage by tag(s)
   *
   * @return cspmHostPercentage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CSPM_HOST_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getCspmHostPercentage() {
    return cspmHostPercentage;
  }

  public void setCspmHostPercentage(Double cspmHostPercentage) {
    this.cspmHostPercentage = cspmHostPercentage;
  }

  public UsageAttributionValues cspmHostUsage(Double cspmHostUsage) {
    this.cspmHostUsage = cspmHostUsage;
    return this;
  }

  /**
   * The Cloud Security Posture Management host usage by tag(s)
   *
   * @return cspmHostUsage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CSPM_HOST_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getCspmHostUsage() {
    return cspmHostUsage;
  }

  public void setCspmHostUsage(Double cspmHostUsage) {
    this.cspmHostUsage = cspmHostUsage;
  }

  public UsageAttributionValues customTimeseriesPercentage(Double customTimeseriesPercentage) {
    this.customTimeseriesPercentage = customTimeseriesPercentage;
    return this;
  }

  /**
   * The percentage of custom metrics usage by tag(s).
   *
   * @return customTimeseriesPercentage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CUSTOM_TIMESERIES_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getCustomTimeseriesPercentage() {
    return customTimeseriesPercentage;
  }

  public void setCustomTimeseriesPercentage(Double customTimeseriesPercentage) {
    this.customTimeseriesPercentage = customTimeseriesPercentage;
  }

  public UsageAttributionValues customTimeseriesUsage(Double customTimeseriesUsage) {
    this.customTimeseriesUsage = customTimeseriesUsage;
    return this;
  }

  /**
   * The custom metrics usage by tag(s).
   *
   * @return customTimeseriesUsage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CUSTOM_TIMESERIES_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getCustomTimeseriesUsage() {
    return customTimeseriesUsage;
  }

  public void setCustomTimeseriesUsage(Double customTimeseriesUsage) {
    this.customTimeseriesUsage = customTimeseriesUsage;
  }

  public UsageAttributionValues cwsContainerPercentage(Double cwsContainerPercentage) {
    this.cwsContainerPercentage = cwsContainerPercentage;
    return this;
  }

  /**
   * The percentage of Cloud Workload Security container usage by tag(s)
   *
   * @return cwsContainerPercentage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CWS_CONTAINER_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getCwsContainerPercentage() {
    return cwsContainerPercentage;
  }

  public void setCwsContainerPercentage(Double cwsContainerPercentage) {
    this.cwsContainerPercentage = cwsContainerPercentage;
  }

  public UsageAttributionValues cwsContainerUsage(Double cwsContainerUsage) {
    this.cwsContainerUsage = cwsContainerUsage;
    return this;
  }

  /**
   * The Cloud Workload Security container usage by tag(s)
   *
   * @return cwsContainerUsage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CWS_CONTAINER_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getCwsContainerUsage() {
    return cwsContainerUsage;
  }

  public void setCwsContainerUsage(Double cwsContainerUsage) {
    this.cwsContainerUsage = cwsContainerUsage;
  }

  public UsageAttributionValues cwsHostPercentage(Double cwsHostPercentage) {
    this.cwsHostPercentage = cwsHostPercentage;
    return this;
  }

  /**
   * The percentage of Cloud Workload Security host usage by tag(s)
   *
   * @return cwsHostPercentage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CWS_HOST_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getCwsHostPercentage() {
    return cwsHostPercentage;
  }

  public void setCwsHostPercentage(Double cwsHostPercentage) {
    this.cwsHostPercentage = cwsHostPercentage;
  }

  public UsageAttributionValues cwsHostUsage(Double cwsHostUsage) {
    this.cwsHostUsage = cwsHostUsage;
    return this;
  }

  /**
   * The Cloud Workload Security host usage by tag(s)
   *
   * @return cwsHostUsage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CWS_HOST_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getCwsHostUsage() {
    return cwsHostUsage;
  }

  public void setCwsHostUsage(Double cwsHostUsage) {
    this.cwsHostUsage = cwsHostUsage;
  }

  public UsageAttributionValues dbmHostsPercentage(Double dbmHostsPercentage) {
    this.dbmHostsPercentage = dbmHostsPercentage;
    return this;
  }

  /**
   * The percentage of Database Monitoring host usage by tag(s).
   *
   * @return dbmHostsPercentage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DBM_HOSTS_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getDbmHostsPercentage() {
    return dbmHostsPercentage;
  }

  public void setDbmHostsPercentage(Double dbmHostsPercentage) {
    this.dbmHostsPercentage = dbmHostsPercentage;
  }

  public UsageAttributionValues dbmHostsUsage(Double dbmHostsUsage) {
    this.dbmHostsUsage = dbmHostsUsage;
    return this;
  }

  /**
   * The Database Monitoring host usage by tag(s).
   *
   * @return dbmHostsUsage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DBM_HOSTS_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getDbmHostsUsage() {
    return dbmHostsUsage;
  }

  public void setDbmHostsUsage(Double dbmHostsUsage) {
    this.dbmHostsUsage = dbmHostsUsage;
  }

  public UsageAttributionValues dbmQueriesPercentage(Double dbmQueriesPercentage) {
    this.dbmQueriesPercentage = dbmQueriesPercentage;
    return this;
  }

  /**
   * The percentage of Database Monitoring normalized queries usage by tag(s).
   *
   * @return dbmQueriesPercentage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DBM_QUERIES_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getDbmQueriesPercentage() {
    return dbmQueriesPercentage;
  }

  public void setDbmQueriesPercentage(Double dbmQueriesPercentage) {
    this.dbmQueriesPercentage = dbmQueriesPercentage;
  }

  public UsageAttributionValues dbmQueriesUsage(Double dbmQueriesUsage) {
    this.dbmQueriesUsage = dbmQueriesUsage;
    return this;
  }

  /**
   * The Database Monitoring normalized queries usage by tag(s).
   *
   * @return dbmQueriesUsage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DBM_QUERIES_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getDbmQueriesUsage() {
    return dbmQueriesUsage;
  }

  public void setDbmQueriesUsage(Double dbmQueriesUsage) {
    this.dbmQueriesUsage = dbmQueriesUsage;
  }

  public UsageAttributionValues estimatedIndexedLogsPercentage(
      Double estimatedIndexedLogsPercentage) {
    this.estimatedIndexedLogsPercentage = estimatedIndexedLogsPercentage;
    return this;
  }

  /**
   * The percentage of estimated live indexed logs usage by tag(s). Note this field is in private
   * beta.
   *
   * @return estimatedIndexedLogsPercentage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ESTIMATED_INDEXED_LOGS_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getEstimatedIndexedLogsPercentage() {
    return estimatedIndexedLogsPercentage;
  }

  public void setEstimatedIndexedLogsPercentage(Double estimatedIndexedLogsPercentage) {
    this.estimatedIndexedLogsPercentage = estimatedIndexedLogsPercentage;
  }

  public UsageAttributionValues estimatedIndexedLogsUsage(Double estimatedIndexedLogsUsage) {
    this.estimatedIndexedLogsUsage = estimatedIndexedLogsUsage;
    return this;
  }

  /**
   * The estimated live indexed logs usage by tag(s). Note this field is in private beta.
   *
   * @return estimatedIndexedLogsUsage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ESTIMATED_INDEXED_LOGS_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getEstimatedIndexedLogsUsage() {
    return estimatedIndexedLogsUsage;
  }

  public void setEstimatedIndexedLogsUsage(Double estimatedIndexedLogsUsage) {
    this.estimatedIndexedLogsUsage = estimatedIndexedLogsUsage;
  }

  public UsageAttributionValues estimatedIndexedSpansPercentage(
      Double estimatedIndexedSpansPercentage) {
    this.estimatedIndexedSpansPercentage = estimatedIndexedSpansPercentage;
    return this;
  }

  /**
   * The percentage of estimated indexed spans usage by tag(s). Note this field is in private beta.
   *
   * @return estimatedIndexedSpansPercentage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ESTIMATED_INDEXED_SPANS_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getEstimatedIndexedSpansPercentage() {
    return estimatedIndexedSpansPercentage;
  }

  public void setEstimatedIndexedSpansPercentage(Double estimatedIndexedSpansPercentage) {
    this.estimatedIndexedSpansPercentage = estimatedIndexedSpansPercentage;
  }

  public UsageAttributionValues estimatedIndexedSpansUsage(Double estimatedIndexedSpansUsage) {
    this.estimatedIndexedSpansUsage = estimatedIndexedSpansUsage;
    return this;
  }

  /**
   * The estimated indexed spans usage by tag(s). Note this field is in private beta.
   *
   * @return estimatedIndexedSpansUsage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ESTIMATED_INDEXED_SPANS_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getEstimatedIndexedSpansUsage() {
    return estimatedIndexedSpansUsage;
  }

  public void setEstimatedIndexedSpansUsage(Double estimatedIndexedSpansUsage) {
    this.estimatedIndexedSpansUsage = estimatedIndexedSpansUsage;
  }

  public UsageAttributionValues estimatedIngestedLogsPercentage(
      Double estimatedIngestedLogsPercentage) {
    this.estimatedIngestedLogsPercentage = estimatedIngestedLogsPercentage;
    return this;
  }

  /**
   * The percentage of estimated live ingested logs usage by tag(s). Note this field is in private
   * beta.
   *
   * @return estimatedIngestedLogsPercentage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ESTIMATED_INGESTED_LOGS_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getEstimatedIngestedLogsPercentage() {
    return estimatedIngestedLogsPercentage;
  }

  public void setEstimatedIngestedLogsPercentage(Double estimatedIngestedLogsPercentage) {
    this.estimatedIngestedLogsPercentage = estimatedIngestedLogsPercentage;
  }

  public UsageAttributionValues estimatedIngestedLogsUsage(Double estimatedIngestedLogsUsage) {
    this.estimatedIngestedLogsUsage = estimatedIngestedLogsUsage;
    return this;
  }

  /**
   * The estimated live ingested logs usage by tag(s). Note this field is in private beta.
   *
   * @return estimatedIngestedLogsUsage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ESTIMATED_INGESTED_LOGS_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getEstimatedIngestedLogsUsage() {
    return estimatedIngestedLogsUsage;
  }

  public void setEstimatedIngestedLogsUsage(Double estimatedIngestedLogsUsage) {
    this.estimatedIngestedLogsUsage = estimatedIngestedLogsUsage;
  }

  public UsageAttributionValues estimatedIngestedSpansPercentage(
      Double estimatedIngestedSpansPercentage) {
    this.estimatedIngestedSpansPercentage = estimatedIngestedSpansPercentage;
    return this;
  }

  /**
   * The percentage of estimated ingested spans usage by tag(s). Note this field is in private beta.
   *
   * @return estimatedIngestedSpansPercentage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ESTIMATED_INGESTED_SPANS_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getEstimatedIngestedSpansPercentage() {
    return estimatedIngestedSpansPercentage;
  }

  public void setEstimatedIngestedSpansPercentage(Double estimatedIngestedSpansPercentage) {
    this.estimatedIngestedSpansPercentage = estimatedIngestedSpansPercentage;
  }

  public UsageAttributionValues estimatedIngestedSpansUsage(Double estimatedIngestedSpansUsage) {
    this.estimatedIngestedSpansUsage = estimatedIngestedSpansUsage;
    return this;
  }

  /**
   * The estimated ingested spans usage by tag(s). Note this field is in private beta.
   *
   * @return estimatedIngestedSpansUsage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ESTIMATED_INGESTED_SPANS_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getEstimatedIngestedSpansUsage() {
    return estimatedIngestedSpansUsage;
  }

  public void setEstimatedIngestedSpansUsage(Double estimatedIngestedSpansUsage) {
    this.estimatedIngestedSpansUsage = estimatedIngestedSpansUsage;
  }

  public UsageAttributionValues infraHostPercentage(Double infraHostPercentage) {
    this.infraHostPercentage = infraHostPercentage;
    return this;
  }

  /**
   * The percentage of infrastructure host usage by tag(s).
   *
   * @return infraHostPercentage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INFRA_HOST_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getInfraHostPercentage() {
    return infraHostPercentage;
  }

  public void setInfraHostPercentage(Double infraHostPercentage) {
    this.infraHostPercentage = infraHostPercentage;
  }

  public UsageAttributionValues infraHostUsage(Double infraHostUsage) {
    this.infraHostUsage = infraHostUsage;
    return this;
  }

  /**
   * The infrastructure host usage by tag(s).
   *
   * @return infraHostUsage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INFRA_HOST_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getInfraHostUsage() {
    return infraHostUsage;
  }

  public void setInfraHostUsage(Double infraHostUsage) {
    this.infraHostUsage = infraHostUsage;
  }

  public UsageAttributionValues lambdaFunctionsPercentage(Double lambdaFunctionsPercentage) {
    this.lambdaFunctionsPercentage = lambdaFunctionsPercentage;
    return this;
  }

  /**
   * The percentage of Lambda function usage by tag(s).
   *
   * @return lambdaFunctionsPercentage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAMBDA_FUNCTIONS_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getLambdaFunctionsPercentage() {
    return lambdaFunctionsPercentage;
  }

  public void setLambdaFunctionsPercentage(Double lambdaFunctionsPercentage) {
    this.lambdaFunctionsPercentage = lambdaFunctionsPercentage;
  }

  public UsageAttributionValues lambdaFunctionsUsage(Double lambdaFunctionsUsage) {
    this.lambdaFunctionsUsage = lambdaFunctionsUsage;
    return this;
  }

  /**
   * The Lambda function usage by tag(s).
   *
   * @return lambdaFunctionsUsage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAMBDA_FUNCTIONS_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getLambdaFunctionsUsage() {
    return lambdaFunctionsUsage;
  }

  public void setLambdaFunctionsUsage(Double lambdaFunctionsUsage) {
    this.lambdaFunctionsUsage = lambdaFunctionsUsage;
  }

  public UsageAttributionValues lambdaInvocationsPercentage(Double lambdaInvocationsPercentage) {
    this.lambdaInvocationsPercentage = lambdaInvocationsPercentage;
    return this;
  }

  /**
   * The percentage of Lambda invocation usage by tag(s).
   *
   * @return lambdaInvocationsPercentage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAMBDA_INVOCATIONS_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getLambdaInvocationsPercentage() {
    return lambdaInvocationsPercentage;
  }

  public void setLambdaInvocationsPercentage(Double lambdaInvocationsPercentage) {
    this.lambdaInvocationsPercentage = lambdaInvocationsPercentage;
  }

  public UsageAttributionValues lambdaInvocationsUsage(Double lambdaInvocationsUsage) {
    this.lambdaInvocationsUsage = lambdaInvocationsUsage;
    return this;
  }

  /**
   * The Lambda invocation usage by tag(s).
   *
   * @return lambdaInvocationsUsage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAMBDA_INVOCATIONS_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getLambdaInvocationsUsage() {
    return lambdaInvocationsUsage;
  }

  public void setLambdaInvocationsUsage(Double lambdaInvocationsUsage) {
    this.lambdaInvocationsUsage = lambdaInvocationsUsage;
  }

  public UsageAttributionValues npmHostPercentage(Double npmHostPercentage) {
    this.npmHostPercentage = npmHostPercentage;
    return this;
  }

  /**
   * The percentage of network host usage by tag(s).
   *
   * @return npmHostPercentage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NPM_HOST_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getNpmHostPercentage() {
    return npmHostPercentage;
  }

  public void setNpmHostPercentage(Double npmHostPercentage) {
    this.npmHostPercentage = npmHostPercentage;
  }

  public UsageAttributionValues npmHostUsage(Double npmHostUsage) {
    this.npmHostUsage = npmHostUsage;
    return this;
  }

  /**
   * The network host usage by tag(s).
   *
   * @return npmHostUsage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NPM_HOST_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getNpmHostUsage() {
    return npmHostUsage;
  }

  public void setNpmHostUsage(Double npmHostUsage) {
    this.npmHostUsage = npmHostUsage;
  }

  public UsageAttributionValues profiledContainerPercentage(Double profiledContainerPercentage) {
    this.profiledContainerPercentage = profiledContainerPercentage;
    return this;
  }

  /**
   * The percentage of profiled containers usage by tag(s).
   *
   * @return profiledContainerPercentage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROFILED_CONTAINER_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getProfiledContainerPercentage() {
    return profiledContainerPercentage;
  }

  public void setProfiledContainerPercentage(Double profiledContainerPercentage) {
    this.profiledContainerPercentage = profiledContainerPercentage;
  }

  public UsageAttributionValues profiledContainerUsage(Double profiledContainerUsage) {
    this.profiledContainerUsage = profiledContainerUsage;
    return this;
  }

  /**
   * The profiled container usage by tag(s).
   *
   * @return profiledContainerUsage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROFILED_CONTAINER_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getProfiledContainerUsage() {
    return profiledContainerUsage;
  }

  public void setProfiledContainerUsage(Double profiledContainerUsage) {
    this.profiledContainerUsage = profiledContainerUsage;
  }

  public UsageAttributionValues profiledHostsPercentage(Double profiledHostsPercentage) {
    this.profiledHostsPercentage = profiledHostsPercentage;
    return this;
  }

  /**
   * The percentage of profiled hosts usage by tag(s).
   *
   * @return profiledHostsPercentage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROFILED_HOSTS_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getProfiledHostsPercentage() {
    return profiledHostsPercentage;
  }

  public void setProfiledHostsPercentage(Double profiledHostsPercentage) {
    this.profiledHostsPercentage = profiledHostsPercentage;
  }

  public UsageAttributionValues profiledHostsUsage(Double profiledHostsUsage) {
    this.profiledHostsUsage = profiledHostsUsage;
    return this;
  }

  /**
   * The profiled host usage by tag(s).
   *
   * @return profiledHostsUsage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROFILED_HOSTS_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getProfiledHostsUsage() {
    return profiledHostsUsage;
  }

  public void setProfiledHostsUsage(Double profiledHostsUsage) {
    this.profiledHostsUsage = profiledHostsUsage;
  }

  public UsageAttributionValues snmpPercentage(Double snmpPercentage) {
    this.snmpPercentage = snmpPercentage;
    return this;
  }

  /**
   * The percentage of network device usage by tag(s).
   *
   * @return snmpPercentage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SNMP_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getSnmpPercentage() {
    return snmpPercentage;
  }

  public void setSnmpPercentage(Double snmpPercentage) {
    this.snmpPercentage = snmpPercentage;
  }

  public UsageAttributionValues snmpUsage(Double snmpUsage) {
    this.snmpUsage = snmpUsage;
    return this;
  }

  /**
   * The network device usage by tag(s).
   *
   * @return snmpUsage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SNMP_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getSnmpUsage() {
    return snmpUsage;
  }

  public void setSnmpUsage(Double snmpUsage) {
    this.snmpUsage = snmpUsage;
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
