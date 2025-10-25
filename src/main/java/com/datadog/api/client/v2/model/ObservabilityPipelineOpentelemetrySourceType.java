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

/** The source type. The value should always be <code>opentelemetry</code>. */
@JsonSerialize(
    using =
        ObservabilityPipelineOpentelemetrySourceType
            .ObservabilityPipelineOpentelemetrySourceTypeSerializer.class)
public class ObservabilityPipelineOpentelemetrySourceType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("opentelemetry"));

  public static final ObservabilityPipelineOpentelemetrySourceType OPENTELEMETRY =
      new ObservabilityPipelineOpentelemetrySourceType("opentelemetry");

  ObservabilityPipelineOpentelemetrySourceType(String value) {
    super(value, allowedValues);
  }

  public static class ObservabilityPipelineOpentelemetrySourceTypeSerializer
      extends StdSerializer<ObservabilityPipelineOpentelemetrySourceType> {
    public ObservabilityPipelineOpentelemetrySourceTypeSerializer(
        Class<ObservabilityPipelineOpentelemetrySourceType> t) {
      super(t);
    }

    public ObservabilityPipelineOpentelemetrySourceTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ObservabilityPipelineOpentelemetrySourceType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ObservabilityPipelineOpentelemetrySourceType fromValue(String value) {
    return new ObservabilityPipelineOpentelemetrySourceType(value);
  }
}
