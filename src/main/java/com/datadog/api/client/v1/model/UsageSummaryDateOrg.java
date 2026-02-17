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

/** Global hourly report of all data billed by Datadog for a given organization. */
@JsonPropertyOrder({
  UsageSummaryDateOrg.JSON_PROPERTY_ACCOUNT_NAME,
  UsageSummaryDateOrg.JSON_PROPERTY_ACCOUNT_PUBLIC_ID,
  UsageSummaryDateOrg.JSON_PROPERTY_AGENT_HOST_TOP99P,
  UsageSummaryDateOrg.JSON_PROPERTY_APM_AZURE_APP_SERVICE_HOST_TOP99P,
  UsageSummaryDateOrg.JSON_PROPERTY_APM_DEVSECOPS_HOST_TOP99P,
  UsageSummaryDateOrg.JSON_PROPERTY_APM_ENTERPRISE_STANDALONE_HOSTS_TOP99P,
  UsageSummaryDateOrg.JSON_PROPERTY_APM_FARGATE_COUNT_AVG,
  UsageSummaryDateOrg.JSON_PROPERTY_APM_HOST_TOP99P,
  UsageSummaryDateOrg.JSON_PROPERTY_APM_PRO_STANDALONE_HOSTS_TOP99P,
  UsageSummaryDateOrg.JSON_PROPERTY_APPSEC_FARGATE_COUNT_AVG,
  UsageSummaryDateOrg.JSON_PROPERTY_ASM_SERVERLESS_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_AUDIT_LOGS_LINES_INDEXED_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_AUDIT_TRAIL_ENABLED_HWM,
  UsageSummaryDateOrg.JSON_PROPERTY_AVG_PROFILED_FARGATE_TASKS,
  UsageSummaryDateOrg.JSON_PROPERTY_AWS_HOST_TOP99P,
  UsageSummaryDateOrg.JSON_PROPERTY_AWS_LAMBDA_FUNC_COUNT,
  UsageSummaryDateOrg.JSON_PROPERTY_AWS_LAMBDA_INVOCATIONS_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_AZURE_APP_SERVICE_TOP99P,
  UsageSummaryDateOrg.JSON_PROPERTY_BILLABLE_INGESTED_BYTES_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_BITS_AI_INVESTIGATIONS_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_BROWSER_RUM_LITE_SESSION_COUNT_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_BROWSER_RUM_REPLAY_SESSION_COUNT_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_BROWSER_RUM_UNITS_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_CCM_SPEND_MONITORED_ENT_LAST,
  UsageSummaryDateOrg.JSON_PROPERTY_CCM_SPEND_MONITORED_PRO_LAST,
  UsageSummaryDateOrg.JSON_PROPERTY_CI_PIPELINE_INDEXED_SPANS_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_CI_TEST_INDEXED_SPANS_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_CI_VISIBILITY_ITR_COMMITTERS_HWM,
  UsageSummaryDateOrg.JSON_PROPERTY_CI_VISIBILITY_PIPELINE_COMMITTERS_HWM,
  UsageSummaryDateOrg.JSON_PROPERTY_CI_VISIBILITY_TEST_COMMITTERS_HWM,
  UsageSummaryDateOrg.JSON_PROPERTY_CLOUD_COST_MANAGEMENT_AWS_HOST_COUNT_AVG,
  UsageSummaryDateOrg.JSON_PROPERTY_CLOUD_COST_MANAGEMENT_AZURE_HOST_COUNT_AVG,
  UsageSummaryDateOrg.JSON_PROPERTY_CLOUD_COST_MANAGEMENT_GCP_HOST_COUNT_AVG,
  UsageSummaryDateOrg.JSON_PROPERTY_CLOUD_COST_MANAGEMENT_HOST_COUNT_AVG,
  UsageSummaryDateOrg.JSON_PROPERTY_CLOUD_COST_MANAGEMENT_OCI_HOST_COUNT_AVG,
  UsageSummaryDateOrg.JSON_PROPERTY_CLOUD_SIEM_EVENTS_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_CODE_ANALYSIS_SA_COMMITTERS_HWM,
  UsageSummaryDateOrg.JSON_PROPERTY_CODE_ANALYSIS_SCA_COMMITTERS_HWM,
  UsageSummaryDateOrg.JSON_PROPERTY_CODE_SECURITY_HOST_TOP99P,
  UsageSummaryDateOrg.JSON_PROPERTY_CONTAINER_AVG,
  UsageSummaryDateOrg.JSON_PROPERTY_CONTAINER_EXCL_AGENT_AVG,
  UsageSummaryDateOrg.JSON_PROPERTY_CONTAINER_HWM,
  UsageSummaryDateOrg.JSON_PROPERTY_CSM_CONTAINER_ENTERPRISE_COMPLIANCE_COUNT_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_CSM_CONTAINER_ENTERPRISE_CWS_COUNT_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_CSM_CONTAINER_ENTERPRISE_TOTAL_COUNT_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_CSM_HOST_ENTERPRISE_AAS_HOST_COUNT_TOP99P,
  UsageSummaryDateOrg.JSON_PROPERTY_CSM_HOST_ENTERPRISE_AWS_HOST_COUNT_TOP99P,
  UsageSummaryDateOrg.JSON_PROPERTY_CSM_HOST_ENTERPRISE_AZURE_HOST_COUNT_TOP99P,
  UsageSummaryDateOrg.JSON_PROPERTY_CSM_HOST_ENTERPRISE_COMPLIANCE_HOST_COUNT_TOP99P,
  UsageSummaryDateOrg.JSON_PROPERTY_CSM_HOST_ENTERPRISE_CWS_HOST_COUNT_TOP99P,
  UsageSummaryDateOrg.JSON_PROPERTY_CSM_HOST_ENTERPRISE_GCP_HOST_COUNT_TOP99P,
  UsageSummaryDateOrg.JSON_PROPERTY_CSM_HOST_ENTERPRISE_TOTAL_HOST_COUNT_TOP99P,
  UsageSummaryDateOrg.JSON_PROPERTY_CSPM_AAS_HOST_TOP99P,
  UsageSummaryDateOrg.JSON_PROPERTY_CSPM_AWS_HOST_TOP99P,
  UsageSummaryDateOrg.JSON_PROPERTY_CSPM_AZURE_HOST_TOP99P,
  UsageSummaryDateOrg.JSON_PROPERTY_CSPM_CONTAINER_AVG,
  UsageSummaryDateOrg.JSON_PROPERTY_CSPM_CONTAINER_HWM,
  UsageSummaryDateOrg.JSON_PROPERTY_CSPM_GCP_HOST_TOP99P,
  UsageSummaryDateOrg.JSON_PROPERTY_CSPM_HOST_TOP99P,
  UsageSummaryDateOrg.JSON_PROPERTY_CUSTOM_HISTORICAL_TS_AVG,
  UsageSummaryDateOrg.JSON_PROPERTY_CUSTOM_LIVE_TS_AVG,
  UsageSummaryDateOrg.JSON_PROPERTY_CUSTOM_TS_AVG,
  UsageSummaryDateOrg.JSON_PROPERTY_CWS_CONTAINER_COUNT_AVG,
  UsageSummaryDateOrg.JSON_PROPERTY_CWS_FARGATE_TASK_AVG,
  UsageSummaryDateOrg.JSON_PROPERTY_CWS_HOST_TOP99P,
  UsageSummaryDateOrg.JSON_PROPERTY_DATA_JOBS_MONITORING_HOST_HR_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_DBM_HOST_TOP99P_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_DBM_QUERIES_AVG_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_EPH_INFRA_HOST_AGENT_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_EPH_INFRA_HOST_ALIBABA_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_EPH_INFRA_HOST_AWS_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_EPH_INFRA_HOST_AZURE_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_EPH_INFRA_HOST_ENT_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_EPH_INFRA_HOST_GCP_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_EPH_INFRA_HOST_HEROKU_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_EPH_INFRA_HOST_ONLY_AAS_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_EPH_INFRA_HOST_ONLY_VSPHERE_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_EPH_INFRA_HOST_OPENTELEMETRY_APM_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_EPH_INFRA_HOST_OPENTELEMETRY_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_EPH_INFRA_HOST_PRO_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_EPH_INFRA_HOST_PROPLUS_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_EPH_INFRA_HOST_PROXMOX_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_ERROR_TRACKING_APM_ERROR_EVENTS_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_ERROR_TRACKING_ERROR_EVENTS_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_ERROR_TRACKING_EVENTS_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_ERROR_TRACKING_RUM_ERROR_EVENTS_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_EVENT_MANAGEMENT_CORRELATION_CORRELATED_EVENTS_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_EVENT_MANAGEMENT_CORRELATION_CORRELATED_RELATED_EVENTS_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_EVENT_MANAGEMENT_CORRELATION_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_FARGATE_CONTAINER_PROFILER_PROFILING_FARGATE_AVG,
  UsageSummaryDateOrg.JSON_PROPERTY_FARGATE_CONTAINER_PROFILER_PROFILING_FARGATE_EKS_AVG,
  UsageSummaryDateOrg.JSON_PROPERTY_FARGATE_TASKS_COUNT_AVG,
  UsageSummaryDateOrg.JSON_PROPERTY_FARGATE_TASKS_COUNT_HWM,
  UsageSummaryDateOrg.JSON_PROPERTY_FLEX_LOGS_COMPUTE_LARGE_AVG,
  UsageSummaryDateOrg.JSON_PROPERTY_FLEX_LOGS_COMPUTE_MEDIUM_AVG,
  UsageSummaryDateOrg.JSON_PROPERTY_FLEX_LOGS_COMPUTE_SMALL_AVG,
  UsageSummaryDateOrg.JSON_PROPERTY_FLEX_LOGS_COMPUTE_XLARGE_AVG,
  UsageSummaryDateOrg.JSON_PROPERTY_FLEX_LOGS_COMPUTE_XSMALL_AVG,
  UsageSummaryDateOrg.JSON_PROPERTY_FLEX_LOGS_STARTER_AVG,
  UsageSummaryDateOrg.JSON_PROPERTY_FLEX_LOGS_STARTER_STORAGE_INDEX_AVG,
  UsageSummaryDateOrg.JSON_PROPERTY_FLEX_LOGS_STARTER_STORAGE_RETENTION_ADJUSTMENT_AVG,
  UsageSummaryDateOrg.JSON_PROPERTY_FLEX_STORED_LOGS_AVG,
  UsageSummaryDateOrg.JSON_PROPERTY_FORWARDING_EVENTS_BYTES_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_GCP_HOST_TOP99P,
  UsageSummaryDateOrg.JSON_PROPERTY_HEROKU_HOST_TOP99P,
  UsageSummaryDateOrg.JSON_PROPERTY_ID,
  UsageSummaryDateOrg.JSON_PROPERTY_INCIDENT_MANAGEMENT_MONTHLY_ACTIVE_USERS_HWM,
  UsageSummaryDateOrg.JSON_PROPERTY_INCIDENT_MANAGEMENT_SEATS_HWM,
  UsageSummaryDateOrg.JSON_PROPERTY_INDEXED_EVENTS_COUNT_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_INFRA_HOST_TOP99P,
  UsageSummaryDateOrg.JSON_PROPERTY_INGESTED_EVENTS_BYTES_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_IOT_DEVICE_AGG_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_IOT_DEVICE_TOP99P_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_LLM_OBSERVABILITY_MIN_SPEND_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_LLM_OBSERVABILITY_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_MOBILE_RUM_LITE_SESSION_COUNT_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_MOBILE_RUM_SESSION_COUNT_ANDROID_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_MOBILE_RUM_SESSION_COUNT_FLUTTER_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_MOBILE_RUM_SESSION_COUNT_IOS_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_MOBILE_RUM_SESSION_COUNT_REACTNATIVE_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_MOBILE_RUM_SESSION_COUNT_ROKU_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_MOBILE_RUM_SESSION_COUNT_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_MOBILE_RUM_UNITS_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_NAME,
  UsageSummaryDateOrg.JSON_PROPERTY_NDM_NETFLOW_EVENTS_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_NETFLOW_INDEXED_EVENTS_COUNT_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_NETWORK_DEVICE_WIRELESS_TOP99P,
  UsageSummaryDateOrg.JSON_PROPERTY_NPM_HOST_TOP99P,
  UsageSummaryDateOrg.JSON_PROPERTY_OBSERVABILITY_PIPELINES_BYTES_PROCESSED_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_OCI_HOST_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_OCI_HOST_TOP99P,
  UsageSummaryDateOrg.JSON_PROPERTY_ON_CALL_SEAT_HWM,
  UsageSummaryDateOrg.JSON_PROPERTY_ONLINE_ARCHIVE_EVENTS_COUNT_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_OPENTELEMETRY_APM_HOST_TOP99P,
  UsageSummaryDateOrg.JSON_PROPERTY_OPENTELEMETRY_HOST_TOP99P,
  UsageSummaryDateOrg.JSON_PROPERTY_PRODUCT_ANALYTICS_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_PROFILING_AAS_COUNT_TOP99P,
  UsageSummaryDateOrg.JSON_PROPERTY_PROFILING_HOST_TOP99P,
  UsageSummaryDateOrg.JSON_PROPERTY_PROXMOX_HOST_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_PROXMOX_HOST_TOP99P,
  UsageSummaryDateOrg.JSON_PROPERTY_PUBLIC_ID,
  UsageSummaryDateOrg.JSON_PROPERTY_PUBLISHED_APP_HWM,
  UsageSummaryDateOrg.JSON_PROPERTY_REGION,
  UsageSummaryDateOrg.JSON_PROPERTY_RUM_BROWSER_AND_MOBILE_SESSION_COUNT,
  UsageSummaryDateOrg.JSON_PROPERTY_RUM_BROWSER_LEGACY_SESSION_COUNT_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_RUM_BROWSER_LITE_SESSION_COUNT_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_RUM_BROWSER_REPLAY_SESSION_COUNT_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_RUM_INDEXED_SESSIONS_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_RUM_INGESTED_SESSIONS_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_RUM_LITE_SESSION_COUNT_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_RUM_MOBILE_LEGACY_SESSION_COUNT_ANDROID_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_RUM_MOBILE_LEGACY_SESSION_COUNT_FLUTTER_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_RUM_MOBILE_LEGACY_SESSION_COUNT_IOS_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_RUM_MOBILE_LEGACY_SESSION_COUNT_REACTNATIVE_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_RUM_MOBILE_LEGACY_SESSION_COUNT_ROKU_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_RUM_MOBILE_LITE_SESSION_COUNT_ANDROID_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_RUM_MOBILE_LITE_SESSION_COUNT_FLUTTER_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_RUM_MOBILE_LITE_SESSION_COUNT_IOS_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_RUM_MOBILE_LITE_SESSION_COUNT_KOTLINMULTIPLATFORM_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_RUM_MOBILE_LITE_SESSION_COUNT_REACTNATIVE_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_RUM_MOBILE_LITE_SESSION_COUNT_ROKU_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_RUM_MOBILE_LITE_SESSION_COUNT_UNITY_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_RUM_MOBILE_REPLAY_SESSION_COUNT_ANDROID_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_RUM_MOBILE_REPLAY_SESSION_COUNT_IOS_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_RUM_MOBILE_REPLAY_SESSION_COUNT_KOTLINMULTIPLATFORM_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_RUM_MOBILE_REPLAY_SESSION_COUNT_REACTNATIVE_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_RUM_REPLAY_SESSION_COUNT_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_RUM_SESSION_COUNT_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_RUM_SESSION_REPLAY_ADD_ON_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_RUM_TOTAL_SESSION_COUNT_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_RUM_UNITS_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_SCA_FARGATE_COUNT_AVG,
  UsageSummaryDateOrg.JSON_PROPERTY_SCA_FARGATE_COUNT_HWM,
  UsageSummaryDateOrg.JSON_PROPERTY_SDS_APM_SCANNED_BYTES_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_SDS_EVENTS_SCANNED_BYTES_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_SDS_LOGS_SCANNED_BYTES_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_SDS_RUM_SCANNED_BYTES_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_SDS_TOTAL_SCANNED_BYTES_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_SERVERLESS_APPS_APM_APM_AZURE_APPSERVICE_INSTANCES_AVG,
  UsageSummaryDateOrg.JSON_PROPERTY_SERVERLESS_APPS_APM_APM_AZURE_AZUREFUNCTION_INSTANCES_AVG,
  UsageSummaryDateOrg.JSON_PROPERTY_SERVERLESS_APPS_APM_APM_AZURE_CONTAINERAPP_INSTANCES_AVG,
  UsageSummaryDateOrg.JSON_PROPERTY_SERVERLESS_APPS_APM_APM_FARGATE_ECS_TASKS_AVG,
  UsageSummaryDateOrg.JSON_PROPERTY_SERVERLESS_APPS_APM_APM_GCP_CLOUDFUNCTION_INSTANCES_AVG,
  UsageSummaryDateOrg.JSON_PROPERTY_SERVERLESS_APPS_APM_APM_GCP_CLOUDRUN_INSTANCES_AVG,
  UsageSummaryDateOrg.JSON_PROPERTY_SERVERLESS_APPS_APM_AVG,
  UsageSummaryDateOrg
      .JSON_PROPERTY_SERVERLESS_APPS_APM_EXCL_FARGATE_APM_AZURE_APPSERVICE_INSTANCES_AVG,
  UsageSummaryDateOrg
      .JSON_PROPERTY_SERVERLESS_APPS_APM_EXCL_FARGATE_APM_AZURE_AZUREFUNCTION_INSTANCES_AVG,
  UsageSummaryDateOrg
      .JSON_PROPERTY_SERVERLESS_APPS_APM_EXCL_FARGATE_APM_AZURE_CONTAINERAPP_INSTANCES_AVG,
  UsageSummaryDateOrg
      .JSON_PROPERTY_SERVERLESS_APPS_APM_EXCL_FARGATE_APM_GCP_CLOUDFUNCTION_INSTANCES_AVG,
  UsageSummaryDateOrg.JSON_PROPERTY_SERVERLESS_APPS_APM_EXCL_FARGATE_APM_GCP_CLOUDRUN_INSTANCES_AVG,
  UsageSummaryDateOrg.JSON_PROPERTY_SERVERLESS_APPS_APM_EXCL_FARGATE_AVG,
  UsageSummaryDateOrg.JSON_PROPERTY_SERVERLESS_APPS_AZURE_CONTAINER_APP_INSTANCES_AVG,
  UsageSummaryDateOrg.JSON_PROPERTY_SERVERLESS_APPS_AZURE_COUNT_AVG,
  UsageSummaryDateOrg.JSON_PROPERTY_SERVERLESS_APPS_AZURE_FUNCTION_APP_INSTANCES_AVG,
  UsageSummaryDateOrg.JSON_PROPERTY_SERVERLESS_APPS_AZURE_WEB_APP_INSTANCES_AVG,
  UsageSummaryDateOrg.JSON_PROPERTY_SERVERLESS_APPS_ECS_AVG,
  UsageSummaryDateOrg.JSON_PROPERTY_SERVERLESS_APPS_EKS_AVG,
  UsageSummaryDateOrg.JSON_PROPERTY_SERVERLESS_APPS_EXCL_FARGATE_AVG,
  UsageSummaryDateOrg.JSON_PROPERTY_SERVERLESS_APPS_EXCL_FARGATE_AZURE_CONTAINER_APP_INSTANCES_AVG,
  UsageSummaryDateOrg.JSON_PROPERTY_SERVERLESS_APPS_EXCL_FARGATE_AZURE_FUNCTION_APP_INSTANCES_AVG,
  UsageSummaryDateOrg.JSON_PROPERTY_SERVERLESS_APPS_EXCL_FARGATE_AZURE_WEB_APP_INSTANCES_AVG,
  UsageSummaryDateOrg
      .JSON_PROPERTY_SERVERLESS_APPS_EXCL_FARGATE_GOOGLE_CLOUD_FUNCTIONS_INSTANCES_AVG,
  UsageSummaryDateOrg.JSON_PROPERTY_SERVERLESS_APPS_EXCL_FARGATE_GOOGLE_CLOUD_RUN_INSTANCES_AVG,
  UsageSummaryDateOrg.JSON_PROPERTY_SERVERLESS_APPS_GOOGLE_CLOUD_FUNCTIONS_INSTANCES_AVG,
  UsageSummaryDateOrg.JSON_PROPERTY_SERVERLESS_APPS_GOOGLE_CLOUD_RUN_INSTANCES_AVG,
  UsageSummaryDateOrg.JSON_PROPERTY_SERVERLESS_APPS_GOOGLE_COUNT_AVG,
  UsageSummaryDateOrg.JSON_PROPERTY_SERVERLESS_APPS_TOTAL_COUNT_AVG,
  UsageSummaryDateOrg.JSON_PROPERTY_SIEM_ANALYZED_LOGS_ADD_ON_COUNT_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_SYNTHETICS_BROWSER_CHECK_CALLS_COUNT_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_SYNTHETICS_CHECK_CALLS_COUNT_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_SYNTHETICS_MOBILE_TEST_RUNS_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_SYNTHETICS_PARALLEL_TESTING_MAX_SLOTS_HWM,
  UsageSummaryDateOrg.JSON_PROPERTY_TRACE_SEARCH_INDEXED_EVENTS_COUNT_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_TWOL_INGESTED_EVENTS_BYTES_SUM,
  UsageSummaryDateOrg.JSON_PROPERTY_UNIVERSAL_SERVICE_MONITORING_HOST_TOP99P,
  UsageSummaryDateOrg.JSON_PROPERTY_VSPHERE_HOST_TOP99P,
  UsageSummaryDateOrg.JSON_PROPERTY_VULN_MANAGEMENT_HOST_COUNT_TOP99P,
  UsageSummaryDateOrg.JSON_PROPERTY_WORKFLOW_EXECUTIONS_USAGE_SUM
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class UsageSummaryDateOrg {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACCOUNT_NAME = "account_name";
  private String accountName;

  public static final String JSON_PROPERTY_ACCOUNT_PUBLIC_ID = "account_public_id";
  private String accountPublicId;

  public static final String JSON_PROPERTY_AGENT_HOST_TOP99P = "agent_host_top99p";
  private Long agentHostTop99p;

  public static final String JSON_PROPERTY_APM_AZURE_APP_SERVICE_HOST_TOP99P =
      "apm_azure_app_service_host_top99p";
  private Long apmAzureAppServiceHostTop99p;

  public static final String JSON_PROPERTY_APM_DEVSECOPS_HOST_TOP99P = "apm_devsecops_host_top99p";
  private Long apmDevsecopsHostTop99p;

  public static final String JSON_PROPERTY_APM_ENTERPRISE_STANDALONE_HOSTS_TOP99P =
      "apm_enterprise_standalone_hosts_top99p";
  private Long apmEnterpriseStandaloneHostsTop99p;

  public static final String JSON_PROPERTY_APM_FARGATE_COUNT_AVG = "apm_fargate_count_avg";
  private Long apmFargateCountAvg;

  public static final String JSON_PROPERTY_APM_HOST_TOP99P = "apm_host_top99p";
  private Long apmHostTop99p;

  public static final String JSON_PROPERTY_APM_PRO_STANDALONE_HOSTS_TOP99P =
      "apm_pro_standalone_hosts_top99p";
  private Long apmProStandaloneHostsTop99p;

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

  public static final String JSON_PROPERTY_BITS_AI_INVESTIGATIONS_SUM =
      "bits_ai_investigations_sum";
  private Long bitsAiInvestigationsSum;

  public static final String JSON_PROPERTY_BROWSER_RUM_LITE_SESSION_COUNT_SUM =
      "browser_rum_lite_session_count_sum";
  private Long browserRumLiteSessionCountSum;

  public static final String JSON_PROPERTY_BROWSER_RUM_REPLAY_SESSION_COUNT_SUM =
      "browser_rum_replay_session_count_sum";
  private Long browserRumReplaySessionCountSum;

  public static final String JSON_PROPERTY_BROWSER_RUM_UNITS_SUM = "browser_rum_units_sum";
  private Long browserRumUnitsSum;

  public static final String JSON_PROPERTY_CCM_SPEND_MONITORED_ENT_LAST =
      "ccm_spend_monitored_ent_last";
  private Long ccmSpendMonitoredEntLast;

  public static final String JSON_PROPERTY_CCM_SPEND_MONITORED_PRO_LAST =
      "ccm_spend_monitored_pro_last";
  private Long ccmSpendMonitoredProLast;

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

  public static final String JSON_PROPERTY_CLOUD_COST_MANAGEMENT_OCI_HOST_COUNT_AVG =
      "cloud_cost_management_oci_host_count_avg";
  private Long cloudCostManagementOciHostCountAvg;

  public static final String JSON_PROPERTY_CLOUD_SIEM_EVENTS_SUM = "cloud_siem_events_sum";
  private Long cloudSiemEventsSum;

  public static final String JSON_PROPERTY_CODE_ANALYSIS_SA_COMMITTERS_HWM =
      "code_analysis_sa_committers_hwm";
  private Long codeAnalysisSaCommittersHwm;

  public static final String JSON_PROPERTY_CODE_ANALYSIS_SCA_COMMITTERS_HWM =
      "code_analysis_sca_committers_hwm";
  private Long codeAnalysisScaCommittersHwm;

  public static final String JSON_PROPERTY_CODE_SECURITY_HOST_TOP99P = "code_security_host_top99p";
  private Long codeSecurityHostTop99p;

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

  public static final String JSON_PROPERTY_CUSTOM_HISTORICAL_TS_AVG = "custom_historical_ts_avg";
  private Long customHistoricalTsAvg;

  public static final String JSON_PROPERTY_CUSTOM_LIVE_TS_AVG = "custom_live_ts_avg";
  private Long customLiveTsAvg;

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

  public static final String JSON_PROPERTY_DBM_HOST_TOP99P_SUM = "dbm_host_top99p_sum";
  private Long dbmHostTop99pSum;

  public static final String JSON_PROPERTY_DBM_QUERIES_AVG_SUM = "dbm_queries_avg_sum";
  private Long dbmQueriesAvgSum;

  public static final String JSON_PROPERTY_EPH_INFRA_HOST_AGENT_SUM = "eph_infra_host_agent_sum";
  private Long ephInfraHostAgentSum;

  public static final String JSON_PROPERTY_EPH_INFRA_HOST_ALIBABA_SUM =
      "eph_infra_host_alibaba_sum";
  private Long ephInfraHostAlibabaSum;

  public static final String JSON_PROPERTY_EPH_INFRA_HOST_AWS_SUM = "eph_infra_host_aws_sum";
  private Long ephInfraHostAwsSum;

  public static final String JSON_PROPERTY_EPH_INFRA_HOST_AZURE_SUM = "eph_infra_host_azure_sum";
  private Long ephInfraHostAzureSum;

  public static final String JSON_PROPERTY_EPH_INFRA_HOST_ENT_SUM = "eph_infra_host_ent_sum";
  private Long ephInfraHostEntSum;

  public static final String JSON_PROPERTY_EPH_INFRA_HOST_GCP_SUM = "eph_infra_host_gcp_sum";
  private Long ephInfraHostGcpSum;

  public static final String JSON_PROPERTY_EPH_INFRA_HOST_HEROKU_SUM = "eph_infra_host_heroku_sum";
  private Long ephInfraHostHerokuSum;

  public static final String JSON_PROPERTY_EPH_INFRA_HOST_ONLY_AAS_SUM =
      "eph_infra_host_only_aas_sum";
  private Long ephInfraHostOnlyAasSum;

  public static final String JSON_PROPERTY_EPH_INFRA_HOST_ONLY_VSPHERE_SUM =
      "eph_infra_host_only_vsphere_sum";
  private Long ephInfraHostOnlyVsphereSum;

  public static final String JSON_PROPERTY_EPH_INFRA_HOST_OPENTELEMETRY_APM_SUM =
      "eph_infra_host_opentelemetry_apm_sum";
  private Long ephInfraHostOpentelemetryApmSum;

  public static final String JSON_PROPERTY_EPH_INFRA_HOST_OPENTELEMETRY_SUM =
      "eph_infra_host_opentelemetry_sum";
  private Long ephInfraHostOpentelemetrySum;

  public static final String JSON_PROPERTY_EPH_INFRA_HOST_PRO_SUM = "eph_infra_host_pro_sum";
  private Long ephInfraHostProSum;

  public static final String JSON_PROPERTY_EPH_INFRA_HOST_PROPLUS_SUM =
      "eph_infra_host_proplus_sum";
  private Long ephInfraHostProplusSum;

  public static final String JSON_PROPERTY_EPH_INFRA_HOST_PROXMOX_SUM =
      "eph_infra_host_proxmox_sum";
  private Long ephInfraHostProxmoxSum;

  public static final String JSON_PROPERTY_ERROR_TRACKING_APM_ERROR_EVENTS_SUM =
      "error_tracking_apm_error_events_sum";
  private Long errorTrackingApmErrorEventsSum;

  public static final String JSON_PROPERTY_ERROR_TRACKING_ERROR_EVENTS_SUM =
      "error_tracking_error_events_sum";
  private Long errorTrackingErrorEventsSum;

  public static final String JSON_PROPERTY_ERROR_TRACKING_EVENTS_SUM = "error_tracking_events_sum";
  private Long errorTrackingEventsSum;

  public static final String JSON_PROPERTY_ERROR_TRACKING_RUM_ERROR_EVENTS_SUM =
      "error_tracking_rum_error_events_sum";
  private Long errorTrackingRumErrorEventsSum;

  public static final String JSON_PROPERTY_EVENT_MANAGEMENT_CORRELATION_CORRELATED_EVENTS_SUM =
      "event_management_correlation_correlated_events_sum";
  private Long eventManagementCorrelationCorrelatedEventsSum;

  public static final String
      JSON_PROPERTY_EVENT_MANAGEMENT_CORRELATION_CORRELATED_RELATED_EVENTS_SUM =
          "event_management_correlation_correlated_related_events_sum";
  private Long eventManagementCorrelationCorrelatedRelatedEventsSum;

  public static final String JSON_PROPERTY_EVENT_MANAGEMENT_CORRELATION_SUM =
      "event_management_correlation_sum";
  private Long eventManagementCorrelationSum;

  public static final String JSON_PROPERTY_FARGATE_CONTAINER_PROFILER_PROFILING_FARGATE_AVG =
      "fargate_container_profiler_profiling_fargate_avg";
  private Long fargateContainerProfilerProfilingFargateAvg;

  public static final String JSON_PROPERTY_FARGATE_CONTAINER_PROFILER_PROFILING_FARGATE_EKS_AVG =
      "fargate_container_profiler_profiling_fargate_eks_avg";
  private Long fargateContainerProfilerProfilingFargateEksAvg;

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

  public static final String JSON_PROPERTY_FLEX_LOGS_COMPUTE_XLARGE_AVG =
      "flex_logs_compute_xlarge_avg";
  private Long flexLogsComputeXlargeAvg;

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

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_INCIDENT_MANAGEMENT_MONTHLY_ACTIVE_USERS_HWM =
      "incident_management_monthly_active_users_hwm";
  private Long incidentManagementMonthlyActiveUsersHwm;

  public static final String JSON_PROPERTY_INCIDENT_MANAGEMENT_SEATS_HWM =
      "incident_management_seats_hwm";
  private Long incidentManagementSeatsHwm;

  public static final String JSON_PROPERTY_INDEXED_EVENTS_COUNT_SUM = "indexed_events_count_sum";
  private Long indexedEventsCountSum;

  public static final String JSON_PROPERTY_INFRA_HOST_TOP99P = "infra_host_top99p";
  private Long infraHostTop99p;

  public static final String JSON_PROPERTY_INGESTED_EVENTS_BYTES_SUM = "ingested_events_bytes_sum";
  private Long ingestedEventsBytesSum;

  public static final String JSON_PROPERTY_IOT_DEVICE_AGG_SUM = "iot_device_agg_sum";
  private Long iotDeviceAggSum;

  public static final String JSON_PROPERTY_IOT_DEVICE_TOP99P_SUM = "iot_device_top99p_sum";
  private Long iotDeviceTop99pSum;

  public static final String JSON_PROPERTY_LLM_OBSERVABILITY_MIN_SPEND_SUM =
      "llm_observability_min_spend_sum";
  private Long llmObservabilityMinSpendSum;

  public static final String JSON_PROPERTY_LLM_OBSERVABILITY_SUM = "llm_observability_sum";
  private Long llmObservabilitySum;

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

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_NDM_NETFLOW_EVENTS_SUM = "ndm_netflow_events_sum";
  private Long ndmNetflowEventsSum;

  public static final String JSON_PROPERTY_NETFLOW_INDEXED_EVENTS_COUNT_SUM =
      "netflow_indexed_events_count_sum";
  private Long netflowIndexedEventsCountSum;

  public static final String JSON_PROPERTY_NETWORK_DEVICE_WIRELESS_TOP99P =
      "network_device_wireless_top99p";
  private Long networkDeviceWirelessTop99p;

  public static final String JSON_PROPERTY_NPM_HOST_TOP99P = "npm_host_top99p";
  private Long npmHostTop99p;

  public static final String JSON_PROPERTY_OBSERVABILITY_PIPELINES_BYTES_PROCESSED_SUM =
      "observability_pipelines_bytes_processed_sum";
  private Long observabilityPipelinesBytesProcessedSum;

  public static final String JSON_PROPERTY_OCI_HOST_SUM = "oci_host_sum";
  private Long ociHostSum;

  public static final String JSON_PROPERTY_OCI_HOST_TOP99P = "oci_host_top99p";
  private Long ociHostTop99p;

  public static final String JSON_PROPERTY_ON_CALL_SEAT_HWM = "on_call_seat_hwm";
  private Long onCallSeatHwm;

  public static final String JSON_PROPERTY_ONLINE_ARCHIVE_EVENTS_COUNT_SUM =
      "online_archive_events_count_sum";
  private Long onlineArchiveEventsCountSum;

  public static final String JSON_PROPERTY_OPENTELEMETRY_APM_HOST_TOP99P =
      "opentelemetry_apm_host_top99p";
  private Long opentelemetryApmHostTop99p;

  public static final String JSON_PROPERTY_OPENTELEMETRY_HOST_TOP99P = "opentelemetry_host_top99p";
  private Long opentelemetryHostTop99p;

  public static final String JSON_PROPERTY_PRODUCT_ANALYTICS_SUM = "product_analytics_sum";
  private Long productAnalyticsSum;

  public static final String JSON_PROPERTY_PROFILING_AAS_COUNT_TOP99P =
      "profiling_aas_count_top99p";
  private Long profilingAasCountTop99p;

  public static final String JSON_PROPERTY_PROFILING_HOST_TOP99P = "profiling_host_top99p";
  private Long profilingHostTop99p;

  public static final String JSON_PROPERTY_PROXMOX_HOST_SUM = "proxmox_host_sum";
  private Long proxmoxHostSum;

  public static final String JSON_PROPERTY_PROXMOX_HOST_TOP99P = "proxmox_host_top99p";
  private Long proxmoxHostTop99p;

  public static final String JSON_PROPERTY_PUBLIC_ID = "public_id";
  private String publicId;

  public static final String JSON_PROPERTY_PUBLISHED_APP_HWM = "published_app_hwm";
  private Long publishedAppHwm;

  public static final String JSON_PROPERTY_REGION = "region";
  private String region;

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

  public static final String JSON_PROPERTY_RUM_INDEXED_SESSIONS_SUM = "rum_indexed_sessions_sum";
  private Long rumIndexedSessionsSum;

  public static final String JSON_PROPERTY_RUM_INGESTED_SESSIONS_SUM = "rum_ingested_sessions_sum";
  private Long rumIngestedSessionsSum;

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

  public static final String JSON_PROPERTY_RUM_MOBILE_LITE_SESSION_COUNT_KOTLINMULTIPLATFORM_SUM =
      "rum_mobile_lite_session_count_kotlinmultiplatform_sum";
  private Long rumMobileLiteSessionCountKotlinmultiplatformSum;

  public static final String JSON_PROPERTY_RUM_MOBILE_LITE_SESSION_COUNT_REACTNATIVE_SUM =
      "rum_mobile_lite_session_count_reactnative_sum";
  private Long rumMobileLiteSessionCountReactnativeSum;

  public static final String JSON_PROPERTY_RUM_MOBILE_LITE_SESSION_COUNT_ROKU_SUM =
      "rum_mobile_lite_session_count_roku_sum";
  private Long rumMobileLiteSessionCountRokuSum;

  public static final String JSON_PROPERTY_RUM_MOBILE_LITE_SESSION_COUNT_UNITY_SUM =
      "rum_mobile_lite_session_count_unity_sum";
  private Long rumMobileLiteSessionCountUnitySum;

  public static final String JSON_PROPERTY_RUM_MOBILE_REPLAY_SESSION_COUNT_ANDROID_SUM =
      "rum_mobile_replay_session_count_android_sum";
  private Long rumMobileReplaySessionCountAndroidSum;

  public static final String JSON_PROPERTY_RUM_MOBILE_REPLAY_SESSION_COUNT_IOS_SUM =
      "rum_mobile_replay_session_count_ios_sum";
  private Long rumMobileReplaySessionCountIosSum;

  public static final String JSON_PROPERTY_RUM_MOBILE_REPLAY_SESSION_COUNT_KOTLINMULTIPLATFORM_SUM =
      "rum_mobile_replay_session_count_kotlinmultiplatform_sum";
  private Long rumMobileReplaySessionCountKotlinmultiplatformSum;

  public static final String JSON_PROPERTY_RUM_MOBILE_REPLAY_SESSION_COUNT_REACTNATIVE_SUM =
      "rum_mobile_replay_session_count_reactnative_sum";
  private Long rumMobileReplaySessionCountReactnativeSum;

  public static final String JSON_PROPERTY_RUM_REPLAY_SESSION_COUNT_SUM =
      "rum_replay_session_count_sum";
  private Long rumReplaySessionCountSum;

  public static final String JSON_PROPERTY_RUM_SESSION_COUNT_SUM = "rum_session_count_sum";
  private Long rumSessionCountSum;

  public static final String JSON_PROPERTY_RUM_SESSION_REPLAY_ADD_ON_SUM =
      "rum_session_replay_add_on_sum";
  private Long rumSessionReplayAddOnSum;

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

  public static final String JSON_PROPERTY_SERVERLESS_APPS_APM_APM_AZURE_APPSERVICE_INSTANCES_AVG =
      "serverless_apps_apm_apm_azure_appservice_instances_avg";
  private Long serverlessAppsApmApmAzureAppserviceInstancesAvg;

  public static final String
      JSON_PROPERTY_SERVERLESS_APPS_APM_APM_AZURE_AZUREFUNCTION_INSTANCES_AVG =
          "serverless_apps_apm_apm_azure_azurefunction_instances_avg";
  private Long serverlessAppsApmApmAzureAzurefunctionInstancesAvg;

  public static final String
      JSON_PROPERTY_SERVERLESS_APPS_APM_APM_AZURE_CONTAINERAPP_INSTANCES_AVG =
          "serverless_apps_apm_apm_azure_containerapp_instances_avg";
  private Long serverlessAppsApmApmAzureContainerappInstancesAvg;

  public static final String JSON_PROPERTY_SERVERLESS_APPS_APM_APM_FARGATE_ECS_TASKS_AVG =
      "serverless_apps_apm_apm_fargate_ecs_tasks_avg";
  private Long serverlessAppsApmApmFargateEcsTasksAvg;

  public static final String JSON_PROPERTY_SERVERLESS_APPS_APM_APM_GCP_CLOUDFUNCTION_INSTANCES_AVG =
      "serverless_apps_apm_apm_gcp_cloudfunction_instances_avg";
  private Long serverlessAppsApmApmGcpCloudfunctionInstancesAvg;

  public static final String JSON_PROPERTY_SERVERLESS_APPS_APM_APM_GCP_CLOUDRUN_INSTANCES_AVG =
      "serverless_apps_apm_apm_gcp_cloudrun_instances_avg";
  private Long serverlessAppsApmApmGcpCloudrunInstancesAvg;

  public static final String JSON_PROPERTY_SERVERLESS_APPS_APM_AVG = "serverless_apps_apm_avg";
  private Long serverlessAppsApmAvg;

  public static final String
      JSON_PROPERTY_SERVERLESS_APPS_APM_EXCL_FARGATE_APM_AZURE_APPSERVICE_INSTANCES_AVG =
          "serverless_apps_apm_excl_fargate_apm_azure_appservice_instances_avg";
  private Long serverlessAppsApmExclFargateApmAzureAppserviceInstancesAvg;

  public static final String
      JSON_PROPERTY_SERVERLESS_APPS_APM_EXCL_FARGATE_APM_AZURE_AZUREFUNCTION_INSTANCES_AVG =
          "serverless_apps_apm_excl_fargate_apm_azure_azurefunction_instances_avg";
  private Long serverlessAppsApmExclFargateApmAzureAzurefunctionInstancesAvg;

  public static final String
      JSON_PROPERTY_SERVERLESS_APPS_APM_EXCL_FARGATE_APM_AZURE_CONTAINERAPP_INSTANCES_AVG =
          "serverless_apps_apm_excl_fargate_apm_azure_containerapp_instances_avg";
  private Long serverlessAppsApmExclFargateApmAzureContainerappInstancesAvg;

  public static final String
      JSON_PROPERTY_SERVERLESS_APPS_APM_EXCL_FARGATE_APM_GCP_CLOUDFUNCTION_INSTANCES_AVG =
          "serverless_apps_apm_excl_fargate_apm_gcp_cloudfunction_instances_avg";
  private Long serverlessAppsApmExclFargateApmGcpCloudfunctionInstancesAvg;

  public static final String
      JSON_PROPERTY_SERVERLESS_APPS_APM_EXCL_FARGATE_APM_GCP_CLOUDRUN_INSTANCES_AVG =
          "serverless_apps_apm_excl_fargate_apm_gcp_cloudrun_instances_avg";
  private Long serverlessAppsApmExclFargateApmGcpCloudrunInstancesAvg;

  public static final String JSON_PROPERTY_SERVERLESS_APPS_APM_EXCL_FARGATE_AVG =
      "serverless_apps_apm_excl_fargate_avg";
  private Long serverlessAppsApmExclFargateAvg;

  public static final String JSON_PROPERTY_SERVERLESS_APPS_AZURE_CONTAINER_APP_INSTANCES_AVG =
      "serverless_apps_azure_container_app_instances_avg";
  private Long serverlessAppsAzureContainerAppInstancesAvg;

  public static final String JSON_PROPERTY_SERVERLESS_APPS_AZURE_COUNT_AVG =
      "serverless_apps_azure_count_avg";
  private Long serverlessAppsAzureCountAvg;

  public static final String JSON_PROPERTY_SERVERLESS_APPS_AZURE_FUNCTION_APP_INSTANCES_AVG =
      "serverless_apps_azure_function_app_instances_avg";
  private Long serverlessAppsAzureFunctionAppInstancesAvg;

  public static final String JSON_PROPERTY_SERVERLESS_APPS_AZURE_WEB_APP_INSTANCES_AVG =
      "serverless_apps_azure_web_app_instances_avg";
  private Long serverlessAppsAzureWebAppInstancesAvg;

  public static final String JSON_PROPERTY_SERVERLESS_APPS_ECS_AVG = "serverless_apps_ecs_avg";
  private Long serverlessAppsEcsAvg;

  public static final String JSON_PROPERTY_SERVERLESS_APPS_EKS_AVG = "serverless_apps_eks_avg";
  private Long serverlessAppsEksAvg;

  public static final String JSON_PROPERTY_SERVERLESS_APPS_EXCL_FARGATE_AVG =
      "serverless_apps_excl_fargate_avg";
  private Long serverlessAppsExclFargateAvg;

  public static final String
      JSON_PROPERTY_SERVERLESS_APPS_EXCL_FARGATE_AZURE_CONTAINER_APP_INSTANCES_AVG =
          "serverless_apps_excl_fargate_azure_container_app_instances_avg";
  private Long serverlessAppsExclFargateAzureContainerAppInstancesAvg;

  public static final String
      JSON_PROPERTY_SERVERLESS_APPS_EXCL_FARGATE_AZURE_FUNCTION_APP_INSTANCES_AVG =
          "serverless_apps_excl_fargate_azure_function_app_instances_avg";
  private Long serverlessAppsExclFargateAzureFunctionAppInstancesAvg;

  public static final String
      JSON_PROPERTY_SERVERLESS_APPS_EXCL_FARGATE_AZURE_WEB_APP_INSTANCES_AVG =
          "serverless_apps_excl_fargate_azure_web_app_instances_avg";
  private Long serverlessAppsExclFargateAzureWebAppInstancesAvg;

  public static final String
      JSON_PROPERTY_SERVERLESS_APPS_EXCL_FARGATE_GOOGLE_CLOUD_FUNCTIONS_INSTANCES_AVG =
          "serverless_apps_excl_fargate_google_cloud_functions_instances_avg";
  private Long serverlessAppsExclFargateGoogleCloudFunctionsInstancesAvg;

  public static final String
      JSON_PROPERTY_SERVERLESS_APPS_EXCL_FARGATE_GOOGLE_CLOUD_RUN_INSTANCES_AVG =
          "serverless_apps_excl_fargate_google_cloud_run_instances_avg";
  private Long serverlessAppsExclFargateGoogleCloudRunInstancesAvg;

  public static final String JSON_PROPERTY_SERVERLESS_APPS_GOOGLE_CLOUD_FUNCTIONS_INSTANCES_AVG =
      "serverless_apps_google_cloud_functions_instances_avg";
  private Long serverlessAppsGoogleCloudFunctionsInstancesAvg;

  public static final String JSON_PROPERTY_SERVERLESS_APPS_GOOGLE_CLOUD_RUN_INSTANCES_AVG =
      "serverless_apps_google_cloud_run_instances_avg";
  private Long serverlessAppsGoogleCloudRunInstancesAvg;

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

  public UsageSummaryDateOrg accountName(String accountName) {
    this.accountName = accountName;
    return this;
  }

  /**
   * The account name.
   *
   * @return accountName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCOUNT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAccountName() {
    return accountName;
  }

  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }

  public UsageSummaryDateOrg accountPublicId(String accountPublicId) {
    this.accountPublicId = accountPublicId;
    return this;
  }

  /**
   * The account public id.
   *
   * @return accountPublicId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCOUNT_PUBLIC_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAccountPublicId() {
    return accountPublicId;
  }

  public void setAccountPublicId(String accountPublicId) {
    this.accountPublicId = accountPublicId;
  }

  public UsageSummaryDateOrg agentHostTop99p(Long agentHostTop99p) {
    this.agentHostTop99p = agentHostTop99p;
    return this;
  }

  /**
   * Shows the 99th percentile of all agent hosts over all hours in the current date for the given
   * org.
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

  public UsageSummaryDateOrg apmAzureAppServiceHostTop99p(Long apmAzureAppServiceHostTop99p) {
    this.apmAzureAppServiceHostTop99p = apmAzureAppServiceHostTop99p;
    return this;
  }

  /**
   * Shows the 99th percentile of all Azure app services using APM over all hours in the current
   * date for the given org.
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

  public UsageSummaryDateOrg apmDevsecopsHostTop99p(Long apmDevsecopsHostTop99p) {
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

  public UsageSummaryDateOrg apmEnterpriseStandaloneHostsTop99p(
      Long apmEnterpriseStandaloneHostsTop99p) {
    this.apmEnterpriseStandaloneHostsTop99p = apmEnterpriseStandaloneHostsTop99p;
    return this;
  }

  /**
   * Shows the 99th percentile of all distinct standalone Enterprise hosts over all hours in the
   * current date for the given org.
   *
   * @return apmEnterpriseStandaloneHostsTop99p
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APM_ENTERPRISE_STANDALONE_HOSTS_TOP99P)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getApmEnterpriseStandaloneHostsTop99p() {
    return apmEnterpriseStandaloneHostsTop99p;
  }

  public void setApmEnterpriseStandaloneHostsTop99p(Long apmEnterpriseStandaloneHostsTop99p) {
    this.apmEnterpriseStandaloneHostsTop99p = apmEnterpriseStandaloneHostsTop99p;
  }

  public UsageSummaryDateOrg apmFargateCountAvg(Long apmFargateCountAvg) {
    this.apmFargateCountAvg = apmFargateCountAvg;
    return this;
  }

  /**
   * Shows the average of all APM ECS Fargate tasks over all hours in the current month for the
   * given org.
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

  public UsageSummaryDateOrg apmHostTop99p(Long apmHostTop99p) {
    this.apmHostTop99p = apmHostTop99p;
    return this;
  }

  /**
   * Shows the 99th percentile of all distinct APM hosts over all hours in the current date for the
   * given org.
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

  public UsageSummaryDateOrg apmProStandaloneHostsTop99p(Long apmProStandaloneHostsTop99p) {
    this.apmProStandaloneHostsTop99p = apmProStandaloneHostsTop99p;
    return this;
  }

  /**
   * Shows the 99th percentile of all distinct standalone Pro hosts over all hours in the current
   * date for the given org.
   *
   * @return apmProStandaloneHostsTop99p
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APM_PRO_STANDALONE_HOSTS_TOP99P)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getApmProStandaloneHostsTop99p() {
    return apmProStandaloneHostsTop99p;
  }

  public void setApmProStandaloneHostsTop99p(Long apmProStandaloneHostsTop99p) {
    this.apmProStandaloneHostsTop99p = apmProStandaloneHostsTop99p;
  }

  public UsageSummaryDateOrg appsecFargateCountAvg(Long appsecFargateCountAvg) {
    this.appsecFargateCountAvg = appsecFargateCountAvg;
    return this;
  }

  /**
   * Shows the average of all Application Security Monitoring ECS Fargate tasks over all hours in
   * the current month for the given org.
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

  public UsageSummaryDateOrg asmServerlessSum(Long asmServerlessSum) {
    this.asmServerlessSum = asmServerlessSum;
    return this;
  }

  /**
   * Shows the sum of all Application Security Monitoring Serverless invocations over all hours in
   * the current month for the given org.
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

  public UsageSummaryDateOrg auditLogsLinesIndexedSum(Long auditLogsLinesIndexedSum) {
    this.auditLogsLinesIndexedSum = auditLogsLinesIndexedSum;
    return this;
  }

  /**
   * Shows the sum of all audit logs lines indexed over all hours in the current date for the given
   * org (To be deprecated on October 1st, 2024).
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

  public UsageSummaryDateOrg auditTrailEnabledHwm(Long auditTrailEnabledHwm) {
    this.auditTrailEnabledHwm = auditTrailEnabledHwm;
    return this;
  }

  /**
   * Shows whether Audit Trail is enabled for the current date for the given org.
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

  public UsageSummaryDateOrg avgProfiledFargateTasks(Long avgProfiledFargateTasks) {
    this.avgProfiledFargateTasks = avgProfiledFargateTasks;
    return this;
  }

  /**
   * The average total count for Fargate Container Profiler over all hours in the current month for
   * the given org.
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

  public UsageSummaryDateOrg awsHostTop99p(Long awsHostTop99p) {
    this.awsHostTop99p = awsHostTop99p;
    return this;
  }

  /**
   * Shows the 99th percentile of all AWS hosts over all hours in the current date for the given
   * org.
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
    this.awsLambdaInvocationsSum = awsLambdaInvocationsSum;
    return this;
  }

  /**
   * Shows the sum of all AWS Lambda invocations over all hours in the current date for the given
   * org.
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

  public UsageSummaryDateOrg azureAppServiceTop99p(Long azureAppServiceTop99p) {
    this.azureAppServiceTop99p = azureAppServiceTop99p;
    return this;
  }

  /**
   * Shows the 99th percentile of all Azure app services over all hours in the current date for the
   * given org.
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

  public UsageSummaryDateOrg billableIngestedBytesSum(Long billableIngestedBytesSum) {
    this.billableIngestedBytesSum = billableIngestedBytesSum;
    return this;
  }

  /**
   * Shows the sum of all log bytes ingested over all hours in the current date for the given org.
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

  public UsageSummaryDateOrg bitsAiInvestigationsSum(Long bitsAiInvestigationsSum) {
    this.bitsAiInvestigationsSum = bitsAiInvestigationsSum;
    return this;
  }

  /**
   * Shows the sum of all Bits AI Investigations over all hours in the current date for the given
   * org.
   *
   * @return bitsAiInvestigationsSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BITS_AI_INVESTIGATIONS_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getBitsAiInvestigationsSum() {
    return bitsAiInvestigationsSum;
  }

  public void setBitsAiInvestigationsSum(Long bitsAiInvestigationsSum) {
    this.bitsAiInvestigationsSum = bitsAiInvestigationsSum;
  }

  public UsageSummaryDateOrg browserRumLiteSessionCountSum(Long browserRumLiteSessionCountSum) {
    this.browserRumLiteSessionCountSum = browserRumLiteSessionCountSum;
    return this;
  }

  /**
   * Shows the sum of all browser lite sessions over all hours in the current date for the given org
   * (To be deprecated on October 1st, 2024).
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

  public UsageSummaryDateOrg browserRumReplaySessionCountSum(Long browserRumReplaySessionCountSum) {
    this.browserRumReplaySessionCountSum = browserRumReplaySessionCountSum;
    return this;
  }

  /**
   * Shows the sum of all browser replay sessions over all hours in the current date for the given
   * org (To be deprecated on October 1st, 2024).
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

  public UsageSummaryDateOrg browserRumUnitsSum(Long browserRumUnitsSum) {
    this.browserRumUnitsSum = browserRumUnitsSum;
    return this;
  }

  /**
   * Shows the sum of all browser RUM units over all hours in the current date for the given org (To
   * be deprecated on October 1st, 2024).
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

  public UsageSummaryDateOrg ccmSpendMonitoredEntLast(Long ccmSpendMonitoredEntLast) {
    this.ccmSpendMonitoredEntLast = ccmSpendMonitoredEntLast;
    return this;
  }

  /**
   * Shows the last value of the amount of cloud spend monitored for Enterprise over all hours in
   * the current date for the given org.
   *
   * @return ccmSpendMonitoredEntLast
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CCM_SPEND_MONITORED_ENT_LAST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCcmSpendMonitoredEntLast() {
    return ccmSpendMonitoredEntLast;
  }

  public void setCcmSpendMonitoredEntLast(Long ccmSpendMonitoredEntLast) {
    this.ccmSpendMonitoredEntLast = ccmSpendMonitoredEntLast;
  }

  public UsageSummaryDateOrg ccmSpendMonitoredProLast(Long ccmSpendMonitoredProLast) {
    this.ccmSpendMonitoredProLast = ccmSpendMonitoredProLast;
    return this;
  }

  /**
   * Shows the last value of the amount of cloud spend monitored for Pro over all hours in the
   * current date for the given org.
   *
   * @return ccmSpendMonitoredProLast
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CCM_SPEND_MONITORED_PRO_LAST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCcmSpendMonitoredProLast() {
    return ccmSpendMonitoredProLast;
  }

  public void setCcmSpendMonitoredProLast(Long ccmSpendMonitoredProLast) {
    this.ccmSpendMonitoredProLast = ccmSpendMonitoredProLast;
  }

  public UsageSummaryDateOrg ciPipelineIndexedSpansSum(Long ciPipelineIndexedSpansSum) {
    this.ciPipelineIndexedSpansSum = ciPipelineIndexedSpansSum;
    return this;
  }

  /**
   * Shows the sum of all CI pipeline indexed spans over all hours in the current date for the given
   * org.
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

  public UsageSummaryDateOrg ciTestIndexedSpansSum(Long ciTestIndexedSpansSum) {
    this.ciTestIndexedSpansSum = ciTestIndexedSpansSum;
    return this;
  }

  /**
   * Shows the sum of all CI test indexed spans over all hours in the current date for the given
   * org.
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

  public UsageSummaryDateOrg ciVisibilityItrCommittersHwm(Long ciVisibilityItrCommittersHwm) {
    this.ciVisibilityItrCommittersHwm = ciVisibilityItrCommittersHwm;
    return this;
  }

  /**
   * Shows the high-water mark of all CI visibility intelligent test runner committers over all
   * hours in the current date for the given org.
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

  public UsageSummaryDateOrg ciVisibilityPipelineCommittersHwm(
      Long ciVisibilityPipelineCommittersHwm) {
    this.ciVisibilityPipelineCommittersHwm = ciVisibilityPipelineCommittersHwm;
    return this;
  }

  /**
   * Shows the high-water mark of all CI visibility pipeline committers over all hours in the
   * current date for the given org.
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

  public UsageSummaryDateOrg ciVisibilityTestCommittersHwm(Long ciVisibilityTestCommittersHwm) {
    this.ciVisibilityTestCommittersHwm = ciVisibilityTestCommittersHwm;
    return this;
  }

  /**
   * Shows the high-water mark of all CI visibility test committers over all hours in the current
   * date for the given org.
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

  public UsageSummaryDateOrg cloudCostManagementAwsHostCountAvg(
      Long cloudCostManagementAwsHostCountAvg) {
    this.cloudCostManagementAwsHostCountAvg = cloudCostManagementAwsHostCountAvg;
    return this;
  }

  /**
   * Host count average of Cloud Cost Management for AWS for the given date and given org.
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

  public UsageSummaryDateOrg cloudCostManagementAzureHostCountAvg(
      Long cloudCostManagementAzureHostCountAvg) {
    this.cloudCostManagementAzureHostCountAvg = cloudCostManagementAzureHostCountAvg;
    return this;
  }

  /**
   * Host count average of Cloud Cost Management for Azure for the given date and given org.
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

  public UsageSummaryDateOrg cloudCostManagementGcpHostCountAvg(
      Long cloudCostManagementGcpHostCountAvg) {
    this.cloudCostManagementGcpHostCountAvg = cloudCostManagementGcpHostCountAvg;
    return this;
  }

  /**
   * Host count average of Cloud Cost Management for GCP for the given date and given org.
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

  public UsageSummaryDateOrg cloudCostManagementHostCountAvg(Long cloudCostManagementHostCountAvg) {
    this.cloudCostManagementHostCountAvg = cloudCostManagementHostCountAvg;
    return this;
  }

  /**
   * Host count average of Cloud Cost Management for all cloud providers for the given date and
   * given org.
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

  public UsageSummaryDateOrg cloudCostManagementOciHostCountAvg(
      Long cloudCostManagementOciHostCountAvg) {
    this.cloudCostManagementOciHostCountAvg = cloudCostManagementOciHostCountAvg;
    return this;
  }

  /**
   * Average host count for Cloud Cost Management on OCI for the given date and organization.
   *
   * @return cloudCostManagementOciHostCountAvg
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CLOUD_COST_MANAGEMENT_OCI_HOST_COUNT_AVG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCloudCostManagementOciHostCountAvg() {
    return cloudCostManagementOciHostCountAvg;
  }

  public void setCloudCostManagementOciHostCountAvg(Long cloudCostManagementOciHostCountAvg) {
    this.cloudCostManagementOciHostCountAvg = cloudCostManagementOciHostCountAvg;
  }

  public UsageSummaryDateOrg cloudSiemEventsSum(Long cloudSiemEventsSum) {
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

  public UsageSummaryDateOrg codeAnalysisSaCommittersHwm(Long codeAnalysisSaCommittersHwm) {
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

  public UsageSummaryDateOrg codeAnalysisScaCommittersHwm(Long codeAnalysisScaCommittersHwm) {
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

  public UsageSummaryDateOrg codeSecurityHostTop99p(Long codeSecurityHostTop99p) {
    this.codeSecurityHostTop99p = codeSecurityHostTop99p;
    return this;
  }

  /**
   * Shows the 99th percentile of all Code Security hosts over all hours in the current date for the
   * given org.
   *
   * @return codeSecurityHostTop99p
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CODE_SECURITY_HOST_TOP99P)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCodeSecurityHostTop99p() {
    return codeSecurityHostTop99p;
  }

  public void setCodeSecurityHostTop99p(Long codeSecurityHostTop99p) {
    this.codeSecurityHostTop99p = codeSecurityHostTop99p;
  }

  public UsageSummaryDateOrg containerAvg(Long containerAvg) {
    this.containerAvg = containerAvg;
    return this;
  }

  /**
   * Shows the average of all distinct containers over all hours in the current date for the given
   * org.
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

  public UsageSummaryDateOrg containerExclAgentAvg(Long containerExclAgentAvg) {
    this.containerExclAgentAvg = containerExclAgentAvg;
    return this;
  }

  /**
   * Shows the average of containers without the Datadog Agent over all hours in the current date
   * for the given organization.
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

  public UsageSummaryDateOrg containerHwm(Long containerHwm) {
    this.containerHwm = containerHwm;
    return this;
  }

  /**
   * Shows the high-water mark of all distinct containers over all hours in the current date for the
   * given org.
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

  public UsageSummaryDateOrg csmContainerEnterpriseComplianceCountSum(
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

  public UsageSummaryDateOrg csmContainerEnterpriseCwsCountSum(
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

  public UsageSummaryDateOrg csmContainerEnterpriseTotalCountSum(
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

  public UsageSummaryDateOrg csmHostEnterpriseAasHostCountTop99p(
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

  public UsageSummaryDateOrg csmHostEnterpriseAwsHostCountTop99p(
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

  public UsageSummaryDateOrg csmHostEnterpriseAzureHostCountTop99p(
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

  public UsageSummaryDateOrg csmHostEnterpriseComplianceHostCountTop99p(
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

  public UsageSummaryDateOrg csmHostEnterpriseCwsHostCountTop99p(
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

  public UsageSummaryDateOrg csmHostEnterpriseGcpHostCountTop99p(
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

  public UsageSummaryDateOrg csmHostEnterpriseTotalHostCountTop99p(
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

  public UsageSummaryDateOrg cspmAasHostTop99p(Long cspmAasHostTop99p) {
    this.cspmAasHostTop99p = cspmAasHostTop99p;
    return this;
  }

  /**
   * Shows the 99th percentile of all Cloud Security Management Pro Azure app services hosts over
   * all hours in the current date for the given org.
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

  public UsageSummaryDateOrg cspmAwsHostTop99p(Long cspmAwsHostTop99p) {
    this.cspmAwsHostTop99p = cspmAwsHostTop99p;
    return this;
  }

  /**
   * Shows the 99th percentile of all Cloud Security Management Pro AWS hosts over all hours in the
   * current date for the given org.
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
    this.cspmAzureHostTop99p = cspmAzureHostTop99p;
    return this;
  }

  /**
   * Shows the 99th percentile of all Cloud Security Management Pro Azure hosts over all hours in
   * the current date for the given org.
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

  public UsageSummaryDateOrg cspmContainerAvg(Long cspmContainerAvg) {
    this.cspmContainerAvg = cspmContainerAvg;
    return this;
  }

  /**
   * Shows the average number of Cloud Security Management Pro containers over all hours in the
   * current date for the given org.
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

  public UsageSummaryDateOrg cspmContainerHwm(Long cspmContainerHwm) {
    this.cspmContainerHwm = cspmContainerHwm;
    return this;
  }

  /**
   * Shows the high-water mark of Cloud Security Management Pro containers over all hours in the
   * current date for the given org.
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

  public UsageSummaryDateOrg cspmGcpHostTop99p(Long cspmGcpHostTop99p) {
    this.cspmGcpHostTop99p = cspmGcpHostTop99p;
    return this;
  }

  /**
   * Shows the 99th percentile of all Cloud Security Management Pro GCP hosts over all hours in the
   * current date for the given org.
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

  public UsageSummaryDateOrg cspmHostTop99p(Long cspmHostTop99p) {
    this.cspmHostTop99p = cspmHostTop99p;
    return this;
  }

  /**
   * Shows the 99th percentile of all Cloud Security Management Pro hosts over all hours in the
   * current date for the given org.
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

  public UsageSummaryDateOrg customHistoricalTsAvg(Long customHistoricalTsAvg) {
    this.customHistoricalTsAvg = customHistoricalTsAvg;
    return this;
  }

  /**
   * Shows the average number of distinct historical custom metrics over all hours in the current
   * date for the given org.
   *
   * @return customHistoricalTsAvg
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CUSTOM_HISTORICAL_TS_AVG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCustomHistoricalTsAvg() {
    return customHistoricalTsAvg;
  }

  public void setCustomHistoricalTsAvg(Long customHistoricalTsAvg) {
    this.customHistoricalTsAvg = customHistoricalTsAvg;
  }

  public UsageSummaryDateOrg customLiveTsAvg(Long customLiveTsAvg) {
    this.customLiveTsAvg = customLiveTsAvg;
    return this;
  }

  /**
   * Shows the average number of distinct live custom metrics over all hours in the current date for
   * the given org.
   *
   * @return customLiveTsAvg
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CUSTOM_LIVE_TS_AVG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCustomLiveTsAvg() {
    return customLiveTsAvg;
  }

  public void setCustomLiveTsAvg(Long customLiveTsAvg) {
    this.customLiveTsAvg = customLiveTsAvg;
  }

  public UsageSummaryDateOrg customTsAvg(Long customTsAvg) {
    this.customTsAvg = customTsAvg;
    return this;
  }

  /**
   * Shows the average number of distinct custom metrics over all hours in the current date for the
   * given org.
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

  public UsageSummaryDateOrg cwsContainerCountAvg(Long cwsContainerCountAvg) {
    this.cwsContainerCountAvg = cwsContainerCountAvg;
    return this;
  }

  /**
   * Shows the average of all distinct Cloud Workload Security containers over all hours in the
   * current date for the given org.
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

  public UsageSummaryDateOrg cwsFargateTaskAvg(Long cwsFargateTaskAvg) {
    this.cwsFargateTaskAvg = cwsFargateTaskAvg;
    return this;
  }

  /**
   * Shows the average of all distinct Cloud Workload Security Fargate tasks over all hours in the
   * current date for the given org.
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

  public UsageSummaryDateOrg cwsHostTop99p(Long cwsHostTop99p) {
    this.cwsHostTop99p = cwsHostTop99p;
    return this;
  }

  /**
   * Shows the 99th percentile of all Cloud Workload Security hosts over all hours in the current
   * date for the given org.
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

  public UsageSummaryDateOrg dataJobsMonitoringHostHrSum(Long dataJobsMonitoringHostHrSum) {
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

  public UsageSummaryDateOrg dbmHostTop99pSum(Long dbmHostTop99pSum) {
    this.dbmHostTop99pSum = dbmHostTop99pSum;
    return this;
  }

  /**
   * Shows the 99th percentile of all Database Monitoring hosts over all hours in the current month
   * for the given org.
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

  public UsageSummaryDateOrg dbmQueriesAvgSum(Long dbmQueriesAvgSum) {
    this.dbmQueriesAvgSum = dbmQueriesAvgSum;
    return this;
  }

  /**
   * Shows the average of all distinct Database Monitoring normalized queries over all hours in the
   * current month for the given org.
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

  public UsageSummaryDateOrg ephInfraHostAgentSum(Long ephInfraHostAgentSum) {
    this.ephInfraHostAgentSum = ephInfraHostAgentSum;
    return this;
  }

  /**
   * Shows the sum of all ephemeral infrastructure hosts with the Datadog Agent over all hours in
   * the current date for the given org.
   *
   * @return ephInfraHostAgentSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EPH_INFRA_HOST_AGENT_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getEphInfraHostAgentSum() {
    return ephInfraHostAgentSum;
  }

  public void setEphInfraHostAgentSum(Long ephInfraHostAgentSum) {
    this.ephInfraHostAgentSum = ephInfraHostAgentSum;
  }

  public UsageSummaryDateOrg ephInfraHostAlibabaSum(Long ephInfraHostAlibabaSum) {
    this.ephInfraHostAlibabaSum = ephInfraHostAlibabaSum;
    return this;
  }

  /**
   * Shows the sum of all ephemeral infrastructure hosts on Alibaba over all hours in the current
   * date for the given org.
   *
   * @return ephInfraHostAlibabaSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EPH_INFRA_HOST_ALIBABA_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getEphInfraHostAlibabaSum() {
    return ephInfraHostAlibabaSum;
  }

  public void setEphInfraHostAlibabaSum(Long ephInfraHostAlibabaSum) {
    this.ephInfraHostAlibabaSum = ephInfraHostAlibabaSum;
  }

  public UsageSummaryDateOrg ephInfraHostAwsSum(Long ephInfraHostAwsSum) {
    this.ephInfraHostAwsSum = ephInfraHostAwsSum;
    return this;
  }

  /**
   * Shows the sum of all ephemeral infrastructure hosts on AWS over all hours in the current date
   * for the given org.
   *
   * @return ephInfraHostAwsSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EPH_INFRA_HOST_AWS_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getEphInfraHostAwsSum() {
    return ephInfraHostAwsSum;
  }

  public void setEphInfraHostAwsSum(Long ephInfraHostAwsSum) {
    this.ephInfraHostAwsSum = ephInfraHostAwsSum;
  }

  public UsageSummaryDateOrg ephInfraHostAzureSum(Long ephInfraHostAzureSum) {
    this.ephInfraHostAzureSum = ephInfraHostAzureSum;
    return this;
  }

  /**
   * Shows the sum of all ephemeral infrastructure hosts on Azure over all hours in the current date
   * for the given org.
   *
   * @return ephInfraHostAzureSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EPH_INFRA_HOST_AZURE_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getEphInfraHostAzureSum() {
    return ephInfraHostAzureSum;
  }

  public void setEphInfraHostAzureSum(Long ephInfraHostAzureSum) {
    this.ephInfraHostAzureSum = ephInfraHostAzureSum;
  }

  public UsageSummaryDateOrg ephInfraHostEntSum(Long ephInfraHostEntSum) {
    this.ephInfraHostEntSum = ephInfraHostEntSum;
    return this;
  }

  /**
   * Shows the sum of all ephemeral infrastructure hosts for Enterprise over all hours in the
   * current date for the given org.
   *
   * @return ephInfraHostEntSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EPH_INFRA_HOST_ENT_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getEphInfraHostEntSum() {
    return ephInfraHostEntSum;
  }

  public void setEphInfraHostEntSum(Long ephInfraHostEntSum) {
    this.ephInfraHostEntSum = ephInfraHostEntSum;
  }

  public UsageSummaryDateOrg ephInfraHostGcpSum(Long ephInfraHostGcpSum) {
    this.ephInfraHostGcpSum = ephInfraHostGcpSum;
    return this;
  }

  /**
   * Shows the sum of all ephemeral infrastructure hosts on GCP over all hours in the current date
   * for the given org.
   *
   * @return ephInfraHostGcpSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EPH_INFRA_HOST_GCP_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getEphInfraHostGcpSum() {
    return ephInfraHostGcpSum;
  }

  public void setEphInfraHostGcpSum(Long ephInfraHostGcpSum) {
    this.ephInfraHostGcpSum = ephInfraHostGcpSum;
  }

  public UsageSummaryDateOrg ephInfraHostHerokuSum(Long ephInfraHostHerokuSum) {
    this.ephInfraHostHerokuSum = ephInfraHostHerokuSum;
    return this;
  }

  /**
   * Shows the sum of all ephemeral infrastructure hosts on Heroku over all hours in the current
   * date for the given org.
   *
   * @return ephInfraHostHerokuSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EPH_INFRA_HOST_HEROKU_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getEphInfraHostHerokuSum() {
    return ephInfraHostHerokuSum;
  }

  public void setEphInfraHostHerokuSum(Long ephInfraHostHerokuSum) {
    this.ephInfraHostHerokuSum = ephInfraHostHerokuSum;
  }

  public UsageSummaryDateOrg ephInfraHostOnlyAasSum(Long ephInfraHostOnlyAasSum) {
    this.ephInfraHostOnlyAasSum = ephInfraHostOnlyAasSum;
    return this;
  }

  /**
   * Shows the sum of all ephemeral infrastructure hosts with only Azure App Services over all hours
   * in the current date for the given org.
   *
   * @return ephInfraHostOnlyAasSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EPH_INFRA_HOST_ONLY_AAS_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getEphInfraHostOnlyAasSum() {
    return ephInfraHostOnlyAasSum;
  }

  public void setEphInfraHostOnlyAasSum(Long ephInfraHostOnlyAasSum) {
    this.ephInfraHostOnlyAasSum = ephInfraHostOnlyAasSum;
  }

  public UsageSummaryDateOrg ephInfraHostOnlyVsphereSum(Long ephInfraHostOnlyVsphereSum) {
    this.ephInfraHostOnlyVsphereSum = ephInfraHostOnlyVsphereSum;
    return this;
  }

  /**
   * Shows the sum of all ephemeral infrastructure hosts with only vSphere over all hours in the
   * current date for the given org.
   *
   * @return ephInfraHostOnlyVsphereSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EPH_INFRA_HOST_ONLY_VSPHERE_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getEphInfraHostOnlyVsphereSum() {
    return ephInfraHostOnlyVsphereSum;
  }

  public void setEphInfraHostOnlyVsphereSum(Long ephInfraHostOnlyVsphereSum) {
    this.ephInfraHostOnlyVsphereSum = ephInfraHostOnlyVsphereSum;
  }

  public UsageSummaryDateOrg ephInfraHostOpentelemetryApmSum(Long ephInfraHostOpentelemetryApmSum) {
    this.ephInfraHostOpentelemetryApmSum = ephInfraHostOpentelemetryApmSum;
    return this;
  }

  /**
   * Shows the sum of all ephemeral APM hosts reported by the Datadog exporter for the OpenTelemetry
   * Collector over all hours in the current date for the given org.
   *
   * @return ephInfraHostOpentelemetryApmSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EPH_INFRA_HOST_OPENTELEMETRY_APM_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getEphInfraHostOpentelemetryApmSum() {
    return ephInfraHostOpentelemetryApmSum;
  }

  public void setEphInfraHostOpentelemetryApmSum(Long ephInfraHostOpentelemetryApmSum) {
    this.ephInfraHostOpentelemetryApmSum = ephInfraHostOpentelemetryApmSum;
  }

  public UsageSummaryDateOrg ephInfraHostOpentelemetrySum(Long ephInfraHostOpentelemetrySum) {
    this.ephInfraHostOpentelemetrySum = ephInfraHostOpentelemetrySum;
    return this;
  }

  /**
   * Shows the sum of all ephemeral hosts reported by the Datadog exporter for the OpenTelemetry
   * Collector over all hours in the current date for the given org.
   *
   * @return ephInfraHostOpentelemetrySum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EPH_INFRA_HOST_OPENTELEMETRY_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getEphInfraHostOpentelemetrySum() {
    return ephInfraHostOpentelemetrySum;
  }

  public void setEphInfraHostOpentelemetrySum(Long ephInfraHostOpentelemetrySum) {
    this.ephInfraHostOpentelemetrySum = ephInfraHostOpentelemetrySum;
  }

  public UsageSummaryDateOrg ephInfraHostProSum(Long ephInfraHostProSum) {
    this.ephInfraHostProSum = ephInfraHostProSum;
    return this;
  }

  /**
   * Shows the sum of all ephemeral infrastructure hosts for Pro over all hours in the current date
   * for the given org.
   *
   * @return ephInfraHostProSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EPH_INFRA_HOST_PRO_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getEphInfraHostProSum() {
    return ephInfraHostProSum;
  }

  public void setEphInfraHostProSum(Long ephInfraHostProSum) {
    this.ephInfraHostProSum = ephInfraHostProSum;
  }

  public UsageSummaryDateOrg ephInfraHostProplusSum(Long ephInfraHostProplusSum) {
    this.ephInfraHostProplusSum = ephInfraHostProplusSum;
    return this;
  }

  /**
   * Shows the sum of all ephemeral infrastructure hosts for Pro Plus over all hours in the current
   * date for the given org.
   *
   * @return ephInfraHostProplusSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EPH_INFRA_HOST_PROPLUS_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getEphInfraHostProplusSum() {
    return ephInfraHostProplusSum;
  }

  public void setEphInfraHostProplusSum(Long ephInfraHostProplusSum) {
    this.ephInfraHostProplusSum = ephInfraHostProplusSum;
  }

  public UsageSummaryDateOrg ephInfraHostProxmoxSum(Long ephInfraHostProxmoxSum) {
    this.ephInfraHostProxmoxSum = ephInfraHostProxmoxSum;
    return this;
  }

  /**
   * Sum of all ephemeral infrastructure hosts for Proxmox over all hours in the current date for
   * the given organization.
   *
   * @return ephInfraHostProxmoxSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EPH_INFRA_HOST_PROXMOX_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getEphInfraHostProxmoxSum() {
    return ephInfraHostProxmoxSum;
  }

  public void setEphInfraHostProxmoxSum(Long ephInfraHostProxmoxSum) {
    this.ephInfraHostProxmoxSum = ephInfraHostProxmoxSum;
  }

  public UsageSummaryDateOrg errorTrackingApmErrorEventsSum(Long errorTrackingApmErrorEventsSum) {
    this.errorTrackingApmErrorEventsSum = errorTrackingApmErrorEventsSum;
    return this;
  }

  /**
   * Shows the sum of all Error Tracking APM error events over all hours in the current date for the
   * given org.
   *
   * @return errorTrackingApmErrorEventsSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ERROR_TRACKING_APM_ERROR_EVENTS_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getErrorTrackingApmErrorEventsSum() {
    return errorTrackingApmErrorEventsSum;
  }

  public void setErrorTrackingApmErrorEventsSum(Long errorTrackingApmErrorEventsSum) {
    this.errorTrackingApmErrorEventsSum = errorTrackingApmErrorEventsSum;
  }

  public UsageSummaryDateOrg errorTrackingErrorEventsSum(Long errorTrackingErrorEventsSum) {
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

  public UsageSummaryDateOrg errorTrackingEventsSum(Long errorTrackingEventsSum) {
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

  public UsageSummaryDateOrg errorTrackingRumErrorEventsSum(Long errorTrackingRumErrorEventsSum) {
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

  public UsageSummaryDateOrg eventManagementCorrelationCorrelatedEventsSum(
      Long eventManagementCorrelationCorrelatedEventsSum) {
    this.eventManagementCorrelationCorrelatedEventsSum =
        eventManagementCorrelationCorrelatedEventsSum;
    return this;
  }

  /**
   * Shows the sum of all Event Management correlated events over all hours in the current date for
   * the given org.
   *
   * @return eventManagementCorrelationCorrelatedEventsSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EVENT_MANAGEMENT_CORRELATION_CORRELATED_EVENTS_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getEventManagementCorrelationCorrelatedEventsSum() {
    return eventManagementCorrelationCorrelatedEventsSum;
  }

  public void setEventManagementCorrelationCorrelatedEventsSum(
      Long eventManagementCorrelationCorrelatedEventsSum) {
    this.eventManagementCorrelationCorrelatedEventsSum =
        eventManagementCorrelationCorrelatedEventsSum;
  }

  public UsageSummaryDateOrg eventManagementCorrelationCorrelatedRelatedEventsSum(
      Long eventManagementCorrelationCorrelatedRelatedEventsSum) {
    this.eventManagementCorrelationCorrelatedRelatedEventsSum =
        eventManagementCorrelationCorrelatedRelatedEventsSum;
    return this;
  }

  /**
   * Shows the sum of all Event Management correlated related events over all hours in the current
   * date for the given org.
   *
   * @return eventManagementCorrelationCorrelatedRelatedEventsSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EVENT_MANAGEMENT_CORRELATION_CORRELATED_RELATED_EVENTS_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getEventManagementCorrelationCorrelatedRelatedEventsSum() {
    return eventManagementCorrelationCorrelatedRelatedEventsSum;
  }

  public void setEventManagementCorrelationCorrelatedRelatedEventsSum(
      Long eventManagementCorrelationCorrelatedRelatedEventsSum) {
    this.eventManagementCorrelationCorrelatedRelatedEventsSum =
        eventManagementCorrelationCorrelatedRelatedEventsSum;
  }

  public UsageSummaryDateOrg eventManagementCorrelationSum(Long eventManagementCorrelationSum) {
    this.eventManagementCorrelationSum = eventManagementCorrelationSum;
    return this;
  }

  /**
   * Shows the sum of all Event Management correlations over all hours in the current date for the
   * given org.
   *
   * @return eventManagementCorrelationSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EVENT_MANAGEMENT_CORRELATION_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getEventManagementCorrelationSum() {
    return eventManagementCorrelationSum;
  }

  public void setEventManagementCorrelationSum(Long eventManagementCorrelationSum) {
    this.eventManagementCorrelationSum = eventManagementCorrelationSum;
  }

  public UsageSummaryDateOrg fargateContainerProfilerProfilingFargateAvg(
      Long fargateContainerProfilerProfilingFargateAvg) {
    this.fargateContainerProfilerProfilingFargateAvg = fargateContainerProfilerProfilingFargateAvg;
    return this;
  }

  /**
   * The average number of Profiling Fargate tasks over all hours in the current month for the given
   * org.
   *
   * @return fargateContainerProfilerProfilingFargateAvg
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FARGATE_CONTAINER_PROFILER_PROFILING_FARGATE_AVG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getFargateContainerProfilerProfilingFargateAvg() {
    return fargateContainerProfilerProfilingFargateAvg;
  }

  public void setFargateContainerProfilerProfilingFargateAvg(
      Long fargateContainerProfilerProfilingFargateAvg) {
    this.fargateContainerProfilerProfilingFargateAvg = fargateContainerProfilerProfilingFargateAvg;
  }

  public UsageSummaryDateOrg fargateContainerProfilerProfilingFargateEksAvg(
      Long fargateContainerProfilerProfilingFargateEksAvg) {
    this.fargateContainerProfilerProfilingFargateEksAvg =
        fargateContainerProfilerProfilingFargateEksAvg;
    return this;
  }

  /**
   * The average number of Profiling Fargate Elastic Kubernetes Service tasks over all hours in the
   * current month for the given org.
   *
   * @return fargateContainerProfilerProfilingFargateEksAvg
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FARGATE_CONTAINER_PROFILER_PROFILING_FARGATE_EKS_AVG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getFargateContainerProfilerProfilingFargateEksAvg() {
    return fargateContainerProfilerProfilingFargateEksAvg;
  }

  public void setFargateContainerProfilerProfilingFargateEksAvg(
      Long fargateContainerProfilerProfilingFargateEksAvg) {
    this.fargateContainerProfilerProfilingFargateEksAvg =
        fargateContainerProfilerProfilingFargateEksAvg;
  }

  public UsageSummaryDateOrg fargateTasksCountAvg(Long fargateTasksCountAvg) {
    this.fargateTasksCountAvg = fargateTasksCountAvg;
    return this;
  }

  /**
   * The average task count for Fargate.
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

  public UsageSummaryDateOrg fargateTasksCountHwm(Long fargateTasksCountHwm) {
    this.fargateTasksCountHwm = fargateTasksCountHwm;
    return this;
  }

  /**
   * Shows the high-water mark of all Fargate tasks over all hours in the current date for the given
   * org.
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

  public UsageSummaryDateOrg flexLogsComputeLargeAvg(Long flexLogsComputeLargeAvg) {
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

  public UsageSummaryDateOrg flexLogsComputeMediumAvg(Long flexLogsComputeMediumAvg) {
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

  public UsageSummaryDateOrg flexLogsComputeSmallAvg(Long flexLogsComputeSmallAvg) {
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

  public UsageSummaryDateOrg flexLogsComputeXlargeAvg(Long flexLogsComputeXlargeAvg) {
    this.flexLogsComputeXlargeAvg = flexLogsComputeXlargeAvg;
    return this;
  }

  /**
   * Shows the average number of Flex Logs Compute Extra Large Instances over all hours in the
   * current date for the given org.
   *
   * @return flexLogsComputeXlargeAvg
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FLEX_LOGS_COMPUTE_XLARGE_AVG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getFlexLogsComputeXlargeAvg() {
    return flexLogsComputeXlargeAvg;
  }

  public void setFlexLogsComputeXlargeAvg(Long flexLogsComputeXlargeAvg) {
    this.flexLogsComputeXlargeAvg = flexLogsComputeXlargeAvg;
  }

  public UsageSummaryDateOrg flexLogsComputeXsmallAvg(Long flexLogsComputeXsmallAvg) {
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

  public UsageSummaryDateOrg flexLogsStarterAvg(Long flexLogsStarterAvg) {
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

  public UsageSummaryDateOrg flexLogsStarterStorageIndexAvg(Long flexLogsStarterStorageIndexAvg) {
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

  public UsageSummaryDateOrg flexLogsStarterStorageRetentionAdjustmentAvg(
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

  public UsageSummaryDateOrg flexStoredLogsAvg(Long flexStoredLogsAvg) {
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

  public UsageSummaryDateOrg forwardingEventsBytesSum(Long forwardingEventsBytesSum) {
    this.forwardingEventsBytesSum = forwardingEventsBytesSum;
    return this;
  }

  /**
   * Shows the sum of all log bytes forwarded over all hours in the current date for the given org.
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

  public UsageSummaryDateOrg gcpHostTop99p(Long gcpHostTop99p) {
    this.gcpHostTop99p = gcpHostTop99p;
    return this;
  }

  /**
   * Shows the 99th percentile of all GCP hosts over all hours in the current date for the given
   * org.
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

  public UsageSummaryDateOrg herokuHostTop99p(Long herokuHostTop99p) {
    this.herokuHostTop99p = herokuHostTop99p;
    return this;
  }

  /**
   * Shows the 99th percentile of all Heroku dynos over all hours in the current date for the given
   * org.
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
    this.incidentManagementMonthlyActiveUsersHwm = incidentManagementMonthlyActiveUsersHwm;
    return this;
  }

  /**
   * Shows the high-water mark of Incident Management monthly active users over all hours in the
   * current date for the given org.
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

  public UsageSummaryDateOrg incidentManagementSeatsHwm(Long incidentManagementSeatsHwm) {
    this.incidentManagementSeatsHwm = incidentManagementSeatsHwm;
    return this;
  }

  /**
   * Shows the high-water mark of Incident Management seats over all hours on the current date for
   * the given organization.
   *
   * @return incidentManagementSeatsHwm
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INCIDENT_MANAGEMENT_SEATS_HWM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getIncidentManagementSeatsHwm() {
    return incidentManagementSeatsHwm;
  }

  public void setIncidentManagementSeatsHwm(Long incidentManagementSeatsHwm) {
    this.incidentManagementSeatsHwm = incidentManagementSeatsHwm;
  }

  public UsageSummaryDateOrg indexedEventsCountSum(Long indexedEventsCountSum) {
    this.indexedEventsCountSum = indexedEventsCountSum;
    return this;
  }

  /**
   * Shows the sum of all log events indexed over all hours in the current date for the given org
   * (To be deprecated on October 1st, 2024).
   *
   * @return indexedEventsCountSum
   * @deprecated
   */
  @Deprecated
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INDEXED_EVENTS_COUNT_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getIndexedEventsCountSum() {
    return indexedEventsCountSum;
  }

  @Deprecated
  public void setIndexedEventsCountSum(Long indexedEventsCountSum) {
    this.indexedEventsCountSum = indexedEventsCountSum;
  }

  public UsageSummaryDateOrg infraHostTop99p(Long infraHostTop99p) {
    this.infraHostTop99p = infraHostTop99p;
    return this;
  }

  /**
   * Shows the 99th percentile of all distinct infrastructure hosts over all hours in the current
   * date for the given org.
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

  public UsageSummaryDateOrg ingestedEventsBytesSum(Long ingestedEventsBytesSum) {
    this.ingestedEventsBytesSum = ingestedEventsBytesSum;
    return this;
  }

  /**
   * Shows the sum of all log bytes ingested over all hours in the current date for the given org.
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

  public UsageSummaryDateOrg iotDeviceAggSum(Long iotDeviceAggSum) {
    this.iotDeviceAggSum = iotDeviceAggSum;
    return this;
  }

  /**
   * Shows the sum of all IoT devices over all hours in the current date for the given org.
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

  public UsageSummaryDateOrg iotDeviceTop99pSum(Long iotDeviceTop99pSum) {
    this.iotDeviceTop99pSum = iotDeviceTop99pSum;
    return this;
  }

  /**
   * Shows the 99th percentile of all IoT devices over all hours in the current date for the given
   * org.
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

  public UsageSummaryDateOrg llmObservabilityMinSpendSum(Long llmObservabilityMinSpendSum) {
    this.llmObservabilityMinSpendSum = llmObservabilityMinSpendSum;
    return this;
  }

  /**
   * Shows the sum of all LLM Observability minimum spend over all hours in the current date for the
   * given org.
   *
   * @return llmObservabilityMinSpendSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LLM_OBSERVABILITY_MIN_SPEND_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getLlmObservabilityMinSpendSum() {
    return llmObservabilityMinSpendSum;
  }

  public void setLlmObservabilityMinSpendSum(Long llmObservabilityMinSpendSum) {
    this.llmObservabilityMinSpendSum = llmObservabilityMinSpendSum;
  }

  public UsageSummaryDateOrg llmObservabilitySum(Long llmObservabilitySum) {
    this.llmObservabilitySum = llmObservabilitySum;
    return this;
  }

  /**
   * Shows the sum of all LLM observability sessions over all hours in the current date for the
   * given org.
   *
   * @return llmObservabilitySum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LLM_OBSERVABILITY_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getLlmObservabilitySum() {
    return llmObservabilitySum;
  }

  public void setLlmObservabilitySum(Long llmObservabilitySum) {
    this.llmObservabilitySum = llmObservabilitySum;
  }

  public UsageSummaryDateOrg mobileRumLiteSessionCountSum(Long mobileRumLiteSessionCountSum) {
    this.mobileRumLiteSessionCountSum = mobileRumLiteSessionCountSum;
    return this;
  }

  /**
   * Shows the sum of all mobile lite sessions over all hours in the current date for the given org
   * (To be deprecated on October 1st, 2024).
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

  public UsageSummaryDateOrg mobileRumSessionCountAndroidSum(Long mobileRumSessionCountAndroidSum) {
    this.mobileRumSessionCountAndroidSum = mobileRumSessionCountAndroidSum;
    return this;
  }

  /**
   * Shows the sum of all mobile RUM sessions on Android over all hours in the current date for the
   * given org (To be deprecated on October 1st, 2024).
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

  public UsageSummaryDateOrg mobileRumSessionCountFlutterSum(Long mobileRumSessionCountFlutterSum) {
    this.mobileRumSessionCountFlutterSum = mobileRumSessionCountFlutterSum;
    return this;
  }

  /**
   * Shows the sum of all mobile RUM sessions on Flutter over all hours in the current date for the
   * given org (To be deprecated on October 1st, 2024).
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

  public UsageSummaryDateOrg mobileRumSessionCountIosSum(Long mobileRumSessionCountIosSum) {
    this.mobileRumSessionCountIosSum = mobileRumSessionCountIosSum;
    return this;
  }

  /**
   * Shows the sum of all mobile RUM sessions on iOS over all hours in the current date for the
   * given org (To be deprecated on October 1st, 2024).
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

  public UsageSummaryDateOrg mobileRumSessionCountReactnativeSum(
      Long mobileRumSessionCountReactnativeSum) {
    this.mobileRumSessionCountReactnativeSum = mobileRumSessionCountReactnativeSum;
    return this;
  }

  /**
   * Shows the sum of all mobile RUM sessions on React Native over all hours in the current date for
   * the given org (To be deprecated on October 1st, 2024).
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

  public UsageSummaryDateOrg mobileRumSessionCountRokuSum(Long mobileRumSessionCountRokuSum) {
    this.mobileRumSessionCountRokuSum = mobileRumSessionCountRokuSum;
    return this;
  }

  /**
   * Shows the sum of all mobile RUM sessions on Roku over all hours in the current date for the
   * given org (To be deprecated on October 1st, 2024).
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

  public UsageSummaryDateOrg mobileRumSessionCountSum(Long mobileRumSessionCountSum) {
    this.mobileRumSessionCountSum = mobileRumSessionCountSum;
    return this;
  }

  /**
   * Shows the sum of all mobile RUM sessions over all hours in the current date for the given org
   * (To be deprecated on October 1st, 2024).
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

  public UsageSummaryDateOrg mobileRumUnitsSum(Long mobileRumUnitsSum) {
    this.mobileRumUnitsSum = mobileRumUnitsSum;
    return this;
  }

  /**
   * Shows the sum of all mobile RUM units over all hours in the current date for the given org (To
   * be deprecated on October 1st, 2024).
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

  public UsageSummaryDateOrg ndmNetflowEventsSum(Long ndmNetflowEventsSum) {
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

  public UsageSummaryDateOrg netflowIndexedEventsCountSum(Long netflowIndexedEventsCountSum) {
    this.netflowIndexedEventsCountSum = netflowIndexedEventsCountSum;
    return this;
  }

  /**
   * Shows the sum of all Network flows indexed over all hours in the current date for the given org
   * (To be deprecated on October 1st, 2024).
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

  public UsageSummaryDateOrg networkDeviceWirelessTop99p(Long networkDeviceWirelessTop99p) {
    this.networkDeviceWirelessTop99p = networkDeviceWirelessTop99p;
    return this;
  }

  /**
   * Shows the 99th percentile of all Network Device Monitoring wireless devices over all hours in
   * the current date for the given org.
   *
   * @return networkDeviceWirelessTop99p
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NETWORK_DEVICE_WIRELESS_TOP99P)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getNetworkDeviceWirelessTop99p() {
    return networkDeviceWirelessTop99p;
  }

  public void setNetworkDeviceWirelessTop99p(Long networkDeviceWirelessTop99p) {
    this.networkDeviceWirelessTop99p = networkDeviceWirelessTop99p;
  }

  public UsageSummaryDateOrg npmHostTop99p(Long npmHostTop99p) {
    this.npmHostTop99p = npmHostTop99p;
    return this;
  }

  /**
   * Shows the 99th percentile of all distinct Cloud Network Monitoring hosts (formerly known as
   * Network hosts) over all hours in the current date for the given org.
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

  public UsageSummaryDateOrg observabilityPipelinesBytesProcessedSum(
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

  public UsageSummaryDateOrg ociHostSum(Long ociHostSum) {
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

  public UsageSummaryDateOrg ociHostTop99p(Long ociHostTop99p) {
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

  public UsageSummaryDateOrg onCallSeatHwm(Long onCallSeatHwm) {
    this.onCallSeatHwm = onCallSeatHwm;
    return this;
  }

  /**
   * Shows the high-water mark of On-Call seats over all hours in the current date for the given
   * org.
   *
   * @return onCallSeatHwm
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ON_CALL_SEAT_HWM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getOnCallSeatHwm() {
    return onCallSeatHwm;
  }

  public void setOnCallSeatHwm(Long onCallSeatHwm) {
    this.onCallSeatHwm = onCallSeatHwm;
  }

  public UsageSummaryDateOrg onlineArchiveEventsCountSum(Long onlineArchiveEventsCountSum) {
    this.onlineArchiveEventsCountSum = onlineArchiveEventsCountSum;
    return this;
  }

  /**
   * Sum of all online archived events over all hours in the current date for the given org.
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

  public UsageSummaryDateOrg opentelemetryApmHostTop99p(Long opentelemetryApmHostTop99p) {
    this.opentelemetryApmHostTop99p = opentelemetryApmHostTop99p;
    return this;
  }

  /**
   * Shows the 99th percentile of APM hosts reported by the Datadog exporter for the OpenTelemetry
   * Collector over all hours in the current date for the given org.
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

  public UsageSummaryDateOrg opentelemetryHostTop99p(Long opentelemetryHostTop99p) {
    this.opentelemetryHostTop99p = opentelemetryHostTop99p;
    return this;
  }

  /**
   * Shows the 99th percentile of all hosts reported by the Datadog exporter for the OpenTelemetry
   * Collector over all hours in the current date for the given org.
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

  public UsageSummaryDateOrg productAnalyticsSum(Long productAnalyticsSum) {
    this.productAnalyticsSum = productAnalyticsSum;
    return this;
  }

  /**
   * Shows the sum of all product analytics sessions over all hours in the current date for the
   * given org.
   *
   * @return productAnalyticsSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRODUCT_ANALYTICS_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getProductAnalyticsSum() {
    return productAnalyticsSum;
  }

  public void setProductAnalyticsSum(Long productAnalyticsSum) {
    this.productAnalyticsSum = productAnalyticsSum;
  }

  public UsageSummaryDateOrg profilingAasCountTop99p(Long profilingAasCountTop99p) {
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

  public UsageSummaryDateOrg profilingHostTop99p(Long profilingHostTop99p) {
    this.profilingHostTop99p = profilingHostTop99p;
    return this;
  }

  /**
   * Shows the 99th percentile of all profiled hosts over all hours within the current date for the
   * given org.
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

  public UsageSummaryDateOrg proxmoxHostSum(Long proxmoxHostSum) {
    this.proxmoxHostSum = proxmoxHostSum;
    return this;
  }

  /**
   * Sum of all Proxmox hosts over all hours in the current date for the given organization.
   *
   * @return proxmoxHostSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROXMOX_HOST_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getProxmoxHostSum() {
    return proxmoxHostSum;
  }

  public void setProxmoxHostSum(Long proxmoxHostSum) {
    this.proxmoxHostSum = proxmoxHostSum;
  }

  public UsageSummaryDateOrg proxmoxHostTop99p(Long proxmoxHostTop99p) {
    this.proxmoxHostTop99p = proxmoxHostTop99p;
    return this;
  }

  /**
   * 99th percentile of all Proxmox hosts over all hours in the current date for the given
   * organization.
   *
   * @return proxmoxHostTop99p
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROXMOX_HOST_TOP99P)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getProxmoxHostTop99p() {
    return proxmoxHostTop99p;
  }

  public void setProxmoxHostTop99p(Long proxmoxHostTop99p) {
    this.proxmoxHostTop99p = proxmoxHostTop99p;
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

  public UsageSummaryDateOrg publishedAppHwm(Long publishedAppHwm) {
    this.publishedAppHwm = publishedAppHwm;
    return this;
  }

  /**
   * Shows the high-water mark of all published applications over all hours in the current date for
   * the given org.
   *
   * @return publishedAppHwm
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PUBLISHED_APP_HWM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getPublishedAppHwm() {
    return publishedAppHwm;
  }

  public void setPublishedAppHwm(Long publishedAppHwm) {
    this.publishedAppHwm = publishedAppHwm;
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
    this.rumBrowserAndMobileSessionCount = rumBrowserAndMobileSessionCount;
    return this;
  }

  /**
   * Shows the sum of all mobile sessions and all browser lite and legacy sessions over all hours in
   * the current date for the given org (To be deprecated on October 1st, 2024).
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

  public UsageSummaryDateOrg rumBrowserLegacySessionCountSum(Long rumBrowserLegacySessionCountSum) {
    this.rumBrowserLegacySessionCountSum = rumBrowserLegacySessionCountSum;
    return this;
  }

  /**
   * Shows the sum of all browser RUM legacy sessions over all hours in the current date for the
   * given org (To be introduced on October 1st, 2024).
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

  public UsageSummaryDateOrg rumBrowserLiteSessionCountSum(Long rumBrowserLiteSessionCountSum) {
    this.rumBrowserLiteSessionCountSum = rumBrowserLiteSessionCountSum;
    return this;
  }

  /**
   * Shows the sum of all browser RUM lite sessions over all hours in the current date for the given
   * org (To be introduced on October 1st, 2024).
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

  public UsageSummaryDateOrg rumBrowserReplaySessionCountSum(Long rumBrowserReplaySessionCountSum) {
    this.rumBrowserReplaySessionCountSum = rumBrowserReplaySessionCountSum;
    return this;
  }

  /**
   * Shows the sum of all browser RUM Session Replay counts over all hours in the current date for
   * the given org (To be introduced on October 1st, 2024).
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

  public UsageSummaryDateOrg rumIndexedSessionsSum(Long rumIndexedSessionsSum) {
    this.rumIndexedSessionsSum = rumIndexedSessionsSum;
    return this;
  }

  /**
   * Shows the sum of all RUM indexed sessions over all hours in the current date for the given org.
   *
   * @return rumIndexedSessionsSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RUM_INDEXED_SESSIONS_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getRumIndexedSessionsSum() {
    return rumIndexedSessionsSum;
  }

  public void setRumIndexedSessionsSum(Long rumIndexedSessionsSum) {
    this.rumIndexedSessionsSum = rumIndexedSessionsSum;
  }

  public UsageSummaryDateOrg rumIngestedSessionsSum(Long rumIngestedSessionsSum) {
    this.rumIngestedSessionsSum = rumIngestedSessionsSum;
    return this;
  }

  /**
   * Shows the sum of all RUM ingested sessions over all hours in the current date for the given
   * org.
   *
   * @return rumIngestedSessionsSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RUM_INGESTED_SESSIONS_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getRumIngestedSessionsSum() {
    return rumIngestedSessionsSum;
  }

  public void setRumIngestedSessionsSum(Long rumIngestedSessionsSum) {
    this.rumIngestedSessionsSum = rumIngestedSessionsSum;
  }

  public UsageSummaryDateOrg rumLiteSessionCountSum(Long rumLiteSessionCountSum) {
    this.rumLiteSessionCountSum = rumLiteSessionCountSum;
    return this;
  }

  /**
   * Shows the sum of all RUM lite sessions (browser and mobile) over all hours in the current date
   * for the given org (To be introduced on October 1st, 2024).
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

  public UsageSummaryDateOrg rumMobileLegacySessionCountAndroidSum(
      Long rumMobileLegacySessionCountAndroidSum) {
    this.rumMobileLegacySessionCountAndroidSum = rumMobileLegacySessionCountAndroidSum;
    return this;
  }

  /**
   * Shows the sum of all mobile RUM legacy sessions on Android over all hours in the current date
   * for the given org (To be introduced on October 1st, 2024).
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

  public UsageSummaryDateOrg rumMobileLegacySessionCountFlutterSum(
      Long rumMobileLegacySessionCountFlutterSum) {
    this.rumMobileLegacySessionCountFlutterSum = rumMobileLegacySessionCountFlutterSum;
    return this;
  }

  /**
   * Shows the sum of all mobile RUM legacy sessions on Flutter over all hours in the current date
   * for the given org (To be introduced on October 1st, 2024).
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

  public UsageSummaryDateOrg rumMobileLegacySessionCountIosSum(
      Long rumMobileLegacySessionCountIosSum) {
    this.rumMobileLegacySessionCountIosSum = rumMobileLegacySessionCountIosSum;
    return this;
  }

  /**
   * Shows the sum of all mobile RUM legacy sessions on iOS over all hours in the current date for
   * the given org (To be introduced on October 1st, 2024).
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

  public UsageSummaryDateOrg rumMobileLegacySessionCountReactnativeSum(
      Long rumMobileLegacySessionCountReactnativeSum) {
    this.rumMobileLegacySessionCountReactnativeSum = rumMobileLegacySessionCountReactnativeSum;
    return this;
  }

  /**
   * Shows the sum of all mobile RUM legacy sessions on React Native over all hours in the current
   * date for the given org (To be introduced on October 1st, 2024).
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

  public UsageSummaryDateOrg rumMobileLegacySessionCountRokuSum(
      Long rumMobileLegacySessionCountRokuSum) {
    this.rumMobileLegacySessionCountRokuSum = rumMobileLegacySessionCountRokuSum;
    return this;
  }

  /**
   * Shows the sum of all mobile RUM legacy sessions on Roku over all hours in the current date for
   * the given org (To be introduced on October 1st, 2024).
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

  public UsageSummaryDateOrg rumMobileLiteSessionCountAndroidSum(
      Long rumMobileLiteSessionCountAndroidSum) {
    this.rumMobileLiteSessionCountAndroidSum = rumMobileLiteSessionCountAndroidSum;
    return this;
  }

  /**
   * Shows the sum of all mobile RUM lite sessions on Android over all hours in the current date for
   * the given org (To be introduced on October 1st, 2024).
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

  public UsageSummaryDateOrg rumMobileLiteSessionCountFlutterSum(
      Long rumMobileLiteSessionCountFlutterSum) {
    this.rumMobileLiteSessionCountFlutterSum = rumMobileLiteSessionCountFlutterSum;
    return this;
  }

  /**
   * Shows the sum of all mobile RUM lite sessions on Flutter over all hours in the current date for
   * the given org (To be introduced on October 1st, 2024).
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

  public UsageSummaryDateOrg rumMobileLiteSessionCountIosSum(Long rumMobileLiteSessionCountIosSum) {
    this.rumMobileLiteSessionCountIosSum = rumMobileLiteSessionCountIosSum;
    return this;
  }

  /**
   * Shows the sum of all mobile RUM lite sessions on iOS over all hours in the current date for the
   * given org (To be introduced on October 1st, 2024).
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

  public UsageSummaryDateOrg rumMobileLiteSessionCountKotlinmultiplatformSum(
      Long rumMobileLiteSessionCountKotlinmultiplatformSum) {
    this.rumMobileLiteSessionCountKotlinmultiplatformSum =
        rumMobileLiteSessionCountKotlinmultiplatformSum;
    return this;
  }

  /**
   * Shows the sum of all mobile RUM lite sessions on Kotlin Multiplatform over all hours within the
   * current date for the given org.
   *
   * @return rumMobileLiteSessionCountKotlinmultiplatformSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RUM_MOBILE_LITE_SESSION_COUNT_KOTLINMULTIPLATFORM_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getRumMobileLiteSessionCountKotlinmultiplatformSum() {
    return rumMobileLiteSessionCountKotlinmultiplatformSum;
  }

  public void setRumMobileLiteSessionCountKotlinmultiplatformSum(
      Long rumMobileLiteSessionCountKotlinmultiplatformSum) {
    this.rumMobileLiteSessionCountKotlinmultiplatformSum =
        rumMobileLiteSessionCountKotlinmultiplatformSum;
  }

  public UsageSummaryDateOrg rumMobileLiteSessionCountReactnativeSum(
      Long rumMobileLiteSessionCountReactnativeSum) {
    this.rumMobileLiteSessionCountReactnativeSum = rumMobileLiteSessionCountReactnativeSum;
    return this;
  }

  /**
   * Shows the sum of all mobile RUM lite sessions on React Native over all hours in the current
   * date for the given org (To be introduced on October 1st, 2024).
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

  public UsageSummaryDateOrg rumMobileLiteSessionCountRokuSum(
      Long rumMobileLiteSessionCountRokuSum) {
    this.rumMobileLiteSessionCountRokuSum = rumMobileLiteSessionCountRokuSum;
    return this;
  }

  /**
   * Shows the sum of all mobile RUM lite sessions on Roku over all hours in the current date for
   * the given org (To be introduced on October 1st, 2024).
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

  public UsageSummaryDateOrg rumMobileLiteSessionCountUnitySum(
      Long rumMobileLiteSessionCountUnitySum) {
    this.rumMobileLiteSessionCountUnitySum = rumMobileLiteSessionCountUnitySum;
    return this;
  }

  /**
   * Shows the sum of all mobile RUM lite sessions on Unity over all hours within the current date
   * for the given org.
   *
   * @return rumMobileLiteSessionCountUnitySum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RUM_MOBILE_LITE_SESSION_COUNT_UNITY_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getRumMobileLiteSessionCountUnitySum() {
    return rumMobileLiteSessionCountUnitySum;
  }

  public void setRumMobileLiteSessionCountUnitySum(Long rumMobileLiteSessionCountUnitySum) {
    this.rumMobileLiteSessionCountUnitySum = rumMobileLiteSessionCountUnitySum;
  }

  public UsageSummaryDateOrg rumMobileReplaySessionCountAndroidSum(
      Long rumMobileReplaySessionCountAndroidSum) {
    this.rumMobileReplaySessionCountAndroidSum = rumMobileReplaySessionCountAndroidSum;
    return this;
  }

  /**
   * Shows the sum of all mobile RUM replay sessions on Android over all hours within the current
   * date for the given org.
   *
   * @return rumMobileReplaySessionCountAndroidSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RUM_MOBILE_REPLAY_SESSION_COUNT_ANDROID_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getRumMobileReplaySessionCountAndroidSum() {
    return rumMobileReplaySessionCountAndroidSum;
  }

  public void setRumMobileReplaySessionCountAndroidSum(Long rumMobileReplaySessionCountAndroidSum) {
    this.rumMobileReplaySessionCountAndroidSum = rumMobileReplaySessionCountAndroidSum;
  }

  public UsageSummaryDateOrg rumMobileReplaySessionCountIosSum(
      Long rumMobileReplaySessionCountIosSum) {
    this.rumMobileReplaySessionCountIosSum = rumMobileReplaySessionCountIosSum;
    return this;
  }

  /**
   * Shows the sum of all mobile RUM replay sessions on iOS over all hours within the current date
   * for the given org.
   *
   * @return rumMobileReplaySessionCountIosSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RUM_MOBILE_REPLAY_SESSION_COUNT_IOS_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getRumMobileReplaySessionCountIosSum() {
    return rumMobileReplaySessionCountIosSum;
  }

  public void setRumMobileReplaySessionCountIosSum(Long rumMobileReplaySessionCountIosSum) {
    this.rumMobileReplaySessionCountIosSum = rumMobileReplaySessionCountIosSum;
  }

  public UsageSummaryDateOrg rumMobileReplaySessionCountKotlinmultiplatformSum(
      Long rumMobileReplaySessionCountKotlinmultiplatformSum) {
    this.rumMobileReplaySessionCountKotlinmultiplatformSum =
        rumMobileReplaySessionCountKotlinmultiplatformSum;
    return this;
  }

  /**
   * Shows the sum of all mobile RUM replay sessions on Kotlin Multiplatform over all hours within
   * the current date for the given org.
   *
   * @return rumMobileReplaySessionCountKotlinmultiplatformSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RUM_MOBILE_REPLAY_SESSION_COUNT_KOTLINMULTIPLATFORM_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getRumMobileReplaySessionCountKotlinmultiplatformSum() {
    return rumMobileReplaySessionCountKotlinmultiplatformSum;
  }

  public void setRumMobileReplaySessionCountKotlinmultiplatformSum(
      Long rumMobileReplaySessionCountKotlinmultiplatformSum) {
    this.rumMobileReplaySessionCountKotlinmultiplatformSum =
        rumMobileReplaySessionCountKotlinmultiplatformSum;
  }

  public UsageSummaryDateOrg rumMobileReplaySessionCountReactnativeSum(
      Long rumMobileReplaySessionCountReactnativeSum) {
    this.rumMobileReplaySessionCountReactnativeSum = rumMobileReplaySessionCountReactnativeSum;
    return this;
  }

  /**
   * Shows the sum of all mobile RUM replay sessions on React Native over all hours within the
   * current date for the given org.
   *
   * @return rumMobileReplaySessionCountReactnativeSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RUM_MOBILE_REPLAY_SESSION_COUNT_REACTNATIVE_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getRumMobileReplaySessionCountReactnativeSum() {
    return rumMobileReplaySessionCountReactnativeSum;
  }

  public void setRumMobileReplaySessionCountReactnativeSum(
      Long rumMobileReplaySessionCountReactnativeSum) {
    this.rumMobileReplaySessionCountReactnativeSum = rumMobileReplaySessionCountReactnativeSum;
  }

  public UsageSummaryDateOrg rumReplaySessionCountSum(Long rumReplaySessionCountSum) {
    this.rumReplaySessionCountSum = rumReplaySessionCountSum;
    return this;
  }

  /**
   * Shows the sum of all RUM Session Replay counts over all hours in the current date for the given
   * org (To be introduced on October 1st, 2024).
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

  public UsageSummaryDateOrg rumSessionCountSum(Long rumSessionCountSum) {
    this.rumSessionCountSum = rumSessionCountSum;
    return this;
  }

  /**
   * Shows the sum of all browser RUM lite sessions over all hours in the current date for the given
   * org (To be deprecated on October 1st, 2024).
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

  public UsageSummaryDateOrg rumSessionReplayAddOnSum(Long rumSessionReplayAddOnSum) {
    this.rumSessionReplayAddOnSum = rumSessionReplayAddOnSum;
    return this;
  }

  /**
   * Shows the sum of all RUM session replay add-on sessions over all hours in the current date for
   * the given org.
   *
   * @return rumSessionReplayAddOnSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RUM_SESSION_REPLAY_ADD_ON_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getRumSessionReplayAddOnSum() {
    return rumSessionReplayAddOnSum;
  }

  public void setRumSessionReplayAddOnSum(Long rumSessionReplayAddOnSum) {
    this.rumSessionReplayAddOnSum = rumSessionReplayAddOnSum;
  }

  public UsageSummaryDateOrg rumTotalSessionCountSum(Long rumTotalSessionCountSum) {
    this.rumTotalSessionCountSum = rumTotalSessionCountSum;
    return this;
  }

  /**
   * Shows the sum of RUM sessions (browser and mobile) over all hours in the current date for the
   * given org.
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

  public UsageSummaryDateOrg rumUnitsSum(Long rumUnitsSum) {
    this.rumUnitsSum = rumUnitsSum;
    return this;
  }

  /**
   * Shows the sum of all browser and mobile RUM units over all hours in the current date for the
   * given org (To be deprecated on October 1st, 2024).
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

  public UsageSummaryDateOrg scaFargateCountAvg(Long scaFargateCountAvg) {
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

  public UsageSummaryDateOrg scaFargateCountHwm(Long scaFargateCountHwm) {
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

  public UsageSummaryDateOrg sdsApmScannedBytesSum(Long sdsApmScannedBytesSum) {
    this.sdsApmScannedBytesSum = sdsApmScannedBytesSum;
    return this;
  }

  /**
   * Sum of all APM bytes scanned with sensitive data scanner over all hours in the current date for
   * the given org.
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

  public UsageSummaryDateOrg sdsEventsScannedBytesSum(Long sdsEventsScannedBytesSum) {
    this.sdsEventsScannedBytesSum = sdsEventsScannedBytesSum;
    return this;
  }

  /**
   * Sum of all event stream events bytes scanned with sensitive data scanner over all hours in the
   * current date for the given org.
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

  public UsageSummaryDateOrg sdsLogsScannedBytesSum(Long sdsLogsScannedBytesSum) {
    this.sdsLogsScannedBytesSum = sdsLogsScannedBytesSum;
    return this;
  }

  /**
   * Shows the sum of all bytes scanned of logs usage by the Sensitive Data Scanner over all hours
   * in the current month for the given org.
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

  public UsageSummaryDateOrg sdsRumScannedBytesSum(Long sdsRumScannedBytesSum) {
    this.sdsRumScannedBytesSum = sdsRumScannedBytesSum;
    return this;
  }

  /**
   * Sum of all RUM bytes scanned with sensitive data scanner over all hours in the current date for
   * the given org.
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

  public UsageSummaryDateOrg sdsTotalScannedBytesSum(Long sdsTotalScannedBytesSum) {
    this.sdsTotalScannedBytesSum = sdsTotalScannedBytesSum;
    return this;
  }

  /**
   * Shows the sum of all bytes scanned across all usage types by the Sensitive Data Scanner over
   * all hours in the current month for the given org.
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

  public UsageSummaryDateOrg serverlessAppsApmApmAzureAppserviceInstancesAvg(
      Long serverlessAppsApmApmAzureAppserviceInstancesAvg) {
    this.serverlessAppsApmApmAzureAppserviceInstancesAvg =
        serverlessAppsApmApmAzureAppserviceInstancesAvg;
    return this;
  }

  /**
   * Shows the average number of Serverless Apps with Application Performance Monitoring for Azure
   * App Service instances for the given date and given org.
   *
   * @return serverlessAppsApmApmAzureAppserviceInstancesAvg
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVERLESS_APPS_APM_APM_AZURE_APPSERVICE_INSTANCES_AVG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getServerlessAppsApmApmAzureAppserviceInstancesAvg() {
    return serverlessAppsApmApmAzureAppserviceInstancesAvg;
  }

  public void setServerlessAppsApmApmAzureAppserviceInstancesAvg(
      Long serverlessAppsApmApmAzureAppserviceInstancesAvg) {
    this.serverlessAppsApmApmAzureAppserviceInstancesAvg =
        serverlessAppsApmApmAzureAppserviceInstancesAvg;
  }

  public UsageSummaryDateOrg serverlessAppsApmApmAzureAzurefunctionInstancesAvg(
      Long serverlessAppsApmApmAzureAzurefunctionInstancesAvg) {
    this.serverlessAppsApmApmAzureAzurefunctionInstancesAvg =
        serverlessAppsApmApmAzureAzurefunctionInstancesAvg;
    return this;
  }

  /**
   * Shows the average number of Serverless Apps with Application Performance Monitoring for Azure
   * Function instances for the given date and given org.
   *
   * @return serverlessAppsApmApmAzureAzurefunctionInstancesAvg
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVERLESS_APPS_APM_APM_AZURE_AZUREFUNCTION_INSTANCES_AVG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getServerlessAppsApmApmAzureAzurefunctionInstancesAvg() {
    return serverlessAppsApmApmAzureAzurefunctionInstancesAvg;
  }

  public void setServerlessAppsApmApmAzureAzurefunctionInstancesAvg(
      Long serverlessAppsApmApmAzureAzurefunctionInstancesAvg) {
    this.serverlessAppsApmApmAzureAzurefunctionInstancesAvg =
        serverlessAppsApmApmAzureAzurefunctionInstancesAvg;
  }

  public UsageSummaryDateOrg serverlessAppsApmApmAzureContainerappInstancesAvg(
      Long serverlessAppsApmApmAzureContainerappInstancesAvg) {
    this.serverlessAppsApmApmAzureContainerappInstancesAvg =
        serverlessAppsApmApmAzureContainerappInstancesAvg;
    return this;
  }

  /**
   * Shows the average number of Serverless Apps with Application Performance Monitoring for Azure
   * Container App instances for the given date and given org.
   *
   * @return serverlessAppsApmApmAzureContainerappInstancesAvg
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVERLESS_APPS_APM_APM_AZURE_CONTAINERAPP_INSTANCES_AVG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getServerlessAppsApmApmAzureContainerappInstancesAvg() {
    return serverlessAppsApmApmAzureContainerappInstancesAvg;
  }

  public void setServerlessAppsApmApmAzureContainerappInstancesAvg(
      Long serverlessAppsApmApmAzureContainerappInstancesAvg) {
    this.serverlessAppsApmApmAzureContainerappInstancesAvg =
        serverlessAppsApmApmAzureContainerappInstancesAvg;
  }

  public UsageSummaryDateOrg serverlessAppsApmApmFargateEcsTasksAvg(
      Long serverlessAppsApmApmFargateEcsTasksAvg) {
    this.serverlessAppsApmApmFargateEcsTasksAvg = serverlessAppsApmApmFargateEcsTasksAvg;
    return this;
  }

  /**
   * Shows the average number of Serverless Apps with Application Performance Monitoring for Fargate
   * Elastic Container Service tasks for the given date and given org.
   *
   * @return serverlessAppsApmApmFargateEcsTasksAvg
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVERLESS_APPS_APM_APM_FARGATE_ECS_TASKS_AVG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getServerlessAppsApmApmFargateEcsTasksAvg() {
    return serverlessAppsApmApmFargateEcsTasksAvg;
  }

  public void setServerlessAppsApmApmFargateEcsTasksAvg(
      Long serverlessAppsApmApmFargateEcsTasksAvg) {
    this.serverlessAppsApmApmFargateEcsTasksAvg = serverlessAppsApmApmFargateEcsTasksAvg;
  }

  public UsageSummaryDateOrg serverlessAppsApmApmGcpCloudfunctionInstancesAvg(
      Long serverlessAppsApmApmGcpCloudfunctionInstancesAvg) {
    this.serverlessAppsApmApmGcpCloudfunctionInstancesAvg =
        serverlessAppsApmApmGcpCloudfunctionInstancesAvg;
    return this;
  }

  /**
   * Shows the average number of Serverless Apps with Application Performance Monitoring for Google
   * Cloud Platform Cloud Function instances for the given date and given org.
   *
   * @return serverlessAppsApmApmGcpCloudfunctionInstancesAvg
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVERLESS_APPS_APM_APM_GCP_CLOUDFUNCTION_INSTANCES_AVG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getServerlessAppsApmApmGcpCloudfunctionInstancesAvg() {
    return serverlessAppsApmApmGcpCloudfunctionInstancesAvg;
  }

  public void setServerlessAppsApmApmGcpCloudfunctionInstancesAvg(
      Long serverlessAppsApmApmGcpCloudfunctionInstancesAvg) {
    this.serverlessAppsApmApmGcpCloudfunctionInstancesAvg =
        serverlessAppsApmApmGcpCloudfunctionInstancesAvg;
  }

  public UsageSummaryDateOrg serverlessAppsApmApmGcpCloudrunInstancesAvg(
      Long serverlessAppsApmApmGcpCloudrunInstancesAvg) {
    this.serverlessAppsApmApmGcpCloudrunInstancesAvg = serverlessAppsApmApmGcpCloudrunInstancesAvg;
    return this;
  }

  /**
   * Shows the average number of Serverless Apps with Application Performance Monitoring for Google
   * Cloud Platform Cloud Run instances for the given date and given org.
   *
   * @return serverlessAppsApmApmGcpCloudrunInstancesAvg
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVERLESS_APPS_APM_APM_GCP_CLOUDRUN_INSTANCES_AVG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getServerlessAppsApmApmGcpCloudrunInstancesAvg() {
    return serverlessAppsApmApmGcpCloudrunInstancesAvg;
  }

  public void setServerlessAppsApmApmGcpCloudrunInstancesAvg(
      Long serverlessAppsApmApmGcpCloudrunInstancesAvg) {
    this.serverlessAppsApmApmGcpCloudrunInstancesAvg = serverlessAppsApmApmGcpCloudrunInstancesAvg;
  }

  public UsageSummaryDateOrg serverlessAppsApmAvg(Long serverlessAppsApmAvg) {
    this.serverlessAppsApmAvg = serverlessAppsApmAvg;
    return this;
  }

  /**
   * Shows the average number of Serverless Apps with Application Performance Monitoring for the
   * given date and given org.
   *
   * @return serverlessAppsApmAvg
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVERLESS_APPS_APM_AVG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getServerlessAppsApmAvg() {
    return serverlessAppsApmAvg;
  }

  public void setServerlessAppsApmAvg(Long serverlessAppsApmAvg) {
    this.serverlessAppsApmAvg = serverlessAppsApmAvg;
  }

  public UsageSummaryDateOrg serverlessAppsApmExclFargateApmAzureAppserviceInstancesAvg(
      Long serverlessAppsApmExclFargateApmAzureAppserviceInstancesAvg) {
    this.serverlessAppsApmExclFargateApmAzureAppserviceInstancesAvg =
        serverlessAppsApmExclFargateApmAzureAppserviceInstancesAvg;
    return this;
  }

  /**
   * Shows the average number of Serverless Apps with Application Performance Monitoring excluding
   * Fargate for Azure App Service instances for the given date and given org.
   *
   * @return serverlessAppsApmExclFargateApmAzureAppserviceInstancesAvg
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVERLESS_APPS_APM_EXCL_FARGATE_APM_AZURE_APPSERVICE_INSTANCES_AVG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getServerlessAppsApmExclFargateApmAzureAppserviceInstancesAvg() {
    return serverlessAppsApmExclFargateApmAzureAppserviceInstancesAvg;
  }

  public void setServerlessAppsApmExclFargateApmAzureAppserviceInstancesAvg(
      Long serverlessAppsApmExclFargateApmAzureAppserviceInstancesAvg) {
    this.serverlessAppsApmExclFargateApmAzureAppserviceInstancesAvg =
        serverlessAppsApmExclFargateApmAzureAppserviceInstancesAvg;
  }

  public UsageSummaryDateOrg serverlessAppsApmExclFargateApmAzureAzurefunctionInstancesAvg(
      Long serverlessAppsApmExclFargateApmAzureAzurefunctionInstancesAvg) {
    this.serverlessAppsApmExclFargateApmAzureAzurefunctionInstancesAvg =
        serverlessAppsApmExclFargateApmAzureAzurefunctionInstancesAvg;
    return this;
  }

  /**
   * Shows the average number of Serverless Apps with Application Performance Monitoring excluding
   * Fargate for Azure Function instances for the given date and given org.
   *
   * @return serverlessAppsApmExclFargateApmAzureAzurefunctionInstancesAvg
   */
  @jakarta.annotation.Nullable
  @JsonProperty(
      JSON_PROPERTY_SERVERLESS_APPS_APM_EXCL_FARGATE_APM_AZURE_AZUREFUNCTION_INSTANCES_AVG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getServerlessAppsApmExclFargateApmAzureAzurefunctionInstancesAvg() {
    return serverlessAppsApmExclFargateApmAzureAzurefunctionInstancesAvg;
  }

  public void setServerlessAppsApmExclFargateApmAzureAzurefunctionInstancesAvg(
      Long serverlessAppsApmExclFargateApmAzureAzurefunctionInstancesAvg) {
    this.serverlessAppsApmExclFargateApmAzureAzurefunctionInstancesAvg =
        serverlessAppsApmExclFargateApmAzureAzurefunctionInstancesAvg;
  }

  public UsageSummaryDateOrg serverlessAppsApmExclFargateApmAzureContainerappInstancesAvg(
      Long serverlessAppsApmExclFargateApmAzureContainerappInstancesAvg) {
    this.serverlessAppsApmExclFargateApmAzureContainerappInstancesAvg =
        serverlessAppsApmExclFargateApmAzureContainerappInstancesAvg;
    return this;
  }

  /**
   * Shows the average number of Serverless Apps with Application Performance Monitoring excluding
   * Fargate for Azure Container App instances for the given date and given org.
   *
   * @return serverlessAppsApmExclFargateApmAzureContainerappInstancesAvg
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVERLESS_APPS_APM_EXCL_FARGATE_APM_AZURE_CONTAINERAPP_INSTANCES_AVG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getServerlessAppsApmExclFargateApmAzureContainerappInstancesAvg() {
    return serverlessAppsApmExclFargateApmAzureContainerappInstancesAvg;
  }

  public void setServerlessAppsApmExclFargateApmAzureContainerappInstancesAvg(
      Long serverlessAppsApmExclFargateApmAzureContainerappInstancesAvg) {
    this.serverlessAppsApmExclFargateApmAzureContainerappInstancesAvg =
        serverlessAppsApmExclFargateApmAzureContainerappInstancesAvg;
  }

  public UsageSummaryDateOrg serverlessAppsApmExclFargateApmGcpCloudfunctionInstancesAvg(
      Long serverlessAppsApmExclFargateApmGcpCloudfunctionInstancesAvg) {
    this.serverlessAppsApmExclFargateApmGcpCloudfunctionInstancesAvg =
        serverlessAppsApmExclFargateApmGcpCloudfunctionInstancesAvg;
    return this;
  }

  /**
   * Shows the average number of Serverless Apps with Application Performance Monitoring excluding
   * Fargate for Google Cloud Platform Cloud Function instances for the given date and given org.
   *
   * @return serverlessAppsApmExclFargateApmGcpCloudfunctionInstancesAvg
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVERLESS_APPS_APM_EXCL_FARGATE_APM_GCP_CLOUDFUNCTION_INSTANCES_AVG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getServerlessAppsApmExclFargateApmGcpCloudfunctionInstancesAvg() {
    return serverlessAppsApmExclFargateApmGcpCloudfunctionInstancesAvg;
  }

  public void setServerlessAppsApmExclFargateApmGcpCloudfunctionInstancesAvg(
      Long serverlessAppsApmExclFargateApmGcpCloudfunctionInstancesAvg) {
    this.serverlessAppsApmExclFargateApmGcpCloudfunctionInstancesAvg =
        serverlessAppsApmExclFargateApmGcpCloudfunctionInstancesAvg;
  }

  public UsageSummaryDateOrg serverlessAppsApmExclFargateApmGcpCloudrunInstancesAvg(
      Long serverlessAppsApmExclFargateApmGcpCloudrunInstancesAvg) {
    this.serverlessAppsApmExclFargateApmGcpCloudrunInstancesAvg =
        serverlessAppsApmExclFargateApmGcpCloudrunInstancesAvg;
    return this;
  }

  /**
   * Shows the average number of Serverless Apps with Application Performance Monitoring excluding
   * Fargate for Google Cloud Platform Cloud Run instances for the given date and given org.
   *
   * @return serverlessAppsApmExclFargateApmGcpCloudrunInstancesAvg
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVERLESS_APPS_APM_EXCL_FARGATE_APM_GCP_CLOUDRUN_INSTANCES_AVG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getServerlessAppsApmExclFargateApmGcpCloudrunInstancesAvg() {
    return serverlessAppsApmExclFargateApmGcpCloudrunInstancesAvg;
  }

  public void setServerlessAppsApmExclFargateApmGcpCloudrunInstancesAvg(
      Long serverlessAppsApmExclFargateApmGcpCloudrunInstancesAvg) {
    this.serverlessAppsApmExclFargateApmGcpCloudrunInstancesAvg =
        serverlessAppsApmExclFargateApmGcpCloudrunInstancesAvg;
  }

  public UsageSummaryDateOrg serverlessAppsApmExclFargateAvg(Long serverlessAppsApmExclFargateAvg) {
    this.serverlessAppsApmExclFargateAvg = serverlessAppsApmExclFargateAvg;
    return this;
  }

  /**
   * Shows the average number of Serverless Apps with Application Performance Monitoring excluding
   * Fargate for the given date and given org.
   *
   * @return serverlessAppsApmExclFargateAvg
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVERLESS_APPS_APM_EXCL_FARGATE_AVG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getServerlessAppsApmExclFargateAvg() {
    return serverlessAppsApmExclFargateAvg;
  }

  public void setServerlessAppsApmExclFargateAvg(Long serverlessAppsApmExclFargateAvg) {
    this.serverlessAppsApmExclFargateAvg = serverlessAppsApmExclFargateAvg;
  }

  public UsageSummaryDateOrg serverlessAppsAzureContainerAppInstancesAvg(
      Long serverlessAppsAzureContainerAppInstancesAvg) {
    this.serverlessAppsAzureContainerAppInstancesAvg = serverlessAppsAzureContainerAppInstancesAvg;
    return this;
  }

  /**
   * Shows the average number of Serverless Apps for Azure Container App instances for the given
   * date and given org.
   *
   * @return serverlessAppsAzureContainerAppInstancesAvg
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVERLESS_APPS_AZURE_CONTAINER_APP_INSTANCES_AVG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getServerlessAppsAzureContainerAppInstancesAvg() {
    return serverlessAppsAzureContainerAppInstancesAvg;
  }

  public void setServerlessAppsAzureContainerAppInstancesAvg(
      Long serverlessAppsAzureContainerAppInstancesAvg) {
    this.serverlessAppsAzureContainerAppInstancesAvg = serverlessAppsAzureContainerAppInstancesAvg;
  }

  public UsageSummaryDateOrg serverlessAppsAzureCountAvg(Long serverlessAppsAzureCountAvg) {
    this.serverlessAppsAzureCountAvg = serverlessAppsAzureCountAvg;
    return this;
  }

  /**
   * Shows the average number of Serverless Apps for Azure for the given date and given org.
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

  public UsageSummaryDateOrg serverlessAppsAzureFunctionAppInstancesAvg(
      Long serverlessAppsAzureFunctionAppInstancesAvg) {
    this.serverlessAppsAzureFunctionAppInstancesAvg = serverlessAppsAzureFunctionAppInstancesAvg;
    return this;
  }

  /**
   * Shows the average number of Serverless Apps for Azure Function App instances for the given date
   * and given org.
   *
   * @return serverlessAppsAzureFunctionAppInstancesAvg
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVERLESS_APPS_AZURE_FUNCTION_APP_INSTANCES_AVG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getServerlessAppsAzureFunctionAppInstancesAvg() {
    return serverlessAppsAzureFunctionAppInstancesAvg;
  }

  public void setServerlessAppsAzureFunctionAppInstancesAvg(
      Long serverlessAppsAzureFunctionAppInstancesAvg) {
    this.serverlessAppsAzureFunctionAppInstancesAvg = serverlessAppsAzureFunctionAppInstancesAvg;
  }

  public UsageSummaryDateOrg serverlessAppsAzureWebAppInstancesAvg(
      Long serverlessAppsAzureWebAppInstancesAvg) {
    this.serverlessAppsAzureWebAppInstancesAvg = serverlessAppsAzureWebAppInstancesAvg;
    return this;
  }

  /**
   * Shows the average number of Serverless Apps for Azure Web App instances for the given date and
   * given org.
   *
   * @return serverlessAppsAzureWebAppInstancesAvg
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVERLESS_APPS_AZURE_WEB_APP_INSTANCES_AVG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getServerlessAppsAzureWebAppInstancesAvg() {
    return serverlessAppsAzureWebAppInstancesAvg;
  }

  public void setServerlessAppsAzureWebAppInstancesAvg(Long serverlessAppsAzureWebAppInstancesAvg) {
    this.serverlessAppsAzureWebAppInstancesAvg = serverlessAppsAzureWebAppInstancesAvg;
  }

  public UsageSummaryDateOrg serverlessAppsEcsAvg(Long serverlessAppsEcsAvg) {
    this.serverlessAppsEcsAvg = serverlessAppsEcsAvg;
    return this;
  }

  /**
   * Shows the average number of Serverless Apps for Elastic Container Service for the given date
   * and given org.
   *
   * @return serverlessAppsEcsAvg
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVERLESS_APPS_ECS_AVG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getServerlessAppsEcsAvg() {
    return serverlessAppsEcsAvg;
  }

  public void setServerlessAppsEcsAvg(Long serverlessAppsEcsAvg) {
    this.serverlessAppsEcsAvg = serverlessAppsEcsAvg;
  }

  public UsageSummaryDateOrg serverlessAppsEksAvg(Long serverlessAppsEksAvg) {
    this.serverlessAppsEksAvg = serverlessAppsEksAvg;
    return this;
  }

  /**
   * Shows the average number of Serverless Apps for Elastic Kubernetes Service for the given date
   * and given org.
   *
   * @return serverlessAppsEksAvg
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVERLESS_APPS_EKS_AVG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getServerlessAppsEksAvg() {
    return serverlessAppsEksAvg;
  }

  public void setServerlessAppsEksAvg(Long serverlessAppsEksAvg) {
    this.serverlessAppsEksAvg = serverlessAppsEksAvg;
  }

  public UsageSummaryDateOrg serverlessAppsExclFargateAvg(Long serverlessAppsExclFargateAvg) {
    this.serverlessAppsExclFargateAvg = serverlessAppsExclFargateAvg;
    return this;
  }

  /**
   * Shows the average number of Serverless Apps excluding Fargate for the given date and given org.
   *
   * @return serverlessAppsExclFargateAvg
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVERLESS_APPS_EXCL_FARGATE_AVG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getServerlessAppsExclFargateAvg() {
    return serverlessAppsExclFargateAvg;
  }

  public void setServerlessAppsExclFargateAvg(Long serverlessAppsExclFargateAvg) {
    this.serverlessAppsExclFargateAvg = serverlessAppsExclFargateAvg;
  }

  public UsageSummaryDateOrg serverlessAppsExclFargateAzureContainerAppInstancesAvg(
      Long serverlessAppsExclFargateAzureContainerAppInstancesAvg) {
    this.serverlessAppsExclFargateAzureContainerAppInstancesAvg =
        serverlessAppsExclFargateAzureContainerAppInstancesAvg;
    return this;
  }

  /**
   * Shows the average number of Serverless Apps excluding Fargate for Azure Container App instances
   * for the given date and given org.
   *
   * @return serverlessAppsExclFargateAzureContainerAppInstancesAvg
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVERLESS_APPS_EXCL_FARGATE_AZURE_CONTAINER_APP_INSTANCES_AVG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getServerlessAppsExclFargateAzureContainerAppInstancesAvg() {
    return serverlessAppsExclFargateAzureContainerAppInstancesAvg;
  }

  public void setServerlessAppsExclFargateAzureContainerAppInstancesAvg(
      Long serverlessAppsExclFargateAzureContainerAppInstancesAvg) {
    this.serverlessAppsExclFargateAzureContainerAppInstancesAvg =
        serverlessAppsExclFargateAzureContainerAppInstancesAvg;
  }

  public UsageSummaryDateOrg serverlessAppsExclFargateAzureFunctionAppInstancesAvg(
      Long serverlessAppsExclFargateAzureFunctionAppInstancesAvg) {
    this.serverlessAppsExclFargateAzureFunctionAppInstancesAvg =
        serverlessAppsExclFargateAzureFunctionAppInstancesAvg;
    return this;
  }

  /**
   * Shows the average number of Serverless Apps excluding Fargate for Azure Function App instances
   * for the given date and given org.
   *
   * @return serverlessAppsExclFargateAzureFunctionAppInstancesAvg
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVERLESS_APPS_EXCL_FARGATE_AZURE_FUNCTION_APP_INSTANCES_AVG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getServerlessAppsExclFargateAzureFunctionAppInstancesAvg() {
    return serverlessAppsExclFargateAzureFunctionAppInstancesAvg;
  }

  public void setServerlessAppsExclFargateAzureFunctionAppInstancesAvg(
      Long serverlessAppsExclFargateAzureFunctionAppInstancesAvg) {
    this.serverlessAppsExclFargateAzureFunctionAppInstancesAvg =
        serverlessAppsExclFargateAzureFunctionAppInstancesAvg;
  }

  public UsageSummaryDateOrg serverlessAppsExclFargateAzureWebAppInstancesAvg(
      Long serverlessAppsExclFargateAzureWebAppInstancesAvg) {
    this.serverlessAppsExclFargateAzureWebAppInstancesAvg =
        serverlessAppsExclFargateAzureWebAppInstancesAvg;
    return this;
  }

  /**
   * Shows the average number of Serverless Apps excluding Fargate for Azure Web App instances for
   * the given date and given org.
   *
   * @return serverlessAppsExclFargateAzureWebAppInstancesAvg
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVERLESS_APPS_EXCL_FARGATE_AZURE_WEB_APP_INSTANCES_AVG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getServerlessAppsExclFargateAzureWebAppInstancesAvg() {
    return serverlessAppsExclFargateAzureWebAppInstancesAvg;
  }

  public void setServerlessAppsExclFargateAzureWebAppInstancesAvg(
      Long serverlessAppsExclFargateAzureWebAppInstancesAvg) {
    this.serverlessAppsExclFargateAzureWebAppInstancesAvg =
        serverlessAppsExclFargateAzureWebAppInstancesAvg;
  }

  public UsageSummaryDateOrg serverlessAppsExclFargateGoogleCloudFunctionsInstancesAvg(
      Long serverlessAppsExclFargateGoogleCloudFunctionsInstancesAvg) {
    this.serverlessAppsExclFargateGoogleCloudFunctionsInstancesAvg =
        serverlessAppsExclFargateGoogleCloudFunctionsInstancesAvg;
    return this;
  }

  /**
   * Shows the average number of Serverless Apps excluding Fargate for Google Cloud Platform Cloud
   * Functions instances for the given date and given org.
   *
   * @return serverlessAppsExclFargateGoogleCloudFunctionsInstancesAvg
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVERLESS_APPS_EXCL_FARGATE_GOOGLE_CLOUD_FUNCTIONS_INSTANCES_AVG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getServerlessAppsExclFargateGoogleCloudFunctionsInstancesAvg() {
    return serverlessAppsExclFargateGoogleCloudFunctionsInstancesAvg;
  }

  public void setServerlessAppsExclFargateGoogleCloudFunctionsInstancesAvg(
      Long serverlessAppsExclFargateGoogleCloudFunctionsInstancesAvg) {
    this.serverlessAppsExclFargateGoogleCloudFunctionsInstancesAvg =
        serverlessAppsExclFargateGoogleCloudFunctionsInstancesAvg;
  }

  public UsageSummaryDateOrg serverlessAppsExclFargateGoogleCloudRunInstancesAvg(
      Long serverlessAppsExclFargateGoogleCloudRunInstancesAvg) {
    this.serverlessAppsExclFargateGoogleCloudRunInstancesAvg =
        serverlessAppsExclFargateGoogleCloudRunInstancesAvg;
    return this;
  }

  /**
   * Shows the average number of Serverless Apps excluding Fargate for Google Cloud Platform Cloud
   * Run instances for the given date and given org.
   *
   * @return serverlessAppsExclFargateGoogleCloudRunInstancesAvg
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVERLESS_APPS_EXCL_FARGATE_GOOGLE_CLOUD_RUN_INSTANCES_AVG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getServerlessAppsExclFargateGoogleCloudRunInstancesAvg() {
    return serverlessAppsExclFargateGoogleCloudRunInstancesAvg;
  }

  public void setServerlessAppsExclFargateGoogleCloudRunInstancesAvg(
      Long serverlessAppsExclFargateGoogleCloudRunInstancesAvg) {
    this.serverlessAppsExclFargateGoogleCloudRunInstancesAvg =
        serverlessAppsExclFargateGoogleCloudRunInstancesAvg;
  }

  public UsageSummaryDateOrg serverlessAppsGoogleCloudFunctionsInstancesAvg(
      Long serverlessAppsGoogleCloudFunctionsInstancesAvg) {
    this.serverlessAppsGoogleCloudFunctionsInstancesAvg =
        serverlessAppsGoogleCloudFunctionsInstancesAvg;
    return this;
  }

  /**
   * Shows the average number of Serverless Apps for Google Cloud Platform Cloud Functions instances
   * for the given date and given org.
   *
   * @return serverlessAppsGoogleCloudFunctionsInstancesAvg
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVERLESS_APPS_GOOGLE_CLOUD_FUNCTIONS_INSTANCES_AVG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getServerlessAppsGoogleCloudFunctionsInstancesAvg() {
    return serverlessAppsGoogleCloudFunctionsInstancesAvg;
  }

  public void setServerlessAppsGoogleCloudFunctionsInstancesAvg(
      Long serverlessAppsGoogleCloudFunctionsInstancesAvg) {
    this.serverlessAppsGoogleCloudFunctionsInstancesAvg =
        serverlessAppsGoogleCloudFunctionsInstancesAvg;
  }

  public UsageSummaryDateOrg serverlessAppsGoogleCloudRunInstancesAvg(
      Long serverlessAppsGoogleCloudRunInstancesAvg) {
    this.serverlessAppsGoogleCloudRunInstancesAvg = serverlessAppsGoogleCloudRunInstancesAvg;
    return this;
  }

  /**
   * Shows the average number of Serverless Apps for Google Cloud Platform Cloud Run instances for
   * the given date and given org.
   *
   * @return serverlessAppsGoogleCloudRunInstancesAvg
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVERLESS_APPS_GOOGLE_CLOUD_RUN_INSTANCES_AVG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getServerlessAppsGoogleCloudRunInstancesAvg() {
    return serverlessAppsGoogleCloudRunInstancesAvg;
  }

  public void setServerlessAppsGoogleCloudRunInstancesAvg(
      Long serverlessAppsGoogleCloudRunInstancesAvg) {
    this.serverlessAppsGoogleCloudRunInstancesAvg = serverlessAppsGoogleCloudRunInstancesAvg;
  }

  public UsageSummaryDateOrg serverlessAppsGoogleCountAvg(Long serverlessAppsGoogleCountAvg) {
    this.serverlessAppsGoogleCountAvg = serverlessAppsGoogleCountAvg;
    return this;
  }

  /**
   * Shows the average number of Serverless Apps for Google Cloud for the given date and given org.
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

  public UsageSummaryDateOrg serverlessAppsTotalCountAvg(Long serverlessAppsTotalCountAvg) {
    this.serverlessAppsTotalCountAvg = serverlessAppsTotalCountAvg;
    return this;
  }

  /**
   * Shows the average number of Serverless Apps for Azure and Google Cloud for the given date and
   * given org.
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

  public UsageSummaryDateOrg siemAnalyzedLogsAddOnCountSum(Long siemAnalyzedLogsAddOnCountSum) {
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

  public UsageSummaryDateOrg syntheticsBrowserCheckCallsCountSum(
      Long syntheticsBrowserCheckCallsCountSum) {
    this.syntheticsBrowserCheckCallsCountSum = syntheticsBrowserCheckCallsCountSum;
    return this;
  }

  /**
   * Shows the sum of all Synthetic browser tests over all hours in the current date for the given
   * org.
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

  public UsageSummaryDateOrg syntheticsCheckCallsCountSum(Long syntheticsCheckCallsCountSum) {
    this.syntheticsCheckCallsCountSum = syntheticsCheckCallsCountSum;
    return this;
  }

  /**
   * Shows the sum of all Synthetic API tests over all hours in the current date for the given org.
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

  public UsageSummaryDateOrg syntheticsMobileTestRunsSum(Long syntheticsMobileTestRunsSum) {
    this.syntheticsMobileTestRunsSum = syntheticsMobileTestRunsSum;
    return this;
  }

  /**
   * Shows the sum of all Synthetic mobile application tests over all hours in the current date for
   * the given org.
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

  public UsageSummaryDateOrg syntheticsParallelTestingMaxSlotsHwm(
      Long syntheticsParallelTestingMaxSlotsHwm) {
    this.syntheticsParallelTestingMaxSlotsHwm = syntheticsParallelTestingMaxSlotsHwm;
    return this;
  }

  /**
   * Shows the high-water mark of used synthetics parallel testing slots over all hours in the
   * current date for the given org.
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

  public UsageSummaryDateOrg traceSearchIndexedEventsCountSum(
      Long traceSearchIndexedEventsCountSum) {
    this.traceSearchIndexedEventsCountSum = traceSearchIndexedEventsCountSum;
    return this;
  }

  /**
   * Shows the sum of all Indexed Spans indexed over all hours in the current date for the given
   * org.
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

  public UsageSummaryDateOrg twolIngestedEventsBytesSum(Long twolIngestedEventsBytesSum) {
    this.twolIngestedEventsBytesSum = twolIngestedEventsBytesSum;
    return this;
  }

  /**
   * Shows the sum of all ingested APM span bytes over all hours in the current date for the given
   * org.
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

  public UsageSummaryDateOrg universalServiceMonitoringHostTop99p(
      Long universalServiceMonitoringHostTop99p) {
    this.universalServiceMonitoringHostTop99p = universalServiceMonitoringHostTop99p;
    return this;
  }

  /**
   * Shows the 99th percentile of all Universal Service Monitoring hosts over all hours in the
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

  public UsageSummaryDateOrg vsphereHostTop99p(Long vsphereHostTop99p) {
    this.vsphereHostTop99p = vsphereHostTop99p;
    return this;
  }

  /**
   * Shows the 99th percentile of all vSphere hosts over all hours in the current date for the given
   * org.
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

  public UsageSummaryDateOrg vulnManagementHostCountTop99p(Long vulnManagementHostCountTop99p) {
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

  public UsageSummaryDateOrg workflowExecutionsUsageSum(Long workflowExecutionsUsageSum) {
    this.workflowExecutionsUsageSum = workflowExecutionsUsageSum;
    return this;
  }

  /**
   * Sum of all workflows executed over all hours in the current date for the given org.
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
   * @return UsageSummaryDateOrg
   */
  @JsonAnySetter
  public UsageSummaryDateOrg putAdditionalProperty(String key, Object value) {
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
    return Objects.equals(this.accountName, usageSummaryDateOrg.accountName)
        && Objects.equals(this.accountPublicId, usageSummaryDateOrg.accountPublicId)
        && Objects.equals(this.agentHostTop99p, usageSummaryDateOrg.agentHostTop99p)
        && Objects.equals(
            this.apmAzureAppServiceHostTop99p, usageSummaryDateOrg.apmAzureAppServiceHostTop99p)
        && Objects.equals(this.apmDevsecopsHostTop99p, usageSummaryDateOrg.apmDevsecopsHostTop99p)
        && Objects.equals(
            this.apmEnterpriseStandaloneHostsTop99p,
            usageSummaryDateOrg.apmEnterpriseStandaloneHostsTop99p)
        && Objects.equals(this.apmFargateCountAvg, usageSummaryDateOrg.apmFargateCountAvg)
        && Objects.equals(this.apmHostTop99p, usageSummaryDateOrg.apmHostTop99p)
        && Objects.equals(
            this.apmProStandaloneHostsTop99p, usageSummaryDateOrg.apmProStandaloneHostsTop99p)
        && Objects.equals(this.appsecFargateCountAvg, usageSummaryDateOrg.appsecFargateCountAvg)
        && Objects.equals(this.asmServerlessSum, usageSummaryDateOrg.asmServerlessSum)
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
        && Objects.equals(this.bitsAiInvestigationsSum, usageSummaryDateOrg.bitsAiInvestigationsSum)
        && Objects.equals(
            this.browserRumLiteSessionCountSum, usageSummaryDateOrg.browserRumLiteSessionCountSum)
        && Objects.equals(
            this.browserRumReplaySessionCountSum,
            usageSummaryDateOrg.browserRumReplaySessionCountSum)
        && Objects.equals(this.browserRumUnitsSum, usageSummaryDateOrg.browserRumUnitsSum)
        && Objects.equals(
            this.ccmSpendMonitoredEntLast, usageSummaryDateOrg.ccmSpendMonitoredEntLast)
        && Objects.equals(
            this.ccmSpendMonitoredProLast, usageSummaryDateOrg.ccmSpendMonitoredProLast)
        && Objects.equals(
            this.ciPipelineIndexedSpansSum, usageSummaryDateOrg.ciPipelineIndexedSpansSum)
        && Objects.equals(this.ciTestIndexedSpansSum, usageSummaryDateOrg.ciTestIndexedSpansSum)
        && Objects.equals(
            this.ciVisibilityItrCommittersHwm, usageSummaryDateOrg.ciVisibilityItrCommittersHwm)
        && Objects.equals(
            this.ciVisibilityPipelineCommittersHwm,
            usageSummaryDateOrg.ciVisibilityPipelineCommittersHwm)
        && Objects.equals(
            this.ciVisibilityTestCommittersHwm, usageSummaryDateOrg.ciVisibilityTestCommittersHwm)
        && Objects.equals(
            this.cloudCostManagementAwsHostCountAvg,
            usageSummaryDateOrg.cloudCostManagementAwsHostCountAvg)
        && Objects.equals(
            this.cloudCostManagementAzureHostCountAvg,
            usageSummaryDateOrg.cloudCostManagementAzureHostCountAvg)
        && Objects.equals(
            this.cloudCostManagementGcpHostCountAvg,
            usageSummaryDateOrg.cloudCostManagementGcpHostCountAvg)
        && Objects.equals(
            this.cloudCostManagementHostCountAvg,
            usageSummaryDateOrg.cloudCostManagementHostCountAvg)
        && Objects.equals(
            this.cloudCostManagementOciHostCountAvg,
            usageSummaryDateOrg.cloudCostManagementOciHostCountAvg)
        && Objects.equals(this.cloudSiemEventsSum, usageSummaryDateOrg.cloudSiemEventsSum)
        && Objects.equals(
            this.codeAnalysisSaCommittersHwm, usageSummaryDateOrg.codeAnalysisSaCommittersHwm)
        && Objects.equals(
            this.codeAnalysisScaCommittersHwm, usageSummaryDateOrg.codeAnalysisScaCommittersHwm)
        && Objects.equals(this.codeSecurityHostTop99p, usageSummaryDateOrg.codeSecurityHostTop99p)
        && Objects.equals(this.containerAvg, usageSummaryDateOrg.containerAvg)
        && Objects.equals(this.containerExclAgentAvg, usageSummaryDateOrg.containerExclAgentAvg)
        && Objects.equals(this.containerHwm, usageSummaryDateOrg.containerHwm)
        && Objects.equals(
            this.csmContainerEnterpriseComplianceCountSum,
            usageSummaryDateOrg.csmContainerEnterpriseComplianceCountSum)
        && Objects.equals(
            this.csmContainerEnterpriseCwsCountSum,
            usageSummaryDateOrg.csmContainerEnterpriseCwsCountSum)
        && Objects.equals(
            this.csmContainerEnterpriseTotalCountSum,
            usageSummaryDateOrg.csmContainerEnterpriseTotalCountSum)
        && Objects.equals(
            this.csmHostEnterpriseAasHostCountTop99p,
            usageSummaryDateOrg.csmHostEnterpriseAasHostCountTop99p)
        && Objects.equals(
            this.csmHostEnterpriseAwsHostCountTop99p,
            usageSummaryDateOrg.csmHostEnterpriseAwsHostCountTop99p)
        && Objects.equals(
            this.csmHostEnterpriseAzureHostCountTop99p,
            usageSummaryDateOrg.csmHostEnterpriseAzureHostCountTop99p)
        && Objects.equals(
            this.csmHostEnterpriseComplianceHostCountTop99p,
            usageSummaryDateOrg.csmHostEnterpriseComplianceHostCountTop99p)
        && Objects.equals(
            this.csmHostEnterpriseCwsHostCountTop99p,
            usageSummaryDateOrg.csmHostEnterpriseCwsHostCountTop99p)
        && Objects.equals(
            this.csmHostEnterpriseGcpHostCountTop99p,
            usageSummaryDateOrg.csmHostEnterpriseGcpHostCountTop99p)
        && Objects.equals(
            this.csmHostEnterpriseTotalHostCountTop99p,
            usageSummaryDateOrg.csmHostEnterpriseTotalHostCountTop99p)
        && Objects.equals(this.cspmAasHostTop99p, usageSummaryDateOrg.cspmAasHostTop99p)
        && Objects.equals(this.cspmAwsHostTop99p, usageSummaryDateOrg.cspmAwsHostTop99p)
        && Objects.equals(this.cspmAzureHostTop99p, usageSummaryDateOrg.cspmAzureHostTop99p)
        && Objects.equals(this.cspmContainerAvg, usageSummaryDateOrg.cspmContainerAvg)
        && Objects.equals(this.cspmContainerHwm, usageSummaryDateOrg.cspmContainerHwm)
        && Objects.equals(this.cspmGcpHostTop99p, usageSummaryDateOrg.cspmGcpHostTop99p)
        && Objects.equals(this.cspmHostTop99p, usageSummaryDateOrg.cspmHostTop99p)
        && Objects.equals(this.customHistoricalTsAvg, usageSummaryDateOrg.customHistoricalTsAvg)
        && Objects.equals(this.customLiveTsAvg, usageSummaryDateOrg.customLiveTsAvg)
        && Objects.equals(this.customTsAvg, usageSummaryDateOrg.customTsAvg)
        && Objects.equals(this.cwsContainerCountAvg, usageSummaryDateOrg.cwsContainerCountAvg)
        && Objects.equals(this.cwsFargateTaskAvg, usageSummaryDateOrg.cwsFargateTaskAvg)
        && Objects.equals(this.cwsHostTop99p, usageSummaryDateOrg.cwsHostTop99p)
        && Objects.equals(
            this.dataJobsMonitoringHostHrSum, usageSummaryDateOrg.dataJobsMonitoringHostHrSum)
        && Objects.equals(this.dbmHostTop99pSum, usageSummaryDateOrg.dbmHostTop99pSum)
        && Objects.equals(this.dbmQueriesAvgSum, usageSummaryDateOrg.dbmQueriesAvgSum)
        && Objects.equals(this.ephInfraHostAgentSum, usageSummaryDateOrg.ephInfraHostAgentSum)
        && Objects.equals(this.ephInfraHostAlibabaSum, usageSummaryDateOrg.ephInfraHostAlibabaSum)
        && Objects.equals(this.ephInfraHostAwsSum, usageSummaryDateOrg.ephInfraHostAwsSum)
        && Objects.equals(this.ephInfraHostAzureSum, usageSummaryDateOrg.ephInfraHostAzureSum)
        && Objects.equals(this.ephInfraHostEntSum, usageSummaryDateOrg.ephInfraHostEntSum)
        && Objects.equals(this.ephInfraHostGcpSum, usageSummaryDateOrg.ephInfraHostGcpSum)
        && Objects.equals(this.ephInfraHostHerokuSum, usageSummaryDateOrg.ephInfraHostHerokuSum)
        && Objects.equals(this.ephInfraHostOnlyAasSum, usageSummaryDateOrg.ephInfraHostOnlyAasSum)
        && Objects.equals(
            this.ephInfraHostOnlyVsphereSum, usageSummaryDateOrg.ephInfraHostOnlyVsphereSum)
        && Objects.equals(
            this.ephInfraHostOpentelemetryApmSum,
            usageSummaryDateOrg.ephInfraHostOpentelemetryApmSum)
        && Objects.equals(
            this.ephInfraHostOpentelemetrySum, usageSummaryDateOrg.ephInfraHostOpentelemetrySum)
        && Objects.equals(this.ephInfraHostProSum, usageSummaryDateOrg.ephInfraHostProSum)
        && Objects.equals(this.ephInfraHostProplusSum, usageSummaryDateOrg.ephInfraHostProplusSum)
        && Objects.equals(this.ephInfraHostProxmoxSum, usageSummaryDateOrg.ephInfraHostProxmoxSum)
        && Objects.equals(
            this.errorTrackingApmErrorEventsSum, usageSummaryDateOrg.errorTrackingApmErrorEventsSum)
        && Objects.equals(
            this.errorTrackingErrorEventsSum, usageSummaryDateOrg.errorTrackingErrorEventsSum)
        && Objects.equals(this.errorTrackingEventsSum, usageSummaryDateOrg.errorTrackingEventsSum)
        && Objects.equals(
            this.errorTrackingRumErrorEventsSum, usageSummaryDateOrg.errorTrackingRumErrorEventsSum)
        && Objects.equals(
            this.eventManagementCorrelationCorrelatedEventsSum,
            usageSummaryDateOrg.eventManagementCorrelationCorrelatedEventsSum)
        && Objects.equals(
            this.eventManagementCorrelationCorrelatedRelatedEventsSum,
            usageSummaryDateOrg.eventManagementCorrelationCorrelatedRelatedEventsSum)
        && Objects.equals(
            this.eventManagementCorrelationSum, usageSummaryDateOrg.eventManagementCorrelationSum)
        && Objects.equals(
            this.fargateContainerProfilerProfilingFargateAvg,
            usageSummaryDateOrg.fargateContainerProfilerProfilingFargateAvg)
        && Objects.equals(
            this.fargateContainerProfilerProfilingFargateEksAvg,
            usageSummaryDateOrg.fargateContainerProfilerProfilingFargateEksAvg)
        && Objects.equals(this.fargateTasksCountAvg, usageSummaryDateOrg.fargateTasksCountAvg)
        && Objects.equals(this.fargateTasksCountHwm, usageSummaryDateOrg.fargateTasksCountHwm)
        && Objects.equals(this.flexLogsComputeLargeAvg, usageSummaryDateOrg.flexLogsComputeLargeAvg)
        && Objects.equals(
            this.flexLogsComputeMediumAvg, usageSummaryDateOrg.flexLogsComputeMediumAvg)
        && Objects.equals(this.flexLogsComputeSmallAvg, usageSummaryDateOrg.flexLogsComputeSmallAvg)
        && Objects.equals(
            this.flexLogsComputeXlargeAvg, usageSummaryDateOrg.flexLogsComputeXlargeAvg)
        && Objects.equals(
            this.flexLogsComputeXsmallAvg, usageSummaryDateOrg.flexLogsComputeXsmallAvg)
        && Objects.equals(this.flexLogsStarterAvg, usageSummaryDateOrg.flexLogsStarterAvg)
        && Objects.equals(
            this.flexLogsStarterStorageIndexAvg, usageSummaryDateOrg.flexLogsStarterStorageIndexAvg)
        && Objects.equals(
            this.flexLogsStarterStorageRetentionAdjustmentAvg,
            usageSummaryDateOrg.flexLogsStarterStorageRetentionAdjustmentAvg)
        && Objects.equals(this.flexStoredLogsAvg, usageSummaryDateOrg.flexStoredLogsAvg)
        && Objects.equals(
            this.forwardingEventsBytesSum, usageSummaryDateOrg.forwardingEventsBytesSum)
        && Objects.equals(this.gcpHostTop99p, usageSummaryDateOrg.gcpHostTop99p)
        && Objects.equals(this.herokuHostTop99p, usageSummaryDateOrg.herokuHostTop99p)
        && Objects.equals(this.id, usageSummaryDateOrg.id)
        && Objects.equals(
            this.incidentManagementMonthlyActiveUsersHwm,
            usageSummaryDateOrg.incidentManagementMonthlyActiveUsersHwm)
        && Objects.equals(
            this.incidentManagementSeatsHwm, usageSummaryDateOrg.incidentManagementSeatsHwm)
        && Objects.equals(this.indexedEventsCountSum, usageSummaryDateOrg.indexedEventsCountSum)
        && Objects.equals(this.infraHostTop99p, usageSummaryDateOrg.infraHostTop99p)
        && Objects.equals(this.ingestedEventsBytesSum, usageSummaryDateOrg.ingestedEventsBytesSum)
        && Objects.equals(this.iotDeviceAggSum, usageSummaryDateOrg.iotDeviceAggSum)
        && Objects.equals(this.iotDeviceTop99pSum, usageSummaryDateOrg.iotDeviceTop99pSum)
        && Objects.equals(
            this.llmObservabilityMinSpendSum, usageSummaryDateOrg.llmObservabilityMinSpendSum)
        && Objects.equals(this.llmObservabilitySum, usageSummaryDateOrg.llmObservabilitySum)
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
            this.mobileRumSessionCountRokuSum, usageSummaryDateOrg.mobileRumSessionCountRokuSum)
        && Objects.equals(
            this.mobileRumSessionCountSum, usageSummaryDateOrg.mobileRumSessionCountSum)
        && Objects.equals(this.mobileRumUnitsSum, usageSummaryDateOrg.mobileRumUnitsSum)
        && Objects.equals(this.name, usageSummaryDateOrg.name)
        && Objects.equals(this.ndmNetflowEventsSum, usageSummaryDateOrg.ndmNetflowEventsSum)
        && Objects.equals(
            this.netflowIndexedEventsCountSum, usageSummaryDateOrg.netflowIndexedEventsCountSum)
        && Objects.equals(
            this.networkDeviceWirelessTop99p, usageSummaryDateOrg.networkDeviceWirelessTop99p)
        && Objects.equals(this.npmHostTop99p, usageSummaryDateOrg.npmHostTop99p)
        && Objects.equals(
            this.observabilityPipelinesBytesProcessedSum,
            usageSummaryDateOrg.observabilityPipelinesBytesProcessedSum)
        && Objects.equals(this.ociHostSum, usageSummaryDateOrg.ociHostSum)
        && Objects.equals(this.ociHostTop99p, usageSummaryDateOrg.ociHostTop99p)
        && Objects.equals(this.onCallSeatHwm, usageSummaryDateOrg.onCallSeatHwm)
        && Objects.equals(
            this.onlineArchiveEventsCountSum, usageSummaryDateOrg.onlineArchiveEventsCountSum)
        && Objects.equals(
            this.opentelemetryApmHostTop99p, usageSummaryDateOrg.opentelemetryApmHostTop99p)
        && Objects.equals(this.opentelemetryHostTop99p, usageSummaryDateOrg.opentelemetryHostTop99p)
        && Objects.equals(this.productAnalyticsSum, usageSummaryDateOrg.productAnalyticsSum)
        && Objects.equals(this.profilingAasCountTop99p, usageSummaryDateOrg.profilingAasCountTop99p)
        && Objects.equals(this.profilingHostTop99p, usageSummaryDateOrg.profilingHostTop99p)
        && Objects.equals(this.proxmoxHostSum, usageSummaryDateOrg.proxmoxHostSum)
        && Objects.equals(this.proxmoxHostTop99p, usageSummaryDateOrg.proxmoxHostTop99p)
        && Objects.equals(this.publicId, usageSummaryDateOrg.publicId)
        && Objects.equals(this.publishedAppHwm, usageSummaryDateOrg.publishedAppHwm)
        && Objects.equals(this.region, usageSummaryDateOrg.region)
        && Objects.equals(
            this.rumBrowserAndMobileSessionCount,
            usageSummaryDateOrg.rumBrowserAndMobileSessionCount)
        && Objects.equals(
            this.rumBrowserLegacySessionCountSum,
            usageSummaryDateOrg.rumBrowserLegacySessionCountSum)
        && Objects.equals(
            this.rumBrowserLiteSessionCountSum, usageSummaryDateOrg.rumBrowserLiteSessionCountSum)
        && Objects.equals(
            this.rumBrowserReplaySessionCountSum,
            usageSummaryDateOrg.rumBrowserReplaySessionCountSum)
        && Objects.equals(this.rumIndexedSessionsSum, usageSummaryDateOrg.rumIndexedSessionsSum)
        && Objects.equals(this.rumIngestedSessionsSum, usageSummaryDateOrg.rumIngestedSessionsSum)
        && Objects.equals(this.rumLiteSessionCountSum, usageSummaryDateOrg.rumLiteSessionCountSum)
        && Objects.equals(
            this.rumMobileLegacySessionCountAndroidSum,
            usageSummaryDateOrg.rumMobileLegacySessionCountAndroidSum)
        && Objects.equals(
            this.rumMobileLegacySessionCountFlutterSum,
            usageSummaryDateOrg.rumMobileLegacySessionCountFlutterSum)
        && Objects.equals(
            this.rumMobileLegacySessionCountIosSum,
            usageSummaryDateOrg.rumMobileLegacySessionCountIosSum)
        && Objects.equals(
            this.rumMobileLegacySessionCountReactnativeSum,
            usageSummaryDateOrg.rumMobileLegacySessionCountReactnativeSum)
        && Objects.equals(
            this.rumMobileLegacySessionCountRokuSum,
            usageSummaryDateOrg.rumMobileLegacySessionCountRokuSum)
        && Objects.equals(
            this.rumMobileLiteSessionCountAndroidSum,
            usageSummaryDateOrg.rumMobileLiteSessionCountAndroidSum)
        && Objects.equals(
            this.rumMobileLiteSessionCountFlutterSum,
            usageSummaryDateOrg.rumMobileLiteSessionCountFlutterSum)
        && Objects.equals(
            this.rumMobileLiteSessionCountIosSum,
            usageSummaryDateOrg.rumMobileLiteSessionCountIosSum)
        && Objects.equals(
            this.rumMobileLiteSessionCountKotlinmultiplatformSum,
            usageSummaryDateOrg.rumMobileLiteSessionCountKotlinmultiplatformSum)
        && Objects.equals(
            this.rumMobileLiteSessionCountReactnativeSum,
            usageSummaryDateOrg.rumMobileLiteSessionCountReactnativeSum)
        && Objects.equals(
            this.rumMobileLiteSessionCountRokuSum,
            usageSummaryDateOrg.rumMobileLiteSessionCountRokuSum)
        && Objects.equals(
            this.rumMobileLiteSessionCountUnitySum,
            usageSummaryDateOrg.rumMobileLiteSessionCountUnitySum)
        && Objects.equals(
            this.rumMobileReplaySessionCountAndroidSum,
            usageSummaryDateOrg.rumMobileReplaySessionCountAndroidSum)
        && Objects.equals(
            this.rumMobileReplaySessionCountIosSum,
            usageSummaryDateOrg.rumMobileReplaySessionCountIosSum)
        && Objects.equals(
            this.rumMobileReplaySessionCountKotlinmultiplatformSum,
            usageSummaryDateOrg.rumMobileReplaySessionCountKotlinmultiplatformSum)
        && Objects.equals(
            this.rumMobileReplaySessionCountReactnativeSum,
            usageSummaryDateOrg.rumMobileReplaySessionCountReactnativeSum)
        && Objects.equals(
            this.rumReplaySessionCountSum, usageSummaryDateOrg.rumReplaySessionCountSum)
        && Objects.equals(this.rumSessionCountSum, usageSummaryDateOrg.rumSessionCountSum)
        && Objects.equals(
            this.rumSessionReplayAddOnSum, usageSummaryDateOrg.rumSessionReplayAddOnSum)
        && Objects.equals(this.rumTotalSessionCountSum, usageSummaryDateOrg.rumTotalSessionCountSum)
        && Objects.equals(this.rumUnitsSum, usageSummaryDateOrg.rumUnitsSum)
        && Objects.equals(this.scaFargateCountAvg, usageSummaryDateOrg.scaFargateCountAvg)
        && Objects.equals(this.scaFargateCountHwm, usageSummaryDateOrg.scaFargateCountHwm)
        && Objects.equals(this.sdsApmScannedBytesSum, usageSummaryDateOrg.sdsApmScannedBytesSum)
        && Objects.equals(
            this.sdsEventsScannedBytesSum, usageSummaryDateOrg.sdsEventsScannedBytesSum)
        && Objects.equals(this.sdsLogsScannedBytesSum, usageSummaryDateOrg.sdsLogsScannedBytesSum)
        && Objects.equals(this.sdsRumScannedBytesSum, usageSummaryDateOrg.sdsRumScannedBytesSum)
        && Objects.equals(this.sdsTotalScannedBytesSum, usageSummaryDateOrg.sdsTotalScannedBytesSum)
        && Objects.equals(
            this.serverlessAppsApmApmAzureAppserviceInstancesAvg,
            usageSummaryDateOrg.serverlessAppsApmApmAzureAppserviceInstancesAvg)
        && Objects.equals(
            this.serverlessAppsApmApmAzureAzurefunctionInstancesAvg,
            usageSummaryDateOrg.serverlessAppsApmApmAzureAzurefunctionInstancesAvg)
        && Objects.equals(
            this.serverlessAppsApmApmAzureContainerappInstancesAvg,
            usageSummaryDateOrg.serverlessAppsApmApmAzureContainerappInstancesAvg)
        && Objects.equals(
            this.serverlessAppsApmApmFargateEcsTasksAvg,
            usageSummaryDateOrg.serverlessAppsApmApmFargateEcsTasksAvg)
        && Objects.equals(
            this.serverlessAppsApmApmGcpCloudfunctionInstancesAvg,
            usageSummaryDateOrg.serverlessAppsApmApmGcpCloudfunctionInstancesAvg)
        && Objects.equals(
            this.serverlessAppsApmApmGcpCloudrunInstancesAvg,
            usageSummaryDateOrg.serverlessAppsApmApmGcpCloudrunInstancesAvg)
        && Objects.equals(this.serverlessAppsApmAvg, usageSummaryDateOrg.serverlessAppsApmAvg)
        && Objects.equals(
            this.serverlessAppsApmExclFargateApmAzureAppserviceInstancesAvg,
            usageSummaryDateOrg.serverlessAppsApmExclFargateApmAzureAppserviceInstancesAvg)
        && Objects.equals(
            this.serverlessAppsApmExclFargateApmAzureAzurefunctionInstancesAvg,
            usageSummaryDateOrg.serverlessAppsApmExclFargateApmAzureAzurefunctionInstancesAvg)
        && Objects.equals(
            this.serverlessAppsApmExclFargateApmAzureContainerappInstancesAvg,
            usageSummaryDateOrg.serverlessAppsApmExclFargateApmAzureContainerappInstancesAvg)
        && Objects.equals(
            this.serverlessAppsApmExclFargateApmGcpCloudfunctionInstancesAvg,
            usageSummaryDateOrg.serverlessAppsApmExclFargateApmGcpCloudfunctionInstancesAvg)
        && Objects.equals(
            this.serverlessAppsApmExclFargateApmGcpCloudrunInstancesAvg,
            usageSummaryDateOrg.serverlessAppsApmExclFargateApmGcpCloudrunInstancesAvg)
        && Objects.equals(
            this.serverlessAppsApmExclFargateAvg,
            usageSummaryDateOrg.serverlessAppsApmExclFargateAvg)
        && Objects.equals(
            this.serverlessAppsAzureContainerAppInstancesAvg,
            usageSummaryDateOrg.serverlessAppsAzureContainerAppInstancesAvg)
        && Objects.equals(
            this.serverlessAppsAzureCountAvg, usageSummaryDateOrg.serverlessAppsAzureCountAvg)
        && Objects.equals(
            this.serverlessAppsAzureFunctionAppInstancesAvg,
            usageSummaryDateOrg.serverlessAppsAzureFunctionAppInstancesAvg)
        && Objects.equals(
            this.serverlessAppsAzureWebAppInstancesAvg,
            usageSummaryDateOrg.serverlessAppsAzureWebAppInstancesAvg)
        && Objects.equals(this.serverlessAppsEcsAvg, usageSummaryDateOrg.serverlessAppsEcsAvg)
        && Objects.equals(this.serverlessAppsEksAvg, usageSummaryDateOrg.serverlessAppsEksAvg)
        && Objects.equals(
            this.serverlessAppsExclFargateAvg, usageSummaryDateOrg.serverlessAppsExclFargateAvg)
        && Objects.equals(
            this.serverlessAppsExclFargateAzureContainerAppInstancesAvg,
            usageSummaryDateOrg.serverlessAppsExclFargateAzureContainerAppInstancesAvg)
        && Objects.equals(
            this.serverlessAppsExclFargateAzureFunctionAppInstancesAvg,
            usageSummaryDateOrg.serverlessAppsExclFargateAzureFunctionAppInstancesAvg)
        && Objects.equals(
            this.serverlessAppsExclFargateAzureWebAppInstancesAvg,
            usageSummaryDateOrg.serverlessAppsExclFargateAzureWebAppInstancesAvg)
        && Objects.equals(
            this.serverlessAppsExclFargateGoogleCloudFunctionsInstancesAvg,
            usageSummaryDateOrg.serverlessAppsExclFargateGoogleCloudFunctionsInstancesAvg)
        && Objects.equals(
            this.serverlessAppsExclFargateGoogleCloudRunInstancesAvg,
            usageSummaryDateOrg.serverlessAppsExclFargateGoogleCloudRunInstancesAvg)
        && Objects.equals(
            this.serverlessAppsGoogleCloudFunctionsInstancesAvg,
            usageSummaryDateOrg.serverlessAppsGoogleCloudFunctionsInstancesAvg)
        && Objects.equals(
            this.serverlessAppsGoogleCloudRunInstancesAvg,
            usageSummaryDateOrg.serverlessAppsGoogleCloudRunInstancesAvg)
        && Objects.equals(
            this.serverlessAppsGoogleCountAvg, usageSummaryDateOrg.serverlessAppsGoogleCountAvg)
        && Objects.equals(
            this.serverlessAppsTotalCountAvg, usageSummaryDateOrg.serverlessAppsTotalCountAvg)
        && Objects.equals(
            this.siemAnalyzedLogsAddOnCountSum, usageSummaryDateOrg.siemAnalyzedLogsAddOnCountSum)
        && Objects.equals(
            this.syntheticsBrowserCheckCallsCountSum,
            usageSummaryDateOrg.syntheticsBrowserCheckCallsCountSum)
        && Objects.equals(
            this.syntheticsCheckCallsCountSum, usageSummaryDateOrg.syntheticsCheckCallsCountSum)
        && Objects.equals(
            this.syntheticsMobileTestRunsSum, usageSummaryDateOrg.syntheticsMobileTestRunsSum)
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
        && Objects.equals(this.vsphereHostTop99p, usageSummaryDateOrg.vsphereHostTop99p)
        && Objects.equals(
            this.vulnManagementHostCountTop99p, usageSummaryDateOrg.vulnManagementHostCountTop99p)
        && Objects.equals(
            this.workflowExecutionsUsageSum, usageSummaryDateOrg.workflowExecutionsUsageSum)
        && Objects.equals(this.additionalProperties, usageSummaryDateOrg.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        accountName,
        accountPublicId,
        agentHostTop99p,
        apmAzureAppServiceHostTop99p,
        apmDevsecopsHostTop99p,
        apmEnterpriseStandaloneHostsTop99p,
        apmFargateCountAvg,
        apmHostTop99p,
        apmProStandaloneHostsTop99p,
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
        bitsAiInvestigationsSum,
        browserRumLiteSessionCountSum,
        browserRumReplaySessionCountSum,
        browserRumUnitsSum,
        ccmSpendMonitoredEntLast,
        ccmSpendMonitoredProLast,
        ciPipelineIndexedSpansSum,
        ciTestIndexedSpansSum,
        ciVisibilityItrCommittersHwm,
        ciVisibilityPipelineCommittersHwm,
        ciVisibilityTestCommittersHwm,
        cloudCostManagementAwsHostCountAvg,
        cloudCostManagementAzureHostCountAvg,
        cloudCostManagementGcpHostCountAvg,
        cloudCostManagementHostCountAvg,
        cloudCostManagementOciHostCountAvg,
        cloudSiemEventsSum,
        codeAnalysisSaCommittersHwm,
        codeAnalysisScaCommittersHwm,
        codeSecurityHostTop99p,
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
        customHistoricalTsAvg,
        customLiveTsAvg,
        customTsAvg,
        cwsContainerCountAvg,
        cwsFargateTaskAvg,
        cwsHostTop99p,
        dataJobsMonitoringHostHrSum,
        dbmHostTop99pSum,
        dbmQueriesAvgSum,
        ephInfraHostAgentSum,
        ephInfraHostAlibabaSum,
        ephInfraHostAwsSum,
        ephInfraHostAzureSum,
        ephInfraHostEntSum,
        ephInfraHostGcpSum,
        ephInfraHostHerokuSum,
        ephInfraHostOnlyAasSum,
        ephInfraHostOnlyVsphereSum,
        ephInfraHostOpentelemetryApmSum,
        ephInfraHostOpentelemetrySum,
        ephInfraHostProSum,
        ephInfraHostProplusSum,
        ephInfraHostProxmoxSum,
        errorTrackingApmErrorEventsSum,
        errorTrackingErrorEventsSum,
        errorTrackingEventsSum,
        errorTrackingRumErrorEventsSum,
        eventManagementCorrelationCorrelatedEventsSum,
        eventManagementCorrelationCorrelatedRelatedEventsSum,
        eventManagementCorrelationSum,
        fargateContainerProfilerProfilingFargateAvg,
        fargateContainerProfilerProfilingFargateEksAvg,
        fargateTasksCountAvg,
        fargateTasksCountHwm,
        flexLogsComputeLargeAvg,
        flexLogsComputeMediumAvg,
        flexLogsComputeSmallAvg,
        flexLogsComputeXlargeAvg,
        flexLogsComputeXsmallAvg,
        flexLogsStarterAvg,
        flexLogsStarterStorageIndexAvg,
        flexLogsStarterStorageRetentionAdjustmentAvg,
        flexStoredLogsAvg,
        forwardingEventsBytesSum,
        gcpHostTop99p,
        herokuHostTop99p,
        id,
        incidentManagementMonthlyActiveUsersHwm,
        incidentManagementSeatsHwm,
        indexedEventsCountSum,
        infraHostTop99p,
        ingestedEventsBytesSum,
        iotDeviceAggSum,
        iotDeviceTop99pSum,
        llmObservabilityMinSpendSum,
        llmObservabilitySum,
        mobileRumLiteSessionCountSum,
        mobileRumSessionCountAndroidSum,
        mobileRumSessionCountFlutterSum,
        mobileRumSessionCountIosSum,
        mobileRumSessionCountReactnativeSum,
        mobileRumSessionCountRokuSum,
        mobileRumSessionCountSum,
        mobileRumUnitsSum,
        name,
        ndmNetflowEventsSum,
        netflowIndexedEventsCountSum,
        networkDeviceWirelessTop99p,
        npmHostTop99p,
        observabilityPipelinesBytesProcessedSum,
        ociHostSum,
        ociHostTop99p,
        onCallSeatHwm,
        onlineArchiveEventsCountSum,
        opentelemetryApmHostTop99p,
        opentelemetryHostTop99p,
        productAnalyticsSum,
        profilingAasCountTop99p,
        profilingHostTop99p,
        proxmoxHostSum,
        proxmoxHostTop99p,
        publicId,
        publishedAppHwm,
        region,
        rumBrowserAndMobileSessionCount,
        rumBrowserLegacySessionCountSum,
        rumBrowserLiteSessionCountSum,
        rumBrowserReplaySessionCountSum,
        rumIndexedSessionsSum,
        rumIngestedSessionsSum,
        rumLiteSessionCountSum,
        rumMobileLegacySessionCountAndroidSum,
        rumMobileLegacySessionCountFlutterSum,
        rumMobileLegacySessionCountIosSum,
        rumMobileLegacySessionCountReactnativeSum,
        rumMobileLegacySessionCountRokuSum,
        rumMobileLiteSessionCountAndroidSum,
        rumMobileLiteSessionCountFlutterSum,
        rumMobileLiteSessionCountIosSum,
        rumMobileLiteSessionCountKotlinmultiplatformSum,
        rumMobileLiteSessionCountReactnativeSum,
        rumMobileLiteSessionCountRokuSum,
        rumMobileLiteSessionCountUnitySum,
        rumMobileReplaySessionCountAndroidSum,
        rumMobileReplaySessionCountIosSum,
        rumMobileReplaySessionCountKotlinmultiplatformSum,
        rumMobileReplaySessionCountReactnativeSum,
        rumReplaySessionCountSum,
        rumSessionCountSum,
        rumSessionReplayAddOnSum,
        rumTotalSessionCountSum,
        rumUnitsSum,
        scaFargateCountAvg,
        scaFargateCountHwm,
        sdsApmScannedBytesSum,
        sdsEventsScannedBytesSum,
        sdsLogsScannedBytesSum,
        sdsRumScannedBytesSum,
        sdsTotalScannedBytesSum,
        serverlessAppsApmApmAzureAppserviceInstancesAvg,
        serverlessAppsApmApmAzureAzurefunctionInstancesAvg,
        serverlessAppsApmApmAzureContainerappInstancesAvg,
        serverlessAppsApmApmFargateEcsTasksAvg,
        serverlessAppsApmApmGcpCloudfunctionInstancesAvg,
        serverlessAppsApmApmGcpCloudrunInstancesAvg,
        serverlessAppsApmAvg,
        serverlessAppsApmExclFargateApmAzureAppserviceInstancesAvg,
        serverlessAppsApmExclFargateApmAzureAzurefunctionInstancesAvg,
        serverlessAppsApmExclFargateApmAzureContainerappInstancesAvg,
        serverlessAppsApmExclFargateApmGcpCloudfunctionInstancesAvg,
        serverlessAppsApmExclFargateApmGcpCloudrunInstancesAvg,
        serverlessAppsApmExclFargateAvg,
        serverlessAppsAzureContainerAppInstancesAvg,
        serverlessAppsAzureCountAvg,
        serverlessAppsAzureFunctionAppInstancesAvg,
        serverlessAppsAzureWebAppInstancesAvg,
        serverlessAppsEcsAvg,
        serverlessAppsEksAvg,
        serverlessAppsExclFargateAvg,
        serverlessAppsExclFargateAzureContainerAppInstancesAvg,
        serverlessAppsExclFargateAzureFunctionAppInstancesAvg,
        serverlessAppsExclFargateAzureWebAppInstancesAvg,
        serverlessAppsExclFargateGoogleCloudFunctionsInstancesAvg,
        serverlessAppsExclFargateGoogleCloudRunInstancesAvg,
        serverlessAppsGoogleCloudFunctionsInstancesAvg,
        serverlessAppsGoogleCloudRunInstancesAvg,
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
    sb.append("class UsageSummaryDateOrg {\n");
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    accountPublicId: ").append(toIndentedString(accountPublicId)).append("\n");
    sb.append("    agentHostTop99p: ").append(toIndentedString(agentHostTop99p)).append("\n");
    sb.append("    apmAzureAppServiceHostTop99p: ")
        .append(toIndentedString(apmAzureAppServiceHostTop99p))
        .append("\n");
    sb.append("    apmDevsecopsHostTop99p: ")
        .append(toIndentedString(apmDevsecopsHostTop99p))
        .append("\n");
    sb.append("    apmEnterpriseStandaloneHostsTop99p: ")
        .append(toIndentedString(apmEnterpriseStandaloneHostsTop99p))
        .append("\n");
    sb.append("    apmFargateCountAvg: ").append(toIndentedString(apmFargateCountAvg)).append("\n");
    sb.append("    apmHostTop99p: ").append(toIndentedString(apmHostTop99p)).append("\n");
    sb.append("    apmProStandaloneHostsTop99p: ")
        .append(toIndentedString(apmProStandaloneHostsTop99p))
        .append("\n");
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
    sb.append("    bitsAiInvestigationsSum: ")
        .append(toIndentedString(bitsAiInvestigationsSum))
        .append("\n");
    sb.append("    browserRumLiteSessionCountSum: ")
        .append(toIndentedString(browserRumLiteSessionCountSum))
        .append("\n");
    sb.append("    browserRumReplaySessionCountSum: ")
        .append(toIndentedString(browserRumReplaySessionCountSum))
        .append("\n");
    sb.append("    browserRumUnitsSum: ").append(toIndentedString(browserRumUnitsSum)).append("\n");
    sb.append("    ccmSpendMonitoredEntLast: ")
        .append(toIndentedString(ccmSpendMonitoredEntLast))
        .append("\n");
    sb.append("    ccmSpendMonitoredProLast: ")
        .append(toIndentedString(ccmSpendMonitoredProLast))
        .append("\n");
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
    sb.append("    cloudCostManagementOciHostCountAvg: ")
        .append(toIndentedString(cloudCostManagementOciHostCountAvg))
        .append("\n");
    sb.append("    cloudSiemEventsSum: ").append(toIndentedString(cloudSiemEventsSum)).append("\n");
    sb.append("    codeAnalysisSaCommittersHwm: ")
        .append(toIndentedString(codeAnalysisSaCommittersHwm))
        .append("\n");
    sb.append("    codeAnalysisScaCommittersHwm: ")
        .append(toIndentedString(codeAnalysisScaCommittersHwm))
        .append("\n");
    sb.append("    codeSecurityHostTop99p: ")
        .append(toIndentedString(codeSecurityHostTop99p))
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
    sb.append("    customHistoricalTsAvg: ")
        .append(toIndentedString(customHistoricalTsAvg))
        .append("\n");
    sb.append("    customLiveTsAvg: ").append(toIndentedString(customLiveTsAvg)).append("\n");
    sb.append("    customTsAvg: ").append(toIndentedString(customTsAvg)).append("\n");
    sb.append("    cwsContainerCountAvg: ")
        .append(toIndentedString(cwsContainerCountAvg))
        .append("\n");
    sb.append("    cwsFargateTaskAvg: ").append(toIndentedString(cwsFargateTaskAvg)).append("\n");
    sb.append("    cwsHostTop99p: ").append(toIndentedString(cwsHostTop99p)).append("\n");
    sb.append("    dataJobsMonitoringHostHrSum: ")
        .append(toIndentedString(dataJobsMonitoringHostHrSum))
        .append("\n");
    sb.append("    dbmHostTop99pSum: ").append(toIndentedString(dbmHostTop99pSum)).append("\n");
    sb.append("    dbmQueriesAvgSum: ").append(toIndentedString(dbmQueriesAvgSum)).append("\n");
    sb.append("    ephInfraHostAgentSum: ")
        .append(toIndentedString(ephInfraHostAgentSum))
        .append("\n");
    sb.append("    ephInfraHostAlibabaSum: ")
        .append(toIndentedString(ephInfraHostAlibabaSum))
        .append("\n");
    sb.append("    ephInfraHostAwsSum: ").append(toIndentedString(ephInfraHostAwsSum)).append("\n");
    sb.append("    ephInfraHostAzureSum: ")
        .append(toIndentedString(ephInfraHostAzureSum))
        .append("\n");
    sb.append("    ephInfraHostEntSum: ").append(toIndentedString(ephInfraHostEntSum)).append("\n");
    sb.append("    ephInfraHostGcpSum: ").append(toIndentedString(ephInfraHostGcpSum)).append("\n");
    sb.append("    ephInfraHostHerokuSum: ")
        .append(toIndentedString(ephInfraHostHerokuSum))
        .append("\n");
    sb.append("    ephInfraHostOnlyAasSum: ")
        .append(toIndentedString(ephInfraHostOnlyAasSum))
        .append("\n");
    sb.append("    ephInfraHostOnlyVsphereSum: ")
        .append(toIndentedString(ephInfraHostOnlyVsphereSum))
        .append("\n");
    sb.append("    ephInfraHostOpentelemetryApmSum: ")
        .append(toIndentedString(ephInfraHostOpentelemetryApmSum))
        .append("\n");
    sb.append("    ephInfraHostOpentelemetrySum: ")
        .append(toIndentedString(ephInfraHostOpentelemetrySum))
        .append("\n");
    sb.append("    ephInfraHostProSum: ").append(toIndentedString(ephInfraHostProSum)).append("\n");
    sb.append("    ephInfraHostProplusSum: ")
        .append(toIndentedString(ephInfraHostProplusSum))
        .append("\n");
    sb.append("    ephInfraHostProxmoxSum: ")
        .append(toIndentedString(ephInfraHostProxmoxSum))
        .append("\n");
    sb.append("    errorTrackingApmErrorEventsSum: ")
        .append(toIndentedString(errorTrackingApmErrorEventsSum))
        .append("\n");
    sb.append("    errorTrackingErrorEventsSum: ")
        .append(toIndentedString(errorTrackingErrorEventsSum))
        .append("\n");
    sb.append("    errorTrackingEventsSum: ")
        .append(toIndentedString(errorTrackingEventsSum))
        .append("\n");
    sb.append("    errorTrackingRumErrorEventsSum: ")
        .append(toIndentedString(errorTrackingRumErrorEventsSum))
        .append("\n");
    sb.append("    eventManagementCorrelationCorrelatedEventsSum: ")
        .append(toIndentedString(eventManagementCorrelationCorrelatedEventsSum))
        .append("\n");
    sb.append("    eventManagementCorrelationCorrelatedRelatedEventsSum: ")
        .append(toIndentedString(eventManagementCorrelationCorrelatedRelatedEventsSum))
        .append("\n");
    sb.append("    eventManagementCorrelationSum: ")
        .append(toIndentedString(eventManagementCorrelationSum))
        .append("\n");
    sb.append("    fargateContainerProfilerProfilingFargateAvg: ")
        .append(toIndentedString(fargateContainerProfilerProfilingFargateAvg))
        .append("\n");
    sb.append("    fargateContainerProfilerProfilingFargateEksAvg: ")
        .append(toIndentedString(fargateContainerProfilerProfilingFargateEksAvg))
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
    sb.append("    flexLogsComputeXlargeAvg: ")
        .append(toIndentedString(flexLogsComputeXlargeAvg))
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
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    incidentManagementMonthlyActiveUsersHwm: ")
        .append(toIndentedString(incidentManagementMonthlyActiveUsersHwm))
        .append("\n");
    sb.append("    incidentManagementSeatsHwm: ")
        .append(toIndentedString(incidentManagementSeatsHwm))
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
    sb.append("    llmObservabilityMinSpendSum: ")
        .append(toIndentedString(llmObservabilityMinSpendSum))
        .append("\n");
    sb.append("    llmObservabilitySum: ")
        .append(toIndentedString(llmObservabilitySum))
        .append("\n");
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
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ndmNetflowEventsSum: ")
        .append(toIndentedString(ndmNetflowEventsSum))
        .append("\n");
    sb.append("    netflowIndexedEventsCountSum: ")
        .append(toIndentedString(netflowIndexedEventsCountSum))
        .append("\n");
    sb.append("    networkDeviceWirelessTop99p: ")
        .append(toIndentedString(networkDeviceWirelessTop99p))
        .append("\n");
    sb.append("    npmHostTop99p: ").append(toIndentedString(npmHostTop99p)).append("\n");
    sb.append("    observabilityPipelinesBytesProcessedSum: ")
        .append(toIndentedString(observabilityPipelinesBytesProcessedSum))
        .append("\n");
    sb.append("    ociHostSum: ").append(toIndentedString(ociHostSum)).append("\n");
    sb.append("    ociHostTop99p: ").append(toIndentedString(ociHostTop99p)).append("\n");
    sb.append("    onCallSeatHwm: ").append(toIndentedString(onCallSeatHwm)).append("\n");
    sb.append("    onlineArchiveEventsCountSum: ")
        .append(toIndentedString(onlineArchiveEventsCountSum))
        .append("\n");
    sb.append("    opentelemetryApmHostTop99p: ")
        .append(toIndentedString(opentelemetryApmHostTop99p))
        .append("\n");
    sb.append("    opentelemetryHostTop99p: ")
        .append(toIndentedString(opentelemetryHostTop99p))
        .append("\n");
    sb.append("    productAnalyticsSum: ")
        .append(toIndentedString(productAnalyticsSum))
        .append("\n");
    sb.append("    profilingAasCountTop99p: ")
        .append(toIndentedString(profilingAasCountTop99p))
        .append("\n");
    sb.append("    profilingHostTop99p: ")
        .append(toIndentedString(profilingHostTop99p))
        .append("\n");
    sb.append("    proxmoxHostSum: ").append(toIndentedString(proxmoxHostSum)).append("\n");
    sb.append("    proxmoxHostTop99p: ").append(toIndentedString(proxmoxHostTop99p)).append("\n");
    sb.append("    publicId: ").append(toIndentedString(publicId)).append("\n");
    sb.append("    publishedAppHwm: ").append(toIndentedString(publishedAppHwm)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
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
    sb.append("    rumIndexedSessionsSum: ")
        .append(toIndentedString(rumIndexedSessionsSum))
        .append("\n");
    sb.append("    rumIngestedSessionsSum: ")
        .append(toIndentedString(rumIngestedSessionsSum))
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
    sb.append("    rumMobileLiteSessionCountKotlinmultiplatformSum: ")
        .append(toIndentedString(rumMobileLiteSessionCountKotlinmultiplatformSum))
        .append("\n");
    sb.append("    rumMobileLiteSessionCountReactnativeSum: ")
        .append(toIndentedString(rumMobileLiteSessionCountReactnativeSum))
        .append("\n");
    sb.append("    rumMobileLiteSessionCountRokuSum: ")
        .append(toIndentedString(rumMobileLiteSessionCountRokuSum))
        .append("\n");
    sb.append("    rumMobileLiteSessionCountUnitySum: ")
        .append(toIndentedString(rumMobileLiteSessionCountUnitySum))
        .append("\n");
    sb.append("    rumMobileReplaySessionCountAndroidSum: ")
        .append(toIndentedString(rumMobileReplaySessionCountAndroidSum))
        .append("\n");
    sb.append("    rumMobileReplaySessionCountIosSum: ")
        .append(toIndentedString(rumMobileReplaySessionCountIosSum))
        .append("\n");
    sb.append("    rumMobileReplaySessionCountKotlinmultiplatformSum: ")
        .append(toIndentedString(rumMobileReplaySessionCountKotlinmultiplatformSum))
        .append("\n");
    sb.append("    rumMobileReplaySessionCountReactnativeSum: ")
        .append(toIndentedString(rumMobileReplaySessionCountReactnativeSum))
        .append("\n");
    sb.append("    rumReplaySessionCountSum: ")
        .append(toIndentedString(rumReplaySessionCountSum))
        .append("\n");
    sb.append("    rumSessionCountSum: ").append(toIndentedString(rumSessionCountSum)).append("\n");
    sb.append("    rumSessionReplayAddOnSum: ")
        .append(toIndentedString(rumSessionReplayAddOnSum))
        .append("\n");
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
    sb.append("    serverlessAppsApmApmAzureAppserviceInstancesAvg: ")
        .append(toIndentedString(serverlessAppsApmApmAzureAppserviceInstancesAvg))
        .append("\n");
    sb.append("    serverlessAppsApmApmAzureAzurefunctionInstancesAvg: ")
        .append(toIndentedString(serverlessAppsApmApmAzureAzurefunctionInstancesAvg))
        .append("\n");
    sb.append("    serverlessAppsApmApmAzureContainerappInstancesAvg: ")
        .append(toIndentedString(serverlessAppsApmApmAzureContainerappInstancesAvg))
        .append("\n");
    sb.append("    serverlessAppsApmApmFargateEcsTasksAvg: ")
        .append(toIndentedString(serverlessAppsApmApmFargateEcsTasksAvg))
        .append("\n");
    sb.append("    serverlessAppsApmApmGcpCloudfunctionInstancesAvg: ")
        .append(toIndentedString(serverlessAppsApmApmGcpCloudfunctionInstancesAvg))
        .append("\n");
    sb.append("    serverlessAppsApmApmGcpCloudrunInstancesAvg: ")
        .append(toIndentedString(serverlessAppsApmApmGcpCloudrunInstancesAvg))
        .append("\n");
    sb.append("    serverlessAppsApmAvg: ")
        .append(toIndentedString(serverlessAppsApmAvg))
        .append("\n");
    sb.append("    serverlessAppsApmExclFargateApmAzureAppserviceInstancesAvg: ")
        .append(toIndentedString(serverlessAppsApmExclFargateApmAzureAppserviceInstancesAvg))
        .append("\n");
    sb.append("    serverlessAppsApmExclFargateApmAzureAzurefunctionInstancesAvg: ")
        .append(toIndentedString(serverlessAppsApmExclFargateApmAzureAzurefunctionInstancesAvg))
        .append("\n");
    sb.append("    serverlessAppsApmExclFargateApmAzureContainerappInstancesAvg: ")
        .append(toIndentedString(serverlessAppsApmExclFargateApmAzureContainerappInstancesAvg))
        .append("\n");
    sb.append("    serverlessAppsApmExclFargateApmGcpCloudfunctionInstancesAvg: ")
        .append(toIndentedString(serverlessAppsApmExclFargateApmGcpCloudfunctionInstancesAvg))
        .append("\n");
    sb.append("    serverlessAppsApmExclFargateApmGcpCloudrunInstancesAvg: ")
        .append(toIndentedString(serverlessAppsApmExclFargateApmGcpCloudrunInstancesAvg))
        .append("\n");
    sb.append("    serverlessAppsApmExclFargateAvg: ")
        .append(toIndentedString(serverlessAppsApmExclFargateAvg))
        .append("\n");
    sb.append("    serverlessAppsAzureContainerAppInstancesAvg: ")
        .append(toIndentedString(serverlessAppsAzureContainerAppInstancesAvg))
        .append("\n");
    sb.append("    serverlessAppsAzureCountAvg: ")
        .append(toIndentedString(serverlessAppsAzureCountAvg))
        .append("\n");
    sb.append("    serverlessAppsAzureFunctionAppInstancesAvg: ")
        .append(toIndentedString(serverlessAppsAzureFunctionAppInstancesAvg))
        .append("\n");
    sb.append("    serverlessAppsAzureWebAppInstancesAvg: ")
        .append(toIndentedString(serverlessAppsAzureWebAppInstancesAvg))
        .append("\n");
    sb.append("    serverlessAppsEcsAvg: ")
        .append(toIndentedString(serverlessAppsEcsAvg))
        .append("\n");
    sb.append("    serverlessAppsEksAvg: ")
        .append(toIndentedString(serverlessAppsEksAvg))
        .append("\n");
    sb.append("    serverlessAppsExclFargateAvg: ")
        .append(toIndentedString(serverlessAppsExclFargateAvg))
        .append("\n");
    sb.append("    serverlessAppsExclFargateAzureContainerAppInstancesAvg: ")
        .append(toIndentedString(serverlessAppsExclFargateAzureContainerAppInstancesAvg))
        .append("\n");
    sb.append("    serverlessAppsExclFargateAzureFunctionAppInstancesAvg: ")
        .append(toIndentedString(serverlessAppsExclFargateAzureFunctionAppInstancesAvg))
        .append("\n");
    sb.append("    serverlessAppsExclFargateAzureWebAppInstancesAvg: ")
        .append(toIndentedString(serverlessAppsExclFargateAzureWebAppInstancesAvg))
        .append("\n");
    sb.append("    serverlessAppsExclFargateGoogleCloudFunctionsInstancesAvg: ")
        .append(toIndentedString(serverlessAppsExclFargateGoogleCloudFunctionsInstancesAvg))
        .append("\n");
    sb.append("    serverlessAppsExclFargateGoogleCloudRunInstancesAvg: ")
        .append(toIndentedString(serverlessAppsExclFargateGoogleCloudRunInstancesAvg))
        .append("\n");
    sb.append("    serverlessAppsGoogleCloudFunctionsInstancesAvg: ")
        .append(toIndentedString(serverlessAppsGoogleCloudFunctionsInstancesAvg))
        .append("\n");
    sb.append("    serverlessAppsGoogleCloudRunInstancesAvg: ")
        .append(toIndentedString(serverlessAppsGoogleCloudRunInstancesAvg))
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
