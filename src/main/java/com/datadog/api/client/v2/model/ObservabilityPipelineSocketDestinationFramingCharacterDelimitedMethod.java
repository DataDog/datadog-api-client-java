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
 * The definition of <code>ObservabilityPipelineSocketDestinationFramingCharacterDelimitedMethod
 * </code> object.
 */
@JsonSerialize(
    using =
        ObservabilityPipelineSocketDestinationFramingCharacterDelimitedMethod
            .ObservabilityPipelineSocketDestinationFramingCharacterDelimitedMethodSerializer.class)
public class ObservabilityPipelineSocketDestinationFramingCharacterDelimitedMethod
    extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("character_delimited"));

  public static final ObservabilityPipelineSocketDestinationFramingCharacterDelimitedMethod
      CHARACTER_DELIMITED =
          new ObservabilityPipelineSocketDestinationFramingCharacterDelimitedMethod(
              "character_delimited");

  ObservabilityPipelineSocketDestinationFramingCharacterDelimitedMethod(String value) {
    super(value, allowedValues);
  }

  public static
  class ObservabilityPipelineSocketDestinationFramingCharacterDelimitedMethodSerializer
      extends StdSerializer<ObservabilityPipelineSocketDestinationFramingCharacterDelimitedMethod> {
    public ObservabilityPipelineSocketDestinationFramingCharacterDelimitedMethodSerializer(
        Class<ObservabilityPipelineSocketDestinationFramingCharacterDelimitedMethod> t) {
      super(t);
    }

    public ObservabilityPipelineSocketDestinationFramingCharacterDelimitedMethodSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ObservabilityPipelineSocketDestinationFramingCharacterDelimitedMethod value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ObservabilityPipelineSocketDestinationFramingCharacterDelimitedMethod fromValue(
      String value) {
    return new ObservabilityPipelineSocketDestinationFramingCharacterDelimitedMethod(value);
  }
}
