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

/** Increments the metric by 1 for each matching event. */
@JsonSerialize(
    using =
        ObservabilityPipelineGeneratedMetricIncrementByOneStrategy
            .ObservabilityPipelineGeneratedMetricIncrementByOneStrategySerializer.class)
public class ObservabilityPipelineGeneratedMetricIncrementByOneStrategy extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("increment_by_one"));

  public static final ObservabilityPipelineGeneratedMetricIncrementByOneStrategy INCREMENT_BY_ONE =
      new ObservabilityPipelineGeneratedMetricIncrementByOneStrategy("increment_by_one");

  ObservabilityPipelineGeneratedMetricIncrementByOneStrategy(String value) {
    super(value, allowedValues);
  }

  public static class ObservabilityPipelineGeneratedMetricIncrementByOneStrategySerializer
      extends StdSerializer<ObservabilityPipelineGeneratedMetricIncrementByOneStrategy> {
    public ObservabilityPipelineGeneratedMetricIncrementByOneStrategySerializer(
        Class<ObservabilityPipelineGeneratedMetricIncrementByOneStrategy> t) {
      super(t);
    }

    public ObservabilityPipelineGeneratedMetricIncrementByOneStrategySerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ObservabilityPipelineGeneratedMetricIncrementByOneStrategy value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ObservabilityPipelineGeneratedMetricIncrementByOneStrategy fromValue(String value) {
    return new ObservabilityPipelineGeneratedMetricIncrementByOneStrategy(value);
  }
}
