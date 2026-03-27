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

/** The processor type. The value should always be <code>parse_json</code>. */
@JsonSerialize(
    using =
        ObservabilityPipelineParseJSONProcessorType
            .ObservabilityPipelineParseJSONProcessorTypeSerializer.class)
public class ObservabilityPipelineParseJSONProcessorType extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("parse_json"));

  public static final ObservabilityPipelineParseJSONProcessorType PARSE_JSON =
      new ObservabilityPipelineParseJSONProcessorType("parse_json");

  ObservabilityPipelineParseJSONProcessorType(String value) {
    super(value, allowedValues);
  }

  public static class ObservabilityPipelineParseJSONProcessorTypeSerializer
      extends StdSerializer<ObservabilityPipelineParseJSONProcessorType> {
    public ObservabilityPipelineParseJSONProcessorTypeSerializer(
        Class<ObservabilityPipelineParseJSONProcessorType> t) {
      super(t);
    }

    public ObservabilityPipelineParseJSONProcessorTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ObservabilityPipelineParseJSONProcessorType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ObservabilityPipelineParseJSONProcessorType fromValue(String value) {
    return new ObservabilityPipelineParseJSONProcessorType(value);
  }
}
