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
@JsonSerialize(
    using = FormulaAndFunctionEventsDataSource.FormulaAndFunctionEventsDataSourceSerializer.class)
public class FormulaAndFunctionEventsDataSource extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "events",
              "logs",
              "rum",
              "synthetics_test_runs",
              "product_analytics",
              "network",
              "profiles",
              "network_device_flows",
              "recommendations",
              "security_findings",
              "security_signals",
              "ci_pipelines",
              "database_queries",
              "llm_observability",
              "ai_usage",
              "audit",
              "ci_tests",
              "errors",
              "spans",
              "security_runtime",
              "app_sec_spans",
              "app_sec_entities",
              "bits_ai_investigations",
              "ci_code_scan",
              "ci_dependencies",
              "ci_gates",
              "ci_coverage_reports",
              "data_observability_events",
              "dora_metrics",
              "compliance_findings",
              "deployments",
              "deployment_gates",
              "exposures",
              "flag_evaluations",
              "network_path",
              "observability_pipelines",
              "on_call_events",
              "orchestration_troubleshooting",
              "security_historical_results",
              "security_info",
              "software_inventory",
              "synthetics_batches",
              "synthetics_map",
              "replay",
              "behavior"));

  public static final FormulaAndFunctionEventsDataSource EVENTS =
      new FormulaAndFunctionEventsDataSource("events");
  public static final FormulaAndFunctionEventsDataSource LOGS =
      new FormulaAndFunctionEventsDataSource("logs");
  public static final FormulaAndFunctionEventsDataSource RUM =
      new FormulaAndFunctionEventsDataSource("rum");
  public static final FormulaAndFunctionEventsDataSource SYNTHETICS_TEST_RUNS =
      new FormulaAndFunctionEventsDataSource("synthetics_test_runs");
  public static final FormulaAndFunctionEventsDataSource PRODUCT_ANALYTICS =
      new FormulaAndFunctionEventsDataSource("product_analytics");
  public static final FormulaAndFunctionEventsDataSource NETWORK =
      new FormulaAndFunctionEventsDataSource("network");
  public static final FormulaAndFunctionEventsDataSource PROFILES =
      new FormulaAndFunctionEventsDataSource("profiles");
  public static final FormulaAndFunctionEventsDataSource NETWORK_DEVICE_FLOWS =
      new FormulaAndFunctionEventsDataSource("network_device_flows");
  public static final FormulaAndFunctionEventsDataSource RECOMMENDATIONS =
      new FormulaAndFunctionEventsDataSource("recommendations");
  public static final FormulaAndFunctionEventsDataSource SECURITY_FINDINGS =
      new FormulaAndFunctionEventsDataSource("security_findings");
  public static final FormulaAndFunctionEventsDataSource SECURITY_SIGNALS =
      new FormulaAndFunctionEventsDataSource("security_signals");
  public static final FormulaAndFunctionEventsDataSource CI_PIPELINES =
      new FormulaAndFunctionEventsDataSource("ci_pipelines");
  public static final FormulaAndFunctionEventsDataSource DATABASE_QUERIES =
      new FormulaAndFunctionEventsDataSource("database_queries");
  public static final FormulaAndFunctionEventsDataSource LLM_OBSERVABILITY =
      new FormulaAndFunctionEventsDataSource("llm_observability");
  public static final FormulaAndFunctionEventsDataSource AI_USAGE =
      new FormulaAndFunctionEventsDataSource("ai_usage");
  public static final FormulaAndFunctionEventsDataSource AUDIT =
      new FormulaAndFunctionEventsDataSource("audit");
  public static final FormulaAndFunctionEventsDataSource CI_TESTS =
      new FormulaAndFunctionEventsDataSource("ci_tests");
  public static final FormulaAndFunctionEventsDataSource ERRORS =
      new FormulaAndFunctionEventsDataSource("errors");
  public static final FormulaAndFunctionEventsDataSource SPANS =
      new FormulaAndFunctionEventsDataSource("spans");
  public static final FormulaAndFunctionEventsDataSource SECURITY_RUNTIME =
      new FormulaAndFunctionEventsDataSource("security_runtime");
  public static final FormulaAndFunctionEventsDataSource APP_SEC_SPANS =
      new FormulaAndFunctionEventsDataSource("app_sec_spans");
  public static final FormulaAndFunctionEventsDataSource APP_SEC_ENTITIES =
      new FormulaAndFunctionEventsDataSource("app_sec_entities");
  public static final FormulaAndFunctionEventsDataSource BITS_AI_INVESTIGATIONS =
      new FormulaAndFunctionEventsDataSource("bits_ai_investigations");
  public static final FormulaAndFunctionEventsDataSource CI_CODE_SCAN =
      new FormulaAndFunctionEventsDataSource("ci_code_scan");
  public static final FormulaAndFunctionEventsDataSource CI_DEPENDENCIES =
      new FormulaAndFunctionEventsDataSource("ci_dependencies");
  public static final FormulaAndFunctionEventsDataSource CI_GATES =
      new FormulaAndFunctionEventsDataSource("ci_gates");
  public static final FormulaAndFunctionEventsDataSource CI_COVERAGE_REPORTS =
      new FormulaAndFunctionEventsDataSource("ci_coverage_reports");
  public static final FormulaAndFunctionEventsDataSource DATA_OBSERVABILITY_EVENTS =
      new FormulaAndFunctionEventsDataSource("data_observability_events");
  public static final FormulaAndFunctionEventsDataSource DORA_METRICS =
      new FormulaAndFunctionEventsDataSource("dora_metrics");
  public static final FormulaAndFunctionEventsDataSource COMPLIANCE_FINDINGS =
      new FormulaAndFunctionEventsDataSource("compliance_findings");
  public static final FormulaAndFunctionEventsDataSource DEPLOYMENTS =
      new FormulaAndFunctionEventsDataSource("deployments");
  public static final FormulaAndFunctionEventsDataSource DEPLOYMENT_GATES =
      new FormulaAndFunctionEventsDataSource("deployment_gates");
  public static final FormulaAndFunctionEventsDataSource EXPOSURES =
      new FormulaAndFunctionEventsDataSource("exposures");
  public static final FormulaAndFunctionEventsDataSource FLAG_EVALUATIONS =
      new FormulaAndFunctionEventsDataSource("flag_evaluations");
  public static final FormulaAndFunctionEventsDataSource NETWORK_PATH =
      new FormulaAndFunctionEventsDataSource("network_path");
  public static final FormulaAndFunctionEventsDataSource OBSERVABILITY_PIPELINES =
      new FormulaAndFunctionEventsDataSource("observability_pipelines");
  public static final FormulaAndFunctionEventsDataSource ON_CALL_EVENTS =
      new FormulaAndFunctionEventsDataSource("on_call_events");
  public static final FormulaAndFunctionEventsDataSource ORCHESTRATION_TROUBLESHOOTING =
      new FormulaAndFunctionEventsDataSource("orchestration_troubleshooting");
  public static final FormulaAndFunctionEventsDataSource SECURITY_HISTORICAL_RESULTS =
      new FormulaAndFunctionEventsDataSource("security_historical_results");
  public static final FormulaAndFunctionEventsDataSource SECURITY_INFO =
      new FormulaAndFunctionEventsDataSource("security_info");
  public static final FormulaAndFunctionEventsDataSource SOFTWARE_INVENTORY =
      new FormulaAndFunctionEventsDataSource("software_inventory");
  public static final FormulaAndFunctionEventsDataSource SYNTHETICS_BATCHES =
      new FormulaAndFunctionEventsDataSource("synthetics_batches");
  public static final FormulaAndFunctionEventsDataSource SYNTHETICS_MAP =
      new FormulaAndFunctionEventsDataSource("synthetics_map");
  public static final FormulaAndFunctionEventsDataSource REPLAY =
      new FormulaAndFunctionEventsDataSource("replay");
  public static final FormulaAndFunctionEventsDataSource BEHAVIOR =
      new FormulaAndFunctionEventsDataSource("behavior");

  FormulaAndFunctionEventsDataSource(String value) {
    super(value, allowedValues);
  }

  public static class FormulaAndFunctionEventsDataSourceSerializer
      extends StdSerializer<FormulaAndFunctionEventsDataSource> {
    public FormulaAndFunctionEventsDataSourceSerializer(
        Class<FormulaAndFunctionEventsDataSource> t) {
      super(t);
    }

    public FormulaAndFunctionEventsDataSourceSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        FormulaAndFunctionEventsDataSource value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static FormulaAndFunctionEventsDataSource fromValue(String value) {
    return new FormulaAndFunctionEventsDataSource(value);
  }
}
