/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * The type of the monitor. For more information about <code>type</code>, see the <a
 * href="https://docs.datadoghq.com/monitors/guide/monitor_api_options/">monitor options</a> docs.
 */
@JsonSerialize(using = MonitorType.MonitorTypeSerializer.class)
public class MonitorType {

  public static final MonitorType COMPOSITE = new MonitorType("composite");
  public static final MonitorType EVENT_ALERT = new MonitorType("event alert");
  public static final MonitorType LOG_ALERT = new MonitorType("log alert");
  public static final MonitorType METRIC_ALERT = new MonitorType("metric alert");
  public static final MonitorType PROCESS_ALERT = new MonitorType("process alert");
  public static final MonitorType QUERY_ALERT = new MonitorType("query alert");
  public static final MonitorType RUM_ALERT = new MonitorType("rum alert");
  public static final MonitorType SERVICE_CHECK = new MonitorType("service check");
  public static final MonitorType SYNTHETICS_ALERT = new MonitorType("synthetics alert");
  public static final MonitorType TRACE_ANALYTICS_ALERT = new MonitorType("trace-analytics alert");
  public static final MonitorType SLO_ALERT = new MonitorType("slo alert");
  public static final MonitorType EVENT_V2_ALERT = new MonitorType("event-v2 alert");
  public static final MonitorType AUDIT_ALERT = new MonitorType("audit alert");
  public static final MonitorType CI_PIPELINES_ALERT = new MonitorType("ci-pipelines alert");
  public static final MonitorType CI_TESTS_ALERT = new MonitorType("ci-tests alert");
  public static final MonitorType ERROR_TRACKING_ALERT = new MonitorType("error-tracking alert");

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "composite",
              "event alert",
              "log alert",
              "metric alert",
              "process alert",
              "query alert",
              "rum alert",
              "service check",
              "synthetics alert",
              "trace-analytics alert",
              "slo alert",
              "event-v2 alert",
              "audit alert",
              "ci-pipelines alert",
              "ci-tests alert",
              "error-tracking alert"));

  private String value;

  public boolean isValid() {
    return allowedValues.contains(this.value);
  }

  MonitorType(String value) {
    this.value = value;
  }

  public static class MonitorTypeSerializer extends StdSerializer<MonitorType> {
    public MonitorTypeSerializer(Class<MonitorType> t) {
      super(t);
    }

    public MonitorTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(MonitorType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonValue
  public String getValue() {
    return this.value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  /** Return true if this MonitorType object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return this.value.equals(((MonitorType) o).value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value);
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static MonitorType fromValue(String value) {
    return new MonitorType(value);
  }
}