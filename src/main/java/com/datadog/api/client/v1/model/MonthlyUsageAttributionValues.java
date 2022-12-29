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
  MonthlyUsageAttributionValues.JSON_PROPERTY_API_PERCENTAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_API_USAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_APM_FARGATE_PERCENTAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_APM_FARGATE_USAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_APM_HOST_PERCENTAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_APM_HOST_USAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_APPSEC_FARGATE_PERCENTAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_APPSEC_FARGATE_USAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_APPSEC_PERCENTAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_APPSEC_USAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_BROWSER_PERCENTAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_BROWSER_USAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_CONT_PERCENTAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_CONT_USAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_CONTAINER_PERCENTAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_CONTAINER_USAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_CSPM_CONTAINERS_PERCENTAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_CSPM_CONTAINERS_USAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_CSPM_HOSTS_PERCENTAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_CSPM_HOSTS_USAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_CUSTOM_TIMESERIES_PERCENTAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_CUSTOM_TIMESERIES_USAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_CWS_CONTAINERS_PERCENTAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_CWS_CONTAINERS_USAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_CWS_HOSTS_PERCENTAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_CWS_HOSTS_USAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_DBM_HOSTS_PERCENTAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_DBM_HOSTS_USAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_DBM_QUERIES_PERCENTAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_DBM_QUERIES_USAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_ESTIMATED_INDEXED_LOGS_PERCENTAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_ESTIMATED_INDEXED_LOGS_USAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_ESTIMATED_INDEXED_SPANS_PERCENTAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_ESTIMATED_INDEXED_SPANS_USAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_ESTIMATED_INGESTED_LOGS_PERCENTAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_ESTIMATED_INGESTED_LOGS_USAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_ESTIMATED_INGESTED_SPANS_PERCENTAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_ESTIMATED_INGESTED_SPANS_USAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_ESTIMATED_RUM_SESSIONS_PERCENTAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_ESTIMATED_RUM_SESSIONS_USAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_FARGATE_PERCENTAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_FARGATE_USAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_FUNCTIONS_PERCENTAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_FUNCTIONS_USAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_INDEXED_LOGS_PERCENTAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_INDEXED_LOGS_USAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_INFRA_HOST_PERCENTAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_INFRA_HOST_USAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_INVOCATIONS_PERCENTAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_INVOCATIONS_USAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_NPM_HOST_PERCENTAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_NPM_HOST_USAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_PROFILED_CONTAINER_PERCENTAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_PROFILED_CONTAINER_USAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_PROFILED_HOST_PERCENTAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_PROFILED_HOST_USAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_SNMP_PERCENTAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_SNMP_USAGE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class MonthlyUsageAttributionValues {
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

  public static final String JSON_PROPERTY_APPSEC_FARGATE_PERCENTAGE = "appsec_fargate_percentage";
  private Double appsecFargatePercentage;

  public static final String JSON_PROPERTY_APPSEC_FARGATE_USAGE = "appsec_fargate_usage";
  private Double appsecFargateUsage;

  public static final String JSON_PROPERTY_APPSEC_PERCENTAGE = "appsec_percentage";
  private Double appsecPercentage;

  public static final String JSON_PROPERTY_APPSEC_USAGE = "appsec_usage";
  private Double appsecUsage;

  public static final String JSON_PROPERTY_BROWSER_PERCENTAGE = "browser_percentage";
  private Double browserPercentage;

  public static final String JSON_PROPERTY_BROWSER_USAGE = "browser_usage";
  private Double browserUsage;

  public static final String JSON_PROPERTY_CONT_PERCENTAGE = "cont_percentage";
  private Double contPercentage;

  public static final String JSON_PROPERTY_CONT_USAGE = "cont_usage";
  private Double contUsage;

  public static final String JSON_PROPERTY_CONTAINER_PERCENTAGE = "container_percentage";
  private Double containerPercentage;

  public static final String JSON_PROPERTY_CONTAINER_USAGE = "container_usage";
  private Double containerUsage;

  public static final String JSON_PROPERTY_CSPM_CONTAINERS_PERCENTAGE =
      "cspm_containers_percentage";
  private Double cspmContainersPercentage;

  public static final String JSON_PROPERTY_CSPM_CONTAINERS_USAGE = "cspm_containers_usage";
  private Double cspmContainersUsage;

  public static final String JSON_PROPERTY_CSPM_HOSTS_PERCENTAGE = "cspm_hosts_percentage";
  private Double cspmHostsPercentage;

  public static final String JSON_PROPERTY_CSPM_HOSTS_USAGE = "cspm_hosts_usage";
  private Double cspmHostsUsage;

  public static final String JSON_PROPERTY_CUSTOM_TIMESERIES_PERCENTAGE =
      "custom_timeseries_percentage";
  private Double customTimeseriesPercentage;

  public static final String JSON_PROPERTY_CUSTOM_TIMESERIES_USAGE = "custom_timeseries_usage";
  private Double customTimeseriesUsage;

  public static final String JSON_PROPERTY_CWS_CONTAINERS_PERCENTAGE = "cws_containers_percentage";
  private Double cwsContainersPercentage;

  public static final String JSON_PROPERTY_CWS_CONTAINERS_USAGE = "cws_containers_usage";
  private Double cwsContainersUsage;

  public static final String JSON_PROPERTY_CWS_HOSTS_PERCENTAGE = "cws_hosts_percentage";
  private Double cwsHostsPercentage;

  public static final String JSON_PROPERTY_CWS_HOSTS_USAGE = "cws_hosts_usage";
  private Double cwsHostsUsage;

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

  public static final String JSON_PROPERTY_ESTIMATED_RUM_SESSIONS_PERCENTAGE =
      "estimated_rum_sessions_percentage";
  private Double estimatedRumSessionsPercentage;

  public static final String JSON_PROPERTY_ESTIMATED_RUM_SESSIONS_USAGE =
      "estimated_rum_sessions_usage";
  private Double estimatedRumSessionsUsage;

  public static final String JSON_PROPERTY_FARGATE_PERCENTAGE = "fargate_percentage";
  private Double fargatePercentage;

  public static final String JSON_PROPERTY_FARGATE_USAGE = "fargate_usage";
  private Double fargateUsage;

  public static final String JSON_PROPERTY_FUNCTIONS_PERCENTAGE = "functions_percentage";
  private Double functionsPercentage;

  public static final String JSON_PROPERTY_FUNCTIONS_USAGE = "functions_usage";
  private Double functionsUsage;

  public static final String JSON_PROPERTY_INDEXED_LOGS_PERCENTAGE = "indexed_logs_percentage";
  private Double indexedLogsPercentage;

  public static final String JSON_PROPERTY_INDEXED_LOGS_USAGE = "indexed_logs_usage";
  private Double indexedLogsUsage;

  public static final String JSON_PROPERTY_INFRA_HOST_PERCENTAGE = "infra_host_percentage";
  private Double infraHostPercentage;

  public static final String JSON_PROPERTY_INFRA_HOST_USAGE = "infra_host_usage";
  private Double infraHostUsage;

  public static final String JSON_PROPERTY_INVOCATIONS_PERCENTAGE = "invocations_percentage";
  private Double invocationsPercentage;

  public static final String JSON_PROPERTY_INVOCATIONS_USAGE = "invocations_usage";
  private Double invocationsUsage;

  public static final String JSON_PROPERTY_NPM_HOST_PERCENTAGE = "npm_host_percentage";
  private Double npmHostPercentage;

  public static final String JSON_PROPERTY_NPM_HOST_USAGE = "npm_host_usage";
  private Double npmHostUsage;

  public static final String JSON_PROPERTY_PROFILED_CONTAINER_PERCENTAGE =
      "profiled_container_percentage";
  private Double profiledContainerPercentage;

  public static final String JSON_PROPERTY_PROFILED_CONTAINER_USAGE = "profiled_container_usage";
  private Double profiledContainerUsage;

  public static final String JSON_PROPERTY_PROFILED_HOST_PERCENTAGE = "profiled_host_percentage";
  private Double profiledHostPercentage;

  public static final String JSON_PROPERTY_PROFILED_HOST_USAGE = "profiled_host_usage";
  private Double profiledHostUsage;

  public static final String JSON_PROPERTY_SNMP_PERCENTAGE = "snmp_percentage";
  private Double snmpPercentage;

  public static final String JSON_PROPERTY_SNMP_USAGE = "snmp_usage";
  private Double snmpUsage;

  public MonthlyUsageAttributionValues apiPercentage(Double apiPercentage) {
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

  public MonthlyUsageAttributionValues apiUsage(Double apiUsage) {
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

  public MonthlyUsageAttributionValues apmFargatePercentage(Double apmFargatePercentage) {
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

  public MonthlyUsageAttributionValues apmFargateUsage(Double apmFargateUsage) {
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

  public MonthlyUsageAttributionValues apmHostPercentage(Double apmHostPercentage) {
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

  public MonthlyUsageAttributionValues apmHostUsage(Double apmHostUsage) {
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

  public MonthlyUsageAttributionValues appsecFargatePercentage(Double appsecFargatePercentage) {
    this.appsecFargatePercentage = appsecFargatePercentage;
    return this;
  }

  /**
   * The percentage of Application Security Monitoring ECS Fargate task usage by tag(s).
   *
   * @return appsecFargatePercentage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APPSEC_FARGATE_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getAppsecFargatePercentage() {
    return appsecFargatePercentage;
  }

  public void setAppsecFargatePercentage(Double appsecFargatePercentage) {
    this.appsecFargatePercentage = appsecFargatePercentage;
  }

  public MonthlyUsageAttributionValues appsecFargateUsage(Double appsecFargateUsage) {
    this.appsecFargateUsage = appsecFargateUsage;
    return this;
  }

  /**
   * The Application Security Monitoring ECS Fargate task usage by tag(s).
   *
   * @return appsecFargateUsage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APPSEC_FARGATE_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getAppsecFargateUsage() {
    return appsecFargateUsage;
  }

  public void setAppsecFargateUsage(Double appsecFargateUsage) {
    this.appsecFargateUsage = appsecFargateUsage;
  }

  public MonthlyUsageAttributionValues appsecPercentage(Double appsecPercentage) {
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

  public MonthlyUsageAttributionValues appsecUsage(Double appsecUsage) {
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

  public MonthlyUsageAttributionValues browserPercentage(Double browserPercentage) {
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

  public MonthlyUsageAttributionValues browserUsage(Double browserUsage) {
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

  public MonthlyUsageAttributionValues contPercentage(Double contPercentage) {
    this.contPercentage = contPercentage;
    return this;
  }

  /**
   * The percentage of container usage without the Datadog Agent by tag(s).
   *
   * @return contPercentage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONT_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getContPercentage() {
    return contPercentage;
  }

  public void setContPercentage(Double contPercentage) {
    this.contPercentage = contPercentage;
  }

  public MonthlyUsageAttributionValues contUsage(Double contUsage) {
    this.contUsage = contUsage;
    return this;
  }

  /**
   * The container usage without the Datadog Agent by tag(s).
   *
   * @return contUsage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONT_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getContUsage() {
    return contUsage;
  }

  public void setContUsage(Double contUsage) {
    this.contUsage = contUsage;
  }

  public MonthlyUsageAttributionValues containerPercentage(Double containerPercentage) {
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

  public MonthlyUsageAttributionValues containerUsage(Double containerUsage) {
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

  public MonthlyUsageAttributionValues cspmContainersPercentage(Double cspmContainersPercentage) {
    this.cspmContainersPercentage = cspmContainersPercentage;
    return this;
  }

  /**
   * The percentage of CSPM container usage by tag(s).
   *
   * @return cspmContainersPercentage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CSPM_CONTAINERS_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getCspmContainersPercentage() {
    return cspmContainersPercentage;
  }

  public void setCspmContainersPercentage(Double cspmContainersPercentage) {
    this.cspmContainersPercentage = cspmContainersPercentage;
  }

  public MonthlyUsageAttributionValues cspmContainersUsage(Double cspmContainersUsage) {
    this.cspmContainersUsage = cspmContainersUsage;
    return this;
  }

  /**
   * The CSPM container usage by tag(s).
   *
   * @return cspmContainersUsage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CSPM_CONTAINERS_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getCspmContainersUsage() {
    return cspmContainersUsage;
  }

  public void setCspmContainersUsage(Double cspmContainersUsage) {
    this.cspmContainersUsage = cspmContainersUsage;
  }

  public MonthlyUsageAttributionValues cspmHostsPercentage(Double cspmHostsPercentage) {
    this.cspmHostsPercentage = cspmHostsPercentage;
    return this;
  }

  /**
   * The percentage of CSPM host usage by by tag(s).
   *
   * @return cspmHostsPercentage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CSPM_HOSTS_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getCspmHostsPercentage() {
    return cspmHostsPercentage;
  }

  public void setCspmHostsPercentage(Double cspmHostsPercentage) {
    this.cspmHostsPercentage = cspmHostsPercentage;
  }

  public MonthlyUsageAttributionValues cspmHostsUsage(Double cspmHostsUsage) {
    this.cspmHostsUsage = cspmHostsUsage;
    return this;
  }

  /**
   * The CSPM host usage by tag(s).
   *
   * @return cspmHostsUsage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CSPM_HOSTS_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getCspmHostsUsage() {
    return cspmHostsUsage;
  }

  public void setCspmHostsUsage(Double cspmHostsUsage) {
    this.cspmHostsUsage = cspmHostsUsage;
  }

  public MonthlyUsageAttributionValues customTimeseriesPercentage(
      Double customTimeseriesPercentage) {
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

  public MonthlyUsageAttributionValues customTimeseriesUsage(Double customTimeseriesUsage) {
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

  public MonthlyUsageAttributionValues cwsContainersPercentage(Double cwsContainersPercentage) {
    this.cwsContainersPercentage = cwsContainersPercentage;
    return this;
  }

  /**
   * The percentage of Cloud Workload Security container usage by tag(s).
   *
   * @return cwsContainersPercentage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CWS_CONTAINERS_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getCwsContainersPercentage() {
    return cwsContainersPercentage;
  }

  public void setCwsContainersPercentage(Double cwsContainersPercentage) {
    this.cwsContainersPercentage = cwsContainersPercentage;
  }

  public MonthlyUsageAttributionValues cwsContainersUsage(Double cwsContainersUsage) {
    this.cwsContainersUsage = cwsContainersUsage;
    return this;
  }

  /**
   * The Cloud Workload Security container usage by tag(s).
   *
   * @return cwsContainersUsage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CWS_CONTAINERS_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getCwsContainersUsage() {
    return cwsContainersUsage;
  }

  public void setCwsContainersUsage(Double cwsContainersUsage) {
    this.cwsContainersUsage = cwsContainersUsage;
  }

  public MonthlyUsageAttributionValues cwsHostsPercentage(Double cwsHostsPercentage) {
    this.cwsHostsPercentage = cwsHostsPercentage;
    return this;
  }

  /**
   * The percentage of Cloud Workload Security host usage by tag(s).
   *
   * @return cwsHostsPercentage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CWS_HOSTS_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getCwsHostsPercentage() {
    return cwsHostsPercentage;
  }

  public void setCwsHostsPercentage(Double cwsHostsPercentage) {
    this.cwsHostsPercentage = cwsHostsPercentage;
  }

  public MonthlyUsageAttributionValues cwsHostsUsage(Double cwsHostsUsage) {
    this.cwsHostsUsage = cwsHostsUsage;
    return this;
  }

  /**
   * The Cloud Workload Security host usage by tag(s).
   *
   * @return cwsHostsUsage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CWS_HOSTS_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getCwsHostsUsage() {
    return cwsHostsUsage;
  }

  public void setCwsHostsUsage(Double cwsHostsUsage) {
    this.cwsHostsUsage = cwsHostsUsage;
  }

  public MonthlyUsageAttributionValues dbmHostsPercentage(Double dbmHostsPercentage) {
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

  public MonthlyUsageAttributionValues dbmHostsUsage(Double dbmHostsUsage) {
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

  public MonthlyUsageAttributionValues dbmQueriesPercentage(Double dbmQueriesPercentage) {
    this.dbmQueriesPercentage = dbmQueriesPercentage;
    return this;
  }

  /**
   * The percentage of Database Monitoring queries usage by tag(s).
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

  public MonthlyUsageAttributionValues dbmQueriesUsage(Double dbmQueriesUsage) {
    this.dbmQueriesUsage = dbmQueriesUsage;
    return this;
  }

  /**
   * The Database Monitoring queries usage by tag(s).
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

  public MonthlyUsageAttributionValues estimatedIndexedLogsPercentage(
      Double estimatedIndexedLogsPercentage) {
    this.estimatedIndexedLogsPercentage = estimatedIndexedLogsPercentage;
    return this;
  }

  /**
   * The percentage of estimated live indexed logs usage by tag(s). This field is in private beta.
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

  public MonthlyUsageAttributionValues estimatedIndexedLogsUsage(Double estimatedIndexedLogsUsage) {
    this.estimatedIndexedLogsUsage = estimatedIndexedLogsUsage;
    return this;
  }

  /**
   * The estimated live indexed logs usage by tag(s). This field is in private beta.
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

  public MonthlyUsageAttributionValues estimatedIndexedSpansPercentage(
      Double estimatedIndexedSpansPercentage) {
    this.estimatedIndexedSpansPercentage = estimatedIndexedSpansPercentage;
    return this;
  }

  /**
   * The percentage of estimated indexed spans usage by tag(s). This field is in private beta.
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

  public MonthlyUsageAttributionValues estimatedIndexedSpansUsage(
      Double estimatedIndexedSpansUsage) {
    this.estimatedIndexedSpansUsage = estimatedIndexedSpansUsage;
    return this;
  }

  /**
   * The estimated indexed spans usage by tag(s). This field is in private beta.
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

  public MonthlyUsageAttributionValues estimatedIngestedLogsPercentage(
      Double estimatedIngestedLogsPercentage) {
    this.estimatedIngestedLogsPercentage = estimatedIngestedLogsPercentage;
    return this;
  }

  /**
   * The percentage of estimated live ingested logs usage by tag(s). This field is in private beta.
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

  public MonthlyUsageAttributionValues estimatedIngestedLogsUsage(
      Double estimatedIngestedLogsUsage) {
    this.estimatedIngestedLogsUsage = estimatedIngestedLogsUsage;
    return this;
  }

  /**
   * The estimated live ingested logs usage by tag(s). This field is in private beta.
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

  public MonthlyUsageAttributionValues estimatedIngestedSpansPercentage(
      Double estimatedIngestedSpansPercentage) {
    this.estimatedIngestedSpansPercentage = estimatedIngestedSpansPercentage;
    return this;
  }

  /**
   * The percentage of estimated ingested spans usage by tag(s). This field is in private beta.
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

  public MonthlyUsageAttributionValues estimatedIngestedSpansUsage(
      Double estimatedIngestedSpansUsage) {
    this.estimatedIngestedSpansUsage = estimatedIngestedSpansUsage;
    return this;
  }

  /**
   * The estimated ingested spans usage by tag(s). This field is in private beta.
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

  public MonthlyUsageAttributionValues estimatedRumSessionsPercentage(
      Double estimatedRumSessionsPercentage) {
    this.estimatedRumSessionsPercentage = estimatedRumSessionsPercentage;
    return this;
  }

  /**
   * The percentage of estimated rum sessions usage by tag(s). This field is in private beta.
   *
   * @return estimatedRumSessionsPercentage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ESTIMATED_RUM_SESSIONS_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getEstimatedRumSessionsPercentage() {
    return estimatedRumSessionsPercentage;
  }

  public void setEstimatedRumSessionsPercentage(Double estimatedRumSessionsPercentage) {
    this.estimatedRumSessionsPercentage = estimatedRumSessionsPercentage;
  }

  public MonthlyUsageAttributionValues estimatedRumSessionsUsage(Double estimatedRumSessionsUsage) {
    this.estimatedRumSessionsUsage = estimatedRumSessionsUsage;
    return this;
  }

  /**
   * The estimated rum sessions usage by tag(s). This field is in private beta.
   *
   * @return estimatedRumSessionsUsage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ESTIMATED_RUM_SESSIONS_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getEstimatedRumSessionsUsage() {
    return estimatedRumSessionsUsage;
  }

  public void setEstimatedRumSessionsUsage(Double estimatedRumSessionsUsage) {
    this.estimatedRumSessionsUsage = estimatedRumSessionsUsage;
  }

  public MonthlyUsageAttributionValues fargatePercentage(Double fargatePercentage) {
    this.fargatePercentage = fargatePercentage;
    return this;
  }

  /**
   * The percentage of Fargate usage by tags.
   *
   * @return fargatePercentage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FARGATE_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getFargatePercentage() {
    return fargatePercentage;
  }

  public void setFargatePercentage(Double fargatePercentage) {
    this.fargatePercentage = fargatePercentage;
  }

  public MonthlyUsageAttributionValues fargateUsage(Double fargateUsage) {
    this.fargateUsage = fargateUsage;
    return this;
  }

  /**
   * The Fargate usage by tags.
   *
   * @return fargateUsage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FARGATE_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getFargateUsage() {
    return fargateUsage;
  }

  public void setFargateUsage(Double fargateUsage) {
    this.fargateUsage = fargateUsage;
  }

  public MonthlyUsageAttributionValues functionsPercentage(Double functionsPercentage) {
    this.functionsPercentage = functionsPercentage;
    return this;
  }

  /**
   * The percentage of Lambda function usage by tag(s).
   *
   * @return functionsPercentage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FUNCTIONS_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getFunctionsPercentage() {
    return functionsPercentage;
  }

  public void setFunctionsPercentage(Double functionsPercentage) {
    this.functionsPercentage = functionsPercentage;
  }

  public MonthlyUsageAttributionValues functionsUsage(Double functionsUsage) {
    this.functionsUsage = functionsUsage;
    return this;
  }

  /**
   * The Lambda function usage by tag(s).
   *
   * @return functionsUsage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FUNCTIONS_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getFunctionsUsage() {
    return functionsUsage;
  }

  public void setFunctionsUsage(Double functionsUsage) {
    this.functionsUsage = functionsUsage;
  }

  public MonthlyUsageAttributionValues indexedLogsPercentage(Double indexedLogsPercentage) {
    this.indexedLogsPercentage = indexedLogsPercentage;
    return this;
  }

  /**
   * The percentage of indexed logs usage by tags.
   *
   * @return indexedLogsPercentage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INDEXED_LOGS_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getIndexedLogsPercentage() {
    return indexedLogsPercentage;
  }

  public void setIndexedLogsPercentage(Double indexedLogsPercentage) {
    this.indexedLogsPercentage = indexedLogsPercentage;
  }

  public MonthlyUsageAttributionValues indexedLogsUsage(Double indexedLogsUsage) {
    this.indexedLogsUsage = indexedLogsUsage;
    return this;
  }

  /**
   * The indexed logs usage by tags.
   *
   * @return indexedLogsUsage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INDEXED_LOGS_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getIndexedLogsUsage() {
    return indexedLogsUsage;
  }

  public void setIndexedLogsUsage(Double indexedLogsUsage) {
    this.indexedLogsUsage = indexedLogsUsage;
  }

  public MonthlyUsageAttributionValues infraHostPercentage(Double infraHostPercentage) {
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

  public MonthlyUsageAttributionValues infraHostUsage(Double infraHostUsage) {
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

  public MonthlyUsageAttributionValues invocationsPercentage(Double invocationsPercentage) {
    this.invocationsPercentage = invocationsPercentage;
    return this;
  }

  /**
   * The percentage of Lambda invocation usage by tag(s).
   *
   * @return invocationsPercentage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INVOCATIONS_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getInvocationsPercentage() {
    return invocationsPercentage;
  }

  public void setInvocationsPercentage(Double invocationsPercentage) {
    this.invocationsPercentage = invocationsPercentage;
  }

  public MonthlyUsageAttributionValues invocationsUsage(Double invocationsUsage) {
    this.invocationsUsage = invocationsUsage;
    return this;
  }

  /**
   * The Lambda invocation usage by tag(s).
   *
   * @return invocationsUsage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INVOCATIONS_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getInvocationsUsage() {
    return invocationsUsage;
  }

  public void setInvocationsUsage(Double invocationsUsage) {
    this.invocationsUsage = invocationsUsage;
  }

  public MonthlyUsageAttributionValues npmHostPercentage(Double npmHostPercentage) {
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

  public MonthlyUsageAttributionValues npmHostUsage(Double npmHostUsage) {
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

  public MonthlyUsageAttributionValues profiledContainerPercentage(
      Double profiledContainerPercentage) {
    this.profiledContainerPercentage = profiledContainerPercentage;
    return this;
  }

  /**
   * The percentage of profiled container usage by tag(s).
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

  public MonthlyUsageAttributionValues profiledContainerUsage(Double profiledContainerUsage) {
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

  public MonthlyUsageAttributionValues profiledHostPercentage(Double profiledHostPercentage) {
    this.profiledHostPercentage = profiledHostPercentage;
    return this;
  }

  /**
   * The percentage of profiled hosts usage by tag(s).
   *
   * @return profiledHostPercentage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROFILED_HOST_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getProfiledHostPercentage() {
    return profiledHostPercentage;
  }

  public void setProfiledHostPercentage(Double profiledHostPercentage) {
    this.profiledHostPercentage = profiledHostPercentage;
  }

  public MonthlyUsageAttributionValues profiledHostUsage(Double profiledHostUsage) {
    this.profiledHostUsage = profiledHostUsage;
    return this;
  }

  /**
   * The profiled hosts usage by tag(s).
   *
   * @return profiledHostUsage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROFILED_HOST_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getProfiledHostUsage() {
    return profiledHostUsage;
  }

  public void setProfiledHostUsage(Double profiledHostUsage) {
    this.profiledHostUsage = profiledHostUsage;
  }

  public MonthlyUsageAttributionValues snmpPercentage(Double snmpPercentage) {
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

  public MonthlyUsageAttributionValues snmpUsage(Double snmpUsage) {
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

  /** Return true if this MonthlyUsageAttributionValues object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MonthlyUsageAttributionValues monthlyUsageAttributionValues = (MonthlyUsageAttributionValues) o;
    return Objects.equals(this.apiPercentage, monthlyUsageAttributionValues.apiPercentage)
        && Objects.equals(this.apiUsage, monthlyUsageAttributionValues.apiUsage)
        && Objects.equals(
            this.apmFargatePercentage, monthlyUsageAttributionValues.apmFargatePercentage)
        && Objects.equals(this.apmFargateUsage, monthlyUsageAttributionValues.apmFargateUsage)
        && Objects.equals(this.apmHostPercentage, monthlyUsageAttributionValues.apmHostPercentage)
        && Objects.equals(this.apmHostUsage, monthlyUsageAttributionValues.apmHostUsage)
        && Objects.equals(
            this.appsecFargatePercentage, monthlyUsageAttributionValues.appsecFargatePercentage)
        && Objects.equals(this.appsecFargateUsage, monthlyUsageAttributionValues.appsecFargateUsage)
        && Objects.equals(this.appsecPercentage, monthlyUsageAttributionValues.appsecPercentage)
        && Objects.equals(this.appsecUsage, monthlyUsageAttributionValues.appsecUsage)
        && Objects.equals(this.browserPercentage, monthlyUsageAttributionValues.browserPercentage)
        && Objects.equals(this.browserUsage, monthlyUsageAttributionValues.browserUsage)
        && Objects.equals(this.contPercentage, monthlyUsageAttributionValues.contPercentage)
        && Objects.equals(this.contUsage, monthlyUsageAttributionValues.contUsage)
        && Objects.equals(
            this.containerPercentage, monthlyUsageAttributionValues.containerPercentage)
        && Objects.equals(this.containerUsage, monthlyUsageAttributionValues.containerUsage)
        && Objects.equals(
            this.cspmContainersPercentage, monthlyUsageAttributionValues.cspmContainersPercentage)
        && Objects.equals(
            this.cspmContainersUsage, monthlyUsageAttributionValues.cspmContainersUsage)
        && Objects.equals(
            this.cspmHostsPercentage, monthlyUsageAttributionValues.cspmHostsPercentage)
        && Objects.equals(this.cspmHostsUsage, monthlyUsageAttributionValues.cspmHostsUsage)
        && Objects.equals(
            this.customTimeseriesPercentage,
            monthlyUsageAttributionValues.customTimeseriesPercentage)
        && Objects.equals(
            this.customTimeseriesUsage, monthlyUsageAttributionValues.customTimeseriesUsage)
        && Objects.equals(
            this.cwsContainersPercentage, monthlyUsageAttributionValues.cwsContainersPercentage)
        && Objects.equals(this.cwsContainersUsage, monthlyUsageAttributionValues.cwsContainersUsage)
        && Objects.equals(this.cwsHostsPercentage, monthlyUsageAttributionValues.cwsHostsPercentage)
        && Objects.equals(this.cwsHostsUsage, monthlyUsageAttributionValues.cwsHostsUsage)
        && Objects.equals(this.dbmHostsPercentage, monthlyUsageAttributionValues.dbmHostsPercentage)
        && Objects.equals(this.dbmHostsUsage, monthlyUsageAttributionValues.dbmHostsUsage)
        && Objects.equals(
            this.dbmQueriesPercentage, monthlyUsageAttributionValues.dbmQueriesPercentage)
        && Objects.equals(this.dbmQueriesUsage, monthlyUsageAttributionValues.dbmQueriesUsage)
        && Objects.equals(
            this.estimatedIndexedLogsPercentage,
            monthlyUsageAttributionValues.estimatedIndexedLogsPercentage)
        && Objects.equals(
            this.estimatedIndexedLogsUsage, monthlyUsageAttributionValues.estimatedIndexedLogsUsage)
        && Objects.equals(
            this.estimatedIndexedSpansPercentage,
            monthlyUsageAttributionValues.estimatedIndexedSpansPercentage)
        && Objects.equals(
            this.estimatedIndexedSpansUsage,
            monthlyUsageAttributionValues.estimatedIndexedSpansUsage)
        && Objects.equals(
            this.estimatedIngestedLogsPercentage,
            monthlyUsageAttributionValues.estimatedIngestedLogsPercentage)
        && Objects.equals(
            this.estimatedIngestedLogsUsage,
            monthlyUsageAttributionValues.estimatedIngestedLogsUsage)
        && Objects.equals(
            this.estimatedIngestedSpansPercentage,
            monthlyUsageAttributionValues.estimatedIngestedSpansPercentage)
        && Objects.equals(
            this.estimatedIngestedSpansUsage,
            monthlyUsageAttributionValues.estimatedIngestedSpansUsage)
        && Objects.equals(
            this.estimatedRumSessionsPercentage,
            monthlyUsageAttributionValues.estimatedRumSessionsPercentage)
        && Objects.equals(
            this.estimatedRumSessionsUsage, monthlyUsageAttributionValues.estimatedRumSessionsUsage)
        && Objects.equals(this.fargatePercentage, monthlyUsageAttributionValues.fargatePercentage)
        && Objects.equals(this.fargateUsage, monthlyUsageAttributionValues.fargateUsage)
        && Objects.equals(
            this.functionsPercentage, monthlyUsageAttributionValues.functionsPercentage)
        && Objects.equals(this.functionsUsage, monthlyUsageAttributionValues.functionsUsage)
        && Objects.equals(
            this.indexedLogsPercentage, monthlyUsageAttributionValues.indexedLogsPercentage)
        && Objects.equals(this.indexedLogsUsage, monthlyUsageAttributionValues.indexedLogsUsage)
        && Objects.equals(
            this.infraHostPercentage, monthlyUsageAttributionValues.infraHostPercentage)
        && Objects.equals(this.infraHostUsage, monthlyUsageAttributionValues.infraHostUsage)
        && Objects.equals(
            this.invocationsPercentage, monthlyUsageAttributionValues.invocationsPercentage)
        && Objects.equals(this.invocationsUsage, monthlyUsageAttributionValues.invocationsUsage)
        && Objects.equals(this.npmHostPercentage, monthlyUsageAttributionValues.npmHostPercentage)
        && Objects.equals(this.npmHostUsage, monthlyUsageAttributionValues.npmHostUsage)
        && Objects.equals(
            this.profiledContainerPercentage,
            monthlyUsageAttributionValues.profiledContainerPercentage)
        && Objects.equals(
            this.profiledContainerUsage, monthlyUsageAttributionValues.profiledContainerUsage)
        && Objects.equals(
            this.profiledHostPercentage, monthlyUsageAttributionValues.profiledHostPercentage)
        && Objects.equals(this.profiledHostUsage, monthlyUsageAttributionValues.profiledHostUsage)
        && Objects.equals(this.snmpPercentage, monthlyUsageAttributionValues.snmpPercentage)
        && Objects.equals(this.snmpUsage, monthlyUsageAttributionValues.snmpUsage);
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
        contPercentage,
        contUsage,
        containerPercentage,
        containerUsage,
        cspmContainersPercentage,
        cspmContainersUsage,
        cspmHostsPercentage,
        cspmHostsUsage,
        customTimeseriesPercentage,
        customTimeseriesUsage,
        cwsContainersPercentage,
        cwsContainersUsage,
        cwsHostsPercentage,
        cwsHostsUsage,
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
        fargatePercentage,
        fargateUsage,
        functionsPercentage,
        functionsUsage,
        indexedLogsPercentage,
        indexedLogsUsage,
        infraHostPercentage,
        infraHostUsage,
        invocationsPercentage,
        invocationsUsage,
        npmHostPercentage,
        npmHostUsage,
        profiledContainerPercentage,
        profiledContainerUsage,
        profiledHostPercentage,
        profiledHostUsage,
        snmpPercentage,
        snmpUsage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonthlyUsageAttributionValues {\n");
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
    sb.append("    contPercentage: ").append(toIndentedString(contPercentage)).append("\n");
    sb.append("    contUsage: ").append(toIndentedString(contUsage)).append("\n");
    sb.append("    containerPercentage: ")
        .append(toIndentedString(containerPercentage))
        .append("\n");
    sb.append("    containerUsage: ").append(toIndentedString(containerUsage)).append("\n");
    sb.append("    cspmContainersPercentage: ")
        .append(toIndentedString(cspmContainersPercentage))
        .append("\n");
    sb.append("    cspmContainersUsage: ")
        .append(toIndentedString(cspmContainersUsage))
        .append("\n");
    sb.append("    cspmHostsPercentage: ")
        .append(toIndentedString(cspmHostsPercentage))
        .append("\n");
    sb.append("    cspmHostsUsage: ").append(toIndentedString(cspmHostsUsage)).append("\n");
    sb.append("    customTimeseriesPercentage: ")
        .append(toIndentedString(customTimeseriesPercentage))
        .append("\n");
    sb.append("    customTimeseriesUsage: ")
        .append(toIndentedString(customTimeseriesUsage))
        .append("\n");
    sb.append("    cwsContainersPercentage: ")
        .append(toIndentedString(cwsContainersPercentage))
        .append("\n");
    sb.append("    cwsContainersUsage: ").append(toIndentedString(cwsContainersUsage)).append("\n");
    sb.append("    cwsHostsPercentage: ").append(toIndentedString(cwsHostsPercentage)).append("\n");
    sb.append("    cwsHostsUsage: ").append(toIndentedString(cwsHostsUsage)).append("\n");
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
    sb.append("    fargatePercentage: ").append(toIndentedString(fargatePercentage)).append("\n");
    sb.append("    fargateUsage: ").append(toIndentedString(fargateUsage)).append("\n");
    sb.append("    functionsPercentage: ")
        .append(toIndentedString(functionsPercentage))
        .append("\n");
    sb.append("    functionsUsage: ").append(toIndentedString(functionsUsage)).append("\n");
    sb.append("    indexedLogsPercentage: ")
        .append(toIndentedString(indexedLogsPercentage))
        .append("\n");
    sb.append("    indexedLogsUsage: ").append(toIndentedString(indexedLogsUsage)).append("\n");
    sb.append("    infraHostPercentage: ")
        .append(toIndentedString(infraHostPercentage))
        .append("\n");
    sb.append("    infraHostUsage: ").append(toIndentedString(infraHostUsage)).append("\n");
    sb.append("    invocationsPercentage: ")
        .append(toIndentedString(invocationsPercentage))
        .append("\n");
    sb.append("    invocationsUsage: ").append(toIndentedString(invocationsUsage)).append("\n");
    sb.append("    npmHostPercentage: ").append(toIndentedString(npmHostPercentage)).append("\n");
    sb.append("    npmHostUsage: ").append(toIndentedString(npmHostUsage)).append("\n");
    sb.append("    profiledContainerPercentage: ")
        .append(toIndentedString(profiledContainerPercentage))
        .append("\n");
    sb.append("    profiledContainerUsage: ")
        .append(toIndentedString(profiledContainerUsage))
        .append("\n");
    sb.append("    profiledHostPercentage: ")
        .append(toIndentedString(profiledHostPercentage))
        .append("\n");
    sb.append("    profiledHostUsage: ").append(toIndentedString(profiledHostUsage)).append("\n");
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
