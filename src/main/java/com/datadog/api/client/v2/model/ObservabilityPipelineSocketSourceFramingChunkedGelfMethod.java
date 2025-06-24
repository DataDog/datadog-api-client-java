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

/** Byte frames which are chunked GELF messages. */
@JsonSerialize(
    using =
        ObservabilityPipelineSocketSourceFramingChunkedGelfMethod
            .ObservabilityPipelineSocketSourceFramingChunkedGelfMethodSerializer.class)
public class ObservabilityPipelineSocketSourceFramingChunkedGelfMethod extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("chunked_gelf"));

  public static final ObservabilityPipelineSocketSourceFramingChunkedGelfMethod CHUNKED_GELF =
      new ObservabilityPipelineSocketSourceFramingChunkedGelfMethod("chunked_gelf");

  ObservabilityPipelineSocketSourceFramingChunkedGelfMethod(String value) {
    super(value, allowedValues);
  }

  public static class ObservabilityPipelineSocketSourceFramingChunkedGelfMethodSerializer
      extends StdSerializer<ObservabilityPipelineSocketSourceFramingChunkedGelfMethod> {
    public ObservabilityPipelineSocketSourceFramingChunkedGelfMethodSerializer(
        Class<ObservabilityPipelineSocketSourceFramingChunkedGelfMethod> t) {
      super(t);
    }

    public ObservabilityPipelineSocketSourceFramingChunkedGelfMethodSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ObservabilityPipelineSocketSourceFramingChunkedGelfMethod value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ObservabilityPipelineSocketSourceFramingChunkedGelfMethod fromValue(String value) {
    return new ObservabilityPipelineSocketSourceFramingChunkedGelfMethod(value);
  }
}
