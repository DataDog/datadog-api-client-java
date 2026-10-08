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

/**
 * Determines whether metrics are assigned to aggregation windows based on when they are processed
 * or their timestamps.
 */
@JsonSerialize(
    using =
        ObservabilityPipelineAggregateProcessorAggregationTimingType
            .ObservabilityPipelineAggregateProcessorAggregationTimingTypeSerializer.class)
public class ObservabilityPipelineAggregateProcessorAggregationTimingType
    extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("system_time", "event_time"));

  public static final ObservabilityPipelineAggregateProcessorAggregationTimingType SYSTEM_TIME =
      new ObservabilityPipelineAggregateProcessorAggregationTimingType("system_time");
  public static final ObservabilityPipelineAggregateProcessorAggregationTimingType EVENT_TIME =
      new ObservabilityPipelineAggregateProcessorAggregationTimingType("event_time");

  ObservabilityPipelineAggregateProcessorAggregationTimingType(String value) {
    super(value, allowedValues);
  }

  public static class ObservabilityPipelineAggregateProcessorAggregationTimingTypeSerializer
      extends StdSerializer<ObservabilityPipelineAggregateProcessorAggregationTimingType> {
    public ObservabilityPipelineAggregateProcessorAggregationTimingTypeSerializer(
        Class<ObservabilityPipelineAggregateProcessorAggregationTimingType> t) {
      super(t);
    }

    public ObservabilityPipelineAggregateProcessorAggregationTimingTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ObservabilityPipelineAggregateProcessorAggregationTimingType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ObservabilityPipelineAggregateProcessorAggregationTimingType fromValue(
      String value) {
    return new ObservabilityPipelineAggregateProcessorAggregationTimingType(value);
  }
}
