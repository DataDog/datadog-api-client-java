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
@JsonSerialize(using = AdvancedEventPlatformSource.AdvancedEventPlatformSourceSerializer.class)
public class AdvancedEventPlatformSource extends ModelEnum<String> {

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
              "audit",
              "ci_tests",
              "errors",
              "monitors",
              "monitor_groups",
              "spans",
              "security_runtime",
              "synthetics_matches"));

  public static final AdvancedEventPlatformSource EVENTS =
      new AdvancedEventPlatformSource("events");
  public static final AdvancedEventPlatformSource LOGS = new AdvancedEventPlatformSource("logs");
  public static final AdvancedEventPlatformSource RUM = new AdvancedEventPlatformSource("rum");
  public static final AdvancedEventPlatformSource SYNTHETICS_TEST_RUNS =
      new AdvancedEventPlatformSource("synthetics_test_runs");
  public static final AdvancedEventPlatformSource PRODUCT_ANALYTICS =
      new AdvancedEventPlatformSource("product_analytics");
  public static final AdvancedEventPlatformSource NETWORK =
      new AdvancedEventPlatformSource("network");
  public static final AdvancedEventPlatformSource NETWORK_DEVICE_FLOWS =
      new AdvancedEventPlatformSource("network_device_flows");
  public static final AdvancedEventPlatformSource SECURITY_FINDINGS =
      new AdvancedEventPlatformSource("security_findings");
  public static final AdvancedEventPlatformSource SECURITY_SIGNALS =
      new AdvancedEventPlatformSource("security_signals");
  public static final AdvancedEventPlatformSource CI_PIPELINES =
      new AdvancedEventPlatformSource("ci_pipelines");
  public static final AdvancedEventPlatformSource DATABASE_QUERIES =
      new AdvancedEventPlatformSource("database_queries");
  public static final AdvancedEventPlatformSource LLM_OBSERVABILITY =
      new AdvancedEventPlatformSource("llm_observability");
  public static final AdvancedEventPlatformSource AI_USAGE =
      new AdvancedEventPlatformSource("ai_usage");
  public static final AdvancedEventPlatformSource AUDIT = new AdvancedEventPlatformSource("audit");
  public static final AdvancedEventPlatformSource CI_TESTS =
      new AdvancedEventPlatformSource("ci_tests");
  public static final AdvancedEventPlatformSource ERRORS =
      new AdvancedEventPlatformSource("errors");
  public static final AdvancedEventPlatformSource MONITORS =
      new AdvancedEventPlatformSource("monitors");
  public static final AdvancedEventPlatformSource MONITOR_GROUPS =
      new AdvancedEventPlatformSource("monitor_groups");
  public static final AdvancedEventPlatformSource SPANS = new AdvancedEventPlatformSource("spans");
  public static final AdvancedEventPlatformSource SECURITY_RUNTIME =
      new AdvancedEventPlatformSource("security_runtime");
  public static final AdvancedEventPlatformSource SYNTHETICS_MATCHES =
      new AdvancedEventPlatformSource("synthetics_matches");

  AdvancedEventPlatformSource(String value) {
    super(value, allowedValues);
  }

  public static class AdvancedEventPlatformSourceSerializer
      extends StdSerializer<AdvancedEventPlatformSource> {
    public AdvancedEventPlatformSourceSerializer(Class<AdvancedEventPlatformSource> t) {
      super(t);
    }

    public AdvancedEventPlatformSourceSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        AdvancedEventPlatformSource value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static AdvancedEventPlatformSource fromValue(String value) {
    return new AdvancedEventPlatformSource(value);
  }
}
