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

/** Behavior when the buffer is full (block and stop accepting new events, or drop new events) */
@JsonSerialize(
    using =
        ObservabilityPipelineBufferOptionsWhenFull
            .ObservabilityPipelineBufferOptionsWhenFullSerializer.class)
public class ObservabilityPipelineBufferOptionsWhenFull extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("block", "drop_newest"));

  public static final ObservabilityPipelineBufferOptionsWhenFull BLOCK =
      new ObservabilityPipelineBufferOptionsWhenFull("block");
  public static final ObservabilityPipelineBufferOptionsWhenFull DROP_NEWEST =
      new ObservabilityPipelineBufferOptionsWhenFull("drop_newest");

  ObservabilityPipelineBufferOptionsWhenFull(String value) {
    super(value, allowedValues);
  }

  public static class ObservabilityPipelineBufferOptionsWhenFullSerializer
      extends StdSerializer<ObservabilityPipelineBufferOptionsWhenFull> {
    public ObservabilityPipelineBufferOptionsWhenFullSerializer(
        Class<ObservabilityPipelineBufferOptionsWhenFull> t) {
      super(t);
    }

    public ObservabilityPipelineBufferOptionsWhenFullSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ObservabilityPipelineBufferOptionsWhenFull value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ObservabilityPipelineBufferOptionsWhenFull fromValue(String value) {
    return new ObservabilityPipelineBufferOptionsWhenFull(value);
  }
}
