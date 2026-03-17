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

/** The compression type. Always <code>gzip</code>. */
@JsonSerialize(
    using =
        ObservabilityPipelineAmazonS3GenericCompressionGzipType
            .ObservabilityPipelineAmazonS3GenericCompressionGzipTypeSerializer.class)
public class ObservabilityPipelineAmazonS3GenericCompressionGzipType extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("gzip"));

  public static final ObservabilityPipelineAmazonS3GenericCompressionGzipType GZIP =
      new ObservabilityPipelineAmazonS3GenericCompressionGzipType("gzip");

  ObservabilityPipelineAmazonS3GenericCompressionGzipType(String value) {
    super(value, allowedValues);
  }

  public static class ObservabilityPipelineAmazonS3GenericCompressionGzipTypeSerializer
      extends StdSerializer<ObservabilityPipelineAmazonS3GenericCompressionGzipType> {
    public ObservabilityPipelineAmazonS3GenericCompressionGzipTypeSerializer(
        Class<ObservabilityPipelineAmazonS3GenericCompressionGzipType> t) {
      super(t);
    }

    public ObservabilityPipelineAmazonS3GenericCompressionGzipTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ObservabilityPipelineAmazonS3GenericCompressionGzipType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ObservabilityPipelineAmazonS3GenericCompressionGzipType fromValue(String value) {
    return new ObservabilityPipelineAmazonS3GenericCompressionGzipType(value);
  }
}
