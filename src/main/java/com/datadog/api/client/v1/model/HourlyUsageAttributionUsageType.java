/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.datadog.api.client.ModelEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Supported products for hourly usage attribution requests. The following values have been
 * <strong>deprecated</strong>: <code>estimated_indexed_spans_usage</code>, <code>
 * estimated_ingested_spans_usage</code>.
 */
@JsonSerialize(
    using = HourlyUsageAttributionUsageType.HourlyUsageAttributionUsageTypeSerializer.class)
public class HourlyUsageAttributionUsageType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "api_usage",
              "apm_fargate_usage",
              "apm_host_usage",
              "apm_usm_usage",
              "appsec_fargate_usage",
              "appsec_usage",
              "asm_serverless_traced_invocations_usage",
              "asm_serverless_traced_invocations_percentage",
              "browser_usage",
              "ci_pipeline_indexed_spans_usage",
              "ci_test_indexed_spans_usage",
              "ci_visibility_itr_usage",
              "cloud_siem_usage",
              "code_security_host_usage",
              "container_excl_agent_usage",
              "container_usage",
              "cspm_containers_usage",
              "cspm_hosts_usage",
              "custom_event_usage",
              "custom_ingested_timeseries_usage",
              "custom_timeseries_usage",
              "cws_containers_usage",
              "cws_fargate_task_usage",
              "cws_hosts_usage",
              "data_jobs_monitoring_usage",
              "data_stream_monitoring_usage",
              "dbm_hosts_usage",
              "dbm_queries_usage",
              "error_tracking_usage",
              "error_tracking_percentage",
              "estimated_indexed_spans_usage",
              "estimated_ingested_spans_usage",
              "fargate_usage",
              "flex_stored_logs",
              "functions_usage",
              "incident_management_monthly_active_users_usage",
              "indexed_spans_usage",
              "infra_host_usage",
              "ingested_logs_bytes_usage",
              "ingested_spans_bytes_usage",
              "invocations_usage",
              "lambda_traced_invocations_usage",
              "llm_observability_usage",
              "llm_spans_usage",
              "logs_indexed_15day_usage",
              "logs_indexed_180day_usage",
              "logs_indexed_1day_usage",
              "logs_indexed_30day_usage",
              "logs_indexed_360day_usage",
              "logs_indexed_3day_usage",
              "logs_indexed_45day_usage",
              "logs_indexed_60day_usage",
              "logs_indexed_7day_usage",
              "logs_indexed_90day_usage",
              "logs_indexed_custom_retention_usage",
              "mobile_app_testing_usage",
              "ndm_netflow_usage",
              "npm_host_usage",
              "network_device_wireless_usage",
              "obs_pipeline_bytes_usage",
              "obs_pipelines_vcpu_usage",
              "online_archive_usage",
              "product_analytics_session_usage",
              "profiled_container_usage",
              "profiled_fargate_usage",
              "profiled_host_usage",
              "published_app",
              "rum_browser_mobile_sessions_usage",
              "rum_ingested_usage",
              "rum_investigate_usage",
              "rum_replay_sessions_usage",
              "rum_session_replay_add_on_usage",
              "sca_fargate_usage",
              "sds_scanned_bytes_usage",
              "serverless_apps_usage",
              "siem_analyzed_logs_add_on_usage",
              "siem_ingested_bytes_usage",
              "snmp_usage",
              "universal_service_monitoring_usage",
              "vuln_management_hosts_usage",
              "workflow_executions_usage"));

  public static final HourlyUsageAttributionUsageType API_USAGE =
      new HourlyUsageAttributionUsageType("api_usage");
  public static final HourlyUsageAttributionUsageType APM_FARGATE_USAGE =
      new HourlyUsageAttributionUsageType("apm_fargate_usage");
  public static final HourlyUsageAttributionUsageType APM_HOST_USAGE =
      new HourlyUsageAttributionUsageType("apm_host_usage");
  public static final HourlyUsageAttributionUsageType APM_USM_USAGE =
      new HourlyUsageAttributionUsageType("apm_usm_usage");
  public static final HourlyUsageAttributionUsageType APPSEC_FARGATE_USAGE =
      new HourlyUsageAttributionUsageType("appsec_fargate_usage");
  public static final HourlyUsageAttributionUsageType APPSEC_USAGE =
      new HourlyUsageAttributionUsageType("appsec_usage");
  public static final HourlyUsageAttributionUsageType ASM_SERVERLESS_TRACED_INVOCATIONS_USAGE =
      new HourlyUsageAttributionUsageType("asm_serverless_traced_invocations_usage");
  public static final HourlyUsageAttributionUsageType ASM_SERVERLESS_TRACED_INVOCATIONS_PERCENTAGE =
      new HourlyUsageAttributionUsageType("asm_serverless_traced_invocations_percentage");
  public static final HourlyUsageAttributionUsageType BROWSER_USAGE =
      new HourlyUsageAttributionUsageType("browser_usage");
  public static final HourlyUsageAttributionUsageType CI_PIPELINE_INDEXED_SPANS_USAGE =
      new HourlyUsageAttributionUsageType("ci_pipeline_indexed_spans_usage");
  public static final HourlyUsageAttributionUsageType CI_TEST_INDEXED_SPANS_USAGE =
      new HourlyUsageAttributionUsageType("ci_test_indexed_spans_usage");
  public static final HourlyUsageAttributionUsageType CI_VISIBILITY_ITR_USAGE =
      new HourlyUsageAttributionUsageType("ci_visibility_itr_usage");
  public static final HourlyUsageAttributionUsageType CLOUD_SIEM_USAGE =
      new HourlyUsageAttributionUsageType("cloud_siem_usage");
  public static final HourlyUsageAttributionUsageType CODE_SECURITY_HOST_USAGE =
      new HourlyUsageAttributionUsageType("code_security_host_usage");
  public static final HourlyUsageAttributionUsageType CONTAINER_EXCL_AGENT_USAGE =
      new HourlyUsageAttributionUsageType("container_excl_agent_usage");
  public static final HourlyUsageAttributionUsageType CONTAINER_USAGE =
      new HourlyUsageAttributionUsageType("container_usage");
  public static final HourlyUsageAttributionUsageType CSPM_CONTAINERS_USAGE =
      new HourlyUsageAttributionUsageType("cspm_containers_usage");
  public static final HourlyUsageAttributionUsageType CSPM_HOSTS_USAGE =
      new HourlyUsageAttributionUsageType("cspm_hosts_usage");
  public static final HourlyUsageAttributionUsageType CUSTOM_EVENT_USAGE =
      new HourlyUsageAttributionUsageType("custom_event_usage");
  public static final HourlyUsageAttributionUsageType CUSTOM_INGESTED_TIMESERIES_USAGE =
      new HourlyUsageAttributionUsageType("custom_ingested_timeseries_usage");
  public static final HourlyUsageAttributionUsageType CUSTOM_TIMESERIES_USAGE =
      new HourlyUsageAttributionUsageType("custom_timeseries_usage");
  public static final HourlyUsageAttributionUsageType CWS_CONTAINERS_USAGE =
      new HourlyUsageAttributionUsageType("cws_containers_usage");
  public static final HourlyUsageAttributionUsageType CWS_FARGATE_TASK_USAGE =
      new HourlyUsageAttributionUsageType("cws_fargate_task_usage");
  public static final HourlyUsageAttributionUsageType CWS_HOSTS_USAGE =
      new HourlyUsageAttributionUsageType("cws_hosts_usage");
  public static final HourlyUsageAttributionUsageType DATA_JOBS_MONITORING_USAGE =
      new HourlyUsageAttributionUsageType("data_jobs_monitoring_usage");
  public static final HourlyUsageAttributionUsageType DATA_STREAM_MONITORING_USAGE =
      new HourlyUsageAttributionUsageType("data_stream_monitoring_usage");
  public static final HourlyUsageAttributionUsageType DBM_HOSTS_USAGE =
      new HourlyUsageAttributionUsageType("dbm_hosts_usage");
  public static final HourlyUsageAttributionUsageType DBM_QUERIES_USAGE =
      new HourlyUsageAttributionUsageType("dbm_queries_usage");
  public static final HourlyUsageAttributionUsageType ERROR_TRACKING_USAGE =
      new HourlyUsageAttributionUsageType("error_tracking_usage");
  public static final HourlyUsageAttributionUsageType ERROR_TRACKING_PERCENTAGE =
      new HourlyUsageAttributionUsageType("error_tracking_percentage");
  public static final HourlyUsageAttributionUsageType ESTIMATED_INDEXED_SPANS_USAGE =
      new HourlyUsageAttributionUsageType("estimated_indexed_spans_usage");
  public static final HourlyUsageAttributionUsageType ESTIMATED_INGESTED_SPANS_USAGE =
      new HourlyUsageAttributionUsageType("estimated_ingested_spans_usage");
  public static final HourlyUsageAttributionUsageType FARGATE_USAGE =
      new HourlyUsageAttributionUsageType("fargate_usage");
  public static final HourlyUsageAttributionUsageType FLEX_STORED_LOGS =
      new HourlyUsageAttributionUsageType("flex_stored_logs");
  public static final HourlyUsageAttributionUsageType FUNCTIONS_USAGE =
      new HourlyUsageAttributionUsageType("functions_usage");
  public static final HourlyUsageAttributionUsageType
      INCIDENT_MANAGEMENT_MONTHLY_ACTIVE_USERS_USAGE =
          new HourlyUsageAttributionUsageType("incident_management_monthly_active_users_usage");
  public static final HourlyUsageAttributionUsageType INDEXED_SPANS_USAGE =
      new HourlyUsageAttributionUsageType("indexed_spans_usage");
  public static final HourlyUsageAttributionUsageType INFRA_HOST_USAGE =
      new HourlyUsageAttributionUsageType("infra_host_usage");
  public static final HourlyUsageAttributionUsageType INGESTED_LOGS_BYTES_USAGE =
      new HourlyUsageAttributionUsageType("ingested_logs_bytes_usage");
  public static final HourlyUsageAttributionUsageType INGESTED_SPANS_BYTES_USAGE =
      new HourlyUsageAttributionUsageType("ingested_spans_bytes_usage");
  public static final HourlyUsageAttributionUsageType INVOCATIONS_USAGE =
      new HourlyUsageAttributionUsageType("invocations_usage");
  public static final HourlyUsageAttributionUsageType LAMBDA_TRACED_INVOCATIONS_USAGE =
      new HourlyUsageAttributionUsageType("lambda_traced_invocations_usage");
  public static final HourlyUsageAttributionUsageType LLM_OBSERVABILITY_USAGE =
      new HourlyUsageAttributionUsageType("llm_observability_usage");
  public static final HourlyUsageAttributionUsageType LLM_SPANS_USAGE =
      new HourlyUsageAttributionUsageType("llm_spans_usage");
  public static final HourlyUsageAttributionUsageType LOGS_INDEXED_15DAY_USAGE =
      new HourlyUsageAttributionUsageType("logs_indexed_15day_usage");
  public static final HourlyUsageAttributionUsageType LOGS_INDEXED_180DAY_USAGE =
      new HourlyUsageAttributionUsageType("logs_indexed_180day_usage");
  public static final HourlyUsageAttributionUsageType LOGS_INDEXED_1DAY_USAGE =
      new HourlyUsageAttributionUsageType("logs_indexed_1day_usage");
  public static final HourlyUsageAttributionUsageType LOGS_INDEXED_30DAY_USAGE =
      new HourlyUsageAttributionUsageType("logs_indexed_30day_usage");
  public static final HourlyUsageAttributionUsageType LOGS_INDEXED_360DAY_USAGE =
      new HourlyUsageAttributionUsageType("logs_indexed_360day_usage");
  public static final HourlyUsageAttributionUsageType LOGS_INDEXED_3DAY_USAGE =
      new HourlyUsageAttributionUsageType("logs_indexed_3day_usage");
  public static final HourlyUsageAttributionUsageType LOGS_INDEXED_45DAY_USAGE =
      new HourlyUsageAttributionUsageType("logs_indexed_45day_usage");
  public static final HourlyUsageAttributionUsageType LOGS_INDEXED_60DAY_USAGE =
      new HourlyUsageAttributionUsageType("logs_indexed_60day_usage");
  public static final HourlyUsageAttributionUsageType LOGS_INDEXED_7DAY_USAGE =
      new HourlyUsageAttributionUsageType("logs_indexed_7day_usage");
  public static final HourlyUsageAttributionUsageType LOGS_INDEXED_90DAY_USAGE =
      new HourlyUsageAttributionUsageType("logs_indexed_90day_usage");
  public static final HourlyUsageAttributionUsageType LOGS_INDEXED_CUSTOM_RETENTION_USAGE =
      new HourlyUsageAttributionUsageType("logs_indexed_custom_retention_usage");
  public static final HourlyUsageAttributionUsageType MOBILE_APP_TESTING_USAGE =
      new HourlyUsageAttributionUsageType("mobile_app_testing_usage");
  public static final HourlyUsageAttributionUsageType NDM_NETFLOW_USAGE =
      new HourlyUsageAttributionUsageType("ndm_netflow_usage");
  public static final HourlyUsageAttributionUsageType NETWORK_DEVICE_WIRELESS_USAGE =
      new HourlyUsageAttributionUsageType("npm_host_usage");
  public static final HourlyUsageAttributionUsageType NPM_HOST_USAGE =
      new HourlyUsageAttributionUsageType("network_device_wireless_usage");
  public static final HourlyUsageAttributionUsageType OBS_PIPELINE_BYTES_USAGE =
      new HourlyUsageAttributionUsageType("obs_pipeline_bytes_usage");
  public static final HourlyUsageAttributionUsageType OBS_PIPELINE_VCPU_USAGE =
      new HourlyUsageAttributionUsageType("obs_pipelines_vcpu_usage");
  public static final HourlyUsageAttributionUsageType ONLINE_ARCHIVE_USAGE =
      new HourlyUsageAttributionUsageType("online_archive_usage");
  public static final HourlyUsageAttributionUsageType PRODUCT_ANALYTICS_SESSION_USAGE =
      new HourlyUsageAttributionUsageType("product_analytics_session_usage");
  public static final HourlyUsageAttributionUsageType PROFILED_CONTAINER_USAGE =
      new HourlyUsageAttributionUsageType("profiled_container_usage");
  public static final HourlyUsageAttributionUsageType PROFILED_FARGATE_USAGE =
      new HourlyUsageAttributionUsageType("profiled_fargate_usage");
  public static final HourlyUsageAttributionUsageType PROFILED_HOST_USAGE =
      new HourlyUsageAttributionUsageType("profiled_host_usage");
  public static final HourlyUsageAttributionUsageType PUBLISHED_APP_USAGE =
      new HourlyUsageAttributionUsageType("published_app");
  public static final HourlyUsageAttributionUsageType RUM_BROWSER_MOBILE_SESSIONS_USAGE =
      new HourlyUsageAttributionUsageType("rum_browser_mobile_sessions_usage");
  public static final HourlyUsageAttributionUsageType RUM_INGESTED_USAGE =
      new HourlyUsageAttributionUsageType("rum_ingested_usage");
  public static final HourlyUsageAttributionUsageType RUM_INVESTIGATE_USAGE =
      new HourlyUsageAttributionUsageType("rum_investigate_usage");
  public static final HourlyUsageAttributionUsageType RUM_REPLAY_SESSIONS_USAGE =
      new HourlyUsageAttributionUsageType("rum_replay_sessions_usage");
  public static final HourlyUsageAttributionUsageType RUM_SESSION_REPLAY_ADD_ON_USAGE =
      new HourlyUsageAttributionUsageType("rum_session_replay_add_on_usage");
  public static final HourlyUsageAttributionUsageType SCA_FARGATE_USAGE =
      new HourlyUsageAttributionUsageType("sca_fargate_usage");
  public static final HourlyUsageAttributionUsageType SDS_SCANNED_BYTES_USAGE =
      new HourlyUsageAttributionUsageType("sds_scanned_bytes_usage");
  public static final HourlyUsageAttributionUsageType SERVERLESS_APPS_USAGE =
      new HourlyUsageAttributionUsageType("serverless_apps_usage");
  public static final HourlyUsageAttributionUsageType SIEM_ANALYZED_LOGS_ADD_ON_USAGE =
      new HourlyUsageAttributionUsageType("siem_analyzed_logs_add_on_usage");
  public static final HourlyUsageAttributionUsageType SIEM_INGESTED_BYTES_USAGE =
      new HourlyUsageAttributionUsageType("siem_ingested_bytes_usage");
  public static final HourlyUsageAttributionUsageType SNMP_USAGE =
      new HourlyUsageAttributionUsageType("snmp_usage");
  public static final HourlyUsageAttributionUsageType UNIVERSAL_SERVICE_MONITORING_USAGE =
      new HourlyUsageAttributionUsageType("universal_service_monitoring_usage");
  public static final HourlyUsageAttributionUsageType VULN_MANAGEMENT_HOSTS_USAGE =
      new HourlyUsageAttributionUsageType("vuln_management_hosts_usage");
  public static final HourlyUsageAttributionUsageType WORKFLOW_EXECUTIONS_USAGE =
      new HourlyUsageAttributionUsageType("workflow_executions_usage");

  HourlyUsageAttributionUsageType(String value) {
    super(value, allowedValues);
  }

  public static class HourlyUsageAttributionUsageTypeSerializer
      extends StdSerializer<HourlyUsageAttributionUsageType> {
    public HourlyUsageAttributionUsageTypeSerializer(Class<HourlyUsageAttributionUsageType> t) {
      super(t);
    }

    public HourlyUsageAttributionUsageTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        HourlyUsageAttributionUsageType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static HourlyUsageAttributionUsageType fromValue(String value) {
    return new HourlyUsageAttributionUsageType(value);
  }
}
