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
 * The aggregation mode applied to metrics that share the same name and tags within the interval.
 */
@JsonSerialize(
    using =
        ObservabilityPipelineAggregateProcessorMode
            .ObservabilityPipelineAggregateProcessorModeSerializer.class)
public class ObservabilityPipelineAggregateProcessorMode extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("auto", "sum", "latest", "count", "max", "min", "mean"));

  public static final ObservabilityPipelineAggregateProcessorMode AUTO =
      new ObservabilityPipelineAggregateProcessorMode("auto");
  public static final ObservabilityPipelineAggregateProcessorMode SUM =
      new ObservabilityPipelineAggregateProcessorMode("sum");
  public static final ObservabilityPipelineAggregateProcessorMode LATEST =
      new ObservabilityPipelineAggregateProcessorMode("latest");
  public static final ObservabilityPipelineAggregateProcessorMode COUNT =
      new ObservabilityPipelineAggregateProcessorMode("count");
  public static final ObservabilityPipelineAggregateProcessorMode MAX =
      new ObservabilityPipelineAggregateProcessorMode("max");
  public static final ObservabilityPipelineAggregateProcessorMode MIN =
      new ObservabilityPipelineAggregateProcessorMode("min");
  public static final ObservabilityPipelineAggregateProcessorMode MEAN =
      new ObservabilityPipelineAggregateProcessorMode("mean");

  ObservabilityPipelineAggregateProcessorMode(String value) {
    super(value, allowedValues);
  }

  public static class ObservabilityPipelineAggregateProcessorModeSerializer
      extends StdSerializer<ObservabilityPipelineAggregateProcessorMode> {
    public ObservabilityPipelineAggregateProcessorModeSerializer(
        Class<ObservabilityPipelineAggregateProcessorMode> t) {
      super(t);
    }

    public ObservabilityPipelineAggregateProcessorModeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ObservabilityPipelineAggregateProcessorMode value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ObservabilityPipelineAggregateProcessorMode fromValue(String value) {
    return new ObservabilityPipelineAggregateProcessorMode(value);
  }
}
