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

/** The APM resource statistic to query. */
@JsonSerialize(using = ApmResourceStatName.ApmResourceStatNameSerializer.class)
public class ApmResourceStatName extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "error_rate",
              "errors",
              "hits",
              "latency_avg",
              "latency_max",
              "latency_p50",
              "latency_p75",
              "latency_p90",
              "latency_p95",
              "latency_p99",
              "latency_distribution",
              "total_time"));

  public static final ApmResourceStatName ERROR_RATE = new ApmResourceStatName("error_rate");
  public static final ApmResourceStatName ERRORS = new ApmResourceStatName("errors");
  public static final ApmResourceStatName HITS = new ApmResourceStatName("hits");
  public static final ApmResourceStatName LATENCY_AVG = new ApmResourceStatName("latency_avg");
  public static final ApmResourceStatName LATENCY_MAX = new ApmResourceStatName("latency_max");
  public static final ApmResourceStatName LATENCY_P50 = new ApmResourceStatName("latency_p50");
  public static final ApmResourceStatName LATENCY_P75 = new ApmResourceStatName("latency_p75");
  public static final ApmResourceStatName LATENCY_P90 = new ApmResourceStatName("latency_p90");
  public static final ApmResourceStatName LATENCY_P95 = new ApmResourceStatName("latency_p95");
  public static final ApmResourceStatName LATENCY_P99 = new ApmResourceStatName("latency_p99");
  public static final ApmResourceStatName LATENCY_DISTRIBUTION =
      new ApmResourceStatName("latency_distribution");
  public static final ApmResourceStatName TOTAL_TIME = new ApmResourceStatName("total_time");

  ApmResourceStatName(String value) {
    super(value, allowedValues);
  }

  public static class ApmResourceStatNameSerializer extends StdSerializer<ApmResourceStatName> {
    public ApmResourceStatNameSerializer(Class<ApmResourceStatName> t) {
      super(t);
    }

    public ApmResourceStatNameSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ApmResourceStatName value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ApmResourceStatName fromValue(String value) {
    return new ApmResourceStatName(value);
  }
}
