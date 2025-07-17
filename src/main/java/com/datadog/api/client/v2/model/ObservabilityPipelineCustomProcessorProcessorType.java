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

/** The processor type. The value should always be <code>custom_processor</code>. */
@JsonSerialize(
    using =
        ObservabilityPipelineCustomProcessorProcessorType
            .ObservabilityPipelineCustomProcessorProcessorTypeSerializer.class)
public class ObservabilityPipelineCustomProcessorProcessorType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("custom_processor"));

  public static final ObservabilityPipelineCustomProcessorProcessorType CUSTOM_PROCESSOR =
      new ObservabilityPipelineCustomProcessorProcessorType("custom_processor");

  ObservabilityPipelineCustomProcessorProcessorType(String value) {
    super(value, allowedValues);
  }

  public static class ObservabilityPipelineCustomProcessorProcessorTypeSerializer
      extends StdSerializer<ObservabilityPipelineCustomProcessorProcessorType> {
    public ObservabilityPipelineCustomProcessorProcessorTypeSerializer(
        Class<ObservabilityPipelineCustomProcessorProcessorType> t) {
      super(t);
    }

    public ObservabilityPipelineCustomProcessorProcessorTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ObservabilityPipelineCustomProcessorProcessorType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ObservabilityPipelineCustomProcessorProcessorType fromValue(String value) {
    return new ObservabilityPipelineCustomProcessorProcessorType(value);
  }
}
