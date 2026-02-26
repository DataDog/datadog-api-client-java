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

/** The type of the buffer that will be configured, a disk buffer. */
@JsonSerialize(
    using =
        ObservabilityPipelineBufferOptionsDiskType
            .ObservabilityPipelineBufferOptionsDiskTypeSerializer.class)
public class ObservabilityPipelineBufferOptionsDiskType extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("disk"));

  public static final ObservabilityPipelineBufferOptionsDiskType DISK =
      new ObservabilityPipelineBufferOptionsDiskType("disk");

  ObservabilityPipelineBufferOptionsDiskType(String value) {
    super(value, allowedValues);
  }

  public static class ObservabilityPipelineBufferOptionsDiskTypeSerializer
      extends StdSerializer<ObservabilityPipelineBufferOptionsDiskType> {
    public ObservabilityPipelineBufferOptionsDiskTypeSerializer(
        Class<ObservabilityPipelineBufferOptionsDiskType> t) {
      super(t);
    }

    public ObservabilityPipelineBufferOptionsDiskTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ObservabilityPipelineBufferOptionsDiskType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ObservabilityPipelineBufferOptionsDiskType fromValue(String value) {
    return new ObservabilityPipelineBufferOptionsDiskType(value);
  }
}
