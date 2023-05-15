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
  MonthlyUsageAttributionValues.JSON_PROPERTY_CONTAINER_EXCL_AGENT_PERCENTAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_CONTAINER_EXCL_AGENT_USAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_CONTAINER_PERCENTAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_CONTAINER_USAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_CSPM_CONTAINERS_PERCENTAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_CSPM_CONTAINERS_USAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_CSPM_HOSTS_PERCENTAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_CSPM_HOSTS_USAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_CUSTOM_INGESTED_TIMESERIES_PERCENTAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_CUSTOM_INGESTED_TIMESERIES_USAGE,
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
  MonthlyUsageAttributionValues.JSON_PROPERTY_INFRA_HOST_PERCENTAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_INFRA_HOST_USAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_INVOCATIONS_PERCENTAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_INVOCATIONS_USAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_NPM_HOST_PERCENTAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_NPM_HOST_USAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_PROFILED_CONTAINER_PERCENTAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_PROFILED_CONTAINER_USAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_PROFILED_FARGATE_PERCENTAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_PROFILED_FARGATE_USAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_PROFILED_HOST_PERCENTAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_PROFILED_HOST_USAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_SNMP_PERCENTAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_SNMP_USAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_UNIVERSAL_SERVICE_MONITORING_PERCENTAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_UNIVERSAL_SERVICE_MONITORING_USAGE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class MonthlyUsageAttributionValues {
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

  public static final String JSON_PROPERTY_CONTAINER_EXCL_AGENT_PERCENTAGE =
      "container_excl_agent_percentage";
  private JsonNullable<Double> containerExclAgentPercentage = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_CONTAINER_EXCL_AGENT_USAGE =
      "container_excl_agent_usage";
  private JsonNullable<Double> containerExclAgentUsage = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_CONTAINER_PERCENTAGE = "container_percentage";
  private JsonNullable<Double> containerPercentage = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_CONTAINER_USAGE = "container_usage";
  private JsonNullable<Double> containerUsage = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_CSPM_CONTAINERS_PERCENTAGE =
      "cspm_containers_percentage";
  private JsonNullable<Double> cspmContainersPercentage = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_CSPM_CONTAINERS_USAGE = "cspm_containers_usage";
  private JsonNullable<Double> cspmContainersUsage = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_CSPM_HOSTS_PERCENTAGE = "cspm_hosts_percentage";
  private JsonNullable<Double> cspmHostsPercentage = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_CSPM_HOSTS_USAGE = "cspm_hosts_usage";
  private JsonNullable<Double> cspmHostsUsage = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_CUSTOM_INGESTED_TIMESERIES_PERCENTAGE =
      "custom_ingested_timeseries_percentage";
  private JsonNullable<Double> customIngestedTimeseriesPercentage =
      JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_CUSTOM_INGESTED_TIMESERIES_USAGE =
      "custom_ingested_timeseries_usage";
  private JsonNullable<Double> customIngestedTimeseriesUsage = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_CUSTOM_TIMESERIES_PERCENTAGE =
      "custom_timeseries_percentage";
  private JsonNullable<Double> customTimeseriesPercentage = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_CUSTOM_TIMESERIES_USAGE = "custom_timeseries_usage";
  private JsonNullable<Double> customTimeseriesUsage = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_CWS_CONTAINERS_PERCENTAGE = "cws_containers_percentage";
  private JsonNullable<Double> cwsContainersPercentage = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_CWS_CONTAINERS_USAGE = "cws_containers_usage";
  private JsonNullable<Double> cwsContainersUsage = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_CWS_HOSTS_PERCENTAGE = "cws_hosts_percentage";
  private JsonNullable<Double> cwsHostsPercentage = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_CWS_HOSTS_USAGE = "cws_hosts_usage";
  private JsonNullable<Double> cwsHostsUsage = JsonNullable.<Double>undefined();

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

  public static final String JSON_PROPERTY_FARGATE_PERCENTAGE = "fargate_percentage";
  private JsonNullable<Double> fargatePercentage = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_FARGATE_USAGE = "fargate_usage";
  private JsonNullable<Double> fargateUsage = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_FUNCTIONS_PERCENTAGE = "functions_percentage";
  private JsonNullable<Double> functionsPercentage = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_FUNCTIONS_USAGE = "functions_usage";
  private JsonNullable<Double> functionsUsage = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_INFRA_HOST_PERCENTAGE = "infra_host_percentage";
  private JsonNullable<Double> infraHostPercentage = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_INFRA_HOST_USAGE = "infra_host_usage";
  private JsonNullable<Double> infraHostUsage = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_INVOCATIONS_PERCENTAGE = "invocations_percentage";
  private JsonNullable<Double> invocationsPercentage = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_INVOCATIONS_USAGE = "invocations_usage";
  private JsonNullable<Double> invocationsUsage = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_NPM_HOST_PERCENTAGE = "npm_host_percentage";
  private JsonNullable<Double> npmHostPercentage = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_NPM_HOST_USAGE = "npm_host_usage";
  private JsonNullable<Double> npmHostUsage = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_PROFILED_CONTAINER_PERCENTAGE =
      "profiled_container_percentage";
  private JsonNullable<Double> profiledContainerPercentage = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_PROFILED_CONTAINER_USAGE = "profiled_container_usage";
  private JsonNullable<Double> profiledContainerUsage = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_PROFILED_FARGATE_PERCENTAGE =
      "profiled_fargate_percentage";
  private JsonNullable<Double> profiledFargatePercentage = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_PROFILED_FARGATE_USAGE = "profiled_fargate_usage";
  private JsonNullable<Double> profiledFargateUsage = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_PROFILED_HOST_PERCENTAGE = "profiled_host_percentage";
  private JsonNullable<Double> profiledHostPercentage = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_PROFILED_HOST_USAGE = "profiled_host_usage";
  private JsonNullable<Double> profiledHostUsage = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_SNMP_PERCENTAGE = "snmp_percentage";
  private JsonNullable<Double> snmpPercentage = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_SNMP_USAGE = "snmp_usage";
  private JsonNullable<Double> snmpUsage = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_UNIVERSAL_SERVICE_MONITORING_PERCENTAGE =
      "universal_service_monitoring_percentage";
  private JsonNullable<Double> universalServiceMonitoringPercentage =
      JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_UNIVERSAL_SERVICE_MONITORING_USAGE =
      "universal_service_monitoring_usage";
  private JsonNullable<Double> universalServiceMonitoringUsage = JsonNullable.<Double>undefined();

  public MonthlyUsageAttributionValues apiPercentage(Double apiPercentage) {
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

  public MonthlyUsageAttributionValues apiUsage(Double apiUsage) {
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

  public MonthlyUsageAttributionValues apmFargatePercentage(Double apmFargatePercentage) {
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

  public MonthlyUsageAttributionValues apmFargateUsage(Double apmFargateUsage) {
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

  public MonthlyUsageAttributionValues apmHostPercentage(Double apmHostPercentage) {
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

  public MonthlyUsageAttributionValues apmHostUsage(Double apmHostUsage) {
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

  public MonthlyUsageAttributionValues appsecFargatePercentage(Double appsecFargatePercentage) {
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

  public MonthlyUsageAttributionValues appsecFargateUsage(Double appsecFargateUsage) {
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

  public MonthlyUsageAttributionValues appsecPercentage(Double appsecPercentage) {
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

  public MonthlyUsageAttributionValues appsecUsage(Double appsecUsage) {
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

  public MonthlyUsageAttributionValues browserPercentage(Double browserPercentage) {
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

  public MonthlyUsageAttributionValues browserUsage(Double browserUsage) {
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

  public MonthlyUsageAttributionValues containerExclAgentPercentage(
      Double containerExclAgentPercentage) {
    this.containerExclAgentPercentage = JsonNullable.<Double>of(containerExclAgentPercentage);
    return this;
  }

  /**
   * The percentage of container usage without the Datadog Agent by tag(s).
   *
   * @return containerExclAgentPercentage
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Double getContainerExclAgentPercentage() {
    return containerExclAgentPercentage.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CONTAINER_EXCL_AGENT_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getContainerExclAgentPercentage_JsonNullable() {
    return containerExclAgentPercentage;
  }

  @JsonProperty(JSON_PROPERTY_CONTAINER_EXCL_AGENT_PERCENTAGE)
  public void setContainerExclAgentPercentage_JsonNullable(
      JsonNullable<Double> containerExclAgentPercentage) {
    this.containerExclAgentPercentage = containerExclAgentPercentage;
  }

  public void setContainerExclAgentPercentage(Double containerExclAgentPercentage) {
    this.containerExclAgentPercentage = JsonNullable.<Double>of(containerExclAgentPercentage);
  }

  public MonthlyUsageAttributionValues containerExclAgentUsage(Double containerExclAgentUsage) {
    this.containerExclAgentUsage = JsonNullable.<Double>of(containerExclAgentUsage);
    return this;
  }

  /**
   * The container usage without the Datadog Agent by tag(s).
   *
   * @return containerExclAgentUsage
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Double getContainerExclAgentUsage() {
    return containerExclAgentUsage.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CONTAINER_EXCL_AGENT_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getContainerExclAgentUsage_JsonNullable() {
    return containerExclAgentUsage;
  }

  @JsonProperty(JSON_PROPERTY_CONTAINER_EXCL_AGENT_USAGE)
  public void setContainerExclAgentUsage_JsonNullable(
      JsonNullable<Double> containerExclAgentUsage) {
    this.containerExclAgentUsage = containerExclAgentUsage;
  }

  public void setContainerExclAgentUsage(Double containerExclAgentUsage) {
    this.containerExclAgentUsage = JsonNullable.<Double>of(containerExclAgentUsage);
  }

  public MonthlyUsageAttributionValues containerPercentage(Double containerPercentage) {
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

  public MonthlyUsageAttributionValues containerUsage(Double containerUsage) {
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

  public MonthlyUsageAttributionValues cspmContainersPercentage(Double cspmContainersPercentage) {
    this.cspmContainersPercentage = JsonNullable.<Double>of(cspmContainersPercentage);
    return this;
  }

  /**
   * The percentage of CSPM container usage by tag(s).
   *
   * @return cspmContainersPercentage
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Double getCspmContainersPercentage() {
    return cspmContainersPercentage.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CSPM_CONTAINERS_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getCspmContainersPercentage_JsonNullable() {
    return cspmContainersPercentage;
  }

  @JsonProperty(JSON_PROPERTY_CSPM_CONTAINERS_PERCENTAGE)
  public void setCspmContainersPercentage_JsonNullable(
      JsonNullable<Double> cspmContainersPercentage) {
    this.cspmContainersPercentage = cspmContainersPercentage;
  }

  public void setCspmContainersPercentage(Double cspmContainersPercentage) {
    this.cspmContainersPercentage = JsonNullable.<Double>of(cspmContainersPercentage);
  }

  public MonthlyUsageAttributionValues cspmContainersUsage(Double cspmContainersUsage) {
    this.cspmContainersUsage = JsonNullable.<Double>of(cspmContainersUsage);
    return this;
  }

  /**
   * The CSPM container usage by tag(s).
   *
   * @return cspmContainersUsage
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Double getCspmContainersUsage() {
    return cspmContainersUsage.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CSPM_CONTAINERS_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getCspmContainersUsage_JsonNullable() {
    return cspmContainersUsage;
  }

  @JsonProperty(JSON_PROPERTY_CSPM_CONTAINERS_USAGE)
  public void setCspmContainersUsage_JsonNullable(JsonNullable<Double> cspmContainersUsage) {
    this.cspmContainersUsage = cspmContainersUsage;
  }

  public void setCspmContainersUsage(Double cspmContainersUsage) {
    this.cspmContainersUsage = JsonNullable.<Double>of(cspmContainersUsage);
  }

  public MonthlyUsageAttributionValues cspmHostsPercentage(Double cspmHostsPercentage) {
    this.cspmHostsPercentage = JsonNullable.<Double>of(cspmHostsPercentage);
    return this;
  }

  /**
   * The percentage of CSPM host usage by by tag(s).
   *
   * @return cspmHostsPercentage
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Double getCspmHostsPercentage() {
    return cspmHostsPercentage.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CSPM_HOSTS_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getCspmHostsPercentage_JsonNullable() {
    return cspmHostsPercentage;
  }

  @JsonProperty(JSON_PROPERTY_CSPM_HOSTS_PERCENTAGE)
  public void setCspmHostsPercentage_JsonNullable(JsonNullable<Double> cspmHostsPercentage) {
    this.cspmHostsPercentage = cspmHostsPercentage;
  }

  public void setCspmHostsPercentage(Double cspmHostsPercentage) {
    this.cspmHostsPercentage = JsonNullable.<Double>of(cspmHostsPercentage);
  }

  public MonthlyUsageAttributionValues cspmHostsUsage(Double cspmHostsUsage) {
    this.cspmHostsUsage = JsonNullable.<Double>of(cspmHostsUsage);
    return this;
  }

  /**
   * The CSPM host usage by tag(s).
   *
   * @return cspmHostsUsage
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Double getCspmHostsUsage() {
    return cspmHostsUsage.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CSPM_HOSTS_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getCspmHostsUsage_JsonNullable() {
    return cspmHostsUsage;
  }

  @JsonProperty(JSON_PROPERTY_CSPM_HOSTS_USAGE)
  public void setCspmHostsUsage_JsonNullable(JsonNullable<Double> cspmHostsUsage) {
    this.cspmHostsUsage = cspmHostsUsage;
  }

  public void setCspmHostsUsage(Double cspmHostsUsage) {
    this.cspmHostsUsage = JsonNullable.<Double>of(cspmHostsUsage);
  }

  public MonthlyUsageAttributionValues customIngestedTimeseriesPercentage(
      Double customIngestedTimeseriesPercentage) {
    this.customIngestedTimeseriesPercentage =
        JsonNullable.<Double>of(customIngestedTimeseriesPercentage);
    return this;
  }

  /**
   * The percentage of ingested custom metrics usage by tag(s).
   *
   * @return customIngestedTimeseriesPercentage
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Double getCustomIngestedTimeseriesPercentage() {
    return customIngestedTimeseriesPercentage.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CUSTOM_INGESTED_TIMESERIES_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getCustomIngestedTimeseriesPercentage_JsonNullable() {
    return customIngestedTimeseriesPercentage;
  }

  @JsonProperty(JSON_PROPERTY_CUSTOM_INGESTED_TIMESERIES_PERCENTAGE)
  public void setCustomIngestedTimeseriesPercentage_JsonNullable(
      JsonNullable<Double> customIngestedTimeseriesPercentage) {
    this.customIngestedTimeseriesPercentage = customIngestedTimeseriesPercentage;
  }

  public void setCustomIngestedTimeseriesPercentage(Double customIngestedTimeseriesPercentage) {
    this.customIngestedTimeseriesPercentage =
        JsonNullable.<Double>of(customIngestedTimeseriesPercentage);
  }

  public MonthlyUsageAttributionValues customIngestedTimeseriesUsage(
      Double customIngestedTimeseriesUsage) {
    this.customIngestedTimeseriesUsage = JsonNullable.<Double>of(customIngestedTimeseriesUsage);
    return this;
  }

  /**
   * The ingested custom metrics usage by tag(s).
   *
   * @return customIngestedTimeseriesUsage
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Double getCustomIngestedTimeseriesUsage() {
    return customIngestedTimeseriesUsage.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CUSTOM_INGESTED_TIMESERIES_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getCustomIngestedTimeseriesUsage_JsonNullable() {
    return customIngestedTimeseriesUsage;
  }

  @JsonProperty(JSON_PROPERTY_CUSTOM_INGESTED_TIMESERIES_USAGE)
  public void setCustomIngestedTimeseriesUsage_JsonNullable(
      JsonNullable<Double> customIngestedTimeseriesUsage) {
    this.customIngestedTimeseriesUsage = customIngestedTimeseriesUsage;
  }

  public void setCustomIngestedTimeseriesUsage(Double customIngestedTimeseriesUsage) {
    this.customIngestedTimeseriesUsage = JsonNullable.<Double>of(customIngestedTimeseriesUsage);
  }

  public MonthlyUsageAttributionValues customTimeseriesPercentage(
      Double customTimeseriesPercentage) {
    this.customTimeseriesPercentage = JsonNullable.<Double>of(customTimeseriesPercentage);
    return this;
  }

  /**
   * The percentage of indexed custom metrics usage by tag(s).
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

  public MonthlyUsageAttributionValues customTimeseriesUsage(Double customTimeseriesUsage) {
    this.customTimeseriesUsage = JsonNullable.<Double>of(customTimeseriesUsage);
    return this;
  }

  /**
   * The indexed custom metrics usage by tag(s).
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

  public MonthlyUsageAttributionValues cwsContainersPercentage(Double cwsContainersPercentage) {
    this.cwsContainersPercentage = JsonNullable.<Double>of(cwsContainersPercentage);
    return this;
  }

  /**
   * The percentage of Cloud Workload Security container usage by tag(s).
   *
   * @return cwsContainersPercentage
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Double getCwsContainersPercentage() {
    return cwsContainersPercentage.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CWS_CONTAINERS_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getCwsContainersPercentage_JsonNullable() {
    return cwsContainersPercentage;
  }

  @JsonProperty(JSON_PROPERTY_CWS_CONTAINERS_PERCENTAGE)
  public void setCwsContainersPercentage_JsonNullable(
      JsonNullable<Double> cwsContainersPercentage) {
    this.cwsContainersPercentage = cwsContainersPercentage;
  }

  public void setCwsContainersPercentage(Double cwsContainersPercentage) {
    this.cwsContainersPercentage = JsonNullable.<Double>of(cwsContainersPercentage);
  }

  public MonthlyUsageAttributionValues cwsContainersUsage(Double cwsContainersUsage) {
    this.cwsContainersUsage = JsonNullable.<Double>of(cwsContainersUsage);
    return this;
  }

  /**
   * The Cloud Workload Security container usage by tag(s).
   *
   * @return cwsContainersUsage
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Double getCwsContainersUsage() {
    return cwsContainersUsage.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CWS_CONTAINERS_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getCwsContainersUsage_JsonNullable() {
    return cwsContainersUsage;
  }

  @JsonProperty(JSON_PROPERTY_CWS_CONTAINERS_USAGE)
  public void setCwsContainersUsage_JsonNullable(JsonNullable<Double> cwsContainersUsage) {
    this.cwsContainersUsage = cwsContainersUsage;
  }

  public void setCwsContainersUsage(Double cwsContainersUsage) {
    this.cwsContainersUsage = JsonNullable.<Double>of(cwsContainersUsage);
  }

  public MonthlyUsageAttributionValues cwsHostsPercentage(Double cwsHostsPercentage) {
    this.cwsHostsPercentage = JsonNullable.<Double>of(cwsHostsPercentage);
    return this;
  }

  /**
   * The percentage of Cloud Workload Security host usage by tag(s).
   *
   * @return cwsHostsPercentage
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Double getCwsHostsPercentage() {
    return cwsHostsPercentage.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CWS_HOSTS_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getCwsHostsPercentage_JsonNullable() {
    return cwsHostsPercentage;
  }

  @JsonProperty(JSON_PROPERTY_CWS_HOSTS_PERCENTAGE)
  public void setCwsHostsPercentage_JsonNullable(JsonNullable<Double> cwsHostsPercentage) {
    this.cwsHostsPercentage = cwsHostsPercentage;
  }

  public void setCwsHostsPercentage(Double cwsHostsPercentage) {
    this.cwsHostsPercentage = JsonNullable.<Double>of(cwsHostsPercentage);
  }

  public MonthlyUsageAttributionValues cwsHostsUsage(Double cwsHostsUsage) {
    this.cwsHostsUsage = JsonNullable.<Double>of(cwsHostsUsage);
    return this;
  }

  /**
   * The Cloud Workload Security host usage by tag(s).
   *
   * @return cwsHostsUsage
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Double getCwsHostsUsage() {
    return cwsHostsUsage.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CWS_HOSTS_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getCwsHostsUsage_JsonNullable() {
    return cwsHostsUsage;
  }

  @JsonProperty(JSON_PROPERTY_CWS_HOSTS_USAGE)
  public void setCwsHostsUsage_JsonNullable(JsonNullable<Double> cwsHostsUsage) {
    this.cwsHostsUsage = cwsHostsUsage;
  }

  public void setCwsHostsUsage(Double cwsHostsUsage) {
    this.cwsHostsUsage = JsonNullable.<Double>of(cwsHostsUsage);
  }

  public MonthlyUsageAttributionValues dbmHostsPercentage(Double dbmHostsPercentage) {
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

  public MonthlyUsageAttributionValues dbmHostsUsage(Double dbmHostsUsage) {
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

  public MonthlyUsageAttributionValues dbmQueriesPercentage(Double dbmQueriesPercentage) {
    this.dbmQueriesPercentage = JsonNullable.<Double>of(dbmQueriesPercentage);
    return this;
  }

  /**
   * The percentage of Database Monitoring queries usage by tag(s).
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

  public MonthlyUsageAttributionValues dbmQueriesUsage(Double dbmQueriesUsage) {
    this.dbmQueriesUsage = JsonNullable.<Double>of(dbmQueriesUsage);
    return this;
  }

  /**
   * The Database Monitoring queries usage by tag(s).
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

  public MonthlyUsageAttributionValues estimatedIndexedLogsPercentage(
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

  public MonthlyUsageAttributionValues estimatedIndexedLogsUsage(Double estimatedIndexedLogsUsage) {
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

  public MonthlyUsageAttributionValues estimatedIndexedSpansPercentage(
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

  public MonthlyUsageAttributionValues estimatedIndexedSpansUsage(
      Double estimatedIndexedSpansUsage) {
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

  public MonthlyUsageAttributionValues estimatedIngestedLogsPercentage(
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

  public MonthlyUsageAttributionValues estimatedIngestedLogsUsage(
      Double estimatedIngestedLogsUsage) {
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

  public MonthlyUsageAttributionValues estimatedIngestedSpansPercentage(
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

  public MonthlyUsageAttributionValues estimatedIngestedSpansUsage(
      Double estimatedIngestedSpansUsage) {
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

  public MonthlyUsageAttributionValues estimatedRumSessionsPercentage(
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

  public MonthlyUsageAttributionValues estimatedRumSessionsUsage(Double estimatedRumSessionsUsage) {
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

  public MonthlyUsageAttributionValues fargatePercentage(Double fargatePercentage) {
    this.fargatePercentage = JsonNullable.<Double>of(fargatePercentage);
    return this;
  }

  /**
   * The percentage of Fargate usage by tags.
   *
   * @return fargatePercentage
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Double getFargatePercentage() {
    return fargatePercentage.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FARGATE_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getFargatePercentage_JsonNullable() {
    return fargatePercentage;
  }

  @JsonProperty(JSON_PROPERTY_FARGATE_PERCENTAGE)
  public void setFargatePercentage_JsonNullable(JsonNullable<Double> fargatePercentage) {
    this.fargatePercentage = fargatePercentage;
  }

  public void setFargatePercentage(Double fargatePercentage) {
    this.fargatePercentage = JsonNullable.<Double>of(fargatePercentage);
  }

  public MonthlyUsageAttributionValues fargateUsage(Double fargateUsage) {
    this.fargateUsage = JsonNullable.<Double>of(fargateUsage);
    return this;
  }

  /**
   * The Fargate usage by tags.
   *
   * @return fargateUsage
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Double getFargateUsage() {
    return fargateUsage.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FARGATE_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getFargateUsage_JsonNullable() {
    return fargateUsage;
  }

  @JsonProperty(JSON_PROPERTY_FARGATE_USAGE)
  public void setFargateUsage_JsonNullable(JsonNullable<Double> fargateUsage) {
    this.fargateUsage = fargateUsage;
  }

  public void setFargateUsage(Double fargateUsage) {
    this.fargateUsage = JsonNullable.<Double>of(fargateUsage);
  }

  public MonthlyUsageAttributionValues functionsPercentage(Double functionsPercentage) {
    this.functionsPercentage = JsonNullable.<Double>of(functionsPercentage);
    return this;
  }

  /**
   * The percentage of Lambda function usage by tag(s).
   *
   * @return functionsPercentage
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Double getFunctionsPercentage() {
    return functionsPercentage.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FUNCTIONS_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getFunctionsPercentage_JsonNullable() {
    return functionsPercentage;
  }

  @JsonProperty(JSON_PROPERTY_FUNCTIONS_PERCENTAGE)
  public void setFunctionsPercentage_JsonNullable(JsonNullable<Double> functionsPercentage) {
    this.functionsPercentage = functionsPercentage;
  }

  public void setFunctionsPercentage(Double functionsPercentage) {
    this.functionsPercentage = JsonNullable.<Double>of(functionsPercentage);
  }

  public MonthlyUsageAttributionValues functionsUsage(Double functionsUsage) {
    this.functionsUsage = JsonNullable.<Double>of(functionsUsage);
    return this;
  }

  /**
   * The Lambda function usage by tag(s).
   *
   * @return functionsUsage
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Double getFunctionsUsage() {
    return functionsUsage.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FUNCTIONS_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getFunctionsUsage_JsonNullable() {
    return functionsUsage;
  }

  @JsonProperty(JSON_PROPERTY_FUNCTIONS_USAGE)
  public void setFunctionsUsage_JsonNullable(JsonNullable<Double> functionsUsage) {
    this.functionsUsage = functionsUsage;
  }

  public void setFunctionsUsage(Double functionsUsage) {
    this.functionsUsage = JsonNullable.<Double>of(functionsUsage);
  }

  public MonthlyUsageAttributionValues infraHostPercentage(Double infraHostPercentage) {
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

  public MonthlyUsageAttributionValues infraHostUsage(Double infraHostUsage) {
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

  public MonthlyUsageAttributionValues invocationsPercentage(Double invocationsPercentage) {
    this.invocationsPercentage = JsonNullable.<Double>of(invocationsPercentage);
    return this;
  }

  /**
   * The percentage of Lambda invocation usage by tag(s).
   *
   * @return invocationsPercentage
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Double getInvocationsPercentage() {
    return invocationsPercentage.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_INVOCATIONS_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getInvocationsPercentage_JsonNullable() {
    return invocationsPercentage;
  }

  @JsonProperty(JSON_PROPERTY_INVOCATIONS_PERCENTAGE)
  public void setInvocationsPercentage_JsonNullable(JsonNullable<Double> invocationsPercentage) {
    this.invocationsPercentage = invocationsPercentage;
  }

  public void setInvocationsPercentage(Double invocationsPercentage) {
    this.invocationsPercentage = JsonNullable.<Double>of(invocationsPercentage);
  }

  public MonthlyUsageAttributionValues invocationsUsage(Double invocationsUsage) {
    this.invocationsUsage = JsonNullable.<Double>of(invocationsUsage);
    return this;
  }

  /**
   * The Lambda invocation usage by tag(s).
   *
   * @return invocationsUsage
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Double getInvocationsUsage() {
    return invocationsUsage.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_INVOCATIONS_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getInvocationsUsage_JsonNullable() {
    return invocationsUsage;
  }

  @JsonProperty(JSON_PROPERTY_INVOCATIONS_USAGE)
  public void setInvocationsUsage_JsonNullable(JsonNullable<Double> invocationsUsage) {
    this.invocationsUsage = invocationsUsage;
  }

  public void setInvocationsUsage(Double invocationsUsage) {
    this.invocationsUsage = JsonNullable.<Double>of(invocationsUsage);
  }

  public MonthlyUsageAttributionValues npmHostPercentage(Double npmHostPercentage) {
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

  public MonthlyUsageAttributionValues npmHostUsage(Double npmHostUsage) {
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

  public MonthlyUsageAttributionValues profiledContainerPercentage(
      Double profiledContainerPercentage) {
    this.profiledContainerPercentage = JsonNullable.<Double>of(profiledContainerPercentage);
    return this;
  }

  /**
   * The percentage of profiled container usage by tag(s).
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

  public MonthlyUsageAttributionValues profiledContainerUsage(Double profiledContainerUsage) {
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

  public MonthlyUsageAttributionValues profiledFargatePercentage(Double profiledFargatePercentage) {
    this.profiledFargatePercentage = JsonNullable.<Double>of(profiledFargatePercentage);
    return this;
  }

  /**
   * The percentage of profiled Fargate task usage by tag(s).
   *
   * @return profiledFargatePercentage
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Double getProfiledFargatePercentage() {
    return profiledFargatePercentage.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PROFILED_FARGATE_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getProfiledFargatePercentage_JsonNullable() {
    return profiledFargatePercentage;
  }

  @JsonProperty(JSON_PROPERTY_PROFILED_FARGATE_PERCENTAGE)
  public void setProfiledFargatePercentage_JsonNullable(
      JsonNullable<Double> profiledFargatePercentage) {
    this.profiledFargatePercentage = profiledFargatePercentage;
  }

  public void setProfiledFargatePercentage(Double profiledFargatePercentage) {
    this.profiledFargatePercentage = JsonNullable.<Double>of(profiledFargatePercentage);
  }

  public MonthlyUsageAttributionValues profiledFargateUsage(Double profiledFargateUsage) {
    this.profiledFargateUsage = JsonNullable.<Double>of(profiledFargateUsage);
    return this;
  }

  /**
   * The profiled Fargate task usage by tag(s).
   *
   * @return profiledFargateUsage
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Double getProfiledFargateUsage() {
    return profiledFargateUsage.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PROFILED_FARGATE_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getProfiledFargateUsage_JsonNullable() {
    return profiledFargateUsage;
  }

  @JsonProperty(JSON_PROPERTY_PROFILED_FARGATE_USAGE)
  public void setProfiledFargateUsage_JsonNullable(JsonNullable<Double> profiledFargateUsage) {
    this.profiledFargateUsage = profiledFargateUsage;
  }

  public void setProfiledFargateUsage(Double profiledFargateUsage) {
    this.profiledFargateUsage = JsonNullable.<Double>of(profiledFargateUsage);
  }

  public MonthlyUsageAttributionValues profiledHostPercentage(Double profiledHostPercentage) {
    this.profiledHostPercentage = JsonNullable.<Double>of(profiledHostPercentage);
    return this;
  }

  /**
   * The percentage of profiled hosts usage by tag(s).
   *
   * @return profiledHostPercentage
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Double getProfiledHostPercentage() {
    return profiledHostPercentage.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PROFILED_HOST_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getProfiledHostPercentage_JsonNullable() {
    return profiledHostPercentage;
  }

  @JsonProperty(JSON_PROPERTY_PROFILED_HOST_PERCENTAGE)
  public void setProfiledHostPercentage_JsonNullable(JsonNullable<Double> profiledHostPercentage) {
    this.profiledHostPercentage = profiledHostPercentage;
  }

  public void setProfiledHostPercentage(Double profiledHostPercentage) {
    this.profiledHostPercentage = JsonNullable.<Double>of(profiledHostPercentage);
  }

  public MonthlyUsageAttributionValues profiledHostUsage(Double profiledHostUsage) {
    this.profiledHostUsage = JsonNullable.<Double>of(profiledHostUsage);
    return this;
  }

  /**
   * The profiled hosts usage by tag(s).
   *
   * @return profiledHostUsage
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Double getProfiledHostUsage() {
    return profiledHostUsage.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PROFILED_HOST_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getProfiledHostUsage_JsonNullable() {
    return profiledHostUsage;
  }

  @JsonProperty(JSON_PROPERTY_PROFILED_HOST_USAGE)
  public void setProfiledHostUsage_JsonNullable(JsonNullable<Double> profiledHostUsage) {
    this.profiledHostUsage = profiledHostUsage;
  }

  public void setProfiledHostUsage(Double profiledHostUsage) {
    this.profiledHostUsage = JsonNullable.<Double>of(profiledHostUsage);
  }

  public MonthlyUsageAttributionValues snmpPercentage(Double snmpPercentage) {
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

  public MonthlyUsageAttributionValues snmpUsage(Double snmpUsage) {
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

  public MonthlyUsageAttributionValues universalServiceMonitoringPercentage(
      Double universalServiceMonitoringPercentage) {
    this.universalServiceMonitoringPercentage =
        JsonNullable.<Double>of(universalServiceMonitoringPercentage);
    return this;
  }

  /**
   * The percentage of universal service monitoring usage by tag(s).
   *
   * @return universalServiceMonitoringPercentage
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Double getUniversalServiceMonitoringPercentage() {
    return universalServiceMonitoringPercentage.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_UNIVERSAL_SERVICE_MONITORING_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getUniversalServiceMonitoringPercentage_JsonNullable() {
    return universalServiceMonitoringPercentage;
  }

  @JsonProperty(JSON_PROPERTY_UNIVERSAL_SERVICE_MONITORING_PERCENTAGE)
  public void setUniversalServiceMonitoringPercentage_JsonNullable(
      JsonNullable<Double> universalServiceMonitoringPercentage) {
    this.universalServiceMonitoringPercentage = universalServiceMonitoringPercentage;
  }

  public void setUniversalServiceMonitoringPercentage(Double universalServiceMonitoringPercentage) {
    this.universalServiceMonitoringPercentage =
        JsonNullable.<Double>of(universalServiceMonitoringPercentage);
  }

  public MonthlyUsageAttributionValues universalServiceMonitoringUsage(
      Double universalServiceMonitoringUsage) {
    this.universalServiceMonitoringUsage = JsonNullable.<Double>of(universalServiceMonitoringUsage);
    return this;
  }

  /**
   * The universal service monitoring usage by tag(s).
   *
   * @return universalServiceMonitoringUsage
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Double getUniversalServiceMonitoringUsage() {
    return universalServiceMonitoringUsage.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_UNIVERSAL_SERVICE_MONITORING_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getUniversalServiceMonitoringUsage_JsonNullable() {
    return universalServiceMonitoringUsage;
  }

  @JsonProperty(JSON_PROPERTY_UNIVERSAL_SERVICE_MONITORING_USAGE)
  public void setUniversalServiceMonitoringUsage_JsonNullable(
      JsonNullable<Double> universalServiceMonitoringUsage) {
    this.universalServiceMonitoringUsage = universalServiceMonitoringUsage;
  }

  public void setUniversalServiceMonitoringUsage(Double universalServiceMonitoringUsage) {
    this.universalServiceMonitoringUsage = JsonNullable.<Double>of(universalServiceMonitoringUsage);
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
        && Objects.equals(
            this.containerExclAgentPercentage,
            monthlyUsageAttributionValues.containerExclAgentPercentage)
        && Objects.equals(
            this.containerExclAgentUsage, monthlyUsageAttributionValues.containerExclAgentUsage)
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
            this.customIngestedTimeseriesPercentage,
            monthlyUsageAttributionValues.customIngestedTimeseriesPercentage)
        && Objects.equals(
            this.customIngestedTimeseriesUsage,
            monthlyUsageAttributionValues.customIngestedTimeseriesUsage)
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
            this.profiledFargatePercentage, monthlyUsageAttributionValues.profiledFargatePercentage)
        && Objects.equals(
            this.profiledFargateUsage, monthlyUsageAttributionValues.profiledFargateUsage)
        && Objects.equals(
            this.profiledHostPercentage, monthlyUsageAttributionValues.profiledHostPercentage)
        && Objects.equals(this.profiledHostUsage, monthlyUsageAttributionValues.profiledHostUsage)
        && Objects.equals(this.snmpPercentage, monthlyUsageAttributionValues.snmpPercentage)
        && Objects.equals(this.snmpUsage, monthlyUsageAttributionValues.snmpUsage)
        && Objects.equals(
            this.universalServiceMonitoringPercentage,
            monthlyUsageAttributionValues.universalServiceMonitoringPercentage)
        && Objects.equals(
            this.universalServiceMonitoringUsage,
            monthlyUsageAttributionValues.universalServiceMonitoringUsage);
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
        containerExclAgentPercentage,
        containerExclAgentUsage,
        containerPercentage,
        containerUsage,
        cspmContainersPercentage,
        cspmContainersUsage,
        cspmHostsPercentage,
        cspmHostsUsage,
        customIngestedTimeseriesPercentage,
        customIngestedTimeseriesUsage,
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
        infraHostPercentage,
        infraHostUsage,
        invocationsPercentage,
        invocationsUsage,
        npmHostPercentage,
        npmHostUsage,
        profiledContainerPercentage,
        profiledContainerUsage,
        profiledFargatePercentage,
        profiledFargateUsage,
        profiledHostPercentage,
        profiledHostUsage,
        snmpPercentage,
        snmpUsage,
        universalServiceMonitoringPercentage,
        universalServiceMonitoringUsage);
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
    sb.append("    containerExclAgentPercentage: ")
        .append(toIndentedString(containerExclAgentPercentage))
        .append("\n");
    sb.append("    containerExclAgentUsage: ")
        .append(toIndentedString(containerExclAgentUsage))
        .append("\n");
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
    sb.append("    customIngestedTimeseriesPercentage: ")
        .append(toIndentedString(customIngestedTimeseriesPercentage))
        .append("\n");
    sb.append("    customIngestedTimeseriesUsage: ")
        .append(toIndentedString(customIngestedTimeseriesUsage))
        .append("\n");
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
    sb.append("    profiledFargatePercentage: ")
        .append(toIndentedString(profiledFargatePercentage))
        .append("\n");
    sb.append("    profiledFargateUsage: ")
        .append(toIndentedString(profiledFargateUsage))
        .append("\n");
    sb.append("    profiledHostPercentage: ")
        .append(toIndentedString(profiledHostPercentage))
        .append("\n");
    sb.append("    profiledHostUsage: ").append(toIndentedString(profiledHostUsage)).append("\n");
    sb.append("    snmpPercentage: ").append(toIndentedString(snmpPercentage)).append("\n");
    sb.append("    snmpUsage: ").append(toIndentedString(snmpUsage)).append("\n");
    sb.append("    universalServiceMonitoringPercentage: ")
        .append(toIndentedString(universalServiceMonitoringPercentage))
        .append("\n");
    sb.append("    universalServiceMonitoringUsage: ")
        .append(toIndentedString(universalServiceMonitoringUsage))
        .append("\n");
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
