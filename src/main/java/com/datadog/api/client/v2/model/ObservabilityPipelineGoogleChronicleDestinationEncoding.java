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

/** The encoding format for the logs sent to Chronicle. */
@JsonSerialize(
    using =
        ObservabilityPipelineGoogleChronicleDestinationEncoding
            .ObservabilityPipelineGoogleChronicleDestinationEncodingSerializer.class)
public class ObservabilityPipelineGoogleChronicleDestinationEncoding extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("json", "raw_message"));

  public static final ObservabilityPipelineGoogleChronicleDestinationEncoding JSON =
      new ObservabilityPipelineGoogleChronicleDestinationEncoding("json");
  public static final ObservabilityPipelineGoogleChronicleDestinationEncoding RAW_MESSAGE =
      new ObservabilityPipelineGoogleChronicleDestinationEncoding("raw_message");

  ObservabilityPipelineGoogleChronicleDestinationEncoding(String value) {
    super(value, allowedValues);
  }

  public static class ObservabilityPipelineGoogleChronicleDestinationEncodingSerializer
      extends StdSerializer<ObservabilityPipelineGoogleChronicleDestinationEncoding> {
    public ObservabilityPipelineGoogleChronicleDestinationEncodingSerializer(
        Class<ObservabilityPipelineGoogleChronicleDestinationEncoding> t) {
      super(t);
    }

    public ObservabilityPipelineGoogleChronicleDestinationEncodingSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ObservabilityPipelineGoogleChronicleDestinationEncoding value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ObservabilityPipelineGoogleChronicleDestinationEncoding fromValue(String value) {
    return new ObservabilityPipelineGoogleChronicleDestinationEncoding(value);
  }
}
