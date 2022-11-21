/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.datadog.api.client.JsonTimeSerializer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Response with hourly report of all data billed by Datadog all organizations. */
@JsonPropertyOrder({
  UsageSummaryDate.JSON_PROPERTY_AGENT_HOST_TOP99P,
  UsageSummaryDate.JSON_PROPERTY_APM_AZURE_APP_SERVICE_HOST_TOP99P,
  UsageSummaryDate.JSON_PROPERTY_APM_FARGATE_COUNT_AVG,
  UsageSummaryDate.JSON_PROPERTY_APM_HOST_TOP99P,
  UsageSummaryDate.JSON_PROPERTY_APPSEC_FARGATE_COUNT_AVG,
  UsageSummaryDate.JSON_PROPERTY_AUDIT_LOGS_LINES_INDEXED_SUM,
  UsageSummaryDate.JSON_PROPERTY_AVG_PROFILED_FARGATE_TASKS,
  UsageSummaryDate.JSON_PROPERTY_AWS_HOST_TOP99P,
  UsageSummaryDate.JSON_PROPERTY_AWS_LAMBDA_FUNC_COUNT,
  UsageSummaryDate.JSON_PROPERTY_AWS_LAMBDA_INVOCATIONS_SUM,
  UsageSummaryDate.JSON_PROPERTY_AZURE_APP_SERVICE_TOP99P,
  UsageSummaryDate.JSON_PROPERTY_BILLABLE_INGESTED_BYTES_SUM,
  UsageSummaryDate.JSON_PROPERTY_BROWSER_RUM_LITE_SESSION_COUNT_SUM,
  UsageSummaryDate.JSON_PROPERTY_BROWSER_RUM_REPLAY_SESSION_COUNT_SUM,
  UsageSummaryDate.JSON_PROPERTY_BROWSER_RUM_UNITS_SUM,
  UsageSummaryDate.JSON_PROPERTY_CI_PIPELINE_INDEXED_SPANS_SUM,
  UsageSummaryDate.JSON_PROPERTY_CI_TEST_INDEXED_SPANS_SUM,
  UsageSummaryDate.JSON_PROPERTY_CI_VISIBILITY_PIPELINE_COMMITTERS_HWM,
  UsageSummaryDate.JSON_PROPERTY_CI_VISIBILITY_TEST_COMMITTERS_HWM,
  UsageSummaryDate.JSON_PROPERTY_CONTAINER_AVG,
  UsageSummaryDate.JSON_PROPERTY_CONTAINER_HWM,
  UsageSummaryDate.JSON_PROPERTY_CSPM_AAS_HOST_TOP99P,
  UsageSummaryDate.JSON_PROPERTY_CSPM_AWS_HOST_TOP99P,
  UsageSummaryDate.JSON_PROPERTY_CSPM_AZURE_HOST_TOP99P,
  UsageSummaryDate.JSON_PROPERTY_CSPM_CONTAINER_AVG,
  UsageSummaryDate.JSON_PROPERTY_CSPM_CONTAINER_HWM,
  UsageSummaryDate.JSON_PROPERTY_CSPM_GCP_HOST_TOP99P,
  UsageSummaryDate.JSON_PROPERTY_CSPM_HOST_TOP99P,
  UsageSummaryDate.JSON_PROPERTY_CUSTOM_TS_AVG,
  UsageSummaryDate.JSON_PROPERTY_CWS_CONTAINER_COUNT_AVG,
  UsageSummaryDate.JSON_PROPERTY_CWS_HOST_TOP99P,
  UsageSummaryDate.JSON_PROPERTY_DATE,
  UsageSummaryDate.JSON_PROPERTY_DBM_HOST_TOP99P,
  UsageSummaryDate.JSON_PROPERTY_DBM_QUERIES_COUNT_AVG,
  UsageSummaryDate.JSON_PROPERTY_FARGATE_TASKS_COUNT_AVG,
  UsageSummaryDate.JSON_PROPERTY_FARGATE_TASKS_COUNT_HWM,
  UsageSummaryDate.JSON_PROPERTY_GCP_HOST_TOP99P,
  UsageSummaryDate.JSON_PROPERTY_HEROKU_HOST_TOP99P,
  UsageSummaryDate.JSON_PROPERTY_INCIDENT_MANAGEMENT_MONTHLY_ACTIVE_USERS_HWM,
  UsageSummaryDate.JSON_PROPERTY_INDEXED_EVENTS_COUNT_SUM,
  UsageSummaryDate.JSON_PROPERTY_INFRA_HOST_TOP99P,
  UsageSummaryDate.JSON_PROPERTY_INGESTED_EVENTS_BYTES_SUM,
  UsageSummaryDate.JSON_PROPERTY_IOT_DEVICE_SUM,
  UsageSummaryDate.JSON_PROPERTY_IOT_DEVICE_TOP99P,
  UsageSummaryDate.JSON_PROPERTY_MOBILE_RUM_LITE_SESSION_COUNT_SUM,
  UsageSummaryDate.JSON_PROPERTY_MOBILE_RUM_SESSION_COUNT_ANDROID_SUM,
  UsageSummaryDate.JSON_PROPERTY_MOBILE_RUM_SESSION_COUNT_IOS_SUM,
  UsageSummaryDate.JSON_PROPERTY_MOBILE_RUM_SESSION_COUNT_REACTNATIVE_SUM,
  UsageSummaryDate.JSON_PROPERTY_MOBILE_RUM_SESSION_COUNT_SUM,
  UsageSummaryDate.JSON_PROPERTY_MOBILE_RUM_UNITS_SUM,
  UsageSummaryDate.JSON_PROPERTY_NETFLOW_INDEXED_EVENTS_COUNT_SUM,
  UsageSummaryDate.JSON_PROPERTY_NPM_HOST_TOP99P,
  UsageSummaryDate.JSON_PROPERTY_OBSERVABILITY_PIPELINES_BYTES_PROCESSED_SUM,
  UsageSummaryDate.JSON_PROPERTY_ONLINE_ARCHIVE_EVENTS_COUNT_SUM,
  UsageSummaryDate.JSON_PROPERTY_OPENTELEMETRY_APM_HOST_TOP99P,
  UsageSummaryDate.JSON_PROPERTY_OPENTELEMETRY_HOST_TOP99P,
  UsageSummaryDate.JSON_PROPERTY_ORGS,
  UsageSummaryDate.JSON_PROPERTY_PROFILING_HOST_TOP99P,
  UsageSummaryDate.JSON_PROPERTY_RUM_BROWSER_AND_MOBILE_SESSION_COUNT,
  UsageSummaryDate.JSON_PROPERTY_RUM_SESSION_COUNT_SUM,
  UsageSummaryDate.JSON_PROPERTY_RUM_TOTAL_SESSION_COUNT_SUM,
  UsageSummaryDate.JSON_PROPERTY_RUM_UNITS_SUM,
  UsageSummaryDate.JSON_PROPERTY_SDS_APM_SCANNED_BYTES_SUM,
  UsageSummaryDate.JSON_PROPERTY_SDS_EVENTS_SCANNED_BYTES_SUM,
  UsageSummaryDate.JSON_PROPERTY_SDS_LOGS_SCANNED_BYTES_SUM,
  UsageSummaryDate.JSON_PROPERTY_SDS_RUM_SCANNED_BYTES_SUM,
  UsageSummaryDate.JSON_PROPERTY_SDS_TOTAL_SCANNED_BYTES_SUM,
  UsageSummaryDate.JSON_PROPERTY_SYNTHETICS_BROWSER_CHECK_CALLS_COUNT_SUM,
  UsageSummaryDate.JSON_PROPERTY_SYNTHETICS_CHECK_CALLS_COUNT_SUM,
  UsageSummaryDate.JSON_PROPERTY_TRACE_SEARCH_INDEXED_EVENTS_COUNT_SUM,
  UsageSummaryDate.JSON_PROPERTY_TWOL_INGESTED_EVENTS_BYTES_SUM,
  UsageSummaryDate.JSON_PROPERTY_VSPHERE_HOST_TOP99P
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class UsageSummaryDate {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AGENT_HOST_TOP99P = "agent_host_top99p";
  private Long agentHostTop99p;

  public static final String JSON_PROPERTY_APM_AZURE_APP_SERVICE_HOST_TOP99P =
      "apm_azure_app_service_host_top99p";
  private Long apmAzureAppServiceHostTop99p;

  public static final String JSON_PROPERTY_APM_FARGATE_COUNT_AVG = "apm_fargate_count_avg";
  private Long apmFargateCountAvg;

  public static final String JSON_PROPERTY_APM_HOST_TOP99P = "apm_host_top99p";
  private Long apmHostTop99p;

  public static final String JSON_PROPERTY_APPSEC_FARGATE_COUNT_AVG = "appsec_fargate_count_avg";
  private Long appsecFargateCountAvg;

  public static final String JSON_PROPERTY_AUDIT_LOGS_LINES_INDEXED_SUM =
      "audit_logs_lines_indexed_sum";
  private Long auditLogsLinesIndexedSum;

  public static final String JSON_PROPERTY_AVG_PROFILED_FARGATE_TASKS =
      "avg_profiled_fargate_tasks";
  private Long avgProfiledFargateTasks;

  public static final String JSON_PROPERTY_AWS_HOST_TOP99P = "aws_host_top99p";
  private Long awsHostTop99p;

  public static final String JSON_PROPERTY_AWS_LAMBDA_FUNC_COUNT = "aws_lambda_func_count";
  private Long awsLambdaFuncCount;

  public static final String JSON_PROPERTY_AWS_LAMBDA_INVOCATIONS_SUM =
      "aws_lambda_invocations_sum";
  private Long awsLambdaInvocationsSum;

  public static final String JSON_PROPERTY_AZURE_APP_SERVICE_TOP99P = "azure_app_service_top99p";
  private Long azureAppServiceTop99p;

  public static final String JSON_PROPERTY_BILLABLE_INGESTED_BYTES_SUM =
      "billable_ingested_bytes_sum";
  private Long billableIngestedBytesSum;

  public static final String JSON_PROPERTY_BROWSER_RUM_LITE_SESSION_COUNT_SUM =
      "browser_rum_lite_session_count_sum";
  private Long browserRumLiteSessionCountSum;

  public static final String JSON_PROPERTY_BROWSER_RUM_REPLAY_SESSION_COUNT_SUM =
      "browser_rum_replay_session_count_sum";
  private Long browserRumReplaySessionCountSum;

  public static final String JSON_PROPERTY_BROWSER_RUM_UNITS_SUM = "browser_rum_units_sum";
  private Long browserRumUnitsSum;

  public static final String JSON_PROPERTY_CI_PIPELINE_INDEXED_SPANS_SUM =
      "ci_pipeline_indexed_spans_sum";
  private Long ciPipelineIndexedSpansSum;

  public static final String JSON_PROPERTY_CI_TEST_INDEXED_SPANS_SUM = "ci_test_indexed_spans_sum";
  private Long ciTestIndexedSpansSum;

  public static final String JSON_PROPERTY_CI_VISIBILITY_PIPELINE_COMMITTERS_HWM =
      "ci_visibility_pipeline_committers_hwm";
  private Long ciVisibilityPipelineCommittersHwm;

  public static final String JSON_PROPERTY_CI_VISIBILITY_TEST_COMMITTERS_HWM =
      "ci_visibility_test_committers_hwm";
  private Long ciVisibilityTestCommittersHwm;

  public static final String JSON_PROPERTY_CONTAINER_AVG = "container_avg";
  private Long containerAvg;

  public static final String JSON_PROPERTY_CONTAINER_HWM = "container_hwm";
  private Long containerHwm;

  public static final String JSON_PROPERTY_CSPM_AAS_HOST_TOP99P = "cspm_aas_host_top99p";
  private Long cspmAasHostTop99p;

  public static final String JSON_PROPERTY_CSPM_AWS_HOST_TOP99P = "cspm_aws_host_top99p";
  private Long cspmAwsHostTop99p;

  public static final String JSON_PROPERTY_CSPM_AZURE_HOST_TOP99P = "cspm_azure_host_top99p";
  private Long cspmAzureHostTop99p;

  public static final String JSON_PROPERTY_CSPM_CONTAINER_AVG = "cspm_container_avg";
  private Long cspmContainerAvg;

  public static final String JSON_PROPERTY_CSPM_CONTAINER_HWM = "cspm_container_hwm";
  private Long cspmContainerHwm;

  public static final String JSON_PROPERTY_CSPM_GCP_HOST_TOP99P = "cspm_gcp_host_top99p";
  private Long cspmGcpHostTop99p;

  public static final String JSON_PROPERTY_CSPM_HOST_TOP99P = "cspm_host_top99p";
  private Long cspmHostTop99p;

  public static final String JSON_PROPERTY_CUSTOM_TS_AVG = "custom_ts_avg";
  private Long customTsAvg;

  public static final String JSON_PROPERTY_CWS_CONTAINER_COUNT_AVG = "cws_container_count_avg";
  private Long cwsContainerCountAvg;

  public static final String JSON_PROPERTY_CWS_HOST_TOP99P = "cws_host_top99p";
  private Long cwsHostTop99p;

  public static final String JSON_PROPERTY_DATE = "date";

  @JsonSerialize(using = JsonTimeSerializer.class)
  private OffsetDateTime date;

  public static final String JSON_PROPERTY_DBM_HOST_TOP99P = "dbm_host_top99p";
  private Long dbmHostTop99p;

  public static final String JSON_PROPERTY_DBM_QUERIES_COUNT_AVG = "dbm_queries_count_avg";
  private Long dbmQueriesCountAvg;

  public static final String JSON_PROPERTY_FARGATE_TASKS_COUNT_AVG = "fargate_tasks_count_avg";
  private Long fargateTasksCountAvg;

  public static final String JSON_PROPERTY_FARGATE_TASKS_COUNT_HWM = "fargate_tasks_count_hwm";
  private Long fargateTasksCountHwm;

  public static final String JSON_PROPERTY_GCP_HOST_TOP99P = "gcp_host_top99p";
  private Long gcpHostTop99p;

  public static final String JSON_PROPERTY_HEROKU_HOST_TOP99P = "heroku_host_top99p";
  private Long herokuHostTop99p;

  public static final String JSON_PROPERTY_INCIDENT_MANAGEMENT_MONTHLY_ACTIVE_USERS_HWM =
      "incident_management_monthly_active_users_hwm";
  private Long incidentManagementMonthlyActiveUsersHwm;

  public static final String JSON_PROPERTY_INDEXED_EVENTS_COUNT_SUM = "indexed_events_count_sum";
  private Long indexedEventsCountSum;

  public static final String JSON_PROPERTY_INFRA_HOST_TOP99P = "infra_host_top99p";
  private Long infraHostTop99p;

  public static final String JSON_PROPERTY_INGESTED_EVENTS_BYTES_SUM = "ingested_events_bytes_sum";
  private Long ingestedEventsBytesSum;

  public static final String JSON_PROPERTY_IOT_DEVICE_SUM = "iot_device_sum";
  private Long iotDeviceSum;

  public static final String JSON_PROPERTY_IOT_DEVICE_TOP99P = "iot_device_top99p";
  private Long iotDeviceTop99p;

  public static final String JSON_PROPERTY_MOBILE_RUM_LITE_SESSION_COUNT_SUM =
      "mobile_rum_lite_session_count_sum";
  private Long mobileRumLiteSessionCountSum;

  public static final String JSON_PROPERTY_MOBILE_RUM_SESSION_COUNT_ANDROID_SUM =
      "mobile_rum_session_count_android_sum";
  private Long mobileRumSessionCountAndroidSum;

  public static final String JSON_PROPERTY_MOBILE_RUM_SESSION_COUNT_IOS_SUM =
      "mobile_rum_session_count_ios_sum";
  private Long mobileRumSessionCountIosSum;

  public static final String JSON_PROPERTY_MOBILE_RUM_SESSION_COUNT_REACTNATIVE_SUM =
      "mobile_rum_session_count_reactnative_sum";
  private Long mobileRumSessionCountReactnativeSum;

  public static final String JSON_PROPERTY_MOBILE_RUM_SESSION_COUNT_SUM =
      "mobile_rum_session_count_sum";
  private Long mobileRumSessionCountSum;

  public static final String JSON_PROPERTY_MOBILE_RUM_UNITS_SUM = "mobile_rum_units_sum";
  private Long mobileRumUnitsSum;

  public static final String JSON_PROPERTY_NETFLOW_INDEXED_EVENTS_COUNT_SUM =
      "netflow_indexed_events_count_sum";
  private Long netflowIndexedEventsCountSum;

  public static final String JSON_PROPERTY_NPM_HOST_TOP99P = "npm_host_top99p";
  private Long npmHostTop99p;

  public static final String JSON_PROPERTY_OBSERVABILITY_PIPELINES_BYTES_PROCESSED_SUM =
      "observability_pipelines_bytes_processed_sum";
  private Long observabilityPipelinesBytesProcessedSum;

  public static final String JSON_PROPERTY_ONLINE_ARCHIVE_EVENTS_COUNT_SUM =
      "online_archive_events_count_sum";
  private Long onlineArchiveEventsCountSum;

  public static final String JSON_PROPERTY_OPENTELEMETRY_APM_HOST_TOP99P =
      "opentelemetry_apm_host_top99p";
  private Long opentelemetryApmHostTop99p;

  public static final String JSON_PROPERTY_OPENTELEMETRY_HOST_TOP99P = "opentelemetry_host_top99p";
  private Long opentelemetryHostTop99p;

  public static final String JSON_PROPERTY_ORGS = "orgs";
  private List<UsageSummaryDateOrg> orgs = null;

  public static final String JSON_PROPERTY_PROFILING_HOST_TOP99P = "profiling_host_top99p";
  private Long profilingHostTop99p;

  public static final String JSON_PROPERTY_RUM_BROWSER_AND_MOBILE_SESSION_COUNT =
      "rum_browser_and_mobile_session_count";
  private Long rumBrowserAndMobileSessionCount;

  public static final String JSON_PROPERTY_RUM_SESSION_COUNT_SUM = "rum_session_count_sum";
  private Long rumSessionCountSum;

  public static final String JSON_PROPERTY_RUM_TOTAL_SESSION_COUNT_SUM =
      "rum_total_session_count_sum";
  private Long rumTotalSessionCountSum;

  public static final String JSON_PROPERTY_RUM_UNITS_SUM = "rum_units_sum";
  private Long rumUnitsSum;

  public static final String JSON_PROPERTY_SDS_APM_SCANNED_BYTES_SUM = "sds_apm_scanned_bytes_sum";
  private Long sdsApmScannedBytesSum;

  public static final String JSON_PROPERTY_SDS_EVENTS_SCANNED_BYTES_SUM =
      "sds_events_scanned_bytes_sum";
  private Long sdsEventsScannedBytesSum;

  public static final String JSON_PROPERTY_SDS_LOGS_SCANNED_BYTES_SUM =
      "sds_logs_scanned_bytes_sum";
  private Long sdsLogsScannedBytesSum;

  public static final String JSON_PROPERTY_SDS_RUM_SCANNED_BYTES_SUM = "sds_rum_scanned_bytes_sum";
  private Long sdsRumScannedBytesSum;

  public static final String JSON_PROPERTY_SDS_TOTAL_SCANNED_BYTES_SUM =
      "sds_total_scanned_bytes_sum";
  private Long sdsTotalScannedBytesSum;

  public static final String JSON_PROPERTY_SYNTHETICS_BROWSER_CHECK_CALLS_COUNT_SUM =
      "synthetics_browser_check_calls_count_sum";
  private Long syntheticsBrowserCheckCallsCountSum;

  public static final String JSON_PROPERTY_SYNTHETICS_CHECK_CALLS_COUNT_SUM =
      "synthetics_check_calls_count_sum";
  private Long syntheticsCheckCallsCountSum;

  public static final String JSON_PROPERTY_TRACE_SEARCH_INDEXED_EVENTS_COUNT_SUM =
      "trace_search_indexed_events_count_sum";
  private Long traceSearchIndexedEventsCountSum;

  public static final String JSON_PROPERTY_TWOL_INGESTED_EVENTS_BYTES_SUM =
      "twol_ingested_events_bytes_sum";
  private Long twolIngestedEventsBytesSum;

  public static final String JSON_PROPERTY_VSPHERE_HOST_TOP99P = "vsphere_host_top99p";
  private Long vsphereHostTop99p;

  public UsageSummaryDate agentHostTop99p(Long agentHostTop99p) {
    this.agentHostTop99p = agentHostTop99p;
    return this;
  }

  /**
   * Shows the 99th percentile of all agent hosts over all hours in the current date for all
   * organizations.
   *
   * @return agentHostTop99p
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AGENT_HOST_TOP99P)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getAgentHostTop99p() {
    return agentHostTop99p;
  }

  public void setAgentHostTop99p(Long agentHostTop99p) {
    this.agentHostTop99p = agentHostTop99p;
  }

  public UsageSummaryDate apmAzureAppServiceHostTop99p(Long apmAzureAppServiceHostTop99p) {
    this.apmAzureAppServiceHostTop99p = apmAzureAppServiceHostTop99p;
    return this;
  }

  /**
   * Shows the 99th percentile of all Azure app services using APM over all hours in the current
   * date all organizations.
   *
   * @return apmAzureAppServiceHostTop99p
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APM_AZURE_APP_SERVICE_HOST_TOP99P)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getApmAzureAppServiceHostTop99p() {
    return apmAzureAppServiceHostTop99p;
  }

  public void setApmAzureAppServiceHostTop99p(Long apmAzureAppServiceHostTop99p) {
    this.apmAzureAppServiceHostTop99p = apmAzureAppServiceHostTop99p;
  }

  public UsageSummaryDate apmFargateCountAvg(Long apmFargateCountAvg) {
    this.apmFargateCountAvg = apmFargateCountAvg;
    return this;
  }

  /**
   * Shows the average of all APM ECS Fargate tasks over all hours in the current date for all
   * organizations.
   *
   * @return apmFargateCountAvg
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APM_FARGATE_COUNT_AVG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getApmFargateCountAvg() {
    return apmFargateCountAvg;
  }

  public void setApmFargateCountAvg(Long apmFargateCountAvg) {
    this.apmFargateCountAvg = apmFargateCountAvg;
  }

  public UsageSummaryDate apmHostTop99p(Long apmHostTop99p) {
    this.apmHostTop99p = apmHostTop99p;
    return this;
  }

  /**
   * Shows the 99th percentile of all distinct APM hosts over all hours in the current date for all
   * organizations.
   *
   * @return apmHostTop99p
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APM_HOST_TOP99P)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getApmHostTop99p() {
    return apmHostTop99p;
  }

  public void setApmHostTop99p(Long apmHostTop99p) {
    this.apmHostTop99p = apmHostTop99p;
  }

  public UsageSummaryDate appsecFargateCountAvg(Long appsecFargateCountAvg) {
    this.appsecFargateCountAvg = appsecFargateCountAvg;
    return this;
  }

  /**
   * Shows the average of all Application Security Monitoring ECS Fargate tasks over all hours in
   * the current date for all organizations.
   *
   * @return appsecFargateCountAvg
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APPSEC_FARGATE_COUNT_AVG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getAppsecFargateCountAvg() {
    return appsecFargateCountAvg;
  }

  public void setAppsecFargateCountAvg(Long appsecFargateCountAvg) {
    this.appsecFargateCountAvg = appsecFargateCountAvg;
  }

  public UsageSummaryDate auditLogsLinesIndexedSum(Long auditLogsLinesIndexedSum) {
    this.auditLogsLinesIndexedSum = auditLogsLinesIndexedSum;
    return this;
  }

  /**
   * Shows the sum of audit logs lines indexed over all hours in the current date for all
   * organizations.
   *
   * @return auditLogsLinesIndexedSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUDIT_LOGS_LINES_INDEXED_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getAuditLogsLinesIndexedSum() {
    return auditLogsLinesIndexedSum;
  }

  public void setAuditLogsLinesIndexedSum(Long auditLogsLinesIndexedSum) {
    this.auditLogsLinesIndexedSum = auditLogsLinesIndexedSum;
  }

  public UsageSummaryDate avgProfiledFargateTasks(Long avgProfiledFargateTasks) {
    this.avgProfiledFargateTasks = avgProfiledFargateTasks;
    return this;
  }

  /**
   * The average profiled task count for Fargate Profiling.
   *
   * @return avgProfiledFargateTasks
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AVG_PROFILED_FARGATE_TASKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getAvgProfiledFargateTasks() {
    return avgProfiledFargateTasks;
  }

  public void setAvgProfiledFargateTasks(Long avgProfiledFargateTasks) {
    this.avgProfiledFargateTasks = avgProfiledFargateTasks;
  }

  public UsageSummaryDate awsHostTop99p(Long awsHostTop99p) {
    this.awsHostTop99p = awsHostTop99p;
    return this;
  }

  /**
   * Shows the 99th percentile of all AWS hosts over all hours in the current date for all
   * organizations.
   *
   * @return awsHostTop99p
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AWS_HOST_TOP99P)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getAwsHostTop99p() {
    return awsHostTop99p;
  }

  public void setAwsHostTop99p(Long awsHostTop99p) {
    this.awsHostTop99p = awsHostTop99p;
  }

  public UsageSummaryDate awsLambdaFuncCount(Long awsLambdaFuncCount) {
    this.awsLambdaFuncCount = awsLambdaFuncCount;
    return this;
  }

  /**
   * Shows the average of the number of functions that executed 1 or more times each hour in the
   * current date for all organizations.
   *
   * @return awsLambdaFuncCount
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AWS_LAMBDA_FUNC_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getAwsLambdaFuncCount() {
    return awsLambdaFuncCount;
  }

  public void setAwsLambdaFuncCount(Long awsLambdaFuncCount) {
    this.awsLambdaFuncCount = awsLambdaFuncCount;
  }

  public UsageSummaryDate awsLambdaInvocationsSum(Long awsLambdaInvocationsSum) {
    this.awsLambdaInvocationsSum = awsLambdaInvocationsSum;
    return this;
  }

  /**
   * Shows the sum of all AWS Lambda invocations over all hours in the current date for all
   * organizations.
   *
   * @return awsLambdaInvocationsSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AWS_LAMBDA_INVOCATIONS_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getAwsLambdaInvocationsSum() {
    return awsLambdaInvocationsSum;
  }

  public void setAwsLambdaInvocationsSum(Long awsLambdaInvocationsSum) {
    this.awsLambdaInvocationsSum = awsLambdaInvocationsSum;
  }

  public UsageSummaryDate azureAppServiceTop99p(Long azureAppServiceTop99p) {
    this.azureAppServiceTop99p = azureAppServiceTop99p;
    return this;
  }

  /**
   * Shows the 99th percentile of all Azure app services over all hours in the current date for all
   * organizations.
   *
   * @return azureAppServiceTop99p
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AZURE_APP_SERVICE_TOP99P)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getAzureAppServiceTop99p() {
    return azureAppServiceTop99p;
  }

  public void setAzureAppServiceTop99p(Long azureAppServiceTop99p) {
    this.azureAppServiceTop99p = azureAppServiceTop99p;
  }

  public UsageSummaryDate billableIngestedBytesSum(Long billableIngestedBytesSum) {
    this.billableIngestedBytesSum = billableIngestedBytesSum;
    return this;
  }

  /**
   * Shows the sum of all log bytes ingested over all hours in the current date for all
   * organizations.
   *
   * @return billableIngestedBytesSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BILLABLE_INGESTED_BYTES_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getBillableIngestedBytesSum() {
    return billableIngestedBytesSum;
  }

  public void setBillableIngestedBytesSum(Long billableIngestedBytesSum) {
    this.billableIngestedBytesSum = billableIngestedBytesSum;
  }

  public UsageSummaryDate browserRumLiteSessionCountSum(Long browserRumLiteSessionCountSum) {
    this.browserRumLiteSessionCountSum = browserRumLiteSessionCountSum;
    return this;
  }

  /**
   * Shows the sum of all browser lite sessions over all hours in the current date for all
   * organizations.
   *
   * @return browserRumLiteSessionCountSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BROWSER_RUM_LITE_SESSION_COUNT_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getBrowserRumLiteSessionCountSum() {
    return browserRumLiteSessionCountSum;
  }

  public void setBrowserRumLiteSessionCountSum(Long browserRumLiteSessionCountSum) {
    this.browserRumLiteSessionCountSum = browserRumLiteSessionCountSum;
  }

  public UsageSummaryDate browserRumReplaySessionCountSum(Long browserRumReplaySessionCountSum) {
    this.browserRumReplaySessionCountSum = browserRumReplaySessionCountSum;
    return this;
  }

  /**
   * Shows the sum of all browser replay sessions over all hours in the current date for all
   * organizations.
   *
   * @return browserRumReplaySessionCountSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BROWSER_RUM_REPLAY_SESSION_COUNT_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getBrowserRumReplaySessionCountSum() {
    return browserRumReplaySessionCountSum;
  }

  public void setBrowserRumReplaySessionCountSum(Long browserRumReplaySessionCountSum) {
    this.browserRumReplaySessionCountSum = browserRumReplaySessionCountSum;
  }

  public UsageSummaryDate browserRumUnitsSum(Long browserRumUnitsSum) {
    this.browserRumUnitsSum = browserRumUnitsSum;
    return this;
  }

  /**
   * Shows the sum of all browser RUM units over all hours in the current date for all
   * organizations.
   *
   * @return browserRumUnitsSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BROWSER_RUM_UNITS_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getBrowserRumUnitsSum() {
    return browserRumUnitsSum;
  }

  public void setBrowserRumUnitsSum(Long browserRumUnitsSum) {
    this.browserRumUnitsSum = browserRumUnitsSum;
  }

  public UsageSummaryDate ciPipelineIndexedSpansSum(Long ciPipelineIndexedSpansSum) {
    this.ciPipelineIndexedSpansSum = ciPipelineIndexedSpansSum;
    return this;
  }

  /**
   * Shows the sum of all CI pipeline indexed spans over all hours in the current month for all
   * organizations.
   *
   * @return ciPipelineIndexedSpansSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CI_PIPELINE_INDEXED_SPANS_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCiPipelineIndexedSpansSum() {
    return ciPipelineIndexedSpansSum;
  }

  public void setCiPipelineIndexedSpansSum(Long ciPipelineIndexedSpansSum) {
    this.ciPipelineIndexedSpansSum = ciPipelineIndexedSpansSum;
  }

  public UsageSummaryDate ciTestIndexedSpansSum(Long ciTestIndexedSpansSum) {
    this.ciTestIndexedSpansSum = ciTestIndexedSpansSum;
    return this;
  }

  /**
   * Shows the sum of all CI test indexed spans over all hours in the current month for all
   * organizations.
   *
   * @return ciTestIndexedSpansSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CI_TEST_INDEXED_SPANS_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCiTestIndexedSpansSum() {
    return ciTestIndexedSpansSum;
  }

  public void setCiTestIndexedSpansSum(Long ciTestIndexedSpansSum) {
    this.ciTestIndexedSpansSum = ciTestIndexedSpansSum;
  }

  public UsageSummaryDate ciVisibilityPipelineCommittersHwm(
      Long ciVisibilityPipelineCommittersHwm) {
    this.ciVisibilityPipelineCommittersHwm = ciVisibilityPipelineCommittersHwm;
    return this;
  }

  /**
   * Shows the high-water mark of all CI visibility pipeline committers over all hours in the
   * current month for all organizations.
   *
   * @return ciVisibilityPipelineCommittersHwm
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CI_VISIBILITY_PIPELINE_COMMITTERS_HWM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCiVisibilityPipelineCommittersHwm() {
    return ciVisibilityPipelineCommittersHwm;
  }

  public void setCiVisibilityPipelineCommittersHwm(Long ciVisibilityPipelineCommittersHwm) {
    this.ciVisibilityPipelineCommittersHwm = ciVisibilityPipelineCommittersHwm;
  }

  public UsageSummaryDate ciVisibilityTestCommittersHwm(Long ciVisibilityTestCommittersHwm) {
    this.ciVisibilityTestCommittersHwm = ciVisibilityTestCommittersHwm;
    return this;
  }

  /**
   * Shows the high-water mark of all CI visibility test committers over all hours in the current
   * month for all organizations.
   *
   * @return ciVisibilityTestCommittersHwm
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CI_VISIBILITY_TEST_COMMITTERS_HWM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCiVisibilityTestCommittersHwm() {
    return ciVisibilityTestCommittersHwm;
  }

  public void setCiVisibilityTestCommittersHwm(Long ciVisibilityTestCommittersHwm) {
    this.ciVisibilityTestCommittersHwm = ciVisibilityTestCommittersHwm;
  }

  public UsageSummaryDate containerAvg(Long containerAvg) {
    this.containerAvg = containerAvg;
    return this;
  }

  /**
   * Shows the average of all distinct containers over all hours in the current date for all
   * organizations.
   *
   * @return containerAvg
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTAINER_AVG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getContainerAvg() {
    return containerAvg;
  }

  public void setContainerAvg(Long containerAvg) {
    this.containerAvg = containerAvg;
  }

  public UsageSummaryDate containerHwm(Long containerHwm) {
    this.containerHwm = containerHwm;
    return this;
  }

  /**
   * Shows the high-water mark of all distinct containers over all hours in the current date for all
   * organizations.
   *
   * @return containerHwm
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTAINER_HWM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getContainerHwm() {
    return containerHwm;
  }

  public void setContainerHwm(Long containerHwm) {
    this.containerHwm = containerHwm;
  }

  public UsageSummaryDate cspmAasHostTop99p(Long cspmAasHostTop99p) {
    this.cspmAasHostTop99p = cspmAasHostTop99p;
    return this;
  }

  /**
   * Shows the 99th percentile of all Cloud Security Posture Management Azure app services hosts
   * over all hours in the current date for all organizations.
   *
   * @return cspmAasHostTop99p
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CSPM_AAS_HOST_TOP99P)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCspmAasHostTop99p() {
    return cspmAasHostTop99p;
  }

  public void setCspmAasHostTop99p(Long cspmAasHostTop99p) {
    this.cspmAasHostTop99p = cspmAasHostTop99p;
  }

  public UsageSummaryDate cspmAwsHostTop99p(Long cspmAwsHostTop99p) {
    this.cspmAwsHostTop99p = cspmAwsHostTop99p;
    return this;
  }

  /**
   * Shows the 99th percentile of all Cloud Security Posture Management AWS hosts over all hours in
   * the current date for all organizations.
   *
   * @return cspmAwsHostTop99p
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CSPM_AWS_HOST_TOP99P)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCspmAwsHostTop99p() {
    return cspmAwsHostTop99p;
  }

  public void setCspmAwsHostTop99p(Long cspmAwsHostTop99p) {
    this.cspmAwsHostTop99p = cspmAwsHostTop99p;
  }

  public UsageSummaryDate cspmAzureHostTop99p(Long cspmAzureHostTop99p) {
    this.cspmAzureHostTop99p = cspmAzureHostTop99p;
    return this;
  }

  /**
   * Shows the 99th percentile of all Cloud Security Posture Management Azure hosts over all hours
   * in the current date for all organizations.
   *
   * @return cspmAzureHostTop99p
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CSPM_AZURE_HOST_TOP99P)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCspmAzureHostTop99p() {
    return cspmAzureHostTop99p;
  }

  public void setCspmAzureHostTop99p(Long cspmAzureHostTop99p) {
    this.cspmAzureHostTop99p = cspmAzureHostTop99p;
  }

  public UsageSummaryDate cspmContainerAvg(Long cspmContainerAvg) {
    this.cspmContainerAvg = cspmContainerAvg;
    return this;
  }

  /**
   * Shows the average number of Cloud Security Posture Management containers over all hours in the
   * current date for all organizations.
   *
   * @return cspmContainerAvg
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CSPM_CONTAINER_AVG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCspmContainerAvg() {
    return cspmContainerAvg;
  }

  public void setCspmContainerAvg(Long cspmContainerAvg) {
    this.cspmContainerAvg = cspmContainerAvg;
  }

  public UsageSummaryDate cspmContainerHwm(Long cspmContainerHwm) {
    this.cspmContainerHwm = cspmContainerHwm;
    return this;
  }

  /**
   * Shows the high-water mark of Cloud Security Posture Management containers over all hours in the
   * current date for all organizations.
   *
   * @return cspmContainerHwm
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CSPM_CONTAINER_HWM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCspmContainerHwm() {
    return cspmContainerHwm;
  }

  public void setCspmContainerHwm(Long cspmContainerHwm) {
    this.cspmContainerHwm = cspmContainerHwm;
  }

  public UsageSummaryDate cspmGcpHostTop99p(Long cspmGcpHostTop99p) {
    this.cspmGcpHostTop99p = cspmGcpHostTop99p;
    return this;
  }

  /**
   * Shows the 99th percentile of all Cloud Security Posture Management GCP hosts over all hours in
   * the current date for all organizations.
   *
   * @return cspmGcpHostTop99p
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CSPM_GCP_HOST_TOP99P)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCspmGcpHostTop99p() {
    return cspmGcpHostTop99p;
  }

  public void setCspmGcpHostTop99p(Long cspmGcpHostTop99p) {
    this.cspmGcpHostTop99p = cspmGcpHostTop99p;
  }

  public UsageSummaryDate cspmHostTop99p(Long cspmHostTop99p) {
    this.cspmHostTop99p = cspmHostTop99p;
    return this;
  }

  /**
   * Shows the 99th percentile of all Cloud Security Posture Management hosts over all hours in the
   * current date for all organizations.
   *
   * @return cspmHostTop99p
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CSPM_HOST_TOP99P)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCspmHostTop99p() {
    return cspmHostTop99p;
  }

  public void setCspmHostTop99p(Long cspmHostTop99p) {
    this.cspmHostTop99p = cspmHostTop99p;
  }

  public UsageSummaryDate customTsAvg(Long customTsAvg) {
    this.customTsAvg = customTsAvg;
    return this;
  }

  /**
   * Shows the average number of distinct custom metrics over all hours in the current date for all
   * organizations.
   *
   * @return customTsAvg
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CUSTOM_TS_AVG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCustomTsAvg() {
    return customTsAvg;
  }

  public void setCustomTsAvg(Long customTsAvg) {
    this.customTsAvg = customTsAvg;
  }

  public UsageSummaryDate cwsContainerCountAvg(Long cwsContainerCountAvg) {
    this.cwsContainerCountAvg = cwsContainerCountAvg;
    return this;
  }

  /**
   * Shows the average of all distinct Cloud Workload Security containers over all hours in the
   * current date for all organizations.
   *
   * @return cwsContainerCountAvg
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CWS_CONTAINER_COUNT_AVG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCwsContainerCountAvg() {
    return cwsContainerCountAvg;
  }

  public void setCwsContainerCountAvg(Long cwsContainerCountAvg) {
    this.cwsContainerCountAvg = cwsContainerCountAvg;
  }

  public UsageSummaryDate cwsHostTop99p(Long cwsHostTop99p) {
    this.cwsHostTop99p = cwsHostTop99p;
    return this;
  }

  /**
   * Shows the 99th percentile of all Cloud Workload Security hosts over all hours in the current
   * date for all organizations.
   *
   * @return cwsHostTop99p
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CWS_HOST_TOP99P)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCwsHostTop99p() {
    return cwsHostTop99p;
  }

  public void setCwsHostTop99p(Long cwsHostTop99p) {
    this.cwsHostTop99p = cwsHostTop99p;
  }

  public UsageSummaryDate date(OffsetDateTime date) {
    this.date = date;
    return this;
  }

  /**
   * The date for the usage.
   *
   * @return date
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getDate() {
    return date;
  }

  public void setDate(OffsetDateTime date) {
    this.date = date;
  }

  public UsageSummaryDate dbmHostTop99p(Long dbmHostTop99p) {
    this.dbmHostTop99p = dbmHostTop99p;
    return this;
  }

  /**
   * Shows the 99th percentile of all Database Monitoring hosts over all hours in the current date
   * for all organizations.
   *
   * @return dbmHostTop99p
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DBM_HOST_TOP99P)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getDbmHostTop99p() {
    return dbmHostTop99p;
  }

  public void setDbmHostTop99p(Long dbmHostTop99p) {
    this.dbmHostTop99p = dbmHostTop99p;
  }

  public UsageSummaryDate dbmQueriesCountAvg(Long dbmQueriesCountAvg) {
    this.dbmQueriesCountAvg = dbmQueriesCountAvg;
    return this;
  }

  /**
   * Shows the average of all normalized Database Monitoring queries over all hours in the current
   * date for all organizations.
   *
   * @return dbmQueriesCountAvg
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DBM_QUERIES_COUNT_AVG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getDbmQueriesCountAvg() {
    return dbmQueriesCountAvg;
  }

  public void setDbmQueriesCountAvg(Long dbmQueriesCountAvg) {
    this.dbmQueriesCountAvg = dbmQueriesCountAvg;
  }

  public UsageSummaryDate fargateTasksCountAvg(Long fargateTasksCountAvg) {
    this.fargateTasksCountAvg = fargateTasksCountAvg;
    return this;
  }

  /**
   * Shows the high-watermark of all Fargate tasks over all hours in the current date for all
   * organizations.
   *
   * @return fargateTasksCountAvg
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FARGATE_TASKS_COUNT_AVG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getFargateTasksCountAvg() {
    return fargateTasksCountAvg;
  }

  public void setFargateTasksCountAvg(Long fargateTasksCountAvg) {
    this.fargateTasksCountAvg = fargateTasksCountAvg;
  }

  public UsageSummaryDate fargateTasksCountHwm(Long fargateTasksCountHwm) {
    this.fargateTasksCountHwm = fargateTasksCountHwm;
    return this;
  }

  /**
   * Shows the average of all Fargate tasks over all hours in the current date for all
   * organizations.
   *
   * @return fargateTasksCountHwm
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FARGATE_TASKS_COUNT_HWM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getFargateTasksCountHwm() {
    return fargateTasksCountHwm;
  }

  public void setFargateTasksCountHwm(Long fargateTasksCountHwm) {
    this.fargateTasksCountHwm = fargateTasksCountHwm;
  }

  public UsageSummaryDate gcpHostTop99p(Long gcpHostTop99p) {
    this.gcpHostTop99p = gcpHostTop99p;
    return this;
  }

  /**
   * Shows the 99th percentile of all GCP hosts over all hours in the current date for all
   * organizations.
   *
   * @return gcpHostTop99p
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GCP_HOST_TOP99P)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getGcpHostTop99p() {
    return gcpHostTop99p;
  }

  public void setGcpHostTop99p(Long gcpHostTop99p) {
    this.gcpHostTop99p = gcpHostTop99p;
  }

  public UsageSummaryDate herokuHostTop99p(Long herokuHostTop99p) {
    this.herokuHostTop99p = herokuHostTop99p;
    return this;
  }

  /**
   * Shows the 99th percentile of all Heroku dynos over all hours in the current date for all
   * organizations.
   *
   * @return herokuHostTop99p
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HEROKU_HOST_TOP99P)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getHerokuHostTop99p() {
    return herokuHostTop99p;
  }

  public void setHerokuHostTop99p(Long herokuHostTop99p) {
    this.herokuHostTop99p = herokuHostTop99p;
  }

  public UsageSummaryDate incidentManagementMonthlyActiveUsersHwm(
      Long incidentManagementMonthlyActiveUsersHwm) {
    this.incidentManagementMonthlyActiveUsersHwm = incidentManagementMonthlyActiveUsersHwm;
    return this;
  }

  /**
   * Shows the high-water mark of incident management monthly active users over all hours in the
   * current date for all organizations.
   *
   * @return incidentManagementMonthlyActiveUsersHwm
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INCIDENT_MANAGEMENT_MONTHLY_ACTIVE_USERS_HWM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getIncidentManagementMonthlyActiveUsersHwm() {
    return incidentManagementMonthlyActiveUsersHwm;
  }

  public void setIncidentManagementMonthlyActiveUsersHwm(
      Long incidentManagementMonthlyActiveUsersHwm) {
    this.incidentManagementMonthlyActiveUsersHwm = incidentManagementMonthlyActiveUsersHwm;
  }

  public UsageSummaryDate indexedEventsCountSum(Long indexedEventsCountSum) {
    this.indexedEventsCountSum = indexedEventsCountSum;
    return this;
  }

  /**
   * Shows the sum of all log events indexed over all hours in the current date for all
   * organizations.
   *
   * @return indexedEventsCountSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INDEXED_EVENTS_COUNT_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getIndexedEventsCountSum() {
    return indexedEventsCountSum;
  }

  public void setIndexedEventsCountSum(Long indexedEventsCountSum) {
    this.indexedEventsCountSum = indexedEventsCountSum;
  }

  public UsageSummaryDate infraHostTop99p(Long infraHostTop99p) {
    this.infraHostTop99p = infraHostTop99p;
    return this;
  }

  /**
   * Shows the 99th percentile of all distinct infrastructure hosts over all hours in the current
   * date for all organizations.
   *
   * @return infraHostTop99p
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INFRA_HOST_TOP99P)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getInfraHostTop99p() {
    return infraHostTop99p;
  }

  public void setInfraHostTop99p(Long infraHostTop99p) {
    this.infraHostTop99p = infraHostTop99p;
  }

  public UsageSummaryDate ingestedEventsBytesSum(Long ingestedEventsBytesSum) {
    this.ingestedEventsBytesSum = ingestedEventsBytesSum;
    return this;
  }

  /**
   * Shows the sum of all log bytes ingested over all hours in the current date for all
   * organizations.
   *
   * @return ingestedEventsBytesSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INGESTED_EVENTS_BYTES_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getIngestedEventsBytesSum() {
    return ingestedEventsBytesSum;
  }

  public void setIngestedEventsBytesSum(Long ingestedEventsBytesSum) {
    this.ingestedEventsBytesSum = ingestedEventsBytesSum;
  }

  public UsageSummaryDate iotDeviceSum(Long iotDeviceSum) {
    this.iotDeviceSum = iotDeviceSum;
    return this;
  }

  /**
   * Shows the sum of all IoT devices over all hours in the current date for all organizations.
   *
   * @return iotDeviceSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IOT_DEVICE_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getIotDeviceSum() {
    return iotDeviceSum;
  }

  public void setIotDeviceSum(Long iotDeviceSum) {
    this.iotDeviceSum = iotDeviceSum;
  }

  public UsageSummaryDate iotDeviceTop99p(Long iotDeviceTop99p) {
    this.iotDeviceTop99p = iotDeviceTop99p;
    return this;
  }

  /**
   * Shows the 99th percentile of all IoT devices over all hours in the current date all
   * organizations.
   *
   * @return iotDeviceTop99p
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IOT_DEVICE_TOP99P)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getIotDeviceTop99p() {
    return iotDeviceTop99p;
  }

  public void setIotDeviceTop99p(Long iotDeviceTop99p) {
    this.iotDeviceTop99p = iotDeviceTop99p;
  }

  public UsageSummaryDate mobileRumLiteSessionCountSum(Long mobileRumLiteSessionCountSum) {
    this.mobileRumLiteSessionCountSum = mobileRumLiteSessionCountSum;
    return this;
  }

  /**
   * Shows the sum of all mobile lite sessions over all hours in the current date for all
   * organizations.
   *
   * @return mobileRumLiteSessionCountSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MOBILE_RUM_LITE_SESSION_COUNT_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getMobileRumLiteSessionCountSum() {
    return mobileRumLiteSessionCountSum;
  }

  public void setMobileRumLiteSessionCountSum(Long mobileRumLiteSessionCountSum) {
    this.mobileRumLiteSessionCountSum = mobileRumLiteSessionCountSum;
  }

  public UsageSummaryDate mobileRumSessionCountAndroidSum(Long mobileRumSessionCountAndroidSum) {
    this.mobileRumSessionCountAndroidSum = mobileRumSessionCountAndroidSum;
    return this;
  }

  /**
   * Shows the sum of all mobile RUM Sessions on Android over all hours in the current date for all
   * organizations.
   *
   * @return mobileRumSessionCountAndroidSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MOBILE_RUM_SESSION_COUNT_ANDROID_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getMobileRumSessionCountAndroidSum() {
    return mobileRumSessionCountAndroidSum;
  }

  public void setMobileRumSessionCountAndroidSum(Long mobileRumSessionCountAndroidSum) {
    this.mobileRumSessionCountAndroidSum = mobileRumSessionCountAndroidSum;
  }

  public UsageSummaryDate mobileRumSessionCountIosSum(Long mobileRumSessionCountIosSum) {
    this.mobileRumSessionCountIosSum = mobileRumSessionCountIosSum;
    return this;
  }

  /**
   * Shows the sum of all mobile RUM Sessions on iOS over all hours in the current date for all
   * organizations.
   *
   * @return mobileRumSessionCountIosSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MOBILE_RUM_SESSION_COUNT_IOS_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getMobileRumSessionCountIosSum() {
    return mobileRumSessionCountIosSum;
  }

  public void setMobileRumSessionCountIosSum(Long mobileRumSessionCountIosSum) {
    this.mobileRumSessionCountIosSum = mobileRumSessionCountIosSum;
  }

  public UsageSummaryDate mobileRumSessionCountReactnativeSum(
      Long mobileRumSessionCountReactnativeSum) {
    this.mobileRumSessionCountReactnativeSum = mobileRumSessionCountReactnativeSum;
    return this;
  }

  /**
   * Shows the sum of all mobile RUM Sessions on React Native over all hours in the current date for
   * all organizations.
   *
   * @return mobileRumSessionCountReactnativeSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MOBILE_RUM_SESSION_COUNT_REACTNATIVE_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getMobileRumSessionCountReactnativeSum() {
    return mobileRumSessionCountReactnativeSum;
  }

  public void setMobileRumSessionCountReactnativeSum(Long mobileRumSessionCountReactnativeSum) {
    this.mobileRumSessionCountReactnativeSum = mobileRumSessionCountReactnativeSum;
  }

  public UsageSummaryDate mobileRumSessionCountSum(Long mobileRumSessionCountSum) {
    this.mobileRumSessionCountSum = mobileRumSessionCountSum;
    return this;
  }

  /**
   * Shows the sum of all mobile RUM Sessions over all hours in the current date for all
   * organizations
   *
   * @return mobileRumSessionCountSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MOBILE_RUM_SESSION_COUNT_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getMobileRumSessionCountSum() {
    return mobileRumSessionCountSum;
  }

  public void setMobileRumSessionCountSum(Long mobileRumSessionCountSum) {
    this.mobileRumSessionCountSum = mobileRumSessionCountSum;
  }

  public UsageSummaryDate mobileRumUnitsSum(Long mobileRumUnitsSum) {
    this.mobileRumUnitsSum = mobileRumUnitsSum;
    return this;
  }

  /**
   * Shows the sum of all mobile RUM units over all hours in the current date for all organizations.
   *
   * @return mobileRumUnitsSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MOBILE_RUM_UNITS_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getMobileRumUnitsSum() {
    return mobileRumUnitsSum;
  }

  public void setMobileRumUnitsSum(Long mobileRumUnitsSum) {
    this.mobileRumUnitsSum = mobileRumUnitsSum;
  }

  public UsageSummaryDate netflowIndexedEventsCountSum(Long netflowIndexedEventsCountSum) {
    this.netflowIndexedEventsCountSum = netflowIndexedEventsCountSum;
    return this;
  }

  /**
   * Shows the sum of all Network flows indexed over all hours in the current date for all
   * organizations.
   *
   * @return netflowIndexedEventsCountSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NETFLOW_INDEXED_EVENTS_COUNT_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getNetflowIndexedEventsCountSum() {
    return netflowIndexedEventsCountSum;
  }

  public void setNetflowIndexedEventsCountSum(Long netflowIndexedEventsCountSum) {
    this.netflowIndexedEventsCountSum = netflowIndexedEventsCountSum;
  }

  public UsageSummaryDate npmHostTop99p(Long npmHostTop99p) {
    this.npmHostTop99p = npmHostTop99p;
    return this;
  }

  /**
   * Shows the 99th percentile of all distinct Networks hosts over all hours in the current date for
   * all organizations.
   *
   * @return npmHostTop99p
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NPM_HOST_TOP99P)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getNpmHostTop99p() {
    return npmHostTop99p;
  }

  public void setNpmHostTop99p(Long npmHostTop99p) {
    this.npmHostTop99p = npmHostTop99p;
  }

  public UsageSummaryDate observabilityPipelinesBytesProcessedSum(
      Long observabilityPipelinesBytesProcessedSum) {
    this.observabilityPipelinesBytesProcessedSum = observabilityPipelinesBytesProcessedSum;
    return this;
  }

  /**
   * Sum of all observability pipelines bytes processed over all hours in the current date for the
   * given org.
   *
   * @return observabilityPipelinesBytesProcessedSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OBSERVABILITY_PIPELINES_BYTES_PROCESSED_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getObservabilityPipelinesBytesProcessedSum() {
    return observabilityPipelinesBytesProcessedSum;
  }

  public void setObservabilityPipelinesBytesProcessedSum(
      Long observabilityPipelinesBytesProcessedSum) {
    this.observabilityPipelinesBytesProcessedSum = observabilityPipelinesBytesProcessedSum;
  }

  public UsageSummaryDate onlineArchiveEventsCountSum(Long onlineArchiveEventsCountSum) {
    this.onlineArchiveEventsCountSum = onlineArchiveEventsCountSum;
    return this;
  }

  /**
   * Sum of all online archived events over all hours in the current date for all organizations.
   *
   * @return onlineArchiveEventsCountSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ONLINE_ARCHIVE_EVENTS_COUNT_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getOnlineArchiveEventsCountSum() {
    return onlineArchiveEventsCountSum;
  }

  public void setOnlineArchiveEventsCountSum(Long onlineArchiveEventsCountSum) {
    this.onlineArchiveEventsCountSum = onlineArchiveEventsCountSum;
  }

  public UsageSummaryDate opentelemetryApmHostTop99p(Long opentelemetryApmHostTop99p) {
    this.opentelemetryApmHostTop99p = opentelemetryApmHostTop99p;
    return this;
  }

  /**
   * Shows the 99th percentile of APM hosts reported by the Datadog exporter for the OpenTelemetry
   * Collector over all hours in the current date for all organizations.
   *
   * @return opentelemetryApmHostTop99p
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OPENTELEMETRY_APM_HOST_TOP99P)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getOpentelemetryApmHostTop99p() {
    return opentelemetryApmHostTop99p;
  }

  public void setOpentelemetryApmHostTop99p(Long opentelemetryApmHostTop99p) {
    this.opentelemetryApmHostTop99p = opentelemetryApmHostTop99p;
  }

  public UsageSummaryDate opentelemetryHostTop99p(Long opentelemetryHostTop99p) {
    this.opentelemetryHostTop99p = opentelemetryHostTop99p;
    return this;
  }

  /**
   * Shows the 99th percentile of all hosts reported by the Datadog exporter for the OpenTelemetry
   * Collector over all hours in the current date for all organizations.
   *
   * @return opentelemetryHostTop99p
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OPENTELEMETRY_HOST_TOP99P)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getOpentelemetryHostTop99p() {
    return opentelemetryHostTop99p;
  }

  public void setOpentelemetryHostTop99p(Long opentelemetryHostTop99p) {
    this.opentelemetryHostTop99p = opentelemetryHostTop99p;
  }

  public UsageSummaryDate orgs(List<UsageSummaryDateOrg> orgs) {
    this.orgs = orgs;
    for (UsageSummaryDateOrg item : orgs) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public UsageSummaryDate addOrgsItem(UsageSummaryDateOrg orgsItem) {
    if (this.orgs == null) {
      this.orgs = new ArrayList<>();
    }
    this.orgs.add(orgsItem);
    this.unparsed |= orgsItem.unparsed;
    return this;
  }

  /**
   * Organizations associated with a user.
   *
   * @return orgs
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ORGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<UsageSummaryDateOrg> getOrgs() {
    return orgs;
  }

  public void setOrgs(List<UsageSummaryDateOrg> orgs) {
    this.orgs = orgs;
  }

  public UsageSummaryDate profilingHostTop99p(Long profilingHostTop99p) {
    this.profilingHostTop99p = profilingHostTop99p;
    return this;
  }

  /**
   * Shows the 99th percentile of all profiled hosts over all hours in the current date for all
   * organizations.
   *
   * @return profilingHostTop99p
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROFILING_HOST_TOP99P)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getProfilingHostTop99p() {
    return profilingHostTop99p;
  }

  public void setProfilingHostTop99p(Long profilingHostTop99p) {
    this.profilingHostTop99p = profilingHostTop99p;
  }

  public UsageSummaryDate rumBrowserAndMobileSessionCount(Long rumBrowserAndMobileSessionCount) {
    this.rumBrowserAndMobileSessionCount = rumBrowserAndMobileSessionCount;
    return this;
  }

  /**
   * Shows the sum of all mobile sessions and all browser lite and legacy sessions over all hours in
   * the current month for all organizations.
   *
   * @return rumBrowserAndMobileSessionCount
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RUM_BROWSER_AND_MOBILE_SESSION_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getRumBrowserAndMobileSessionCount() {
    return rumBrowserAndMobileSessionCount;
  }

  public void setRumBrowserAndMobileSessionCount(Long rumBrowserAndMobileSessionCount) {
    this.rumBrowserAndMobileSessionCount = rumBrowserAndMobileSessionCount;
  }

  public UsageSummaryDate rumSessionCountSum(Long rumSessionCountSum) {
    this.rumSessionCountSum = rumSessionCountSum;
    return this;
  }

  /**
   * Shows the sum of all browser RUM Lite Sessions over all hours in the current date for all
   * organizations
   *
   * @return rumSessionCountSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RUM_SESSION_COUNT_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getRumSessionCountSum() {
    return rumSessionCountSum;
  }

  public void setRumSessionCountSum(Long rumSessionCountSum) {
    this.rumSessionCountSum = rumSessionCountSum;
  }

  public UsageSummaryDate rumTotalSessionCountSum(Long rumTotalSessionCountSum) {
    this.rumTotalSessionCountSum = rumTotalSessionCountSum;
    return this;
  }

  /**
   * Shows the sum of RUM Sessions (browser and mobile) over all hours in the current date for all
   * organizations.
   *
   * @return rumTotalSessionCountSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RUM_TOTAL_SESSION_COUNT_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getRumTotalSessionCountSum() {
    return rumTotalSessionCountSum;
  }

  public void setRumTotalSessionCountSum(Long rumTotalSessionCountSum) {
    this.rumTotalSessionCountSum = rumTotalSessionCountSum;
  }

  public UsageSummaryDate rumUnitsSum(Long rumUnitsSum) {
    this.rumUnitsSum = rumUnitsSum;
    return this;
  }

  /**
   * Shows the sum of all browser and mobile RUM units over all hours in the current date for all
   * organizations.
   *
   * @return rumUnitsSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RUM_UNITS_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getRumUnitsSum() {
    return rumUnitsSum;
  }

  public void setRumUnitsSum(Long rumUnitsSum) {
    this.rumUnitsSum = rumUnitsSum;
  }

  public UsageSummaryDate sdsApmScannedBytesSum(Long sdsApmScannedBytesSum) {
    this.sdsApmScannedBytesSum = sdsApmScannedBytesSum;
    return this;
  }

  /**
   * Sum of all APM bytes scanned with sensitive data scanner over all hours in the current date for
   * all organizations.
   *
   * @return sdsApmScannedBytesSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SDS_APM_SCANNED_BYTES_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getSdsApmScannedBytesSum() {
    return sdsApmScannedBytesSum;
  }

  public void setSdsApmScannedBytesSum(Long sdsApmScannedBytesSum) {
    this.sdsApmScannedBytesSum = sdsApmScannedBytesSum;
  }

  public UsageSummaryDate sdsEventsScannedBytesSum(Long sdsEventsScannedBytesSum) {
    this.sdsEventsScannedBytesSum = sdsEventsScannedBytesSum;
    return this;
  }

  /**
   * Sum of all event stream events bytes scanned with sensitive data scanner over all hours in the
   * current date for all organizations.
   *
   * @return sdsEventsScannedBytesSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SDS_EVENTS_SCANNED_BYTES_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getSdsEventsScannedBytesSum() {
    return sdsEventsScannedBytesSum;
  }

  public void setSdsEventsScannedBytesSum(Long sdsEventsScannedBytesSum) {
    this.sdsEventsScannedBytesSum = sdsEventsScannedBytesSum;
  }

  public UsageSummaryDate sdsLogsScannedBytesSum(Long sdsLogsScannedBytesSum) {
    this.sdsLogsScannedBytesSum = sdsLogsScannedBytesSum;
    return this;
  }

  /**
   * Shows the sum of all bytes scanned of logs usage by the Sensitive Data Scanner over all hours
   * in the current month for all organizations.
   *
   * @return sdsLogsScannedBytesSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SDS_LOGS_SCANNED_BYTES_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getSdsLogsScannedBytesSum() {
    return sdsLogsScannedBytesSum;
  }

  public void setSdsLogsScannedBytesSum(Long sdsLogsScannedBytesSum) {
    this.sdsLogsScannedBytesSum = sdsLogsScannedBytesSum;
  }

  public UsageSummaryDate sdsRumScannedBytesSum(Long sdsRumScannedBytesSum) {
    this.sdsRumScannedBytesSum = sdsRumScannedBytesSum;
    return this;
  }

  /**
   * Sum of all RUM bytes scanned with sensitive data scanner over all hours in the current date for
   * all organizations.
   *
   * @return sdsRumScannedBytesSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SDS_RUM_SCANNED_BYTES_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getSdsRumScannedBytesSum() {
    return sdsRumScannedBytesSum;
  }

  public void setSdsRumScannedBytesSum(Long sdsRumScannedBytesSum) {
    this.sdsRumScannedBytesSum = sdsRumScannedBytesSum;
  }

  public UsageSummaryDate sdsTotalScannedBytesSum(Long sdsTotalScannedBytesSum) {
    this.sdsTotalScannedBytesSum = sdsTotalScannedBytesSum;
    return this;
  }

  /**
   * Shows the sum of all bytes scanned across all usage types by the Sensitive Data Scanner over
   * all hours in the current month for all organizations.
   *
   * @return sdsTotalScannedBytesSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SDS_TOTAL_SCANNED_BYTES_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getSdsTotalScannedBytesSum() {
    return sdsTotalScannedBytesSum;
  }

  public void setSdsTotalScannedBytesSum(Long sdsTotalScannedBytesSum) {
    this.sdsTotalScannedBytesSum = sdsTotalScannedBytesSum;
  }

  public UsageSummaryDate syntheticsBrowserCheckCallsCountSum(
      Long syntheticsBrowserCheckCallsCountSum) {
    this.syntheticsBrowserCheckCallsCountSum = syntheticsBrowserCheckCallsCountSum;
    return this;
  }

  /**
   * Shows the sum of all Synthetic browser tests over all hours in the current date for all
   * organizations.
   *
   * @return syntheticsBrowserCheckCallsCountSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SYNTHETICS_BROWSER_CHECK_CALLS_COUNT_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getSyntheticsBrowserCheckCallsCountSum() {
    return syntheticsBrowserCheckCallsCountSum;
  }

  public void setSyntheticsBrowserCheckCallsCountSum(Long syntheticsBrowserCheckCallsCountSum) {
    this.syntheticsBrowserCheckCallsCountSum = syntheticsBrowserCheckCallsCountSum;
  }

  public UsageSummaryDate syntheticsCheckCallsCountSum(Long syntheticsCheckCallsCountSum) {
    this.syntheticsCheckCallsCountSum = syntheticsCheckCallsCountSum;
    return this;
  }

  /**
   * Shows the sum of all Synthetic API tests over all hours in the current date for all
   * organizations.
   *
   * @return syntheticsCheckCallsCountSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SYNTHETICS_CHECK_CALLS_COUNT_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getSyntheticsCheckCallsCountSum() {
    return syntheticsCheckCallsCountSum;
  }

  public void setSyntheticsCheckCallsCountSum(Long syntheticsCheckCallsCountSum) {
    this.syntheticsCheckCallsCountSum = syntheticsCheckCallsCountSum;
  }

  public UsageSummaryDate traceSearchIndexedEventsCountSum(Long traceSearchIndexedEventsCountSum) {
    this.traceSearchIndexedEventsCountSum = traceSearchIndexedEventsCountSum;
    return this;
  }

  /**
   * Shows the sum of all Indexed Spans indexed over all hours in the current date for all
   * organizations.
   *
   * @return traceSearchIndexedEventsCountSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRACE_SEARCH_INDEXED_EVENTS_COUNT_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getTraceSearchIndexedEventsCountSum() {
    return traceSearchIndexedEventsCountSum;
  }

  public void setTraceSearchIndexedEventsCountSum(Long traceSearchIndexedEventsCountSum) {
    this.traceSearchIndexedEventsCountSum = traceSearchIndexedEventsCountSum;
  }

  public UsageSummaryDate twolIngestedEventsBytesSum(Long twolIngestedEventsBytesSum) {
    this.twolIngestedEventsBytesSum = twolIngestedEventsBytesSum;
    return this;
  }

  /**
   * Shows the sum of all ingested APM span bytes over all hours in the current date for all
   * organizations.
   *
   * @return twolIngestedEventsBytesSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TWOL_INGESTED_EVENTS_BYTES_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getTwolIngestedEventsBytesSum() {
    return twolIngestedEventsBytesSum;
  }

  public void setTwolIngestedEventsBytesSum(Long twolIngestedEventsBytesSum) {
    this.twolIngestedEventsBytesSum = twolIngestedEventsBytesSum;
  }

  public UsageSummaryDate vsphereHostTop99p(Long vsphereHostTop99p) {
    this.vsphereHostTop99p = vsphereHostTop99p;
    return this;
  }

  /**
   * Shows the 99th percentile of all vSphere hosts over all hours in the current date for all
   * organizations.
   *
   * @return vsphereHostTop99p
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VSPHERE_HOST_TOP99P)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getVsphereHostTop99p() {
    return vsphereHostTop99p;
  }

  public void setVsphereHostTop99p(Long vsphereHostTop99p) {
    this.vsphereHostTop99p = vsphereHostTop99p;
  }

  /** Return true if this UsageSummaryDate object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsageSummaryDate usageSummaryDate = (UsageSummaryDate) o;
    return Objects.equals(this.agentHostTop99p, usageSummaryDate.agentHostTop99p)
        && Objects.equals(
            this.apmAzureAppServiceHostTop99p, usageSummaryDate.apmAzureAppServiceHostTop99p)
        && Objects.equals(this.apmFargateCountAvg, usageSummaryDate.apmFargateCountAvg)
        && Objects.equals(this.apmHostTop99p, usageSummaryDate.apmHostTop99p)
        && Objects.equals(this.appsecFargateCountAvg, usageSummaryDate.appsecFargateCountAvg)
        && Objects.equals(this.auditLogsLinesIndexedSum, usageSummaryDate.auditLogsLinesIndexedSum)
        && Objects.equals(this.avgProfiledFargateTasks, usageSummaryDate.avgProfiledFargateTasks)
        && Objects.equals(this.awsHostTop99p, usageSummaryDate.awsHostTop99p)
        && Objects.equals(this.awsLambdaFuncCount, usageSummaryDate.awsLambdaFuncCount)
        && Objects.equals(this.awsLambdaInvocationsSum, usageSummaryDate.awsLambdaInvocationsSum)
        && Objects.equals(this.azureAppServiceTop99p, usageSummaryDate.azureAppServiceTop99p)
        && Objects.equals(this.billableIngestedBytesSum, usageSummaryDate.billableIngestedBytesSum)
        && Objects.equals(
            this.browserRumLiteSessionCountSum, usageSummaryDate.browserRumLiteSessionCountSum)
        && Objects.equals(
            this.browserRumReplaySessionCountSum, usageSummaryDate.browserRumReplaySessionCountSum)
        && Objects.equals(this.browserRumUnitsSum, usageSummaryDate.browserRumUnitsSum)
        && Objects.equals(
            this.ciPipelineIndexedSpansSum, usageSummaryDate.ciPipelineIndexedSpansSum)
        && Objects.equals(this.ciTestIndexedSpansSum, usageSummaryDate.ciTestIndexedSpansSum)
        && Objects.equals(
            this.ciVisibilityPipelineCommittersHwm,
            usageSummaryDate.ciVisibilityPipelineCommittersHwm)
        && Objects.equals(
            this.ciVisibilityTestCommittersHwm, usageSummaryDate.ciVisibilityTestCommittersHwm)
        && Objects.equals(this.containerAvg, usageSummaryDate.containerAvg)
        && Objects.equals(this.containerHwm, usageSummaryDate.containerHwm)
        && Objects.equals(this.cspmAasHostTop99p, usageSummaryDate.cspmAasHostTop99p)
        && Objects.equals(this.cspmAwsHostTop99p, usageSummaryDate.cspmAwsHostTop99p)
        && Objects.equals(this.cspmAzureHostTop99p, usageSummaryDate.cspmAzureHostTop99p)
        && Objects.equals(this.cspmContainerAvg, usageSummaryDate.cspmContainerAvg)
        && Objects.equals(this.cspmContainerHwm, usageSummaryDate.cspmContainerHwm)
        && Objects.equals(this.cspmGcpHostTop99p, usageSummaryDate.cspmGcpHostTop99p)
        && Objects.equals(this.cspmHostTop99p, usageSummaryDate.cspmHostTop99p)
        && Objects.equals(this.customTsAvg, usageSummaryDate.customTsAvg)
        && Objects.equals(this.cwsContainerCountAvg, usageSummaryDate.cwsContainerCountAvg)
        && Objects.equals(this.cwsHostTop99p, usageSummaryDate.cwsHostTop99p)
        && Objects.equals(this.date, usageSummaryDate.date)
        && Objects.equals(this.dbmHostTop99p, usageSummaryDate.dbmHostTop99p)
        && Objects.equals(this.dbmQueriesCountAvg, usageSummaryDate.dbmQueriesCountAvg)
        && Objects.equals(this.fargateTasksCountAvg, usageSummaryDate.fargateTasksCountAvg)
        && Objects.equals(this.fargateTasksCountHwm, usageSummaryDate.fargateTasksCountHwm)
        && Objects.equals(this.gcpHostTop99p, usageSummaryDate.gcpHostTop99p)
        && Objects.equals(this.herokuHostTop99p, usageSummaryDate.herokuHostTop99p)
        && Objects.equals(
            this.incidentManagementMonthlyActiveUsersHwm,
            usageSummaryDate.incidentManagementMonthlyActiveUsersHwm)
        && Objects.equals(this.indexedEventsCountSum, usageSummaryDate.indexedEventsCountSum)
        && Objects.equals(this.infraHostTop99p, usageSummaryDate.infraHostTop99p)
        && Objects.equals(this.ingestedEventsBytesSum, usageSummaryDate.ingestedEventsBytesSum)
        && Objects.equals(this.iotDeviceSum, usageSummaryDate.iotDeviceSum)
        && Objects.equals(this.iotDeviceTop99p, usageSummaryDate.iotDeviceTop99p)
        && Objects.equals(
            this.mobileRumLiteSessionCountSum, usageSummaryDate.mobileRumLiteSessionCountSum)
        && Objects.equals(
            this.mobileRumSessionCountAndroidSum, usageSummaryDate.mobileRumSessionCountAndroidSum)
        && Objects.equals(
            this.mobileRumSessionCountIosSum, usageSummaryDate.mobileRumSessionCountIosSum)
        && Objects.equals(
            this.mobileRumSessionCountReactnativeSum,
            usageSummaryDate.mobileRumSessionCountReactnativeSum)
        && Objects.equals(this.mobileRumSessionCountSum, usageSummaryDate.mobileRumSessionCountSum)
        && Objects.equals(this.mobileRumUnitsSum, usageSummaryDate.mobileRumUnitsSum)
        && Objects.equals(
            this.netflowIndexedEventsCountSum, usageSummaryDate.netflowIndexedEventsCountSum)
        && Objects.equals(this.npmHostTop99p, usageSummaryDate.npmHostTop99p)
        && Objects.equals(
            this.observabilityPipelinesBytesProcessedSum,
            usageSummaryDate.observabilityPipelinesBytesProcessedSum)
        && Objects.equals(
            this.onlineArchiveEventsCountSum, usageSummaryDate.onlineArchiveEventsCountSum)
        && Objects.equals(
            this.opentelemetryApmHostTop99p, usageSummaryDate.opentelemetryApmHostTop99p)
        && Objects.equals(this.opentelemetryHostTop99p, usageSummaryDate.opentelemetryHostTop99p)
        && Objects.equals(this.orgs, usageSummaryDate.orgs)
        && Objects.equals(this.profilingHostTop99p, usageSummaryDate.profilingHostTop99p)
        && Objects.equals(
            this.rumBrowserAndMobileSessionCount, usageSummaryDate.rumBrowserAndMobileSessionCount)
        && Objects.equals(this.rumSessionCountSum, usageSummaryDate.rumSessionCountSum)
        && Objects.equals(this.rumTotalSessionCountSum, usageSummaryDate.rumTotalSessionCountSum)
        && Objects.equals(this.rumUnitsSum, usageSummaryDate.rumUnitsSum)
        && Objects.equals(this.sdsApmScannedBytesSum, usageSummaryDate.sdsApmScannedBytesSum)
        && Objects.equals(this.sdsEventsScannedBytesSum, usageSummaryDate.sdsEventsScannedBytesSum)
        && Objects.equals(this.sdsLogsScannedBytesSum, usageSummaryDate.sdsLogsScannedBytesSum)
        && Objects.equals(this.sdsRumScannedBytesSum, usageSummaryDate.sdsRumScannedBytesSum)
        && Objects.equals(this.sdsTotalScannedBytesSum, usageSummaryDate.sdsTotalScannedBytesSum)
        && Objects.equals(
            this.syntheticsBrowserCheckCallsCountSum,
            usageSummaryDate.syntheticsBrowserCheckCallsCountSum)
        && Objects.equals(
            this.syntheticsCheckCallsCountSum, usageSummaryDate.syntheticsCheckCallsCountSum)
        && Objects.equals(
            this.traceSearchIndexedEventsCountSum,
            usageSummaryDate.traceSearchIndexedEventsCountSum)
        && Objects.equals(
            this.twolIngestedEventsBytesSum, usageSummaryDate.twolIngestedEventsBytesSum)
        && Objects.equals(this.vsphereHostTop99p, usageSummaryDate.vsphereHostTop99p);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        agentHostTop99p,
        apmAzureAppServiceHostTop99p,
        apmFargateCountAvg,
        apmHostTop99p,
        appsecFargateCountAvg,
        auditLogsLinesIndexedSum,
        avgProfiledFargateTasks,
        awsHostTop99p,
        awsLambdaFuncCount,
        awsLambdaInvocationsSum,
        azureAppServiceTop99p,
        billableIngestedBytesSum,
        browserRumLiteSessionCountSum,
        browserRumReplaySessionCountSum,
        browserRumUnitsSum,
        ciPipelineIndexedSpansSum,
        ciTestIndexedSpansSum,
        ciVisibilityPipelineCommittersHwm,
        ciVisibilityTestCommittersHwm,
        containerAvg,
        containerHwm,
        cspmAasHostTop99p,
        cspmAwsHostTop99p,
        cspmAzureHostTop99p,
        cspmContainerAvg,
        cspmContainerHwm,
        cspmGcpHostTop99p,
        cspmHostTop99p,
        customTsAvg,
        cwsContainerCountAvg,
        cwsHostTop99p,
        date,
        dbmHostTop99p,
        dbmQueriesCountAvg,
        fargateTasksCountAvg,
        fargateTasksCountHwm,
        gcpHostTop99p,
        herokuHostTop99p,
        incidentManagementMonthlyActiveUsersHwm,
        indexedEventsCountSum,
        infraHostTop99p,
        ingestedEventsBytesSum,
        iotDeviceSum,
        iotDeviceTop99p,
        mobileRumLiteSessionCountSum,
        mobileRumSessionCountAndroidSum,
        mobileRumSessionCountIosSum,
        mobileRumSessionCountReactnativeSum,
        mobileRumSessionCountSum,
        mobileRumUnitsSum,
        netflowIndexedEventsCountSum,
        npmHostTop99p,
        observabilityPipelinesBytesProcessedSum,
        onlineArchiveEventsCountSum,
        opentelemetryApmHostTop99p,
        opentelemetryHostTop99p,
        orgs,
        profilingHostTop99p,
        rumBrowserAndMobileSessionCount,
        rumSessionCountSum,
        rumTotalSessionCountSum,
        rumUnitsSum,
        sdsApmScannedBytesSum,
        sdsEventsScannedBytesSum,
        sdsLogsScannedBytesSum,
        sdsRumScannedBytesSum,
        sdsTotalScannedBytesSum,
        syntheticsBrowserCheckCallsCountSum,
        syntheticsCheckCallsCountSum,
        traceSearchIndexedEventsCountSum,
        twolIngestedEventsBytesSum,
        vsphereHostTop99p);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageSummaryDate {\n");
    sb.append("    agentHostTop99p: ").append(toIndentedString(agentHostTop99p)).append("\n");
    sb.append("    apmAzureAppServiceHostTop99p: ")
        .append(toIndentedString(apmAzureAppServiceHostTop99p))
        .append("\n");
    sb.append("    apmFargateCountAvg: ").append(toIndentedString(apmFargateCountAvg)).append("\n");
    sb.append("    apmHostTop99p: ").append(toIndentedString(apmHostTop99p)).append("\n");
    sb.append("    appsecFargateCountAvg: ")
        .append(toIndentedString(appsecFargateCountAvg))
        .append("\n");
    sb.append("    auditLogsLinesIndexedSum: ")
        .append(toIndentedString(auditLogsLinesIndexedSum))
        .append("\n");
    sb.append("    avgProfiledFargateTasks: ")
        .append(toIndentedString(avgProfiledFargateTasks))
        .append("\n");
    sb.append("    awsHostTop99p: ").append(toIndentedString(awsHostTop99p)).append("\n");
    sb.append("    awsLambdaFuncCount: ").append(toIndentedString(awsLambdaFuncCount)).append("\n");
    sb.append("    awsLambdaInvocationsSum: ")
        .append(toIndentedString(awsLambdaInvocationsSum))
        .append("\n");
    sb.append("    azureAppServiceTop99p: ")
        .append(toIndentedString(azureAppServiceTop99p))
        .append("\n");
    sb.append("    billableIngestedBytesSum: ")
        .append(toIndentedString(billableIngestedBytesSum))
        .append("\n");
    sb.append("    browserRumLiteSessionCountSum: ")
        .append(toIndentedString(browserRumLiteSessionCountSum))
        .append("\n");
    sb.append("    browserRumReplaySessionCountSum: ")
        .append(toIndentedString(browserRumReplaySessionCountSum))
        .append("\n");
    sb.append("    browserRumUnitsSum: ").append(toIndentedString(browserRumUnitsSum)).append("\n");
    sb.append("    ciPipelineIndexedSpansSum: ")
        .append(toIndentedString(ciPipelineIndexedSpansSum))
        .append("\n");
    sb.append("    ciTestIndexedSpansSum: ")
        .append(toIndentedString(ciTestIndexedSpansSum))
        .append("\n");
    sb.append("    ciVisibilityPipelineCommittersHwm: ")
        .append(toIndentedString(ciVisibilityPipelineCommittersHwm))
        .append("\n");
    sb.append("    ciVisibilityTestCommittersHwm: ")
        .append(toIndentedString(ciVisibilityTestCommittersHwm))
        .append("\n");
    sb.append("    containerAvg: ").append(toIndentedString(containerAvg)).append("\n");
    sb.append("    containerHwm: ").append(toIndentedString(containerHwm)).append("\n");
    sb.append("    cspmAasHostTop99p: ").append(toIndentedString(cspmAasHostTop99p)).append("\n");
    sb.append("    cspmAwsHostTop99p: ").append(toIndentedString(cspmAwsHostTop99p)).append("\n");
    sb.append("    cspmAzureHostTop99p: ")
        .append(toIndentedString(cspmAzureHostTop99p))
        .append("\n");
    sb.append("    cspmContainerAvg: ").append(toIndentedString(cspmContainerAvg)).append("\n");
    sb.append("    cspmContainerHwm: ").append(toIndentedString(cspmContainerHwm)).append("\n");
    sb.append("    cspmGcpHostTop99p: ").append(toIndentedString(cspmGcpHostTop99p)).append("\n");
    sb.append("    cspmHostTop99p: ").append(toIndentedString(cspmHostTop99p)).append("\n");
    sb.append("    customTsAvg: ").append(toIndentedString(customTsAvg)).append("\n");
    sb.append("    cwsContainerCountAvg: ")
        .append(toIndentedString(cwsContainerCountAvg))
        .append("\n");
    sb.append("    cwsHostTop99p: ").append(toIndentedString(cwsHostTop99p)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    dbmHostTop99p: ").append(toIndentedString(dbmHostTop99p)).append("\n");
    sb.append("    dbmQueriesCountAvg: ").append(toIndentedString(dbmQueriesCountAvg)).append("\n");
    sb.append("    fargateTasksCountAvg: ")
        .append(toIndentedString(fargateTasksCountAvg))
        .append("\n");
    sb.append("    fargateTasksCountHwm: ")
        .append(toIndentedString(fargateTasksCountHwm))
        .append("\n");
    sb.append("    gcpHostTop99p: ").append(toIndentedString(gcpHostTop99p)).append("\n");
    sb.append("    herokuHostTop99p: ").append(toIndentedString(herokuHostTop99p)).append("\n");
    sb.append("    incidentManagementMonthlyActiveUsersHwm: ")
        .append(toIndentedString(incidentManagementMonthlyActiveUsersHwm))
        .append("\n");
    sb.append("    indexedEventsCountSum: ")
        .append(toIndentedString(indexedEventsCountSum))
        .append("\n");
    sb.append("    infraHostTop99p: ").append(toIndentedString(infraHostTop99p)).append("\n");
    sb.append("    ingestedEventsBytesSum: ")
        .append(toIndentedString(ingestedEventsBytesSum))
        .append("\n");
    sb.append("    iotDeviceSum: ").append(toIndentedString(iotDeviceSum)).append("\n");
    sb.append("    iotDeviceTop99p: ").append(toIndentedString(iotDeviceTop99p)).append("\n");
    sb.append("    mobileRumLiteSessionCountSum: ")
        .append(toIndentedString(mobileRumLiteSessionCountSum))
        .append("\n");
    sb.append("    mobileRumSessionCountAndroidSum: ")
        .append(toIndentedString(mobileRumSessionCountAndroidSum))
        .append("\n");
    sb.append("    mobileRumSessionCountIosSum: ")
        .append(toIndentedString(mobileRumSessionCountIosSum))
        .append("\n");
    sb.append("    mobileRumSessionCountReactnativeSum: ")
        .append(toIndentedString(mobileRumSessionCountReactnativeSum))
        .append("\n");
    sb.append("    mobileRumSessionCountSum: ")
        .append(toIndentedString(mobileRumSessionCountSum))
        .append("\n");
    sb.append("    mobileRumUnitsSum: ").append(toIndentedString(mobileRumUnitsSum)).append("\n");
    sb.append("    netflowIndexedEventsCountSum: ")
        .append(toIndentedString(netflowIndexedEventsCountSum))
        .append("\n");
    sb.append("    npmHostTop99p: ").append(toIndentedString(npmHostTop99p)).append("\n");
    sb.append("    observabilityPipelinesBytesProcessedSum: ")
        .append(toIndentedString(observabilityPipelinesBytesProcessedSum))
        .append("\n");
    sb.append("    onlineArchiveEventsCountSum: ")
        .append(toIndentedString(onlineArchiveEventsCountSum))
        .append("\n");
    sb.append("    opentelemetryApmHostTop99p: ")
        .append(toIndentedString(opentelemetryApmHostTop99p))
        .append("\n");
    sb.append("    opentelemetryHostTop99p: ")
        .append(toIndentedString(opentelemetryHostTop99p))
        .append("\n");
    sb.append("    orgs: ").append(toIndentedString(orgs)).append("\n");
    sb.append("    profilingHostTop99p: ")
        .append(toIndentedString(profilingHostTop99p))
        .append("\n");
    sb.append("    rumBrowserAndMobileSessionCount: ")
        .append(toIndentedString(rumBrowserAndMobileSessionCount))
        .append("\n");
    sb.append("    rumSessionCountSum: ").append(toIndentedString(rumSessionCountSum)).append("\n");
    sb.append("    rumTotalSessionCountSum: ")
        .append(toIndentedString(rumTotalSessionCountSum))
        .append("\n");
    sb.append("    rumUnitsSum: ").append(toIndentedString(rumUnitsSum)).append("\n");
    sb.append("    sdsApmScannedBytesSum: ")
        .append(toIndentedString(sdsApmScannedBytesSum))
        .append("\n");
    sb.append("    sdsEventsScannedBytesSum: ")
        .append(toIndentedString(sdsEventsScannedBytesSum))
        .append("\n");
    sb.append("    sdsLogsScannedBytesSum: ")
        .append(toIndentedString(sdsLogsScannedBytesSum))
        .append("\n");
    sb.append("    sdsRumScannedBytesSum: ")
        .append(toIndentedString(sdsRumScannedBytesSum))
        .append("\n");
    sb.append("    sdsTotalScannedBytesSum: ")
        .append(toIndentedString(sdsTotalScannedBytesSum))
        .append("\n");
    sb.append("    syntheticsBrowserCheckCallsCountSum: ")
        .append(toIndentedString(syntheticsBrowserCheckCallsCountSum))
        .append("\n");
    sb.append("    syntheticsCheckCallsCountSum: ")
        .append(toIndentedString(syntheticsCheckCallsCountSum))
        .append("\n");
    sb.append("    traceSearchIndexedEventsCountSum: ")
        .append(toIndentedString(traceSearchIndexedEventsCountSum))
        .append("\n");
    sb.append("    twolIngestedEventsBytesSum: ")
        .append(toIndentedString(twolIngestedEventsBytesSum))
        .append("\n");
    sb.append("    vsphereHostTop99p: ").append(toIndentedString(vsphereHostTop99p)).append("\n");
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
