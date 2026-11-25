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
@JsonSerialize(using = ContextMenuLinkLabel.ContextMenuLinkLabelSerializer.class)
public class ContextMenuLinkLabel extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "events",
              "logs",
              "rum",
              "product_analytics",
              "network",
              "cloud_cost",
              "functions",
              "hosts",
              "traces",
              "profiles",
              "processes",
              "containers",
              "change_tracking",
              "audit_trail",
              "network_device_flows",
              "devices",
              "recommendations",
              "security_findings",
              "security_signals",
              "security_traces",
              "incidents",
              "cases",
              "metrics_summary",
              "pods",
              "ci_pipelines",
              "database_queries",
              "watch_sessions",
              "gpu_monitoring",
              "llm_observability"));

  public static final ContextMenuLinkLabel EVENTS = new ContextMenuLinkLabel("events");
  public static final ContextMenuLinkLabel LOGS = new ContextMenuLinkLabel("logs");
  public static final ContextMenuLinkLabel RUM = new ContextMenuLinkLabel("rum");
  public static final ContextMenuLinkLabel PRODUCT_ANALYTICS =
      new ContextMenuLinkLabel("product_analytics");
  public static final ContextMenuLinkLabel NETWORK = new ContextMenuLinkLabel("network");
  public static final ContextMenuLinkLabel CLOUD_COST = new ContextMenuLinkLabel("cloud_cost");
  public static final ContextMenuLinkLabel FUNCTIONS = new ContextMenuLinkLabel("functions");
  public static final ContextMenuLinkLabel HOSTS = new ContextMenuLinkLabel("hosts");
  public static final ContextMenuLinkLabel TRACES = new ContextMenuLinkLabel("traces");
  public static final ContextMenuLinkLabel PROFILES = new ContextMenuLinkLabel("profiles");
  public static final ContextMenuLinkLabel PROCESSES = new ContextMenuLinkLabel("processes");
  public static final ContextMenuLinkLabel CONTAINERS = new ContextMenuLinkLabel("containers");
  public static final ContextMenuLinkLabel CHANGE_TRACKING =
      new ContextMenuLinkLabel("change_tracking");
  public static final ContextMenuLinkLabel AUDIT_TRAIL = new ContextMenuLinkLabel("audit_trail");
  public static final ContextMenuLinkLabel NETWORK_DEVICE_FLOWS =
      new ContextMenuLinkLabel("network_device_flows");
  public static final ContextMenuLinkLabel DEVICES = new ContextMenuLinkLabel("devices");
  public static final ContextMenuLinkLabel RECOMMENDATIONS =
      new ContextMenuLinkLabel("recommendations");
  public static final ContextMenuLinkLabel SECURITY_FINDINGS =
      new ContextMenuLinkLabel("security_findings");
  public static final ContextMenuLinkLabel SECURITY_SIGNALS =
      new ContextMenuLinkLabel("security_signals");
  public static final ContextMenuLinkLabel SECURITY_TRACES =
      new ContextMenuLinkLabel("security_traces");
  public static final ContextMenuLinkLabel INCIDENTS = new ContextMenuLinkLabel("incidents");
  public static final ContextMenuLinkLabel CASES = new ContextMenuLinkLabel("cases");
  public static final ContextMenuLinkLabel METRICS_SUMMARY =
      new ContextMenuLinkLabel("metrics_summary");
  public static final ContextMenuLinkLabel PODS = new ContextMenuLinkLabel("pods");
  public static final ContextMenuLinkLabel CI_PIPELINES = new ContextMenuLinkLabel("ci_pipelines");
  public static final ContextMenuLinkLabel DATABASE_QUERIES =
      new ContextMenuLinkLabel("database_queries");
  public static final ContextMenuLinkLabel WATCH_SESSIONS =
      new ContextMenuLinkLabel("watch_sessions");
  public static final ContextMenuLinkLabel GPU_MONITORING =
      new ContextMenuLinkLabel("gpu_monitoring");
  public static final ContextMenuLinkLabel LLM_OBSERVABILITY =
      new ContextMenuLinkLabel("llm_observability");

  ContextMenuLinkLabel(String value) {
    super(value, allowedValues);
  }

  public static class ContextMenuLinkLabelSerializer extends StdSerializer<ContextMenuLinkLabel> {
    public ContextMenuLinkLabelSerializer(Class<ContextMenuLinkLabel> t) {
      super(t);
    }

    public ContextMenuLinkLabelSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ContextMenuLinkLabel value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ContextMenuLinkLabel fromValue(String value) {
    return new ContextMenuLinkLabel(value);
  }
}
