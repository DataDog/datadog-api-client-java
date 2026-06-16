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

/**
 * Response summarizing all usage aggregated across the months in the request for all organizations,
 * and broken down by month and by organization.
 *
 * <p>Newly added billing dimensions and usage types appear as untyped keys on the <code>
 * additionalProperties</code> map instead of as typed fields. Call <code>
 * GET /api/v2/usage/summary/available_fields</code> to enumerate every key returned at this
 * response level—both typed fields and <code>additionalProperties</code> keys.
 */
@JsonPropertyOrder({
  UsageSummaryResponse.JSON_PROPERTY_AGENT_HOST_TOP99P_SUM,
  UsageSummaryResponse.JSON_PROPERTY_AI_CREDITS_AGENT_BUILDER_AI_CREDITS_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_AI_CREDITS_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_AI_CREDITS_BITS_ASSISTANT_AI_CREDITS_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_AI_CREDITS_BITS_DEV_AI_CREDITS_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_AI_CREDITS_BITS_SRE_AI_CREDITS_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_APM_AZURE_APP_SERVICE_HOST_TOP99P_SUM,
  UsageSummaryResponse.JSON_PROPERTY_APM_DEVSECOPS_HOST_TOP99P_SUM,
  UsageSummaryResponse.JSON_PROPERTY_APM_ENTERPRISE_STANDALONE_HOSTS_TOP99P_SUM,
  UsageSummaryResponse.JSON_PROPERTY_APM_FARGATE_COUNT_AVG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_APM_HOST_TOP99P_SUM,
  UsageSummaryResponse.JSON_PROPERTY_APM_PRO_STANDALONE_HOSTS_TOP99P_SUM,
  UsageSummaryResponse.JSON_PROPERTY_APPSEC_FARGATE_COUNT_AVG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_ASM_SERVERLESS_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_AUDIT_LOGS_LINES_INDEXED_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_AUDIT_TRAIL_ENABLED_HWM_SUM,
  UsageSummaryResponse.JSON_PROPERTY_AUDIT_TRAIL_EVENT_FORWARDING_EVENTS_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_AVG_PROFILED_FARGATE_TASKS_SUM,
  UsageSummaryResponse.JSON_PROPERTY_AWS_HOST_TOP99P_SUM,
  UsageSummaryResponse.JSON_PROPERTY_AWS_LAMBDA_FUNC_COUNT,
  UsageSummaryResponse.JSON_PROPERTY_AWS_LAMBDA_INVOCATIONS_SUM,
  UsageSummaryResponse.JSON_PROPERTY_AZURE_APP_SERVICE_TOP99P_SUM,
  UsageSummaryResponse.JSON_PROPERTY_AZURE_HOST_TOP99P_SUM,
  UsageSummaryResponse.JSON_PROPERTY_BILLABLE_INGESTED_BYTES_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_BITS_AI_INVESTIGATIONS_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_BROWSER_RUM_LITE_SESSION_COUNT_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_BROWSER_RUM_REPLAY_SESSION_COUNT_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_BROWSER_RUM_UNITS_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_CCM_ANTHROPIC_SPEND_LAST_SUM,
  UsageSummaryResponse.JSON_PROPERTY_CCM_AWS_SPEND_LAST_SUM,
  UsageSummaryResponse.JSON_PROPERTY_CCM_AZURE_SPEND_LAST_SUM,
  UsageSummaryResponse.JSON_PROPERTY_CCM_CONFLUENT_SPEND_LAST_SUM,
  UsageSummaryResponse.JSON_PROPERTY_CCM_DATABRICKS_SPEND_LAST_SUM,
  UsageSummaryResponse.JSON_PROPERTY_CCM_ELASTIC_SPEND_LAST_SUM,
  UsageSummaryResponse.JSON_PROPERTY_CCM_FASTLY_SPEND_LAST_SUM,
  UsageSummaryResponse.JSON_PROPERTY_CCM_GCP_SPEND_LAST_SUM,
  UsageSummaryResponse.JSON_PROPERTY_CCM_GITHUB_SPEND_LAST_SUM,
  UsageSummaryResponse.JSON_PROPERTY_CCM_MONGODB_SPEND_LAST_SUM,
  UsageSummaryResponse.JSON_PROPERTY_CCM_OCI_SPEND_LAST_SUM,
  UsageSummaryResponse.JSON_PROPERTY_CCM_OPENAI_SPEND_LAST_SUM,
  UsageSummaryResponse.JSON_PROPERTY_CCM_SNOWFLAKE_SPEND_LAST_SUM,
  UsageSummaryResponse.JSON_PROPERTY_CCM_SPEND_MONITORED_ENT_LAST_SUM,
  UsageSummaryResponse.JSON_PROPERTY_CCM_SPEND_MONITORED_PRO_LAST_SUM,
  UsageSummaryResponse.JSON_PROPERTY_CCM_TWILIO_SPEND_LAST_SUM,
  UsageSummaryResponse.JSON_PROPERTY_CI_PIPELINE_INDEXED_SPANS_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_CI_TEST_INDEXED_SPANS_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_CI_VISIBILITY_ITR_COMMITTERS_HWM_SUM,
  UsageSummaryResponse.JSON_PROPERTY_CI_VISIBILITY_PIPELINE_COMMITTERS_HWM_SUM,
  UsageSummaryResponse.JSON_PROPERTY_CI_VISIBILITY_TEST_COMMITTERS_HWM_SUM,
  UsageSummaryResponse.JSON_PROPERTY_CLOUD_COST_MANAGEMENT_AWS_HOST_COUNT_AVG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_CLOUD_COST_MANAGEMENT_AZURE_HOST_COUNT_AVG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_CLOUD_COST_MANAGEMENT_GCP_HOST_COUNT_AVG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_CLOUD_COST_MANAGEMENT_HOST_COUNT_AVG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_CLOUD_COST_MANAGEMENT_OCI_HOST_COUNT_AVG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_CLOUD_SIEM_EVENTS_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_CLOUD_SIEM_INDEXED_LOGS_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_CODE_ANALYSIS_SA_COMMITTERS_HWM_SUM,
  UsageSummaryResponse.JSON_PROPERTY_CODE_ANALYSIS_SCA_COMMITTERS_HWM_SUM,
  UsageSummaryResponse.JSON_PROPERTY_CODE_SECURITY_HOST_TOP99P_SUM,
  UsageSummaryResponse.JSON_PROPERTY_CONTAINER_AVG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_CONTAINER_EXCL_AGENT_AVG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_CONTAINER_HWM_SUM,
  UsageSummaryResponse.JSON_PROPERTY_CSM_CONTAINER_ENTERPRISE_COMPLIANCE_COUNT_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_CSM_CONTAINER_ENTERPRISE_CWS_COUNT_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_CSM_CONTAINER_ENTERPRISE_TOTAL_COUNT_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_CSM_HOST_ENTERPRISE_AAS_HOST_COUNT_TOP99P_SUM,
  UsageSummaryResponse.JSON_PROPERTY_CSM_HOST_ENTERPRISE_AWS_HOST_COUNT_TOP99P_SUM,
  UsageSummaryResponse.JSON_PROPERTY_CSM_HOST_ENTERPRISE_AZURE_HOST_COUNT_TOP99P_SUM,
  UsageSummaryResponse.JSON_PROPERTY_CSM_HOST_ENTERPRISE_COMPLIANCE_HOST_COUNT_TOP99P_SUM,
  UsageSummaryResponse.JSON_PROPERTY_CSM_HOST_ENTERPRISE_CWS_HOST_COUNT_TOP99P_SUM,
  UsageSummaryResponse.JSON_PROPERTY_CSM_HOST_ENTERPRISE_GCP_HOST_COUNT_TOP99P_SUM,
  UsageSummaryResponse.JSON_PROPERTY_CSM_HOST_ENTERPRISE_OCI_HOST_COUNT_TOP99P_SUM,
  UsageSummaryResponse.JSON_PROPERTY_CSM_HOST_ENTERPRISE_TOTAL_HOST_COUNT_TOP99P_SUM,
  UsageSummaryResponse.JSON_PROPERTY_CSM_HOST_PRO_HOSTS_AGENTLESS_SCANNERS_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_CSM_HOST_PRO_HOSTS_AGENTLESS_SCANNERS_TOP99P_SUM,
  UsageSummaryResponse.JSON_PROPERTY_CSM_HOST_PRO_OCI_HOST_COUNT_TOP99P_SUM,
  UsageSummaryResponse.JSON_PROPERTY_CSPM_AAS_HOST_TOP99P_SUM,
  UsageSummaryResponse.JSON_PROPERTY_CSPM_AWS_HOST_TOP99P_SUM,
  UsageSummaryResponse.JSON_PROPERTY_CSPM_AZURE_HOST_TOP99P_SUM,
  UsageSummaryResponse.JSON_PROPERTY_CSPM_CONTAINER_AVG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_CSPM_CONTAINER_HWM_SUM,
  UsageSummaryResponse.JSON_PROPERTY_CSPM_GCP_HOST_TOP99P_SUM,
  UsageSummaryResponse.JSON_PROPERTY_CSPM_HOST_TOP99P_SUM,
  UsageSummaryResponse.JSON_PROPERTY_CSPM_HOSTS_AGENTLESS_SCANNERS_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_CSPM_HOSTS_AGENTLESS_SCANNERS_TOP99P_SUM,
  UsageSummaryResponse.JSON_PROPERTY_CUSTOM_HISTORICAL_TS_SUM,
  UsageSummaryResponse.JSON_PROPERTY_CUSTOM_LIVE_TS_SUM,
  UsageSummaryResponse.JSON_PROPERTY_CUSTOM_TS_SUM,
  UsageSummaryResponse.JSON_PROPERTY_CWS_CONTAINER_AVG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_CWS_FARGATE_TASK_AVG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_CWS_HOST_TOP99P_SUM,
  UsageSummaryResponse.JSON_PROPERTY_DATA_JOBS_MONITORING_HOST_HR_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_DATA_STREAM_MONITORING_HOST_COUNT_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_DATA_STREAM_MONITORING_HOST_COUNT_TOP99P_SUM,
  UsageSummaryResponse.JSON_PROPERTY_DBM_HOST_TOP99P_SUM,
  UsageSummaryResponse.JSON_PROPERTY_DBM_QUERIES_AVG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_DO_JOBS_MONITORING_ORCHESTRATORS_JOB_HOURS_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_END_DATE,
  UsageSummaryResponse.JSON_PROPERTY_EPH_INFRA_HOST_AGENT_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_EPH_INFRA_HOST_ALIBABA_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_EPH_INFRA_HOST_AWS_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_EPH_INFRA_HOST_AZURE_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_EPH_INFRA_HOST_BASIC_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_EPH_INFRA_HOST_BASIC_INFRA_BASIC_AGENT_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_EPH_INFRA_HOST_BASIC_INFRA_BASIC_VSPHERE_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_EPH_INFRA_HOST_ENT_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_EPH_INFRA_HOST_GCP_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_EPH_INFRA_HOST_HEROKU_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_EPH_INFRA_HOST_ONLY_AAS_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_EPH_INFRA_HOST_ONLY_VSPHERE_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_EPH_INFRA_HOST_OPENTELEMETRY_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_EPH_INFRA_HOST_OPENTELEMETRY_APM_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_EPH_INFRA_HOST_PRO_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_EPH_INFRA_HOST_PROPLUS_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_EPH_INFRA_HOST_PROXMOX_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_ERROR_TRACKING_APM_ERROR_EVENTS_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_ERROR_TRACKING_ERROR_EVENTS_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_ERROR_TRACKING_EVENTS_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_ERROR_TRACKING_RUM_ERROR_EVENTS_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_EVENT_MANAGEMENT_CORRELATION_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_EVENT_MANAGEMENT_CORRELATION_CORRELATED_EVENTS_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_EVENT_MANAGEMENT_CORRELATION_CORRELATED_RELATED_EVENTS_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_FARGATE_CONTAINER_PROFILER_PROFILING_FARGATE_AVG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_FARGATE_CONTAINER_PROFILER_PROFILING_FARGATE_EKS_AVG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_FARGATE_TASKS_COUNT_AVG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_FARGATE_TASKS_COUNT_HWM_SUM,
  UsageSummaryResponse.JSON_PROPERTY_FEATURE_FLAGS_CONFIG_REQUESTS_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_FLEX_LOGS_COMPUTE_LARGE_AVG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_FLEX_LOGS_COMPUTE_MEDIUM_AVG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_FLEX_LOGS_COMPUTE_SMALL_AVG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_FLEX_LOGS_COMPUTE_XLARGE_AVG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_FLEX_LOGS_COMPUTE_XSMALL_AVG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_FLEX_LOGS_STARTER_AVG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_FLEX_LOGS_STARTER_STORAGE_INDEX_AVG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_FLEX_LOGS_STARTER_STORAGE_RETENTION_ADJUSTMENT_AVG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_FLEX_STORED_LOGS_AVG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_FORWARDING_EVENTS_BYTES_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_GCP_HOST_TOP99P_SUM,
  UsageSummaryResponse.JSON_PROPERTY_HEROKU_HOST_TOP99P_SUM,
  UsageSummaryResponse.JSON_PROPERTY_INCIDENT_MANAGEMENT_MONTHLY_ACTIVE_USERS_HWM_SUM,
  UsageSummaryResponse.JSON_PROPERTY_INCIDENT_MANAGEMENT_SEATS_HWM_SUM,
  UsageSummaryResponse.JSON_PROPERTY_INDEXED_EVENTS_COUNT_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_INDEXED_POINTS_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_INFRA_CPU_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_INFRA_CPU_AVG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_INFRA_CPU_DEFAULT_INFRA_HOST_VCPU_AGENT_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_INFRA_CPU_DEFAULT_INFRA_HOST_VCPU_AGENT_AVG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_INFRA_CPU_DEFAULT_INFRA_HOST_VCPU_AGENT_BASIC_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_INFRA_CPU_DEFAULT_INFRA_HOST_VCPU_AGENT_BASIC_AVG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_INFRA_CPU_DEFAULT_INFRA_HOST_VCPU_AWS_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_INFRA_CPU_DEFAULT_INFRA_HOST_VCPU_AWS_AVG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_INFRA_CPU_DEFAULT_INFRA_HOST_VCPU_AZURE_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_INFRA_CPU_DEFAULT_INFRA_HOST_VCPU_AZURE_AVG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_INFRA_CPU_DEFAULT_INFRA_HOST_VCPU_GCP_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_INFRA_CPU_DEFAULT_INFRA_HOST_VCPU_GCP_AVG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_INFRA_CPU_DEFAULT_INFRA_HOST_VCPU_NUTANIX_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_INFRA_CPU_DEFAULT_INFRA_HOST_VCPU_NUTANIX_AVG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_INFRA_CPU_DEFAULT_INFRA_HOST_VCPU_NUTANIX_BASIC_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_INFRA_CPU_DEFAULT_INFRA_HOST_VCPU_NUTANIX_BASIC_AVG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_INFRA_CPU_DEFAULT_INFRA_HOST_VCPU_OPENTELEMETRY_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_INFRA_CPU_DEFAULT_INFRA_HOST_VCPU_OPENTELEMETRY_AVG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_INFRA_CPU_OBSERVED_INFRA_HOST_VCPU_AGENT_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_INFRA_CPU_OBSERVED_INFRA_HOST_VCPU_AGENT_AVG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_INFRA_CPU_OBSERVED_INFRA_HOST_VCPU_AWS_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_INFRA_CPU_OBSERVED_INFRA_HOST_VCPU_AWS_AVG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_INFRA_CPU_OBSERVED_INFRA_HOST_VCPU_AZURE_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_INFRA_CPU_OBSERVED_INFRA_HOST_VCPU_AZURE_AVG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_INFRA_CPU_OBSERVED_INFRA_HOST_VCPU_GCP_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_INFRA_CPU_OBSERVED_INFRA_HOST_VCPU_GCP_AVG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_INFRA_CPU_OBSERVED_INFRA_HOST_VCPU_NUTANIX_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_INFRA_CPU_OBSERVED_INFRA_HOST_VCPU_NUTANIX_AVG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_INFRA_CPU_OBSERVED_INFRA_HOST_VCPU_OPENTELEMETRY_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_INFRA_CPU_OBSERVED_INFRA_HOST_VCPU_OPENTELEMETRY_AVG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_INFRA_EDGE_MONITORING_DEVICES_TOP99P_SUM,
  UsageSummaryResponse.JSON_PROPERTY_INFRA_HOST_BASIC_INFRA_BASIC_AGENT_TOP99P_SUM,
  UsageSummaryResponse.JSON_PROPERTY_INFRA_HOST_BASIC_INFRA_BASIC_VSPHERE_TOP99P_SUM,
  UsageSummaryResponse.JSON_PROPERTY_INFRA_HOST_BASIC_TOP99P_SUM,
  UsageSummaryResponse.JSON_PROPERTY_INFRA_HOST_TOP99P_SUM,
  UsageSummaryResponse.JSON_PROPERTY_INFRA_STORAGE_MGMT_OBJECTS_COUNT_AVG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_INGEST_POINTS_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_INGESTED_EVENTS_BYTES_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_IOT_APM_HOST_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_IOT_APM_HOST_TOP99P_SUM,
  UsageSummaryResponse.JSON_PROPERTY_IOT_DEVICE_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_IOT_DEVICE_TOP99P_SUM,
  UsageSummaryResponse.JSON_PROPERTY_LAST_UPDATED,
  UsageSummaryResponse.JSON_PROPERTY_LIVE_INDEXED_EVENTS_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_LIVE_INGESTED_BYTES_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_LLM_OBSERVABILITY_15DAY_RETENTION_SPANS_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_LLM_OBSERVABILITY_30DAY_RETENTION_SPANS_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_LLM_OBSERVABILITY_60DAY_RETENTION_SPANS_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_LLM_OBSERVABILITY_90DAY_RETENTION_SPANS_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_LLM_OBSERVABILITY_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_LLM_OBSERVABILITY_MIN_SPEND_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_LOGS_ARCHIVE_SEARCH_GB_SCANNED_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_LOGS_BY_RETENTION,
  UsageSummaryResponse.JSON_PROPERTY_METRIC_NAMES_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_MOBILE_RUM_LITE_SESSION_COUNT_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_MOBILE_RUM_SESSION_COUNT_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_MOBILE_RUM_SESSION_COUNT_ANDROID_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_MOBILE_RUM_SESSION_COUNT_FLUTTER_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_MOBILE_RUM_SESSION_COUNT_IOS_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_MOBILE_RUM_SESSION_COUNT_REACTNATIVE_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_MOBILE_RUM_SESSION_COUNT_ROKU_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_MOBILE_RUM_UNITS_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_NDM_NETFLOW_EVENTS_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_NETFLOW_INDEXED_EVENTS_COUNT_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_NETWORK_DEVICE_WIRELESS_TOP99P_SUM,
  UsageSummaryResponse.JSON_PROPERTY_NETWORK_PATH_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_NPM_HOST_TOP99P_SUM,
  UsageSummaryResponse.JSON_PROPERTY_OBSERVABILITY_PIPELINES_BYTES_PROCESSED_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_OCI_HOST_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_OCI_HOST_TOP99P_SUM,
  UsageSummaryResponse.JSON_PROPERTY_ON_CALL_SEAT_HWM_SUM,
  UsageSummaryResponse.JSON_PROPERTY_ONLINE_ARCHIVE_EVENTS_COUNT_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_OPENTELEMETRY_APM_HOST_TOP99P_SUM,
  UsageSummaryResponse.JSON_PROPERTY_OPENTELEMETRY_HOST_TOP99P_SUM,
  UsageSummaryResponse.JSON_PROPERTY_PRODUCT_ANALYTICS_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_PROFILING_AAS_COUNT_TOP99P_SUM,
  UsageSummaryResponse.JSON_PROPERTY_PROFILING_CONTAINER_AGENT_COUNT_AVG,
  UsageSummaryResponse.JSON_PROPERTY_PROFILING_HOST_COUNT_TOP99P_SUM,
  UsageSummaryResponse.JSON_PROPERTY_PROXMOX_HOST_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_PROXMOX_HOST_TOP99P_SUM,
  UsageSummaryResponse.JSON_PROPERTY_PUBLISHED_APP_HWM_SUM,
  UsageSummaryResponse.JSON_PROPERTY_REHYDRATED_INDEXED_EVENTS_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_REHYDRATED_INGESTED_BYTES_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_RUM_BROWSER_AND_MOBILE_SESSION_COUNT,
  UsageSummaryResponse.JSON_PROPERTY_RUM_BROWSER_LEGACY_SESSION_COUNT_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_RUM_BROWSER_LITE_SESSION_COUNT_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_RUM_BROWSER_REPLAY_SESSION_COUNT_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_RUM_INDEXED_SESSIONS_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_RUM_INGESTED_SESSIONS_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_RUM_LITE_SESSION_COUNT_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_RUM_MOBILE_LEGACY_SESSION_COUNT_ANDROID_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_RUM_MOBILE_LEGACY_SESSION_COUNT_FLUTTER_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_RUM_MOBILE_LEGACY_SESSION_COUNT_IOS_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_RUM_MOBILE_LEGACY_SESSION_COUNT_REACTNATIVE_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_RUM_MOBILE_LEGACY_SESSION_COUNT_ROKU_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_RUM_MOBILE_LITE_SESSION_COUNT_ANDROID_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_RUM_MOBILE_LITE_SESSION_COUNT_FLUTTER_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_RUM_MOBILE_LITE_SESSION_COUNT_IOS_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_RUM_MOBILE_LITE_SESSION_COUNT_KOTLINMULTIPLATFORM_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_RUM_MOBILE_LITE_SESSION_COUNT_REACTNATIVE_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_RUM_MOBILE_LITE_SESSION_COUNT_ROKU_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_RUM_MOBILE_LITE_SESSION_COUNT_UNITY_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_RUM_MOBILE_REPLAY_SESSION_COUNT_ANDROID_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_RUM_MOBILE_REPLAY_SESSION_COUNT_IOS_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_RUM_MOBILE_REPLAY_SESSION_COUNT_KOTLINMULTIPLATFORM_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_RUM_MOBILE_REPLAY_SESSION_COUNT_REACTNATIVE_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_RUM_REPLAY_SESSION_COUNT_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_RUM_SESSION_COUNT_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_RUM_SESSION_REPLAY_ADD_ON_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_RUM_TOTAL_SESSION_COUNT_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_RUM_UNITS_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_SCA_FARGATE_COUNT_AVG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_SCA_FARGATE_COUNT_HWM_SUM,
  UsageSummaryResponse.JSON_PROPERTY_SDS_APM_SCANNED_BYTES_SUM,
  UsageSummaryResponse.JSON_PROPERTY_SDS_EVENTS_SCANNED_BYTES_SUM,
  UsageSummaryResponse.JSON_PROPERTY_SDS_LOGS_SCANNED_BYTES_SUM,
  UsageSummaryResponse.JSON_PROPERTY_SDS_RUM_SCANNED_BYTES_SUM,
  UsageSummaryResponse.JSON_PROPERTY_SDS_TOTAL_SCANNED_BYTES_SUM,
  UsageSummaryResponse.JSON_PROPERTY_SERVERLESS_APPS_APM_APM_AZURE_APPSERVICE_INSTANCES_AVG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_SERVERLESS_APPS_APM_APM_AZURE_AZUREFUNCTION_INSTANCES_AVG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_SERVERLESS_APPS_APM_APM_AZURE_CONTAINERAPP_INSTANCES_AVG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_SERVERLESS_APPS_APM_APM_FARGATE_ECS_TASKS_AVG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_SERVERLESS_APPS_APM_APM_GCP_CLOUDFUNCTION_INSTANCES_AVG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_SERVERLESS_APPS_APM_APM_GCP_CLOUDRUN_INSTANCES_AVG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_SERVERLESS_APPS_APM_APM_GCP_GKE_AUTOPILOT_PODS_AVG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_SERVERLESS_APPS_APM_AVG_SUM,
  UsageSummaryResponse
      .JSON_PROPERTY_SERVERLESS_APPS_APM_EXCL_FARGATE_APM_AZURE_APPSERVICE_INSTANCES_AVG_SUM,
  UsageSummaryResponse
      .JSON_PROPERTY_SERVERLESS_APPS_APM_EXCL_FARGATE_APM_AZURE_AZUREFUNCTION_INSTANCES_AVG_SUM,
  UsageSummaryResponse
      .JSON_PROPERTY_SERVERLESS_APPS_APM_EXCL_FARGATE_APM_AZURE_CONTAINERAPP_INSTANCES_AVG_SUM,
  UsageSummaryResponse
      .JSON_PROPERTY_SERVERLESS_APPS_APM_EXCL_FARGATE_APM_GCP_CLOUDFUNCTION_INSTANCES_AVG_SUM,
  UsageSummaryResponse
      .JSON_PROPERTY_SERVERLESS_APPS_APM_EXCL_FARGATE_APM_GCP_CLOUDRUN_INSTANCES_AVG_SUM,
  UsageSummaryResponse
      .JSON_PROPERTY_SERVERLESS_APPS_APM_EXCL_FARGATE_APM_GCP_GKE_AUTOPILOT_PODS_AVG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_SERVERLESS_APPS_APM_EXCL_FARGATE_AVG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_SERVERLESS_APPS_AZURE_CONTAINER_APP_INSTANCES_AVG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_SERVERLESS_APPS_AZURE_COUNT_AVG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_SERVERLESS_APPS_AZURE_FUNCTION_APP_INSTANCES_AVG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_SERVERLESS_APPS_AZURE_WEB_APP_INSTANCES_AVG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_SERVERLESS_APPS_DSM_FARGATE_TASKS_AVG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_SERVERLESS_APPS_ECS_AVG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_SERVERLESS_APPS_EKS_AVG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_SERVERLESS_APPS_EXCL_FARGATE_AVG_SUM,
  UsageSummaryResponse
      .JSON_PROPERTY_SERVERLESS_APPS_EXCL_FARGATE_AZURE_CONTAINER_APP_INSTANCES_AVG_SUM,
  UsageSummaryResponse
      .JSON_PROPERTY_SERVERLESS_APPS_EXCL_FARGATE_AZURE_FUNCTION_APP_INSTANCES_AVG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_SERVERLESS_APPS_EXCL_FARGATE_AZURE_WEB_APP_INSTANCES_AVG_SUM,
  UsageSummaryResponse
      .JSON_PROPERTY_SERVERLESS_APPS_EXCL_FARGATE_GOOGLE_CLOUD_FUNCTIONS_INSTANCES_AVG_SUM,
  UsageSummaryResponse
      .JSON_PROPERTY_SERVERLESS_APPS_EXCL_FARGATE_GOOGLE_CLOUD_RUN_INSTANCES_AVG_SUM,
  UsageSummaryResponse
      .JSON_PROPERTY_SERVERLESS_APPS_EXCL_FARGATE_INFRA_GCP_GKE_AUTOPILOT_PODS_AVG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_SERVERLESS_APPS_GOOGLE_CLOUD_FUNCTIONS_INSTANCES_AVG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_SERVERLESS_APPS_GOOGLE_CLOUD_RUN_INSTANCES_AVG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_SERVERLESS_APPS_GOOGLE_COUNT_AVG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_SERVERLESS_APPS_INFRA_GCP_GKE_AUTOPILOT_PODS_AVG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_SERVERLESS_APPS_TOTAL_COUNT_AVG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_SIEM_12MO_RETENTION_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_SIEM_6MO_RETENTION_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_SIEM_ANALYZED_LOGS_ADD_ON_COUNT_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_SNMP_DEVICE_COUNT_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_SNMP_DEVICE_COUNT_TOP99P_SUM,
  UsageSummaryResponse.JSON_PROPERTY_START_DATE,
  UsageSummaryResponse.JSON_PROPERTY_SYNTHETICS_BROWSER_CHECK_CALLS_COUNT_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_SYNTHETICS_CHECK_CALLS_COUNT_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_SYNTHETICS_MOBILE_TEST_RUNS_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_SYNTHETICS_PARALLEL_TESTING_MAX_SLOTS_HWM_SUM,
  UsageSummaryResponse.JSON_PROPERTY_TRACE_SEARCH_INDEXED_EVENTS_COUNT_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_TWOL_INGESTED_EVENTS_BYTES_AGG_SUM,
  UsageSummaryResponse.JSON_PROPERTY_UNIVERSAL_SERVICE_MONITORING_HOST_TOP99P_SUM,
  UsageSummaryResponse.JSON_PROPERTY_USAGE,
  UsageSummaryResponse.JSON_PROPERTY_VSPHERE_HOST_TOP99P_SUM,
  UsageSummaryResponse.JSON_PROPERTY_VULN_MANAGEMENT_HOST_COUNT_TOP99P_SUM,
  UsageSummaryResponse.JSON_PROPERTY_WORKFLOW_EXECUTIONS_USAGE_AGG_SUM
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class UsageSummaryResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AGENT_HOST_TOP99P_SUM = "agent_host_top99p_sum";
  private Long agentHostTop99pSum;

  public static final String JSON_PROPERTY_AI_CREDITS_AGENT_BUILDER_AI_CREDITS_AGG_SUM =
      "ai_credits_agent_builder_ai_credits_agg_sum";
  private Long aiCreditsAgentBuilderAiCreditsAggSum;

  public static final String JSON_PROPERTY_AI_CREDITS_AGG_SUM = "ai_credits_agg_sum";
  private Long aiCreditsAggSum;

  public static final String JSON_PROPERTY_AI_CREDITS_BITS_ASSISTANT_AI_CREDITS_AGG_SUM =
      "ai_credits_bits_assistant_ai_credits_agg_sum";
  private Long aiCreditsBitsAssistantAiCreditsAggSum;

  public static final String JSON_PROPERTY_AI_CREDITS_BITS_DEV_AI_CREDITS_AGG_SUM =
      "ai_credits_bits_dev_ai_credits_agg_sum";
  private Long aiCreditsBitsDevAiCreditsAggSum;

  public static final String JSON_PROPERTY_AI_CREDITS_BITS_SRE_AI_CREDITS_AGG_SUM =
      "ai_credits_bits_sre_ai_credits_agg_sum";
  private Long aiCreditsBitsSreAiCreditsAggSum;

  public static final String JSON_PROPERTY_APM_AZURE_APP_SERVICE_HOST_TOP99P_SUM =
      "apm_azure_app_service_host_top99p_sum";
  private Long apmAzureAppServiceHostTop99pSum;

  public static final String JSON_PROPERTY_APM_DEVSECOPS_HOST_TOP99P_SUM =
      "apm_devsecops_host_top99p_sum";
  private Long apmDevsecopsHostTop99pSum;

  public static final String JSON_PROPERTY_APM_ENTERPRISE_STANDALONE_HOSTS_TOP99P_SUM =
      "apm_enterprise_standalone_hosts_top99p_sum";
  private Long apmEnterpriseStandaloneHostsTop99pSum;

  public static final String JSON_PROPERTY_APM_FARGATE_COUNT_AVG_SUM = "apm_fargate_count_avg_sum";
  private Long apmFargateCountAvgSum;

  public static final String JSON_PROPERTY_APM_HOST_TOP99P_SUM = "apm_host_top99p_sum";
  private Long apmHostTop99pSum;

  public static final String JSON_PROPERTY_APM_PRO_STANDALONE_HOSTS_TOP99P_SUM =
      "apm_pro_standalone_hosts_top99p_sum";
  private Long apmProStandaloneHostsTop99pSum;

  public static final String JSON_PROPERTY_APPSEC_FARGATE_COUNT_AVG_SUM =
      "appsec_fargate_count_avg_sum";
  private Long appsecFargateCountAvgSum;

  public static final String JSON_PROPERTY_ASM_SERVERLESS_AGG_SUM = "asm_serverless_agg_sum";
  private Long asmServerlessAggSum;

  public static final String JSON_PROPERTY_AUDIT_LOGS_LINES_INDEXED_AGG_SUM =
      "audit_logs_lines_indexed_agg_sum";
  private Long auditLogsLinesIndexedAggSum;

  public static final String JSON_PROPERTY_AUDIT_TRAIL_ENABLED_HWM_SUM =
      "audit_trail_enabled_hwm_sum";
  private Long auditTrailEnabledHwmSum;

  public static final String JSON_PROPERTY_AUDIT_TRAIL_EVENT_FORWARDING_EVENTS_AGG_SUM =
      "audit_trail_event_forwarding_events_agg_sum";
  private Long auditTrailEventForwardingEventsAggSum;

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

  public static final String JSON_PROPERTY_BITS_AI_INVESTIGATIONS_AGG_SUM =
      "bits_ai_investigations_agg_sum";
  private Long bitsAiInvestigationsAggSum;

  public static final String JSON_PROPERTY_BROWSER_RUM_LITE_SESSION_COUNT_AGG_SUM =
      "browser_rum_lite_session_count_agg_sum";
  private Long browserRumLiteSessionCountAggSum;

  public static final String JSON_PROPERTY_BROWSER_RUM_REPLAY_SESSION_COUNT_AGG_SUM =
      "browser_rum_replay_session_count_agg_sum";
  private Long browserRumReplaySessionCountAggSum;

  public static final String JSON_PROPERTY_BROWSER_RUM_UNITS_AGG_SUM = "browser_rum_units_agg_sum";
  private Long browserRumUnitsAggSum;

  public static final String JSON_PROPERTY_CCM_ANTHROPIC_SPEND_LAST_SUM =
      "ccm_anthropic_spend_last_sum";
  private Long ccmAnthropicSpendLastSum;

  public static final String JSON_PROPERTY_CCM_AWS_SPEND_LAST_SUM = "ccm_aws_spend_last_sum";
  private Long ccmAwsSpendLastSum;

  public static final String JSON_PROPERTY_CCM_AZURE_SPEND_LAST_SUM = "ccm_azure_spend_last_sum";
  private Long ccmAzureSpendLastSum;

  public static final String JSON_PROPERTY_CCM_CONFLUENT_SPEND_LAST_SUM =
      "ccm_confluent_spend_last_sum";
  private Long ccmConfluentSpendLastSum;

  public static final String JSON_PROPERTY_CCM_DATABRICKS_SPEND_LAST_SUM =
      "ccm_databricks_spend_last_sum";
  private Long ccmDatabricksSpendLastSum;

  public static final String JSON_PROPERTY_CCM_ELASTIC_SPEND_LAST_SUM =
      "ccm_elastic_spend_last_sum";
  private Long ccmElasticSpendLastSum;

  public static final String JSON_PROPERTY_CCM_FASTLY_SPEND_LAST_SUM = "ccm_fastly_spend_last_sum";
  private Long ccmFastlySpendLastSum;

  public static final String JSON_PROPERTY_CCM_GCP_SPEND_LAST_SUM = "ccm_gcp_spend_last_sum";
  private Long ccmGcpSpendLastSum;

  public static final String JSON_PROPERTY_CCM_GITHUB_SPEND_LAST_SUM = "ccm_github_spend_last_sum";
  private Long ccmGithubSpendLastSum;

  public static final String JSON_PROPERTY_CCM_MONGODB_SPEND_LAST_SUM =
      "ccm_mongodb_spend_last_sum";
  private Long ccmMongodbSpendLastSum;

  public static final String JSON_PROPERTY_CCM_OCI_SPEND_LAST_SUM = "ccm_oci_spend_last_sum";
  private Long ccmOciSpendLastSum;

  public static final String JSON_PROPERTY_CCM_OPENAI_SPEND_LAST_SUM = "ccm_openai_spend_last_sum";
  private Long ccmOpenaiSpendLastSum;

  public static final String JSON_PROPERTY_CCM_SNOWFLAKE_SPEND_LAST_SUM =
      "ccm_snowflake_spend_last_sum";
  private Long ccmSnowflakeSpendLastSum;

  public static final String JSON_PROPERTY_CCM_SPEND_MONITORED_ENT_LAST_SUM =
      "ccm_spend_monitored_ent_last_sum";
  private Long ccmSpendMonitoredEntLastSum;

  public static final String JSON_PROPERTY_CCM_SPEND_MONITORED_PRO_LAST_SUM =
      "ccm_spend_monitored_pro_last_sum";
  private Long ccmSpendMonitoredProLastSum;

  public static final String JSON_PROPERTY_CCM_TWILIO_SPEND_LAST_SUM = "ccm_twilio_spend_last_sum";
  private Long ccmTwilioSpendLastSum;

  public static final String JSON_PROPERTY_CI_PIPELINE_INDEXED_SPANS_AGG_SUM =
      "ci_pipeline_indexed_spans_agg_sum";
  private Long ciPipelineIndexedSpansAggSum;

  public static final String JSON_PROPERTY_CI_TEST_INDEXED_SPANS_AGG_SUM =
      "ci_test_indexed_spans_agg_sum";
  private Long ciTestIndexedSpansAggSum;

  public static final String JSON_PROPERTY_CI_VISIBILITY_ITR_COMMITTERS_HWM_SUM =
      "ci_visibility_itr_committers_hwm_sum";
  private Long ciVisibilityItrCommittersHwmSum;

  public static final String JSON_PROPERTY_CI_VISIBILITY_PIPELINE_COMMITTERS_HWM_SUM =
      "ci_visibility_pipeline_committers_hwm_sum";
  private Long ciVisibilityPipelineCommittersHwmSum;

  public static final String JSON_PROPERTY_CI_VISIBILITY_TEST_COMMITTERS_HWM_SUM =
      "ci_visibility_test_committers_hwm_sum";
  private Long ciVisibilityTestCommittersHwmSum;

  public static final String JSON_PROPERTY_CLOUD_COST_MANAGEMENT_AWS_HOST_COUNT_AVG_SUM =
      "cloud_cost_management_aws_host_count_avg_sum";
  private Long cloudCostManagementAwsHostCountAvgSum;

  public static final String JSON_PROPERTY_CLOUD_COST_MANAGEMENT_AZURE_HOST_COUNT_AVG_SUM =
      "cloud_cost_management_azure_host_count_avg_sum";
  private Long cloudCostManagementAzureHostCountAvgSum;

  public static final String JSON_PROPERTY_CLOUD_COST_MANAGEMENT_GCP_HOST_COUNT_AVG_SUM =
      "cloud_cost_management_gcp_host_count_avg_sum";
  private Long cloudCostManagementGcpHostCountAvgSum;

  public static final String JSON_PROPERTY_CLOUD_COST_MANAGEMENT_HOST_COUNT_AVG_SUM =
      "cloud_cost_management_host_count_avg_sum";
  private Long cloudCostManagementHostCountAvgSum;

  public static final String JSON_PROPERTY_CLOUD_COST_MANAGEMENT_OCI_HOST_COUNT_AVG_SUM =
      "cloud_cost_management_oci_host_count_avg_sum";
  private Long cloudCostManagementOciHostCountAvgSum;

  public static final String JSON_PROPERTY_CLOUD_SIEM_EVENTS_AGG_SUM = "cloud_siem_events_agg_sum";
  private Long cloudSiemEventsAggSum;

  public static final String JSON_PROPERTY_CLOUD_SIEM_INDEXED_LOGS_AGG_SUM =
      "cloud_siem_indexed_logs_agg_sum";
  private Long cloudSiemIndexedLogsAggSum;

  public static final String JSON_PROPERTY_CODE_ANALYSIS_SA_COMMITTERS_HWM_SUM =
      "code_analysis_sa_committers_hwm_sum";
  private Long codeAnalysisSaCommittersHwmSum;

  public static final String JSON_PROPERTY_CODE_ANALYSIS_SCA_COMMITTERS_HWM_SUM =
      "code_analysis_sca_committers_hwm_sum";
  private Long codeAnalysisScaCommittersHwmSum;

  public static final String JSON_PROPERTY_CODE_SECURITY_HOST_TOP99P_SUM =
      "code_security_host_top99p_sum";
  private Long codeSecurityHostTop99pSum;

  public static final String JSON_PROPERTY_CONTAINER_AVG_SUM = "container_avg_sum";
  private Long containerAvgSum;

  public static final String JSON_PROPERTY_CONTAINER_EXCL_AGENT_AVG_SUM =
      "container_excl_agent_avg_sum";
  private Long containerExclAgentAvgSum;

  public static final String JSON_PROPERTY_CONTAINER_HWM_SUM = "container_hwm_sum";
  private Long containerHwmSum;

  public static final String JSON_PROPERTY_CSM_CONTAINER_ENTERPRISE_COMPLIANCE_COUNT_AGG_SUM =
      "csm_container_enterprise_compliance_count_agg_sum";
  private Long csmContainerEnterpriseComplianceCountAggSum;

  public static final String JSON_PROPERTY_CSM_CONTAINER_ENTERPRISE_CWS_COUNT_AGG_SUM =
      "csm_container_enterprise_cws_count_agg_sum";
  private Long csmContainerEnterpriseCwsCountAggSum;

  public static final String JSON_PROPERTY_CSM_CONTAINER_ENTERPRISE_TOTAL_COUNT_AGG_SUM =
      "csm_container_enterprise_total_count_agg_sum";
  private Long csmContainerEnterpriseTotalCountAggSum;

  public static final String JSON_PROPERTY_CSM_HOST_ENTERPRISE_AAS_HOST_COUNT_TOP99P_SUM =
      "csm_host_enterprise_aas_host_count_top99p_sum";
  private Long csmHostEnterpriseAasHostCountTop99pSum;

  public static final String JSON_PROPERTY_CSM_HOST_ENTERPRISE_AWS_HOST_COUNT_TOP99P_SUM =
      "csm_host_enterprise_aws_host_count_top99p_sum";
  private Long csmHostEnterpriseAwsHostCountTop99pSum;

  public static final String JSON_PROPERTY_CSM_HOST_ENTERPRISE_AZURE_HOST_COUNT_TOP99P_SUM =
      "csm_host_enterprise_azure_host_count_top99p_sum";
  private Long csmHostEnterpriseAzureHostCountTop99pSum;

  public static final String JSON_PROPERTY_CSM_HOST_ENTERPRISE_COMPLIANCE_HOST_COUNT_TOP99P_SUM =
      "csm_host_enterprise_compliance_host_count_top99p_sum";
  private Long csmHostEnterpriseComplianceHostCountTop99pSum;

  public static final String JSON_PROPERTY_CSM_HOST_ENTERPRISE_CWS_HOST_COUNT_TOP99P_SUM =
      "csm_host_enterprise_cws_host_count_top99p_sum";
  private Long csmHostEnterpriseCwsHostCountTop99pSum;

  public static final String JSON_PROPERTY_CSM_HOST_ENTERPRISE_GCP_HOST_COUNT_TOP99P_SUM =
      "csm_host_enterprise_gcp_host_count_top99p_sum";
  private Long csmHostEnterpriseGcpHostCountTop99pSum;

  public static final String JSON_PROPERTY_CSM_HOST_ENTERPRISE_OCI_HOST_COUNT_TOP99P_SUM =
      "csm_host_enterprise_oci_host_count_top99p_sum";
  private Long csmHostEnterpriseOciHostCountTop99pSum;

  public static final String JSON_PROPERTY_CSM_HOST_ENTERPRISE_TOTAL_HOST_COUNT_TOP99P_SUM =
      "csm_host_enterprise_total_host_count_top99p_sum";
  private Long csmHostEnterpriseTotalHostCountTop99pSum;

  public static final String JSON_PROPERTY_CSM_HOST_PRO_HOSTS_AGENTLESS_SCANNERS_AGG_SUM =
      "csm_host_pro_hosts_agentless_scanners_agg_sum";
  private Long csmHostProHostsAgentlessScannersAggSum;

  public static final String JSON_PROPERTY_CSM_HOST_PRO_HOSTS_AGENTLESS_SCANNERS_TOP99P_SUM =
      "csm_host_pro_hosts_agentless_scanners_top99p_sum";
  private Long csmHostProHostsAgentlessScannersTop99pSum;

  public static final String JSON_PROPERTY_CSM_HOST_PRO_OCI_HOST_COUNT_TOP99P_SUM =
      "csm_host_pro_oci_host_count_top99p_sum";
  private Long csmHostProOciHostCountTop99pSum;

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

  public static final String JSON_PROPERTY_CSPM_HOSTS_AGENTLESS_SCANNERS_AGG_SUM =
      "cspm_hosts_agentless_scanners_agg_sum";
  private Long cspmHostsAgentlessScannersAggSum;

  public static final String JSON_PROPERTY_CSPM_HOSTS_AGENTLESS_SCANNERS_TOP99P_SUM =
      "cspm_hosts_agentless_scanners_top99p_sum";
  private Long cspmHostsAgentlessScannersTop99pSum;

  public static final String JSON_PROPERTY_CUSTOM_HISTORICAL_TS_SUM = "custom_historical_ts_sum";
  private Long customHistoricalTsSum;

  public static final String JSON_PROPERTY_CUSTOM_LIVE_TS_SUM = "custom_live_ts_sum";
  private Long customLiveTsSum;

  public static final String JSON_PROPERTY_CUSTOM_TS_SUM = "custom_ts_sum";
  private Long customTsSum;

  public static final String JSON_PROPERTY_CWS_CONTAINER_AVG_SUM = "cws_container_avg_sum";
  private Long cwsContainerAvgSum;

  public static final String JSON_PROPERTY_CWS_FARGATE_TASK_AVG_SUM = "cws_fargate_task_avg_sum";
  private Long cwsFargateTaskAvgSum;

  public static final String JSON_PROPERTY_CWS_HOST_TOP99P_SUM = "cws_host_top99p_sum";
  private Long cwsHostTop99pSum;

  public static final String JSON_PROPERTY_DATA_JOBS_MONITORING_HOST_HR_AGG_SUM =
      "data_jobs_monitoring_host_hr_agg_sum";
  private Long dataJobsMonitoringHostHrAggSum;

  public static final String JSON_PROPERTY_DATA_STREAM_MONITORING_HOST_COUNT_AGG_SUM =
      "data_stream_monitoring_host_count_agg_sum";
  private Long dataStreamMonitoringHostCountAggSum;

  public static final String JSON_PROPERTY_DATA_STREAM_MONITORING_HOST_COUNT_TOP99P_SUM =
      "data_stream_monitoring_host_count_top99p_sum";
  private Long dataStreamMonitoringHostCountTop99pSum;

  public static final String JSON_PROPERTY_DBM_HOST_TOP99P_SUM = "dbm_host_top99p_sum";
  private Long dbmHostTop99pSum;

  public static final String JSON_PROPERTY_DBM_QUERIES_AVG_SUM = "dbm_queries_avg_sum";
  private Long dbmQueriesAvgSum;

  public static final String JSON_PROPERTY_DO_JOBS_MONITORING_ORCHESTRATORS_JOB_HOURS_AGG_SUM =
      "do_jobs_monitoring_orchestrators_job_hours_agg_sum";
  private Long doJobsMonitoringOrchestratorsJobHoursAggSum;

  public static final String JSON_PROPERTY_END_DATE = "end_date";
  private OffsetDateTime endDate;

  public static final String JSON_PROPERTY_EPH_INFRA_HOST_AGENT_AGG_SUM =
      "eph_infra_host_agent_agg_sum";
  private Long ephInfraHostAgentAggSum;

  public static final String JSON_PROPERTY_EPH_INFRA_HOST_ALIBABA_AGG_SUM =
      "eph_infra_host_alibaba_agg_sum";
  private Long ephInfraHostAlibabaAggSum;

  public static final String JSON_PROPERTY_EPH_INFRA_HOST_AWS_AGG_SUM =
      "eph_infra_host_aws_agg_sum";
  private Long ephInfraHostAwsAggSum;

  public static final String JSON_PROPERTY_EPH_INFRA_HOST_AZURE_AGG_SUM =
      "eph_infra_host_azure_agg_sum";
  private Long ephInfraHostAzureAggSum;

  public static final String JSON_PROPERTY_EPH_INFRA_HOST_BASIC_AGG_SUM =
      "eph_infra_host_basic_agg_sum";
  private Long ephInfraHostBasicAggSum;

  public static final String JSON_PROPERTY_EPH_INFRA_HOST_BASIC_INFRA_BASIC_AGENT_AGG_SUM =
      "eph_infra_host_basic_infra_basic_agent_agg_sum";
  private Long ephInfraHostBasicInfraBasicAgentAggSum;

  public static final String JSON_PROPERTY_EPH_INFRA_HOST_BASIC_INFRA_BASIC_VSPHERE_AGG_SUM =
      "eph_infra_host_basic_infra_basic_vsphere_agg_sum";
  private Long ephInfraHostBasicInfraBasicVsphereAggSum;

  public static final String JSON_PROPERTY_EPH_INFRA_HOST_ENT_AGG_SUM =
      "eph_infra_host_ent_agg_sum";
  private Long ephInfraHostEntAggSum;

  public static final String JSON_PROPERTY_EPH_INFRA_HOST_GCP_AGG_SUM =
      "eph_infra_host_gcp_agg_sum";
  private Long ephInfraHostGcpAggSum;

  public static final String JSON_PROPERTY_EPH_INFRA_HOST_HEROKU_AGG_SUM =
      "eph_infra_host_heroku_agg_sum";
  private Long ephInfraHostHerokuAggSum;

  public static final String JSON_PROPERTY_EPH_INFRA_HOST_ONLY_AAS_AGG_SUM =
      "eph_infra_host_only_aas_agg_sum";
  private Long ephInfraHostOnlyAasAggSum;

  public static final String JSON_PROPERTY_EPH_INFRA_HOST_ONLY_VSPHERE_AGG_SUM =
      "eph_infra_host_only_vsphere_agg_sum";
  private Long ephInfraHostOnlyVsphereAggSum;

  public static final String JSON_PROPERTY_EPH_INFRA_HOST_OPENTELEMETRY_AGG_SUM =
      "eph_infra_host_opentelemetry_agg_sum";
  private Long ephInfraHostOpentelemetryAggSum;

  public static final String JSON_PROPERTY_EPH_INFRA_HOST_OPENTELEMETRY_APM_AGG_SUM =
      "eph_infra_host_opentelemetry_apm_agg_sum";
  private Long ephInfraHostOpentelemetryApmAggSum;

  public static final String JSON_PROPERTY_EPH_INFRA_HOST_PRO_AGG_SUM =
      "eph_infra_host_pro_agg_sum";
  private Long ephInfraHostProAggSum;

  public static final String JSON_PROPERTY_EPH_INFRA_HOST_PROPLUS_AGG_SUM =
      "eph_infra_host_proplus_agg_sum";
  private Long ephInfraHostProplusAggSum;

  public static final String JSON_PROPERTY_EPH_INFRA_HOST_PROXMOX_AGG_SUM =
      "eph_infra_host_proxmox_agg_sum";
  private Long ephInfraHostProxmoxAggSum;

  public static final String JSON_PROPERTY_ERROR_TRACKING_APM_ERROR_EVENTS_AGG_SUM =
      "error_tracking_apm_error_events_agg_sum";
  private Long errorTrackingApmErrorEventsAggSum;

  public static final String JSON_PROPERTY_ERROR_TRACKING_ERROR_EVENTS_AGG_SUM =
      "error_tracking_error_events_agg_sum";
  private Long errorTrackingErrorEventsAggSum;

  public static final String JSON_PROPERTY_ERROR_TRACKING_EVENTS_AGG_SUM =
      "error_tracking_events_agg_sum";
  private Long errorTrackingEventsAggSum;

  public static final String JSON_PROPERTY_ERROR_TRACKING_RUM_ERROR_EVENTS_AGG_SUM =
      "error_tracking_rum_error_events_agg_sum";
  private Long errorTrackingRumErrorEventsAggSum;

  public static final String JSON_PROPERTY_EVENT_MANAGEMENT_CORRELATION_AGG_SUM =
      "event_management_correlation_agg_sum";
  private Long eventManagementCorrelationAggSum;

  public static final String JSON_PROPERTY_EVENT_MANAGEMENT_CORRELATION_CORRELATED_EVENTS_AGG_SUM =
      "event_management_correlation_correlated_events_agg_sum";
  private Long eventManagementCorrelationCorrelatedEventsAggSum;

  public static final String
      JSON_PROPERTY_EVENT_MANAGEMENT_CORRELATION_CORRELATED_RELATED_EVENTS_AGG_SUM =
          "event_management_correlation_correlated_related_events_agg_sum";
  private Long eventManagementCorrelationCorrelatedRelatedEventsAggSum;

  public static final String JSON_PROPERTY_FARGATE_CONTAINER_PROFILER_PROFILING_FARGATE_AVG_SUM =
      "fargate_container_profiler_profiling_fargate_avg_sum";
  private Long fargateContainerProfilerProfilingFargateAvgSum;

  public static final String
      JSON_PROPERTY_FARGATE_CONTAINER_PROFILER_PROFILING_FARGATE_EKS_AVG_SUM =
          "fargate_container_profiler_profiling_fargate_eks_avg_sum";
  private Long fargateContainerProfilerProfilingFargateEksAvgSum;

  public static final String JSON_PROPERTY_FARGATE_TASKS_COUNT_AVG_SUM =
      "fargate_tasks_count_avg_sum";
  private Long fargateTasksCountAvgSum;

  public static final String JSON_PROPERTY_FARGATE_TASKS_COUNT_HWM_SUM =
      "fargate_tasks_count_hwm_sum";
  private Long fargateTasksCountHwmSum;

  public static final String JSON_PROPERTY_FEATURE_FLAGS_CONFIG_REQUESTS_AGG_SUM =
      "feature_flags_config_requests_agg_sum";
  private Long featureFlagsConfigRequestsAggSum;

  public static final String JSON_PROPERTY_FLEX_LOGS_COMPUTE_LARGE_AVG_SUM =
      "flex_logs_compute_large_avg_sum";
  private Long flexLogsComputeLargeAvgSum;

  public static final String JSON_PROPERTY_FLEX_LOGS_COMPUTE_MEDIUM_AVG_SUM =
      "flex_logs_compute_medium_avg_sum";
  private Long flexLogsComputeMediumAvgSum;

  public static final String JSON_PROPERTY_FLEX_LOGS_COMPUTE_SMALL_AVG_SUM =
      "flex_logs_compute_small_avg_sum";
  private Long flexLogsComputeSmallAvgSum;

  public static final String JSON_PROPERTY_FLEX_LOGS_COMPUTE_XLARGE_AVG_SUM =
      "flex_logs_compute_xlarge_avg_sum";
  private Long flexLogsComputeXlargeAvgSum;

  public static final String JSON_PROPERTY_FLEX_LOGS_COMPUTE_XSMALL_AVG_SUM =
      "flex_logs_compute_xsmall_avg_sum";
  private Long flexLogsComputeXsmallAvgSum;

  public static final String JSON_PROPERTY_FLEX_LOGS_STARTER_AVG_SUM = "flex_logs_starter_avg_sum";
  private Long flexLogsStarterAvgSum;

  public static final String JSON_PROPERTY_FLEX_LOGS_STARTER_STORAGE_INDEX_AVG_SUM =
      "flex_logs_starter_storage_index_avg_sum";
  private Long flexLogsStarterStorageIndexAvgSum;

  public static final String JSON_PROPERTY_FLEX_LOGS_STARTER_STORAGE_RETENTION_ADJUSTMENT_AVG_SUM =
      "flex_logs_starter_storage_retention_adjustment_avg_sum";
  private Long flexLogsStarterStorageRetentionAdjustmentAvgSum;

  public static final String JSON_PROPERTY_FLEX_STORED_LOGS_AVG_SUM = "flex_stored_logs_avg_sum";
  private Long flexStoredLogsAvgSum;

  public static final String JSON_PROPERTY_FORWARDING_EVENTS_BYTES_AGG_SUM =
      "forwarding_events_bytes_agg_sum";
  private Long forwardingEventsBytesAggSum;

  public static final String JSON_PROPERTY_GCP_HOST_TOP99P_SUM = "gcp_host_top99p_sum";
  private Long gcpHostTop99pSum;

  public static final String JSON_PROPERTY_HEROKU_HOST_TOP99P_SUM = "heroku_host_top99p_sum";
  private Long herokuHostTop99pSum;

  public static final String JSON_PROPERTY_INCIDENT_MANAGEMENT_MONTHLY_ACTIVE_USERS_HWM_SUM =
      "incident_management_monthly_active_users_hwm_sum";
  private Long incidentManagementMonthlyActiveUsersHwmSum;

  public static final String JSON_PROPERTY_INCIDENT_MANAGEMENT_SEATS_HWM_SUM =
      "incident_management_seats_hwm_sum";
  private Long incidentManagementSeatsHwmSum;

  public static final String JSON_PROPERTY_INDEXED_EVENTS_COUNT_AGG_SUM =
      "indexed_events_count_agg_sum";
  private Long indexedEventsCountAggSum;

  public static final String JSON_PROPERTY_INDEXED_POINTS_AGG_SUM = "indexed_points_agg_sum";
  private Long indexedPointsAggSum;

  public static final String JSON_PROPERTY_INFRA_CPU_AGG_SUM = "infra_cpu_agg_sum";
  private Long infraCpuAggSum;

  public static final String JSON_PROPERTY_INFRA_CPU_AVG_SUM = "infra_cpu_avg_sum";
  private Long infraCpuAvgSum;

  public static final String JSON_PROPERTY_INFRA_CPU_DEFAULT_INFRA_HOST_VCPU_AGENT_AGG_SUM =
      "infra_cpu_default_infra_host_vcpu_agent_agg_sum";
  private Long infraCpuDefaultInfraHostVcpuAgentAggSum;

  public static final String JSON_PROPERTY_INFRA_CPU_DEFAULT_INFRA_HOST_VCPU_AGENT_AVG_SUM =
      "infra_cpu_default_infra_host_vcpu_agent_avg_sum";
  private Long infraCpuDefaultInfraHostVcpuAgentAvgSum;

  public static final String JSON_PROPERTY_INFRA_CPU_DEFAULT_INFRA_HOST_VCPU_AGENT_BASIC_AGG_SUM =
      "infra_cpu_default_infra_host_vcpu_agent_basic_agg_sum";
  private Long infraCpuDefaultInfraHostVcpuAgentBasicAggSum;

  public static final String JSON_PROPERTY_INFRA_CPU_DEFAULT_INFRA_HOST_VCPU_AGENT_BASIC_AVG_SUM =
      "infra_cpu_default_infra_host_vcpu_agent_basic_avg_sum";
  private Long infraCpuDefaultInfraHostVcpuAgentBasicAvgSum;

  public static final String JSON_PROPERTY_INFRA_CPU_DEFAULT_INFRA_HOST_VCPU_AWS_AGG_SUM =
      "infra_cpu_default_infra_host_vcpu_aws_agg_sum";
  private Long infraCpuDefaultInfraHostVcpuAwsAggSum;

  public static final String JSON_PROPERTY_INFRA_CPU_DEFAULT_INFRA_HOST_VCPU_AWS_AVG_SUM =
      "infra_cpu_default_infra_host_vcpu_aws_avg_sum";
  private Long infraCpuDefaultInfraHostVcpuAwsAvgSum;

  public static final String JSON_PROPERTY_INFRA_CPU_DEFAULT_INFRA_HOST_VCPU_AZURE_AGG_SUM =
      "infra_cpu_default_infra_host_vcpu_azure_agg_sum";
  private Long infraCpuDefaultInfraHostVcpuAzureAggSum;

  public static final String JSON_PROPERTY_INFRA_CPU_DEFAULT_INFRA_HOST_VCPU_AZURE_AVG_SUM =
      "infra_cpu_default_infra_host_vcpu_azure_avg_sum";
  private Long infraCpuDefaultInfraHostVcpuAzureAvgSum;

  public static final String JSON_PROPERTY_INFRA_CPU_DEFAULT_INFRA_HOST_VCPU_GCP_AGG_SUM =
      "infra_cpu_default_infra_host_vcpu_gcp_agg_sum";
  private Long infraCpuDefaultInfraHostVcpuGcpAggSum;

  public static final String JSON_PROPERTY_INFRA_CPU_DEFAULT_INFRA_HOST_VCPU_GCP_AVG_SUM =
      "infra_cpu_default_infra_host_vcpu_gcp_avg_sum";
  private Long infraCpuDefaultInfraHostVcpuGcpAvgSum;

  public static final String JSON_PROPERTY_INFRA_CPU_DEFAULT_INFRA_HOST_VCPU_NUTANIX_AGG_SUM =
      "infra_cpu_default_infra_host_vcpu_nutanix_agg_sum";
  private Long infraCpuDefaultInfraHostVcpuNutanixAggSum;

  public static final String JSON_PROPERTY_INFRA_CPU_DEFAULT_INFRA_HOST_VCPU_NUTANIX_AVG_SUM =
      "infra_cpu_default_infra_host_vcpu_nutanix_avg_sum";
  private Long infraCpuDefaultInfraHostVcpuNutanixAvgSum;

  public static final String JSON_PROPERTY_INFRA_CPU_DEFAULT_INFRA_HOST_VCPU_NUTANIX_BASIC_AGG_SUM =
      "infra_cpu_default_infra_host_vcpu_nutanix_basic_agg_sum";
  private Long infraCpuDefaultInfraHostVcpuNutanixBasicAggSum;

  public static final String JSON_PROPERTY_INFRA_CPU_DEFAULT_INFRA_HOST_VCPU_NUTANIX_BASIC_AVG_SUM =
      "infra_cpu_default_infra_host_vcpu_nutanix_basic_avg_sum";
  private Long infraCpuDefaultInfraHostVcpuNutanixBasicAvgSum;

  public static final String JSON_PROPERTY_INFRA_CPU_DEFAULT_INFRA_HOST_VCPU_OPENTELEMETRY_AGG_SUM =
      "infra_cpu_default_infra_host_vcpu_opentelemetry_agg_sum";
  private Long infraCpuDefaultInfraHostVcpuOpentelemetryAggSum;

  public static final String JSON_PROPERTY_INFRA_CPU_DEFAULT_INFRA_HOST_VCPU_OPENTELEMETRY_AVG_SUM =
      "infra_cpu_default_infra_host_vcpu_opentelemetry_avg_sum";
  private Long infraCpuDefaultInfraHostVcpuOpentelemetryAvgSum;

  public static final String JSON_PROPERTY_INFRA_CPU_OBSERVED_INFRA_HOST_VCPU_AGENT_AGG_SUM =
      "infra_cpu_observed_infra_host_vcpu_agent_agg_sum";
  private Long infraCpuObservedInfraHostVcpuAgentAggSum;

  public static final String JSON_PROPERTY_INFRA_CPU_OBSERVED_INFRA_HOST_VCPU_AGENT_AVG_SUM =
      "infra_cpu_observed_infra_host_vcpu_agent_avg_sum";
  private Long infraCpuObservedInfraHostVcpuAgentAvgSum;

  public static final String JSON_PROPERTY_INFRA_CPU_OBSERVED_INFRA_HOST_VCPU_AWS_AGG_SUM =
      "infra_cpu_observed_infra_host_vcpu_aws_agg_sum";
  private Long infraCpuObservedInfraHostVcpuAwsAggSum;

  public static final String JSON_PROPERTY_INFRA_CPU_OBSERVED_INFRA_HOST_VCPU_AWS_AVG_SUM =
      "infra_cpu_observed_infra_host_vcpu_aws_avg_sum";
  private Long infraCpuObservedInfraHostVcpuAwsAvgSum;

  public static final String JSON_PROPERTY_INFRA_CPU_OBSERVED_INFRA_HOST_VCPU_AZURE_AGG_SUM =
      "infra_cpu_observed_infra_host_vcpu_azure_agg_sum";
  private Long infraCpuObservedInfraHostVcpuAzureAggSum;

  public static final String JSON_PROPERTY_INFRA_CPU_OBSERVED_INFRA_HOST_VCPU_AZURE_AVG_SUM =
      "infra_cpu_observed_infra_host_vcpu_azure_avg_sum";
  private Long infraCpuObservedInfraHostVcpuAzureAvgSum;

  public static final String JSON_PROPERTY_INFRA_CPU_OBSERVED_INFRA_HOST_VCPU_GCP_AGG_SUM =
      "infra_cpu_observed_infra_host_vcpu_gcp_agg_sum";
  private Long infraCpuObservedInfraHostVcpuGcpAggSum;

  public static final String JSON_PROPERTY_INFRA_CPU_OBSERVED_INFRA_HOST_VCPU_GCP_AVG_SUM =
      "infra_cpu_observed_infra_host_vcpu_gcp_avg_sum";
  private Long infraCpuObservedInfraHostVcpuGcpAvgSum;

  public static final String JSON_PROPERTY_INFRA_CPU_OBSERVED_INFRA_HOST_VCPU_NUTANIX_AGG_SUM =
      "infra_cpu_observed_infra_host_vcpu_nutanix_agg_sum";
  private Long infraCpuObservedInfraHostVcpuNutanixAggSum;

  public static final String JSON_PROPERTY_INFRA_CPU_OBSERVED_INFRA_HOST_VCPU_NUTANIX_AVG_SUM =
      "infra_cpu_observed_infra_host_vcpu_nutanix_avg_sum";
  private Long infraCpuObservedInfraHostVcpuNutanixAvgSum;

  public static final String
      JSON_PROPERTY_INFRA_CPU_OBSERVED_INFRA_HOST_VCPU_OPENTELEMETRY_AGG_SUM =
          "infra_cpu_observed_infra_host_vcpu_opentelemetry_agg_sum";
  private Long infraCpuObservedInfraHostVcpuOpentelemetryAggSum;

  public static final String
      JSON_PROPERTY_INFRA_CPU_OBSERVED_INFRA_HOST_VCPU_OPENTELEMETRY_AVG_SUM =
          "infra_cpu_observed_infra_host_vcpu_opentelemetry_avg_sum";
  private Long infraCpuObservedInfraHostVcpuOpentelemetryAvgSum;

  public static final String JSON_PROPERTY_INFRA_EDGE_MONITORING_DEVICES_TOP99P_SUM =
      "infra_edge_monitoring_devices_top99p_sum";
  private Long infraEdgeMonitoringDevicesTop99pSum;

  public static final String JSON_PROPERTY_INFRA_HOST_BASIC_INFRA_BASIC_AGENT_TOP99P_SUM =
      "infra_host_basic_infra_basic_agent_top99p_sum";
  private Long infraHostBasicInfraBasicAgentTop99pSum;

  public static final String JSON_PROPERTY_INFRA_HOST_BASIC_INFRA_BASIC_VSPHERE_TOP99P_SUM =
      "infra_host_basic_infra_basic_vsphere_top99p_sum";
  private Long infraHostBasicInfraBasicVsphereTop99pSum;

  public static final String JSON_PROPERTY_INFRA_HOST_BASIC_TOP99P_SUM =
      "infra_host_basic_top99p_sum";
  private Long infraHostBasicTop99pSum;

  public static final String JSON_PROPERTY_INFRA_HOST_TOP99P_SUM = "infra_host_top99p_sum";
  private Long infraHostTop99pSum;

  public static final String JSON_PROPERTY_INFRA_STORAGE_MGMT_OBJECTS_COUNT_AVG_SUM =
      "infra_storage_mgmt_objects_count_avg_sum";
  private Long infraStorageMgmtObjectsCountAvgSum;

  public static final String JSON_PROPERTY_INGEST_POINTS_AGG_SUM = "ingest_points_agg_sum";
  private Long ingestPointsAggSum;

  public static final String JSON_PROPERTY_INGESTED_EVENTS_BYTES_AGG_SUM =
      "ingested_events_bytes_agg_sum";
  private Long ingestedEventsBytesAggSum;

  public static final String JSON_PROPERTY_IOT_APM_HOST_AGG_SUM = "iot_apm_host_agg_sum";
  private Long iotApmHostAggSum;

  public static final String JSON_PROPERTY_IOT_APM_HOST_TOP99P_SUM = "iot_apm_host_top99p_sum";
  private Long iotApmHostTop99pSum;

  public static final String JSON_PROPERTY_IOT_DEVICE_AGG_SUM = "iot_device_agg_sum";
  private Long iotDeviceAggSum;

  public static final String JSON_PROPERTY_IOT_DEVICE_TOP99P_SUM = "iot_device_top99p_sum";
  private Long iotDeviceTop99pSum;

  public static final String JSON_PROPERTY_LAST_UPDATED = "last_updated";
  private OffsetDateTime lastUpdated;

  public static final String JSON_PROPERTY_LIVE_INDEXED_EVENTS_AGG_SUM =
      "live_indexed_events_agg_sum";
  private Long liveIndexedEventsAggSum;

  public static final String JSON_PROPERTY_LIVE_INGESTED_BYTES_AGG_SUM =
      "live_ingested_bytes_agg_sum";
  private Long liveIngestedBytesAggSum;

  public static final String JSON_PROPERTY_LLM_OBSERVABILITY_15DAY_RETENTION_SPANS_AGG_SUM =
      "llm_observability_15day_retention_spans_agg_sum";
  private Long llmObservability15dayRetentionSpansAggSum;

  public static final String JSON_PROPERTY_LLM_OBSERVABILITY_30DAY_RETENTION_SPANS_AGG_SUM =
      "llm_observability_30day_retention_spans_agg_sum";
  private Long llmObservability30dayRetentionSpansAggSum;

  public static final String JSON_PROPERTY_LLM_OBSERVABILITY_60DAY_RETENTION_SPANS_AGG_SUM =
      "llm_observability_60day_retention_spans_agg_sum";
  private Long llmObservability60dayRetentionSpansAggSum;

  public static final String JSON_PROPERTY_LLM_OBSERVABILITY_90DAY_RETENTION_SPANS_AGG_SUM =
      "llm_observability_90day_retention_spans_agg_sum";
  private Long llmObservability90dayRetentionSpansAggSum;

  public static final String JSON_PROPERTY_LLM_OBSERVABILITY_AGG_SUM = "llm_observability_agg_sum";
  private Long llmObservabilityAggSum;

  public static final String JSON_PROPERTY_LLM_OBSERVABILITY_MIN_SPEND_AGG_SUM =
      "llm_observability_min_spend_agg_sum";
  private Long llmObservabilityMinSpendAggSum;

  public static final String JSON_PROPERTY_LOGS_ARCHIVE_SEARCH_GB_SCANNED_AGG_SUM =
      "logs_archive_search_gb_scanned_agg_sum";
  private Long logsArchiveSearchGbScannedAggSum;

  public static final String JSON_PROPERTY_LOGS_BY_RETENTION = "logs_by_retention";
  private LogsByRetention logsByRetention;

  public static final String JSON_PROPERTY_METRIC_NAMES_AGG_SUM = "metric_names_agg_sum";
  private Long metricNamesAggSum;

  public static final String JSON_PROPERTY_MOBILE_RUM_LITE_SESSION_COUNT_AGG_SUM =
      "mobile_rum_lite_session_count_agg_sum";
  private Long mobileRumLiteSessionCountAggSum;

  public static final String JSON_PROPERTY_MOBILE_RUM_SESSION_COUNT_AGG_SUM =
      "mobile_rum_session_count_agg_sum";
  private Long mobileRumSessionCountAggSum;

  public static final String JSON_PROPERTY_MOBILE_RUM_SESSION_COUNT_ANDROID_AGG_SUM =
      "mobile_rum_session_count_android_agg_sum";
  private Long mobileRumSessionCountAndroidAggSum;

  public static final String JSON_PROPERTY_MOBILE_RUM_SESSION_COUNT_FLUTTER_AGG_SUM =
      "mobile_rum_session_count_flutter_agg_sum";
  private Long mobileRumSessionCountFlutterAggSum;

  public static final String JSON_PROPERTY_MOBILE_RUM_SESSION_COUNT_IOS_AGG_SUM =
      "mobile_rum_session_count_ios_agg_sum";
  private Long mobileRumSessionCountIosAggSum;

  public static final String JSON_PROPERTY_MOBILE_RUM_SESSION_COUNT_REACTNATIVE_AGG_SUM =
      "mobile_rum_session_count_reactnative_agg_sum";
  private Long mobileRumSessionCountReactnativeAggSum;

  public static final String JSON_PROPERTY_MOBILE_RUM_SESSION_COUNT_ROKU_AGG_SUM =
      "mobile_rum_session_count_roku_agg_sum";
  private Long mobileRumSessionCountRokuAggSum;

  public static final String JSON_PROPERTY_MOBILE_RUM_UNITS_AGG_SUM = "mobile_rum_units_agg_sum";
  private Long mobileRumUnitsAggSum;

  public static final String JSON_PROPERTY_NDM_NETFLOW_EVENTS_AGG_SUM =
      "ndm_netflow_events_agg_sum";
  private Long ndmNetflowEventsAggSum;

  public static final String JSON_PROPERTY_NETFLOW_INDEXED_EVENTS_COUNT_AGG_SUM =
      "netflow_indexed_events_count_agg_sum";
  private Long netflowIndexedEventsCountAggSum;

  public static final String JSON_PROPERTY_NETWORK_DEVICE_WIRELESS_TOP99P_SUM =
      "network_device_wireless_top99p_sum";
  private Long networkDeviceWirelessTop99pSum;

  public static final String JSON_PROPERTY_NETWORK_PATH_AGG_SUM = "network_path_agg_sum";
  private Long networkPathAggSum;

  public static final String JSON_PROPERTY_NPM_HOST_TOP99P_SUM = "npm_host_top99p_sum";
  private Long npmHostTop99pSum;

  public static final String JSON_PROPERTY_OBSERVABILITY_PIPELINES_BYTES_PROCESSED_AGG_SUM =
      "observability_pipelines_bytes_processed_agg_sum";
  private Long observabilityPipelinesBytesProcessedAggSum;

  public static final String JSON_PROPERTY_OCI_HOST_AGG_SUM = "oci_host_agg_sum";
  private Long ociHostAggSum;

  public static final String JSON_PROPERTY_OCI_HOST_TOP99P_SUM = "oci_host_top99p_sum";
  private Long ociHostTop99pSum;

  public static final String JSON_PROPERTY_ON_CALL_SEAT_HWM_SUM = "on_call_seat_hwm_sum";
  private Long onCallSeatHwmSum;

  public static final String JSON_PROPERTY_ONLINE_ARCHIVE_EVENTS_COUNT_AGG_SUM =
      "online_archive_events_count_agg_sum";
  private Long onlineArchiveEventsCountAggSum;

  public static final String JSON_PROPERTY_OPENTELEMETRY_APM_HOST_TOP99P_SUM =
      "opentelemetry_apm_host_top99p_sum";
  private Long opentelemetryApmHostTop99pSum;

  public static final String JSON_PROPERTY_OPENTELEMETRY_HOST_TOP99P_SUM =
      "opentelemetry_host_top99p_sum";
  private Long opentelemetryHostTop99pSum;

  public static final String JSON_PROPERTY_PRODUCT_ANALYTICS_AGG_SUM = "product_analytics_agg_sum";
  private Long productAnalyticsAggSum;

  public static final String JSON_PROPERTY_PROFILING_AAS_COUNT_TOP99P_SUM =
      "profiling_aas_count_top99p_sum";
  private Long profilingAasCountTop99pSum;

  public static final String JSON_PROPERTY_PROFILING_CONTAINER_AGENT_COUNT_AVG =
      "profiling_container_agent_count_avg";
  private Long profilingContainerAgentCountAvg;

  public static final String JSON_PROPERTY_PROFILING_HOST_COUNT_TOP99P_SUM =
      "profiling_host_count_top99p_sum";
  private Long profilingHostCountTop99pSum;

  public static final String JSON_PROPERTY_PROXMOX_HOST_AGG_SUM = "proxmox_host_agg_sum";
  private Long proxmoxHostAggSum;

  public static final String JSON_PROPERTY_PROXMOX_HOST_TOP99P_SUM = "proxmox_host_top99p_sum";
  private Long proxmoxHostTop99pSum;

  public static final String JSON_PROPERTY_PUBLISHED_APP_HWM_SUM = "published_app_hwm_sum";
  private Long publishedAppHwmSum;

  public static final String JSON_PROPERTY_REHYDRATED_INDEXED_EVENTS_AGG_SUM =
      "rehydrated_indexed_events_agg_sum";
  private Long rehydratedIndexedEventsAggSum;

  public static final String JSON_PROPERTY_REHYDRATED_INGESTED_BYTES_AGG_SUM =
      "rehydrated_ingested_bytes_agg_sum";
  private Long rehydratedIngestedBytesAggSum;

  public static final String JSON_PROPERTY_RUM_BROWSER_AND_MOBILE_SESSION_COUNT =
      "rum_browser_and_mobile_session_count";
  private Long rumBrowserAndMobileSessionCount;

  public static final String JSON_PROPERTY_RUM_BROWSER_LEGACY_SESSION_COUNT_AGG_SUM =
      "rum_browser_legacy_session_count_agg_sum";
  private Long rumBrowserLegacySessionCountAggSum;

  public static final String JSON_PROPERTY_RUM_BROWSER_LITE_SESSION_COUNT_AGG_SUM =
      "rum_browser_lite_session_count_agg_sum";
  private Long rumBrowserLiteSessionCountAggSum;

  public static final String JSON_PROPERTY_RUM_BROWSER_REPLAY_SESSION_COUNT_AGG_SUM =
      "rum_browser_replay_session_count_agg_sum";
  private Long rumBrowserReplaySessionCountAggSum;

  public static final String JSON_PROPERTY_RUM_INDEXED_SESSIONS_AGG_SUM =
      "rum_indexed_sessions_agg_sum";
  private Long rumIndexedSessionsAggSum;

  public static final String JSON_PROPERTY_RUM_INGESTED_SESSIONS_AGG_SUM =
      "rum_ingested_sessions_agg_sum";
  private Long rumIngestedSessionsAggSum;

  public static final String JSON_PROPERTY_RUM_LITE_SESSION_COUNT_AGG_SUM =
      "rum_lite_session_count_agg_sum";
  private Long rumLiteSessionCountAggSum;

  public static final String JSON_PROPERTY_RUM_MOBILE_LEGACY_SESSION_COUNT_ANDROID_AGG_SUM =
      "rum_mobile_legacy_session_count_android_agg_sum";
  private Long rumMobileLegacySessionCountAndroidAggSum;

  public static final String JSON_PROPERTY_RUM_MOBILE_LEGACY_SESSION_COUNT_FLUTTER_AGG_SUM =
      "rum_mobile_legacy_session_count_flutter_agg_sum";
  private Long rumMobileLegacySessionCountFlutterAggSum;

  public static final String JSON_PROPERTY_RUM_MOBILE_LEGACY_SESSION_COUNT_IOS_AGG_SUM =
      "rum_mobile_legacy_session_count_ios_agg_sum";
  private Long rumMobileLegacySessionCountIosAggSum;

  public static final String JSON_PROPERTY_RUM_MOBILE_LEGACY_SESSION_COUNT_REACTNATIVE_AGG_SUM =
      "rum_mobile_legacy_session_count_reactnative_agg_sum";
  private Long rumMobileLegacySessionCountReactnativeAggSum;

  public static final String JSON_PROPERTY_RUM_MOBILE_LEGACY_SESSION_COUNT_ROKU_AGG_SUM =
      "rum_mobile_legacy_session_count_roku_agg_sum";
  private Long rumMobileLegacySessionCountRokuAggSum;

  public static final String JSON_PROPERTY_RUM_MOBILE_LITE_SESSION_COUNT_ANDROID_AGG_SUM =
      "rum_mobile_lite_session_count_android_agg_sum";
  private Long rumMobileLiteSessionCountAndroidAggSum;

  public static final String JSON_PROPERTY_RUM_MOBILE_LITE_SESSION_COUNT_FLUTTER_AGG_SUM =
      "rum_mobile_lite_session_count_flutter_agg_sum";
  private Long rumMobileLiteSessionCountFlutterAggSum;

  public static final String JSON_PROPERTY_RUM_MOBILE_LITE_SESSION_COUNT_IOS_AGG_SUM =
      "rum_mobile_lite_session_count_ios_agg_sum";
  private Long rumMobileLiteSessionCountIosAggSum;

  public static final String
      JSON_PROPERTY_RUM_MOBILE_LITE_SESSION_COUNT_KOTLINMULTIPLATFORM_AGG_SUM =
          "rum_mobile_lite_session_count_kotlinmultiplatform_agg_sum";
  private Long rumMobileLiteSessionCountKotlinmultiplatformAggSum;

  public static final String JSON_PROPERTY_RUM_MOBILE_LITE_SESSION_COUNT_REACTNATIVE_AGG_SUM =
      "rum_mobile_lite_session_count_reactnative_agg_sum";
  private Long rumMobileLiteSessionCountReactnativeAggSum;

  public static final String JSON_PROPERTY_RUM_MOBILE_LITE_SESSION_COUNT_ROKU_AGG_SUM =
      "rum_mobile_lite_session_count_roku_agg_sum";
  private Long rumMobileLiteSessionCountRokuAggSum;

  public static final String JSON_PROPERTY_RUM_MOBILE_LITE_SESSION_COUNT_UNITY_AGG_SUM =
      "rum_mobile_lite_session_count_unity_agg_sum";
  private Long rumMobileLiteSessionCountUnityAggSum;

  public static final String JSON_PROPERTY_RUM_MOBILE_REPLAY_SESSION_COUNT_ANDROID_AGG_SUM =
      "rum_mobile_replay_session_count_android_agg_sum";
  private Long rumMobileReplaySessionCountAndroidAggSum;

  public static final String JSON_PROPERTY_RUM_MOBILE_REPLAY_SESSION_COUNT_IOS_AGG_SUM =
      "rum_mobile_replay_session_count_ios_agg_sum";
  private Long rumMobileReplaySessionCountIosAggSum;

  public static final String
      JSON_PROPERTY_RUM_MOBILE_REPLAY_SESSION_COUNT_KOTLINMULTIPLATFORM_AGG_SUM =
          "rum_mobile_replay_session_count_kotlinmultiplatform_agg_sum";
  private Long rumMobileReplaySessionCountKotlinmultiplatformAggSum;

  public static final String JSON_PROPERTY_RUM_MOBILE_REPLAY_SESSION_COUNT_REACTNATIVE_AGG_SUM =
      "rum_mobile_replay_session_count_reactnative_agg_sum";
  private Long rumMobileReplaySessionCountReactnativeAggSum;

  public static final String JSON_PROPERTY_RUM_REPLAY_SESSION_COUNT_AGG_SUM =
      "rum_replay_session_count_agg_sum";
  private Long rumReplaySessionCountAggSum;

  public static final String JSON_PROPERTY_RUM_SESSION_COUNT_AGG_SUM = "rum_session_count_agg_sum";
  private Long rumSessionCountAggSum;

  public static final String JSON_PROPERTY_RUM_SESSION_REPLAY_ADD_ON_AGG_SUM =
      "rum_session_replay_add_on_agg_sum";
  private Long rumSessionReplayAddOnAggSum;

  public static final String JSON_PROPERTY_RUM_TOTAL_SESSION_COUNT_AGG_SUM =
      "rum_total_session_count_agg_sum";
  private Long rumTotalSessionCountAggSum;

  public static final String JSON_PROPERTY_RUM_UNITS_AGG_SUM = "rum_units_agg_sum";
  private Long rumUnitsAggSum;

  public static final String JSON_PROPERTY_SCA_FARGATE_COUNT_AVG_SUM = "sca_fargate_count_avg_sum";
  private Long scaFargateCountAvgSum;

  public static final String JSON_PROPERTY_SCA_FARGATE_COUNT_HWM_SUM = "sca_fargate_count_hwm_sum";
  private Long scaFargateCountHwmSum;

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

  public static final String
      JSON_PROPERTY_SERVERLESS_APPS_APM_APM_AZURE_APPSERVICE_INSTANCES_AVG_SUM =
          "serverless_apps_apm_apm_azure_appservice_instances_avg_sum";
  private Long serverlessAppsApmApmAzureAppserviceInstancesAvgSum;

  public static final String
      JSON_PROPERTY_SERVERLESS_APPS_APM_APM_AZURE_AZUREFUNCTION_INSTANCES_AVG_SUM =
          "serverless_apps_apm_apm_azure_azurefunction_instances_avg_sum";
  private Long serverlessAppsApmApmAzureAzurefunctionInstancesAvgSum;

  public static final String
      JSON_PROPERTY_SERVERLESS_APPS_APM_APM_AZURE_CONTAINERAPP_INSTANCES_AVG_SUM =
          "serverless_apps_apm_apm_azure_containerapp_instances_avg_sum";
  private Long serverlessAppsApmApmAzureContainerappInstancesAvgSum;

  public static final String JSON_PROPERTY_SERVERLESS_APPS_APM_APM_FARGATE_ECS_TASKS_AVG_SUM =
      "serverless_apps_apm_apm_fargate_ecs_tasks_avg_sum";
  private Long serverlessAppsApmApmFargateEcsTasksAvgSum;

  public static final String
      JSON_PROPERTY_SERVERLESS_APPS_APM_APM_GCP_CLOUDFUNCTION_INSTANCES_AVG_SUM =
          "serverless_apps_apm_apm_gcp_cloudfunction_instances_avg_sum";
  private Long serverlessAppsApmApmGcpCloudfunctionInstancesAvgSum;

  public static final String JSON_PROPERTY_SERVERLESS_APPS_APM_APM_GCP_CLOUDRUN_INSTANCES_AVG_SUM =
      "serverless_apps_apm_apm_gcp_cloudrun_instances_avg_sum";
  private Long serverlessAppsApmApmGcpCloudrunInstancesAvgSum;

  public static final String JSON_PROPERTY_SERVERLESS_APPS_APM_APM_GCP_GKE_AUTOPILOT_PODS_AVG_SUM =
      "serverless_apps_apm_apm_gcp_gke_autopilot_pods_avg_sum";
  private Long serverlessAppsApmApmGcpGkeAutopilotPodsAvgSum;

  public static final String JSON_PROPERTY_SERVERLESS_APPS_APM_AVG_SUM =
      "serverless_apps_apm_avg_sum";
  private Long serverlessAppsApmAvgSum;

  public static final String
      JSON_PROPERTY_SERVERLESS_APPS_APM_EXCL_FARGATE_APM_AZURE_APPSERVICE_INSTANCES_AVG_SUM =
          "serverless_apps_apm_excl_fargate_apm_azure_appservice_instances_avg_sum";
  private Long serverlessAppsApmExclFargateApmAzureAppserviceInstancesAvgSum;

  public static final String
      JSON_PROPERTY_SERVERLESS_APPS_APM_EXCL_FARGATE_APM_AZURE_AZUREFUNCTION_INSTANCES_AVG_SUM =
          "serverless_apps_apm_excl_fargate_apm_azure_azurefunction_instances_avg_sum";
  private Long serverlessAppsApmExclFargateApmAzureAzurefunctionInstancesAvgSum;

  public static final String
      JSON_PROPERTY_SERVERLESS_APPS_APM_EXCL_FARGATE_APM_AZURE_CONTAINERAPP_INSTANCES_AVG_SUM =
          "serverless_apps_apm_excl_fargate_apm_azure_containerapp_instances_avg_sum";
  private Long serverlessAppsApmExclFargateApmAzureContainerappInstancesAvgSum;

  public static final String
      JSON_PROPERTY_SERVERLESS_APPS_APM_EXCL_FARGATE_APM_GCP_CLOUDFUNCTION_INSTANCES_AVG_SUM =
          "serverless_apps_apm_excl_fargate_apm_gcp_cloudfunction_instances_avg_sum";
  private Long serverlessAppsApmExclFargateApmGcpCloudfunctionInstancesAvgSum;

  public static final String
      JSON_PROPERTY_SERVERLESS_APPS_APM_EXCL_FARGATE_APM_GCP_CLOUDRUN_INSTANCES_AVG_SUM =
          "serverless_apps_apm_excl_fargate_apm_gcp_cloudrun_instances_avg_sum";
  private Long serverlessAppsApmExclFargateApmGcpCloudrunInstancesAvgSum;

  public static final String
      JSON_PROPERTY_SERVERLESS_APPS_APM_EXCL_FARGATE_APM_GCP_GKE_AUTOPILOT_PODS_AVG_SUM =
          "serverless_apps_apm_excl_fargate_apm_gcp_gke_autopilot_pods_avg_sum";
  private Long serverlessAppsApmExclFargateApmGcpGkeAutopilotPodsAvgSum;

  public static final String JSON_PROPERTY_SERVERLESS_APPS_APM_EXCL_FARGATE_AVG_SUM =
      "serverless_apps_apm_excl_fargate_avg_sum";
  private Long serverlessAppsApmExclFargateAvgSum;

  public static final String JSON_PROPERTY_SERVERLESS_APPS_AZURE_CONTAINER_APP_INSTANCES_AVG_SUM =
      "serverless_apps_azure_container_app_instances_avg_sum";
  private Long serverlessAppsAzureContainerAppInstancesAvgSum;

  public static final String JSON_PROPERTY_SERVERLESS_APPS_AZURE_COUNT_AVG_SUM =
      "serverless_apps_azure_count_avg_sum";
  private Long serverlessAppsAzureCountAvgSum;

  public static final String JSON_PROPERTY_SERVERLESS_APPS_AZURE_FUNCTION_APP_INSTANCES_AVG_SUM =
      "serverless_apps_azure_function_app_instances_avg_sum";
  private Long serverlessAppsAzureFunctionAppInstancesAvgSum;

  public static final String JSON_PROPERTY_SERVERLESS_APPS_AZURE_WEB_APP_INSTANCES_AVG_SUM =
      "serverless_apps_azure_web_app_instances_avg_sum";
  private Long serverlessAppsAzureWebAppInstancesAvgSum;

  public static final String JSON_PROPERTY_SERVERLESS_APPS_DSM_FARGATE_TASKS_AVG_SUM =
      "serverless_apps_dsm_fargate_tasks_avg_sum";
  private Long serverlessAppsDsmFargateTasksAvgSum;

  public static final String JSON_PROPERTY_SERVERLESS_APPS_ECS_AVG_SUM =
      "serverless_apps_ecs_avg_sum";
  private Long serverlessAppsEcsAvgSum;

  public static final String JSON_PROPERTY_SERVERLESS_APPS_EKS_AVG_SUM =
      "serverless_apps_eks_avg_sum";
  private Long serverlessAppsEksAvgSum;

  public static final String JSON_PROPERTY_SERVERLESS_APPS_EXCL_FARGATE_AVG_SUM =
      "serverless_apps_excl_fargate_avg_sum";
  private Long serverlessAppsExclFargateAvgSum;

  public static final String
      JSON_PROPERTY_SERVERLESS_APPS_EXCL_FARGATE_AZURE_CONTAINER_APP_INSTANCES_AVG_SUM =
          "serverless_apps_excl_fargate_azure_container_app_instances_avg_sum";
  private Long serverlessAppsExclFargateAzureContainerAppInstancesAvgSum;

  public static final String
      JSON_PROPERTY_SERVERLESS_APPS_EXCL_FARGATE_AZURE_FUNCTION_APP_INSTANCES_AVG_SUM =
          "serverless_apps_excl_fargate_azure_function_app_instances_avg_sum";
  private Long serverlessAppsExclFargateAzureFunctionAppInstancesAvgSum;

  public static final String
      JSON_PROPERTY_SERVERLESS_APPS_EXCL_FARGATE_AZURE_WEB_APP_INSTANCES_AVG_SUM =
          "serverless_apps_excl_fargate_azure_web_app_instances_avg_sum";
  private Long serverlessAppsExclFargateAzureWebAppInstancesAvgSum;

  public static final String
      JSON_PROPERTY_SERVERLESS_APPS_EXCL_FARGATE_GOOGLE_CLOUD_FUNCTIONS_INSTANCES_AVG_SUM =
          "serverless_apps_excl_fargate_google_cloud_functions_instances_avg_sum";
  private Long serverlessAppsExclFargateGoogleCloudFunctionsInstancesAvgSum;

  public static final String
      JSON_PROPERTY_SERVERLESS_APPS_EXCL_FARGATE_GOOGLE_CLOUD_RUN_INSTANCES_AVG_SUM =
          "serverless_apps_excl_fargate_google_cloud_run_instances_avg_sum";
  private Long serverlessAppsExclFargateGoogleCloudRunInstancesAvgSum;

  public static final String
      JSON_PROPERTY_SERVERLESS_APPS_EXCL_FARGATE_INFRA_GCP_GKE_AUTOPILOT_PODS_AVG_SUM =
          "serverless_apps_excl_fargate_infra_gcp_gke_autopilot_pods_avg_sum";
  private Long serverlessAppsExclFargateInfraGcpGkeAutopilotPodsAvgSum;

  public static final String
      JSON_PROPERTY_SERVERLESS_APPS_GOOGLE_CLOUD_FUNCTIONS_INSTANCES_AVG_SUM =
          "serverless_apps_google_cloud_functions_instances_avg_sum";
  private Long serverlessAppsGoogleCloudFunctionsInstancesAvgSum;

  public static final String JSON_PROPERTY_SERVERLESS_APPS_GOOGLE_CLOUD_RUN_INSTANCES_AVG_SUM =
      "serverless_apps_google_cloud_run_instances_avg_sum";
  private Long serverlessAppsGoogleCloudRunInstancesAvgSum;

  public static final String JSON_PROPERTY_SERVERLESS_APPS_GOOGLE_COUNT_AVG_SUM =
      "serverless_apps_google_count_avg_sum";
  private Long serverlessAppsGoogleCountAvgSum;

  public static final String JSON_PROPERTY_SERVERLESS_APPS_INFRA_GCP_GKE_AUTOPILOT_PODS_AVG_SUM =
      "serverless_apps_infra_gcp_gke_autopilot_pods_avg_sum";
  private Long serverlessAppsInfraGcpGkeAutopilotPodsAvgSum;

  public static final String JSON_PROPERTY_SERVERLESS_APPS_TOTAL_COUNT_AVG_SUM =
      "serverless_apps_total_count_avg_sum";
  private Long serverlessAppsTotalCountAvgSum;

  public static final String JSON_PROPERTY_SIEM_12MO_RETENTION_AGG_SUM =
      "siem_12mo_retention_agg_sum";
  private Long siem12moRetentionAggSum;

  public static final String JSON_PROPERTY_SIEM_6MO_RETENTION_AGG_SUM =
      "siem_6mo_retention_agg_sum";
  private Long siem6moRetentionAggSum;

  public static final String JSON_PROPERTY_SIEM_ANALYZED_LOGS_ADD_ON_COUNT_AGG_SUM =
      "siem_analyzed_logs_add_on_count_agg_sum";
  private Long siemAnalyzedLogsAddOnCountAggSum;

  public static final String JSON_PROPERTY_SNMP_DEVICE_COUNT_AGG_SUM = "snmp_device_count_agg_sum";
  private Long snmpDeviceCountAggSum;

  public static final String JSON_PROPERTY_SNMP_DEVICE_COUNT_TOP99P_SUM =
      "snmp_device_count_top99p_sum";
  private Long snmpDeviceCountTop99pSum;

  public static final String JSON_PROPERTY_START_DATE = "start_date";
  private OffsetDateTime startDate;

  public static final String JSON_PROPERTY_SYNTHETICS_BROWSER_CHECK_CALLS_COUNT_AGG_SUM =
      "synthetics_browser_check_calls_count_agg_sum";
  private Long syntheticsBrowserCheckCallsCountAggSum;

  public static final String JSON_PROPERTY_SYNTHETICS_CHECK_CALLS_COUNT_AGG_SUM =
      "synthetics_check_calls_count_agg_sum";
  private Long syntheticsCheckCallsCountAggSum;

  public static final String JSON_PROPERTY_SYNTHETICS_MOBILE_TEST_RUNS_AGG_SUM =
      "synthetics_mobile_test_runs_agg_sum";
  private Long syntheticsMobileTestRunsAggSum;

  public static final String JSON_PROPERTY_SYNTHETICS_PARALLEL_TESTING_MAX_SLOTS_HWM_SUM =
      "synthetics_parallel_testing_max_slots_hwm_sum";
  private Long syntheticsParallelTestingMaxSlotsHwmSum;

  public static final String JSON_PROPERTY_TRACE_SEARCH_INDEXED_EVENTS_COUNT_AGG_SUM =
      "trace_search_indexed_events_count_agg_sum";
  private Long traceSearchIndexedEventsCountAggSum;

  public static final String JSON_PROPERTY_TWOL_INGESTED_EVENTS_BYTES_AGG_SUM =
      "twol_ingested_events_bytes_agg_sum";
  private Long twolIngestedEventsBytesAggSum;

  public static final String JSON_PROPERTY_UNIVERSAL_SERVICE_MONITORING_HOST_TOP99P_SUM =
      "universal_service_monitoring_host_top99p_sum";
  private Long universalServiceMonitoringHostTop99pSum;

  public static final String JSON_PROPERTY_USAGE = "usage";
  private List<UsageSummaryDate> usage = null;

  public static final String JSON_PROPERTY_VSPHERE_HOST_TOP99P_SUM = "vsphere_host_top99p_sum";
  private Long vsphereHostTop99pSum;

  public static final String JSON_PROPERTY_VULN_MANAGEMENT_HOST_COUNT_TOP99P_SUM =
      "vuln_management_host_count_top99p_sum";
  private Long vulnManagementHostCountTop99pSum;

  public static final String JSON_PROPERTY_WORKFLOW_EXECUTIONS_USAGE_AGG_SUM =
      "workflow_executions_usage_agg_sum";
  private Long workflowExecutionsUsageAggSum;

  public UsageSummaryResponse agentHostTop99pSum(Long agentHostTop99pSum) {
    this.agentHostTop99pSum = agentHostTop99pSum;
    return this;
  }

  /**
   * Shows the 99th percentile of all agent hosts over all hours in the current month for all
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
    putAdditionalProperty(JSON_PROPERTY_AGENT_HOST_TOP99P_SUM, agentHostTop99pSum);
  }

  public UsageSummaryResponse aiCreditsAgentBuilderAiCreditsAggSum(
      Long aiCreditsAgentBuilderAiCreditsAggSum) {
    this.aiCreditsAgentBuilderAiCreditsAggSum = aiCreditsAgentBuilderAiCreditsAggSum;
    return this;
  }

  /**
   * Shows the sum of all AI credits used by Agent Builder over all hours in the current month for
   * all organizations. Values are returned in micro-credits. Divide by 1,000,000 to get AI credits.
   *
   * @return aiCreditsAgentBuilderAiCreditsAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AI_CREDITS_AGENT_BUILDER_AI_CREDITS_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getAiCreditsAgentBuilderAiCreditsAggSum() {
    return aiCreditsAgentBuilderAiCreditsAggSum;
  }

  public void setAiCreditsAgentBuilderAiCreditsAggSum(Long aiCreditsAgentBuilderAiCreditsAggSum) {
    this.aiCreditsAgentBuilderAiCreditsAggSum = aiCreditsAgentBuilderAiCreditsAggSum;
    putAdditionalProperty(
        JSON_PROPERTY_AI_CREDITS_AGENT_BUILDER_AI_CREDITS_AGG_SUM,
        aiCreditsAgentBuilderAiCreditsAggSum);
  }

  public UsageSummaryResponse aiCreditsAggSum(Long aiCreditsAggSum) {
    this.aiCreditsAggSum = aiCreditsAggSum;
    return this;
  }

  /**
   * Shows the sum of all AI credits over all hours in the current month for all organizations.
   * Values are returned in micro-credits. Divide by 1,000,000 to get AI credits.
   *
   * @return aiCreditsAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AI_CREDITS_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getAiCreditsAggSum() {
    return aiCreditsAggSum;
  }

  public void setAiCreditsAggSum(Long aiCreditsAggSum) {
    this.aiCreditsAggSum = aiCreditsAggSum;
    putAdditionalProperty(JSON_PROPERTY_AI_CREDITS_AGG_SUM, aiCreditsAggSum);
  }

  public UsageSummaryResponse aiCreditsBitsAssistantAiCreditsAggSum(
      Long aiCreditsBitsAssistantAiCreditsAggSum) {
    this.aiCreditsBitsAssistantAiCreditsAggSum = aiCreditsBitsAssistantAiCreditsAggSum;
    return this;
  }

  /**
   * Shows the sum of all AI credits used by Bits AI Assistant over all hours in the current month
   * for all organizations. Values are returned in micro-credits. Divide by 1,000,000 to get AI
   * credits.
   *
   * @return aiCreditsBitsAssistantAiCreditsAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AI_CREDITS_BITS_ASSISTANT_AI_CREDITS_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getAiCreditsBitsAssistantAiCreditsAggSum() {
    return aiCreditsBitsAssistantAiCreditsAggSum;
  }

  public void setAiCreditsBitsAssistantAiCreditsAggSum(Long aiCreditsBitsAssistantAiCreditsAggSum) {
    this.aiCreditsBitsAssistantAiCreditsAggSum = aiCreditsBitsAssistantAiCreditsAggSum;
    putAdditionalProperty(
        JSON_PROPERTY_AI_CREDITS_BITS_ASSISTANT_AI_CREDITS_AGG_SUM,
        aiCreditsBitsAssistantAiCreditsAggSum);
  }

  public UsageSummaryResponse aiCreditsBitsDevAiCreditsAggSum(
      Long aiCreditsBitsDevAiCreditsAggSum) {
    this.aiCreditsBitsDevAiCreditsAggSum = aiCreditsBitsDevAiCreditsAggSum;
    return this;
  }

  /**
   * Shows the sum of all AI credits used by Bits AI Dev over all hours in the current month for all
   * organizations. Values are returned in micro-credits. Divide by 1,000,000 to get AI credits.
   *
   * @return aiCreditsBitsDevAiCreditsAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AI_CREDITS_BITS_DEV_AI_CREDITS_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getAiCreditsBitsDevAiCreditsAggSum() {
    return aiCreditsBitsDevAiCreditsAggSum;
  }

  public void setAiCreditsBitsDevAiCreditsAggSum(Long aiCreditsBitsDevAiCreditsAggSum) {
    this.aiCreditsBitsDevAiCreditsAggSum = aiCreditsBitsDevAiCreditsAggSum;
    putAdditionalProperty(
        JSON_PROPERTY_AI_CREDITS_BITS_DEV_AI_CREDITS_AGG_SUM, aiCreditsBitsDevAiCreditsAggSum);
  }

  public UsageSummaryResponse aiCreditsBitsSreAiCreditsAggSum(
      Long aiCreditsBitsSreAiCreditsAggSum) {
    this.aiCreditsBitsSreAiCreditsAggSum = aiCreditsBitsSreAiCreditsAggSum;
    return this;
  }

  /**
   * Shows the sum of all AI credits used by Bits AI SRE over all hours in the current month for all
   * organizations. Values are returned in micro-credits. Divide by 1,000,000 to get AI credits.
   *
   * @return aiCreditsBitsSreAiCreditsAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AI_CREDITS_BITS_SRE_AI_CREDITS_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getAiCreditsBitsSreAiCreditsAggSum() {
    return aiCreditsBitsSreAiCreditsAggSum;
  }

  public void setAiCreditsBitsSreAiCreditsAggSum(Long aiCreditsBitsSreAiCreditsAggSum) {
    this.aiCreditsBitsSreAiCreditsAggSum = aiCreditsBitsSreAiCreditsAggSum;
    putAdditionalProperty(
        JSON_PROPERTY_AI_CREDITS_BITS_SRE_AI_CREDITS_AGG_SUM, aiCreditsBitsSreAiCreditsAggSum);
  }

  public UsageSummaryResponse apmAzureAppServiceHostTop99pSum(
      Long apmAzureAppServiceHostTop99pSum) {
    this.apmAzureAppServiceHostTop99pSum = apmAzureAppServiceHostTop99pSum;
    return this;
  }

  /**
   * Shows the 99th percentile of all Azure app services using APM over all hours in the current
   * month all organizations.
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
    putAdditionalProperty(
        JSON_PROPERTY_APM_AZURE_APP_SERVICE_HOST_TOP99P_SUM, apmAzureAppServiceHostTop99pSum);
  }

  public UsageSummaryResponse apmDevsecopsHostTop99pSum(Long apmDevsecopsHostTop99pSum) {
    this.apmDevsecopsHostTop99pSum = apmDevsecopsHostTop99pSum;
    return this;
  }

  /**
   * Shows the 99th percentile of all APM DevSecOps hosts over all hours in the current month for
   * all organizations.
   *
   * @return apmDevsecopsHostTop99pSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APM_DEVSECOPS_HOST_TOP99P_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getApmDevsecopsHostTop99pSum() {
    return apmDevsecopsHostTop99pSum;
  }

  public void setApmDevsecopsHostTop99pSum(Long apmDevsecopsHostTop99pSum) {
    this.apmDevsecopsHostTop99pSum = apmDevsecopsHostTop99pSum;
    putAdditionalProperty(JSON_PROPERTY_APM_DEVSECOPS_HOST_TOP99P_SUM, apmDevsecopsHostTop99pSum);
  }

  public UsageSummaryResponse apmEnterpriseStandaloneHostsTop99pSum(
      Long apmEnterpriseStandaloneHostsTop99pSum) {
    this.apmEnterpriseStandaloneHostsTop99pSum = apmEnterpriseStandaloneHostsTop99pSum;
    return this;
  }

  /**
   * Shows the sum of the 99th percentile of all distinct standalone Enterprise hosts over all hours
   * in the current month for all organizations.
   *
   * @return apmEnterpriseStandaloneHostsTop99pSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APM_ENTERPRISE_STANDALONE_HOSTS_TOP99P_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getApmEnterpriseStandaloneHostsTop99pSum() {
    return apmEnterpriseStandaloneHostsTop99pSum;
  }

  public void setApmEnterpriseStandaloneHostsTop99pSum(Long apmEnterpriseStandaloneHostsTop99pSum) {
    this.apmEnterpriseStandaloneHostsTop99pSum = apmEnterpriseStandaloneHostsTop99pSum;
    putAdditionalProperty(
        JSON_PROPERTY_APM_ENTERPRISE_STANDALONE_HOSTS_TOP99P_SUM,
        apmEnterpriseStandaloneHostsTop99pSum);
  }

  public UsageSummaryResponse apmFargateCountAvgSum(Long apmFargateCountAvgSum) {
    this.apmFargateCountAvgSum = apmFargateCountAvgSum;
    return this;
  }

  /**
   * Shows the average of all APM ECS Fargate tasks over all hours in the current month for all
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
    putAdditionalProperty(JSON_PROPERTY_APM_FARGATE_COUNT_AVG_SUM, apmFargateCountAvgSum);
  }

  public UsageSummaryResponse apmHostTop99pSum(Long apmHostTop99pSum) {
    this.apmHostTop99pSum = apmHostTop99pSum;
    return this;
  }

  /**
   * Shows the 99th percentile of all distinct APM hosts over all hours in the current month for all
   * organizations.
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
    putAdditionalProperty(JSON_PROPERTY_APM_HOST_TOP99P_SUM, apmHostTop99pSum);
  }

  public UsageSummaryResponse apmProStandaloneHostsTop99pSum(Long apmProStandaloneHostsTop99pSum) {
    this.apmProStandaloneHostsTop99pSum = apmProStandaloneHostsTop99pSum;
    return this;
  }

  /**
   * Shows the sum of the 99th percentile of all distinct standalone Pro hosts over all hours in the
   * current month for all organizations.
   *
   * @return apmProStandaloneHostsTop99pSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APM_PRO_STANDALONE_HOSTS_TOP99P_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getApmProStandaloneHostsTop99pSum() {
    return apmProStandaloneHostsTop99pSum;
  }

  public void setApmProStandaloneHostsTop99pSum(Long apmProStandaloneHostsTop99pSum) {
    this.apmProStandaloneHostsTop99pSum = apmProStandaloneHostsTop99pSum;
    putAdditionalProperty(
        JSON_PROPERTY_APM_PRO_STANDALONE_HOSTS_TOP99P_SUM, apmProStandaloneHostsTop99pSum);
  }

  public UsageSummaryResponse appsecFargateCountAvgSum(Long appsecFargateCountAvgSum) {
    this.appsecFargateCountAvgSum = appsecFargateCountAvgSum;
    return this;
  }

  /**
   * Shows the average of all Application Security Monitoring ECS Fargate tasks over all hours in
   * the current month for all organizations.
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
    putAdditionalProperty(JSON_PROPERTY_APPSEC_FARGATE_COUNT_AVG_SUM, appsecFargateCountAvgSum);
  }

  public UsageSummaryResponse asmServerlessAggSum(Long asmServerlessAggSum) {
    this.asmServerlessAggSum = asmServerlessAggSum;
    return this;
  }

  /**
   * Shows the sum of all Application Security Monitoring Serverless invocations over all hours in
   * the current months for all organizations.
   *
   * @return asmServerlessAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ASM_SERVERLESS_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getAsmServerlessAggSum() {
    return asmServerlessAggSum;
  }

  public void setAsmServerlessAggSum(Long asmServerlessAggSum) {
    this.asmServerlessAggSum = asmServerlessAggSum;
    putAdditionalProperty(JSON_PROPERTY_ASM_SERVERLESS_AGG_SUM, asmServerlessAggSum);
  }

  public UsageSummaryResponse auditLogsLinesIndexedAggSum(Long auditLogsLinesIndexedAggSum) {
    this.auditLogsLinesIndexedAggSum = auditLogsLinesIndexedAggSum;
    return this;
  }

  /**
   * Shows the sum of all audit logs lines indexed over all hours in the current month for all
   * organizations (To be deprecated on October 1st, 2024).
   *
   * @return auditLogsLinesIndexedAggSum
   * @deprecated
   */
  @Deprecated
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUDIT_LOGS_LINES_INDEXED_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getAuditLogsLinesIndexedAggSum() {
    return auditLogsLinesIndexedAggSum;
  }

  @Deprecated
  public void setAuditLogsLinesIndexedAggSum(Long auditLogsLinesIndexedAggSum) {
    this.auditLogsLinesIndexedAggSum = auditLogsLinesIndexedAggSum;
    putAdditionalProperty(
        JSON_PROPERTY_AUDIT_LOGS_LINES_INDEXED_AGG_SUM, auditLogsLinesIndexedAggSum);
  }

  public UsageSummaryResponse auditTrailEnabledHwmSum(Long auditTrailEnabledHwmSum) {
    this.auditTrailEnabledHwmSum = auditTrailEnabledHwmSum;
    return this;
  }

  /**
   * Shows the total number of organizations that had Audit Trail enabled over a specific number of
   * months.
   *
   * @return auditTrailEnabledHwmSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUDIT_TRAIL_ENABLED_HWM_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getAuditTrailEnabledHwmSum() {
    return auditTrailEnabledHwmSum;
  }

  public void setAuditTrailEnabledHwmSum(Long auditTrailEnabledHwmSum) {
    this.auditTrailEnabledHwmSum = auditTrailEnabledHwmSum;
    putAdditionalProperty(JSON_PROPERTY_AUDIT_TRAIL_ENABLED_HWM_SUM, auditTrailEnabledHwmSum);
  }

  public UsageSummaryResponse auditTrailEventForwardingEventsAggSum(
      Long auditTrailEventForwardingEventsAggSum) {
    this.auditTrailEventForwardingEventsAggSum = auditTrailEventForwardingEventsAggSum;
    return this;
  }

  /**
   * Shows the sum of all Audit Trail event forwarding events over all hours in the current month
   * for all organizations.
   *
   * @return auditTrailEventForwardingEventsAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUDIT_TRAIL_EVENT_FORWARDING_EVENTS_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getAuditTrailEventForwardingEventsAggSum() {
    return auditTrailEventForwardingEventsAggSum;
  }

  public void setAuditTrailEventForwardingEventsAggSum(Long auditTrailEventForwardingEventsAggSum) {
    this.auditTrailEventForwardingEventsAggSum = auditTrailEventForwardingEventsAggSum;
    putAdditionalProperty(
        JSON_PROPERTY_AUDIT_TRAIL_EVENT_FORWARDING_EVENTS_AGG_SUM,
        auditTrailEventForwardingEventsAggSum);
  }

  public UsageSummaryResponse avgProfiledFargateTasksSum(Long avgProfiledFargateTasksSum) {
    this.avgProfiledFargateTasksSum = avgProfiledFargateTasksSum;
    return this;
  }

  /**
   * The average total count for Fargate Container Profiler over all hours in the current month for
   * all organizations.
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
    putAdditionalProperty(JSON_PROPERTY_AVG_PROFILED_FARGATE_TASKS_SUM, avgProfiledFargateTasksSum);
  }

  public UsageSummaryResponse awsHostTop99pSum(Long awsHostTop99pSum) {
    this.awsHostTop99pSum = awsHostTop99pSum;
    return this;
  }

  /**
   * Shows the 99th percentile of all AWS hosts over all hours in the current month for all
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
    putAdditionalProperty(JSON_PROPERTY_AWS_HOST_TOP99P_SUM, awsHostTop99pSum);
  }

  public UsageSummaryResponse awsLambdaFuncCount(Long awsLambdaFuncCount) {
    this.awsLambdaFuncCount = awsLambdaFuncCount;
    return this;
  }

  /**
   * Shows the average of the number of functions that executed 1 or more times each hour in the
   * current month for all organizations.
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
    putAdditionalProperty(JSON_PROPERTY_AWS_LAMBDA_FUNC_COUNT, awsLambdaFuncCount);
  }

  public UsageSummaryResponse awsLambdaInvocationsSum(Long awsLambdaInvocationsSum) {
    this.awsLambdaInvocationsSum = awsLambdaInvocationsSum;
    return this;
  }

  /**
   * Shows the sum of all AWS Lambda invocations over all hours in the current month for all
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
    putAdditionalProperty(JSON_PROPERTY_AWS_LAMBDA_INVOCATIONS_SUM, awsLambdaInvocationsSum);
  }

  public UsageSummaryResponse azureAppServiceTop99pSum(Long azureAppServiceTop99pSum) {
    this.azureAppServiceTop99pSum = azureAppServiceTop99pSum;
    return this;
  }

  /**
   * Shows the 99th percentile of all Azure app services over all hours in the current month for all
   * organizations.
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
    putAdditionalProperty(JSON_PROPERTY_AZURE_APP_SERVICE_TOP99P_SUM, azureAppServiceTop99pSum);
  }

  public UsageSummaryResponse azureHostTop99pSum(Long azureHostTop99pSum) {
    this.azureHostTop99pSum = azureHostTop99pSum;
    return this;
  }

  /**
   * Shows the 99th percentile of all Azure hosts over all hours in the current month for all
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
    putAdditionalProperty(JSON_PROPERTY_AZURE_HOST_TOP99P_SUM, azureHostTop99pSum);
  }

  public UsageSummaryResponse billableIngestedBytesAggSum(Long billableIngestedBytesAggSum) {
    this.billableIngestedBytesAggSum = billableIngestedBytesAggSum;
    return this;
  }

  /**
   * Shows the sum of all log bytes ingested over all hours in the current month for all
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
    putAdditionalProperty(
        JSON_PROPERTY_BILLABLE_INGESTED_BYTES_AGG_SUM, billableIngestedBytesAggSum);
  }

  public UsageSummaryResponse bitsAiInvestigationsAggSum(Long bitsAiInvestigationsAggSum) {
    this.bitsAiInvestigationsAggSum = bitsAiInvestigationsAggSum;
    return this;
  }

  /**
   * Shows the sum of all Bits AI Investigations over all hours in the current month for all
   * organizations.
   *
   * @return bitsAiInvestigationsAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BITS_AI_INVESTIGATIONS_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getBitsAiInvestigationsAggSum() {
    return bitsAiInvestigationsAggSum;
  }

  public void setBitsAiInvestigationsAggSum(Long bitsAiInvestigationsAggSum) {
    this.bitsAiInvestigationsAggSum = bitsAiInvestigationsAggSum;
    putAdditionalProperty(JSON_PROPERTY_BITS_AI_INVESTIGATIONS_AGG_SUM, bitsAiInvestigationsAggSum);
  }

  public UsageSummaryResponse browserRumLiteSessionCountAggSum(
      Long browserRumLiteSessionCountAggSum) {
    this.browserRumLiteSessionCountAggSum = browserRumLiteSessionCountAggSum;
    return this;
  }

  /**
   * Shows the sum of all browser lite sessions over all hours in the current month for all
   * organizations (To be deprecated on October 1st, 2024).
   *
   * @return browserRumLiteSessionCountAggSum
   * @deprecated
   */
  @Deprecated
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BROWSER_RUM_LITE_SESSION_COUNT_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getBrowserRumLiteSessionCountAggSum() {
    return browserRumLiteSessionCountAggSum;
  }

  @Deprecated
  public void setBrowserRumLiteSessionCountAggSum(Long browserRumLiteSessionCountAggSum) {
    this.browserRumLiteSessionCountAggSum = browserRumLiteSessionCountAggSum;
    putAdditionalProperty(
        JSON_PROPERTY_BROWSER_RUM_LITE_SESSION_COUNT_AGG_SUM, browserRumLiteSessionCountAggSum);
  }

  public UsageSummaryResponse browserRumReplaySessionCountAggSum(
      Long browserRumReplaySessionCountAggSum) {
    this.browserRumReplaySessionCountAggSum = browserRumReplaySessionCountAggSum;
    return this;
  }

  /**
   * Shows the sum of all browser replay sessions over all hours in the current month for all
   * organizations (To be deprecated on October 1st, 2024).
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
    putAdditionalProperty(
        JSON_PROPERTY_BROWSER_RUM_REPLAY_SESSION_COUNT_AGG_SUM, browserRumReplaySessionCountAggSum);
  }

  public UsageSummaryResponse browserRumUnitsAggSum(Long browserRumUnitsAggSum) {
    this.browserRumUnitsAggSum = browserRumUnitsAggSum;
    return this;
  }

  /**
   * Shows the sum of all browser RUM units over all hours in the current month for all
   * organizations (To be deprecated on October 1st, 2024).
   *
   * @return browserRumUnitsAggSum
   * @deprecated
   */
  @Deprecated
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BROWSER_RUM_UNITS_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getBrowserRumUnitsAggSum() {
    return browserRumUnitsAggSum;
  }

  @Deprecated
  public void setBrowserRumUnitsAggSum(Long browserRumUnitsAggSum) {
    this.browserRumUnitsAggSum = browserRumUnitsAggSum;
    putAdditionalProperty(JSON_PROPERTY_BROWSER_RUM_UNITS_AGG_SUM, browserRumUnitsAggSum);
  }

  public UsageSummaryResponse ccmAnthropicSpendLastSum(Long ccmAnthropicSpendLastSum) {
    this.ccmAnthropicSpendLastSum = ccmAnthropicSpendLastSum;
    return this;
  }

  /**
   * Shows the sum of the last value of Anthropic cloud spend monitored in the current month for all
   * organizations.
   *
   * @return ccmAnthropicSpendLastSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CCM_ANTHROPIC_SPEND_LAST_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCcmAnthropicSpendLastSum() {
    return ccmAnthropicSpendLastSum;
  }

  public void setCcmAnthropicSpendLastSum(Long ccmAnthropicSpendLastSum) {
    this.ccmAnthropicSpendLastSum = ccmAnthropicSpendLastSum;
    putAdditionalProperty(JSON_PROPERTY_CCM_ANTHROPIC_SPEND_LAST_SUM, ccmAnthropicSpendLastSum);
  }

  public UsageSummaryResponse ccmAwsSpendLastSum(Long ccmAwsSpendLastSum) {
    this.ccmAwsSpendLastSum = ccmAwsSpendLastSum;
    return this;
  }

  /**
   * Shows the sum of the last value of AWS cloud spend monitored in the current month for all
   * organizations.
   *
   * @return ccmAwsSpendLastSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CCM_AWS_SPEND_LAST_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCcmAwsSpendLastSum() {
    return ccmAwsSpendLastSum;
  }

  public void setCcmAwsSpendLastSum(Long ccmAwsSpendLastSum) {
    this.ccmAwsSpendLastSum = ccmAwsSpendLastSum;
    putAdditionalProperty(JSON_PROPERTY_CCM_AWS_SPEND_LAST_SUM, ccmAwsSpendLastSum);
  }

  public UsageSummaryResponse ccmAzureSpendLastSum(Long ccmAzureSpendLastSum) {
    this.ccmAzureSpendLastSum = ccmAzureSpendLastSum;
    return this;
  }

  /**
   * Shows the sum of the last value of Azure cloud spend monitored in the current month for all
   * organizations.
   *
   * @return ccmAzureSpendLastSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CCM_AZURE_SPEND_LAST_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCcmAzureSpendLastSum() {
    return ccmAzureSpendLastSum;
  }

  public void setCcmAzureSpendLastSum(Long ccmAzureSpendLastSum) {
    this.ccmAzureSpendLastSum = ccmAzureSpendLastSum;
    putAdditionalProperty(JSON_PROPERTY_CCM_AZURE_SPEND_LAST_SUM, ccmAzureSpendLastSum);
  }

  public UsageSummaryResponse ccmConfluentSpendLastSum(Long ccmConfluentSpendLastSum) {
    this.ccmConfluentSpendLastSum = ccmConfluentSpendLastSum;
    return this;
  }

  /**
   * Shows the sum of the last value of Confluent cloud spend monitored in the current month for all
   * organizations.
   *
   * @return ccmConfluentSpendLastSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CCM_CONFLUENT_SPEND_LAST_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCcmConfluentSpendLastSum() {
    return ccmConfluentSpendLastSum;
  }

  public void setCcmConfluentSpendLastSum(Long ccmConfluentSpendLastSum) {
    this.ccmConfluentSpendLastSum = ccmConfluentSpendLastSum;
    putAdditionalProperty(JSON_PROPERTY_CCM_CONFLUENT_SPEND_LAST_SUM, ccmConfluentSpendLastSum);
  }

  public UsageSummaryResponse ccmDatabricksSpendLastSum(Long ccmDatabricksSpendLastSum) {
    this.ccmDatabricksSpendLastSum = ccmDatabricksSpendLastSum;
    return this;
  }

  /**
   * Shows the sum of the last value of Databricks cloud spend monitored in the current month for
   * all organizations.
   *
   * @return ccmDatabricksSpendLastSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CCM_DATABRICKS_SPEND_LAST_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCcmDatabricksSpendLastSum() {
    return ccmDatabricksSpendLastSum;
  }

  public void setCcmDatabricksSpendLastSum(Long ccmDatabricksSpendLastSum) {
    this.ccmDatabricksSpendLastSum = ccmDatabricksSpendLastSum;
    putAdditionalProperty(JSON_PROPERTY_CCM_DATABRICKS_SPEND_LAST_SUM, ccmDatabricksSpendLastSum);
  }

  public UsageSummaryResponse ccmElasticSpendLastSum(Long ccmElasticSpendLastSum) {
    this.ccmElasticSpendLastSum = ccmElasticSpendLastSum;
    return this;
  }

  /**
   * Shows the sum of the last value of Elastic cloud spend monitored in the current month for all
   * organizations.
   *
   * @return ccmElasticSpendLastSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CCM_ELASTIC_SPEND_LAST_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCcmElasticSpendLastSum() {
    return ccmElasticSpendLastSum;
  }

  public void setCcmElasticSpendLastSum(Long ccmElasticSpendLastSum) {
    this.ccmElasticSpendLastSum = ccmElasticSpendLastSum;
    putAdditionalProperty(JSON_PROPERTY_CCM_ELASTIC_SPEND_LAST_SUM, ccmElasticSpendLastSum);
  }

  public UsageSummaryResponse ccmFastlySpendLastSum(Long ccmFastlySpendLastSum) {
    this.ccmFastlySpendLastSum = ccmFastlySpendLastSum;
    return this;
  }

  /**
   * Shows the sum of the last value of Fastly cloud spend monitored in the current month for all
   * organizations.
   *
   * @return ccmFastlySpendLastSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CCM_FASTLY_SPEND_LAST_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCcmFastlySpendLastSum() {
    return ccmFastlySpendLastSum;
  }

  public void setCcmFastlySpendLastSum(Long ccmFastlySpendLastSum) {
    this.ccmFastlySpendLastSum = ccmFastlySpendLastSum;
    putAdditionalProperty(JSON_PROPERTY_CCM_FASTLY_SPEND_LAST_SUM, ccmFastlySpendLastSum);
  }

  public UsageSummaryResponse ccmGcpSpendLastSum(Long ccmGcpSpendLastSum) {
    this.ccmGcpSpendLastSum = ccmGcpSpendLastSum;
    return this;
  }

  /**
   * Shows the sum of the last value of GCP cloud spend monitored in the current month for all
   * organizations.
   *
   * @return ccmGcpSpendLastSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CCM_GCP_SPEND_LAST_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCcmGcpSpendLastSum() {
    return ccmGcpSpendLastSum;
  }

  public void setCcmGcpSpendLastSum(Long ccmGcpSpendLastSum) {
    this.ccmGcpSpendLastSum = ccmGcpSpendLastSum;
    putAdditionalProperty(JSON_PROPERTY_CCM_GCP_SPEND_LAST_SUM, ccmGcpSpendLastSum);
  }

  public UsageSummaryResponse ccmGithubSpendLastSum(Long ccmGithubSpendLastSum) {
    this.ccmGithubSpendLastSum = ccmGithubSpendLastSum;
    return this;
  }

  /**
   * Shows the sum of the last value of GitHub cloud spend monitored in the current month for all
   * organizations.
   *
   * @return ccmGithubSpendLastSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CCM_GITHUB_SPEND_LAST_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCcmGithubSpendLastSum() {
    return ccmGithubSpendLastSum;
  }

  public void setCcmGithubSpendLastSum(Long ccmGithubSpendLastSum) {
    this.ccmGithubSpendLastSum = ccmGithubSpendLastSum;
    putAdditionalProperty(JSON_PROPERTY_CCM_GITHUB_SPEND_LAST_SUM, ccmGithubSpendLastSum);
  }

  public UsageSummaryResponse ccmMongodbSpendLastSum(Long ccmMongodbSpendLastSum) {
    this.ccmMongodbSpendLastSum = ccmMongodbSpendLastSum;
    return this;
  }

  /**
   * Shows the sum of the last value of MongoDB cloud spend monitored in the current month for all
   * organizations.
   *
   * @return ccmMongodbSpendLastSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CCM_MONGODB_SPEND_LAST_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCcmMongodbSpendLastSum() {
    return ccmMongodbSpendLastSum;
  }

  public void setCcmMongodbSpendLastSum(Long ccmMongodbSpendLastSum) {
    this.ccmMongodbSpendLastSum = ccmMongodbSpendLastSum;
    putAdditionalProperty(JSON_PROPERTY_CCM_MONGODB_SPEND_LAST_SUM, ccmMongodbSpendLastSum);
  }

  public UsageSummaryResponse ccmOciSpendLastSum(Long ccmOciSpendLastSum) {
    this.ccmOciSpendLastSum = ccmOciSpendLastSum;
    return this;
  }

  /**
   * Shows the sum of the last value of OCI cloud spend monitored in the current month for all
   * organizations.
   *
   * @return ccmOciSpendLastSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CCM_OCI_SPEND_LAST_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCcmOciSpendLastSum() {
    return ccmOciSpendLastSum;
  }

  public void setCcmOciSpendLastSum(Long ccmOciSpendLastSum) {
    this.ccmOciSpendLastSum = ccmOciSpendLastSum;
    putAdditionalProperty(JSON_PROPERTY_CCM_OCI_SPEND_LAST_SUM, ccmOciSpendLastSum);
  }

  public UsageSummaryResponse ccmOpenaiSpendLastSum(Long ccmOpenaiSpendLastSum) {
    this.ccmOpenaiSpendLastSum = ccmOpenaiSpendLastSum;
    return this;
  }

  /**
   * Shows the sum of the last value of OpenAI cloud spend monitored in the current month for all
   * organizations.
   *
   * @return ccmOpenaiSpendLastSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CCM_OPENAI_SPEND_LAST_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCcmOpenaiSpendLastSum() {
    return ccmOpenaiSpendLastSum;
  }

  public void setCcmOpenaiSpendLastSum(Long ccmOpenaiSpendLastSum) {
    this.ccmOpenaiSpendLastSum = ccmOpenaiSpendLastSum;
    putAdditionalProperty(JSON_PROPERTY_CCM_OPENAI_SPEND_LAST_SUM, ccmOpenaiSpendLastSum);
  }

  public UsageSummaryResponse ccmSnowflakeSpendLastSum(Long ccmSnowflakeSpendLastSum) {
    this.ccmSnowflakeSpendLastSum = ccmSnowflakeSpendLastSum;
    return this;
  }

  /**
   * Shows the sum of the last value of Snowflake cloud spend monitored in the current month for all
   * organizations.
   *
   * @return ccmSnowflakeSpendLastSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CCM_SNOWFLAKE_SPEND_LAST_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCcmSnowflakeSpendLastSum() {
    return ccmSnowflakeSpendLastSum;
  }

  public void setCcmSnowflakeSpendLastSum(Long ccmSnowflakeSpendLastSum) {
    this.ccmSnowflakeSpendLastSum = ccmSnowflakeSpendLastSum;
    putAdditionalProperty(JSON_PROPERTY_CCM_SNOWFLAKE_SPEND_LAST_SUM, ccmSnowflakeSpendLastSum);
  }

  public UsageSummaryResponse ccmSpendMonitoredEntLastSum(Long ccmSpendMonitoredEntLastSum) {
    this.ccmSpendMonitoredEntLastSum = ccmSpendMonitoredEntLastSum;
    return this;
  }

  /**
   * Shows the sum of the last value of the amount of cloud spend monitored for Enterprise in the
   * current month for all organizations.
   *
   * @return ccmSpendMonitoredEntLastSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CCM_SPEND_MONITORED_ENT_LAST_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCcmSpendMonitoredEntLastSum() {
    return ccmSpendMonitoredEntLastSum;
  }

  public void setCcmSpendMonitoredEntLastSum(Long ccmSpendMonitoredEntLastSum) {
    this.ccmSpendMonitoredEntLastSum = ccmSpendMonitoredEntLastSum;
    putAdditionalProperty(
        JSON_PROPERTY_CCM_SPEND_MONITORED_ENT_LAST_SUM, ccmSpendMonitoredEntLastSum);
  }

  public UsageSummaryResponse ccmSpendMonitoredProLastSum(Long ccmSpendMonitoredProLastSum) {
    this.ccmSpendMonitoredProLastSum = ccmSpendMonitoredProLastSum;
    return this;
  }

  /**
   * Shows the sum of the last value of the amount of cloud spend monitored for Pro in the current
   * month for all organizations.
   *
   * @return ccmSpendMonitoredProLastSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CCM_SPEND_MONITORED_PRO_LAST_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCcmSpendMonitoredProLastSum() {
    return ccmSpendMonitoredProLastSum;
  }

  public void setCcmSpendMonitoredProLastSum(Long ccmSpendMonitoredProLastSum) {
    this.ccmSpendMonitoredProLastSum = ccmSpendMonitoredProLastSum;
    putAdditionalProperty(
        JSON_PROPERTY_CCM_SPEND_MONITORED_PRO_LAST_SUM, ccmSpendMonitoredProLastSum);
  }

  public UsageSummaryResponse ccmTwilioSpendLastSum(Long ccmTwilioSpendLastSum) {
    this.ccmTwilioSpendLastSum = ccmTwilioSpendLastSum;
    return this;
  }

  /**
   * Shows the sum of the last value of Twilio cloud spend monitored in the current month for all
   * organizations.
   *
   * @return ccmTwilioSpendLastSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CCM_TWILIO_SPEND_LAST_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCcmTwilioSpendLastSum() {
    return ccmTwilioSpendLastSum;
  }

  public void setCcmTwilioSpendLastSum(Long ccmTwilioSpendLastSum) {
    this.ccmTwilioSpendLastSum = ccmTwilioSpendLastSum;
    putAdditionalProperty(JSON_PROPERTY_CCM_TWILIO_SPEND_LAST_SUM, ccmTwilioSpendLastSum);
  }

  public UsageSummaryResponse ciPipelineIndexedSpansAggSum(Long ciPipelineIndexedSpansAggSum) {
    this.ciPipelineIndexedSpansAggSum = ciPipelineIndexedSpansAggSum;
    return this;
  }

  /**
   * Shows the sum of all CI pipeline indexed spans over all hours in the current month for all
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
    putAdditionalProperty(
        JSON_PROPERTY_CI_PIPELINE_INDEXED_SPANS_AGG_SUM, ciPipelineIndexedSpansAggSum);
  }

  public UsageSummaryResponse ciTestIndexedSpansAggSum(Long ciTestIndexedSpansAggSum) {
    this.ciTestIndexedSpansAggSum = ciTestIndexedSpansAggSum;
    return this;
  }

  /**
   * Shows the sum of all CI test indexed spans over all hours in the current month for all
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
    putAdditionalProperty(JSON_PROPERTY_CI_TEST_INDEXED_SPANS_AGG_SUM, ciTestIndexedSpansAggSum);
  }

  public UsageSummaryResponse ciVisibilityItrCommittersHwmSum(
      Long ciVisibilityItrCommittersHwmSum) {
    this.ciVisibilityItrCommittersHwmSum = ciVisibilityItrCommittersHwmSum;
    return this;
  }

  /**
   * Shows the high-water mark of all CI visibility intelligent test runner committers over all
   * hours in the current month for all organizations.
   *
   * @return ciVisibilityItrCommittersHwmSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CI_VISIBILITY_ITR_COMMITTERS_HWM_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCiVisibilityItrCommittersHwmSum() {
    return ciVisibilityItrCommittersHwmSum;
  }

  public void setCiVisibilityItrCommittersHwmSum(Long ciVisibilityItrCommittersHwmSum) {
    this.ciVisibilityItrCommittersHwmSum = ciVisibilityItrCommittersHwmSum;
    putAdditionalProperty(
        JSON_PROPERTY_CI_VISIBILITY_ITR_COMMITTERS_HWM_SUM, ciVisibilityItrCommittersHwmSum);
  }

  public UsageSummaryResponse ciVisibilityPipelineCommittersHwmSum(
      Long ciVisibilityPipelineCommittersHwmSum) {
    this.ciVisibilityPipelineCommittersHwmSum = ciVisibilityPipelineCommittersHwmSum;
    return this;
  }

  /**
   * Shows the high-water mark of all CI visibility pipeline committers over all hours in the
   * current month for all organizations.
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
    putAdditionalProperty(
        JSON_PROPERTY_CI_VISIBILITY_PIPELINE_COMMITTERS_HWM_SUM,
        ciVisibilityPipelineCommittersHwmSum);
  }

  public UsageSummaryResponse ciVisibilityTestCommittersHwmSum(
      Long ciVisibilityTestCommittersHwmSum) {
    this.ciVisibilityTestCommittersHwmSum = ciVisibilityTestCommittersHwmSum;
    return this;
  }

  /**
   * Shows the high-water mark of all CI visibility test committers over all hours in the current
   * month for all organizations.
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
    putAdditionalProperty(
        JSON_PROPERTY_CI_VISIBILITY_TEST_COMMITTERS_HWM_SUM, ciVisibilityTestCommittersHwmSum);
  }

  public UsageSummaryResponse cloudCostManagementAwsHostCountAvgSum(
      Long cloudCostManagementAwsHostCountAvgSum) {
    this.cloudCostManagementAwsHostCountAvgSum = cloudCostManagementAwsHostCountAvgSum;
    return this;
  }

  /**
   * Sum of the host count average for Cloud Cost Management for AWS.
   *
   * @return cloudCostManagementAwsHostCountAvgSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CLOUD_COST_MANAGEMENT_AWS_HOST_COUNT_AVG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCloudCostManagementAwsHostCountAvgSum() {
    return cloudCostManagementAwsHostCountAvgSum;
  }

  public void setCloudCostManagementAwsHostCountAvgSum(Long cloudCostManagementAwsHostCountAvgSum) {
    this.cloudCostManagementAwsHostCountAvgSum = cloudCostManagementAwsHostCountAvgSum;
    putAdditionalProperty(
        JSON_PROPERTY_CLOUD_COST_MANAGEMENT_AWS_HOST_COUNT_AVG_SUM,
        cloudCostManagementAwsHostCountAvgSum);
  }

  public UsageSummaryResponse cloudCostManagementAzureHostCountAvgSum(
      Long cloudCostManagementAzureHostCountAvgSum) {
    this.cloudCostManagementAzureHostCountAvgSum = cloudCostManagementAzureHostCountAvgSum;
    return this;
  }

  /**
   * Sum of the host count average for Cloud Cost Management for Azure.
   *
   * @return cloudCostManagementAzureHostCountAvgSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CLOUD_COST_MANAGEMENT_AZURE_HOST_COUNT_AVG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCloudCostManagementAzureHostCountAvgSum() {
    return cloudCostManagementAzureHostCountAvgSum;
  }

  public void setCloudCostManagementAzureHostCountAvgSum(
      Long cloudCostManagementAzureHostCountAvgSum) {
    this.cloudCostManagementAzureHostCountAvgSum = cloudCostManagementAzureHostCountAvgSum;
    putAdditionalProperty(
        JSON_PROPERTY_CLOUD_COST_MANAGEMENT_AZURE_HOST_COUNT_AVG_SUM,
        cloudCostManagementAzureHostCountAvgSum);
  }

  public UsageSummaryResponse cloudCostManagementGcpHostCountAvgSum(
      Long cloudCostManagementGcpHostCountAvgSum) {
    this.cloudCostManagementGcpHostCountAvgSum = cloudCostManagementGcpHostCountAvgSum;
    return this;
  }

  /**
   * Sum of the host count average for Cloud Cost Management for GCP.
   *
   * @return cloudCostManagementGcpHostCountAvgSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CLOUD_COST_MANAGEMENT_GCP_HOST_COUNT_AVG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCloudCostManagementGcpHostCountAvgSum() {
    return cloudCostManagementGcpHostCountAvgSum;
  }

  public void setCloudCostManagementGcpHostCountAvgSum(Long cloudCostManagementGcpHostCountAvgSum) {
    this.cloudCostManagementGcpHostCountAvgSum = cloudCostManagementGcpHostCountAvgSum;
    putAdditionalProperty(
        JSON_PROPERTY_CLOUD_COST_MANAGEMENT_GCP_HOST_COUNT_AVG_SUM,
        cloudCostManagementGcpHostCountAvgSum);
  }

  public UsageSummaryResponse cloudCostManagementHostCountAvgSum(
      Long cloudCostManagementHostCountAvgSum) {
    this.cloudCostManagementHostCountAvgSum = cloudCostManagementHostCountAvgSum;
    return this;
  }

  /**
   * Sum of the host count average for Cloud Cost Management for all cloud providers.
   *
   * @return cloudCostManagementHostCountAvgSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CLOUD_COST_MANAGEMENT_HOST_COUNT_AVG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCloudCostManagementHostCountAvgSum() {
    return cloudCostManagementHostCountAvgSum;
  }

  public void setCloudCostManagementHostCountAvgSum(Long cloudCostManagementHostCountAvgSum) {
    this.cloudCostManagementHostCountAvgSum = cloudCostManagementHostCountAvgSum;
    putAdditionalProperty(
        JSON_PROPERTY_CLOUD_COST_MANAGEMENT_HOST_COUNT_AVG_SUM, cloudCostManagementHostCountAvgSum);
  }

  public UsageSummaryResponse cloudCostManagementOciHostCountAvgSum(
      Long cloudCostManagementOciHostCountAvgSum) {
    this.cloudCostManagementOciHostCountAvgSum = cloudCostManagementOciHostCountAvgSum;
    return this;
  }

  /**
   * Sum of the average host counts for Cloud Cost Management on OCI.
   *
   * @return cloudCostManagementOciHostCountAvgSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CLOUD_COST_MANAGEMENT_OCI_HOST_COUNT_AVG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCloudCostManagementOciHostCountAvgSum() {
    return cloudCostManagementOciHostCountAvgSum;
  }

  public void setCloudCostManagementOciHostCountAvgSum(Long cloudCostManagementOciHostCountAvgSum) {
    this.cloudCostManagementOciHostCountAvgSum = cloudCostManagementOciHostCountAvgSum;
    putAdditionalProperty(
        JSON_PROPERTY_CLOUD_COST_MANAGEMENT_OCI_HOST_COUNT_AVG_SUM,
        cloudCostManagementOciHostCountAvgSum);
  }

  public UsageSummaryResponse cloudSiemEventsAggSum(Long cloudSiemEventsAggSum) {
    this.cloudSiemEventsAggSum = cloudSiemEventsAggSum;
    return this;
  }

  /**
   * Shows the sum of all Cloud Security Information and Event Management events over all hours in
   * the current month for all organizations.
   *
   * @return cloudSiemEventsAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CLOUD_SIEM_EVENTS_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCloudSiemEventsAggSum() {
    return cloudSiemEventsAggSum;
  }

  public void setCloudSiemEventsAggSum(Long cloudSiemEventsAggSum) {
    this.cloudSiemEventsAggSum = cloudSiemEventsAggSum;
    putAdditionalProperty(JSON_PROPERTY_CLOUD_SIEM_EVENTS_AGG_SUM, cloudSiemEventsAggSum);
  }

  public UsageSummaryResponse cloudSiemIndexedLogsAggSum(Long cloudSiemIndexedLogsAggSum) {
    this.cloudSiemIndexedLogsAggSum = cloudSiemIndexedLogsAggSum;
    return this;
  }

  /**
   * Shows the sum of all Cloud SIEM Indexed Logs over all hours in the current month for all
   * organizations.
   *
   * @return cloudSiemIndexedLogsAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CLOUD_SIEM_INDEXED_LOGS_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCloudSiemIndexedLogsAggSum() {
    return cloudSiemIndexedLogsAggSum;
  }

  public void setCloudSiemIndexedLogsAggSum(Long cloudSiemIndexedLogsAggSum) {
    this.cloudSiemIndexedLogsAggSum = cloudSiemIndexedLogsAggSum;
    putAdditionalProperty(
        JSON_PROPERTY_CLOUD_SIEM_INDEXED_LOGS_AGG_SUM, cloudSiemIndexedLogsAggSum);
  }

  public UsageSummaryResponse codeAnalysisSaCommittersHwmSum(Long codeAnalysisSaCommittersHwmSum) {
    this.codeAnalysisSaCommittersHwmSum = codeAnalysisSaCommittersHwmSum;
    return this;
  }

  /**
   * Shows the high-water mark of all Static Analysis committers over all hours in the current month
   * for all organizations.
   *
   * @return codeAnalysisSaCommittersHwmSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CODE_ANALYSIS_SA_COMMITTERS_HWM_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCodeAnalysisSaCommittersHwmSum() {
    return codeAnalysisSaCommittersHwmSum;
  }

  public void setCodeAnalysisSaCommittersHwmSum(Long codeAnalysisSaCommittersHwmSum) {
    this.codeAnalysisSaCommittersHwmSum = codeAnalysisSaCommittersHwmSum;
    putAdditionalProperty(
        JSON_PROPERTY_CODE_ANALYSIS_SA_COMMITTERS_HWM_SUM, codeAnalysisSaCommittersHwmSum);
  }

  public UsageSummaryResponse codeAnalysisScaCommittersHwmSum(
      Long codeAnalysisScaCommittersHwmSum) {
    this.codeAnalysisScaCommittersHwmSum = codeAnalysisScaCommittersHwmSum;
    return this;
  }

  /**
   * Shows the high-water mark of all static Software Composition Analysis committers over all hours
   * in the current month for all organizations.
   *
   * @return codeAnalysisScaCommittersHwmSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CODE_ANALYSIS_SCA_COMMITTERS_HWM_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCodeAnalysisScaCommittersHwmSum() {
    return codeAnalysisScaCommittersHwmSum;
  }

  public void setCodeAnalysisScaCommittersHwmSum(Long codeAnalysisScaCommittersHwmSum) {
    this.codeAnalysisScaCommittersHwmSum = codeAnalysisScaCommittersHwmSum;
    putAdditionalProperty(
        JSON_PROPERTY_CODE_ANALYSIS_SCA_COMMITTERS_HWM_SUM, codeAnalysisScaCommittersHwmSum);
  }

  public UsageSummaryResponse codeSecurityHostTop99pSum(Long codeSecurityHostTop99pSum) {
    this.codeSecurityHostTop99pSum = codeSecurityHostTop99pSum;
    return this;
  }

  /**
   * Shows the 99th percentile of all Code Security hosts over all hours in the current month for
   * all organizations.
   *
   * @return codeSecurityHostTop99pSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CODE_SECURITY_HOST_TOP99P_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCodeSecurityHostTop99pSum() {
    return codeSecurityHostTop99pSum;
  }

  public void setCodeSecurityHostTop99pSum(Long codeSecurityHostTop99pSum) {
    this.codeSecurityHostTop99pSum = codeSecurityHostTop99pSum;
    putAdditionalProperty(JSON_PROPERTY_CODE_SECURITY_HOST_TOP99P_SUM, codeSecurityHostTop99pSum);
  }

  public UsageSummaryResponse containerAvgSum(Long containerAvgSum) {
    this.containerAvgSum = containerAvgSum;
    return this;
  }

  /**
   * Shows the average of all distinct containers over all hours in the current month for all
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
    putAdditionalProperty(JSON_PROPERTY_CONTAINER_AVG_SUM, containerAvgSum);
  }

  public UsageSummaryResponse containerExclAgentAvgSum(Long containerExclAgentAvgSum) {
    this.containerExclAgentAvgSum = containerExclAgentAvgSum;
    return this;
  }

  /**
   * Shows the average of the containers without the Datadog Agent over all hours in the current
   * month for all organizations.
   *
   * @return containerExclAgentAvgSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTAINER_EXCL_AGENT_AVG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getContainerExclAgentAvgSum() {
    return containerExclAgentAvgSum;
  }

  public void setContainerExclAgentAvgSum(Long containerExclAgentAvgSum) {
    this.containerExclAgentAvgSum = containerExclAgentAvgSum;
    putAdditionalProperty(JSON_PROPERTY_CONTAINER_EXCL_AGENT_AVG_SUM, containerExclAgentAvgSum);
  }

  public UsageSummaryResponse containerHwmSum(Long containerHwmSum) {
    this.containerHwmSum = containerHwmSum;
    return this;
  }

  /**
   * Shows the sum of the high-water marks of all distinct containers over all hours in the current
   * month for all organizations.
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
    putAdditionalProperty(JSON_PROPERTY_CONTAINER_HWM_SUM, containerHwmSum);
  }

  public UsageSummaryResponse csmContainerEnterpriseComplianceCountAggSum(
      Long csmContainerEnterpriseComplianceCountAggSum) {
    this.csmContainerEnterpriseComplianceCountAggSum = csmContainerEnterpriseComplianceCountAggSum;
    return this;
  }

  /**
   * Shows the sum of all Cloud Security Management Enterprise compliance containers over all hours
   * in the current month for all organizations.
   *
   * @return csmContainerEnterpriseComplianceCountAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CSM_CONTAINER_ENTERPRISE_COMPLIANCE_COUNT_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCsmContainerEnterpriseComplianceCountAggSum() {
    return csmContainerEnterpriseComplianceCountAggSum;
  }

  public void setCsmContainerEnterpriseComplianceCountAggSum(
      Long csmContainerEnterpriseComplianceCountAggSum) {
    this.csmContainerEnterpriseComplianceCountAggSum = csmContainerEnterpriseComplianceCountAggSum;
    putAdditionalProperty(
        JSON_PROPERTY_CSM_CONTAINER_ENTERPRISE_COMPLIANCE_COUNT_AGG_SUM,
        csmContainerEnterpriseComplianceCountAggSum);
  }

  public UsageSummaryResponse csmContainerEnterpriseCwsCountAggSum(
      Long csmContainerEnterpriseCwsCountAggSum) {
    this.csmContainerEnterpriseCwsCountAggSum = csmContainerEnterpriseCwsCountAggSum;
    return this;
  }

  /**
   * Shows the sum of all Cloud Security Management Enterprise Cloud Workload Security containers
   * over all hours in the current month for all organizations.
   *
   * @return csmContainerEnterpriseCwsCountAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CSM_CONTAINER_ENTERPRISE_CWS_COUNT_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCsmContainerEnterpriseCwsCountAggSum() {
    return csmContainerEnterpriseCwsCountAggSum;
  }

  public void setCsmContainerEnterpriseCwsCountAggSum(Long csmContainerEnterpriseCwsCountAggSum) {
    this.csmContainerEnterpriseCwsCountAggSum = csmContainerEnterpriseCwsCountAggSum;
    putAdditionalProperty(
        JSON_PROPERTY_CSM_CONTAINER_ENTERPRISE_CWS_COUNT_AGG_SUM,
        csmContainerEnterpriseCwsCountAggSum);
  }

  public UsageSummaryResponse csmContainerEnterpriseTotalCountAggSum(
      Long csmContainerEnterpriseTotalCountAggSum) {
    this.csmContainerEnterpriseTotalCountAggSum = csmContainerEnterpriseTotalCountAggSum;
    return this;
  }

  /**
   * Shows the sum of all Cloud Security Management Enterprise containers over all hours in the
   * current month for all organizations.
   *
   * @return csmContainerEnterpriseTotalCountAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CSM_CONTAINER_ENTERPRISE_TOTAL_COUNT_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCsmContainerEnterpriseTotalCountAggSum() {
    return csmContainerEnterpriseTotalCountAggSum;
  }

  public void setCsmContainerEnterpriseTotalCountAggSum(
      Long csmContainerEnterpriseTotalCountAggSum) {
    this.csmContainerEnterpriseTotalCountAggSum = csmContainerEnterpriseTotalCountAggSum;
    putAdditionalProperty(
        JSON_PROPERTY_CSM_CONTAINER_ENTERPRISE_TOTAL_COUNT_AGG_SUM,
        csmContainerEnterpriseTotalCountAggSum);
  }

  public UsageSummaryResponse csmHostEnterpriseAasHostCountTop99pSum(
      Long csmHostEnterpriseAasHostCountTop99pSum) {
    this.csmHostEnterpriseAasHostCountTop99pSum = csmHostEnterpriseAasHostCountTop99pSum;
    return this;
  }

  /**
   * Shows the 99th percentile of all Cloud Security Management Enterprise Azure app services hosts
   * over all hours in the current month for all organizations.
   *
   * @return csmHostEnterpriseAasHostCountTop99pSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CSM_HOST_ENTERPRISE_AAS_HOST_COUNT_TOP99P_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCsmHostEnterpriseAasHostCountTop99pSum() {
    return csmHostEnterpriseAasHostCountTop99pSum;
  }

  public void setCsmHostEnterpriseAasHostCountTop99pSum(
      Long csmHostEnterpriseAasHostCountTop99pSum) {
    this.csmHostEnterpriseAasHostCountTop99pSum = csmHostEnterpriseAasHostCountTop99pSum;
    putAdditionalProperty(
        JSON_PROPERTY_CSM_HOST_ENTERPRISE_AAS_HOST_COUNT_TOP99P_SUM,
        csmHostEnterpriseAasHostCountTop99pSum);
  }

  public UsageSummaryResponse csmHostEnterpriseAwsHostCountTop99pSum(
      Long csmHostEnterpriseAwsHostCountTop99pSum) {
    this.csmHostEnterpriseAwsHostCountTop99pSum = csmHostEnterpriseAwsHostCountTop99pSum;
    return this;
  }

  /**
   * Shows the 99th percentile of all Cloud Security Management Enterprise AWS hosts over all hours
   * in the current month for all organizations.
   *
   * @return csmHostEnterpriseAwsHostCountTop99pSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CSM_HOST_ENTERPRISE_AWS_HOST_COUNT_TOP99P_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCsmHostEnterpriseAwsHostCountTop99pSum() {
    return csmHostEnterpriseAwsHostCountTop99pSum;
  }

  public void setCsmHostEnterpriseAwsHostCountTop99pSum(
      Long csmHostEnterpriseAwsHostCountTop99pSum) {
    this.csmHostEnterpriseAwsHostCountTop99pSum = csmHostEnterpriseAwsHostCountTop99pSum;
    putAdditionalProperty(
        JSON_PROPERTY_CSM_HOST_ENTERPRISE_AWS_HOST_COUNT_TOP99P_SUM,
        csmHostEnterpriseAwsHostCountTop99pSum);
  }

  public UsageSummaryResponse csmHostEnterpriseAzureHostCountTop99pSum(
      Long csmHostEnterpriseAzureHostCountTop99pSum) {
    this.csmHostEnterpriseAzureHostCountTop99pSum = csmHostEnterpriseAzureHostCountTop99pSum;
    return this;
  }

  /**
   * Shows the 99th percentile of all Cloud Security Management Enterprise Azure hosts over all
   * hours in the current month for all organizations.
   *
   * @return csmHostEnterpriseAzureHostCountTop99pSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CSM_HOST_ENTERPRISE_AZURE_HOST_COUNT_TOP99P_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCsmHostEnterpriseAzureHostCountTop99pSum() {
    return csmHostEnterpriseAzureHostCountTop99pSum;
  }

  public void setCsmHostEnterpriseAzureHostCountTop99pSum(
      Long csmHostEnterpriseAzureHostCountTop99pSum) {
    this.csmHostEnterpriseAzureHostCountTop99pSum = csmHostEnterpriseAzureHostCountTop99pSum;
    putAdditionalProperty(
        JSON_PROPERTY_CSM_HOST_ENTERPRISE_AZURE_HOST_COUNT_TOP99P_SUM,
        csmHostEnterpriseAzureHostCountTop99pSum);
  }

  public UsageSummaryResponse csmHostEnterpriseComplianceHostCountTop99pSum(
      Long csmHostEnterpriseComplianceHostCountTop99pSum) {
    this.csmHostEnterpriseComplianceHostCountTop99pSum =
        csmHostEnterpriseComplianceHostCountTop99pSum;
    return this;
  }

  /**
   * Shows the 99th percentile of all Cloud Security Management Enterprise compliance hosts over all
   * hours in the current month for all organizations.
   *
   * @return csmHostEnterpriseComplianceHostCountTop99pSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CSM_HOST_ENTERPRISE_COMPLIANCE_HOST_COUNT_TOP99P_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCsmHostEnterpriseComplianceHostCountTop99pSum() {
    return csmHostEnterpriseComplianceHostCountTop99pSum;
  }

  public void setCsmHostEnterpriseComplianceHostCountTop99pSum(
      Long csmHostEnterpriseComplianceHostCountTop99pSum) {
    this.csmHostEnterpriseComplianceHostCountTop99pSum =
        csmHostEnterpriseComplianceHostCountTop99pSum;
    putAdditionalProperty(
        JSON_PROPERTY_CSM_HOST_ENTERPRISE_COMPLIANCE_HOST_COUNT_TOP99P_SUM,
        csmHostEnterpriseComplianceHostCountTop99pSum);
  }

  public UsageSummaryResponse csmHostEnterpriseCwsHostCountTop99pSum(
      Long csmHostEnterpriseCwsHostCountTop99pSum) {
    this.csmHostEnterpriseCwsHostCountTop99pSum = csmHostEnterpriseCwsHostCountTop99pSum;
    return this;
  }

  /**
   * Shows the 99th percentile of all Cloud Security Management Enterprise Cloud Workload Security
   * hosts over all hours in the current month for all organizations.
   *
   * @return csmHostEnterpriseCwsHostCountTop99pSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CSM_HOST_ENTERPRISE_CWS_HOST_COUNT_TOP99P_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCsmHostEnterpriseCwsHostCountTop99pSum() {
    return csmHostEnterpriseCwsHostCountTop99pSum;
  }

  public void setCsmHostEnterpriseCwsHostCountTop99pSum(
      Long csmHostEnterpriseCwsHostCountTop99pSum) {
    this.csmHostEnterpriseCwsHostCountTop99pSum = csmHostEnterpriseCwsHostCountTop99pSum;
    putAdditionalProperty(
        JSON_PROPERTY_CSM_HOST_ENTERPRISE_CWS_HOST_COUNT_TOP99P_SUM,
        csmHostEnterpriseCwsHostCountTop99pSum);
  }

  public UsageSummaryResponse csmHostEnterpriseGcpHostCountTop99pSum(
      Long csmHostEnterpriseGcpHostCountTop99pSum) {
    this.csmHostEnterpriseGcpHostCountTop99pSum = csmHostEnterpriseGcpHostCountTop99pSum;
    return this;
  }

  /**
   * Shows the 99th percentile of all Cloud Security Management Enterprise GCP hosts over all hours
   * in the current month for all organizations.
   *
   * @return csmHostEnterpriseGcpHostCountTop99pSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CSM_HOST_ENTERPRISE_GCP_HOST_COUNT_TOP99P_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCsmHostEnterpriseGcpHostCountTop99pSum() {
    return csmHostEnterpriseGcpHostCountTop99pSum;
  }

  public void setCsmHostEnterpriseGcpHostCountTop99pSum(
      Long csmHostEnterpriseGcpHostCountTop99pSum) {
    this.csmHostEnterpriseGcpHostCountTop99pSum = csmHostEnterpriseGcpHostCountTop99pSum;
    putAdditionalProperty(
        JSON_PROPERTY_CSM_HOST_ENTERPRISE_GCP_HOST_COUNT_TOP99P_SUM,
        csmHostEnterpriseGcpHostCountTop99pSum);
  }

  public UsageSummaryResponse csmHostEnterpriseOciHostCountTop99pSum(
      Long csmHostEnterpriseOciHostCountTop99pSum) {
    this.csmHostEnterpriseOciHostCountTop99pSum = csmHostEnterpriseOciHostCountTop99pSum;
    return this;
  }

  /**
   * Shows the 99th percentile of all Cloud Security Management Enterprise OCI hosts over all hours
   * in the current month for all organizations.
   *
   * @return csmHostEnterpriseOciHostCountTop99pSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CSM_HOST_ENTERPRISE_OCI_HOST_COUNT_TOP99P_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCsmHostEnterpriseOciHostCountTop99pSum() {
    return csmHostEnterpriseOciHostCountTop99pSum;
  }

  public void setCsmHostEnterpriseOciHostCountTop99pSum(
      Long csmHostEnterpriseOciHostCountTop99pSum) {
    this.csmHostEnterpriseOciHostCountTop99pSum = csmHostEnterpriseOciHostCountTop99pSum;
    putAdditionalProperty(
        JSON_PROPERTY_CSM_HOST_ENTERPRISE_OCI_HOST_COUNT_TOP99P_SUM,
        csmHostEnterpriseOciHostCountTop99pSum);
  }

  public UsageSummaryResponse csmHostEnterpriseTotalHostCountTop99pSum(
      Long csmHostEnterpriseTotalHostCountTop99pSum) {
    this.csmHostEnterpriseTotalHostCountTop99pSum = csmHostEnterpriseTotalHostCountTop99pSum;
    return this;
  }

  /**
   * Shows the 99th percentile of all Cloud Security Management Enterprise hosts over all hours in
   * the current month for all organizations.
   *
   * @return csmHostEnterpriseTotalHostCountTop99pSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CSM_HOST_ENTERPRISE_TOTAL_HOST_COUNT_TOP99P_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCsmHostEnterpriseTotalHostCountTop99pSum() {
    return csmHostEnterpriseTotalHostCountTop99pSum;
  }

  public void setCsmHostEnterpriseTotalHostCountTop99pSum(
      Long csmHostEnterpriseTotalHostCountTop99pSum) {
    this.csmHostEnterpriseTotalHostCountTop99pSum = csmHostEnterpriseTotalHostCountTop99pSum;
    putAdditionalProperty(
        JSON_PROPERTY_CSM_HOST_ENTERPRISE_TOTAL_HOST_COUNT_TOP99P_SUM,
        csmHostEnterpriseTotalHostCountTop99pSum);
  }

  public UsageSummaryResponse csmHostProHostsAgentlessScannersAggSum(
      Long csmHostProHostsAgentlessScannersAggSum) {
    this.csmHostProHostsAgentlessScannersAggSum = csmHostProHostsAgentlessScannersAggSum;
    return this;
  }

  /**
   * Shows the sum of all Cloud Security Management Pro Agentless scanner hosts over all hours in
   * the current month for all organizations.
   *
   * @return csmHostProHostsAgentlessScannersAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CSM_HOST_PRO_HOSTS_AGENTLESS_SCANNERS_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCsmHostProHostsAgentlessScannersAggSum() {
    return csmHostProHostsAgentlessScannersAggSum;
  }

  public void setCsmHostProHostsAgentlessScannersAggSum(
      Long csmHostProHostsAgentlessScannersAggSum) {
    this.csmHostProHostsAgentlessScannersAggSum = csmHostProHostsAgentlessScannersAggSum;
    putAdditionalProperty(
        JSON_PROPERTY_CSM_HOST_PRO_HOSTS_AGENTLESS_SCANNERS_AGG_SUM,
        csmHostProHostsAgentlessScannersAggSum);
  }

  public UsageSummaryResponse csmHostProHostsAgentlessScannersTop99pSum(
      Long csmHostProHostsAgentlessScannersTop99pSum) {
    this.csmHostProHostsAgentlessScannersTop99pSum = csmHostProHostsAgentlessScannersTop99pSum;
    return this;
  }

  /**
   * Shows the 99th percentile of all Cloud Security Management Pro Agentless scanner hosts over all
   * hours in the current month for all organizations.
   *
   * @return csmHostProHostsAgentlessScannersTop99pSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CSM_HOST_PRO_HOSTS_AGENTLESS_SCANNERS_TOP99P_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCsmHostProHostsAgentlessScannersTop99pSum() {
    return csmHostProHostsAgentlessScannersTop99pSum;
  }

  public void setCsmHostProHostsAgentlessScannersTop99pSum(
      Long csmHostProHostsAgentlessScannersTop99pSum) {
    this.csmHostProHostsAgentlessScannersTop99pSum = csmHostProHostsAgentlessScannersTop99pSum;
    putAdditionalProperty(
        JSON_PROPERTY_CSM_HOST_PRO_HOSTS_AGENTLESS_SCANNERS_TOP99P_SUM,
        csmHostProHostsAgentlessScannersTop99pSum);
  }

  public UsageSummaryResponse csmHostProOciHostCountTop99pSum(
      Long csmHostProOciHostCountTop99pSum) {
    this.csmHostProOciHostCountTop99pSum = csmHostProOciHostCountTop99pSum;
    return this;
  }

  /**
   * Shows the 99th percentile of all Cloud Security Management Pro OCI hosts over all hours in the
   * current month for all organizations.
   *
   * @return csmHostProOciHostCountTop99pSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CSM_HOST_PRO_OCI_HOST_COUNT_TOP99P_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCsmHostProOciHostCountTop99pSum() {
    return csmHostProOciHostCountTop99pSum;
  }

  public void setCsmHostProOciHostCountTop99pSum(Long csmHostProOciHostCountTop99pSum) {
    this.csmHostProOciHostCountTop99pSum = csmHostProOciHostCountTop99pSum;
    putAdditionalProperty(
        JSON_PROPERTY_CSM_HOST_PRO_OCI_HOST_COUNT_TOP99P_SUM, csmHostProOciHostCountTop99pSum);
  }

  public UsageSummaryResponse cspmAasHostTop99pSum(Long cspmAasHostTop99pSum) {
    this.cspmAasHostTop99pSum = cspmAasHostTop99pSum;
    return this;
  }

  /**
   * Shows the 99th percentile of all Cloud Security Management Pro Azure app services hosts over
   * all hours in the current month for all organizations.
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
    putAdditionalProperty(JSON_PROPERTY_CSPM_AAS_HOST_TOP99P_SUM, cspmAasHostTop99pSum);
  }

  public UsageSummaryResponse cspmAwsHostTop99pSum(Long cspmAwsHostTop99pSum) {
    this.cspmAwsHostTop99pSum = cspmAwsHostTop99pSum;
    return this;
  }

  /**
   * Shows the 99th percentile of all Cloud Security Management Pro AWS hosts over all hours in the
   * current month for all organizations.
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
    putAdditionalProperty(JSON_PROPERTY_CSPM_AWS_HOST_TOP99P_SUM, cspmAwsHostTop99pSum);
  }

  public UsageSummaryResponse cspmAzureHostTop99pSum(Long cspmAzureHostTop99pSum) {
    this.cspmAzureHostTop99pSum = cspmAzureHostTop99pSum;
    return this;
  }

  /**
   * Shows the 99th percentile of all Cloud Security Management Pro Azure hosts over all hours in
   * the current month for all organizations.
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
    putAdditionalProperty(JSON_PROPERTY_CSPM_AZURE_HOST_TOP99P_SUM, cspmAzureHostTop99pSum);
  }

  public UsageSummaryResponse cspmContainerAvgSum(Long cspmContainerAvgSum) {
    this.cspmContainerAvgSum = cspmContainerAvgSum;
    return this;
  }

  /**
   * Shows the average number of Cloud Security Management Pro containers over all hours in the
   * current month for all organizations.
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
    putAdditionalProperty(JSON_PROPERTY_CSPM_CONTAINER_AVG_SUM, cspmContainerAvgSum);
  }

  public UsageSummaryResponse cspmContainerHwmSum(Long cspmContainerHwmSum) {
    this.cspmContainerHwmSum = cspmContainerHwmSum;
    return this;
  }

  /**
   * Shows the sum of the high-water marks of Cloud Security Management Pro containers over all
   * hours in the current month for all organizations.
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
    putAdditionalProperty(JSON_PROPERTY_CSPM_CONTAINER_HWM_SUM, cspmContainerHwmSum);
  }

  public UsageSummaryResponse cspmGcpHostTop99pSum(Long cspmGcpHostTop99pSum) {
    this.cspmGcpHostTop99pSum = cspmGcpHostTop99pSum;
    return this;
  }

  /**
   * Shows the 99th percentile of all Cloud Security Management Pro GCP hosts over all hours in the
   * current month for all organizations.
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
    putAdditionalProperty(JSON_PROPERTY_CSPM_GCP_HOST_TOP99P_SUM, cspmGcpHostTop99pSum);
  }

  public UsageSummaryResponse cspmHostTop99pSum(Long cspmHostTop99pSum) {
    this.cspmHostTop99pSum = cspmHostTop99pSum;
    return this;
  }

  /**
   * Shows the 99th percentile of all Cloud Security Management Pro hosts over all hours in the
   * current month for all organizations.
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
    putAdditionalProperty(JSON_PROPERTY_CSPM_HOST_TOP99P_SUM, cspmHostTop99pSum);
  }

  public UsageSummaryResponse cspmHostsAgentlessScannersAggSum(
      Long cspmHostsAgentlessScannersAggSum) {
    this.cspmHostsAgentlessScannersAggSum = cspmHostsAgentlessScannersAggSum;
    return this;
  }

  /**
   * Shows the sum of all Cloud Security Management Pro Agentless scanner hosts over all hours in
   * the current month for all organizations.
   *
   * @return cspmHostsAgentlessScannersAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CSPM_HOSTS_AGENTLESS_SCANNERS_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCspmHostsAgentlessScannersAggSum() {
    return cspmHostsAgentlessScannersAggSum;
  }

  public void setCspmHostsAgentlessScannersAggSum(Long cspmHostsAgentlessScannersAggSum) {
    this.cspmHostsAgentlessScannersAggSum = cspmHostsAgentlessScannersAggSum;
    putAdditionalProperty(
        JSON_PROPERTY_CSPM_HOSTS_AGENTLESS_SCANNERS_AGG_SUM, cspmHostsAgentlessScannersAggSum);
  }

  public UsageSummaryResponse cspmHostsAgentlessScannersTop99pSum(
      Long cspmHostsAgentlessScannersTop99pSum) {
    this.cspmHostsAgentlessScannersTop99pSum = cspmHostsAgentlessScannersTop99pSum;
    return this;
  }

  /**
   * Shows the 99th percentile of all Cloud Security Management Pro Agentless scanner hosts over all
   * hours in the current month for all organizations.
   *
   * @return cspmHostsAgentlessScannersTop99pSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CSPM_HOSTS_AGENTLESS_SCANNERS_TOP99P_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCspmHostsAgentlessScannersTop99pSum() {
    return cspmHostsAgentlessScannersTop99pSum;
  }

  public void setCspmHostsAgentlessScannersTop99pSum(Long cspmHostsAgentlessScannersTop99pSum) {
    this.cspmHostsAgentlessScannersTop99pSum = cspmHostsAgentlessScannersTop99pSum;
    putAdditionalProperty(
        JSON_PROPERTY_CSPM_HOSTS_AGENTLESS_SCANNERS_TOP99P_SUM,
        cspmHostsAgentlessScannersTop99pSum);
  }

  public UsageSummaryResponse customHistoricalTsSum(Long customHistoricalTsSum) {
    this.customHistoricalTsSum = customHistoricalTsSum;
    return this;
  }

  /**
   * Shows the average number of distinct historical custom metrics over all hours in the current
   * month for all organizations.
   *
   * @return customHistoricalTsSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CUSTOM_HISTORICAL_TS_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCustomHistoricalTsSum() {
    return customHistoricalTsSum;
  }

  public void setCustomHistoricalTsSum(Long customHistoricalTsSum) {
    this.customHistoricalTsSum = customHistoricalTsSum;
    putAdditionalProperty(JSON_PROPERTY_CUSTOM_HISTORICAL_TS_SUM, customHistoricalTsSum);
  }

  public UsageSummaryResponse customLiveTsSum(Long customLiveTsSum) {
    this.customLiveTsSum = customLiveTsSum;
    return this;
  }

  /**
   * Shows the average number of distinct live custom metrics over all hours in the current month
   * for all organizations.
   *
   * @return customLiveTsSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CUSTOM_LIVE_TS_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCustomLiveTsSum() {
    return customLiveTsSum;
  }

  public void setCustomLiveTsSum(Long customLiveTsSum) {
    this.customLiveTsSum = customLiveTsSum;
    putAdditionalProperty(JSON_PROPERTY_CUSTOM_LIVE_TS_SUM, customLiveTsSum);
  }

  public UsageSummaryResponse customTsSum(Long customTsSum) {
    this.customTsSum = customTsSum;
    return this;
  }

  /**
   * Shows the average number of distinct custom metrics over all hours in the current month for all
   * organizations.
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
    putAdditionalProperty(JSON_PROPERTY_CUSTOM_TS_SUM, customTsSum);
  }

  public UsageSummaryResponse cwsContainerAvgSum(Long cwsContainerAvgSum) {
    this.cwsContainerAvgSum = cwsContainerAvgSum;
    return this;
  }

  /**
   * Shows the average of all distinct Cloud Workload Security containers over all hours in the
   * current month for all organizations.
   *
   * @return cwsContainerAvgSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CWS_CONTAINER_AVG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCwsContainerAvgSum() {
    return cwsContainerAvgSum;
  }

  public void setCwsContainerAvgSum(Long cwsContainerAvgSum) {
    this.cwsContainerAvgSum = cwsContainerAvgSum;
    putAdditionalProperty(JSON_PROPERTY_CWS_CONTAINER_AVG_SUM, cwsContainerAvgSum);
  }

  public UsageSummaryResponse cwsFargateTaskAvgSum(Long cwsFargateTaskAvgSum) {
    this.cwsFargateTaskAvgSum = cwsFargateTaskAvgSum;
    return this;
  }

  /**
   * Shows the average of all distinct Cloud Workload Security Fargate tasks over all hours in the
   * current month for all organizations.
   *
   * @return cwsFargateTaskAvgSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CWS_FARGATE_TASK_AVG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCwsFargateTaskAvgSum() {
    return cwsFargateTaskAvgSum;
  }

  public void setCwsFargateTaskAvgSum(Long cwsFargateTaskAvgSum) {
    this.cwsFargateTaskAvgSum = cwsFargateTaskAvgSum;
    putAdditionalProperty(JSON_PROPERTY_CWS_FARGATE_TASK_AVG_SUM, cwsFargateTaskAvgSum);
  }

  public UsageSummaryResponse cwsHostTop99pSum(Long cwsHostTop99pSum) {
    this.cwsHostTop99pSum = cwsHostTop99pSum;
    return this;
  }

  /**
   * Shows the 99th percentile of all Cloud Workload Security hosts over all hours in the current
   * month for all organizations.
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
    putAdditionalProperty(JSON_PROPERTY_CWS_HOST_TOP99P_SUM, cwsHostTop99pSum);
  }

  public UsageSummaryResponse dataJobsMonitoringHostHrAggSum(Long dataJobsMonitoringHostHrAggSum) {
    this.dataJobsMonitoringHostHrAggSum = dataJobsMonitoringHostHrAggSum;
    return this;
  }

  /**
   * Shows the sum of Data Jobs Monitoring hosts over all hours in the current months for all
   * organizations
   *
   * @return dataJobsMonitoringHostHrAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATA_JOBS_MONITORING_HOST_HR_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getDataJobsMonitoringHostHrAggSum() {
    return dataJobsMonitoringHostHrAggSum;
  }

  public void setDataJobsMonitoringHostHrAggSum(Long dataJobsMonitoringHostHrAggSum) {
    this.dataJobsMonitoringHostHrAggSum = dataJobsMonitoringHostHrAggSum;
    putAdditionalProperty(
        JSON_PROPERTY_DATA_JOBS_MONITORING_HOST_HR_AGG_SUM, dataJobsMonitoringHostHrAggSum);
  }

  public UsageSummaryResponse dataStreamMonitoringHostCountAggSum(
      Long dataStreamMonitoringHostCountAggSum) {
    this.dataStreamMonitoringHostCountAggSum = dataStreamMonitoringHostCountAggSum;
    return this;
  }

  /**
   * Shows the sum of all Data Streams Monitoring hosts over all hours in the current month for all
   * organizations.
   *
   * @return dataStreamMonitoringHostCountAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATA_STREAM_MONITORING_HOST_COUNT_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getDataStreamMonitoringHostCountAggSum() {
    return dataStreamMonitoringHostCountAggSum;
  }

  public void setDataStreamMonitoringHostCountAggSum(Long dataStreamMonitoringHostCountAggSum) {
    this.dataStreamMonitoringHostCountAggSum = dataStreamMonitoringHostCountAggSum;
    putAdditionalProperty(
        JSON_PROPERTY_DATA_STREAM_MONITORING_HOST_COUNT_AGG_SUM,
        dataStreamMonitoringHostCountAggSum);
  }

  public UsageSummaryResponse dataStreamMonitoringHostCountTop99pSum(
      Long dataStreamMonitoringHostCountTop99pSum) {
    this.dataStreamMonitoringHostCountTop99pSum = dataStreamMonitoringHostCountTop99pSum;
    return this;
  }

  /**
   * Shows the 99th percentile of all Data Streams Monitoring hosts over all hours in the current
   * month for all organizations.
   *
   * @return dataStreamMonitoringHostCountTop99pSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATA_STREAM_MONITORING_HOST_COUNT_TOP99P_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getDataStreamMonitoringHostCountTop99pSum() {
    return dataStreamMonitoringHostCountTop99pSum;
  }

  public void setDataStreamMonitoringHostCountTop99pSum(
      Long dataStreamMonitoringHostCountTop99pSum) {
    this.dataStreamMonitoringHostCountTop99pSum = dataStreamMonitoringHostCountTop99pSum;
    putAdditionalProperty(
        JSON_PROPERTY_DATA_STREAM_MONITORING_HOST_COUNT_TOP99P_SUM,
        dataStreamMonitoringHostCountTop99pSum);
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
    putAdditionalProperty(JSON_PROPERTY_DBM_HOST_TOP99P_SUM, dbmHostTop99pSum);
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
    putAdditionalProperty(JSON_PROPERTY_DBM_QUERIES_AVG_SUM, dbmQueriesAvgSum);
  }

  public UsageSummaryResponse doJobsMonitoringOrchestratorsJobHoursAggSum(
      Long doJobsMonitoringOrchestratorsJobHoursAggSum) {
    this.doJobsMonitoringOrchestratorsJobHoursAggSum = doJobsMonitoringOrchestratorsJobHoursAggSum;
    return this;
  }

  /**
   * Shows the sum of all orchestrator job hours over all hours in the current month for all
   * organizations. Values are returned in seconds. Divide by 3,600 to convert to hours.
   *
   * @return doJobsMonitoringOrchestratorsJobHoursAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DO_JOBS_MONITORING_ORCHESTRATORS_JOB_HOURS_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getDoJobsMonitoringOrchestratorsJobHoursAggSum() {
    return doJobsMonitoringOrchestratorsJobHoursAggSum;
  }

  public void setDoJobsMonitoringOrchestratorsJobHoursAggSum(
      Long doJobsMonitoringOrchestratorsJobHoursAggSum) {
    this.doJobsMonitoringOrchestratorsJobHoursAggSum = doJobsMonitoringOrchestratorsJobHoursAggSum;
    putAdditionalProperty(
        JSON_PROPERTY_DO_JOBS_MONITORING_ORCHESTRATORS_JOB_HOURS_AGG_SUM,
        doJobsMonitoringOrchestratorsJobHoursAggSum);
  }

  public UsageSummaryResponse endDate(OffsetDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * Shows the last date of usage in the current month for all organizations.
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
    putAdditionalProperty(JSON_PROPERTY_END_DATE, endDate);
  }

  public UsageSummaryResponse ephInfraHostAgentAggSum(Long ephInfraHostAgentAggSum) {
    this.ephInfraHostAgentAggSum = ephInfraHostAgentAggSum;
    return this;
  }

  /**
   * Shows the sum of all ephemeral infrastructure hosts with the Datadog Agent over all hours in
   * the current month for all organizations.
   *
   * @return ephInfraHostAgentAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EPH_INFRA_HOST_AGENT_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getEphInfraHostAgentAggSum() {
    return ephInfraHostAgentAggSum;
  }

  public void setEphInfraHostAgentAggSum(Long ephInfraHostAgentAggSum) {
    this.ephInfraHostAgentAggSum = ephInfraHostAgentAggSum;
    putAdditionalProperty(JSON_PROPERTY_EPH_INFRA_HOST_AGENT_AGG_SUM, ephInfraHostAgentAggSum);
  }

  public UsageSummaryResponse ephInfraHostAlibabaAggSum(Long ephInfraHostAlibabaAggSum) {
    this.ephInfraHostAlibabaAggSum = ephInfraHostAlibabaAggSum;
    return this;
  }

  /**
   * Shows the sum of all ephemeral infrastructure hosts on Alibaba over all hours in the current
   * month for all organizations.
   *
   * @return ephInfraHostAlibabaAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EPH_INFRA_HOST_ALIBABA_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getEphInfraHostAlibabaAggSum() {
    return ephInfraHostAlibabaAggSum;
  }

  public void setEphInfraHostAlibabaAggSum(Long ephInfraHostAlibabaAggSum) {
    this.ephInfraHostAlibabaAggSum = ephInfraHostAlibabaAggSum;
    putAdditionalProperty(JSON_PROPERTY_EPH_INFRA_HOST_ALIBABA_AGG_SUM, ephInfraHostAlibabaAggSum);
  }

  public UsageSummaryResponse ephInfraHostAwsAggSum(Long ephInfraHostAwsAggSum) {
    this.ephInfraHostAwsAggSum = ephInfraHostAwsAggSum;
    return this;
  }

  /**
   * Shows the sum of all ephemeral infrastructure hosts on AWS over all hours in the current month
   * for all organizations.
   *
   * @return ephInfraHostAwsAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EPH_INFRA_HOST_AWS_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getEphInfraHostAwsAggSum() {
    return ephInfraHostAwsAggSum;
  }

  public void setEphInfraHostAwsAggSum(Long ephInfraHostAwsAggSum) {
    this.ephInfraHostAwsAggSum = ephInfraHostAwsAggSum;
    putAdditionalProperty(JSON_PROPERTY_EPH_INFRA_HOST_AWS_AGG_SUM, ephInfraHostAwsAggSum);
  }

  public UsageSummaryResponse ephInfraHostAzureAggSum(Long ephInfraHostAzureAggSum) {
    this.ephInfraHostAzureAggSum = ephInfraHostAzureAggSum;
    return this;
  }

  /**
   * Shows the sum of all ephemeral infrastructure hosts on Azure over all hours in the current
   * month for all organizations.
   *
   * @return ephInfraHostAzureAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EPH_INFRA_HOST_AZURE_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getEphInfraHostAzureAggSum() {
    return ephInfraHostAzureAggSum;
  }

  public void setEphInfraHostAzureAggSum(Long ephInfraHostAzureAggSum) {
    this.ephInfraHostAzureAggSum = ephInfraHostAzureAggSum;
    putAdditionalProperty(JSON_PROPERTY_EPH_INFRA_HOST_AZURE_AGG_SUM, ephInfraHostAzureAggSum);
  }

  public UsageSummaryResponse ephInfraHostBasicAggSum(Long ephInfraHostBasicAggSum) {
    this.ephInfraHostBasicAggSum = ephInfraHostBasicAggSum;
    return this;
  }

  /**
   * Shows the sum of all ephemeral infrastructure hosts for Basic tier over all hours in the
   * current month for all organizations.
   *
   * @return ephInfraHostBasicAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EPH_INFRA_HOST_BASIC_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getEphInfraHostBasicAggSum() {
    return ephInfraHostBasicAggSum;
  }

  public void setEphInfraHostBasicAggSum(Long ephInfraHostBasicAggSum) {
    this.ephInfraHostBasicAggSum = ephInfraHostBasicAggSum;
    putAdditionalProperty(JSON_PROPERTY_EPH_INFRA_HOST_BASIC_AGG_SUM, ephInfraHostBasicAggSum);
  }

  public UsageSummaryResponse ephInfraHostBasicInfraBasicAgentAggSum(
      Long ephInfraHostBasicInfraBasicAgentAggSum) {
    this.ephInfraHostBasicInfraBasicAgentAggSum = ephInfraHostBasicInfraBasicAgentAggSum;
    return this;
  }

  /**
   * Shows the sum of all ephemeral infrastructure hosts for Basic tier with the Datadog Agent over
   * all hours in the current month for all organizations.
   *
   * @return ephInfraHostBasicInfraBasicAgentAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EPH_INFRA_HOST_BASIC_INFRA_BASIC_AGENT_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getEphInfraHostBasicInfraBasicAgentAggSum() {
    return ephInfraHostBasicInfraBasicAgentAggSum;
  }

  public void setEphInfraHostBasicInfraBasicAgentAggSum(
      Long ephInfraHostBasicInfraBasicAgentAggSum) {
    this.ephInfraHostBasicInfraBasicAgentAggSum = ephInfraHostBasicInfraBasicAgentAggSum;
    putAdditionalProperty(
        JSON_PROPERTY_EPH_INFRA_HOST_BASIC_INFRA_BASIC_AGENT_AGG_SUM,
        ephInfraHostBasicInfraBasicAgentAggSum);
  }

  public UsageSummaryResponse ephInfraHostBasicInfraBasicVsphereAggSum(
      Long ephInfraHostBasicInfraBasicVsphereAggSum) {
    this.ephInfraHostBasicInfraBasicVsphereAggSum = ephInfraHostBasicInfraBasicVsphereAggSum;
    return this;
  }

  /**
   * Shows the sum of all ephemeral infrastructure hosts for Basic tier on vSphere over all hours in
   * the current month for all organizations.
   *
   * @return ephInfraHostBasicInfraBasicVsphereAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EPH_INFRA_HOST_BASIC_INFRA_BASIC_VSPHERE_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getEphInfraHostBasicInfraBasicVsphereAggSum() {
    return ephInfraHostBasicInfraBasicVsphereAggSum;
  }

  public void setEphInfraHostBasicInfraBasicVsphereAggSum(
      Long ephInfraHostBasicInfraBasicVsphereAggSum) {
    this.ephInfraHostBasicInfraBasicVsphereAggSum = ephInfraHostBasicInfraBasicVsphereAggSum;
    putAdditionalProperty(
        JSON_PROPERTY_EPH_INFRA_HOST_BASIC_INFRA_BASIC_VSPHERE_AGG_SUM,
        ephInfraHostBasicInfraBasicVsphereAggSum);
  }

  public UsageSummaryResponse ephInfraHostEntAggSum(Long ephInfraHostEntAggSum) {
    this.ephInfraHostEntAggSum = ephInfraHostEntAggSum;
    return this;
  }

  /**
   * Shows the sum of all ephemeral infrastructure hosts for Enterprise over all hours in the
   * current month for all organizations.
   *
   * @return ephInfraHostEntAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EPH_INFRA_HOST_ENT_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getEphInfraHostEntAggSum() {
    return ephInfraHostEntAggSum;
  }

  public void setEphInfraHostEntAggSum(Long ephInfraHostEntAggSum) {
    this.ephInfraHostEntAggSum = ephInfraHostEntAggSum;
    putAdditionalProperty(JSON_PROPERTY_EPH_INFRA_HOST_ENT_AGG_SUM, ephInfraHostEntAggSum);
  }

  public UsageSummaryResponse ephInfraHostGcpAggSum(Long ephInfraHostGcpAggSum) {
    this.ephInfraHostGcpAggSum = ephInfraHostGcpAggSum;
    return this;
  }

  /**
   * Shows the sum of all ephemeral infrastructure hosts on GCP over all hours in the current month
   * for all organizations.
   *
   * @return ephInfraHostGcpAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EPH_INFRA_HOST_GCP_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getEphInfraHostGcpAggSum() {
    return ephInfraHostGcpAggSum;
  }

  public void setEphInfraHostGcpAggSum(Long ephInfraHostGcpAggSum) {
    this.ephInfraHostGcpAggSum = ephInfraHostGcpAggSum;
    putAdditionalProperty(JSON_PROPERTY_EPH_INFRA_HOST_GCP_AGG_SUM, ephInfraHostGcpAggSum);
  }

  public UsageSummaryResponse ephInfraHostHerokuAggSum(Long ephInfraHostHerokuAggSum) {
    this.ephInfraHostHerokuAggSum = ephInfraHostHerokuAggSum;
    return this;
  }

  /**
   * Shows the sum of all ephemeral infrastructure hosts on Heroku over all hours in the current
   * month for all organizations.
   *
   * @return ephInfraHostHerokuAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EPH_INFRA_HOST_HEROKU_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getEphInfraHostHerokuAggSum() {
    return ephInfraHostHerokuAggSum;
  }

  public void setEphInfraHostHerokuAggSum(Long ephInfraHostHerokuAggSum) {
    this.ephInfraHostHerokuAggSum = ephInfraHostHerokuAggSum;
    putAdditionalProperty(JSON_PROPERTY_EPH_INFRA_HOST_HEROKU_AGG_SUM, ephInfraHostHerokuAggSum);
  }

  public UsageSummaryResponse ephInfraHostOnlyAasAggSum(Long ephInfraHostOnlyAasAggSum) {
    this.ephInfraHostOnlyAasAggSum = ephInfraHostOnlyAasAggSum;
    return this;
  }

  /**
   * Shows the sum of all ephemeral infrastructure hosts with only Azure App Services over all hours
   * in the current month for all organizations.
   *
   * @return ephInfraHostOnlyAasAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EPH_INFRA_HOST_ONLY_AAS_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getEphInfraHostOnlyAasAggSum() {
    return ephInfraHostOnlyAasAggSum;
  }

  public void setEphInfraHostOnlyAasAggSum(Long ephInfraHostOnlyAasAggSum) {
    this.ephInfraHostOnlyAasAggSum = ephInfraHostOnlyAasAggSum;
    putAdditionalProperty(JSON_PROPERTY_EPH_INFRA_HOST_ONLY_AAS_AGG_SUM, ephInfraHostOnlyAasAggSum);
  }

  public UsageSummaryResponse ephInfraHostOnlyVsphereAggSum(Long ephInfraHostOnlyVsphereAggSum) {
    this.ephInfraHostOnlyVsphereAggSum = ephInfraHostOnlyVsphereAggSum;
    return this;
  }

  /**
   * Shows the sum of all ephemeral infrastructure hosts with only vSphere over all hours in the
   * current month for all organizations.
   *
   * @return ephInfraHostOnlyVsphereAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EPH_INFRA_HOST_ONLY_VSPHERE_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getEphInfraHostOnlyVsphereAggSum() {
    return ephInfraHostOnlyVsphereAggSum;
  }

  public void setEphInfraHostOnlyVsphereAggSum(Long ephInfraHostOnlyVsphereAggSum) {
    this.ephInfraHostOnlyVsphereAggSum = ephInfraHostOnlyVsphereAggSum;
    putAdditionalProperty(
        JSON_PROPERTY_EPH_INFRA_HOST_ONLY_VSPHERE_AGG_SUM, ephInfraHostOnlyVsphereAggSum);
  }

  public UsageSummaryResponse ephInfraHostOpentelemetryAggSum(
      Long ephInfraHostOpentelemetryAggSum) {
    this.ephInfraHostOpentelemetryAggSum = ephInfraHostOpentelemetryAggSum;
    return this;
  }

  /**
   * Shows the sum of all ephemeral hosts reported by the Datadog exporter for the OpenTelemetry
   * Collector over all hours in the current month for all organizations.
   *
   * @return ephInfraHostOpentelemetryAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EPH_INFRA_HOST_OPENTELEMETRY_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getEphInfraHostOpentelemetryAggSum() {
    return ephInfraHostOpentelemetryAggSum;
  }

  public void setEphInfraHostOpentelemetryAggSum(Long ephInfraHostOpentelemetryAggSum) {
    this.ephInfraHostOpentelemetryAggSum = ephInfraHostOpentelemetryAggSum;
    putAdditionalProperty(
        JSON_PROPERTY_EPH_INFRA_HOST_OPENTELEMETRY_AGG_SUM, ephInfraHostOpentelemetryAggSum);
  }

  public UsageSummaryResponse ephInfraHostOpentelemetryApmAggSum(
      Long ephInfraHostOpentelemetryApmAggSum) {
    this.ephInfraHostOpentelemetryApmAggSum = ephInfraHostOpentelemetryApmAggSum;
    return this;
  }

  /**
   * Shows the sum of all ephemeral APM hosts reported by the Datadog exporter for the OpenTelemetry
   * Collector over all hours in the current month for all organizations.
   *
   * @return ephInfraHostOpentelemetryApmAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EPH_INFRA_HOST_OPENTELEMETRY_APM_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getEphInfraHostOpentelemetryApmAggSum() {
    return ephInfraHostOpentelemetryApmAggSum;
  }

  public void setEphInfraHostOpentelemetryApmAggSum(Long ephInfraHostOpentelemetryApmAggSum) {
    this.ephInfraHostOpentelemetryApmAggSum = ephInfraHostOpentelemetryApmAggSum;
    putAdditionalProperty(
        JSON_PROPERTY_EPH_INFRA_HOST_OPENTELEMETRY_APM_AGG_SUM, ephInfraHostOpentelemetryApmAggSum);
  }

  public UsageSummaryResponse ephInfraHostProAggSum(Long ephInfraHostProAggSum) {
    this.ephInfraHostProAggSum = ephInfraHostProAggSum;
    return this;
  }

  /**
   * Shows the sum of all ephemeral infrastructure hosts for Pro over all hours in the current month
   * for all organizations.
   *
   * @return ephInfraHostProAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EPH_INFRA_HOST_PRO_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getEphInfraHostProAggSum() {
    return ephInfraHostProAggSum;
  }

  public void setEphInfraHostProAggSum(Long ephInfraHostProAggSum) {
    this.ephInfraHostProAggSum = ephInfraHostProAggSum;
    putAdditionalProperty(JSON_PROPERTY_EPH_INFRA_HOST_PRO_AGG_SUM, ephInfraHostProAggSum);
  }

  public UsageSummaryResponse ephInfraHostProplusAggSum(Long ephInfraHostProplusAggSum) {
    this.ephInfraHostProplusAggSum = ephInfraHostProplusAggSum;
    return this;
  }

  /**
   * Shows the sum of all ephemeral infrastructure hosts for Pro Plus over all hours in the current
   * month for all organizations.
   *
   * @return ephInfraHostProplusAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EPH_INFRA_HOST_PROPLUS_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getEphInfraHostProplusAggSum() {
    return ephInfraHostProplusAggSum;
  }

  public void setEphInfraHostProplusAggSum(Long ephInfraHostProplusAggSum) {
    this.ephInfraHostProplusAggSum = ephInfraHostProplusAggSum;
    putAdditionalProperty(JSON_PROPERTY_EPH_INFRA_HOST_PROPLUS_AGG_SUM, ephInfraHostProplusAggSum);
  }

  public UsageSummaryResponse ephInfraHostProxmoxAggSum(Long ephInfraHostProxmoxAggSum) {
    this.ephInfraHostProxmoxAggSum = ephInfraHostProxmoxAggSum;
    return this;
  }

  /**
   * Sum of all ephemeral infrastructure hosts for Proxmox over all hours in the current month for
   * all organizations.
   *
   * @return ephInfraHostProxmoxAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EPH_INFRA_HOST_PROXMOX_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getEphInfraHostProxmoxAggSum() {
    return ephInfraHostProxmoxAggSum;
  }

  public void setEphInfraHostProxmoxAggSum(Long ephInfraHostProxmoxAggSum) {
    this.ephInfraHostProxmoxAggSum = ephInfraHostProxmoxAggSum;
    putAdditionalProperty(JSON_PROPERTY_EPH_INFRA_HOST_PROXMOX_AGG_SUM, ephInfraHostProxmoxAggSum);
  }

  public UsageSummaryResponse errorTrackingApmErrorEventsAggSum(
      Long errorTrackingApmErrorEventsAggSum) {
    this.errorTrackingApmErrorEventsAggSum = errorTrackingApmErrorEventsAggSum;
    return this;
  }

  /**
   * Shows the sum of all Error Tracking APM error events over all hours in the current month for
   * all organizations.
   *
   * @return errorTrackingApmErrorEventsAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ERROR_TRACKING_APM_ERROR_EVENTS_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getErrorTrackingApmErrorEventsAggSum() {
    return errorTrackingApmErrorEventsAggSum;
  }

  public void setErrorTrackingApmErrorEventsAggSum(Long errorTrackingApmErrorEventsAggSum) {
    this.errorTrackingApmErrorEventsAggSum = errorTrackingApmErrorEventsAggSum;
    putAdditionalProperty(
        JSON_PROPERTY_ERROR_TRACKING_APM_ERROR_EVENTS_AGG_SUM, errorTrackingApmErrorEventsAggSum);
  }

  public UsageSummaryResponse errorTrackingErrorEventsAggSum(Long errorTrackingErrorEventsAggSum) {
    this.errorTrackingErrorEventsAggSum = errorTrackingErrorEventsAggSum;
    return this;
  }

  /**
   * Shows the sum of all Error Tracking error events over all hours in the current month for all
   * organizations.
   *
   * @return errorTrackingErrorEventsAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ERROR_TRACKING_ERROR_EVENTS_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getErrorTrackingErrorEventsAggSum() {
    return errorTrackingErrorEventsAggSum;
  }

  public void setErrorTrackingErrorEventsAggSum(Long errorTrackingErrorEventsAggSum) {
    this.errorTrackingErrorEventsAggSum = errorTrackingErrorEventsAggSum;
    putAdditionalProperty(
        JSON_PROPERTY_ERROR_TRACKING_ERROR_EVENTS_AGG_SUM, errorTrackingErrorEventsAggSum);
  }

  public UsageSummaryResponse errorTrackingEventsAggSum(Long errorTrackingEventsAggSum) {
    this.errorTrackingEventsAggSum = errorTrackingEventsAggSum;
    return this;
  }

  /**
   * Shows the sum of all Error Tracking events over all hours in the current months for all
   * organizations.
   *
   * @return errorTrackingEventsAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ERROR_TRACKING_EVENTS_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getErrorTrackingEventsAggSum() {
    return errorTrackingEventsAggSum;
  }

  public void setErrorTrackingEventsAggSum(Long errorTrackingEventsAggSum) {
    this.errorTrackingEventsAggSum = errorTrackingEventsAggSum;
    putAdditionalProperty(JSON_PROPERTY_ERROR_TRACKING_EVENTS_AGG_SUM, errorTrackingEventsAggSum);
  }

  public UsageSummaryResponse errorTrackingRumErrorEventsAggSum(
      Long errorTrackingRumErrorEventsAggSum) {
    this.errorTrackingRumErrorEventsAggSum = errorTrackingRumErrorEventsAggSum;
    return this;
  }

  /**
   * Shows the sum of all Error Tracking RUM error events over all hours in the current month for
   * all organizations.
   *
   * @return errorTrackingRumErrorEventsAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ERROR_TRACKING_RUM_ERROR_EVENTS_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getErrorTrackingRumErrorEventsAggSum() {
    return errorTrackingRumErrorEventsAggSum;
  }

  public void setErrorTrackingRumErrorEventsAggSum(Long errorTrackingRumErrorEventsAggSum) {
    this.errorTrackingRumErrorEventsAggSum = errorTrackingRumErrorEventsAggSum;
    putAdditionalProperty(
        JSON_PROPERTY_ERROR_TRACKING_RUM_ERROR_EVENTS_AGG_SUM, errorTrackingRumErrorEventsAggSum);
  }

  public UsageSummaryResponse eventManagementCorrelationAggSum(
      Long eventManagementCorrelationAggSum) {
    this.eventManagementCorrelationAggSum = eventManagementCorrelationAggSum;
    return this;
  }

  /**
   * Shows the sum of all Event Management correlations over all hours in the current month for all
   * organizations.
   *
   * @return eventManagementCorrelationAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EVENT_MANAGEMENT_CORRELATION_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getEventManagementCorrelationAggSum() {
    return eventManagementCorrelationAggSum;
  }

  public void setEventManagementCorrelationAggSum(Long eventManagementCorrelationAggSum) {
    this.eventManagementCorrelationAggSum = eventManagementCorrelationAggSum;
    putAdditionalProperty(
        JSON_PROPERTY_EVENT_MANAGEMENT_CORRELATION_AGG_SUM, eventManagementCorrelationAggSum);
  }

  public UsageSummaryResponse eventManagementCorrelationCorrelatedEventsAggSum(
      Long eventManagementCorrelationCorrelatedEventsAggSum) {
    this.eventManagementCorrelationCorrelatedEventsAggSum =
        eventManagementCorrelationCorrelatedEventsAggSum;
    return this;
  }

  /**
   * Shows the sum of all Event Management correlated events over all hours in the current month for
   * all organizations.
   *
   * @return eventManagementCorrelationCorrelatedEventsAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EVENT_MANAGEMENT_CORRELATION_CORRELATED_EVENTS_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getEventManagementCorrelationCorrelatedEventsAggSum() {
    return eventManagementCorrelationCorrelatedEventsAggSum;
  }

  public void setEventManagementCorrelationCorrelatedEventsAggSum(
      Long eventManagementCorrelationCorrelatedEventsAggSum) {
    this.eventManagementCorrelationCorrelatedEventsAggSum =
        eventManagementCorrelationCorrelatedEventsAggSum;
    putAdditionalProperty(
        JSON_PROPERTY_EVENT_MANAGEMENT_CORRELATION_CORRELATED_EVENTS_AGG_SUM,
        eventManagementCorrelationCorrelatedEventsAggSum);
  }

  public UsageSummaryResponse eventManagementCorrelationCorrelatedRelatedEventsAggSum(
      Long eventManagementCorrelationCorrelatedRelatedEventsAggSum) {
    this.eventManagementCorrelationCorrelatedRelatedEventsAggSum =
        eventManagementCorrelationCorrelatedRelatedEventsAggSum;
    return this;
  }

  /**
   * Shows the sum of all Event Management correlated related events over all hours in the current
   * month for all organizations.
   *
   * @return eventManagementCorrelationCorrelatedRelatedEventsAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EVENT_MANAGEMENT_CORRELATION_CORRELATED_RELATED_EVENTS_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getEventManagementCorrelationCorrelatedRelatedEventsAggSum() {
    return eventManagementCorrelationCorrelatedRelatedEventsAggSum;
  }

  public void setEventManagementCorrelationCorrelatedRelatedEventsAggSum(
      Long eventManagementCorrelationCorrelatedRelatedEventsAggSum) {
    this.eventManagementCorrelationCorrelatedRelatedEventsAggSum =
        eventManagementCorrelationCorrelatedRelatedEventsAggSum;
    putAdditionalProperty(
        JSON_PROPERTY_EVENT_MANAGEMENT_CORRELATION_CORRELATED_RELATED_EVENTS_AGG_SUM,
        eventManagementCorrelationCorrelatedRelatedEventsAggSum);
  }

  public UsageSummaryResponse fargateContainerProfilerProfilingFargateAvgSum(
      Long fargateContainerProfilerProfilingFargateAvgSum) {
    this.fargateContainerProfilerProfilingFargateAvgSum =
        fargateContainerProfilerProfilingFargateAvgSum;
    return this;
  }

  /**
   * The average number of Profiling Fargate tasks over all hours in the current month for all
   * organizations.
   *
   * @return fargateContainerProfilerProfilingFargateAvgSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FARGATE_CONTAINER_PROFILER_PROFILING_FARGATE_AVG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getFargateContainerProfilerProfilingFargateAvgSum() {
    return fargateContainerProfilerProfilingFargateAvgSum;
  }

  public void setFargateContainerProfilerProfilingFargateAvgSum(
      Long fargateContainerProfilerProfilingFargateAvgSum) {
    this.fargateContainerProfilerProfilingFargateAvgSum =
        fargateContainerProfilerProfilingFargateAvgSum;
    putAdditionalProperty(
        JSON_PROPERTY_FARGATE_CONTAINER_PROFILER_PROFILING_FARGATE_AVG_SUM,
        fargateContainerProfilerProfilingFargateAvgSum);
  }

  public UsageSummaryResponse fargateContainerProfilerProfilingFargateEksAvgSum(
      Long fargateContainerProfilerProfilingFargateEksAvgSum) {
    this.fargateContainerProfilerProfilingFargateEksAvgSum =
        fargateContainerProfilerProfilingFargateEksAvgSum;
    return this;
  }

  /**
   * The average number of Profiling Fargate Elastic Kubernetes Service tasks over all hours in the
   * current month for all organizations.
   *
   * @return fargateContainerProfilerProfilingFargateEksAvgSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FARGATE_CONTAINER_PROFILER_PROFILING_FARGATE_EKS_AVG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getFargateContainerProfilerProfilingFargateEksAvgSum() {
    return fargateContainerProfilerProfilingFargateEksAvgSum;
  }

  public void setFargateContainerProfilerProfilingFargateEksAvgSum(
      Long fargateContainerProfilerProfilingFargateEksAvgSum) {
    this.fargateContainerProfilerProfilingFargateEksAvgSum =
        fargateContainerProfilerProfilingFargateEksAvgSum;
    putAdditionalProperty(
        JSON_PROPERTY_FARGATE_CONTAINER_PROFILER_PROFILING_FARGATE_EKS_AVG_SUM,
        fargateContainerProfilerProfilingFargateEksAvgSum);
  }

  public UsageSummaryResponse fargateTasksCountAvgSum(Long fargateTasksCountAvgSum) {
    this.fargateTasksCountAvgSum = fargateTasksCountAvgSum;
    return this;
  }

  /**
   * Shows the average of all Fargate tasks over all hours in the current month for all
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
    putAdditionalProperty(JSON_PROPERTY_FARGATE_TASKS_COUNT_AVG_SUM, fargateTasksCountAvgSum);
  }

  public UsageSummaryResponse fargateTasksCountHwmSum(Long fargateTasksCountHwmSum) {
    this.fargateTasksCountHwmSum = fargateTasksCountHwmSum;
    return this;
  }

  /**
   * Shows the sum of the high-water marks of all Fargate tasks over all hours in the current month
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
    putAdditionalProperty(JSON_PROPERTY_FARGATE_TASKS_COUNT_HWM_SUM, fargateTasksCountHwmSum);
  }

  public UsageSummaryResponse featureFlagsConfigRequestsAggSum(
      Long featureFlagsConfigRequestsAggSum) {
    this.featureFlagsConfigRequestsAggSum = featureFlagsConfigRequestsAggSum;
    return this;
  }

  /**
   * Shows the sum of all Feature Flags Client-Side SDK config requests over all hours in the
   * current month for all organizations.
   *
   * @return featureFlagsConfigRequestsAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FEATURE_FLAGS_CONFIG_REQUESTS_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getFeatureFlagsConfigRequestsAggSum() {
    return featureFlagsConfigRequestsAggSum;
  }

  public void setFeatureFlagsConfigRequestsAggSum(Long featureFlagsConfigRequestsAggSum) {
    this.featureFlagsConfigRequestsAggSum = featureFlagsConfigRequestsAggSum;
    putAdditionalProperty(
        JSON_PROPERTY_FEATURE_FLAGS_CONFIG_REQUESTS_AGG_SUM, featureFlagsConfigRequestsAggSum);
  }

  public UsageSummaryResponse flexLogsComputeLargeAvgSum(Long flexLogsComputeLargeAvgSum) {
    this.flexLogsComputeLargeAvgSum = flexLogsComputeLargeAvgSum;
    return this;
  }

  /**
   * Shows the average number of Flex Logs Compute Large Instances over all hours in the current
   * months for all organizations.
   *
   * @return flexLogsComputeLargeAvgSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FLEX_LOGS_COMPUTE_LARGE_AVG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getFlexLogsComputeLargeAvgSum() {
    return flexLogsComputeLargeAvgSum;
  }

  public void setFlexLogsComputeLargeAvgSum(Long flexLogsComputeLargeAvgSum) {
    this.flexLogsComputeLargeAvgSum = flexLogsComputeLargeAvgSum;
    putAdditionalProperty(
        JSON_PROPERTY_FLEX_LOGS_COMPUTE_LARGE_AVG_SUM, flexLogsComputeLargeAvgSum);
  }

  public UsageSummaryResponse flexLogsComputeMediumAvgSum(Long flexLogsComputeMediumAvgSum) {
    this.flexLogsComputeMediumAvgSum = flexLogsComputeMediumAvgSum;
    return this;
  }

  /**
   * Shows the average number of Flex Logs Compute Medium Instances over all hours in the current
   * months for all organizations.
   *
   * @return flexLogsComputeMediumAvgSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FLEX_LOGS_COMPUTE_MEDIUM_AVG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getFlexLogsComputeMediumAvgSum() {
    return flexLogsComputeMediumAvgSum;
  }

  public void setFlexLogsComputeMediumAvgSum(Long flexLogsComputeMediumAvgSum) {
    this.flexLogsComputeMediumAvgSum = flexLogsComputeMediumAvgSum;
    putAdditionalProperty(
        JSON_PROPERTY_FLEX_LOGS_COMPUTE_MEDIUM_AVG_SUM, flexLogsComputeMediumAvgSum);
  }

  public UsageSummaryResponse flexLogsComputeSmallAvgSum(Long flexLogsComputeSmallAvgSum) {
    this.flexLogsComputeSmallAvgSum = flexLogsComputeSmallAvgSum;
    return this;
  }

  /**
   * Shows the average number of Flex Logs Compute Small Instances over all hours in the current
   * months for all organizations.
   *
   * @return flexLogsComputeSmallAvgSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FLEX_LOGS_COMPUTE_SMALL_AVG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getFlexLogsComputeSmallAvgSum() {
    return flexLogsComputeSmallAvgSum;
  }

  public void setFlexLogsComputeSmallAvgSum(Long flexLogsComputeSmallAvgSum) {
    this.flexLogsComputeSmallAvgSum = flexLogsComputeSmallAvgSum;
    putAdditionalProperty(
        JSON_PROPERTY_FLEX_LOGS_COMPUTE_SMALL_AVG_SUM, flexLogsComputeSmallAvgSum);
  }

  public UsageSummaryResponse flexLogsComputeXlargeAvgSum(Long flexLogsComputeXlargeAvgSum) {
    this.flexLogsComputeXlargeAvgSum = flexLogsComputeXlargeAvgSum;
    return this;
  }

  /**
   * Shows the average number of Flex Logs Compute Extra Large Instances over all hours in the
   * current months for all organizations.
   *
   * @return flexLogsComputeXlargeAvgSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FLEX_LOGS_COMPUTE_XLARGE_AVG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getFlexLogsComputeXlargeAvgSum() {
    return flexLogsComputeXlargeAvgSum;
  }

  public void setFlexLogsComputeXlargeAvgSum(Long flexLogsComputeXlargeAvgSum) {
    this.flexLogsComputeXlargeAvgSum = flexLogsComputeXlargeAvgSum;
    putAdditionalProperty(
        JSON_PROPERTY_FLEX_LOGS_COMPUTE_XLARGE_AVG_SUM, flexLogsComputeXlargeAvgSum);
  }

  public UsageSummaryResponse flexLogsComputeXsmallAvgSum(Long flexLogsComputeXsmallAvgSum) {
    this.flexLogsComputeXsmallAvgSum = flexLogsComputeXsmallAvgSum;
    return this;
  }

  /**
   * Shows the average number of Flex Logs Compute Extra Small Instances over all hours in the
   * current months for all organizations.
   *
   * @return flexLogsComputeXsmallAvgSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FLEX_LOGS_COMPUTE_XSMALL_AVG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getFlexLogsComputeXsmallAvgSum() {
    return flexLogsComputeXsmallAvgSum;
  }

  public void setFlexLogsComputeXsmallAvgSum(Long flexLogsComputeXsmallAvgSum) {
    this.flexLogsComputeXsmallAvgSum = flexLogsComputeXsmallAvgSum;
    putAdditionalProperty(
        JSON_PROPERTY_FLEX_LOGS_COMPUTE_XSMALL_AVG_SUM, flexLogsComputeXsmallAvgSum);
  }

  public UsageSummaryResponse flexLogsStarterAvgSum(Long flexLogsStarterAvgSum) {
    this.flexLogsStarterAvgSum = flexLogsStarterAvgSum;
    return this;
  }

  /**
   * Shows the average number of Flex Logs Starter Instances over all hours in the current months
   * for all organizations.
   *
   * @return flexLogsStarterAvgSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FLEX_LOGS_STARTER_AVG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getFlexLogsStarterAvgSum() {
    return flexLogsStarterAvgSum;
  }

  public void setFlexLogsStarterAvgSum(Long flexLogsStarterAvgSum) {
    this.flexLogsStarterAvgSum = flexLogsStarterAvgSum;
    putAdditionalProperty(JSON_PROPERTY_FLEX_LOGS_STARTER_AVG_SUM, flexLogsStarterAvgSum);
  }

  public UsageSummaryResponse flexLogsStarterStorageIndexAvgSum(
      Long flexLogsStarterStorageIndexAvgSum) {
    this.flexLogsStarterStorageIndexAvgSum = flexLogsStarterStorageIndexAvgSum;
    return this;
  }

  /**
   * Shows the average number of Flex Logs Starter Storage Index Instances over all hours in the
   * current months for all organizations.
   *
   * @return flexLogsStarterStorageIndexAvgSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FLEX_LOGS_STARTER_STORAGE_INDEX_AVG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getFlexLogsStarterStorageIndexAvgSum() {
    return flexLogsStarterStorageIndexAvgSum;
  }

  public void setFlexLogsStarterStorageIndexAvgSum(Long flexLogsStarterStorageIndexAvgSum) {
    this.flexLogsStarterStorageIndexAvgSum = flexLogsStarterStorageIndexAvgSum;
    putAdditionalProperty(
        JSON_PROPERTY_FLEX_LOGS_STARTER_STORAGE_INDEX_AVG_SUM, flexLogsStarterStorageIndexAvgSum);
  }

  public UsageSummaryResponse flexLogsStarterStorageRetentionAdjustmentAvgSum(
      Long flexLogsStarterStorageRetentionAdjustmentAvgSum) {
    this.flexLogsStarterStorageRetentionAdjustmentAvgSum =
        flexLogsStarterStorageRetentionAdjustmentAvgSum;
    return this;
  }

  /**
   * Shows the average number of Flex Logs Starter Storage Retention Adjustment Instances over all
   * hours in the current months for all organizations.
   *
   * @return flexLogsStarterStorageRetentionAdjustmentAvgSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FLEX_LOGS_STARTER_STORAGE_RETENTION_ADJUSTMENT_AVG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getFlexLogsStarterStorageRetentionAdjustmentAvgSum() {
    return flexLogsStarterStorageRetentionAdjustmentAvgSum;
  }

  public void setFlexLogsStarterStorageRetentionAdjustmentAvgSum(
      Long flexLogsStarterStorageRetentionAdjustmentAvgSum) {
    this.flexLogsStarterStorageRetentionAdjustmentAvgSum =
        flexLogsStarterStorageRetentionAdjustmentAvgSum;
    putAdditionalProperty(
        JSON_PROPERTY_FLEX_LOGS_STARTER_STORAGE_RETENTION_ADJUSTMENT_AVG_SUM,
        flexLogsStarterStorageRetentionAdjustmentAvgSum);
  }

  public UsageSummaryResponse flexStoredLogsAvgSum(Long flexStoredLogsAvgSum) {
    this.flexStoredLogsAvgSum = flexStoredLogsAvgSum;
    return this;
  }

  /**
   * Shows the average of all Flex Stored Logs over all hours in the current months for all
   * organizations.
   *
   * @return flexStoredLogsAvgSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FLEX_STORED_LOGS_AVG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getFlexStoredLogsAvgSum() {
    return flexStoredLogsAvgSum;
  }

  public void setFlexStoredLogsAvgSum(Long flexStoredLogsAvgSum) {
    this.flexStoredLogsAvgSum = flexStoredLogsAvgSum;
    putAdditionalProperty(JSON_PROPERTY_FLEX_STORED_LOGS_AVG_SUM, flexStoredLogsAvgSum);
  }

  public UsageSummaryResponse forwardingEventsBytesAggSum(Long forwardingEventsBytesAggSum) {
    this.forwardingEventsBytesAggSum = forwardingEventsBytesAggSum;
    return this;
  }

  /**
   * Shows the sum of all logs forwarding bytes over all hours in the current month for all
   * organizations (data available as of April 1, 2023)
   *
   * @return forwardingEventsBytesAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FORWARDING_EVENTS_BYTES_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getForwardingEventsBytesAggSum() {
    return forwardingEventsBytesAggSum;
  }

  public void setForwardingEventsBytesAggSum(Long forwardingEventsBytesAggSum) {
    this.forwardingEventsBytesAggSum = forwardingEventsBytesAggSum;
    putAdditionalProperty(
        JSON_PROPERTY_FORWARDING_EVENTS_BYTES_AGG_SUM, forwardingEventsBytesAggSum);
  }

  public UsageSummaryResponse gcpHostTop99pSum(Long gcpHostTop99pSum) {
    this.gcpHostTop99pSum = gcpHostTop99pSum;
    return this;
  }

  /**
   * Shows the 99th percentile of all GCP hosts over all hours in the current month for all
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
    putAdditionalProperty(JSON_PROPERTY_GCP_HOST_TOP99P_SUM, gcpHostTop99pSum);
  }

  public UsageSummaryResponse herokuHostTop99pSum(Long herokuHostTop99pSum) {
    this.herokuHostTop99pSum = herokuHostTop99pSum;
    return this;
  }

  /**
   * Shows the 99th percentile of all Heroku dynos over all hours in the current month for all
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
    putAdditionalProperty(JSON_PROPERTY_HEROKU_HOST_TOP99P_SUM, herokuHostTop99pSum);
  }

  public UsageSummaryResponse incidentManagementMonthlyActiveUsersHwmSum(
      Long incidentManagementMonthlyActiveUsersHwmSum) {
    this.incidentManagementMonthlyActiveUsersHwmSum = incidentManagementMonthlyActiveUsersHwmSum;
    return this;
  }

  /**
   * Shows sum of the high-water marks of incident management monthly active users in the current
   * month for all organizations.
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
    putAdditionalProperty(
        JSON_PROPERTY_INCIDENT_MANAGEMENT_MONTHLY_ACTIVE_USERS_HWM_SUM,
        incidentManagementMonthlyActiveUsersHwmSum);
  }

  public UsageSummaryResponse incidentManagementSeatsHwmSum(Long incidentManagementSeatsHwmSum) {
    this.incidentManagementSeatsHwmSum = incidentManagementSeatsHwmSum;
    return this;
  }

  /**
   * Shows the sum of the high-water marks of Incident Management seats over all hours in the
   * current month for all organizations.
   *
   * @return incidentManagementSeatsHwmSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INCIDENT_MANAGEMENT_SEATS_HWM_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getIncidentManagementSeatsHwmSum() {
    return incidentManagementSeatsHwmSum;
  }

  public void setIncidentManagementSeatsHwmSum(Long incidentManagementSeatsHwmSum) {
    this.incidentManagementSeatsHwmSum = incidentManagementSeatsHwmSum;
    putAdditionalProperty(
        JSON_PROPERTY_INCIDENT_MANAGEMENT_SEATS_HWM_SUM, incidentManagementSeatsHwmSum);
  }

  public UsageSummaryResponse indexedEventsCountAggSum(Long indexedEventsCountAggSum) {
    this.indexedEventsCountAggSum = indexedEventsCountAggSum;
    return this;
  }

  /**
   * Shows the sum of all log events indexed over all hours in the current month for all
   * organizations (To be deprecated on October 1st, 2024).
   *
   * @return indexedEventsCountAggSum
   * @deprecated
   */
  @Deprecated
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INDEXED_EVENTS_COUNT_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getIndexedEventsCountAggSum() {
    return indexedEventsCountAggSum;
  }

  @Deprecated
  public void setIndexedEventsCountAggSum(Long indexedEventsCountAggSum) {
    this.indexedEventsCountAggSum = indexedEventsCountAggSum;
    putAdditionalProperty(JSON_PROPERTY_INDEXED_EVENTS_COUNT_AGG_SUM, indexedEventsCountAggSum);
  }

  public UsageSummaryResponse indexedPointsAggSum(Long indexedPointsAggSum) {
    this.indexedPointsAggSum = indexedPointsAggSum;
    return this;
  }

  /**
   * Shows the sum of all indexed custom metrics points over all hours in the current month for all
   * organizations.
   *
   * @return indexedPointsAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INDEXED_POINTS_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getIndexedPointsAggSum() {
    return indexedPointsAggSum;
  }

  public void setIndexedPointsAggSum(Long indexedPointsAggSum) {
    this.indexedPointsAggSum = indexedPointsAggSum;
    putAdditionalProperty(JSON_PROPERTY_INDEXED_POINTS_AGG_SUM, indexedPointsAggSum);
  }

  public UsageSummaryResponse infraCpuAggSum(Long infraCpuAggSum) {
    this.infraCpuAggSum = infraCpuAggSum;
    return this;
  }

  /**
   * Shows the sum of all Infrastructure vCPU cores over all hours in the current month for all
   * organizations. Values are returned in millicores. Divide by 1,000 to convert to cores.
   *
   * @return infraCpuAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INFRA_CPU_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getInfraCpuAggSum() {
    return infraCpuAggSum;
  }

  public void setInfraCpuAggSum(Long infraCpuAggSum) {
    this.infraCpuAggSum = infraCpuAggSum;
    putAdditionalProperty(JSON_PROPERTY_INFRA_CPU_AGG_SUM, infraCpuAggSum);
  }

  public UsageSummaryResponse infraCpuAvgSum(Long infraCpuAvgSum) {
    this.infraCpuAvgSum = infraCpuAvgSum;
    return this;
  }

  /**
   * Shows the average of all Infrastructure vCPU cores over all hours in the current month for all
   * organizations. Values are returned in millicores. Divide by 1,000 to convert to cores.
   *
   * @return infraCpuAvgSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INFRA_CPU_AVG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getInfraCpuAvgSum() {
    return infraCpuAvgSum;
  }

  public void setInfraCpuAvgSum(Long infraCpuAvgSum) {
    this.infraCpuAvgSum = infraCpuAvgSum;
    putAdditionalProperty(JSON_PROPERTY_INFRA_CPU_AVG_SUM, infraCpuAvgSum);
  }

  public UsageSummaryResponse infraCpuDefaultInfraHostVcpuAgentAggSum(
      Long infraCpuDefaultInfraHostVcpuAgentAggSum) {
    this.infraCpuDefaultInfraHostVcpuAgentAggSum = infraCpuDefaultInfraHostVcpuAgentAggSum;
    return this;
  }

  /**
   * Shows the sum of all default Infrastructure host vCPU cores reported by the Datadog Agent over
   * all hours in the current month for all organizations. Values are returned in millicores. Divide
   * by 1,000 to convert to cores.
   *
   * @return infraCpuDefaultInfraHostVcpuAgentAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INFRA_CPU_DEFAULT_INFRA_HOST_VCPU_AGENT_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getInfraCpuDefaultInfraHostVcpuAgentAggSum() {
    return infraCpuDefaultInfraHostVcpuAgentAggSum;
  }

  public void setInfraCpuDefaultInfraHostVcpuAgentAggSum(
      Long infraCpuDefaultInfraHostVcpuAgentAggSum) {
    this.infraCpuDefaultInfraHostVcpuAgentAggSum = infraCpuDefaultInfraHostVcpuAgentAggSum;
    putAdditionalProperty(
        JSON_PROPERTY_INFRA_CPU_DEFAULT_INFRA_HOST_VCPU_AGENT_AGG_SUM,
        infraCpuDefaultInfraHostVcpuAgentAggSum);
  }

  public UsageSummaryResponse infraCpuDefaultInfraHostVcpuAgentAvgSum(
      Long infraCpuDefaultInfraHostVcpuAgentAvgSum) {
    this.infraCpuDefaultInfraHostVcpuAgentAvgSum = infraCpuDefaultInfraHostVcpuAgentAvgSum;
    return this;
  }

  /**
   * Shows the average of all default Infrastructure host vCPU cores reported by the Datadog Agent
   * over all hours in the current month for all organizations. Values are returned in millicores.
   * Divide by 1,000 to convert to cores.
   *
   * @return infraCpuDefaultInfraHostVcpuAgentAvgSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INFRA_CPU_DEFAULT_INFRA_HOST_VCPU_AGENT_AVG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getInfraCpuDefaultInfraHostVcpuAgentAvgSum() {
    return infraCpuDefaultInfraHostVcpuAgentAvgSum;
  }

  public void setInfraCpuDefaultInfraHostVcpuAgentAvgSum(
      Long infraCpuDefaultInfraHostVcpuAgentAvgSum) {
    this.infraCpuDefaultInfraHostVcpuAgentAvgSum = infraCpuDefaultInfraHostVcpuAgentAvgSum;
    putAdditionalProperty(
        JSON_PROPERTY_INFRA_CPU_DEFAULT_INFRA_HOST_VCPU_AGENT_AVG_SUM,
        infraCpuDefaultInfraHostVcpuAgentAvgSum);
  }

  public UsageSummaryResponse infraCpuDefaultInfraHostVcpuAgentBasicAggSum(
      Long infraCpuDefaultInfraHostVcpuAgentBasicAggSum) {
    this.infraCpuDefaultInfraHostVcpuAgentBasicAggSum =
        infraCpuDefaultInfraHostVcpuAgentBasicAggSum;
    return this;
  }

  /**
   * Shows the sum of all default basic Infrastructure host vCPU cores reported by the Datadog Agent
   * over all hours in the current month for all organizations. Values are returned in millicores.
   * Divide by 1,000 to convert to cores.
   *
   * @return infraCpuDefaultInfraHostVcpuAgentBasicAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INFRA_CPU_DEFAULT_INFRA_HOST_VCPU_AGENT_BASIC_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getInfraCpuDefaultInfraHostVcpuAgentBasicAggSum() {
    return infraCpuDefaultInfraHostVcpuAgentBasicAggSum;
  }

  public void setInfraCpuDefaultInfraHostVcpuAgentBasicAggSum(
      Long infraCpuDefaultInfraHostVcpuAgentBasicAggSum) {
    this.infraCpuDefaultInfraHostVcpuAgentBasicAggSum =
        infraCpuDefaultInfraHostVcpuAgentBasicAggSum;
    putAdditionalProperty(
        JSON_PROPERTY_INFRA_CPU_DEFAULT_INFRA_HOST_VCPU_AGENT_BASIC_AGG_SUM,
        infraCpuDefaultInfraHostVcpuAgentBasicAggSum);
  }

  public UsageSummaryResponse infraCpuDefaultInfraHostVcpuAgentBasicAvgSum(
      Long infraCpuDefaultInfraHostVcpuAgentBasicAvgSum) {
    this.infraCpuDefaultInfraHostVcpuAgentBasicAvgSum =
        infraCpuDefaultInfraHostVcpuAgentBasicAvgSum;
    return this;
  }

  /**
   * Shows the average of all default basic Infrastructure host vCPU cores reported by the Datadog
   * Agent over all hours in the current month for all organizations. Values are returned in
   * millicores. Divide by 1,000 to convert to cores.
   *
   * @return infraCpuDefaultInfraHostVcpuAgentBasicAvgSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INFRA_CPU_DEFAULT_INFRA_HOST_VCPU_AGENT_BASIC_AVG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getInfraCpuDefaultInfraHostVcpuAgentBasicAvgSum() {
    return infraCpuDefaultInfraHostVcpuAgentBasicAvgSum;
  }

  public void setInfraCpuDefaultInfraHostVcpuAgentBasicAvgSum(
      Long infraCpuDefaultInfraHostVcpuAgentBasicAvgSum) {
    this.infraCpuDefaultInfraHostVcpuAgentBasicAvgSum =
        infraCpuDefaultInfraHostVcpuAgentBasicAvgSum;
    putAdditionalProperty(
        JSON_PROPERTY_INFRA_CPU_DEFAULT_INFRA_HOST_VCPU_AGENT_BASIC_AVG_SUM,
        infraCpuDefaultInfraHostVcpuAgentBasicAvgSum);
  }

  public UsageSummaryResponse infraCpuDefaultInfraHostVcpuAwsAggSum(
      Long infraCpuDefaultInfraHostVcpuAwsAggSum) {
    this.infraCpuDefaultInfraHostVcpuAwsAggSum = infraCpuDefaultInfraHostVcpuAwsAggSum;
    return this;
  }

  /**
   * Shows the sum of all default Infrastructure host vCPU cores on AWS over all hours in the
   * current month for all organizations. Values are returned in millicores. Divide by 1,000 to
   * convert to cores.
   *
   * @return infraCpuDefaultInfraHostVcpuAwsAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INFRA_CPU_DEFAULT_INFRA_HOST_VCPU_AWS_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getInfraCpuDefaultInfraHostVcpuAwsAggSum() {
    return infraCpuDefaultInfraHostVcpuAwsAggSum;
  }

  public void setInfraCpuDefaultInfraHostVcpuAwsAggSum(Long infraCpuDefaultInfraHostVcpuAwsAggSum) {
    this.infraCpuDefaultInfraHostVcpuAwsAggSum = infraCpuDefaultInfraHostVcpuAwsAggSum;
    putAdditionalProperty(
        JSON_PROPERTY_INFRA_CPU_DEFAULT_INFRA_HOST_VCPU_AWS_AGG_SUM,
        infraCpuDefaultInfraHostVcpuAwsAggSum);
  }

  public UsageSummaryResponse infraCpuDefaultInfraHostVcpuAwsAvgSum(
      Long infraCpuDefaultInfraHostVcpuAwsAvgSum) {
    this.infraCpuDefaultInfraHostVcpuAwsAvgSum = infraCpuDefaultInfraHostVcpuAwsAvgSum;
    return this;
  }

  /**
   * Shows the average of all default Infrastructure host vCPU cores on AWS over all hours in the
   * current month for all organizations. Values are returned in millicores. Divide by 1,000 to
   * convert to cores.
   *
   * @return infraCpuDefaultInfraHostVcpuAwsAvgSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INFRA_CPU_DEFAULT_INFRA_HOST_VCPU_AWS_AVG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getInfraCpuDefaultInfraHostVcpuAwsAvgSum() {
    return infraCpuDefaultInfraHostVcpuAwsAvgSum;
  }

  public void setInfraCpuDefaultInfraHostVcpuAwsAvgSum(Long infraCpuDefaultInfraHostVcpuAwsAvgSum) {
    this.infraCpuDefaultInfraHostVcpuAwsAvgSum = infraCpuDefaultInfraHostVcpuAwsAvgSum;
    putAdditionalProperty(
        JSON_PROPERTY_INFRA_CPU_DEFAULT_INFRA_HOST_VCPU_AWS_AVG_SUM,
        infraCpuDefaultInfraHostVcpuAwsAvgSum);
  }

  public UsageSummaryResponse infraCpuDefaultInfraHostVcpuAzureAggSum(
      Long infraCpuDefaultInfraHostVcpuAzureAggSum) {
    this.infraCpuDefaultInfraHostVcpuAzureAggSum = infraCpuDefaultInfraHostVcpuAzureAggSum;
    return this;
  }

  /**
   * Shows the sum of all default Infrastructure host vCPU cores on Azure over all hours in the
   * current month for all organizations. Values are returned in millicores. Divide by 1,000 to
   * convert to cores.
   *
   * @return infraCpuDefaultInfraHostVcpuAzureAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INFRA_CPU_DEFAULT_INFRA_HOST_VCPU_AZURE_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getInfraCpuDefaultInfraHostVcpuAzureAggSum() {
    return infraCpuDefaultInfraHostVcpuAzureAggSum;
  }

  public void setInfraCpuDefaultInfraHostVcpuAzureAggSum(
      Long infraCpuDefaultInfraHostVcpuAzureAggSum) {
    this.infraCpuDefaultInfraHostVcpuAzureAggSum = infraCpuDefaultInfraHostVcpuAzureAggSum;
    putAdditionalProperty(
        JSON_PROPERTY_INFRA_CPU_DEFAULT_INFRA_HOST_VCPU_AZURE_AGG_SUM,
        infraCpuDefaultInfraHostVcpuAzureAggSum);
  }

  public UsageSummaryResponse infraCpuDefaultInfraHostVcpuAzureAvgSum(
      Long infraCpuDefaultInfraHostVcpuAzureAvgSum) {
    this.infraCpuDefaultInfraHostVcpuAzureAvgSum = infraCpuDefaultInfraHostVcpuAzureAvgSum;
    return this;
  }

  /**
   * Shows the average of all default Infrastructure host vCPU cores on Azure over all hours in the
   * current month for all organizations. Values are returned in millicores. Divide by 1,000 to
   * convert to cores.
   *
   * @return infraCpuDefaultInfraHostVcpuAzureAvgSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INFRA_CPU_DEFAULT_INFRA_HOST_VCPU_AZURE_AVG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getInfraCpuDefaultInfraHostVcpuAzureAvgSum() {
    return infraCpuDefaultInfraHostVcpuAzureAvgSum;
  }

  public void setInfraCpuDefaultInfraHostVcpuAzureAvgSum(
      Long infraCpuDefaultInfraHostVcpuAzureAvgSum) {
    this.infraCpuDefaultInfraHostVcpuAzureAvgSum = infraCpuDefaultInfraHostVcpuAzureAvgSum;
    putAdditionalProperty(
        JSON_PROPERTY_INFRA_CPU_DEFAULT_INFRA_HOST_VCPU_AZURE_AVG_SUM,
        infraCpuDefaultInfraHostVcpuAzureAvgSum);
  }

  public UsageSummaryResponse infraCpuDefaultInfraHostVcpuGcpAggSum(
      Long infraCpuDefaultInfraHostVcpuGcpAggSum) {
    this.infraCpuDefaultInfraHostVcpuGcpAggSum = infraCpuDefaultInfraHostVcpuGcpAggSum;
    return this;
  }

  /**
   * Shows the sum of all default Infrastructure host vCPU cores on GCP over all hours in the
   * current month for all organizations. Values are returned in millicores. Divide by 1,000 to
   * convert to cores.
   *
   * @return infraCpuDefaultInfraHostVcpuGcpAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INFRA_CPU_DEFAULT_INFRA_HOST_VCPU_GCP_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getInfraCpuDefaultInfraHostVcpuGcpAggSum() {
    return infraCpuDefaultInfraHostVcpuGcpAggSum;
  }

  public void setInfraCpuDefaultInfraHostVcpuGcpAggSum(Long infraCpuDefaultInfraHostVcpuGcpAggSum) {
    this.infraCpuDefaultInfraHostVcpuGcpAggSum = infraCpuDefaultInfraHostVcpuGcpAggSum;
    putAdditionalProperty(
        JSON_PROPERTY_INFRA_CPU_DEFAULT_INFRA_HOST_VCPU_GCP_AGG_SUM,
        infraCpuDefaultInfraHostVcpuGcpAggSum);
  }

  public UsageSummaryResponse infraCpuDefaultInfraHostVcpuGcpAvgSum(
      Long infraCpuDefaultInfraHostVcpuGcpAvgSum) {
    this.infraCpuDefaultInfraHostVcpuGcpAvgSum = infraCpuDefaultInfraHostVcpuGcpAvgSum;
    return this;
  }

  /**
   * Shows the average of all default Infrastructure host vCPU cores on GCP over all hours in the
   * current month for all organizations. Values are returned in millicores. Divide by 1,000 to
   * convert to cores.
   *
   * @return infraCpuDefaultInfraHostVcpuGcpAvgSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INFRA_CPU_DEFAULT_INFRA_HOST_VCPU_GCP_AVG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getInfraCpuDefaultInfraHostVcpuGcpAvgSum() {
    return infraCpuDefaultInfraHostVcpuGcpAvgSum;
  }

  public void setInfraCpuDefaultInfraHostVcpuGcpAvgSum(Long infraCpuDefaultInfraHostVcpuGcpAvgSum) {
    this.infraCpuDefaultInfraHostVcpuGcpAvgSum = infraCpuDefaultInfraHostVcpuGcpAvgSum;
    putAdditionalProperty(
        JSON_PROPERTY_INFRA_CPU_DEFAULT_INFRA_HOST_VCPU_GCP_AVG_SUM,
        infraCpuDefaultInfraHostVcpuGcpAvgSum);
  }

  public UsageSummaryResponse infraCpuDefaultInfraHostVcpuNutanixAggSum(
      Long infraCpuDefaultInfraHostVcpuNutanixAggSum) {
    this.infraCpuDefaultInfraHostVcpuNutanixAggSum = infraCpuDefaultInfraHostVcpuNutanixAggSum;
    return this;
  }

  /**
   * Shows the sum of all default Infrastructure host vCPU cores on Nutanix over all hours in the
   * current month for all organizations. Values are returned in millicores. Divide by 1,000 to
   * convert to cores.
   *
   * @return infraCpuDefaultInfraHostVcpuNutanixAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INFRA_CPU_DEFAULT_INFRA_HOST_VCPU_NUTANIX_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getInfraCpuDefaultInfraHostVcpuNutanixAggSum() {
    return infraCpuDefaultInfraHostVcpuNutanixAggSum;
  }

  public void setInfraCpuDefaultInfraHostVcpuNutanixAggSum(
      Long infraCpuDefaultInfraHostVcpuNutanixAggSum) {
    this.infraCpuDefaultInfraHostVcpuNutanixAggSum = infraCpuDefaultInfraHostVcpuNutanixAggSum;
    putAdditionalProperty(
        JSON_PROPERTY_INFRA_CPU_DEFAULT_INFRA_HOST_VCPU_NUTANIX_AGG_SUM,
        infraCpuDefaultInfraHostVcpuNutanixAggSum);
  }

  public UsageSummaryResponse infraCpuDefaultInfraHostVcpuNutanixAvgSum(
      Long infraCpuDefaultInfraHostVcpuNutanixAvgSum) {
    this.infraCpuDefaultInfraHostVcpuNutanixAvgSum = infraCpuDefaultInfraHostVcpuNutanixAvgSum;
    return this;
  }

  /**
   * Shows the average of all default Infrastructure host vCPU cores on Nutanix over all hours in
   * the current month for all organizations. Values are returned in millicores. Divide by 1,000 to
   * convert to cores.
   *
   * @return infraCpuDefaultInfraHostVcpuNutanixAvgSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INFRA_CPU_DEFAULT_INFRA_HOST_VCPU_NUTANIX_AVG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getInfraCpuDefaultInfraHostVcpuNutanixAvgSum() {
    return infraCpuDefaultInfraHostVcpuNutanixAvgSum;
  }

  public void setInfraCpuDefaultInfraHostVcpuNutanixAvgSum(
      Long infraCpuDefaultInfraHostVcpuNutanixAvgSum) {
    this.infraCpuDefaultInfraHostVcpuNutanixAvgSum = infraCpuDefaultInfraHostVcpuNutanixAvgSum;
    putAdditionalProperty(
        JSON_PROPERTY_INFRA_CPU_DEFAULT_INFRA_HOST_VCPU_NUTANIX_AVG_SUM,
        infraCpuDefaultInfraHostVcpuNutanixAvgSum);
  }

  public UsageSummaryResponse infraCpuDefaultInfraHostVcpuNutanixBasicAggSum(
      Long infraCpuDefaultInfraHostVcpuNutanixBasicAggSum) {
    this.infraCpuDefaultInfraHostVcpuNutanixBasicAggSum =
        infraCpuDefaultInfraHostVcpuNutanixBasicAggSum;
    return this;
  }

  /**
   * Shows the sum of all default basic Infrastructure host vCPU cores on Nutanix over all hours in
   * the current month for all organizations. Values are returned in millicores. Divide by 1,000 to
   * convert to cores.
   *
   * @return infraCpuDefaultInfraHostVcpuNutanixBasicAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INFRA_CPU_DEFAULT_INFRA_HOST_VCPU_NUTANIX_BASIC_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getInfraCpuDefaultInfraHostVcpuNutanixBasicAggSum() {
    return infraCpuDefaultInfraHostVcpuNutanixBasicAggSum;
  }

  public void setInfraCpuDefaultInfraHostVcpuNutanixBasicAggSum(
      Long infraCpuDefaultInfraHostVcpuNutanixBasicAggSum) {
    this.infraCpuDefaultInfraHostVcpuNutanixBasicAggSum =
        infraCpuDefaultInfraHostVcpuNutanixBasicAggSum;
    putAdditionalProperty(
        JSON_PROPERTY_INFRA_CPU_DEFAULT_INFRA_HOST_VCPU_NUTANIX_BASIC_AGG_SUM,
        infraCpuDefaultInfraHostVcpuNutanixBasicAggSum);
  }

  public UsageSummaryResponse infraCpuDefaultInfraHostVcpuNutanixBasicAvgSum(
      Long infraCpuDefaultInfraHostVcpuNutanixBasicAvgSum) {
    this.infraCpuDefaultInfraHostVcpuNutanixBasicAvgSum =
        infraCpuDefaultInfraHostVcpuNutanixBasicAvgSum;
    return this;
  }

  /**
   * Shows the average of all default basic Infrastructure host vCPU cores on Nutanix over all hours
   * in the current month for all organizations. Values are returned in millicores. Divide by 1,000
   * to convert to cores.
   *
   * @return infraCpuDefaultInfraHostVcpuNutanixBasicAvgSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INFRA_CPU_DEFAULT_INFRA_HOST_VCPU_NUTANIX_BASIC_AVG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getInfraCpuDefaultInfraHostVcpuNutanixBasicAvgSum() {
    return infraCpuDefaultInfraHostVcpuNutanixBasicAvgSum;
  }

  public void setInfraCpuDefaultInfraHostVcpuNutanixBasicAvgSum(
      Long infraCpuDefaultInfraHostVcpuNutanixBasicAvgSum) {
    this.infraCpuDefaultInfraHostVcpuNutanixBasicAvgSum =
        infraCpuDefaultInfraHostVcpuNutanixBasicAvgSum;
    putAdditionalProperty(
        JSON_PROPERTY_INFRA_CPU_DEFAULT_INFRA_HOST_VCPU_NUTANIX_BASIC_AVG_SUM,
        infraCpuDefaultInfraHostVcpuNutanixBasicAvgSum);
  }

  public UsageSummaryResponse infraCpuDefaultInfraHostVcpuOpentelemetryAggSum(
      Long infraCpuDefaultInfraHostVcpuOpentelemetryAggSum) {
    this.infraCpuDefaultInfraHostVcpuOpentelemetryAggSum =
        infraCpuDefaultInfraHostVcpuOpentelemetryAggSum;
    return this;
  }

  /**
   * Shows the sum of all default Infrastructure host vCPU cores reported by OpenTelemetry over all
   * hours in the current month for all organizations. Values are returned in millicores. Divide by
   * 1,000 to convert to cores.
   *
   * @return infraCpuDefaultInfraHostVcpuOpentelemetryAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INFRA_CPU_DEFAULT_INFRA_HOST_VCPU_OPENTELEMETRY_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getInfraCpuDefaultInfraHostVcpuOpentelemetryAggSum() {
    return infraCpuDefaultInfraHostVcpuOpentelemetryAggSum;
  }

  public void setInfraCpuDefaultInfraHostVcpuOpentelemetryAggSum(
      Long infraCpuDefaultInfraHostVcpuOpentelemetryAggSum) {
    this.infraCpuDefaultInfraHostVcpuOpentelemetryAggSum =
        infraCpuDefaultInfraHostVcpuOpentelemetryAggSum;
    putAdditionalProperty(
        JSON_PROPERTY_INFRA_CPU_DEFAULT_INFRA_HOST_VCPU_OPENTELEMETRY_AGG_SUM,
        infraCpuDefaultInfraHostVcpuOpentelemetryAggSum);
  }

  public UsageSummaryResponse infraCpuDefaultInfraHostVcpuOpentelemetryAvgSum(
      Long infraCpuDefaultInfraHostVcpuOpentelemetryAvgSum) {
    this.infraCpuDefaultInfraHostVcpuOpentelemetryAvgSum =
        infraCpuDefaultInfraHostVcpuOpentelemetryAvgSum;
    return this;
  }

  /**
   * Shows the average of all default Infrastructure host vCPU cores reported by OpenTelemetry over
   * all hours in the current month for all organizations. Values are returned in millicores. Divide
   * by 1,000 to convert to cores.
   *
   * @return infraCpuDefaultInfraHostVcpuOpentelemetryAvgSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INFRA_CPU_DEFAULT_INFRA_HOST_VCPU_OPENTELEMETRY_AVG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getInfraCpuDefaultInfraHostVcpuOpentelemetryAvgSum() {
    return infraCpuDefaultInfraHostVcpuOpentelemetryAvgSum;
  }

  public void setInfraCpuDefaultInfraHostVcpuOpentelemetryAvgSum(
      Long infraCpuDefaultInfraHostVcpuOpentelemetryAvgSum) {
    this.infraCpuDefaultInfraHostVcpuOpentelemetryAvgSum =
        infraCpuDefaultInfraHostVcpuOpentelemetryAvgSum;
    putAdditionalProperty(
        JSON_PROPERTY_INFRA_CPU_DEFAULT_INFRA_HOST_VCPU_OPENTELEMETRY_AVG_SUM,
        infraCpuDefaultInfraHostVcpuOpentelemetryAvgSum);
  }

  public UsageSummaryResponse infraCpuObservedInfraHostVcpuAgentAggSum(
      Long infraCpuObservedInfraHostVcpuAgentAggSum) {
    this.infraCpuObservedInfraHostVcpuAgentAggSum = infraCpuObservedInfraHostVcpuAgentAggSum;
    return this;
  }

  /**
   * Shows the sum of all observed Infrastructure host vCPU cores reported by the Datadog Agent over
   * all hours in the current month for all organizations. Values are returned in millicores. Divide
   * by 1,000 to convert to cores.
   *
   * @return infraCpuObservedInfraHostVcpuAgentAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INFRA_CPU_OBSERVED_INFRA_HOST_VCPU_AGENT_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getInfraCpuObservedInfraHostVcpuAgentAggSum() {
    return infraCpuObservedInfraHostVcpuAgentAggSum;
  }

  public void setInfraCpuObservedInfraHostVcpuAgentAggSum(
      Long infraCpuObservedInfraHostVcpuAgentAggSum) {
    this.infraCpuObservedInfraHostVcpuAgentAggSum = infraCpuObservedInfraHostVcpuAgentAggSum;
    putAdditionalProperty(
        JSON_PROPERTY_INFRA_CPU_OBSERVED_INFRA_HOST_VCPU_AGENT_AGG_SUM,
        infraCpuObservedInfraHostVcpuAgentAggSum);
  }

  public UsageSummaryResponse infraCpuObservedInfraHostVcpuAgentAvgSum(
      Long infraCpuObservedInfraHostVcpuAgentAvgSum) {
    this.infraCpuObservedInfraHostVcpuAgentAvgSum = infraCpuObservedInfraHostVcpuAgentAvgSum;
    return this;
  }

  /**
   * Shows the average of all observed Infrastructure host vCPU cores reported by the Datadog Agent
   * over all hours in the current month for all organizations. Values are returned in millicores.
   * Divide by 1,000 to convert to cores.
   *
   * @return infraCpuObservedInfraHostVcpuAgentAvgSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INFRA_CPU_OBSERVED_INFRA_HOST_VCPU_AGENT_AVG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getInfraCpuObservedInfraHostVcpuAgentAvgSum() {
    return infraCpuObservedInfraHostVcpuAgentAvgSum;
  }

  public void setInfraCpuObservedInfraHostVcpuAgentAvgSum(
      Long infraCpuObservedInfraHostVcpuAgentAvgSum) {
    this.infraCpuObservedInfraHostVcpuAgentAvgSum = infraCpuObservedInfraHostVcpuAgentAvgSum;
    putAdditionalProperty(
        JSON_PROPERTY_INFRA_CPU_OBSERVED_INFRA_HOST_VCPU_AGENT_AVG_SUM,
        infraCpuObservedInfraHostVcpuAgentAvgSum);
  }

  public UsageSummaryResponse infraCpuObservedInfraHostVcpuAwsAggSum(
      Long infraCpuObservedInfraHostVcpuAwsAggSum) {
    this.infraCpuObservedInfraHostVcpuAwsAggSum = infraCpuObservedInfraHostVcpuAwsAggSum;
    return this;
  }

  /**
   * Shows the sum of all observed Infrastructure host vCPU cores on AWS over all hours in the
   * current month for all organizations. Values are returned in millicores. Divide by 1,000 to
   * convert to cores.
   *
   * @return infraCpuObservedInfraHostVcpuAwsAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INFRA_CPU_OBSERVED_INFRA_HOST_VCPU_AWS_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getInfraCpuObservedInfraHostVcpuAwsAggSum() {
    return infraCpuObservedInfraHostVcpuAwsAggSum;
  }

  public void setInfraCpuObservedInfraHostVcpuAwsAggSum(
      Long infraCpuObservedInfraHostVcpuAwsAggSum) {
    this.infraCpuObservedInfraHostVcpuAwsAggSum = infraCpuObservedInfraHostVcpuAwsAggSum;
    putAdditionalProperty(
        JSON_PROPERTY_INFRA_CPU_OBSERVED_INFRA_HOST_VCPU_AWS_AGG_SUM,
        infraCpuObservedInfraHostVcpuAwsAggSum);
  }

  public UsageSummaryResponse infraCpuObservedInfraHostVcpuAwsAvgSum(
      Long infraCpuObservedInfraHostVcpuAwsAvgSum) {
    this.infraCpuObservedInfraHostVcpuAwsAvgSum = infraCpuObservedInfraHostVcpuAwsAvgSum;
    return this;
  }

  /**
   * Shows the average of all observed Infrastructure host vCPU cores on AWS over all hours in the
   * current month for all organizations. Values are returned in millicores. Divide by 1,000 to
   * convert to cores.
   *
   * @return infraCpuObservedInfraHostVcpuAwsAvgSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INFRA_CPU_OBSERVED_INFRA_HOST_VCPU_AWS_AVG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getInfraCpuObservedInfraHostVcpuAwsAvgSum() {
    return infraCpuObservedInfraHostVcpuAwsAvgSum;
  }

  public void setInfraCpuObservedInfraHostVcpuAwsAvgSum(
      Long infraCpuObservedInfraHostVcpuAwsAvgSum) {
    this.infraCpuObservedInfraHostVcpuAwsAvgSum = infraCpuObservedInfraHostVcpuAwsAvgSum;
    putAdditionalProperty(
        JSON_PROPERTY_INFRA_CPU_OBSERVED_INFRA_HOST_VCPU_AWS_AVG_SUM,
        infraCpuObservedInfraHostVcpuAwsAvgSum);
  }

  public UsageSummaryResponse infraCpuObservedInfraHostVcpuAzureAggSum(
      Long infraCpuObservedInfraHostVcpuAzureAggSum) {
    this.infraCpuObservedInfraHostVcpuAzureAggSum = infraCpuObservedInfraHostVcpuAzureAggSum;
    return this;
  }

  /**
   * Shows the sum of all observed Infrastructure host vCPU cores on Azure over all hours in the
   * current month for all organizations. Values are returned in millicores. Divide by 1,000 to
   * convert to cores.
   *
   * @return infraCpuObservedInfraHostVcpuAzureAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INFRA_CPU_OBSERVED_INFRA_HOST_VCPU_AZURE_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getInfraCpuObservedInfraHostVcpuAzureAggSum() {
    return infraCpuObservedInfraHostVcpuAzureAggSum;
  }

  public void setInfraCpuObservedInfraHostVcpuAzureAggSum(
      Long infraCpuObservedInfraHostVcpuAzureAggSum) {
    this.infraCpuObservedInfraHostVcpuAzureAggSum = infraCpuObservedInfraHostVcpuAzureAggSum;
    putAdditionalProperty(
        JSON_PROPERTY_INFRA_CPU_OBSERVED_INFRA_HOST_VCPU_AZURE_AGG_SUM,
        infraCpuObservedInfraHostVcpuAzureAggSum);
  }

  public UsageSummaryResponse infraCpuObservedInfraHostVcpuAzureAvgSum(
      Long infraCpuObservedInfraHostVcpuAzureAvgSum) {
    this.infraCpuObservedInfraHostVcpuAzureAvgSum = infraCpuObservedInfraHostVcpuAzureAvgSum;
    return this;
  }

  /**
   * Shows the average of all observed Infrastructure host vCPU cores on Azure over all hours in the
   * current month for all organizations. Values are returned in millicores. Divide by 1,000 to
   * convert to cores.
   *
   * @return infraCpuObservedInfraHostVcpuAzureAvgSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INFRA_CPU_OBSERVED_INFRA_HOST_VCPU_AZURE_AVG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getInfraCpuObservedInfraHostVcpuAzureAvgSum() {
    return infraCpuObservedInfraHostVcpuAzureAvgSum;
  }

  public void setInfraCpuObservedInfraHostVcpuAzureAvgSum(
      Long infraCpuObservedInfraHostVcpuAzureAvgSum) {
    this.infraCpuObservedInfraHostVcpuAzureAvgSum = infraCpuObservedInfraHostVcpuAzureAvgSum;
    putAdditionalProperty(
        JSON_PROPERTY_INFRA_CPU_OBSERVED_INFRA_HOST_VCPU_AZURE_AVG_SUM,
        infraCpuObservedInfraHostVcpuAzureAvgSum);
  }

  public UsageSummaryResponse infraCpuObservedInfraHostVcpuGcpAggSum(
      Long infraCpuObservedInfraHostVcpuGcpAggSum) {
    this.infraCpuObservedInfraHostVcpuGcpAggSum = infraCpuObservedInfraHostVcpuGcpAggSum;
    return this;
  }

  /**
   * Shows the sum of all observed Infrastructure host vCPU cores on GCP over all hours in the
   * current month for all organizations. Values are returned in millicores. Divide by 1,000 to
   * convert to cores.
   *
   * @return infraCpuObservedInfraHostVcpuGcpAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INFRA_CPU_OBSERVED_INFRA_HOST_VCPU_GCP_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getInfraCpuObservedInfraHostVcpuGcpAggSum() {
    return infraCpuObservedInfraHostVcpuGcpAggSum;
  }

  public void setInfraCpuObservedInfraHostVcpuGcpAggSum(
      Long infraCpuObservedInfraHostVcpuGcpAggSum) {
    this.infraCpuObservedInfraHostVcpuGcpAggSum = infraCpuObservedInfraHostVcpuGcpAggSum;
    putAdditionalProperty(
        JSON_PROPERTY_INFRA_CPU_OBSERVED_INFRA_HOST_VCPU_GCP_AGG_SUM,
        infraCpuObservedInfraHostVcpuGcpAggSum);
  }

  public UsageSummaryResponse infraCpuObservedInfraHostVcpuGcpAvgSum(
      Long infraCpuObservedInfraHostVcpuGcpAvgSum) {
    this.infraCpuObservedInfraHostVcpuGcpAvgSum = infraCpuObservedInfraHostVcpuGcpAvgSum;
    return this;
  }

  /**
   * Shows the average of all observed Infrastructure host vCPU cores on GCP over all hours in the
   * current month for all organizations. Values are returned in millicores. Divide by 1,000 to
   * convert to cores.
   *
   * @return infraCpuObservedInfraHostVcpuGcpAvgSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INFRA_CPU_OBSERVED_INFRA_HOST_VCPU_GCP_AVG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getInfraCpuObservedInfraHostVcpuGcpAvgSum() {
    return infraCpuObservedInfraHostVcpuGcpAvgSum;
  }

  public void setInfraCpuObservedInfraHostVcpuGcpAvgSum(
      Long infraCpuObservedInfraHostVcpuGcpAvgSum) {
    this.infraCpuObservedInfraHostVcpuGcpAvgSum = infraCpuObservedInfraHostVcpuGcpAvgSum;
    putAdditionalProperty(
        JSON_PROPERTY_INFRA_CPU_OBSERVED_INFRA_HOST_VCPU_GCP_AVG_SUM,
        infraCpuObservedInfraHostVcpuGcpAvgSum);
  }

  public UsageSummaryResponse infraCpuObservedInfraHostVcpuNutanixAggSum(
      Long infraCpuObservedInfraHostVcpuNutanixAggSum) {
    this.infraCpuObservedInfraHostVcpuNutanixAggSum = infraCpuObservedInfraHostVcpuNutanixAggSum;
    return this;
  }

  /**
   * Shows the sum of all observed Infrastructure host vCPU cores on Nutanix over all hours in the
   * current month for all organizations. Values are returned in millicores. Divide by 1,000 to
   * convert to cores.
   *
   * @return infraCpuObservedInfraHostVcpuNutanixAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INFRA_CPU_OBSERVED_INFRA_HOST_VCPU_NUTANIX_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getInfraCpuObservedInfraHostVcpuNutanixAggSum() {
    return infraCpuObservedInfraHostVcpuNutanixAggSum;
  }

  public void setInfraCpuObservedInfraHostVcpuNutanixAggSum(
      Long infraCpuObservedInfraHostVcpuNutanixAggSum) {
    this.infraCpuObservedInfraHostVcpuNutanixAggSum = infraCpuObservedInfraHostVcpuNutanixAggSum;
    putAdditionalProperty(
        JSON_PROPERTY_INFRA_CPU_OBSERVED_INFRA_HOST_VCPU_NUTANIX_AGG_SUM,
        infraCpuObservedInfraHostVcpuNutanixAggSum);
  }

  public UsageSummaryResponse infraCpuObservedInfraHostVcpuNutanixAvgSum(
      Long infraCpuObservedInfraHostVcpuNutanixAvgSum) {
    this.infraCpuObservedInfraHostVcpuNutanixAvgSum = infraCpuObservedInfraHostVcpuNutanixAvgSum;
    return this;
  }

  /**
   * Shows the average of all observed Infrastructure host vCPU cores on Nutanix over all hours in
   * the current month for all organizations. Values are returned in millicores. Divide by 1,000 to
   * convert to cores.
   *
   * @return infraCpuObservedInfraHostVcpuNutanixAvgSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INFRA_CPU_OBSERVED_INFRA_HOST_VCPU_NUTANIX_AVG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getInfraCpuObservedInfraHostVcpuNutanixAvgSum() {
    return infraCpuObservedInfraHostVcpuNutanixAvgSum;
  }

  public void setInfraCpuObservedInfraHostVcpuNutanixAvgSum(
      Long infraCpuObservedInfraHostVcpuNutanixAvgSum) {
    this.infraCpuObservedInfraHostVcpuNutanixAvgSum = infraCpuObservedInfraHostVcpuNutanixAvgSum;
    putAdditionalProperty(
        JSON_PROPERTY_INFRA_CPU_OBSERVED_INFRA_HOST_VCPU_NUTANIX_AVG_SUM,
        infraCpuObservedInfraHostVcpuNutanixAvgSum);
  }

  public UsageSummaryResponse infraCpuObservedInfraHostVcpuOpentelemetryAggSum(
      Long infraCpuObservedInfraHostVcpuOpentelemetryAggSum) {
    this.infraCpuObservedInfraHostVcpuOpentelemetryAggSum =
        infraCpuObservedInfraHostVcpuOpentelemetryAggSum;
    return this;
  }

  /**
   * Shows the sum of all observed Infrastructure host vCPU cores reported by OpenTelemetry over all
   * hours in the current month for all organizations. Values are returned in millicores. Divide by
   * 1,000 to convert to cores.
   *
   * @return infraCpuObservedInfraHostVcpuOpentelemetryAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INFRA_CPU_OBSERVED_INFRA_HOST_VCPU_OPENTELEMETRY_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getInfraCpuObservedInfraHostVcpuOpentelemetryAggSum() {
    return infraCpuObservedInfraHostVcpuOpentelemetryAggSum;
  }

  public void setInfraCpuObservedInfraHostVcpuOpentelemetryAggSum(
      Long infraCpuObservedInfraHostVcpuOpentelemetryAggSum) {
    this.infraCpuObservedInfraHostVcpuOpentelemetryAggSum =
        infraCpuObservedInfraHostVcpuOpentelemetryAggSum;
    putAdditionalProperty(
        JSON_PROPERTY_INFRA_CPU_OBSERVED_INFRA_HOST_VCPU_OPENTELEMETRY_AGG_SUM,
        infraCpuObservedInfraHostVcpuOpentelemetryAggSum);
  }

  public UsageSummaryResponse infraCpuObservedInfraHostVcpuOpentelemetryAvgSum(
      Long infraCpuObservedInfraHostVcpuOpentelemetryAvgSum) {
    this.infraCpuObservedInfraHostVcpuOpentelemetryAvgSum =
        infraCpuObservedInfraHostVcpuOpentelemetryAvgSum;
    return this;
  }

  /**
   * Shows the average of all observed Infrastructure host vCPU cores reported by OpenTelemetry over
   * all hours in the current month for all organizations. Values are returned in millicores. Divide
   * by 1,000 to convert to cores.
   *
   * @return infraCpuObservedInfraHostVcpuOpentelemetryAvgSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INFRA_CPU_OBSERVED_INFRA_HOST_VCPU_OPENTELEMETRY_AVG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getInfraCpuObservedInfraHostVcpuOpentelemetryAvgSum() {
    return infraCpuObservedInfraHostVcpuOpentelemetryAvgSum;
  }

  public void setInfraCpuObservedInfraHostVcpuOpentelemetryAvgSum(
      Long infraCpuObservedInfraHostVcpuOpentelemetryAvgSum) {
    this.infraCpuObservedInfraHostVcpuOpentelemetryAvgSum =
        infraCpuObservedInfraHostVcpuOpentelemetryAvgSum;
    putAdditionalProperty(
        JSON_PROPERTY_INFRA_CPU_OBSERVED_INFRA_HOST_VCPU_OPENTELEMETRY_AVG_SUM,
        infraCpuObservedInfraHostVcpuOpentelemetryAvgSum);
  }

  public UsageSummaryResponse infraEdgeMonitoringDevicesTop99pSum(
      Long infraEdgeMonitoringDevicesTop99pSum) {
    this.infraEdgeMonitoringDevicesTop99pSum = infraEdgeMonitoringDevicesTop99pSum;
    return this;
  }

  /**
   * Shows the 99th percentile of all Edge Devices Monitoring devices over all hours in the current
   * month for all organizations.
   *
   * @return infraEdgeMonitoringDevicesTop99pSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INFRA_EDGE_MONITORING_DEVICES_TOP99P_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getInfraEdgeMonitoringDevicesTop99pSum() {
    return infraEdgeMonitoringDevicesTop99pSum;
  }

  public void setInfraEdgeMonitoringDevicesTop99pSum(Long infraEdgeMonitoringDevicesTop99pSum) {
    this.infraEdgeMonitoringDevicesTop99pSum = infraEdgeMonitoringDevicesTop99pSum;
    putAdditionalProperty(
        JSON_PROPERTY_INFRA_EDGE_MONITORING_DEVICES_TOP99P_SUM,
        infraEdgeMonitoringDevicesTop99pSum);
  }

  public UsageSummaryResponse infraHostBasicInfraBasicAgentTop99pSum(
      Long infraHostBasicInfraBasicAgentTop99pSum) {
    this.infraHostBasicInfraBasicAgentTop99pSum = infraHostBasicInfraBasicAgentTop99pSum;
    return this;
  }

  /**
   * Shows the 99th percentile of all distinct infrastructure hosts for Basic tier with the Datadog
   * Agent over all hours in the current month for all organizations.
   *
   * @return infraHostBasicInfraBasicAgentTop99pSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INFRA_HOST_BASIC_INFRA_BASIC_AGENT_TOP99P_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getInfraHostBasicInfraBasicAgentTop99pSum() {
    return infraHostBasicInfraBasicAgentTop99pSum;
  }

  public void setInfraHostBasicInfraBasicAgentTop99pSum(
      Long infraHostBasicInfraBasicAgentTop99pSum) {
    this.infraHostBasicInfraBasicAgentTop99pSum = infraHostBasicInfraBasicAgentTop99pSum;
    putAdditionalProperty(
        JSON_PROPERTY_INFRA_HOST_BASIC_INFRA_BASIC_AGENT_TOP99P_SUM,
        infraHostBasicInfraBasicAgentTop99pSum);
  }

  public UsageSummaryResponse infraHostBasicInfraBasicVsphereTop99pSum(
      Long infraHostBasicInfraBasicVsphereTop99pSum) {
    this.infraHostBasicInfraBasicVsphereTop99pSum = infraHostBasicInfraBasicVsphereTop99pSum;
    return this;
  }

  /**
   * Shows the 99th percentile of all distinct infrastructure hosts for Basic tier on vSphere over
   * all hours in the current month for all organizations.
   *
   * @return infraHostBasicInfraBasicVsphereTop99pSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INFRA_HOST_BASIC_INFRA_BASIC_VSPHERE_TOP99P_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getInfraHostBasicInfraBasicVsphereTop99pSum() {
    return infraHostBasicInfraBasicVsphereTop99pSum;
  }

  public void setInfraHostBasicInfraBasicVsphereTop99pSum(
      Long infraHostBasicInfraBasicVsphereTop99pSum) {
    this.infraHostBasicInfraBasicVsphereTop99pSum = infraHostBasicInfraBasicVsphereTop99pSum;
    putAdditionalProperty(
        JSON_PROPERTY_INFRA_HOST_BASIC_INFRA_BASIC_VSPHERE_TOP99P_SUM,
        infraHostBasicInfraBasicVsphereTop99pSum);
  }

  public UsageSummaryResponse infraHostBasicTop99pSum(Long infraHostBasicTop99pSum) {
    this.infraHostBasicTop99pSum = infraHostBasicTop99pSum;
    return this;
  }

  /**
   * Shows the 99th percentile of all distinct infrastructure hosts for Basic tier over all hours in
   * the current month for all organizations.
   *
   * @return infraHostBasicTop99pSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INFRA_HOST_BASIC_TOP99P_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getInfraHostBasicTop99pSum() {
    return infraHostBasicTop99pSum;
  }

  public void setInfraHostBasicTop99pSum(Long infraHostBasicTop99pSum) {
    this.infraHostBasicTop99pSum = infraHostBasicTop99pSum;
    putAdditionalProperty(JSON_PROPERTY_INFRA_HOST_BASIC_TOP99P_SUM, infraHostBasicTop99pSum);
  }

  public UsageSummaryResponse infraHostTop99pSum(Long infraHostTop99pSum) {
    this.infraHostTop99pSum = infraHostTop99pSum;
    return this;
  }

  /**
   * Shows the 99th percentile of all distinct infrastructure hosts over all hours in the current
   * month for all organizations.
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
    putAdditionalProperty(JSON_PROPERTY_INFRA_HOST_TOP99P_SUM, infraHostTop99pSum);
  }

  public UsageSummaryResponse infraStorageMgmtObjectsCountAvgSum(
      Long infraStorageMgmtObjectsCountAvgSum) {
    this.infraStorageMgmtObjectsCountAvgSum = infraStorageMgmtObjectsCountAvgSum;
    return this;
  }

  /**
   * Shows the average number of storage management objects over all hours in the current month for
   * all organizations.
   *
   * @return infraStorageMgmtObjectsCountAvgSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INFRA_STORAGE_MGMT_OBJECTS_COUNT_AVG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getInfraStorageMgmtObjectsCountAvgSum() {
    return infraStorageMgmtObjectsCountAvgSum;
  }

  public void setInfraStorageMgmtObjectsCountAvgSum(Long infraStorageMgmtObjectsCountAvgSum) {
    this.infraStorageMgmtObjectsCountAvgSum = infraStorageMgmtObjectsCountAvgSum;
    putAdditionalProperty(
        JSON_PROPERTY_INFRA_STORAGE_MGMT_OBJECTS_COUNT_AVG_SUM, infraStorageMgmtObjectsCountAvgSum);
  }

  public UsageSummaryResponse ingestPointsAggSum(Long ingestPointsAggSum) {
    this.ingestPointsAggSum = ingestPointsAggSum;
    return this;
  }

  /**
   * Shows the sum of all ingested custom metrics points over all hours in the current month for all
   * organizations.
   *
   * @return ingestPointsAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INGEST_POINTS_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getIngestPointsAggSum() {
    return ingestPointsAggSum;
  }

  public void setIngestPointsAggSum(Long ingestPointsAggSum) {
    this.ingestPointsAggSum = ingestPointsAggSum;
    putAdditionalProperty(JSON_PROPERTY_INGEST_POINTS_AGG_SUM, ingestPointsAggSum);
  }

  public UsageSummaryResponse ingestedEventsBytesAggSum(Long ingestedEventsBytesAggSum) {
    this.ingestedEventsBytesAggSum = ingestedEventsBytesAggSum;
    return this;
  }

  /**
   * Shows the sum of all log bytes ingested over all hours in the current month for all
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
    putAdditionalProperty(JSON_PROPERTY_INGESTED_EVENTS_BYTES_AGG_SUM, ingestedEventsBytesAggSum);
  }

  public UsageSummaryResponse iotApmHostAggSum(Long iotApmHostAggSum) {
    this.iotApmHostAggSum = iotApmHostAggSum;
    return this;
  }

  /**
   * Shows the sum of all Application Performance Monitoring IoT hosts over all hours in the current
   * month for all organizations.
   *
   * @return iotApmHostAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IOT_APM_HOST_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getIotApmHostAggSum() {
    return iotApmHostAggSum;
  }

  public void setIotApmHostAggSum(Long iotApmHostAggSum) {
    this.iotApmHostAggSum = iotApmHostAggSum;
    putAdditionalProperty(JSON_PROPERTY_IOT_APM_HOST_AGG_SUM, iotApmHostAggSum);
  }

  public UsageSummaryResponse iotApmHostTop99pSum(Long iotApmHostTop99pSum) {
    this.iotApmHostTop99pSum = iotApmHostTop99pSum;
    return this;
  }

  /**
   * Shows the 99th percentile of all Application Performance Monitoring IoT hosts over all hours in
   * the current month for all organizations.
   *
   * @return iotApmHostTop99pSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IOT_APM_HOST_TOP99P_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getIotApmHostTop99pSum() {
    return iotApmHostTop99pSum;
  }

  public void setIotApmHostTop99pSum(Long iotApmHostTop99pSum) {
    this.iotApmHostTop99pSum = iotApmHostTop99pSum;
    putAdditionalProperty(JSON_PROPERTY_IOT_APM_HOST_TOP99P_SUM, iotApmHostTop99pSum);
  }

  public UsageSummaryResponse iotDeviceAggSum(Long iotDeviceAggSum) {
    this.iotDeviceAggSum = iotDeviceAggSum;
    return this;
  }

  /**
   * Shows the sum of all IoT devices over all hours in the current month for all organizations.
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
    putAdditionalProperty(JSON_PROPERTY_IOT_DEVICE_AGG_SUM, iotDeviceAggSum);
  }

  public UsageSummaryResponse iotDeviceTop99pSum(Long iotDeviceTop99pSum) {
    this.iotDeviceTop99pSum = iotDeviceTop99pSum;
    return this;
  }

  /**
   * Shows the 99th percentile of all IoT devices over all hours in the current month of all
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
    putAdditionalProperty(JSON_PROPERTY_IOT_DEVICE_TOP99P_SUM, iotDeviceTop99pSum);
  }

  public UsageSummaryResponse lastUpdated(OffsetDateTime lastUpdated) {
    this.lastUpdated = lastUpdated;
    return this;
  }

  /**
   * Shows the most recent hour in the current month for all organizations for which all usages were
   * calculated.
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
    putAdditionalProperty(JSON_PROPERTY_LAST_UPDATED, lastUpdated);
  }

  public UsageSummaryResponse liveIndexedEventsAggSum(Long liveIndexedEventsAggSum) {
    this.liveIndexedEventsAggSum = liveIndexedEventsAggSum;
    return this;
  }

  /**
   * Shows the sum of all live logs indexed over all hours in the current month for all organization
   * (To be deprecated on October 1st, 2024).
   *
   * @return liveIndexedEventsAggSum
   * @deprecated
   */
  @Deprecated
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LIVE_INDEXED_EVENTS_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getLiveIndexedEventsAggSum() {
    return liveIndexedEventsAggSum;
  }

  @Deprecated
  public void setLiveIndexedEventsAggSum(Long liveIndexedEventsAggSum) {
    this.liveIndexedEventsAggSum = liveIndexedEventsAggSum;
    putAdditionalProperty(JSON_PROPERTY_LIVE_INDEXED_EVENTS_AGG_SUM, liveIndexedEventsAggSum);
  }

  public UsageSummaryResponse liveIngestedBytesAggSum(Long liveIngestedBytesAggSum) {
    this.liveIngestedBytesAggSum = liveIngestedBytesAggSum;
    return this;
  }

  /**
   * Shows the sum of all live logs bytes ingested over all hours in the current month for all
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
    putAdditionalProperty(JSON_PROPERTY_LIVE_INGESTED_BYTES_AGG_SUM, liveIngestedBytesAggSum);
  }

  public UsageSummaryResponse llmObservability15dayRetentionSpansAggSum(
      Long llmObservability15dayRetentionSpansAggSum) {
    this.llmObservability15dayRetentionSpansAggSum = llmObservability15dayRetentionSpansAggSum;
    return this;
  }

  /**
   * Shows the sum of all LLM Observability 15-day retention spans over all hours in the current
   * month for all organizations.
   *
   * @return llmObservability15dayRetentionSpansAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LLM_OBSERVABILITY_15DAY_RETENTION_SPANS_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getLlmObservability15dayRetentionSpansAggSum() {
    return llmObservability15dayRetentionSpansAggSum;
  }

  public void setLlmObservability15dayRetentionSpansAggSum(
      Long llmObservability15dayRetentionSpansAggSum) {
    this.llmObservability15dayRetentionSpansAggSum = llmObservability15dayRetentionSpansAggSum;
    putAdditionalProperty(
        JSON_PROPERTY_LLM_OBSERVABILITY_15DAY_RETENTION_SPANS_AGG_SUM,
        llmObservability15dayRetentionSpansAggSum);
  }

  public UsageSummaryResponse llmObservability30dayRetentionSpansAggSum(
      Long llmObservability30dayRetentionSpansAggSum) {
    this.llmObservability30dayRetentionSpansAggSum = llmObservability30dayRetentionSpansAggSum;
    return this;
  }

  /**
   * Shows the sum of all LLM Observability 30-day retention spans over all hours in the current
   * month for all organizations.
   *
   * @return llmObservability30dayRetentionSpansAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LLM_OBSERVABILITY_30DAY_RETENTION_SPANS_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getLlmObservability30dayRetentionSpansAggSum() {
    return llmObservability30dayRetentionSpansAggSum;
  }

  public void setLlmObservability30dayRetentionSpansAggSum(
      Long llmObservability30dayRetentionSpansAggSum) {
    this.llmObservability30dayRetentionSpansAggSum = llmObservability30dayRetentionSpansAggSum;
    putAdditionalProperty(
        JSON_PROPERTY_LLM_OBSERVABILITY_30DAY_RETENTION_SPANS_AGG_SUM,
        llmObservability30dayRetentionSpansAggSum);
  }

  public UsageSummaryResponse llmObservability60dayRetentionSpansAggSum(
      Long llmObservability60dayRetentionSpansAggSum) {
    this.llmObservability60dayRetentionSpansAggSum = llmObservability60dayRetentionSpansAggSum;
    return this;
  }

  /**
   * Shows the sum of all LLM Observability 60-day retention spans over all hours in the current
   * month for all organizations.
   *
   * @return llmObservability60dayRetentionSpansAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LLM_OBSERVABILITY_60DAY_RETENTION_SPANS_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getLlmObservability60dayRetentionSpansAggSum() {
    return llmObservability60dayRetentionSpansAggSum;
  }

  public void setLlmObservability60dayRetentionSpansAggSum(
      Long llmObservability60dayRetentionSpansAggSum) {
    this.llmObservability60dayRetentionSpansAggSum = llmObservability60dayRetentionSpansAggSum;
    putAdditionalProperty(
        JSON_PROPERTY_LLM_OBSERVABILITY_60DAY_RETENTION_SPANS_AGG_SUM,
        llmObservability60dayRetentionSpansAggSum);
  }

  public UsageSummaryResponse llmObservability90dayRetentionSpansAggSum(
      Long llmObservability90dayRetentionSpansAggSum) {
    this.llmObservability90dayRetentionSpansAggSum = llmObservability90dayRetentionSpansAggSum;
    return this;
  }

  /**
   * Shows the sum of all LLM Observability 90-day retention spans over all hours in the current
   * month for all organizations.
   *
   * @return llmObservability90dayRetentionSpansAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LLM_OBSERVABILITY_90DAY_RETENTION_SPANS_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getLlmObservability90dayRetentionSpansAggSum() {
    return llmObservability90dayRetentionSpansAggSum;
  }

  public void setLlmObservability90dayRetentionSpansAggSum(
      Long llmObservability90dayRetentionSpansAggSum) {
    this.llmObservability90dayRetentionSpansAggSum = llmObservability90dayRetentionSpansAggSum;
    putAdditionalProperty(
        JSON_PROPERTY_LLM_OBSERVABILITY_90DAY_RETENTION_SPANS_AGG_SUM,
        llmObservability90dayRetentionSpansAggSum);
  }

  public UsageSummaryResponse llmObservabilityAggSum(Long llmObservabilityAggSum) {
    this.llmObservabilityAggSum = llmObservabilityAggSum;
    return this;
  }

  /**
   * Sum of all LLM observability sessions for all hours in the current month for all organizations.
   *
   * @return llmObservabilityAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LLM_OBSERVABILITY_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getLlmObservabilityAggSum() {
    return llmObservabilityAggSum;
  }

  public void setLlmObservabilityAggSum(Long llmObservabilityAggSum) {
    this.llmObservabilityAggSum = llmObservabilityAggSum;
    putAdditionalProperty(JSON_PROPERTY_LLM_OBSERVABILITY_AGG_SUM, llmObservabilityAggSum);
  }

  public UsageSummaryResponse llmObservabilityMinSpendAggSum(Long llmObservabilityMinSpendAggSum) {
    this.llmObservabilityMinSpendAggSum = llmObservabilityMinSpendAggSum;
    return this;
  }

  /**
   * Minimum spend for LLM observability sessions for all hours in the current month for all
   * organizations.
   *
   * @return llmObservabilityMinSpendAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LLM_OBSERVABILITY_MIN_SPEND_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getLlmObservabilityMinSpendAggSum() {
    return llmObservabilityMinSpendAggSum;
  }

  public void setLlmObservabilityMinSpendAggSum(Long llmObservabilityMinSpendAggSum) {
    this.llmObservabilityMinSpendAggSum = llmObservabilityMinSpendAggSum;
    putAdditionalProperty(
        JSON_PROPERTY_LLM_OBSERVABILITY_MIN_SPEND_AGG_SUM, llmObservabilityMinSpendAggSum);
  }

  public UsageSummaryResponse logsArchiveSearchGbScannedAggSum(
      Long logsArchiveSearchGbScannedAggSum) {
    this.logsArchiveSearchGbScannedAggSum = logsArchiveSearchGbScannedAggSum;
    return this;
  }

  /**
   * Shows the sum of all Logs Archive Search scanned data over all hours in the current month for
   * all organizations.
   *
   * @return logsArchiveSearchGbScannedAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOGS_ARCHIVE_SEARCH_GB_SCANNED_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getLogsArchiveSearchGbScannedAggSum() {
    return logsArchiveSearchGbScannedAggSum;
  }

  public void setLogsArchiveSearchGbScannedAggSum(Long logsArchiveSearchGbScannedAggSum) {
    this.logsArchiveSearchGbScannedAggSum = logsArchiveSearchGbScannedAggSum;
    putAdditionalProperty(
        JSON_PROPERTY_LOGS_ARCHIVE_SEARCH_GB_SCANNED_AGG_SUM, logsArchiveSearchGbScannedAggSum);
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
    putAdditionalProperty(JSON_PROPERTY_LOGS_BY_RETENTION, logsByRetention);
  }

  public UsageSummaryResponse metricNamesAggSum(Long metricNamesAggSum) {
    this.metricNamesAggSum = metricNamesAggSum;
    return this;
  }

  /**
   * Shows the sum of all custom metric names over all hours in the current month for all
   * organizations.
   *
   * @return metricNamesAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METRIC_NAMES_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getMetricNamesAggSum() {
    return metricNamesAggSum;
  }

  public void setMetricNamesAggSum(Long metricNamesAggSum) {
    this.metricNamesAggSum = metricNamesAggSum;
    putAdditionalProperty(JSON_PROPERTY_METRIC_NAMES_AGG_SUM, metricNamesAggSum);
  }

  public UsageSummaryResponse mobileRumLiteSessionCountAggSum(
      Long mobileRumLiteSessionCountAggSum) {
    this.mobileRumLiteSessionCountAggSum = mobileRumLiteSessionCountAggSum;
    return this;
  }

  /**
   * Shows the sum of all mobile lite sessions over all hours in the current month for all
   * organizations (To be deprecated on October 1st, 2024).
   *
   * @return mobileRumLiteSessionCountAggSum
   * @deprecated
   */
  @Deprecated
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MOBILE_RUM_LITE_SESSION_COUNT_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getMobileRumLiteSessionCountAggSum() {
    return mobileRumLiteSessionCountAggSum;
  }

  @Deprecated
  public void setMobileRumLiteSessionCountAggSum(Long mobileRumLiteSessionCountAggSum) {
    this.mobileRumLiteSessionCountAggSum = mobileRumLiteSessionCountAggSum;
    putAdditionalProperty(
        JSON_PROPERTY_MOBILE_RUM_LITE_SESSION_COUNT_AGG_SUM, mobileRumLiteSessionCountAggSum);
  }

  public UsageSummaryResponse mobileRumSessionCountAggSum(Long mobileRumSessionCountAggSum) {
    this.mobileRumSessionCountAggSum = mobileRumSessionCountAggSum;
    return this;
  }

  /**
   * Shows the sum of all mobile RUM sessions over all hours in the current month for all
   * organizations (To be deprecated on October 1st, 2024).
   *
   * @return mobileRumSessionCountAggSum
   * @deprecated
   */
  @Deprecated
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MOBILE_RUM_SESSION_COUNT_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getMobileRumSessionCountAggSum() {
    return mobileRumSessionCountAggSum;
  }

  @Deprecated
  public void setMobileRumSessionCountAggSum(Long mobileRumSessionCountAggSum) {
    this.mobileRumSessionCountAggSum = mobileRumSessionCountAggSum;
    putAdditionalProperty(
        JSON_PROPERTY_MOBILE_RUM_SESSION_COUNT_AGG_SUM, mobileRumSessionCountAggSum);
  }

  public UsageSummaryResponse mobileRumSessionCountAndroidAggSum(
      Long mobileRumSessionCountAndroidAggSum) {
    this.mobileRumSessionCountAndroidAggSum = mobileRumSessionCountAndroidAggSum;
    return this;
  }

  /**
   * Shows the sum of all mobile RUM sessions on Android over all hours in the current month for all
   * organizations (To be deprecated on October 1st, 2024).
   *
   * @return mobileRumSessionCountAndroidAggSum
   * @deprecated
   */
  @Deprecated
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MOBILE_RUM_SESSION_COUNT_ANDROID_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getMobileRumSessionCountAndroidAggSum() {
    return mobileRumSessionCountAndroidAggSum;
  }

  @Deprecated
  public void setMobileRumSessionCountAndroidAggSum(Long mobileRumSessionCountAndroidAggSum) {
    this.mobileRumSessionCountAndroidAggSum = mobileRumSessionCountAndroidAggSum;
    putAdditionalProperty(
        JSON_PROPERTY_MOBILE_RUM_SESSION_COUNT_ANDROID_AGG_SUM, mobileRumSessionCountAndroidAggSum);
  }

  public UsageSummaryResponse mobileRumSessionCountFlutterAggSum(
      Long mobileRumSessionCountFlutterAggSum) {
    this.mobileRumSessionCountFlutterAggSum = mobileRumSessionCountFlutterAggSum;
    return this;
  }

  /**
   * Shows the sum of all mobile RUM sessions on Flutter over all hours in the current month for all
   * organizations (To be deprecated on October 1st, 2024).
   *
   * @return mobileRumSessionCountFlutterAggSum
   * @deprecated
   */
  @Deprecated
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MOBILE_RUM_SESSION_COUNT_FLUTTER_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getMobileRumSessionCountFlutterAggSum() {
    return mobileRumSessionCountFlutterAggSum;
  }

  @Deprecated
  public void setMobileRumSessionCountFlutterAggSum(Long mobileRumSessionCountFlutterAggSum) {
    this.mobileRumSessionCountFlutterAggSum = mobileRumSessionCountFlutterAggSum;
    putAdditionalProperty(
        JSON_PROPERTY_MOBILE_RUM_SESSION_COUNT_FLUTTER_AGG_SUM, mobileRumSessionCountFlutterAggSum);
  }

  public UsageSummaryResponse mobileRumSessionCountIosAggSum(Long mobileRumSessionCountIosAggSum) {
    this.mobileRumSessionCountIosAggSum = mobileRumSessionCountIosAggSum;
    return this;
  }

  /**
   * Shows the sum of all mobile RUM sessions on iOS over all hours in the current month for all
   * organizations (To be deprecated on October 1st, 2024).
   *
   * @return mobileRumSessionCountIosAggSum
   * @deprecated
   */
  @Deprecated
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MOBILE_RUM_SESSION_COUNT_IOS_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getMobileRumSessionCountIosAggSum() {
    return mobileRumSessionCountIosAggSum;
  }

  @Deprecated
  public void setMobileRumSessionCountIosAggSum(Long mobileRumSessionCountIosAggSum) {
    this.mobileRumSessionCountIosAggSum = mobileRumSessionCountIosAggSum;
    putAdditionalProperty(
        JSON_PROPERTY_MOBILE_RUM_SESSION_COUNT_IOS_AGG_SUM, mobileRumSessionCountIosAggSum);
  }

  public UsageSummaryResponse mobileRumSessionCountReactnativeAggSum(
      Long mobileRumSessionCountReactnativeAggSum) {
    this.mobileRumSessionCountReactnativeAggSum = mobileRumSessionCountReactnativeAggSum;
    return this;
  }

  /**
   * Shows the sum of all mobile RUM sessions on React Native over all hours in the current month
   * for all organizations (To be deprecated on October 1st, 2024).
   *
   * @return mobileRumSessionCountReactnativeAggSum
   * @deprecated
   */
  @Deprecated
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MOBILE_RUM_SESSION_COUNT_REACTNATIVE_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getMobileRumSessionCountReactnativeAggSum() {
    return mobileRumSessionCountReactnativeAggSum;
  }

  @Deprecated
  public void setMobileRumSessionCountReactnativeAggSum(
      Long mobileRumSessionCountReactnativeAggSum) {
    this.mobileRumSessionCountReactnativeAggSum = mobileRumSessionCountReactnativeAggSum;
    putAdditionalProperty(
        JSON_PROPERTY_MOBILE_RUM_SESSION_COUNT_REACTNATIVE_AGG_SUM,
        mobileRumSessionCountReactnativeAggSum);
  }

  public UsageSummaryResponse mobileRumSessionCountRokuAggSum(
      Long mobileRumSessionCountRokuAggSum) {
    this.mobileRumSessionCountRokuAggSum = mobileRumSessionCountRokuAggSum;
    return this;
  }

  /**
   * Shows the sum of all mobile RUM sessions on Roku over all hours in the current month for all
   * organizations (To be deprecated on October 1st, 2024).
   *
   * @return mobileRumSessionCountRokuAggSum
   * @deprecated
   */
  @Deprecated
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MOBILE_RUM_SESSION_COUNT_ROKU_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getMobileRumSessionCountRokuAggSum() {
    return mobileRumSessionCountRokuAggSum;
  }

  @Deprecated
  public void setMobileRumSessionCountRokuAggSum(Long mobileRumSessionCountRokuAggSum) {
    this.mobileRumSessionCountRokuAggSum = mobileRumSessionCountRokuAggSum;
    putAdditionalProperty(
        JSON_PROPERTY_MOBILE_RUM_SESSION_COUNT_ROKU_AGG_SUM, mobileRumSessionCountRokuAggSum);
  }

  public UsageSummaryResponse mobileRumUnitsAggSum(Long mobileRumUnitsAggSum) {
    this.mobileRumUnitsAggSum = mobileRumUnitsAggSum;
    return this;
  }

  /**
   * Shows the sum of all mobile RUM units over all hours in the current month for all organizations
   * (To be deprecated on October 1st, 2024).
   *
   * @return mobileRumUnitsAggSum
   * @deprecated
   */
  @Deprecated
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MOBILE_RUM_UNITS_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getMobileRumUnitsAggSum() {
    return mobileRumUnitsAggSum;
  }

  @Deprecated
  public void setMobileRumUnitsAggSum(Long mobileRumUnitsAggSum) {
    this.mobileRumUnitsAggSum = mobileRumUnitsAggSum;
    putAdditionalProperty(JSON_PROPERTY_MOBILE_RUM_UNITS_AGG_SUM, mobileRumUnitsAggSum);
  }

  public UsageSummaryResponse ndmNetflowEventsAggSum(Long ndmNetflowEventsAggSum) {
    this.ndmNetflowEventsAggSum = ndmNetflowEventsAggSum;
    return this;
  }

  /**
   * Shows the sum of all Network Device Monitoring NetFlow events over all hours in the current
   * month for all organizations.
   *
   * @return ndmNetflowEventsAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NDM_NETFLOW_EVENTS_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getNdmNetflowEventsAggSum() {
    return ndmNetflowEventsAggSum;
  }

  public void setNdmNetflowEventsAggSum(Long ndmNetflowEventsAggSum) {
    this.ndmNetflowEventsAggSum = ndmNetflowEventsAggSum;
    putAdditionalProperty(JSON_PROPERTY_NDM_NETFLOW_EVENTS_AGG_SUM, ndmNetflowEventsAggSum);
  }

  public UsageSummaryResponse netflowIndexedEventsCountAggSum(
      Long netflowIndexedEventsCountAggSum) {
    this.netflowIndexedEventsCountAggSum = netflowIndexedEventsCountAggSum;
    return this;
  }

  /**
   * Shows the sum of all Network flows indexed over all hours in the current month for all
   * organizations (To be deprecated on October 1st, 2024).
   *
   * @return netflowIndexedEventsCountAggSum
   * @deprecated
   */
  @Deprecated
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NETFLOW_INDEXED_EVENTS_COUNT_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getNetflowIndexedEventsCountAggSum() {
    return netflowIndexedEventsCountAggSum;
  }

  @Deprecated
  public void setNetflowIndexedEventsCountAggSum(Long netflowIndexedEventsCountAggSum) {
    this.netflowIndexedEventsCountAggSum = netflowIndexedEventsCountAggSum;
    putAdditionalProperty(
        JSON_PROPERTY_NETFLOW_INDEXED_EVENTS_COUNT_AGG_SUM, netflowIndexedEventsCountAggSum);
  }

  public UsageSummaryResponse networkDeviceWirelessTop99pSum(Long networkDeviceWirelessTop99pSum) {
    this.networkDeviceWirelessTop99pSum = networkDeviceWirelessTop99pSum;
    return this;
  }

  /**
   * Shows the 99th percentile of all Network Device Monitoring wireless devices over all hours in
   * the current month for all organizations.
   *
   * @return networkDeviceWirelessTop99pSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NETWORK_DEVICE_WIRELESS_TOP99P_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getNetworkDeviceWirelessTop99pSum() {
    return networkDeviceWirelessTop99pSum;
  }

  public void setNetworkDeviceWirelessTop99pSum(Long networkDeviceWirelessTop99pSum) {
    this.networkDeviceWirelessTop99pSum = networkDeviceWirelessTop99pSum;
    putAdditionalProperty(
        JSON_PROPERTY_NETWORK_DEVICE_WIRELESS_TOP99P_SUM, networkDeviceWirelessTop99pSum);
  }

  public UsageSummaryResponse networkPathAggSum(Long networkPathAggSum) {
    this.networkPathAggSum = networkPathAggSum;
    return this;
  }

  /**
   * Shows the sum of all Network Path scheduled tests over all hours in the current month for all
   * organizations.
   *
   * @return networkPathAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NETWORK_PATH_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getNetworkPathAggSum() {
    return networkPathAggSum;
  }

  public void setNetworkPathAggSum(Long networkPathAggSum) {
    this.networkPathAggSum = networkPathAggSum;
    putAdditionalProperty(JSON_PROPERTY_NETWORK_PATH_AGG_SUM, networkPathAggSum);
  }

  public UsageSummaryResponse npmHostTop99pSum(Long npmHostTop99pSum) {
    this.npmHostTop99pSum = npmHostTop99pSum;
    return this;
  }

  /**
   * Shows the 99th percentile of all distinct Cloud Network Monitoring hosts (formerly known as
   * Network hosts) over all hours in the current month for all organizations.
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
    putAdditionalProperty(JSON_PROPERTY_NPM_HOST_TOP99P_SUM, npmHostTop99pSum);
  }

  public UsageSummaryResponse observabilityPipelinesBytesProcessedAggSum(
      Long observabilityPipelinesBytesProcessedAggSum) {
    this.observabilityPipelinesBytesProcessedAggSum = observabilityPipelinesBytesProcessedAggSum;
    return this;
  }

  /**
   * Sum of all observability pipelines bytes processed over all hours in the current month for all
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
    putAdditionalProperty(
        JSON_PROPERTY_OBSERVABILITY_PIPELINES_BYTES_PROCESSED_AGG_SUM,
        observabilityPipelinesBytesProcessedAggSum);
  }

  public UsageSummaryResponse ociHostAggSum(Long ociHostAggSum) {
    this.ociHostAggSum = ociHostAggSum;
    return this;
  }

  /**
   * Shows the sum of Oracle Cloud Infrastructure hosts over all hours in the current months for all
   * organizations
   *
   * @return ociHostAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OCI_HOST_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getOciHostAggSum() {
    return ociHostAggSum;
  }

  public void setOciHostAggSum(Long ociHostAggSum) {
    this.ociHostAggSum = ociHostAggSum;
    putAdditionalProperty(JSON_PROPERTY_OCI_HOST_AGG_SUM, ociHostAggSum);
  }

  public UsageSummaryResponse ociHostTop99pSum(Long ociHostTop99pSum) {
    this.ociHostTop99pSum = ociHostTop99pSum;
    return this;
  }

  /**
   * Shows the 99th percentile of Oracle Cloud Infrastructure hosts over all hours in the current
   * months for all organizations
   *
   * @return ociHostTop99pSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OCI_HOST_TOP99P_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getOciHostTop99pSum() {
    return ociHostTop99pSum;
  }

  public void setOciHostTop99pSum(Long ociHostTop99pSum) {
    this.ociHostTop99pSum = ociHostTop99pSum;
    putAdditionalProperty(JSON_PROPERTY_OCI_HOST_TOP99P_SUM, ociHostTop99pSum);
  }

  public UsageSummaryResponse onCallSeatHwmSum(Long onCallSeatHwmSum) {
    this.onCallSeatHwmSum = onCallSeatHwmSum;
    return this;
  }

  /**
   * Shows the sum of the high-water marks of On-Call seats over all hours in the current month for
   * all organizations.
   *
   * @return onCallSeatHwmSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ON_CALL_SEAT_HWM_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getOnCallSeatHwmSum() {
    return onCallSeatHwmSum;
  }

  public void setOnCallSeatHwmSum(Long onCallSeatHwmSum) {
    this.onCallSeatHwmSum = onCallSeatHwmSum;
    putAdditionalProperty(JSON_PROPERTY_ON_CALL_SEAT_HWM_SUM, onCallSeatHwmSum);
  }

  public UsageSummaryResponse onlineArchiveEventsCountAggSum(Long onlineArchiveEventsCountAggSum) {
    this.onlineArchiveEventsCountAggSum = onlineArchiveEventsCountAggSum;
    return this;
  }

  /**
   * Sum of all online archived events over all hours in the current month for all organizations.
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
    putAdditionalProperty(
        JSON_PROPERTY_ONLINE_ARCHIVE_EVENTS_COUNT_AGG_SUM, onlineArchiveEventsCountAggSum);
  }

  public UsageSummaryResponse opentelemetryApmHostTop99pSum(Long opentelemetryApmHostTop99pSum) {
    this.opentelemetryApmHostTop99pSum = opentelemetryApmHostTop99pSum;
    return this;
  }

  /**
   * Shows the 99th percentile of APM hosts reported by the Datadog exporter for the OpenTelemetry
   * Collector over all hours in the current month for all organizations.
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
    putAdditionalProperty(
        JSON_PROPERTY_OPENTELEMETRY_APM_HOST_TOP99P_SUM, opentelemetryApmHostTop99pSum);
  }

  public UsageSummaryResponse opentelemetryHostTop99pSum(Long opentelemetryHostTop99pSum) {
    this.opentelemetryHostTop99pSum = opentelemetryHostTop99pSum;
    return this;
  }

  /**
   * Shows the 99th percentile of all hosts reported by the Datadog exporter for the OpenTelemetry
   * Collector over all hours in the current month for all organizations.
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
    putAdditionalProperty(JSON_PROPERTY_OPENTELEMETRY_HOST_TOP99P_SUM, opentelemetryHostTop99pSum);
  }

  public UsageSummaryResponse productAnalyticsAggSum(Long productAnalyticsAggSum) {
    this.productAnalyticsAggSum = productAnalyticsAggSum;
    return this;
  }

  /**
   * Sum of all product analytics sessions for all hours in the current month for all organizations.
   *
   * @return productAnalyticsAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRODUCT_ANALYTICS_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getProductAnalyticsAggSum() {
    return productAnalyticsAggSum;
  }

  public void setProductAnalyticsAggSum(Long productAnalyticsAggSum) {
    this.productAnalyticsAggSum = productAnalyticsAggSum;
    putAdditionalProperty(JSON_PROPERTY_PRODUCT_ANALYTICS_AGG_SUM, productAnalyticsAggSum);
  }

  public UsageSummaryResponse profilingAasCountTop99pSum(Long profilingAasCountTop99pSum) {
    this.profilingAasCountTop99pSum = profilingAasCountTop99pSum;
    return this;
  }

  /**
   * Shows the 99th percentile of all profiled Azure app services over all hours in the current
   * month for all organizations.
   *
   * @return profilingAasCountTop99pSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROFILING_AAS_COUNT_TOP99P_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getProfilingAasCountTop99pSum() {
    return profilingAasCountTop99pSum;
  }

  public void setProfilingAasCountTop99pSum(Long profilingAasCountTop99pSum) {
    this.profilingAasCountTop99pSum = profilingAasCountTop99pSum;
    putAdditionalProperty(JSON_PROPERTY_PROFILING_AAS_COUNT_TOP99P_SUM, profilingAasCountTop99pSum);
  }

  public UsageSummaryResponse profilingContainerAgentCountAvg(
      Long profilingContainerAgentCountAvg) {
    this.profilingContainerAgentCountAvg = profilingContainerAgentCountAvg;
    return this;
  }

  /**
   * Shows the average number of profiled containers over all hours in the current month for all
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
    putAdditionalProperty(
        JSON_PROPERTY_PROFILING_CONTAINER_AGENT_COUNT_AVG, profilingContainerAgentCountAvg);
  }

  public UsageSummaryResponse profilingHostCountTop99pSum(Long profilingHostCountTop99pSum) {
    this.profilingHostCountTop99pSum = profilingHostCountTop99pSum;
    return this;
  }

  /**
   * Shows the 99th percentile of all profiled hosts over all hours in the current month for all
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
    putAdditionalProperty(
        JSON_PROPERTY_PROFILING_HOST_COUNT_TOP99P_SUM, profilingHostCountTop99pSum);
  }

  public UsageSummaryResponse proxmoxHostAggSum(Long proxmoxHostAggSum) {
    this.proxmoxHostAggSum = proxmoxHostAggSum;
    return this;
  }

  /**
   * Sum of all Proxmox hosts over all hours in the current month for all organizations.
   *
   * @return proxmoxHostAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROXMOX_HOST_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getProxmoxHostAggSum() {
    return proxmoxHostAggSum;
  }

  public void setProxmoxHostAggSum(Long proxmoxHostAggSum) {
    this.proxmoxHostAggSum = proxmoxHostAggSum;
    putAdditionalProperty(JSON_PROPERTY_PROXMOX_HOST_AGG_SUM, proxmoxHostAggSum);
  }

  public UsageSummaryResponse proxmoxHostTop99pSum(Long proxmoxHostTop99pSum) {
    this.proxmoxHostTop99pSum = proxmoxHostTop99pSum;
    return this;
  }

  /**
   * Sum of the 99th percentile of all Proxmox hosts over all hours in the current month for all
   * organizations.
   *
   * @return proxmoxHostTop99pSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROXMOX_HOST_TOP99P_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getProxmoxHostTop99pSum() {
    return proxmoxHostTop99pSum;
  }

  public void setProxmoxHostTop99pSum(Long proxmoxHostTop99pSum) {
    this.proxmoxHostTop99pSum = proxmoxHostTop99pSum;
    putAdditionalProperty(JSON_PROPERTY_PROXMOX_HOST_TOP99P_SUM, proxmoxHostTop99pSum);
  }

  public UsageSummaryResponse publishedAppHwmSum(Long publishedAppHwmSum) {
    this.publishedAppHwmSum = publishedAppHwmSum;
    return this;
  }

  /**
   * Shows the high-water mark of all published applications over all hours in the current month for
   * all organizations.
   *
   * @return publishedAppHwmSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PUBLISHED_APP_HWM_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getPublishedAppHwmSum() {
    return publishedAppHwmSum;
  }

  public void setPublishedAppHwmSum(Long publishedAppHwmSum) {
    this.publishedAppHwmSum = publishedAppHwmSum;
    putAdditionalProperty(JSON_PROPERTY_PUBLISHED_APP_HWM_SUM, publishedAppHwmSum);
  }

  public UsageSummaryResponse rehydratedIndexedEventsAggSum(Long rehydratedIndexedEventsAggSum) {
    this.rehydratedIndexedEventsAggSum = rehydratedIndexedEventsAggSum;
    return this;
  }

  /**
   * Shows the sum of all rehydrated logs indexed over all hours in the current month for all
   * organizations (To be deprecated on October 1st, 2024).
   *
   * @return rehydratedIndexedEventsAggSum
   * @deprecated
   */
  @Deprecated
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REHYDRATED_INDEXED_EVENTS_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getRehydratedIndexedEventsAggSum() {
    return rehydratedIndexedEventsAggSum;
  }

  @Deprecated
  public void setRehydratedIndexedEventsAggSum(Long rehydratedIndexedEventsAggSum) {
    this.rehydratedIndexedEventsAggSum = rehydratedIndexedEventsAggSum;
    putAdditionalProperty(
        JSON_PROPERTY_REHYDRATED_INDEXED_EVENTS_AGG_SUM, rehydratedIndexedEventsAggSum);
  }

  public UsageSummaryResponse rehydratedIngestedBytesAggSum(Long rehydratedIngestedBytesAggSum) {
    this.rehydratedIngestedBytesAggSum = rehydratedIngestedBytesAggSum;
    return this;
  }

  /**
   * Shows the sum of all rehydrated logs bytes ingested over all hours in the current month for all
   * organizations (data available as of December 1, 2020).
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
    putAdditionalProperty(
        JSON_PROPERTY_REHYDRATED_INGESTED_BYTES_AGG_SUM, rehydratedIngestedBytesAggSum);
  }

  public UsageSummaryResponse rumBrowserAndMobileSessionCount(
      Long rumBrowserAndMobileSessionCount) {
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
    putAdditionalProperty(
        JSON_PROPERTY_RUM_BROWSER_AND_MOBILE_SESSION_COUNT, rumBrowserAndMobileSessionCount);
  }

  public UsageSummaryResponse rumBrowserLegacySessionCountAggSum(
      Long rumBrowserLegacySessionCountAggSum) {
    this.rumBrowserLegacySessionCountAggSum = rumBrowserLegacySessionCountAggSum;
    return this;
  }

  /**
   * Shows the sum of all browser RUM legacy sessions over all hours in the current month for all
   * organizations (To be introduced on October 1st, 2024).
   *
   * @return rumBrowserLegacySessionCountAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RUM_BROWSER_LEGACY_SESSION_COUNT_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getRumBrowserLegacySessionCountAggSum() {
    return rumBrowserLegacySessionCountAggSum;
  }

  public void setRumBrowserLegacySessionCountAggSum(Long rumBrowserLegacySessionCountAggSum) {
    this.rumBrowserLegacySessionCountAggSum = rumBrowserLegacySessionCountAggSum;
    putAdditionalProperty(
        JSON_PROPERTY_RUM_BROWSER_LEGACY_SESSION_COUNT_AGG_SUM, rumBrowserLegacySessionCountAggSum);
  }

  public UsageSummaryResponse rumBrowserLiteSessionCountAggSum(
      Long rumBrowserLiteSessionCountAggSum) {
    this.rumBrowserLiteSessionCountAggSum = rumBrowserLiteSessionCountAggSum;
    return this;
  }

  /**
   * Shows the sum of all browser RUM lite sessions over all hours in the current month for all
   * organizations (To be introduced on October 1st, 2024).
   *
   * @return rumBrowserLiteSessionCountAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RUM_BROWSER_LITE_SESSION_COUNT_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getRumBrowserLiteSessionCountAggSum() {
    return rumBrowserLiteSessionCountAggSum;
  }

  public void setRumBrowserLiteSessionCountAggSum(Long rumBrowserLiteSessionCountAggSum) {
    this.rumBrowserLiteSessionCountAggSum = rumBrowserLiteSessionCountAggSum;
    putAdditionalProperty(
        JSON_PROPERTY_RUM_BROWSER_LITE_SESSION_COUNT_AGG_SUM, rumBrowserLiteSessionCountAggSum);
  }

  public UsageSummaryResponse rumBrowserReplaySessionCountAggSum(
      Long rumBrowserReplaySessionCountAggSum) {
    this.rumBrowserReplaySessionCountAggSum = rumBrowserReplaySessionCountAggSum;
    return this;
  }

  /**
   * Shows the sum of all browser RUM Session Replay counts over all hours in the current month for
   * all organizations (To be introduced on October 1st, 2024).
   *
   * @return rumBrowserReplaySessionCountAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RUM_BROWSER_REPLAY_SESSION_COUNT_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getRumBrowserReplaySessionCountAggSum() {
    return rumBrowserReplaySessionCountAggSum;
  }

  public void setRumBrowserReplaySessionCountAggSum(Long rumBrowserReplaySessionCountAggSum) {
    this.rumBrowserReplaySessionCountAggSum = rumBrowserReplaySessionCountAggSum;
    putAdditionalProperty(
        JSON_PROPERTY_RUM_BROWSER_REPLAY_SESSION_COUNT_AGG_SUM, rumBrowserReplaySessionCountAggSum);
  }

  public UsageSummaryResponse rumIndexedSessionsAggSum(Long rumIndexedSessionsAggSum) {
    this.rumIndexedSessionsAggSum = rumIndexedSessionsAggSum;
    return this;
  }

  /**
   * Sum of all RUM indexed sessions for all hours in the current month for all organizations.
   *
   * @return rumIndexedSessionsAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RUM_INDEXED_SESSIONS_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getRumIndexedSessionsAggSum() {
    return rumIndexedSessionsAggSum;
  }

  public void setRumIndexedSessionsAggSum(Long rumIndexedSessionsAggSum) {
    this.rumIndexedSessionsAggSum = rumIndexedSessionsAggSum;
    putAdditionalProperty(JSON_PROPERTY_RUM_INDEXED_SESSIONS_AGG_SUM, rumIndexedSessionsAggSum);
  }

  public UsageSummaryResponse rumIngestedSessionsAggSum(Long rumIngestedSessionsAggSum) {
    this.rumIngestedSessionsAggSum = rumIngestedSessionsAggSum;
    return this;
  }

  /**
   * Sum of all RUM ingested sessions for all hours in the current month for all organizations.
   *
   * @return rumIngestedSessionsAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RUM_INGESTED_SESSIONS_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getRumIngestedSessionsAggSum() {
    return rumIngestedSessionsAggSum;
  }

  public void setRumIngestedSessionsAggSum(Long rumIngestedSessionsAggSum) {
    this.rumIngestedSessionsAggSum = rumIngestedSessionsAggSum;
    putAdditionalProperty(JSON_PROPERTY_RUM_INGESTED_SESSIONS_AGG_SUM, rumIngestedSessionsAggSum);
  }

  public UsageSummaryResponse rumLiteSessionCountAggSum(Long rumLiteSessionCountAggSum) {
    this.rumLiteSessionCountAggSum = rumLiteSessionCountAggSum;
    return this;
  }

  /**
   * Shows the sum of all RUM lite sessions (browser and mobile) over all hours in the current month
   * for all organizations (To be introduced on October 1st, 2024).
   *
   * @return rumLiteSessionCountAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RUM_LITE_SESSION_COUNT_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getRumLiteSessionCountAggSum() {
    return rumLiteSessionCountAggSum;
  }

  public void setRumLiteSessionCountAggSum(Long rumLiteSessionCountAggSum) {
    this.rumLiteSessionCountAggSum = rumLiteSessionCountAggSum;
    putAdditionalProperty(JSON_PROPERTY_RUM_LITE_SESSION_COUNT_AGG_SUM, rumLiteSessionCountAggSum);
  }

  public UsageSummaryResponse rumMobileLegacySessionCountAndroidAggSum(
      Long rumMobileLegacySessionCountAndroidAggSum) {
    this.rumMobileLegacySessionCountAndroidAggSum = rumMobileLegacySessionCountAndroidAggSum;
    return this;
  }

  /**
   * Shows the sum of all mobile RUM legacy sessions on Android over all hours in the current month
   * for all organizations (To be introduced on October 1st, 2024).
   *
   * @return rumMobileLegacySessionCountAndroidAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RUM_MOBILE_LEGACY_SESSION_COUNT_ANDROID_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getRumMobileLegacySessionCountAndroidAggSum() {
    return rumMobileLegacySessionCountAndroidAggSum;
  }

  public void setRumMobileLegacySessionCountAndroidAggSum(
      Long rumMobileLegacySessionCountAndroidAggSum) {
    this.rumMobileLegacySessionCountAndroidAggSum = rumMobileLegacySessionCountAndroidAggSum;
    putAdditionalProperty(
        JSON_PROPERTY_RUM_MOBILE_LEGACY_SESSION_COUNT_ANDROID_AGG_SUM,
        rumMobileLegacySessionCountAndroidAggSum);
  }

  public UsageSummaryResponse rumMobileLegacySessionCountFlutterAggSum(
      Long rumMobileLegacySessionCountFlutterAggSum) {
    this.rumMobileLegacySessionCountFlutterAggSum = rumMobileLegacySessionCountFlutterAggSum;
    return this;
  }

  /**
   * Shows the sum of all mobile RUM legacy sessions on Flutter over all hours in the current month
   * for all organizations (To be introduced on October 1st, 2024).
   *
   * @return rumMobileLegacySessionCountFlutterAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RUM_MOBILE_LEGACY_SESSION_COUNT_FLUTTER_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getRumMobileLegacySessionCountFlutterAggSum() {
    return rumMobileLegacySessionCountFlutterAggSum;
  }

  public void setRumMobileLegacySessionCountFlutterAggSum(
      Long rumMobileLegacySessionCountFlutterAggSum) {
    this.rumMobileLegacySessionCountFlutterAggSum = rumMobileLegacySessionCountFlutterAggSum;
    putAdditionalProperty(
        JSON_PROPERTY_RUM_MOBILE_LEGACY_SESSION_COUNT_FLUTTER_AGG_SUM,
        rumMobileLegacySessionCountFlutterAggSum);
  }

  public UsageSummaryResponse rumMobileLegacySessionCountIosAggSum(
      Long rumMobileLegacySessionCountIosAggSum) {
    this.rumMobileLegacySessionCountIosAggSum = rumMobileLegacySessionCountIosAggSum;
    return this;
  }

  /**
   * Shows the sum of all mobile RUM legacy sessions on iOS over all hours in the current month for
   * all organizations (To be introduced on October 1st, 2024).
   *
   * @return rumMobileLegacySessionCountIosAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RUM_MOBILE_LEGACY_SESSION_COUNT_IOS_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getRumMobileLegacySessionCountIosAggSum() {
    return rumMobileLegacySessionCountIosAggSum;
  }

  public void setRumMobileLegacySessionCountIosAggSum(Long rumMobileLegacySessionCountIosAggSum) {
    this.rumMobileLegacySessionCountIosAggSum = rumMobileLegacySessionCountIosAggSum;
    putAdditionalProperty(
        JSON_PROPERTY_RUM_MOBILE_LEGACY_SESSION_COUNT_IOS_AGG_SUM,
        rumMobileLegacySessionCountIosAggSum);
  }

  public UsageSummaryResponse rumMobileLegacySessionCountReactnativeAggSum(
      Long rumMobileLegacySessionCountReactnativeAggSum) {
    this.rumMobileLegacySessionCountReactnativeAggSum =
        rumMobileLegacySessionCountReactnativeAggSum;
    return this;
  }

  /**
   * Shows the sum of all mobile RUM legacy sessions on React Native over all hours in the current
   * month for all organizations (To be introduced on October 1st, 2024).
   *
   * @return rumMobileLegacySessionCountReactnativeAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RUM_MOBILE_LEGACY_SESSION_COUNT_REACTNATIVE_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getRumMobileLegacySessionCountReactnativeAggSum() {
    return rumMobileLegacySessionCountReactnativeAggSum;
  }

  public void setRumMobileLegacySessionCountReactnativeAggSum(
      Long rumMobileLegacySessionCountReactnativeAggSum) {
    this.rumMobileLegacySessionCountReactnativeAggSum =
        rumMobileLegacySessionCountReactnativeAggSum;
    putAdditionalProperty(
        JSON_PROPERTY_RUM_MOBILE_LEGACY_SESSION_COUNT_REACTNATIVE_AGG_SUM,
        rumMobileLegacySessionCountReactnativeAggSum);
  }

  public UsageSummaryResponse rumMobileLegacySessionCountRokuAggSum(
      Long rumMobileLegacySessionCountRokuAggSum) {
    this.rumMobileLegacySessionCountRokuAggSum = rumMobileLegacySessionCountRokuAggSum;
    return this;
  }

  /**
   * Shows the sum of all mobile RUM legacy sessions on Roku over all hours in the current month for
   * all organizations (To be introduced on October 1st, 2024).
   *
   * @return rumMobileLegacySessionCountRokuAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RUM_MOBILE_LEGACY_SESSION_COUNT_ROKU_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getRumMobileLegacySessionCountRokuAggSum() {
    return rumMobileLegacySessionCountRokuAggSum;
  }

  public void setRumMobileLegacySessionCountRokuAggSum(Long rumMobileLegacySessionCountRokuAggSum) {
    this.rumMobileLegacySessionCountRokuAggSum = rumMobileLegacySessionCountRokuAggSum;
    putAdditionalProperty(
        JSON_PROPERTY_RUM_MOBILE_LEGACY_SESSION_COUNT_ROKU_AGG_SUM,
        rumMobileLegacySessionCountRokuAggSum);
  }

  public UsageSummaryResponse rumMobileLiteSessionCountAndroidAggSum(
      Long rumMobileLiteSessionCountAndroidAggSum) {
    this.rumMobileLiteSessionCountAndroidAggSum = rumMobileLiteSessionCountAndroidAggSum;
    return this;
  }

  /**
   * Shows the sum of all mobile RUM lite sessions on Android over all hours in the current month
   * for all organizations (To be introduced on October 1st, 2024).
   *
   * @return rumMobileLiteSessionCountAndroidAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RUM_MOBILE_LITE_SESSION_COUNT_ANDROID_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getRumMobileLiteSessionCountAndroidAggSum() {
    return rumMobileLiteSessionCountAndroidAggSum;
  }

  public void setRumMobileLiteSessionCountAndroidAggSum(
      Long rumMobileLiteSessionCountAndroidAggSum) {
    this.rumMobileLiteSessionCountAndroidAggSum = rumMobileLiteSessionCountAndroidAggSum;
    putAdditionalProperty(
        JSON_PROPERTY_RUM_MOBILE_LITE_SESSION_COUNT_ANDROID_AGG_SUM,
        rumMobileLiteSessionCountAndroidAggSum);
  }

  public UsageSummaryResponse rumMobileLiteSessionCountFlutterAggSum(
      Long rumMobileLiteSessionCountFlutterAggSum) {
    this.rumMobileLiteSessionCountFlutterAggSum = rumMobileLiteSessionCountFlutterAggSum;
    return this;
  }

  /**
   * Shows the sum of all mobile RUM lite sessions on Flutter over all hours in the current month
   * for all organizations (To be introduced on October 1st, 2024).
   *
   * @return rumMobileLiteSessionCountFlutterAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RUM_MOBILE_LITE_SESSION_COUNT_FLUTTER_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getRumMobileLiteSessionCountFlutterAggSum() {
    return rumMobileLiteSessionCountFlutterAggSum;
  }

  public void setRumMobileLiteSessionCountFlutterAggSum(
      Long rumMobileLiteSessionCountFlutterAggSum) {
    this.rumMobileLiteSessionCountFlutterAggSum = rumMobileLiteSessionCountFlutterAggSum;
    putAdditionalProperty(
        JSON_PROPERTY_RUM_MOBILE_LITE_SESSION_COUNT_FLUTTER_AGG_SUM,
        rumMobileLiteSessionCountFlutterAggSum);
  }

  public UsageSummaryResponse rumMobileLiteSessionCountIosAggSum(
      Long rumMobileLiteSessionCountIosAggSum) {
    this.rumMobileLiteSessionCountIosAggSum = rumMobileLiteSessionCountIosAggSum;
    return this;
  }

  /**
   * Shows the sum of all mobile RUM lite sessions on iOS over all hours in the current month for
   * all organizations (To be introduced on October 1st, 2024).
   *
   * @return rumMobileLiteSessionCountIosAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RUM_MOBILE_LITE_SESSION_COUNT_IOS_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getRumMobileLiteSessionCountIosAggSum() {
    return rumMobileLiteSessionCountIosAggSum;
  }

  public void setRumMobileLiteSessionCountIosAggSum(Long rumMobileLiteSessionCountIosAggSum) {
    this.rumMobileLiteSessionCountIosAggSum = rumMobileLiteSessionCountIosAggSum;
    putAdditionalProperty(
        JSON_PROPERTY_RUM_MOBILE_LITE_SESSION_COUNT_IOS_AGG_SUM,
        rumMobileLiteSessionCountIosAggSum);
  }

  public UsageSummaryResponse rumMobileLiteSessionCountKotlinmultiplatformAggSum(
      Long rumMobileLiteSessionCountKotlinmultiplatformAggSum) {
    this.rumMobileLiteSessionCountKotlinmultiplatformAggSum =
        rumMobileLiteSessionCountKotlinmultiplatformAggSum;
    return this;
  }

  /**
   * Shows the sum of all mobile RUM lite sessions on Kotlin Multiplatform over all hours within the
   * current month for all organizations.
   *
   * @return rumMobileLiteSessionCountKotlinmultiplatformAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RUM_MOBILE_LITE_SESSION_COUNT_KOTLINMULTIPLATFORM_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getRumMobileLiteSessionCountKotlinmultiplatformAggSum() {
    return rumMobileLiteSessionCountKotlinmultiplatformAggSum;
  }

  public void setRumMobileLiteSessionCountKotlinmultiplatformAggSum(
      Long rumMobileLiteSessionCountKotlinmultiplatformAggSum) {
    this.rumMobileLiteSessionCountKotlinmultiplatformAggSum =
        rumMobileLiteSessionCountKotlinmultiplatformAggSum;
    putAdditionalProperty(
        JSON_PROPERTY_RUM_MOBILE_LITE_SESSION_COUNT_KOTLINMULTIPLATFORM_AGG_SUM,
        rumMobileLiteSessionCountKotlinmultiplatformAggSum);
  }

  public UsageSummaryResponse rumMobileLiteSessionCountReactnativeAggSum(
      Long rumMobileLiteSessionCountReactnativeAggSum) {
    this.rumMobileLiteSessionCountReactnativeAggSum = rumMobileLiteSessionCountReactnativeAggSum;
    return this;
  }

  /**
   * Shows the sum of all mobile RUM lite sessions on React Native over all hours in the current
   * month for all organizations (To be introduced on October 1st, 2024).
   *
   * @return rumMobileLiteSessionCountReactnativeAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RUM_MOBILE_LITE_SESSION_COUNT_REACTNATIVE_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getRumMobileLiteSessionCountReactnativeAggSum() {
    return rumMobileLiteSessionCountReactnativeAggSum;
  }

  public void setRumMobileLiteSessionCountReactnativeAggSum(
      Long rumMobileLiteSessionCountReactnativeAggSum) {
    this.rumMobileLiteSessionCountReactnativeAggSum = rumMobileLiteSessionCountReactnativeAggSum;
    putAdditionalProperty(
        JSON_PROPERTY_RUM_MOBILE_LITE_SESSION_COUNT_REACTNATIVE_AGG_SUM,
        rumMobileLiteSessionCountReactnativeAggSum);
  }

  public UsageSummaryResponse rumMobileLiteSessionCountRokuAggSum(
      Long rumMobileLiteSessionCountRokuAggSum) {
    this.rumMobileLiteSessionCountRokuAggSum = rumMobileLiteSessionCountRokuAggSum;
    return this;
  }

  /**
   * Shows the sum of all mobile RUM lite sessions on Roku over all hours within the current month
   * for all organizations (To be introduced on October 1st, 2024).
   *
   * @return rumMobileLiteSessionCountRokuAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RUM_MOBILE_LITE_SESSION_COUNT_ROKU_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getRumMobileLiteSessionCountRokuAggSum() {
    return rumMobileLiteSessionCountRokuAggSum;
  }

  public void setRumMobileLiteSessionCountRokuAggSum(Long rumMobileLiteSessionCountRokuAggSum) {
    this.rumMobileLiteSessionCountRokuAggSum = rumMobileLiteSessionCountRokuAggSum;
    putAdditionalProperty(
        JSON_PROPERTY_RUM_MOBILE_LITE_SESSION_COUNT_ROKU_AGG_SUM,
        rumMobileLiteSessionCountRokuAggSum);
  }

  public UsageSummaryResponse rumMobileLiteSessionCountUnityAggSum(
      Long rumMobileLiteSessionCountUnityAggSum) {
    this.rumMobileLiteSessionCountUnityAggSum = rumMobileLiteSessionCountUnityAggSum;
    return this;
  }

  /**
   * Shows the sum of all mobile RUM lite sessions on Unity over all hours within the current month
   * for all organizations.
   *
   * @return rumMobileLiteSessionCountUnityAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RUM_MOBILE_LITE_SESSION_COUNT_UNITY_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getRumMobileLiteSessionCountUnityAggSum() {
    return rumMobileLiteSessionCountUnityAggSum;
  }

  public void setRumMobileLiteSessionCountUnityAggSum(Long rumMobileLiteSessionCountUnityAggSum) {
    this.rumMobileLiteSessionCountUnityAggSum = rumMobileLiteSessionCountUnityAggSum;
    putAdditionalProperty(
        JSON_PROPERTY_RUM_MOBILE_LITE_SESSION_COUNT_UNITY_AGG_SUM,
        rumMobileLiteSessionCountUnityAggSum);
  }

  public UsageSummaryResponse rumMobileReplaySessionCountAndroidAggSum(
      Long rumMobileReplaySessionCountAndroidAggSum) {
    this.rumMobileReplaySessionCountAndroidAggSum = rumMobileReplaySessionCountAndroidAggSum;
    return this;
  }

  /**
   * Shows the sum of all mobile RUM replay sessions on Android over all hours within the current
   * month for all organizations.
   *
   * @return rumMobileReplaySessionCountAndroidAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RUM_MOBILE_REPLAY_SESSION_COUNT_ANDROID_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getRumMobileReplaySessionCountAndroidAggSum() {
    return rumMobileReplaySessionCountAndroidAggSum;
  }

  public void setRumMobileReplaySessionCountAndroidAggSum(
      Long rumMobileReplaySessionCountAndroidAggSum) {
    this.rumMobileReplaySessionCountAndroidAggSum = rumMobileReplaySessionCountAndroidAggSum;
    putAdditionalProperty(
        JSON_PROPERTY_RUM_MOBILE_REPLAY_SESSION_COUNT_ANDROID_AGG_SUM,
        rumMobileReplaySessionCountAndroidAggSum);
  }

  public UsageSummaryResponse rumMobileReplaySessionCountIosAggSum(
      Long rumMobileReplaySessionCountIosAggSum) {
    this.rumMobileReplaySessionCountIosAggSum = rumMobileReplaySessionCountIosAggSum;
    return this;
  }

  /**
   * Shows the sum of all mobile RUM replay sessions on iOS over all hours within the current month
   * for all organizations.
   *
   * @return rumMobileReplaySessionCountIosAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RUM_MOBILE_REPLAY_SESSION_COUNT_IOS_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getRumMobileReplaySessionCountIosAggSum() {
    return rumMobileReplaySessionCountIosAggSum;
  }

  public void setRumMobileReplaySessionCountIosAggSum(Long rumMobileReplaySessionCountIosAggSum) {
    this.rumMobileReplaySessionCountIosAggSum = rumMobileReplaySessionCountIosAggSum;
    putAdditionalProperty(
        JSON_PROPERTY_RUM_MOBILE_REPLAY_SESSION_COUNT_IOS_AGG_SUM,
        rumMobileReplaySessionCountIosAggSum);
  }

  public UsageSummaryResponse rumMobileReplaySessionCountKotlinmultiplatformAggSum(
      Long rumMobileReplaySessionCountKotlinmultiplatformAggSum) {
    this.rumMobileReplaySessionCountKotlinmultiplatformAggSum =
        rumMobileReplaySessionCountKotlinmultiplatformAggSum;
    return this;
  }

  /**
   * Shows the sum of all mobile RUM replay sessions on Kotlin Multiplatform over all hours within
   * the current month for all organizations.
   *
   * @return rumMobileReplaySessionCountKotlinmultiplatformAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RUM_MOBILE_REPLAY_SESSION_COUNT_KOTLINMULTIPLATFORM_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getRumMobileReplaySessionCountKotlinmultiplatformAggSum() {
    return rumMobileReplaySessionCountKotlinmultiplatformAggSum;
  }

  public void setRumMobileReplaySessionCountKotlinmultiplatformAggSum(
      Long rumMobileReplaySessionCountKotlinmultiplatformAggSum) {
    this.rumMobileReplaySessionCountKotlinmultiplatformAggSum =
        rumMobileReplaySessionCountKotlinmultiplatformAggSum;
    putAdditionalProperty(
        JSON_PROPERTY_RUM_MOBILE_REPLAY_SESSION_COUNT_KOTLINMULTIPLATFORM_AGG_SUM,
        rumMobileReplaySessionCountKotlinmultiplatformAggSum);
  }

  public UsageSummaryResponse rumMobileReplaySessionCountReactnativeAggSum(
      Long rumMobileReplaySessionCountReactnativeAggSum) {
    this.rumMobileReplaySessionCountReactnativeAggSum =
        rumMobileReplaySessionCountReactnativeAggSum;
    return this;
  }

  /**
   * Shows the sum of all mobile RUM replay sessions on React Native over all hours within the
   * current month for all organizations.
   *
   * @return rumMobileReplaySessionCountReactnativeAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RUM_MOBILE_REPLAY_SESSION_COUNT_REACTNATIVE_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getRumMobileReplaySessionCountReactnativeAggSum() {
    return rumMobileReplaySessionCountReactnativeAggSum;
  }

  public void setRumMobileReplaySessionCountReactnativeAggSum(
      Long rumMobileReplaySessionCountReactnativeAggSum) {
    this.rumMobileReplaySessionCountReactnativeAggSum =
        rumMobileReplaySessionCountReactnativeAggSum;
    putAdditionalProperty(
        JSON_PROPERTY_RUM_MOBILE_REPLAY_SESSION_COUNT_REACTNATIVE_AGG_SUM,
        rumMobileReplaySessionCountReactnativeAggSum);
  }

  public UsageSummaryResponse rumReplaySessionCountAggSum(Long rumReplaySessionCountAggSum) {
    this.rumReplaySessionCountAggSum = rumReplaySessionCountAggSum;
    return this;
  }

  /**
   * Shows the sum of all RUM Session Replay counts over all hours in the current month for all
   * organizations (To be introduced on October 1st, 2024).
   *
   * @return rumReplaySessionCountAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RUM_REPLAY_SESSION_COUNT_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getRumReplaySessionCountAggSum() {
    return rumReplaySessionCountAggSum;
  }

  public void setRumReplaySessionCountAggSum(Long rumReplaySessionCountAggSum) {
    this.rumReplaySessionCountAggSum = rumReplaySessionCountAggSum;
    putAdditionalProperty(
        JSON_PROPERTY_RUM_REPLAY_SESSION_COUNT_AGG_SUM, rumReplaySessionCountAggSum);
  }

  public UsageSummaryResponse rumSessionCountAggSum(Long rumSessionCountAggSum) {
    this.rumSessionCountAggSum = rumSessionCountAggSum;
    return this;
  }

  /**
   * Shows the sum of all browser RUM lite sessions over all hours in the current month for all
   * organizations (To be deprecated on October 1st, 2024).
   *
   * @return rumSessionCountAggSum
   * @deprecated
   */
  @Deprecated
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RUM_SESSION_COUNT_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getRumSessionCountAggSum() {
    return rumSessionCountAggSum;
  }

  @Deprecated
  public void setRumSessionCountAggSum(Long rumSessionCountAggSum) {
    this.rumSessionCountAggSum = rumSessionCountAggSum;
    putAdditionalProperty(JSON_PROPERTY_RUM_SESSION_COUNT_AGG_SUM, rumSessionCountAggSum);
  }

  public UsageSummaryResponse rumSessionReplayAddOnAggSum(Long rumSessionReplayAddOnAggSum) {
    this.rumSessionReplayAddOnAggSum = rumSessionReplayAddOnAggSum;
    return this;
  }

  /**
   * Sum of all RUM session replay add-on sessions for all hours in the current month for all
   * organizations.
   *
   * @return rumSessionReplayAddOnAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RUM_SESSION_REPLAY_ADD_ON_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getRumSessionReplayAddOnAggSum() {
    return rumSessionReplayAddOnAggSum;
  }

  public void setRumSessionReplayAddOnAggSum(Long rumSessionReplayAddOnAggSum) {
    this.rumSessionReplayAddOnAggSum = rumSessionReplayAddOnAggSum;
    putAdditionalProperty(
        JSON_PROPERTY_RUM_SESSION_REPLAY_ADD_ON_AGG_SUM, rumSessionReplayAddOnAggSum);
  }

  public UsageSummaryResponse rumTotalSessionCountAggSum(Long rumTotalSessionCountAggSum) {
    this.rumTotalSessionCountAggSum = rumTotalSessionCountAggSum;
    return this;
  }

  /**
   * Shows the sum of RUM sessions (browser and mobile) over all hours in the current month for all
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
    putAdditionalProperty(
        JSON_PROPERTY_RUM_TOTAL_SESSION_COUNT_AGG_SUM, rumTotalSessionCountAggSum);
  }

  public UsageSummaryResponse rumUnitsAggSum(Long rumUnitsAggSum) {
    this.rumUnitsAggSum = rumUnitsAggSum;
    return this;
  }

  /**
   * Shows the sum of all browser and mobile RUM units over all hours in the current month for all
   * organizations (To be deprecated on October 1st, 2024).
   *
   * @return rumUnitsAggSum
   * @deprecated
   */
  @Deprecated
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RUM_UNITS_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getRumUnitsAggSum() {
    return rumUnitsAggSum;
  }

  @Deprecated
  public void setRumUnitsAggSum(Long rumUnitsAggSum) {
    this.rumUnitsAggSum = rumUnitsAggSum;
    putAdditionalProperty(JSON_PROPERTY_RUM_UNITS_AGG_SUM, rumUnitsAggSum);
  }

  public UsageSummaryResponse scaFargateCountAvgSum(Long scaFargateCountAvgSum) {
    this.scaFargateCountAvgSum = scaFargateCountAvgSum;
    return this;
  }

  /**
   * Shows the average of all Software Composition Analysis Fargate tasks over all hours in the
   * current months for all organizations.
   *
   * @return scaFargateCountAvgSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCA_FARGATE_COUNT_AVG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getScaFargateCountAvgSum() {
    return scaFargateCountAvgSum;
  }

  public void setScaFargateCountAvgSum(Long scaFargateCountAvgSum) {
    this.scaFargateCountAvgSum = scaFargateCountAvgSum;
    putAdditionalProperty(JSON_PROPERTY_SCA_FARGATE_COUNT_AVG_SUM, scaFargateCountAvgSum);
  }

  public UsageSummaryResponse scaFargateCountHwmSum(Long scaFargateCountHwmSum) {
    this.scaFargateCountHwmSum = scaFargateCountHwmSum;
    return this;
  }

  /**
   * Shows the sum of the high-water marks of all Software Composition Analysis Fargate tasks over
   * all hours in the current months for all organizations.
   *
   * @return scaFargateCountHwmSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCA_FARGATE_COUNT_HWM_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getScaFargateCountHwmSum() {
    return scaFargateCountHwmSum;
  }

  public void setScaFargateCountHwmSum(Long scaFargateCountHwmSum) {
    this.scaFargateCountHwmSum = scaFargateCountHwmSum;
    putAdditionalProperty(JSON_PROPERTY_SCA_FARGATE_COUNT_HWM_SUM, scaFargateCountHwmSum);
  }

  public UsageSummaryResponse sdsApmScannedBytesSum(Long sdsApmScannedBytesSum) {
    this.sdsApmScannedBytesSum = sdsApmScannedBytesSum;
    return this;
  }

  /**
   * Sum of all APM bytes scanned with sensitive data scanner in the current month for all
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
    putAdditionalProperty(JSON_PROPERTY_SDS_APM_SCANNED_BYTES_SUM, sdsApmScannedBytesSum);
  }

  public UsageSummaryResponse sdsEventsScannedBytesSum(Long sdsEventsScannedBytesSum) {
    this.sdsEventsScannedBytesSum = sdsEventsScannedBytesSum;
    return this;
  }

  /**
   * Sum of all event stream events bytes scanned with sensitive data scanner in the current month
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
    putAdditionalProperty(JSON_PROPERTY_SDS_EVENTS_SCANNED_BYTES_SUM, sdsEventsScannedBytesSum);
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
    putAdditionalProperty(JSON_PROPERTY_SDS_LOGS_SCANNED_BYTES_SUM, sdsLogsScannedBytesSum);
  }

  public UsageSummaryResponse sdsRumScannedBytesSum(Long sdsRumScannedBytesSum) {
    this.sdsRumScannedBytesSum = sdsRumScannedBytesSum;
    return this;
  }

  /**
   * Sum of all RUM bytes scanned with sensitive data scanner in the current month for all
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
    putAdditionalProperty(JSON_PROPERTY_SDS_RUM_SCANNED_BYTES_SUM, sdsRumScannedBytesSum);
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
    putAdditionalProperty(JSON_PROPERTY_SDS_TOTAL_SCANNED_BYTES_SUM, sdsTotalScannedBytesSum);
  }

  public UsageSummaryResponse serverlessAppsApmApmAzureAppserviceInstancesAvgSum(
      Long serverlessAppsApmApmAzureAppserviceInstancesAvgSum) {
    this.serverlessAppsApmApmAzureAppserviceInstancesAvgSum =
        serverlessAppsApmApmAzureAppserviceInstancesAvgSum;
    return this;
  }

  /**
   * Sum of the average number of Serverless Apps with Application Performance Monitoring for Azure
   * App Service instances in the current month for all organizations.
   *
   * @return serverlessAppsApmApmAzureAppserviceInstancesAvgSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVERLESS_APPS_APM_APM_AZURE_APPSERVICE_INSTANCES_AVG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getServerlessAppsApmApmAzureAppserviceInstancesAvgSum() {
    return serverlessAppsApmApmAzureAppserviceInstancesAvgSum;
  }

  public void setServerlessAppsApmApmAzureAppserviceInstancesAvgSum(
      Long serverlessAppsApmApmAzureAppserviceInstancesAvgSum) {
    this.serverlessAppsApmApmAzureAppserviceInstancesAvgSum =
        serverlessAppsApmApmAzureAppserviceInstancesAvgSum;
    putAdditionalProperty(
        JSON_PROPERTY_SERVERLESS_APPS_APM_APM_AZURE_APPSERVICE_INSTANCES_AVG_SUM,
        serverlessAppsApmApmAzureAppserviceInstancesAvgSum);
  }

  public UsageSummaryResponse serverlessAppsApmApmAzureAzurefunctionInstancesAvgSum(
      Long serverlessAppsApmApmAzureAzurefunctionInstancesAvgSum) {
    this.serverlessAppsApmApmAzureAzurefunctionInstancesAvgSum =
        serverlessAppsApmApmAzureAzurefunctionInstancesAvgSum;
    return this;
  }

  /**
   * Sum of the average number of Serverless Apps with Application Performance Monitoring for Azure
   * Function instances in the current month for all organizations.
   *
   * @return serverlessAppsApmApmAzureAzurefunctionInstancesAvgSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVERLESS_APPS_APM_APM_AZURE_AZUREFUNCTION_INSTANCES_AVG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getServerlessAppsApmApmAzureAzurefunctionInstancesAvgSum() {
    return serverlessAppsApmApmAzureAzurefunctionInstancesAvgSum;
  }

  public void setServerlessAppsApmApmAzureAzurefunctionInstancesAvgSum(
      Long serverlessAppsApmApmAzureAzurefunctionInstancesAvgSum) {
    this.serverlessAppsApmApmAzureAzurefunctionInstancesAvgSum =
        serverlessAppsApmApmAzureAzurefunctionInstancesAvgSum;
    putAdditionalProperty(
        JSON_PROPERTY_SERVERLESS_APPS_APM_APM_AZURE_AZUREFUNCTION_INSTANCES_AVG_SUM,
        serverlessAppsApmApmAzureAzurefunctionInstancesAvgSum);
  }

  public UsageSummaryResponse serverlessAppsApmApmAzureContainerappInstancesAvgSum(
      Long serverlessAppsApmApmAzureContainerappInstancesAvgSum) {
    this.serverlessAppsApmApmAzureContainerappInstancesAvgSum =
        serverlessAppsApmApmAzureContainerappInstancesAvgSum;
    return this;
  }

  /**
   * Sum of the average number of Serverless Apps with Application Performance Monitoring for Azure
   * Container App instances in the current month for all organizations.
   *
   * @return serverlessAppsApmApmAzureContainerappInstancesAvgSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVERLESS_APPS_APM_APM_AZURE_CONTAINERAPP_INSTANCES_AVG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getServerlessAppsApmApmAzureContainerappInstancesAvgSum() {
    return serverlessAppsApmApmAzureContainerappInstancesAvgSum;
  }

  public void setServerlessAppsApmApmAzureContainerappInstancesAvgSum(
      Long serverlessAppsApmApmAzureContainerappInstancesAvgSum) {
    this.serverlessAppsApmApmAzureContainerappInstancesAvgSum =
        serverlessAppsApmApmAzureContainerappInstancesAvgSum;
    putAdditionalProperty(
        JSON_PROPERTY_SERVERLESS_APPS_APM_APM_AZURE_CONTAINERAPP_INSTANCES_AVG_SUM,
        serverlessAppsApmApmAzureContainerappInstancesAvgSum);
  }

  public UsageSummaryResponse serverlessAppsApmApmFargateEcsTasksAvgSum(
      Long serverlessAppsApmApmFargateEcsTasksAvgSum) {
    this.serverlessAppsApmApmFargateEcsTasksAvgSum = serverlessAppsApmApmFargateEcsTasksAvgSum;
    return this;
  }

  /**
   * Sum of the average number of Serverless Apps with Application Performance Monitoring for
   * Fargate Elastic Container Service tasks in the current month for all organizations.
   *
   * @return serverlessAppsApmApmFargateEcsTasksAvgSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVERLESS_APPS_APM_APM_FARGATE_ECS_TASKS_AVG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getServerlessAppsApmApmFargateEcsTasksAvgSum() {
    return serverlessAppsApmApmFargateEcsTasksAvgSum;
  }

  public void setServerlessAppsApmApmFargateEcsTasksAvgSum(
      Long serverlessAppsApmApmFargateEcsTasksAvgSum) {
    this.serverlessAppsApmApmFargateEcsTasksAvgSum = serverlessAppsApmApmFargateEcsTasksAvgSum;
    putAdditionalProperty(
        JSON_PROPERTY_SERVERLESS_APPS_APM_APM_FARGATE_ECS_TASKS_AVG_SUM,
        serverlessAppsApmApmFargateEcsTasksAvgSum);
  }

  public UsageSummaryResponse serverlessAppsApmApmGcpCloudfunctionInstancesAvgSum(
      Long serverlessAppsApmApmGcpCloudfunctionInstancesAvgSum) {
    this.serverlessAppsApmApmGcpCloudfunctionInstancesAvgSum =
        serverlessAppsApmApmGcpCloudfunctionInstancesAvgSum;
    return this;
  }

  /**
   * Sum of the average number of Serverless Apps with Application Performance Monitoring for Google
   * Cloud Platform Cloud Function instances in the current month for all organizations.
   *
   * @return serverlessAppsApmApmGcpCloudfunctionInstancesAvgSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVERLESS_APPS_APM_APM_GCP_CLOUDFUNCTION_INSTANCES_AVG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getServerlessAppsApmApmGcpCloudfunctionInstancesAvgSum() {
    return serverlessAppsApmApmGcpCloudfunctionInstancesAvgSum;
  }

  public void setServerlessAppsApmApmGcpCloudfunctionInstancesAvgSum(
      Long serverlessAppsApmApmGcpCloudfunctionInstancesAvgSum) {
    this.serverlessAppsApmApmGcpCloudfunctionInstancesAvgSum =
        serverlessAppsApmApmGcpCloudfunctionInstancesAvgSum;
    putAdditionalProperty(
        JSON_PROPERTY_SERVERLESS_APPS_APM_APM_GCP_CLOUDFUNCTION_INSTANCES_AVG_SUM,
        serverlessAppsApmApmGcpCloudfunctionInstancesAvgSum);
  }

  public UsageSummaryResponse serverlessAppsApmApmGcpCloudrunInstancesAvgSum(
      Long serverlessAppsApmApmGcpCloudrunInstancesAvgSum) {
    this.serverlessAppsApmApmGcpCloudrunInstancesAvgSum =
        serverlessAppsApmApmGcpCloudrunInstancesAvgSum;
    return this;
  }

  /**
   * Sum of the average number of Serverless Apps with Application Performance Monitoring for Google
   * Cloud Platform Cloud Run instances in the current month for all organizations.
   *
   * @return serverlessAppsApmApmGcpCloudrunInstancesAvgSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVERLESS_APPS_APM_APM_GCP_CLOUDRUN_INSTANCES_AVG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getServerlessAppsApmApmGcpCloudrunInstancesAvgSum() {
    return serverlessAppsApmApmGcpCloudrunInstancesAvgSum;
  }

  public void setServerlessAppsApmApmGcpCloudrunInstancesAvgSum(
      Long serverlessAppsApmApmGcpCloudrunInstancesAvgSum) {
    this.serverlessAppsApmApmGcpCloudrunInstancesAvgSum =
        serverlessAppsApmApmGcpCloudrunInstancesAvgSum;
    putAdditionalProperty(
        JSON_PROPERTY_SERVERLESS_APPS_APM_APM_GCP_CLOUDRUN_INSTANCES_AVG_SUM,
        serverlessAppsApmApmGcpCloudrunInstancesAvgSum);
  }

  public UsageSummaryResponse serverlessAppsApmApmGcpGkeAutopilotPodsAvgSum(
      Long serverlessAppsApmApmGcpGkeAutopilotPodsAvgSum) {
    this.serverlessAppsApmApmGcpGkeAutopilotPodsAvgSum =
        serverlessAppsApmApmGcpGkeAutopilotPodsAvgSum;
    return this;
  }

  /**
   * Sum of the average number of Serverless Apps with Application Performance Monitoring for Google
   * Kubernetes Engine Autopilot pods in the current month for all organizations.
   *
   * @return serverlessAppsApmApmGcpGkeAutopilotPodsAvgSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVERLESS_APPS_APM_APM_GCP_GKE_AUTOPILOT_PODS_AVG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getServerlessAppsApmApmGcpGkeAutopilotPodsAvgSum() {
    return serverlessAppsApmApmGcpGkeAutopilotPodsAvgSum;
  }

  public void setServerlessAppsApmApmGcpGkeAutopilotPodsAvgSum(
      Long serverlessAppsApmApmGcpGkeAutopilotPodsAvgSum) {
    this.serverlessAppsApmApmGcpGkeAutopilotPodsAvgSum =
        serverlessAppsApmApmGcpGkeAutopilotPodsAvgSum;
    putAdditionalProperty(
        JSON_PROPERTY_SERVERLESS_APPS_APM_APM_GCP_GKE_AUTOPILOT_PODS_AVG_SUM,
        serverlessAppsApmApmGcpGkeAutopilotPodsAvgSum);
  }

  public UsageSummaryResponse serverlessAppsApmAvgSum(Long serverlessAppsApmAvgSum) {
    this.serverlessAppsApmAvgSum = serverlessAppsApmAvgSum;
    return this;
  }

  /**
   * Sum of the average number of Serverless Apps with Application Performance Monitoring in the
   * current month for all organizations.
   *
   * @return serverlessAppsApmAvgSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVERLESS_APPS_APM_AVG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getServerlessAppsApmAvgSum() {
    return serverlessAppsApmAvgSum;
  }

  public void setServerlessAppsApmAvgSum(Long serverlessAppsApmAvgSum) {
    this.serverlessAppsApmAvgSum = serverlessAppsApmAvgSum;
    putAdditionalProperty(JSON_PROPERTY_SERVERLESS_APPS_APM_AVG_SUM, serverlessAppsApmAvgSum);
  }

  public UsageSummaryResponse serverlessAppsApmExclFargateApmAzureAppserviceInstancesAvgSum(
      Long serverlessAppsApmExclFargateApmAzureAppserviceInstancesAvgSum) {
    this.serverlessAppsApmExclFargateApmAzureAppserviceInstancesAvgSum =
        serverlessAppsApmExclFargateApmAzureAppserviceInstancesAvgSum;
    return this;
  }

  /**
   * Sum of the average number of Serverless Apps with Application Performance Monitoring excluding
   * Fargate for Azure App Service instances in the current month for all organizations.
   *
   * @return serverlessAppsApmExclFargateApmAzureAppserviceInstancesAvgSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(
      JSON_PROPERTY_SERVERLESS_APPS_APM_EXCL_FARGATE_APM_AZURE_APPSERVICE_INSTANCES_AVG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getServerlessAppsApmExclFargateApmAzureAppserviceInstancesAvgSum() {
    return serverlessAppsApmExclFargateApmAzureAppserviceInstancesAvgSum;
  }

  public void setServerlessAppsApmExclFargateApmAzureAppserviceInstancesAvgSum(
      Long serverlessAppsApmExclFargateApmAzureAppserviceInstancesAvgSum) {
    this.serverlessAppsApmExclFargateApmAzureAppserviceInstancesAvgSum =
        serverlessAppsApmExclFargateApmAzureAppserviceInstancesAvgSum;
    putAdditionalProperty(
        JSON_PROPERTY_SERVERLESS_APPS_APM_EXCL_FARGATE_APM_AZURE_APPSERVICE_INSTANCES_AVG_SUM,
        serverlessAppsApmExclFargateApmAzureAppserviceInstancesAvgSum);
  }

  public UsageSummaryResponse serverlessAppsApmExclFargateApmAzureAzurefunctionInstancesAvgSum(
      Long serverlessAppsApmExclFargateApmAzureAzurefunctionInstancesAvgSum) {
    this.serverlessAppsApmExclFargateApmAzureAzurefunctionInstancesAvgSum =
        serverlessAppsApmExclFargateApmAzureAzurefunctionInstancesAvgSum;
    return this;
  }

  /**
   * Sum of the average number of Serverless Apps with Application Performance Monitoring excluding
   * Fargate for Azure Function instances in the current month for all organizations.
   *
   * @return serverlessAppsApmExclFargateApmAzureAzurefunctionInstancesAvgSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(
      JSON_PROPERTY_SERVERLESS_APPS_APM_EXCL_FARGATE_APM_AZURE_AZUREFUNCTION_INSTANCES_AVG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getServerlessAppsApmExclFargateApmAzureAzurefunctionInstancesAvgSum() {
    return serverlessAppsApmExclFargateApmAzureAzurefunctionInstancesAvgSum;
  }

  public void setServerlessAppsApmExclFargateApmAzureAzurefunctionInstancesAvgSum(
      Long serverlessAppsApmExclFargateApmAzureAzurefunctionInstancesAvgSum) {
    this.serverlessAppsApmExclFargateApmAzureAzurefunctionInstancesAvgSum =
        serverlessAppsApmExclFargateApmAzureAzurefunctionInstancesAvgSum;
    putAdditionalProperty(
        JSON_PROPERTY_SERVERLESS_APPS_APM_EXCL_FARGATE_APM_AZURE_AZUREFUNCTION_INSTANCES_AVG_SUM,
        serverlessAppsApmExclFargateApmAzureAzurefunctionInstancesAvgSum);
  }

  public UsageSummaryResponse serverlessAppsApmExclFargateApmAzureContainerappInstancesAvgSum(
      Long serverlessAppsApmExclFargateApmAzureContainerappInstancesAvgSum) {
    this.serverlessAppsApmExclFargateApmAzureContainerappInstancesAvgSum =
        serverlessAppsApmExclFargateApmAzureContainerappInstancesAvgSum;
    return this;
  }

  /**
   * Sum of the average number of Serverless Apps with Application Performance Monitoring excluding
   * Fargate for Azure Container App instances in the current month for all organizations.
   *
   * @return serverlessAppsApmExclFargateApmAzureContainerappInstancesAvgSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(
      JSON_PROPERTY_SERVERLESS_APPS_APM_EXCL_FARGATE_APM_AZURE_CONTAINERAPP_INSTANCES_AVG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getServerlessAppsApmExclFargateApmAzureContainerappInstancesAvgSum() {
    return serverlessAppsApmExclFargateApmAzureContainerappInstancesAvgSum;
  }

  public void setServerlessAppsApmExclFargateApmAzureContainerappInstancesAvgSum(
      Long serverlessAppsApmExclFargateApmAzureContainerappInstancesAvgSum) {
    this.serverlessAppsApmExclFargateApmAzureContainerappInstancesAvgSum =
        serverlessAppsApmExclFargateApmAzureContainerappInstancesAvgSum;
    putAdditionalProperty(
        JSON_PROPERTY_SERVERLESS_APPS_APM_EXCL_FARGATE_APM_AZURE_CONTAINERAPP_INSTANCES_AVG_SUM,
        serverlessAppsApmExclFargateApmAzureContainerappInstancesAvgSum);
  }

  public UsageSummaryResponse serverlessAppsApmExclFargateApmGcpCloudfunctionInstancesAvgSum(
      Long serverlessAppsApmExclFargateApmGcpCloudfunctionInstancesAvgSum) {
    this.serverlessAppsApmExclFargateApmGcpCloudfunctionInstancesAvgSum =
        serverlessAppsApmExclFargateApmGcpCloudfunctionInstancesAvgSum;
    return this;
  }

  /**
   * Sum of the average number of Serverless Apps with Application Performance Monitoring excluding
   * Fargate for Google Cloud Platform Cloud Function instances in the current month for all
   * organizations.
   *
   * @return serverlessAppsApmExclFargateApmGcpCloudfunctionInstancesAvgSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(
      JSON_PROPERTY_SERVERLESS_APPS_APM_EXCL_FARGATE_APM_GCP_CLOUDFUNCTION_INSTANCES_AVG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getServerlessAppsApmExclFargateApmGcpCloudfunctionInstancesAvgSum() {
    return serverlessAppsApmExclFargateApmGcpCloudfunctionInstancesAvgSum;
  }

  public void setServerlessAppsApmExclFargateApmGcpCloudfunctionInstancesAvgSum(
      Long serverlessAppsApmExclFargateApmGcpCloudfunctionInstancesAvgSum) {
    this.serverlessAppsApmExclFargateApmGcpCloudfunctionInstancesAvgSum =
        serverlessAppsApmExclFargateApmGcpCloudfunctionInstancesAvgSum;
    putAdditionalProperty(
        JSON_PROPERTY_SERVERLESS_APPS_APM_EXCL_FARGATE_APM_GCP_CLOUDFUNCTION_INSTANCES_AVG_SUM,
        serverlessAppsApmExclFargateApmGcpCloudfunctionInstancesAvgSum);
  }

  public UsageSummaryResponse serverlessAppsApmExclFargateApmGcpCloudrunInstancesAvgSum(
      Long serverlessAppsApmExclFargateApmGcpCloudrunInstancesAvgSum) {
    this.serverlessAppsApmExclFargateApmGcpCloudrunInstancesAvgSum =
        serverlessAppsApmExclFargateApmGcpCloudrunInstancesAvgSum;
    return this;
  }

  /**
   * Sum of the average number of Serverless Apps with Application Performance Monitoring excluding
   * Fargate for Google Cloud Platform Cloud Run instances in the current month for all
   * organizations.
   *
   * @return serverlessAppsApmExclFargateApmGcpCloudrunInstancesAvgSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVERLESS_APPS_APM_EXCL_FARGATE_APM_GCP_CLOUDRUN_INSTANCES_AVG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getServerlessAppsApmExclFargateApmGcpCloudrunInstancesAvgSum() {
    return serverlessAppsApmExclFargateApmGcpCloudrunInstancesAvgSum;
  }

  public void setServerlessAppsApmExclFargateApmGcpCloudrunInstancesAvgSum(
      Long serverlessAppsApmExclFargateApmGcpCloudrunInstancesAvgSum) {
    this.serverlessAppsApmExclFargateApmGcpCloudrunInstancesAvgSum =
        serverlessAppsApmExclFargateApmGcpCloudrunInstancesAvgSum;
    putAdditionalProperty(
        JSON_PROPERTY_SERVERLESS_APPS_APM_EXCL_FARGATE_APM_GCP_CLOUDRUN_INSTANCES_AVG_SUM,
        serverlessAppsApmExclFargateApmGcpCloudrunInstancesAvgSum);
  }

  public UsageSummaryResponse serverlessAppsApmExclFargateApmGcpGkeAutopilotPodsAvgSum(
      Long serverlessAppsApmExclFargateApmGcpGkeAutopilotPodsAvgSum) {
    this.serverlessAppsApmExclFargateApmGcpGkeAutopilotPodsAvgSum =
        serverlessAppsApmExclFargateApmGcpGkeAutopilotPodsAvgSum;
    return this;
  }

  /**
   * Sum of the average number of Serverless Apps with Application Performance Monitoring excluding
   * Fargate for Google Kubernetes Engine Autopilot pods in the current month for all organizations.
   *
   * @return serverlessAppsApmExclFargateApmGcpGkeAutopilotPodsAvgSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVERLESS_APPS_APM_EXCL_FARGATE_APM_GCP_GKE_AUTOPILOT_PODS_AVG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getServerlessAppsApmExclFargateApmGcpGkeAutopilotPodsAvgSum() {
    return serverlessAppsApmExclFargateApmGcpGkeAutopilotPodsAvgSum;
  }

  public void setServerlessAppsApmExclFargateApmGcpGkeAutopilotPodsAvgSum(
      Long serverlessAppsApmExclFargateApmGcpGkeAutopilotPodsAvgSum) {
    this.serverlessAppsApmExclFargateApmGcpGkeAutopilotPodsAvgSum =
        serverlessAppsApmExclFargateApmGcpGkeAutopilotPodsAvgSum;
    putAdditionalProperty(
        JSON_PROPERTY_SERVERLESS_APPS_APM_EXCL_FARGATE_APM_GCP_GKE_AUTOPILOT_PODS_AVG_SUM,
        serverlessAppsApmExclFargateApmGcpGkeAutopilotPodsAvgSum);
  }

  public UsageSummaryResponse serverlessAppsApmExclFargateAvgSum(
      Long serverlessAppsApmExclFargateAvgSum) {
    this.serverlessAppsApmExclFargateAvgSum = serverlessAppsApmExclFargateAvgSum;
    return this;
  }

  /**
   * Sum of the average number of Serverless Apps with Application Performance Monitoring excluding
   * Fargate in the current month for all organizations.
   *
   * @return serverlessAppsApmExclFargateAvgSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVERLESS_APPS_APM_EXCL_FARGATE_AVG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getServerlessAppsApmExclFargateAvgSum() {
    return serverlessAppsApmExclFargateAvgSum;
  }

  public void setServerlessAppsApmExclFargateAvgSum(Long serverlessAppsApmExclFargateAvgSum) {
    this.serverlessAppsApmExclFargateAvgSum = serverlessAppsApmExclFargateAvgSum;
    putAdditionalProperty(
        JSON_PROPERTY_SERVERLESS_APPS_APM_EXCL_FARGATE_AVG_SUM, serverlessAppsApmExclFargateAvgSum);
  }

  public UsageSummaryResponse serverlessAppsAzureContainerAppInstancesAvgSum(
      Long serverlessAppsAzureContainerAppInstancesAvgSum) {
    this.serverlessAppsAzureContainerAppInstancesAvgSum =
        serverlessAppsAzureContainerAppInstancesAvgSum;
    return this;
  }

  /**
   * Sum of the average number of Serverless Apps for Azure Container App instances in the current
   * month for all organizations.
   *
   * @return serverlessAppsAzureContainerAppInstancesAvgSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVERLESS_APPS_AZURE_CONTAINER_APP_INSTANCES_AVG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getServerlessAppsAzureContainerAppInstancesAvgSum() {
    return serverlessAppsAzureContainerAppInstancesAvgSum;
  }

  public void setServerlessAppsAzureContainerAppInstancesAvgSum(
      Long serverlessAppsAzureContainerAppInstancesAvgSum) {
    this.serverlessAppsAzureContainerAppInstancesAvgSum =
        serverlessAppsAzureContainerAppInstancesAvgSum;
    putAdditionalProperty(
        JSON_PROPERTY_SERVERLESS_APPS_AZURE_CONTAINER_APP_INSTANCES_AVG_SUM,
        serverlessAppsAzureContainerAppInstancesAvgSum);
  }

  public UsageSummaryResponse serverlessAppsAzureCountAvgSum(Long serverlessAppsAzureCountAvgSum) {
    this.serverlessAppsAzureCountAvgSum = serverlessAppsAzureCountAvgSum;
    return this;
  }

  /**
   * Sum of the average number of Serverless Apps for Azure in the current month for all
   * organizations.
   *
   * @return serverlessAppsAzureCountAvgSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVERLESS_APPS_AZURE_COUNT_AVG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getServerlessAppsAzureCountAvgSum() {
    return serverlessAppsAzureCountAvgSum;
  }

  public void setServerlessAppsAzureCountAvgSum(Long serverlessAppsAzureCountAvgSum) {
    this.serverlessAppsAzureCountAvgSum = serverlessAppsAzureCountAvgSum;
    putAdditionalProperty(
        JSON_PROPERTY_SERVERLESS_APPS_AZURE_COUNT_AVG_SUM, serverlessAppsAzureCountAvgSum);
  }

  public UsageSummaryResponse serverlessAppsAzureFunctionAppInstancesAvgSum(
      Long serverlessAppsAzureFunctionAppInstancesAvgSum) {
    this.serverlessAppsAzureFunctionAppInstancesAvgSum =
        serverlessAppsAzureFunctionAppInstancesAvgSum;
    return this;
  }

  /**
   * Sum of the average number of Serverless Apps for Azure Function App instances in the current
   * month for all organizations.
   *
   * @return serverlessAppsAzureFunctionAppInstancesAvgSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVERLESS_APPS_AZURE_FUNCTION_APP_INSTANCES_AVG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getServerlessAppsAzureFunctionAppInstancesAvgSum() {
    return serverlessAppsAzureFunctionAppInstancesAvgSum;
  }

  public void setServerlessAppsAzureFunctionAppInstancesAvgSum(
      Long serverlessAppsAzureFunctionAppInstancesAvgSum) {
    this.serverlessAppsAzureFunctionAppInstancesAvgSum =
        serverlessAppsAzureFunctionAppInstancesAvgSum;
    putAdditionalProperty(
        JSON_PROPERTY_SERVERLESS_APPS_AZURE_FUNCTION_APP_INSTANCES_AVG_SUM,
        serverlessAppsAzureFunctionAppInstancesAvgSum);
  }

  public UsageSummaryResponse serverlessAppsAzureWebAppInstancesAvgSum(
      Long serverlessAppsAzureWebAppInstancesAvgSum) {
    this.serverlessAppsAzureWebAppInstancesAvgSum = serverlessAppsAzureWebAppInstancesAvgSum;
    return this;
  }

  /**
   * Sum of the average number of Serverless Apps for Azure Web App instances in the current month
   * for all organizations.
   *
   * @return serverlessAppsAzureWebAppInstancesAvgSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVERLESS_APPS_AZURE_WEB_APP_INSTANCES_AVG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getServerlessAppsAzureWebAppInstancesAvgSum() {
    return serverlessAppsAzureWebAppInstancesAvgSum;
  }

  public void setServerlessAppsAzureWebAppInstancesAvgSum(
      Long serverlessAppsAzureWebAppInstancesAvgSum) {
    this.serverlessAppsAzureWebAppInstancesAvgSum = serverlessAppsAzureWebAppInstancesAvgSum;
    putAdditionalProperty(
        JSON_PROPERTY_SERVERLESS_APPS_AZURE_WEB_APP_INSTANCES_AVG_SUM,
        serverlessAppsAzureWebAppInstancesAvgSum);
  }

  public UsageSummaryResponse serverlessAppsDsmFargateTasksAvgSum(
      Long serverlessAppsDsmFargateTasksAvgSum) {
    this.serverlessAppsDsmFargateTasksAvgSum = serverlessAppsDsmFargateTasksAvgSum;
    return this;
  }

  /**
   * Sum of the average number of DSM Fargate ECS tasks monitored under Serverless Apps DSM in the
   * current month for all organizations.
   *
   * @return serverlessAppsDsmFargateTasksAvgSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVERLESS_APPS_DSM_FARGATE_TASKS_AVG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getServerlessAppsDsmFargateTasksAvgSum() {
    return serverlessAppsDsmFargateTasksAvgSum;
  }

  public void setServerlessAppsDsmFargateTasksAvgSum(Long serverlessAppsDsmFargateTasksAvgSum) {
    this.serverlessAppsDsmFargateTasksAvgSum = serverlessAppsDsmFargateTasksAvgSum;
    putAdditionalProperty(
        JSON_PROPERTY_SERVERLESS_APPS_DSM_FARGATE_TASKS_AVG_SUM,
        serverlessAppsDsmFargateTasksAvgSum);
  }

  public UsageSummaryResponse serverlessAppsEcsAvgSum(Long serverlessAppsEcsAvgSum) {
    this.serverlessAppsEcsAvgSum = serverlessAppsEcsAvgSum;
    return this;
  }

  /**
   * Sum of the average number of Serverless Apps for Elastic Container Service in the current month
   * for all organizations.
   *
   * @return serverlessAppsEcsAvgSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVERLESS_APPS_ECS_AVG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getServerlessAppsEcsAvgSum() {
    return serverlessAppsEcsAvgSum;
  }

  public void setServerlessAppsEcsAvgSum(Long serverlessAppsEcsAvgSum) {
    this.serverlessAppsEcsAvgSum = serverlessAppsEcsAvgSum;
    putAdditionalProperty(JSON_PROPERTY_SERVERLESS_APPS_ECS_AVG_SUM, serverlessAppsEcsAvgSum);
  }

  public UsageSummaryResponse serverlessAppsEksAvgSum(Long serverlessAppsEksAvgSum) {
    this.serverlessAppsEksAvgSum = serverlessAppsEksAvgSum;
    return this;
  }

  /**
   * Sum of the average number of Serverless Apps for Elastic Kubernetes Service in the current
   * month for all organizations.
   *
   * @return serverlessAppsEksAvgSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVERLESS_APPS_EKS_AVG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getServerlessAppsEksAvgSum() {
    return serverlessAppsEksAvgSum;
  }

  public void setServerlessAppsEksAvgSum(Long serverlessAppsEksAvgSum) {
    this.serverlessAppsEksAvgSum = serverlessAppsEksAvgSum;
    putAdditionalProperty(JSON_PROPERTY_SERVERLESS_APPS_EKS_AVG_SUM, serverlessAppsEksAvgSum);
  }

  public UsageSummaryResponse serverlessAppsExclFargateAvgSum(
      Long serverlessAppsExclFargateAvgSum) {
    this.serverlessAppsExclFargateAvgSum = serverlessAppsExclFargateAvgSum;
    return this;
  }

  /**
   * Sum of the average number of Serverless Apps excluding Fargate in the current month for all
   * organizations.
   *
   * @return serverlessAppsExclFargateAvgSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVERLESS_APPS_EXCL_FARGATE_AVG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getServerlessAppsExclFargateAvgSum() {
    return serverlessAppsExclFargateAvgSum;
  }

  public void setServerlessAppsExclFargateAvgSum(Long serverlessAppsExclFargateAvgSum) {
    this.serverlessAppsExclFargateAvgSum = serverlessAppsExclFargateAvgSum;
    putAdditionalProperty(
        JSON_PROPERTY_SERVERLESS_APPS_EXCL_FARGATE_AVG_SUM, serverlessAppsExclFargateAvgSum);
  }

  public UsageSummaryResponse serverlessAppsExclFargateAzureContainerAppInstancesAvgSum(
      Long serverlessAppsExclFargateAzureContainerAppInstancesAvgSum) {
    this.serverlessAppsExclFargateAzureContainerAppInstancesAvgSum =
        serverlessAppsExclFargateAzureContainerAppInstancesAvgSum;
    return this;
  }

  /**
   * Sum of the average number of Serverless Apps excluding Fargate for Azure Container App
   * instances in the current month for all organizations.
   *
   * @return serverlessAppsExclFargateAzureContainerAppInstancesAvgSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVERLESS_APPS_EXCL_FARGATE_AZURE_CONTAINER_APP_INSTANCES_AVG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getServerlessAppsExclFargateAzureContainerAppInstancesAvgSum() {
    return serverlessAppsExclFargateAzureContainerAppInstancesAvgSum;
  }

  public void setServerlessAppsExclFargateAzureContainerAppInstancesAvgSum(
      Long serverlessAppsExclFargateAzureContainerAppInstancesAvgSum) {
    this.serverlessAppsExclFargateAzureContainerAppInstancesAvgSum =
        serverlessAppsExclFargateAzureContainerAppInstancesAvgSum;
    putAdditionalProperty(
        JSON_PROPERTY_SERVERLESS_APPS_EXCL_FARGATE_AZURE_CONTAINER_APP_INSTANCES_AVG_SUM,
        serverlessAppsExclFargateAzureContainerAppInstancesAvgSum);
  }

  public UsageSummaryResponse serverlessAppsExclFargateAzureFunctionAppInstancesAvgSum(
      Long serverlessAppsExclFargateAzureFunctionAppInstancesAvgSum) {
    this.serverlessAppsExclFargateAzureFunctionAppInstancesAvgSum =
        serverlessAppsExclFargateAzureFunctionAppInstancesAvgSum;
    return this;
  }

  /**
   * Sum of the average number of Serverless Apps excluding Fargate for Azure Function App instances
   * in the current month for all organizations.
   *
   * @return serverlessAppsExclFargateAzureFunctionAppInstancesAvgSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVERLESS_APPS_EXCL_FARGATE_AZURE_FUNCTION_APP_INSTANCES_AVG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getServerlessAppsExclFargateAzureFunctionAppInstancesAvgSum() {
    return serverlessAppsExclFargateAzureFunctionAppInstancesAvgSum;
  }

  public void setServerlessAppsExclFargateAzureFunctionAppInstancesAvgSum(
      Long serverlessAppsExclFargateAzureFunctionAppInstancesAvgSum) {
    this.serverlessAppsExclFargateAzureFunctionAppInstancesAvgSum =
        serverlessAppsExclFargateAzureFunctionAppInstancesAvgSum;
    putAdditionalProperty(
        JSON_PROPERTY_SERVERLESS_APPS_EXCL_FARGATE_AZURE_FUNCTION_APP_INSTANCES_AVG_SUM,
        serverlessAppsExclFargateAzureFunctionAppInstancesAvgSum);
  }

  public UsageSummaryResponse serverlessAppsExclFargateAzureWebAppInstancesAvgSum(
      Long serverlessAppsExclFargateAzureWebAppInstancesAvgSum) {
    this.serverlessAppsExclFargateAzureWebAppInstancesAvgSum =
        serverlessAppsExclFargateAzureWebAppInstancesAvgSum;
    return this;
  }

  /**
   * Sum of the average number of Serverless Apps excluding Fargate for Azure Web App instances in
   * the current month for all organizations.
   *
   * @return serverlessAppsExclFargateAzureWebAppInstancesAvgSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVERLESS_APPS_EXCL_FARGATE_AZURE_WEB_APP_INSTANCES_AVG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getServerlessAppsExclFargateAzureWebAppInstancesAvgSum() {
    return serverlessAppsExclFargateAzureWebAppInstancesAvgSum;
  }

  public void setServerlessAppsExclFargateAzureWebAppInstancesAvgSum(
      Long serverlessAppsExclFargateAzureWebAppInstancesAvgSum) {
    this.serverlessAppsExclFargateAzureWebAppInstancesAvgSum =
        serverlessAppsExclFargateAzureWebAppInstancesAvgSum;
    putAdditionalProperty(
        JSON_PROPERTY_SERVERLESS_APPS_EXCL_FARGATE_AZURE_WEB_APP_INSTANCES_AVG_SUM,
        serverlessAppsExclFargateAzureWebAppInstancesAvgSum);
  }

  public UsageSummaryResponse serverlessAppsExclFargateGoogleCloudFunctionsInstancesAvgSum(
      Long serverlessAppsExclFargateGoogleCloudFunctionsInstancesAvgSum) {
    this.serverlessAppsExclFargateGoogleCloudFunctionsInstancesAvgSum =
        serverlessAppsExclFargateGoogleCloudFunctionsInstancesAvgSum;
    return this;
  }

  /**
   * Sum of the average number of Serverless Apps excluding Fargate for Google Cloud Platform Cloud
   * Functions instances in the current month for all organizations.
   *
   * @return serverlessAppsExclFargateGoogleCloudFunctionsInstancesAvgSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVERLESS_APPS_EXCL_FARGATE_GOOGLE_CLOUD_FUNCTIONS_INSTANCES_AVG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getServerlessAppsExclFargateGoogleCloudFunctionsInstancesAvgSum() {
    return serverlessAppsExclFargateGoogleCloudFunctionsInstancesAvgSum;
  }

  public void setServerlessAppsExclFargateGoogleCloudFunctionsInstancesAvgSum(
      Long serverlessAppsExclFargateGoogleCloudFunctionsInstancesAvgSum) {
    this.serverlessAppsExclFargateGoogleCloudFunctionsInstancesAvgSum =
        serverlessAppsExclFargateGoogleCloudFunctionsInstancesAvgSum;
    putAdditionalProperty(
        JSON_PROPERTY_SERVERLESS_APPS_EXCL_FARGATE_GOOGLE_CLOUD_FUNCTIONS_INSTANCES_AVG_SUM,
        serverlessAppsExclFargateGoogleCloudFunctionsInstancesAvgSum);
  }

  public UsageSummaryResponse serverlessAppsExclFargateGoogleCloudRunInstancesAvgSum(
      Long serverlessAppsExclFargateGoogleCloudRunInstancesAvgSum) {
    this.serverlessAppsExclFargateGoogleCloudRunInstancesAvgSum =
        serverlessAppsExclFargateGoogleCloudRunInstancesAvgSum;
    return this;
  }

  /**
   * Sum of the average number of Serverless Apps excluding Fargate for Google Cloud Platform Cloud
   * Run instances in the current month for all organizations.
   *
   * @return serverlessAppsExclFargateGoogleCloudRunInstancesAvgSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVERLESS_APPS_EXCL_FARGATE_GOOGLE_CLOUD_RUN_INSTANCES_AVG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getServerlessAppsExclFargateGoogleCloudRunInstancesAvgSum() {
    return serverlessAppsExclFargateGoogleCloudRunInstancesAvgSum;
  }

  public void setServerlessAppsExclFargateGoogleCloudRunInstancesAvgSum(
      Long serverlessAppsExclFargateGoogleCloudRunInstancesAvgSum) {
    this.serverlessAppsExclFargateGoogleCloudRunInstancesAvgSum =
        serverlessAppsExclFargateGoogleCloudRunInstancesAvgSum;
    putAdditionalProperty(
        JSON_PROPERTY_SERVERLESS_APPS_EXCL_FARGATE_GOOGLE_CLOUD_RUN_INSTANCES_AVG_SUM,
        serverlessAppsExclFargateGoogleCloudRunInstancesAvgSum);
  }

  public UsageSummaryResponse serverlessAppsExclFargateInfraGcpGkeAutopilotPodsAvgSum(
      Long serverlessAppsExclFargateInfraGcpGkeAutopilotPodsAvgSum) {
    this.serverlessAppsExclFargateInfraGcpGkeAutopilotPodsAvgSum =
        serverlessAppsExclFargateInfraGcpGkeAutopilotPodsAvgSum;
    return this;
  }

  /**
   * Sum of the average number of Serverless Apps excluding Fargate for Google Kubernetes Engine
   * Autopilot pods in the current month for all organizations.
   *
   * @return serverlessAppsExclFargateInfraGcpGkeAutopilotPodsAvgSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVERLESS_APPS_EXCL_FARGATE_INFRA_GCP_GKE_AUTOPILOT_PODS_AVG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getServerlessAppsExclFargateInfraGcpGkeAutopilotPodsAvgSum() {
    return serverlessAppsExclFargateInfraGcpGkeAutopilotPodsAvgSum;
  }

  public void setServerlessAppsExclFargateInfraGcpGkeAutopilotPodsAvgSum(
      Long serverlessAppsExclFargateInfraGcpGkeAutopilotPodsAvgSum) {
    this.serverlessAppsExclFargateInfraGcpGkeAutopilotPodsAvgSum =
        serverlessAppsExclFargateInfraGcpGkeAutopilotPodsAvgSum;
    putAdditionalProperty(
        JSON_PROPERTY_SERVERLESS_APPS_EXCL_FARGATE_INFRA_GCP_GKE_AUTOPILOT_PODS_AVG_SUM,
        serverlessAppsExclFargateInfraGcpGkeAutopilotPodsAvgSum);
  }

  public UsageSummaryResponse serverlessAppsGoogleCloudFunctionsInstancesAvgSum(
      Long serverlessAppsGoogleCloudFunctionsInstancesAvgSum) {
    this.serverlessAppsGoogleCloudFunctionsInstancesAvgSum =
        serverlessAppsGoogleCloudFunctionsInstancesAvgSum;
    return this;
  }

  /**
   * Sum of the average number of Serverless Apps for Google Cloud Platform Cloud Functions
   * instances in the current month for all organizations.
   *
   * @return serverlessAppsGoogleCloudFunctionsInstancesAvgSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVERLESS_APPS_GOOGLE_CLOUD_FUNCTIONS_INSTANCES_AVG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getServerlessAppsGoogleCloudFunctionsInstancesAvgSum() {
    return serverlessAppsGoogleCloudFunctionsInstancesAvgSum;
  }

  public void setServerlessAppsGoogleCloudFunctionsInstancesAvgSum(
      Long serverlessAppsGoogleCloudFunctionsInstancesAvgSum) {
    this.serverlessAppsGoogleCloudFunctionsInstancesAvgSum =
        serverlessAppsGoogleCloudFunctionsInstancesAvgSum;
    putAdditionalProperty(
        JSON_PROPERTY_SERVERLESS_APPS_GOOGLE_CLOUD_FUNCTIONS_INSTANCES_AVG_SUM,
        serverlessAppsGoogleCloudFunctionsInstancesAvgSum);
  }

  public UsageSummaryResponse serverlessAppsGoogleCloudRunInstancesAvgSum(
      Long serverlessAppsGoogleCloudRunInstancesAvgSum) {
    this.serverlessAppsGoogleCloudRunInstancesAvgSum = serverlessAppsGoogleCloudRunInstancesAvgSum;
    return this;
  }

  /**
   * Sum of the average number of Serverless Apps for Google Cloud Platform Cloud Run instances in
   * the current month for all organizations.
   *
   * @return serverlessAppsGoogleCloudRunInstancesAvgSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVERLESS_APPS_GOOGLE_CLOUD_RUN_INSTANCES_AVG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getServerlessAppsGoogleCloudRunInstancesAvgSum() {
    return serverlessAppsGoogleCloudRunInstancesAvgSum;
  }

  public void setServerlessAppsGoogleCloudRunInstancesAvgSum(
      Long serverlessAppsGoogleCloudRunInstancesAvgSum) {
    this.serverlessAppsGoogleCloudRunInstancesAvgSum = serverlessAppsGoogleCloudRunInstancesAvgSum;
    putAdditionalProperty(
        JSON_PROPERTY_SERVERLESS_APPS_GOOGLE_CLOUD_RUN_INSTANCES_AVG_SUM,
        serverlessAppsGoogleCloudRunInstancesAvgSum);
  }

  public UsageSummaryResponse serverlessAppsGoogleCountAvgSum(
      Long serverlessAppsGoogleCountAvgSum) {
    this.serverlessAppsGoogleCountAvgSum = serverlessAppsGoogleCountAvgSum;
    return this;
  }

  /**
   * Sum of the average number of Serverless Apps for Google Cloud in the current month for all
   * organizations.
   *
   * @return serverlessAppsGoogleCountAvgSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVERLESS_APPS_GOOGLE_COUNT_AVG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getServerlessAppsGoogleCountAvgSum() {
    return serverlessAppsGoogleCountAvgSum;
  }

  public void setServerlessAppsGoogleCountAvgSum(Long serverlessAppsGoogleCountAvgSum) {
    this.serverlessAppsGoogleCountAvgSum = serverlessAppsGoogleCountAvgSum;
    putAdditionalProperty(
        JSON_PROPERTY_SERVERLESS_APPS_GOOGLE_COUNT_AVG_SUM, serverlessAppsGoogleCountAvgSum);
  }

  public UsageSummaryResponse serverlessAppsInfraGcpGkeAutopilotPodsAvgSum(
      Long serverlessAppsInfraGcpGkeAutopilotPodsAvgSum) {
    this.serverlessAppsInfraGcpGkeAutopilotPodsAvgSum =
        serverlessAppsInfraGcpGkeAutopilotPodsAvgSum;
    return this;
  }

  /**
   * Sum of the average number of Serverless Apps for Google Kubernetes Engine Autopilot pods in the
   * current month for all organizations.
   *
   * @return serverlessAppsInfraGcpGkeAutopilotPodsAvgSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVERLESS_APPS_INFRA_GCP_GKE_AUTOPILOT_PODS_AVG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getServerlessAppsInfraGcpGkeAutopilotPodsAvgSum() {
    return serverlessAppsInfraGcpGkeAutopilotPodsAvgSum;
  }

  public void setServerlessAppsInfraGcpGkeAutopilotPodsAvgSum(
      Long serverlessAppsInfraGcpGkeAutopilotPodsAvgSum) {
    this.serverlessAppsInfraGcpGkeAutopilotPodsAvgSum =
        serverlessAppsInfraGcpGkeAutopilotPodsAvgSum;
    putAdditionalProperty(
        JSON_PROPERTY_SERVERLESS_APPS_INFRA_GCP_GKE_AUTOPILOT_PODS_AVG_SUM,
        serverlessAppsInfraGcpGkeAutopilotPodsAvgSum);
  }

  public UsageSummaryResponse serverlessAppsTotalCountAvgSum(Long serverlessAppsTotalCountAvgSum) {
    this.serverlessAppsTotalCountAvgSum = serverlessAppsTotalCountAvgSum;
    return this;
  }

  /**
   * Sum of the average number of Serverless Apps for Azure and Google Cloud in the current month
   * for all organizations.
   *
   * @return serverlessAppsTotalCountAvgSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVERLESS_APPS_TOTAL_COUNT_AVG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getServerlessAppsTotalCountAvgSum() {
    return serverlessAppsTotalCountAvgSum;
  }

  public void setServerlessAppsTotalCountAvgSum(Long serverlessAppsTotalCountAvgSum) {
    this.serverlessAppsTotalCountAvgSum = serverlessAppsTotalCountAvgSum;
    putAdditionalProperty(
        JSON_PROPERTY_SERVERLESS_APPS_TOTAL_COUNT_AVG_SUM, serverlessAppsTotalCountAvgSum);
  }

  public UsageSummaryResponse siem12moRetentionAggSum(Long siem12moRetentionAggSum) {
    this.siem12moRetentionAggSum = siem12moRetentionAggSum;
    return this;
  }

  /**
   * Shows the sum of Cloud SIEM Indexed Logs (12-month retention) over all hours in the current
   * month for all organizations.
   *
   * @return siem12moRetentionAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SIEM_12MO_RETENTION_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getSiem12moRetentionAggSum() {
    return siem12moRetentionAggSum;
  }

  public void setSiem12moRetentionAggSum(Long siem12moRetentionAggSum) {
    this.siem12moRetentionAggSum = siem12moRetentionAggSum;
    putAdditionalProperty(JSON_PROPERTY_SIEM_12MO_RETENTION_AGG_SUM, siem12moRetentionAggSum);
  }

  public UsageSummaryResponse siem6moRetentionAggSum(Long siem6moRetentionAggSum) {
    this.siem6moRetentionAggSum = siem6moRetentionAggSum;
    return this;
  }

  /**
   * Shows the sum of Cloud SIEM Indexed Logs (6-month retention) over all hours in the current
   * month for all organizations.
   *
   * @return siem6moRetentionAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SIEM_6MO_RETENTION_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getSiem6moRetentionAggSum() {
    return siem6moRetentionAggSum;
  }

  public void setSiem6moRetentionAggSum(Long siem6moRetentionAggSum) {
    this.siem6moRetentionAggSum = siem6moRetentionAggSum;
    putAdditionalProperty(JSON_PROPERTY_SIEM_6MO_RETENTION_AGG_SUM, siem6moRetentionAggSum);
  }

  public UsageSummaryResponse siemAnalyzedLogsAddOnCountAggSum(
      Long siemAnalyzedLogsAddOnCountAggSum) {
    this.siemAnalyzedLogsAddOnCountAggSum = siemAnalyzedLogsAddOnCountAggSum;
    return this;
  }

  /**
   * Shows the sum of all log events analyzed by Cloud SIEM over all hours in the current month for
   * all organizations.
   *
   * @return siemAnalyzedLogsAddOnCountAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SIEM_ANALYZED_LOGS_ADD_ON_COUNT_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getSiemAnalyzedLogsAddOnCountAggSum() {
    return siemAnalyzedLogsAddOnCountAggSum;
  }

  public void setSiemAnalyzedLogsAddOnCountAggSum(Long siemAnalyzedLogsAddOnCountAggSum) {
    this.siemAnalyzedLogsAddOnCountAggSum = siemAnalyzedLogsAddOnCountAggSum;
    putAdditionalProperty(
        JSON_PROPERTY_SIEM_ANALYZED_LOGS_ADD_ON_COUNT_AGG_SUM, siemAnalyzedLogsAddOnCountAggSum);
  }

  public UsageSummaryResponse snmpDeviceCountAggSum(Long snmpDeviceCountAggSum) {
    this.snmpDeviceCountAggSum = snmpDeviceCountAggSum;
    return this;
  }

  /**
   * Shows the sum of all Network Device Monitoring devices over all hours in the current month for
   * all organizations.
   *
   * @return snmpDeviceCountAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SNMP_DEVICE_COUNT_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getSnmpDeviceCountAggSum() {
    return snmpDeviceCountAggSum;
  }

  public void setSnmpDeviceCountAggSum(Long snmpDeviceCountAggSum) {
    this.snmpDeviceCountAggSum = snmpDeviceCountAggSum;
    putAdditionalProperty(JSON_PROPERTY_SNMP_DEVICE_COUNT_AGG_SUM, snmpDeviceCountAggSum);
  }

  public UsageSummaryResponse snmpDeviceCountTop99pSum(Long snmpDeviceCountTop99pSum) {
    this.snmpDeviceCountTop99pSum = snmpDeviceCountTop99pSum;
    return this;
  }

  /**
   * Shows the 99th percentile of all Network Device Monitoring devices over all hours in the
   * current month for all organizations.
   *
   * @return snmpDeviceCountTop99pSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SNMP_DEVICE_COUNT_TOP99P_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getSnmpDeviceCountTop99pSum() {
    return snmpDeviceCountTop99pSum;
  }

  public void setSnmpDeviceCountTop99pSum(Long snmpDeviceCountTop99pSum) {
    this.snmpDeviceCountTop99pSum = snmpDeviceCountTop99pSum;
    putAdditionalProperty(JSON_PROPERTY_SNMP_DEVICE_COUNT_TOP99P_SUM, snmpDeviceCountTop99pSum);
  }

  public UsageSummaryResponse startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Shows the first date of usage in the current month for all organizations.
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
    putAdditionalProperty(JSON_PROPERTY_START_DATE, startDate);
  }

  public UsageSummaryResponse syntheticsBrowserCheckCallsCountAggSum(
      Long syntheticsBrowserCheckCallsCountAggSum) {
    this.syntheticsBrowserCheckCallsCountAggSum = syntheticsBrowserCheckCallsCountAggSum;
    return this;
  }

  /**
   * Shows the sum of all Synthetic browser tests over all hours in the current month for all
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
    putAdditionalProperty(
        JSON_PROPERTY_SYNTHETICS_BROWSER_CHECK_CALLS_COUNT_AGG_SUM,
        syntheticsBrowserCheckCallsCountAggSum);
  }

  public UsageSummaryResponse syntheticsCheckCallsCountAggSum(
      Long syntheticsCheckCallsCountAggSum) {
    this.syntheticsCheckCallsCountAggSum = syntheticsCheckCallsCountAggSum;
    return this;
  }

  /**
   * Shows the sum of all Synthetic API tests over all hours in the current month for all
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
    putAdditionalProperty(
        JSON_PROPERTY_SYNTHETICS_CHECK_CALLS_COUNT_AGG_SUM, syntheticsCheckCallsCountAggSum);
  }

  public UsageSummaryResponse syntheticsMobileTestRunsAggSum(Long syntheticsMobileTestRunsAggSum) {
    this.syntheticsMobileTestRunsAggSum = syntheticsMobileTestRunsAggSum;
    return this;
  }

  /**
   * Shows the sum of Synthetic mobile application tests over all hours in the current month for all
   * organizations.
   *
   * @return syntheticsMobileTestRunsAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SYNTHETICS_MOBILE_TEST_RUNS_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getSyntheticsMobileTestRunsAggSum() {
    return syntheticsMobileTestRunsAggSum;
  }

  public void setSyntheticsMobileTestRunsAggSum(Long syntheticsMobileTestRunsAggSum) {
    this.syntheticsMobileTestRunsAggSum = syntheticsMobileTestRunsAggSum;
    putAdditionalProperty(
        JSON_PROPERTY_SYNTHETICS_MOBILE_TEST_RUNS_AGG_SUM, syntheticsMobileTestRunsAggSum);
  }

  public UsageSummaryResponse syntheticsParallelTestingMaxSlotsHwmSum(
      Long syntheticsParallelTestingMaxSlotsHwmSum) {
    this.syntheticsParallelTestingMaxSlotsHwmSum = syntheticsParallelTestingMaxSlotsHwmSum;
    return this;
  }

  /**
   * Shows the sum of the high-water marks of used synthetics parallel testing slots over all hours
   * in the current month for all organizations.
   *
   * @return syntheticsParallelTestingMaxSlotsHwmSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SYNTHETICS_PARALLEL_TESTING_MAX_SLOTS_HWM_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getSyntheticsParallelTestingMaxSlotsHwmSum() {
    return syntheticsParallelTestingMaxSlotsHwmSum;
  }

  public void setSyntheticsParallelTestingMaxSlotsHwmSum(
      Long syntheticsParallelTestingMaxSlotsHwmSum) {
    this.syntheticsParallelTestingMaxSlotsHwmSum = syntheticsParallelTestingMaxSlotsHwmSum;
    putAdditionalProperty(
        JSON_PROPERTY_SYNTHETICS_PARALLEL_TESTING_MAX_SLOTS_HWM_SUM,
        syntheticsParallelTestingMaxSlotsHwmSum);
  }

  public UsageSummaryResponse traceSearchIndexedEventsCountAggSum(
      Long traceSearchIndexedEventsCountAggSum) {
    this.traceSearchIndexedEventsCountAggSum = traceSearchIndexedEventsCountAggSum;
    return this;
  }

  /**
   * Shows the sum of all Indexed Spans indexed over all hours in the current month for all
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
    putAdditionalProperty(
        JSON_PROPERTY_TRACE_SEARCH_INDEXED_EVENTS_COUNT_AGG_SUM,
        traceSearchIndexedEventsCountAggSum);
  }

  public UsageSummaryResponse twolIngestedEventsBytesAggSum(Long twolIngestedEventsBytesAggSum) {
    this.twolIngestedEventsBytesAggSum = twolIngestedEventsBytesAggSum;
    return this;
  }

  /**
   * Shows the sum of all ingested APM span bytes over all hours in the current month for all
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
    putAdditionalProperty(
        JSON_PROPERTY_TWOL_INGESTED_EVENTS_BYTES_AGG_SUM, twolIngestedEventsBytesAggSum);
  }

  public UsageSummaryResponse universalServiceMonitoringHostTop99pSum(
      Long universalServiceMonitoringHostTop99pSum) {
    this.universalServiceMonitoringHostTop99pSum = universalServiceMonitoringHostTop99pSum;
    return this;
  }

  /**
   * Shows the 99th percentile of all Universal Service Monitoring hosts over all hours in the
   * current month for all organizations.
   *
   * @return universalServiceMonitoringHostTop99pSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UNIVERSAL_SERVICE_MONITORING_HOST_TOP99P_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getUniversalServiceMonitoringHostTop99pSum() {
    return universalServiceMonitoringHostTop99pSum;
  }

  public void setUniversalServiceMonitoringHostTop99pSum(
      Long universalServiceMonitoringHostTop99pSum) {
    this.universalServiceMonitoringHostTop99pSum = universalServiceMonitoringHostTop99pSum;
    putAdditionalProperty(
        JSON_PROPERTY_UNIVERSAL_SERVICE_MONITORING_HOST_TOP99P_SUM,
        universalServiceMonitoringHostTop99pSum);
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
    putAdditionalProperty(JSON_PROPERTY_USAGE, usage);
  }

  public UsageSummaryResponse vsphereHostTop99pSum(Long vsphereHostTop99pSum) {
    this.vsphereHostTop99pSum = vsphereHostTop99pSum;
    return this;
  }

  /**
   * Shows the 99th percentile of all vSphere hosts over all hours in the current month for all
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
    putAdditionalProperty(JSON_PROPERTY_VSPHERE_HOST_TOP99P_SUM, vsphereHostTop99pSum);
  }

  public UsageSummaryResponse vulnManagementHostCountTop99pSum(
      Long vulnManagementHostCountTop99pSum) {
    this.vulnManagementHostCountTop99pSum = vulnManagementHostCountTop99pSum;
    return this;
  }

  /**
   * Shows the 99th percentile of all Application Vulnerability Management hosts over all hours in
   * the current month for all organizations.
   *
   * @return vulnManagementHostCountTop99pSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VULN_MANAGEMENT_HOST_COUNT_TOP99P_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getVulnManagementHostCountTop99pSum() {
    return vulnManagementHostCountTop99pSum;
  }

  public void setVulnManagementHostCountTop99pSum(Long vulnManagementHostCountTop99pSum) {
    this.vulnManagementHostCountTop99pSum = vulnManagementHostCountTop99pSum;
    putAdditionalProperty(
        JSON_PROPERTY_VULN_MANAGEMENT_HOST_COUNT_TOP99P_SUM, vulnManagementHostCountTop99pSum);
  }

  public UsageSummaryResponse workflowExecutionsUsageAggSum(Long workflowExecutionsUsageAggSum) {
    this.workflowExecutionsUsageAggSum = workflowExecutionsUsageAggSum;
    return this;
  }

  /**
   * Sum of all workflows executed over all hours in the current month for all organizations.
   *
   * @return workflowExecutionsUsageAggSum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WORKFLOW_EXECUTIONS_USAGE_AGG_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getWorkflowExecutionsUsageAggSum() {
    return workflowExecutionsUsageAggSum;
  }

  public void setWorkflowExecutionsUsageAggSum(Long workflowExecutionsUsageAggSum) {
    this.workflowExecutionsUsageAggSum = workflowExecutionsUsageAggSum;
    putAdditionalProperty(
        JSON_PROPERTY_WORKFLOW_EXECUTIONS_USAGE_AGG_SUM, workflowExecutionsUsageAggSum);
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
   * @return UsageSummaryResponse
   */
  @JsonAnySetter
  public UsageSummaryResponse putAdditionalProperty(String key, Object value) {
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
            this.aiCreditsAgentBuilderAiCreditsAggSum,
            usageSummaryResponse.aiCreditsAgentBuilderAiCreditsAggSum)
        && Objects.equals(this.aiCreditsAggSum, usageSummaryResponse.aiCreditsAggSum)
        && Objects.equals(
            this.aiCreditsBitsAssistantAiCreditsAggSum,
            usageSummaryResponse.aiCreditsBitsAssistantAiCreditsAggSum)
        && Objects.equals(
            this.aiCreditsBitsDevAiCreditsAggSum,
            usageSummaryResponse.aiCreditsBitsDevAiCreditsAggSum)
        && Objects.equals(
            this.aiCreditsBitsSreAiCreditsAggSum,
            usageSummaryResponse.aiCreditsBitsSreAiCreditsAggSum)
        && Objects.equals(
            this.apmAzureAppServiceHostTop99pSum,
            usageSummaryResponse.apmAzureAppServiceHostTop99pSum)
        && Objects.equals(
            this.apmDevsecopsHostTop99pSum, usageSummaryResponse.apmDevsecopsHostTop99pSum)
        && Objects.equals(
            this.apmEnterpriseStandaloneHostsTop99pSum,
            usageSummaryResponse.apmEnterpriseStandaloneHostsTop99pSum)
        && Objects.equals(this.apmFargateCountAvgSum, usageSummaryResponse.apmFargateCountAvgSum)
        && Objects.equals(this.apmHostTop99pSum, usageSummaryResponse.apmHostTop99pSum)
        && Objects.equals(
            this.apmProStandaloneHostsTop99pSum,
            usageSummaryResponse.apmProStandaloneHostsTop99pSum)
        && Objects.equals(
            this.appsecFargateCountAvgSum, usageSummaryResponse.appsecFargateCountAvgSum)
        && Objects.equals(this.asmServerlessAggSum, usageSummaryResponse.asmServerlessAggSum)
        && Objects.equals(
            this.auditLogsLinesIndexedAggSum, usageSummaryResponse.auditLogsLinesIndexedAggSum)
        && Objects.equals(
            this.auditTrailEnabledHwmSum, usageSummaryResponse.auditTrailEnabledHwmSum)
        && Objects.equals(
            this.auditTrailEventForwardingEventsAggSum,
            usageSummaryResponse.auditTrailEventForwardingEventsAggSum)
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
            this.bitsAiInvestigationsAggSum, usageSummaryResponse.bitsAiInvestigationsAggSum)
        && Objects.equals(
            this.browserRumLiteSessionCountAggSum,
            usageSummaryResponse.browserRumLiteSessionCountAggSum)
        && Objects.equals(
            this.browserRumReplaySessionCountAggSum,
            usageSummaryResponse.browserRumReplaySessionCountAggSum)
        && Objects.equals(this.browserRumUnitsAggSum, usageSummaryResponse.browserRumUnitsAggSum)
        && Objects.equals(
            this.ccmAnthropicSpendLastSum, usageSummaryResponse.ccmAnthropicSpendLastSum)
        && Objects.equals(this.ccmAwsSpendLastSum, usageSummaryResponse.ccmAwsSpendLastSum)
        && Objects.equals(this.ccmAzureSpendLastSum, usageSummaryResponse.ccmAzureSpendLastSum)
        && Objects.equals(
            this.ccmConfluentSpendLastSum, usageSummaryResponse.ccmConfluentSpendLastSum)
        && Objects.equals(
            this.ccmDatabricksSpendLastSum, usageSummaryResponse.ccmDatabricksSpendLastSum)
        && Objects.equals(this.ccmElasticSpendLastSum, usageSummaryResponse.ccmElasticSpendLastSum)
        && Objects.equals(this.ccmFastlySpendLastSum, usageSummaryResponse.ccmFastlySpendLastSum)
        && Objects.equals(this.ccmGcpSpendLastSum, usageSummaryResponse.ccmGcpSpendLastSum)
        && Objects.equals(this.ccmGithubSpendLastSum, usageSummaryResponse.ccmGithubSpendLastSum)
        && Objects.equals(this.ccmMongodbSpendLastSum, usageSummaryResponse.ccmMongodbSpendLastSum)
        && Objects.equals(this.ccmOciSpendLastSum, usageSummaryResponse.ccmOciSpendLastSum)
        && Objects.equals(this.ccmOpenaiSpendLastSum, usageSummaryResponse.ccmOpenaiSpendLastSum)
        && Objects.equals(
            this.ccmSnowflakeSpendLastSum, usageSummaryResponse.ccmSnowflakeSpendLastSum)
        && Objects.equals(
            this.ccmSpendMonitoredEntLastSum, usageSummaryResponse.ccmSpendMonitoredEntLastSum)
        && Objects.equals(
            this.ccmSpendMonitoredProLastSum, usageSummaryResponse.ccmSpendMonitoredProLastSum)
        && Objects.equals(this.ccmTwilioSpendLastSum, usageSummaryResponse.ccmTwilioSpendLastSum)
        && Objects.equals(
            this.ciPipelineIndexedSpansAggSum, usageSummaryResponse.ciPipelineIndexedSpansAggSum)
        && Objects.equals(
            this.ciTestIndexedSpansAggSum, usageSummaryResponse.ciTestIndexedSpansAggSum)
        && Objects.equals(
            this.ciVisibilityItrCommittersHwmSum,
            usageSummaryResponse.ciVisibilityItrCommittersHwmSum)
        && Objects.equals(
            this.ciVisibilityPipelineCommittersHwmSum,
            usageSummaryResponse.ciVisibilityPipelineCommittersHwmSum)
        && Objects.equals(
            this.ciVisibilityTestCommittersHwmSum,
            usageSummaryResponse.ciVisibilityTestCommittersHwmSum)
        && Objects.equals(
            this.cloudCostManagementAwsHostCountAvgSum,
            usageSummaryResponse.cloudCostManagementAwsHostCountAvgSum)
        && Objects.equals(
            this.cloudCostManagementAzureHostCountAvgSum,
            usageSummaryResponse.cloudCostManagementAzureHostCountAvgSum)
        && Objects.equals(
            this.cloudCostManagementGcpHostCountAvgSum,
            usageSummaryResponse.cloudCostManagementGcpHostCountAvgSum)
        && Objects.equals(
            this.cloudCostManagementHostCountAvgSum,
            usageSummaryResponse.cloudCostManagementHostCountAvgSum)
        && Objects.equals(
            this.cloudCostManagementOciHostCountAvgSum,
            usageSummaryResponse.cloudCostManagementOciHostCountAvgSum)
        && Objects.equals(this.cloudSiemEventsAggSum, usageSummaryResponse.cloudSiemEventsAggSum)
        && Objects.equals(
            this.cloudSiemIndexedLogsAggSum, usageSummaryResponse.cloudSiemIndexedLogsAggSum)
        && Objects.equals(
            this.codeAnalysisSaCommittersHwmSum,
            usageSummaryResponse.codeAnalysisSaCommittersHwmSum)
        && Objects.equals(
            this.codeAnalysisScaCommittersHwmSum,
            usageSummaryResponse.codeAnalysisScaCommittersHwmSum)
        && Objects.equals(
            this.codeSecurityHostTop99pSum, usageSummaryResponse.codeSecurityHostTop99pSum)
        && Objects.equals(this.containerAvgSum, usageSummaryResponse.containerAvgSum)
        && Objects.equals(
            this.containerExclAgentAvgSum, usageSummaryResponse.containerExclAgentAvgSum)
        && Objects.equals(this.containerHwmSum, usageSummaryResponse.containerHwmSum)
        && Objects.equals(
            this.csmContainerEnterpriseComplianceCountAggSum,
            usageSummaryResponse.csmContainerEnterpriseComplianceCountAggSum)
        && Objects.equals(
            this.csmContainerEnterpriseCwsCountAggSum,
            usageSummaryResponse.csmContainerEnterpriseCwsCountAggSum)
        && Objects.equals(
            this.csmContainerEnterpriseTotalCountAggSum,
            usageSummaryResponse.csmContainerEnterpriseTotalCountAggSum)
        && Objects.equals(
            this.csmHostEnterpriseAasHostCountTop99pSum,
            usageSummaryResponse.csmHostEnterpriseAasHostCountTop99pSum)
        && Objects.equals(
            this.csmHostEnterpriseAwsHostCountTop99pSum,
            usageSummaryResponse.csmHostEnterpriseAwsHostCountTop99pSum)
        && Objects.equals(
            this.csmHostEnterpriseAzureHostCountTop99pSum,
            usageSummaryResponse.csmHostEnterpriseAzureHostCountTop99pSum)
        && Objects.equals(
            this.csmHostEnterpriseComplianceHostCountTop99pSum,
            usageSummaryResponse.csmHostEnterpriseComplianceHostCountTop99pSum)
        && Objects.equals(
            this.csmHostEnterpriseCwsHostCountTop99pSum,
            usageSummaryResponse.csmHostEnterpriseCwsHostCountTop99pSum)
        && Objects.equals(
            this.csmHostEnterpriseGcpHostCountTop99pSum,
            usageSummaryResponse.csmHostEnterpriseGcpHostCountTop99pSum)
        && Objects.equals(
            this.csmHostEnterpriseOciHostCountTop99pSum,
            usageSummaryResponse.csmHostEnterpriseOciHostCountTop99pSum)
        && Objects.equals(
            this.csmHostEnterpriseTotalHostCountTop99pSum,
            usageSummaryResponse.csmHostEnterpriseTotalHostCountTop99pSum)
        && Objects.equals(
            this.csmHostProHostsAgentlessScannersAggSum,
            usageSummaryResponse.csmHostProHostsAgentlessScannersAggSum)
        && Objects.equals(
            this.csmHostProHostsAgentlessScannersTop99pSum,
            usageSummaryResponse.csmHostProHostsAgentlessScannersTop99pSum)
        && Objects.equals(
            this.csmHostProOciHostCountTop99pSum,
            usageSummaryResponse.csmHostProOciHostCountTop99pSum)
        && Objects.equals(this.cspmAasHostTop99pSum, usageSummaryResponse.cspmAasHostTop99pSum)
        && Objects.equals(this.cspmAwsHostTop99pSum, usageSummaryResponse.cspmAwsHostTop99pSum)
        && Objects.equals(this.cspmAzureHostTop99pSum, usageSummaryResponse.cspmAzureHostTop99pSum)
        && Objects.equals(this.cspmContainerAvgSum, usageSummaryResponse.cspmContainerAvgSum)
        && Objects.equals(this.cspmContainerHwmSum, usageSummaryResponse.cspmContainerHwmSum)
        && Objects.equals(this.cspmGcpHostTop99pSum, usageSummaryResponse.cspmGcpHostTop99pSum)
        && Objects.equals(this.cspmHostTop99pSum, usageSummaryResponse.cspmHostTop99pSum)
        && Objects.equals(
            this.cspmHostsAgentlessScannersAggSum,
            usageSummaryResponse.cspmHostsAgentlessScannersAggSum)
        && Objects.equals(
            this.cspmHostsAgentlessScannersTop99pSum,
            usageSummaryResponse.cspmHostsAgentlessScannersTop99pSum)
        && Objects.equals(this.customHistoricalTsSum, usageSummaryResponse.customHistoricalTsSum)
        && Objects.equals(this.customLiveTsSum, usageSummaryResponse.customLiveTsSum)
        && Objects.equals(this.customTsSum, usageSummaryResponse.customTsSum)
        && Objects.equals(this.cwsContainerAvgSum, usageSummaryResponse.cwsContainerAvgSum)
        && Objects.equals(this.cwsFargateTaskAvgSum, usageSummaryResponse.cwsFargateTaskAvgSum)
        && Objects.equals(this.cwsHostTop99pSum, usageSummaryResponse.cwsHostTop99pSum)
        && Objects.equals(
            this.dataJobsMonitoringHostHrAggSum,
            usageSummaryResponse.dataJobsMonitoringHostHrAggSum)
        && Objects.equals(
            this.dataStreamMonitoringHostCountAggSum,
            usageSummaryResponse.dataStreamMonitoringHostCountAggSum)
        && Objects.equals(
            this.dataStreamMonitoringHostCountTop99pSum,
            usageSummaryResponse.dataStreamMonitoringHostCountTop99pSum)
        && Objects.equals(this.dbmHostTop99pSum, usageSummaryResponse.dbmHostTop99pSum)
        && Objects.equals(this.dbmQueriesAvgSum, usageSummaryResponse.dbmQueriesAvgSum)
        && Objects.equals(
            this.doJobsMonitoringOrchestratorsJobHoursAggSum,
            usageSummaryResponse.doJobsMonitoringOrchestratorsJobHoursAggSum)
        && Objects.equals(this.endDate, usageSummaryResponse.endDate)
        && Objects.equals(
            this.ephInfraHostAgentAggSum, usageSummaryResponse.ephInfraHostAgentAggSum)
        && Objects.equals(
            this.ephInfraHostAlibabaAggSum, usageSummaryResponse.ephInfraHostAlibabaAggSum)
        && Objects.equals(this.ephInfraHostAwsAggSum, usageSummaryResponse.ephInfraHostAwsAggSum)
        && Objects.equals(
            this.ephInfraHostAzureAggSum, usageSummaryResponse.ephInfraHostAzureAggSum)
        && Objects.equals(
            this.ephInfraHostBasicAggSum, usageSummaryResponse.ephInfraHostBasicAggSum)
        && Objects.equals(
            this.ephInfraHostBasicInfraBasicAgentAggSum,
            usageSummaryResponse.ephInfraHostBasicInfraBasicAgentAggSum)
        && Objects.equals(
            this.ephInfraHostBasicInfraBasicVsphereAggSum,
            usageSummaryResponse.ephInfraHostBasicInfraBasicVsphereAggSum)
        && Objects.equals(this.ephInfraHostEntAggSum, usageSummaryResponse.ephInfraHostEntAggSum)
        && Objects.equals(this.ephInfraHostGcpAggSum, usageSummaryResponse.ephInfraHostGcpAggSum)
        && Objects.equals(
            this.ephInfraHostHerokuAggSum, usageSummaryResponse.ephInfraHostHerokuAggSum)
        && Objects.equals(
            this.ephInfraHostOnlyAasAggSum, usageSummaryResponse.ephInfraHostOnlyAasAggSum)
        && Objects.equals(
            this.ephInfraHostOnlyVsphereAggSum, usageSummaryResponse.ephInfraHostOnlyVsphereAggSum)
        && Objects.equals(
            this.ephInfraHostOpentelemetryAggSum,
            usageSummaryResponse.ephInfraHostOpentelemetryAggSum)
        && Objects.equals(
            this.ephInfraHostOpentelemetryApmAggSum,
            usageSummaryResponse.ephInfraHostOpentelemetryApmAggSum)
        && Objects.equals(this.ephInfraHostProAggSum, usageSummaryResponse.ephInfraHostProAggSum)
        && Objects.equals(
            this.ephInfraHostProplusAggSum, usageSummaryResponse.ephInfraHostProplusAggSum)
        && Objects.equals(
            this.ephInfraHostProxmoxAggSum, usageSummaryResponse.ephInfraHostProxmoxAggSum)
        && Objects.equals(
            this.errorTrackingApmErrorEventsAggSum,
            usageSummaryResponse.errorTrackingApmErrorEventsAggSum)
        && Objects.equals(
            this.errorTrackingErrorEventsAggSum,
            usageSummaryResponse.errorTrackingErrorEventsAggSum)
        && Objects.equals(
            this.errorTrackingEventsAggSum, usageSummaryResponse.errorTrackingEventsAggSum)
        && Objects.equals(
            this.errorTrackingRumErrorEventsAggSum,
            usageSummaryResponse.errorTrackingRumErrorEventsAggSum)
        && Objects.equals(
            this.eventManagementCorrelationAggSum,
            usageSummaryResponse.eventManagementCorrelationAggSum)
        && Objects.equals(
            this.eventManagementCorrelationCorrelatedEventsAggSum,
            usageSummaryResponse.eventManagementCorrelationCorrelatedEventsAggSum)
        && Objects.equals(
            this.eventManagementCorrelationCorrelatedRelatedEventsAggSum,
            usageSummaryResponse.eventManagementCorrelationCorrelatedRelatedEventsAggSum)
        && Objects.equals(
            this.fargateContainerProfilerProfilingFargateAvgSum,
            usageSummaryResponse.fargateContainerProfilerProfilingFargateAvgSum)
        && Objects.equals(
            this.fargateContainerProfilerProfilingFargateEksAvgSum,
            usageSummaryResponse.fargateContainerProfilerProfilingFargateEksAvgSum)
        && Objects.equals(
            this.fargateTasksCountAvgSum, usageSummaryResponse.fargateTasksCountAvgSum)
        && Objects.equals(
            this.fargateTasksCountHwmSum, usageSummaryResponse.fargateTasksCountHwmSum)
        && Objects.equals(
            this.featureFlagsConfigRequestsAggSum,
            usageSummaryResponse.featureFlagsConfigRequestsAggSum)
        && Objects.equals(
            this.flexLogsComputeLargeAvgSum, usageSummaryResponse.flexLogsComputeLargeAvgSum)
        && Objects.equals(
            this.flexLogsComputeMediumAvgSum, usageSummaryResponse.flexLogsComputeMediumAvgSum)
        && Objects.equals(
            this.flexLogsComputeSmallAvgSum, usageSummaryResponse.flexLogsComputeSmallAvgSum)
        && Objects.equals(
            this.flexLogsComputeXlargeAvgSum, usageSummaryResponse.flexLogsComputeXlargeAvgSum)
        && Objects.equals(
            this.flexLogsComputeXsmallAvgSum, usageSummaryResponse.flexLogsComputeXsmallAvgSum)
        && Objects.equals(this.flexLogsStarterAvgSum, usageSummaryResponse.flexLogsStarterAvgSum)
        && Objects.equals(
            this.flexLogsStarterStorageIndexAvgSum,
            usageSummaryResponse.flexLogsStarterStorageIndexAvgSum)
        && Objects.equals(
            this.flexLogsStarterStorageRetentionAdjustmentAvgSum,
            usageSummaryResponse.flexLogsStarterStorageRetentionAdjustmentAvgSum)
        && Objects.equals(this.flexStoredLogsAvgSum, usageSummaryResponse.flexStoredLogsAvgSum)
        && Objects.equals(
            this.forwardingEventsBytesAggSum, usageSummaryResponse.forwardingEventsBytesAggSum)
        && Objects.equals(this.gcpHostTop99pSum, usageSummaryResponse.gcpHostTop99pSum)
        && Objects.equals(this.herokuHostTop99pSum, usageSummaryResponse.herokuHostTop99pSum)
        && Objects.equals(
            this.incidentManagementMonthlyActiveUsersHwmSum,
            usageSummaryResponse.incidentManagementMonthlyActiveUsersHwmSum)
        && Objects.equals(
            this.incidentManagementSeatsHwmSum, usageSummaryResponse.incidentManagementSeatsHwmSum)
        && Objects.equals(
            this.indexedEventsCountAggSum, usageSummaryResponse.indexedEventsCountAggSum)
        && Objects.equals(this.indexedPointsAggSum, usageSummaryResponse.indexedPointsAggSum)
        && Objects.equals(this.infraCpuAggSum, usageSummaryResponse.infraCpuAggSum)
        && Objects.equals(this.infraCpuAvgSum, usageSummaryResponse.infraCpuAvgSum)
        && Objects.equals(
            this.infraCpuDefaultInfraHostVcpuAgentAggSum,
            usageSummaryResponse.infraCpuDefaultInfraHostVcpuAgentAggSum)
        && Objects.equals(
            this.infraCpuDefaultInfraHostVcpuAgentAvgSum,
            usageSummaryResponse.infraCpuDefaultInfraHostVcpuAgentAvgSum)
        && Objects.equals(
            this.infraCpuDefaultInfraHostVcpuAgentBasicAggSum,
            usageSummaryResponse.infraCpuDefaultInfraHostVcpuAgentBasicAggSum)
        && Objects.equals(
            this.infraCpuDefaultInfraHostVcpuAgentBasicAvgSum,
            usageSummaryResponse.infraCpuDefaultInfraHostVcpuAgentBasicAvgSum)
        && Objects.equals(
            this.infraCpuDefaultInfraHostVcpuAwsAggSum,
            usageSummaryResponse.infraCpuDefaultInfraHostVcpuAwsAggSum)
        && Objects.equals(
            this.infraCpuDefaultInfraHostVcpuAwsAvgSum,
            usageSummaryResponse.infraCpuDefaultInfraHostVcpuAwsAvgSum)
        && Objects.equals(
            this.infraCpuDefaultInfraHostVcpuAzureAggSum,
            usageSummaryResponse.infraCpuDefaultInfraHostVcpuAzureAggSum)
        && Objects.equals(
            this.infraCpuDefaultInfraHostVcpuAzureAvgSum,
            usageSummaryResponse.infraCpuDefaultInfraHostVcpuAzureAvgSum)
        && Objects.equals(
            this.infraCpuDefaultInfraHostVcpuGcpAggSum,
            usageSummaryResponse.infraCpuDefaultInfraHostVcpuGcpAggSum)
        && Objects.equals(
            this.infraCpuDefaultInfraHostVcpuGcpAvgSum,
            usageSummaryResponse.infraCpuDefaultInfraHostVcpuGcpAvgSum)
        && Objects.equals(
            this.infraCpuDefaultInfraHostVcpuNutanixAggSum,
            usageSummaryResponse.infraCpuDefaultInfraHostVcpuNutanixAggSum)
        && Objects.equals(
            this.infraCpuDefaultInfraHostVcpuNutanixAvgSum,
            usageSummaryResponse.infraCpuDefaultInfraHostVcpuNutanixAvgSum)
        && Objects.equals(
            this.infraCpuDefaultInfraHostVcpuNutanixBasicAggSum,
            usageSummaryResponse.infraCpuDefaultInfraHostVcpuNutanixBasicAggSum)
        && Objects.equals(
            this.infraCpuDefaultInfraHostVcpuNutanixBasicAvgSum,
            usageSummaryResponse.infraCpuDefaultInfraHostVcpuNutanixBasicAvgSum)
        && Objects.equals(
            this.infraCpuDefaultInfraHostVcpuOpentelemetryAggSum,
            usageSummaryResponse.infraCpuDefaultInfraHostVcpuOpentelemetryAggSum)
        && Objects.equals(
            this.infraCpuDefaultInfraHostVcpuOpentelemetryAvgSum,
            usageSummaryResponse.infraCpuDefaultInfraHostVcpuOpentelemetryAvgSum)
        && Objects.equals(
            this.infraCpuObservedInfraHostVcpuAgentAggSum,
            usageSummaryResponse.infraCpuObservedInfraHostVcpuAgentAggSum)
        && Objects.equals(
            this.infraCpuObservedInfraHostVcpuAgentAvgSum,
            usageSummaryResponse.infraCpuObservedInfraHostVcpuAgentAvgSum)
        && Objects.equals(
            this.infraCpuObservedInfraHostVcpuAwsAggSum,
            usageSummaryResponse.infraCpuObservedInfraHostVcpuAwsAggSum)
        && Objects.equals(
            this.infraCpuObservedInfraHostVcpuAwsAvgSum,
            usageSummaryResponse.infraCpuObservedInfraHostVcpuAwsAvgSum)
        && Objects.equals(
            this.infraCpuObservedInfraHostVcpuAzureAggSum,
            usageSummaryResponse.infraCpuObservedInfraHostVcpuAzureAggSum)
        && Objects.equals(
            this.infraCpuObservedInfraHostVcpuAzureAvgSum,
            usageSummaryResponse.infraCpuObservedInfraHostVcpuAzureAvgSum)
        && Objects.equals(
            this.infraCpuObservedInfraHostVcpuGcpAggSum,
            usageSummaryResponse.infraCpuObservedInfraHostVcpuGcpAggSum)
        && Objects.equals(
            this.infraCpuObservedInfraHostVcpuGcpAvgSum,
            usageSummaryResponse.infraCpuObservedInfraHostVcpuGcpAvgSum)
        && Objects.equals(
            this.infraCpuObservedInfraHostVcpuNutanixAggSum,
            usageSummaryResponse.infraCpuObservedInfraHostVcpuNutanixAggSum)
        && Objects.equals(
            this.infraCpuObservedInfraHostVcpuNutanixAvgSum,
            usageSummaryResponse.infraCpuObservedInfraHostVcpuNutanixAvgSum)
        && Objects.equals(
            this.infraCpuObservedInfraHostVcpuOpentelemetryAggSum,
            usageSummaryResponse.infraCpuObservedInfraHostVcpuOpentelemetryAggSum)
        && Objects.equals(
            this.infraCpuObservedInfraHostVcpuOpentelemetryAvgSum,
            usageSummaryResponse.infraCpuObservedInfraHostVcpuOpentelemetryAvgSum)
        && Objects.equals(
            this.infraEdgeMonitoringDevicesTop99pSum,
            usageSummaryResponse.infraEdgeMonitoringDevicesTop99pSum)
        && Objects.equals(
            this.infraHostBasicInfraBasicAgentTop99pSum,
            usageSummaryResponse.infraHostBasicInfraBasicAgentTop99pSum)
        && Objects.equals(
            this.infraHostBasicInfraBasicVsphereTop99pSum,
            usageSummaryResponse.infraHostBasicInfraBasicVsphereTop99pSum)
        && Objects.equals(
            this.infraHostBasicTop99pSum, usageSummaryResponse.infraHostBasicTop99pSum)
        && Objects.equals(this.infraHostTop99pSum, usageSummaryResponse.infraHostTop99pSum)
        && Objects.equals(
            this.infraStorageMgmtObjectsCountAvgSum,
            usageSummaryResponse.infraStorageMgmtObjectsCountAvgSum)
        && Objects.equals(this.ingestPointsAggSum, usageSummaryResponse.ingestPointsAggSum)
        && Objects.equals(
            this.ingestedEventsBytesAggSum, usageSummaryResponse.ingestedEventsBytesAggSum)
        && Objects.equals(this.iotApmHostAggSum, usageSummaryResponse.iotApmHostAggSum)
        && Objects.equals(this.iotApmHostTop99pSum, usageSummaryResponse.iotApmHostTop99pSum)
        && Objects.equals(this.iotDeviceAggSum, usageSummaryResponse.iotDeviceAggSum)
        && Objects.equals(this.iotDeviceTop99pSum, usageSummaryResponse.iotDeviceTop99pSum)
        && Objects.equals(this.lastUpdated, usageSummaryResponse.lastUpdated)
        && Objects.equals(
            this.liveIndexedEventsAggSum, usageSummaryResponse.liveIndexedEventsAggSum)
        && Objects.equals(
            this.liveIngestedBytesAggSum, usageSummaryResponse.liveIngestedBytesAggSum)
        && Objects.equals(
            this.llmObservability15dayRetentionSpansAggSum,
            usageSummaryResponse.llmObservability15dayRetentionSpansAggSum)
        && Objects.equals(
            this.llmObservability30dayRetentionSpansAggSum,
            usageSummaryResponse.llmObservability30dayRetentionSpansAggSum)
        && Objects.equals(
            this.llmObservability60dayRetentionSpansAggSum,
            usageSummaryResponse.llmObservability60dayRetentionSpansAggSum)
        && Objects.equals(
            this.llmObservability90dayRetentionSpansAggSum,
            usageSummaryResponse.llmObservability90dayRetentionSpansAggSum)
        && Objects.equals(this.llmObservabilityAggSum, usageSummaryResponse.llmObservabilityAggSum)
        && Objects.equals(
            this.llmObservabilityMinSpendAggSum,
            usageSummaryResponse.llmObservabilityMinSpendAggSum)
        && Objects.equals(
            this.logsArchiveSearchGbScannedAggSum,
            usageSummaryResponse.logsArchiveSearchGbScannedAggSum)
        && Objects.equals(this.logsByRetention, usageSummaryResponse.logsByRetention)
        && Objects.equals(this.metricNamesAggSum, usageSummaryResponse.metricNamesAggSum)
        && Objects.equals(
            this.mobileRumLiteSessionCountAggSum,
            usageSummaryResponse.mobileRumLiteSessionCountAggSum)
        && Objects.equals(
            this.mobileRumSessionCountAggSum, usageSummaryResponse.mobileRumSessionCountAggSum)
        && Objects.equals(
            this.mobileRumSessionCountAndroidAggSum,
            usageSummaryResponse.mobileRumSessionCountAndroidAggSum)
        && Objects.equals(
            this.mobileRumSessionCountFlutterAggSum,
            usageSummaryResponse.mobileRumSessionCountFlutterAggSum)
        && Objects.equals(
            this.mobileRumSessionCountIosAggSum,
            usageSummaryResponse.mobileRumSessionCountIosAggSum)
        && Objects.equals(
            this.mobileRumSessionCountReactnativeAggSum,
            usageSummaryResponse.mobileRumSessionCountReactnativeAggSum)
        && Objects.equals(
            this.mobileRumSessionCountRokuAggSum,
            usageSummaryResponse.mobileRumSessionCountRokuAggSum)
        && Objects.equals(this.mobileRumUnitsAggSum, usageSummaryResponse.mobileRumUnitsAggSum)
        && Objects.equals(this.ndmNetflowEventsAggSum, usageSummaryResponse.ndmNetflowEventsAggSum)
        && Objects.equals(
            this.netflowIndexedEventsCountAggSum,
            usageSummaryResponse.netflowIndexedEventsCountAggSum)
        && Objects.equals(
            this.networkDeviceWirelessTop99pSum,
            usageSummaryResponse.networkDeviceWirelessTop99pSum)
        && Objects.equals(this.networkPathAggSum, usageSummaryResponse.networkPathAggSum)
        && Objects.equals(this.npmHostTop99pSum, usageSummaryResponse.npmHostTop99pSum)
        && Objects.equals(
            this.observabilityPipelinesBytesProcessedAggSum,
            usageSummaryResponse.observabilityPipelinesBytesProcessedAggSum)
        && Objects.equals(this.ociHostAggSum, usageSummaryResponse.ociHostAggSum)
        && Objects.equals(this.ociHostTop99pSum, usageSummaryResponse.ociHostTop99pSum)
        && Objects.equals(this.onCallSeatHwmSum, usageSummaryResponse.onCallSeatHwmSum)
        && Objects.equals(
            this.onlineArchiveEventsCountAggSum,
            usageSummaryResponse.onlineArchiveEventsCountAggSum)
        && Objects.equals(
            this.opentelemetryApmHostTop99pSum, usageSummaryResponse.opentelemetryApmHostTop99pSum)
        && Objects.equals(
            this.opentelemetryHostTop99pSum, usageSummaryResponse.opentelemetryHostTop99pSum)
        && Objects.equals(this.productAnalyticsAggSum, usageSummaryResponse.productAnalyticsAggSum)
        && Objects.equals(
            this.profilingAasCountTop99pSum, usageSummaryResponse.profilingAasCountTop99pSum)
        && Objects.equals(
            this.profilingContainerAgentCountAvg,
            usageSummaryResponse.profilingContainerAgentCountAvg)
        && Objects.equals(
            this.profilingHostCountTop99pSum, usageSummaryResponse.profilingHostCountTop99pSum)
        && Objects.equals(this.proxmoxHostAggSum, usageSummaryResponse.proxmoxHostAggSum)
        && Objects.equals(this.proxmoxHostTop99pSum, usageSummaryResponse.proxmoxHostTop99pSum)
        && Objects.equals(this.publishedAppHwmSum, usageSummaryResponse.publishedAppHwmSum)
        && Objects.equals(
            this.rehydratedIndexedEventsAggSum, usageSummaryResponse.rehydratedIndexedEventsAggSum)
        && Objects.equals(
            this.rehydratedIngestedBytesAggSum, usageSummaryResponse.rehydratedIngestedBytesAggSum)
        && Objects.equals(
            this.rumBrowserAndMobileSessionCount,
            usageSummaryResponse.rumBrowserAndMobileSessionCount)
        && Objects.equals(
            this.rumBrowserLegacySessionCountAggSum,
            usageSummaryResponse.rumBrowserLegacySessionCountAggSum)
        && Objects.equals(
            this.rumBrowserLiteSessionCountAggSum,
            usageSummaryResponse.rumBrowserLiteSessionCountAggSum)
        && Objects.equals(
            this.rumBrowserReplaySessionCountAggSum,
            usageSummaryResponse.rumBrowserReplaySessionCountAggSum)
        && Objects.equals(
            this.rumIndexedSessionsAggSum, usageSummaryResponse.rumIndexedSessionsAggSum)
        && Objects.equals(
            this.rumIngestedSessionsAggSum, usageSummaryResponse.rumIngestedSessionsAggSum)
        && Objects.equals(
            this.rumLiteSessionCountAggSum, usageSummaryResponse.rumLiteSessionCountAggSum)
        && Objects.equals(
            this.rumMobileLegacySessionCountAndroidAggSum,
            usageSummaryResponse.rumMobileLegacySessionCountAndroidAggSum)
        && Objects.equals(
            this.rumMobileLegacySessionCountFlutterAggSum,
            usageSummaryResponse.rumMobileLegacySessionCountFlutterAggSum)
        && Objects.equals(
            this.rumMobileLegacySessionCountIosAggSum,
            usageSummaryResponse.rumMobileLegacySessionCountIosAggSum)
        && Objects.equals(
            this.rumMobileLegacySessionCountReactnativeAggSum,
            usageSummaryResponse.rumMobileLegacySessionCountReactnativeAggSum)
        && Objects.equals(
            this.rumMobileLegacySessionCountRokuAggSum,
            usageSummaryResponse.rumMobileLegacySessionCountRokuAggSum)
        && Objects.equals(
            this.rumMobileLiteSessionCountAndroidAggSum,
            usageSummaryResponse.rumMobileLiteSessionCountAndroidAggSum)
        && Objects.equals(
            this.rumMobileLiteSessionCountFlutterAggSum,
            usageSummaryResponse.rumMobileLiteSessionCountFlutterAggSum)
        && Objects.equals(
            this.rumMobileLiteSessionCountIosAggSum,
            usageSummaryResponse.rumMobileLiteSessionCountIosAggSum)
        && Objects.equals(
            this.rumMobileLiteSessionCountKotlinmultiplatformAggSum,
            usageSummaryResponse.rumMobileLiteSessionCountKotlinmultiplatformAggSum)
        && Objects.equals(
            this.rumMobileLiteSessionCountReactnativeAggSum,
            usageSummaryResponse.rumMobileLiteSessionCountReactnativeAggSum)
        && Objects.equals(
            this.rumMobileLiteSessionCountRokuAggSum,
            usageSummaryResponse.rumMobileLiteSessionCountRokuAggSum)
        && Objects.equals(
            this.rumMobileLiteSessionCountUnityAggSum,
            usageSummaryResponse.rumMobileLiteSessionCountUnityAggSum)
        && Objects.equals(
            this.rumMobileReplaySessionCountAndroidAggSum,
            usageSummaryResponse.rumMobileReplaySessionCountAndroidAggSum)
        && Objects.equals(
            this.rumMobileReplaySessionCountIosAggSum,
            usageSummaryResponse.rumMobileReplaySessionCountIosAggSum)
        && Objects.equals(
            this.rumMobileReplaySessionCountKotlinmultiplatformAggSum,
            usageSummaryResponse.rumMobileReplaySessionCountKotlinmultiplatformAggSum)
        && Objects.equals(
            this.rumMobileReplaySessionCountReactnativeAggSum,
            usageSummaryResponse.rumMobileReplaySessionCountReactnativeAggSum)
        && Objects.equals(
            this.rumReplaySessionCountAggSum, usageSummaryResponse.rumReplaySessionCountAggSum)
        && Objects.equals(this.rumSessionCountAggSum, usageSummaryResponse.rumSessionCountAggSum)
        && Objects.equals(
            this.rumSessionReplayAddOnAggSum, usageSummaryResponse.rumSessionReplayAddOnAggSum)
        && Objects.equals(
            this.rumTotalSessionCountAggSum, usageSummaryResponse.rumTotalSessionCountAggSum)
        && Objects.equals(this.rumUnitsAggSum, usageSummaryResponse.rumUnitsAggSum)
        && Objects.equals(this.scaFargateCountAvgSum, usageSummaryResponse.scaFargateCountAvgSum)
        && Objects.equals(this.scaFargateCountHwmSum, usageSummaryResponse.scaFargateCountHwmSum)
        && Objects.equals(this.sdsApmScannedBytesSum, usageSummaryResponse.sdsApmScannedBytesSum)
        && Objects.equals(
            this.sdsEventsScannedBytesSum, usageSummaryResponse.sdsEventsScannedBytesSum)
        && Objects.equals(this.sdsLogsScannedBytesSum, usageSummaryResponse.sdsLogsScannedBytesSum)
        && Objects.equals(this.sdsRumScannedBytesSum, usageSummaryResponse.sdsRumScannedBytesSum)
        && Objects.equals(
            this.sdsTotalScannedBytesSum, usageSummaryResponse.sdsTotalScannedBytesSum)
        && Objects.equals(
            this.serverlessAppsApmApmAzureAppserviceInstancesAvgSum,
            usageSummaryResponse.serverlessAppsApmApmAzureAppserviceInstancesAvgSum)
        && Objects.equals(
            this.serverlessAppsApmApmAzureAzurefunctionInstancesAvgSum,
            usageSummaryResponse.serverlessAppsApmApmAzureAzurefunctionInstancesAvgSum)
        && Objects.equals(
            this.serverlessAppsApmApmAzureContainerappInstancesAvgSum,
            usageSummaryResponse.serverlessAppsApmApmAzureContainerappInstancesAvgSum)
        && Objects.equals(
            this.serverlessAppsApmApmFargateEcsTasksAvgSum,
            usageSummaryResponse.serverlessAppsApmApmFargateEcsTasksAvgSum)
        && Objects.equals(
            this.serverlessAppsApmApmGcpCloudfunctionInstancesAvgSum,
            usageSummaryResponse.serverlessAppsApmApmGcpCloudfunctionInstancesAvgSum)
        && Objects.equals(
            this.serverlessAppsApmApmGcpCloudrunInstancesAvgSum,
            usageSummaryResponse.serverlessAppsApmApmGcpCloudrunInstancesAvgSum)
        && Objects.equals(
            this.serverlessAppsApmApmGcpGkeAutopilotPodsAvgSum,
            usageSummaryResponse.serverlessAppsApmApmGcpGkeAutopilotPodsAvgSum)
        && Objects.equals(
            this.serverlessAppsApmAvgSum, usageSummaryResponse.serverlessAppsApmAvgSum)
        && Objects.equals(
            this.serverlessAppsApmExclFargateApmAzureAppserviceInstancesAvgSum,
            usageSummaryResponse.serverlessAppsApmExclFargateApmAzureAppserviceInstancesAvgSum)
        && Objects.equals(
            this.serverlessAppsApmExclFargateApmAzureAzurefunctionInstancesAvgSum,
            usageSummaryResponse.serverlessAppsApmExclFargateApmAzureAzurefunctionInstancesAvgSum)
        && Objects.equals(
            this.serverlessAppsApmExclFargateApmAzureContainerappInstancesAvgSum,
            usageSummaryResponse.serverlessAppsApmExclFargateApmAzureContainerappInstancesAvgSum)
        && Objects.equals(
            this.serverlessAppsApmExclFargateApmGcpCloudfunctionInstancesAvgSum,
            usageSummaryResponse.serverlessAppsApmExclFargateApmGcpCloudfunctionInstancesAvgSum)
        && Objects.equals(
            this.serverlessAppsApmExclFargateApmGcpCloudrunInstancesAvgSum,
            usageSummaryResponse.serverlessAppsApmExclFargateApmGcpCloudrunInstancesAvgSum)
        && Objects.equals(
            this.serverlessAppsApmExclFargateApmGcpGkeAutopilotPodsAvgSum,
            usageSummaryResponse.serverlessAppsApmExclFargateApmGcpGkeAutopilotPodsAvgSum)
        && Objects.equals(
            this.serverlessAppsApmExclFargateAvgSum,
            usageSummaryResponse.serverlessAppsApmExclFargateAvgSum)
        && Objects.equals(
            this.serverlessAppsAzureContainerAppInstancesAvgSum,
            usageSummaryResponse.serverlessAppsAzureContainerAppInstancesAvgSum)
        && Objects.equals(
            this.serverlessAppsAzureCountAvgSum,
            usageSummaryResponse.serverlessAppsAzureCountAvgSum)
        && Objects.equals(
            this.serverlessAppsAzureFunctionAppInstancesAvgSum,
            usageSummaryResponse.serverlessAppsAzureFunctionAppInstancesAvgSum)
        && Objects.equals(
            this.serverlessAppsAzureWebAppInstancesAvgSum,
            usageSummaryResponse.serverlessAppsAzureWebAppInstancesAvgSum)
        && Objects.equals(
            this.serverlessAppsDsmFargateTasksAvgSum,
            usageSummaryResponse.serverlessAppsDsmFargateTasksAvgSum)
        && Objects.equals(
            this.serverlessAppsEcsAvgSum, usageSummaryResponse.serverlessAppsEcsAvgSum)
        && Objects.equals(
            this.serverlessAppsEksAvgSum, usageSummaryResponse.serverlessAppsEksAvgSum)
        && Objects.equals(
            this.serverlessAppsExclFargateAvgSum,
            usageSummaryResponse.serverlessAppsExclFargateAvgSum)
        && Objects.equals(
            this.serverlessAppsExclFargateAzureContainerAppInstancesAvgSum,
            usageSummaryResponse.serverlessAppsExclFargateAzureContainerAppInstancesAvgSum)
        && Objects.equals(
            this.serverlessAppsExclFargateAzureFunctionAppInstancesAvgSum,
            usageSummaryResponse.serverlessAppsExclFargateAzureFunctionAppInstancesAvgSum)
        && Objects.equals(
            this.serverlessAppsExclFargateAzureWebAppInstancesAvgSum,
            usageSummaryResponse.serverlessAppsExclFargateAzureWebAppInstancesAvgSum)
        && Objects.equals(
            this.serverlessAppsExclFargateGoogleCloudFunctionsInstancesAvgSum,
            usageSummaryResponse.serverlessAppsExclFargateGoogleCloudFunctionsInstancesAvgSum)
        && Objects.equals(
            this.serverlessAppsExclFargateGoogleCloudRunInstancesAvgSum,
            usageSummaryResponse.serverlessAppsExclFargateGoogleCloudRunInstancesAvgSum)
        && Objects.equals(
            this.serverlessAppsExclFargateInfraGcpGkeAutopilotPodsAvgSum,
            usageSummaryResponse.serverlessAppsExclFargateInfraGcpGkeAutopilotPodsAvgSum)
        && Objects.equals(
            this.serverlessAppsGoogleCloudFunctionsInstancesAvgSum,
            usageSummaryResponse.serverlessAppsGoogleCloudFunctionsInstancesAvgSum)
        && Objects.equals(
            this.serverlessAppsGoogleCloudRunInstancesAvgSum,
            usageSummaryResponse.serverlessAppsGoogleCloudRunInstancesAvgSum)
        && Objects.equals(
            this.serverlessAppsGoogleCountAvgSum,
            usageSummaryResponse.serverlessAppsGoogleCountAvgSum)
        && Objects.equals(
            this.serverlessAppsInfraGcpGkeAutopilotPodsAvgSum,
            usageSummaryResponse.serverlessAppsInfraGcpGkeAutopilotPodsAvgSum)
        && Objects.equals(
            this.serverlessAppsTotalCountAvgSum,
            usageSummaryResponse.serverlessAppsTotalCountAvgSum)
        && Objects.equals(
            this.siem12moRetentionAggSum, usageSummaryResponse.siem12moRetentionAggSum)
        && Objects.equals(this.siem6moRetentionAggSum, usageSummaryResponse.siem6moRetentionAggSum)
        && Objects.equals(
            this.siemAnalyzedLogsAddOnCountAggSum,
            usageSummaryResponse.siemAnalyzedLogsAddOnCountAggSum)
        && Objects.equals(this.snmpDeviceCountAggSum, usageSummaryResponse.snmpDeviceCountAggSum)
        && Objects.equals(
            this.snmpDeviceCountTop99pSum, usageSummaryResponse.snmpDeviceCountTop99pSum)
        && Objects.equals(this.startDate, usageSummaryResponse.startDate)
        && Objects.equals(
            this.syntheticsBrowserCheckCallsCountAggSum,
            usageSummaryResponse.syntheticsBrowserCheckCallsCountAggSum)
        && Objects.equals(
            this.syntheticsCheckCallsCountAggSum,
            usageSummaryResponse.syntheticsCheckCallsCountAggSum)
        && Objects.equals(
            this.syntheticsMobileTestRunsAggSum,
            usageSummaryResponse.syntheticsMobileTestRunsAggSum)
        && Objects.equals(
            this.syntheticsParallelTestingMaxSlotsHwmSum,
            usageSummaryResponse.syntheticsParallelTestingMaxSlotsHwmSum)
        && Objects.equals(
            this.traceSearchIndexedEventsCountAggSum,
            usageSummaryResponse.traceSearchIndexedEventsCountAggSum)
        && Objects.equals(
            this.twolIngestedEventsBytesAggSum, usageSummaryResponse.twolIngestedEventsBytesAggSum)
        && Objects.equals(
            this.universalServiceMonitoringHostTop99pSum,
            usageSummaryResponse.universalServiceMonitoringHostTop99pSum)
        && Objects.equals(this.usage, usageSummaryResponse.usage)
        && Objects.equals(this.vsphereHostTop99pSum, usageSummaryResponse.vsphereHostTop99pSum)
        && Objects.equals(
            this.vulnManagementHostCountTop99pSum,
            usageSummaryResponse.vulnManagementHostCountTop99pSum)
        && Objects.equals(
            this.workflowExecutionsUsageAggSum, usageSummaryResponse.workflowExecutionsUsageAggSum)
        && Objects.equals(this.additionalProperties, usageSummaryResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        agentHostTop99pSum,
        aiCreditsAgentBuilderAiCreditsAggSum,
        aiCreditsAggSum,
        aiCreditsBitsAssistantAiCreditsAggSum,
        aiCreditsBitsDevAiCreditsAggSum,
        aiCreditsBitsSreAiCreditsAggSum,
        apmAzureAppServiceHostTop99pSum,
        apmDevsecopsHostTop99pSum,
        apmEnterpriseStandaloneHostsTop99pSum,
        apmFargateCountAvgSum,
        apmHostTop99pSum,
        apmProStandaloneHostsTop99pSum,
        appsecFargateCountAvgSum,
        asmServerlessAggSum,
        auditLogsLinesIndexedAggSum,
        auditTrailEnabledHwmSum,
        auditTrailEventForwardingEventsAggSum,
        avgProfiledFargateTasksSum,
        awsHostTop99pSum,
        awsLambdaFuncCount,
        awsLambdaInvocationsSum,
        azureAppServiceTop99pSum,
        azureHostTop99pSum,
        billableIngestedBytesAggSum,
        bitsAiInvestigationsAggSum,
        browserRumLiteSessionCountAggSum,
        browserRumReplaySessionCountAggSum,
        browserRumUnitsAggSum,
        ccmAnthropicSpendLastSum,
        ccmAwsSpendLastSum,
        ccmAzureSpendLastSum,
        ccmConfluentSpendLastSum,
        ccmDatabricksSpendLastSum,
        ccmElasticSpendLastSum,
        ccmFastlySpendLastSum,
        ccmGcpSpendLastSum,
        ccmGithubSpendLastSum,
        ccmMongodbSpendLastSum,
        ccmOciSpendLastSum,
        ccmOpenaiSpendLastSum,
        ccmSnowflakeSpendLastSum,
        ccmSpendMonitoredEntLastSum,
        ccmSpendMonitoredProLastSum,
        ccmTwilioSpendLastSum,
        ciPipelineIndexedSpansAggSum,
        ciTestIndexedSpansAggSum,
        ciVisibilityItrCommittersHwmSum,
        ciVisibilityPipelineCommittersHwmSum,
        ciVisibilityTestCommittersHwmSum,
        cloudCostManagementAwsHostCountAvgSum,
        cloudCostManagementAzureHostCountAvgSum,
        cloudCostManagementGcpHostCountAvgSum,
        cloudCostManagementHostCountAvgSum,
        cloudCostManagementOciHostCountAvgSum,
        cloudSiemEventsAggSum,
        cloudSiemIndexedLogsAggSum,
        codeAnalysisSaCommittersHwmSum,
        codeAnalysisScaCommittersHwmSum,
        codeSecurityHostTop99pSum,
        containerAvgSum,
        containerExclAgentAvgSum,
        containerHwmSum,
        csmContainerEnterpriseComplianceCountAggSum,
        csmContainerEnterpriseCwsCountAggSum,
        csmContainerEnterpriseTotalCountAggSum,
        csmHostEnterpriseAasHostCountTop99pSum,
        csmHostEnterpriseAwsHostCountTop99pSum,
        csmHostEnterpriseAzureHostCountTop99pSum,
        csmHostEnterpriseComplianceHostCountTop99pSum,
        csmHostEnterpriseCwsHostCountTop99pSum,
        csmHostEnterpriseGcpHostCountTop99pSum,
        csmHostEnterpriseOciHostCountTop99pSum,
        csmHostEnterpriseTotalHostCountTop99pSum,
        csmHostProHostsAgentlessScannersAggSum,
        csmHostProHostsAgentlessScannersTop99pSum,
        csmHostProOciHostCountTop99pSum,
        cspmAasHostTop99pSum,
        cspmAwsHostTop99pSum,
        cspmAzureHostTop99pSum,
        cspmContainerAvgSum,
        cspmContainerHwmSum,
        cspmGcpHostTop99pSum,
        cspmHostTop99pSum,
        cspmHostsAgentlessScannersAggSum,
        cspmHostsAgentlessScannersTop99pSum,
        customHistoricalTsSum,
        customLiveTsSum,
        customTsSum,
        cwsContainerAvgSum,
        cwsFargateTaskAvgSum,
        cwsHostTop99pSum,
        dataJobsMonitoringHostHrAggSum,
        dataStreamMonitoringHostCountAggSum,
        dataStreamMonitoringHostCountTop99pSum,
        dbmHostTop99pSum,
        dbmQueriesAvgSum,
        doJobsMonitoringOrchestratorsJobHoursAggSum,
        endDate,
        ephInfraHostAgentAggSum,
        ephInfraHostAlibabaAggSum,
        ephInfraHostAwsAggSum,
        ephInfraHostAzureAggSum,
        ephInfraHostBasicAggSum,
        ephInfraHostBasicInfraBasicAgentAggSum,
        ephInfraHostBasicInfraBasicVsphereAggSum,
        ephInfraHostEntAggSum,
        ephInfraHostGcpAggSum,
        ephInfraHostHerokuAggSum,
        ephInfraHostOnlyAasAggSum,
        ephInfraHostOnlyVsphereAggSum,
        ephInfraHostOpentelemetryAggSum,
        ephInfraHostOpentelemetryApmAggSum,
        ephInfraHostProAggSum,
        ephInfraHostProplusAggSum,
        ephInfraHostProxmoxAggSum,
        errorTrackingApmErrorEventsAggSum,
        errorTrackingErrorEventsAggSum,
        errorTrackingEventsAggSum,
        errorTrackingRumErrorEventsAggSum,
        eventManagementCorrelationAggSum,
        eventManagementCorrelationCorrelatedEventsAggSum,
        eventManagementCorrelationCorrelatedRelatedEventsAggSum,
        fargateContainerProfilerProfilingFargateAvgSum,
        fargateContainerProfilerProfilingFargateEksAvgSum,
        fargateTasksCountAvgSum,
        fargateTasksCountHwmSum,
        featureFlagsConfigRequestsAggSum,
        flexLogsComputeLargeAvgSum,
        flexLogsComputeMediumAvgSum,
        flexLogsComputeSmallAvgSum,
        flexLogsComputeXlargeAvgSum,
        flexLogsComputeXsmallAvgSum,
        flexLogsStarterAvgSum,
        flexLogsStarterStorageIndexAvgSum,
        flexLogsStarterStorageRetentionAdjustmentAvgSum,
        flexStoredLogsAvgSum,
        forwardingEventsBytesAggSum,
        gcpHostTop99pSum,
        herokuHostTop99pSum,
        incidentManagementMonthlyActiveUsersHwmSum,
        incidentManagementSeatsHwmSum,
        indexedEventsCountAggSum,
        indexedPointsAggSum,
        infraCpuAggSum,
        infraCpuAvgSum,
        infraCpuDefaultInfraHostVcpuAgentAggSum,
        infraCpuDefaultInfraHostVcpuAgentAvgSum,
        infraCpuDefaultInfraHostVcpuAgentBasicAggSum,
        infraCpuDefaultInfraHostVcpuAgentBasicAvgSum,
        infraCpuDefaultInfraHostVcpuAwsAggSum,
        infraCpuDefaultInfraHostVcpuAwsAvgSum,
        infraCpuDefaultInfraHostVcpuAzureAggSum,
        infraCpuDefaultInfraHostVcpuAzureAvgSum,
        infraCpuDefaultInfraHostVcpuGcpAggSum,
        infraCpuDefaultInfraHostVcpuGcpAvgSum,
        infraCpuDefaultInfraHostVcpuNutanixAggSum,
        infraCpuDefaultInfraHostVcpuNutanixAvgSum,
        infraCpuDefaultInfraHostVcpuNutanixBasicAggSum,
        infraCpuDefaultInfraHostVcpuNutanixBasicAvgSum,
        infraCpuDefaultInfraHostVcpuOpentelemetryAggSum,
        infraCpuDefaultInfraHostVcpuOpentelemetryAvgSum,
        infraCpuObservedInfraHostVcpuAgentAggSum,
        infraCpuObservedInfraHostVcpuAgentAvgSum,
        infraCpuObservedInfraHostVcpuAwsAggSum,
        infraCpuObservedInfraHostVcpuAwsAvgSum,
        infraCpuObservedInfraHostVcpuAzureAggSum,
        infraCpuObservedInfraHostVcpuAzureAvgSum,
        infraCpuObservedInfraHostVcpuGcpAggSum,
        infraCpuObservedInfraHostVcpuGcpAvgSum,
        infraCpuObservedInfraHostVcpuNutanixAggSum,
        infraCpuObservedInfraHostVcpuNutanixAvgSum,
        infraCpuObservedInfraHostVcpuOpentelemetryAggSum,
        infraCpuObservedInfraHostVcpuOpentelemetryAvgSum,
        infraEdgeMonitoringDevicesTop99pSum,
        infraHostBasicInfraBasicAgentTop99pSum,
        infraHostBasicInfraBasicVsphereTop99pSum,
        infraHostBasicTop99pSum,
        infraHostTop99pSum,
        infraStorageMgmtObjectsCountAvgSum,
        ingestPointsAggSum,
        ingestedEventsBytesAggSum,
        iotApmHostAggSum,
        iotApmHostTop99pSum,
        iotDeviceAggSum,
        iotDeviceTop99pSum,
        lastUpdated,
        liveIndexedEventsAggSum,
        liveIngestedBytesAggSum,
        llmObservability15dayRetentionSpansAggSum,
        llmObservability30dayRetentionSpansAggSum,
        llmObservability60dayRetentionSpansAggSum,
        llmObservability90dayRetentionSpansAggSum,
        llmObservabilityAggSum,
        llmObservabilityMinSpendAggSum,
        logsArchiveSearchGbScannedAggSum,
        logsByRetention,
        metricNamesAggSum,
        mobileRumLiteSessionCountAggSum,
        mobileRumSessionCountAggSum,
        mobileRumSessionCountAndroidAggSum,
        mobileRumSessionCountFlutterAggSum,
        mobileRumSessionCountIosAggSum,
        mobileRumSessionCountReactnativeAggSum,
        mobileRumSessionCountRokuAggSum,
        mobileRumUnitsAggSum,
        ndmNetflowEventsAggSum,
        netflowIndexedEventsCountAggSum,
        networkDeviceWirelessTop99pSum,
        networkPathAggSum,
        npmHostTop99pSum,
        observabilityPipelinesBytesProcessedAggSum,
        ociHostAggSum,
        ociHostTop99pSum,
        onCallSeatHwmSum,
        onlineArchiveEventsCountAggSum,
        opentelemetryApmHostTop99pSum,
        opentelemetryHostTop99pSum,
        productAnalyticsAggSum,
        profilingAasCountTop99pSum,
        profilingContainerAgentCountAvg,
        profilingHostCountTop99pSum,
        proxmoxHostAggSum,
        proxmoxHostTop99pSum,
        publishedAppHwmSum,
        rehydratedIndexedEventsAggSum,
        rehydratedIngestedBytesAggSum,
        rumBrowserAndMobileSessionCount,
        rumBrowserLegacySessionCountAggSum,
        rumBrowserLiteSessionCountAggSum,
        rumBrowserReplaySessionCountAggSum,
        rumIndexedSessionsAggSum,
        rumIngestedSessionsAggSum,
        rumLiteSessionCountAggSum,
        rumMobileLegacySessionCountAndroidAggSum,
        rumMobileLegacySessionCountFlutterAggSum,
        rumMobileLegacySessionCountIosAggSum,
        rumMobileLegacySessionCountReactnativeAggSum,
        rumMobileLegacySessionCountRokuAggSum,
        rumMobileLiteSessionCountAndroidAggSum,
        rumMobileLiteSessionCountFlutterAggSum,
        rumMobileLiteSessionCountIosAggSum,
        rumMobileLiteSessionCountKotlinmultiplatformAggSum,
        rumMobileLiteSessionCountReactnativeAggSum,
        rumMobileLiteSessionCountRokuAggSum,
        rumMobileLiteSessionCountUnityAggSum,
        rumMobileReplaySessionCountAndroidAggSum,
        rumMobileReplaySessionCountIosAggSum,
        rumMobileReplaySessionCountKotlinmultiplatformAggSum,
        rumMobileReplaySessionCountReactnativeAggSum,
        rumReplaySessionCountAggSum,
        rumSessionCountAggSum,
        rumSessionReplayAddOnAggSum,
        rumTotalSessionCountAggSum,
        rumUnitsAggSum,
        scaFargateCountAvgSum,
        scaFargateCountHwmSum,
        sdsApmScannedBytesSum,
        sdsEventsScannedBytesSum,
        sdsLogsScannedBytesSum,
        sdsRumScannedBytesSum,
        sdsTotalScannedBytesSum,
        serverlessAppsApmApmAzureAppserviceInstancesAvgSum,
        serverlessAppsApmApmAzureAzurefunctionInstancesAvgSum,
        serverlessAppsApmApmAzureContainerappInstancesAvgSum,
        serverlessAppsApmApmFargateEcsTasksAvgSum,
        serverlessAppsApmApmGcpCloudfunctionInstancesAvgSum,
        serverlessAppsApmApmGcpCloudrunInstancesAvgSum,
        serverlessAppsApmApmGcpGkeAutopilotPodsAvgSum,
        serverlessAppsApmAvgSum,
        serverlessAppsApmExclFargateApmAzureAppserviceInstancesAvgSum,
        serverlessAppsApmExclFargateApmAzureAzurefunctionInstancesAvgSum,
        serverlessAppsApmExclFargateApmAzureContainerappInstancesAvgSum,
        serverlessAppsApmExclFargateApmGcpCloudfunctionInstancesAvgSum,
        serverlessAppsApmExclFargateApmGcpCloudrunInstancesAvgSum,
        serverlessAppsApmExclFargateApmGcpGkeAutopilotPodsAvgSum,
        serverlessAppsApmExclFargateAvgSum,
        serverlessAppsAzureContainerAppInstancesAvgSum,
        serverlessAppsAzureCountAvgSum,
        serverlessAppsAzureFunctionAppInstancesAvgSum,
        serverlessAppsAzureWebAppInstancesAvgSum,
        serverlessAppsDsmFargateTasksAvgSum,
        serverlessAppsEcsAvgSum,
        serverlessAppsEksAvgSum,
        serverlessAppsExclFargateAvgSum,
        serverlessAppsExclFargateAzureContainerAppInstancesAvgSum,
        serverlessAppsExclFargateAzureFunctionAppInstancesAvgSum,
        serverlessAppsExclFargateAzureWebAppInstancesAvgSum,
        serverlessAppsExclFargateGoogleCloudFunctionsInstancesAvgSum,
        serverlessAppsExclFargateGoogleCloudRunInstancesAvgSum,
        serverlessAppsExclFargateInfraGcpGkeAutopilotPodsAvgSum,
        serverlessAppsGoogleCloudFunctionsInstancesAvgSum,
        serverlessAppsGoogleCloudRunInstancesAvgSum,
        serverlessAppsGoogleCountAvgSum,
        serverlessAppsInfraGcpGkeAutopilotPodsAvgSum,
        serverlessAppsTotalCountAvgSum,
        siem12moRetentionAggSum,
        siem6moRetentionAggSum,
        siemAnalyzedLogsAddOnCountAggSum,
        snmpDeviceCountAggSum,
        snmpDeviceCountTop99pSum,
        startDate,
        syntheticsBrowserCheckCallsCountAggSum,
        syntheticsCheckCallsCountAggSum,
        syntheticsMobileTestRunsAggSum,
        syntheticsParallelTestingMaxSlotsHwmSum,
        traceSearchIndexedEventsCountAggSum,
        twolIngestedEventsBytesAggSum,
        universalServiceMonitoringHostTop99pSum,
        usage,
        vsphereHostTop99pSum,
        vulnManagementHostCountTop99pSum,
        workflowExecutionsUsageAggSum,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageSummaryResponse {\n");
    sb.append("    agentHostTop99pSum: ").append(toIndentedString(agentHostTop99pSum)).append("\n");
    sb.append("    aiCreditsAgentBuilderAiCreditsAggSum: ")
        .append(toIndentedString(aiCreditsAgentBuilderAiCreditsAggSum))
        .append("\n");
    sb.append("    aiCreditsAggSum: ").append(toIndentedString(aiCreditsAggSum)).append("\n");
    sb.append("    aiCreditsBitsAssistantAiCreditsAggSum: ")
        .append(toIndentedString(aiCreditsBitsAssistantAiCreditsAggSum))
        .append("\n");
    sb.append("    aiCreditsBitsDevAiCreditsAggSum: ")
        .append(toIndentedString(aiCreditsBitsDevAiCreditsAggSum))
        .append("\n");
    sb.append("    aiCreditsBitsSreAiCreditsAggSum: ")
        .append(toIndentedString(aiCreditsBitsSreAiCreditsAggSum))
        .append("\n");
    sb.append("    apmAzureAppServiceHostTop99pSum: ")
        .append(toIndentedString(apmAzureAppServiceHostTop99pSum))
        .append("\n");
    sb.append("    apmDevsecopsHostTop99pSum: ")
        .append(toIndentedString(apmDevsecopsHostTop99pSum))
        .append("\n");
    sb.append("    apmEnterpriseStandaloneHostsTop99pSum: ")
        .append(toIndentedString(apmEnterpriseStandaloneHostsTop99pSum))
        .append("\n");
    sb.append("    apmFargateCountAvgSum: ")
        .append(toIndentedString(apmFargateCountAvgSum))
        .append("\n");
    sb.append("    apmHostTop99pSum: ").append(toIndentedString(apmHostTop99pSum)).append("\n");
    sb.append("    apmProStandaloneHostsTop99pSum: ")
        .append(toIndentedString(apmProStandaloneHostsTop99pSum))
        .append("\n");
    sb.append("    appsecFargateCountAvgSum: ")
        .append(toIndentedString(appsecFargateCountAvgSum))
        .append("\n");
    sb.append("    asmServerlessAggSum: ")
        .append(toIndentedString(asmServerlessAggSum))
        .append("\n");
    sb.append("    auditLogsLinesIndexedAggSum: ")
        .append(toIndentedString(auditLogsLinesIndexedAggSum))
        .append("\n");
    sb.append("    auditTrailEnabledHwmSum: ")
        .append(toIndentedString(auditTrailEnabledHwmSum))
        .append("\n");
    sb.append("    auditTrailEventForwardingEventsAggSum: ")
        .append(toIndentedString(auditTrailEventForwardingEventsAggSum))
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
    sb.append("    bitsAiInvestigationsAggSum: ")
        .append(toIndentedString(bitsAiInvestigationsAggSum))
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
    sb.append("    ccmAnthropicSpendLastSum: ")
        .append(toIndentedString(ccmAnthropicSpendLastSum))
        .append("\n");
    sb.append("    ccmAwsSpendLastSum: ").append(toIndentedString(ccmAwsSpendLastSum)).append("\n");
    sb.append("    ccmAzureSpendLastSum: ")
        .append(toIndentedString(ccmAzureSpendLastSum))
        .append("\n");
    sb.append("    ccmConfluentSpendLastSum: ")
        .append(toIndentedString(ccmConfluentSpendLastSum))
        .append("\n");
    sb.append("    ccmDatabricksSpendLastSum: ")
        .append(toIndentedString(ccmDatabricksSpendLastSum))
        .append("\n");
    sb.append("    ccmElasticSpendLastSum: ")
        .append(toIndentedString(ccmElasticSpendLastSum))
        .append("\n");
    sb.append("    ccmFastlySpendLastSum: ")
        .append(toIndentedString(ccmFastlySpendLastSum))
        .append("\n");
    sb.append("    ccmGcpSpendLastSum: ").append(toIndentedString(ccmGcpSpendLastSum)).append("\n");
    sb.append("    ccmGithubSpendLastSum: ")
        .append(toIndentedString(ccmGithubSpendLastSum))
        .append("\n");
    sb.append("    ccmMongodbSpendLastSum: ")
        .append(toIndentedString(ccmMongodbSpendLastSum))
        .append("\n");
    sb.append("    ccmOciSpendLastSum: ").append(toIndentedString(ccmOciSpendLastSum)).append("\n");
    sb.append("    ccmOpenaiSpendLastSum: ")
        .append(toIndentedString(ccmOpenaiSpendLastSum))
        .append("\n");
    sb.append("    ccmSnowflakeSpendLastSum: ")
        .append(toIndentedString(ccmSnowflakeSpendLastSum))
        .append("\n");
    sb.append("    ccmSpendMonitoredEntLastSum: ")
        .append(toIndentedString(ccmSpendMonitoredEntLastSum))
        .append("\n");
    sb.append("    ccmSpendMonitoredProLastSum: ")
        .append(toIndentedString(ccmSpendMonitoredProLastSum))
        .append("\n");
    sb.append("    ccmTwilioSpendLastSum: ")
        .append(toIndentedString(ccmTwilioSpendLastSum))
        .append("\n");
    sb.append("    ciPipelineIndexedSpansAggSum: ")
        .append(toIndentedString(ciPipelineIndexedSpansAggSum))
        .append("\n");
    sb.append("    ciTestIndexedSpansAggSum: ")
        .append(toIndentedString(ciTestIndexedSpansAggSum))
        .append("\n");
    sb.append("    ciVisibilityItrCommittersHwmSum: ")
        .append(toIndentedString(ciVisibilityItrCommittersHwmSum))
        .append("\n");
    sb.append("    ciVisibilityPipelineCommittersHwmSum: ")
        .append(toIndentedString(ciVisibilityPipelineCommittersHwmSum))
        .append("\n");
    sb.append("    ciVisibilityTestCommittersHwmSum: ")
        .append(toIndentedString(ciVisibilityTestCommittersHwmSum))
        .append("\n");
    sb.append("    cloudCostManagementAwsHostCountAvgSum: ")
        .append(toIndentedString(cloudCostManagementAwsHostCountAvgSum))
        .append("\n");
    sb.append("    cloudCostManagementAzureHostCountAvgSum: ")
        .append(toIndentedString(cloudCostManagementAzureHostCountAvgSum))
        .append("\n");
    sb.append("    cloudCostManagementGcpHostCountAvgSum: ")
        .append(toIndentedString(cloudCostManagementGcpHostCountAvgSum))
        .append("\n");
    sb.append("    cloudCostManagementHostCountAvgSum: ")
        .append(toIndentedString(cloudCostManagementHostCountAvgSum))
        .append("\n");
    sb.append("    cloudCostManagementOciHostCountAvgSum: ")
        .append(toIndentedString(cloudCostManagementOciHostCountAvgSum))
        .append("\n");
    sb.append("    cloudSiemEventsAggSum: ")
        .append(toIndentedString(cloudSiemEventsAggSum))
        .append("\n");
    sb.append("    cloudSiemIndexedLogsAggSum: ")
        .append(toIndentedString(cloudSiemIndexedLogsAggSum))
        .append("\n");
    sb.append("    codeAnalysisSaCommittersHwmSum: ")
        .append(toIndentedString(codeAnalysisSaCommittersHwmSum))
        .append("\n");
    sb.append("    codeAnalysisScaCommittersHwmSum: ")
        .append(toIndentedString(codeAnalysisScaCommittersHwmSum))
        .append("\n");
    sb.append("    codeSecurityHostTop99pSum: ")
        .append(toIndentedString(codeSecurityHostTop99pSum))
        .append("\n");
    sb.append("    containerAvgSum: ").append(toIndentedString(containerAvgSum)).append("\n");
    sb.append("    containerExclAgentAvgSum: ")
        .append(toIndentedString(containerExclAgentAvgSum))
        .append("\n");
    sb.append("    containerHwmSum: ").append(toIndentedString(containerHwmSum)).append("\n");
    sb.append("    csmContainerEnterpriseComplianceCountAggSum: ")
        .append(toIndentedString(csmContainerEnterpriseComplianceCountAggSum))
        .append("\n");
    sb.append("    csmContainerEnterpriseCwsCountAggSum: ")
        .append(toIndentedString(csmContainerEnterpriseCwsCountAggSum))
        .append("\n");
    sb.append("    csmContainerEnterpriseTotalCountAggSum: ")
        .append(toIndentedString(csmContainerEnterpriseTotalCountAggSum))
        .append("\n");
    sb.append("    csmHostEnterpriseAasHostCountTop99pSum: ")
        .append(toIndentedString(csmHostEnterpriseAasHostCountTop99pSum))
        .append("\n");
    sb.append("    csmHostEnterpriseAwsHostCountTop99pSum: ")
        .append(toIndentedString(csmHostEnterpriseAwsHostCountTop99pSum))
        .append("\n");
    sb.append("    csmHostEnterpriseAzureHostCountTop99pSum: ")
        .append(toIndentedString(csmHostEnterpriseAzureHostCountTop99pSum))
        .append("\n");
    sb.append("    csmHostEnterpriseComplianceHostCountTop99pSum: ")
        .append(toIndentedString(csmHostEnterpriseComplianceHostCountTop99pSum))
        .append("\n");
    sb.append("    csmHostEnterpriseCwsHostCountTop99pSum: ")
        .append(toIndentedString(csmHostEnterpriseCwsHostCountTop99pSum))
        .append("\n");
    sb.append("    csmHostEnterpriseGcpHostCountTop99pSum: ")
        .append(toIndentedString(csmHostEnterpriseGcpHostCountTop99pSum))
        .append("\n");
    sb.append("    csmHostEnterpriseOciHostCountTop99pSum: ")
        .append(toIndentedString(csmHostEnterpriseOciHostCountTop99pSum))
        .append("\n");
    sb.append("    csmHostEnterpriseTotalHostCountTop99pSum: ")
        .append(toIndentedString(csmHostEnterpriseTotalHostCountTop99pSum))
        .append("\n");
    sb.append("    csmHostProHostsAgentlessScannersAggSum: ")
        .append(toIndentedString(csmHostProHostsAgentlessScannersAggSum))
        .append("\n");
    sb.append("    csmHostProHostsAgentlessScannersTop99pSum: ")
        .append(toIndentedString(csmHostProHostsAgentlessScannersTop99pSum))
        .append("\n");
    sb.append("    csmHostProOciHostCountTop99pSum: ")
        .append(toIndentedString(csmHostProOciHostCountTop99pSum))
        .append("\n");
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
    sb.append("    cspmHostsAgentlessScannersAggSum: ")
        .append(toIndentedString(cspmHostsAgentlessScannersAggSum))
        .append("\n");
    sb.append("    cspmHostsAgentlessScannersTop99pSum: ")
        .append(toIndentedString(cspmHostsAgentlessScannersTop99pSum))
        .append("\n");
    sb.append("    customHistoricalTsSum: ")
        .append(toIndentedString(customHistoricalTsSum))
        .append("\n");
    sb.append("    customLiveTsSum: ").append(toIndentedString(customLiveTsSum)).append("\n");
    sb.append("    customTsSum: ").append(toIndentedString(customTsSum)).append("\n");
    sb.append("    cwsContainerAvgSum: ").append(toIndentedString(cwsContainerAvgSum)).append("\n");
    sb.append("    cwsFargateTaskAvgSum: ")
        .append(toIndentedString(cwsFargateTaskAvgSum))
        .append("\n");
    sb.append("    cwsHostTop99pSum: ").append(toIndentedString(cwsHostTop99pSum)).append("\n");
    sb.append("    dataJobsMonitoringHostHrAggSum: ")
        .append(toIndentedString(dataJobsMonitoringHostHrAggSum))
        .append("\n");
    sb.append("    dataStreamMonitoringHostCountAggSum: ")
        .append(toIndentedString(dataStreamMonitoringHostCountAggSum))
        .append("\n");
    sb.append("    dataStreamMonitoringHostCountTop99pSum: ")
        .append(toIndentedString(dataStreamMonitoringHostCountTop99pSum))
        .append("\n");
    sb.append("    dbmHostTop99pSum: ").append(toIndentedString(dbmHostTop99pSum)).append("\n");
    sb.append("    dbmQueriesAvgSum: ").append(toIndentedString(dbmQueriesAvgSum)).append("\n");
    sb.append("    doJobsMonitoringOrchestratorsJobHoursAggSum: ")
        .append(toIndentedString(doJobsMonitoringOrchestratorsJobHoursAggSum))
        .append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    ephInfraHostAgentAggSum: ")
        .append(toIndentedString(ephInfraHostAgentAggSum))
        .append("\n");
    sb.append("    ephInfraHostAlibabaAggSum: ")
        .append(toIndentedString(ephInfraHostAlibabaAggSum))
        .append("\n");
    sb.append("    ephInfraHostAwsAggSum: ")
        .append(toIndentedString(ephInfraHostAwsAggSum))
        .append("\n");
    sb.append("    ephInfraHostAzureAggSum: ")
        .append(toIndentedString(ephInfraHostAzureAggSum))
        .append("\n");
    sb.append("    ephInfraHostBasicAggSum: ")
        .append(toIndentedString(ephInfraHostBasicAggSum))
        .append("\n");
    sb.append("    ephInfraHostBasicInfraBasicAgentAggSum: ")
        .append(toIndentedString(ephInfraHostBasicInfraBasicAgentAggSum))
        .append("\n");
    sb.append("    ephInfraHostBasicInfraBasicVsphereAggSum: ")
        .append(toIndentedString(ephInfraHostBasicInfraBasicVsphereAggSum))
        .append("\n");
    sb.append("    ephInfraHostEntAggSum: ")
        .append(toIndentedString(ephInfraHostEntAggSum))
        .append("\n");
    sb.append("    ephInfraHostGcpAggSum: ")
        .append(toIndentedString(ephInfraHostGcpAggSum))
        .append("\n");
    sb.append("    ephInfraHostHerokuAggSum: ")
        .append(toIndentedString(ephInfraHostHerokuAggSum))
        .append("\n");
    sb.append("    ephInfraHostOnlyAasAggSum: ")
        .append(toIndentedString(ephInfraHostOnlyAasAggSum))
        .append("\n");
    sb.append("    ephInfraHostOnlyVsphereAggSum: ")
        .append(toIndentedString(ephInfraHostOnlyVsphereAggSum))
        .append("\n");
    sb.append("    ephInfraHostOpentelemetryAggSum: ")
        .append(toIndentedString(ephInfraHostOpentelemetryAggSum))
        .append("\n");
    sb.append("    ephInfraHostOpentelemetryApmAggSum: ")
        .append(toIndentedString(ephInfraHostOpentelemetryApmAggSum))
        .append("\n");
    sb.append("    ephInfraHostProAggSum: ")
        .append(toIndentedString(ephInfraHostProAggSum))
        .append("\n");
    sb.append("    ephInfraHostProplusAggSum: ")
        .append(toIndentedString(ephInfraHostProplusAggSum))
        .append("\n");
    sb.append("    ephInfraHostProxmoxAggSum: ")
        .append(toIndentedString(ephInfraHostProxmoxAggSum))
        .append("\n");
    sb.append("    errorTrackingApmErrorEventsAggSum: ")
        .append(toIndentedString(errorTrackingApmErrorEventsAggSum))
        .append("\n");
    sb.append("    errorTrackingErrorEventsAggSum: ")
        .append(toIndentedString(errorTrackingErrorEventsAggSum))
        .append("\n");
    sb.append("    errorTrackingEventsAggSum: ")
        .append(toIndentedString(errorTrackingEventsAggSum))
        .append("\n");
    sb.append("    errorTrackingRumErrorEventsAggSum: ")
        .append(toIndentedString(errorTrackingRumErrorEventsAggSum))
        .append("\n");
    sb.append("    eventManagementCorrelationAggSum: ")
        .append(toIndentedString(eventManagementCorrelationAggSum))
        .append("\n");
    sb.append("    eventManagementCorrelationCorrelatedEventsAggSum: ")
        .append(toIndentedString(eventManagementCorrelationCorrelatedEventsAggSum))
        .append("\n");
    sb.append("    eventManagementCorrelationCorrelatedRelatedEventsAggSum: ")
        .append(toIndentedString(eventManagementCorrelationCorrelatedRelatedEventsAggSum))
        .append("\n");
    sb.append("    fargateContainerProfilerProfilingFargateAvgSum: ")
        .append(toIndentedString(fargateContainerProfilerProfilingFargateAvgSum))
        .append("\n");
    sb.append("    fargateContainerProfilerProfilingFargateEksAvgSum: ")
        .append(toIndentedString(fargateContainerProfilerProfilingFargateEksAvgSum))
        .append("\n");
    sb.append("    fargateTasksCountAvgSum: ")
        .append(toIndentedString(fargateTasksCountAvgSum))
        .append("\n");
    sb.append("    fargateTasksCountHwmSum: ")
        .append(toIndentedString(fargateTasksCountHwmSum))
        .append("\n");
    sb.append("    featureFlagsConfigRequestsAggSum: ")
        .append(toIndentedString(featureFlagsConfigRequestsAggSum))
        .append("\n");
    sb.append("    flexLogsComputeLargeAvgSum: ")
        .append(toIndentedString(flexLogsComputeLargeAvgSum))
        .append("\n");
    sb.append("    flexLogsComputeMediumAvgSum: ")
        .append(toIndentedString(flexLogsComputeMediumAvgSum))
        .append("\n");
    sb.append("    flexLogsComputeSmallAvgSum: ")
        .append(toIndentedString(flexLogsComputeSmallAvgSum))
        .append("\n");
    sb.append("    flexLogsComputeXlargeAvgSum: ")
        .append(toIndentedString(flexLogsComputeXlargeAvgSum))
        .append("\n");
    sb.append("    flexLogsComputeXsmallAvgSum: ")
        .append(toIndentedString(flexLogsComputeXsmallAvgSum))
        .append("\n");
    sb.append("    flexLogsStarterAvgSum: ")
        .append(toIndentedString(flexLogsStarterAvgSum))
        .append("\n");
    sb.append("    flexLogsStarterStorageIndexAvgSum: ")
        .append(toIndentedString(flexLogsStarterStorageIndexAvgSum))
        .append("\n");
    sb.append("    flexLogsStarterStorageRetentionAdjustmentAvgSum: ")
        .append(toIndentedString(flexLogsStarterStorageRetentionAdjustmentAvgSum))
        .append("\n");
    sb.append("    flexStoredLogsAvgSum: ")
        .append(toIndentedString(flexStoredLogsAvgSum))
        .append("\n");
    sb.append("    forwardingEventsBytesAggSum: ")
        .append(toIndentedString(forwardingEventsBytesAggSum))
        .append("\n");
    sb.append("    gcpHostTop99pSum: ").append(toIndentedString(gcpHostTop99pSum)).append("\n");
    sb.append("    herokuHostTop99pSum: ")
        .append(toIndentedString(herokuHostTop99pSum))
        .append("\n");
    sb.append("    incidentManagementMonthlyActiveUsersHwmSum: ")
        .append(toIndentedString(incidentManagementMonthlyActiveUsersHwmSum))
        .append("\n");
    sb.append("    incidentManagementSeatsHwmSum: ")
        .append(toIndentedString(incidentManagementSeatsHwmSum))
        .append("\n");
    sb.append("    indexedEventsCountAggSum: ")
        .append(toIndentedString(indexedEventsCountAggSum))
        .append("\n");
    sb.append("    indexedPointsAggSum: ")
        .append(toIndentedString(indexedPointsAggSum))
        .append("\n");
    sb.append("    infraCpuAggSum: ").append(toIndentedString(infraCpuAggSum)).append("\n");
    sb.append("    infraCpuAvgSum: ").append(toIndentedString(infraCpuAvgSum)).append("\n");
    sb.append("    infraCpuDefaultInfraHostVcpuAgentAggSum: ")
        .append(toIndentedString(infraCpuDefaultInfraHostVcpuAgentAggSum))
        .append("\n");
    sb.append("    infraCpuDefaultInfraHostVcpuAgentAvgSum: ")
        .append(toIndentedString(infraCpuDefaultInfraHostVcpuAgentAvgSum))
        .append("\n");
    sb.append("    infraCpuDefaultInfraHostVcpuAgentBasicAggSum: ")
        .append(toIndentedString(infraCpuDefaultInfraHostVcpuAgentBasicAggSum))
        .append("\n");
    sb.append("    infraCpuDefaultInfraHostVcpuAgentBasicAvgSum: ")
        .append(toIndentedString(infraCpuDefaultInfraHostVcpuAgentBasicAvgSum))
        .append("\n");
    sb.append("    infraCpuDefaultInfraHostVcpuAwsAggSum: ")
        .append(toIndentedString(infraCpuDefaultInfraHostVcpuAwsAggSum))
        .append("\n");
    sb.append("    infraCpuDefaultInfraHostVcpuAwsAvgSum: ")
        .append(toIndentedString(infraCpuDefaultInfraHostVcpuAwsAvgSum))
        .append("\n");
    sb.append("    infraCpuDefaultInfraHostVcpuAzureAggSum: ")
        .append(toIndentedString(infraCpuDefaultInfraHostVcpuAzureAggSum))
        .append("\n");
    sb.append("    infraCpuDefaultInfraHostVcpuAzureAvgSum: ")
        .append(toIndentedString(infraCpuDefaultInfraHostVcpuAzureAvgSum))
        .append("\n");
    sb.append("    infraCpuDefaultInfraHostVcpuGcpAggSum: ")
        .append(toIndentedString(infraCpuDefaultInfraHostVcpuGcpAggSum))
        .append("\n");
    sb.append("    infraCpuDefaultInfraHostVcpuGcpAvgSum: ")
        .append(toIndentedString(infraCpuDefaultInfraHostVcpuGcpAvgSum))
        .append("\n");
    sb.append("    infraCpuDefaultInfraHostVcpuNutanixAggSum: ")
        .append(toIndentedString(infraCpuDefaultInfraHostVcpuNutanixAggSum))
        .append("\n");
    sb.append("    infraCpuDefaultInfraHostVcpuNutanixAvgSum: ")
        .append(toIndentedString(infraCpuDefaultInfraHostVcpuNutanixAvgSum))
        .append("\n");
    sb.append("    infraCpuDefaultInfraHostVcpuNutanixBasicAggSum: ")
        .append(toIndentedString(infraCpuDefaultInfraHostVcpuNutanixBasicAggSum))
        .append("\n");
    sb.append("    infraCpuDefaultInfraHostVcpuNutanixBasicAvgSum: ")
        .append(toIndentedString(infraCpuDefaultInfraHostVcpuNutanixBasicAvgSum))
        .append("\n");
    sb.append("    infraCpuDefaultInfraHostVcpuOpentelemetryAggSum: ")
        .append(toIndentedString(infraCpuDefaultInfraHostVcpuOpentelemetryAggSum))
        .append("\n");
    sb.append("    infraCpuDefaultInfraHostVcpuOpentelemetryAvgSum: ")
        .append(toIndentedString(infraCpuDefaultInfraHostVcpuOpentelemetryAvgSum))
        .append("\n");
    sb.append("    infraCpuObservedInfraHostVcpuAgentAggSum: ")
        .append(toIndentedString(infraCpuObservedInfraHostVcpuAgentAggSum))
        .append("\n");
    sb.append("    infraCpuObservedInfraHostVcpuAgentAvgSum: ")
        .append(toIndentedString(infraCpuObservedInfraHostVcpuAgentAvgSum))
        .append("\n");
    sb.append("    infraCpuObservedInfraHostVcpuAwsAggSum: ")
        .append(toIndentedString(infraCpuObservedInfraHostVcpuAwsAggSum))
        .append("\n");
    sb.append("    infraCpuObservedInfraHostVcpuAwsAvgSum: ")
        .append(toIndentedString(infraCpuObservedInfraHostVcpuAwsAvgSum))
        .append("\n");
    sb.append("    infraCpuObservedInfraHostVcpuAzureAggSum: ")
        .append(toIndentedString(infraCpuObservedInfraHostVcpuAzureAggSum))
        .append("\n");
    sb.append("    infraCpuObservedInfraHostVcpuAzureAvgSum: ")
        .append(toIndentedString(infraCpuObservedInfraHostVcpuAzureAvgSum))
        .append("\n");
    sb.append("    infraCpuObservedInfraHostVcpuGcpAggSum: ")
        .append(toIndentedString(infraCpuObservedInfraHostVcpuGcpAggSum))
        .append("\n");
    sb.append("    infraCpuObservedInfraHostVcpuGcpAvgSum: ")
        .append(toIndentedString(infraCpuObservedInfraHostVcpuGcpAvgSum))
        .append("\n");
    sb.append("    infraCpuObservedInfraHostVcpuNutanixAggSum: ")
        .append(toIndentedString(infraCpuObservedInfraHostVcpuNutanixAggSum))
        .append("\n");
    sb.append("    infraCpuObservedInfraHostVcpuNutanixAvgSum: ")
        .append(toIndentedString(infraCpuObservedInfraHostVcpuNutanixAvgSum))
        .append("\n");
    sb.append("    infraCpuObservedInfraHostVcpuOpentelemetryAggSum: ")
        .append(toIndentedString(infraCpuObservedInfraHostVcpuOpentelemetryAggSum))
        .append("\n");
    sb.append("    infraCpuObservedInfraHostVcpuOpentelemetryAvgSum: ")
        .append(toIndentedString(infraCpuObservedInfraHostVcpuOpentelemetryAvgSum))
        .append("\n");
    sb.append("    infraEdgeMonitoringDevicesTop99pSum: ")
        .append(toIndentedString(infraEdgeMonitoringDevicesTop99pSum))
        .append("\n");
    sb.append("    infraHostBasicInfraBasicAgentTop99pSum: ")
        .append(toIndentedString(infraHostBasicInfraBasicAgentTop99pSum))
        .append("\n");
    sb.append("    infraHostBasicInfraBasicVsphereTop99pSum: ")
        .append(toIndentedString(infraHostBasicInfraBasicVsphereTop99pSum))
        .append("\n");
    sb.append("    infraHostBasicTop99pSum: ")
        .append(toIndentedString(infraHostBasicTop99pSum))
        .append("\n");
    sb.append("    infraHostTop99pSum: ").append(toIndentedString(infraHostTop99pSum)).append("\n");
    sb.append("    infraStorageMgmtObjectsCountAvgSum: ")
        .append(toIndentedString(infraStorageMgmtObjectsCountAvgSum))
        .append("\n");
    sb.append("    ingestPointsAggSum: ").append(toIndentedString(ingestPointsAggSum)).append("\n");
    sb.append("    ingestedEventsBytesAggSum: ")
        .append(toIndentedString(ingestedEventsBytesAggSum))
        .append("\n");
    sb.append("    iotApmHostAggSum: ").append(toIndentedString(iotApmHostAggSum)).append("\n");
    sb.append("    iotApmHostTop99pSum: ")
        .append(toIndentedString(iotApmHostTop99pSum))
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
    sb.append("    llmObservability15dayRetentionSpansAggSum: ")
        .append(toIndentedString(llmObservability15dayRetentionSpansAggSum))
        .append("\n");
    sb.append("    llmObservability30dayRetentionSpansAggSum: ")
        .append(toIndentedString(llmObservability30dayRetentionSpansAggSum))
        .append("\n");
    sb.append("    llmObservability60dayRetentionSpansAggSum: ")
        .append(toIndentedString(llmObservability60dayRetentionSpansAggSum))
        .append("\n");
    sb.append("    llmObservability90dayRetentionSpansAggSum: ")
        .append(toIndentedString(llmObservability90dayRetentionSpansAggSum))
        .append("\n");
    sb.append("    llmObservabilityAggSum: ")
        .append(toIndentedString(llmObservabilityAggSum))
        .append("\n");
    sb.append("    llmObservabilityMinSpendAggSum: ")
        .append(toIndentedString(llmObservabilityMinSpendAggSum))
        .append("\n");
    sb.append("    logsArchiveSearchGbScannedAggSum: ")
        .append(toIndentedString(logsArchiveSearchGbScannedAggSum))
        .append("\n");
    sb.append("    logsByRetention: ").append(toIndentedString(logsByRetention)).append("\n");
    sb.append("    metricNamesAggSum: ").append(toIndentedString(metricNamesAggSum)).append("\n");
    sb.append("    mobileRumLiteSessionCountAggSum: ")
        .append(toIndentedString(mobileRumLiteSessionCountAggSum))
        .append("\n");
    sb.append("    mobileRumSessionCountAggSum: ")
        .append(toIndentedString(mobileRumSessionCountAggSum))
        .append("\n");
    sb.append("    mobileRumSessionCountAndroidAggSum: ")
        .append(toIndentedString(mobileRumSessionCountAndroidAggSum))
        .append("\n");
    sb.append("    mobileRumSessionCountFlutterAggSum: ")
        .append(toIndentedString(mobileRumSessionCountFlutterAggSum))
        .append("\n");
    sb.append("    mobileRumSessionCountIosAggSum: ")
        .append(toIndentedString(mobileRumSessionCountIosAggSum))
        .append("\n");
    sb.append("    mobileRumSessionCountReactnativeAggSum: ")
        .append(toIndentedString(mobileRumSessionCountReactnativeAggSum))
        .append("\n");
    sb.append("    mobileRumSessionCountRokuAggSum: ")
        .append(toIndentedString(mobileRumSessionCountRokuAggSum))
        .append("\n");
    sb.append("    mobileRumUnitsAggSum: ")
        .append(toIndentedString(mobileRumUnitsAggSum))
        .append("\n");
    sb.append("    ndmNetflowEventsAggSum: ")
        .append(toIndentedString(ndmNetflowEventsAggSum))
        .append("\n");
    sb.append("    netflowIndexedEventsCountAggSum: ")
        .append(toIndentedString(netflowIndexedEventsCountAggSum))
        .append("\n");
    sb.append("    networkDeviceWirelessTop99pSum: ")
        .append(toIndentedString(networkDeviceWirelessTop99pSum))
        .append("\n");
    sb.append("    networkPathAggSum: ").append(toIndentedString(networkPathAggSum)).append("\n");
    sb.append("    npmHostTop99pSum: ").append(toIndentedString(npmHostTop99pSum)).append("\n");
    sb.append("    observabilityPipelinesBytesProcessedAggSum: ")
        .append(toIndentedString(observabilityPipelinesBytesProcessedAggSum))
        .append("\n");
    sb.append("    ociHostAggSum: ").append(toIndentedString(ociHostAggSum)).append("\n");
    sb.append("    ociHostTop99pSum: ").append(toIndentedString(ociHostTop99pSum)).append("\n");
    sb.append("    onCallSeatHwmSum: ").append(toIndentedString(onCallSeatHwmSum)).append("\n");
    sb.append("    onlineArchiveEventsCountAggSum: ")
        .append(toIndentedString(onlineArchiveEventsCountAggSum))
        .append("\n");
    sb.append("    opentelemetryApmHostTop99pSum: ")
        .append(toIndentedString(opentelemetryApmHostTop99pSum))
        .append("\n");
    sb.append("    opentelemetryHostTop99pSum: ")
        .append(toIndentedString(opentelemetryHostTop99pSum))
        .append("\n");
    sb.append("    productAnalyticsAggSum: ")
        .append(toIndentedString(productAnalyticsAggSum))
        .append("\n");
    sb.append("    profilingAasCountTop99pSum: ")
        .append(toIndentedString(profilingAasCountTop99pSum))
        .append("\n");
    sb.append("    profilingContainerAgentCountAvg: ")
        .append(toIndentedString(profilingContainerAgentCountAvg))
        .append("\n");
    sb.append("    profilingHostCountTop99pSum: ")
        .append(toIndentedString(profilingHostCountTop99pSum))
        .append("\n");
    sb.append("    proxmoxHostAggSum: ").append(toIndentedString(proxmoxHostAggSum)).append("\n");
    sb.append("    proxmoxHostTop99pSum: ")
        .append(toIndentedString(proxmoxHostTop99pSum))
        .append("\n");
    sb.append("    publishedAppHwmSum: ").append(toIndentedString(publishedAppHwmSum)).append("\n");
    sb.append("    rehydratedIndexedEventsAggSum: ")
        .append(toIndentedString(rehydratedIndexedEventsAggSum))
        .append("\n");
    sb.append("    rehydratedIngestedBytesAggSum: ")
        .append(toIndentedString(rehydratedIngestedBytesAggSum))
        .append("\n");
    sb.append("    rumBrowserAndMobileSessionCount: ")
        .append(toIndentedString(rumBrowserAndMobileSessionCount))
        .append("\n");
    sb.append("    rumBrowserLegacySessionCountAggSum: ")
        .append(toIndentedString(rumBrowserLegacySessionCountAggSum))
        .append("\n");
    sb.append("    rumBrowserLiteSessionCountAggSum: ")
        .append(toIndentedString(rumBrowserLiteSessionCountAggSum))
        .append("\n");
    sb.append("    rumBrowserReplaySessionCountAggSum: ")
        .append(toIndentedString(rumBrowserReplaySessionCountAggSum))
        .append("\n");
    sb.append("    rumIndexedSessionsAggSum: ")
        .append(toIndentedString(rumIndexedSessionsAggSum))
        .append("\n");
    sb.append("    rumIngestedSessionsAggSum: ")
        .append(toIndentedString(rumIngestedSessionsAggSum))
        .append("\n");
    sb.append("    rumLiteSessionCountAggSum: ")
        .append(toIndentedString(rumLiteSessionCountAggSum))
        .append("\n");
    sb.append("    rumMobileLegacySessionCountAndroidAggSum: ")
        .append(toIndentedString(rumMobileLegacySessionCountAndroidAggSum))
        .append("\n");
    sb.append("    rumMobileLegacySessionCountFlutterAggSum: ")
        .append(toIndentedString(rumMobileLegacySessionCountFlutterAggSum))
        .append("\n");
    sb.append("    rumMobileLegacySessionCountIosAggSum: ")
        .append(toIndentedString(rumMobileLegacySessionCountIosAggSum))
        .append("\n");
    sb.append("    rumMobileLegacySessionCountReactnativeAggSum: ")
        .append(toIndentedString(rumMobileLegacySessionCountReactnativeAggSum))
        .append("\n");
    sb.append("    rumMobileLegacySessionCountRokuAggSum: ")
        .append(toIndentedString(rumMobileLegacySessionCountRokuAggSum))
        .append("\n");
    sb.append("    rumMobileLiteSessionCountAndroidAggSum: ")
        .append(toIndentedString(rumMobileLiteSessionCountAndroidAggSum))
        .append("\n");
    sb.append("    rumMobileLiteSessionCountFlutterAggSum: ")
        .append(toIndentedString(rumMobileLiteSessionCountFlutterAggSum))
        .append("\n");
    sb.append("    rumMobileLiteSessionCountIosAggSum: ")
        .append(toIndentedString(rumMobileLiteSessionCountIosAggSum))
        .append("\n");
    sb.append("    rumMobileLiteSessionCountKotlinmultiplatformAggSum: ")
        .append(toIndentedString(rumMobileLiteSessionCountKotlinmultiplatformAggSum))
        .append("\n");
    sb.append("    rumMobileLiteSessionCountReactnativeAggSum: ")
        .append(toIndentedString(rumMobileLiteSessionCountReactnativeAggSum))
        .append("\n");
    sb.append("    rumMobileLiteSessionCountRokuAggSum: ")
        .append(toIndentedString(rumMobileLiteSessionCountRokuAggSum))
        .append("\n");
    sb.append("    rumMobileLiteSessionCountUnityAggSum: ")
        .append(toIndentedString(rumMobileLiteSessionCountUnityAggSum))
        .append("\n");
    sb.append("    rumMobileReplaySessionCountAndroidAggSum: ")
        .append(toIndentedString(rumMobileReplaySessionCountAndroidAggSum))
        .append("\n");
    sb.append("    rumMobileReplaySessionCountIosAggSum: ")
        .append(toIndentedString(rumMobileReplaySessionCountIosAggSum))
        .append("\n");
    sb.append("    rumMobileReplaySessionCountKotlinmultiplatformAggSum: ")
        .append(toIndentedString(rumMobileReplaySessionCountKotlinmultiplatformAggSum))
        .append("\n");
    sb.append("    rumMobileReplaySessionCountReactnativeAggSum: ")
        .append(toIndentedString(rumMobileReplaySessionCountReactnativeAggSum))
        .append("\n");
    sb.append("    rumReplaySessionCountAggSum: ")
        .append(toIndentedString(rumReplaySessionCountAggSum))
        .append("\n");
    sb.append("    rumSessionCountAggSum: ")
        .append(toIndentedString(rumSessionCountAggSum))
        .append("\n");
    sb.append("    rumSessionReplayAddOnAggSum: ")
        .append(toIndentedString(rumSessionReplayAddOnAggSum))
        .append("\n");
    sb.append("    rumTotalSessionCountAggSum: ")
        .append(toIndentedString(rumTotalSessionCountAggSum))
        .append("\n");
    sb.append("    rumUnitsAggSum: ").append(toIndentedString(rumUnitsAggSum)).append("\n");
    sb.append("    scaFargateCountAvgSum: ")
        .append(toIndentedString(scaFargateCountAvgSum))
        .append("\n");
    sb.append("    scaFargateCountHwmSum: ")
        .append(toIndentedString(scaFargateCountHwmSum))
        .append("\n");
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
    sb.append("    serverlessAppsApmApmAzureAppserviceInstancesAvgSum: ")
        .append(toIndentedString(serverlessAppsApmApmAzureAppserviceInstancesAvgSum))
        .append("\n");
    sb.append("    serverlessAppsApmApmAzureAzurefunctionInstancesAvgSum: ")
        .append(toIndentedString(serverlessAppsApmApmAzureAzurefunctionInstancesAvgSum))
        .append("\n");
    sb.append("    serverlessAppsApmApmAzureContainerappInstancesAvgSum: ")
        .append(toIndentedString(serverlessAppsApmApmAzureContainerappInstancesAvgSum))
        .append("\n");
    sb.append("    serverlessAppsApmApmFargateEcsTasksAvgSum: ")
        .append(toIndentedString(serverlessAppsApmApmFargateEcsTasksAvgSum))
        .append("\n");
    sb.append("    serverlessAppsApmApmGcpCloudfunctionInstancesAvgSum: ")
        .append(toIndentedString(serverlessAppsApmApmGcpCloudfunctionInstancesAvgSum))
        .append("\n");
    sb.append("    serverlessAppsApmApmGcpCloudrunInstancesAvgSum: ")
        .append(toIndentedString(serverlessAppsApmApmGcpCloudrunInstancesAvgSum))
        .append("\n");
    sb.append("    serverlessAppsApmApmGcpGkeAutopilotPodsAvgSum: ")
        .append(toIndentedString(serverlessAppsApmApmGcpGkeAutopilotPodsAvgSum))
        .append("\n");
    sb.append("    serverlessAppsApmAvgSum: ")
        .append(toIndentedString(serverlessAppsApmAvgSum))
        .append("\n");
    sb.append("    serverlessAppsApmExclFargateApmAzureAppserviceInstancesAvgSum: ")
        .append(toIndentedString(serverlessAppsApmExclFargateApmAzureAppserviceInstancesAvgSum))
        .append("\n");
    sb.append("    serverlessAppsApmExclFargateApmAzureAzurefunctionInstancesAvgSum: ")
        .append(toIndentedString(serverlessAppsApmExclFargateApmAzureAzurefunctionInstancesAvgSum))
        .append("\n");
    sb.append("    serverlessAppsApmExclFargateApmAzureContainerappInstancesAvgSum: ")
        .append(toIndentedString(serverlessAppsApmExclFargateApmAzureContainerappInstancesAvgSum))
        .append("\n");
    sb.append("    serverlessAppsApmExclFargateApmGcpCloudfunctionInstancesAvgSum: ")
        .append(toIndentedString(serverlessAppsApmExclFargateApmGcpCloudfunctionInstancesAvgSum))
        .append("\n");
    sb.append("    serverlessAppsApmExclFargateApmGcpCloudrunInstancesAvgSum: ")
        .append(toIndentedString(serverlessAppsApmExclFargateApmGcpCloudrunInstancesAvgSum))
        .append("\n");
    sb.append("    serverlessAppsApmExclFargateApmGcpGkeAutopilotPodsAvgSum: ")
        .append(toIndentedString(serverlessAppsApmExclFargateApmGcpGkeAutopilotPodsAvgSum))
        .append("\n");
    sb.append("    serverlessAppsApmExclFargateAvgSum: ")
        .append(toIndentedString(serverlessAppsApmExclFargateAvgSum))
        .append("\n");
    sb.append("    serverlessAppsAzureContainerAppInstancesAvgSum: ")
        .append(toIndentedString(serverlessAppsAzureContainerAppInstancesAvgSum))
        .append("\n");
    sb.append("    serverlessAppsAzureCountAvgSum: ")
        .append(toIndentedString(serverlessAppsAzureCountAvgSum))
        .append("\n");
    sb.append("    serverlessAppsAzureFunctionAppInstancesAvgSum: ")
        .append(toIndentedString(serverlessAppsAzureFunctionAppInstancesAvgSum))
        .append("\n");
    sb.append("    serverlessAppsAzureWebAppInstancesAvgSum: ")
        .append(toIndentedString(serverlessAppsAzureWebAppInstancesAvgSum))
        .append("\n");
    sb.append("    serverlessAppsDsmFargateTasksAvgSum: ")
        .append(toIndentedString(serverlessAppsDsmFargateTasksAvgSum))
        .append("\n");
    sb.append("    serverlessAppsEcsAvgSum: ")
        .append(toIndentedString(serverlessAppsEcsAvgSum))
        .append("\n");
    sb.append("    serverlessAppsEksAvgSum: ")
        .append(toIndentedString(serverlessAppsEksAvgSum))
        .append("\n");
    sb.append("    serverlessAppsExclFargateAvgSum: ")
        .append(toIndentedString(serverlessAppsExclFargateAvgSum))
        .append("\n");
    sb.append("    serverlessAppsExclFargateAzureContainerAppInstancesAvgSum: ")
        .append(toIndentedString(serverlessAppsExclFargateAzureContainerAppInstancesAvgSum))
        .append("\n");
    sb.append("    serverlessAppsExclFargateAzureFunctionAppInstancesAvgSum: ")
        .append(toIndentedString(serverlessAppsExclFargateAzureFunctionAppInstancesAvgSum))
        .append("\n");
    sb.append("    serverlessAppsExclFargateAzureWebAppInstancesAvgSum: ")
        .append(toIndentedString(serverlessAppsExclFargateAzureWebAppInstancesAvgSum))
        .append("\n");
    sb.append("    serverlessAppsExclFargateGoogleCloudFunctionsInstancesAvgSum: ")
        .append(toIndentedString(serverlessAppsExclFargateGoogleCloudFunctionsInstancesAvgSum))
        .append("\n");
    sb.append("    serverlessAppsExclFargateGoogleCloudRunInstancesAvgSum: ")
        .append(toIndentedString(serverlessAppsExclFargateGoogleCloudRunInstancesAvgSum))
        .append("\n");
    sb.append("    serverlessAppsExclFargateInfraGcpGkeAutopilotPodsAvgSum: ")
        .append(toIndentedString(serverlessAppsExclFargateInfraGcpGkeAutopilotPodsAvgSum))
        .append("\n");
    sb.append("    serverlessAppsGoogleCloudFunctionsInstancesAvgSum: ")
        .append(toIndentedString(serverlessAppsGoogleCloudFunctionsInstancesAvgSum))
        .append("\n");
    sb.append("    serverlessAppsGoogleCloudRunInstancesAvgSum: ")
        .append(toIndentedString(serverlessAppsGoogleCloudRunInstancesAvgSum))
        .append("\n");
    sb.append("    serverlessAppsGoogleCountAvgSum: ")
        .append(toIndentedString(serverlessAppsGoogleCountAvgSum))
        .append("\n");
    sb.append("    serverlessAppsInfraGcpGkeAutopilotPodsAvgSum: ")
        .append(toIndentedString(serverlessAppsInfraGcpGkeAutopilotPodsAvgSum))
        .append("\n");
    sb.append("    serverlessAppsTotalCountAvgSum: ")
        .append(toIndentedString(serverlessAppsTotalCountAvgSum))
        .append("\n");
    sb.append("    siem12moRetentionAggSum: ")
        .append(toIndentedString(siem12moRetentionAggSum))
        .append("\n");
    sb.append("    siem6moRetentionAggSum: ")
        .append(toIndentedString(siem6moRetentionAggSum))
        .append("\n");
    sb.append("    siemAnalyzedLogsAddOnCountAggSum: ")
        .append(toIndentedString(siemAnalyzedLogsAddOnCountAggSum))
        .append("\n");
    sb.append("    snmpDeviceCountAggSum: ")
        .append(toIndentedString(snmpDeviceCountAggSum))
        .append("\n");
    sb.append("    snmpDeviceCountTop99pSum: ")
        .append(toIndentedString(snmpDeviceCountTop99pSum))
        .append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    syntheticsBrowserCheckCallsCountAggSum: ")
        .append(toIndentedString(syntheticsBrowserCheckCallsCountAggSum))
        .append("\n");
    sb.append("    syntheticsCheckCallsCountAggSum: ")
        .append(toIndentedString(syntheticsCheckCallsCountAggSum))
        .append("\n");
    sb.append("    syntheticsMobileTestRunsAggSum: ")
        .append(toIndentedString(syntheticsMobileTestRunsAggSum))
        .append("\n");
    sb.append("    syntheticsParallelTestingMaxSlotsHwmSum: ")
        .append(toIndentedString(syntheticsParallelTestingMaxSlotsHwmSum))
        .append("\n");
    sb.append("    traceSearchIndexedEventsCountAggSum: ")
        .append(toIndentedString(traceSearchIndexedEventsCountAggSum))
        .append("\n");
    sb.append("    twolIngestedEventsBytesAggSum: ")
        .append(toIndentedString(twolIngestedEventsBytesAggSum))
        .append("\n");
    sb.append("    universalServiceMonitoringHostTop99pSum: ")
        .append(toIndentedString(universalServiceMonitoringHostTop99pSum))
        .append("\n");
    sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
    sb.append("    vsphereHostTop99pSum: ")
        .append(toIndentedString(vsphereHostTop99pSum))
        .append("\n");
    sb.append("    vulnManagementHostCountTop99pSum: ")
        .append(toIndentedString(vulnManagementHostCountTop99pSum))
        .append("\n");
    sb.append("    workflowExecutionsUsageAggSum: ")
        .append(toIndentedString(workflowExecutionsUsageAggSum))
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
