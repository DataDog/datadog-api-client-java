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

/** The minimal threshold type. The value should always be <code>threshold</code>. */
@JsonSerialize(
    using =
        ObservabilityPipelineSpikeProtectionProcessorMinimalThresholdBytesType
            .ObservabilityPipelineSpikeProtectionProcessorMinimalThresholdBytesTypeSerializer.class)
public class ObservabilityPipelineSpikeProtectionProcessorMinimalThresholdBytesType
    extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("threshold"));

  public static final ObservabilityPipelineSpikeProtectionProcessorMinimalThresholdBytesType
      THRESHOLD =
          new ObservabilityPipelineSpikeProtectionProcessorMinimalThresholdBytesType("threshold");

  ObservabilityPipelineSpikeProtectionProcessorMinimalThresholdBytesType(String value) {
    super(value, allowedValues);
  }

  public static
  class ObservabilityPipelineSpikeProtectionProcessorMinimalThresholdBytesTypeSerializer
      extends StdSerializer<
          ObservabilityPipelineSpikeProtectionProcessorMinimalThresholdBytesType> {
    public ObservabilityPipelineSpikeProtectionProcessorMinimalThresholdBytesTypeSerializer(
        Class<ObservabilityPipelineSpikeProtectionProcessorMinimalThresholdBytesType> t) {
      super(t);
    }

    public ObservabilityPipelineSpikeProtectionProcessorMinimalThresholdBytesTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ObservabilityPipelineSpikeProtectionProcessorMinimalThresholdBytesType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ObservabilityPipelineSpikeProtectionProcessorMinimalThresholdBytesType fromValue(
      String value) {
    return new ObservabilityPipelineSpikeProtectionProcessorMinimalThresholdBytesType(value);
  }
}
