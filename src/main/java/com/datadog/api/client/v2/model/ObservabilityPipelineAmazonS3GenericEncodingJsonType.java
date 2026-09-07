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

/** The encoding type. Always <code>json</code>. */
@JsonSerialize(
    using =
        ObservabilityPipelineAmazonS3GenericEncodingJsonType
            .ObservabilityPipelineAmazonS3GenericEncodingJsonTypeSerializer.class)
public class ObservabilityPipelineAmazonS3GenericEncodingJsonType extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("json"));

  public static final ObservabilityPipelineAmazonS3GenericEncodingJsonType JSON =
      new ObservabilityPipelineAmazonS3GenericEncodingJsonType("json");

  ObservabilityPipelineAmazonS3GenericEncodingJsonType(String value) {
    super(value, allowedValues);
  }

  public static class ObservabilityPipelineAmazonS3GenericEncodingJsonTypeSerializer
      extends StdSerializer<ObservabilityPipelineAmazonS3GenericEncodingJsonType> {
    public ObservabilityPipelineAmazonS3GenericEncodingJsonTypeSerializer(
        Class<ObservabilityPipelineAmazonS3GenericEncodingJsonType> t) {
      super(t);
    }

    public ObservabilityPipelineAmazonS3GenericEncodingJsonTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ObservabilityPipelineAmazonS3GenericEncodingJsonType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ObservabilityPipelineAmazonS3GenericEncodingJsonType fromValue(String value) {
    return new ObservabilityPipelineAmazonS3GenericEncodingJsonType(value);
  }
}
