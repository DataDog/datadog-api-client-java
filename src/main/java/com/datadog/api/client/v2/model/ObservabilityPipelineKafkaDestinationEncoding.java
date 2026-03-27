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
        ObservabilityPipelineKafkaDestinationEncoding
            .ObservabilityPipelineKafkaDestinationEncodingSerializer.class)
public class ObservabilityPipelineKafkaDestinationEncoding extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("json", "raw_message"));

  public static final ObservabilityPipelineKafkaDestinationEncoding JSON =
      new ObservabilityPipelineKafkaDestinationEncoding("json");
  public static final ObservabilityPipelineKafkaDestinationEncoding RAW_MESSAGE =
      new ObservabilityPipelineKafkaDestinationEncoding("raw_message");

  ObservabilityPipelineKafkaDestinationEncoding(String value) {
    super(value, allowedValues);
  }

  public static class ObservabilityPipelineKafkaDestinationEncodingSerializer
      extends StdSerializer<ObservabilityPipelineKafkaDestinationEncoding> {
    public ObservabilityPipelineKafkaDestinationEncodingSerializer(
        Class<ObservabilityPipelineKafkaDestinationEncoding> t) {
      super(t);
    }

    public ObservabilityPipelineKafkaDestinationEncodingSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ObservabilityPipelineKafkaDestinationEncoding value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ObservabilityPipelineKafkaDestinationEncoding fromValue(String value) {
    return new ObservabilityPipelineKafkaDestinationEncoding(value);
  }
}
