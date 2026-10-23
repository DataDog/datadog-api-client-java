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

/** The destination type. Always <code>opentelemetry</code>. */
@JsonSerialize(
    using =
        ObservabilityPipelineOpentelemetryDestinationType
            .ObservabilityPipelineOpentelemetryDestinationTypeSerializer.class)
public class ObservabilityPipelineOpentelemetryDestinationType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("opentelemetry"));

  public static final ObservabilityPipelineOpentelemetryDestinationType OPENTELEMETRY =
      new ObservabilityPipelineOpentelemetryDestinationType("opentelemetry");

  ObservabilityPipelineOpentelemetryDestinationType(String value) {
    super(value, allowedValues);
  }

  public static class ObservabilityPipelineOpentelemetryDestinationTypeSerializer
      extends StdSerializer<ObservabilityPipelineOpentelemetryDestinationType> {
    public ObservabilityPipelineOpentelemetryDestinationTypeSerializer(
        Class<ObservabilityPipelineOpentelemetryDestinationType> t) {
      super(t);
    }

    public ObservabilityPipelineOpentelemetryDestinationTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ObservabilityPipelineOpentelemetryDestinationType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ObservabilityPipelineOpentelemetryDestinationType fromValue(String value) {
    return new ObservabilityPipelineOpentelemetryDestinationType(value);
  }
}
