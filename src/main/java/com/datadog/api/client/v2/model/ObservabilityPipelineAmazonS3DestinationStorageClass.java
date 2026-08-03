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
   * <p>S3 storage class.</p>
 */
@JsonSerialize(using = ObservabilityPipelineAmazonS3DestinationStorageClass.ObservabilityPipelineAmazonS3DestinationStorageClassSerializer.class)
public class ObservabilityPipelineAmazonS3DestinationStorageClass extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("STANDARD", "REDUCED_REDUNDANCY", "INTELLIGENT_TIERING", "STANDARD_IA", "EXPRESS_ONEZONE", "ONEZONE_IA", "GLACIER", "GLACIER_IR", "DEEP_ARCHIVE"));

  public static final ObservabilityPipelineAmazonS3DestinationStorageClass STANDARD = new ObservabilityPipelineAmazonS3DestinationStorageClass("STANDARD");
  public static final ObservabilityPipelineAmazonS3DestinationStorageClass REDUCED_REDUNDANCY = new ObservabilityPipelineAmazonS3DestinationStorageClass("REDUCED_REDUNDANCY");
  public static final ObservabilityPipelineAmazonS3DestinationStorageClass INTELLIGENT_TIERING = new ObservabilityPipelineAmazonS3DestinationStorageClass("INTELLIGENT_TIERING");
  public static final ObservabilityPipelineAmazonS3DestinationStorageClass STANDARD_IA = new ObservabilityPipelineAmazonS3DestinationStorageClass("STANDARD_IA");
  public static final ObservabilityPipelineAmazonS3DestinationStorageClass EXPRESS_ONEZONE = new ObservabilityPipelineAmazonS3DestinationStorageClass("EXPRESS_ONEZONE");
  public static final ObservabilityPipelineAmazonS3DestinationStorageClass ONEZONE_IA = new ObservabilityPipelineAmazonS3DestinationStorageClass("ONEZONE_IA");
  public static final ObservabilityPipelineAmazonS3DestinationStorageClass GLACIER = new ObservabilityPipelineAmazonS3DestinationStorageClass("GLACIER");
  public static final ObservabilityPipelineAmazonS3DestinationStorageClass GLACIER_IR = new ObservabilityPipelineAmazonS3DestinationStorageClass("GLACIER_IR");
  public static final ObservabilityPipelineAmazonS3DestinationStorageClass DEEP_ARCHIVE = new ObservabilityPipelineAmazonS3DestinationStorageClass("DEEP_ARCHIVE");


  ObservabilityPipelineAmazonS3DestinationStorageClass(String value) {
    super(value, allowedValues);
  }

  public static class ObservabilityPipelineAmazonS3DestinationStorageClassSerializer extends StdSerializer<ObservabilityPipelineAmazonS3DestinationStorageClass> {
      public ObservabilityPipelineAmazonS3DestinationStorageClassSerializer(Class<ObservabilityPipelineAmazonS3DestinationStorageClass> t) {
          super(t);
      }

      public ObservabilityPipelineAmazonS3DestinationStorageClassSerializer() {
          this(null);
      }

      @Override
      public void serialize(ObservabilityPipelineAmazonS3DestinationStorageClass value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
          jgen.writeObject(value.value);
      }
  }

  @JsonCreator
  public static ObservabilityPipelineAmazonS3DestinationStorageClass fromValue(String value) {
    return new ObservabilityPipelineAmazonS3DestinationStorageClass(value);
  }
}
