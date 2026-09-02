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
        ObservabilityPipelineHttpClientDestinationEncoding
            .ObservabilityPipelineHttpClientDestinationEncodingSerializer.class)
public class ObservabilityPipelineHttpClientDestinationEncoding extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("json"));

  public static final ObservabilityPipelineHttpClientDestinationEncoding JSON =
      new ObservabilityPipelineHttpClientDestinationEncoding("json");

  ObservabilityPipelineHttpClientDestinationEncoding(String value) {
    super(value, allowedValues);
  }

  public static class ObservabilityPipelineHttpClientDestinationEncodingSerializer
      extends StdSerializer<ObservabilityPipelineHttpClientDestinationEncoding> {
    public ObservabilityPipelineHttpClientDestinationEncodingSerializer(
        Class<ObservabilityPipelineHttpClientDestinationEncoding> t) {
      super(t);
    }

    public ObservabilityPipelineHttpClientDestinationEncodingSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ObservabilityPipelineHttpClientDestinationEncoding value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ObservabilityPipelineHttpClientDestinationEncoding fromValue(String value) {
    return new ObservabilityPipelineHttpClientDestinationEncoding(value);
  }
}
