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

/** Uses a numeric field in the log event as the metric increment. */
@JsonSerialize(
    using =
        ObservabilityPipelineGeneratedMetricIncrementByFieldStrategy
            .ObservabilityPipelineGeneratedMetricIncrementByFieldStrategySerializer.class)
public class ObservabilityPipelineGeneratedMetricIncrementByFieldStrategy
    extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("increment_by_field"));

  public static final ObservabilityPipelineGeneratedMetricIncrementByFieldStrategy
      INCREMENT_BY_FIELD =
          new ObservabilityPipelineGeneratedMetricIncrementByFieldStrategy("increment_by_field");

  ObservabilityPipelineGeneratedMetricIncrementByFieldStrategy(String value) {
    super(value, allowedValues);
  }

  public static class ObservabilityPipelineGeneratedMetricIncrementByFieldStrategySerializer
      extends StdSerializer<ObservabilityPipelineGeneratedMetricIncrementByFieldStrategy> {
    public ObservabilityPipelineGeneratedMetricIncrementByFieldStrategySerializer(
        Class<ObservabilityPipelineGeneratedMetricIncrementByFieldStrategy> t) {
      super(t);
    }

    public ObservabilityPipelineGeneratedMetricIncrementByFieldStrategySerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ObservabilityPipelineGeneratedMetricIncrementByFieldStrategy value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ObservabilityPipelineGeneratedMetricIncrementByFieldStrategy fromValue(
      String value) {
    return new ObservabilityPipelineGeneratedMetricIncrementByFieldStrategy(value);
  }
}
