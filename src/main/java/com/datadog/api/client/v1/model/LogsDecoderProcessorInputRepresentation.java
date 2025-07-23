/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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

/** The original representation of input string. */
@JsonSerialize(
    using =
        LogsDecoderProcessorInputRepresentation.LogsDecoderProcessorInputRepresentationSerializer
            .class)
public class LogsDecoderProcessorInputRepresentation extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("utf_8", "integer"));

  public static final LogsDecoderProcessorInputRepresentation UTF_8 =
      new LogsDecoderProcessorInputRepresentation("utf_8");
  public static final LogsDecoderProcessorInputRepresentation INTEGER =
      new LogsDecoderProcessorInputRepresentation("integer");

  LogsDecoderProcessorInputRepresentation(String value) {
    super(value, allowedValues);
  }

  public static class LogsDecoderProcessorInputRepresentationSerializer
      extends StdSerializer<LogsDecoderProcessorInputRepresentation> {
    public LogsDecoderProcessorInputRepresentationSerializer(
        Class<LogsDecoderProcessorInputRepresentation> t) {
      super(t);
    }

    public LogsDecoderProcessorInputRepresentationSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        LogsDecoderProcessorInputRepresentation value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static LogsDecoderProcessorInputRepresentation fromValue(String value) {
    return new LogsDecoderProcessorInputRepresentation(value);
  }
}
