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
@JsonSerialize(using = ApmMetricStat.ApmMetricStatSerializer.class)
public class ApmMetricStat extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "errors",
              "error_rate",
              "errors_per_second",
              "latency_avg",
              "latency_max",
              "latency_p50",
              "latency_p75",
              "latency_p90",
              "latency_p95",
              "latency_p99",
              "latency_p999",
              "latency_distribution",
              "hits",
              "hits_per_second",
              "total_time",
              "apdex"));

  public static final ApmMetricStat ERRORS = new ApmMetricStat("errors");
  public static final ApmMetricStat ERROR_RATE = new ApmMetricStat("error_rate");
  public static final ApmMetricStat ERRORS_PER_SECOND = new ApmMetricStat("errors_per_second");
  public static final ApmMetricStat LATENCY_AVG = new ApmMetricStat("latency_avg");
  public static final ApmMetricStat LATENCY_MAX = new ApmMetricStat("latency_max");
  public static final ApmMetricStat LATENCY_P50 = new ApmMetricStat("latency_p50");
  public static final ApmMetricStat LATENCY_P75 = new ApmMetricStat("latency_p75");
  public static final ApmMetricStat LATENCY_P90 = new ApmMetricStat("latency_p90");
  public static final ApmMetricStat LATENCY_P95 = new ApmMetricStat("latency_p95");
  public static final ApmMetricStat LATENCY_P99 = new ApmMetricStat("latency_p99");
  public static final ApmMetricStat LATENCY_P999 = new ApmMetricStat("latency_p999");
  public static final ApmMetricStat LATENCY_DISTRIBUTION =
      new ApmMetricStat("latency_distribution");
  public static final ApmMetricStat HITS = new ApmMetricStat("hits");
  public static final ApmMetricStat HITS_PER_SECOND = new ApmMetricStat("hits_per_second");
  public static final ApmMetricStat TOTAL_TIME = new ApmMetricStat("total_time");
  public static final ApmMetricStat APDEX = new ApmMetricStat("apdex");

  ApmMetricStat(String value) {
    super(value, allowedValues);
  }

  public static class ApmMetricStatSerializer extends StdSerializer<ApmMetricStat> {
    public ApmMetricStatSerializer(Class<ApmMetricStat> t) {
      super(t);
    }

    public ApmMetricStatSerializer() {
      this(null);
    }

    @Override
    public void serialize(ApmMetricStat value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ApmMetricStat fromValue(String value) {
    return new ApmMetricStat(value);
  }
}
