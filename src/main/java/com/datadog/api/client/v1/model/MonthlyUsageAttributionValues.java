/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Fields in Usage Summary by tag(s). */
@JsonPropertyOrder({
  MonthlyUsageAttributionValues.JSON_PROPERTY_API_PERCENTAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_API_USAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_APM_FARGATE_PERCENTAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_APM_FARGATE_USAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_APM_HOST_PERCENTAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_APM_HOST_USAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_APM_USM_PERCENTAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_APM_USM_USAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_APPSEC_FARGATE_PERCENTAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_APPSEC_FARGATE_USAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_APPSEC_PERCENTAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_APPSEC_USAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_BROWSER_PERCENTAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_BROWSER_USAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_CI_VISIBILITY_ITR_PERCENTAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_CI_VISIBILITY_ITR_USAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_CLOUD_SIEM_PERCENTAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_CLOUD_SIEM_USAGE,
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
  MonthlyUsageAttributionValues.JSON_PROPERTY_MOBILE_APP_TESTING_PERCENTAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_MOBILE_APP_TESTING_USAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_NDM_NETFLOW_PERCENTAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_NDM_NETFLOW_USAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_NPM_HOST_PERCENTAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_NPM_HOST_USAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_OBS_PIPELINE_BYTES_PERCENTAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_OBS_PIPELINE_BYTES_USAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_PROFILED_CONTAINER_PERCENTAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_PROFILED_CONTAINER_USAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_PROFILED_FARGATE_PERCENTAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_PROFILED_FARGATE_USAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_PROFILED_HOST_PERCENTAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_PROFILED_HOST_USAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_SDS_SCANNED_BYTES_PERCENTAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_SDS_SCANNED_BYTES_USAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_SERVERLESS_APPS_PERCENTAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_SERVERLESS_APPS_USAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_SNMP_PERCENTAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_SNMP_USAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_UNIVERSAL_SERVICE_MONITORING_PERCENTAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_UNIVERSAL_SERVICE_MONITORING_USAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_VULN_MANAGEMENT_HOSTS_PERCENTAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_VULN_MANAGEMENT_HOSTS_USAGE
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

  public static final String JSON_PROPERTY_APM_USM_PERCENTAGE = "apm_usm_percentage";
  private Double apmUsmPercentage;

  public static final String JSON_PROPERTY_APM_USM_USAGE = "apm_usm_usage";
  private Double apmUsmUsage;

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

  public static final String JSON_PROPERTY_CI_VISIBILITY_ITR_PERCENTAGE =
      "ci_visibility_itr_percentage";
  private Double ciVisibilityItrPercentage;

  public static final String JSON_PROPERTY_CI_VISIBILITY_ITR_USAGE = "ci_visibility_itr_usage";
  private Double ciVisibilityItrUsage;

  public static final String JSON_PROPERTY_CLOUD_SIEM_PERCENTAGE = "cloud_siem_percentage";
  private Double cloudSiemPercentage;

  public static final String JSON_PROPERTY_CLOUD_SIEM_USAGE = "cloud_siem_usage";
  private Double cloudSiemUsage;

  public static final String JSON_PROPERTY_CONTAINER_EXCL_AGENT_PERCENTAGE =
      "container_excl_agent_percentage";
  private Double containerExclAgentPercentage;

  public static final String JSON_PROPERTY_CONTAINER_EXCL_AGENT_USAGE =
      "container_excl_agent_usage";
  private Double containerExclAgentUsage;

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

  public static final String JSON_PROPERTY_CUSTOM_INGESTED_TIMESERIES_PERCENTAGE =
      "custom_ingested_timeseries_percentage";
  private Double customIngestedTimeseriesPercentage;

  public static final String JSON_PROPERTY_CUSTOM_INGESTED_TIMESERIES_USAGE =
      "custom_ingested_timeseries_usage";
  private Double customIngestedTimeseriesUsage;

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

  public static final String JSON_PROPERTY_INFRA_HOST_PERCENTAGE = "infra_host_percentage";
  private Double infraHostPercentage;

  public static final String JSON_PROPERTY_INFRA_HOST_USAGE = "infra_host_usage";
  private Double infraHostUsage;

  public static final String JSON_PROPERTY_INVOCATIONS_PERCENTAGE = "invocations_percentage";
  private Double invocationsPercentage;

  public static final String JSON_PROPERTY_INVOCATIONS_USAGE = "invocations_usage";
  private Double invocationsUsage;

  public static final String JSON_PROPERTY_MOBILE_APP_TESTING_PERCENTAGE =
      "mobile_app_testing_percentage";
  private Double mobileAppTestingPercentage;

  public static final String JSON_PROPERTY_MOBILE_APP_TESTING_USAGE = "mobile_app_testing_usage";
  private Double mobileAppTestingUsage;

  public static final String JSON_PROPERTY_NDM_NETFLOW_PERCENTAGE = "ndm_netflow_percentage";
  private Double ndmNetflowPercentage;

  public static final String JSON_PROPERTY_NDM_NETFLOW_USAGE = "ndm_netflow_usage";
  private Double ndmNetflowUsage;

  public static final String JSON_PROPERTY_NPM_HOST_PERCENTAGE = "npm_host_percentage";
  private Double npmHostPercentage;

  public static final String JSON_PROPERTY_NPM_HOST_USAGE = "npm_host_usage";
  private Double npmHostUsage;

  public static final String JSON_PROPERTY_OBS_PIPELINE_BYTES_PERCENTAGE =
      "obs_pipeline_bytes_percentage";
  private Double obsPipelineBytesPercentage;

  public static final String JSON_PROPERTY_OBS_PIPELINE_BYTES_USAGE = "obs_pipeline_bytes_usage";
  private Double obsPipelineBytesUsage;

  public static final String JSON_PROPERTY_PROFILED_CONTAINER_PERCENTAGE =
      "profiled_container_percentage";
  private Double profiledContainerPercentage;

  public static final String JSON_PROPERTY_PROFILED_CONTAINER_USAGE = "profiled_container_usage";
  private Double profiledContainerUsage;

  public static final String JSON_PROPERTY_PROFILED_FARGATE_PERCENTAGE =
      "profiled_fargate_percentage";
  private Double profiledFargatePercentage;

  public static final String JSON_PROPERTY_PROFILED_FARGATE_USAGE = "profiled_fargate_usage";
  private Double profiledFargateUsage;

  public static final String JSON_PROPERTY_PROFILED_HOST_PERCENTAGE = "profiled_host_percentage";
  private Double profiledHostPercentage;

  public static final String JSON_PROPERTY_PROFILED_HOST_USAGE = "profiled_host_usage";
  private Double profiledHostUsage;

  public static final String JSON_PROPERTY_SDS_SCANNED_BYTES_PERCENTAGE =
      "sds_scanned_bytes_percentage";
  private Double sdsScannedBytesPercentage;

  public static final String JSON_PROPERTY_SDS_SCANNED_BYTES_USAGE = "sds_scanned_bytes_usage";
  private Double sdsScannedBytesUsage;

  public static final String JSON_PROPERTY_SERVERLESS_APPS_PERCENTAGE =
      "serverless_apps_percentage";
  private Double serverlessAppsPercentage;

  public static final String JSON_PROPERTY_SERVERLESS_APPS_USAGE = "serverless_apps_usage";
  private Double serverlessAppsUsage;

  public static final String JSON_PROPERTY_SNMP_PERCENTAGE = "snmp_percentage";
  private Double snmpPercentage;

  public static final String JSON_PROPERTY_SNMP_USAGE = "snmp_usage";
  private Double snmpUsage;

  public static final String JSON_PROPERTY_UNIVERSAL_SERVICE_MONITORING_PERCENTAGE =
      "universal_service_monitoring_percentage";
  private Double universalServiceMonitoringPercentage;

  public static final String JSON_PROPERTY_UNIVERSAL_SERVICE_MONITORING_USAGE =
      "universal_service_monitoring_usage";
  private Double universalServiceMonitoringUsage;

  public static final String JSON_PROPERTY_VULN_MANAGEMENT_HOSTS_PERCENTAGE =
      "vuln_management_hosts_percentage";
  private Double vulnManagementHostsPercentage;

  public static final String JSON_PROPERTY_VULN_MANAGEMENT_HOSTS_USAGE =
      "vuln_management_hosts_usage";
  private Double vulnManagementHostsUsage;

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

  public MonthlyUsageAttributionValues apmUsmPercentage(Double apmUsmPercentage) {
    this.apmUsmPercentage = apmUsmPercentage;
    return this;
  }

  /**
   * The percentage of APM and Universal Service Monitoring host usage by tag(s).
   *
   * @return apmUsmPercentage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APM_USM_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getApmUsmPercentage() {
    return apmUsmPercentage;
  }

  public void setApmUsmPercentage(Double apmUsmPercentage) {
    this.apmUsmPercentage = apmUsmPercentage;
  }

  public MonthlyUsageAttributionValues apmUsmUsage(Double apmUsmUsage) {
    this.apmUsmUsage = apmUsmUsage;
    return this;
  }

  /**
   * The APM and Universal Service Monitoring host usage by tag(s).
   *
   * @return apmUsmUsage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APM_USM_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getApmUsmUsage() {
    return apmUsmUsage;
  }

  public void setApmUsmUsage(Double apmUsmUsage) {
    this.apmUsmUsage = apmUsmUsage;
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

  public MonthlyUsageAttributionValues ciVisibilityItrPercentage(Double ciVisibilityItrPercentage) {
    this.ciVisibilityItrPercentage = ciVisibilityItrPercentage;
    return this;
  }

  /**
   * The percentage of Git committers for Intelligent Test Runner usage by tag(s).
   *
   * @return ciVisibilityItrPercentage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CI_VISIBILITY_ITR_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getCiVisibilityItrPercentage() {
    return ciVisibilityItrPercentage;
  }

  public void setCiVisibilityItrPercentage(Double ciVisibilityItrPercentage) {
    this.ciVisibilityItrPercentage = ciVisibilityItrPercentage;
  }

  public MonthlyUsageAttributionValues ciVisibilityItrUsage(Double ciVisibilityItrUsage) {
    this.ciVisibilityItrUsage = ciVisibilityItrUsage;
    return this;
  }

  /**
   * The Git committers for Intelligent Test Runner usage by tag(s).
   *
   * @return ciVisibilityItrUsage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CI_VISIBILITY_ITR_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getCiVisibilityItrUsage() {
    return ciVisibilityItrUsage;
  }

  public void setCiVisibilityItrUsage(Double ciVisibilityItrUsage) {
    this.ciVisibilityItrUsage = ciVisibilityItrUsage;
  }

  public MonthlyUsageAttributionValues cloudSiemPercentage(Double cloudSiemPercentage) {
    this.cloudSiemPercentage = cloudSiemPercentage;
    return this;
  }

  /**
   * The percentage of Cloud Security Information and Event Management usage by tag(s).
   *
   * @return cloudSiemPercentage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CLOUD_SIEM_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getCloudSiemPercentage() {
    return cloudSiemPercentage;
  }

  public void setCloudSiemPercentage(Double cloudSiemPercentage) {
    this.cloudSiemPercentage = cloudSiemPercentage;
  }

  public MonthlyUsageAttributionValues cloudSiemUsage(Double cloudSiemUsage) {
    this.cloudSiemUsage = cloudSiemUsage;
    return this;
  }

  /**
   * The Cloud Security Information and Event Management usage by tag(s).
   *
   * @return cloudSiemUsage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CLOUD_SIEM_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getCloudSiemUsage() {
    return cloudSiemUsage;
  }

  public void setCloudSiemUsage(Double cloudSiemUsage) {
    this.cloudSiemUsage = cloudSiemUsage;
  }

  public MonthlyUsageAttributionValues containerExclAgentPercentage(
      Double containerExclAgentPercentage) {
    this.containerExclAgentPercentage = containerExclAgentPercentage;
    return this;
  }

  /**
   * The percentage of container usage without the Datadog Agent by tag(s).
   *
   * @return containerExclAgentPercentage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTAINER_EXCL_AGENT_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getContainerExclAgentPercentage() {
    return containerExclAgentPercentage;
  }

  public void setContainerExclAgentPercentage(Double containerExclAgentPercentage) {
    this.containerExclAgentPercentage = containerExclAgentPercentage;
  }

  public MonthlyUsageAttributionValues containerExclAgentUsage(Double containerExclAgentUsage) {
    this.containerExclAgentUsage = containerExclAgentUsage;
    return this;
  }

  /**
   * The container usage without the Datadog Agent by tag(s).
   *
   * @return containerExclAgentUsage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTAINER_EXCL_AGENT_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getContainerExclAgentUsage() {
    return containerExclAgentUsage;
  }

  public void setContainerExclAgentUsage(Double containerExclAgentUsage) {
    this.containerExclAgentUsage = containerExclAgentUsage;
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
   * The percentage of Cloud Security Management Pro container usage by tag(s).
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
   * The Cloud Security Management Pro container usage by tag(s).
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
   * The percentage of Cloud Security Management Pro host usage by tag(s).
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
   * The Cloud Security Management Pro host usage by tag(s).
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

  public MonthlyUsageAttributionValues customIngestedTimeseriesPercentage(
      Double customIngestedTimeseriesPercentage) {
    this.customIngestedTimeseriesPercentage = customIngestedTimeseriesPercentage;
    return this;
  }

  /**
   * The percentage of ingested custom metrics usage by tag(s).
   *
   * @return customIngestedTimeseriesPercentage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CUSTOM_INGESTED_TIMESERIES_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getCustomIngestedTimeseriesPercentage() {
    return customIngestedTimeseriesPercentage;
  }

  public void setCustomIngestedTimeseriesPercentage(Double customIngestedTimeseriesPercentage) {
    this.customIngestedTimeseriesPercentage = customIngestedTimeseriesPercentage;
  }

  public MonthlyUsageAttributionValues customIngestedTimeseriesUsage(
      Double customIngestedTimeseriesUsage) {
    this.customIngestedTimeseriesUsage = customIngestedTimeseriesUsage;
    return this;
  }

  /**
   * The ingested custom metrics usage by tag(s).
   *
   * @return customIngestedTimeseriesUsage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CUSTOM_INGESTED_TIMESERIES_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getCustomIngestedTimeseriesUsage() {
    return customIngestedTimeseriesUsage;
  }

  public void setCustomIngestedTimeseriesUsage(Double customIngestedTimeseriesUsage) {
    this.customIngestedTimeseriesUsage = customIngestedTimeseriesUsage;
  }

  public MonthlyUsageAttributionValues customTimeseriesPercentage(
      Double customTimeseriesPercentage) {
    this.customTimeseriesPercentage = customTimeseriesPercentage;
    return this;
  }

  /**
   * The percentage of indexed custom metrics usage by tag(s).
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
   * The indexed custom metrics usage by tag(s).
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
   * The percentage of estimated live indexed logs usage by tag(s).
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
   * The estimated live indexed logs usage by tag(s).
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
   * The percentage of estimated indexed spans usage by tag(s).
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
   * The estimated indexed spans usage by tag(s).
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
   * The percentage of estimated live ingested logs usage by tag(s).
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
   * The estimated live ingested logs usage by tag(s).
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
   * The percentage of estimated ingested spans usage by tag(s).
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
   * The estimated ingested spans usage by tag(s).
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
   * The percentage of estimated rum sessions usage by tag(s).
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
   * The estimated rum sessions usage by tag(s).
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

  public MonthlyUsageAttributionValues mobileAppTestingPercentage(
      Double mobileAppTestingPercentage) {
    this.mobileAppTestingPercentage = mobileAppTestingPercentage;
    return this;
  }

  /**
   * The percentage of Synthetic mobile application test usage by tag(s).
   *
   * @return mobileAppTestingPercentage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MOBILE_APP_TESTING_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getMobileAppTestingPercentage() {
    return mobileAppTestingPercentage;
  }

  public void setMobileAppTestingPercentage(Double mobileAppTestingPercentage) {
    this.mobileAppTestingPercentage = mobileAppTestingPercentage;
  }

  public MonthlyUsageAttributionValues mobileAppTestingUsage(Double mobileAppTestingUsage) {
    this.mobileAppTestingUsage = mobileAppTestingUsage;
    return this;
  }

  /**
   * The Synthetic mobile application test usage by tag(s).
   *
   * @return mobileAppTestingUsage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MOBILE_APP_TESTING_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getMobileAppTestingUsage() {
    return mobileAppTestingUsage;
  }

  public void setMobileAppTestingUsage(Double mobileAppTestingUsage) {
    this.mobileAppTestingUsage = mobileAppTestingUsage;
  }

  public MonthlyUsageAttributionValues ndmNetflowPercentage(Double ndmNetflowPercentage) {
    this.ndmNetflowPercentage = ndmNetflowPercentage;
    return this;
  }

  /**
   * The percentage of Network Device Monitoring NetFlow usage by tag(s).
   *
   * @return ndmNetflowPercentage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NDM_NETFLOW_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getNdmNetflowPercentage() {
    return ndmNetflowPercentage;
  }

  public void setNdmNetflowPercentage(Double ndmNetflowPercentage) {
    this.ndmNetflowPercentage = ndmNetflowPercentage;
  }

  public MonthlyUsageAttributionValues ndmNetflowUsage(Double ndmNetflowUsage) {
    this.ndmNetflowUsage = ndmNetflowUsage;
    return this;
  }

  /**
   * The Network Device Monitoring NetFlow usage by tag(s).
   *
   * @return ndmNetflowUsage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NDM_NETFLOW_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getNdmNetflowUsage() {
    return ndmNetflowUsage;
  }

  public void setNdmNetflowUsage(Double ndmNetflowUsage) {
    this.ndmNetflowUsage = ndmNetflowUsage;
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

  public MonthlyUsageAttributionValues obsPipelineBytesPercentage(
      Double obsPipelineBytesPercentage) {
    this.obsPipelineBytesPercentage = obsPipelineBytesPercentage;
    return this;
  }

  /**
   * The percentage of observability pipeline bytes usage by tag(s).
   *
   * @return obsPipelineBytesPercentage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OBS_PIPELINE_BYTES_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getObsPipelineBytesPercentage() {
    return obsPipelineBytesPercentage;
  }

  public void setObsPipelineBytesPercentage(Double obsPipelineBytesPercentage) {
    this.obsPipelineBytesPercentage = obsPipelineBytesPercentage;
  }

  public MonthlyUsageAttributionValues obsPipelineBytesUsage(Double obsPipelineBytesUsage) {
    this.obsPipelineBytesUsage = obsPipelineBytesUsage;
    return this;
  }

  /**
   * The observability pipeline bytes usage by tag(s).
   *
   * @return obsPipelineBytesUsage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OBS_PIPELINE_BYTES_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getObsPipelineBytesUsage() {
    return obsPipelineBytesUsage;
  }

  public void setObsPipelineBytesUsage(Double obsPipelineBytesUsage) {
    this.obsPipelineBytesUsage = obsPipelineBytesUsage;
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

  public MonthlyUsageAttributionValues profiledFargatePercentage(Double profiledFargatePercentage) {
    this.profiledFargatePercentage = profiledFargatePercentage;
    return this;
  }

  /**
   * The percentage of profiled Fargate task usage by tag(s).
   *
   * @return profiledFargatePercentage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROFILED_FARGATE_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getProfiledFargatePercentage() {
    return profiledFargatePercentage;
  }

  public void setProfiledFargatePercentage(Double profiledFargatePercentage) {
    this.profiledFargatePercentage = profiledFargatePercentage;
  }

  public MonthlyUsageAttributionValues profiledFargateUsage(Double profiledFargateUsage) {
    this.profiledFargateUsage = profiledFargateUsage;
    return this;
  }

  /**
   * The profiled Fargate task usage by tag(s).
   *
   * @return profiledFargateUsage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROFILED_FARGATE_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getProfiledFargateUsage() {
    return profiledFargateUsage;
  }

  public void setProfiledFargateUsage(Double profiledFargateUsage) {
    this.profiledFargateUsage = profiledFargateUsage;
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

  public MonthlyUsageAttributionValues sdsScannedBytesPercentage(Double sdsScannedBytesPercentage) {
    this.sdsScannedBytesPercentage = sdsScannedBytesPercentage;
    return this;
  }

  /**
   * The percentage of Sensitive Data Scanner usage by tag(s).
   *
   * @return sdsScannedBytesPercentage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SDS_SCANNED_BYTES_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getSdsScannedBytesPercentage() {
    return sdsScannedBytesPercentage;
  }

  public void setSdsScannedBytesPercentage(Double sdsScannedBytesPercentage) {
    this.sdsScannedBytesPercentage = sdsScannedBytesPercentage;
  }

  public MonthlyUsageAttributionValues sdsScannedBytesUsage(Double sdsScannedBytesUsage) {
    this.sdsScannedBytesUsage = sdsScannedBytesUsage;
    return this;
  }

  /**
   * The total Sensitive Data Scanner usage by tag(s).
   *
   * @return sdsScannedBytesUsage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SDS_SCANNED_BYTES_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getSdsScannedBytesUsage() {
    return sdsScannedBytesUsage;
  }

  public void setSdsScannedBytesUsage(Double sdsScannedBytesUsage) {
    this.sdsScannedBytesUsage = sdsScannedBytesUsage;
  }

  public MonthlyUsageAttributionValues serverlessAppsPercentage(Double serverlessAppsPercentage) {
    this.serverlessAppsPercentage = serverlessAppsPercentage;
    return this;
  }

  /**
   * The percentage of Serverless Apps usage by tag(s).
   *
   * @return serverlessAppsPercentage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVERLESS_APPS_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getServerlessAppsPercentage() {
    return serverlessAppsPercentage;
  }

  public void setServerlessAppsPercentage(Double serverlessAppsPercentage) {
    this.serverlessAppsPercentage = serverlessAppsPercentage;
  }

  public MonthlyUsageAttributionValues serverlessAppsUsage(Double serverlessAppsUsage) {
    this.serverlessAppsUsage = serverlessAppsUsage;
    return this;
  }

  /**
   * The total Serverless Apps usage by tag(s).
   *
   * @return serverlessAppsUsage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVERLESS_APPS_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getServerlessAppsUsage() {
    return serverlessAppsUsage;
  }

  public void setServerlessAppsUsage(Double serverlessAppsUsage) {
    this.serverlessAppsUsage = serverlessAppsUsage;
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

  public MonthlyUsageAttributionValues universalServiceMonitoringPercentage(
      Double universalServiceMonitoringPercentage) {
    this.universalServiceMonitoringPercentage = universalServiceMonitoringPercentage;
    return this;
  }

  /**
   * The percentage of universal service monitoring usage by tag(s).
   *
   * @return universalServiceMonitoringPercentage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UNIVERSAL_SERVICE_MONITORING_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getUniversalServiceMonitoringPercentage() {
    return universalServiceMonitoringPercentage;
  }

  public void setUniversalServiceMonitoringPercentage(Double universalServiceMonitoringPercentage) {
    this.universalServiceMonitoringPercentage = universalServiceMonitoringPercentage;
  }

  public MonthlyUsageAttributionValues universalServiceMonitoringUsage(
      Double universalServiceMonitoringUsage) {
    this.universalServiceMonitoringUsage = universalServiceMonitoringUsage;
    return this;
  }

  /**
   * The universal service monitoring usage by tag(s).
   *
   * @return universalServiceMonitoringUsage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UNIVERSAL_SERVICE_MONITORING_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getUniversalServiceMonitoringUsage() {
    return universalServiceMonitoringUsage;
  }

  public void setUniversalServiceMonitoringUsage(Double universalServiceMonitoringUsage) {
    this.universalServiceMonitoringUsage = universalServiceMonitoringUsage;
  }

  public MonthlyUsageAttributionValues vulnManagementHostsPercentage(
      Double vulnManagementHostsPercentage) {
    this.vulnManagementHostsPercentage = vulnManagementHostsPercentage;
    return this;
  }

  /**
   * The percentage of Application Vulnerability Management usage by tag(s).
   *
   * @return vulnManagementHostsPercentage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VULN_MANAGEMENT_HOSTS_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getVulnManagementHostsPercentage() {
    return vulnManagementHostsPercentage;
  }

  public void setVulnManagementHostsPercentage(Double vulnManagementHostsPercentage) {
    this.vulnManagementHostsPercentage = vulnManagementHostsPercentage;
  }

  public MonthlyUsageAttributionValues vulnManagementHostsUsage(Double vulnManagementHostsUsage) {
    this.vulnManagementHostsUsage = vulnManagementHostsUsage;
    return this;
  }

  /**
   * The Application Vulnerability Management usage by tag(s).
   *
   * @return vulnManagementHostsUsage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VULN_MANAGEMENT_HOSTS_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getVulnManagementHostsUsage() {
    return vulnManagementHostsUsage;
  }

  public void setVulnManagementHostsUsage(Double vulnManagementHostsUsage) {
    this.vulnManagementHostsUsage = vulnManagementHostsUsage;
  }

  /**
   * A container for additional, undeclared properties. This is a holder for any undeclared
   * properties as specified with the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value. If the property
   * does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return MonthlyUsageAttributionValues
   */
  @JsonAnySetter
  public MonthlyUsageAttributionValues putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
      this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return The additional properties
   */
  @JsonAnyGetter
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key The arbitrary key to get
   * @return The specific additional property for the given key
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
      return null;
    }
    return this.additionalProperties.get(key);
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
        && Objects.equals(this.apmUsmPercentage, monthlyUsageAttributionValues.apmUsmPercentage)
        && Objects.equals(this.apmUsmUsage, monthlyUsageAttributionValues.apmUsmUsage)
        && Objects.equals(
            this.appsecFargatePercentage, monthlyUsageAttributionValues.appsecFargatePercentage)
        && Objects.equals(this.appsecFargateUsage, monthlyUsageAttributionValues.appsecFargateUsage)
        && Objects.equals(this.appsecPercentage, monthlyUsageAttributionValues.appsecPercentage)
        && Objects.equals(this.appsecUsage, monthlyUsageAttributionValues.appsecUsage)
        && Objects.equals(this.browserPercentage, monthlyUsageAttributionValues.browserPercentage)
        && Objects.equals(this.browserUsage, monthlyUsageAttributionValues.browserUsage)
        && Objects.equals(
            this.ciVisibilityItrPercentage, monthlyUsageAttributionValues.ciVisibilityItrPercentage)
        && Objects.equals(
            this.ciVisibilityItrUsage, monthlyUsageAttributionValues.ciVisibilityItrUsage)
        && Objects.equals(
            this.cloudSiemPercentage, monthlyUsageAttributionValues.cloudSiemPercentage)
        && Objects.equals(this.cloudSiemUsage, monthlyUsageAttributionValues.cloudSiemUsage)
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
        && Objects.equals(
            this.mobileAppTestingPercentage,
            monthlyUsageAttributionValues.mobileAppTestingPercentage)
        && Objects.equals(
            this.mobileAppTestingUsage, monthlyUsageAttributionValues.mobileAppTestingUsage)
        && Objects.equals(
            this.ndmNetflowPercentage, monthlyUsageAttributionValues.ndmNetflowPercentage)
        && Objects.equals(this.ndmNetflowUsage, monthlyUsageAttributionValues.ndmNetflowUsage)
        && Objects.equals(this.npmHostPercentage, monthlyUsageAttributionValues.npmHostPercentage)
        && Objects.equals(this.npmHostUsage, monthlyUsageAttributionValues.npmHostUsage)
        && Objects.equals(
            this.obsPipelineBytesPercentage,
            monthlyUsageAttributionValues.obsPipelineBytesPercentage)
        && Objects.equals(
            this.obsPipelineBytesUsage, monthlyUsageAttributionValues.obsPipelineBytesUsage)
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
        && Objects.equals(
            this.sdsScannedBytesPercentage, monthlyUsageAttributionValues.sdsScannedBytesPercentage)
        && Objects.equals(
            this.sdsScannedBytesUsage, monthlyUsageAttributionValues.sdsScannedBytesUsage)
        && Objects.equals(
            this.serverlessAppsPercentage, monthlyUsageAttributionValues.serverlessAppsPercentage)
        && Objects.equals(
            this.serverlessAppsUsage, monthlyUsageAttributionValues.serverlessAppsUsage)
        && Objects.equals(this.snmpPercentage, monthlyUsageAttributionValues.snmpPercentage)
        && Objects.equals(this.snmpUsage, monthlyUsageAttributionValues.snmpUsage)
        && Objects.equals(
            this.universalServiceMonitoringPercentage,
            monthlyUsageAttributionValues.universalServiceMonitoringPercentage)
        && Objects.equals(
            this.universalServiceMonitoringUsage,
            monthlyUsageAttributionValues.universalServiceMonitoringUsage)
        && Objects.equals(
            this.vulnManagementHostsPercentage,
            monthlyUsageAttributionValues.vulnManagementHostsPercentage)
        && Objects.equals(
            this.vulnManagementHostsUsage, monthlyUsageAttributionValues.vulnManagementHostsUsage)
        && Objects.equals(
            this.additionalProperties, monthlyUsageAttributionValues.additionalProperties);
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
        apmUsmPercentage,
        apmUsmUsage,
        appsecFargatePercentage,
        appsecFargateUsage,
        appsecPercentage,
        appsecUsage,
        browserPercentage,
        browserUsage,
        ciVisibilityItrPercentage,
        ciVisibilityItrUsage,
        cloudSiemPercentage,
        cloudSiemUsage,
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
        mobileAppTestingPercentage,
        mobileAppTestingUsage,
        ndmNetflowPercentage,
        ndmNetflowUsage,
        npmHostPercentage,
        npmHostUsage,
        obsPipelineBytesPercentage,
        obsPipelineBytesUsage,
        profiledContainerPercentage,
        profiledContainerUsage,
        profiledFargatePercentage,
        profiledFargateUsage,
        profiledHostPercentage,
        profiledHostUsage,
        sdsScannedBytesPercentage,
        sdsScannedBytesUsage,
        serverlessAppsPercentage,
        serverlessAppsUsage,
        snmpPercentage,
        snmpUsage,
        universalServiceMonitoringPercentage,
        universalServiceMonitoringUsage,
        vulnManagementHostsPercentage,
        vulnManagementHostsUsage,
        additionalProperties);
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
    sb.append("    apmUsmPercentage: ").append(toIndentedString(apmUsmPercentage)).append("\n");
    sb.append("    apmUsmUsage: ").append(toIndentedString(apmUsmUsage)).append("\n");
    sb.append("    appsecFargatePercentage: ")
        .append(toIndentedString(appsecFargatePercentage))
        .append("\n");
    sb.append("    appsecFargateUsage: ").append(toIndentedString(appsecFargateUsage)).append("\n");
    sb.append("    appsecPercentage: ").append(toIndentedString(appsecPercentage)).append("\n");
    sb.append("    appsecUsage: ").append(toIndentedString(appsecUsage)).append("\n");
    sb.append("    browserPercentage: ").append(toIndentedString(browserPercentage)).append("\n");
    sb.append("    browserUsage: ").append(toIndentedString(browserUsage)).append("\n");
    sb.append("    ciVisibilityItrPercentage: ")
        .append(toIndentedString(ciVisibilityItrPercentage))
        .append("\n");
    sb.append("    ciVisibilityItrUsage: ")
        .append(toIndentedString(ciVisibilityItrUsage))
        .append("\n");
    sb.append("    cloudSiemPercentage: ")
        .append(toIndentedString(cloudSiemPercentage))
        .append("\n");
    sb.append("    cloudSiemUsage: ").append(toIndentedString(cloudSiemUsage)).append("\n");
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
    sb.append("    mobileAppTestingPercentage: ")
        .append(toIndentedString(mobileAppTestingPercentage))
        .append("\n");
    sb.append("    mobileAppTestingUsage: ")
        .append(toIndentedString(mobileAppTestingUsage))
        .append("\n");
    sb.append("    ndmNetflowPercentage: ")
        .append(toIndentedString(ndmNetflowPercentage))
        .append("\n");
    sb.append("    ndmNetflowUsage: ").append(toIndentedString(ndmNetflowUsage)).append("\n");
    sb.append("    npmHostPercentage: ").append(toIndentedString(npmHostPercentage)).append("\n");
    sb.append("    npmHostUsage: ").append(toIndentedString(npmHostUsage)).append("\n");
    sb.append("    obsPipelineBytesPercentage: ")
        .append(toIndentedString(obsPipelineBytesPercentage))
        .append("\n");
    sb.append("    obsPipelineBytesUsage: ")
        .append(toIndentedString(obsPipelineBytesUsage))
        .append("\n");
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
    sb.append("    sdsScannedBytesPercentage: ")
        .append(toIndentedString(sdsScannedBytesPercentage))
        .append("\n");
    sb.append("    sdsScannedBytesUsage: ")
        .append(toIndentedString(sdsScannedBytesUsage))
        .append("\n");
    sb.append("    serverlessAppsPercentage: ")
        .append(toIndentedString(serverlessAppsPercentage))
        .append("\n");
    sb.append("    serverlessAppsUsage: ")
        .append(toIndentedString(serverlessAppsUsage))
        .append("\n");
    sb.append("    snmpPercentage: ").append(toIndentedString(snmpPercentage)).append("\n");
    sb.append("    snmpUsage: ").append(toIndentedString(snmpUsage)).append("\n");
    sb.append("    universalServiceMonitoringPercentage: ")
        .append(toIndentedString(universalServiceMonitoringPercentage))
        .append("\n");
    sb.append("    universalServiceMonitoringUsage: ")
        .append(toIndentedString(universalServiceMonitoringUsage))
        .append("\n");
    sb.append("    vulnManagementHostsPercentage: ")
        .append(toIndentedString(vulnManagementHostsPercentage))
        .append("\n");
    sb.append("    vulnManagementHostsUsage: ")
        .append(toIndentedString(vulnManagementHostsUsage))
        .append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
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
