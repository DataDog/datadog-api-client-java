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

/** Protocol used to receive logs. */
@JsonSerialize(
    using =
        ObservabilityPipelineSocketSourceMode.ObservabilityPipelineSocketSourceModeSerializer.class)
public class ObservabilityPipelineSocketSourceMode extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("tcp", "udp"));

  public static final ObservabilityPipelineSocketSourceMode TCP =
      new ObservabilityPipelineSocketSourceMode("tcp");
  public static final ObservabilityPipelineSocketSourceMode UDP =
      new ObservabilityPipelineSocketSourceMode("udp");

  ObservabilityPipelineSocketSourceMode(String value) {
    super(value, allowedValues);
  }

  public static class ObservabilityPipelineSocketSourceModeSerializer
      extends StdSerializer<ObservabilityPipelineSocketSourceMode> {
    public ObservabilityPipelineSocketSourceModeSerializer(
        Class<ObservabilityPipelineSocketSourceMode> t) {
      super(t);
    }

    public ObservabilityPipelineSocketSourceModeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ObservabilityPipelineSocketSourceMode value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ObservabilityPipelineSocketSourceMode fromValue(String value) {
    return new ObservabilityPipelineSocketSourceMode(value);
  }
}
