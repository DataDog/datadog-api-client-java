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

/**
 * Response summarizing all usage aggregated across the months in the request for all organizations,
 * and broken down by month and by organization.
 */
@JsonPropertyOrder({
  UsageSummaryResponse.JSON_PROPERTY_AGENT_HOST_TOP99P_SUM,
  UsageSummaryResponse.JSON_PROPERTY_APM_AZURE_APP_SERVICE_HOST_TOP99P_SUM,
  UsageSummaryResponse.JSON_PROPERTY_APM_FARGATE_COUNT_AVG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_APM_HOST_TOP99P_SUM,
  UsageSummaryResponse.JSON_PROPERTY_APPSEC_FARGATE_COUNT_AVG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_AUDIT_LOGS_LINES_INDEXED_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_AVG_PROFILED_FARGATE_TASKS_SUM,
  UsageSummaryResponse.JSON_PROPERTY_AWS_HOST_TOP99P_SUM,
  UsageSummaryResponse.JSON_PROPERTY_AWS_LAMBDA_FUNC_COUNT,
  UsageSummaryResponse.JSON_PROPERTY_AWS_LAMBDA_INVOCATIONS_SUM,
  UsageSummaryResponse.JSON_PROPERTY_AZURE_APP_SERVICE_TOP99P_SUM,
  UsageSummaryResponse.JSON_PROPERTY_AZURE_HOST_TOP99P_SUM,
  UsageSummaryResponse.JSON_PROPERTY_BILLABLE_INGESTED_BYTES_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_BROWSER_RUM_LITE_SESSION_COUNT_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_BROWSER_RUM_REPLAY_SESSION_COUNT_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_BROWSER_RUM_UNITS_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_CI_PIPELINE_INDEXED_SPANS_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_CI_TEST_INDEXED_SPANS_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_CI_VISIBILITY_PIPELINE_COMMITTERS_HWM_SUM,
  UsageSummaryResponse.JSON_PROPERTY_CI_VISIBILITY_TEST_COMMITTERS_HWM_SUM,
  UsageSummaryResponse.JSON_PROPERTY_CONTAINER_AVG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_CONTAINER_HWM_SUM,
  UsageSummaryResponse.JSON_PROPERTY_CSPM_AAS_HOST_TOP99P_SUM,
  UsageSummaryResponse.JSON_PROPERTY_CSPM_AWS_HOST_TOP99P_SUM,
  UsageSummaryResponse.JSON_PROPERTY_CSPM_AZURE_HOST_TOP99P_SUM,
  UsageSummaryResponse.JSON_PROPERTY_CSPM_CONTAINER_AVG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_CSPM_CONTAINER_HWM_SUM,
  UsageSummaryResponse.JSON_PROPERTY_CSPM_GCP_HOST_TOP99P_SUM,
  UsageSummaryResponse.JSON_PROPERTY_CSPM_HOST_TOP99P_SUM,
  UsageSummaryResponse.JSON_PROPERTY_CUSTOM_TS_SUM,
  UsageSummaryResponse.JSON_PROPERTY_CWS_CONTAINERS_AVG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_CWS_HOST_TOP99P_SUM,
  UsageSummaryResponse.JSON_PROPERTY_DBM_HOST_TOP99P_SUM,
  UsageSummaryResponse.JSON_PROPERTY_DBM_QUERIES_AVG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_END_DATE,
  UsageSummaryResponse.JSON_PROPERTY_FARGATE_TASKS_COUNT_AVG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_FARGATE_TASKS_COUNT_HWM_SUM,
  UsageSummaryResponse.JSON_PROPERTY_GCP_HOST_TOP99P_SUM,
  UsageSummaryResponse.JSON_PROPERTY_HEROKU_HOST_TOP99P_SUM,
  UsageSummaryResponse.JSON_PROPERTY_INCIDENT_MANAGEMENT_MONTHLY_ACTIVE_USERS_HWM_SUM,
  UsageSummaryResponse.JSON_PROPERTY_INDEXED_EVENTS_COUNT_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_INFRA_HOST_TOP99P_SUM,
  UsageSummaryResponse.JSON_PROPERTY_INGESTED_EVENTS_BYTES_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_IOT_DEVICE_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_IOT_DEVICE_TOP99P_SUM,
  UsageSummaryResponse.JSON_PROPERTY_LAST_UPDATED,
  UsageSummaryResponse.JSON_PROPERTY_LIVE_INDEXED_EVENTS_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_LIVE_INGESTED_BYTES_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_LOGS_BY_RETENTION,
  UsageSummaryResponse.JSON_PROPERTY_MOBILE_RUM_LITE_SESSION_COUNT_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_MOBILE_RUM_SESSION_COUNT_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_MOBILE_RUM_SESSION_COUNT_ANDROID_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_MOBILE_RUM_SESSION_COUNT_IOS_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_MOBILE_RUM_SESSION_COUNT_REACTNATIVE_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_MOBILE_RUM_UNITS_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_NETFLOW_INDEXED_EVENTS_COUNT_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_NPM_HOST_TOP99P_SUM,
  UsageSummaryResponse.JSON_PROPERTY_OBSERVABILITY_PIPELINES_BYTES_PROCESSED_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_ONLINE_ARCHIVE_EVENTS_COUNT_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_OPENTELEMETRY_APM_HOST_TOP99P_SUM,
  UsageSummaryResponse.JSON_PROPERTY_OPENTELEMETRY_HOST_TOP99P_SUM,
  UsageSummaryResponse.JSON_PROPERTY_PROFILING_CONTAINER_AGENT_COUNT_AVG,
  UsageSummaryResponse.JSON_PROPERTY_PROFILING_HOST_COUNT_TOP99P_SUM,
  UsageSummaryResponse.JSON_PROPERTY_REHYDRATED_INDEXED_EVENTS_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_REHYDRATED_INGESTED_BYTES_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_RUM_BROWSER_AND_MOBILE_SESSION_COUNT,
  UsageSummaryResponse.JSON_PROPERTY_RUM_SESSION_COUNT_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_RUM_TOTAL_SESSION_COUNT_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_RUM_UNITS_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_SDS_APM_SCANNED_BYTES_SUM,
  UsageSummaryResponse.JSON_PROPERTY_SDS_EVENTS_SCANNED_BYTES_SUM,
  UsageSummaryResponse.JSON_PROPERTY_SDS_LOGS_SCANNED_BYTES_SUM,
  UsageSummaryResponse.JSON_PROPERTY_SDS_RUM_SCANNED_BYTES_SUM,
  UsageSummaryResponse.JSON_PROPERTY_SDS_TOTAL_SCANNED_BYTES_SUM,
  UsageSummaryResponse.JSON_PROPERTY_START_DATE,
  UsageSummaryResponse.JSON_PROPERTY_SYNTHETICS_BROWSER_CHECK_CALLS_COUNT_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_SYNTHETICS_CHECK_CALLS_COUNT_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_TRACE_SEARCH_INDEXED_EVENTS_COUNT_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_TWOL_INGESTED_EVENTS_BYTES_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_USAGE,
  UsageSummaryResponse.JSON_PROPERTY_VSPHERE_HOST_TOP99P_SUM
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class UsageSummaryResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AGENT_HOST_TOP99P_SUM = "agent_host_top99p_sum";
  private Long agentHostTop99pSum;

  public static final String JSON_PROPERTY_APM_AZURE_APP_SERVICE_HOST_TOP99P_SUM =
      "apm_azure_app_service_host_top99p_sum";
  private Long apmAzureAppServiceHostTop99pSum;

  public static final String JSON_PROPERTY_APM_FARGATE_COUNT_AVG_SUM = "apm_fargate_count_avg_sum";
  private Long apmFargateCountAvgSum;

  public static final String JSON_PROPERTY_APM_HOST_TOP99P_SUM = "apm_host_top99p_sum";
  private Long apmHostTop99pSum;

  public static final String JSON_PROPERTY_APPSEC_FARGATE_COUNT_AVG_SUM =
      "appsec_fargate_count_avg_sum";
  private Long appsecFargateCountAvgSum;

  public static final String JSON_PROPERTY_AUDIT_LOGS_LINES_INDEXED_AGG_SUM =
      "audit_logs_lines_indexed_agg_sum";
  private Long auditLogsLinesIndexedAggSum;

  public static final String JSON_PROPERTY_AVG_PROFILED_FARGATE_TASKS_SUM =
      "avg_profiled_fargate_tasks_sum";
  private Long avgProfiledFargateTasksSum;

  public static final String JSON_PROPERTY_AWS_HOST_TOP99P_SUM = "aws_host_top99p_sum";
  private Long awsHostTop99pSum;

  public static final String JSON_PROPERTY_AWS_LAMBDA_FUNC_COUNT = "aws_lambda_func_count";
  private Long awsLambdaFuncCount;

  public static final String JSON_PROPERTY_AWS_LAMBDA_INVOCATIONS_SUM =
      "aws_lambda_invocations_sum";
  private Long awsLambdaInvocationsSum;

  public static final String JSON_PROPERTY_AZURE_APP_SERVICE_TOP99P_SUM =
      "azure_app_service_top99p_sum";
  private Long azureAppServiceTop99pSum;

  public static final String JSON_PROPERTY_AZURE_HOST_TOP99P_SUM = "azure_host_top99p_sum";
  private Long azureHostTop99pSum;

  public static final String JSON_PROPERTY_BILLABLE_INGESTED_BYTES_AGG_SUM =
      "billable_ingested_bytes_agg_sum";
  private Long billableIngestedBytesAggSum;

  public static final String JSON_PROPERTY_BROWSER_RUM_LITE_SESSION_COUNT_AGG_SUM =
      "browser_rum_lite_session_count_agg_sum";
  private Long browserRumLiteSessionCountAggSum;

  public static final String JSON_PROPERTY_BROWSER_RUM_REPLAY_SESSION_COUNT_AGG_SUM =
      "browser_rum_replay_session_count_agg_sum";
  private Long browserRumReplaySessionCountAggSum;

  public static final String JSON_PROPERTY_BROWSER_RUM_UNITS_AGG_SUM = "browser_rum_units_agg_sum";
  private Long browserRumUnitsAggSum;

  public static final String JSON_PROPERTY_CI_PIPELINE_INDEXED_SPANS_AGG_SUM =
      "ci_pipeline_indexed_spans_agg_sum";
  private Long ciPipelineIndexedSpansAggSum;

  public static final String JSON_PROPERTY_CI_TEST_INDEXED_SPANS_AGG_SUM =
      "ci_test_indexed_spans_agg_sum";
  private Long ciTestIndexedSpansAggSum;

  public static final String JSON_PROPERTY_CI_VISIBILITY_PIPELINE_COMMITTERS_HWM_SUM =
      "ci_visibility_pipeline_committers_hwm_sum";
  private Long ciVisibilityPipelineCommittersHwmSum;

  public static final String JSON_PROPERTY_CI_VISIBILITY_TEST_COMMITTERS_HWM_SUM =
      "ci_visibility_test_committers_hwm_sum";
  private Long ciVisibilityTestCommittersHwmSum;

  public static final String JSON_PROPERTY_CONTAINER_AVG_SUM = "container_avg_sum";
  private Long containerAvgSum;

  public static final String JSON_PROPERTY_CONTAINER_HWM_SUM = "container_hwm_sum";
  private Long containerHwmSum;

  public static final String JSON_PROPERTY_CSPM_AAS_HOST_TOP99P_SUM = "cspm_aas_host_top99p_sum";
  private Long cspmAasHostTop99pSum;

  public static final String JSON_PROPERTY_CSPM_AWS_HOST_TOP99P_SUM = "cspm_aws_host_top99p_sum";
  private Long cspmAwsHostTop99pSum;

  public static final String JSON_PROPERTY_CSPM_AZURE_HOST_TOP99P_SUM =
      "cspm_azure_host_top99p_sum";
  private Long cspmAzureHostTop99pSum;

  public static final String JSON_PROPERTY_CSPM_CONTAINER_AVG_SUM = "cspm_container_avg_sum";
  private Long cspmContainerAvgSum;

  public static final String JSON_PROPERTY_CSPM_CONTAINER_HWM_SUM = "cspm_container_hwm_sum";
  private Long cspmContainerHwmSum;

  public static final String JSON_PROPERTY_CSPM_GCP_HOST_TOP99P_SUM = "cspm_gcp_host_top99p_sum";
  private Long cspmGcpHostTop99pSum;

  public static final String JSON_PROPERTY_CSPM_HOST_TOP99P_SUM = "cspm_host_top99p_sum";
  private Long cspmHostTop99pSum;

  public static final String JSON_PROPERTY_CUSTOM_TS_SUM = "custom_ts_sum";
  private Long customTsSum;

  public static final String JSON_PROPERTY_CWS_CONTAINERS_AVG_SUM = "cws_containers_avg_sum";
  private Long cwsContainersAvgSum;

  public static final String JSON_PROPERTY_CWS_HOST_TOP99P_SUM = "cws_host_top99p_sum";
  private Long cwsHostTop99pSum;

  public static final String JSON_PROPERTY_DBM_HOST_TOP99P_SUM = "dbm_host_top99p_sum";
  private Long dbmHostTop99pSum;

  public static final String JSON_PROPERTY_DBM_QUERIES_AVG_SUM = "dbm_queries_avg_sum";
  private Long dbmQueriesAvgSum;

  public static final String JSON_PROPERTY_END_DATE = "end_date";

  @JsonSerialize(using = JsonTimeSerializer.class)
  private OffsetDateTime endDate;

  public static final String JSON_PROPERTY_FARGATE_TASKS_COUNT_AVG_SUM =
      "fargate_tasks_count_avg_sum";
  private Long fargateTasksCountAvgSum;

  public static final String JSON_PROPERTY_FARGATE_TASKS_COUNT_HWM_SUM =
      "fargate_tasks_count_hwm_sum";
  private Long fargateTasksCountHwmSum;

  public static final String JSON_PROPERTY_GCP_HOST_TOP99P_SUM = "gcp_host_top99p_sum";
  private Long gcpHostTop99pSum;

  public static final String JSON_PROPERTY_HEROKU_HOST_TOP99P_SUM = "heroku_host_top99p_sum";
  private Long herokuHostTop99pSum;

  public static final String JSON_PROPERTY_INCIDENT_MANAGEMENT_MONTHLY_ACTIVE_USERS_HWM_SUM =
      "incident_management_monthly_active_users_hwm_sum";
  private Long incidentManagementMonthlyActiveUsersHwmSum;

  public static final String JSON_PROPERTY_INDEXED_EVENTS_COUNT_AGG_SUM =
      "indexed_events_count_agg_sum";
  private Long indexedEventsCountAggSum;

  public static final String JSON_PROPERTY_INFRA_HOST_TOP99P_SUM = "infra_host_top99p_sum";
  private Long infraHostTop99pSum;

  public static final String JSON_PROPERTY_INGESTED_EVENTS_BYTES_AGG_SUM =
      "ingested_events_bytes_agg_sum";
  private Long ingestedEventsBytesAggSum;

  public static final String JSON_PROPERTY_IOT_DEVICE_AGG_SUM = "iot_device_agg_sum";
  private Long iotDeviceAggSum;

  public static final String JSON_PROPERTY_IOT_DEVICE_TOP99P_SUM = "iot_device_top99p_sum";
  private Long iotDeviceTop99pSum;

  public static final String JSON_PROPERTY_LAST_UPDATED = "last_updated";

  @JsonSerialize(using = JsonTimeSerializer.class)
  private OffsetDateTime lastUpdated;

  public static final String JSON_PROPERTY_LIVE_INDEXED_EVENTS_AGG_SUM =
      "live_indexed_events_agg_sum";
  private Long liveIndexedEventsAggSum;

  public static final String JSON_PROPERTY_LIVE_INGESTED_BYTES_AGG_SUM =
      "live_ingested_bytes_agg_sum";
  private Long liveIngestedBytesAggSum;

  public static final String JSON_PROPERTY_LOGS_BY_RETENTION = "logs_by_retention";
  private LogsByRetention logsByRetention;

  public static final String JSON_PROPERTY_MOBILE_RUM_LITE_SESSION_COUNT_AGG_SUM =
      "mobile_rum_lite_session_count_agg_sum";
  private Long mobileRumLiteSessionCountAggSum;

  public static final String JSON_PROPERTY_MOBILE_RUM_SESSION_COUNT_AGG_SUM =
      "mobile_rum_session_count_agg_sum";
  private Long mobileRumSessionCountAggSum;

  public static final String JSON_PROPERTY_MOBILE_RUM_SESSION_COUNT_ANDROID_AGG_SUM =
      "mobile_rum_session_count_android_agg_sum";
  private Long mobileRumSessionCountAndroidAggSum;

  public static final String JSON_PROPERTY_MOBILE_RUM_SESSION_COUNT_IOS_AGG_SUM =
      "mobile_rum_session_count_ios_agg_sum";
  private Long mobileRumSessionCountIosAggSum;

  public static final String JSON_PROPERTY_MOBILE_RUM_SESSION_COUNT_REACTNATIVE_AGG_SUM =
      "mobile_rum_session_count_reactnative_agg_sum";
  private Long mobileRumSessionCountReactnativeAggSum;

  public static final String JSON_PROPERTY_MOBILE_RUM_UNITS_AGG_SUM = "mobile_rum_units_agg_sum";
  private Long mobileRumUnitsAggSum;

  public static final String JSON_PROPERTY_NETFLOW_INDEXED_EVENTS_COUNT_AGG_SUM =
      "netflow_indexed_events_count_agg_sum";
  private Long netflowIndexedEventsCountAggSum;

  public static final String JSON_PROPERTY_NPM_HOST_TOP99P_SUM = "npm_host_top99p_sum";
  private Long npmHostTop99pSum;

  public static final String JSON_PROPERTY_OBSERVABILITY_PIPELINES_BYTES_PROCESSED_AGG_SUM =
      "observability_pipelines_bytes_processed_agg_sum";
  private Long observabilityPipelinesBytesProcessedAggSum;

  public static final String JSON_PROPERTY_ONLINE_ARCHIVE_EVENTS_COUNT_AGG_SUM =
      "online_archive_events_count_agg_sum";
  private Long onlineArchiveEventsCountAggSum;

  public static final String JSON_PROPERTY_OPENTELEMETRY_APM_HOST_TOP99P_SUM =
      "opentelemetry_apm_host_top99p_sum";
  private Long opentelemetryApmHostTop99pSum;

  public static final String JSON_PROPERTY_OPENTELEMETRY_HOST_TOP99P_SUM =
      "opentelemetry_host_top99p_sum";
  private Long opentelemetryHostTop99pSum;

  public static final String JSON_PROPERTY_PROFILING_CONTAINER_AGENT_COUNT_AVG =
      "profiling_container_agent_count_avg";
  private Long profilingContainerAgentCountAvg;

  public static final String JSON_PROPERTY_PROFILING_HOST_COUNT_TOP99P_SUM =
      "profiling_host_count_top99p_sum";
  private Long profilingHostCountTop99pSum;

  public static final String JSON_PROPERTY_REHYDRATED_INDEXED_EVENTS_AGG_SUM =
      "rehydrated_indexed_events_agg_sum";
  private Long rehydratedIndexedEventsAggSum;

  public static final String JSON_PROPERTY_REHYDRATED_INGESTED_BYTES_AGG_SUM =
      "rehydrated_ingested_bytes_agg_sum";
  private Long rehydratedIngestedBytesAggSum;

  public static final String JSON_PROPERTY_RUM_BROWSER_AND_MOBILE_SESSION_COUNT =
      "rum_browser_and_mobile_session_count";
  private Long rumBrowserAndMobileSessionCount;

  public static final String JSON_PROPERTY_RUM_SESSION_COUNT_AGG_SUM = "rum_session_count_agg_sum";
  private Long rumSessionCountAggSum;

  public static final String JSON_PROPERTY_RUM_TOTAL_SESSION_COUNT_AGG_SUM =
      "rum_total_session_count_agg_sum";
  private Long rumTotalSessionCountAggSum;

  public static final String JSON_PROPERTY_RUM_UNITS_AGG_SUM = "rum_units_agg_sum";
  private Long rumUnitsAggSum;

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

  public static final String JSON_PROPERTY_START_DATE = "start_date";

  @JsonSerialize(using = JsonTimeSerializer.class)
  private OffsetDateTime startDate;

  public static final String JSON_PROPERTY_SYNTHETICS_BROWSER_CHECK_CALLS_COUNT_AGG_SUM =
      "synthetics_browser_check_calls_count_agg_sum";
  private Long syntheticsBrowserCheckCallsCountAggSum;

  public static final String JSON_PROPERTY_SYNTHETICS_CHECK_CALLS_COUNT_AGG_SUM =
      "synthetics_check_calls_count_agg_sum";
  private Long syntheticsCheckCallsCountAggSum;

  public static final String JSON_PROPERTY_TRACE_SEARCH_INDEXED_EVENTS_COUNT_AGG_SUM =
      "trace_search_indexed_events_count_agg_sum";
  private Long traceSearchIndexedEventsCountAggSum;

  public static final String JSON_PROPERTY_TWOL_INGESTED_EVENTS_BYTES_AGG_SUM =
      "twol_ingested_events_bytes_agg_sum";
  private Long twolIngestedEventsBytesAggSum;

  public static final String JSON_PROPERTY_USAGE = "usage";
  private List<UsageSummaryDate> usage = null;

  public static final String JSON_PROPERTY_VSPHERE_HOST_TOP99P_SUM = "vsphere_host_top99p_sum";
  private Long vsphereHostTop99pSum;

  public UsageSummaryResponse agentHostTop99pSum(Long agentHostTop99pSum) {
    this.agentHostTop99pSum = agentHostTop99pSum;
    return this;
  }

  /**
   * Shows the 99th percentile of all agent hosts over all hours in the current months for all
   * organizations.
   *
   * @return agentHostTop99pSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AGENT_HOST_TOP99P_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getAgentHostTop99pSum() {
    return agentHostTop99pSum;
  }

  public void setAgentHostTop99pSum(Long agentHostTop99pSum) {
    this.agentHostTop99pSum = agentHostTop99pSum;
  }

  public UsageSummaryResponse apmAzureAppServiceHostTop99pSum(
      Long apmAzureAppServiceHostTop99pSum) {
    this.apmAzureAppServiceHostTop99pSum = apmAzureAppServiceHostTop99pSum;
    return this;
  }

  /**
   * Shows the 99th percentile of all Azure app services using APM over all hours in the current
   * months all organizations.
   *
   * @return apmAzureAppServiceHostTop99pSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APM_AZURE_APP_SERVICE_HOST_TOP99P_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getApmAzureAppServiceHostTop99pSum() {
    return apmAzureAppServiceHostTop99pSum;
  }

  public void setApmAzureAppServiceHostTop99pSum(Long apmAzureAppServiceHostTop99pSum) {
    this.apmAzureAppServiceHostTop99pSum = apmAzureAppServiceHostTop99pSum;
  }

  public UsageSummaryResponse apmFargateCountAvgSum(Long apmFargateCountAvgSum) {
    this.apmFargateCountAvgSum = apmFargateCountAvgSum;
    return this;
  }

  /**
   * Shows the average of all APM ECS Fargate tasks over all hours in the current months for all
   * organizations.
   *
   * @return apmFargateCountAvgSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APM_FARGATE_COUNT_AVG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getApmFargateCountAvgSum() {
    return apmFargateCountAvgSum;
  }

  public void setApmFargateCountAvgSum(Long apmFargateCountAvgSum) {
    this.apmFargateCountAvgSum = apmFargateCountAvgSum;
  }

  public UsageSummaryResponse apmHostTop99pSum(Long apmHostTop99pSum) {
    this.apmHostTop99pSum = apmHostTop99pSum;
    return this;
  }

  /**
   * Shows the 99th percentile of all distinct APM hosts over all hours in the current months for
   * all organizations.
   *
   * @return apmHostTop99pSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APM_HOST_TOP99P_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getApmHostTop99pSum() {
    return apmHostTop99pSum;
  }

  public void setApmHostTop99pSum(Long apmHostTop99pSum) {
    this.apmHostTop99pSum = apmHostTop99pSum;
  }

  public UsageSummaryResponse appsecFargateCountAvgSum(Long appsecFargateCountAvgSum) {
    this.appsecFargateCountAvgSum = appsecFargateCountAvgSum;
    return this;
  }

  /**
   * Shows the average of all Application Security Monitoring ECS Fargate tasks over all hours in
   * the current months for all organizations.
   *
   * @return appsecFargateCountAvgSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APPSEC_FARGATE_COUNT_AVG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getAppsecFargateCountAvgSum() {
    return appsecFargateCountAvgSum;
  }

  public void setAppsecFargateCountAvgSum(Long appsecFargateCountAvgSum) {
    this.appsecFargateCountAvgSum = appsecFargateCountAvgSum;
  }

  public UsageSummaryResponse auditLogsLinesIndexedAggSum(Long auditLogsLinesIndexedAggSum) {
    this.auditLogsLinesIndexedAggSum = auditLogsLinesIndexedAggSum;
    return this;
  }

  /**
   * Shows the sum of all audit logs lines indexed over all hours in the current months for all
   * organizations.
   *
   * @return auditLogsLinesIndexedAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUDIT_LOGS_LINES_INDEXED_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getAuditLogsLinesIndexedAggSum() {
    return auditLogsLinesIndexedAggSum;
  }

  public void setAuditLogsLinesIndexedAggSum(Long auditLogsLinesIndexedAggSum) {
    this.auditLogsLinesIndexedAggSum = auditLogsLinesIndexedAggSum;
  }

  public UsageSummaryResponse avgProfiledFargateTasksSum(Long avgProfiledFargateTasksSum) {
    this.avgProfiledFargateTasksSum = avgProfiledFargateTasksSum;
    return this;
  }

  /**
   * Shows the average of all profiled Fargate tasks over all hours in the current months for all
   * organizations.
   *
   * @return avgProfiledFargateTasksSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AVG_PROFILED_FARGATE_TASKS_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getAvgProfiledFargateTasksSum() {
    return avgProfiledFargateTasksSum;
  }

  public void setAvgProfiledFargateTasksSum(Long avgProfiledFargateTasksSum) {
    this.avgProfiledFargateTasksSum = avgProfiledFargateTasksSum;
  }

  public UsageSummaryResponse awsHostTop99pSum(Long awsHostTop99pSum) {
    this.awsHostTop99pSum = awsHostTop99pSum;
    return this;
  }

  /**
   * Shows the 99th percentile of all AWS hosts over all hours in the current months for all
   * organizations.
   *
   * @return awsHostTop99pSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AWS_HOST_TOP99P_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getAwsHostTop99pSum() {
    return awsHostTop99pSum;
  }

  public void setAwsHostTop99pSum(Long awsHostTop99pSum) {
    this.awsHostTop99pSum = awsHostTop99pSum;
  }

  public UsageSummaryResponse awsLambdaFuncCount(Long awsLambdaFuncCount) {
    this.awsLambdaFuncCount = awsLambdaFuncCount;
    return this;
  }

  /**
   * Shows the average of the number of functions that executed 1 or more times each hour in the
   * current months for all organizations.
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

  public UsageSummaryResponse awsLambdaInvocationsSum(Long awsLambdaInvocationsSum) {
    this.awsLambdaInvocationsSum = awsLambdaInvocationsSum;
    return this;
  }

  /**
   * Shows the sum of all AWS Lambda invocations over all hours in the current months for all
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

  public UsageSummaryResponse azureAppServiceTop99pSum(Long azureAppServiceTop99pSum) {
    this.azureAppServiceTop99pSum = azureAppServiceTop99pSum;
    return this;
  }

  /**
   * Shows the 99th percentile of all Azure app services over all hours in the current months for
   * all organizations.
   *
   * @return azureAppServiceTop99pSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AZURE_APP_SERVICE_TOP99P_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getAzureAppServiceTop99pSum() {
    return azureAppServiceTop99pSum;
  }

  public void setAzureAppServiceTop99pSum(Long azureAppServiceTop99pSum) {
    this.azureAppServiceTop99pSum = azureAppServiceTop99pSum;
  }

  public UsageSummaryResponse azureHostTop99pSum(Long azureHostTop99pSum) {
    this.azureHostTop99pSum = azureHostTop99pSum;
    return this;
  }

  /**
   * Shows the 99th percentile of all Azure hosts over all hours in the current months for all
   * organizations.
   *
   * @return azureHostTop99pSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AZURE_HOST_TOP99P_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getAzureHostTop99pSum() {
    return azureHostTop99pSum;
  }

  public void setAzureHostTop99pSum(Long azureHostTop99pSum) {
    this.azureHostTop99pSum = azureHostTop99pSum;
  }

  public UsageSummaryResponse billableIngestedBytesAggSum(Long billableIngestedBytesAggSum) {
    this.billableIngestedBytesAggSum = billableIngestedBytesAggSum;
    return this;
  }

  /**
   * Shows the sum of all log bytes ingested over all hours in the current months for all
   * organizations.
   *
   * @return billableIngestedBytesAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BILLABLE_INGESTED_BYTES_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getBillableIngestedBytesAggSum() {
    return billableIngestedBytesAggSum;
  }

  public void setBillableIngestedBytesAggSum(Long billableIngestedBytesAggSum) {
    this.billableIngestedBytesAggSum = billableIngestedBytesAggSum;
  }

  public UsageSummaryResponse browserRumLiteSessionCountAggSum(
      Long browserRumLiteSessionCountAggSum) {
    this.browserRumLiteSessionCountAggSum = browserRumLiteSessionCountAggSum;
    return this;
  }

  /**
   * Shows the sum of all browser lite sessions over all hours in the current months for all
   * organizations.
   *
   * @return browserRumLiteSessionCountAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BROWSER_RUM_LITE_SESSION_COUNT_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getBrowserRumLiteSessionCountAggSum() {
    return browserRumLiteSessionCountAggSum;
  }

  public void setBrowserRumLiteSessionCountAggSum(Long browserRumLiteSessionCountAggSum) {
    this.browserRumLiteSessionCountAggSum = browserRumLiteSessionCountAggSum;
  }

  public UsageSummaryResponse browserRumReplaySessionCountAggSum(
      Long browserRumReplaySessionCountAggSum) {
    this.browserRumReplaySessionCountAggSum = browserRumReplaySessionCountAggSum;
    return this;
  }

  /**
   * Shows the sum of all browser replay sessions over all hours in the current months for all
   * organizations.
   *
   * @return browserRumReplaySessionCountAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BROWSER_RUM_REPLAY_SESSION_COUNT_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getBrowserRumReplaySessionCountAggSum() {
    return browserRumReplaySessionCountAggSum;
  }

  public void setBrowserRumReplaySessionCountAggSum(Long browserRumReplaySessionCountAggSum) {
    this.browserRumReplaySessionCountAggSum = browserRumReplaySessionCountAggSum;
  }

  public UsageSummaryResponse browserRumUnitsAggSum(Long browserRumUnitsAggSum) {
    this.browserRumUnitsAggSum = browserRumUnitsAggSum;
    return this;
  }

  /**
   * Shows the sum of all browser RUM units over all hours in the current months for all
   * organizations.
   *
   * @return browserRumUnitsAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BROWSER_RUM_UNITS_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getBrowserRumUnitsAggSum() {
    return browserRumUnitsAggSum;
  }

  public void setBrowserRumUnitsAggSum(Long browserRumUnitsAggSum) {
    this.browserRumUnitsAggSum = browserRumUnitsAggSum;
  }

  public UsageSummaryResponse ciPipelineIndexedSpansAggSum(Long ciPipelineIndexedSpansAggSum) {
    this.ciPipelineIndexedSpansAggSum = ciPipelineIndexedSpansAggSum;
    return this;
  }

  /**
   * Shows the sum of all CI pipeline indexed spans over all hours in the current months for all
   * organizations.
   *
   * @return ciPipelineIndexedSpansAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CI_PIPELINE_INDEXED_SPANS_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCiPipelineIndexedSpansAggSum() {
    return ciPipelineIndexedSpansAggSum;
  }

  public void setCiPipelineIndexedSpansAggSum(Long ciPipelineIndexedSpansAggSum) {
    this.ciPipelineIndexedSpansAggSum = ciPipelineIndexedSpansAggSum;
  }

  public UsageSummaryResponse ciTestIndexedSpansAggSum(Long ciTestIndexedSpansAggSum) {
    this.ciTestIndexedSpansAggSum = ciTestIndexedSpansAggSum;
    return this;
  }

  /**
   * Shows the sum of all CI test indexed spans over all hours in the current months for all
   * organizations.
   *
   * @return ciTestIndexedSpansAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CI_TEST_INDEXED_SPANS_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCiTestIndexedSpansAggSum() {
    return ciTestIndexedSpansAggSum;
  }

  public void setCiTestIndexedSpansAggSum(Long ciTestIndexedSpansAggSum) {
    this.ciTestIndexedSpansAggSum = ciTestIndexedSpansAggSum;
  }

  public UsageSummaryResponse ciVisibilityPipelineCommittersHwmSum(
      Long ciVisibilityPipelineCommittersHwmSum) {
    this.ciVisibilityPipelineCommittersHwmSum = ciVisibilityPipelineCommittersHwmSum;
    return this;
  }

  /**
   * Shows the high-water mark of all CI visibility pipeline committers over all hours in the
   * current months for all organizations.
   *
   * @return ciVisibilityPipelineCommittersHwmSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CI_VISIBILITY_PIPELINE_COMMITTERS_HWM_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCiVisibilityPipelineCommittersHwmSum() {
    return ciVisibilityPipelineCommittersHwmSum;
  }

  public void setCiVisibilityPipelineCommittersHwmSum(Long ciVisibilityPipelineCommittersHwmSum) {
    this.ciVisibilityPipelineCommittersHwmSum = ciVisibilityPipelineCommittersHwmSum;
  }

  public UsageSummaryResponse ciVisibilityTestCommittersHwmSum(
      Long ciVisibilityTestCommittersHwmSum) {
    this.ciVisibilityTestCommittersHwmSum = ciVisibilityTestCommittersHwmSum;
    return this;
  }

  /**
   * Shows the high-water mark of all CI visibility test committers over all hours in the current
   * months for all organizations.
   *
   * @return ciVisibilityTestCommittersHwmSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CI_VISIBILITY_TEST_COMMITTERS_HWM_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCiVisibilityTestCommittersHwmSum() {
    return ciVisibilityTestCommittersHwmSum;
  }

  public void setCiVisibilityTestCommittersHwmSum(Long ciVisibilityTestCommittersHwmSum) {
    this.ciVisibilityTestCommittersHwmSum = ciVisibilityTestCommittersHwmSum;
  }

  public UsageSummaryResponse containerAvgSum(Long containerAvgSum) {
    this.containerAvgSum = containerAvgSum;
    return this;
  }

  /**
   * Shows the average of all distinct containers over all hours in the current months for all
   * organizations.
   *
   * @return containerAvgSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTAINER_AVG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getContainerAvgSum() {
    return containerAvgSum;
  }

  public void setContainerAvgSum(Long containerAvgSum) {
    this.containerAvgSum = containerAvgSum;
  }

  public UsageSummaryResponse containerHwmSum(Long containerHwmSum) {
    this.containerHwmSum = containerHwmSum;
    return this;
  }

  /**
   * Shows the sum of the high-water marks of all distinct containers over all hours in the current
   * months for all organizations.
   *
   * @return containerHwmSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTAINER_HWM_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getContainerHwmSum() {
    return containerHwmSum;
  }

  public void setContainerHwmSum(Long containerHwmSum) {
    this.containerHwmSum = containerHwmSum;
  }

  public UsageSummaryResponse cspmAasHostTop99pSum(Long cspmAasHostTop99pSum) {
    this.cspmAasHostTop99pSum = cspmAasHostTop99pSum;
    return this;
  }

  /**
   * Shows the 99th percentile of all Cloud Security Posture Management Azure app services hosts
   * over all hours in the current months for all organizations.
   *
   * @return cspmAasHostTop99pSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CSPM_AAS_HOST_TOP99P_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCspmAasHostTop99pSum() {
    return cspmAasHostTop99pSum;
  }

  public void setCspmAasHostTop99pSum(Long cspmAasHostTop99pSum) {
    this.cspmAasHostTop99pSum = cspmAasHostTop99pSum;
  }

  public UsageSummaryResponse cspmAwsHostTop99pSum(Long cspmAwsHostTop99pSum) {
    this.cspmAwsHostTop99pSum = cspmAwsHostTop99pSum;
    return this;
  }

  /**
   * Shows the 99th percentile of all Cloud Security Posture Management AWS hosts over all hours in
   * the current months for all organizations.
   *
   * @return cspmAwsHostTop99pSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CSPM_AWS_HOST_TOP99P_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCspmAwsHostTop99pSum() {
    return cspmAwsHostTop99pSum;
  }

  public void setCspmAwsHostTop99pSum(Long cspmAwsHostTop99pSum) {
    this.cspmAwsHostTop99pSum = cspmAwsHostTop99pSum;
  }

  public UsageSummaryResponse cspmAzureHostTop99pSum(Long cspmAzureHostTop99pSum) {
    this.cspmAzureHostTop99pSum = cspmAzureHostTop99pSum;
    return this;
  }

  /**
   * Shows the 99th percentile of all Cloud Security Posture Management Azure hosts over all hours
   * in the current months for all organizations.
   *
   * @return cspmAzureHostTop99pSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CSPM_AZURE_HOST_TOP99P_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCspmAzureHostTop99pSum() {
    return cspmAzureHostTop99pSum;
  }

  public void setCspmAzureHostTop99pSum(Long cspmAzureHostTop99pSum) {
    this.cspmAzureHostTop99pSum = cspmAzureHostTop99pSum;
  }

  public UsageSummaryResponse cspmContainerAvgSum(Long cspmContainerAvgSum) {
    this.cspmContainerAvgSum = cspmContainerAvgSum;
    return this;
  }

  /**
   * Shows the average number of Cloud Security Posture Management containers over all hours in the
   * current months for all organizations.
   *
   * @return cspmContainerAvgSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CSPM_CONTAINER_AVG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCspmContainerAvgSum() {
    return cspmContainerAvgSum;
  }

  public void setCspmContainerAvgSum(Long cspmContainerAvgSum) {
    this.cspmContainerAvgSum = cspmContainerAvgSum;
  }

  public UsageSummaryResponse cspmContainerHwmSum(Long cspmContainerHwmSum) {
    this.cspmContainerHwmSum = cspmContainerHwmSum;
    return this;
  }

  /**
   * Shows the sum of the the high-water marks of Cloud Security Posture Management containers over
   * all hours in the current months for all organizations.
   *
   * @return cspmContainerHwmSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CSPM_CONTAINER_HWM_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCspmContainerHwmSum() {
    return cspmContainerHwmSum;
  }

  public void setCspmContainerHwmSum(Long cspmContainerHwmSum) {
    this.cspmContainerHwmSum = cspmContainerHwmSum;
  }

  public UsageSummaryResponse cspmGcpHostTop99pSum(Long cspmGcpHostTop99pSum) {
    this.cspmGcpHostTop99pSum = cspmGcpHostTop99pSum;
    return this;
  }

  /**
   * Shows the 99th percentile of all Cloud Security Posture Management GCP hosts over all hours in
   * the current months for all organizations.
   *
   * @return cspmGcpHostTop99pSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CSPM_GCP_HOST_TOP99P_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCspmGcpHostTop99pSum() {
    return cspmGcpHostTop99pSum;
  }

  public void setCspmGcpHostTop99pSum(Long cspmGcpHostTop99pSum) {
    this.cspmGcpHostTop99pSum = cspmGcpHostTop99pSum;
  }

  public UsageSummaryResponse cspmHostTop99pSum(Long cspmHostTop99pSum) {
    this.cspmHostTop99pSum = cspmHostTop99pSum;
    return this;
  }

  /**
   * Shows the 99th percentile of all Cloud Security Posture Management hosts over all hours in the
   * current months for all organizations.
   *
   * @return cspmHostTop99pSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CSPM_HOST_TOP99P_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCspmHostTop99pSum() {
    return cspmHostTop99pSum;
  }

  public void setCspmHostTop99pSum(Long cspmHostTop99pSum) {
    this.cspmHostTop99pSum = cspmHostTop99pSum;
  }

  public UsageSummaryResponse customTsSum(Long customTsSum) {
    this.customTsSum = customTsSum;
    return this;
  }

  /**
   * Shows the average number of distinct custom metrics over all hours in the current months for
   * all organizations.
   *
   * @return customTsSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CUSTOM_TS_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCustomTsSum() {
    return customTsSum;
  }

  public void setCustomTsSum(Long customTsSum) {
    this.customTsSum = customTsSum;
  }

  public UsageSummaryResponse cwsContainersAvgSum(Long cwsContainersAvgSum) {
    this.cwsContainersAvgSum = cwsContainersAvgSum;
    return this;
  }

  /**
   * Shows the average of all distinct Cloud Workload Security containers over all hours in the
   * current months for all organizations.
   *
   * @return cwsContainersAvgSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CWS_CONTAINERS_AVG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCwsContainersAvgSum() {
    return cwsContainersAvgSum;
  }

  public void setCwsContainersAvgSum(Long cwsContainersAvgSum) {
    this.cwsContainersAvgSum = cwsContainersAvgSum;
  }

  public UsageSummaryResponse cwsHostTop99pSum(Long cwsHostTop99pSum) {
    this.cwsHostTop99pSum = cwsHostTop99pSum;
    return this;
  }

  /**
   * Shows the 99th percentile of all Cloud Workload Security hosts over all hours in the current
   * months for all organizations.
   *
   * @return cwsHostTop99pSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CWS_HOST_TOP99P_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCwsHostTop99pSum() {
    return cwsHostTop99pSum;
  }

  public void setCwsHostTop99pSum(Long cwsHostTop99pSum) {
    this.cwsHostTop99pSum = cwsHostTop99pSum;
  }

  public UsageSummaryResponse dbmHostTop99pSum(Long dbmHostTop99pSum) {
    this.dbmHostTop99pSum = dbmHostTop99pSum;
    return this;
  }

  /**
   * Shows the 99th percentile of all Database Monitoring hosts over all hours in the current month
   * for all organizations.
   *
   * @return dbmHostTop99pSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DBM_HOST_TOP99P_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getDbmHostTop99pSum() {
    return dbmHostTop99pSum;
  }

  public void setDbmHostTop99pSum(Long dbmHostTop99pSum) {
    this.dbmHostTop99pSum = dbmHostTop99pSum;
  }

  public UsageSummaryResponse dbmQueriesAvgSum(Long dbmQueriesAvgSum) {
    this.dbmQueriesAvgSum = dbmQueriesAvgSum;
    return this;
  }

  /**
   * Shows the average of all distinct Database Monitoring Normalized Queries over all hours in the
   * current month for all organizations.
   *
   * @return dbmQueriesAvgSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DBM_QUERIES_AVG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getDbmQueriesAvgSum() {
    return dbmQueriesAvgSum;
  }

  public void setDbmQueriesAvgSum(Long dbmQueriesAvgSum) {
    this.dbmQueriesAvgSum = dbmQueriesAvgSum;
  }

  public UsageSummaryResponse endDate(OffsetDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * Shows the last date of usage in the current months for all organizations.
   *
   * @return endDate
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_END_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }

  public UsageSummaryResponse fargateTasksCountAvgSum(Long fargateTasksCountAvgSum) {
    this.fargateTasksCountAvgSum = fargateTasksCountAvgSum;
    return this;
  }

  /**
   * Shows the average of all Fargate tasks over all hours in the current months for all
   * organizations.
   *
   * @return fargateTasksCountAvgSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FARGATE_TASKS_COUNT_AVG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getFargateTasksCountAvgSum() {
    return fargateTasksCountAvgSum;
  }

  public void setFargateTasksCountAvgSum(Long fargateTasksCountAvgSum) {
    this.fargateTasksCountAvgSum = fargateTasksCountAvgSum;
  }

  public UsageSummaryResponse fargateTasksCountHwmSum(Long fargateTasksCountHwmSum) {
    this.fargateTasksCountHwmSum = fargateTasksCountHwmSum;
    return this;
  }

  /**
   * Shows the sum of the high-water marks of all Fargate tasks over all hours in the current months
   * for all organizations.
   *
   * @return fargateTasksCountHwmSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FARGATE_TASKS_COUNT_HWM_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getFargateTasksCountHwmSum() {
    return fargateTasksCountHwmSum;
  }

  public void setFargateTasksCountHwmSum(Long fargateTasksCountHwmSum) {
    this.fargateTasksCountHwmSum = fargateTasksCountHwmSum;
  }

  public UsageSummaryResponse gcpHostTop99pSum(Long gcpHostTop99pSum) {
    this.gcpHostTop99pSum = gcpHostTop99pSum;
    return this;
  }

  /**
   * Shows the 99th percentile of all GCP hosts over all hours in the current months for all
   * organizations.
   *
   * @return gcpHostTop99pSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GCP_HOST_TOP99P_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getGcpHostTop99pSum() {
    return gcpHostTop99pSum;
  }

  public void setGcpHostTop99pSum(Long gcpHostTop99pSum) {
    this.gcpHostTop99pSum = gcpHostTop99pSum;
  }

  public UsageSummaryResponse herokuHostTop99pSum(Long herokuHostTop99pSum) {
    this.herokuHostTop99pSum = herokuHostTop99pSum;
    return this;
  }

  /**
   * Shows the 99th percentile of all Heroku dynos over all hours in the current months for all
   * organizations.
   *
   * @return herokuHostTop99pSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HEROKU_HOST_TOP99P_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getHerokuHostTop99pSum() {
    return herokuHostTop99pSum;
  }

  public void setHerokuHostTop99pSum(Long herokuHostTop99pSum) {
    this.herokuHostTop99pSum = herokuHostTop99pSum;
  }

  public UsageSummaryResponse incidentManagementMonthlyActiveUsersHwmSum(
      Long incidentManagementMonthlyActiveUsersHwmSum) {
    this.incidentManagementMonthlyActiveUsersHwmSum = incidentManagementMonthlyActiveUsersHwmSum;
    return this;
  }

  /**
   * Shows sum of the the high-water marks of incident management monthly active users in the
   * current months for all organizations.
   *
   * @return incidentManagementMonthlyActiveUsersHwmSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INCIDENT_MANAGEMENT_MONTHLY_ACTIVE_USERS_HWM_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getIncidentManagementMonthlyActiveUsersHwmSum() {
    return incidentManagementMonthlyActiveUsersHwmSum;
  }

  public void setIncidentManagementMonthlyActiveUsersHwmSum(
      Long incidentManagementMonthlyActiveUsersHwmSum) {
    this.incidentManagementMonthlyActiveUsersHwmSum = incidentManagementMonthlyActiveUsersHwmSum;
  }

  public UsageSummaryResponse indexedEventsCountAggSum(Long indexedEventsCountAggSum) {
    this.indexedEventsCountAggSum = indexedEventsCountAggSum;
    return this;
  }

  /**
   * Shows the sum of all log events indexed over all hours in the current months for all
   * organizations.
   *
   * @return indexedEventsCountAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INDEXED_EVENTS_COUNT_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getIndexedEventsCountAggSum() {
    return indexedEventsCountAggSum;
  }

  public void setIndexedEventsCountAggSum(Long indexedEventsCountAggSum) {
    this.indexedEventsCountAggSum = indexedEventsCountAggSum;
  }

  public UsageSummaryResponse infraHostTop99pSum(Long infraHostTop99pSum) {
    this.infraHostTop99pSum = infraHostTop99pSum;
    return this;
  }

  /**
   * Shows the 99th percentile of all distinct infrastructure hosts over all hours in the current
   * months for all organizations.
   *
   * @return infraHostTop99pSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INFRA_HOST_TOP99P_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getInfraHostTop99pSum() {
    return infraHostTop99pSum;
  }

  public void setInfraHostTop99pSum(Long infraHostTop99pSum) {
    this.infraHostTop99pSum = infraHostTop99pSum;
  }

  public UsageSummaryResponse ingestedEventsBytesAggSum(Long ingestedEventsBytesAggSum) {
    this.ingestedEventsBytesAggSum = ingestedEventsBytesAggSum;
    return this;
  }

  /**
   * Shows the sum of all log bytes ingested over all hours in the current months for all
   * organizations.
   *
   * @return ingestedEventsBytesAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INGESTED_EVENTS_BYTES_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getIngestedEventsBytesAggSum() {
    return ingestedEventsBytesAggSum;
  }

  public void setIngestedEventsBytesAggSum(Long ingestedEventsBytesAggSum) {
    this.ingestedEventsBytesAggSum = ingestedEventsBytesAggSum;
  }

  public UsageSummaryResponse iotDeviceAggSum(Long iotDeviceAggSum) {
    this.iotDeviceAggSum = iotDeviceAggSum;
    return this;
  }

  /**
   * Shows the sum of all IoT devices over all hours in the current months for all organizations.
   *
   * @return iotDeviceAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IOT_DEVICE_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getIotDeviceAggSum() {
    return iotDeviceAggSum;
  }

  public void setIotDeviceAggSum(Long iotDeviceAggSum) {
    this.iotDeviceAggSum = iotDeviceAggSum;
  }

  public UsageSummaryResponse iotDeviceTop99pSum(Long iotDeviceTop99pSum) {
    this.iotDeviceTop99pSum = iotDeviceTop99pSum;
    return this;
  }

  /**
   * Shows the 99th percentile of all IoT devices over all hours in the current months of all
   * organizations.
   *
   * @return iotDeviceTop99pSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IOT_DEVICE_TOP99P_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getIotDeviceTop99pSum() {
    return iotDeviceTop99pSum;
  }

  public void setIotDeviceTop99pSum(Long iotDeviceTop99pSum) {
    this.iotDeviceTop99pSum = iotDeviceTop99pSum;
  }

  public UsageSummaryResponse lastUpdated(OffsetDateTime lastUpdated) {
    this.lastUpdated = lastUpdated;
    return this;
  }

  /**
   * Shows the the most recent hour in the current months for all organizations for which all usages
   * were calculated.
   *
   * @return lastUpdated
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_UPDATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getLastUpdated() {
    return lastUpdated;
  }

  public void setLastUpdated(OffsetDateTime lastUpdated) {
    this.lastUpdated = lastUpdated;
  }

  public UsageSummaryResponse liveIndexedEventsAggSum(Long liveIndexedEventsAggSum) {
    this.liveIndexedEventsAggSum = liveIndexedEventsAggSum;
    return this;
  }

  /**
   * Shows the sum of all live logs indexed over all hours in the current months for all
   * organizations (data available as of December 1, 2020).
   *
   * @return liveIndexedEventsAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LIVE_INDEXED_EVENTS_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getLiveIndexedEventsAggSum() {
    return liveIndexedEventsAggSum;
  }

  public void setLiveIndexedEventsAggSum(Long liveIndexedEventsAggSum) {
    this.liveIndexedEventsAggSum = liveIndexedEventsAggSum;
  }

  public UsageSummaryResponse liveIngestedBytesAggSum(Long liveIngestedBytesAggSum) {
    this.liveIngestedBytesAggSum = liveIngestedBytesAggSum;
    return this;
  }

  /**
   * Shows the sum of all live logs bytes ingested over all hours in the current months for all
   * organizations (data available as of December 1, 2020).
   *
   * @return liveIngestedBytesAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LIVE_INGESTED_BYTES_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getLiveIngestedBytesAggSum() {
    return liveIngestedBytesAggSum;
  }

  public void setLiveIngestedBytesAggSum(Long liveIngestedBytesAggSum) {
    this.liveIngestedBytesAggSum = liveIngestedBytesAggSum;
  }

  public UsageSummaryResponse logsByRetention(LogsByRetention logsByRetention) {
    this.logsByRetention = logsByRetention;
    this.unparsed |= logsByRetention.unparsed;
    return this;
  }

  /**
   * Object containing logs usage data broken down by retention period.
   *
   * @return logsByRetention
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOGS_BY_RETENTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public LogsByRetention getLogsByRetention() {
    return logsByRetention;
  }

  public void setLogsByRetention(LogsByRetention logsByRetention) {
    this.logsByRetention = logsByRetention;
  }

  public UsageSummaryResponse mobileRumLiteSessionCountAggSum(
      Long mobileRumLiteSessionCountAggSum) {
    this.mobileRumLiteSessionCountAggSum = mobileRumLiteSessionCountAggSum;
    return this;
  }

  /**
   * Shows the sum of all mobile lite sessions over all hours in the current months for all
   * organizations.
   *
   * @return mobileRumLiteSessionCountAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MOBILE_RUM_LITE_SESSION_COUNT_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getMobileRumLiteSessionCountAggSum() {
    return mobileRumLiteSessionCountAggSum;
  }

  public void setMobileRumLiteSessionCountAggSum(Long mobileRumLiteSessionCountAggSum) {
    this.mobileRumLiteSessionCountAggSum = mobileRumLiteSessionCountAggSum;
  }

  public UsageSummaryResponse mobileRumSessionCountAggSum(Long mobileRumSessionCountAggSum) {
    this.mobileRumSessionCountAggSum = mobileRumSessionCountAggSum;
    return this;
  }

  /**
   * Shows the sum of all mobile RUM Sessions over all hours in the current months for all
   * organizations.
   *
   * @return mobileRumSessionCountAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MOBILE_RUM_SESSION_COUNT_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getMobileRumSessionCountAggSum() {
    return mobileRumSessionCountAggSum;
  }

  public void setMobileRumSessionCountAggSum(Long mobileRumSessionCountAggSum) {
    this.mobileRumSessionCountAggSum = mobileRumSessionCountAggSum;
  }

  public UsageSummaryResponse mobileRumSessionCountAndroidAggSum(
      Long mobileRumSessionCountAndroidAggSum) {
    this.mobileRumSessionCountAndroidAggSum = mobileRumSessionCountAndroidAggSum;
    return this;
  }

  /**
   * Shows the sum of all mobile RUM Sessions on Android over all hours in the current months for
   * all organizations.
   *
   * @return mobileRumSessionCountAndroidAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MOBILE_RUM_SESSION_COUNT_ANDROID_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getMobileRumSessionCountAndroidAggSum() {
    return mobileRumSessionCountAndroidAggSum;
  }

  public void setMobileRumSessionCountAndroidAggSum(Long mobileRumSessionCountAndroidAggSum) {
    this.mobileRumSessionCountAndroidAggSum = mobileRumSessionCountAndroidAggSum;
  }

  public UsageSummaryResponse mobileRumSessionCountIosAggSum(Long mobileRumSessionCountIosAggSum) {
    this.mobileRumSessionCountIosAggSum = mobileRumSessionCountIosAggSum;
    return this;
  }

  /**
   * Shows the sum of all mobile RUM Sessions on iOS over all hours in the current months for all
   * organizations.
   *
   * @return mobileRumSessionCountIosAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MOBILE_RUM_SESSION_COUNT_IOS_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getMobileRumSessionCountIosAggSum() {
    return mobileRumSessionCountIosAggSum;
  }

  public void setMobileRumSessionCountIosAggSum(Long mobileRumSessionCountIosAggSum) {
    this.mobileRumSessionCountIosAggSum = mobileRumSessionCountIosAggSum;
  }

  public UsageSummaryResponse mobileRumSessionCountReactnativeAggSum(
      Long mobileRumSessionCountReactnativeAggSum) {
    this.mobileRumSessionCountReactnativeAggSum = mobileRumSessionCountReactnativeAggSum;
    return this;
  }

  /**
   * Shows the sum of all mobile RUM Sessions on React Native over all hours in the current months
   * for all organizations.
   *
   * @return mobileRumSessionCountReactnativeAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MOBILE_RUM_SESSION_COUNT_REACTNATIVE_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getMobileRumSessionCountReactnativeAggSum() {
    return mobileRumSessionCountReactnativeAggSum;
  }

  public void setMobileRumSessionCountReactnativeAggSum(
      Long mobileRumSessionCountReactnativeAggSum) {
    this.mobileRumSessionCountReactnativeAggSum = mobileRumSessionCountReactnativeAggSum;
  }

  public UsageSummaryResponse mobileRumUnitsAggSum(Long mobileRumUnitsAggSum) {
    this.mobileRumUnitsAggSum = mobileRumUnitsAggSum;
    return this;
  }

  /**
   * Shows the sum of all mobile RUM units over all hours in the current months for all
   * organizations.
   *
   * @return mobileRumUnitsAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MOBILE_RUM_UNITS_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getMobileRumUnitsAggSum() {
    return mobileRumUnitsAggSum;
  }

  public void setMobileRumUnitsAggSum(Long mobileRumUnitsAggSum) {
    this.mobileRumUnitsAggSum = mobileRumUnitsAggSum;
  }

  public UsageSummaryResponse netflowIndexedEventsCountAggSum(
      Long netflowIndexedEventsCountAggSum) {
    this.netflowIndexedEventsCountAggSum = netflowIndexedEventsCountAggSum;
    return this;
  }

  /**
   * Shows the sum of all Network flows indexed over all hours in the current months for all
   * organizations.
   *
   * @return netflowIndexedEventsCountAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NETFLOW_INDEXED_EVENTS_COUNT_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getNetflowIndexedEventsCountAggSum() {
    return netflowIndexedEventsCountAggSum;
  }

  public void setNetflowIndexedEventsCountAggSum(Long netflowIndexedEventsCountAggSum) {
    this.netflowIndexedEventsCountAggSum = netflowIndexedEventsCountAggSum;
  }

  public UsageSummaryResponse npmHostTop99pSum(Long npmHostTop99pSum) {
    this.npmHostTop99pSum = npmHostTop99pSum;
    return this;
  }

  /**
   * Shows the 99th percentile of all distinct Networks hosts over all hours in the current months
   * for all organizations.
   *
   * @return npmHostTop99pSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NPM_HOST_TOP99P_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getNpmHostTop99pSum() {
    return npmHostTop99pSum;
  }

  public void setNpmHostTop99pSum(Long npmHostTop99pSum) {
    this.npmHostTop99pSum = npmHostTop99pSum;
  }

  public UsageSummaryResponse observabilityPipelinesBytesProcessedAggSum(
      Long observabilityPipelinesBytesProcessedAggSum) {
    this.observabilityPipelinesBytesProcessedAggSum = observabilityPipelinesBytesProcessedAggSum;
    return this;
  }

  /**
   * Sum of all observability pipelines bytes processed over all hours in the current months for all
   * organizations.
   *
   * @return observabilityPipelinesBytesProcessedAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OBSERVABILITY_PIPELINES_BYTES_PROCESSED_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getObservabilityPipelinesBytesProcessedAggSum() {
    return observabilityPipelinesBytesProcessedAggSum;
  }

  public void setObservabilityPipelinesBytesProcessedAggSum(
      Long observabilityPipelinesBytesProcessedAggSum) {
    this.observabilityPipelinesBytesProcessedAggSum = observabilityPipelinesBytesProcessedAggSum;
  }

  public UsageSummaryResponse onlineArchiveEventsCountAggSum(Long onlineArchiveEventsCountAggSum) {
    this.onlineArchiveEventsCountAggSum = onlineArchiveEventsCountAggSum;
    return this;
  }

  /**
   * Sum of all online archived events over all hours in the current months for all organizations.
   *
   * @return onlineArchiveEventsCountAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ONLINE_ARCHIVE_EVENTS_COUNT_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getOnlineArchiveEventsCountAggSum() {
    return onlineArchiveEventsCountAggSum;
  }

  public void setOnlineArchiveEventsCountAggSum(Long onlineArchiveEventsCountAggSum) {
    this.onlineArchiveEventsCountAggSum = onlineArchiveEventsCountAggSum;
  }

  public UsageSummaryResponse opentelemetryApmHostTop99pSum(Long opentelemetryApmHostTop99pSum) {
    this.opentelemetryApmHostTop99pSum = opentelemetryApmHostTop99pSum;
    return this;
  }

  /**
   * Shows the 99th percentile of APM hosts reported by the Datadog exporter for the OpenTelemetry
   * Collector over all hours in the current months for all organizations.
   *
   * @return opentelemetryApmHostTop99pSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OPENTELEMETRY_APM_HOST_TOP99P_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getOpentelemetryApmHostTop99pSum() {
    return opentelemetryApmHostTop99pSum;
  }

  public void setOpentelemetryApmHostTop99pSum(Long opentelemetryApmHostTop99pSum) {
    this.opentelemetryApmHostTop99pSum = opentelemetryApmHostTop99pSum;
  }

  public UsageSummaryResponse opentelemetryHostTop99pSum(Long opentelemetryHostTop99pSum) {
    this.opentelemetryHostTop99pSum = opentelemetryHostTop99pSum;
    return this;
  }

  /**
   * Shows the 99th percentile of all hosts reported by the Datadog exporter for the OpenTelemetry
   * Collector over all hours in the current months for all organizations.
   *
   * @return opentelemetryHostTop99pSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OPENTELEMETRY_HOST_TOP99P_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getOpentelemetryHostTop99pSum() {
    return opentelemetryHostTop99pSum;
  }

  public void setOpentelemetryHostTop99pSum(Long opentelemetryHostTop99pSum) {
    this.opentelemetryHostTop99pSum = opentelemetryHostTop99pSum;
  }

  public UsageSummaryResponse profilingContainerAgentCountAvg(
      Long profilingContainerAgentCountAvg) {
    this.profilingContainerAgentCountAvg = profilingContainerAgentCountAvg;
    return this;
  }

  /**
   * Shows the average number of profiled containers over all hours in the current months for all
   * organizations.
   *
   * @return profilingContainerAgentCountAvg
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROFILING_CONTAINER_AGENT_COUNT_AVG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getProfilingContainerAgentCountAvg() {
    return profilingContainerAgentCountAvg;
  }

  public void setProfilingContainerAgentCountAvg(Long profilingContainerAgentCountAvg) {
    this.profilingContainerAgentCountAvg = profilingContainerAgentCountAvg;
  }

  public UsageSummaryResponse profilingHostCountTop99pSum(Long profilingHostCountTop99pSum) {
    this.profilingHostCountTop99pSum = profilingHostCountTop99pSum;
    return this;
  }

  /**
   * Shows the 99th percentile of all profiled hosts over all hours in the current months for all
   * organizations.
   *
   * @return profilingHostCountTop99pSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROFILING_HOST_COUNT_TOP99P_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getProfilingHostCountTop99pSum() {
    return profilingHostCountTop99pSum;
  }

  public void setProfilingHostCountTop99pSum(Long profilingHostCountTop99pSum) {
    this.profilingHostCountTop99pSum = profilingHostCountTop99pSum;
  }

  public UsageSummaryResponse rehydratedIndexedEventsAggSum(Long rehydratedIndexedEventsAggSum) {
    this.rehydratedIndexedEventsAggSum = rehydratedIndexedEventsAggSum;
    return this;
  }

  /**
   * Shows the sum of all rehydrated logs indexed over all hours in the current months for all
   * organizations (data available as of December 1, 2020).
   *
   * @return rehydratedIndexedEventsAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REHYDRATED_INDEXED_EVENTS_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getRehydratedIndexedEventsAggSum() {
    return rehydratedIndexedEventsAggSum;
  }

  public void setRehydratedIndexedEventsAggSum(Long rehydratedIndexedEventsAggSum) {
    this.rehydratedIndexedEventsAggSum = rehydratedIndexedEventsAggSum;
  }

  public UsageSummaryResponse rehydratedIngestedBytesAggSum(Long rehydratedIngestedBytesAggSum) {
    this.rehydratedIngestedBytesAggSum = rehydratedIngestedBytesAggSum;
    return this;
  }

  /**
   * Shows the sum of all rehydrated logs bytes ingested over all hours in the current months for
   * all organizations (data available as of December 1, 2020).
   *
   * @return rehydratedIngestedBytesAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REHYDRATED_INGESTED_BYTES_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getRehydratedIngestedBytesAggSum() {
    return rehydratedIngestedBytesAggSum;
  }

  public void setRehydratedIngestedBytesAggSum(Long rehydratedIngestedBytesAggSum) {
    this.rehydratedIngestedBytesAggSum = rehydratedIngestedBytesAggSum;
  }

  public UsageSummaryResponse rumBrowserAndMobileSessionCount(
      Long rumBrowserAndMobileSessionCount) {
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

  public UsageSummaryResponse rumSessionCountAggSum(Long rumSessionCountAggSum) {
    this.rumSessionCountAggSum = rumSessionCountAggSum;
    return this;
  }

  /**
   * Shows the sum of all browser RUM Lite Sessions over all hours in the current months for all
   * organizations.
   *
   * @return rumSessionCountAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RUM_SESSION_COUNT_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getRumSessionCountAggSum() {
    return rumSessionCountAggSum;
  }

  public void setRumSessionCountAggSum(Long rumSessionCountAggSum) {
    this.rumSessionCountAggSum = rumSessionCountAggSum;
  }

  public UsageSummaryResponse rumTotalSessionCountAggSum(Long rumTotalSessionCountAggSum) {
    this.rumTotalSessionCountAggSum = rumTotalSessionCountAggSum;
    return this;
  }

  /**
   * Shows the sum of RUM Sessions (browser and mobile) over all hours in the current months for all
   * organizations.
   *
   * @return rumTotalSessionCountAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RUM_TOTAL_SESSION_COUNT_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getRumTotalSessionCountAggSum() {
    return rumTotalSessionCountAggSum;
  }

  public void setRumTotalSessionCountAggSum(Long rumTotalSessionCountAggSum) {
    this.rumTotalSessionCountAggSum = rumTotalSessionCountAggSum;
  }

  public UsageSummaryResponse rumUnitsAggSum(Long rumUnitsAggSum) {
    this.rumUnitsAggSum = rumUnitsAggSum;
    return this;
  }

  /**
   * Shows the sum of all browser and mobile RUM units over all hours in the current months for all
   * organizations.
   *
   * @return rumUnitsAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RUM_UNITS_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getRumUnitsAggSum() {
    return rumUnitsAggSum;
  }

  public void setRumUnitsAggSum(Long rumUnitsAggSum) {
    this.rumUnitsAggSum = rumUnitsAggSum;
  }

  public UsageSummaryResponse sdsApmScannedBytesSum(Long sdsApmScannedBytesSum) {
    this.sdsApmScannedBytesSum = sdsApmScannedBytesSum;
    return this;
  }

  /**
   * Sum of all APM bytes scanned with sensitive data scanner in the current months for all
   * organizations.
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

  public UsageSummaryResponse sdsEventsScannedBytesSum(Long sdsEventsScannedBytesSum) {
    this.sdsEventsScannedBytesSum = sdsEventsScannedBytesSum;
    return this;
  }

  /**
   * Sum of all event stream events bytes scanned with sensitive data scanner in the current months
   * for all organizations.
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

  public UsageSummaryResponse sdsLogsScannedBytesSum(Long sdsLogsScannedBytesSum) {
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

  public UsageSummaryResponse sdsRumScannedBytesSum(Long sdsRumScannedBytesSum) {
    this.sdsRumScannedBytesSum = sdsRumScannedBytesSum;
    return this;
  }

  /**
   * Sum of all RUM bytes scanned with sensitive data scanner in the current months for all
   * organizations.
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

  public UsageSummaryResponse sdsTotalScannedBytesSum(Long sdsTotalScannedBytesSum) {
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

  public UsageSummaryResponse startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Shows the first date of usage in the current months for all organizations.
   *
   * @return startDate
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_START_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }

  public UsageSummaryResponse syntheticsBrowserCheckCallsCountAggSum(
      Long syntheticsBrowserCheckCallsCountAggSum) {
    this.syntheticsBrowserCheckCallsCountAggSum = syntheticsBrowserCheckCallsCountAggSum;
    return this;
  }

  /**
   * Shows the sum of all Synthetic browser tests over all hours in the current months for all
   * organizations.
   *
   * @return syntheticsBrowserCheckCallsCountAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SYNTHETICS_BROWSER_CHECK_CALLS_COUNT_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getSyntheticsBrowserCheckCallsCountAggSum() {
    return syntheticsBrowserCheckCallsCountAggSum;
  }

  public void setSyntheticsBrowserCheckCallsCountAggSum(
      Long syntheticsBrowserCheckCallsCountAggSum) {
    this.syntheticsBrowserCheckCallsCountAggSum = syntheticsBrowserCheckCallsCountAggSum;
  }

  public UsageSummaryResponse syntheticsCheckCallsCountAggSum(
      Long syntheticsCheckCallsCountAggSum) {
    this.syntheticsCheckCallsCountAggSum = syntheticsCheckCallsCountAggSum;
    return this;
  }

  /**
   * Shows the sum of all Synthetic API tests over all hours in the current months for all
   * organizations.
   *
   * @return syntheticsCheckCallsCountAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SYNTHETICS_CHECK_CALLS_COUNT_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getSyntheticsCheckCallsCountAggSum() {
    return syntheticsCheckCallsCountAggSum;
  }

  public void setSyntheticsCheckCallsCountAggSum(Long syntheticsCheckCallsCountAggSum) {
    this.syntheticsCheckCallsCountAggSum = syntheticsCheckCallsCountAggSum;
  }

  public UsageSummaryResponse traceSearchIndexedEventsCountAggSum(
      Long traceSearchIndexedEventsCountAggSum) {
    this.traceSearchIndexedEventsCountAggSum = traceSearchIndexedEventsCountAggSum;
    return this;
  }

  /**
   * Shows the sum of all Indexed Spans indexed over all hours in the current months for all
   * organizations.
   *
   * @return traceSearchIndexedEventsCountAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRACE_SEARCH_INDEXED_EVENTS_COUNT_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getTraceSearchIndexedEventsCountAggSum() {
    return traceSearchIndexedEventsCountAggSum;
  }

  public void setTraceSearchIndexedEventsCountAggSum(Long traceSearchIndexedEventsCountAggSum) {
    this.traceSearchIndexedEventsCountAggSum = traceSearchIndexedEventsCountAggSum;
  }

  public UsageSummaryResponse twolIngestedEventsBytesAggSum(Long twolIngestedEventsBytesAggSum) {
    this.twolIngestedEventsBytesAggSum = twolIngestedEventsBytesAggSum;
    return this;
  }

  /**
   * Shows the sum of all ingested APM span bytes over all hours in the current months for all
   * organizations.
   *
   * @return twolIngestedEventsBytesAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TWOL_INGESTED_EVENTS_BYTES_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getTwolIngestedEventsBytesAggSum() {
    return twolIngestedEventsBytesAggSum;
  }

  public void setTwolIngestedEventsBytesAggSum(Long twolIngestedEventsBytesAggSum) {
    this.twolIngestedEventsBytesAggSum = twolIngestedEventsBytesAggSum;
  }

  public UsageSummaryResponse usage(List<UsageSummaryDate> usage) {
    this.usage = usage;
    for (UsageSummaryDate item : usage) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public UsageSummaryResponse addUsageItem(UsageSummaryDate usageItem) {
    if (this.usage == null) {
      this.usage = new ArrayList<>();
    }
    this.usage.add(usageItem);
    this.unparsed |= usageItem.unparsed;
    return this;
  }

  /**
   * An array of objects regarding hourly usage.
   *
   * @return usage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<UsageSummaryDate> getUsage() {
    return usage;
  }

  public void setUsage(List<UsageSummaryDate> usage) {
    this.usage = usage;
  }

  public UsageSummaryResponse vsphereHostTop99pSum(Long vsphereHostTop99pSum) {
    this.vsphereHostTop99pSum = vsphereHostTop99pSum;
    return this;
  }

  /**
   * Shows the 99th percentile of all vSphere hosts over all hours in the current months for all
   * organizations.
   *
   * @return vsphereHostTop99pSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VSPHERE_HOST_TOP99P_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getVsphereHostTop99pSum() {
    return vsphereHostTop99pSum;
  }

  public void setVsphereHostTop99pSum(Long vsphereHostTop99pSum) {
    this.vsphereHostTop99pSum = vsphereHostTop99pSum;
  }

  /** Return true if this UsageSummaryResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsageSummaryResponse usageSummaryResponse = (UsageSummaryResponse) o;
    return Objects.equals(this.agentHostTop99pSum, usageSummaryResponse.agentHostTop99pSum)
        && Objects.equals(
            this.apmAzureAppServiceHostTop99pSum,
            usageSummaryResponse.apmAzureAppServiceHostTop99pSum)
        && Objects.equals(this.apmFargateCountAvgSum, usageSummaryResponse.apmFargateCountAvgSum)
        && Objects.equals(this.apmHostTop99pSum, usageSummaryResponse.apmHostTop99pSum)
        && Objects.equals(
            this.appsecFargateCountAvgSum, usageSummaryResponse.appsecFargateCountAvgSum)
        && Objects.equals(
            this.auditLogsLinesIndexedAggSum, usageSummaryResponse.auditLogsLinesIndexedAggSum)
        && Objects.equals(
            this.avgProfiledFargateTasksSum, usageSummaryResponse.avgProfiledFargateTasksSum)
        && Objects.equals(this.awsHostTop99pSum, usageSummaryResponse.awsHostTop99pSum)
        && Objects.equals(this.awsLambdaFuncCount, usageSummaryResponse.awsLambdaFuncCount)
        && Objects.equals(
            this.awsLambdaInvocationsSum, usageSummaryResponse.awsLambdaInvocationsSum)
        && Objects.equals(
            this.azureAppServiceTop99pSum, usageSummaryResponse.azureAppServiceTop99pSum)
        && Objects.equals(this.azureHostTop99pSum, usageSummaryResponse.azureHostTop99pSum)
        && Objects.equals(
            this.billableIngestedBytesAggSum, usageSummaryResponse.billableIngestedBytesAggSum)
        && Objects.equals(
            this.browserRumLiteSessionCountAggSum,
            usageSummaryResponse.browserRumLiteSessionCountAggSum)
        && Objects.equals(
            this.browserRumReplaySessionCountAggSum,
            usageSummaryResponse.browserRumReplaySessionCountAggSum)
        && Objects.equals(this.browserRumUnitsAggSum, usageSummaryResponse.browserRumUnitsAggSum)
        && Objects.equals(
            this.ciPipelineIndexedSpansAggSum, usageSummaryResponse.ciPipelineIndexedSpansAggSum)
        && Objects.equals(
            this.ciTestIndexedSpansAggSum, usageSummaryResponse.ciTestIndexedSpansAggSum)
        && Objects.equals(
            this.ciVisibilityPipelineCommittersHwmSum,
            usageSummaryResponse.ciVisibilityPipelineCommittersHwmSum)
        && Objects.equals(
            this.ciVisibilityTestCommittersHwmSum,
            usageSummaryResponse.ciVisibilityTestCommittersHwmSum)
        && Objects.equals(this.containerAvgSum, usageSummaryResponse.containerAvgSum)
        && Objects.equals(this.containerHwmSum, usageSummaryResponse.containerHwmSum)
        && Objects.equals(this.cspmAasHostTop99pSum, usageSummaryResponse.cspmAasHostTop99pSum)
        && Objects.equals(this.cspmAwsHostTop99pSum, usageSummaryResponse.cspmAwsHostTop99pSum)
        && Objects.equals(this.cspmAzureHostTop99pSum, usageSummaryResponse.cspmAzureHostTop99pSum)
        && Objects.equals(this.cspmContainerAvgSum, usageSummaryResponse.cspmContainerAvgSum)
        && Objects.equals(this.cspmContainerHwmSum, usageSummaryResponse.cspmContainerHwmSum)
        && Objects.equals(this.cspmGcpHostTop99pSum, usageSummaryResponse.cspmGcpHostTop99pSum)
        && Objects.equals(this.cspmHostTop99pSum, usageSummaryResponse.cspmHostTop99pSum)
        && Objects.equals(this.customTsSum, usageSummaryResponse.customTsSum)
        && Objects.equals(this.cwsContainersAvgSum, usageSummaryResponse.cwsContainersAvgSum)
        && Objects.equals(this.cwsHostTop99pSum, usageSummaryResponse.cwsHostTop99pSum)
        && Objects.equals(this.dbmHostTop99pSum, usageSummaryResponse.dbmHostTop99pSum)
        && Objects.equals(this.dbmQueriesAvgSum, usageSummaryResponse.dbmQueriesAvgSum)
        && Objects.equals(this.endDate, usageSummaryResponse.endDate)
        && Objects.equals(
            this.fargateTasksCountAvgSum, usageSummaryResponse.fargateTasksCountAvgSum)
        && Objects.equals(
            this.fargateTasksCountHwmSum, usageSummaryResponse.fargateTasksCountHwmSum)
        && Objects.equals(this.gcpHostTop99pSum, usageSummaryResponse.gcpHostTop99pSum)
        && Objects.equals(this.herokuHostTop99pSum, usageSummaryResponse.herokuHostTop99pSum)
        && Objects.equals(
            this.incidentManagementMonthlyActiveUsersHwmSum,
            usageSummaryResponse.incidentManagementMonthlyActiveUsersHwmSum)
        && Objects.equals(
            this.indexedEventsCountAggSum, usageSummaryResponse.indexedEventsCountAggSum)
        && Objects.equals(this.infraHostTop99pSum, usageSummaryResponse.infraHostTop99pSum)
        && Objects.equals(
            this.ingestedEventsBytesAggSum, usageSummaryResponse.ingestedEventsBytesAggSum)
        && Objects.equals(this.iotDeviceAggSum, usageSummaryResponse.iotDeviceAggSum)
        && Objects.equals(this.iotDeviceTop99pSum, usageSummaryResponse.iotDeviceTop99pSum)
        && Objects.equals(this.lastUpdated, usageSummaryResponse.lastUpdated)
        && Objects.equals(
            this.liveIndexedEventsAggSum, usageSummaryResponse.liveIndexedEventsAggSum)
        && Objects.equals(
            this.liveIngestedBytesAggSum, usageSummaryResponse.liveIngestedBytesAggSum)
        && Objects.equals(this.logsByRetention, usageSummaryResponse.logsByRetention)
        && Objects.equals(
            this.mobileRumLiteSessionCountAggSum,
            usageSummaryResponse.mobileRumLiteSessionCountAggSum)
        && Objects.equals(
            this.mobileRumSessionCountAggSum, usageSummaryResponse.mobileRumSessionCountAggSum)
        && Objects.equals(
            this.mobileRumSessionCountAndroidAggSum,
            usageSummaryResponse.mobileRumSessionCountAndroidAggSum)
        && Objects.equals(
            this.mobileRumSessionCountIosAggSum,
            usageSummaryResponse.mobileRumSessionCountIosAggSum)
        && Objects.equals(
            this.mobileRumSessionCountReactnativeAggSum,
            usageSummaryResponse.mobileRumSessionCountReactnativeAggSum)
        && Objects.equals(this.mobileRumUnitsAggSum, usageSummaryResponse.mobileRumUnitsAggSum)
        && Objects.equals(
            this.netflowIndexedEventsCountAggSum,
            usageSummaryResponse.netflowIndexedEventsCountAggSum)
        && Objects.equals(this.npmHostTop99pSum, usageSummaryResponse.npmHostTop99pSum)
        && Objects.equals(
            this.observabilityPipelinesBytesProcessedAggSum,
            usageSummaryResponse.observabilityPipelinesBytesProcessedAggSum)
        && Objects.equals(
            this.onlineArchiveEventsCountAggSum,
            usageSummaryResponse.onlineArchiveEventsCountAggSum)
        && Objects.equals(
            this.opentelemetryApmHostTop99pSum, usageSummaryResponse.opentelemetryApmHostTop99pSum)
        && Objects.equals(
            this.opentelemetryHostTop99pSum, usageSummaryResponse.opentelemetryHostTop99pSum)
        && Objects.equals(
            this.profilingContainerAgentCountAvg,
            usageSummaryResponse.profilingContainerAgentCountAvg)
        && Objects.equals(
            this.profilingHostCountTop99pSum, usageSummaryResponse.profilingHostCountTop99pSum)
        && Objects.equals(
            this.rehydratedIndexedEventsAggSum, usageSummaryResponse.rehydratedIndexedEventsAggSum)
        && Objects.equals(
            this.rehydratedIngestedBytesAggSum, usageSummaryResponse.rehydratedIngestedBytesAggSum)
        && Objects.equals(
            this.rumBrowserAndMobileSessionCount,
            usageSummaryResponse.rumBrowserAndMobileSessionCount)
        && Objects.equals(this.rumSessionCountAggSum, usageSummaryResponse.rumSessionCountAggSum)
        && Objects.equals(
            this.rumTotalSessionCountAggSum, usageSummaryResponse.rumTotalSessionCountAggSum)
        && Objects.equals(this.rumUnitsAggSum, usageSummaryResponse.rumUnitsAggSum)
        && Objects.equals(this.sdsApmScannedBytesSum, usageSummaryResponse.sdsApmScannedBytesSum)
        && Objects.equals(
            this.sdsEventsScannedBytesSum, usageSummaryResponse.sdsEventsScannedBytesSum)
        && Objects.equals(this.sdsLogsScannedBytesSum, usageSummaryResponse.sdsLogsScannedBytesSum)
        && Objects.equals(this.sdsRumScannedBytesSum, usageSummaryResponse.sdsRumScannedBytesSum)
        && Objects.equals(
            this.sdsTotalScannedBytesSum, usageSummaryResponse.sdsTotalScannedBytesSum)
        && Objects.equals(this.startDate, usageSummaryResponse.startDate)
        && Objects.equals(
            this.syntheticsBrowserCheckCallsCountAggSum,
            usageSummaryResponse.syntheticsBrowserCheckCallsCountAggSum)
        && Objects.equals(
            this.syntheticsCheckCallsCountAggSum,
            usageSummaryResponse.syntheticsCheckCallsCountAggSum)
        && Objects.equals(
            this.traceSearchIndexedEventsCountAggSum,
            usageSummaryResponse.traceSearchIndexedEventsCountAggSum)
        && Objects.equals(
            this.twolIngestedEventsBytesAggSum, usageSummaryResponse.twolIngestedEventsBytesAggSum)
        && Objects.equals(this.usage, usageSummaryResponse.usage)
        && Objects.equals(this.vsphereHostTop99pSum, usageSummaryResponse.vsphereHostTop99pSum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        agentHostTop99pSum,
        apmAzureAppServiceHostTop99pSum,
        apmFargateCountAvgSum,
        apmHostTop99pSum,
        appsecFargateCountAvgSum,
        auditLogsLinesIndexedAggSum,
        avgProfiledFargateTasksSum,
        awsHostTop99pSum,
        awsLambdaFuncCount,
        awsLambdaInvocationsSum,
        azureAppServiceTop99pSum,
        azureHostTop99pSum,
        billableIngestedBytesAggSum,
        browserRumLiteSessionCountAggSum,
        browserRumReplaySessionCountAggSum,
        browserRumUnitsAggSum,
        ciPipelineIndexedSpansAggSum,
        ciTestIndexedSpansAggSum,
        ciVisibilityPipelineCommittersHwmSum,
        ciVisibilityTestCommittersHwmSum,
        containerAvgSum,
        containerHwmSum,
        cspmAasHostTop99pSum,
        cspmAwsHostTop99pSum,
        cspmAzureHostTop99pSum,
        cspmContainerAvgSum,
        cspmContainerHwmSum,
        cspmGcpHostTop99pSum,
        cspmHostTop99pSum,
        customTsSum,
        cwsContainersAvgSum,
        cwsHostTop99pSum,
        dbmHostTop99pSum,
        dbmQueriesAvgSum,
        endDate,
        fargateTasksCountAvgSum,
        fargateTasksCountHwmSum,
        gcpHostTop99pSum,
        herokuHostTop99pSum,
        incidentManagementMonthlyActiveUsersHwmSum,
        indexedEventsCountAggSum,
        infraHostTop99pSum,
        ingestedEventsBytesAggSum,
        iotDeviceAggSum,
        iotDeviceTop99pSum,
        lastUpdated,
        liveIndexedEventsAggSum,
        liveIngestedBytesAggSum,
        logsByRetention,
        mobileRumLiteSessionCountAggSum,
        mobileRumSessionCountAggSum,
        mobileRumSessionCountAndroidAggSum,
        mobileRumSessionCountIosAggSum,
        mobileRumSessionCountReactnativeAggSum,
        mobileRumUnitsAggSum,
        netflowIndexedEventsCountAggSum,
        npmHostTop99pSum,
        observabilityPipelinesBytesProcessedAggSum,
        onlineArchiveEventsCountAggSum,
        opentelemetryApmHostTop99pSum,
        opentelemetryHostTop99pSum,
        profilingContainerAgentCountAvg,
        profilingHostCountTop99pSum,
        rehydratedIndexedEventsAggSum,
        rehydratedIngestedBytesAggSum,
        rumBrowserAndMobileSessionCount,
        rumSessionCountAggSum,
        rumTotalSessionCountAggSum,
        rumUnitsAggSum,
        sdsApmScannedBytesSum,
        sdsEventsScannedBytesSum,
        sdsLogsScannedBytesSum,
        sdsRumScannedBytesSum,
        sdsTotalScannedBytesSum,
        startDate,
        syntheticsBrowserCheckCallsCountAggSum,
        syntheticsCheckCallsCountAggSum,
        traceSearchIndexedEventsCountAggSum,
        twolIngestedEventsBytesAggSum,
        usage,
        vsphereHostTop99pSum);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageSummaryResponse {\n");
    sb.append("    agentHostTop99pSum: ").append(toIndentedString(agentHostTop99pSum)).append("\n");
    sb.append("    apmAzureAppServiceHostTop99pSum: ")
        .append(toIndentedString(apmAzureAppServiceHostTop99pSum))
        .append("\n");
    sb.append("    apmFargateCountAvgSum: ")
        .append(toIndentedString(apmFargateCountAvgSum))
        .append("\n");
    sb.append("    apmHostTop99pSum: ").append(toIndentedString(apmHostTop99pSum)).append("\n");
    sb.append("    appsecFargateCountAvgSum: ")
        .append(toIndentedString(appsecFargateCountAvgSum))
        .append("\n");
    sb.append("    auditLogsLinesIndexedAggSum: ")
        .append(toIndentedString(auditLogsLinesIndexedAggSum))
        .append("\n");
    sb.append("    avgProfiledFargateTasksSum: ")
        .append(toIndentedString(avgProfiledFargateTasksSum))
        .append("\n");
    sb.append("    awsHostTop99pSum: ").append(toIndentedString(awsHostTop99pSum)).append("\n");
    sb.append("    awsLambdaFuncCount: ").append(toIndentedString(awsLambdaFuncCount)).append("\n");
    sb.append("    awsLambdaInvocationsSum: ")
        .append(toIndentedString(awsLambdaInvocationsSum))
        .append("\n");
    sb.append("    azureAppServiceTop99pSum: ")
        .append(toIndentedString(azureAppServiceTop99pSum))
        .append("\n");
    sb.append("    azureHostTop99pSum: ").append(toIndentedString(azureHostTop99pSum)).append("\n");
    sb.append("    billableIngestedBytesAggSum: ")
        .append(toIndentedString(billableIngestedBytesAggSum))
        .append("\n");
    sb.append("    browserRumLiteSessionCountAggSum: ")
        .append(toIndentedString(browserRumLiteSessionCountAggSum))
        .append("\n");
    sb.append("    browserRumReplaySessionCountAggSum: ")
        .append(toIndentedString(browserRumReplaySessionCountAggSum))
        .append("\n");
    sb.append("    browserRumUnitsAggSum: ")
        .append(toIndentedString(browserRumUnitsAggSum))
        .append("\n");
    sb.append("    ciPipelineIndexedSpansAggSum: ")
        .append(toIndentedString(ciPipelineIndexedSpansAggSum))
        .append("\n");
    sb.append("    ciTestIndexedSpansAggSum: ")
        .append(toIndentedString(ciTestIndexedSpansAggSum))
        .append("\n");
    sb.append("    ciVisibilityPipelineCommittersHwmSum: ")
        .append(toIndentedString(ciVisibilityPipelineCommittersHwmSum))
        .append("\n");
    sb.append("    ciVisibilityTestCommittersHwmSum: ")
        .append(toIndentedString(ciVisibilityTestCommittersHwmSum))
        .append("\n");
    sb.append("    containerAvgSum: ").append(toIndentedString(containerAvgSum)).append("\n");
    sb.append("    containerHwmSum: ").append(toIndentedString(containerHwmSum)).append("\n");
    sb.append("    cspmAasHostTop99pSum: ")
        .append(toIndentedString(cspmAasHostTop99pSum))
        .append("\n");
    sb.append("    cspmAwsHostTop99pSum: ")
        .append(toIndentedString(cspmAwsHostTop99pSum))
        .append("\n");
    sb.append("    cspmAzureHostTop99pSum: ")
        .append(toIndentedString(cspmAzureHostTop99pSum))
        .append("\n");
    sb.append("    cspmContainerAvgSum: ")
        .append(toIndentedString(cspmContainerAvgSum))
        .append("\n");
    sb.append("    cspmContainerHwmSum: ")
        .append(toIndentedString(cspmContainerHwmSum))
        .append("\n");
    sb.append("    cspmGcpHostTop99pSum: ")
        .append(toIndentedString(cspmGcpHostTop99pSum))
        .append("\n");
    sb.append("    cspmHostTop99pSum: ").append(toIndentedString(cspmHostTop99pSum)).append("\n");
    sb.append("    customTsSum: ").append(toIndentedString(customTsSum)).append("\n");
    sb.append("    cwsContainersAvgSum: ")
        .append(toIndentedString(cwsContainersAvgSum))
        .append("\n");
    sb.append("    cwsHostTop99pSum: ").append(toIndentedString(cwsHostTop99pSum)).append("\n");
    sb.append("    dbmHostTop99pSum: ").append(toIndentedString(dbmHostTop99pSum)).append("\n");
    sb.append("    dbmQueriesAvgSum: ").append(toIndentedString(dbmQueriesAvgSum)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    fargateTasksCountAvgSum: ")
        .append(toIndentedString(fargateTasksCountAvgSum))
        .append("\n");
    sb.append("    fargateTasksCountHwmSum: ")
        .append(toIndentedString(fargateTasksCountHwmSum))
        .append("\n");
    sb.append("    gcpHostTop99pSum: ").append(toIndentedString(gcpHostTop99pSum)).append("\n");
    sb.append("    herokuHostTop99pSum: ")
        .append(toIndentedString(herokuHostTop99pSum))
        .append("\n");
    sb.append("    incidentManagementMonthlyActiveUsersHwmSum: ")
        .append(toIndentedString(incidentManagementMonthlyActiveUsersHwmSum))
        .append("\n");
    sb.append("    indexedEventsCountAggSum: ")
        .append(toIndentedString(indexedEventsCountAggSum))
        .append("\n");
    sb.append("    infraHostTop99pSum: ").append(toIndentedString(infraHostTop99pSum)).append("\n");
    sb.append("    ingestedEventsBytesAggSum: ")
        .append(toIndentedString(ingestedEventsBytesAggSum))
        .append("\n");
    sb.append("    iotDeviceAggSum: ").append(toIndentedString(iotDeviceAggSum)).append("\n");
    sb.append("    iotDeviceTop99pSum: ").append(toIndentedString(iotDeviceTop99pSum)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
    sb.append("    liveIndexedEventsAggSum: ")
        .append(toIndentedString(liveIndexedEventsAggSum))
        .append("\n");
    sb.append("    liveIngestedBytesAggSum: ")
        .append(toIndentedString(liveIngestedBytesAggSum))
        .append("\n");
    sb.append("    logsByRetention: ").append(toIndentedString(logsByRetention)).append("\n");
    sb.append("    mobileRumLiteSessionCountAggSum: ")
        .append(toIndentedString(mobileRumLiteSessionCountAggSum))
        .append("\n");
    sb.append("    mobileRumSessionCountAggSum: ")
        .append(toIndentedString(mobileRumSessionCountAggSum))
        .append("\n");
    sb.append("    mobileRumSessionCountAndroidAggSum: ")
        .append(toIndentedString(mobileRumSessionCountAndroidAggSum))
        .append("\n");
    sb.append("    mobileRumSessionCountIosAggSum: ")
        .append(toIndentedString(mobileRumSessionCountIosAggSum))
        .append("\n");
    sb.append("    mobileRumSessionCountReactnativeAggSum: ")
        .append(toIndentedString(mobileRumSessionCountReactnativeAggSum))
        .append("\n");
    sb.append("    mobileRumUnitsAggSum: ")
        .append(toIndentedString(mobileRumUnitsAggSum))
        .append("\n");
    sb.append("    netflowIndexedEventsCountAggSum: ")
        .append(toIndentedString(netflowIndexedEventsCountAggSum))
        .append("\n");
    sb.append("    npmHostTop99pSum: ").append(toIndentedString(npmHostTop99pSum)).append("\n");
    sb.append("    observabilityPipelinesBytesProcessedAggSum: ")
        .append(toIndentedString(observabilityPipelinesBytesProcessedAggSum))
        .append("\n");
    sb.append("    onlineArchiveEventsCountAggSum: ")
        .append(toIndentedString(onlineArchiveEventsCountAggSum))
        .append("\n");
    sb.append("    opentelemetryApmHostTop99pSum: ")
        .append(toIndentedString(opentelemetryApmHostTop99pSum))
        .append("\n");
    sb.append("    opentelemetryHostTop99pSum: ")
        .append(toIndentedString(opentelemetryHostTop99pSum))
        .append("\n");
    sb.append("    profilingContainerAgentCountAvg: ")
        .append(toIndentedString(profilingContainerAgentCountAvg))
        .append("\n");
    sb.append("    profilingHostCountTop99pSum: ")
        .append(toIndentedString(profilingHostCountTop99pSum))
        .append("\n");
    sb.append("    rehydratedIndexedEventsAggSum: ")
        .append(toIndentedString(rehydratedIndexedEventsAggSum))
        .append("\n");
    sb.append("    rehydratedIngestedBytesAggSum: ")
        .append(toIndentedString(rehydratedIngestedBytesAggSum))
        .append("\n");
    sb.append("    rumBrowserAndMobileSessionCount: ")
        .append(toIndentedString(rumBrowserAndMobileSessionCount))
        .append("\n");
    sb.append("    rumSessionCountAggSum: ")
        .append(toIndentedString(rumSessionCountAggSum))
        .append("\n");
    sb.append("    rumTotalSessionCountAggSum: ")
        .append(toIndentedString(rumTotalSessionCountAggSum))
        .append("\n");
    sb.append("    rumUnitsAggSum: ").append(toIndentedString(rumUnitsAggSum)).append("\n");
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
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    syntheticsBrowserCheckCallsCountAggSum: ")
        .append(toIndentedString(syntheticsBrowserCheckCallsCountAggSum))
        .append("\n");
    sb.append("    syntheticsCheckCallsCountAggSum: ")
        .append(toIndentedString(syntheticsCheckCallsCountAggSum))
        .append("\n");
    sb.append("    traceSearchIndexedEventsCountAggSum: ")
        .append(toIndentedString(traceSearchIndexedEventsCountAggSum))
        .append("\n");
    sb.append("    twolIngestedEventsBytesAggSum: ")
        .append(toIndentedString(twolIngestedEventsBytesAggSum))
        .append("\n");
    sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
    sb.append("    vsphereHostTop99pSum: ")
        .append(toIndentedString(vsphereHostTop99pSum))
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
