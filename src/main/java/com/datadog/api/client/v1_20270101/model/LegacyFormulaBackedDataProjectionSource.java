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
    using =
        LegacyFormulaBackedDataProjectionSource.LegacyFormulaBackedDataProjectionSourceSerializer
            .class)
public class LegacyFormulaBackedDataProjectionSource extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "events",
              "logs",
              "rum",
              "synthetics_test_runs",
              "product_analytics",
              "network",
              "network_device_flows",
              "security_findings",
              "security_signals",
              "ci_pipelines",
              "database_queries",
              "llm_observability",
              "ai_usage",
              "ci_tests",
              "errors",
              "spans",
              "security_runtime"));

  public static final LegacyFormulaBackedDataProjectionSource EVENTS =
      new LegacyFormulaBackedDataProjectionSource("events");
  public static final LegacyFormulaBackedDataProjectionSource LOGS =
      new LegacyFormulaBackedDataProjectionSource("logs");
  public static final LegacyFormulaBackedDataProjectionSource RUM =
      new LegacyFormulaBackedDataProjectionSource("rum");
  public static final LegacyFormulaBackedDataProjectionSource SYNTHETICS_TEST_RUNS =
      new LegacyFormulaBackedDataProjectionSource("synthetics_test_runs");
  public static final LegacyFormulaBackedDataProjectionSource PRODUCT_ANALYTICS =
      new LegacyFormulaBackedDataProjectionSource("product_analytics");
  public static final LegacyFormulaBackedDataProjectionSource NETWORK =
      new LegacyFormulaBackedDataProjectionSource("network");
  public static final LegacyFormulaBackedDataProjectionSource NETWORK_DEVICE_FLOWS =
      new LegacyFormulaBackedDataProjectionSource("network_device_flows");
  public static final LegacyFormulaBackedDataProjectionSource SECURITY_FINDINGS =
      new LegacyFormulaBackedDataProjectionSource("security_findings");
  public static final LegacyFormulaBackedDataProjectionSource SECURITY_SIGNALS =
      new LegacyFormulaBackedDataProjectionSource("security_signals");
  public static final LegacyFormulaBackedDataProjectionSource CI_PIPELINES =
      new LegacyFormulaBackedDataProjectionSource("ci_pipelines");
  public static final LegacyFormulaBackedDataProjectionSource DATABASE_QUERIES =
      new LegacyFormulaBackedDataProjectionSource("database_queries");
  public static final LegacyFormulaBackedDataProjectionSource LLM_OBSERVABILITY =
      new LegacyFormulaBackedDataProjectionSource("llm_observability");
  public static final LegacyFormulaBackedDataProjectionSource AI_USAGE =
      new LegacyFormulaBackedDataProjectionSource("ai_usage");
  public static final LegacyFormulaBackedDataProjectionSource CI_TESTS =
      new LegacyFormulaBackedDataProjectionSource("ci_tests");
  public static final LegacyFormulaBackedDataProjectionSource ERRORS =
      new LegacyFormulaBackedDataProjectionSource("errors");
  public static final LegacyFormulaBackedDataProjectionSource SPANS =
      new LegacyFormulaBackedDataProjectionSource("spans");
  public static final LegacyFormulaBackedDataProjectionSource SECURITY_RUNTIME =
      new LegacyFormulaBackedDataProjectionSource("security_runtime");

  LegacyFormulaBackedDataProjectionSource(String value) {
    super(value, allowedValues);
  }

  public static class LegacyFormulaBackedDataProjectionSourceSerializer
      extends StdSerializer<LegacyFormulaBackedDataProjectionSource> {
    public LegacyFormulaBackedDataProjectionSourceSerializer(
        Class<LegacyFormulaBackedDataProjectionSource> t) {
      super(t);
    }

    public LegacyFormulaBackedDataProjectionSourceSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        LegacyFormulaBackedDataProjectionSource value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static LegacyFormulaBackedDataProjectionSource fromValue(String value) {
    return new LegacyFormulaBackedDataProjectionSource(value);
  }
}
