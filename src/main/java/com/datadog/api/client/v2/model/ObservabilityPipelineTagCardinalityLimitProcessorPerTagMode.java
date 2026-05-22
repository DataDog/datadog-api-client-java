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
 * How the per-tag override is applied. <code>limit_override</code> enforces a custom limit on the
 * tag; <code>excluded</code> skips the tag from cardinality tracking.
 */
@JsonSerialize(
    using =
        ObservabilityPipelineTagCardinalityLimitProcessorPerTagMode
            .ObservabilityPipelineTagCardinalityLimitProcessorPerTagModeSerializer.class)
public class ObservabilityPipelineTagCardinalityLimitProcessorPerTagMode extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("limit_override", "excluded"));

  public static final ObservabilityPipelineTagCardinalityLimitProcessorPerTagMode LIMIT_OVERRIDE =
      new ObservabilityPipelineTagCardinalityLimitProcessorPerTagMode("limit_override");
  public static final ObservabilityPipelineTagCardinalityLimitProcessorPerTagMode EXCLUDED =
      new ObservabilityPipelineTagCardinalityLimitProcessorPerTagMode("excluded");

  ObservabilityPipelineTagCardinalityLimitProcessorPerTagMode(String value) {
    super(value, allowedValues);
  }

  public static class ObservabilityPipelineTagCardinalityLimitProcessorPerTagModeSerializer
      extends StdSerializer<ObservabilityPipelineTagCardinalityLimitProcessorPerTagMode> {
    public ObservabilityPipelineTagCardinalityLimitProcessorPerTagModeSerializer(
        Class<ObservabilityPipelineTagCardinalityLimitProcessorPerTagMode> t) {
      super(t);
    }

    public ObservabilityPipelineTagCardinalityLimitProcessorPerTagModeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ObservabilityPipelineTagCardinalityLimitProcessorPerTagMode value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ObservabilityPipelineTagCardinalityLimitProcessorPerTagMode fromValue(
      String value) {
    return new ObservabilityPipelineTagCardinalityLimitProcessorPerTagMode(value);
  }
}
