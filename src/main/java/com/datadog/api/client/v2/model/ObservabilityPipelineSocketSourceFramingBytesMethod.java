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
 * Byte frames are passed through as-is according to the underlying I/O boundaries (for example,
 * split between messages or stream segments).
 */
@JsonSerialize(
    using =
        ObservabilityPipelineSocketSourceFramingBytesMethod
            .ObservabilityPipelineSocketSourceFramingBytesMethodSerializer.class)
public class ObservabilityPipelineSocketSourceFramingBytesMethod extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("bytes"));

  public static final ObservabilityPipelineSocketSourceFramingBytesMethod BYTES =
      new ObservabilityPipelineSocketSourceFramingBytesMethod("bytes");

  ObservabilityPipelineSocketSourceFramingBytesMethod(String value) {
    super(value, allowedValues);
  }

  public static class ObservabilityPipelineSocketSourceFramingBytesMethodSerializer
      extends StdSerializer<ObservabilityPipelineSocketSourceFramingBytesMethod> {
    public ObservabilityPipelineSocketSourceFramingBytesMethodSerializer(
        Class<ObservabilityPipelineSocketSourceFramingBytesMethod> t) {
      super(t);
    }

    public ObservabilityPipelineSocketSourceFramingBytesMethodSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ObservabilityPipelineSocketSourceFramingBytesMethod value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ObservabilityPipelineSocketSourceFramingBytesMethod fromValue(String value) {
    return new ObservabilityPipelineSocketSourceFramingBytesMethod(value);
  }
}
