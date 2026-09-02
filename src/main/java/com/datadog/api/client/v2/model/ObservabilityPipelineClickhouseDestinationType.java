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

/** The destination type. The value must be <code>clickhouse</code>. */
@JsonSerialize(
    using =
        ObservabilityPipelineClickhouseDestinationType
            .ObservabilityPipelineClickhouseDestinationTypeSerializer.class)
public class ObservabilityPipelineClickhouseDestinationType extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("clickhouse"));

  public static final ObservabilityPipelineClickhouseDestinationType CLICKHOUSE =
      new ObservabilityPipelineClickhouseDestinationType("clickhouse");

  ObservabilityPipelineClickhouseDestinationType(String value) {
    super(value, allowedValues);
  }

  public static class ObservabilityPipelineClickhouseDestinationTypeSerializer
      extends StdSerializer<ObservabilityPipelineClickhouseDestinationType> {
    public ObservabilityPipelineClickhouseDestinationTypeSerializer(
        Class<ObservabilityPipelineClickhouseDestinationType> t) {
      super(t);
    }

    public ObservabilityPipelineClickhouseDestinationTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ObservabilityPipelineClickhouseDestinationType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ObservabilityPipelineClickhouseDestinationType fromValue(String value) {
    return new ObservabilityPipelineClickhouseDestinationType(value);
  }
}
