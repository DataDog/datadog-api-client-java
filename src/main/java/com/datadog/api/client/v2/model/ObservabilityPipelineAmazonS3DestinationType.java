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

/** The destination type. Always <code>amazon_s3</code>. */
@JsonSerialize(
    using =
        ObservabilityPipelineAmazonS3DestinationType
            .ObservabilityPipelineAmazonS3DestinationTypeSerializer.class)
public class ObservabilityPipelineAmazonS3DestinationType extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("amazon_s3"));

  public static final ObservabilityPipelineAmazonS3DestinationType AMAZON_S3 =
      new ObservabilityPipelineAmazonS3DestinationType("amazon_s3");

  ObservabilityPipelineAmazonS3DestinationType(String value) {
    super(value, allowedValues);
  }

  public static class ObservabilityPipelineAmazonS3DestinationTypeSerializer
      extends StdSerializer<ObservabilityPipelineAmazonS3DestinationType> {
    public ObservabilityPipelineAmazonS3DestinationTypeSerializer(
        Class<ObservabilityPipelineAmazonS3DestinationType> t) {
      super(t);
    }

    public ObservabilityPipelineAmazonS3DestinationTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ObservabilityPipelineAmazonS3DestinationType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ObservabilityPipelineAmazonS3DestinationType fromValue(String value) {
    return new ObservabilityPipelineAmazonS3DestinationType(value);
  }
}
