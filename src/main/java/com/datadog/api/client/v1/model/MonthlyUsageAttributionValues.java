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

/**
 * Fields in Usage Summary by tag(s). The following values have been <strong>deprecated</strong>:
 * <code>estimated_indexed_spans_usage</code>, <code>estimated_indexed_spans_percentage</code>,
 * <code>estimated_ingested_spans_usage</code>, <code>estimated_ingested_spans_percentage</code>.
 */
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
  MonthlyUsageAttributionValues.JSON_PROPERTY_ASM_SERVERLESS_TRACED_INVOCATIONS_PERCENTAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_ASM_SERVERLESS_TRACED_INVOCATIONS_USAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_BROWSER_PERCENTAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_BROWSER_USAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_CI_PIPELINE_INDEXED_SPANS_PERCENTAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_CI_PIPELINE_INDEXED_SPANS_USAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_CI_TEST_INDEXED_SPANS_PERCENTAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_CI_TEST_INDEXED_SPANS_USAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_CI_VISIBILITY_ITR_PERCENTAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_CI_VISIBILITY_ITR_USAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_CLOUD_SIEM_PERCENTAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_CLOUD_SIEM_USAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_CODE_SECURITY_HOST_PERCENTAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_CODE_SECURITY_HOST_USAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_CONTAINER_EXCL_AGENT_PERCENTAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_CONTAINER_EXCL_AGENT_USAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_CONTAINER_PERCENTAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_CONTAINER_USAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_CSPM_CONTAINERS_PERCENTAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_CSPM_CONTAINERS_USAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_CSPM_HOSTS_PERCENTAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_CSPM_HOSTS_USAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_CUSTOM_EVENT_PERCENTAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_CUSTOM_EVENT_USAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_CUSTOM_INGESTED_TIMESERIES_PERCENTAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_CUSTOM_INGESTED_TIMESERIES_USAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_CUSTOM_TIMESERIES_PERCENTAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_CUSTOM_TIMESERIES_USAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_CWS_CONTAINERS_PERCENTAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_CWS_CONTAINERS_USAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_CWS_FARGATE_TASK_PERCENTAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_CWS_FARGATE_TASK_USAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_CWS_HOSTS_PERCENTAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_CWS_HOSTS_USAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_DATA_JOBS_MONITORING_USAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_DATA_STREAM_MONITORING_USAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_DBM_HOSTS_PERCENTAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_DBM_HOSTS_USAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_DBM_QUERIES_PERCENTAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_DBM_QUERIES_USAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_ERROR_TRACKING_PERCENTAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_ERROR_TRACKING_USAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_ESTIMATED_INDEXED_SPANS_PERCENTAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_ESTIMATED_INDEXED_SPANS_USAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_ESTIMATED_INGESTED_SPANS_PERCENTAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_ESTIMATED_INGESTED_SPANS_USAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_FARGATE_PERCENTAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_FARGATE_USAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_FUNCTIONS_PERCENTAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_FUNCTIONS_USAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_INCIDENT_MANAGEMENT_MONTHLY_ACTIVE_USERS_PERCENTAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_INCIDENT_MANAGEMENT_MONTHLY_ACTIVE_USERS_USAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_INDEXED_SPANS_PERCENTAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_INDEXED_SPANS_USAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_INFRA_HOST_PERCENTAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_INFRA_HOST_USAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_INGESTED_LOGS_BYTES_PERCENTAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_INGESTED_LOGS_BYTES_USAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_INGESTED_SPANS_BYTES_PERCENTAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_INGESTED_SPANS_BYTES_USAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_INVOCATIONS_PERCENTAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_INVOCATIONS_USAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_LAMBDA_TRACED_INVOCATIONS_PERCENTAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_LAMBDA_TRACED_INVOCATIONS_USAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_LLM_OBSERVABILITY_PERCENTAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_LLM_OBSERVABILITY_USAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_LLM_SPANS_PERCENTAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_LLM_SPANS_USAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_LOGS_INDEXED_15DAY_PERCENTAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_LOGS_INDEXED_15DAY_USAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_LOGS_INDEXED_180DAY_PERCENTAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_LOGS_INDEXED_180DAY_USAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_LOGS_INDEXED_1DAY_PERCENTAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_LOGS_INDEXED_1DAY_USAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_LOGS_INDEXED_30DAY_PERCENTAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_LOGS_INDEXED_30DAY_USAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_LOGS_INDEXED_360DAY_PERCENTAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_LOGS_INDEXED_360DAY_USAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_LOGS_INDEXED_3DAY_PERCENTAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_LOGS_INDEXED_3DAY_USAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_LOGS_INDEXED_45DAY_PERCENTAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_LOGS_INDEXED_45DAY_USAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_LOGS_INDEXED_60DAY_PERCENTAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_LOGS_INDEXED_60DAY_USAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_LOGS_INDEXED_7DAY_PERCENTAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_LOGS_INDEXED_7DAY_USAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_LOGS_INDEXED_90DAY_PERCENTAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_LOGS_INDEXED_90DAY_USAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_LOGS_INDEXED_CUSTOM_RETENTION_PERCENTAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_LOGS_INDEXED_CUSTOM_RETENTION_USAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_MOBILE_APP_TESTING_PERCENTAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_MOBILE_APP_TESTING_USAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_NDM_NETFLOW_PERCENTAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_NDM_NETFLOW_USAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_NETWORK_DEVICE_WIRELESS_PERCENTAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_NETWORK_DEVICE_WIRELESS_USAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_NPM_HOST_PERCENTAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_NPM_HOST_USAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_OBS_PIPELINE_BYTES_PERCENTAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_OBS_PIPELINE_BYTES_USAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_OBS_PIPELINES_VCPU_PERCENTAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_OBS_PIPELINES_VCPU_USAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_ONLINE_ARCHIVE_PERCENTAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_ONLINE_ARCHIVE_USAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_PRODUCT_ANALYTICS_SESSION_PERCENTAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_PRODUCT_ANALYTICS_SESSION_USAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_PROFILED_CONTAINER_PERCENTAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_PROFILED_CONTAINER_USAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_PROFILED_FARGATE_PERCENTAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_PROFILED_FARGATE_USAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_PROFILED_HOST_PERCENTAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_PROFILED_HOST_USAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_PUBLISHED_APP_PERCENTAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_PUBLISHED_APP_USAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_RUM_BROWSER_MOBILE_SESSIONS_PERCENTAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_RUM_BROWSER_MOBILE_SESSIONS_USAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_RUM_INGESTED_PERCENTAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_RUM_INGESTED_USAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_RUM_INVESTIGATE_PERCENTAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_RUM_INVESTIGATE_USAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_RUM_REPLAY_SESSIONS_PERCENTAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_RUM_REPLAY_SESSIONS_USAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_RUM_SESSION_REPLAY_ADD_ON_PERCENTAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_RUM_SESSION_REPLAY_ADD_ON_USAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_SCA_FARGATE_PERCENTAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_SCA_FARGATE_USAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_SDS_SCANNED_BYTES_PERCENTAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_SDS_SCANNED_BYTES_USAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_SERVERLESS_APPS_PERCENTAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_SERVERLESS_APPS_USAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_SIEM_ANALYZED_LOGS_ADD_ON_PERCENTAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_SIEM_ANALYZED_LOGS_ADD_ON_USAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_SIEM_INGESTED_BYTES_PERCENTAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_SIEM_INGESTED_BYTES_USAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_SNMP_PERCENTAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_SNMP_USAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_UNIVERSAL_SERVICE_MONITORING_PERCENTAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_UNIVERSAL_SERVICE_MONITORING_USAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_VULN_MANAGEMENT_HOSTS_PERCENTAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_VULN_MANAGEMENT_HOSTS_USAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_WORKFLOW_EXECUTIONS_PERCENTAGE,
  MonthlyUsageAttributionValues.JSON_PROPERTY_WORKFLOW_EXECUTIONS_USAGE
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

  public static final String JSON_PROPERTY_ASM_SERVERLESS_TRACED_INVOCATIONS_PERCENTAGE =
      "asm_serverless_traced_invocations_percentage";
  private Double asmServerlessTracedInvocationsPercentage;

  public static final String JSON_PROPERTY_ASM_SERVERLESS_TRACED_INVOCATIONS_USAGE =
      "asm_serverless_traced_invocations_usage";
  private Double asmServerlessTracedInvocationsUsage;

  public static final String JSON_PROPERTY_BROWSER_PERCENTAGE = "browser_percentage";
  private Double browserPercentage;

  public static final String JSON_PROPERTY_BROWSER_USAGE = "browser_usage";
  private Double browserUsage;

  public static final String JSON_PROPERTY_CI_PIPELINE_INDEXED_SPANS_PERCENTAGE =
      "ci_pipeline_indexed_spans_percentage";
  private Double ciPipelineIndexedSpansPercentage;

  public static final String JSON_PROPERTY_CI_PIPELINE_INDEXED_SPANS_USAGE =
      "ci_pipeline_indexed_spans_usage";
  private Double ciPipelineIndexedSpansUsage;

  public static final String JSON_PROPERTY_CI_TEST_INDEXED_SPANS_PERCENTAGE =
      "ci_test_indexed_spans_percentage";
  private Double ciTestIndexedSpansPercentage;

  public static final String JSON_PROPERTY_CI_TEST_INDEXED_SPANS_USAGE =
      "ci_test_indexed_spans_usage";
  private Double ciTestIndexedSpansUsage;

  public static final String JSON_PROPERTY_CI_VISIBILITY_ITR_PERCENTAGE =
      "ci_visibility_itr_percentage";
  private Double ciVisibilityItrPercentage;

  public static final String JSON_PROPERTY_CI_VISIBILITY_ITR_USAGE = "ci_visibility_itr_usage";
  private Double ciVisibilityItrUsage;

  public static final String JSON_PROPERTY_CLOUD_SIEM_PERCENTAGE = "cloud_siem_percentage";
  private Double cloudSiemPercentage;

  public static final String JSON_PROPERTY_CLOUD_SIEM_USAGE = "cloud_siem_usage";
  private Double cloudSiemUsage;

  public static final String JSON_PROPERTY_CODE_SECURITY_HOST_PERCENTAGE =
      "code_security_host_percentage";
  private Double codeSecurityHostPercentage;

  public static final String JSON_PROPERTY_CODE_SECURITY_HOST_USAGE = "code_security_host_usage";
  private Double codeSecurityHostUsage;

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

  public static final String JSON_PROPERTY_CUSTOM_EVENT_PERCENTAGE = "custom_event_percentage";
  private Double customEventPercentage;

  public static final String JSON_PROPERTY_CUSTOM_EVENT_USAGE = "custom_event_usage";
  private Double customEventUsage;

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

  public static final String JSON_PROPERTY_CWS_FARGATE_TASK_PERCENTAGE =
      "cws_fargate_task_percentage";
  private Double cwsFargateTaskPercentage;

  public static final String JSON_PROPERTY_CWS_FARGATE_TASK_USAGE = "cws_fargate_task_usage";
  private Double cwsFargateTaskUsage;

  public static final String JSON_PROPERTY_CWS_HOSTS_PERCENTAGE = "cws_hosts_percentage";
  private Double cwsHostsPercentage;

  public static final String JSON_PROPERTY_CWS_HOSTS_USAGE = "cws_hosts_usage";
  private Double cwsHostsUsage;

  public static final String JSON_PROPERTY_DATA_JOBS_MONITORING_USAGE =
      "data_jobs_monitoring_usage";
  private Double dataJobsMonitoringUsage;

  public static final String JSON_PROPERTY_DATA_STREAM_MONITORING_USAGE =
      "data_stream_monitoring_usage";
  private Double dataStreamMonitoringUsage;

  public static final String JSON_PROPERTY_DBM_HOSTS_PERCENTAGE = "dbm_hosts_percentage";
  private Double dbmHostsPercentage;

  public static final String JSON_PROPERTY_DBM_HOSTS_USAGE = "dbm_hosts_usage";
  private Double dbmHostsUsage;

  public static final String JSON_PROPERTY_DBM_QUERIES_PERCENTAGE = "dbm_queries_percentage";
  private Double dbmQueriesPercentage;

  public static final String JSON_PROPERTY_DBM_QUERIES_USAGE = "dbm_queries_usage";
  private Double dbmQueriesUsage;

  public static final String JSON_PROPERTY_ERROR_TRACKING_PERCENTAGE = "error_tracking_percentage";
  private Double errorTrackingPercentage;

  public static final String JSON_PROPERTY_ERROR_TRACKING_USAGE = "error_tracking_usage";
  private Double errorTrackingUsage;

  public static final String JSON_PROPERTY_ESTIMATED_INDEXED_SPANS_PERCENTAGE =
      "estimated_indexed_spans_percentage";
  private Double estimatedIndexedSpansPercentage;

  public static final String JSON_PROPERTY_ESTIMATED_INDEXED_SPANS_USAGE =
      "estimated_indexed_spans_usage";
  private Double estimatedIndexedSpansUsage;

  public static final String JSON_PROPERTY_ESTIMATED_INGESTED_SPANS_PERCENTAGE =
      "estimated_ingested_spans_percentage";
  private Double estimatedIngestedSpansPercentage;

  public static final String JSON_PROPERTY_ESTIMATED_INGESTED_SPANS_USAGE =
      "estimated_ingested_spans_usage";
  private Double estimatedIngestedSpansUsage;

  public static final String JSON_PROPERTY_FARGATE_PERCENTAGE = "fargate_percentage";
  private Double fargatePercentage;

  public static final String JSON_PROPERTY_FARGATE_USAGE = "fargate_usage";
  private Double fargateUsage;

  public static final String JSON_PROPERTY_FUNCTIONS_PERCENTAGE = "functions_percentage";
  private Double functionsPercentage;

  public static final String JSON_PROPERTY_FUNCTIONS_USAGE = "functions_usage";
  private Double functionsUsage;

  public static final String JSON_PROPERTY_INCIDENT_MANAGEMENT_MONTHLY_ACTIVE_USERS_PERCENTAGE =
      "incident_management_monthly_active_users_percentage";
  private Double incidentManagementMonthlyActiveUsersPercentage;

  public static final String JSON_PROPERTY_INCIDENT_MANAGEMENT_MONTHLY_ACTIVE_USERS_USAGE =
      "incident_management_monthly_active_users_usage";
  private Double incidentManagementMonthlyActiveUsersUsage;

  public static final String JSON_PROPERTY_INDEXED_SPANS_PERCENTAGE = "indexed_spans_percentage";
  private Double indexedSpansPercentage;

  public static final String JSON_PROPERTY_INDEXED_SPANS_USAGE = "indexed_spans_usage";
  private Double indexedSpansUsage;

  public static final String JSON_PROPERTY_INFRA_HOST_PERCENTAGE = "infra_host_percentage";
  private Double infraHostPercentage;

  public static final String JSON_PROPERTY_INFRA_HOST_USAGE = "infra_host_usage";
  private Double infraHostUsage;

  public static final String JSON_PROPERTY_INGESTED_LOGS_BYTES_PERCENTAGE =
      "ingested_logs_bytes_percentage";
  private Double ingestedLogsBytesPercentage;

  public static final String JSON_PROPERTY_INGESTED_LOGS_BYTES_USAGE = "ingested_logs_bytes_usage";
  private Double ingestedLogsBytesUsage;

  public static final String JSON_PROPERTY_INGESTED_SPANS_BYTES_PERCENTAGE =
      "ingested_spans_bytes_percentage";
  private Double ingestedSpansBytesPercentage;

  public static final String JSON_PROPERTY_INGESTED_SPANS_BYTES_USAGE =
      "ingested_spans_bytes_usage";
  private Double ingestedSpansBytesUsage;

  public static final String JSON_PROPERTY_INVOCATIONS_PERCENTAGE = "invocations_percentage";
  private Double invocationsPercentage;

  public static final String JSON_PROPERTY_INVOCATIONS_USAGE = "invocations_usage";
  private Double invocationsUsage;

  public static final String JSON_PROPERTY_LAMBDA_TRACED_INVOCATIONS_PERCENTAGE =
      "lambda_traced_invocations_percentage";
  private Double lambdaTracedInvocationsPercentage;

  public static final String JSON_PROPERTY_LAMBDA_TRACED_INVOCATIONS_USAGE =
      "lambda_traced_invocations_usage";
  private Double lambdaTracedInvocationsUsage;

  public static final String JSON_PROPERTY_LLM_OBSERVABILITY_PERCENTAGE =
      "llm_observability_percentage";
  private Double llmObservabilityPercentage;

  public static final String JSON_PROPERTY_LLM_OBSERVABILITY_USAGE = "llm_observability_usage";
  private Double llmObservabilityUsage;

  public static final String JSON_PROPERTY_LLM_SPANS_PERCENTAGE = "llm_spans_percentage";
  private Double llmSpansPercentage;

  public static final String JSON_PROPERTY_LLM_SPANS_USAGE = "llm_spans_usage";
  private Double llmSpansUsage;

  public static final String JSON_PROPERTY_LOGS_INDEXED_15DAY_PERCENTAGE =
      "logs_indexed_15day_percentage";
  private Double logsIndexed15dayPercentage;

  public static final String JSON_PROPERTY_LOGS_INDEXED_15DAY_USAGE = "logs_indexed_15day_usage";
  private Double logsIndexed15dayUsage;

  public static final String JSON_PROPERTY_LOGS_INDEXED_180DAY_PERCENTAGE =
      "logs_indexed_180day_percentage";
  private Double logsIndexed180dayPercentage;

  public static final String JSON_PROPERTY_LOGS_INDEXED_180DAY_USAGE = "logs_indexed_180day_usage";
  private Double logsIndexed180dayUsage;

  public static final String JSON_PROPERTY_LOGS_INDEXED_1DAY_PERCENTAGE =
      "logs_indexed_1day_percentage";
  private Double logsIndexed1dayPercentage;

  public static final String JSON_PROPERTY_LOGS_INDEXED_1DAY_USAGE = "logs_indexed_1day_usage";
  private Double logsIndexed1dayUsage;

  public static final String JSON_PROPERTY_LOGS_INDEXED_30DAY_PERCENTAGE =
      "logs_indexed_30day_percentage";
  private Double logsIndexed30dayPercentage;

  public static final String JSON_PROPERTY_LOGS_INDEXED_30DAY_USAGE = "logs_indexed_30day_usage";
  private Double logsIndexed30dayUsage;

  public static final String JSON_PROPERTY_LOGS_INDEXED_360DAY_PERCENTAGE =
      "logs_indexed_360day_percentage";
  private Double logsIndexed360dayPercentage;

  public static final String JSON_PROPERTY_LOGS_INDEXED_360DAY_USAGE = "logs_indexed_360day_usage";
  private Double logsIndexed360dayUsage;

  public static final String JSON_PROPERTY_LOGS_INDEXED_3DAY_PERCENTAGE =
      "logs_indexed_3day_percentage";
  private Double logsIndexed3dayPercentage;

  public static final String JSON_PROPERTY_LOGS_INDEXED_3DAY_USAGE = "logs_indexed_3day_usage";
  private Double logsIndexed3dayUsage;

  public static final String JSON_PROPERTY_LOGS_INDEXED_45DAY_PERCENTAGE =
      "logs_indexed_45day_percentage";
  private Double logsIndexed45dayPercentage;

  public static final String JSON_PROPERTY_LOGS_INDEXED_45DAY_USAGE = "logs_indexed_45day_usage";
  private Double logsIndexed45dayUsage;

  public static final String JSON_PROPERTY_LOGS_INDEXED_60DAY_PERCENTAGE =
      "logs_indexed_60day_percentage";
  private Double logsIndexed60dayPercentage;

  public static final String JSON_PROPERTY_LOGS_INDEXED_60DAY_USAGE = "logs_indexed_60day_usage";
  private Double logsIndexed60dayUsage;

  public static final String JSON_PROPERTY_LOGS_INDEXED_7DAY_PERCENTAGE =
      "logs_indexed_7day_percentage";
  private Double logsIndexed7dayPercentage;

  public static final String JSON_PROPERTY_LOGS_INDEXED_7DAY_USAGE = "logs_indexed_7day_usage";
  private Double logsIndexed7dayUsage;

  public static final String JSON_PROPERTY_LOGS_INDEXED_90DAY_PERCENTAGE =
      "logs_indexed_90day_percentage";
  private Double logsIndexed90dayPercentage;

  public static final String JSON_PROPERTY_LOGS_INDEXED_90DAY_USAGE = "logs_indexed_90day_usage";
  private Double logsIndexed90dayUsage;

  public static final String JSON_PROPERTY_LOGS_INDEXED_CUSTOM_RETENTION_PERCENTAGE =
      "logs_indexed_custom_retention_percentage";
  private Double logsIndexedCustomRetentionPercentage;

  public static final String JSON_PROPERTY_LOGS_INDEXED_CUSTOM_RETENTION_USAGE =
      "logs_indexed_custom_retention_usage";
  private Double logsIndexedCustomRetentionUsage;

  public static final String JSON_PROPERTY_MOBILE_APP_TESTING_PERCENTAGE =
      "mobile_app_testing_percentage";
  private Double mobileAppTestingPercentage;

  public static final String JSON_PROPERTY_MOBILE_APP_TESTING_USAGE = "mobile_app_testing_usage";
  private Double mobileAppTestingUsage;

  public static final String JSON_PROPERTY_NDM_NETFLOW_PERCENTAGE = "ndm_netflow_percentage";
  private Double ndmNetflowPercentage;

  public static final String JSON_PROPERTY_NDM_NETFLOW_USAGE = "ndm_netflow_usage";
  private Double ndmNetflowUsage;

  public static final String JSON_PROPERTY_NETWORK_DEVICE_WIRELESS_PERCENTAGE =
      "network_device_wireless_percentage";
  private Double networkDeviceWirelessPercentage;

  public static final String JSON_PROPERTY_NETWORK_DEVICE_WIRELESS_USAGE =
      "network_device_wireless_usage";
  private Double networkDeviceWirelessUsage;

  public static final String JSON_PROPERTY_NPM_HOST_PERCENTAGE = "npm_host_percentage";
  private Double npmHostPercentage;

  public static final String JSON_PROPERTY_NPM_HOST_USAGE = "npm_host_usage";
  private Double npmHostUsage;

  public static final String JSON_PROPERTY_OBS_PIPELINE_BYTES_PERCENTAGE =
      "obs_pipeline_bytes_percentage";
  private Double obsPipelineBytesPercentage;

  public static final String JSON_PROPERTY_OBS_PIPELINE_BYTES_USAGE = "obs_pipeline_bytes_usage";
  private Double obsPipelineBytesUsage;

  public static final String JSON_PROPERTY_OBS_PIPELINES_VCPU_PERCENTAGE =
      "obs_pipelines_vcpu_percentage";
  private Double obsPipelinesVcpuPercentage;

  public static final String JSON_PROPERTY_OBS_PIPELINES_VCPU_USAGE = "obs_pipelines_vcpu_usage";
  private Double obsPipelinesVcpuUsage;

  public static final String JSON_PROPERTY_ONLINE_ARCHIVE_PERCENTAGE = "online_archive_percentage";
  private Double onlineArchivePercentage;

  public static final String JSON_PROPERTY_ONLINE_ARCHIVE_USAGE = "online_archive_usage";
  private Double onlineArchiveUsage;

  public static final String JSON_PROPERTY_PRODUCT_ANALYTICS_SESSION_PERCENTAGE =
      "product_analytics_session_percentage";
  private Double productAnalyticsSessionPercentage;

  public static final String JSON_PROPERTY_PRODUCT_ANALYTICS_SESSION_USAGE =
      "product_analytics_session_usage";
  private Double productAnalyticsSessionUsage;

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

  public static final String JSON_PROPERTY_PUBLISHED_APP_PERCENTAGE = "published_app_percentage";
  private Double publishedAppPercentage;

  public static final String JSON_PROPERTY_PUBLISHED_APP_USAGE = "published_app_usage";
  private Double publishedAppUsage;

  public static final String JSON_PROPERTY_RUM_BROWSER_MOBILE_SESSIONS_PERCENTAGE =
      "rum_browser_mobile_sessions_percentage";
  private Double rumBrowserMobileSessionsPercentage;

  public static final String JSON_PROPERTY_RUM_BROWSER_MOBILE_SESSIONS_USAGE =
      "rum_browser_mobile_sessions_usage";
  private Double rumBrowserMobileSessionsUsage;

  public static final String JSON_PROPERTY_RUM_INGESTED_PERCENTAGE = "rum_ingested_percentage";
  private Double rumIngestedPercentage;

  public static final String JSON_PROPERTY_RUM_INGESTED_USAGE = "rum_ingested_usage";
  private Double rumIngestedUsage;

  public static final String JSON_PROPERTY_RUM_INVESTIGATE_PERCENTAGE =
      "rum_investigate_percentage";
  private Double rumInvestigatePercentage;

  public static final String JSON_PROPERTY_RUM_INVESTIGATE_USAGE = "rum_investigate_usage";
  private Double rumInvestigateUsage;

  public static final String JSON_PROPERTY_RUM_REPLAY_SESSIONS_PERCENTAGE =
      "rum_replay_sessions_percentage";
  private Double rumReplaySessionsPercentage;

  public static final String JSON_PROPERTY_RUM_REPLAY_SESSIONS_USAGE = "rum_replay_sessions_usage";
  private Double rumReplaySessionsUsage;

  public static final String JSON_PROPERTY_RUM_SESSION_REPLAY_ADD_ON_PERCENTAGE =
      "rum_session_replay_add_on_percentage";
  private Double rumSessionReplayAddOnPercentage;

  public static final String JSON_PROPERTY_RUM_SESSION_REPLAY_ADD_ON_USAGE =
      "rum_session_replay_add_on_usage";
  private Double rumSessionReplayAddOnUsage;

  public static final String JSON_PROPERTY_SCA_FARGATE_PERCENTAGE = "sca_fargate_percentage";
  private Double scaFargatePercentage;

  public static final String JSON_PROPERTY_SCA_FARGATE_USAGE = "sca_fargate_usage";
  private Double scaFargateUsage;

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

  public static final String JSON_PROPERTY_SIEM_ANALYZED_LOGS_ADD_ON_PERCENTAGE =
      "siem_analyzed_logs_add_on_percentage";
  private Double siemAnalyzedLogsAddOnPercentage;

  public static final String JSON_PROPERTY_SIEM_ANALYZED_LOGS_ADD_ON_USAGE =
      "siem_analyzed_logs_add_on_usage";
  private Double siemAnalyzedLogsAddOnUsage;

  public static final String JSON_PROPERTY_SIEM_INGESTED_BYTES_PERCENTAGE =
      "siem_ingested_bytes_percentage";
  private Double siemIngestedBytesPercentage;

  public static final String JSON_PROPERTY_SIEM_INGESTED_BYTES_USAGE = "siem_ingested_bytes_usage";
  private Double siemIngestedBytesUsage;

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

  public static final String JSON_PROPERTY_WORKFLOW_EXECUTIONS_PERCENTAGE =
      "workflow_executions_percentage";
  private Double workflowExecutionsPercentage;

  public static final String JSON_PROPERTY_WORKFLOW_EXECUTIONS_USAGE = "workflow_executions_usage";
  private Double workflowExecutionsUsage;

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

  public MonthlyUsageAttributionValues asmServerlessTracedInvocationsPercentage(
      Double asmServerlessTracedInvocationsPercentage) {
    this.asmServerlessTracedInvocationsPercentage = asmServerlessTracedInvocationsPercentage;
    return this;
  }

  /**
   * The percentage of Application Security Monitoring Serverless traced invocations usage by
   * tag(s).
   *
   * @return asmServerlessTracedInvocationsPercentage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ASM_SERVERLESS_TRACED_INVOCATIONS_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getAsmServerlessTracedInvocationsPercentage() {
    return asmServerlessTracedInvocationsPercentage;
  }

  public void setAsmServerlessTracedInvocationsPercentage(
      Double asmServerlessTracedInvocationsPercentage) {
    this.asmServerlessTracedInvocationsPercentage = asmServerlessTracedInvocationsPercentage;
  }

  public MonthlyUsageAttributionValues asmServerlessTracedInvocationsUsage(
      Double asmServerlessTracedInvocationsUsage) {
    this.asmServerlessTracedInvocationsUsage = asmServerlessTracedInvocationsUsage;
    return this;
  }

  /**
   * The Application Security Monitoring Serverless traced invocations usage by tag(s).
   *
   * @return asmServerlessTracedInvocationsUsage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ASM_SERVERLESS_TRACED_INVOCATIONS_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getAsmServerlessTracedInvocationsUsage() {
    return asmServerlessTracedInvocationsUsage;
  }

  public void setAsmServerlessTracedInvocationsUsage(Double asmServerlessTracedInvocationsUsage) {
    this.asmServerlessTracedInvocationsUsage = asmServerlessTracedInvocationsUsage;
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

  public MonthlyUsageAttributionValues ciPipelineIndexedSpansPercentage(
      Double ciPipelineIndexedSpansPercentage) {
    this.ciPipelineIndexedSpansPercentage = ciPipelineIndexedSpansPercentage;
    return this;
  }

  /**
   * The percentage of CI Pipeline Indexed Spans usage by tag(s).
   *
   * @return ciPipelineIndexedSpansPercentage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CI_PIPELINE_INDEXED_SPANS_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getCiPipelineIndexedSpansPercentage() {
    return ciPipelineIndexedSpansPercentage;
  }

  public void setCiPipelineIndexedSpansPercentage(Double ciPipelineIndexedSpansPercentage) {
    this.ciPipelineIndexedSpansPercentage = ciPipelineIndexedSpansPercentage;
  }

  public MonthlyUsageAttributionValues ciPipelineIndexedSpansUsage(
      Double ciPipelineIndexedSpansUsage) {
    this.ciPipelineIndexedSpansUsage = ciPipelineIndexedSpansUsage;
    return this;
  }

  /**
   * The total CI Pipeline Indexed Spans usage by tag(s).
   *
   * @return ciPipelineIndexedSpansUsage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CI_PIPELINE_INDEXED_SPANS_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getCiPipelineIndexedSpansUsage() {
    return ciPipelineIndexedSpansUsage;
  }

  public void setCiPipelineIndexedSpansUsage(Double ciPipelineIndexedSpansUsage) {
    this.ciPipelineIndexedSpansUsage = ciPipelineIndexedSpansUsage;
  }

  public MonthlyUsageAttributionValues ciTestIndexedSpansPercentage(
      Double ciTestIndexedSpansPercentage) {
    this.ciTestIndexedSpansPercentage = ciTestIndexedSpansPercentage;
    return this;
  }

  /**
   * The percentage of CI Test Indexed Spans usage by tag(s).
   *
   * @return ciTestIndexedSpansPercentage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CI_TEST_INDEXED_SPANS_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getCiTestIndexedSpansPercentage() {
    return ciTestIndexedSpansPercentage;
  }

  public void setCiTestIndexedSpansPercentage(Double ciTestIndexedSpansPercentage) {
    this.ciTestIndexedSpansPercentage = ciTestIndexedSpansPercentage;
  }

  public MonthlyUsageAttributionValues ciTestIndexedSpansUsage(Double ciTestIndexedSpansUsage) {
    this.ciTestIndexedSpansUsage = ciTestIndexedSpansUsage;
    return this;
  }

  /**
   * The total CI Test Indexed Spans usage by tag(s).
   *
   * @return ciTestIndexedSpansUsage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CI_TEST_INDEXED_SPANS_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getCiTestIndexedSpansUsage() {
    return ciTestIndexedSpansUsage;
  }

  public void setCiTestIndexedSpansUsage(Double ciTestIndexedSpansUsage) {
    this.ciTestIndexedSpansUsage = ciTestIndexedSpansUsage;
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

  public MonthlyUsageAttributionValues codeSecurityHostPercentage(
      Double codeSecurityHostPercentage) {
    this.codeSecurityHostPercentage = codeSecurityHostPercentage;
    return this;
  }

  /**
   * The percentage of Code Security host usage by tags.
   *
   * @return codeSecurityHostPercentage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CODE_SECURITY_HOST_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getCodeSecurityHostPercentage() {
    return codeSecurityHostPercentage;
  }

  public void setCodeSecurityHostPercentage(Double codeSecurityHostPercentage) {
    this.codeSecurityHostPercentage = codeSecurityHostPercentage;
  }

  public MonthlyUsageAttributionValues codeSecurityHostUsage(Double codeSecurityHostUsage) {
    this.codeSecurityHostUsage = codeSecurityHostUsage;
    return this;
  }

  /**
   * The Code Security host usage by tags.
   *
   * @return codeSecurityHostUsage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CODE_SECURITY_HOST_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getCodeSecurityHostUsage() {
    return codeSecurityHostUsage;
  }

  public void setCodeSecurityHostUsage(Double codeSecurityHostUsage) {
    this.codeSecurityHostUsage = codeSecurityHostUsage;
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

  public MonthlyUsageAttributionValues customEventPercentage(Double customEventPercentage) {
    this.customEventPercentage = customEventPercentage;
    return this;
  }

  /**
   * The percentage of Custom Events usage by tag(s).
   *
   * @return customEventPercentage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CUSTOM_EVENT_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getCustomEventPercentage() {
    return customEventPercentage;
  }

  public void setCustomEventPercentage(Double customEventPercentage) {
    this.customEventPercentage = customEventPercentage;
  }

  public MonthlyUsageAttributionValues customEventUsage(Double customEventUsage) {
    this.customEventUsage = customEventUsage;
    return this;
  }

  /**
   * The total Custom Events usage by tag(s).
   *
   * @return customEventUsage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CUSTOM_EVENT_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getCustomEventUsage() {
    return customEventUsage;
  }

  public void setCustomEventUsage(Double customEventUsage) {
    this.customEventUsage = customEventUsage;
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

  public MonthlyUsageAttributionValues cwsFargateTaskPercentage(Double cwsFargateTaskPercentage) {
    this.cwsFargateTaskPercentage = cwsFargateTaskPercentage;
    return this;
  }

  /**
   * The percentage of Cloud Workload Security Fargate task usage by tag(s).
   *
   * @return cwsFargateTaskPercentage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CWS_FARGATE_TASK_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getCwsFargateTaskPercentage() {
    return cwsFargateTaskPercentage;
  }

  public void setCwsFargateTaskPercentage(Double cwsFargateTaskPercentage) {
    this.cwsFargateTaskPercentage = cwsFargateTaskPercentage;
  }

  public MonthlyUsageAttributionValues cwsFargateTaskUsage(Double cwsFargateTaskUsage) {
    this.cwsFargateTaskUsage = cwsFargateTaskUsage;
    return this;
  }

  /**
   * The Cloud Workload Security Fargate task usage by tag(s).
   *
   * @return cwsFargateTaskUsage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CWS_FARGATE_TASK_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getCwsFargateTaskUsage() {
    return cwsFargateTaskUsage;
  }

  public void setCwsFargateTaskUsage(Double cwsFargateTaskUsage) {
    this.cwsFargateTaskUsage = cwsFargateTaskUsage;
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

  public MonthlyUsageAttributionValues dataJobsMonitoringUsage(Double dataJobsMonitoringUsage) {
    this.dataJobsMonitoringUsage = dataJobsMonitoringUsage;
    return this;
  }

  /**
   * The Data Jobs Monitoring usage by tag(s).
   *
   * @return dataJobsMonitoringUsage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATA_JOBS_MONITORING_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getDataJobsMonitoringUsage() {
    return dataJobsMonitoringUsage;
  }

  public void setDataJobsMonitoringUsage(Double dataJobsMonitoringUsage) {
    this.dataJobsMonitoringUsage = dataJobsMonitoringUsage;
  }

  public MonthlyUsageAttributionValues dataStreamMonitoringUsage(Double dataStreamMonitoringUsage) {
    this.dataStreamMonitoringUsage = dataStreamMonitoringUsage;
    return this;
  }

  /**
   * The Data Stream Monitoring usage by tag(s).
   *
   * @return dataStreamMonitoringUsage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATA_STREAM_MONITORING_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getDataStreamMonitoringUsage() {
    return dataStreamMonitoringUsage;
  }

  public void setDataStreamMonitoringUsage(Double dataStreamMonitoringUsage) {
    this.dataStreamMonitoringUsage = dataStreamMonitoringUsage;
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

  public MonthlyUsageAttributionValues errorTrackingPercentage(Double errorTrackingPercentage) {
    this.errorTrackingPercentage = errorTrackingPercentage;
    return this;
  }

  /**
   * The percentage of error tracking events usage by tag(s).
   *
   * @return errorTrackingPercentage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ERROR_TRACKING_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getErrorTrackingPercentage() {
    return errorTrackingPercentage;
  }

  public void setErrorTrackingPercentage(Double errorTrackingPercentage) {
    this.errorTrackingPercentage = errorTrackingPercentage;
  }

  public MonthlyUsageAttributionValues errorTrackingUsage(Double errorTrackingUsage) {
    this.errorTrackingUsage = errorTrackingUsage;
    return this;
  }

  /**
   * The error tracking events usage by tag(s).
   *
   * @return errorTrackingUsage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ERROR_TRACKING_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getErrorTrackingUsage() {
    return errorTrackingUsage;
  }

  public void setErrorTrackingUsage(Double errorTrackingUsage) {
    this.errorTrackingUsage = errorTrackingUsage;
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

  public MonthlyUsageAttributionValues incidentManagementMonthlyActiveUsersPercentage(
      Double incidentManagementMonthlyActiveUsersPercentage) {
    this.incidentManagementMonthlyActiveUsersPercentage =
        incidentManagementMonthlyActiveUsersPercentage;
    return this;
  }

  /**
   * The percentage of Incident Management monthly active users usage by tag(s).
   *
   * @return incidentManagementMonthlyActiveUsersPercentage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INCIDENT_MANAGEMENT_MONTHLY_ACTIVE_USERS_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getIncidentManagementMonthlyActiveUsersPercentage() {
    return incidentManagementMonthlyActiveUsersPercentage;
  }

  public void setIncidentManagementMonthlyActiveUsersPercentage(
      Double incidentManagementMonthlyActiveUsersPercentage) {
    this.incidentManagementMonthlyActiveUsersPercentage =
        incidentManagementMonthlyActiveUsersPercentage;
  }

  public MonthlyUsageAttributionValues incidentManagementMonthlyActiveUsersUsage(
      Double incidentManagementMonthlyActiveUsersUsage) {
    this.incidentManagementMonthlyActiveUsersUsage = incidentManagementMonthlyActiveUsersUsage;
    return this;
  }

  /**
   * The Incident Management monthly active users usage by tag(s).
   *
   * @return incidentManagementMonthlyActiveUsersUsage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INCIDENT_MANAGEMENT_MONTHLY_ACTIVE_USERS_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getIncidentManagementMonthlyActiveUsersUsage() {
    return incidentManagementMonthlyActiveUsersUsage;
  }

  public void setIncidentManagementMonthlyActiveUsersUsage(
      Double incidentManagementMonthlyActiveUsersUsage) {
    this.incidentManagementMonthlyActiveUsersUsage = incidentManagementMonthlyActiveUsersUsage;
  }

  public MonthlyUsageAttributionValues indexedSpansPercentage(Double indexedSpansPercentage) {
    this.indexedSpansPercentage = indexedSpansPercentage;
    return this;
  }

  /**
   * The percentage of APM Indexed Spans usage by tag(s).
   *
   * @return indexedSpansPercentage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INDEXED_SPANS_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getIndexedSpansPercentage() {
    return indexedSpansPercentage;
  }

  public void setIndexedSpansPercentage(Double indexedSpansPercentage) {
    this.indexedSpansPercentage = indexedSpansPercentage;
  }

  public MonthlyUsageAttributionValues indexedSpansUsage(Double indexedSpansUsage) {
    this.indexedSpansUsage = indexedSpansUsage;
    return this;
  }

  /**
   * The total APM Indexed Spans usage by tag(s).
   *
   * @return indexedSpansUsage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INDEXED_SPANS_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getIndexedSpansUsage() {
    return indexedSpansUsage;
  }

  public void setIndexedSpansUsage(Double indexedSpansUsage) {
    this.indexedSpansUsage = indexedSpansUsage;
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

  public MonthlyUsageAttributionValues ingestedLogsBytesPercentage(
      Double ingestedLogsBytesPercentage) {
    this.ingestedLogsBytesPercentage = ingestedLogsBytesPercentage;
    return this;
  }

  /**
   * The percentage of Ingested Logs usage by tag(s).
   *
   * @return ingestedLogsBytesPercentage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INGESTED_LOGS_BYTES_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getIngestedLogsBytesPercentage() {
    return ingestedLogsBytesPercentage;
  }

  public void setIngestedLogsBytesPercentage(Double ingestedLogsBytesPercentage) {
    this.ingestedLogsBytesPercentage = ingestedLogsBytesPercentage;
  }

  public MonthlyUsageAttributionValues ingestedLogsBytesUsage(Double ingestedLogsBytesUsage) {
    this.ingestedLogsBytesUsage = ingestedLogsBytesUsage;
    return this;
  }

  /**
   * The total Ingested Logs usage by tag(s).
   *
   * @return ingestedLogsBytesUsage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INGESTED_LOGS_BYTES_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getIngestedLogsBytesUsage() {
    return ingestedLogsBytesUsage;
  }

  public void setIngestedLogsBytesUsage(Double ingestedLogsBytesUsage) {
    this.ingestedLogsBytesUsage = ingestedLogsBytesUsage;
  }

  public MonthlyUsageAttributionValues ingestedSpansBytesPercentage(
      Double ingestedSpansBytesPercentage) {
    this.ingestedSpansBytesPercentage = ingestedSpansBytesPercentage;
    return this;
  }

  /**
   * The percentage of APM Ingested Spans usage by tag(s).
   *
   * @return ingestedSpansBytesPercentage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INGESTED_SPANS_BYTES_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getIngestedSpansBytesPercentage() {
    return ingestedSpansBytesPercentage;
  }

  public void setIngestedSpansBytesPercentage(Double ingestedSpansBytesPercentage) {
    this.ingestedSpansBytesPercentage = ingestedSpansBytesPercentage;
  }

  public MonthlyUsageAttributionValues ingestedSpansBytesUsage(Double ingestedSpansBytesUsage) {
    this.ingestedSpansBytesUsage = ingestedSpansBytesUsage;
    return this;
  }

  /**
   * The total APM Ingested Spans usage by tag(s).
   *
   * @return ingestedSpansBytesUsage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INGESTED_SPANS_BYTES_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getIngestedSpansBytesUsage() {
    return ingestedSpansBytesUsage;
  }

  public void setIngestedSpansBytesUsage(Double ingestedSpansBytesUsage) {
    this.ingestedSpansBytesUsage = ingestedSpansBytesUsage;
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

  public MonthlyUsageAttributionValues lambdaTracedInvocationsPercentage(
      Double lambdaTracedInvocationsPercentage) {
    this.lambdaTracedInvocationsPercentage = lambdaTracedInvocationsPercentage;
    return this;
  }

  /**
   * The percentage of Serverless APM usage by tag(s).
   *
   * @return lambdaTracedInvocationsPercentage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAMBDA_TRACED_INVOCATIONS_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getLambdaTracedInvocationsPercentage() {
    return lambdaTracedInvocationsPercentage;
  }

  public void setLambdaTracedInvocationsPercentage(Double lambdaTracedInvocationsPercentage) {
    this.lambdaTracedInvocationsPercentage = lambdaTracedInvocationsPercentage;
  }

  public MonthlyUsageAttributionValues lambdaTracedInvocationsUsage(
      Double lambdaTracedInvocationsUsage) {
    this.lambdaTracedInvocationsUsage = lambdaTracedInvocationsUsage;
    return this;
  }

  /**
   * The Serverless APM usage by tag(s).
   *
   * @return lambdaTracedInvocationsUsage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAMBDA_TRACED_INVOCATIONS_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getLambdaTracedInvocationsUsage() {
    return lambdaTracedInvocationsUsage;
  }

  public void setLambdaTracedInvocationsUsage(Double lambdaTracedInvocationsUsage) {
    this.lambdaTracedInvocationsUsage = lambdaTracedInvocationsUsage;
  }

  public MonthlyUsageAttributionValues llmObservabilityPercentage(
      Double llmObservabilityPercentage) {
    this.llmObservabilityPercentage = llmObservabilityPercentage;
    return this;
  }

  /**
   * The percentage of LLM Observability usage by tag(s).
   *
   * @return llmObservabilityPercentage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LLM_OBSERVABILITY_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getLlmObservabilityPercentage() {
    return llmObservabilityPercentage;
  }

  public void setLlmObservabilityPercentage(Double llmObservabilityPercentage) {
    this.llmObservabilityPercentage = llmObservabilityPercentage;
  }

  public MonthlyUsageAttributionValues llmObservabilityUsage(Double llmObservabilityUsage) {
    this.llmObservabilityUsage = llmObservabilityUsage;
    return this;
  }

  /**
   * The LLM Observability usage by tag(s).
   *
   * @return llmObservabilityUsage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LLM_OBSERVABILITY_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getLlmObservabilityUsage() {
    return llmObservabilityUsage;
  }

  public void setLlmObservabilityUsage(Double llmObservabilityUsage) {
    this.llmObservabilityUsage = llmObservabilityUsage;
  }

  public MonthlyUsageAttributionValues llmSpansPercentage(Double llmSpansPercentage) {
    this.llmSpansPercentage = llmSpansPercentage;
    return this;
  }

  /**
   * The percentage of LLM Spans usage by tag(s).
   *
   * @return llmSpansPercentage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LLM_SPANS_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getLlmSpansPercentage() {
    return llmSpansPercentage;
  }

  public void setLlmSpansPercentage(Double llmSpansPercentage) {
    this.llmSpansPercentage = llmSpansPercentage;
  }

  public MonthlyUsageAttributionValues llmSpansUsage(Double llmSpansUsage) {
    this.llmSpansUsage = llmSpansUsage;
    return this;
  }

  /**
   * The LLM Spans usage by tag(s).
   *
   * @return llmSpansUsage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LLM_SPANS_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getLlmSpansUsage() {
    return llmSpansUsage;
  }

  public void setLlmSpansUsage(Double llmSpansUsage) {
    this.llmSpansUsage = llmSpansUsage;
  }

  public MonthlyUsageAttributionValues logsIndexed15dayPercentage(
      Double logsIndexed15dayPercentage) {
    this.logsIndexed15dayPercentage = logsIndexed15dayPercentage;
    return this;
  }

  /**
   * The percentage of Indexed Logs (15-day Retention) usage by tag(s).
   *
   * @return logsIndexed15dayPercentage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOGS_INDEXED_15DAY_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getLogsIndexed15dayPercentage() {
    return logsIndexed15dayPercentage;
  }

  public void setLogsIndexed15dayPercentage(Double logsIndexed15dayPercentage) {
    this.logsIndexed15dayPercentage = logsIndexed15dayPercentage;
  }

  public MonthlyUsageAttributionValues logsIndexed15dayUsage(Double logsIndexed15dayUsage) {
    this.logsIndexed15dayUsage = logsIndexed15dayUsage;
    return this;
  }

  /**
   * The total Indexed Logs (15-day Retention) usage by tag(s).
   *
   * @return logsIndexed15dayUsage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOGS_INDEXED_15DAY_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getLogsIndexed15dayUsage() {
    return logsIndexed15dayUsage;
  }

  public void setLogsIndexed15dayUsage(Double logsIndexed15dayUsage) {
    this.logsIndexed15dayUsage = logsIndexed15dayUsage;
  }

  public MonthlyUsageAttributionValues logsIndexed180dayPercentage(
      Double logsIndexed180dayPercentage) {
    this.logsIndexed180dayPercentage = logsIndexed180dayPercentage;
    return this;
  }

  /**
   * The percentage of Indexed Logs (180-day Retention) usage by tag(s).
   *
   * @return logsIndexed180dayPercentage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOGS_INDEXED_180DAY_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getLogsIndexed180dayPercentage() {
    return logsIndexed180dayPercentage;
  }

  public void setLogsIndexed180dayPercentage(Double logsIndexed180dayPercentage) {
    this.logsIndexed180dayPercentage = logsIndexed180dayPercentage;
  }

  public MonthlyUsageAttributionValues logsIndexed180dayUsage(Double logsIndexed180dayUsage) {
    this.logsIndexed180dayUsage = logsIndexed180dayUsage;
    return this;
  }

  /**
   * The total Indexed Logs (180-day Retention) usage by tag(s).
   *
   * @return logsIndexed180dayUsage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOGS_INDEXED_180DAY_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getLogsIndexed180dayUsage() {
    return logsIndexed180dayUsage;
  }

  public void setLogsIndexed180dayUsage(Double logsIndexed180dayUsage) {
    this.logsIndexed180dayUsage = logsIndexed180dayUsage;
  }

  public MonthlyUsageAttributionValues logsIndexed1dayPercentage(Double logsIndexed1dayPercentage) {
    this.logsIndexed1dayPercentage = logsIndexed1dayPercentage;
    return this;
  }

  /**
   * The percentage of Indexed Logs (1-day Retention) usage by tag(s).
   *
   * @return logsIndexed1dayPercentage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOGS_INDEXED_1DAY_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getLogsIndexed1dayPercentage() {
    return logsIndexed1dayPercentage;
  }

  public void setLogsIndexed1dayPercentage(Double logsIndexed1dayPercentage) {
    this.logsIndexed1dayPercentage = logsIndexed1dayPercentage;
  }

  public MonthlyUsageAttributionValues logsIndexed1dayUsage(Double logsIndexed1dayUsage) {
    this.logsIndexed1dayUsage = logsIndexed1dayUsage;
    return this;
  }

  /**
   * The total Indexed Logs (1-day Retention) usage by tag(s).
   *
   * @return logsIndexed1dayUsage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOGS_INDEXED_1DAY_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getLogsIndexed1dayUsage() {
    return logsIndexed1dayUsage;
  }

  public void setLogsIndexed1dayUsage(Double logsIndexed1dayUsage) {
    this.logsIndexed1dayUsage = logsIndexed1dayUsage;
  }

  public MonthlyUsageAttributionValues logsIndexed30dayPercentage(
      Double logsIndexed30dayPercentage) {
    this.logsIndexed30dayPercentage = logsIndexed30dayPercentage;
    return this;
  }

  /**
   * The percentage of Indexed Logs (30-day Retention) usage by tag(s).
   *
   * @return logsIndexed30dayPercentage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOGS_INDEXED_30DAY_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getLogsIndexed30dayPercentage() {
    return logsIndexed30dayPercentage;
  }

  public void setLogsIndexed30dayPercentage(Double logsIndexed30dayPercentage) {
    this.logsIndexed30dayPercentage = logsIndexed30dayPercentage;
  }

  public MonthlyUsageAttributionValues logsIndexed30dayUsage(Double logsIndexed30dayUsage) {
    this.logsIndexed30dayUsage = logsIndexed30dayUsage;
    return this;
  }

  /**
   * The total Indexed Logs (30-day Retention) usage by tag(s).
   *
   * @return logsIndexed30dayUsage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOGS_INDEXED_30DAY_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getLogsIndexed30dayUsage() {
    return logsIndexed30dayUsage;
  }

  public void setLogsIndexed30dayUsage(Double logsIndexed30dayUsage) {
    this.logsIndexed30dayUsage = logsIndexed30dayUsage;
  }

  public MonthlyUsageAttributionValues logsIndexed360dayPercentage(
      Double logsIndexed360dayPercentage) {
    this.logsIndexed360dayPercentage = logsIndexed360dayPercentage;
    return this;
  }

  /**
   * The percentage of Indexed Logs (360-day Retention) usage by tag(s).
   *
   * @return logsIndexed360dayPercentage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOGS_INDEXED_360DAY_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getLogsIndexed360dayPercentage() {
    return logsIndexed360dayPercentage;
  }

  public void setLogsIndexed360dayPercentage(Double logsIndexed360dayPercentage) {
    this.logsIndexed360dayPercentage = logsIndexed360dayPercentage;
  }

  public MonthlyUsageAttributionValues logsIndexed360dayUsage(Double logsIndexed360dayUsage) {
    this.logsIndexed360dayUsage = logsIndexed360dayUsage;
    return this;
  }

  /**
   * The total Indexed Logs (360-day Retention) usage by tag(s).
   *
   * @return logsIndexed360dayUsage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOGS_INDEXED_360DAY_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getLogsIndexed360dayUsage() {
    return logsIndexed360dayUsage;
  }

  public void setLogsIndexed360dayUsage(Double logsIndexed360dayUsage) {
    this.logsIndexed360dayUsage = logsIndexed360dayUsage;
  }

  public MonthlyUsageAttributionValues logsIndexed3dayPercentage(Double logsIndexed3dayPercentage) {
    this.logsIndexed3dayPercentage = logsIndexed3dayPercentage;
    return this;
  }

  /**
   * The percentage of Indexed Logs (3-day Retention) usage by tag(s).
   *
   * @return logsIndexed3dayPercentage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOGS_INDEXED_3DAY_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getLogsIndexed3dayPercentage() {
    return logsIndexed3dayPercentage;
  }

  public void setLogsIndexed3dayPercentage(Double logsIndexed3dayPercentage) {
    this.logsIndexed3dayPercentage = logsIndexed3dayPercentage;
  }

  public MonthlyUsageAttributionValues logsIndexed3dayUsage(Double logsIndexed3dayUsage) {
    this.logsIndexed3dayUsage = logsIndexed3dayUsage;
    return this;
  }

  /**
   * The total Indexed Logs (3-day Retention) usage by tag(s).
   *
   * @return logsIndexed3dayUsage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOGS_INDEXED_3DAY_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getLogsIndexed3dayUsage() {
    return logsIndexed3dayUsage;
  }

  public void setLogsIndexed3dayUsage(Double logsIndexed3dayUsage) {
    this.logsIndexed3dayUsage = logsIndexed3dayUsage;
  }

  public MonthlyUsageAttributionValues logsIndexed45dayPercentage(
      Double logsIndexed45dayPercentage) {
    this.logsIndexed45dayPercentage = logsIndexed45dayPercentage;
    return this;
  }

  /**
   * The percentage of Indexed Logs (45-day Retention) usage by tag(s).
   *
   * @return logsIndexed45dayPercentage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOGS_INDEXED_45DAY_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getLogsIndexed45dayPercentage() {
    return logsIndexed45dayPercentage;
  }

  public void setLogsIndexed45dayPercentage(Double logsIndexed45dayPercentage) {
    this.logsIndexed45dayPercentage = logsIndexed45dayPercentage;
  }

  public MonthlyUsageAttributionValues logsIndexed45dayUsage(Double logsIndexed45dayUsage) {
    this.logsIndexed45dayUsage = logsIndexed45dayUsage;
    return this;
  }

  /**
   * The total Indexed Logs (45-day Retention) usage by tag(s).
   *
   * @return logsIndexed45dayUsage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOGS_INDEXED_45DAY_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getLogsIndexed45dayUsage() {
    return logsIndexed45dayUsage;
  }

  public void setLogsIndexed45dayUsage(Double logsIndexed45dayUsage) {
    this.logsIndexed45dayUsage = logsIndexed45dayUsage;
  }

  public MonthlyUsageAttributionValues logsIndexed60dayPercentage(
      Double logsIndexed60dayPercentage) {
    this.logsIndexed60dayPercentage = logsIndexed60dayPercentage;
    return this;
  }

  /**
   * The percentage of Indexed Logs (60-day Retention) usage by tag(s).
   *
   * @return logsIndexed60dayPercentage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOGS_INDEXED_60DAY_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getLogsIndexed60dayPercentage() {
    return logsIndexed60dayPercentage;
  }

  public void setLogsIndexed60dayPercentage(Double logsIndexed60dayPercentage) {
    this.logsIndexed60dayPercentage = logsIndexed60dayPercentage;
  }

  public MonthlyUsageAttributionValues logsIndexed60dayUsage(Double logsIndexed60dayUsage) {
    this.logsIndexed60dayUsage = logsIndexed60dayUsage;
    return this;
  }

  /**
   * The total Indexed Logs (60-day Retention) usage by tag(s).
   *
   * @return logsIndexed60dayUsage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOGS_INDEXED_60DAY_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getLogsIndexed60dayUsage() {
    return logsIndexed60dayUsage;
  }

  public void setLogsIndexed60dayUsage(Double logsIndexed60dayUsage) {
    this.logsIndexed60dayUsage = logsIndexed60dayUsage;
  }

  public MonthlyUsageAttributionValues logsIndexed7dayPercentage(Double logsIndexed7dayPercentage) {
    this.logsIndexed7dayPercentage = logsIndexed7dayPercentage;
    return this;
  }

  /**
   * The percentage of Indexed Logs (7-day Retention) usage by tag(s).
   *
   * @return logsIndexed7dayPercentage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOGS_INDEXED_7DAY_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getLogsIndexed7dayPercentage() {
    return logsIndexed7dayPercentage;
  }

  public void setLogsIndexed7dayPercentage(Double logsIndexed7dayPercentage) {
    this.logsIndexed7dayPercentage = logsIndexed7dayPercentage;
  }

  public MonthlyUsageAttributionValues logsIndexed7dayUsage(Double logsIndexed7dayUsage) {
    this.logsIndexed7dayUsage = logsIndexed7dayUsage;
    return this;
  }

  /**
   * The total Indexed Logs (7-day Retention) usage by tag(s).
   *
   * @return logsIndexed7dayUsage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOGS_INDEXED_7DAY_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getLogsIndexed7dayUsage() {
    return logsIndexed7dayUsage;
  }

  public void setLogsIndexed7dayUsage(Double logsIndexed7dayUsage) {
    this.logsIndexed7dayUsage = logsIndexed7dayUsage;
  }

  public MonthlyUsageAttributionValues logsIndexed90dayPercentage(
      Double logsIndexed90dayPercentage) {
    this.logsIndexed90dayPercentage = logsIndexed90dayPercentage;
    return this;
  }

  /**
   * The percentage of Indexed Logs (90-day Retention) usage by tag(s).
   *
   * @return logsIndexed90dayPercentage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOGS_INDEXED_90DAY_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getLogsIndexed90dayPercentage() {
    return logsIndexed90dayPercentage;
  }

  public void setLogsIndexed90dayPercentage(Double logsIndexed90dayPercentage) {
    this.logsIndexed90dayPercentage = logsIndexed90dayPercentage;
  }

  public MonthlyUsageAttributionValues logsIndexed90dayUsage(Double logsIndexed90dayUsage) {
    this.logsIndexed90dayUsage = logsIndexed90dayUsage;
    return this;
  }

  /**
   * The total Indexed Logs (90-day Retention) usage by tag(s).
   *
   * @return logsIndexed90dayUsage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOGS_INDEXED_90DAY_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getLogsIndexed90dayUsage() {
    return logsIndexed90dayUsage;
  }

  public void setLogsIndexed90dayUsage(Double logsIndexed90dayUsage) {
    this.logsIndexed90dayUsage = logsIndexed90dayUsage;
  }

  public MonthlyUsageAttributionValues logsIndexedCustomRetentionPercentage(
      Double logsIndexedCustomRetentionPercentage) {
    this.logsIndexedCustomRetentionPercentage = logsIndexedCustomRetentionPercentage;
    return this;
  }

  /**
   * The percentage of Indexed Logs (Custom Retention) usage by tag(s).
   *
   * @return logsIndexedCustomRetentionPercentage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOGS_INDEXED_CUSTOM_RETENTION_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getLogsIndexedCustomRetentionPercentage() {
    return logsIndexedCustomRetentionPercentage;
  }

  public void setLogsIndexedCustomRetentionPercentage(Double logsIndexedCustomRetentionPercentage) {
    this.logsIndexedCustomRetentionPercentage = logsIndexedCustomRetentionPercentage;
  }

  public MonthlyUsageAttributionValues logsIndexedCustomRetentionUsage(
      Double logsIndexedCustomRetentionUsage) {
    this.logsIndexedCustomRetentionUsage = logsIndexedCustomRetentionUsage;
    return this;
  }

  /**
   * The total Indexed Logs (Custom Retention) usage by tag(s).
   *
   * @return logsIndexedCustomRetentionUsage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOGS_INDEXED_CUSTOM_RETENTION_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getLogsIndexedCustomRetentionUsage() {
    return logsIndexedCustomRetentionUsage;
  }

  public void setLogsIndexedCustomRetentionUsage(Double logsIndexedCustomRetentionUsage) {
    this.logsIndexedCustomRetentionUsage = logsIndexedCustomRetentionUsage;
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

  public MonthlyUsageAttributionValues networkDeviceWirelessPercentage(
      Double networkDeviceWirelessPercentage) {
    this.networkDeviceWirelessPercentage = networkDeviceWirelessPercentage;
    return this;
  }

  /**
   * The percentage of network device wireless usage by tag(s).
   *
   * @return networkDeviceWirelessPercentage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NETWORK_DEVICE_WIRELESS_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getNetworkDeviceWirelessPercentage() {
    return networkDeviceWirelessPercentage;
  }

  public void setNetworkDeviceWirelessPercentage(Double networkDeviceWirelessPercentage) {
    this.networkDeviceWirelessPercentage = networkDeviceWirelessPercentage;
  }

  public MonthlyUsageAttributionValues networkDeviceWirelessUsage(
      Double networkDeviceWirelessUsage) {
    this.networkDeviceWirelessUsage = networkDeviceWirelessUsage;
    return this;
  }

  /**
   * The network device wireless usage by tag(s).
   *
   * @return networkDeviceWirelessUsage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NETWORK_DEVICE_WIRELESS_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getNetworkDeviceWirelessUsage() {
    return networkDeviceWirelessUsage;
  }

  public void setNetworkDeviceWirelessUsage(Double networkDeviceWirelessUsage) {
    this.networkDeviceWirelessUsage = networkDeviceWirelessUsage;
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

  public MonthlyUsageAttributionValues obsPipelinesVcpuPercentage(
      Double obsPipelinesVcpuPercentage) {
    this.obsPipelinesVcpuPercentage = obsPipelinesVcpuPercentage;
    return this;
  }

  /**
   * The percentage of observability pipeline per core usage by tag(s).
   *
   * @return obsPipelinesVcpuPercentage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OBS_PIPELINES_VCPU_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getObsPipelinesVcpuPercentage() {
    return obsPipelinesVcpuPercentage;
  }

  public void setObsPipelinesVcpuPercentage(Double obsPipelinesVcpuPercentage) {
    this.obsPipelinesVcpuPercentage = obsPipelinesVcpuPercentage;
  }

  public MonthlyUsageAttributionValues obsPipelinesVcpuUsage(Double obsPipelinesVcpuUsage) {
    this.obsPipelinesVcpuUsage = obsPipelinesVcpuUsage;
    return this;
  }

  /**
   * The observability pipeline per core usage by tag(s).
   *
   * @return obsPipelinesVcpuUsage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OBS_PIPELINES_VCPU_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getObsPipelinesVcpuUsage() {
    return obsPipelinesVcpuUsage;
  }

  public void setObsPipelinesVcpuUsage(Double obsPipelinesVcpuUsage) {
    this.obsPipelinesVcpuUsage = obsPipelinesVcpuUsage;
  }

  public MonthlyUsageAttributionValues onlineArchivePercentage(Double onlineArchivePercentage) {
    this.onlineArchivePercentage = onlineArchivePercentage;
    return this;
  }

  /**
   * The percentage of online archive usage by tag(s).
   *
   * @return onlineArchivePercentage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ONLINE_ARCHIVE_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getOnlineArchivePercentage() {
    return onlineArchivePercentage;
  }

  public void setOnlineArchivePercentage(Double onlineArchivePercentage) {
    this.onlineArchivePercentage = onlineArchivePercentage;
  }

  public MonthlyUsageAttributionValues onlineArchiveUsage(Double onlineArchiveUsage) {
    this.onlineArchiveUsage = onlineArchiveUsage;
    return this;
  }

  /**
   * The online archive usage by tag(s).
   *
   * @return onlineArchiveUsage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ONLINE_ARCHIVE_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getOnlineArchiveUsage() {
    return onlineArchiveUsage;
  }

  public void setOnlineArchiveUsage(Double onlineArchiveUsage) {
    this.onlineArchiveUsage = onlineArchiveUsage;
  }

  public MonthlyUsageAttributionValues productAnalyticsSessionPercentage(
      Double productAnalyticsSessionPercentage) {
    this.productAnalyticsSessionPercentage = productAnalyticsSessionPercentage;
    return this;
  }

  /**
   * The percentage of Product Analytics session usage by tag(s).
   *
   * @return productAnalyticsSessionPercentage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRODUCT_ANALYTICS_SESSION_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getProductAnalyticsSessionPercentage() {
    return productAnalyticsSessionPercentage;
  }

  public void setProductAnalyticsSessionPercentage(Double productAnalyticsSessionPercentage) {
    this.productAnalyticsSessionPercentage = productAnalyticsSessionPercentage;
  }

  public MonthlyUsageAttributionValues productAnalyticsSessionUsage(
      Double productAnalyticsSessionUsage) {
    this.productAnalyticsSessionUsage = productAnalyticsSessionUsage;
    return this;
  }

  /**
   * The Product Analytics session usage by tag(s).
   *
   * @return productAnalyticsSessionUsage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRODUCT_ANALYTICS_SESSION_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getProductAnalyticsSessionUsage() {
    return productAnalyticsSessionUsage;
  }

  public void setProductAnalyticsSessionUsage(Double productAnalyticsSessionUsage) {
    this.productAnalyticsSessionUsage = productAnalyticsSessionUsage;
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

  public MonthlyUsageAttributionValues publishedAppPercentage(Double publishedAppPercentage) {
    this.publishedAppPercentage = publishedAppPercentage;
    return this;
  }

  /**
   * The percentage of published application usage by tag(s).
   *
   * @return publishedAppPercentage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PUBLISHED_APP_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getPublishedAppPercentage() {
    return publishedAppPercentage;
  }

  public void setPublishedAppPercentage(Double publishedAppPercentage) {
    this.publishedAppPercentage = publishedAppPercentage;
  }

  public MonthlyUsageAttributionValues publishedAppUsage(Double publishedAppUsage) {
    this.publishedAppUsage = publishedAppUsage;
    return this;
  }

  /**
   * The published application usage by tag(s).
   *
   * @return publishedAppUsage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PUBLISHED_APP_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getPublishedAppUsage() {
    return publishedAppUsage;
  }

  public void setPublishedAppUsage(Double publishedAppUsage) {
    this.publishedAppUsage = publishedAppUsage;
  }

  public MonthlyUsageAttributionValues rumBrowserMobileSessionsPercentage(
      Double rumBrowserMobileSessionsPercentage) {
    this.rumBrowserMobileSessionsPercentage = rumBrowserMobileSessionsPercentage;
    return this;
  }

  /**
   * The percentage of RUM Browser and Mobile usage by tag(s).
   *
   * @return rumBrowserMobileSessionsPercentage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RUM_BROWSER_MOBILE_SESSIONS_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getRumBrowserMobileSessionsPercentage() {
    return rumBrowserMobileSessionsPercentage;
  }

  public void setRumBrowserMobileSessionsPercentage(Double rumBrowserMobileSessionsPercentage) {
    this.rumBrowserMobileSessionsPercentage = rumBrowserMobileSessionsPercentage;
  }

  public MonthlyUsageAttributionValues rumBrowserMobileSessionsUsage(
      Double rumBrowserMobileSessionsUsage) {
    this.rumBrowserMobileSessionsUsage = rumBrowserMobileSessionsUsage;
    return this;
  }

  /**
   * The total RUM Browser and Mobile usage by tag(s).
   *
   * @return rumBrowserMobileSessionsUsage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RUM_BROWSER_MOBILE_SESSIONS_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getRumBrowserMobileSessionsUsage() {
    return rumBrowserMobileSessionsUsage;
  }

  public void setRumBrowserMobileSessionsUsage(Double rumBrowserMobileSessionsUsage) {
    this.rumBrowserMobileSessionsUsage = rumBrowserMobileSessionsUsage;
  }

  public MonthlyUsageAttributionValues rumIngestedPercentage(Double rumIngestedPercentage) {
    this.rumIngestedPercentage = rumIngestedPercentage;
    return this;
  }

  /**
   * The percentage of RUM Ingested usage by tag(s).
   *
   * @return rumIngestedPercentage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RUM_INGESTED_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getRumIngestedPercentage() {
    return rumIngestedPercentage;
  }

  public void setRumIngestedPercentage(Double rumIngestedPercentage) {
    this.rumIngestedPercentage = rumIngestedPercentage;
  }

  public MonthlyUsageAttributionValues rumIngestedUsage(Double rumIngestedUsage) {
    this.rumIngestedUsage = rumIngestedUsage;
    return this;
  }

  /**
   * The total RUM Ingested usage by tag(s).
   *
   * @return rumIngestedUsage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RUM_INGESTED_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getRumIngestedUsage() {
    return rumIngestedUsage;
  }

  public void setRumIngestedUsage(Double rumIngestedUsage) {
    this.rumIngestedUsage = rumIngestedUsage;
  }

  public MonthlyUsageAttributionValues rumInvestigatePercentage(Double rumInvestigatePercentage) {
    this.rumInvestigatePercentage = rumInvestigatePercentage;
    return this;
  }

  /**
   * The percentage of RUM Investigate usage by tag(s).
   *
   * @return rumInvestigatePercentage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RUM_INVESTIGATE_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getRumInvestigatePercentage() {
    return rumInvestigatePercentage;
  }

  public void setRumInvestigatePercentage(Double rumInvestigatePercentage) {
    this.rumInvestigatePercentage = rumInvestigatePercentage;
  }

  public MonthlyUsageAttributionValues rumInvestigateUsage(Double rumInvestigateUsage) {
    this.rumInvestigateUsage = rumInvestigateUsage;
    return this;
  }

  /**
   * The total RUM Investigate usage by tag(s).
   *
   * @return rumInvestigateUsage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RUM_INVESTIGATE_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getRumInvestigateUsage() {
    return rumInvestigateUsage;
  }

  public void setRumInvestigateUsage(Double rumInvestigateUsage) {
    this.rumInvestigateUsage = rumInvestigateUsage;
  }

  public MonthlyUsageAttributionValues rumReplaySessionsPercentage(
      Double rumReplaySessionsPercentage) {
    this.rumReplaySessionsPercentage = rumReplaySessionsPercentage;
    return this;
  }

  /**
   * The percentage of RUM Session Replay usage by tag(s).
   *
   * @return rumReplaySessionsPercentage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RUM_REPLAY_SESSIONS_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getRumReplaySessionsPercentage() {
    return rumReplaySessionsPercentage;
  }

  public void setRumReplaySessionsPercentage(Double rumReplaySessionsPercentage) {
    this.rumReplaySessionsPercentage = rumReplaySessionsPercentage;
  }

  public MonthlyUsageAttributionValues rumReplaySessionsUsage(Double rumReplaySessionsUsage) {
    this.rumReplaySessionsUsage = rumReplaySessionsUsage;
    return this;
  }

  /**
   * The total RUM Session Replay usage by tag(s).
   *
   * @return rumReplaySessionsUsage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RUM_REPLAY_SESSIONS_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getRumReplaySessionsUsage() {
    return rumReplaySessionsUsage;
  }

  public void setRumReplaySessionsUsage(Double rumReplaySessionsUsage) {
    this.rumReplaySessionsUsage = rumReplaySessionsUsage;
  }

  public MonthlyUsageAttributionValues rumSessionReplayAddOnPercentage(
      Double rumSessionReplayAddOnPercentage) {
    this.rumSessionReplayAddOnPercentage = rumSessionReplayAddOnPercentage;
    return this;
  }

  /**
   * The percentage of RUM Session Replay Add-On usage by tag(s).
   *
   * @return rumSessionReplayAddOnPercentage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RUM_SESSION_REPLAY_ADD_ON_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getRumSessionReplayAddOnPercentage() {
    return rumSessionReplayAddOnPercentage;
  }

  public void setRumSessionReplayAddOnPercentage(Double rumSessionReplayAddOnPercentage) {
    this.rumSessionReplayAddOnPercentage = rumSessionReplayAddOnPercentage;
  }

  public MonthlyUsageAttributionValues rumSessionReplayAddOnUsage(
      Double rumSessionReplayAddOnUsage) {
    this.rumSessionReplayAddOnUsage = rumSessionReplayAddOnUsage;
    return this;
  }

  /**
   * The total RUM Session Replay Add-On usage by tag(s).
   *
   * @return rumSessionReplayAddOnUsage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RUM_SESSION_REPLAY_ADD_ON_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getRumSessionReplayAddOnUsage() {
    return rumSessionReplayAddOnUsage;
  }

  public void setRumSessionReplayAddOnUsage(Double rumSessionReplayAddOnUsage) {
    this.rumSessionReplayAddOnUsage = rumSessionReplayAddOnUsage;
  }

  public MonthlyUsageAttributionValues scaFargatePercentage(Double scaFargatePercentage) {
    this.scaFargatePercentage = scaFargatePercentage;
    return this;
  }

  /**
   * The percentage of Software Composition Analysis Fargate task usage by tag(s).
   *
   * @return scaFargatePercentage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCA_FARGATE_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getScaFargatePercentage() {
    return scaFargatePercentage;
  }

  public void setScaFargatePercentage(Double scaFargatePercentage) {
    this.scaFargatePercentage = scaFargatePercentage;
  }

  public MonthlyUsageAttributionValues scaFargateUsage(Double scaFargateUsage) {
    this.scaFargateUsage = scaFargateUsage;
    return this;
  }

  /**
   * The total Software Composition Analysis Fargate task usage by tag(s).
   *
   * @return scaFargateUsage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCA_FARGATE_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getScaFargateUsage() {
    return scaFargateUsage;
  }

  public void setScaFargateUsage(Double scaFargateUsage) {
    this.scaFargateUsage = scaFargateUsage;
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

  public MonthlyUsageAttributionValues siemAnalyzedLogsAddOnPercentage(
      Double siemAnalyzedLogsAddOnPercentage) {
    this.siemAnalyzedLogsAddOnPercentage = siemAnalyzedLogsAddOnPercentage;
    return this;
  }

  /**
   * The percentage of log events analyzed by Cloud SIEM usage by tag(s).
   *
   * @return siemAnalyzedLogsAddOnPercentage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SIEM_ANALYZED_LOGS_ADD_ON_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getSiemAnalyzedLogsAddOnPercentage() {
    return siemAnalyzedLogsAddOnPercentage;
  }

  public void setSiemAnalyzedLogsAddOnPercentage(Double siemAnalyzedLogsAddOnPercentage) {
    this.siemAnalyzedLogsAddOnPercentage = siemAnalyzedLogsAddOnPercentage;
  }

  public MonthlyUsageAttributionValues siemAnalyzedLogsAddOnUsage(
      Double siemAnalyzedLogsAddOnUsage) {
    this.siemAnalyzedLogsAddOnUsage = siemAnalyzedLogsAddOnUsage;
    return this;
  }

  /**
   * The log events analyzed by Cloud SIEM usage by tag(s).
   *
   * @return siemAnalyzedLogsAddOnUsage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SIEM_ANALYZED_LOGS_ADD_ON_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getSiemAnalyzedLogsAddOnUsage() {
    return siemAnalyzedLogsAddOnUsage;
  }

  public void setSiemAnalyzedLogsAddOnUsage(Double siemAnalyzedLogsAddOnUsage) {
    this.siemAnalyzedLogsAddOnUsage = siemAnalyzedLogsAddOnUsage;
  }

  public MonthlyUsageAttributionValues siemIngestedBytesPercentage(
      Double siemIngestedBytesPercentage) {
    this.siemIngestedBytesPercentage = siemIngestedBytesPercentage;
    return this;
  }

  /**
   * The percentage of SIEM usage by tag(s).
   *
   * @return siemIngestedBytesPercentage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SIEM_INGESTED_BYTES_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getSiemIngestedBytesPercentage() {
    return siemIngestedBytesPercentage;
  }

  public void setSiemIngestedBytesPercentage(Double siemIngestedBytesPercentage) {
    this.siemIngestedBytesPercentage = siemIngestedBytesPercentage;
  }

  public MonthlyUsageAttributionValues siemIngestedBytesUsage(Double siemIngestedBytesUsage) {
    this.siemIngestedBytesUsage = siemIngestedBytesUsage;
    return this;
  }

  /**
   * The total SIEM usage by tag(s).
   *
   * @return siemIngestedBytesUsage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SIEM_INGESTED_BYTES_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getSiemIngestedBytesUsage() {
    return siemIngestedBytesUsage;
  }

  public void setSiemIngestedBytesUsage(Double siemIngestedBytesUsage) {
    this.siemIngestedBytesUsage = siemIngestedBytesUsage;
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

  public MonthlyUsageAttributionValues workflowExecutionsPercentage(
      Double workflowExecutionsPercentage) {
    this.workflowExecutionsPercentage = workflowExecutionsPercentage;
    return this;
  }

  /**
   * The percentage of workflow executions usage by tag(s).
   *
   * @return workflowExecutionsPercentage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WORKFLOW_EXECUTIONS_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getWorkflowExecutionsPercentage() {
    return workflowExecutionsPercentage;
  }

  public void setWorkflowExecutionsPercentage(Double workflowExecutionsPercentage) {
    this.workflowExecutionsPercentage = workflowExecutionsPercentage;
  }

  public MonthlyUsageAttributionValues workflowExecutionsUsage(Double workflowExecutionsUsage) {
    this.workflowExecutionsUsage = workflowExecutionsUsage;
    return this;
  }

  /**
   * The total workflow executions usage by tag(s).
   *
   * @return workflowExecutionsUsage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WORKFLOW_EXECUTIONS_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getWorkflowExecutionsUsage() {
    return workflowExecutionsUsage;
  }

  public void setWorkflowExecutionsUsage(Double workflowExecutionsUsage) {
    this.workflowExecutionsUsage = workflowExecutionsUsage;
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
        && Objects.equals(
            this.asmServerlessTracedInvocationsPercentage,
            monthlyUsageAttributionValues.asmServerlessTracedInvocationsPercentage)
        && Objects.equals(
            this.asmServerlessTracedInvocationsUsage,
            monthlyUsageAttributionValues.asmServerlessTracedInvocationsUsage)
        && Objects.equals(this.browserPercentage, monthlyUsageAttributionValues.browserPercentage)
        && Objects.equals(this.browserUsage, monthlyUsageAttributionValues.browserUsage)
        && Objects.equals(
            this.ciPipelineIndexedSpansPercentage,
            monthlyUsageAttributionValues.ciPipelineIndexedSpansPercentage)
        && Objects.equals(
            this.ciPipelineIndexedSpansUsage,
            monthlyUsageAttributionValues.ciPipelineIndexedSpansUsage)
        && Objects.equals(
            this.ciTestIndexedSpansPercentage,
            monthlyUsageAttributionValues.ciTestIndexedSpansPercentage)
        && Objects.equals(
            this.ciTestIndexedSpansUsage, monthlyUsageAttributionValues.ciTestIndexedSpansUsage)
        && Objects.equals(
            this.ciVisibilityItrPercentage, monthlyUsageAttributionValues.ciVisibilityItrPercentage)
        && Objects.equals(
            this.ciVisibilityItrUsage, monthlyUsageAttributionValues.ciVisibilityItrUsage)
        && Objects.equals(
            this.cloudSiemPercentage, monthlyUsageAttributionValues.cloudSiemPercentage)
        && Objects.equals(this.cloudSiemUsage, monthlyUsageAttributionValues.cloudSiemUsage)
        && Objects.equals(
            this.codeSecurityHostPercentage,
            monthlyUsageAttributionValues.codeSecurityHostPercentage)
        && Objects.equals(
            this.codeSecurityHostUsage, monthlyUsageAttributionValues.codeSecurityHostUsage)
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
            this.customEventPercentage, monthlyUsageAttributionValues.customEventPercentage)
        && Objects.equals(this.customEventUsage, monthlyUsageAttributionValues.customEventUsage)
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
        && Objects.equals(
            this.cwsFargateTaskPercentage, monthlyUsageAttributionValues.cwsFargateTaskPercentage)
        && Objects.equals(
            this.cwsFargateTaskUsage, monthlyUsageAttributionValues.cwsFargateTaskUsage)
        && Objects.equals(this.cwsHostsPercentage, monthlyUsageAttributionValues.cwsHostsPercentage)
        && Objects.equals(this.cwsHostsUsage, monthlyUsageAttributionValues.cwsHostsUsage)
        && Objects.equals(
            this.dataJobsMonitoringUsage, monthlyUsageAttributionValues.dataJobsMonitoringUsage)
        && Objects.equals(
            this.dataStreamMonitoringUsage, monthlyUsageAttributionValues.dataStreamMonitoringUsage)
        && Objects.equals(this.dbmHostsPercentage, monthlyUsageAttributionValues.dbmHostsPercentage)
        && Objects.equals(this.dbmHostsUsage, monthlyUsageAttributionValues.dbmHostsUsage)
        && Objects.equals(
            this.dbmQueriesPercentage, monthlyUsageAttributionValues.dbmQueriesPercentage)
        && Objects.equals(this.dbmQueriesUsage, monthlyUsageAttributionValues.dbmQueriesUsage)
        && Objects.equals(
            this.errorTrackingPercentage, monthlyUsageAttributionValues.errorTrackingPercentage)
        && Objects.equals(this.errorTrackingUsage, monthlyUsageAttributionValues.errorTrackingUsage)
        && Objects.equals(
            this.estimatedIndexedSpansPercentage,
            monthlyUsageAttributionValues.estimatedIndexedSpansPercentage)
        && Objects.equals(
            this.estimatedIndexedSpansUsage,
            monthlyUsageAttributionValues.estimatedIndexedSpansUsage)
        && Objects.equals(
            this.estimatedIngestedSpansPercentage,
            monthlyUsageAttributionValues.estimatedIngestedSpansPercentage)
        && Objects.equals(
            this.estimatedIngestedSpansUsage,
            monthlyUsageAttributionValues.estimatedIngestedSpansUsage)
        && Objects.equals(this.fargatePercentage, monthlyUsageAttributionValues.fargatePercentage)
        && Objects.equals(this.fargateUsage, monthlyUsageAttributionValues.fargateUsage)
        && Objects.equals(
            this.functionsPercentage, monthlyUsageAttributionValues.functionsPercentage)
        && Objects.equals(this.functionsUsage, monthlyUsageAttributionValues.functionsUsage)
        && Objects.equals(
            this.incidentManagementMonthlyActiveUsersPercentage,
            monthlyUsageAttributionValues.incidentManagementMonthlyActiveUsersPercentage)
        && Objects.equals(
            this.incidentManagementMonthlyActiveUsersUsage,
            monthlyUsageAttributionValues.incidentManagementMonthlyActiveUsersUsage)
        && Objects.equals(
            this.indexedSpansPercentage, monthlyUsageAttributionValues.indexedSpansPercentage)
        && Objects.equals(this.indexedSpansUsage, monthlyUsageAttributionValues.indexedSpansUsage)
        && Objects.equals(
            this.infraHostPercentage, monthlyUsageAttributionValues.infraHostPercentage)
        && Objects.equals(this.infraHostUsage, monthlyUsageAttributionValues.infraHostUsage)
        && Objects.equals(
            this.ingestedLogsBytesPercentage,
            monthlyUsageAttributionValues.ingestedLogsBytesPercentage)
        && Objects.equals(
            this.ingestedLogsBytesUsage, monthlyUsageAttributionValues.ingestedLogsBytesUsage)
        && Objects.equals(
            this.ingestedSpansBytesPercentage,
            monthlyUsageAttributionValues.ingestedSpansBytesPercentage)
        && Objects.equals(
            this.ingestedSpansBytesUsage, monthlyUsageAttributionValues.ingestedSpansBytesUsage)
        && Objects.equals(
            this.invocationsPercentage, monthlyUsageAttributionValues.invocationsPercentage)
        && Objects.equals(this.invocationsUsage, monthlyUsageAttributionValues.invocationsUsage)
        && Objects.equals(
            this.lambdaTracedInvocationsPercentage,
            monthlyUsageAttributionValues.lambdaTracedInvocationsPercentage)
        && Objects.equals(
            this.lambdaTracedInvocationsUsage,
            monthlyUsageAttributionValues.lambdaTracedInvocationsUsage)
        && Objects.equals(
            this.llmObservabilityPercentage,
            monthlyUsageAttributionValues.llmObservabilityPercentage)
        && Objects.equals(
            this.llmObservabilityUsage, monthlyUsageAttributionValues.llmObservabilityUsage)
        && Objects.equals(this.llmSpansPercentage, monthlyUsageAttributionValues.llmSpansPercentage)
        && Objects.equals(this.llmSpansUsage, monthlyUsageAttributionValues.llmSpansUsage)
        && Objects.equals(
            this.logsIndexed15dayPercentage,
            monthlyUsageAttributionValues.logsIndexed15dayPercentage)
        && Objects.equals(
            this.logsIndexed15dayUsage, monthlyUsageAttributionValues.logsIndexed15dayUsage)
        && Objects.equals(
            this.logsIndexed180dayPercentage,
            monthlyUsageAttributionValues.logsIndexed180dayPercentage)
        && Objects.equals(
            this.logsIndexed180dayUsage, monthlyUsageAttributionValues.logsIndexed180dayUsage)
        && Objects.equals(
            this.logsIndexed1dayPercentage, monthlyUsageAttributionValues.logsIndexed1dayPercentage)
        && Objects.equals(
            this.logsIndexed1dayUsage, monthlyUsageAttributionValues.logsIndexed1dayUsage)
        && Objects.equals(
            this.logsIndexed30dayPercentage,
            monthlyUsageAttributionValues.logsIndexed30dayPercentage)
        && Objects.equals(
            this.logsIndexed30dayUsage, monthlyUsageAttributionValues.logsIndexed30dayUsage)
        && Objects.equals(
            this.logsIndexed360dayPercentage,
            monthlyUsageAttributionValues.logsIndexed360dayPercentage)
        && Objects.equals(
            this.logsIndexed360dayUsage, monthlyUsageAttributionValues.logsIndexed360dayUsage)
        && Objects.equals(
            this.logsIndexed3dayPercentage, monthlyUsageAttributionValues.logsIndexed3dayPercentage)
        && Objects.equals(
            this.logsIndexed3dayUsage, monthlyUsageAttributionValues.logsIndexed3dayUsage)
        && Objects.equals(
            this.logsIndexed45dayPercentage,
            monthlyUsageAttributionValues.logsIndexed45dayPercentage)
        && Objects.equals(
            this.logsIndexed45dayUsage, monthlyUsageAttributionValues.logsIndexed45dayUsage)
        && Objects.equals(
            this.logsIndexed60dayPercentage,
            monthlyUsageAttributionValues.logsIndexed60dayPercentage)
        && Objects.equals(
            this.logsIndexed60dayUsage, monthlyUsageAttributionValues.logsIndexed60dayUsage)
        && Objects.equals(
            this.logsIndexed7dayPercentage, monthlyUsageAttributionValues.logsIndexed7dayPercentage)
        && Objects.equals(
            this.logsIndexed7dayUsage, monthlyUsageAttributionValues.logsIndexed7dayUsage)
        && Objects.equals(
            this.logsIndexed90dayPercentage,
            monthlyUsageAttributionValues.logsIndexed90dayPercentage)
        && Objects.equals(
            this.logsIndexed90dayUsage, monthlyUsageAttributionValues.logsIndexed90dayUsage)
        && Objects.equals(
            this.logsIndexedCustomRetentionPercentage,
            monthlyUsageAttributionValues.logsIndexedCustomRetentionPercentage)
        && Objects.equals(
            this.logsIndexedCustomRetentionUsage,
            monthlyUsageAttributionValues.logsIndexedCustomRetentionUsage)
        && Objects.equals(
            this.mobileAppTestingPercentage,
            monthlyUsageAttributionValues.mobileAppTestingPercentage)
        && Objects.equals(
            this.mobileAppTestingUsage, monthlyUsageAttributionValues.mobileAppTestingUsage)
        && Objects.equals(
            this.ndmNetflowPercentage, monthlyUsageAttributionValues.ndmNetflowPercentage)
        && Objects.equals(this.ndmNetflowUsage, monthlyUsageAttributionValues.ndmNetflowUsage)
        && Objects.equals(
            this.networkDeviceWirelessPercentage,
            monthlyUsageAttributionValues.networkDeviceWirelessPercentage)
        && Objects.equals(
            this.networkDeviceWirelessUsage,
            monthlyUsageAttributionValues.networkDeviceWirelessUsage)
        && Objects.equals(this.npmHostPercentage, monthlyUsageAttributionValues.npmHostPercentage)
        && Objects.equals(this.npmHostUsage, monthlyUsageAttributionValues.npmHostUsage)
        && Objects.equals(
            this.obsPipelineBytesPercentage,
            monthlyUsageAttributionValues.obsPipelineBytesPercentage)
        && Objects.equals(
            this.obsPipelineBytesUsage, monthlyUsageAttributionValues.obsPipelineBytesUsage)
        && Objects.equals(
            this.obsPipelinesVcpuPercentage,
            monthlyUsageAttributionValues.obsPipelinesVcpuPercentage)
        && Objects.equals(
            this.obsPipelinesVcpuUsage, monthlyUsageAttributionValues.obsPipelinesVcpuUsage)
        && Objects.equals(
            this.onlineArchivePercentage, monthlyUsageAttributionValues.onlineArchivePercentage)
        && Objects.equals(this.onlineArchiveUsage, monthlyUsageAttributionValues.onlineArchiveUsage)
        && Objects.equals(
            this.productAnalyticsSessionPercentage,
            monthlyUsageAttributionValues.productAnalyticsSessionPercentage)
        && Objects.equals(
            this.productAnalyticsSessionUsage,
            monthlyUsageAttributionValues.productAnalyticsSessionUsage)
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
            this.publishedAppPercentage, monthlyUsageAttributionValues.publishedAppPercentage)
        && Objects.equals(this.publishedAppUsage, monthlyUsageAttributionValues.publishedAppUsage)
        && Objects.equals(
            this.rumBrowserMobileSessionsPercentage,
            monthlyUsageAttributionValues.rumBrowserMobileSessionsPercentage)
        && Objects.equals(
            this.rumBrowserMobileSessionsUsage,
            monthlyUsageAttributionValues.rumBrowserMobileSessionsUsage)
        && Objects.equals(
            this.rumIngestedPercentage, monthlyUsageAttributionValues.rumIngestedPercentage)
        && Objects.equals(this.rumIngestedUsage, monthlyUsageAttributionValues.rumIngestedUsage)
        && Objects.equals(
            this.rumInvestigatePercentage, monthlyUsageAttributionValues.rumInvestigatePercentage)
        && Objects.equals(
            this.rumInvestigateUsage, monthlyUsageAttributionValues.rumInvestigateUsage)
        && Objects.equals(
            this.rumReplaySessionsPercentage,
            monthlyUsageAttributionValues.rumReplaySessionsPercentage)
        && Objects.equals(
            this.rumReplaySessionsUsage, monthlyUsageAttributionValues.rumReplaySessionsUsage)
        && Objects.equals(
            this.rumSessionReplayAddOnPercentage,
            monthlyUsageAttributionValues.rumSessionReplayAddOnPercentage)
        && Objects.equals(
            this.rumSessionReplayAddOnUsage,
            monthlyUsageAttributionValues.rumSessionReplayAddOnUsage)
        && Objects.equals(
            this.scaFargatePercentage, monthlyUsageAttributionValues.scaFargatePercentage)
        && Objects.equals(this.scaFargateUsage, monthlyUsageAttributionValues.scaFargateUsage)
        && Objects.equals(
            this.sdsScannedBytesPercentage, monthlyUsageAttributionValues.sdsScannedBytesPercentage)
        && Objects.equals(
            this.sdsScannedBytesUsage, monthlyUsageAttributionValues.sdsScannedBytesUsage)
        && Objects.equals(
            this.serverlessAppsPercentage, monthlyUsageAttributionValues.serverlessAppsPercentage)
        && Objects.equals(
            this.serverlessAppsUsage, monthlyUsageAttributionValues.serverlessAppsUsage)
        && Objects.equals(
            this.siemAnalyzedLogsAddOnPercentage,
            monthlyUsageAttributionValues.siemAnalyzedLogsAddOnPercentage)
        && Objects.equals(
            this.siemAnalyzedLogsAddOnUsage,
            monthlyUsageAttributionValues.siemAnalyzedLogsAddOnUsage)
        && Objects.equals(
            this.siemIngestedBytesPercentage,
            monthlyUsageAttributionValues.siemIngestedBytesPercentage)
        && Objects.equals(
            this.siemIngestedBytesUsage, monthlyUsageAttributionValues.siemIngestedBytesUsage)
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
            this.workflowExecutionsPercentage,
            monthlyUsageAttributionValues.workflowExecutionsPercentage)
        && Objects.equals(
            this.workflowExecutionsUsage, monthlyUsageAttributionValues.workflowExecutionsUsage)
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
        asmServerlessTracedInvocationsPercentage,
        asmServerlessTracedInvocationsUsage,
        browserPercentage,
        browserUsage,
        ciPipelineIndexedSpansPercentage,
        ciPipelineIndexedSpansUsage,
        ciTestIndexedSpansPercentage,
        ciTestIndexedSpansUsage,
        ciVisibilityItrPercentage,
        ciVisibilityItrUsage,
        cloudSiemPercentage,
        cloudSiemUsage,
        codeSecurityHostPercentage,
        codeSecurityHostUsage,
        containerExclAgentPercentage,
        containerExclAgentUsage,
        containerPercentage,
        containerUsage,
        cspmContainersPercentage,
        cspmContainersUsage,
        cspmHostsPercentage,
        cspmHostsUsage,
        customEventPercentage,
        customEventUsage,
        customIngestedTimeseriesPercentage,
        customIngestedTimeseriesUsage,
        customTimeseriesPercentage,
        customTimeseriesUsage,
        cwsContainersPercentage,
        cwsContainersUsage,
        cwsFargateTaskPercentage,
        cwsFargateTaskUsage,
        cwsHostsPercentage,
        cwsHostsUsage,
        dataJobsMonitoringUsage,
        dataStreamMonitoringUsage,
        dbmHostsPercentage,
        dbmHostsUsage,
        dbmQueriesPercentage,
        dbmQueriesUsage,
        errorTrackingPercentage,
        errorTrackingUsage,
        estimatedIndexedSpansPercentage,
        estimatedIndexedSpansUsage,
        estimatedIngestedSpansPercentage,
        estimatedIngestedSpansUsage,
        fargatePercentage,
        fargateUsage,
        functionsPercentage,
        functionsUsage,
        incidentManagementMonthlyActiveUsersPercentage,
        incidentManagementMonthlyActiveUsersUsage,
        indexedSpansPercentage,
        indexedSpansUsage,
        infraHostPercentage,
        infraHostUsage,
        ingestedLogsBytesPercentage,
        ingestedLogsBytesUsage,
        ingestedSpansBytesPercentage,
        ingestedSpansBytesUsage,
        invocationsPercentage,
        invocationsUsage,
        lambdaTracedInvocationsPercentage,
        lambdaTracedInvocationsUsage,
        llmObservabilityPercentage,
        llmObservabilityUsage,
        llmSpansPercentage,
        llmSpansUsage,
        logsIndexed15dayPercentage,
        logsIndexed15dayUsage,
        logsIndexed180dayPercentage,
        logsIndexed180dayUsage,
        logsIndexed1dayPercentage,
        logsIndexed1dayUsage,
        logsIndexed30dayPercentage,
        logsIndexed30dayUsage,
        logsIndexed360dayPercentage,
        logsIndexed360dayUsage,
        logsIndexed3dayPercentage,
        logsIndexed3dayUsage,
        logsIndexed45dayPercentage,
        logsIndexed45dayUsage,
        logsIndexed60dayPercentage,
        logsIndexed60dayUsage,
        logsIndexed7dayPercentage,
        logsIndexed7dayUsage,
        logsIndexed90dayPercentage,
        logsIndexed90dayUsage,
        logsIndexedCustomRetentionPercentage,
        logsIndexedCustomRetentionUsage,
        mobileAppTestingPercentage,
        mobileAppTestingUsage,
        ndmNetflowPercentage,
        ndmNetflowUsage,
        networkDeviceWirelessPercentage,
        networkDeviceWirelessUsage,
        npmHostPercentage,
        npmHostUsage,
        obsPipelineBytesPercentage,
        obsPipelineBytesUsage,
        obsPipelinesVcpuPercentage,
        obsPipelinesVcpuUsage,
        onlineArchivePercentage,
        onlineArchiveUsage,
        productAnalyticsSessionPercentage,
        productAnalyticsSessionUsage,
        profiledContainerPercentage,
        profiledContainerUsage,
        profiledFargatePercentage,
        profiledFargateUsage,
        profiledHostPercentage,
        profiledHostUsage,
        publishedAppPercentage,
        publishedAppUsage,
        rumBrowserMobileSessionsPercentage,
        rumBrowserMobileSessionsUsage,
        rumIngestedPercentage,
        rumIngestedUsage,
        rumInvestigatePercentage,
        rumInvestigateUsage,
        rumReplaySessionsPercentage,
        rumReplaySessionsUsage,
        rumSessionReplayAddOnPercentage,
        rumSessionReplayAddOnUsage,
        scaFargatePercentage,
        scaFargateUsage,
        sdsScannedBytesPercentage,
        sdsScannedBytesUsage,
        serverlessAppsPercentage,
        serverlessAppsUsage,
        siemAnalyzedLogsAddOnPercentage,
        siemAnalyzedLogsAddOnUsage,
        siemIngestedBytesPercentage,
        siemIngestedBytesUsage,
        snmpPercentage,
        snmpUsage,
        universalServiceMonitoringPercentage,
        universalServiceMonitoringUsage,
        vulnManagementHostsPercentage,
        vulnManagementHostsUsage,
        workflowExecutionsPercentage,
        workflowExecutionsUsage,
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
    sb.append("    asmServerlessTracedInvocationsPercentage: ")
        .append(toIndentedString(asmServerlessTracedInvocationsPercentage))
        .append("\n");
    sb.append("    asmServerlessTracedInvocationsUsage: ")
        .append(toIndentedString(asmServerlessTracedInvocationsUsage))
        .append("\n");
    sb.append("    browserPercentage: ").append(toIndentedString(browserPercentage)).append("\n");
    sb.append("    browserUsage: ").append(toIndentedString(browserUsage)).append("\n");
    sb.append("    ciPipelineIndexedSpansPercentage: ")
        .append(toIndentedString(ciPipelineIndexedSpansPercentage))
        .append("\n");
    sb.append("    ciPipelineIndexedSpansUsage: ")
        .append(toIndentedString(ciPipelineIndexedSpansUsage))
        .append("\n");
    sb.append("    ciTestIndexedSpansPercentage: ")
        .append(toIndentedString(ciTestIndexedSpansPercentage))
        .append("\n");
    sb.append("    ciTestIndexedSpansUsage: ")
        .append(toIndentedString(ciTestIndexedSpansUsage))
        .append("\n");
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
    sb.append("    codeSecurityHostPercentage: ")
        .append(toIndentedString(codeSecurityHostPercentage))
        .append("\n");
    sb.append("    codeSecurityHostUsage: ")
        .append(toIndentedString(codeSecurityHostUsage))
        .append("\n");
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
    sb.append("    customEventPercentage: ")
        .append(toIndentedString(customEventPercentage))
        .append("\n");
    sb.append("    customEventUsage: ").append(toIndentedString(customEventUsage)).append("\n");
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
    sb.append("    cwsFargateTaskPercentage: ")
        .append(toIndentedString(cwsFargateTaskPercentage))
        .append("\n");
    sb.append("    cwsFargateTaskUsage: ")
        .append(toIndentedString(cwsFargateTaskUsage))
        .append("\n");
    sb.append("    cwsHostsPercentage: ").append(toIndentedString(cwsHostsPercentage)).append("\n");
    sb.append("    cwsHostsUsage: ").append(toIndentedString(cwsHostsUsage)).append("\n");
    sb.append("    dataJobsMonitoringUsage: ")
        .append(toIndentedString(dataJobsMonitoringUsage))
        .append("\n");
    sb.append("    dataStreamMonitoringUsage: ")
        .append(toIndentedString(dataStreamMonitoringUsage))
        .append("\n");
    sb.append("    dbmHostsPercentage: ").append(toIndentedString(dbmHostsPercentage)).append("\n");
    sb.append("    dbmHostsUsage: ").append(toIndentedString(dbmHostsUsage)).append("\n");
    sb.append("    dbmQueriesPercentage: ")
        .append(toIndentedString(dbmQueriesPercentage))
        .append("\n");
    sb.append("    dbmQueriesUsage: ").append(toIndentedString(dbmQueriesUsage)).append("\n");
    sb.append("    errorTrackingPercentage: ")
        .append(toIndentedString(errorTrackingPercentage))
        .append("\n");
    sb.append("    errorTrackingUsage: ").append(toIndentedString(errorTrackingUsage)).append("\n");
    sb.append("    estimatedIndexedSpansPercentage: ")
        .append(toIndentedString(estimatedIndexedSpansPercentage))
        .append("\n");
    sb.append("    estimatedIndexedSpansUsage: ")
        .append(toIndentedString(estimatedIndexedSpansUsage))
        .append("\n");
    sb.append("    estimatedIngestedSpansPercentage: ")
        .append(toIndentedString(estimatedIngestedSpansPercentage))
        .append("\n");
    sb.append("    estimatedIngestedSpansUsage: ")
        .append(toIndentedString(estimatedIngestedSpansUsage))
        .append("\n");
    sb.append("    fargatePercentage: ").append(toIndentedString(fargatePercentage)).append("\n");
    sb.append("    fargateUsage: ").append(toIndentedString(fargateUsage)).append("\n");
    sb.append("    functionsPercentage: ")
        .append(toIndentedString(functionsPercentage))
        .append("\n");
    sb.append("    functionsUsage: ").append(toIndentedString(functionsUsage)).append("\n");
    sb.append("    incidentManagementMonthlyActiveUsersPercentage: ")
        .append(toIndentedString(incidentManagementMonthlyActiveUsersPercentage))
        .append("\n");
    sb.append("    incidentManagementMonthlyActiveUsersUsage: ")
        .append(toIndentedString(incidentManagementMonthlyActiveUsersUsage))
        .append("\n");
    sb.append("    indexedSpansPercentage: ")
        .append(toIndentedString(indexedSpansPercentage))
        .append("\n");
    sb.append("    indexedSpansUsage: ").append(toIndentedString(indexedSpansUsage)).append("\n");
    sb.append("    infraHostPercentage: ")
        .append(toIndentedString(infraHostPercentage))
        .append("\n");
    sb.append("    infraHostUsage: ").append(toIndentedString(infraHostUsage)).append("\n");
    sb.append("    ingestedLogsBytesPercentage: ")
        .append(toIndentedString(ingestedLogsBytesPercentage))
        .append("\n");
    sb.append("    ingestedLogsBytesUsage: ")
        .append(toIndentedString(ingestedLogsBytesUsage))
        .append("\n");
    sb.append("    ingestedSpansBytesPercentage: ")
        .append(toIndentedString(ingestedSpansBytesPercentage))
        .append("\n");
    sb.append("    ingestedSpansBytesUsage: ")
        .append(toIndentedString(ingestedSpansBytesUsage))
        .append("\n");
    sb.append("    invocationsPercentage: ")
        .append(toIndentedString(invocationsPercentage))
        .append("\n");
    sb.append("    invocationsUsage: ").append(toIndentedString(invocationsUsage)).append("\n");
    sb.append("    lambdaTracedInvocationsPercentage: ")
        .append(toIndentedString(lambdaTracedInvocationsPercentage))
        .append("\n");
    sb.append("    lambdaTracedInvocationsUsage: ")
        .append(toIndentedString(lambdaTracedInvocationsUsage))
        .append("\n");
    sb.append("    llmObservabilityPercentage: ")
        .append(toIndentedString(llmObservabilityPercentage))
        .append("\n");
    sb.append("    llmObservabilityUsage: ")
        .append(toIndentedString(llmObservabilityUsage))
        .append("\n");
    sb.append("    llmSpansPercentage: ").append(toIndentedString(llmSpansPercentage)).append("\n");
    sb.append("    llmSpansUsage: ").append(toIndentedString(llmSpansUsage)).append("\n");
    sb.append("    logsIndexed15dayPercentage: ")
        .append(toIndentedString(logsIndexed15dayPercentage))
        .append("\n");
    sb.append("    logsIndexed15dayUsage: ")
        .append(toIndentedString(logsIndexed15dayUsage))
        .append("\n");
    sb.append("    logsIndexed180dayPercentage: ")
        .append(toIndentedString(logsIndexed180dayPercentage))
        .append("\n");
    sb.append("    logsIndexed180dayUsage: ")
        .append(toIndentedString(logsIndexed180dayUsage))
        .append("\n");
    sb.append("    logsIndexed1dayPercentage: ")
        .append(toIndentedString(logsIndexed1dayPercentage))
        .append("\n");
    sb.append("    logsIndexed1dayUsage: ")
        .append(toIndentedString(logsIndexed1dayUsage))
        .append("\n");
    sb.append("    logsIndexed30dayPercentage: ")
        .append(toIndentedString(logsIndexed30dayPercentage))
        .append("\n");
    sb.append("    logsIndexed30dayUsage: ")
        .append(toIndentedString(logsIndexed30dayUsage))
        .append("\n");
    sb.append("    logsIndexed360dayPercentage: ")
        .append(toIndentedString(logsIndexed360dayPercentage))
        .append("\n");
    sb.append("    logsIndexed360dayUsage: ")
        .append(toIndentedString(logsIndexed360dayUsage))
        .append("\n");
    sb.append("    logsIndexed3dayPercentage: ")
        .append(toIndentedString(logsIndexed3dayPercentage))
        .append("\n");
    sb.append("    logsIndexed3dayUsage: ")
        .append(toIndentedString(logsIndexed3dayUsage))
        .append("\n");
    sb.append("    logsIndexed45dayPercentage: ")
        .append(toIndentedString(logsIndexed45dayPercentage))
        .append("\n");
    sb.append("    logsIndexed45dayUsage: ")
        .append(toIndentedString(logsIndexed45dayUsage))
        .append("\n");
    sb.append("    logsIndexed60dayPercentage: ")
        .append(toIndentedString(logsIndexed60dayPercentage))
        .append("\n");
    sb.append("    logsIndexed60dayUsage: ")
        .append(toIndentedString(logsIndexed60dayUsage))
        .append("\n");
    sb.append("    logsIndexed7dayPercentage: ")
        .append(toIndentedString(logsIndexed7dayPercentage))
        .append("\n");
    sb.append("    logsIndexed7dayUsage: ")
        .append(toIndentedString(logsIndexed7dayUsage))
        .append("\n");
    sb.append("    logsIndexed90dayPercentage: ")
        .append(toIndentedString(logsIndexed90dayPercentage))
        .append("\n");
    sb.append("    logsIndexed90dayUsage: ")
        .append(toIndentedString(logsIndexed90dayUsage))
        .append("\n");
    sb.append("    logsIndexedCustomRetentionPercentage: ")
        .append(toIndentedString(logsIndexedCustomRetentionPercentage))
        .append("\n");
    sb.append("    logsIndexedCustomRetentionUsage: ")
        .append(toIndentedString(logsIndexedCustomRetentionUsage))
        .append("\n");
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
    sb.append("    networkDeviceWirelessPercentage: ")
        .append(toIndentedString(networkDeviceWirelessPercentage))
        .append("\n");
    sb.append("    networkDeviceWirelessUsage: ")
        .append(toIndentedString(networkDeviceWirelessUsage))
        .append("\n");
    sb.append("    npmHostPercentage: ").append(toIndentedString(npmHostPercentage)).append("\n");
    sb.append("    npmHostUsage: ").append(toIndentedString(npmHostUsage)).append("\n");
    sb.append("    obsPipelineBytesPercentage: ")
        .append(toIndentedString(obsPipelineBytesPercentage))
        .append("\n");
    sb.append("    obsPipelineBytesUsage: ")
        .append(toIndentedString(obsPipelineBytesUsage))
        .append("\n");
    sb.append("    obsPipelinesVcpuPercentage: ")
        .append(toIndentedString(obsPipelinesVcpuPercentage))
        .append("\n");
    sb.append("    obsPipelinesVcpuUsage: ")
        .append(toIndentedString(obsPipelinesVcpuUsage))
        .append("\n");
    sb.append("    onlineArchivePercentage: ")
        .append(toIndentedString(onlineArchivePercentage))
        .append("\n");
    sb.append("    onlineArchiveUsage: ").append(toIndentedString(onlineArchiveUsage)).append("\n");
    sb.append("    productAnalyticsSessionPercentage: ")
        .append(toIndentedString(productAnalyticsSessionPercentage))
        .append("\n");
    sb.append("    productAnalyticsSessionUsage: ")
        .append(toIndentedString(productAnalyticsSessionUsage))
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
    sb.append("    publishedAppPercentage: ")
        .append(toIndentedString(publishedAppPercentage))
        .append("\n");
    sb.append("    publishedAppUsage: ").append(toIndentedString(publishedAppUsage)).append("\n");
    sb.append("    rumBrowserMobileSessionsPercentage: ")
        .append(toIndentedString(rumBrowserMobileSessionsPercentage))
        .append("\n");
    sb.append("    rumBrowserMobileSessionsUsage: ")
        .append(toIndentedString(rumBrowserMobileSessionsUsage))
        .append("\n");
    sb.append("    rumIngestedPercentage: ")
        .append(toIndentedString(rumIngestedPercentage))
        .append("\n");
    sb.append("    rumIngestedUsage: ").append(toIndentedString(rumIngestedUsage)).append("\n");
    sb.append("    rumInvestigatePercentage: ")
        .append(toIndentedString(rumInvestigatePercentage))
        .append("\n");
    sb.append("    rumInvestigateUsage: ")
        .append(toIndentedString(rumInvestigateUsage))
        .append("\n");
    sb.append("    rumReplaySessionsPercentage: ")
        .append(toIndentedString(rumReplaySessionsPercentage))
        .append("\n");
    sb.append("    rumReplaySessionsUsage: ")
        .append(toIndentedString(rumReplaySessionsUsage))
        .append("\n");
    sb.append("    rumSessionReplayAddOnPercentage: ")
        .append(toIndentedString(rumSessionReplayAddOnPercentage))
        .append("\n");
    sb.append("    rumSessionReplayAddOnUsage: ")
        .append(toIndentedString(rumSessionReplayAddOnUsage))
        .append("\n");
    sb.append("    scaFargatePercentage: ")
        .append(toIndentedString(scaFargatePercentage))
        .append("\n");
    sb.append("    scaFargateUsage: ").append(toIndentedString(scaFargateUsage)).append("\n");
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
    sb.append("    siemAnalyzedLogsAddOnPercentage: ")
        .append(toIndentedString(siemAnalyzedLogsAddOnPercentage))
        .append("\n");
    sb.append("    siemAnalyzedLogsAddOnUsage: ")
        .append(toIndentedString(siemAnalyzedLogsAddOnUsage))
        .append("\n");
    sb.append("    siemIngestedBytesPercentage: ")
        .append(toIndentedString(siemIngestedBytesPercentage))
        .append("\n");
    sb.append("    siemIngestedBytesUsage: ")
        .append(toIndentedString(siemIngestedBytesUsage))
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
    sb.append("    workflowExecutionsPercentage: ")
        .append(toIndentedString(workflowExecutionsPercentage))
        .append("\n");
    sb.append("    workflowExecutionsUsage: ")
        .append(toIndentedString(workflowExecutionsUsage))
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
