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

/** Supported metrics for monthly usage attribution requests. */
@JsonSerialize(
    using =
        MonthlyUsageAttributionSupportedMetrics.MonthlyUsageAttributionSupportedMetricsSerializer
            .class)
public class MonthlyUsageAttributionSupportedMetrics extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "api_usage",
              "api_percentage",
              "apm_fargate_usage",
              "apm_fargate_percentage",
              "appsec_fargate_usage",
              "appsec_fargate_percentage",
              "apm_host_usage",
              "apm_host_percentage",
              "apm_usm_usage",
              "apm_usm_percentage",
              "appsec_usage",
              "appsec_percentage",
              "browser_usage",
              "browser_percentage",
              "ci_visibility_itr_usage",
              "ci_visibility_itr_percentage",
              "cloud_siem_usage",
              "cloud_siem_percentage",
              "container_excl_agent_usage",
              "container_excl_agent_percentage",
              "container_usage",
              "container_percentage",
              "cspm_containers_percentage",
              "cspm_containers_usage",
              "cspm_hosts_percentage",
              "cspm_hosts_usage",
              "custom_timeseries_usage",
              "custom_timeseries_percentage",
              "custom_ingested_timeseries_usage",
              "custom_ingested_timeseries_percentage",
              "cws_containers_percentage",
              "cws_containers_usage",
              "cws_hosts_percentage",
              "cws_hosts_usage",
              "dbm_hosts_percentage",
              "dbm_hosts_usage",
              "dbm_queries_percentage",
              "dbm_queries_usage",
              "estimated_indexed_logs_usage",
              "estimated_indexed_logs_percentage",
              "estimated_ingested_logs_usage",
              "estimated_ingested_logs_percentage",
              "estimated_indexed_spans_usage",
              "estimated_indexed_spans_percentage",
              "estimated_ingested_spans_usage",
              "estimated_ingested_spans_percentage",
              "fargate_usage",
              "fargate_percentage",
              "functions_usage",
              "functions_percentage",
              "infra_host_usage",
              "infra_host_percentage",
              "invocations_usage",
              "invocations_percentage",
              "lambda_traced_invocations_usage",
              "lambda_traced_invocations_percentage",
              "mobile_app_testing_percentage",
              "mobile_app_testing_usage",
              "ndm_netflow_usage",
              "ndm_netflow_percentage",
              "npm_host_usage",
              "npm_host_percentage",
              "obs_pipeline_bytes_usage",
              "obs_pipeline_bytes_percentage",
              "profiled_container_usage",
              "profiled_container_percentage",
              "profiled_fargate_usage",
              "profiled_fargate_percentage",
              "profiled_host_usage",
              "profiled_host_percentage",
              "serverless_apps_usage",
              "serverless_apps_percentage",
              "snmp_usage",
              "snmp_percentage",
              "estimated_rum_sessions_usage",
              "estimated_rum_sessions_percentage",
              "universal_service_monitoring_usage",
              "universal_service_monitoring_percentage",
              "vuln_management_hosts_usage",
              "vuln_management_hosts_percentage",
              "sds_scanned_bytes_usage",
              "sds_scanned_bytes_percentage",
              "ci_test_indexed_spans_usage",
              "ci_test_indexed_spans_percentage",
              "ingested_logs_bytes_usage",
              "ingested_logs_bytes_percentage",
              "ci_pipeline_indexed_spans_usage",
              "ci_pipeline_indexed_spans_percentage",
              "indexed_spans_usage",
              "indexed_spans_percentage",
              "custom_event_usage",
              "custom_event_percentage",
              "logs_indexed_custom_retention_usage",
              "logs_indexed_custom_retention_percentage",
              "logs_indexed_360day_usage",
              "logs_indexed_360day_percentage",
              "logs_indexed_180day_usage",
              "logs_indexed_180day_percentage",
              "logs_indexed_90day_usage",
              "logs_indexed_90day_percentage",
              "logs_indexed_60day_usage",
              "logs_indexed_60day_percentage",
              "logs_indexed_45day_usage",
              "logs_indexed_45day_percentage",
              "logs_indexed_30day_usage",
              "logs_indexed_30day_percentage",
              "logs_indexed_15day_usage",
              "logs_indexed_15day_percentage",
              "logs_indexed_7day_usage",
              "logs_indexed_7day_percentage",
              "logs_indexed_3day_usage",
              "logs_indexed_3day_percentage",
              "rum_replay_sessions_usage",
              "rum_replay_sessions_percentage",
              "rum_browser_mobile_sessions_usage",
              "rum_browser_mobile_sessions_percentage",
              "ingested_spans_bytes_usage",
              "ingested_spans_bytes_percentage",
              "siem_ingested_bytes_usage",
              "siem_ingested_bytes_percentage",
              "*"));

  public static final MonthlyUsageAttributionSupportedMetrics API_USAGE =
      new MonthlyUsageAttributionSupportedMetrics("api_usage");
  public static final MonthlyUsageAttributionSupportedMetrics API_PERCENTAGE =
      new MonthlyUsageAttributionSupportedMetrics("api_percentage");
  public static final MonthlyUsageAttributionSupportedMetrics APM_FARGATE_USAGE =
      new MonthlyUsageAttributionSupportedMetrics("apm_fargate_usage");
  public static final MonthlyUsageAttributionSupportedMetrics APM_FARGATE_PERCENTAGE =
      new MonthlyUsageAttributionSupportedMetrics("apm_fargate_percentage");
  public static final MonthlyUsageAttributionSupportedMetrics APPSEC_FARGATE_USAGE =
      new MonthlyUsageAttributionSupportedMetrics("appsec_fargate_usage");
  public static final MonthlyUsageAttributionSupportedMetrics APPSEC_FARGATE_PERCENTAGE =
      new MonthlyUsageAttributionSupportedMetrics("appsec_fargate_percentage");
  public static final MonthlyUsageAttributionSupportedMetrics APM_HOST_USAGE =
      new MonthlyUsageAttributionSupportedMetrics("apm_host_usage");
  public static final MonthlyUsageAttributionSupportedMetrics APM_HOST_PERCENTAGE =
      new MonthlyUsageAttributionSupportedMetrics("apm_host_percentage");
  public static final MonthlyUsageAttributionSupportedMetrics APM_USM_USAGE =
      new MonthlyUsageAttributionSupportedMetrics("apm_usm_usage");
  public static final MonthlyUsageAttributionSupportedMetrics APM_USM_PERCENTAGE =
      new MonthlyUsageAttributionSupportedMetrics("apm_usm_percentage");
  public static final MonthlyUsageAttributionSupportedMetrics APPSEC_USAGE =
      new MonthlyUsageAttributionSupportedMetrics("appsec_usage");
  public static final MonthlyUsageAttributionSupportedMetrics APPSEC_PERCENTAGE =
      new MonthlyUsageAttributionSupportedMetrics("appsec_percentage");
  public static final MonthlyUsageAttributionSupportedMetrics BROWSER_USAGE =
      new MonthlyUsageAttributionSupportedMetrics("browser_usage");
  public static final MonthlyUsageAttributionSupportedMetrics BROWSER_PERCENTAGE =
      new MonthlyUsageAttributionSupportedMetrics("browser_percentage");
  public static final MonthlyUsageAttributionSupportedMetrics CI_VISIBILITY_ITR_USAGE =
      new MonthlyUsageAttributionSupportedMetrics("ci_visibility_itr_usage");
  public static final MonthlyUsageAttributionSupportedMetrics CI_VISIBILITY_ITR_PERCENTAGE =
      new MonthlyUsageAttributionSupportedMetrics("ci_visibility_itr_percentage");
  public static final MonthlyUsageAttributionSupportedMetrics CLOUD_SIEM_USAGE =
      new MonthlyUsageAttributionSupportedMetrics("cloud_siem_usage");
  public static final MonthlyUsageAttributionSupportedMetrics CLOUD_SIEM_PERCENTAGE =
      new MonthlyUsageAttributionSupportedMetrics("cloud_siem_percentage");
  public static final MonthlyUsageAttributionSupportedMetrics CONTAINER_EXCL_AGENT_USAGE =
      new MonthlyUsageAttributionSupportedMetrics("container_excl_agent_usage");
  public static final MonthlyUsageAttributionSupportedMetrics CONTAINER_EXCL_AGENT_PERCENTAGE =
      new MonthlyUsageAttributionSupportedMetrics("container_excl_agent_percentage");
  public static final MonthlyUsageAttributionSupportedMetrics CONTAINER_USAGE =
      new MonthlyUsageAttributionSupportedMetrics("container_usage");
  public static final MonthlyUsageAttributionSupportedMetrics CONTAINER_PERCENTAGE =
      new MonthlyUsageAttributionSupportedMetrics("container_percentage");
  public static final MonthlyUsageAttributionSupportedMetrics CSPM_CONTAINERS_PERCENTAGE =
      new MonthlyUsageAttributionSupportedMetrics("cspm_containers_percentage");
  public static final MonthlyUsageAttributionSupportedMetrics CSPM_CONTAINERS_USAGE =
      new MonthlyUsageAttributionSupportedMetrics("cspm_containers_usage");
  public static final MonthlyUsageAttributionSupportedMetrics CSPM_HOSTS_PERCENTAGE =
      new MonthlyUsageAttributionSupportedMetrics("cspm_hosts_percentage");
  public static final MonthlyUsageAttributionSupportedMetrics CSPM_HOSTS_USAGE =
      new MonthlyUsageAttributionSupportedMetrics("cspm_hosts_usage");
  public static final MonthlyUsageAttributionSupportedMetrics CUSTOM_TIMESERIES_USAGE =
      new MonthlyUsageAttributionSupportedMetrics("custom_timeseries_usage");
  public static final MonthlyUsageAttributionSupportedMetrics CUSTOM_TIMESERIES_PERCENTAGE =
      new MonthlyUsageAttributionSupportedMetrics("custom_timeseries_percentage");
  public static final MonthlyUsageAttributionSupportedMetrics CUSTOM_INGESTED_TIMESERIES_USAGE =
      new MonthlyUsageAttributionSupportedMetrics("custom_ingested_timeseries_usage");
  public static final MonthlyUsageAttributionSupportedMetrics
      CUSTOM_INGESTED_TIMESERIES_PERCENTAGE =
          new MonthlyUsageAttributionSupportedMetrics("custom_ingested_timeseries_percentage");
  public static final MonthlyUsageAttributionSupportedMetrics CWS_CONTAINERS_PERCENTAGE =
      new MonthlyUsageAttributionSupportedMetrics("cws_containers_percentage");
  public static final MonthlyUsageAttributionSupportedMetrics CWS_CONTAINERS_USAGE =
      new MonthlyUsageAttributionSupportedMetrics("cws_containers_usage");
  public static final MonthlyUsageAttributionSupportedMetrics CWS_HOSTS_PERCENTAGE =
      new MonthlyUsageAttributionSupportedMetrics("cws_hosts_percentage");
  public static final MonthlyUsageAttributionSupportedMetrics CWS_HOSTS_USAGE =
      new MonthlyUsageAttributionSupportedMetrics("cws_hosts_usage");
  public static final MonthlyUsageAttributionSupportedMetrics DBM_HOSTS_PERCENTAGE =
      new MonthlyUsageAttributionSupportedMetrics("dbm_hosts_percentage");
  public static final MonthlyUsageAttributionSupportedMetrics DBM_HOSTS_USAGE =
      new MonthlyUsageAttributionSupportedMetrics("dbm_hosts_usage");
  public static final MonthlyUsageAttributionSupportedMetrics DBM_QUERIES_PERCENTAGE =
      new MonthlyUsageAttributionSupportedMetrics("dbm_queries_percentage");
  public static final MonthlyUsageAttributionSupportedMetrics DBM_QUERIES_USAGE =
      new MonthlyUsageAttributionSupportedMetrics("dbm_queries_usage");
  public static final MonthlyUsageAttributionSupportedMetrics ESTIMATED_INDEXED_LOGS_USAGE =
      new MonthlyUsageAttributionSupportedMetrics("estimated_indexed_logs_usage");
  public static final MonthlyUsageAttributionSupportedMetrics ESTIMATED_INDEXED_LOGS_PERCENTAGE =
      new MonthlyUsageAttributionSupportedMetrics("estimated_indexed_logs_percentage");
  public static final MonthlyUsageAttributionSupportedMetrics ESTIMATED_INGESTED_LOGS_USAGE =
      new MonthlyUsageAttributionSupportedMetrics("estimated_ingested_logs_usage");
  public static final MonthlyUsageAttributionSupportedMetrics ESTIMATED_INGESTED_LOGS_PERCENTAGE =
      new MonthlyUsageAttributionSupportedMetrics("estimated_ingested_logs_percentage");
  public static final MonthlyUsageAttributionSupportedMetrics ESTIMATED_INDEXED_SPANS_USAGE =
      new MonthlyUsageAttributionSupportedMetrics("estimated_indexed_spans_usage");
  public static final MonthlyUsageAttributionSupportedMetrics ESTIMATED_INDEXED_SPANS_PERCENTAGE =
      new MonthlyUsageAttributionSupportedMetrics("estimated_indexed_spans_percentage");
  public static final MonthlyUsageAttributionSupportedMetrics ESTIMATED_INGESTED_SPANS_USAGE =
      new MonthlyUsageAttributionSupportedMetrics("estimated_ingested_spans_usage");
  public static final MonthlyUsageAttributionSupportedMetrics ESTIMATED_INGESTED_SPANS_PERCENTAGE =
      new MonthlyUsageAttributionSupportedMetrics("estimated_ingested_spans_percentage");
  public static final MonthlyUsageAttributionSupportedMetrics FARGATE_USAGE =
      new MonthlyUsageAttributionSupportedMetrics("fargate_usage");
  public static final MonthlyUsageAttributionSupportedMetrics FARGATE_PERCENTAGE =
      new MonthlyUsageAttributionSupportedMetrics("fargate_percentage");
  public static final MonthlyUsageAttributionSupportedMetrics FUNCTIONS_USAGE =
      new MonthlyUsageAttributionSupportedMetrics("functions_usage");
  public static final MonthlyUsageAttributionSupportedMetrics FUNCTIONS_PERCENTAGE =
      new MonthlyUsageAttributionSupportedMetrics("functions_percentage");
  public static final MonthlyUsageAttributionSupportedMetrics INFRA_HOST_USAGE =
      new MonthlyUsageAttributionSupportedMetrics("infra_host_usage");
  public static final MonthlyUsageAttributionSupportedMetrics INFRA_HOST_PERCENTAGE =
      new MonthlyUsageAttributionSupportedMetrics("infra_host_percentage");
  public static final MonthlyUsageAttributionSupportedMetrics INVOCATIONS_USAGE =
      new MonthlyUsageAttributionSupportedMetrics("invocations_usage");
  public static final MonthlyUsageAttributionSupportedMetrics INVOCATIONS_PERCENTAGE =
      new MonthlyUsageAttributionSupportedMetrics("invocations_percentage");
  public static final MonthlyUsageAttributionSupportedMetrics LAMBDA_TRACED_INVOCATIONS_USAGE =
      new MonthlyUsageAttributionSupportedMetrics("lambda_traced_invocations_usage");
  public static final MonthlyUsageAttributionSupportedMetrics LAMBDA_TRACED_INVOCATIONS_PERCENTAGE =
      new MonthlyUsageAttributionSupportedMetrics("lambda_traced_invocations_percentage");
  public static final MonthlyUsageAttributionSupportedMetrics MOBILE_APP_TESTING_USAGE =
      new MonthlyUsageAttributionSupportedMetrics("mobile_app_testing_percentage");
  public static final MonthlyUsageAttributionSupportedMetrics MOBILE_APP_TESTING_PERCENTAGE =
      new MonthlyUsageAttributionSupportedMetrics("mobile_app_testing_usage");
  public static final MonthlyUsageAttributionSupportedMetrics NDM_NETFLOW_USAGE =
      new MonthlyUsageAttributionSupportedMetrics("ndm_netflow_usage");
  public static final MonthlyUsageAttributionSupportedMetrics NDM_NETFLOW_PERCENTAGE =
      new MonthlyUsageAttributionSupportedMetrics("ndm_netflow_percentage");
  public static final MonthlyUsageAttributionSupportedMetrics NPM_HOST_USAGE =
      new MonthlyUsageAttributionSupportedMetrics("npm_host_usage");
  public static final MonthlyUsageAttributionSupportedMetrics NPM_HOST_PERCENTAGE =
      new MonthlyUsageAttributionSupportedMetrics("npm_host_percentage");
  public static final MonthlyUsageAttributionSupportedMetrics OBS_PIPELINE_BYTES_USAGE =
      new MonthlyUsageAttributionSupportedMetrics("obs_pipeline_bytes_usage");
  public static final MonthlyUsageAttributionSupportedMetrics OBS_PIPELINE_BYTES_PERCENTAGE =
      new MonthlyUsageAttributionSupportedMetrics("obs_pipeline_bytes_percentage");
  public static final MonthlyUsageAttributionSupportedMetrics PROFILED_CONTAINER_USAGE =
      new MonthlyUsageAttributionSupportedMetrics("profiled_container_usage");
  public static final MonthlyUsageAttributionSupportedMetrics PROFILED_CONTAINER_PERCENTAGE =
      new MonthlyUsageAttributionSupportedMetrics("profiled_container_percentage");
  public static final MonthlyUsageAttributionSupportedMetrics PROFILED_FARGATE_USAGE =
      new MonthlyUsageAttributionSupportedMetrics("profiled_fargate_usage");
  public static final MonthlyUsageAttributionSupportedMetrics PROFILED_FARGATE_PERCENTAGE =
      new MonthlyUsageAttributionSupportedMetrics("profiled_fargate_percentage");
  public static final MonthlyUsageAttributionSupportedMetrics PROFILED_HOST_USAGE =
      new MonthlyUsageAttributionSupportedMetrics("profiled_host_usage");
  public static final MonthlyUsageAttributionSupportedMetrics PROFILED_HOST_PERCENTAGE =
      new MonthlyUsageAttributionSupportedMetrics("profiled_host_percentage");
  public static final MonthlyUsageAttributionSupportedMetrics SERVERLESS_APPS_USAGE =
      new MonthlyUsageAttributionSupportedMetrics("serverless_apps_usage");
  public static final MonthlyUsageAttributionSupportedMetrics SERVERLESS_APPS_PERCENTAGE =
      new MonthlyUsageAttributionSupportedMetrics("serverless_apps_percentage");
  public static final MonthlyUsageAttributionSupportedMetrics SNMP_USAGE =
      new MonthlyUsageAttributionSupportedMetrics("snmp_usage");
  public static final MonthlyUsageAttributionSupportedMetrics SNMP_PERCENTAGE =
      new MonthlyUsageAttributionSupportedMetrics("snmp_percentage");
  public static final MonthlyUsageAttributionSupportedMetrics ESTIMATED_RUM_SESSIONS_USAGE =
      new MonthlyUsageAttributionSupportedMetrics("estimated_rum_sessions_usage");
  public static final MonthlyUsageAttributionSupportedMetrics ESTIMATED_RUM_SESSIONS_PERCENTAGE =
      new MonthlyUsageAttributionSupportedMetrics("estimated_rum_sessions_percentage");
  public static final MonthlyUsageAttributionSupportedMetrics UNIVERSAL_SERVICE_MONITORING_USAGE =
      new MonthlyUsageAttributionSupportedMetrics("universal_service_monitoring_usage");
  public static final MonthlyUsageAttributionSupportedMetrics
      UNIVERSAL_SERVICE_MONITORING_PERCENTAGE =
          new MonthlyUsageAttributionSupportedMetrics("universal_service_monitoring_percentage");
  public static final MonthlyUsageAttributionSupportedMetrics VULN_MANAGEMENT_HOSTS_USAGE =
      new MonthlyUsageAttributionSupportedMetrics("vuln_management_hosts_usage");
  public static final MonthlyUsageAttributionSupportedMetrics VULN_MANAGEMENT_HOSTS_PERCENTAGE =
      new MonthlyUsageAttributionSupportedMetrics("vuln_management_hosts_percentage");
  public static final MonthlyUsageAttributionSupportedMetrics SDS_SCANNED_BYTES_USAGE =
      new MonthlyUsageAttributionSupportedMetrics("sds_scanned_bytes_usage");
  public static final MonthlyUsageAttributionSupportedMetrics SDS_SCANNED_BYTES_PERCENTAGE =
      new MonthlyUsageAttributionSupportedMetrics("sds_scanned_bytes_percentage");
  public static final MonthlyUsageAttributionSupportedMetrics CI_TEST_INDEXED_SPANS_USAGE =
      new MonthlyUsageAttributionSupportedMetrics("ci_test_indexed_spans_usage");
  public static final MonthlyUsageAttributionSupportedMetrics CI_TEST_INDEXED_SPANS_PERCENTAGE =
      new MonthlyUsageAttributionSupportedMetrics("ci_test_indexed_spans_percentage");
  public static final MonthlyUsageAttributionSupportedMetrics INGESTED_LOGS_BYTES_USAGE =
      new MonthlyUsageAttributionSupportedMetrics("ingested_logs_bytes_usage");
  public static final MonthlyUsageAttributionSupportedMetrics INGESTED_LOGS_BYTES_PERCENTAGE =
      new MonthlyUsageAttributionSupportedMetrics("ingested_logs_bytes_percentage");
  public static final MonthlyUsageAttributionSupportedMetrics CI_PIPELINE_INDEXED_SPANS_USAGE =
      new MonthlyUsageAttributionSupportedMetrics("ci_pipeline_indexed_spans_usage");
  public static final MonthlyUsageAttributionSupportedMetrics CI_PIPELINE_INDEXED_SPANS_PERCENTAGE =
      new MonthlyUsageAttributionSupportedMetrics("ci_pipeline_indexed_spans_percentage");
  public static final MonthlyUsageAttributionSupportedMetrics INDEXED_SPANS_USAGE =
      new MonthlyUsageAttributionSupportedMetrics("indexed_spans_usage");
  public static final MonthlyUsageAttributionSupportedMetrics INDEXED_SPANS_PERCENTAGE =
      new MonthlyUsageAttributionSupportedMetrics("indexed_spans_percentage");
  public static final MonthlyUsageAttributionSupportedMetrics CUSTOM_EVENT_USAGE =
      new MonthlyUsageAttributionSupportedMetrics("custom_event_usage");
  public static final MonthlyUsageAttributionSupportedMetrics CUSTOM_EVENT_PERCENTAGE =
      new MonthlyUsageAttributionSupportedMetrics("custom_event_percentage");
  public static final MonthlyUsageAttributionSupportedMetrics LOGS_INDEXED_CUSTOM_RETENTION_USAGE =
      new MonthlyUsageAttributionSupportedMetrics("logs_indexed_custom_retention_usage");
  public static final MonthlyUsageAttributionSupportedMetrics
      LOGS_INDEXED_CUSTOM_RETENTION_PERCENTAGE =
          new MonthlyUsageAttributionSupportedMetrics("logs_indexed_custom_retention_percentage");
  public static final MonthlyUsageAttributionSupportedMetrics LOGS_INDEXED_360DAY_USAGE =
      new MonthlyUsageAttributionSupportedMetrics("logs_indexed_360day_usage");
  public static final MonthlyUsageAttributionSupportedMetrics LOGS_INDEXED_360DAY_PERCENTAGE =
      new MonthlyUsageAttributionSupportedMetrics("logs_indexed_360day_percentage");
  public static final MonthlyUsageAttributionSupportedMetrics LOGS_INDEXED_180DAY_USAGE =
      new MonthlyUsageAttributionSupportedMetrics("logs_indexed_180day_usage");
  public static final MonthlyUsageAttributionSupportedMetrics LOGS_INDEXED_180DAY_PERCENTAGE =
      new MonthlyUsageAttributionSupportedMetrics("logs_indexed_180day_percentage");
  public static final MonthlyUsageAttributionSupportedMetrics LOGS_INDEXED_90DAY_USAGE =
      new MonthlyUsageAttributionSupportedMetrics("logs_indexed_90day_usage");
  public static final MonthlyUsageAttributionSupportedMetrics LOGS_INDEXED_90DAY_PERCENTAGE =
      new MonthlyUsageAttributionSupportedMetrics("logs_indexed_90day_percentage");
  public static final MonthlyUsageAttributionSupportedMetrics LOGS_INDEXED_60DAY_USAGE =
      new MonthlyUsageAttributionSupportedMetrics("logs_indexed_60day_usage");
  public static final MonthlyUsageAttributionSupportedMetrics LOGS_INDEXED_60DAY_PERCENTAGE =
      new MonthlyUsageAttributionSupportedMetrics("logs_indexed_60day_percentage");
  public static final MonthlyUsageAttributionSupportedMetrics LOGS_INDEXED_45DAY_USAGE =
      new MonthlyUsageAttributionSupportedMetrics("logs_indexed_45day_usage");
  public static final MonthlyUsageAttributionSupportedMetrics LOGS_INDEXED_45DAY_PERCENTAGE =
      new MonthlyUsageAttributionSupportedMetrics("logs_indexed_45day_percentage");
  public static final MonthlyUsageAttributionSupportedMetrics LOGS_INDEXED_30DAY_USAGE =
      new MonthlyUsageAttributionSupportedMetrics("logs_indexed_30day_usage");
  public static final MonthlyUsageAttributionSupportedMetrics LOGS_INDEXED_30DAY_PERCENTAGE =
      new MonthlyUsageAttributionSupportedMetrics("logs_indexed_30day_percentage");
  public static final MonthlyUsageAttributionSupportedMetrics LOGS_INDEXED_15DAY_USAGE =
      new MonthlyUsageAttributionSupportedMetrics("logs_indexed_15day_usage");
  public static final MonthlyUsageAttributionSupportedMetrics LOGS_INDEXED_15DAY_PERCENTAGE =
      new MonthlyUsageAttributionSupportedMetrics("logs_indexed_15day_percentage");
  public static final MonthlyUsageAttributionSupportedMetrics LOGS_INDEXED_7DAY_USAGE =
      new MonthlyUsageAttributionSupportedMetrics("logs_indexed_7day_usage");
  public static final MonthlyUsageAttributionSupportedMetrics LOGS_INDEXED_7DAY_PERCENTAGE =
      new MonthlyUsageAttributionSupportedMetrics("logs_indexed_7day_percentage");
  public static final MonthlyUsageAttributionSupportedMetrics LOGS_INDEXED_3DAY_USAGE =
      new MonthlyUsageAttributionSupportedMetrics("logs_indexed_3day_usage");
  public static final MonthlyUsageAttributionSupportedMetrics LOGS_INDEXED_3DAY_PERCENTAGE =
      new MonthlyUsageAttributionSupportedMetrics("logs_indexed_3day_percentage");
  public static final MonthlyUsageAttributionSupportedMetrics RUM_REPLAY_SESSIONS_USAGE =
      new MonthlyUsageAttributionSupportedMetrics("rum_replay_sessions_usage");
  public static final MonthlyUsageAttributionSupportedMetrics RUM_REPLAY_SESSIONS_PERCENTAGE =
      new MonthlyUsageAttributionSupportedMetrics("rum_replay_sessions_percentage");
  public static final MonthlyUsageAttributionSupportedMetrics RUM_BROWSER_MOBILE_SESSIONS_USAGE =
      new MonthlyUsageAttributionSupportedMetrics("rum_browser_mobile_sessions_usage");
  public static final MonthlyUsageAttributionSupportedMetrics
      RUM_BROWSER_MOBILE_SESSIONS_PERCENTAGE =
          new MonthlyUsageAttributionSupportedMetrics("rum_browser_mobile_sessions_percentage");
  public static final MonthlyUsageAttributionSupportedMetrics INGESTED_SPANS_BYTES_USAGE =
      new MonthlyUsageAttributionSupportedMetrics("ingested_spans_bytes_usage");
  public static final MonthlyUsageAttributionSupportedMetrics INGESTED_SPANS_BYTES_PERCENTAGE =
      new MonthlyUsageAttributionSupportedMetrics("ingested_spans_bytes_percentage");
  public static final MonthlyUsageAttributionSupportedMetrics SIEM_INGESTED_BYTES_USAGE =
      new MonthlyUsageAttributionSupportedMetrics("siem_ingested_bytes_usage");
  public static final MonthlyUsageAttributionSupportedMetrics SIEM_INGESTED_BYTES_PERCENTAGE =
      new MonthlyUsageAttributionSupportedMetrics("siem_ingested_bytes_percentage");
  public static final MonthlyUsageAttributionSupportedMetrics ALL =
      new MonthlyUsageAttributionSupportedMetrics("*");

  MonthlyUsageAttributionSupportedMetrics(String value) {
    super(value, allowedValues);
  }

  public static class MonthlyUsageAttributionSupportedMetricsSerializer
      extends StdSerializer<MonthlyUsageAttributionSupportedMetrics> {
    public MonthlyUsageAttributionSupportedMetricsSerializer(
        Class<MonthlyUsageAttributionSupportedMetrics> t) {
      super(t);
    }

    public MonthlyUsageAttributionSupportedMetricsSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        MonthlyUsageAttributionSupportedMetrics value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static MonthlyUsageAttributionSupportedMetrics fromValue(String value) {
    return new MonthlyUsageAttributionSupportedMetrics(value);
  }
}
