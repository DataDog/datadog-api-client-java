/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.UUID;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.openapitools.jackson.nullable.JsonNullable;

import com.datadog.api.client.JsonTimeSerializer;

import com.datadog.api.client.ModelEnum;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;

import java.util.Set;
import java.util.HashSet;

/**
   * <p>Compression format for objects retrieved from the S3 bucket. Use <code>auto</code> to detect compression from the object's Content-Encoding header or file extension.</p>
 */
@JsonSerialize(using = ObservabilityPipelineAmazonS3SourceCompression.ObservabilityPipelineAmazonS3SourceCompressionSerializer.class)
public class ObservabilityPipelineAmazonS3SourceCompression extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("auto", "none", "gzip", "zstd"));

  public static final ObservabilityPipelineAmazonS3SourceCompression AUTO = new ObservabilityPipelineAmazonS3SourceCompression("auto");
  public static final ObservabilityPipelineAmazonS3SourceCompression NONE = new ObservabilityPipelineAmazonS3SourceCompression("none");
  public static final ObservabilityPipelineAmazonS3SourceCompression GZIP = new ObservabilityPipelineAmazonS3SourceCompression("gzip");
  public static final ObservabilityPipelineAmazonS3SourceCompression ZSTD = new ObservabilityPipelineAmazonS3SourceCompression("zstd");


  ObservabilityPipelineAmazonS3SourceCompression(String value) {
    super(value, allowedValues);
  }

  public static class ObservabilityPipelineAmazonS3SourceCompressionSerializer extends StdSerializer<ObservabilityPipelineAmazonS3SourceCompression> {
      public ObservabilityPipelineAmazonS3SourceCompressionSerializer(Class<ObservabilityPipelineAmazonS3SourceCompression> t) {
          super(t);
      }

      public ObservabilityPipelineAmazonS3SourceCompressionSerializer() {
          this(null);
      }

      @Override
      public void serialize(ObservabilityPipelineAmazonS3SourceCompression value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
          jgen.writeObject(value.value);
      }
  }

  @JsonCreator
  public static ObservabilityPipelineAmazonS3SourceCompression fromValue(String value) {
    return new ObservabilityPipelineAmazonS3SourceCompression(value);
  }
}
