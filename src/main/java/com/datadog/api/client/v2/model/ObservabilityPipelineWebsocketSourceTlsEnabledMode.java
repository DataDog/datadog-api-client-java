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

/** TLS mode. Must be <code>enabled</code>. */
@JsonSerialize(
    using =
        ObservabilityPipelineWebsocketSourceTlsEnabledMode
            .ObservabilityPipelineWebsocketSourceTlsEnabledModeSerializer.class)
public class ObservabilityPipelineWebsocketSourceTlsEnabledMode extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("enabled"));

  public static final ObservabilityPipelineWebsocketSourceTlsEnabledMode ENABLED =
      new ObservabilityPipelineWebsocketSourceTlsEnabledMode("enabled");

  ObservabilityPipelineWebsocketSourceTlsEnabledMode(String value) {
    super(value, allowedValues);
  }

  public static class ObservabilityPipelineWebsocketSourceTlsEnabledModeSerializer
      extends StdSerializer<ObservabilityPipelineWebsocketSourceTlsEnabledMode> {
    public ObservabilityPipelineWebsocketSourceTlsEnabledModeSerializer(
        Class<ObservabilityPipelineWebsocketSourceTlsEnabledMode> t) {
      super(t);
    }

    public ObservabilityPipelineWebsocketSourceTlsEnabledModeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ObservabilityPipelineWebsocketSourceTlsEnabledMode value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ObservabilityPipelineWebsocketSourceTlsEnabledMode fromValue(String value) {
    return new ObservabilityPipelineWebsocketSourceTlsEnabledMode(value);
  }
}
