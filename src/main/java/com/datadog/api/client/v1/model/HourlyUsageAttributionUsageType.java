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

/** Supported products for hourly usage attribution requests. */
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
              "browser_usage",
              "ci_visibility_itr_usage",
              "container_excl_agent_usage",
              "container_usage",
              "cspm_containers_usage",
              "cspm_hosts_usage",
              "custom_ingested_timeseries_usage",
              "custom_timeseries_usage",
              "cws_containers_usage",
              "cws_hosts_usage",
              "dbm_hosts_usage",
              "dbm_queries_usage",
              "estimated_indexed_logs_usage",
              "estimated_indexed_spans_usage",
              "estimated_ingested_logs_usage",
              "estimated_ingested_spans_usage",
              "estimated_rum_sessions_usage",
              "fargate_usage",
              "functions_usage",
              "infra_host_usage",
              "invocations_usage",
              "mobile_app_testing_usage",
              "ndm_netflow_usage",
              "npm_host_usage",
              "obs_pipeline_bytes_usage",
              "profiled_container_usage",
              "profiled_fargate_usage",
              "profiled_host_usage",
              "sds_scanned_bytes_usage",
              "serverless_apps_usage",
              "snmp_usage",
              "universal_service_monitoring_usage",
              "vuln_management_hosts_usage"));

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
  public static final HourlyUsageAttributionUsageType BROWSER_USAGE =
      new HourlyUsageAttributionUsageType("browser_usage");
  public static final HourlyUsageAttributionUsageType CI_VISIBILITY_ITR_USAGE =
      new HourlyUsageAttributionUsageType("ci_visibility_itr_usage");
  public static final HourlyUsageAttributionUsageType CONTAINER_EXCL_AGENT_USAGE =
      new HourlyUsageAttributionUsageType("container_excl_agent_usage");
  public static final HourlyUsageAttributionUsageType CONTAINER_USAGE =
      new HourlyUsageAttributionUsageType("container_usage");
  public static final HourlyUsageAttributionUsageType CSPM_CONTAINERS_USAGE =
      new HourlyUsageAttributionUsageType("cspm_containers_usage");
  public static final HourlyUsageAttributionUsageType CSPM_HOSTS_USAGE =
      new HourlyUsageAttributionUsageType("cspm_hosts_usage");
  public static final HourlyUsageAttributionUsageType CUSTOM_INGESTED_TIMESERIES_USAGE =
      new HourlyUsageAttributionUsageType("custom_ingested_timeseries_usage");
  public static final HourlyUsageAttributionUsageType CUSTOM_TIMESERIES_USAGE =
      new HourlyUsageAttributionUsageType("custom_timeseries_usage");
  public static final HourlyUsageAttributionUsageType CWS_CONTAINERS_USAGE =
      new HourlyUsageAttributionUsageType("cws_containers_usage");
  public static final HourlyUsageAttributionUsageType CWS_HOSTS_USAGE =
      new HourlyUsageAttributionUsageType("cws_hosts_usage");
  public static final HourlyUsageAttributionUsageType DBM_HOSTS_USAGE =
      new HourlyUsageAttributionUsageType("dbm_hosts_usage");
  public static final HourlyUsageAttributionUsageType DBM_QUERIES_USAGE =
      new HourlyUsageAttributionUsageType("dbm_queries_usage");
  public static final HourlyUsageAttributionUsageType ESTIMATED_INDEXED_LOGS_USAGE =
      new HourlyUsageAttributionUsageType("estimated_indexed_logs_usage");
  public static final HourlyUsageAttributionUsageType ESTIMATED_INDEXED_SPANS_USAGE =
      new HourlyUsageAttributionUsageType("estimated_indexed_spans_usage");
  public static final HourlyUsageAttributionUsageType ESTIMATED_INGESTED_LOGS_USAGE =
      new HourlyUsageAttributionUsageType("estimated_ingested_logs_usage");
  public static final HourlyUsageAttributionUsageType ESTIMATED_INGESTED_SPANS_USAGE =
      new HourlyUsageAttributionUsageType("estimated_ingested_spans_usage");
  public static final HourlyUsageAttributionUsageType ESTIMATED_RUM_SESSIONS_USAGE =
      new HourlyUsageAttributionUsageType("estimated_rum_sessions_usage");
  public static final HourlyUsageAttributionUsageType FARGATE_USAGE =
      new HourlyUsageAttributionUsageType("fargate_usage");
  public static final HourlyUsageAttributionUsageType FUNCTIONS_USAGE =
      new HourlyUsageAttributionUsageType("functions_usage");
  public static final HourlyUsageAttributionUsageType INFRA_HOST_USAGE =
      new HourlyUsageAttributionUsageType("infra_host_usage");
  public static final HourlyUsageAttributionUsageType INVOCATIONS_USAGE =
      new HourlyUsageAttributionUsageType("invocations_usage");
  public static final HourlyUsageAttributionUsageType MOBILE_APP_TESTING_USAGE =
      new HourlyUsageAttributionUsageType("mobile_app_testing_usage");
  public static final HourlyUsageAttributionUsageType NDM_NETFLOW_USAGE =
      new HourlyUsageAttributionUsageType("ndm_netflow_usage");
  public static final HourlyUsageAttributionUsageType NPM_HOST_USAGE =
      new HourlyUsageAttributionUsageType("npm_host_usage");
  public static final HourlyUsageAttributionUsageType OBS_PIPELINE_BYTES_USAGE =
      new HourlyUsageAttributionUsageType("obs_pipeline_bytes_usage");
  public static final HourlyUsageAttributionUsageType PROFILED_CONTAINER_USAGE =
      new HourlyUsageAttributionUsageType("profiled_container_usage");
  public static final HourlyUsageAttributionUsageType PROFILED_FARGATE_USAGE =
      new HourlyUsageAttributionUsageType("profiled_fargate_usage");
  public static final HourlyUsageAttributionUsageType PROFILED_HOST_USAGE =
      new HourlyUsageAttributionUsageType("profiled_host_usage");
  public static final HourlyUsageAttributionUsageType SDS_SCANNED_BYTES_USAGE =
      new HourlyUsageAttributionUsageType("sds_scanned_bytes_usage");
  public static final HourlyUsageAttributionUsageType SERVERLESS_APPS_USAGE =
      new HourlyUsageAttributionUsageType("serverless_apps_usage");
  public static final HourlyUsageAttributionUsageType SNMP_USAGE =
      new HourlyUsageAttributionUsageType("snmp_usage");
  public static final HourlyUsageAttributionUsageType UNIVERSAL_SERVICE_MONITORING_USAGE =
      new HourlyUsageAttributionUsageType("universal_service_monitoring_usage");
  public static final HourlyUsageAttributionUsageType VULN_MANAGEMENT_HOSTS_USAGE =
      new HourlyUsageAttributionUsageType("vuln_management_hosts_usage");

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
