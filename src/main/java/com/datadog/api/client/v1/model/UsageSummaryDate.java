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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Response with hourly report of all data billed by Datadog all organizations. */
@JsonPropertyOrder({
  UsageSummaryDate.JSON_PROPERTY_AGENT_HOST_TOP99P,
  UsageSummaryDate.JSON_PROPERTY_APM_AZURE_APP_SERVICE_HOST_TOP99P,
  UsageSummaryDate.JSON_PROPERTY_APM_DEVSECOPS_HOST_TOP99P,
  UsageSummaryDate.JSON_PROPERTY_APM_FARGATE_COUNT_AVG,
  UsageSummaryDate.JSON_PROPERTY_APM_HOST_TOP99P,
  UsageSummaryDate.JSON_PROPERTY_APPSEC_FARGATE_COUNT_AVG,
  UsageSummaryDate.JSON_PROPERTY_ASM_SERVERLESS_SUM,
  UsageSummaryDate.JSON_PROPERTY_AUDIT_LOGS_LINES_INDEXED_SUM,
  UsageSummaryDate.JSON_PROPERTY_AUDIT_TRAIL_ENABLED_HWM,
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
  UsageSummaryDate.JSON_PROPERTY_CI_VISIBILITY_ITR_COMMITTERS_HWM,
  UsageSummaryDate.JSON_PROPERTY_CI_VISIBILITY_PIPELINE_COMMITTERS_HWM,
  UsageSummaryDate.JSON_PROPERTY_CI_VISIBILITY_TEST_COMMITTERS_HWM,
  UsageSummaryDate.JSON_PROPERTY_CLOUD_COST_MANAGEMENT_AWS_HOST_COUNT_AVG,
  UsageSummaryDate.JSON_PROPERTY_CLOUD_COST_MANAGEMENT_AZURE_HOST_COUNT_AVG,
  UsageSummaryDate.JSON_PROPERTY_CLOUD_COST_MANAGEMENT_GCP_HOST_COUNT_AVG,
  UsageSummaryDate.JSON_PROPERTY_CLOUD_COST_MANAGEMENT_HOST_COUNT_AVG,
  UsageSummaryDate.JSON_PROPERTY_CLOUD_SIEM_EVENTS_SUM,
  UsageSummaryDate.JSON_PROPERTY_CODE_ANALYSIS_SA_COMMITTERS_HWM,
  UsageSummaryDate.JSON_PROPERTY_CODE_ANALYSIS_SCA_COMMITTERS_HWM,
  UsageSummaryDate.JSON_PROPERTY_CONTAINER_AVG,
  UsageSummaryDate.JSON_PROPERTY_CONTAINER_EXCL_AGENT_AVG,
  UsageSummaryDate.JSON_PROPERTY_CONTAINER_HWM,
  UsageSummaryDate.JSON_PROPERTY_CSM_CONTAINER_ENTERPRISE_COMPLIANCE_COUNT_SUM,
  UsageSummaryDate.JSON_PROPERTY_CSM_CONTAINER_ENTERPRISE_CWS_COUNT_SUM,
  UsageSummaryDate.JSON_PROPERTY_CSM_CONTAINER_ENTERPRISE_TOTAL_COUNT_SUM,
  UsageSummaryDate.JSON_PROPERTY_CSM_HOST_ENTERPRISE_AAS_HOST_COUNT_TOP99P,
  UsageSummaryDate.JSON_PROPERTY_CSM_HOST_ENTERPRISE_AWS_HOST_COUNT_TOP99P,
  UsageSummaryDate.JSON_PROPERTY_CSM_HOST_ENTERPRISE_AZURE_HOST_COUNT_TOP99P,
  UsageSummaryDate.JSON_PROPERTY_CSM_HOST_ENTERPRISE_COMPLIANCE_HOST_COUNT_TOP99P,
  UsageSummaryDate.JSON_PROPERTY_CSM_HOST_ENTERPRISE_CWS_HOST_COUNT_TOP99P,
  UsageSummaryDate.JSON_PROPERTY_CSM_HOST_ENTERPRISE_GCP_HOST_COUNT_TOP99P,
  UsageSummaryDate.JSON_PROPERTY_CSM_HOST_ENTERPRISE_TOTAL_HOST_COUNT_TOP99P,
  UsageSummaryDate.JSON_PROPERTY_CSPM_AAS_HOST_TOP99P,
  UsageSummaryDate.JSON_PROPERTY_CSPM_AWS_HOST_TOP99P,
  UsageSummaryDate.JSON_PROPERTY_CSPM_AZURE_HOST_TOP99P,
  UsageSummaryDate.JSON_PROPERTY_CSPM_CONTAINER_AVG,
  UsageSummaryDate.JSON_PROPERTY_CSPM_CONTAINER_HWM,
  UsageSummaryDate.JSON_PROPERTY_CSPM_GCP_HOST_TOP99P,
  UsageSummaryDate.JSON_PROPERTY_CSPM_HOST_TOP99P,
  UsageSummaryDate.JSON_PROPERTY_CUSTOM_TS_AVG,
  UsageSummaryDate.JSON_PROPERTY_CWS_CONTAINER_COUNT_AVG,
  UsageSummaryDate.JSON_PROPERTY_CWS_FARGATE_TASK_AVG,
  UsageSummaryDate.JSON_PROPERTY_CWS_HOST_TOP99P,
  UsageSummaryDate.JSON_PROPERTY_DATA_JOBS_MONITORING_HOST_HR_SUM,
  UsageSummaryDate.JSON_PROPERTY_DATE,
  UsageSummaryDate.JSON_PROPERTY_DBM_HOST_TOP99P,
  UsageSummaryDate.JSON_PROPERTY_DBM_QUERIES_COUNT_AVG,
  UsageSummaryDate.JSON_PROPERTY_ERROR_TRACKING_ERROR_EVENTS_SUM,
  UsageSummaryDate.JSON_PROPERTY_ERROR_TRACKING_EVENTS_SUM,
  UsageSummaryDate.JSON_PROPERTY_ERROR_TRACKING_RUM_ERROR_EVENTS_SUM,
  UsageSummaryDate.JSON_PROPERTY_FARGATE_TASKS_COUNT_AVG,
  UsageSummaryDate.JSON_PROPERTY_FARGATE_TASKS_COUNT_HWM,
  UsageSummaryDate.JSON_PROPERTY_FLEX_LOGS_COMPUTE_LARGE_AVG,
  UsageSummaryDate.JSON_PROPERTY_FLEX_LOGS_COMPUTE_MEDIUM_AVG,
  UsageSummaryDate.JSON_PROPERTY_FLEX_LOGS_COMPUTE_SMALL_AVG,
  UsageSummaryDate.JSON_PROPERTY_FLEX_LOGS_COMPUTE_XSMALL_AVG,
  UsageSummaryDate.JSON_PROPERTY_FLEX_LOGS_STARTER_AVG,
  UsageSummaryDate.JSON_PROPERTY_FLEX_LOGS_STARTER_STORAGE_INDEX_AVG,
  UsageSummaryDate.JSON_PROPERTY_FLEX_LOGS_STARTER_STORAGE_RETENTION_ADJUSTMENT_AVG,
  UsageSummaryDate.JSON_PROPERTY_FLEX_STORED_LOGS_AVG,
  UsageSummaryDate.JSON_PROPERTY_FORWARDING_EVENTS_BYTES_SUM,
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
  UsageSummaryDate.JSON_PROPERTY_MOBILE_RUM_SESSION_COUNT_FLUTTER_SUM,
  UsageSummaryDate.JSON_PROPERTY_MOBILE_RUM_SESSION_COUNT_IOS_SUM,
  UsageSummaryDate.JSON_PROPERTY_MOBILE_RUM_SESSION_COUNT_REACTNATIVE_SUM,
  UsageSummaryDate.JSON_PROPERTY_MOBILE_RUM_SESSION_COUNT_ROKU_SUM,
  UsageSummaryDate.JSON_PROPERTY_MOBILE_RUM_SESSION_COUNT_SUM,
  UsageSummaryDate.JSON_PROPERTY_MOBILE_RUM_UNITS_SUM,
  UsageSummaryDate.JSON_PROPERTY_NDM_NETFLOW_EVENTS_SUM,
  UsageSummaryDate.JSON_PROPERTY_NETFLOW_INDEXED_EVENTS_COUNT_SUM,
  UsageSummaryDate.JSON_PROPERTY_NPM_HOST_TOP99P,
  UsageSummaryDate.JSON_PROPERTY_OBSERVABILITY_PIPELINES_BYTES_PROCESSED_SUM,
  UsageSummaryDate.JSON_PROPERTY_OCI_HOST_SUM,
  UsageSummaryDate.JSON_PROPERTY_OCI_HOST_TOP99P,
  UsageSummaryDate.JSON_PROPERTY_ONLINE_ARCHIVE_EVENTS_COUNT_SUM,
  UsageSummaryDate.JSON_PROPERTY_OPENTELEMETRY_APM_HOST_TOP99P,
  UsageSummaryDate.JSON_PROPERTY_OPENTELEMETRY_HOST_TOP99P,
  UsageSummaryDate.JSON_PROPERTY_ORGS,
  UsageSummaryDate.JSON_PROPERTY_PROFILING_AAS_COUNT_TOP99P,
  UsageSummaryDate.JSON_PROPERTY_PROFILING_HOST_TOP99P,
  UsageSummaryDate.JSON_PROPERTY_RUM_BROWSER_AND_MOBILE_SESSION_COUNT,
  UsageSummaryDate.JSON_PROPERTY_RUM_BROWSER_LEGACY_SESSION_COUNT_SUM,
  UsageSummaryDate.JSON_PROPERTY_RUM_BROWSER_LITE_SESSION_COUNT_SUM,
  UsageSummaryDate.JSON_PROPERTY_RUM_BROWSER_REPLAY_SESSION_COUNT_SUM,
  UsageSummaryDate.JSON_PROPERTY_RUM_LITE_SESSION_COUNT_SUM,
  UsageSummaryDate.JSON_PROPERTY_RUM_MOBILE_LEGACY_SESSION_COUNT_ANDROID_SUM,
  UsageSummaryDate.JSON_PROPERTY_RUM_MOBILE_LEGACY_SESSION_COUNT_FLUTTER_SUM,
  UsageSummaryDate.JSON_PROPERTY_RUM_MOBILE_LEGACY_SESSION_COUNT_IOS_SUM,
  UsageSummaryDate.JSON_PROPERTY_RUM_MOBILE_LEGACY_SESSION_COUNT_REACTNATIVE_SUM,
  UsageSummaryDate.JSON_PROPERTY_RUM_MOBILE_LEGACY_SESSION_COUNT_ROKU_SUM,
  UsageSummaryDate.JSON_PROPERTY_RUM_MOBILE_LITE_SESSION_COUNT_ANDROID_SUM,
  UsageSummaryDate.JSON_PROPERTY_RUM_MOBILE_LITE_SESSION_COUNT_FLUTTER_SUM,
  UsageSummaryDate.JSON_PROPERTY_RUM_MOBILE_LITE_SESSION_COUNT_IOS_SUM,
  UsageSummaryDate.JSON_PROPERTY_RUM_MOBILE_LITE_SESSION_COUNT_REACTNATIVE_SUM,
  UsageSummaryDate.JSON_PROPERTY_RUM_MOBILE_LITE_SESSION_COUNT_ROKU_SUM,
  UsageSummaryDate.JSON_PROPERTY_RUM_REPLAY_SESSION_COUNT_SUM,
  UsageSummaryDate.JSON_PROPERTY_RUM_SESSION_COUNT_SUM,
  UsageSummaryDate.JSON_PROPERTY_RUM_TOTAL_SESSION_COUNT_SUM,
  UsageSummaryDate.JSON_PROPERTY_RUM_UNITS_SUM,
  UsageSummaryDate.JSON_PROPERTY_SCA_FARGATE_COUNT_AVG,
  UsageSummaryDate.JSON_PROPERTY_SCA_FARGATE_COUNT_HWM,
  UsageSummaryDate.JSON_PROPERTY_SDS_APM_SCANNED_BYTES_SUM,
  UsageSummaryDate.JSON_PROPERTY_SDS_EVENTS_SCANNED_BYTES_SUM,
  UsageSummaryDate.JSON_PROPERTY_SDS_LOGS_SCANNED_BYTES_SUM,
  UsageSummaryDate.JSON_PROPERTY_SDS_RUM_SCANNED_BYTES_SUM,
  UsageSummaryDate.JSON_PROPERTY_SDS_TOTAL_SCANNED_BYTES_SUM,
  UsageSummaryDate.JSON_PROPERTY_SERVERLESS_APPS_AZURE_COUNT_AVG,
  UsageSummaryDate.JSON_PROPERTY_SERVERLESS_APPS_GOOGLE_COUNT_AVG,
  UsageSummaryDate.JSON_PROPERTY_SERVERLESS_APPS_TOTAL_COUNT_AVG,
  UsageSummaryDate.JSON_PROPERTY_SIEM_ANALYZED_LOGS_ADD_ON_COUNT_SUM,
  UsageSummaryDate.JSON_PROPERTY_SYNTHETICS_BROWSER_CHECK_CALLS_COUNT_SUM,
  UsageSummaryDate.JSON_PROPERTY_SYNTHETICS_CHECK_CALLS_COUNT_SUM,
  UsageSummaryDate.JSON_PROPERTY_SYNTHETICS_MOBILE_TEST_RUNS_SUM,
  UsageSummaryDate.JSON_PROPERTY_SYNTHETICS_PARALLEL_TESTING_MAX_SLOTS_HWM,
  UsageSummaryDate.JSON_PROPERTY_TRACE_SEARCH_INDEXED_EVENTS_COUNT_SUM,
  UsageSummaryDate.JSON_PROPERTY_TWOL_INGESTED_EVENTS_BYTES_SUM,
  UsageSummaryDate.JSON_PROPERTY_UNIVERSAL_SERVICE_MONITORING_HOST_TOP99P,
  UsageSummaryDate.JSON_PROPERTY_VSPHERE_HOST_TOP99P,
  UsageSummaryDate.JSON_PROPERTY_VULN_MANAGEMENT_HOST_COUNT_TOP99P,
  UsageSummaryDate.JSON_PROPERTY_WORKFLOW_EXECUTIONS_USAGE_SUM
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

  public static final String JSON_PROPERTY_APM_DEVSECOPS_HOST_TOP99P = "apm_devsecops_host_top99p";
  private Long apmDevsecopsHostTop99p;

  public static final String JSON_PROPERTY_APM_FARGATE_COUNT_AVG = "apm_fargate_count_avg";
  private Long apmFargateCountAvg;

  public static final String JSON_PROPERTY_APM_HOST_TOP99P = "apm_host_top99p";
  private Long apmHostTop99p;

  public static final String JSON_PROPERTY_APPSEC_FARGATE_COUNT_AVG = "appsec_fargate_count_avg";
  private Long appsecFargateCountAvg;

  public static final String JSON_PROPERTY_ASM_SERVERLESS_SUM = "asm_serverless_sum";
  private Long asmServerlessSum;

  public static final String JSON_PROPERTY_AUDIT_LOGS_LINES_INDEXED_SUM =
      "audit_logs_lines_indexed_sum";
  private Long auditLogsLinesIndexedSum;

  public static final String JSON_PROPERTY_AUDIT_TRAIL_ENABLED_HWM = "audit_trail_enabled_hwm";
  private Long auditTrailEnabledHwm;

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

  public static final String JSON_PROPERTY_CI_VISIBILITY_ITR_COMMITTERS_HWM =
      "ci_visibility_itr_committers_hwm";
  private Long ciVisibilityItrCommittersHwm;

  public static final String JSON_PROPERTY_CI_VISIBILITY_PIPELINE_COMMITTERS_HWM =
      "ci_visibility_pipeline_committers_hwm";
  private Long ciVisibilityPipelineCommittersHwm;

  public static final String JSON_PROPERTY_CI_VISIBILITY_TEST_COMMITTERS_HWM =
      "ci_visibility_test_committers_hwm";
  private Long ciVisibilityTestCommittersHwm;

  public static final String JSON_PROPERTY_CLOUD_COST_MANAGEMENT_AWS_HOST_COUNT_AVG =
      "cloud_cost_management_aws_host_count_avg";
  private Long cloudCostManagementAwsHostCountAvg;

  public static final String JSON_PROPERTY_CLOUD_COST_MANAGEMENT_AZURE_HOST_COUNT_AVG =
      "cloud_cost_management_azure_host_count_avg";
  private Long cloudCostManagementAzureHostCountAvg;

  public static final String JSON_PROPERTY_CLOUD_COST_MANAGEMENT_GCP_HOST_COUNT_AVG =
      "cloud_cost_management_gcp_host_count_avg";
  private Long cloudCostManagementGcpHostCountAvg;

  public static final String JSON_PROPERTY_CLOUD_COST_MANAGEMENT_HOST_COUNT_AVG =
      "cloud_cost_management_host_count_avg";
  private Long cloudCostManagementHostCountAvg;

  public static final String JSON_PROPERTY_CLOUD_SIEM_EVENTS_SUM = "cloud_siem_events_sum";
  private Long cloudSiemEventsSum;

  public static final String JSON_PROPERTY_CODE_ANALYSIS_SA_COMMITTERS_HWM =
      "code_analysis_sa_committers_hwm";
  private Long codeAnalysisSaCommittersHwm;

  public static final String JSON_PROPERTY_CODE_ANALYSIS_SCA_COMMITTERS_HWM =
      "code_analysis_sca_committers_hwm";
  private Long codeAnalysisScaCommittersHwm;

  public static final String JSON_PROPERTY_CONTAINER_AVG = "container_avg";
  private Long containerAvg;

  public static final String JSON_PROPERTY_CONTAINER_EXCL_AGENT_AVG = "container_excl_agent_avg";
  private Long containerExclAgentAvg;

  public static final String JSON_PROPERTY_CONTAINER_HWM = "container_hwm";
  private Long containerHwm;

  public static final String JSON_PROPERTY_CSM_CONTAINER_ENTERPRISE_COMPLIANCE_COUNT_SUM =
      "csm_container_enterprise_compliance_count_sum";
  private Long csmContainerEnterpriseComplianceCountSum;

  public static final String JSON_PROPERTY_CSM_CONTAINER_ENTERPRISE_CWS_COUNT_SUM =
      "csm_container_enterprise_cws_count_sum";
  private Long csmContainerEnterpriseCwsCountSum;

  public static final String JSON_PROPERTY_CSM_CONTAINER_ENTERPRISE_TOTAL_COUNT_SUM =
      "csm_container_enterprise_total_count_sum";
  private Long csmContainerEnterpriseTotalCountSum;

  public static final String JSON_PROPERTY_CSM_HOST_ENTERPRISE_AAS_HOST_COUNT_TOP99P =
      "csm_host_enterprise_aas_host_count_top99p";
  private Long csmHostEnterpriseAasHostCountTop99p;

  public static final String JSON_PROPERTY_CSM_HOST_ENTERPRISE_AWS_HOST_COUNT_TOP99P =
      "csm_host_enterprise_aws_host_count_top99p";
  private Long csmHostEnterpriseAwsHostCountTop99p;

  public static final String JSON_PROPERTY_CSM_HOST_ENTERPRISE_AZURE_HOST_COUNT_TOP99P =
      "csm_host_enterprise_azure_host_count_top99p";
  private Long csmHostEnterpriseAzureHostCountTop99p;

  public static final String JSON_PROPERTY_CSM_HOST_ENTERPRISE_COMPLIANCE_HOST_COUNT_TOP99P =
      "csm_host_enterprise_compliance_host_count_top99p";
  private Long csmHostEnterpriseComplianceHostCountTop99p;

  public static final String JSON_PROPERTY_CSM_HOST_ENTERPRISE_CWS_HOST_COUNT_TOP99P =
      "csm_host_enterprise_cws_host_count_top99p";
  private Long csmHostEnterpriseCwsHostCountTop99p;

  public static final String JSON_PROPERTY_CSM_HOST_ENTERPRISE_GCP_HOST_COUNT_TOP99P =
      "csm_host_enterprise_gcp_host_count_top99p";
  private Long csmHostEnterpriseGcpHostCountTop99p;

  public static final String JSON_PROPERTY_CSM_HOST_ENTERPRISE_TOTAL_HOST_COUNT_TOP99P =
      "csm_host_enterprise_total_host_count_top99p";
  private Long csmHostEnterpriseTotalHostCountTop99p;

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

  public static final String JSON_PROPERTY_CWS_FARGATE_TASK_AVG = "cws_fargate_task_avg";
  private Long cwsFargateTaskAvg;

  public static final String JSON_PROPERTY_CWS_HOST_TOP99P = "cws_host_top99p";
  private Long cwsHostTop99p;

  public static final String JSON_PROPERTY_DATA_JOBS_MONITORING_HOST_HR_SUM =
      "data_jobs_monitoring_host_hr_sum";
  private Long dataJobsMonitoringHostHrSum;

  public static final String JSON_PROPERTY_DATE = "date";
  private OffsetDateTime date;

  public static final String JSON_PROPERTY_DBM_HOST_TOP99P = "dbm_host_top99p";
  private Long dbmHostTop99p;

  public static final String JSON_PROPERTY_DBM_QUERIES_COUNT_AVG = "dbm_queries_count_avg";
  private Long dbmQueriesCountAvg;

  public static final String JSON_PROPERTY_ERROR_TRACKING_ERROR_EVENTS_SUM =
      "error_tracking_error_events_sum";
  private Long errorTrackingErrorEventsSum;

  public static final String JSON_PROPERTY_ERROR_TRACKING_EVENTS_SUM = "error_tracking_events_sum";
  private Long errorTrackingEventsSum;

  public static final String JSON_PROPERTY_ERROR_TRACKING_RUM_ERROR_EVENTS_SUM =
      "error_tracking_rum_error_events_sum";
  private Long errorTrackingRumErrorEventsSum;

  public static final String JSON_PROPERTY_FARGATE_TASKS_COUNT_AVG = "fargate_tasks_count_avg";
  private Long fargateTasksCountAvg;

  public static final String JSON_PROPERTY_FARGATE_TASKS_COUNT_HWM = "fargate_tasks_count_hwm";
  private Long fargateTasksCountHwm;

  public static final String JSON_PROPERTY_FLEX_LOGS_COMPUTE_LARGE_AVG =
      "flex_logs_compute_large_avg";
  private Long flexLogsComputeLargeAvg;

  public static final String JSON_PROPERTY_FLEX_LOGS_COMPUTE_MEDIUM_AVG =
      "flex_logs_compute_medium_avg";
  private Long flexLogsComputeMediumAvg;

  public static final String JSON_PROPERTY_FLEX_LOGS_COMPUTE_SMALL_AVG =
      "flex_logs_compute_small_avg";
  private Long flexLogsComputeSmallAvg;

  public static final String JSON_PROPERTY_FLEX_LOGS_COMPUTE_XSMALL_AVG =
      "flex_logs_compute_xsmall_avg";
  private Long flexLogsComputeXsmallAvg;

  public static final String JSON_PROPERTY_FLEX_LOGS_STARTER_AVG = "flex_logs_starter_avg";
  private Long flexLogsStarterAvg;

  public static final String JSON_PROPERTY_FLEX_LOGS_STARTER_STORAGE_INDEX_AVG =
      "flex_logs_starter_storage_index_avg";
  private Long flexLogsStarterStorageIndexAvg;

  public static final String JSON_PROPERTY_FLEX_LOGS_STARTER_STORAGE_RETENTION_ADJUSTMENT_AVG =
      "flex_logs_starter_storage_retention_adjustment_avg";
  private Long flexLogsStarterStorageRetentionAdjustmentAvg;

  public static final String JSON_PROPERTY_FLEX_STORED_LOGS_AVG = "flex_stored_logs_avg";
  private Long flexStoredLogsAvg;

  public static final String JSON_PROPERTY_FORWARDING_EVENTS_BYTES_SUM =
      "forwarding_events_bytes_sum";
  private Long forwardingEventsBytesSum;

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

  public static final String JSON_PROPERTY_MOBILE_RUM_SESSION_COUNT_FLUTTER_SUM =
      "mobile_rum_session_count_flutter_sum";
  private Long mobileRumSessionCountFlutterSum;

  public static final String JSON_PROPERTY_MOBILE_RUM_SESSION_COUNT_IOS_SUM =
      "mobile_rum_session_count_ios_sum";
  private Long mobileRumSessionCountIosSum;

  public static final String JSON_PROPERTY_MOBILE_RUM_SESSION_COUNT_REACTNATIVE_SUM =
      "mobile_rum_session_count_reactnative_sum";
  private Long mobileRumSessionCountReactnativeSum;

  public static final String JSON_PROPERTY_MOBILE_RUM_SESSION_COUNT_ROKU_SUM =
      "mobile_rum_session_count_roku_sum";
  private Long mobileRumSessionCountRokuSum;

  public static final String JSON_PROPERTY_MOBILE_RUM_SESSION_COUNT_SUM =
      "mobile_rum_session_count_sum";
  private Long mobileRumSessionCountSum;

  public static final String JSON_PROPERTY_MOBILE_RUM_UNITS_SUM = "mobile_rum_units_sum";
  private Long mobileRumUnitsSum;

  public static final String JSON_PROPERTY_NDM_NETFLOW_EVENTS_SUM = "ndm_netflow_events_sum";
  private Long ndmNetflowEventsSum;

  public static final String JSON_PROPERTY_NETFLOW_INDEXED_EVENTS_COUNT_SUM =
      "netflow_indexed_events_count_sum";
  private Long netflowIndexedEventsCountSum;

  public static final String JSON_PROPERTY_NPM_HOST_TOP99P = "npm_host_top99p";
  private Long npmHostTop99p;

  public static final String JSON_PROPERTY_OBSERVABILITY_PIPELINES_BYTES_PROCESSED_SUM =
      "observability_pipelines_bytes_processed_sum";
  private Long observabilityPipelinesBytesProcessedSum;

  public static final String JSON_PROPERTY_OCI_HOST_SUM = "oci_host_sum";
  private Long ociHostSum;

  public static final String JSON_PROPERTY_OCI_HOST_TOP99P = "oci_host_top99p";
  private Long ociHostTop99p;

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

  public static final String JSON_PROPERTY_PROFILING_AAS_COUNT_TOP99P =
      "profiling_aas_count_top99p";
  private Long profilingAasCountTop99p;

  public static final String JSON_PROPERTY_PROFILING_HOST_TOP99P = "profiling_host_top99p";
  private Long profilingHostTop99p;

  public static final String JSON_PROPERTY_RUM_BROWSER_AND_MOBILE_SESSION_COUNT =
      "rum_browser_and_mobile_session_count";
  private Long rumBrowserAndMobileSessionCount;

  public static final String JSON_PROPERTY_RUM_BROWSER_LEGACY_SESSION_COUNT_SUM =
      "rum_browser_legacy_session_count_sum";
  private Long rumBrowserLegacySessionCountSum;

  public static final String JSON_PROPERTY_RUM_BROWSER_LITE_SESSION_COUNT_SUM =
      "rum_browser_lite_session_count_sum";
  private Long rumBrowserLiteSessionCountSum;

  public static final String JSON_PROPERTY_RUM_BROWSER_REPLAY_SESSION_COUNT_SUM =
      "rum_browser_replay_session_count_sum";
  private Long rumBrowserReplaySessionCountSum;

  public static final String JSON_PROPERTY_RUM_LITE_SESSION_COUNT_SUM =
      "rum_lite_session_count_sum";
  private Long rumLiteSessionCountSum;

  public static final String JSON_PROPERTY_RUM_MOBILE_LEGACY_SESSION_COUNT_ANDROID_SUM =
      "rum_mobile_legacy_session_count_android_sum";
  private Long rumMobileLegacySessionCountAndroidSum;

  public static final String JSON_PROPERTY_RUM_MOBILE_LEGACY_SESSION_COUNT_FLUTTER_SUM =
      "rum_mobile_legacy_session_count_flutter_sum";
  private Long rumMobileLegacySessionCountFlutterSum;

  public static final String JSON_PROPERTY_RUM_MOBILE_LEGACY_SESSION_COUNT_IOS_SUM =
      "rum_mobile_legacy_session_count_ios_sum";
  private Long rumMobileLegacySessionCountIosSum;

  public static final String JSON_PROPERTY_RUM_MOBILE_LEGACY_SESSION_COUNT_REACTNATIVE_SUM =
      "rum_mobile_legacy_session_count_reactnative_sum";
  private Long rumMobileLegacySessionCountReactnativeSum;

  public static final String JSON_PROPERTY_RUM_MOBILE_LEGACY_SESSION_COUNT_ROKU_SUM =
      "rum_mobile_legacy_session_count_roku_sum";
  private Long rumMobileLegacySessionCountRokuSum;

  public static final String JSON_PROPERTY_RUM_MOBILE_LITE_SESSION_COUNT_ANDROID_SUM =
      "rum_mobile_lite_session_count_android_sum";
  private Long rumMobileLiteSessionCountAndroidSum;

  public static final String JSON_PROPERTY_RUM_MOBILE_LITE_SESSION_COUNT_FLUTTER_SUM =
      "rum_mobile_lite_session_count_flutter_sum";
  private Long rumMobileLiteSessionCountFlutterSum;

  public static final String JSON_PROPERTY_RUM_MOBILE_LITE_SESSION_COUNT_IOS_SUM =
      "rum_mobile_lite_session_count_ios_sum";
  private Long rumMobileLiteSessionCountIosSum;

  public static final String JSON_PROPERTY_RUM_MOBILE_LITE_SESSION_COUNT_REACTNATIVE_SUM =
      "rum_mobile_lite_session_count_reactnative_sum";
  private Long rumMobileLiteSessionCountReactnativeSum;

  public static final String JSON_PROPERTY_RUM_MOBILE_LITE_SESSION_COUNT_ROKU_SUM =
      "rum_mobile_lite_session_count_roku_sum";
  private Long rumMobileLiteSessionCountRokuSum;

  public static final String JSON_PROPERTY_RUM_REPLAY_SESSION_COUNT_SUM =
      "rum_replay_session_count_sum";
  private Long rumReplaySessionCountSum;

  public static final String JSON_PROPERTY_RUM_SESSION_COUNT_SUM = "rum_session_count_sum";
  private Long rumSessionCountSum;

  public static final String JSON_PROPERTY_RUM_TOTAL_SESSION_COUNT_SUM =
      "rum_total_session_count_sum";
  private Long rumTotalSessionCountSum;

  public static final String JSON_PROPERTY_RUM_UNITS_SUM = "rum_units_sum";
  private Long rumUnitsSum;

  public static final String JSON_PROPERTY_SCA_FARGATE_COUNT_AVG = "sca_fargate_count_avg";
  private Long scaFargateCountAvg;

  public static final String JSON_PROPERTY_SCA_FARGATE_COUNT_HWM = "sca_fargate_count_hwm";
  private Long scaFargateCountHwm;

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

  public static final String JSON_PROPERTY_SERVERLESS_APPS_AZURE_COUNT_AVG =
      "serverless_apps_azure_count_avg";
  private Long serverlessAppsAzureCountAvg;

  public static final String JSON_PROPERTY_SERVERLESS_APPS_GOOGLE_COUNT_AVG =
      "serverless_apps_google_count_avg";
  private Long serverlessAppsGoogleCountAvg;

  public static final String JSON_PROPERTY_SERVERLESS_APPS_TOTAL_COUNT_AVG =
      "serverless_apps_total_count_avg";
  private Long serverlessAppsTotalCountAvg;

  public static final String JSON_PROPERTY_SIEM_ANALYZED_LOGS_ADD_ON_COUNT_SUM =
      "siem_analyzed_logs_add_on_count_sum";
  private Long siemAnalyzedLogsAddOnCountSum;

  public static final String JSON_PROPERTY_SYNTHETICS_BROWSER_CHECK_CALLS_COUNT_SUM =
      "synthetics_browser_check_calls_count_sum";
  private Long syntheticsBrowserCheckCallsCountSum;

  public static final String JSON_PROPERTY_SYNTHETICS_CHECK_CALLS_COUNT_SUM =
      "synthetics_check_calls_count_sum";
  private Long syntheticsCheckCallsCountSum;

  public static final String JSON_PROPERTY_SYNTHETICS_MOBILE_TEST_RUNS_SUM =
      "synthetics_mobile_test_runs_sum";
  private Long syntheticsMobileTestRunsSum;

  public static final String JSON_PROPERTY_SYNTHETICS_PARALLEL_TESTING_MAX_SLOTS_HWM =
      "synthetics_parallel_testing_max_slots_hwm";
  private Long syntheticsParallelTestingMaxSlotsHwm;

  public static final String JSON_PROPERTY_TRACE_SEARCH_INDEXED_EVENTS_COUNT_SUM =
      "trace_search_indexed_events_count_sum";
  private Long traceSearchIndexedEventsCountSum;

  public static final String JSON_PROPERTY_TWOL_INGESTED_EVENTS_BYTES_SUM =
      "twol_ingested_events_bytes_sum";
  private Long twolIngestedEventsBytesSum;

  public static final String JSON_PROPERTY_UNIVERSAL_SERVICE_MONITORING_HOST_TOP99P =
      "universal_service_monitoring_host_top99p";
  private Long universalServiceMonitoringHostTop99p;

  public static final String JSON_PROPERTY_VSPHERE_HOST_TOP99P = "vsphere_host_top99p";
  private Long vsphereHostTop99p;

  public static final String JSON_PROPERTY_VULN_MANAGEMENT_HOST_COUNT_TOP99P =
      "vuln_management_host_count_top99p";
  private Long vulnManagementHostCountTop99p;

  public static final String JSON_PROPERTY_WORKFLOW_EXECUTIONS_USAGE_SUM =
      "workflow_executions_usage_sum";
  private Long workflowExecutionsUsageSum;

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

  public UsageSummaryDate apmDevsecopsHostTop99p(Long apmDevsecopsHostTop99p) {
    this.apmDevsecopsHostTop99p = apmDevsecopsHostTop99p;
    return this;
  }

  /**
   * Shows the 99th percentile of all APM DevSecOps hosts over all hours in the current date for the
   * given org.
   *
   * @return apmDevsecopsHostTop99p
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APM_DEVSECOPS_HOST_TOP99P)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getApmDevsecopsHostTop99p() {
    return apmDevsecopsHostTop99p;
  }

  public void setApmDevsecopsHostTop99p(Long apmDevsecopsHostTop99p) {
    this.apmDevsecopsHostTop99p = apmDevsecopsHostTop99p;
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

  public UsageSummaryDate asmServerlessSum(Long asmServerlessSum) {
    this.asmServerlessSum = asmServerlessSum;
    return this;
  }

  /**
   * Shows the sum of all Application Security Monitoring Serverless invocations over all hours in
   * the current date for all organizations.
   *
   * @return asmServerlessSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ASM_SERVERLESS_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getAsmServerlessSum() {
    return asmServerlessSum;
  }

  public void setAsmServerlessSum(Long asmServerlessSum) {
    this.asmServerlessSum = asmServerlessSum;
  }

  public UsageSummaryDate auditLogsLinesIndexedSum(Long auditLogsLinesIndexedSum) {
    this.auditLogsLinesIndexedSum = auditLogsLinesIndexedSum;
    return this;
  }

  /**
   * Shows the sum of audit logs lines indexed over all hours in the current date for all
   * organizations (To be deprecated on October 1st, 2024).
   *
   * @return auditLogsLinesIndexedSum
   * @deprecated
   */
  @Deprecated
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUDIT_LOGS_LINES_INDEXED_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getAuditLogsLinesIndexedSum() {
    return auditLogsLinesIndexedSum;
  }

  @Deprecated
  public void setAuditLogsLinesIndexedSum(Long auditLogsLinesIndexedSum) {
    this.auditLogsLinesIndexedSum = auditLogsLinesIndexedSum;
  }

  public UsageSummaryDate auditTrailEnabledHwm(Long auditTrailEnabledHwm) {
    this.auditTrailEnabledHwm = auditTrailEnabledHwm;
    return this;
  }

  /**
   * Shows the number of organizations that had Audit Trail enabled in the current date.
   *
   * @return auditTrailEnabledHwm
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUDIT_TRAIL_ENABLED_HWM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getAuditTrailEnabledHwm() {
    return auditTrailEnabledHwm;
  }

  public void setAuditTrailEnabledHwm(Long auditTrailEnabledHwm) {
    this.auditTrailEnabledHwm = auditTrailEnabledHwm;
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
   * organizations (To be deprecated on October 1st, 2024).
   *
   * @return browserRumLiteSessionCountSum
   * @deprecated
   */
  @Deprecated
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BROWSER_RUM_LITE_SESSION_COUNT_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getBrowserRumLiteSessionCountSum() {
    return browserRumLiteSessionCountSum;
  }

  @Deprecated
  public void setBrowserRumLiteSessionCountSum(Long browserRumLiteSessionCountSum) {
    this.browserRumLiteSessionCountSum = browserRumLiteSessionCountSum;
  }

  public UsageSummaryDate browserRumReplaySessionCountSum(Long browserRumReplaySessionCountSum) {
    this.browserRumReplaySessionCountSum = browserRumReplaySessionCountSum;
    return this;
  }

  /**
   * Shows the sum of all browser replay sessions over all hours in the current date for all
   * organizations (To be deprecated on October 1st, 2024).
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
   * Shows the sum of all browser RUM units over all hours in the current date for all organizations
   * (To be deprecated on October 1st, 2024).
   *
   * @return browserRumUnitsSum
   * @deprecated
   */
  @Deprecated
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BROWSER_RUM_UNITS_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getBrowserRumUnitsSum() {
    return browserRumUnitsSum;
  }

  @Deprecated
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

  public UsageSummaryDate ciVisibilityItrCommittersHwm(Long ciVisibilityItrCommittersHwm) {
    this.ciVisibilityItrCommittersHwm = ciVisibilityItrCommittersHwm;
    return this;
  }

  /**
   * Shows the high-water mark of all CI visibility intelligent test runner committers over all
   * hours in the current month for all organizations.
   *
   * @return ciVisibilityItrCommittersHwm
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CI_VISIBILITY_ITR_COMMITTERS_HWM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCiVisibilityItrCommittersHwm() {
    return ciVisibilityItrCommittersHwm;
  }

  public void setCiVisibilityItrCommittersHwm(Long ciVisibilityItrCommittersHwm) {
    this.ciVisibilityItrCommittersHwm = ciVisibilityItrCommittersHwm;
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

  public UsageSummaryDate cloudCostManagementAwsHostCountAvg(
      Long cloudCostManagementAwsHostCountAvg) {
    this.cloudCostManagementAwsHostCountAvg = cloudCostManagementAwsHostCountAvg;
    return this;
  }

  /**
   * Host count average of Cloud Cost Management for AWS for the given date and given organization.
   *
   * @return cloudCostManagementAwsHostCountAvg
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CLOUD_COST_MANAGEMENT_AWS_HOST_COUNT_AVG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCloudCostManagementAwsHostCountAvg() {
    return cloudCostManagementAwsHostCountAvg;
  }

  public void setCloudCostManagementAwsHostCountAvg(Long cloudCostManagementAwsHostCountAvg) {
    this.cloudCostManagementAwsHostCountAvg = cloudCostManagementAwsHostCountAvg;
  }

  public UsageSummaryDate cloudCostManagementAzureHostCountAvg(
      Long cloudCostManagementAzureHostCountAvg) {
    this.cloudCostManagementAzureHostCountAvg = cloudCostManagementAzureHostCountAvg;
    return this;
  }

  /**
   * Host count average of Cloud Cost Management for Azure for the given date and given
   * organization.
   *
   * @return cloudCostManagementAzureHostCountAvg
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CLOUD_COST_MANAGEMENT_AZURE_HOST_COUNT_AVG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCloudCostManagementAzureHostCountAvg() {
    return cloudCostManagementAzureHostCountAvg;
  }

  public void setCloudCostManagementAzureHostCountAvg(Long cloudCostManagementAzureHostCountAvg) {
    this.cloudCostManagementAzureHostCountAvg = cloudCostManagementAzureHostCountAvg;
  }

  public UsageSummaryDate cloudCostManagementGcpHostCountAvg(
      Long cloudCostManagementGcpHostCountAvg) {
    this.cloudCostManagementGcpHostCountAvg = cloudCostManagementGcpHostCountAvg;
    return this;
  }

  /**
   * Host count average of Cloud Cost Management for GCP for the given date and given organization.
   *
   * @return cloudCostManagementGcpHostCountAvg
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CLOUD_COST_MANAGEMENT_GCP_HOST_COUNT_AVG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCloudCostManagementGcpHostCountAvg() {
    return cloudCostManagementGcpHostCountAvg;
  }

  public void setCloudCostManagementGcpHostCountAvg(Long cloudCostManagementGcpHostCountAvg) {
    this.cloudCostManagementGcpHostCountAvg = cloudCostManagementGcpHostCountAvg;
  }

  public UsageSummaryDate cloudCostManagementHostCountAvg(Long cloudCostManagementHostCountAvg) {
    this.cloudCostManagementHostCountAvg = cloudCostManagementHostCountAvg;
    return this;
  }

  /**
   * Host count average of Cloud Cost Management for all cloud providers for the given date and
   * given organization.
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

  public UsageSummaryDate cloudSiemEventsSum(Long cloudSiemEventsSum) {
    this.cloudSiemEventsSum = cloudSiemEventsSum;
    return this;
  }

  /**
   * Shows the sum of all Cloud Security Information and Event Management events over all hours in
   * the current date for the given org.
   *
   * @return cloudSiemEventsSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CLOUD_SIEM_EVENTS_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCloudSiemEventsSum() {
    return cloudSiemEventsSum;
  }

  public void setCloudSiemEventsSum(Long cloudSiemEventsSum) {
    this.cloudSiemEventsSum = cloudSiemEventsSum;
  }

  public UsageSummaryDate codeAnalysisSaCommittersHwm(Long codeAnalysisSaCommittersHwm) {
    this.codeAnalysisSaCommittersHwm = codeAnalysisSaCommittersHwm;
    return this;
  }

  /**
   * Shows the high-water mark of all Static Analysis committers over all hours in the current date
   * for the given org.
   *
   * @return codeAnalysisSaCommittersHwm
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CODE_ANALYSIS_SA_COMMITTERS_HWM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCodeAnalysisSaCommittersHwm() {
    return codeAnalysisSaCommittersHwm;
  }

  public void setCodeAnalysisSaCommittersHwm(Long codeAnalysisSaCommittersHwm) {
    this.codeAnalysisSaCommittersHwm = codeAnalysisSaCommittersHwm;
  }

  public UsageSummaryDate codeAnalysisScaCommittersHwm(Long codeAnalysisScaCommittersHwm) {
    this.codeAnalysisScaCommittersHwm = codeAnalysisScaCommittersHwm;
    return this;
  }

  /**
   * Shows the high-water mark of all static Software Composition Analysis committers over all hours
   * in the current date for the given org.
   *
   * @return codeAnalysisScaCommittersHwm
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CODE_ANALYSIS_SCA_COMMITTERS_HWM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCodeAnalysisScaCommittersHwm() {
    return codeAnalysisScaCommittersHwm;
  }

  public void setCodeAnalysisScaCommittersHwm(Long codeAnalysisScaCommittersHwm) {
    this.codeAnalysisScaCommittersHwm = codeAnalysisScaCommittersHwm;
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

  public UsageSummaryDate containerExclAgentAvg(Long containerExclAgentAvg) {
    this.containerExclAgentAvg = containerExclAgentAvg;
    return this;
  }

  /**
   * Shows the average of containers without the Datadog Agent over all hours in the current date
   * for all organizations.
   *
   * @return containerExclAgentAvg
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTAINER_EXCL_AGENT_AVG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getContainerExclAgentAvg() {
    return containerExclAgentAvg;
  }

  public void setContainerExclAgentAvg(Long containerExclAgentAvg) {
    this.containerExclAgentAvg = containerExclAgentAvg;
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

  public UsageSummaryDate csmContainerEnterpriseComplianceCountSum(
      Long csmContainerEnterpriseComplianceCountSum) {
    this.csmContainerEnterpriseComplianceCountSum = csmContainerEnterpriseComplianceCountSum;
    return this;
  }

  /**
   * Shows the sum of all Cloud Security Management Enterprise compliance containers over all hours
   * in the current date for the given org.
   *
   * @return csmContainerEnterpriseComplianceCountSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CSM_CONTAINER_ENTERPRISE_COMPLIANCE_COUNT_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCsmContainerEnterpriseComplianceCountSum() {
    return csmContainerEnterpriseComplianceCountSum;
  }

  public void setCsmContainerEnterpriseComplianceCountSum(
      Long csmContainerEnterpriseComplianceCountSum) {
    this.csmContainerEnterpriseComplianceCountSum = csmContainerEnterpriseComplianceCountSum;
  }

  public UsageSummaryDate csmContainerEnterpriseCwsCountSum(
      Long csmContainerEnterpriseCwsCountSum) {
    this.csmContainerEnterpriseCwsCountSum = csmContainerEnterpriseCwsCountSum;
    return this;
  }

  /**
   * Shows the sum of all Cloud Security Management Enterprise Cloud Workload Security containers
   * over all hours in the current date for the given org.
   *
   * @return csmContainerEnterpriseCwsCountSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CSM_CONTAINER_ENTERPRISE_CWS_COUNT_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCsmContainerEnterpriseCwsCountSum() {
    return csmContainerEnterpriseCwsCountSum;
  }

  public void setCsmContainerEnterpriseCwsCountSum(Long csmContainerEnterpriseCwsCountSum) {
    this.csmContainerEnterpriseCwsCountSum = csmContainerEnterpriseCwsCountSum;
  }

  public UsageSummaryDate csmContainerEnterpriseTotalCountSum(
      Long csmContainerEnterpriseTotalCountSum) {
    this.csmContainerEnterpriseTotalCountSum = csmContainerEnterpriseTotalCountSum;
    return this;
  }

  /**
   * Shows the sum of all Cloud Security Management Enterprise containers over all hours in the
   * current date for the given org.
   *
   * @return csmContainerEnterpriseTotalCountSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CSM_CONTAINER_ENTERPRISE_TOTAL_COUNT_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCsmContainerEnterpriseTotalCountSum() {
    return csmContainerEnterpriseTotalCountSum;
  }

  public void setCsmContainerEnterpriseTotalCountSum(Long csmContainerEnterpriseTotalCountSum) {
    this.csmContainerEnterpriseTotalCountSum = csmContainerEnterpriseTotalCountSum;
  }

  public UsageSummaryDate csmHostEnterpriseAasHostCountTop99p(
      Long csmHostEnterpriseAasHostCountTop99p) {
    this.csmHostEnterpriseAasHostCountTop99p = csmHostEnterpriseAasHostCountTop99p;
    return this;
  }

  /**
   * Shows the 99th percentile of all Cloud Security Management Enterprise Azure app services hosts
   * over all hours in the current date for the given org.
   *
   * @return csmHostEnterpriseAasHostCountTop99p
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CSM_HOST_ENTERPRISE_AAS_HOST_COUNT_TOP99P)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCsmHostEnterpriseAasHostCountTop99p() {
    return csmHostEnterpriseAasHostCountTop99p;
  }

  public void setCsmHostEnterpriseAasHostCountTop99p(Long csmHostEnterpriseAasHostCountTop99p) {
    this.csmHostEnterpriseAasHostCountTop99p = csmHostEnterpriseAasHostCountTop99p;
  }

  public UsageSummaryDate csmHostEnterpriseAwsHostCountTop99p(
      Long csmHostEnterpriseAwsHostCountTop99p) {
    this.csmHostEnterpriseAwsHostCountTop99p = csmHostEnterpriseAwsHostCountTop99p;
    return this;
  }

  /**
   * Shows the 99th percentile of all Cloud Security Management Enterprise AWS hosts over all hours
   * in the current date for the given org.
   *
   * @return csmHostEnterpriseAwsHostCountTop99p
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CSM_HOST_ENTERPRISE_AWS_HOST_COUNT_TOP99P)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCsmHostEnterpriseAwsHostCountTop99p() {
    return csmHostEnterpriseAwsHostCountTop99p;
  }

  public void setCsmHostEnterpriseAwsHostCountTop99p(Long csmHostEnterpriseAwsHostCountTop99p) {
    this.csmHostEnterpriseAwsHostCountTop99p = csmHostEnterpriseAwsHostCountTop99p;
  }

  public UsageSummaryDate csmHostEnterpriseAzureHostCountTop99p(
      Long csmHostEnterpriseAzureHostCountTop99p) {
    this.csmHostEnterpriseAzureHostCountTop99p = csmHostEnterpriseAzureHostCountTop99p;
    return this;
  }

  /**
   * Shows the 99th percentile of all Cloud Security Management Enterprise Azure hosts over all
   * hours in the current date for the given org.
   *
   * @return csmHostEnterpriseAzureHostCountTop99p
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CSM_HOST_ENTERPRISE_AZURE_HOST_COUNT_TOP99P)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCsmHostEnterpriseAzureHostCountTop99p() {
    return csmHostEnterpriseAzureHostCountTop99p;
  }

  public void setCsmHostEnterpriseAzureHostCountTop99p(Long csmHostEnterpriseAzureHostCountTop99p) {
    this.csmHostEnterpriseAzureHostCountTop99p = csmHostEnterpriseAzureHostCountTop99p;
  }

  public UsageSummaryDate csmHostEnterpriseComplianceHostCountTop99p(
      Long csmHostEnterpriseComplianceHostCountTop99p) {
    this.csmHostEnterpriseComplianceHostCountTop99p = csmHostEnterpriseComplianceHostCountTop99p;
    return this;
  }

  /**
   * Shows the 99th percentile of all Cloud Security Management Enterprise compliance hosts over all
   * hours in the current date for the given org.
   *
   * @return csmHostEnterpriseComplianceHostCountTop99p
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CSM_HOST_ENTERPRISE_COMPLIANCE_HOST_COUNT_TOP99P)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCsmHostEnterpriseComplianceHostCountTop99p() {
    return csmHostEnterpriseComplianceHostCountTop99p;
  }

  public void setCsmHostEnterpriseComplianceHostCountTop99p(
      Long csmHostEnterpriseComplianceHostCountTop99p) {
    this.csmHostEnterpriseComplianceHostCountTop99p = csmHostEnterpriseComplianceHostCountTop99p;
  }

  public UsageSummaryDate csmHostEnterpriseCwsHostCountTop99p(
      Long csmHostEnterpriseCwsHostCountTop99p) {
    this.csmHostEnterpriseCwsHostCountTop99p = csmHostEnterpriseCwsHostCountTop99p;
    return this;
  }

  /**
   * Shows the 99th percentile of all Cloud Security Management Enterprise Cloud Workload Security
   * hosts over all hours in the current date for the given org.
   *
   * @return csmHostEnterpriseCwsHostCountTop99p
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CSM_HOST_ENTERPRISE_CWS_HOST_COUNT_TOP99P)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCsmHostEnterpriseCwsHostCountTop99p() {
    return csmHostEnterpriseCwsHostCountTop99p;
  }

  public void setCsmHostEnterpriseCwsHostCountTop99p(Long csmHostEnterpriseCwsHostCountTop99p) {
    this.csmHostEnterpriseCwsHostCountTop99p = csmHostEnterpriseCwsHostCountTop99p;
  }

  public UsageSummaryDate csmHostEnterpriseGcpHostCountTop99p(
      Long csmHostEnterpriseGcpHostCountTop99p) {
    this.csmHostEnterpriseGcpHostCountTop99p = csmHostEnterpriseGcpHostCountTop99p;
    return this;
  }

  /**
   * Shows the 99th percentile of all Cloud Security Management Enterprise GCP hosts over all hours
   * in the current date for the given org.
   *
   * @return csmHostEnterpriseGcpHostCountTop99p
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CSM_HOST_ENTERPRISE_GCP_HOST_COUNT_TOP99P)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCsmHostEnterpriseGcpHostCountTop99p() {
    return csmHostEnterpriseGcpHostCountTop99p;
  }

  public void setCsmHostEnterpriseGcpHostCountTop99p(Long csmHostEnterpriseGcpHostCountTop99p) {
    this.csmHostEnterpriseGcpHostCountTop99p = csmHostEnterpriseGcpHostCountTop99p;
  }

  public UsageSummaryDate csmHostEnterpriseTotalHostCountTop99p(
      Long csmHostEnterpriseTotalHostCountTop99p) {
    this.csmHostEnterpriseTotalHostCountTop99p = csmHostEnterpriseTotalHostCountTop99p;
    return this;
  }

  /**
   * Shows the 99th percentile of all Cloud Security Management Enterprise hosts over all hours in
   * the current date for the given org.
   *
   * @return csmHostEnterpriseTotalHostCountTop99p
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CSM_HOST_ENTERPRISE_TOTAL_HOST_COUNT_TOP99P)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCsmHostEnterpriseTotalHostCountTop99p() {
    return csmHostEnterpriseTotalHostCountTop99p;
  }

  public void setCsmHostEnterpriseTotalHostCountTop99p(Long csmHostEnterpriseTotalHostCountTop99p) {
    this.csmHostEnterpriseTotalHostCountTop99p = csmHostEnterpriseTotalHostCountTop99p;
  }

  public UsageSummaryDate cspmAasHostTop99p(Long cspmAasHostTop99p) {
    this.cspmAasHostTop99p = cspmAasHostTop99p;
    return this;
  }

  /**
   * Shows the 99th percentile of all Cloud Security Management Pro Azure app services hosts over
   * all hours in the current date for all organizations.
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
   * Shows the 99th percentile of all Cloud Security Management Pro AWS hosts over all hours in the
   * current date for all organizations.
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
   * Shows the 99th percentile of all Cloud Security Management Pro Azure hosts over all hours in
   * the current date for all organizations.
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
   * Shows the average number of Cloud Security Management Pro containers over all hours in the
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
   * Shows the high-water mark of Cloud Security Management Pro containers over all hours in the
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
   * Shows the 99th percentile of all Cloud Security Management Pro GCP hosts over all hours in the
   * current date for all organizations.
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
   * Shows the 99th percentile of all Cloud Security Management Pro hosts over all hours in the
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

  public UsageSummaryDate cwsFargateTaskAvg(Long cwsFargateTaskAvg) {
    this.cwsFargateTaskAvg = cwsFargateTaskAvg;
    return this;
  }

  /**
   * Shows the average of all distinct Cloud Workload Security Fargate tasks over all hours in the
   * current date for all organizations.
   *
   * @return cwsFargateTaskAvg
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CWS_FARGATE_TASK_AVG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCwsFargateTaskAvg() {
    return cwsFargateTaskAvg;
  }

  public void setCwsFargateTaskAvg(Long cwsFargateTaskAvg) {
    this.cwsFargateTaskAvg = cwsFargateTaskAvg;
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

  public UsageSummaryDate dataJobsMonitoringHostHrSum(Long dataJobsMonitoringHostHrSum) {
    this.dataJobsMonitoringHostHrSum = dataJobsMonitoringHostHrSum;
    return this;
  }

  /**
   * Shows the sum of all Data Jobs Monitoring hosts over all hours in the current date for the
   * given org.
   *
   * @return dataJobsMonitoringHostHrSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATA_JOBS_MONITORING_HOST_HR_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getDataJobsMonitoringHostHrSum() {
    return dataJobsMonitoringHostHrSum;
  }

  public void setDataJobsMonitoringHostHrSum(Long dataJobsMonitoringHostHrSum) {
    this.dataJobsMonitoringHostHrSum = dataJobsMonitoringHostHrSum;
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

  public UsageSummaryDate errorTrackingErrorEventsSum(Long errorTrackingErrorEventsSum) {
    this.errorTrackingErrorEventsSum = errorTrackingErrorEventsSum;
    return this;
  }

  /**
   * Shows the sum of all Error Tracking error events over all hours in the current date for the
   * given org.
   *
   * @return errorTrackingErrorEventsSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ERROR_TRACKING_ERROR_EVENTS_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getErrorTrackingErrorEventsSum() {
    return errorTrackingErrorEventsSum;
  }

  public void setErrorTrackingErrorEventsSum(Long errorTrackingErrorEventsSum) {
    this.errorTrackingErrorEventsSum = errorTrackingErrorEventsSum;
  }

  public UsageSummaryDate errorTrackingEventsSum(Long errorTrackingEventsSum) {
    this.errorTrackingEventsSum = errorTrackingEventsSum;
    return this;
  }

  /**
   * Shows the sum of all Error Tracking events over all hours in the current date for the given
   * org.
   *
   * @return errorTrackingEventsSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ERROR_TRACKING_EVENTS_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getErrorTrackingEventsSum() {
    return errorTrackingEventsSum;
  }

  public void setErrorTrackingEventsSum(Long errorTrackingEventsSum) {
    this.errorTrackingEventsSum = errorTrackingEventsSum;
  }

  public UsageSummaryDate errorTrackingRumErrorEventsSum(Long errorTrackingRumErrorEventsSum) {
    this.errorTrackingRumErrorEventsSum = errorTrackingRumErrorEventsSum;
    return this;
  }

  /**
   * Shows the sum of all Error Tracking RUM error events over all hours in the current date for the
   * given org.
   *
   * @return errorTrackingRumErrorEventsSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ERROR_TRACKING_RUM_ERROR_EVENTS_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getErrorTrackingRumErrorEventsSum() {
    return errorTrackingRumErrorEventsSum;
  }

  public void setErrorTrackingRumErrorEventsSum(Long errorTrackingRumErrorEventsSum) {
    this.errorTrackingRumErrorEventsSum = errorTrackingRumErrorEventsSum;
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

  public UsageSummaryDate flexLogsComputeLargeAvg(Long flexLogsComputeLargeAvg) {
    this.flexLogsComputeLargeAvg = flexLogsComputeLargeAvg;
    return this;
  }

  /**
   * Shows the average number of Flex Logs Compute Large Instances over all hours in the current
   * date for the given org.
   *
   * @return flexLogsComputeLargeAvg
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FLEX_LOGS_COMPUTE_LARGE_AVG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getFlexLogsComputeLargeAvg() {
    return flexLogsComputeLargeAvg;
  }

  public void setFlexLogsComputeLargeAvg(Long flexLogsComputeLargeAvg) {
    this.flexLogsComputeLargeAvg = flexLogsComputeLargeAvg;
  }

  public UsageSummaryDate flexLogsComputeMediumAvg(Long flexLogsComputeMediumAvg) {
    this.flexLogsComputeMediumAvg = flexLogsComputeMediumAvg;
    return this;
  }

  /**
   * Shows the average number of Flex Logs Compute Medium Instances over all hours in the current
   * date for the given org.
   *
   * @return flexLogsComputeMediumAvg
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FLEX_LOGS_COMPUTE_MEDIUM_AVG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getFlexLogsComputeMediumAvg() {
    return flexLogsComputeMediumAvg;
  }

  public void setFlexLogsComputeMediumAvg(Long flexLogsComputeMediumAvg) {
    this.flexLogsComputeMediumAvg = flexLogsComputeMediumAvg;
  }

  public UsageSummaryDate flexLogsComputeSmallAvg(Long flexLogsComputeSmallAvg) {
    this.flexLogsComputeSmallAvg = flexLogsComputeSmallAvg;
    return this;
  }

  /**
   * Shows the average number of Flex Logs Compute Small Instances over all hours in the current
   * date for the given org.
   *
   * @return flexLogsComputeSmallAvg
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FLEX_LOGS_COMPUTE_SMALL_AVG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getFlexLogsComputeSmallAvg() {
    return flexLogsComputeSmallAvg;
  }

  public void setFlexLogsComputeSmallAvg(Long flexLogsComputeSmallAvg) {
    this.flexLogsComputeSmallAvg = flexLogsComputeSmallAvg;
  }

  public UsageSummaryDate flexLogsComputeXsmallAvg(Long flexLogsComputeXsmallAvg) {
    this.flexLogsComputeXsmallAvg = flexLogsComputeXsmallAvg;
    return this;
  }

  /**
   * Shows the average number of Flex Logs Compute Extra Small Instances over all hours in the
   * current date for the given org.
   *
   * @return flexLogsComputeXsmallAvg
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FLEX_LOGS_COMPUTE_XSMALL_AVG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getFlexLogsComputeXsmallAvg() {
    return flexLogsComputeXsmallAvg;
  }

  public void setFlexLogsComputeXsmallAvg(Long flexLogsComputeXsmallAvg) {
    this.flexLogsComputeXsmallAvg = flexLogsComputeXsmallAvg;
  }

  public UsageSummaryDate flexLogsStarterAvg(Long flexLogsStarterAvg) {
    this.flexLogsStarterAvg = flexLogsStarterAvg;
    return this;
  }

  /**
   * Shows the average number of Flex Logs Starter Instances over all hours in the current date for
   * the given org.
   *
   * @return flexLogsStarterAvg
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FLEX_LOGS_STARTER_AVG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getFlexLogsStarterAvg() {
    return flexLogsStarterAvg;
  }

  public void setFlexLogsStarterAvg(Long flexLogsStarterAvg) {
    this.flexLogsStarterAvg = flexLogsStarterAvg;
  }

  public UsageSummaryDate flexLogsStarterStorageIndexAvg(Long flexLogsStarterStorageIndexAvg) {
    this.flexLogsStarterStorageIndexAvg = flexLogsStarterStorageIndexAvg;
    return this;
  }

  /**
   * Shows the average number of Flex Logs Starter Storage Index Instances over all hours in the
   * current date for the given org.
   *
   * @return flexLogsStarterStorageIndexAvg
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FLEX_LOGS_STARTER_STORAGE_INDEX_AVG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getFlexLogsStarterStorageIndexAvg() {
    return flexLogsStarterStorageIndexAvg;
  }

  public void setFlexLogsStarterStorageIndexAvg(Long flexLogsStarterStorageIndexAvg) {
    this.flexLogsStarterStorageIndexAvg = flexLogsStarterStorageIndexAvg;
  }

  public UsageSummaryDate flexLogsStarterStorageRetentionAdjustmentAvg(
      Long flexLogsStarterStorageRetentionAdjustmentAvg) {
    this.flexLogsStarterStorageRetentionAdjustmentAvg =
        flexLogsStarterStorageRetentionAdjustmentAvg;
    return this;
  }

  /**
   * Shows the average number of Flex Logs Starter Storage Retention Adjustment Instances over all
   * hours in the current date for the given org.
   *
   * @return flexLogsStarterStorageRetentionAdjustmentAvg
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FLEX_LOGS_STARTER_STORAGE_RETENTION_ADJUSTMENT_AVG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getFlexLogsStarterStorageRetentionAdjustmentAvg() {
    return flexLogsStarterStorageRetentionAdjustmentAvg;
  }

  public void setFlexLogsStarterStorageRetentionAdjustmentAvg(
      Long flexLogsStarterStorageRetentionAdjustmentAvg) {
    this.flexLogsStarterStorageRetentionAdjustmentAvg =
        flexLogsStarterStorageRetentionAdjustmentAvg;
  }

  public UsageSummaryDate flexStoredLogsAvg(Long flexStoredLogsAvg) {
    this.flexStoredLogsAvg = flexStoredLogsAvg;
    return this;
  }

  /**
   * Shows the average of all Flex Stored Logs over all hours in the current date for the given org.
   *
   * @return flexStoredLogsAvg
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FLEX_STORED_LOGS_AVG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getFlexStoredLogsAvg() {
    return flexStoredLogsAvg;
  }

  public void setFlexStoredLogsAvg(Long flexStoredLogsAvg) {
    this.flexStoredLogsAvg = flexStoredLogsAvg;
  }

  public UsageSummaryDate forwardingEventsBytesSum(Long forwardingEventsBytesSum) {
    this.forwardingEventsBytesSum = forwardingEventsBytesSum;
    return this;
  }

  /**
   * Shows the sum of all log bytes forwarded over all hours in the current date for all
   * organizations.
   *
   * @return forwardingEventsBytesSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FORWARDING_EVENTS_BYTES_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getForwardingEventsBytesSum() {
    return forwardingEventsBytesSum;
  }

  public void setForwardingEventsBytesSum(Long forwardingEventsBytesSum) {
    this.forwardingEventsBytesSum = forwardingEventsBytesSum;
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
   * organizations (To be deprecated on October 1st, 2024).
   *
   * @return mobileRumLiteSessionCountSum
   * @deprecated
   */
  @Deprecated
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MOBILE_RUM_LITE_SESSION_COUNT_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getMobileRumLiteSessionCountSum() {
    return mobileRumLiteSessionCountSum;
  }

  @Deprecated
  public void setMobileRumLiteSessionCountSum(Long mobileRumLiteSessionCountSum) {
    this.mobileRumLiteSessionCountSum = mobileRumLiteSessionCountSum;
  }

  public UsageSummaryDate mobileRumSessionCountAndroidSum(Long mobileRumSessionCountAndroidSum) {
    this.mobileRumSessionCountAndroidSum = mobileRumSessionCountAndroidSum;
    return this;
  }

  /**
   * Shows the sum of all mobile RUM sessions on Android over all hours in the current date for all
   * organizations (To be deprecated on October 1st, 2024).
   *
   * @return mobileRumSessionCountAndroidSum
   * @deprecated
   */
  @Deprecated
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MOBILE_RUM_SESSION_COUNT_ANDROID_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getMobileRumSessionCountAndroidSum() {
    return mobileRumSessionCountAndroidSum;
  }

  @Deprecated
  public void setMobileRumSessionCountAndroidSum(Long mobileRumSessionCountAndroidSum) {
    this.mobileRumSessionCountAndroidSum = mobileRumSessionCountAndroidSum;
  }

  public UsageSummaryDate mobileRumSessionCountFlutterSum(Long mobileRumSessionCountFlutterSum) {
    this.mobileRumSessionCountFlutterSum = mobileRumSessionCountFlutterSum;
    return this;
  }

  /**
   * Shows the sum of all mobile RUM sessions on Flutter over all hours in the current date for all
   * organizations (To be deprecated on October 1st, 2024).
   *
   * @return mobileRumSessionCountFlutterSum
   * @deprecated
   */
  @Deprecated
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MOBILE_RUM_SESSION_COUNT_FLUTTER_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getMobileRumSessionCountFlutterSum() {
    return mobileRumSessionCountFlutterSum;
  }

  @Deprecated
  public void setMobileRumSessionCountFlutterSum(Long mobileRumSessionCountFlutterSum) {
    this.mobileRumSessionCountFlutterSum = mobileRumSessionCountFlutterSum;
  }

  public UsageSummaryDate mobileRumSessionCountIosSum(Long mobileRumSessionCountIosSum) {
    this.mobileRumSessionCountIosSum = mobileRumSessionCountIosSum;
    return this;
  }

  /**
   * Shows the sum of all mobile RUM sessions on iOS over all hours in the current date for all
   * organizations (To be deprecated on October 1st, 2024).
   *
   * @return mobileRumSessionCountIosSum
   * @deprecated
   */
  @Deprecated
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MOBILE_RUM_SESSION_COUNT_IOS_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getMobileRumSessionCountIosSum() {
    return mobileRumSessionCountIosSum;
  }

  @Deprecated
  public void setMobileRumSessionCountIosSum(Long mobileRumSessionCountIosSum) {
    this.mobileRumSessionCountIosSum = mobileRumSessionCountIosSum;
  }

  public UsageSummaryDate mobileRumSessionCountReactnativeSum(
      Long mobileRumSessionCountReactnativeSum) {
    this.mobileRumSessionCountReactnativeSum = mobileRumSessionCountReactnativeSum;
    return this;
  }

  /**
   * Shows the sum of all mobile RUM sessions on React Native over all hours in the current date for
   * all organizations (To be deprecated on October 1st, 2024).
   *
   * @return mobileRumSessionCountReactnativeSum
   * @deprecated
   */
  @Deprecated
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MOBILE_RUM_SESSION_COUNT_REACTNATIVE_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getMobileRumSessionCountReactnativeSum() {
    return mobileRumSessionCountReactnativeSum;
  }

  @Deprecated
  public void setMobileRumSessionCountReactnativeSum(Long mobileRumSessionCountReactnativeSum) {
    this.mobileRumSessionCountReactnativeSum = mobileRumSessionCountReactnativeSum;
  }

  public UsageSummaryDate mobileRumSessionCountRokuSum(Long mobileRumSessionCountRokuSum) {
    this.mobileRumSessionCountRokuSum = mobileRumSessionCountRokuSum;
    return this;
  }

  /**
   * Shows the sum of all mobile RUM sessions on Roku over all hours in the current date for all
   * organizations (To be deprecated on October 1st, 2024).
   *
   * @return mobileRumSessionCountRokuSum
   * @deprecated
   */
  @Deprecated
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MOBILE_RUM_SESSION_COUNT_ROKU_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getMobileRumSessionCountRokuSum() {
    return mobileRumSessionCountRokuSum;
  }

  @Deprecated
  public void setMobileRumSessionCountRokuSum(Long mobileRumSessionCountRokuSum) {
    this.mobileRumSessionCountRokuSum = mobileRumSessionCountRokuSum;
  }

  public UsageSummaryDate mobileRumSessionCountSum(Long mobileRumSessionCountSum) {
    this.mobileRumSessionCountSum = mobileRumSessionCountSum;
    return this;
  }

  /**
   * Shows the sum of all mobile RUM sessions over all hours in the current date for all
   * organizations (To be deprecated on October 1st, 2024).
   *
   * @return mobileRumSessionCountSum
   * @deprecated
   */
  @Deprecated
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MOBILE_RUM_SESSION_COUNT_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getMobileRumSessionCountSum() {
    return mobileRumSessionCountSum;
  }

  @Deprecated
  public void setMobileRumSessionCountSum(Long mobileRumSessionCountSum) {
    this.mobileRumSessionCountSum = mobileRumSessionCountSum;
  }

  public UsageSummaryDate mobileRumUnitsSum(Long mobileRumUnitsSum) {
    this.mobileRumUnitsSum = mobileRumUnitsSum;
    return this;
  }

  /**
   * Shows the sum of all mobile RUM units over all hours in the current date for all organizations
   * (To be deprecated on October 1st, 2024).
   *
   * @return mobileRumUnitsSum
   * @deprecated
   */
  @Deprecated
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MOBILE_RUM_UNITS_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getMobileRumUnitsSum() {
    return mobileRumUnitsSum;
  }

  @Deprecated
  public void setMobileRumUnitsSum(Long mobileRumUnitsSum) {
    this.mobileRumUnitsSum = mobileRumUnitsSum;
  }

  public UsageSummaryDate ndmNetflowEventsSum(Long ndmNetflowEventsSum) {
    this.ndmNetflowEventsSum = ndmNetflowEventsSum;
    return this;
  }

  /**
   * Shows the sum of all Network Device Monitoring NetFlow events over all hours in the current
   * date for the given org.
   *
   * @return ndmNetflowEventsSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NDM_NETFLOW_EVENTS_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getNdmNetflowEventsSum() {
    return ndmNetflowEventsSum;
  }

  public void setNdmNetflowEventsSum(Long ndmNetflowEventsSum) {
    this.ndmNetflowEventsSum = ndmNetflowEventsSum;
  }

  public UsageSummaryDate netflowIndexedEventsCountSum(Long netflowIndexedEventsCountSum) {
    this.netflowIndexedEventsCountSum = netflowIndexedEventsCountSum;
    return this;
  }

  /**
   * Shows the sum of all Network flows indexed over all hours in the current date for all
   * organizations (To be deprecated on October 1st, 2024).
   *
   * @return netflowIndexedEventsCountSum
   * @deprecated
   */
  @Deprecated
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NETFLOW_INDEXED_EVENTS_COUNT_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getNetflowIndexedEventsCountSum() {
    return netflowIndexedEventsCountSum;
  }

  @Deprecated
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

  public UsageSummaryDate ociHostSum(Long ociHostSum) {
    this.ociHostSum = ociHostSum;
    return this;
  }

  /**
   * Shows the sum of all Oracle Cloud Infrastructure hosts over all hours in the current date for
   * the given org.
   *
   * @return ociHostSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OCI_HOST_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getOciHostSum() {
    return ociHostSum;
  }

  public void setOciHostSum(Long ociHostSum) {
    this.ociHostSum = ociHostSum;
  }

  public UsageSummaryDate ociHostTop99p(Long ociHostTop99p) {
    this.ociHostTop99p = ociHostTop99p;
    return this;
  }

  /**
   * Shows the 99th percentile of all Oracle Cloud Infrastructure hosts over all hours in the
   * current date for the given org.
   *
   * @return ociHostTop99p
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OCI_HOST_TOP99P)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getOciHostTop99p() {
    return ociHostTop99p;
  }

  public void setOciHostTop99p(Long ociHostTop99p) {
    this.ociHostTop99p = ociHostTop99p;
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

  public UsageSummaryDate profilingAasCountTop99p(Long profilingAasCountTop99p) {
    this.profilingAasCountTop99p = profilingAasCountTop99p;
    return this;
  }

  /**
   * Shows the 99th percentile of all profiled Azure app services over all hours in the current date
   * for all organizations.
   *
   * @return profilingAasCountTop99p
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROFILING_AAS_COUNT_TOP99P)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getProfilingAasCountTop99p() {
    return profilingAasCountTop99p;
  }

  public void setProfilingAasCountTop99p(Long profilingAasCountTop99p) {
    this.profilingAasCountTop99p = profilingAasCountTop99p;
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
   * the current month for all organizations (To be deprecated on October 1st, 2024).
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

  public UsageSummaryDate rumBrowserLegacySessionCountSum(Long rumBrowserLegacySessionCountSum) {
    this.rumBrowserLegacySessionCountSum = rumBrowserLegacySessionCountSum;
    return this;
  }

  /**
   * Shows the sum of all browser RUM legacy sessions over all hours in the current date for all
   * organizations (To be introduced on October 1st, 2024).
   *
   * @return rumBrowserLegacySessionCountSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RUM_BROWSER_LEGACY_SESSION_COUNT_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getRumBrowserLegacySessionCountSum() {
    return rumBrowserLegacySessionCountSum;
  }

  public void setRumBrowserLegacySessionCountSum(Long rumBrowserLegacySessionCountSum) {
    this.rumBrowserLegacySessionCountSum = rumBrowserLegacySessionCountSum;
  }

  public UsageSummaryDate rumBrowserLiteSessionCountSum(Long rumBrowserLiteSessionCountSum) {
    this.rumBrowserLiteSessionCountSum = rumBrowserLiteSessionCountSum;
    return this;
  }

  /**
   * Shows the sum of all browser RUM lite sessions over all hours in the current date for all
   * organizations (To be introduced on October 1st, 2024).
   *
   * @return rumBrowserLiteSessionCountSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RUM_BROWSER_LITE_SESSION_COUNT_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getRumBrowserLiteSessionCountSum() {
    return rumBrowserLiteSessionCountSum;
  }

  public void setRumBrowserLiteSessionCountSum(Long rumBrowserLiteSessionCountSum) {
    this.rumBrowserLiteSessionCountSum = rumBrowserLiteSessionCountSum;
  }

  public UsageSummaryDate rumBrowserReplaySessionCountSum(Long rumBrowserReplaySessionCountSum) {
    this.rumBrowserReplaySessionCountSum = rumBrowserReplaySessionCountSum;
    return this;
  }

  /**
   * Shows the sum of all browser RUM Session Replay counts over all hours in the current date for
   * all organizations (To be introduced on October 1st, 2024).
   *
   * @return rumBrowserReplaySessionCountSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RUM_BROWSER_REPLAY_SESSION_COUNT_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getRumBrowserReplaySessionCountSum() {
    return rumBrowserReplaySessionCountSum;
  }

  public void setRumBrowserReplaySessionCountSum(Long rumBrowserReplaySessionCountSum) {
    this.rumBrowserReplaySessionCountSum = rumBrowserReplaySessionCountSum;
  }

  public UsageSummaryDate rumLiteSessionCountSum(Long rumLiteSessionCountSum) {
    this.rumLiteSessionCountSum = rumLiteSessionCountSum;
    return this;
  }

  /**
   * Shows the sum of all RUM lite sessions (browser and mobile) over all hours in the current date
   * for all organizations (To be introduced on October 1st, 2024).
   *
   * @return rumLiteSessionCountSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RUM_LITE_SESSION_COUNT_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getRumLiteSessionCountSum() {
    return rumLiteSessionCountSum;
  }

  public void setRumLiteSessionCountSum(Long rumLiteSessionCountSum) {
    this.rumLiteSessionCountSum = rumLiteSessionCountSum;
  }

  public UsageSummaryDate rumMobileLegacySessionCountAndroidSum(
      Long rumMobileLegacySessionCountAndroidSum) {
    this.rumMobileLegacySessionCountAndroidSum = rumMobileLegacySessionCountAndroidSum;
    return this;
  }

  /**
   * Shows the sum of all mobile RUM legacy sessions on Android over all hours in the current date
   * for all organizations (To be introduced on October 1st, 2024).
   *
   * @return rumMobileLegacySessionCountAndroidSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RUM_MOBILE_LEGACY_SESSION_COUNT_ANDROID_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getRumMobileLegacySessionCountAndroidSum() {
    return rumMobileLegacySessionCountAndroidSum;
  }

  public void setRumMobileLegacySessionCountAndroidSum(Long rumMobileLegacySessionCountAndroidSum) {
    this.rumMobileLegacySessionCountAndroidSum = rumMobileLegacySessionCountAndroidSum;
  }

  public UsageSummaryDate rumMobileLegacySessionCountFlutterSum(
      Long rumMobileLegacySessionCountFlutterSum) {
    this.rumMobileLegacySessionCountFlutterSum = rumMobileLegacySessionCountFlutterSum;
    return this;
  }

  /**
   * Shows the sum of all mobile RUM legacy Sessions on Flutter over all hours in the current date
   * for all organizations (To be introduced on October 1st, 2024).
   *
   * @return rumMobileLegacySessionCountFlutterSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RUM_MOBILE_LEGACY_SESSION_COUNT_FLUTTER_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getRumMobileLegacySessionCountFlutterSum() {
    return rumMobileLegacySessionCountFlutterSum;
  }

  public void setRumMobileLegacySessionCountFlutterSum(Long rumMobileLegacySessionCountFlutterSum) {
    this.rumMobileLegacySessionCountFlutterSum = rumMobileLegacySessionCountFlutterSum;
  }

  public UsageSummaryDate rumMobileLegacySessionCountIosSum(
      Long rumMobileLegacySessionCountIosSum) {
    this.rumMobileLegacySessionCountIosSum = rumMobileLegacySessionCountIosSum;
    return this;
  }

  /**
   * Shows the sum of all mobile RUM legacy sessions on iOS over all hours in the current date for
   * all organizations (To be introduced on October 1st, 2024).
   *
   * @return rumMobileLegacySessionCountIosSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RUM_MOBILE_LEGACY_SESSION_COUNT_IOS_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getRumMobileLegacySessionCountIosSum() {
    return rumMobileLegacySessionCountIosSum;
  }

  public void setRumMobileLegacySessionCountIosSum(Long rumMobileLegacySessionCountIosSum) {
    this.rumMobileLegacySessionCountIosSum = rumMobileLegacySessionCountIosSum;
  }

  public UsageSummaryDate rumMobileLegacySessionCountReactnativeSum(
      Long rumMobileLegacySessionCountReactnativeSum) {
    this.rumMobileLegacySessionCountReactnativeSum = rumMobileLegacySessionCountReactnativeSum;
    return this;
  }

  /**
   * Shows the sum of all mobile RUM legacy sessions on React Native over all hours in the current
   * date for all organizations (To be introduced on October 1st, 2024).
   *
   * @return rumMobileLegacySessionCountReactnativeSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RUM_MOBILE_LEGACY_SESSION_COUNT_REACTNATIVE_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getRumMobileLegacySessionCountReactnativeSum() {
    return rumMobileLegacySessionCountReactnativeSum;
  }

  public void setRumMobileLegacySessionCountReactnativeSum(
      Long rumMobileLegacySessionCountReactnativeSum) {
    this.rumMobileLegacySessionCountReactnativeSum = rumMobileLegacySessionCountReactnativeSum;
  }

  public UsageSummaryDate rumMobileLegacySessionCountRokuSum(
      Long rumMobileLegacySessionCountRokuSum) {
    this.rumMobileLegacySessionCountRokuSum = rumMobileLegacySessionCountRokuSum;
    return this;
  }

  /**
   * Shows the sum of all mobile RUM legacy sessions on Roku over all hours in the current date for
   * all organizations (To be introduced on October 1st, 2024).
   *
   * @return rumMobileLegacySessionCountRokuSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RUM_MOBILE_LEGACY_SESSION_COUNT_ROKU_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getRumMobileLegacySessionCountRokuSum() {
    return rumMobileLegacySessionCountRokuSum;
  }

  public void setRumMobileLegacySessionCountRokuSum(Long rumMobileLegacySessionCountRokuSum) {
    this.rumMobileLegacySessionCountRokuSum = rumMobileLegacySessionCountRokuSum;
  }

  public UsageSummaryDate rumMobileLiteSessionCountAndroidSum(
      Long rumMobileLiteSessionCountAndroidSum) {
    this.rumMobileLiteSessionCountAndroidSum = rumMobileLiteSessionCountAndroidSum;
    return this;
  }

  /**
   * Shows the sum of all mobile RUM lite sessions on Android over all hours in the current date for
   * all organizations (To be introduced on October 1st, 2024).
   *
   * @return rumMobileLiteSessionCountAndroidSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RUM_MOBILE_LITE_SESSION_COUNT_ANDROID_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getRumMobileLiteSessionCountAndroidSum() {
    return rumMobileLiteSessionCountAndroidSum;
  }

  public void setRumMobileLiteSessionCountAndroidSum(Long rumMobileLiteSessionCountAndroidSum) {
    this.rumMobileLiteSessionCountAndroidSum = rumMobileLiteSessionCountAndroidSum;
  }

  public UsageSummaryDate rumMobileLiteSessionCountFlutterSum(
      Long rumMobileLiteSessionCountFlutterSum) {
    this.rumMobileLiteSessionCountFlutterSum = rumMobileLiteSessionCountFlutterSum;
    return this;
  }

  /**
   * Shows the sum of all mobile RUM lite sessions on Flutter over all hours in the current date for
   * all organizations (To be introduced on October 1st, 2024).
   *
   * @return rumMobileLiteSessionCountFlutterSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RUM_MOBILE_LITE_SESSION_COUNT_FLUTTER_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getRumMobileLiteSessionCountFlutterSum() {
    return rumMobileLiteSessionCountFlutterSum;
  }

  public void setRumMobileLiteSessionCountFlutterSum(Long rumMobileLiteSessionCountFlutterSum) {
    this.rumMobileLiteSessionCountFlutterSum = rumMobileLiteSessionCountFlutterSum;
  }

  public UsageSummaryDate rumMobileLiteSessionCountIosSum(Long rumMobileLiteSessionCountIosSum) {
    this.rumMobileLiteSessionCountIosSum = rumMobileLiteSessionCountIosSum;
    return this;
  }

  /**
   * Shows the sum of all mobile RUM lite sessions on iOS over all hours in the current date for all
   * organizations (To be introduced on October 1st, 2024).
   *
   * @return rumMobileLiteSessionCountIosSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RUM_MOBILE_LITE_SESSION_COUNT_IOS_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getRumMobileLiteSessionCountIosSum() {
    return rumMobileLiteSessionCountIosSum;
  }

  public void setRumMobileLiteSessionCountIosSum(Long rumMobileLiteSessionCountIosSum) {
    this.rumMobileLiteSessionCountIosSum = rumMobileLiteSessionCountIosSum;
  }

  public UsageSummaryDate rumMobileLiteSessionCountReactnativeSum(
      Long rumMobileLiteSessionCountReactnativeSum) {
    this.rumMobileLiteSessionCountReactnativeSum = rumMobileLiteSessionCountReactnativeSum;
    return this;
  }

  /**
   * Shows the sum of all mobile RUM lite sessions on React Native over all hours in the current
   * date for all organizations (To be introduced on October 1st, 2024).
   *
   * @return rumMobileLiteSessionCountReactnativeSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RUM_MOBILE_LITE_SESSION_COUNT_REACTNATIVE_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getRumMobileLiteSessionCountReactnativeSum() {
    return rumMobileLiteSessionCountReactnativeSum;
  }

  public void setRumMobileLiteSessionCountReactnativeSum(
      Long rumMobileLiteSessionCountReactnativeSum) {
    this.rumMobileLiteSessionCountReactnativeSum = rumMobileLiteSessionCountReactnativeSum;
  }

  public UsageSummaryDate rumMobileLiteSessionCountRokuSum(Long rumMobileLiteSessionCountRokuSum) {
    this.rumMobileLiteSessionCountRokuSum = rumMobileLiteSessionCountRokuSum;
    return this;
  }

  /**
   * Shows the sum of all mobile RUM lite sessions on Roku over all hours in the current date for
   * all organizations (To be introduced on October 1st, 2024).
   *
   * @return rumMobileLiteSessionCountRokuSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RUM_MOBILE_LITE_SESSION_COUNT_ROKU_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getRumMobileLiteSessionCountRokuSum() {
    return rumMobileLiteSessionCountRokuSum;
  }

  public void setRumMobileLiteSessionCountRokuSum(Long rumMobileLiteSessionCountRokuSum) {
    this.rumMobileLiteSessionCountRokuSum = rumMobileLiteSessionCountRokuSum;
  }

  public UsageSummaryDate rumReplaySessionCountSum(Long rumReplaySessionCountSum) {
    this.rumReplaySessionCountSum = rumReplaySessionCountSum;
    return this;
  }

  /**
   * Shows the sum of all RUM Session Replay counts over all hours in the current date for all
   * organizations (To be introduced on October 1st, 2024).
   *
   * @return rumReplaySessionCountSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RUM_REPLAY_SESSION_COUNT_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getRumReplaySessionCountSum() {
    return rumReplaySessionCountSum;
  }

  public void setRumReplaySessionCountSum(Long rumReplaySessionCountSum) {
    this.rumReplaySessionCountSum = rumReplaySessionCountSum;
  }

  public UsageSummaryDate rumSessionCountSum(Long rumSessionCountSum) {
    this.rumSessionCountSum = rumSessionCountSum;
    return this;
  }

  /**
   * Shows the sum of all browser RUM lite sessions over all hours in the current date for all
   * organizations (To be deprecated on October 1st, 2024).
   *
   * @return rumSessionCountSum
   * @deprecated
   */
  @Deprecated
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RUM_SESSION_COUNT_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getRumSessionCountSum() {
    return rumSessionCountSum;
  }

  @Deprecated
  public void setRumSessionCountSum(Long rumSessionCountSum) {
    this.rumSessionCountSum = rumSessionCountSum;
  }

  public UsageSummaryDate rumTotalSessionCountSum(Long rumTotalSessionCountSum) {
    this.rumTotalSessionCountSum = rumTotalSessionCountSum;
    return this;
  }

  /**
   * Shows the sum of RUM sessions (browser and mobile) over all hours in the current date for all
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
   * organizations (To be deprecated on October 1st, 2024).
   *
   * @return rumUnitsSum
   * @deprecated
   */
  @Deprecated
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RUM_UNITS_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getRumUnitsSum() {
    return rumUnitsSum;
  }

  @Deprecated
  public void setRumUnitsSum(Long rumUnitsSum) {
    this.rumUnitsSum = rumUnitsSum;
  }

  public UsageSummaryDate scaFargateCountAvg(Long scaFargateCountAvg) {
    this.scaFargateCountAvg = scaFargateCountAvg;
    return this;
  }

  /**
   * Shows the average of all Software Composition Analysis Fargate tasks over all hours in the
   * current date for the given org.
   *
   * @return scaFargateCountAvg
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCA_FARGATE_COUNT_AVG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getScaFargateCountAvg() {
    return scaFargateCountAvg;
  }

  public void setScaFargateCountAvg(Long scaFargateCountAvg) {
    this.scaFargateCountAvg = scaFargateCountAvg;
  }

  public UsageSummaryDate scaFargateCountHwm(Long scaFargateCountHwm) {
    this.scaFargateCountHwm = scaFargateCountHwm;
    return this;
  }

  /**
   * Shows the sum of the high-water marks of all Software Composition Analysis Fargate tasks over
   * all hours in the current date for the given org.
   *
   * @return scaFargateCountHwm
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCA_FARGATE_COUNT_HWM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getScaFargateCountHwm() {
    return scaFargateCountHwm;
  }

  public void setScaFargateCountHwm(Long scaFargateCountHwm) {
    this.scaFargateCountHwm = scaFargateCountHwm;
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

  public UsageSummaryDate serverlessAppsAzureCountAvg(Long serverlessAppsAzureCountAvg) {
    this.serverlessAppsAzureCountAvg = serverlessAppsAzureCountAvg;
    return this;
  }

  /**
   * Shows the average of the number of Serverless Apps for Azure for the given date and given org.
   *
   * @return serverlessAppsAzureCountAvg
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVERLESS_APPS_AZURE_COUNT_AVG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getServerlessAppsAzureCountAvg() {
    return serverlessAppsAzureCountAvg;
  }

  public void setServerlessAppsAzureCountAvg(Long serverlessAppsAzureCountAvg) {
    this.serverlessAppsAzureCountAvg = serverlessAppsAzureCountAvg;
  }

  public UsageSummaryDate serverlessAppsGoogleCountAvg(Long serverlessAppsGoogleCountAvg) {
    this.serverlessAppsGoogleCountAvg = serverlessAppsGoogleCountAvg;
    return this;
  }

  /**
   * Shows the average of the number of Serverless Apps for Google Cloud for the given date and
   * given org.
   *
   * @return serverlessAppsGoogleCountAvg
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVERLESS_APPS_GOOGLE_COUNT_AVG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getServerlessAppsGoogleCountAvg() {
    return serverlessAppsGoogleCountAvg;
  }

  public void setServerlessAppsGoogleCountAvg(Long serverlessAppsGoogleCountAvg) {
    this.serverlessAppsGoogleCountAvg = serverlessAppsGoogleCountAvg;
  }

  public UsageSummaryDate serverlessAppsTotalCountAvg(Long serverlessAppsTotalCountAvg) {
    this.serverlessAppsTotalCountAvg = serverlessAppsTotalCountAvg;
    return this;
  }

  /**
   * Shows the average of the number of Serverless Apps for Azure and Google Cloud for the given
   * date and given org.
   *
   * @return serverlessAppsTotalCountAvg
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVERLESS_APPS_TOTAL_COUNT_AVG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getServerlessAppsTotalCountAvg() {
    return serverlessAppsTotalCountAvg;
  }

  public void setServerlessAppsTotalCountAvg(Long serverlessAppsTotalCountAvg) {
    this.serverlessAppsTotalCountAvg = serverlessAppsTotalCountAvg;
  }

  public UsageSummaryDate siemAnalyzedLogsAddOnCountSum(Long siemAnalyzedLogsAddOnCountSum) {
    this.siemAnalyzedLogsAddOnCountSum = siemAnalyzedLogsAddOnCountSum;
    return this;
  }

  /**
   * Shows the sum of all log events analyzed by Cloud SIEM over all hours in the current date for
   * the given org.
   *
   * @return siemAnalyzedLogsAddOnCountSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SIEM_ANALYZED_LOGS_ADD_ON_COUNT_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getSiemAnalyzedLogsAddOnCountSum() {
    return siemAnalyzedLogsAddOnCountSum;
  }

  public void setSiemAnalyzedLogsAddOnCountSum(Long siemAnalyzedLogsAddOnCountSum) {
    this.siemAnalyzedLogsAddOnCountSum = siemAnalyzedLogsAddOnCountSum;
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

  public UsageSummaryDate syntheticsMobileTestRunsSum(Long syntheticsMobileTestRunsSum) {
    this.syntheticsMobileTestRunsSum = syntheticsMobileTestRunsSum;
    return this;
  }

  /**
   * Shows the sum of all Synthetic mobile application tests over all hours in the current date for
   * all organizations.
   *
   * @return syntheticsMobileTestRunsSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SYNTHETICS_MOBILE_TEST_RUNS_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getSyntheticsMobileTestRunsSum() {
    return syntheticsMobileTestRunsSum;
  }

  public void setSyntheticsMobileTestRunsSum(Long syntheticsMobileTestRunsSum) {
    this.syntheticsMobileTestRunsSum = syntheticsMobileTestRunsSum;
  }

  public UsageSummaryDate syntheticsParallelTestingMaxSlotsHwm(
      Long syntheticsParallelTestingMaxSlotsHwm) {
    this.syntheticsParallelTestingMaxSlotsHwm = syntheticsParallelTestingMaxSlotsHwm;
    return this;
  }

  /**
   * Shows the high-water mark of used synthetics parallel testing slots over all hours in the
   * current date for all organizations.
   *
   * @return syntheticsParallelTestingMaxSlotsHwm
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SYNTHETICS_PARALLEL_TESTING_MAX_SLOTS_HWM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getSyntheticsParallelTestingMaxSlotsHwm() {
    return syntheticsParallelTestingMaxSlotsHwm;
  }

  public void setSyntheticsParallelTestingMaxSlotsHwm(Long syntheticsParallelTestingMaxSlotsHwm) {
    this.syntheticsParallelTestingMaxSlotsHwm = syntheticsParallelTestingMaxSlotsHwm;
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

  public UsageSummaryDate universalServiceMonitoringHostTop99p(
      Long universalServiceMonitoringHostTop99p) {
    this.universalServiceMonitoringHostTop99p = universalServiceMonitoringHostTop99p;
    return this;
  }

  /**
   * Shows the 99th percentile of all universal service management hosts over all hours in the
   * current date for the given org.
   *
   * @return universalServiceMonitoringHostTop99p
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UNIVERSAL_SERVICE_MONITORING_HOST_TOP99P)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getUniversalServiceMonitoringHostTop99p() {
    return universalServiceMonitoringHostTop99p;
  }

  public void setUniversalServiceMonitoringHostTop99p(Long universalServiceMonitoringHostTop99p) {
    this.universalServiceMonitoringHostTop99p = universalServiceMonitoringHostTop99p;
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

  public UsageSummaryDate vulnManagementHostCountTop99p(Long vulnManagementHostCountTop99p) {
    this.vulnManagementHostCountTop99p = vulnManagementHostCountTop99p;
    return this;
  }

  /**
   * Shows the 99th percentile of all Application Vulnerability Management hosts over all hours in
   * the current date for the given org.
   *
   * @return vulnManagementHostCountTop99p
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VULN_MANAGEMENT_HOST_COUNT_TOP99P)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getVulnManagementHostCountTop99p() {
    return vulnManagementHostCountTop99p;
  }

  public void setVulnManagementHostCountTop99p(Long vulnManagementHostCountTop99p) {
    this.vulnManagementHostCountTop99p = vulnManagementHostCountTop99p;
  }

  public UsageSummaryDate workflowExecutionsUsageSum(Long workflowExecutionsUsageSum) {
    this.workflowExecutionsUsageSum = workflowExecutionsUsageSum;
    return this;
  }

  /**
   * Sum of all workflows executed over all hours in the current date for all organizations.
   *
   * @return workflowExecutionsUsageSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WORKFLOW_EXECUTIONS_USAGE_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getWorkflowExecutionsUsageSum() {
    return workflowExecutionsUsageSum;
  }

  public void setWorkflowExecutionsUsageSum(Long workflowExecutionsUsageSum) {
    this.workflowExecutionsUsageSum = workflowExecutionsUsageSum;
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
   * @return UsageSummaryDate
   */
  @JsonAnySetter
  public UsageSummaryDate putAdditionalProperty(String key, Object value) {
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
        && Objects.equals(this.apmDevsecopsHostTop99p, usageSummaryDate.apmDevsecopsHostTop99p)
        && Objects.equals(this.apmFargateCountAvg, usageSummaryDate.apmFargateCountAvg)
        && Objects.equals(this.apmHostTop99p, usageSummaryDate.apmHostTop99p)
        && Objects.equals(this.appsecFargateCountAvg, usageSummaryDate.appsecFargateCountAvg)
        && Objects.equals(this.asmServerlessSum, usageSummaryDate.asmServerlessSum)
        && Objects.equals(this.auditLogsLinesIndexedSum, usageSummaryDate.auditLogsLinesIndexedSum)
        && Objects.equals(this.auditTrailEnabledHwm, usageSummaryDate.auditTrailEnabledHwm)
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
            this.ciVisibilityItrCommittersHwm, usageSummaryDate.ciVisibilityItrCommittersHwm)
        && Objects.equals(
            this.ciVisibilityPipelineCommittersHwm,
            usageSummaryDate.ciVisibilityPipelineCommittersHwm)
        && Objects.equals(
            this.ciVisibilityTestCommittersHwm, usageSummaryDate.ciVisibilityTestCommittersHwm)
        && Objects.equals(
            this.cloudCostManagementAwsHostCountAvg,
            usageSummaryDate.cloudCostManagementAwsHostCountAvg)
        && Objects.equals(
            this.cloudCostManagementAzureHostCountAvg,
            usageSummaryDate.cloudCostManagementAzureHostCountAvg)
        && Objects.equals(
            this.cloudCostManagementGcpHostCountAvg,
            usageSummaryDate.cloudCostManagementGcpHostCountAvg)
        && Objects.equals(
            this.cloudCostManagementHostCountAvg, usageSummaryDate.cloudCostManagementHostCountAvg)
        && Objects.equals(this.cloudSiemEventsSum, usageSummaryDate.cloudSiemEventsSum)
        && Objects.equals(
            this.codeAnalysisSaCommittersHwm, usageSummaryDate.codeAnalysisSaCommittersHwm)
        && Objects.equals(
            this.codeAnalysisScaCommittersHwm, usageSummaryDate.codeAnalysisScaCommittersHwm)
        && Objects.equals(this.containerAvg, usageSummaryDate.containerAvg)
        && Objects.equals(this.containerExclAgentAvg, usageSummaryDate.containerExclAgentAvg)
        && Objects.equals(this.containerHwm, usageSummaryDate.containerHwm)
        && Objects.equals(
            this.csmContainerEnterpriseComplianceCountSum,
            usageSummaryDate.csmContainerEnterpriseComplianceCountSum)
        && Objects.equals(
            this.csmContainerEnterpriseCwsCountSum,
            usageSummaryDate.csmContainerEnterpriseCwsCountSum)
        && Objects.equals(
            this.csmContainerEnterpriseTotalCountSum,
            usageSummaryDate.csmContainerEnterpriseTotalCountSum)
        && Objects.equals(
            this.csmHostEnterpriseAasHostCountTop99p,
            usageSummaryDate.csmHostEnterpriseAasHostCountTop99p)
        && Objects.equals(
            this.csmHostEnterpriseAwsHostCountTop99p,
            usageSummaryDate.csmHostEnterpriseAwsHostCountTop99p)
        && Objects.equals(
            this.csmHostEnterpriseAzureHostCountTop99p,
            usageSummaryDate.csmHostEnterpriseAzureHostCountTop99p)
        && Objects.equals(
            this.csmHostEnterpriseComplianceHostCountTop99p,
            usageSummaryDate.csmHostEnterpriseComplianceHostCountTop99p)
        && Objects.equals(
            this.csmHostEnterpriseCwsHostCountTop99p,
            usageSummaryDate.csmHostEnterpriseCwsHostCountTop99p)
        && Objects.equals(
            this.csmHostEnterpriseGcpHostCountTop99p,
            usageSummaryDate.csmHostEnterpriseGcpHostCountTop99p)
        && Objects.equals(
            this.csmHostEnterpriseTotalHostCountTop99p,
            usageSummaryDate.csmHostEnterpriseTotalHostCountTop99p)
        && Objects.equals(this.cspmAasHostTop99p, usageSummaryDate.cspmAasHostTop99p)
        && Objects.equals(this.cspmAwsHostTop99p, usageSummaryDate.cspmAwsHostTop99p)
        && Objects.equals(this.cspmAzureHostTop99p, usageSummaryDate.cspmAzureHostTop99p)
        && Objects.equals(this.cspmContainerAvg, usageSummaryDate.cspmContainerAvg)
        && Objects.equals(this.cspmContainerHwm, usageSummaryDate.cspmContainerHwm)
        && Objects.equals(this.cspmGcpHostTop99p, usageSummaryDate.cspmGcpHostTop99p)
        && Objects.equals(this.cspmHostTop99p, usageSummaryDate.cspmHostTop99p)
        && Objects.equals(this.customTsAvg, usageSummaryDate.customTsAvg)
        && Objects.equals(this.cwsContainerCountAvg, usageSummaryDate.cwsContainerCountAvg)
        && Objects.equals(this.cwsFargateTaskAvg, usageSummaryDate.cwsFargateTaskAvg)
        && Objects.equals(this.cwsHostTop99p, usageSummaryDate.cwsHostTop99p)
        && Objects.equals(
            this.dataJobsMonitoringHostHrSum, usageSummaryDate.dataJobsMonitoringHostHrSum)
        && Objects.equals(this.date, usageSummaryDate.date)
        && Objects.equals(this.dbmHostTop99p, usageSummaryDate.dbmHostTop99p)
        && Objects.equals(this.dbmQueriesCountAvg, usageSummaryDate.dbmQueriesCountAvg)
        && Objects.equals(
            this.errorTrackingErrorEventsSum, usageSummaryDate.errorTrackingErrorEventsSum)
        && Objects.equals(this.errorTrackingEventsSum, usageSummaryDate.errorTrackingEventsSum)
        && Objects.equals(
            this.errorTrackingRumErrorEventsSum, usageSummaryDate.errorTrackingRumErrorEventsSum)
        && Objects.equals(this.fargateTasksCountAvg, usageSummaryDate.fargateTasksCountAvg)
        && Objects.equals(this.fargateTasksCountHwm, usageSummaryDate.fargateTasksCountHwm)
        && Objects.equals(this.flexLogsComputeLargeAvg, usageSummaryDate.flexLogsComputeLargeAvg)
        && Objects.equals(this.flexLogsComputeMediumAvg, usageSummaryDate.flexLogsComputeMediumAvg)
        && Objects.equals(this.flexLogsComputeSmallAvg, usageSummaryDate.flexLogsComputeSmallAvg)
        && Objects.equals(this.flexLogsComputeXsmallAvg, usageSummaryDate.flexLogsComputeXsmallAvg)
        && Objects.equals(this.flexLogsStarterAvg, usageSummaryDate.flexLogsStarterAvg)
        && Objects.equals(
            this.flexLogsStarterStorageIndexAvg, usageSummaryDate.flexLogsStarterStorageIndexAvg)
        && Objects.equals(
            this.flexLogsStarterStorageRetentionAdjustmentAvg,
            usageSummaryDate.flexLogsStarterStorageRetentionAdjustmentAvg)
        && Objects.equals(this.flexStoredLogsAvg, usageSummaryDate.flexStoredLogsAvg)
        && Objects.equals(this.forwardingEventsBytesSum, usageSummaryDate.forwardingEventsBytesSum)
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
            this.mobileRumSessionCountFlutterSum, usageSummaryDate.mobileRumSessionCountFlutterSum)
        && Objects.equals(
            this.mobileRumSessionCountIosSum, usageSummaryDate.mobileRumSessionCountIosSum)
        && Objects.equals(
            this.mobileRumSessionCountReactnativeSum,
            usageSummaryDate.mobileRumSessionCountReactnativeSum)
        && Objects.equals(
            this.mobileRumSessionCountRokuSum, usageSummaryDate.mobileRumSessionCountRokuSum)
        && Objects.equals(this.mobileRumSessionCountSum, usageSummaryDate.mobileRumSessionCountSum)
        && Objects.equals(this.mobileRumUnitsSum, usageSummaryDate.mobileRumUnitsSum)
        && Objects.equals(this.ndmNetflowEventsSum, usageSummaryDate.ndmNetflowEventsSum)
        && Objects.equals(
            this.netflowIndexedEventsCountSum, usageSummaryDate.netflowIndexedEventsCountSum)
        && Objects.equals(this.npmHostTop99p, usageSummaryDate.npmHostTop99p)
        && Objects.equals(
            this.observabilityPipelinesBytesProcessedSum,
            usageSummaryDate.observabilityPipelinesBytesProcessedSum)
        && Objects.equals(this.ociHostSum, usageSummaryDate.ociHostSum)
        && Objects.equals(this.ociHostTop99p, usageSummaryDate.ociHostTop99p)
        && Objects.equals(
            this.onlineArchiveEventsCountSum, usageSummaryDate.onlineArchiveEventsCountSum)
        && Objects.equals(
            this.opentelemetryApmHostTop99p, usageSummaryDate.opentelemetryApmHostTop99p)
        && Objects.equals(this.opentelemetryHostTop99p, usageSummaryDate.opentelemetryHostTop99p)
        && Objects.equals(this.orgs, usageSummaryDate.orgs)
        && Objects.equals(this.profilingAasCountTop99p, usageSummaryDate.profilingAasCountTop99p)
        && Objects.equals(this.profilingHostTop99p, usageSummaryDate.profilingHostTop99p)
        && Objects.equals(
            this.rumBrowserAndMobileSessionCount, usageSummaryDate.rumBrowserAndMobileSessionCount)
        && Objects.equals(
            this.rumBrowserLegacySessionCountSum, usageSummaryDate.rumBrowserLegacySessionCountSum)
        && Objects.equals(
            this.rumBrowserLiteSessionCountSum, usageSummaryDate.rumBrowserLiteSessionCountSum)
        && Objects.equals(
            this.rumBrowserReplaySessionCountSum, usageSummaryDate.rumBrowserReplaySessionCountSum)
        && Objects.equals(this.rumLiteSessionCountSum, usageSummaryDate.rumLiteSessionCountSum)
        && Objects.equals(
            this.rumMobileLegacySessionCountAndroidSum,
            usageSummaryDate.rumMobileLegacySessionCountAndroidSum)
        && Objects.equals(
            this.rumMobileLegacySessionCountFlutterSum,
            usageSummaryDate.rumMobileLegacySessionCountFlutterSum)
        && Objects.equals(
            this.rumMobileLegacySessionCountIosSum,
            usageSummaryDate.rumMobileLegacySessionCountIosSum)
        && Objects.equals(
            this.rumMobileLegacySessionCountReactnativeSum,
            usageSummaryDate.rumMobileLegacySessionCountReactnativeSum)
        && Objects.equals(
            this.rumMobileLegacySessionCountRokuSum,
            usageSummaryDate.rumMobileLegacySessionCountRokuSum)
        && Objects.equals(
            this.rumMobileLiteSessionCountAndroidSum,
            usageSummaryDate.rumMobileLiteSessionCountAndroidSum)
        && Objects.equals(
            this.rumMobileLiteSessionCountFlutterSum,
            usageSummaryDate.rumMobileLiteSessionCountFlutterSum)
        && Objects.equals(
            this.rumMobileLiteSessionCountIosSum, usageSummaryDate.rumMobileLiteSessionCountIosSum)
        && Objects.equals(
            this.rumMobileLiteSessionCountReactnativeSum,
            usageSummaryDate.rumMobileLiteSessionCountReactnativeSum)
        && Objects.equals(
            this.rumMobileLiteSessionCountRokuSum,
            usageSummaryDate.rumMobileLiteSessionCountRokuSum)
        && Objects.equals(this.rumReplaySessionCountSum, usageSummaryDate.rumReplaySessionCountSum)
        && Objects.equals(this.rumSessionCountSum, usageSummaryDate.rumSessionCountSum)
        && Objects.equals(this.rumTotalSessionCountSum, usageSummaryDate.rumTotalSessionCountSum)
        && Objects.equals(this.rumUnitsSum, usageSummaryDate.rumUnitsSum)
        && Objects.equals(this.scaFargateCountAvg, usageSummaryDate.scaFargateCountAvg)
        && Objects.equals(this.scaFargateCountHwm, usageSummaryDate.scaFargateCountHwm)
        && Objects.equals(this.sdsApmScannedBytesSum, usageSummaryDate.sdsApmScannedBytesSum)
        && Objects.equals(this.sdsEventsScannedBytesSum, usageSummaryDate.sdsEventsScannedBytesSum)
        && Objects.equals(this.sdsLogsScannedBytesSum, usageSummaryDate.sdsLogsScannedBytesSum)
        && Objects.equals(this.sdsRumScannedBytesSum, usageSummaryDate.sdsRumScannedBytesSum)
        && Objects.equals(this.sdsTotalScannedBytesSum, usageSummaryDate.sdsTotalScannedBytesSum)
        && Objects.equals(
            this.serverlessAppsAzureCountAvg, usageSummaryDate.serverlessAppsAzureCountAvg)
        && Objects.equals(
            this.serverlessAppsGoogleCountAvg, usageSummaryDate.serverlessAppsGoogleCountAvg)
        && Objects.equals(
            this.serverlessAppsTotalCountAvg, usageSummaryDate.serverlessAppsTotalCountAvg)
        && Objects.equals(
            this.siemAnalyzedLogsAddOnCountSum, usageSummaryDate.siemAnalyzedLogsAddOnCountSum)
        && Objects.equals(
            this.syntheticsBrowserCheckCallsCountSum,
            usageSummaryDate.syntheticsBrowserCheckCallsCountSum)
        && Objects.equals(
            this.syntheticsCheckCallsCountSum, usageSummaryDate.syntheticsCheckCallsCountSum)
        && Objects.equals(
            this.syntheticsMobileTestRunsSum, usageSummaryDate.syntheticsMobileTestRunsSum)
        && Objects.equals(
            this.syntheticsParallelTestingMaxSlotsHwm,
            usageSummaryDate.syntheticsParallelTestingMaxSlotsHwm)
        && Objects.equals(
            this.traceSearchIndexedEventsCountSum,
            usageSummaryDate.traceSearchIndexedEventsCountSum)
        && Objects.equals(
            this.twolIngestedEventsBytesSum, usageSummaryDate.twolIngestedEventsBytesSum)
        && Objects.equals(
            this.universalServiceMonitoringHostTop99p,
            usageSummaryDate.universalServiceMonitoringHostTop99p)
        && Objects.equals(this.vsphereHostTop99p, usageSummaryDate.vsphereHostTop99p)
        && Objects.equals(
            this.vulnManagementHostCountTop99p, usageSummaryDate.vulnManagementHostCountTop99p)
        && Objects.equals(
            this.workflowExecutionsUsageSum, usageSummaryDate.workflowExecutionsUsageSum)
        && Objects.equals(this.additionalProperties, usageSummaryDate.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        agentHostTop99p,
        apmAzureAppServiceHostTop99p,
        apmDevsecopsHostTop99p,
        apmFargateCountAvg,
        apmHostTop99p,
        appsecFargateCountAvg,
        asmServerlessSum,
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
        ciVisibilityItrCommittersHwm,
        ciVisibilityPipelineCommittersHwm,
        ciVisibilityTestCommittersHwm,
        cloudCostManagementAwsHostCountAvg,
        cloudCostManagementAzureHostCountAvg,
        cloudCostManagementGcpHostCountAvg,
        cloudCostManagementHostCountAvg,
        cloudSiemEventsSum,
        codeAnalysisSaCommittersHwm,
        codeAnalysisScaCommittersHwm,
        containerAvg,
        containerExclAgentAvg,
        containerHwm,
        csmContainerEnterpriseComplianceCountSum,
        csmContainerEnterpriseCwsCountSum,
        csmContainerEnterpriseTotalCountSum,
        csmHostEnterpriseAasHostCountTop99p,
        csmHostEnterpriseAwsHostCountTop99p,
        csmHostEnterpriseAzureHostCountTop99p,
        csmHostEnterpriseComplianceHostCountTop99p,
        csmHostEnterpriseCwsHostCountTop99p,
        csmHostEnterpriseGcpHostCountTop99p,
        csmHostEnterpriseTotalHostCountTop99p,
        cspmAasHostTop99p,
        cspmAwsHostTop99p,
        cspmAzureHostTop99p,
        cspmContainerAvg,
        cspmContainerHwm,
        cspmGcpHostTop99p,
        cspmHostTop99p,
        customTsAvg,
        cwsContainerCountAvg,
        cwsFargateTaskAvg,
        cwsHostTop99p,
        dataJobsMonitoringHostHrSum,
        date,
        dbmHostTop99p,
        dbmQueriesCountAvg,
        errorTrackingErrorEventsSum,
        errorTrackingEventsSum,
        errorTrackingRumErrorEventsSum,
        fargateTasksCountAvg,
        fargateTasksCountHwm,
        flexLogsComputeLargeAvg,
        flexLogsComputeMediumAvg,
        flexLogsComputeSmallAvg,
        flexLogsComputeXsmallAvg,
        flexLogsStarterAvg,
        flexLogsStarterStorageIndexAvg,
        flexLogsStarterStorageRetentionAdjustmentAvg,
        flexStoredLogsAvg,
        forwardingEventsBytesSum,
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
        mobileRumSessionCountFlutterSum,
        mobileRumSessionCountIosSum,
        mobileRumSessionCountReactnativeSum,
        mobileRumSessionCountRokuSum,
        mobileRumSessionCountSum,
        mobileRumUnitsSum,
        ndmNetflowEventsSum,
        netflowIndexedEventsCountSum,
        npmHostTop99p,
        observabilityPipelinesBytesProcessedSum,
        ociHostSum,
        ociHostTop99p,
        onlineArchiveEventsCountSum,
        opentelemetryApmHostTop99p,
        opentelemetryHostTop99p,
        orgs,
        profilingAasCountTop99p,
        profilingHostTop99p,
        rumBrowserAndMobileSessionCount,
        rumBrowserLegacySessionCountSum,
        rumBrowserLiteSessionCountSum,
        rumBrowserReplaySessionCountSum,
        rumLiteSessionCountSum,
        rumMobileLegacySessionCountAndroidSum,
        rumMobileLegacySessionCountFlutterSum,
        rumMobileLegacySessionCountIosSum,
        rumMobileLegacySessionCountReactnativeSum,
        rumMobileLegacySessionCountRokuSum,
        rumMobileLiteSessionCountAndroidSum,
        rumMobileLiteSessionCountFlutterSum,
        rumMobileLiteSessionCountIosSum,
        rumMobileLiteSessionCountReactnativeSum,
        rumMobileLiteSessionCountRokuSum,
        rumReplaySessionCountSum,
        rumSessionCountSum,
        rumTotalSessionCountSum,
        rumUnitsSum,
        scaFargateCountAvg,
        scaFargateCountHwm,
        sdsApmScannedBytesSum,
        sdsEventsScannedBytesSum,
        sdsLogsScannedBytesSum,
        sdsRumScannedBytesSum,
        sdsTotalScannedBytesSum,
        serverlessAppsAzureCountAvg,
        serverlessAppsGoogleCountAvg,
        serverlessAppsTotalCountAvg,
        siemAnalyzedLogsAddOnCountSum,
        syntheticsBrowserCheckCallsCountSum,
        syntheticsCheckCallsCountSum,
        syntheticsMobileTestRunsSum,
        syntheticsParallelTestingMaxSlotsHwm,
        traceSearchIndexedEventsCountSum,
        twolIngestedEventsBytesSum,
        universalServiceMonitoringHostTop99p,
        vsphereHostTop99p,
        vulnManagementHostCountTop99p,
        workflowExecutionsUsageSum,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageSummaryDate {\n");
    sb.append("    agentHostTop99p: ").append(toIndentedString(agentHostTop99p)).append("\n");
    sb.append("    apmAzureAppServiceHostTop99p: ")
        .append(toIndentedString(apmAzureAppServiceHostTop99p))
        .append("\n");
    sb.append("    apmDevsecopsHostTop99p: ")
        .append(toIndentedString(apmDevsecopsHostTop99p))
        .append("\n");
    sb.append("    apmFargateCountAvg: ").append(toIndentedString(apmFargateCountAvg)).append("\n");
    sb.append("    apmHostTop99p: ").append(toIndentedString(apmHostTop99p)).append("\n");
    sb.append("    appsecFargateCountAvg: ")
        .append(toIndentedString(appsecFargateCountAvg))
        .append("\n");
    sb.append("    asmServerlessSum: ").append(toIndentedString(asmServerlessSum)).append("\n");
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
    sb.append("    ciVisibilityItrCommittersHwm: ")
        .append(toIndentedString(ciVisibilityItrCommittersHwm))
        .append("\n");
    sb.append("    ciVisibilityPipelineCommittersHwm: ")
        .append(toIndentedString(ciVisibilityPipelineCommittersHwm))
        .append("\n");
    sb.append("    ciVisibilityTestCommittersHwm: ")
        .append(toIndentedString(ciVisibilityTestCommittersHwm))
        .append("\n");
    sb.append("    cloudCostManagementAwsHostCountAvg: ")
        .append(toIndentedString(cloudCostManagementAwsHostCountAvg))
        .append("\n");
    sb.append("    cloudCostManagementAzureHostCountAvg: ")
        .append(toIndentedString(cloudCostManagementAzureHostCountAvg))
        .append("\n");
    sb.append("    cloudCostManagementGcpHostCountAvg: ")
        .append(toIndentedString(cloudCostManagementGcpHostCountAvg))
        .append("\n");
    sb.append("    cloudCostManagementHostCountAvg: ")
        .append(toIndentedString(cloudCostManagementHostCountAvg))
        .append("\n");
    sb.append("    cloudSiemEventsSum: ").append(toIndentedString(cloudSiemEventsSum)).append("\n");
    sb.append("    codeAnalysisSaCommittersHwm: ")
        .append(toIndentedString(codeAnalysisSaCommittersHwm))
        .append("\n");
    sb.append("    codeAnalysisScaCommittersHwm: ")
        .append(toIndentedString(codeAnalysisScaCommittersHwm))
        .append("\n");
    sb.append("    containerAvg: ").append(toIndentedString(containerAvg)).append("\n");
    sb.append("    containerExclAgentAvg: ")
        .append(toIndentedString(containerExclAgentAvg))
        .append("\n");
    sb.append("    containerHwm: ").append(toIndentedString(containerHwm)).append("\n");
    sb.append("    csmContainerEnterpriseComplianceCountSum: ")
        .append(toIndentedString(csmContainerEnterpriseComplianceCountSum))
        .append("\n");
    sb.append("    csmContainerEnterpriseCwsCountSum: ")
        .append(toIndentedString(csmContainerEnterpriseCwsCountSum))
        .append("\n");
    sb.append("    csmContainerEnterpriseTotalCountSum: ")
        .append(toIndentedString(csmContainerEnterpriseTotalCountSum))
        .append("\n");
    sb.append("    csmHostEnterpriseAasHostCountTop99p: ")
        .append(toIndentedString(csmHostEnterpriseAasHostCountTop99p))
        .append("\n");
    sb.append("    csmHostEnterpriseAwsHostCountTop99p: ")
        .append(toIndentedString(csmHostEnterpriseAwsHostCountTop99p))
        .append("\n");
    sb.append("    csmHostEnterpriseAzureHostCountTop99p: ")
        .append(toIndentedString(csmHostEnterpriseAzureHostCountTop99p))
        .append("\n");
    sb.append("    csmHostEnterpriseComplianceHostCountTop99p: ")
        .append(toIndentedString(csmHostEnterpriseComplianceHostCountTop99p))
        .append("\n");
    sb.append("    csmHostEnterpriseCwsHostCountTop99p: ")
        .append(toIndentedString(csmHostEnterpriseCwsHostCountTop99p))
        .append("\n");
    sb.append("    csmHostEnterpriseGcpHostCountTop99p: ")
        .append(toIndentedString(csmHostEnterpriseGcpHostCountTop99p))
        .append("\n");
    sb.append("    csmHostEnterpriseTotalHostCountTop99p: ")
        .append(toIndentedString(csmHostEnterpriseTotalHostCountTop99p))
        .append("\n");
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
    sb.append("    cwsFargateTaskAvg: ").append(toIndentedString(cwsFargateTaskAvg)).append("\n");
    sb.append("    cwsHostTop99p: ").append(toIndentedString(cwsHostTop99p)).append("\n");
    sb.append("    dataJobsMonitoringHostHrSum: ")
        .append(toIndentedString(dataJobsMonitoringHostHrSum))
        .append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    dbmHostTop99p: ").append(toIndentedString(dbmHostTop99p)).append("\n");
    sb.append("    dbmQueriesCountAvg: ").append(toIndentedString(dbmQueriesCountAvg)).append("\n");
    sb.append("    errorTrackingErrorEventsSum: ")
        .append(toIndentedString(errorTrackingErrorEventsSum))
        .append("\n");
    sb.append("    errorTrackingEventsSum: ")
        .append(toIndentedString(errorTrackingEventsSum))
        .append("\n");
    sb.append("    errorTrackingRumErrorEventsSum: ")
        .append(toIndentedString(errorTrackingRumErrorEventsSum))
        .append("\n");
    sb.append("    fargateTasksCountAvg: ")
        .append(toIndentedString(fargateTasksCountAvg))
        .append("\n");
    sb.append("    fargateTasksCountHwm: ")
        .append(toIndentedString(fargateTasksCountHwm))
        .append("\n");
    sb.append("    flexLogsComputeLargeAvg: ")
        .append(toIndentedString(flexLogsComputeLargeAvg))
        .append("\n");
    sb.append("    flexLogsComputeMediumAvg: ")
        .append(toIndentedString(flexLogsComputeMediumAvg))
        .append("\n");
    sb.append("    flexLogsComputeSmallAvg: ")
        .append(toIndentedString(flexLogsComputeSmallAvg))
        .append("\n");
    sb.append("    flexLogsComputeXsmallAvg: ")
        .append(toIndentedString(flexLogsComputeXsmallAvg))
        .append("\n");
    sb.append("    flexLogsStarterAvg: ").append(toIndentedString(flexLogsStarterAvg)).append("\n");
    sb.append("    flexLogsStarterStorageIndexAvg: ")
        .append(toIndentedString(flexLogsStarterStorageIndexAvg))
        .append("\n");
    sb.append("    flexLogsStarterStorageRetentionAdjustmentAvg: ")
        .append(toIndentedString(flexLogsStarterStorageRetentionAdjustmentAvg))
        .append("\n");
    sb.append("    flexStoredLogsAvg: ").append(toIndentedString(flexStoredLogsAvg)).append("\n");
    sb.append("    forwardingEventsBytesSum: ")
        .append(toIndentedString(forwardingEventsBytesSum))
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
    sb.append("    mobileRumSessionCountFlutterSum: ")
        .append(toIndentedString(mobileRumSessionCountFlutterSum))
        .append("\n");
    sb.append("    mobileRumSessionCountIosSum: ")
        .append(toIndentedString(mobileRumSessionCountIosSum))
        .append("\n");
    sb.append("    mobileRumSessionCountReactnativeSum: ")
        .append(toIndentedString(mobileRumSessionCountReactnativeSum))
        .append("\n");
    sb.append("    mobileRumSessionCountRokuSum: ")
        .append(toIndentedString(mobileRumSessionCountRokuSum))
        .append("\n");
    sb.append("    mobileRumSessionCountSum: ")
        .append(toIndentedString(mobileRumSessionCountSum))
        .append("\n");
    sb.append("    mobileRumUnitsSum: ").append(toIndentedString(mobileRumUnitsSum)).append("\n");
    sb.append("    ndmNetflowEventsSum: ")
        .append(toIndentedString(ndmNetflowEventsSum))
        .append("\n");
    sb.append("    netflowIndexedEventsCountSum: ")
        .append(toIndentedString(netflowIndexedEventsCountSum))
        .append("\n");
    sb.append("    npmHostTop99p: ").append(toIndentedString(npmHostTop99p)).append("\n");
    sb.append("    observabilityPipelinesBytesProcessedSum: ")
        .append(toIndentedString(observabilityPipelinesBytesProcessedSum))
        .append("\n");
    sb.append("    ociHostSum: ").append(toIndentedString(ociHostSum)).append("\n");
    sb.append("    ociHostTop99p: ").append(toIndentedString(ociHostTop99p)).append("\n");
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
    sb.append("    profilingAasCountTop99p: ")
        .append(toIndentedString(profilingAasCountTop99p))
        .append("\n");
    sb.append("    profilingHostTop99p: ")
        .append(toIndentedString(profilingHostTop99p))
        .append("\n");
    sb.append("    rumBrowserAndMobileSessionCount: ")
        .append(toIndentedString(rumBrowserAndMobileSessionCount))
        .append("\n");
    sb.append("    rumBrowserLegacySessionCountSum: ")
        .append(toIndentedString(rumBrowserLegacySessionCountSum))
        .append("\n");
    sb.append("    rumBrowserLiteSessionCountSum: ")
        .append(toIndentedString(rumBrowserLiteSessionCountSum))
        .append("\n");
    sb.append("    rumBrowserReplaySessionCountSum: ")
        .append(toIndentedString(rumBrowserReplaySessionCountSum))
        .append("\n");
    sb.append("    rumLiteSessionCountSum: ")
        .append(toIndentedString(rumLiteSessionCountSum))
        .append("\n");
    sb.append("    rumMobileLegacySessionCountAndroidSum: ")
        .append(toIndentedString(rumMobileLegacySessionCountAndroidSum))
        .append("\n");
    sb.append("    rumMobileLegacySessionCountFlutterSum: ")
        .append(toIndentedString(rumMobileLegacySessionCountFlutterSum))
        .append("\n");
    sb.append("    rumMobileLegacySessionCountIosSum: ")
        .append(toIndentedString(rumMobileLegacySessionCountIosSum))
        .append("\n");
    sb.append("    rumMobileLegacySessionCountReactnativeSum: ")
        .append(toIndentedString(rumMobileLegacySessionCountReactnativeSum))
        .append("\n");
    sb.append("    rumMobileLegacySessionCountRokuSum: ")
        .append(toIndentedString(rumMobileLegacySessionCountRokuSum))
        .append("\n");
    sb.append("    rumMobileLiteSessionCountAndroidSum: ")
        .append(toIndentedString(rumMobileLiteSessionCountAndroidSum))
        .append("\n");
    sb.append("    rumMobileLiteSessionCountFlutterSum: ")
        .append(toIndentedString(rumMobileLiteSessionCountFlutterSum))
        .append("\n");
    sb.append("    rumMobileLiteSessionCountIosSum: ")
        .append(toIndentedString(rumMobileLiteSessionCountIosSum))
        .append("\n");
    sb.append("    rumMobileLiteSessionCountReactnativeSum: ")
        .append(toIndentedString(rumMobileLiteSessionCountReactnativeSum))
        .append("\n");
    sb.append("    rumMobileLiteSessionCountRokuSum: ")
        .append(toIndentedString(rumMobileLiteSessionCountRokuSum))
        .append("\n");
    sb.append("    rumReplaySessionCountSum: ")
        .append(toIndentedString(rumReplaySessionCountSum))
        .append("\n");
    sb.append("    rumSessionCountSum: ").append(toIndentedString(rumSessionCountSum)).append("\n");
    sb.append("    rumTotalSessionCountSum: ")
        .append(toIndentedString(rumTotalSessionCountSum))
        .append("\n");
    sb.append("    rumUnitsSum: ").append(toIndentedString(rumUnitsSum)).append("\n");
    sb.append("    scaFargateCountAvg: ").append(toIndentedString(scaFargateCountAvg)).append("\n");
    sb.append("    scaFargateCountHwm: ").append(toIndentedString(scaFargateCountHwm)).append("\n");
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
    sb.append("    serverlessAppsAzureCountAvg: ")
        .append(toIndentedString(serverlessAppsAzureCountAvg))
        .append("\n");
    sb.append("    serverlessAppsGoogleCountAvg: ")
        .append(toIndentedString(serverlessAppsGoogleCountAvg))
        .append("\n");
    sb.append("    serverlessAppsTotalCountAvg: ")
        .append(toIndentedString(serverlessAppsTotalCountAvg))
        .append("\n");
    sb.append("    siemAnalyzedLogsAddOnCountSum: ")
        .append(toIndentedString(siemAnalyzedLogsAddOnCountSum))
        .append("\n");
    sb.append("    syntheticsBrowserCheckCallsCountSum: ")
        .append(toIndentedString(syntheticsBrowserCheckCallsCountSum))
        .append("\n");
    sb.append("    syntheticsCheckCallsCountSum: ")
        .append(toIndentedString(syntheticsCheckCallsCountSum))
        .append("\n");
    sb.append("    syntheticsMobileTestRunsSum: ")
        .append(toIndentedString(syntheticsMobileTestRunsSum))
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
    sb.append("    vulnManagementHostCountTop99p: ")
        .append(toIndentedString(vulnManagementHostCountTop99p))
        .append("\n");
    sb.append("    workflowExecutionsUsageSum: ")
        .append(toIndentedString(workflowExecutionsUsageSum))
        .append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append('}');
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
