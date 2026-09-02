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

/** The APM dependency statistic to query. */
@JsonSerialize(using = ApmDependencyStatName.ApmDependencyStatNameSerializer.class)
public class ApmDependencyStatName extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "avg_duration",
              "avg_root_duration",
              "avg_spans_per_trace",
              "error_rate",
              "pct_exec_time",
              "pct_of_traces",
              "total_traces_count"));

  public static final ApmDependencyStatName AVG_DURATION =
      new ApmDependencyStatName("avg_duration");
  public static final ApmDependencyStatName AVG_ROOT_DURATION =
      new ApmDependencyStatName("avg_root_duration");
  public static final ApmDependencyStatName AVG_SPANS_PER_TRACE =
      new ApmDependencyStatName("avg_spans_per_trace");
  public static final ApmDependencyStatName ERROR_RATE = new ApmDependencyStatName("error_rate");
  public static final ApmDependencyStatName PCT_EXEC_TIME =
      new ApmDependencyStatName("pct_exec_time");
  public static final ApmDependencyStatName PCT_OF_TRACES =
      new ApmDependencyStatName("pct_of_traces");
  public static final ApmDependencyStatName TOTAL_TRACES_COUNT =
      new ApmDependencyStatName("total_traces_count");

  ApmDependencyStatName(String value) {
    super(value, allowedValues);
  }

  public static class ApmDependencyStatNameSerializer extends StdSerializer<ApmDependencyStatName> {
    public ApmDependencyStatNameSerializer(Class<ApmDependencyStatName> t) {
      super(t);
    }

    public ApmDependencyStatNameSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ApmDependencyStatName value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ApmDependencyStatName fromValue(String value) {
    return new ApmDependencyStatName(value);
  }
}
