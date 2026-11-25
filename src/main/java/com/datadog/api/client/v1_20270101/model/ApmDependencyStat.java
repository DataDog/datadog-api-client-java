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
@JsonSerialize(using = ApmDependencyStat.ApmDependencyStatSerializer.class)
public class ApmDependencyStat extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "error_rate",
              "avg_duration",
              "avg_root_duration",
              "avg_spans_per_trace",
              "pct_exec_time",
              "pct_of_traces",
              "total_traces_count"));

  public static final ApmDependencyStat ERROR_RATE = new ApmDependencyStat("error_rate");
  public static final ApmDependencyStat AVG_DURATION = new ApmDependencyStat("avg_duration");
  public static final ApmDependencyStat AVG_ROOT_DURATION =
      new ApmDependencyStat("avg_root_duration");
  public static final ApmDependencyStat AVG_SPANS_PER_TRACE =
      new ApmDependencyStat("avg_spans_per_trace");
  public static final ApmDependencyStat PCT_EXEC_TIME = new ApmDependencyStat("pct_exec_time");
  public static final ApmDependencyStat PCT_OF_TRACES = new ApmDependencyStat("pct_of_traces");
  public static final ApmDependencyStat TOTAL_TRACES_COUNT =
      new ApmDependencyStat("total_traces_count");

  ApmDependencyStat(String value) {
    super(value, allowedValues);
  }

  public static class ApmDependencyStatSerializer extends StdSerializer<ApmDependencyStat> {
    public ApmDependencyStatSerializer(Class<ApmDependencyStat> t) {
      super(t);
    }

    public ApmDependencyStatSerializer() {
      this(null);
    }

    @Override
    public void serialize(ApmDependencyStat value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ApmDependencyStat fromValue(String value) {
    return new ApmDependencyStat(value);
  }
}
