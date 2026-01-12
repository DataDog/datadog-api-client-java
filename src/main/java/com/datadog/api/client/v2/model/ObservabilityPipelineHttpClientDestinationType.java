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

/** The destination type. The value should always be <code>http_client</code>. */
@JsonSerialize(
    using =
        ObservabilityPipelineHttpClientDestinationType
            .ObservabilityPipelineHttpClientDestinationTypeSerializer.class)
public class ObservabilityPipelineHttpClientDestinationType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("http_client"));

  public static final ObservabilityPipelineHttpClientDestinationType HTTP_CLIENT =
      new ObservabilityPipelineHttpClientDestinationType("http_client");

  ObservabilityPipelineHttpClientDestinationType(String value) {
    super(value, allowedValues);
  }

  public static class ObservabilityPipelineHttpClientDestinationTypeSerializer
      extends StdSerializer<ObservabilityPipelineHttpClientDestinationType> {
    public ObservabilityPipelineHttpClientDestinationTypeSerializer(
        Class<ObservabilityPipelineHttpClientDestinationType> t) {
      super(t);
    }

    public ObservabilityPipelineHttpClientDestinationTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ObservabilityPipelineHttpClientDestinationType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ObservabilityPipelineHttpClientDestinationType fromValue(String value) {
    return new ObservabilityPipelineHttpClientDestinationType(value);
  }
}
