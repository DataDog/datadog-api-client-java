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
        EventsQueryFragmentDefinitionDataSource.EventsQueryFragmentDefinitionDataSourceSerializer
            .class)
public class EventsQueryFragmentDefinitionDataSource extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "events",
              "logs",
              "rum",
              "synthetics_test_runs",
              "product_analytics",
              "network_device_flows",
              "ci_pipelines",
              "database_queries",
              "llm_observability",
              "audit",
              "ci_tests",
              "spans"));

  public static final EventsQueryFragmentDefinitionDataSource EVENTS =
      new EventsQueryFragmentDefinitionDataSource("events");
  public static final EventsQueryFragmentDefinitionDataSource LOGS =
      new EventsQueryFragmentDefinitionDataSource("logs");
  public static final EventsQueryFragmentDefinitionDataSource RUM =
      new EventsQueryFragmentDefinitionDataSource("rum");
  public static final EventsQueryFragmentDefinitionDataSource SYNTHETICS_TEST_RUNS =
      new EventsQueryFragmentDefinitionDataSource("synthetics_test_runs");
  public static final EventsQueryFragmentDefinitionDataSource PRODUCT_ANALYTICS =
      new EventsQueryFragmentDefinitionDataSource("product_analytics");
  public static final EventsQueryFragmentDefinitionDataSource NETWORK_DEVICE_FLOWS =
      new EventsQueryFragmentDefinitionDataSource("network_device_flows");
  public static final EventsQueryFragmentDefinitionDataSource CI_PIPELINES =
      new EventsQueryFragmentDefinitionDataSource("ci_pipelines");
  public static final EventsQueryFragmentDefinitionDataSource DATABASE_QUERIES =
      new EventsQueryFragmentDefinitionDataSource("database_queries");
  public static final EventsQueryFragmentDefinitionDataSource LLM_OBSERVABILITY =
      new EventsQueryFragmentDefinitionDataSource("llm_observability");
  public static final EventsQueryFragmentDefinitionDataSource AUDIT =
      new EventsQueryFragmentDefinitionDataSource("audit");
  public static final EventsQueryFragmentDefinitionDataSource CI_TESTS =
      new EventsQueryFragmentDefinitionDataSource("ci_tests");
  public static final EventsQueryFragmentDefinitionDataSource SPANS =
      new EventsQueryFragmentDefinitionDataSource("spans");

  EventsQueryFragmentDefinitionDataSource(String value) {
    super(value, allowedValues);
  }

  public static class EventsQueryFragmentDefinitionDataSourceSerializer
      extends StdSerializer<EventsQueryFragmentDefinitionDataSource> {
    public EventsQueryFragmentDefinitionDataSourceSerializer(
        Class<EventsQueryFragmentDefinitionDataSource> t) {
      super(t);
    }

    public EventsQueryFragmentDefinitionDataSourceSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        EventsQueryFragmentDefinitionDataSource value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static EventsQueryFragmentDefinitionDataSource fromValue(String value) {
    return new EventsQueryFragmentDefinitionDataSource(value);
  }
}
