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

/** The source type. The value should always be <code>amazon_data_firehose</code>. */
@JsonSerialize(
    using =
        ObservabilityPipelineAmazonDataFirehoseSourceType
            .ObservabilityPipelineAmazonDataFirehoseSourceTypeSerializer.class)
public class ObservabilityPipelineAmazonDataFirehoseSourceType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("amazon_data_firehose"));

  public static final ObservabilityPipelineAmazonDataFirehoseSourceType AMAZON_DATA_FIREHOSE =
      new ObservabilityPipelineAmazonDataFirehoseSourceType("amazon_data_firehose");

  ObservabilityPipelineAmazonDataFirehoseSourceType(String value) {
    super(value, allowedValues);
  }

  public static class ObservabilityPipelineAmazonDataFirehoseSourceTypeSerializer
      extends StdSerializer<ObservabilityPipelineAmazonDataFirehoseSourceType> {
    public ObservabilityPipelineAmazonDataFirehoseSourceTypeSerializer(
        Class<ObservabilityPipelineAmazonDataFirehoseSourceType> t) {
      super(t);
    }

    public ObservabilityPipelineAmazonDataFirehoseSourceTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ObservabilityPipelineAmazonDataFirehoseSourceType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ObservabilityPipelineAmazonDataFirehoseSourceType fromValue(String value) {
    return new ObservabilityPipelineAmazonDataFirehoseSourceType(value);
  }
}
