/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

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

/** A data source that is powered by the Events Platform. */
@JsonSerialize(using = EventsDataSource.EventsDataSourceSerializer.class)
public class EventsDataSource extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "logs",
              "spans",
              "network",
              "rum",
              "security_signals",
              "profiles",
              "audit",
              "events",
              "ci_tests",
              "ci_pipelines",
              "incident_analytics",
              "product_analytics",
              "on_call_events",
              "dora"));

  public static final EventsDataSource LOGS = new EventsDataSource("logs");
  public static final EventsDataSource SPANS = new EventsDataSource("spans");
  public static final EventsDataSource NETWORK = new EventsDataSource("network");
  public static final EventsDataSource RUM = new EventsDataSource("rum");
  public static final EventsDataSource SECURITY_SIGNALS = new EventsDataSource("security_signals");
  public static final EventsDataSource PROFILES = new EventsDataSource("profiles");
  public static final EventsDataSource AUDIT = new EventsDataSource("audit");
  public static final EventsDataSource EVENTS = new EventsDataSource("events");
  public static final EventsDataSource CI_TESTS = new EventsDataSource("ci_tests");
  public static final EventsDataSource CI_PIPELINES = new EventsDataSource("ci_pipelines");
  public static final EventsDataSource INCIDENT_ANALYTICS =
      new EventsDataSource("incident_analytics");
  public static final EventsDataSource PRODUCT_ANALYTICS =
      new EventsDataSource("product_analytics");
  public static final EventsDataSource ON_CALL_EVENTS = new EventsDataSource("on_call_events");
  public static final EventsDataSource DORA = new EventsDataSource("dora");

  EventsDataSource(String value) {
    super(value, allowedValues);
  }

  public static class EventsDataSourceSerializer extends StdSerializer<EventsDataSource> {
    public EventsDataSourceSerializer(Class<EventsDataSource> t) {
      super(t);
    }

    public EventsDataSourceSerializer() {
      this(null);
    }

    @Override
    public void serialize(EventsDataSource value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static EventsDataSource fromValue(String value) {
    return new EventsDataSource(value);
  }
}
