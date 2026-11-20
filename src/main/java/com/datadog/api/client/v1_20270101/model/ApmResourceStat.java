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
@JsonSerialize(using = ApmResourceStat.ApmResourceStatSerializer.class)
public class ApmResourceStat extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "errors",
              "error_rate",
              "latency_avg",
              "latency_max",
              "latency_p50",
              "latency_p75",
              "latency_p90",
              "latency_p95",
              "latency_p99",
              "latency_distribution",
              "hits",
              "total_time"));

  public static final ApmResourceStat ERRORS = new ApmResourceStat("errors");
  public static final ApmResourceStat ERROR_RATE = new ApmResourceStat("error_rate");
  public static final ApmResourceStat LATENCY_AVG = new ApmResourceStat("latency_avg");
  public static final ApmResourceStat LATENCY_MAX = new ApmResourceStat("latency_max");
  public static final ApmResourceStat LATENCY_P50 = new ApmResourceStat("latency_p50");
  public static final ApmResourceStat LATENCY_P75 = new ApmResourceStat("latency_p75");
  public static final ApmResourceStat LATENCY_P90 = new ApmResourceStat("latency_p90");
  public static final ApmResourceStat LATENCY_P95 = new ApmResourceStat("latency_p95");
  public static final ApmResourceStat LATENCY_P99 = new ApmResourceStat("latency_p99");
  public static final ApmResourceStat LATENCY_DISTRIBUTION =
      new ApmResourceStat("latency_distribution");
  public static final ApmResourceStat HITS = new ApmResourceStat("hits");
  public static final ApmResourceStat TOTAL_TIME = new ApmResourceStat("total_time");

  ApmResourceStat(String value) {
    super(value, allowedValues);
  }

  public static class ApmResourceStatSerializer extends StdSerializer<ApmResourceStat> {
    public ApmResourceStatSerializer(Class<ApmResourceStat> t) {
      super(t);
    }

    public ApmResourceStatSerializer() {
      this(null);
    }

    @Override
    public void serialize(ApmResourceStat value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ApmResourceStat fromValue(String value) {
    return new ApmResourceStat(value);
  }
}
