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
   * <p>The merge strategy to apply.</p>
 */
@JsonSerialize(using = ObservabilityPipelineReduceProcessorMergeStrategyStrategy.ObservabilityPipelineReduceProcessorMergeStrategyStrategySerializer.class)
public class ObservabilityPipelineReduceProcessorMergeStrategyStrategy extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("discard", "retain", "sum", "max", "min", "array", "concat", "concat_newline", "concat_raw", "shortest_array", "longest_array", "flat_unique"));

  public static final ObservabilityPipelineReduceProcessorMergeStrategyStrategy DISCARD = new ObservabilityPipelineReduceProcessorMergeStrategyStrategy("discard");
  public static final ObservabilityPipelineReduceProcessorMergeStrategyStrategy RETAIN = new ObservabilityPipelineReduceProcessorMergeStrategyStrategy("retain");
  public static final ObservabilityPipelineReduceProcessorMergeStrategyStrategy SUM = new ObservabilityPipelineReduceProcessorMergeStrategyStrategy("sum");
  public static final ObservabilityPipelineReduceProcessorMergeStrategyStrategy MAX = new ObservabilityPipelineReduceProcessorMergeStrategyStrategy("max");
  public static final ObservabilityPipelineReduceProcessorMergeStrategyStrategy MIN = new ObservabilityPipelineReduceProcessorMergeStrategyStrategy("min");
  public static final ObservabilityPipelineReduceProcessorMergeStrategyStrategy ARRAY = new ObservabilityPipelineReduceProcessorMergeStrategyStrategy("array");
  public static final ObservabilityPipelineReduceProcessorMergeStrategyStrategy CONCAT = new ObservabilityPipelineReduceProcessorMergeStrategyStrategy("concat");
  public static final ObservabilityPipelineReduceProcessorMergeStrategyStrategy CONCAT_NEWLINE = new ObservabilityPipelineReduceProcessorMergeStrategyStrategy("concat_newline");
  public static final ObservabilityPipelineReduceProcessorMergeStrategyStrategy CONCAT_RAW = new ObservabilityPipelineReduceProcessorMergeStrategyStrategy("concat_raw");
  public static final ObservabilityPipelineReduceProcessorMergeStrategyStrategy SHORTEST_ARRAY = new ObservabilityPipelineReduceProcessorMergeStrategyStrategy("shortest_array");
  public static final ObservabilityPipelineReduceProcessorMergeStrategyStrategy LONGEST_ARRAY = new ObservabilityPipelineReduceProcessorMergeStrategyStrategy("longest_array");
  public static final ObservabilityPipelineReduceProcessorMergeStrategyStrategy FLAT_UNIQUE = new ObservabilityPipelineReduceProcessorMergeStrategyStrategy("flat_unique");


  ObservabilityPipelineReduceProcessorMergeStrategyStrategy(String value) {
    super(value, allowedValues);
  }

  public static class ObservabilityPipelineReduceProcessorMergeStrategyStrategySerializer extends StdSerializer<ObservabilityPipelineReduceProcessorMergeStrategyStrategy> {
      public ObservabilityPipelineReduceProcessorMergeStrategyStrategySerializer(Class<ObservabilityPipelineReduceProcessorMergeStrategyStrategy> t) {
          super(t);
      }

      public ObservabilityPipelineReduceProcessorMergeStrategyStrategySerializer() {
          this(null);
      }

      @Override
      public void serialize(ObservabilityPipelineReduceProcessorMergeStrategyStrategy value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
          jgen.writeObject(value.value);
      }
  }

  @JsonCreator
  public static ObservabilityPipelineReduceProcessorMergeStrategyStrategy fromValue(String value) {
    return new ObservabilityPipelineReduceProcessorMergeStrategyStrategy(value);
  }
}
