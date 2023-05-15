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

/** Global hourly report of all data billed by Datadog for a given organization. */
@JsonPropertyOrder({
  UsageSummaryDateOrg.JSON_PROPERTY_AGENT_HOST_TOP99P,
  UsageSummaryDateOrg.JSON_PROPERTY_APM_AZURE_APP_SERVICE_HOST_TOP99P,
  UsageSummaryDateOrg.JSON_PROPERTY_APM_FARGATE_COUNT_AVG,
  UsageSummaryDateOrg.JSON_PROPERTY_APM_HOST_TOP99P,
  UsageSummaryDateOrg.JSON_PROPERTY_APPSEC_FARGATE_COUNT_AVG,
  UsageSummaryDateOrg.JSON_PROPERTY_AUDIT_LOGS_LINES_INDEXED_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_AUDIT_TRAIL_ENABLED_HWM,
  UsageSummaryDateOrg.JSON_PROPERTY_AVG_PROFILED_FARGATE_TASKS,
  UsageSummaryDateOrg.JSON_PROPERTY_AWS_HOST_TOP99P,
  UsageSummaryDateOrg.JSON_PROPERTY_AWS_LAMBDA_FUNC_COUNT,
  UsageSummaryDateOrg.JSON_PROPERTY_AWS_LAMBDA_INVOCATIONS_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_AZURE_APP_SERVICE_TOP99P,
  UsageSummaryDateOrg.JSON_PROPERTY_BILLABLE_INGESTED_BYTES_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_BROWSER_RUM_LITE_SESSION_COUNT_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_BROWSER_RUM_REPLAY_SESSION_COUNT_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_BROWSER_RUM_UNITS_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_CI_PIPELINE_INDEXED_SPANS_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_CI_TEST_INDEXED_SPANS_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_CI_VISIBILITY_PIPELINE_COMMITTERS_HWM,
  UsageSummaryDateOrg.JSON_PROPERTY_CI_VISIBILITY_TEST_COMMITTERS_HWM,
  UsageSummaryDateOrg.JSON_PROPERTY_CLOUD_COST_MANAGEMENT_HOST_COUNT_AVG,
  UsageSummaryDateOrg.JSON_PROPERTY_CONTAINER_AVG,
  UsageSummaryDateOrg.JSON_PROPERTY_CONTAINER_EXCL_AGENT_AVG,
  UsageSummaryDateOrg.JSON_PROPERTY_CONTAINER_HWM,
  UsageSummaryDateOrg.JSON_PROPERTY_CSPM_AAS_HOST_TOP99P,
  UsageSummaryDateOrg.JSON_PROPERTY_CSPM_AWS_HOST_TOP99P,
  UsageSummaryDateOrg.JSON_PROPERTY_CSPM_AZURE_HOST_TOP99P,
  UsageSummaryDateOrg.JSON_PROPERTY_CSPM_CONTAINER_AVG,
  UsageSummaryDateOrg.JSON_PROPERTY_CSPM_CONTAINER_HWM,
  UsageSummaryDateOrg.JSON_PROPERTY_CSPM_GCP_HOST_TOP99P,
  UsageSummaryDateOrg.JSON_PROPERTY_CSPM_HOST_TOP99P,
  UsageSummaryDateOrg.JSON_PROPERTY_CUSTOM_TS_AVG,
  UsageSummaryDateOrg.JSON_PROPERTY_CWS_CONTAINER_COUNT_AVG,
  UsageSummaryDateOrg.JSON_PROPERTY_CWS_HOST_TOP99P,
  UsageSummaryDateOrg.JSON_PROPERTY_DBM_HOST_TOP99P_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_DBM_QUERIES_AVG_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_FARGATE_TASKS_COUNT_AVG,
  UsageSummaryDateOrg.JSON_PROPERTY_FARGATE_TASKS_COUNT_HWM,
  UsageSummaryDateOrg.JSON_PROPERTY_FORWARDING_EVENTS_BYTES_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_GCP_HOST_TOP99P,
  UsageSummaryDateOrg.JSON_PROPERTY_HEROKU_HOST_TOP99P,
  UsageSummaryDateOrg.JSON_PROPERTY_ID,
  UsageSummaryDateOrg.JSON_PROPERTY_INCIDENT_MANAGEMENT_MONTHLY_ACTIVE_USERS_HWM,
  UsageSummaryDateOrg.JSON_PROPERTY_INDEXED_EVENTS_COUNT_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_INFRA_HOST_TOP99P,
  UsageSummaryDateOrg.JSON_PROPERTY_INGESTED_EVENTS_BYTES_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_IOT_DEVICE_AGG_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_IOT_DEVICE_TOP99P_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_MOBILE_RUM_LITE_SESSION_COUNT_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_MOBILE_RUM_SESSION_COUNT_ANDROID_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_MOBILE_RUM_SESSION_COUNT_FLUTTER_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_MOBILE_RUM_SESSION_COUNT_IOS_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_MOBILE_RUM_SESSION_COUNT_REACTNATIVE_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_MOBILE_RUM_SESSION_COUNT_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_MOBILE_RUM_UNITS_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_NAME,
  UsageSummaryDateOrg.JSON_PROPERTY_NETFLOW_INDEXED_EVENTS_COUNT_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_NPM_HOST_TOP99P,
  UsageSummaryDateOrg.JSON_PROPERTY_OBSERVABILITY_PIPELINES_BYTES_PROCESSED_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_ONLINE_ARCHIVE_EVENTS_COUNT_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_OPENTELEMETRY_APM_HOST_TOP99P,
  UsageSummaryDateOrg.JSON_PROPERTY_OPENTELEMETRY_HOST_TOP99P,
  UsageSummaryDateOrg.JSON_PROPERTY_PROFILING_HOST_TOP99P,
  UsageSummaryDateOrg.JSON_PROPERTY_PUBLIC_ID,
  UsageSummaryDateOrg.JSON_PROPERTY_REGION,
  UsageSummaryDateOrg.JSON_PROPERTY_RUM_BROWSER_AND_MOBILE_SESSION_COUNT,
  UsageSummaryDateOrg.JSON_PROPERTY_RUM_SESSION_COUNT_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_RUM_TOTAL_SESSION_COUNT_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_RUM_UNITS_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_SDS_APM_SCANNED_BYTES_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_SDS_EVENTS_SCANNED_BYTES_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_SDS_LOGS_SCANNED_BYTES_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_SDS_RUM_SCANNED_BYTES_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_SDS_TOTAL_SCANNED_BYTES_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_SYNTHETICS_BROWSER_CHECK_CALLS_COUNT_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_SYNTHETICS_CHECK_CALLS_COUNT_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_SYNTHETICS_PARALLEL_TESTING_MAX_SLOTS_HWM,
  UsageSummaryDateOrg.JSON_PROPERTY_TRACE_SEARCH_INDEXED_EVENTS_COUNT_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_TWOL_INGESTED_EVENTS_BYTES_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_UNIVERSAL_SERVICE_MONITORING_HOST_TOP99P,
  UsageSummaryDateOrg.JSON_PROPERTY_VSPHERE_HOST_TOP99P
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class UsageSummaryDateOrg {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AGENT_HOST_TOP99P = "agent_host_top99p";
  private JsonNullable<Long> agentHostTop99p = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_APM_AZURE_APP_SERVICE_HOST_TOP99P =
      "apm_azure_app_service_host_top99p";
  private JsonNullable<Long> apmAzureAppServiceHostTop99p = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_APM_FARGATE_COUNT_AVG = "apm_fargate_count_avg";
  private JsonNullable<Long> apmFargateCountAvg = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_APM_HOST_TOP99P = "apm_host_top99p";
  private JsonNullable<Long> apmHostTop99p = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_APPSEC_FARGATE_COUNT_AVG = "appsec_fargate_count_avg";
  private JsonNullable<Long> appsecFargateCountAvg = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_AUDIT_LOGS_LINES_INDEXED_SUM =
      "audit_logs_lines_indexed_sum";
  private JsonNullable<Long> auditLogsLinesIndexedSum = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_AUDIT_TRAIL_ENABLED_HWM = "audit_trail_enabled_hwm";
  private JsonNullable<Long> auditTrailEnabledHwm = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_AVG_PROFILED_FARGATE_TASKS =
      "avg_profiled_fargate_tasks";
  private JsonNullable<Long> avgProfiledFargateTasks = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_AWS_HOST_TOP99P = "aws_host_top99p";
  private JsonNullable<Long> awsHostTop99p = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_AWS_LAMBDA_FUNC_COUNT = "aws_lambda_func_count";
  private Long awsLambdaFuncCount;

  public static final String JSON_PROPERTY_AWS_LAMBDA_INVOCATIONS_SUM =
      "aws_lambda_invocations_sum";
  private JsonNullable<Long> awsLambdaInvocationsSum = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_AZURE_APP_SERVICE_TOP99P = "azure_app_service_top99p";
  private JsonNullable<Long> azureAppServiceTop99p = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_BILLABLE_INGESTED_BYTES_SUM =
      "billable_ingested_bytes_sum";
  private JsonNullable<Long> billableIngestedBytesSum = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_BROWSER_RUM_LITE_SESSION_COUNT_SUM =
      "browser_rum_lite_session_count_sum";
  private JsonNullable<Long> browserRumLiteSessionCountSum = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_BROWSER_RUM_REPLAY_SESSION_COUNT_SUM =
      "browser_rum_replay_session_count_sum";
  private JsonNullable<Long> browserRumReplaySessionCountSum = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_BROWSER_RUM_UNITS_SUM = "browser_rum_units_sum";
  private JsonNullable<Long> browserRumUnitsSum = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_CI_PIPELINE_INDEXED_SPANS_SUM =
      "ci_pipeline_indexed_spans_sum";
  private JsonNullable<Long> ciPipelineIndexedSpansSum = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_CI_TEST_INDEXED_SPANS_SUM = "ci_test_indexed_spans_sum";
  private JsonNullable<Long> ciTestIndexedSpansSum = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_CI_VISIBILITY_PIPELINE_COMMITTERS_HWM =
      "ci_visibility_pipeline_committers_hwm";
  private JsonNullable<Long> ciVisibilityPipelineCommittersHwm = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_CI_VISIBILITY_TEST_COMMITTERS_HWM =
      "ci_visibility_test_committers_hwm";
  private JsonNullable<Long> ciVisibilityTestCommittersHwm = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_CLOUD_COST_MANAGEMENT_HOST_COUNT_AVG =
      "cloud_cost_management_host_count_avg";
  private Long cloudCostManagementHostCountAvg;

  public static final String JSON_PROPERTY_CONTAINER_AVG = "container_avg";
  private JsonNullable<Long> containerAvg = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_CONTAINER_EXCL_AGENT_AVG = "container_excl_agent_avg";
  private JsonNullable<Long> containerExclAgentAvg = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_CONTAINER_HWM = "container_hwm";
  private JsonNullable<Long> containerHwm = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_CSPM_AAS_HOST_TOP99P = "cspm_aas_host_top99p";
  private JsonNullable<Long> cspmAasHostTop99p = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_CSPM_AWS_HOST_TOP99P = "cspm_aws_host_top99p";
  private Long cspmAwsHostTop99p;

  public static final String JSON_PROPERTY_CSPM_AZURE_HOST_TOP99P = "cspm_azure_host_top99p";
  private JsonNullable<Long> cspmAzureHostTop99p = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_CSPM_CONTAINER_AVG = "cspm_container_avg";
  private JsonNullable<Long> cspmContainerAvg = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_CSPM_CONTAINER_HWM = "cspm_container_hwm";
  private JsonNullable<Long> cspmContainerHwm = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_CSPM_GCP_HOST_TOP99P = "cspm_gcp_host_top99p";
  private JsonNullable<Long> cspmGcpHostTop99p = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_CSPM_HOST_TOP99P = "cspm_host_top99p";
  private JsonNullable<Long> cspmHostTop99p = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_CUSTOM_TS_AVG = "custom_ts_avg";
  private JsonNullable<Long> customTsAvg = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_CWS_CONTAINER_COUNT_AVG = "cws_container_count_avg";
  private JsonNullable<Long> cwsContainerCountAvg = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_CWS_HOST_TOP99P = "cws_host_top99p";
  private JsonNullable<Long> cwsHostTop99p = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_DBM_HOST_TOP99P_SUM = "dbm_host_top99p_sum";
  private JsonNullable<Long> dbmHostTop99pSum = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_DBM_QUERIES_AVG_SUM = "dbm_queries_avg_sum";
  private JsonNullable<Long> dbmQueriesAvgSum = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_FARGATE_TASKS_COUNT_AVG = "fargate_tasks_count_avg";
  private JsonNullable<Long> fargateTasksCountAvg = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_FARGATE_TASKS_COUNT_HWM = "fargate_tasks_count_hwm";
  private JsonNullable<Long> fargateTasksCountHwm = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_FORWARDING_EVENTS_BYTES_SUM =
      "forwarding_events_bytes_sum";
  private JsonNullable<Long> forwardingEventsBytesSum = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_GCP_HOST_TOP99P = "gcp_host_top99p";
  private JsonNullable<Long> gcpHostTop99p = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_HEROKU_HOST_TOP99P = "heroku_host_top99p";
  private JsonNullable<Long> herokuHostTop99p = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_INCIDENT_MANAGEMENT_MONTHLY_ACTIVE_USERS_HWM =
      "incident_management_monthly_active_users_hwm";
  private JsonNullable<Long> incidentManagementMonthlyActiveUsersHwm =
      JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_INDEXED_EVENTS_COUNT_SUM = "indexed_events_count_sum";
  private JsonNullable<Long> indexedEventsCountSum = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_INFRA_HOST_TOP99P = "infra_host_top99p";
  private JsonNullable<Long> infraHostTop99p = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_INGESTED_EVENTS_BYTES_SUM = "ingested_events_bytes_sum";
  private JsonNullable<Long> ingestedEventsBytesSum = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_IOT_DEVICE_AGG_SUM = "iot_device_agg_sum";
  private JsonNullable<Long> iotDeviceAggSum = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_IOT_DEVICE_TOP99P_SUM = "iot_device_top99p_sum";
  private JsonNullable<Long> iotDeviceTop99pSum = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_MOBILE_RUM_LITE_SESSION_COUNT_SUM =
      "mobile_rum_lite_session_count_sum";
  private JsonNullable<Long> mobileRumLiteSessionCountSum = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_MOBILE_RUM_SESSION_COUNT_ANDROID_SUM =
      "mobile_rum_session_count_android_sum";
  private JsonNullable<Long> mobileRumSessionCountAndroidSum = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_MOBILE_RUM_SESSION_COUNT_FLUTTER_SUM =
      "mobile_rum_session_count_flutter_sum";
  private JsonNullable<Long> mobileRumSessionCountFlutterSum = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_MOBILE_RUM_SESSION_COUNT_IOS_SUM =
      "mobile_rum_session_count_ios_sum";
  private JsonNullable<Long> mobileRumSessionCountIosSum = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_MOBILE_RUM_SESSION_COUNT_REACTNATIVE_SUM =
      "mobile_rum_session_count_reactnative_sum";
  private JsonNullable<Long> mobileRumSessionCountReactnativeSum = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_MOBILE_RUM_SESSION_COUNT_SUM =
      "mobile_rum_session_count_sum";
  private JsonNullable<Long> mobileRumSessionCountSum = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_MOBILE_RUM_UNITS_SUM = "mobile_rum_units_sum";
  private JsonNullable<Long> mobileRumUnitsSum = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_NETFLOW_INDEXED_EVENTS_COUNT_SUM =
      "netflow_indexed_events_count_sum";
  private JsonNullable<Long> netflowIndexedEventsCountSum = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_NPM_HOST_TOP99P = "npm_host_top99p";
  private JsonNullable<Long> npmHostTop99p = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_OBSERVABILITY_PIPELINES_BYTES_PROCESSED_SUM =
      "observability_pipelines_bytes_processed_sum";
  private JsonNullable<Long> observabilityPipelinesBytesProcessedSum =
      JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_ONLINE_ARCHIVE_EVENTS_COUNT_SUM =
      "online_archive_events_count_sum";
  private JsonNullable<Long> onlineArchiveEventsCountSum = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_OPENTELEMETRY_APM_HOST_TOP99P =
      "opentelemetry_apm_host_top99p";
  private JsonNullable<Long> opentelemetryApmHostTop99p = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_OPENTELEMETRY_HOST_TOP99P = "opentelemetry_host_top99p";
  private JsonNullable<Long> opentelemetryHostTop99p = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_PROFILING_HOST_TOP99P = "profiling_host_top99p";
  private JsonNullable<Long> profilingHostTop99p = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_PUBLIC_ID = "public_id";
  private String publicId;

  public static final String JSON_PROPERTY_REGION = "region";
  private String region;

  public static final String JSON_PROPERTY_RUM_BROWSER_AND_MOBILE_SESSION_COUNT =
      "rum_browser_and_mobile_session_count";
  private JsonNullable<Long> rumBrowserAndMobileSessionCount = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_RUM_SESSION_COUNT_SUM = "rum_session_count_sum";
  private JsonNullable<Long> rumSessionCountSum = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_RUM_TOTAL_SESSION_COUNT_SUM =
      "rum_total_session_count_sum";
  private JsonNullable<Long> rumTotalSessionCountSum = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_RUM_UNITS_SUM = "rum_units_sum";
  private JsonNullable<Long> rumUnitsSum = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_SDS_APM_SCANNED_BYTES_SUM = "sds_apm_scanned_bytes_sum";
  private JsonNullable<Long> sdsApmScannedBytesSum = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_SDS_EVENTS_SCANNED_BYTES_SUM =
      "sds_events_scanned_bytes_sum";
  private JsonNullable<Long> sdsEventsScannedBytesSum = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_SDS_LOGS_SCANNED_BYTES_SUM =
      "sds_logs_scanned_bytes_sum";
  private JsonNullable<Long> sdsLogsScannedBytesSum = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_SDS_RUM_SCANNED_BYTES_SUM = "sds_rum_scanned_bytes_sum";
  private JsonNullable<Long> sdsRumScannedBytesSum = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_SDS_TOTAL_SCANNED_BYTES_SUM =
      "sds_total_scanned_bytes_sum";
  private JsonNullable<Long> sdsTotalScannedBytesSum = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_SYNTHETICS_BROWSER_CHECK_CALLS_COUNT_SUM =
      "synthetics_browser_check_calls_count_sum";
  private JsonNullable<Long> syntheticsBrowserCheckCallsCountSum = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_SYNTHETICS_CHECK_CALLS_COUNT_SUM =
      "synthetics_check_calls_count_sum";
  private JsonNullable<Long> syntheticsCheckCallsCountSum = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_SYNTHETICS_PARALLEL_TESTING_MAX_SLOTS_HWM =
      "synthetics_parallel_testing_max_slots_hwm";
  private JsonNullable<Long> syntheticsParallelTestingMaxSlotsHwm = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_TRACE_SEARCH_INDEXED_EVENTS_COUNT_SUM =
      "trace_search_indexed_events_count_sum";
  private JsonNullable<Long> traceSearchIndexedEventsCountSum = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_TWOL_INGESTED_EVENTS_BYTES_SUM =
      "twol_ingested_events_bytes_sum";
  private JsonNullable<Long> twolIngestedEventsBytesSum = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_UNIVERSAL_SERVICE_MONITORING_HOST_TOP99P =
      "universal_service_monitoring_host_top99p";
  private JsonNullable<Long> universalServiceMonitoringHostTop99p = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_VSPHERE_HOST_TOP99P = "vsphere_host_top99p";
  private JsonNullable<Long> vsphereHostTop99p = JsonNullable.<Long>undefined();

  public UsageSummaryDateOrg agentHostTop99p(Long agentHostTop99p) {
    this.agentHostTop99p = JsonNullable.<Long>of(agentHostTop99p);
    return this;
  }

  /**
   * Shows the 99th percentile of all agent hosts over all hours in the current date for the given
   * org.
   *
   * @return agentHostTop99p
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getAgentHostTop99p() {
    return agentHostTop99p.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_AGENT_HOST_TOP99P)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getAgentHostTop99p_JsonNullable() {
    return agentHostTop99p;
  }

  @JsonProperty(JSON_PROPERTY_AGENT_HOST_TOP99P)
  public void setAgentHostTop99p_JsonNullable(JsonNullable<Long> agentHostTop99p) {
    this.agentHostTop99p = agentHostTop99p;
  }

  public void setAgentHostTop99p(Long agentHostTop99p) {
    this.agentHostTop99p = JsonNullable.<Long>of(agentHostTop99p);
  }

  public UsageSummaryDateOrg apmAzureAppServiceHostTop99p(Long apmAzureAppServiceHostTop99p) {
    this.apmAzureAppServiceHostTop99p = JsonNullable.<Long>of(apmAzureAppServiceHostTop99p);
    return this;
  }

  /**
   * Shows the 99th percentile of all Azure app services using APM over all hours in the current
   * date for the given org.
   *
   * @return apmAzureAppServiceHostTop99p
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getApmAzureAppServiceHostTop99p() {
    return apmAzureAppServiceHostTop99p.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_APM_AZURE_APP_SERVICE_HOST_TOP99P)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getApmAzureAppServiceHostTop99p_JsonNullable() {
    return apmAzureAppServiceHostTop99p;
  }

  @JsonProperty(JSON_PROPERTY_APM_AZURE_APP_SERVICE_HOST_TOP99P)
  public void setApmAzureAppServiceHostTop99p_JsonNullable(
      JsonNullable<Long> apmAzureAppServiceHostTop99p) {
    this.apmAzureAppServiceHostTop99p = apmAzureAppServiceHostTop99p;
  }

  public void setApmAzureAppServiceHostTop99p(Long apmAzureAppServiceHostTop99p) {
    this.apmAzureAppServiceHostTop99p = JsonNullable.<Long>of(apmAzureAppServiceHostTop99p);
  }

  public UsageSummaryDateOrg apmFargateCountAvg(Long apmFargateCountAvg) {
    this.apmFargateCountAvg = JsonNullable.<Long>of(apmFargateCountAvg);
    return this;
  }

  /**
   * Shows the average of all APM ECS Fargate tasks over all hours in the current months for the
   * given org.
   *
   * @return apmFargateCountAvg
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getApmFargateCountAvg() {
    return apmFargateCountAvg.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_APM_FARGATE_COUNT_AVG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getApmFargateCountAvg_JsonNullable() {
    return apmFargateCountAvg;
  }

  @JsonProperty(JSON_PROPERTY_APM_FARGATE_COUNT_AVG)
  public void setApmFargateCountAvg_JsonNullable(JsonNullable<Long> apmFargateCountAvg) {
    this.apmFargateCountAvg = apmFargateCountAvg;
  }

  public void setApmFargateCountAvg(Long apmFargateCountAvg) {
    this.apmFargateCountAvg = JsonNullable.<Long>of(apmFargateCountAvg);
  }

  public UsageSummaryDateOrg apmHostTop99p(Long apmHostTop99p) {
    this.apmHostTop99p = JsonNullable.<Long>of(apmHostTop99p);
    return this;
  }

  /**
   * Shows the 99th percentile of all distinct APM hosts over all hours in the current date for the
   * given org.
   *
   * @return apmHostTop99p
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getApmHostTop99p() {
    return apmHostTop99p.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_APM_HOST_TOP99P)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getApmHostTop99p_JsonNullable() {
    return apmHostTop99p;
  }

  @JsonProperty(JSON_PROPERTY_APM_HOST_TOP99P)
  public void setApmHostTop99p_JsonNullable(JsonNullable<Long> apmHostTop99p) {
    this.apmHostTop99p = apmHostTop99p;
  }

  public void setApmHostTop99p(Long apmHostTop99p) {
    this.apmHostTop99p = JsonNullable.<Long>of(apmHostTop99p);
  }

  public UsageSummaryDateOrg appsecFargateCountAvg(Long appsecFargateCountAvg) {
    this.appsecFargateCountAvg = JsonNullable.<Long>of(appsecFargateCountAvg);
    return this;
  }

  /**
   * Shows the average of all Application Security Monitoring ECS Fargate tasks over all hours in
   * the current months for the given org.
   *
   * @return appsecFargateCountAvg
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getAppsecFargateCountAvg() {
    return appsecFargateCountAvg.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_APPSEC_FARGATE_COUNT_AVG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getAppsecFargateCountAvg_JsonNullable() {
    return appsecFargateCountAvg;
  }

  @JsonProperty(JSON_PROPERTY_APPSEC_FARGATE_COUNT_AVG)
  public void setAppsecFargateCountAvg_JsonNullable(JsonNullable<Long> appsecFargateCountAvg) {
    this.appsecFargateCountAvg = appsecFargateCountAvg;
  }

  public void setAppsecFargateCountAvg(Long appsecFargateCountAvg) {
    this.appsecFargateCountAvg = JsonNullable.<Long>of(appsecFargateCountAvg);
  }

  public UsageSummaryDateOrg auditLogsLinesIndexedSum(Long auditLogsLinesIndexedSum) {
    this.auditLogsLinesIndexedSum = JsonNullable.<Long>of(auditLogsLinesIndexedSum);
    return this;
  }

  /**
   * Shows the sum of all audit logs lines indexed over all hours in the current date for the given
   * org.
   *
   * @return auditLogsLinesIndexedSum
   * @deprecated
   */
  @Deprecated
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getAuditLogsLinesIndexedSum() {
    return auditLogsLinesIndexedSum.orElse(null);
  }

  @Deprecated
  @JsonProperty(JSON_PROPERTY_AUDIT_LOGS_LINES_INDEXED_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getAuditLogsLinesIndexedSum_JsonNullable() {
    return auditLogsLinesIndexedSum;
  }

  @JsonProperty(JSON_PROPERTY_AUDIT_LOGS_LINES_INDEXED_SUM)
  public void setAuditLogsLinesIndexedSum_JsonNullable(
      JsonNullable<Long> auditLogsLinesIndexedSum) {
    this.auditLogsLinesIndexedSum = auditLogsLinesIndexedSum;
  }

  public void setAuditLogsLinesIndexedSum(Long auditLogsLinesIndexedSum) {
    this.auditLogsLinesIndexedSum = JsonNullable.<Long>of(auditLogsLinesIndexedSum);
  }

  public UsageSummaryDateOrg auditTrailEnabledHwm(Long auditTrailEnabledHwm) {
    this.auditTrailEnabledHwm = JsonNullable.<Long>of(auditTrailEnabledHwm);
    return this;
  }

  /**
   * Shows whether Audit Trail is enabled for the current date for the given org.
   *
   * @return auditTrailEnabledHwm
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getAuditTrailEnabledHwm() {
    return auditTrailEnabledHwm.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_AUDIT_TRAIL_ENABLED_HWM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getAuditTrailEnabledHwm_JsonNullable() {
    return auditTrailEnabledHwm;
  }

  @JsonProperty(JSON_PROPERTY_AUDIT_TRAIL_ENABLED_HWM)
  public void setAuditTrailEnabledHwm_JsonNullable(JsonNullable<Long> auditTrailEnabledHwm) {
    this.auditTrailEnabledHwm = auditTrailEnabledHwm;
  }

  public void setAuditTrailEnabledHwm(Long auditTrailEnabledHwm) {
    this.auditTrailEnabledHwm = JsonNullable.<Long>of(auditTrailEnabledHwm);
  }

  public UsageSummaryDateOrg avgProfiledFargateTasks(Long avgProfiledFargateTasks) {
    this.avgProfiledFargateTasks = JsonNullable.<Long>of(avgProfiledFargateTasks);
    return this;
  }

  /**
   * The average profiled task count for Fargate Profiling.
   *
   * @return avgProfiledFargateTasks
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getAvgProfiledFargateTasks() {
    return avgProfiledFargateTasks.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_AVG_PROFILED_FARGATE_TASKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getAvgProfiledFargateTasks_JsonNullable() {
    return avgProfiledFargateTasks;
  }

  @JsonProperty(JSON_PROPERTY_AVG_PROFILED_FARGATE_TASKS)
  public void setAvgProfiledFargateTasks_JsonNullable(JsonNullable<Long> avgProfiledFargateTasks) {
    this.avgProfiledFargateTasks = avgProfiledFargateTasks;
  }

  public void setAvgProfiledFargateTasks(Long avgProfiledFargateTasks) {
    this.avgProfiledFargateTasks = JsonNullable.<Long>of(avgProfiledFargateTasks);
  }

  public UsageSummaryDateOrg awsHostTop99p(Long awsHostTop99p) {
    this.awsHostTop99p = JsonNullable.<Long>of(awsHostTop99p);
    return this;
  }

  /**
   * Shows the 99th percentile of all AWS hosts over all hours in the current date for the given
   * org.
   *
   * @return awsHostTop99p
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getAwsHostTop99p() {
    return awsHostTop99p.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_AWS_HOST_TOP99P)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getAwsHostTop99p_JsonNullable() {
    return awsHostTop99p;
  }

  @JsonProperty(JSON_PROPERTY_AWS_HOST_TOP99P)
  public void setAwsHostTop99p_JsonNullable(JsonNullable<Long> awsHostTop99p) {
    this.awsHostTop99p = awsHostTop99p;
  }

  public void setAwsHostTop99p(Long awsHostTop99p) {
    this.awsHostTop99p = JsonNullable.<Long>of(awsHostTop99p);
  }

  public UsageSummaryDateOrg awsLambdaFuncCount(Long awsLambdaFuncCount) {
    this.awsLambdaFuncCount = awsLambdaFuncCount;
    return this;
  }

  /**
   * Shows the sum of all AWS Lambda invocations over all hours in the current date for the given
   * org.
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

  public UsageSummaryDateOrg awsLambdaInvocationsSum(Long awsLambdaInvocationsSum) {
    this.awsLambdaInvocationsSum = JsonNullable.<Long>of(awsLambdaInvocationsSum);
    return this;
  }

  /**
   * Shows the sum of all AWS Lambda invocations over all hours in the current date for the given
   * org.
   *
   * @return awsLambdaInvocationsSum
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getAwsLambdaInvocationsSum() {
    return awsLambdaInvocationsSum.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_AWS_LAMBDA_INVOCATIONS_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getAwsLambdaInvocationsSum_JsonNullable() {
    return awsLambdaInvocationsSum;
  }

  @JsonProperty(JSON_PROPERTY_AWS_LAMBDA_INVOCATIONS_SUM)
  public void setAwsLambdaInvocationsSum_JsonNullable(JsonNullable<Long> awsLambdaInvocationsSum) {
    this.awsLambdaInvocationsSum = awsLambdaInvocationsSum;
  }

  public void setAwsLambdaInvocationsSum(Long awsLambdaInvocationsSum) {
    this.awsLambdaInvocationsSum = JsonNullable.<Long>of(awsLambdaInvocationsSum);
  }

  public UsageSummaryDateOrg azureAppServiceTop99p(Long azureAppServiceTop99p) {
    this.azureAppServiceTop99p = JsonNullable.<Long>of(azureAppServiceTop99p);
    return this;
  }

  /**
   * Shows the 99th percentile of all Azure app services over all hours in the current date for the
   * given org.
   *
   * @return azureAppServiceTop99p
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getAzureAppServiceTop99p() {
    return azureAppServiceTop99p.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_AZURE_APP_SERVICE_TOP99P)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getAzureAppServiceTop99p_JsonNullable() {
    return azureAppServiceTop99p;
  }

  @JsonProperty(JSON_PROPERTY_AZURE_APP_SERVICE_TOP99P)
  public void setAzureAppServiceTop99p_JsonNullable(JsonNullable<Long> azureAppServiceTop99p) {
    this.azureAppServiceTop99p = azureAppServiceTop99p;
  }

  public void setAzureAppServiceTop99p(Long azureAppServiceTop99p) {
    this.azureAppServiceTop99p = JsonNullable.<Long>of(azureAppServiceTop99p);
  }

  public UsageSummaryDateOrg billableIngestedBytesSum(Long billableIngestedBytesSum) {
    this.billableIngestedBytesSum = JsonNullable.<Long>of(billableIngestedBytesSum);
    return this;
  }

  /**
   * Shows the sum of all log bytes ingested over all hours in the current date for the given org.
   *
   * @return billableIngestedBytesSum
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getBillableIngestedBytesSum() {
    return billableIngestedBytesSum.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_BILLABLE_INGESTED_BYTES_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getBillableIngestedBytesSum_JsonNullable() {
    return billableIngestedBytesSum;
  }

  @JsonProperty(JSON_PROPERTY_BILLABLE_INGESTED_BYTES_SUM)
  public void setBillableIngestedBytesSum_JsonNullable(
      JsonNullable<Long> billableIngestedBytesSum) {
    this.billableIngestedBytesSum = billableIngestedBytesSum;
  }

  public void setBillableIngestedBytesSum(Long billableIngestedBytesSum) {
    this.billableIngestedBytesSum = JsonNullable.<Long>of(billableIngestedBytesSum);
  }

  public UsageSummaryDateOrg browserRumLiteSessionCountSum(Long browserRumLiteSessionCountSum) {
    this.browserRumLiteSessionCountSum = JsonNullable.<Long>of(browserRumLiteSessionCountSum);
    return this;
  }

  /**
   * Shows the sum of all browser lite sessions over all hours in the current date for the given
   * org.
   *
   * @return browserRumLiteSessionCountSum
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getBrowserRumLiteSessionCountSum() {
    return browserRumLiteSessionCountSum.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_BROWSER_RUM_LITE_SESSION_COUNT_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getBrowserRumLiteSessionCountSum_JsonNullable() {
    return browserRumLiteSessionCountSum;
  }

  @JsonProperty(JSON_PROPERTY_BROWSER_RUM_LITE_SESSION_COUNT_SUM)
  public void setBrowserRumLiteSessionCountSum_JsonNullable(
      JsonNullable<Long> browserRumLiteSessionCountSum) {
    this.browserRumLiteSessionCountSum = browserRumLiteSessionCountSum;
  }

  public void setBrowserRumLiteSessionCountSum(Long browserRumLiteSessionCountSum) {
    this.browserRumLiteSessionCountSum = JsonNullable.<Long>of(browserRumLiteSessionCountSum);
  }

  public UsageSummaryDateOrg browserRumReplaySessionCountSum(Long browserRumReplaySessionCountSum) {
    this.browserRumReplaySessionCountSum = JsonNullable.<Long>of(browserRumReplaySessionCountSum);
    return this;
  }

  /**
   * Shows the sum of all browser replay sessions over all hours in the current date for the given
   * org.
   *
   * @return browserRumReplaySessionCountSum
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getBrowserRumReplaySessionCountSum() {
    return browserRumReplaySessionCountSum.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_BROWSER_RUM_REPLAY_SESSION_COUNT_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getBrowserRumReplaySessionCountSum_JsonNullable() {
    return browserRumReplaySessionCountSum;
  }

  @JsonProperty(JSON_PROPERTY_BROWSER_RUM_REPLAY_SESSION_COUNT_SUM)
  public void setBrowserRumReplaySessionCountSum_JsonNullable(
      JsonNullable<Long> browserRumReplaySessionCountSum) {
    this.browserRumReplaySessionCountSum = browserRumReplaySessionCountSum;
  }

  public void setBrowserRumReplaySessionCountSum(Long browserRumReplaySessionCountSum) {
    this.browserRumReplaySessionCountSum = JsonNullable.<Long>of(browserRumReplaySessionCountSum);
  }

  public UsageSummaryDateOrg browserRumUnitsSum(Long browserRumUnitsSum) {
    this.browserRumUnitsSum = JsonNullable.<Long>of(browserRumUnitsSum);
    return this;
  }

  /**
   * Shows the sum of all browser RUM units over all hours in the current date for the given org.
   *
   * @return browserRumUnitsSum
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getBrowserRumUnitsSum() {
    return browserRumUnitsSum.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_BROWSER_RUM_UNITS_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getBrowserRumUnitsSum_JsonNullable() {
    return browserRumUnitsSum;
  }

  @JsonProperty(JSON_PROPERTY_BROWSER_RUM_UNITS_SUM)
  public void setBrowserRumUnitsSum_JsonNullable(JsonNullable<Long> browserRumUnitsSum) {
    this.browserRumUnitsSum = browserRumUnitsSum;
  }

  public void setBrowserRumUnitsSum(Long browserRumUnitsSum) {
    this.browserRumUnitsSum = JsonNullable.<Long>of(browserRumUnitsSum);
  }

  public UsageSummaryDateOrg ciPipelineIndexedSpansSum(Long ciPipelineIndexedSpansSum) {
    this.ciPipelineIndexedSpansSum = JsonNullable.<Long>of(ciPipelineIndexedSpansSum);
    return this;
  }

  /**
   * Shows the sum of all CI pipeline indexed spans over all hours in the current date for the given
   * org.
   *
   * @return ciPipelineIndexedSpansSum
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getCiPipelineIndexedSpansSum() {
    return ciPipelineIndexedSpansSum.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CI_PIPELINE_INDEXED_SPANS_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getCiPipelineIndexedSpansSum_JsonNullable() {
    return ciPipelineIndexedSpansSum;
  }

  @JsonProperty(JSON_PROPERTY_CI_PIPELINE_INDEXED_SPANS_SUM)
  public void setCiPipelineIndexedSpansSum_JsonNullable(
      JsonNullable<Long> ciPipelineIndexedSpansSum) {
    this.ciPipelineIndexedSpansSum = ciPipelineIndexedSpansSum;
  }

  public void setCiPipelineIndexedSpansSum(Long ciPipelineIndexedSpansSum) {
    this.ciPipelineIndexedSpansSum = JsonNullable.<Long>of(ciPipelineIndexedSpansSum);
  }

  public UsageSummaryDateOrg ciTestIndexedSpansSum(Long ciTestIndexedSpansSum) {
    this.ciTestIndexedSpansSum = JsonNullable.<Long>of(ciTestIndexedSpansSum);
    return this;
  }

  /**
   * Shows the sum of all CI test indexed spans over all hours in the current date for the given
   * org.
   *
   * @return ciTestIndexedSpansSum
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getCiTestIndexedSpansSum() {
    return ciTestIndexedSpansSum.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CI_TEST_INDEXED_SPANS_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getCiTestIndexedSpansSum_JsonNullable() {
    return ciTestIndexedSpansSum;
  }

  @JsonProperty(JSON_PROPERTY_CI_TEST_INDEXED_SPANS_SUM)
  public void setCiTestIndexedSpansSum_JsonNullable(JsonNullable<Long> ciTestIndexedSpansSum) {
    this.ciTestIndexedSpansSum = ciTestIndexedSpansSum;
  }

  public void setCiTestIndexedSpansSum(Long ciTestIndexedSpansSum) {
    this.ciTestIndexedSpansSum = JsonNullable.<Long>of(ciTestIndexedSpansSum);
  }

  public UsageSummaryDateOrg ciVisibilityPipelineCommittersHwm(
      Long ciVisibilityPipelineCommittersHwm) {
    this.ciVisibilityPipelineCommittersHwm =
        JsonNullable.<Long>of(ciVisibilityPipelineCommittersHwm);
    return this;
  }

  /**
   * Shows the high-water mark of all CI visibility pipeline committers over all hours in the
   * current date for the given org.
   *
   * @return ciVisibilityPipelineCommittersHwm
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getCiVisibilityPipelineCommittersHwm() {
    return ciVisibilityPipelineCommittersHwm.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CI_VISIBILITY_PIPELINE_COMMITTERS_HWM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getCiVisibilityPipelineCommittersHwm_JsonNullable() {
    return ciVisibilityPipelineCommittersHwm;
  }

  @JsonProperty(JSON_PROPERTY_CI_VISIBILITY_PIPELINE_COMMITTERS_HWM)
  public void setCiVisibilityPipelineCommittersHwm_JsonNullable(
      JsonNullable<Long> ciVisibilityPipelineCommittersHwm) {
    this.ciVisibilityPipelineCommittersHwm = ciVisibilityPipelineCommittersHwm;
  }

  public void setCiVisibilityPipelineCommittersHwm(Long ciVisibilityPipelineCommittersHwm) {
    this.ciVisibilityPipelineCommittersHwm =
        JsonNullable.<Long>of(ciVisibilityPipelineCommittersHwm);
  }

  public UsageSummaryDateOrg ciVisibilityTestCommittersHwm(Long ciVisibilityTestCommittersHwm) {
    this.ciVisibilityTestCommittersHwm = JsonNullable.<Long>of(ciVisibilityTestCommittersHwm);
    return this;
  }

  /**
   * Shows the high-water mark of all CI visibility test committers over all hours in the current
   * date for the given org.
   *
   * @return ciVisibilityTestCommittersHwm
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getCiVisibilityTestCommittersHwm() {
    return ciVisibilityTestCommittersHwm.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CI_VISIBILITY_TEST_COMMITTERS_HWM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getCiVisibilityTestCommittersHwm_JsonNullable() {
    return ciVisibilityTestCommittersHwm;
  }

  @JsonProperty(JSON_PROPERTY_CI_VISIBILITY_TEST_COMMITTERS_HWM)
  public void setCiVisibilityTestCommittersHwm_JsonNullable(
      JsonNullable<Long> ciVisibilityTestCommittersHwm) {
    this.ciVisibilityTestCommittersHwm = ciVisibilityTestCommittersHwm;
  }

  public void setCiVisibilityTestCommittersHwm(Long ciVisibilityTestCommittersHwm) {
    this.ciVisibilityTestCommittersHwm = JsonNullable.<Long>of(ciVisibilityTestCommittersHwm);
  }

  public UsageSummaryDateOrg cloudCostManagementHostCountAvg(Long cloudCostManagementHostCountAvg) {
    this.cloudCostManagementHostCountAvg = cloudCostManagementHostCountAvg;
    return this;
  }

  /**
   * Host count average of Cloud Cost Management for the given date and given org.
   *
   * @return cloudCostManagementHostCountAvg
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CLOUD_COST_MANAGEMENT_HOST_COUNT_AVG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCloudCostManagementHostCountAvg() {
    return cloudCostManagementHostCountAvg;
  }

  public void setCloudCostManagementHostCountAvg(Long cloudCostManagementHostCountAvg) {
    this.cloudCostManagementHostCountAvg = cloudCostManagementHostCountAvg;
  }

  public UsageSummaryDateOrg containerAvg(Long containerAvg) {
    this.containerAvg = JsonNullable.<Long>of(containerAvg);
    return this;
  }

  /**
   * Shows the average of all distinct containers over all hours in the current date for the given
   * org.
   *
   * @return containerAvg
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getContainerAvg() {
    return containerAvg.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CONTAINER_AVG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getContainerAvg_JsonNullable() {
    return containerAvg;
  }

  @JsonProperty(JSON_PROPERTY_CONTAINER_AVG)
  public void setContainerAvg_JsonNullable(JsonNullable<Long> containerAvg) {
    this.containerAvg = containerAvg;
  }

  public void setContainerAvg(Long containerAvg) {
    this.containerAvg = JsonNullable.<Long>of(containerAvg);
  }

  public UsageSummaryDateOrg containerExclAgentAvg(Long containerExclAgentAvg) {
    this.containerExclAgentAvg = JsonNullable.<Long>of(containerExclAgentAvg);
    return this;
  }

  /**
   * Shows the average of containers without the Datadog Agent over all hours in the current date
   * for the given organization.
   *
   * @return containerExclAgentAvg
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getContainerExclAgentAvg() {
    return containerExclAgentAvg.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CONTAINER_EXCL_AGENT_AVG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getContainerExclAgentAvg_JsonNullable() {
    return containerExclAgentAvg;
  }

  @JsonProperty(JSON_PROPERTY_CONTAINER_EXCL_AGENT_AVG)
  public void setContainerExclAgentAvg_JsonNullable(JsonNullable<Long> containerExclAgentAvg) {
    this.containerExclAgentAvg = containerExclAgentAvg;
  }

  public void setContainerExclAgentAvg(Long containerExclAgentAvg) {
    this.containerExclAgentAvg = JsonNullable.<Long>of(containerExclAgentAvg);
  }

  public UsageSummaryDateOrg containerHwm(Long containerHwm) {
    this.containerHwm = JsonNullable.<Long>of(containerHwm);
    return this;
  }

  /**
   * Shows the high-water mark of all distinct containers over all hours in the current date for the
   * given org.
   *
   * @return containerHwm
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getContainerHwm() {
    return containerHwm.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CONTAINER_HWM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getContainerHwm_JsonNullable() {
    return containerHwm;
  }

  @JsonProperty(JSON_PROPERTY_CONTAINER_HWM)
  public void setContainerHwm_JsonNullable(JsonNullable<Long> containerHwm) {
    this.containerHwm = containerHwm;
  }

  public void setContainerHwm(Long containerHwm) {
    this.containerHwm = JsonNullable.<Long>of(containerHwm);
  }

  public UsageSummaryDateOrg cspmAasHostTop99p(Long cspmAasHostTop99p) {
    this.cspmAasHostTop99p = JsonNullable.<Long>of(cspmAasHostTop99p);
    return this;
  }

  /**
   * Shows the 99th percentile of all Cloud Security Posture Management Azure app services hosts
   * over all hours in the current date for the given org.
   *
   * @return cspmAasHostTop99p
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getCspmAasHostTop99p() {
    return cspmAasHostTop99p.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CSPM_AAS_HOST_TOP99P)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getCspmAasHostTop99p_JsonNullable() {
    return cspmAasHostTop99p;
  }

  @JsonProperty(JSON_PROPERTY_CSPM_AAS_HOST_TOP99P)
  public void setCspmAasHostTop99p_JsonNullable(JsonNullable<Long> cspmAasHostTop99p) {
    this.cspmAasHostTop99p = cspmAasHostTop99p;
  }

  public void setCspmAasHostTop99p(Long cspmAasHostTop99p) {
    this.cspmAasHostTop99p = JsonNullable.<Long>of(cspmAasHostTop99p);
  }

  public UsageSummaryDateOrg cspmAwsHostTop99p(Long cspmAwsHostTop99p) {
    this.cspmAwsHostTop99p = cspmAwsHostTop99p;
    return this;
  }

  /**
   * Shows the 99th percentile of all Cloud Security Posture Management AWS hosts over all hours in
   * the current date for the given org.
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

  public UsageSummaryDateOrg cspmAzureHostTop99p(Long cspmAzureHostTop99p) {
    this.cspmAzureHostTop99p = JsonNullable.<Long>of(cspmAzureHostTop99p);
    return this;
  }

  /**
   * Shows the 99th percentile of all Cloud Security Posture Management Azure hosts over all hours
   * in the current date for the given org.
   *
   * @return cspmAzureHostTop99p
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getCspmAzureHostTop99p() {
    return cspmAzureHostTop99p.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CSPM_AZURE_HOST_TOP99P)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getCspmAzureHostTop99p_JsonNullable() {
    return cspmAzureHostTop99p;
  }

  @JsonProperty(JSON_PROPERTY_CSPM_AZURE_HOST_TOP99P)
  public void setCspmAzureHostTop99p_JsonNullable(JsonNullable<Long> cspmAzureHostTop99p) {
    this.cspmAzureHostTop99p = cspmAzureHostTop99p;
  }

  public void setCspmAzureHostTop99p(Long cspmAzureHostTop99p) {
    this.cspmAzureHostTop99p = JsonNullable.<Long>of(cspmAzureHostTop99p);
  }

  public UsageSummaryDateOrg cspmContainerAvg(Long cspmContainerAvg) {
    this.cspmContainerAvg = JsonNullable.<Long>of(cspmContainerAvg);
    return this;
  }

  /**
   * Shows the average number of Cloud Security Posture Management containers over all hours in the
   * current date for the given org.
   *
   * @return cspmContainerAvg
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getCspmContainerAvg() {
    return cspmContainerAvg.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CSPM_CONTAINER_AVG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getCspmContainerAvg_JsonNullable() {
    return cspmContainerAvg;
  }

  @JsonProperty(JSON_PROPERTY_CSPM_CONTAINER_AVG)
  public void setCspmContainerAvg_JsonNullable(JsonNullable<Long> cspmContainerAvg) {
    this.cspmContainerAvg = cspmContainerAvg;
  }

  public void setCspmContainerAvg(Long cspmContainerAvg) {
    this.cspmContainerAvg = JsonNullable.<Long>of(cspmContainerAvg);
  }

  public UsageSummaryDateOrg cspmContainerHwm(Long cspmContainerHwm) {
    this.cspmContainerHwm = JsonNullable.<Long>of(cspmContainerHwm);
    return this;
  }

  /**
   * Shows the high-water mark of Cloud Security Posture Management containers over all hours in the
   * current date for the given org.
   *
   * @return cspmContainerHwm
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getCspmContainerHwm() {
    return cspmContainerHwm.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CSPM_CONTAINER_HWM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getCspmContainerHwm_JsonNullable() {
    return cspmContainerHwm;
  }

  @JsonProperty(JSON_PROPERTY_CSPM_CONTAINER_HWM)
  public void setCspmContainerHwm_JsonNullable(JsonNullable<Long> cspmContainerHwm) {
    this.cspmContainerHwm = cspmContainerHwm;
  }

  public void setCspmContainerHwm(Long cspmContainerHwm) {
    this.cspmContainerHwm = JsonNullable.<Long>of(cspmContainerHwm);
  }

  public UsageSummaryDateOrg cspmGcpHostTop99p(Long cspmGcpHostTop99p) {
    this.cspmGcpHostTop99p = JsonNullable.<Long>of(cspmGcpHostTop99p);
    return this;
  }

  /**
   * Shows the 99th percentile of all Cloud Security Posture Management GCP hosts over all hours in
   * the current date for the given org.
   *
   * @return cspmGcpHostTop99p
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getCspmGcpHostTop99p() {
    return cspmGcpHostTop99p.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CSPM_GCP_HOST_TOP99P)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getCspmGcpHostTop99p_JsonNullable() {
    return cspmGcpHostTop99p;
  }

  @JsonProperty(JSON_PROPERTY_CSPM_GCP_HOST_TOP99P)
  public void setCspmGcpHostTop99p_JsonNullable(JsonNullable<Long> cspmGcpHostTop99p) {
    this.cspmGcpHostTop99p = cspmGcpHostTop99p;
  }

  public void setCspmGcpHostTop99p(Long cspmGcpHostTop99p) {
    this.cspmGcpHostTop99p = JsonNullable.<Long>of(cspmGcpHostTop99p);
  }

  public UsageSummaryDateOrg cspmHostTop99p(Long cspmHostTop99p) {
    this.cspmHostTop99p = JsonNullable.<Long>of(cspmHostTop99p);
    return this;
  }

  /**
   * Shows the 99th percentile of all Cloud Security Posture Management hosts over all hours in the
   * current date for the given org.
   *
   * @return cspmHostTop99p
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getCspmHostTop99p() {
    return cspmHostTop99p.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CSPM_HOST_TOP99P)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getCspmHostTop99p_JsonNullable() {
    return cspmHostTop99p;
  }

  @JsonProperty(JSON_PROPERTY_CSPM_HOST_TOP99P)
  public void setCspmHostTop99p_JsonNullable(JsonNullable<Long> cspmHostTop99p) {
    this.cspmHostTop99p = cspmHostTop99p;
  }

  public void setCspmHostTop99p(Long cspmHostTop99p) {
    this.cspmHostTop99p = JsonNullable.<Long>of(cspmHostTop99p);
  }

  public UsageSummaryDateOrg customTsAvg(Long customTsAvg) {
    this.customTsAvg = JsonNullable.<Long>of(customTsAvg);
    return this;
  }

  /**
   * Shows the average number of distinct custom metrics over all hours in the current date for the
   * given org.
   *
   * @return customTsAvg
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getCustomTsAvg() {
    return customTsAvg.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CUSTOM_TS_AVG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getCustomTsAvg_JsonNullable() {
    return customTsAvg;
  }

  @JsonProperty(JSON_PROPERTY_CUSTOM_TS_AVG)
  public void setCustomTsAvg_JsonNullable(JsonNullable<Long> customTsAvg) {
    this.customTsAvg = customTsAvg;
  }

  public void setCustomTsAvg(Long customTsAvg) {
    this.customTsAvg = JsonNullable.<Long>of(customTsAvg);
  }

  public UsageSummaryDateOrg cwsContainerCountAvg(Long cwsContainerCountAvg) {
    this.cwsContainerCountAvg = JsonNullable.<Long>of(cwsContainerCountAvg);
    return this;
  }

  /**
   * Shows the average of all distinct Cloud Workload Security containers over all hours in the
   * current date for the given org.
   *
   * @return cwsContainerCountAvg
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getCwsContainerCountAvg() {
    return cwsContainerCountAvg.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CWS_CONTAINER_COUNT_AVG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getCwsContainerCountAvg_JsonNullable() {
    return cwsContainerCountAvg;
  }

  @JsonProperty(JSON_PROPERTY_CWS_CONTAINER_COUNT_AVG)
  public void setCwsContainerCountAvg_JsonNullable(JsonNullable<Long> cwsContainerCountAvg) {
    this.cwsContainerCountAvg = cwsContainerCountAvg;
  }

  public void setCwsContainerCountAvg(Long cwsContainerCountAvg) {
    this.cwsContainerCountAvg = JsonNullable.<Long>of(cwsContainerCountAvg);
  }

  public UsageSummaryDateOrg cwsHostTop99p(Long cwsHostTop99p) {
    this.cwsHostTop99p = JsonNullable.<Long>of(cwsHostTop99p);
    return this;
  }

  /**
   * Shows the 99th percentile of all Cloud Workload Security hosts over all hours in the current
   * date for the given org.
   *
   * @return cwsHostTop99p
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getCwsHostTop99p() {
    return cwsHostTop99p.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CWS_HOST_TOP99P)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getCwsHostTop99p_JsonNullable() {
    return cwsHostTop99p;
  }

  @JsonProperty(JSON_PROPERTY_CWS_HOST_TOP99P)
  public void setCwsHostTop99p_JsonNullable(JsonNullable<Long> cwsHostTop99p) {
    this.cwsHostTop99p = cwsHostTop99p;
  }

  public void setCwsHostTop99p(Long cwsHostTop99p) {
    this.cwsHostTop99p = JsonNullable.<Long>of(cwsHostTop99p);
  }

  public UsageSummaryDateOrg dbmHostTop99pSum(Long dbmHostTop99pSum) {
    this.dbmHostTop99pSum = JsonNullable.<Long>of(dbmHostTop99pSum);
    return this;
  }

  /**
   * Shows the 99th percentile of all Database Monitoring hosts over all hours in the current month
   * for the given org.
   *
   * @return dbmHostTop99pSum
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getDbmHostTop99pSum() {
    return dbmHostTop99pSum.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DBM_HOST_TOP99P_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getDbmHostTop99pSum_JsonNullable() {
    return dbmHostTop99pSum;
  }

  @JsonProperty(JSON_PROPERTY_DBM_HOST_TOP99P_SUM)
  public void setDbmHostTop99pSum_JsonNullable(JsonNullable<Long> dbmHostTop99pSum) {
    this.dbmHostTop99pSum = dbmHostTop99pSum;
  }

  public void setDbmHostTop99pSum(Long dbmHostTop99pSum) {
    this.dbmHostTop99pSum = JsonNullable.<Long>of(dbmHostTop99pSum);
  }

  public UsageSummaryDateOrg dbmQueriesAvgSum(Long dbmQueriesAvgSum) {
    this.dbmQueriesAvgSum = JsonNullable.<Long>of(dbmQueriesAvgSum);
    return this;
  }

  /**
   * Shows the average of all distinct Database Monitoring normalized queries over all hours in the
   * current month for the given org.
   *
   * @return dbmQueriesAvgSum
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getDbmQueriesAvgSum() {
    return dbmQueriesAvgSum.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DBM_QUERIES_AVG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getDbmQueriesAvgSum_JsonNullable() {
    return dbmQueriesAvgSum;
  }

  @JsonProperty(JSON_PROPERTY_DBM_QUERIES_AVG_SUM)
  public void setDbmQueriesAvgSum_JsonNullable(JsonNullable<Long> dbmQueriesAvgSum) {
    this.dbmQueriesAvgSum = dbmQueriesAvgSum;
  }

  public void setDbmQueriesAvgSum(Long dbmQueriesAvgSum) {
    this.dbmQueriesAvgSum = JsonNullable.<Long>of(dbmQueriesAvgSum);
  }

  public UsageSummaryDateOrg fargateTasksCountAvg(Long fargateTasksCountAvg) {
    this.fargateTasksCountAvg = JsonNullable.<Long>of(fargateTasksCountAvg);
    return this;
  }

  /**
   * The average task count for Fargate.
   *
   * @return fargateTasksCountAvg
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getFargateTasksCountAvg() {
    return fargateTasksCountAvg.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FARGATE_TASKS_COUNT_AVG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getFargateTasksCountAvg_JsonNullable() {
    return fargateTasksCountAvg;
  }

  @JsonProperty(JSON_PROPERTY_FARGATE_TASKS_COUNT_AVG)
  public void setFargateTasksCountAvg_JsonNullable(JsonNullable<Long> fargateTasksCountAvg) {
    this.fargateTasksCountAvg = fargateTasksCountAvg;
  }

  public void setFargateTasksCountAvg(Long fargateTasksCountAvg) {
    this.fargateTasksCountAvg = JsonNullable.<Long>of(fargateTasksCountAvg);
  }

  public UsageSummaryDateOrg fargateTasksCountHwm(Long fargateTasksCountHwm) {
    this.fargateTasksCountHwm = JsonNullable.<Long>of(fargateTasksCountHwm);
    return this;
  }

  /**
   * Shows the high-water mark of all Fargate tasks over all hours in the current date for the given
   * org.
   *
   * @return fargateTasksCountHwm
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getFargateTasksCountHwm() {
    return fargateTasksCountHwm.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FARGATE_TASKS_COUNT_HWM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getFargateTasksCountHwm_JsonNullable() {
    return fargateTasksCountHwm;
  }

  @JsonProperty(JSON_PROPERTY_FARGATE_TASKS_COUNT_HWM)
  public void setFargateTasksCountHwm_JsonNullable(JsonNullable<Long> fargateTasksCountHwm) {
    this.fargateTasksCountHwm = fargateTasksCountHwm;
  }

  public void setFargateTasksCountHwm(Long fargateTasksCountHwm) {
    this.fargateTasksCountHwm = JsonNullable.<Long>of(fargateTasksCountHwm);
  }

  public UsageSummaryDateOrg forwardingEventsBytesSum(Long forwardingEventsBytesSum) {
    this.forwardingEventsBytesSum = JsonNullable.<Long>of(forwardingEventsBytesSum);
    return this;
  }

  /**
   * Shows the sum of all log bytes forwarded over all hours in the current date for the given org.
   *
   * @return forwardingEventsBytesSum
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getForwardingEventsBytesSum() {
    return forwardingEventsBytesSum.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FORWARDING_EVENTS_BYTES_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getForwardingEventsBytesSum_JsonNullable() {
    return forwardingEventsBytesSum;
  }

  @JsonProperty(JSON_PROPERTY_FORWARDING_EVENTS_BYTES_SUM)
  public void setForwardingEventsBytesSum_JsonNullable(
      JsonNullable<Long> forwardingEventsBytesSum) {
    this.forwardingEventsBytesSum = forwardingEventsBytesSum;
  }

  public void setForwardingEventsBytesSum(Long forwardingEventsBytesSum) {
    this.forwardingEventsBytesSum = JsonNullable.<Long>of(forwardingEventsBytesSum);
  }

  public UsageSummaryDateOrg gcpHostTop99p(Long gcpHostTop99p) {
    this.gcpHostTop99p = JsonNullable.<Long>of(gcpHostTop99p);
    return this;
  }

  /**
   * Shows the 99th percentile of all GCP hosts over all hours in the current date for the given
   * org.
   *
   * @return gcpHostTop99p
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getGcpHostTop99p() {
    return gcpHostTop99p.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_GCP_HOST_TOP99P)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getGcpHostTop99p_JsonNullable() {
    return gcpHostTop99p;
  }

  @JsonProperty(JSON_PROPERTY_GCP_HOST_TOP99P)
  public void setGcpHostTop99p_JsonNullable(JsonNullable<Long> gcpHostTop99p) {
    this.gcpHostTop99p = gcpHostTop99p;
  }

  public void setGcpHostTop99p(Long gcpHostTop99p) {
    this.gcpHostTop99p = JsonNullable.<Long>of(gcpHostTop99p);
  }

  public UsageSummaryDateOrg herokuHostTop99p(Long herokuHostTop99p) {
    this.herokuHostTop99p = JsonNullable.<Long>of(herokuHostTop99p);
    return this;
  }

  /**
   * Shows the 99th percentile of all Heroku dynos over all hours in the current date for the given
   * org.
   *
   * @return herokuHostTop99p
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getHerokuHostTop99p() {
    return herokuHostTop99p.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_HEROKU_HOST_TOP99P)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getHerokuHostTop99p_JsonNullable() {
    return herokuHostTop99p;
  }

  @JsonProperty(JSON_PROPERTY_HEROKU_HOST_TOP99P)
  public void setHerokuHostTop99p_JsonNullable(JsonNullable<Long> herokuHostTop99p) {
    this.herokuHostTop99p = herokuHostTop99p;
  }

  public void setHerokuHostTop99p(Long herokuHostTop99p) {
    this.herokuHostTop99p = JsonNullable.<Long>of(herokuHostTop99p);
  }

  public UsageSummaryDateOrg id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The organization id.
   *
   * @return id
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public UsageSummaryDateOrg incidentManagementMonthlyActiveUsersHwm(
      Long incidentManagementMonthlyActiveUsersHwm) {
    this.incidentManagementMonthlyActiveUsersHwm =
        JsonNullable.<Long>of(incidentManagementMonthlyActiveUsersHwm);
    return this;
  }

  /**
   * Shows the high-water mark of incident management monthly active users over all hours in the
   * current date for the given org.
   *
   * @return incidentManagementMonthlyActiveUsersHwm
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getIncidentManagementMonthlyActiveUsersHwm() {
    return incidentManagementMonthlyActiveUsersHwm.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_INCIDENT_MANAGEMENT_MONTHLY_ACTIVE_USERS_HWM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getIncidentManagementMonthlyActiveUsersHwm_JsonNullable() {
    return incidentManagementMonthlyActiveUsersHwm;
  }

  @JsonProperty(JSON_PROPERTY_INCIDENT_MANAGEMENT_MONTHLY_ACTIVE_USERS_HWM)
  public void setIncidentManagementMonthlyActiveUsersHwm_JsonNullable(
      JsonNullable<Long> incidentManagementMonthlyActiveUsersHwm) {
    this.incidentManagementMonthlyActiveUsersHwm = incidentManagementMonthlyActiveUsersHwm;
  }

  public void setIncidentManagementMonthlyActiveUsersHwm(
      Long incidentManagementMonthlyActiveUsersHwm) {
    this.incidentManagementMonthlyActiveUsersHwm =
        JsonNullable.<Long>of(incidentManagementMonthlyActiveUsersHwm);
  }

  public UsageSummaryDateOrg indexedEventsCountSum(Long indexedEventsCountSum) {
    this.indexedEventsCountSum = JsonNullable.<Long>of(indexedEventsCountSum);
    return this;
  }

  /**
   * Shows the sum of all log events indexed over all hours in the current date for the given org.
   *
   * @return indexedEventsCountSum
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getIndexedEventsCountSum() {
    return indexedEventsCountSum.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_INDEXED_EVENTS_COUNT_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getIndexedEventsCountSum_JsonNullable() {
    return indexedEventsCountSum;
  }

  @JsonProperty(JSON_PROPERTY_INDEXED_EVENTS_COUNT_SUM)
  public void setIndexedEventsCountSum_JsonNullable(JsonNullable<Long> indexedEventsCountSum) {
    this.indexedEventsCountSum = indexedEventsCountSum;
  }

  public void setIndexedEventsCountSum(Long indexedEventsCountSum) {
    this.indexedEventsCountSum = JsonNullable.<Long>of(indexedEventsCountSum);
  }

  public UsageSummaryDateOrg infraHostTop99p(Long infraHostTop99p) {
    this.infraHostTop99p = JsonNullable.<Long>of(infraHostTop99p);
    return this;
  }

  /**
   * Shows the 99th percentile of all distinct infrastructure hosts over all hours in the current
   * date for the given org.
   *
   * @return infraHostTop99p
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getInfraHostTop99p() {
    return infraHostTop99p.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_INFRA_HOST_TOP99P)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getInfraHostTop99p_JsonNullable() {
    return infraHostTop99p;
  }

  @JsonProperty(JSON_PROPERTY_INFRA_HOST_TOP99P)
  public void setInfraHostTop99p_JsonNullable(JsonNullable<Long> infraHostTop99p) {
    this.infraHostTop99p = infraHostTop99p;
  }

  public void setInfraHostTop99p(Long infraHostTop99p) {
    this.infraHostTop99p = JsonNullable.<Long>of(infraHostTop99p);
  }

  public UsageSummaryDateOrg ingestedEventsBytesSum(Long ingestedEventsBytesSum) {
    this.ingestedEventsBytesSum = JsonNullable.<Long>of(ingestedEventsBytesSum);
    return this;
  }

  /**
   * Shows the sum of all log bytes ingested over all hours in the current date for the given org.
   *
   * @return ingestedEventsBytesSum
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getIngestedEventsBytesSum() {
    return ingestedEventsBytesSum.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_INGESTED_EVENTS_BYTES_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getIngestedEventsBytesSum_JsonNullable() {
    return ingestedEventsBytesSum;
  }

  @JsonProperty(JSON_PROPERTY_INGESTED_EVENTS_BYTES_SUM)
  public void setIngestedEventsBytesSum_JsonNullable(JsonNullable<Long> ingestedEventsBytesSum) {
    this.ingestedEventsBytesSum = ingestedEventsBytesSum;
  }

  public void setIngestedEventsBytesSum(Long ingestedEventsBytesSum) {
    this.ingestedEventsBytesSum = JsonNullable.<Long>of(ingestedEventsBytesSum);
  }

  public UsageSummaryDateOrg iotDeviceAggSum(Long iotDeviceAggSum) {
    this.iotDeviceAggSum = JsonNullable.<Long>of(iotDeviceAggSum);
    return this;
  }

  /**
   * Shows the sum of all IoT devices over all hours in the current date for the given org.
   *
   * @return iotDeviceAggSum
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getIotDeviceAggSum() {
    return iotDeviceAggSum.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_IOT_DEVICE_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getIotDeviceAggSum_JsonNullable() {
    return iotDeviceAggSum;
  }

  @JsonProperty(JSON_PROPERTY_IOT_DEVICE_AGG_SUM)
  public void setIotDeviceAggSum_JsonNullable(JsonNullable<Long> iotDeviceAggSum) {
    this.iotDeviceAggSum = iotDeviceAggSum;
  }

  public void setIotDeviceAggSum(Long iotDeviceAggSum) {
    this.iotDeviceAggSum = JsonNullable.<Long>of(iotDeviceAggSum);
  }

  public UsageSummaryDateOrg iotDeviceTop99pSum(Long iotDeviceTop99pSum) {
    this.iotDeviceTop99pSum = JsonNullable.<Long>of(iotDeviceTop99pSum);
    return this;
  }

  /**
   * Shows the 99th percentile of all IoT devices over all hours in the current date for the given
   * org.
   *
   * @return iotDeviceTop99pSum
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getIotDeviceTop99pSum() {
    return iotDeviceTop99pSum.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_IOT_DEVICE_TOP99P_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getIotDeviceTop99pSum_JsonNullable() {
    return iotDeviceTop99pSum;
  }

  @JsonProperty(JSON_PROPERTY_IOT_DEVICE_TOP99P_SUM)
  public void setIotDeviceTop99pSum_JsonNullable(JsonNullable<Long> iotDeviceTop99pSum) {
    this.iotDeviceTop99pSum = iotDeviceTop99pSum;
  }

  public void setIotDeviceTop99pSum(Long iotDeviceTop99pSum) {
    this.iotDeviceTop99pSum = JsonNullable.<Long>of(iotDeviceTop99pSum);
  }

  public UsageSummaryDateOrg mobileRumLiteSessionCountSum(Long mobileRumLiteSessionCountSum) {
    this.mobileRumLiteSessionCountSum = JsonNullable.<Long>of(mobileRumLiteSessionCountSum);
    return this;
  }

  /**
   * Shows the sum of all mobile lite sessions over all hours in the current date for the given org.
   *
   * @return mobileRumLiteSessionCountSum
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getMobileRumLiteSessionCountSum() {
    return mobileRumLiteSessionCountSum.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MOBILE_RUM_LITE_SESSION_COUNT_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getMobileRumLiteSessionCountSum_JsonNullable() {
    return mobileRumLiteSessionCountSum;
  }

  @JsonProperty(JSON_PROPERTY_MOBILE_RUM_LITE_SESSION_COUNT_SUM)
  public void setMobileRumLiteSessionCountSum_JsonNullable(
      JsonNullable<Long> mobileRumLiteSessionCountSum) {
    this.mobileRumLiteSessionCountSum = mobileRumLiteSessionCountSum;
  }

  public void setMobileRumLiteSessionCountSum(Long mobileRumLiteSessionCountSum) {
    this.mobileRumLiteSessionCountSum = JsonNullable.<Long>of(mobileRumLiteSessionCountSum);
  }

  public UsageSummaryDateOrg mobileRumSessionCountAndroidSum(Long mobileRumSessionCountAndroidSum) {
    this.mobileRumSessionCountAndroidSum = JsonNullable.<Long>of(mobileRumSessionCountAndroidSum);
    return this;
  }

  /**
   * Shows the sum of all mobile RUM Sessions on Android over all hours in the current date for the
   * given org.
   *
   * @return mobileRumSessionCountAndroidSum
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getMobileRumSessionCountAndroidSum() {
    return mobileRumSessionCountAndroidSum.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MOBILE_RUM_SESSION_COUNT_ANDROID_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getMobileRumSessionCountAndroidSum_JsonNullable() {
    return mobileRumSessionCountAndroidSum;
  }

  @JsonProperty(JSON_PROPERTY_MOBILE_RUM_SESSION_COUNT_ANDROID_SUM)
  public void setMobileRumSessionCountAndroidSum_JsonNullable(
      JsonNullable<Long> mobileRumSessionCountAndroidSum) {
    this.mobileRumSessionCountAndroidSum = mobileRumSessionCountAndroidSum;
  }

  public void setMobileRumSessionCountAndroidSum(Long mobileRumSessionCountAndroidSum) {
    this.mobileRumSessionCountAndroidSum = JsonNullable.<Long>of(mobileRumSessionCountAndroidSum);
  }

  public UsageSummaryDateOrg mobileRumSessionCountFlutterSum(Long mobileRumSessionCountFlutterSum) {
    this.mobileRumSessionCountFlutterSum = JsonNullable.<Long>of(mobileRumSessionCountFlutterSum);
    return this;
  }

  /**
   * Shows the sum of all mobile RUM Sessions on Flutter over all hours in the current date for the
   * given org.
   *
   * @return mobileRumSessionCountFlutterSum
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getMobileRumSessionCountFlutterSum() {
    return mobileRumSessionCountFlutterSum.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MOBILE_RUM_SESSION_COUNT_FLUTTER_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getMobileRumSessionCountFlutterSum_JsonNullable() {
    return mobileRumSessionCountFlutterSum;
  }

  @JsonProperty(JSON_PROPERTY_MOBILE_RUM_SESSION_COUNT_FLUTTER_SUM)
  public void setMobileRumSessionCountFlutterSum_JsonNullable(
      JsonNullable<Long> mobileRumSessionCountFlutterSum) {
    this.mobileRumSessionCountFlutterSum = mobileRumSessionCountFlutterSum;
  }

  public void setMobileRumSessionCountFlutterSum(Long mobileRumSessionCountFlutterSum) {
    this.mobileRumSessionCountFlutterSum = JsonNullable.<Long>of(mobileRumSessionCountFlutterSum);
  }

  public UsageSummaryDateOrg mobileRumSessionCountIosSum(Long mobileRumSessionCountIosSum) {
    this.mobileRumSessionCountIosSum = JsonNullable.<Long>of(mobileRumSessionCountIosSum);
    return this;
  }

  /**
   * Shows the sum of all mobile RUM Sessions on iOS over all hours in the current date for the
   * given org.
   *
   * @return mobileRumSessionCountIosSum
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getMobileRumSessionCountIosSum() {
    return mobileRumSessionCountIosSum.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MOBILE_RUM_SESSION_COUNT_IOS_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getMobileRumSessionCountIosSum_JsonNullable() {
    return mobileRumSessionCountIosSum;
  }

  @JsonProperty(JSON_PROPERTY_MOBILE_RUM_SESSION_COUNT_IOS_SUM)
  public void setMobileRumSessionCountIosSum_JsonNullable(
      JsonNullable<Long> mobileRumSessionCountIosSum) {
    this.mobileRumSessionCountIosSum = mobileRumSessionCountIosSum;
  }

  public void setMobileRumSessionCountIosSum(Long mobileRumSessionCountIosSum) {
    this.mobileRumSessionCountIosSum = JsonNullable.<Long>of(mobileRumSessionCountIosSum);
  }

  public UsageSummaryDateOrg mobileRumSessionCountReactnativeSum(
      Long mobileRumSessionCountReactnativeSum) {
    this.mobileRumSessionCountReactnativeSum =
        JsonNullable.<Long>of(mobileRumSessionCountReactnativeSum);
    return this;
  }

  /**
   * Shows the sum of all mobile RUM Sessions on React Native over all hours in the current date for
   * the given org.
   *
   * @return mobileRumSessionCountReactnativeSum
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getMobileRumSessionCountReactnativeSum() {
    return mobileRumSessionCountReactnativeSum.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MOBILE_RUM_SESSION_COUNT_REACTNATIVE_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getMobileRumSessionCountReactnativeSum_JsonNullable() {
    return mobileRumSessionCountReactnativeSum;
  }

  @JsonProperty(JSON_PROPERTY_MOBILE_RUM_SESSION_COUNT_REACTNATIVE_SUM)
  public void setMobileRumSessionCountReactnativeSum_JsonNullable(
      JsonNullable<Long> mobileRumSessionCountReactnativeSum) {
    this.mobileRumSessionCountReactnativeSum = mobileRumSessionCountReactnativeSum;
  }

  public void setMobileRumSessionCountReactnativeSum(Long mobileRumSessionCountReactnativeSum) {
    this.mobileRumSessionCountReactnativeSum =
        JsonNullable.<Long>of(mobileRumSessionCountReactnativeSum);
  }

  public UsageSummaryDateOrg mobileRumSessionCountSum(Long mobileRumSessionCountSum) {
    this.mobileRumSessionCountSum = JsonNullable.<Long>of(mobileRumSessionCountSum);
    return this;
  }

  /**
   * Shows the sum of all mobile RUM Sessions over all hours in the current date for the given org.
   *
   * @return mobileRumSessionCountSum
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getMobileRumSessionCountSum() {
    return mobileRumSessionCountSum.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MOBILE_RUM_SESSION_COUNT_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getMobileRumSessionCountSum_JsonNullable() {
    return mobileRumSessionCountSum;
  }

  @JsonProperty(JSON_PROPERTY_MOBILE_RUM_SESSION_COUNT_SUM)
  public void setMobileRumSessionCountSum_JsonNullable(
      JsonNullable<Long> mobileRumSessionCountSum) {
    this.mobileRumSessionCountSum = mobileRumSessionCountSum;
  }

  public void setMobileRumSessionCountSum(Long mobileRumSessionCountSum) {
    this.mobileRumSessionCountSum = JsonNullable.<Long>of(mobileRumSessionCountSum);
  }

  public UsageSummaryDateOrg mobileRumUnitsSum(Long mobileRumUnitsSum) {
    this.mobileRumUnitsSum = JsonNullable.<Long>of(mobileRumUnitsSum);
    return this;
  }

  /**
   * Shows the sum of all mobile RUM units over all hours in the current date for the given org.
   *
   * @return mobileRumUnitsSum
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getMobileRumUnitsSum() {
    return mobileRumUnitsSum.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MOBILE_RUM_UNITS_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getMobileRumUnitsSum_JsonNullable() {
    return mobileRumUnitsSum;
  }

  @JsonProperty(JSON_PROPERTY_MOBILE_RUM_UNITS_SUM)
  public void setMobileRumUnitsSum_JsonNullable(JsonNullable<Long> mobileRumUnitsSum) {
    this.mobileRumUnitsSum = mobileRumUnitsSum;
  }

  public void setMobileRumUnitsSum(Long mobileRumUnitsSum) {
    this.mobileRumUnitsSum = JsonNullable.<Long>of(mobileRumUnitsSum);
  }

  public UsageSummaryDateOrg name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The organization name.
   *
   * @return name
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UsageSummaryDateOrg netflowIndexedEventsCountSum(Long netflowIndexedEventsCountSum) {
    this.netflowIndexedEventsCountSum = JsonNullable.<Long>of(netflowIndexedEventsCountSum);
    return this;
  }

  /**
   * Shows the sum of all Network flows indexed over all hours in the current date for the given
   * org.
   *
   * @return netflowIndexedEventsCountSum
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getNetflowIndexedEventsCountSum() {
    return netflowIndexedEventsCountSum.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NETFLOW_INDEXED_EVENTS_COUNT_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getNetflowIndexedEventsCountSum_JsonNullable() {
    return netflowIndexedEventsCountSum;
  }

  @JsonProperty(JSON_PROPERTY_NETFLOW_INDEXED_EVENTS_COUNT_SUM)
  public void setNetflowIndexedEventsCountSum_JsonNullable(
      JsonNullable<Long> netflowIndexedEventsCountSum) {
    this.netflowIndexedEventsCountSum = netflowIndexedEventsCountSum;
  }

  public void setNetflowIndexedEventsCountSum(Long netflowIndexedEventsCountSum) {
    this.netflowIndexedEventsCountSum = JsonNullable.<Long>of(netflowIndexedEventsCountSum);
  }

  public UsageSummaryDateOrg npmHostTop99p(Long npmHostTop99p) {
    this.npmHostTop99p = JsonNullable.<Long>of(npmHostTop99p);
    return this;
  }

  /**
   * Shows the 99th percentile of all distinct Networks hosts over all hours in the current date for
   * the given org.
   *
   * @return npmHostTop99p
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getNpmHostTop99p() {
    return npmHostTop99p.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NPM_HOST_TOP99P)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getNpmHostTop99p_JsonNullable() {
    return npmHostTop99p;
  }

  @JsonProperty(JSON_PROPERTY_NPM_HOST_TOP99P)
  public void setNpmHostTop99p_JsonNullable(JsonNullable<Long> npmHostTop99p) {
    this.npmHostTop99p = npmHostTop99p;
  }

  public void setNpmHostTop99p(Long npmHostTop99p) {
    this.npmHostTop99p = JsonNullable.<Long>of(npmHostTop99p);
  }

  public UsageSummaryDateOrg observabilityPipelinesBytesProcessedSum(
      Long observabilityPipelinesBytesProcessedSum) {
    this.observabilityPipelinesBytesProcessedSum =
        JsonNullable.<Long>of(observabilityPipelinesBytesProcessedSum);
    return this;
  }

  /**
   * Sum of all observability pipelines bytes processed over all hours in the current date for the
   * given org.
   *
   * @return observabilityPipelinesBytesProcessedSum
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getObservabilityPipelinesBytesProcessedSum() {
    return observabilityPipelinesBytesProcessedSum.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_OBSERVABILITY_PIPELINES_BYTES_PROCESSED_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getObservabilityPipelinesBytesProcessedSum_JsonNullable() {
    return observabilityPipelinesBytesProcessedSum;
  }

  @JsonProperty(JSON_PROPERTY_OBSERVABILITY_PIPELINES_BYTES_PROCESSED_SUM)
  public void setObservabilityPipelinesBytesProcessedSum_JsonNullable(
      JsonNullable<Long> observabilityPipelinesBytesProcessedSum) {
    this.observabilityPipelinesBytesProcessedSum = observabilityPipelinesBytesProcessedSum;
  }

  public void setObservabilityPipelinesBytesProcessedSum(
      Long observabilityPipelinesBytesProcessedSum) {
    this.observabilityPipelinesBytesProcessedSum =
        JsonNullable.<Long>of(observabilityPipelinesBytesProcessedSum);
  }

  public UsageSummaryDateOrg onlineArchiveEventsCountSum(Long onlineArchiveEventsCountSum) {
    this.onlineArchiveEventsCountSum = JsonNullable.<Long>of(onlineArchiveEventsCountSum);
    return this;
  }

  /**
   * Sum of all online archived events over all hours in the current date for the given org.
   *
   * @return onlineArchiveEventsCountSum
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getOnlineArchiveEventsCountSum() {
    return onlineArchiveEventsCountSum.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ONLINE_ARCHIVE_EVENTS_COUNT_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getOnlineArchiveEventsCountSum_JsonNullable() {
    return onlineArchiveEventsCountSum;
  }

  @JsonProperty(JSON_PROPERTY_ONLINE_ARCHIVE_EVENTS_COUNT_SUM)
  public void setOnlineArchiveEventsCountSum_JsonNullable(
      JsonNullable<Long> onlineArchiveEventsCountSum) {
    this.onlineArchiveEventsCountSum = onlineArchiveEventsCountSum;
  }

  public void setOnlineArchiveEventsCountSum(Long onlineArchiveEventsCountSum) {
    this.onlineArchiveEventsCountSum = JsonNullable.<Long>of(onlineArchiveEventsCountSum);
  }

  public UsageSummaryDateOrg opentelemetryApmHostTop99p(Long opentelemetryApmHostTop99p) {
    this.opentelemetryApmHostTop99p = JsonNullable.<Long>of(opentelemetryApmHostTop99p);
    return this;
  }

  /**
   * Shows the 99th percentile of APM hosts reported by the Datadog exporter for the OpenTelemetry
   * Collector over all hours in the current date for the given org.
   *
   * @return opentelemetryApmHostTop99p
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getOpentelemetryApmHostTop99p() {
    return opentelemetryApmHostTop99p.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_OPENTELEMETRY_APM_HOST_TOP99P)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getOpentelemetryApmHostTop99p_JsonNullable() {
    return opentelemetryApmHostTop99p;
  }

  @JsonProperty(JSON_PROPERTY_OPENTELEMETRY_APM_HOST_TOP99P)
  public void setOpentelemetryApmHostTop99p_JsonNullable(
      JsonNullable<Long> opentelemetryApmHostTop99p) {
    this.opentelemetryApmHostTop99p = opentelemetryApmHostTop99p;
  }

  public void setOpentelemetryApmHostTop99p(Long opentelemetryApmHostTop99p) {
    this.opentelemetryApmHostTop99p = JsonNullable.<Long>of(opentelemetryApmHostTop99p);
  }

  public UsageSummaryDateOrg opentelemetryHostTop99p(Long opentelemetryHostTop99p) {
    this.opentelemetryHostTop99p = JsonNullable.<Long>of(opentelemetryHostTop99p);
    return this;
  }

  /**
   * Shows the 99th percentile of all hosts reported by the Datadog exporter for the OpenTelemetry
   * Collector over all hours in the current date for the given org.
   *
   * @return opentelemetryHostTop99p
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getOpentelemetryHostTop99p() {
    return opentelemetryHostTop99p.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_OPENTELEMETRY_HOST_TOP99P)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getOpentelemetryHostTop99p_JsonNullable() {
    return opentelemetryHostTop99p;
  }

  @JsonProperty(JSON_PROPERTY_OPENTELEMETRY_HOST_TOP99P)
  public void setOpentelemetryHostTop99p_JsonNullable(JsonNullable<Long> opentelemetryHostTop99p) {
    this.opentelemetryHostTop99p = opentelemetryHostTop99p;
  }

  public void setOpentelemetryHostTop99p(Long opentelemetryHostTop99p) {
    this.opentelemetryHostTop99p = JsonNullable.<Long>of(opentelemetryHostTop99p);
  }

  public UsageSummaryDateOrg profilingHostTop99p(Long profilingHostTop99p) {
    this.profilingHostTop99p = JsonNullable.<Long>of(profilingHostTop99p);
    return this;
  }

  /**
   * Shows the 99th percentile of all profiled hosts over all hours in the current date for the
   * given org.
   *
   * @return profilingHostTop99p
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getProfilingHostTop99p() {
    return profilingHostTop99p.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PROFILING_HOST_TOP99P)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getProfilingHostTop99p_JsonNullable() {
    return profilingHostTop99p;
  }

  @JsonProperty(JSON_PROPERTY_PROFILING_HOST_TOP99P)
  public void setProfilingHostTop99p_JsonNullable(JsonNullable<Long> profilingHostTop99p) {
    this.profilingHostTop99p = profilingHostTop99p;
  }

  public void setProfilingHostTop99p(Long profilingHostTop99p) {
    this.profilingHostTop99p = JsonNullable.<Long>of(profilingHostTop99p);
  }

  public UsageSummaryDateOrg publicId(String publicId) {
    this.publicId = publicId;
    return this;
  }

  /**
   * The organization public id.
   *
   * @return publicId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PUBLIC_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPublicId() {
    return publicId;
  }

  public void setPublicId(String publicId) {
    this.publicId = publicId;
  }

  public UsageSummaryDateOrg region(String region) {
    this.region = region;
    return this;
  }

  /**
   * The region of the organization.
   *
   * @return region
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REGION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  public UsageSummaryDateOrg rumBrowserAndMobileSessionCount(Long rumBrowserAndMobileSessionCount) {
    this.rumBrowserAndMobileSessionCount = JsonNullable.<Long>of(rumBrowserAndMobileSessionCount);
    return this;
  }

  /**
   * Shows the sum of all mobile sessions and all browser lite and legacy sessions over all hours in
   * the current date for the given org.
   *
   * @return rumBrowserAndMobileSessionCount
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getRumBrowserAndMobileSessionCount() {
    return rumBrowserAndMobileSessionCount.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_RUM_BROWSER_AND_MOBILE_SESSION_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getRumBrowserAndMobileSessionCount_JsonNullable() {
    return rumBrowserAndMobileSessionCount;
  }

  @JsonProperty(JSON_PROPERTY_RUM_BROWSER_AND_MOBILE_SESSION_COUNT)
  public void setRumBrowserAndMobileSessionCount_JsonNullable(
      JsonNullable<Long> rumBrowserAndMobileSessionCount) {
    this.rumBrowserAndMobileSessionCount = rumBrowserAndMobileSessionCount;
  }

  public void setRumBrowserAndMobileSessionCount(Long rumBrowserAndMobileSessionCount) {
    this.rumBrowserAndMobileSessionCount = JsonNullable.<Long>of(rumBrowserAndMobileSessionCount);
  }

  public UsageSummaryDateOrg rumSessionCountSum(Long rumSessionCountSum) {
    this.rumSessionCountSum = JsonNullable.<Long>of(rumSessionCountSum);
    return this;
  }

  /**
   * Shows the sum of all browser RUM Lite Sessions over all hours in the current date for the given
   * org.
   *
   * @return rumSessionCountSum
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getRumSessionCountSum() {
    return rumSessionCountSum.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_RUM_SESSION_COUNT_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getRumSessionCountSum_JsonNullable() {
    return rumSessionCountSum;
  }

  @JsonProperty(JSON_PROPERTY_RUM_SESSION_COUNT_SUM)
  public void setRumSessionCountSum_JsonNullable(JsonNullable<Long> rumSessionCountSum) {
    this.rumSessionCountSum = rumSessionCountSum;
  }

  public void setRumSessionCountSum(Long rumSessionCountSum) {
    this.rumSessionCountSum = JsonNullable.<Long>of(rumSessionCountSum);
  }

  public UsageSummaryDateOrg rumTotalSessionCountSum(Long rumTotalSessionCountSum) {
    this.rumTotalSessionCountSum = JsonNullable.<Long>of(rumTotalSessionCountSum);
    return this;
  }

  /**
   * Shows the sum of RUM Sessions (browser and mobile) over all hours in the current date for the
   * given org.
   *
   * @return rumTotalSessionCountSum
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getRumTotalSessionCountSum() {
    return rumTotalSessionCountSum.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_RUM_TOTAL_SESSION_COUNT_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getRumTotalSessionCountSum_JsonNullable() {
    return rumTotalSessionCountSum;
  }

  @JsonProperty(JSON_PROPERTY_RUM_TOTAL_SESSION_COUNT_SUM)
  public void setRumTotalSessionCountSum_JsonNullable(JsonNullable<Long> rumTotalSessionCountSum) {
    this.rumTotalSessionCountSum = rumTotalSessionCountSum;
  }

  public void setRumTotalSessionCountSum(Long rumTotalSessionCountSum) {
    this.rumTotalSessionCountSum = JsonNullable.<Long>of(rumTotalSessionCountSum);
  }

  public UsageSummaryDateOrg rumUnitsSum(Long rumUnitsSum) {
    this.rumUnitsSum = JsonNullable.<Long>of(rumUnitsSum);
    return this;
  }

  /**
   * Shows the sum of all browser and mobile RUM units over all hours in the current date for the
   * given org.
   *
   * @return rumUnitsSum
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getRumUnitsSum() {
    return rumUnitsSum.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_RUM_UNITS_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getRumUnitsSum_JsonNullable() {
    return rumUnitsSum;
  }

  @JsonProperty(JSON_PROPERTY_RUM_UNITS_SUM)
  public void setRumUnitsSum_JsonNullable(JsonNullable<Long> rumUnitsSum) {
    this.rumUnitsSum = rumUnitsSum;
  }

  public void setRumUnitsSum(Long rumUnitsSum) {
    this.rumUnitsSum = JsonNullable.<Long>of(rumUnitsSum);
  }

  public UsageSummaryDateOrg sdsApmScannedBytesSum(Long sdsApmScannedBytesSum) {
    this.sdsApmScannedBytesSum = JsonNullable.<Long>of(sdsApmScannedBytesSum);
    return this;
  }

  /**
   * Sum of all APM bytes scanned with sensitive data scanner over all hours in the current date for
   * the given org.
   *
   * @return sdsApmScannedBytesSum
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getSdsApmScannedBytesSum() {
    return sdsApmScannedBytesSum.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SDS_APM_SCANNED_BYTES_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getSdsApmScannedBytesSum_JsonNullable() {
    return sdsApmScannedBytesSum;
  }

  @JsonProperty(JSON_PROPERTY_SDS_APM_SCANNED_BYTES_SUM)
  public void setSdsApmScannedBytesSum_JsonNullable(JsonNullable<Long> sdsApmScannedBytesSum) {
    this.sdsApmScannedBytesSum = sdsApmScannedBytesSum;
  }

  public void setSdsApmScannedBytesSum(Long sdsApmScannedBytesSum) {
    this.sdsApmScannedBytesSum = JsonNullable.<Long>of(sdsApmScannedBytesSum);
  }

  public UsageSummaryDateOrg sdsEventsScannedBytesSum(Long sdsEventsScannedBytesSum) {
    this.sdsEventsScannedBytesSum = JsonNullable.<Long>of(sdsEventsScannedBytesSum);
    return this;
  }

  /**
   * Sum of all event stream events bytes scanned with sensitive data scanner over all hours in the
   * current date for the given org.
   *
   * @return sdsEventsScannedBytesSum
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getSdsEventsScannedBytesSum() {
    return sdsEventsScannedBytesSum.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SDS_EVENTS_SCANNED_BYTES_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getSdsEventsScannedBytesSum_JsonNullable() {
    return sdsEventsScannedBytesSum;
  }

  @JsonProperty(JSON_PROPERTY_SDS_EVENTS_SCANNED_BYTES_SUM)
  public void setSdsEventsScannedBytesSum_JsonNullable(
      JsonNullable<Long> sdsEventsScannedBytesSum) {
    this.sdsEventsScannedBytesSum = sdsEventsScannedBytesSum;
  }

  public void setSdsEventsScannedBytesSum(Long sdsEventsScannedBytesSum) {
    this.sdsEventsScannedBytesSum = JsonNullable.<Long>of(sdsEventsScannedBytesSum);
  }

  public UsageSummaryDateOrg sdsLogsScannedBytesSum(Long sdsLogsScannedBytesSum) {
    this.sdsLogsScannedBytesSum = JsonNullable.<Long>of(sdsLogsScannedBytesSum);
    return this;
  }

  /**
   * Shows the sum of all bytes scanned of logs usage by the Sensitive Data Scanner over all hours
   * in the current month for the given org.
   *
   * @return sdsLogsScannedBytesSum
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getSdsLogsScannedBytesSum() {
    return sdsLogsScannedBytesSum.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SDS_LOGS_SCANNED_BYTES_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getSdsLogsScannedBytesSum_JsonNullable() {
    return sdsLogsScannedBytesSum;
  }

  @JsonProperty(JSON_PROPERTY_SDS_LOGS_SCANNED_BYTES_SUM)
  public void setSdsLogsScannedBytesSum_JsonNullable(JsonNullable<Long> sdsLogsScannedBytesSum) {
    this.sdsLogsScannedBytesSum = sdsLogsScannedBytesSum;
  }

  public void setSdsLogsScannedBytesSum(Long sdsLogsScannedBytesSum) {
    this.sdsLogsScannedBytesSum = JsonNullable.<Long>of(sdsLogsScannedBytesSum);
  }

  public UsageSummaryDateOrg sdsRumScannedBytesSum(Long sdsRumScannedBytesSum) {
    this.sdsRumScannedBytesSum = JsonNullable.<Long>of(sdsRumScannedBytesSum);
    return this;
  }

  /**
   * Sum of all RUM bytes scanned with sensitive data scanner over all hours in the current date for
   * the given org.
   *
   * @return sdsRumScannedBytesSum
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getSdsRumScannedBytesSum() {
    return sdsRumScannedBytesSum.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SDS_RUM_SCANNED_BYTES_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getSdsRumScannedBytesSum_JsonNullable() {
    return sdsRumScannedBytesSum;
  }

  @JsonProperty(JSON_PROPERTY_SDS_RUM_SCANNED_BYTES_SUM)
  public void setSdsRumScannedBytesSum_JsonNullable(JsonNullable<Long> sdsRumScannedBytesSum) {
    this.sdsRumScannedBytesSum = sdsRumScannedBytesSum;
  }

  public void setSdsRumScannedBytesSum(Long sdsRumScannedBytesSum) {
    this.sdsRumScannedBytesSum = JsonNullable.<Long>of(sdsRumScannedBytesSum);
  }

  public UsageSummaryDateOrg sdsTotalScannedBytesSum(Long sdsTotalScannedBytesSum) {
    this.sdsTotalScannedBytesSum = JsonNullable.<Long>of(sdsTotalScannedBytesSum);
    return this;
  }

  /**
   * Shows the sum of all bytes scanned across all usage types by the Sensitive Data Scanner over
   * all hours in the current month for the given org.
   *
   * @return sdsTotalScannedBytesSum
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getSdsTotalScannedBytesSum() {
    return sdsTotalScannedBytesSum.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SDS_TOTAL_SCANNED_BYTES_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getSdsTotalScannedBytesSum_JsonNullable() {
    return sdsTotalScannedBytesSum;
  }

  @JsonProperty(JSON_PROPERTY_SDS_TOTAL_SCANNED_BYTES_SUM)
  public void setSdsTotalScannedBytesSum_JsonNullable(JsonNullable<Long> sdsTotalScannedBytesSum) {
    this.sdsTotalScannedBytesSum = sdsTotalScannedBytesSum;
  }

  public void setSdsTotalScannedBytesSum(Long sdsTotalScannedBytesSum) {
    this.sdsTotalScannedBytesSum = JsonNullable.<Long>of(sdsTotalScannedBytesSum);
  }

  public UsageSummaryDateOrg syntheticsBrowserCheckCallsCountSum(
      Long syntheticsBrowserCheckCallsCountSum) {
    this.syntheticsBrowserCheckCallsCountSum =
        JsonNullable.<Long>of(syntheticsBrowserCheckCallsCountSum);
    return this;
  }

  /**
   * Shows the sum of all Synthetic browser tests over all hours in the current date for the given
   * org.
   *
   * @return syntheticsBrowserCheckCallsCountSum
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getSyntheticsBrowserCheckCallsCountSum() {
    return syntheticsBrowserCheckCallsCountSum.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SYNTHETICS_BROWSER_CHECK_CALLS_COUNT_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getSyntheticsBrowserCheckCallsCountSum_JsonNullable() {
    return syntheticsBrowserCheckCallsCountSum;
  }

  @JsonProperty(JSON_PROPERTY_SYNTHETICS_BROWSER_CHECK_CALLS_COUNT_SUM)
  public void setSyntheticsBrowserCheckCallsCountSum_JsonNullable(
      JsonNullable<Long> syntheticsBrowserCheckCallsCountSum) {
    this.syntheticsBrowserCheckCallsCountSum = syntheticsBrowserCheckCallsCountSum;
  }

  public void setSyntheticsBrowserCheckCallsCountSum(Long syntheticsBrowserCheckCallsCountSum) {
    this.syntheticsBrowserCheckCallsCountSum =
        JsonNullable.<Long>of(syntheticsBrowserCheckCallsCountSum);
  }

  public UsageSummaryDateOrg syntheticsCheckCallsCountSum(Long syntheticsCheckCallsCountSum) {
    this.syntheticsCheckCallsCountSum = JsonNullable.<Long>of(syntheticsCheckCallsCountSum);
    return this;
  }

  /**
   * Shows the sum of all Synthetic API tests over all hours in the current date for the given org.
   *
   * @return syntheticsCheckCallsCountSum
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getSyntheticsCheckCallsCountSum() {
    return syntheticsCheckCallsCountSum.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SYNTHETICS_CHECK_CALLS_COUNT_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getSyntheticsCheckCallsCountSum_JsonNullable() {
    return syntheticsCheckCallsCountSum;
  }

  @JsonProperty(JSON_PROPERTY_SYNTHETICS_CHECK_CALLS_COUNT_SUM)
  public void setSyntheticsCheckCallsCountSum_JsonNullable(
      JsonNullable<Long> syntheticsCheckCallsCountSum) {
    this.syntheticsCheckCallsCountSum = syntheticsCheckCallsCountSum;
  }

  public void setSyntheticsCheckCallsCountSum(Long syntheticsCheckCallsCountSum) {
    this.syntheticsCheckCallsCountSum = JsonNullable.<Long>of(syntheticsCheckCallsCountSum);
  }

  public UsageSummaryDateOrg syntheticsParallelTestingMaxSlotsHwm(
      Long syntheticsParallelTestingMaxSlotsHwm) {
    this.syntheticsParallelTestingMaxSlotsHwm =
        JsonNullable.<Long>of(syntheticsParallelTestingMaxSlotsHwm);
    return this;
  }

  /**
   * Shows the high-water mark of used synthetics parallel testing slots over all hours in the
   * current date for the given org.
   *
   * @return syntheticsParallelTestingMaxSlotsHwm
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getSyntheticsParallelTestingMaxSlotsHwm() {
    return syntheticsParallelTestingMaxSlotsHwm.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SYNTHETICS_PARALLEL_TESTING_MAX_SLOTS_HWM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getSyntheticsParallelTestingMaxSlotsHwm_JsonNullable() {
    return syntheticsParallelTestingMaxSlotsHwm;
  }

  @JsonProperty(JSON_PROPERTY_SYNTHETICS_PARALLEL_TESTING_MAX_SLOTS_HWM)
  public void setSyntheticsParallelTestingMaxSlotsHwm_JsonNullable(
      JsonNullable<Long> syntheticsParallelTestingMaxSlotsHwm) {
    this.syntheticsParallelTestingMaxSlotsHwm = syntheticsParallelTestingMaxSlotsHwm;
  }

  public void setSyntheticsParallelTestingMaxSlotsHwm(Long syntheticsParallelTestingMaxSlotsHwm) {
    this.syntheticsParallelTestingMaxSlotsHwm =
        JsonNullable.<Long>of(syntheticsParallelTestingMaxSlotsHwm);
  }

  public UsageSummaryDateOrg traceSearchIndexedEventsCountSum(
      Long traceSearchIndexedEventsCountSum) {
    this.traceSearchIndexedEventsCountSum = JsonNullable.<Long>of(traceSearchIndexedEventsCountSum);
    return this;
  }

  /**
   * Shows the sum of all Indexed Spans indexed over all hours in the current date for the given
   * org.
   *
   * @return traceSearchIndexedEventsCountSum
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getTraceSearchIndexedEventsCountSum() {
    return traceSearchIndexedEventsCountSum.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TRACE_SEARCH_INDEXED_EVENTS_COUNT_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getTraceSearchIndexedEventsCountSum_JsonNullable() {
    return traceSearchIndexedEventsCountSum;
  }

  @JsonProperty(JSON_PROPERTY_TRACE_SEARCH_INDEXED_EVENTS_COUNT_SUM)
  public void setTraceSearchIndexedEventsCountSum_JsonNullable(
      JsonNullable<Long> traceSearchIndexedEventsCountSum) {
    this.traceSearchIndexedEventsCountSum = traceSearchIndexedEventsCountSum;
  }

  public void setTraceSearchIndexedEventsCountSum(Long traceSearchIndexedEventsCountSum) {
    this.traceSearchIndexedEventsCountSum = JsonNullable.<Long>of(traceSearchIndexedEventsCountSum);
  }

  public UsageSummaryDateOrg twolIngestedEventsBytesSum(Long twolIngestedEventsBytesSum) {
    this.twolIngestedEventsBytesSum = JsonNullable.<Long>of(twolIngestedEventsBytesSum);
    return this;
  }

  /**
   * Shows the sum of all ingested APM span bytes over all hours in the current date for the given
   * org.
   *
   * @return twolIngestedEventsBytesSum
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getTwolIngestedEventsBytesSum() {
    return twolIngestedEventsBytesSum.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TWOL_INGESTED_EVENTS_BYTES_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getTwolIngestedEventsBytesSum_JsonNullable() {
    return twolIngestedEventsBytesSum;
  }

  @JsonProperty(JSON_PROPERTY_TWOL_INGESTED_EVENTS_BYTES_SUM)
  public void setTwolIngestedEventsBytesSum_JsonNullable(
      JsonNullable<Long> twolIngestedEventsBytesSum) {
    this.twolIngestedEventsBytesSum = twolIngestedEventsBytesSum;
  }

  public void setTwolIngestedEventsBytesSum(Long twolIngestedEventsBytesSum) {
    this.twolIngestedEventsBytesSum = JsonNullable.<Long>of(twolIngestedEventsBytesSum);
  }

  public UsageSummaryDateOrg universalServiceMonitoringHostTop99p(
      Long universalServiceMonitoringHostTop99p) {
    this.universalServiceMonitoringHostTop99p =
        JsonNullable.<Long>of(universalServiceMonitoringHostTop99p);
    return this;
  }

  /**
   * Shows the 99th percentile of all Universal Service Monitoring hosts over all hours in the
   * current date for the given org.
   *
   * @return universalServiceMonitoringHostTop99p
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getUniversalServiceMonitoringHostTop99p() {
    return universalServiceMonitoringHostTop99p.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_UNIVERSAL_SERVICE_MONITORING_HOST_TOP99P)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getUniversalServiceMonitoringHostTop99p_JsonNullable() {
    return universalServiceMonitoringHostTop99p;
  }

  @JsonProperty(JSON_PROPERTY_UNIVERSAL_SERVICE_MONITORING_HOST_TOP99P)
  public void setUniversalServiceMonitoringHostTop99p_JsonNullable(
      JsonNullable<Long> universalServiceMonitoringHostTop99p) {
    this.universalServiceMonitoringHostTop99p = universalServiceMonitoringHostTop99p;
  }

  public void setUniversalServiceMonitoringHostTop99p(Long universalServiceMonitoringHostTop99p) {
    this.universalServiceMonitoringHostTop99p =
        JsonNullable.<Long>of(universalServiceMonitoringHostTop99p);
  }

  public UsageSummaryDateOrg vsphereHostTop99p(Long vsphereHostTop99p) {
    this.vsphereHostTop99p = JsonNullable.<Long>of(vsphereHostTop99p);
    return this;
  }

  /**
   * Shows the 99th percentile of all vSphere hosts over all hours in the current date for the given
   * org.
   *
   * @return vsphereHostTop99p
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getVsphereHostTop99p() {
    return vsphereHostTop99p.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_VSPHERE_HOST_TOP99P)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getVsphereHostTop99p_JsonNullable() {
    return vsphereHostTop99p;
  }

  @JsonProperty(JSON_PROPERTY_VSPHERE_HOST_TOP99P)
  public void setVsphereHostTop99p_JsonNullable(JsonNullable<Long> vsphereHostTop99p) {
    this.vsphereHostTop99p = vsphereHostTop99p;
  }

  public void setVsphereHostTop99p(Long vsphereHostTop99p) {
    this.vsphereHostTop99p = JsonNullable.<Long>of(vsphereHostTop99p);
  }

  /** Return true if this UsageSummaryDateOrg object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsageSummaryDateOrg usageSummaryDateOrg = (UsageSummaryDateOrg) o;
    return Objects.equals(this.agentHostTop99p, usageSummaryDateOrg.agentHostTop99p)
        && Objects.equals(
            this.apmAzureAppServiceHostTop99p, usageSummaryDateOrg.apmAzureAppServiceHostTop99p)
        && Objects.equals(this.apmFargateCountAvg, usageSummaryDateOrg.apmFargateCountAvg)
        && Objects.equals(this.apmHostTop99p, usageSummaryDateOrg.apmHostTop99p)
        && Objects.equals(this.appsecFargateCountAvg, usageSummaryDateOrg.appsecFargateCountAvg)
        && Objects.equals(
            this.auditLogsLinesIndexedSum, usageSummaryDateOrg.auditLogsLinesIndexedSum)
        && Objects.equals(this.auditTrailEnabledHwm, usageSummaryDateOrg.auditTrailEnabledHwm)
        && Objects.equals(this.avgProfiledFargateTasks, usageSummaryDateOrg.avgProfiledFargateTasks)
        && Objects.equals(this.awsHostTop99p, usageSummaryDateOrg.awsHostTop99p)
        && Objects.equals(this.awsLambdaFuncCount, usageSummaryDateOrg.awsLambdaFuncCount)
        && Objects.equals(this.awsLambdaInvocationsSum, usageSummaryDateOrg.awsLambdaInvocationsSum)
        && Objects.equals(this.azureAppServiceTop99p, usageSummaryDateOrg.azureAppServiceTop99p)
        && Objects.equals(
            this.billableIngestedBytesSum, usageSummaryDateOrg.billableIngestedBytesSum)
        && Objects.equals(
            this.browserRumLiteSessionCountSum, usageSummaryDateOrg.browserRumLiteSessionCountSum)
        && Objects.equals(
            this.browserRumReplaySessionCountSum,
            usageSummaryDateOrg.browserRumReplaySessionCountSum)
        && Objects.equals(this.browserRumUnitsSum, usageSummaryDateOrg.browserRumUnitsSum)
        && Objects.equals(
            this.ciPipelineIndexedSpansSum, usageSummaryDateOrg.ciPipelineIndexedSpansSum)
        && Objects.equals(this.ciTestIndexedSpansSum, usageSummaryDateOrg.ciTestIndexedSpansSum)
        && Objects.equals(
            this.ciVisibilityPipelineCommittersHwm,
            usageSummaryDateOrg.ciVisibilityPipelineCommittersHwm)
        && Objects.equals(
            this.ciVisibilityTestCommittersHwm, usageSummaryDateOrg.ciVisibilityTestCommittersHwm)
        && Objects.equals(
            this.cloudCostManagementHostCountAvg,
            usageSummaryDateOrg.cloudCostManagementHostCountAvg)
        && Objects.equals(this.containerAvg, usageSummaryDateOrg.containerAvg)
        && Objects.equals(this.containerExclAgentAvg, usageSummaryDateOrg.containerExclAgentAvg)
        && Objects.equals(this.containerHwm, usageSummaryDateOrg.containerHwm)
        && Objects.equals(this.cspmAasHostTop99p, usageSummaryDateOrg.cspmAasHostTop99p)
        && Objects.equals(this.cspmAwsHostTop99p, usageSummaryDateOrg.cspmAwsHostTop99p)
        && Objects.equals(this.cspmAzureHostTop99p, usageSummaryDateOrg.cspmAzureHostTop99p)
        && Objects.equals(this.cspmContainerAvg, usageSummaryDateOrg.cspmContainerAvg)
        && Objects.equals(this.cspmContainerHwm, usageSummaryDateOrg.cspmContainerHwm)
        && Objects.equals(this.cspmGcpHostTop99p, usageSummaryDateOrg.cspmGcpHostTop99p)
        && Objects.equals(this.cspmHostTop99p, usageSummaryDateOrg.cspmHostTop99p)
        && Objects.equals(this.customTsAvg, usageSummaryDateOrg.customTsAvg)
        && Objects.equals(this.cwsContainerCountAvg, usageSummaryDateOrg.cwsContainerCountAvg)
        && Objects.equals(this.cwsHostTop99p, usageSummaryDateOrg.cwsHostTop99p)
        && Objects.equals(this.dbmHostTop99pSum, usageSummaryDateOrg.dbmHostTop99pSum)
        && Objects.equals(this.dbmQueriesAvgSum, usageSummaryDateOrg.dbmQueriesAvgSum)
        && Objects.equals(this.fargateTasksCountAvg, usageSummaryDateOrg.fargateTasksCountAvg)
        && Objects.equals(this.fargateTasksCountHwm, usageSummaryDateOrg.fargateTasksCountHwm)
        && Objects.equals(
            this.forwardingEventsBytesSum, usageSummaryDateOrg.forwardingEventsBytesSum)
        && Objects.equals(this.gcpHostTop99p, usageSummaryDateOrg.gcpHostTop99p)
        && Objects.equals(this.herokuHostTop99p, usageSummaryDateOrg.herokuHostTop99p)
        && Objects.equals(this.id, usageSummaryDateOrg.id)
        && Objects.equals(
            this.incidentManagementMonthlyActiveUsersHwm,
            usageSummaryDateOrg.incidentManagementMonthlyActiveUsersHwm)
        && Objects.equals(this.indexedEventsCountSum, usageSummaryDateOrg.indexedEventsCountSum)
        && Objects.equals(this.infraHostTop99p, usageSummaryDateOrg.infraHostTop99p)
        && Objects.equals(this.ingestedEventsBytesSum, usageSummaryDateOrg.ingestedEventsBytesSum)
        && Objects.equals(this.iotDeviceAggSum, usageSummaryDateOrg.iotDeviceAggSum)
        && Objects.equals(this.iotDeviceTop99pSum, usageSummaryDateOrg.iotDeviceTop99pSum)
        && Objects.equals(
            this.mobileRumLiteSessionCountSum, usageSummaryDateOrg.mobileRumLiteSessionCountSum)
        && Objects.equals(
            this.mobileRumSessionCountAndroidSum,
            usageSummaryDateOrg.mobileRumSessionCountAndroidSum)
        && Objects.equals(
            this.mobileRumSessionCountFlutterSum,
            usageSummaryDateOrg.mobileRumSessionCountFlutterSum)
        && Objects.equals(
            this.mobileRumSessionCountIosSum, usageSummaryDateOrg.mobileRumSessionCountIosSum)
        && Objects.equals(
            this.mobileRumSessionCountReactnativeSum,
            usageSummaryDateOrg.mobileRumSessionCountReactnativeSum)
        && Objects.equals(
            this.mobileRumSessionCountSum, usageSummaryDateOrg.mobileRumSessionCountSum)
        && Objects.equals(this.mobileRumUnitsSum, usageSummaryDateOrg.mobileRumUnitsSum)
        && Objects.equals(this.name, usageSummaryDateOrg.name)
        && Objects.equals(
            this.netflowIndexedEventsCountSum, usageSummaryDateOrg.netflowIndexedEventsCountSum)
        && Objects.equals(this.npmHostTop99p, usageSummaryDateOrg.npmHostTop99p)
        && Objects.equals(
            this.observabilityPipelinesBytesProcessedSum,
            usageSummaryDateOrg.observabilityPipelinesBytesProcessedSum)
        && Objects.equals(
            this.onlineArchiveEventsCountSum, usageSummaryDateOrg.onlineArchiveEventsCountSum)
        && Objects.equals(
            this.opentelemetryApmHostTop99p, usageSummaryDateOrg.opentelemetryApmHostTop99p)
        && Objects.equals(this.opentelemetryHostTop99p, usageSummaryDateOrg.opentelemetryHostTop99p)
        && Objects.equals(this.profilingHostTop99p, usageSummaryDateOrg.profilingHostTop99p)
        && Objects.equals(this.publicId, usageSummaryDateOrg.publicId)
        && Objects.equals(this.region, usageSummaryDateOrg.region)
        && Objects.equals(
            this.rumBrowserAndMobileSessionCount,
            usageSummaryDateOrg.rumBrowserAndMobileSessionCount)
        && Objects.equals(this.rumSessionCountSum, usageSummaryDateOrg.rumSessionCountSum)
        && Objects.equals(this.rumTotalSessionCountSum, usageSummaryDateOrg.rumTotalSessionCountSum)
        && Objects.equals(this.rumUnitsSum, usageSummaryDateOrg.rumUnitsSum)
        && Objects.equals(this.sdsApmScannedBytesSum, usageSummaryDateOrg.sdsApmScannedBytesSum)
        && Objects.equals(
            this.sdsEventsScannedBytesSum, usageSummaryDateOrg.sdsEventsScannedBytesSum)
        && Objects.equals(this.sdsLogsScannedBytesSum, usageSummaryDateOrg.sdsLogsScannedBytesSum)
        && Objects.equals(this.sdsRumScannedBytesSum, usageSummaryDateOrg.sdsRumScannedBytesSum)
        && Objects.equals(this.sdsTotalScannedBytesSum, usageSummaryDateOrg.sdsTotalScannedBytesSum)
        && Objects.equals(
            this.syntheticsBrowserCheckCallsCountSum,
            usageSummaryDateOrg.syntheticsBrowserCheckCallsCountSum)
        && Objects.equals(
            this.syntheticsCheckCallsCountSum, usageSummaryDateOrg.syntheticsCheckCallsCountSum)
        && Objects.equals(
            this.syntheticsParallelTestingMaxSlotsHwm,
            usageSummaryDateOrg.syntheticsParallelTestingMaxSlotsHwm)
        && Objects.equals(
            this.traceSearchIndexedEventsCountSum,
            usageSummaryDateOrg.traceSearchIndexedEventsCountSum)
        && Objects.equals(
            this.twolIngestedEventsBytesSum, usageSummaryDateOrg.twolIngestedEventsBytesSum)
        && Objects.equals(
            this.universalServiceMonitoringHostTop99p,
            usageSummaryDateOrg.universalServiceMonitoringHostTop99p)
        && Objects.equals(this.vsphereHostTop99p, usageSummaryDateOrg.vsphereHostTop99p);
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
        auditTrailEnabledHwm,
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
        cloudCostManagementHostCountAvg,
        containerAvg,
        containerExclAgentAvg,
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
        dbmHostTop99pSum,
        dbmQueriesAvgSum,
        fargateTasksCountAvg,
        fargateTasksCountHwm,
        forwardingEventsBytesSum,
        gcpHostTop99p,
        herokuHostTop99p,
        id,
        incidentManagementMonthlyActiveUsersHwm,
        indexedEventsCountSum,
        infraHostTop99p,
        ingestedEventsBytesSum,
        iotDeviceAggSum,
        iotDeviceTop99pSum,
        mobileRumLiteSessionCountSum,
        mobileRumSessionCountAndroidSum,
        mobileRumSessionCountFlutterSum,
        mobileRumSessionCountIosSum,
        mobileRumSessionCountReactnativeSum,
        mobileRumSessionCountSum,
        mobileRumUnitsSum,
        name,
        netflowIndexedEventsCountSum,
        npmHostTop99p,
        observabilityPipelinesBytesProcessedSum,
        onlineArchiveEventsCountSum,
        opentelemetryApmHostTop99p,
        opentelemetryHostTop99p,
        profilingHostTop99p,
        publicId,
        region,
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
        syntheticsParallelTestingMaxSlotsHwm,
        traceSearchIndexedEventsCountSum,
        twolIngestedEventsBytesSum,
        universalServiceMonitoringHostTop99p,
        vsphereHostTop99p);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageSummaryDateOrg {\n");
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
    sb.append("    auditTrailEnabledHwm: ")
        .append(toIndentedString(auditTrailEnabledHwm))
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
    sb.append("    cloudCostManagementHostCountAvg: ")
        .append(toIndentedString(cloudCostManagementHostCountAvg))
        .append("\n");
    sb.append("    containerAvg: ").append(toIndentedString(containerAvg)).append("\n");
    sb.append("    containerExclAgentAvg: ")
        .append(toIndentedString(containerExclAgentAvg))
        .append("\n");
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
    sb.append("    dbmHostTop99pSum: ").append(toIndentedString(dbmHostTop99pSum)).append("\n");
    sb.append("    dbmQueriesAvgSum: ").append(toIndentedString(dbmQueriesAvgSum)).append("\n");
    sb.append("    fargateTasksCountAvg: ")
        .append(toIndentedString(fargateTasksCountAvg))
        .append("\n");
    sb.append("    fargateTasksCountHwm: ")
        .append(toIndentedString(fargateTasksCountHwm))
        .append("\n");
    sb.append("    forwardingEventsBytesSum: ")
        .append(toIndentedString(forwardingEventsBytesSum))
        .append("\n");
    sb.append("    gcpHostTop99p: ").append(toIndentedString(gcpHostTop99p)).append("\n");
    sb.append("    herokuHostTop99p: ").append(toIndentedString(herokuHostTop99p)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
    sb.append("    iotDeviceAggSum: ").append(toIndentedString(iotDeviceAggSum)).append("\n");
    sb.append("    iotDeviceTop99pSum: ").append(toIndentedString(iotDeviceTop99pSum)).append("\n");
    sb.append("    mobileRumLiteSessionCountSum: ")
        .append(toIndentedString(mobileRumLiteSessionCountSum))
        .append("\n");
    sb.append("    mobileRumSessionCountAndroidSum: ")
        .append(toIndentedString(mobileRumSessionCountAndroidSum))
        .append("\n");
    sb.append("    mobileRumSessionCountFlutterSum: ")
        .append(toIndentedString(mobileRumSessionCountFlutterSum))
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
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
    sb.append("    profilingHostTop99p: ")
        .append(toIndentedString(profilingHostTop99p))
        .append("\n");
    sb.append("    publicId: ").append(toIndentedString(publicId)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
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
    sb.append("    syntheticsParallelTestingMaxSlotsHwm: ")
        .append(toIndentedString(syntheticsParallelTestingMaxSlotsHwm))
        .append("\n");
    sb.append("    traceSearchIndexedEventsCountSum: ")
        .append(toIndentedString(traceSearchIndexedEventsCountSum))
        .append("\n");
    sb.append("    twolIngestedEventsBytesSum: ")
        .append(toIndentedString(twolIngestedEventsBytesSum))
        .append("\n");
    sb.append("    universalServiceMonitoringHostTop99p: ")
        .append(toIndentedString(universalServiceMonitoringHostTop99p))
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
