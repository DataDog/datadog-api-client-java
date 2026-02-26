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

/** The destination type. The value should always be <code>elasticsearch</code>. */
@JsonSerialize(
    using =
        ObservabilityPipelineElasticsearchDestinationType
            .ObservabilityPipelineElasticsearchDestinationTypeSerializer.class)
public class ObservabilityPipelineElasticsearchDestinationType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("elasticsearch"));

  public static final ObservabilityPipelineElasticsearchDestinationType ELASTICSEARCH =
      new ObservabilityPipelineElasticsearchDestinationType("elasticsearch");

  ObservabilityPipelineElasticsearchDestinationType(String value) {
    super(value, allowedValues);
  }

  public static class ObservabilityPipelineElasticsearchDestinationTypeSerializer
      extends StdSerializer<ObservabilityPipelineElasticsearchDestinationType> {
    public ObservabilityPipelineElasticsearchDestinationTypeSerializer(
        Class<ObservabilityPipelineElasticsearchDestinationType> t) {
      super(t);
    }

    public ObservabilityPipelineElasticsearchDestinationTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ObservabilityPipelineElasticsearchDestinationType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ObservabilityPipelineElasticsearchDestinationType fromValue(String value) {
    return new ObservabilityPipelineElasticsearchDestinationType(value);
  }
}
