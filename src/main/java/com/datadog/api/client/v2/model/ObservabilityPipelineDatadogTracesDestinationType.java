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

/** The destination type. The value should always be <code>datadog_traces</code>. */
@JsonSerialize(
    using =
        ObservabilityPipelineDatadogTracesDestinationType
            .ObservabilityPipelineDatadogTracesDestinationTypeSerializer.class)
public class ObservabilityPipelineDatadogTracesDestinationType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("datadog_traces"));

  public static final ObservabilityPipelineDatadogTracesDestinationType DATADOG_TRACES =
      new ObservabilityPipelineDatadogTracesDestinationType("datadog_traces");

  ObservabilityPipelineDatadogTracesDestinationType(String value) {
    super(value, allowedValues);
  }

  public static class ObservabilityPipelineDatadogTracesDestinationTypeSerializer
      extends StdSerializer<ObservabilityPipelineDatadogTracesDestinationType> {
    public ObservabilityPipelineDatadogTracesDestinationTypeSerializer(
        Class<ObservabilityPipelineDatadogTracesDestinationType> t) {
      super(t);
    }

    public ObservabilityPipelineDatadogTracesDestinationTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ObservabilityPipelineDatadogTracesDestinationType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ObservabilityPipelineDatadogTracesDestinationType fromValue(String value) {
    return new ObservabilityPipelineDatadogTracesDestinationType(value);
  }
}
