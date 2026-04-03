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

/** The APM metric statistic to query. */
@JsonSerialize(using = ApmMetricsStat.ApmMetricsStatSerializer.class)
public class ApmMetricsStat extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "error_rate",
              "errors",
              "errors_per_second",
              "hits",
              "hits_per_second",
              "apdex",
              "latency_avg",
              "latency_max",
              "latency_p50",
              "latency_p75",
              "latency_p90",
              "latency_p95",
              "latency_p99",
              "latency_p999",
              "latency_distribution",
              "total_time"));

  public static final ApmMetricsStat ERROR_RATE = new ApmMetricsStat("error_rate");
  public static final ApmMetricsStat ERRORS = new ApmMetricsStat("errors");
  public static final ApmMetricsStat ERRORS_PER_SECOND = new ApmMetricsStat("errors_per_second");
  public static final ApmMetricsStat HITS = new ApmMetricsStat("hits");
  public static final ApmMetricsStat HITS_PER_SECOND = new ApmMetricsStat("hits_per_second");
  public static final ApmMetricsStat APDEX = new ApmMetricsStat("apdex");
  public static final ApmMetricsStat LATENCY_AVG = new ApmMetricsStat("latency_avg");
  public static final ApmMetricsStat LATENCY_MAX = new ApmMetricsStat("latency_max");
  public static final ApmMetricsStat LATENCY_P50 = new ApmMetricsStat("latency_p50");
  public static final ApmMetricsStat LATENCY_P75 = new ApmMetricsStat("latency_p75");
  public static final ApmMetricsStat LATENCY_P90 = new ApmMetricsStat("latency_p90");
  public static final ApmMetricsStat LATENCY_P95 = new ApmMetricsStat("latency_p95");
  public static final ApmMetricsStat LATENCY_P99 = new ApmMetricsStat("latency_p99");
  public static final ApmMetricsStat LATENCY_P999 = new ApmMetricsStat("latency_p999");
  public static final ApmMetricsStat LATENCY_DISTRIBUTION =
      new ApmMetricsStat("latency_distribution");
  public static final ApmMetricsStat TOTAL_TIME = new ApmMetricsStat("total_time");

  ApmMetricsStat(String value) {
    super(value, allowedValues);
  }

  public static class ApmMetricsStatSerializer extends StdSerializer<ApmMetricsStat> {
    public ApmMetricsStatSerializer(Class<ApmMetricsStat> t) {
      super(t);
    }

    public ApmMetricsStatSerializer() {
      this(null);
    }

    @Override
    public void serialize(ApmMetricsStat value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ApmMetricsStat fromValue(String value) {
    return new ApmMetricsStat(value);
  }
}
