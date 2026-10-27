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
 * How to handle logs that are missing one of the <code>partition_fields</code>. Options: - <code>
 * ignore</code>: Forward the event without applying spike protection. - <code>default_bucket</code>
 * : Assign the event to a default partition.
 */
@JsonSerialize(
    using =
        ObservabilityPipelineSpikeProtectionProcessorActionWhenMissingPartitions
            .ObservabilityPipelineSpikeProtectionProcessorActionWhenMissingPartitionsSerializer
            .class)
public class ObservabilityPipelineSpikeProtectionProcessorActionWhenMissingPartitions
    extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("ignore", "default_bucket"));

  public static final ObservabilityPipelineSpikeProtectionProcessorActionWhenMissingPartitions
      IGNORE =
          new ObservabilityPipelineSpikeProtectionProcessorActionWhenMissingPartitions("ignore");
  public static final ObservabilityPipelineSpikeProtectionProcessorActionWhenMissingPartitions
      DEFAULT_BUCKET =
          new ObservabilityPipelineSpikeProtectionProcessorActionWhenMissingPartitions(
              "default_bucket");

  ObservabilityPipelineSpikeProtectionProcessorActionWhenMissingPartitions(String value) {
    super(value, allowedValues);
  }

  public static
  class ObservabilityPipelineSpikeProtectionProcessorActionWhenMissingPartitionsSerializer
      extends StdSerializer<
          ObservabilityPipelineSpikeProtectionProcessorActionWhenMissingPartitions> {
    public ObservabilityPipelineSpikeProtectionProcessorActionWhenMissingPartitionsSerializer(
        Class<ObservabilityPipelineSpikeProtectionProcessorActionWhenMissingPartitions> t) {
      super(t);
    }

    public ObservabilityPipelineSpikeProtectionProcessorActionWhenMissingPartitionsSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ObservabilityPipelineSpikeProtectionProcessorActionWhenMissingPartitions value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ObservabilityPipelineSpikeProtectionProcessorActionWhenMissingPartitions fromValue(
      String value) {
    return new ObservabilityPipelineSpikeProtectionProcessorActionWhenMissingPartitions(value);
  }
}
