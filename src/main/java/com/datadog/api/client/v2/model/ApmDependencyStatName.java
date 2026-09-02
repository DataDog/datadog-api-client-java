/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.UUID;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.openapitools.jackson.nullable.JsonNullable;

import com.datadog.api.client.JsonTimeSerializer;

import com.datadog.api.client.ModelEnum;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;

import java.util.Set;
import java.util.HashSet;

/**
   * <p>The APM dependency statistic to query.</p>
 */
@JsonSerialize(using = ApmDependencyStatName.ApmDependencyStatNameSerializer.class)
public class ApmDependencyStatName extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("avg_duration", "avg_root_duration", "avg_spans_per_trace", "error_rate", "pct_exec_time", "pct_of_traces", "total_traces_count"));

  public static final ApmDependencyStatName AVG_DURATION = new ApmDependencyStatName("avg_duration");
  public static final ApmDependencyStatName AVG_ROOT_DURATION = new ApmDependencyStatName("avg_root_duration");
  public static final ApmDependencyStatName AVG_SPANS_PER_TRACE = new ApmDependencyStatName("avg_spans_per_trace");
  public static final ApmDependencyStatName ERROR_RATE = new ApmDependencyStatName("error_rate");
  public static final ApmDependencyStatName PCT_EXEC_TIME = new ApmDependencyStatName("pct_exec_time");
  public static final ApmDependencyStatName PCT_OF_TRACES = new ApmDependencyStatName("pct_of_traces");
  public static final ApmDependencyStatName TOTAL_TRACES_COUNT = new ApmDependencyStatName("total_traces_count");


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
      public void serialize(ApmDependencyStatName value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
          jgen.writeObject(value.value);
      }
  }

  @JsonCreator
  public static ApmDependencyStatName fromValue(String value) {
    return new ApmDependencyStatName(value);
  }
}
