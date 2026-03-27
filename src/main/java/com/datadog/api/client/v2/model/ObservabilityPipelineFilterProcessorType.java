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

/** The processor type. The value should always be <code>filter</code>. */
@JsonSerialize(
    using =
        ObservabilityPipelineFilterProcessorType.ObservabilityPipelineFilterProcessorTypeSerializer
            .class)
public class ObservabilityPipelineFilterProcessorType extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("filter"));

  public static final ObservabilityPipelineFilterProcessorType FILTER =
      new ObservabilityPipelineFilterProcessorType("filter");

  ObservabilityPipelineFilterProcessorType(String value) {
    super(value, allowedValues);
  }

  public static class ObservabilityPipelineFilterProcessorTypeSerializer
      extends StdSerializer<ObservabilityPipelineFilterProcessorType> {
    public ObservabilityPipelineFilterProcessorTypeSerializer(
        Class<ObservabilityPipelineFilterProcessorType> t) {
      super(t);
    }

    public ObservabilityPipelineFilterProcessorTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ObservabilityPipelineFilterProcessorType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ObservabilityPipelineFilterProcessorType fromValue(String value) {
    return new ObservabilityPipelineFilterProcessorType(value);
  }
}
