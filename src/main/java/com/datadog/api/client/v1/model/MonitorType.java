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
 * The type of the monitor. For more information about <code>type</code>, see the <a
 * href="https://docs.datadoghq.com/monitors/guide/monitor_api_options/">monitor options</a> docs.
 */
@JsonSerialize(using = MonitorType.MonitorTypeSerializer.class)
public class MonitorType extends ModelEnum<String> {

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
              "error-tracking alert",
              "database-monitoring alert",
              "network-performance alert",
              "cost alert",
              "data-quality alert",
              "network-path alert"));

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
  public static final MonitorType DATABASE_MONITORING_ALERT =
      new MonitorType("database-monitoring alert");
  public static final MonitorType NETWORK_PERFORMANCE_ALERT =
      new MonitorType("network-performance alert");
  public static final MonitorType COST_ALERT = new MonitorType("cost alert");
  public static final MonitorType DATA_QUALITY_ALERT = new MonitorType("data-quality alert");
  public static final MonitorType NETWORK_PATH_ALERT = new MonitorType("network-path alert");

  MonitorType(String value) {
    super(value, allowedValues);
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

  @JsonCreator
  public static MonitorType fromValue(String value) {
    return new MonitorType(value);
  }
}
