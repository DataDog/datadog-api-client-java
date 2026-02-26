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

/** The destination type. The value should always be <code>sumo_logic</code>. */
@JsonSerialize(
    using =
        ObservabilityPipelineSumoLogicDestinationType
            .ObservabilityPipelineSumoLogicDestinationTypeSerializer.class)
public class ObservabilityPipelineSumoLogicDestinationType extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("sumo_logic"));

  public static final ObservabilityPipelineSumoLogicDestinationType SUMO_LOGIC =
      new ObservabilityPipelineSumoLogicDestinationType("sumo_logic");

  ObservabilityPipelineSumoLogicDestinationType(String value) {
    super(value, allowedValues);
  }

  public static class ObservabilityPipelineSumoLogicDestinationTypeSerializer
      extends StdSerializer<ObservabilityPipelineSumoLogicDestinationType> {
    public ObservabilityPipelineSumoLogicDestinationTypeSerializer(
        Class<ObservabilityPipelineSumoLogicDestinationType> t) {
      super(t);
    }

    public ObservabilityPipelineSumoLogicDestinationTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ObservabilityPipelineSumoLogicDestinationType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ObservabilityPipelineSumoLogicDestinationType fromValue(String value) {
    return new ObservabilityPipelineSumoLogicDestinationType(value);
  }
}
