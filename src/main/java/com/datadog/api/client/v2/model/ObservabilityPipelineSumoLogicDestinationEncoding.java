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

/** The output encoding format. */
@JsonSerialize(
    using =
        ObservabilityPipelineSumoLogicDestinationEncoding
            .ObservabilityPipelineSumoLogicDestinationEncodingSerializer.class)
public class ObservabilityPipelineSumoLogicDestinationEncoding extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("json", "raw_message", "logfmt"));

  public static final ObservabilityPipelineSumoLogicDestinationEncoding JSON =
      new ObservabilityPipelineSumoLogicDestinationEncoding("json");
  public static final ObservabilityPipelineSumoLogicDestinationEncoding RAW_MESSAGE =
      new ObservabilityPipelineSumoLogicDestinationEncoding("raw_message");
  public static final ObservabilityPipelineSumoLogicDestinationEncoding LOGFMT =
      new ObservabilityPipelineSumoLogicDestinationEncoding("logfmt");

  ObservabilityPipelineSumoLogicDestinationEncoding(String value) {
    super(value, allowedValues);
  }

  public static class ObservabilityPipelineSumoLogicDestinationEncodingSerializer
      extends StdSerializer<ObservabilityPipelineSumoLogicDestinationEncoding> {
    public ObservabilityPipelineSumoLogicDestinationEncodingSerializer(
        Class<ObservabilityPipelineSumoLogicDestinationEncoding> t) {
      super(t);
    }

    public ObservabilityPipelineSumoLogicDestinationEncodingSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ObservabilityPipelineSumoLogicDestinationEncoding value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ObservabilityPipelineSumoLogicDestinationEncoding fromValue(String value) {
    return new ObservabilityPipelineSumoLogicDestinationEncoding(value);
  }
}
