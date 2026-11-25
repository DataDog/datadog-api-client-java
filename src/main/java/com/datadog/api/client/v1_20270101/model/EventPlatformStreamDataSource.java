/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1_20270101.model;

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

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonSerialize(using = EventPlatformStreamDataSource.EventPlatformStreamDataSourceSerializer.class)
public class EventPlatformStreamDataSource extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "logs_stream",
              "audit_stream",
              "trace_stream",
              "errors_stream",
              "event_stream",
              "rum_stream",
              "ci_pipeline_stream",
              "ci_test_stream",
              "ci_gate_stream",
              "ci_code_scan_stream",
              "ci_dependency_stream",
              "deployment_stream",
              "recommendations_stream",
              "synthetics_batch_stream",
              "synthetics_test_runs_stream",
              "observability_pipelines_stream",
              "security_runtime_stream",
              "security_signals_stream",
              "product_analytics_stream",
              "app_sec_span_stream",
              "app_sec_entities_stream",
              "compliance_event_stream",
              "compliance_findings_stream",
              "security_findings_stream",
              "supply_chain_firewall_report_stream",
              "data_observability_stream",
              "database_query_stream",
              "database_raw_query_stream",
              "deployment_gates_stream",
              "llm_observability_stream",
              "network_device_flow_stream",
              "network_flow_stream",
              "network_path_stream",
              "on_call_events_stream",
              "profile_stream",
              "security_dump_stream",
              "security_historical_results_stream",
              "session_replay_stream",
              "software_inventory_stream",
              "critical_asset_stream"));

  public static final EventPlatformStreamDataSource LOGS_STREAM =
      new EventPlatformStreamDataSource("logs_stream");
  public static final EventPlatformStreamDataSource AUDIT_STREAM =
      new EventPlatformStreamDataSource("audit_stream");
  public static final EventPlatformStreamDataSource TRACE_STREAM =
      new EventPlatformStreamDataSource("trace_stream");
  public static final EventPlatformStreamDataSource ERRORS_STREAM =
      new EventPlatformStreamDataSource("errors_stream");
  public static final EventPlatformStreamDataSource EVENT_STREAM =
      new EventPlatformStreamDataSource("event_stream");
  public static final EventPlatformStreamDataSource RUM_STREAM =
      new EventPlatformStreamDataSource("rum_stream");
  public static final EventPlatformStreamDataSource CI_PIPELINE_STREAM =
      new EventPlatformStreamDataSource("ci_pipeline_stream");
  public static final EventPlatformStreamDataSource CI_TEST_STREAM =
      new EventPlatformStreamDataSource("ci_test_stream");
  public static final EventPlatformStreamDataSource CI_GATE_STREAM =
      new EventPlatformStreamDataSource("ci_gate_stream");
  public static final EventPlatformStreamDataSource CI_CODE_SCAN_STREAM =
      new EventPlatformStreamDataSource("ci_code_scan_stream");
  public static final EventPlatformStreamDataSource CI_DEPENDENCY_STREAM =
      new EventPlatformStreamDataSource("ci_dependency_stream");
  public static final EventPlatformStreamDataSource DEPLOYMENT_STREAM =
      new EventPlatformStreamDataSource("deployment_stream");
  public static final EventPlatformStreamDataSource RECOMMENDATIONS_STREAM =
      new EventPlatformStreamDataSource("recommendations_stream");
  public static final EventPlatformStreamDataSource SYNTHETICS_BATCH_STREAM =
      new EventPlatformStreamDataSource("synthetics_batch_stream");
  public static final EventPlatformStreamDataSource SYNTHETICS_TEST_RUNS_STREAM =
      new EventPlatformStreamDataSource("synthetics_test_runs_stream");
  public static final EventPlatformStreamDataSource OBSERVABILITY_PIPELINES_STREAM =
      new EventPlatformStreamDataSource("observability_pipelines_stream");
  public static final EventPlatformStreamDataSource SECURITY_RUNTIME_STREAM =
      new EventPlatformStreamDataSource("security_runtime_stream");
  public static final EventPlatformStreamDataSource SECURITY_SIGNALS_STREAM =
      new EventPlatformStreamDataSource("security_signals_stream");
  public static final EventPlatformStreamDataSource PRODUCT_ANALYTICS_STREAM =
      new EventPlatformStreamDataSource("product_analytics_stream");
  public static final EventPlatformStreamDataSource APP_SEC_SPAN_STREAM =
      new EventPlatformStreamDataSource("app_sec_span_stream");
  public static final EventPlatformStreamDataSource APP_SEC_ENTITIES_STREAM =
      new EventPlatformStreamDataSource("app_sec_entities_stream");
  public static final EventPlatformStreamDataSource COMPLIANCE_EVENT_STREAM =
      new EventPlatformStreamDataSource("compliance_event_stream");
  public static final EventPlatformStreamDataSource COMPLIANCE_FINDINGS_STREAM =
      new EventPlatformStreamDataSource("compliance_findings_stream");
  public static final EventPlatformStreamDataSource SECURITY_FINDINGS_STREAM =
      new EventPlatformStreamDataSource("security_findings_stream");
  public static final EventPlatformStreamDataSource SUPPLY_CHAIN_FIREWALL_REPORT_STREAM =
      new EventPlatformStreamDataSource("supply_chain_firewall_report_stream");
  public static final EventPlatformStreamDataSource DATA_OBSERVABILITY_STREAM =
      new EventPlatformStreamDataSource("data_observability_stream");
  public static final EventPlatformStreamDataSource DATABASE_QUERY_STREAM =
      new EventPlatformStreamDataSource("database_query_stream");
  public static final EventPlatformStreamDataSource DATABASE_RAW_QUERY_STREAM =
      new EventPlatformStreamDataSource("database_raw_query_stream");
  public static final EventPlatformStreamDataSource DEPLOYMENT_GATES_STREAM =
      new EventPlatformStreamDataSource("deployment_gates_stream");
  public static final EventPlatformStreamDataSource LLM_OBSERVABILITY_STREAM =
      new EventPlatformStreamDataSource("llm_observability_stream");
  public static final EventPlatformStreamDataSource NETWORK_DEVICE_FLOW_STREAM =
      new EventPlatformStreamDataSource("network_device_flow_stream");
  public static final EventPlatformStreamDataSource NETWORK_FLOW_STREAM =
      new EventPlatformStreamDataSource("network_flow_stream");
  public static final EventPlatformStreamDataSource NETWORK_PATH_STREAM =
      new EventPlatformStreamDataSource("network_path_stream");
  public static final EventPlatformStreamDataSource ON_CALL_EVENTS_STREAM =
      new EventPlatformStreamDataSource("on_call_events_stream");
  public static final EventPlatformStreamDataSource PROFILE_STREAM =
      new EventPlatformStreamDataSource("profile_stream");
  public static final EventPlatformStreamDataSource SECURITY_DUMP_STREAM =
      new EventPlatformStreamDataSource("security_dump_stream");
  public static final EventPlatformStreamDataSource SECURITY_HISTORICAL_RESULTS_STREAM =
      new EventPlatformStreamDataSource("security_historical_results_stream");
  public static final EventPlatformStreamDataSource SESSION_REPLAY_STREAM =
      new EventPlatformStreamDataSource("session_replay_stream");
  public static final EventPlatformStreamDataSource SOFTWARE_INVENTORY_STREAM =
      new EventPlatformStreamDataSource("software_inventory_stream");
  public static final EventPlatformStreamDataSource CRITICAL_ASSET_STREAM =
      new EventPlatformStreamDataSource("critical_asset_stream");

  EventPlatformStreamDataSource(String value) {
    super(value, allowedValues);
  }

  public static class EventPlatformStreamDataSourceSerializer
      extends StdSerializer<EventPlatformStreamDataSource> {
    public EventPlatformStreamDataSourceSerializer(Class<EventPlatformStreamDataSource> t) {
      super(t);
    }

    public EventPlatformStreamDataSourceSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        EventPlatformStreamDataSource value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static EventPlatformStreamDataSource fromValue(String value) {
    return new EventPlatformStreamDataSource(value);
  }
}
