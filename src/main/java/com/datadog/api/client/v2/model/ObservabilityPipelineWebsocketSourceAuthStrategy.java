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

/** Authentication strategy for the WebSocket source connection. */
@JsonSerialize(
    using =
        ObservabilityPipelineWebsocketSourceAuthStrategy
            .ObservabilityPipelineWebsocketSourceAuthStrategySerializer.class)
public class ObservabilityPipelineWebsocketSourceAuthStrategy extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("none", "basic", "bearer", "custom"));

  public static final ObservabilityPipelineWebsocketSourceAuthStrategy NONE =
      new ObservabilityPipelineWebsocketSourceAuthStrategy("none");
  public static final ObservabilityPipelineWebsocketSourceAuthStrategy BASIC =
      new ObservabilityPipelineWebsocketSourceAuthStrategy("basic");
  public static final ObservabilityPipelineWebsocketSourceAuthStrategy BEARER =
      new ObservabilityPipelineWebsocketSourceAuthStrategy("bearer");
  public static final ObservabilityPipelineWebsocketSourceAuthStrategy CUSTOM =
      new ObservabilityPipelineWebsocketSourceAuthStrategy("custom");

  ObservabilityPipelineWebsocketSourceAuthStrategy(String value) {
    super(value, allowedValues);
  }

  public static class ObservabilityPipelineWebsocketSourceAuthStrategySerializer
      extends StdSerializer<ObservabilityPipelineWebsocketSourceAuthStrategy> {
    public ObservabilityPipelineWebsocketSourceAuthStrategySerializer(
        Class<ObservabilityPipelineWebsocketSourceAuthStrategy> t) {
      super(t);
    }

    public ObservabilityPipelineWebsocketSourceAuthStrategySerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ObservabilityPipelineWebsocketSourceAuthStrategy value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ObservabilityPipelineWebsocketSourceAuthStrategy fromValue(String value) {
    return new ObservabilityPipelineWebsocketSourceAuthStrategy(value);
  }
}
