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
 * The authentication strategy for ClickHouse HTTP requests. Only <code>basic</code> is supported.
 */
@JsonSerialize(
    using =
        ObservabilityPipelineClickhouseDestinationAuthStrategy
            .ObservabilityPipelineClickhouseDestinationAuthStrategySerializer.class)
public class ObservabilityPipelineClickhouseDestinationAuthStrategy extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("basic"));

  public static final ObservabilityPipelineClickhouseDestinationAuthStrategy BASIC =
      new ObservabilityPipelineClickhouseDestinationAuthStrategy("basic");

  ObservabilityPipelineClickhouseDestinationAuthStrategy(String value) {
    super(value, allowedValues);
  }

  public static class ObservabilityPipelineClickhouseDestinationAuthStrategySerializer
      extends StdSerializer<ObservabilityPipelineClickhouseDestinationAuthStrategy> {
    public ObservabilityPipelineClickhouseDestinationAuthStrategySerializer(
        Class<ObservabilityPipelineClickhouseDestinationAuthStrategy> t) {
      super(t);
    }

    public ObservabilityPipelineClickhouseDestinationAuthStrategySerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ObservabilityPipelineClickhouseDestinationAuthStrategy value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ObservabilityPipelineClickhouseDestinationAuthStrategy fromValue(String value) {
    return new ObservabilityPipelineClickhouseDestinationAuthStrategy(value);
  }
}
