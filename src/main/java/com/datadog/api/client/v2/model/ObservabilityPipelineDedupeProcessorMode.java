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

/** The deduplication mode to apply to the fields. */
@JsonSerialize(
    using =
        ObservabilityPipelineDedupeProcessorMode.ObservabilityPipelineDedupeProcessorModeSerializer
            .class)
public class ObservabilityPipelineDedupeProcessorMode extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("match", "ignore"));

  public static final ObservabilityPipelineDedupeProcessorMode MATCH =
      new ObservabilityPipelineDedupeProcessorMode("match");
  public static final ObservabilityPipelineDedupeProcessorMode IGNORE =
      new ObservabilityPipelineDedupeProcessorMode("ignore");

  ObservabilityPipelineDedupeProcessorMode(String value) {
    super(value, allowedValues);
  }

  public static class ObservabilityPipelineDedupeProcessorModeSerializer
      extends StdSerializer<ObservabilityPipelineDedupeProcessorMode> {
    public ObservabilityPipelineDedupeProcessorModeSerializer(
        Class<ObservabilityPipelineDedupeProcessorMode> t) {
      super(t);
    }

    public ObservabilityPipelineDedupeProcessorModeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ObservabilityPipelineDedupeProcessorMode value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ObservabilityPipelineDedupeProcessorMode fromValue(String value) {
    return new ObservabilityPipelineDedupeProcessorMode(value);
  }
}
