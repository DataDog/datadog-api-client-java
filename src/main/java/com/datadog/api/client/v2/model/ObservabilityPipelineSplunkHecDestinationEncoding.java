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

/** Encoding format for log events. */
@JsonSerialize(
    using =
        ObservabilityPipelineSplunkHecDestinationEncoding
            .ObservabilityPipelineSplunkHecDestinationEncodingSerializer.class)
public class ObservabilityPipelineSplunkHecDestinationEncoding extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("json", "raw_message"));

  public static final ObservabilityPipelineSplunkHecDestinationEncoding JSON =
      new ObservabilityPipelineSplunkHecDestinationEncoding("json");
  public static final ObservabilityPipelineSplunkHecDestinationEncoding RAW_MESSAGE =
      new ObservabilityPipelineSplunkHecDestinationEncoding("raw_message");

  ObservabilityPipelineSplunkHecDestinationEncoding(String value) {
    super(value, allowedValues);
  }

  public static class ObservabilityPipelineSplunkHecDestinationEncodingSerializer
      extends StdSerializer<ObservabilityPipelineSplunkHecDestinationEncoding> {
    public ObservabilityPipelineSplunkHecDestinationEncodingSerializer(
        Class<ObservabilityPipelineSplunkHecDestinationEncoding> t) {
      super(t);
    }

    public ObservabilityPipelineSplunkHecDestinationEncodingSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ObservabilityPipelineSplunkHecDestinationEncoding value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ObservabilityPipelineSplunkHecDestinationEncoding fromValue(String value) {
    return new ObservabilityPipelineSplunkHecDestinationEncoding(value);
  }
}
