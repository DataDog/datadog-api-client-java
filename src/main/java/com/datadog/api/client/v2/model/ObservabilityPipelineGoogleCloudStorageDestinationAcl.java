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
   * <p>Access control list setting for objects written to the bucket.</p>
 */
@JsonSerialize(using = ObservabilityPipelineGoogleCloudStorageDestinationAcl.ObservabilityPipelineGoogleCloudStorageDestinationAclSerializer.class)
public class ObservabilityPipelineGoogleCloudStorageDestinationAcl extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("private", "project-private", "public-read", "authenticated-read", "bucket-owner-read", "bucket-owner-full-control"));

  public static final ObservabilityPipelineGoogleCloudStorageDestinationAcl PRIVATE = new ObservabilityPipelineGoogleCloudStorageDestinationAcl("private");
  public static final ObservabilityPipelineGoogleCloudStorageDestinationAcl PROJECTNOT_PRIVATE = new ObservabilityPipelineGoogleCloudStorageDestinationAcl("project-private");
  public static final ObservabilityPipelineGoogleCloudStorageDestinationAcl PUBLICNOT_READ = new ObservabilityPipelineGoogleCloudStorageDestinationAcl("public-read");
  public static final ObservabilityPipelineGoogleCloudStorageDestinationAcl AUTHENTICATEDNOT_READ = new ObservabilityPipelineGoogleCloudStorageDestinationAcl("authenticated-read");
  public static final ObservabilityPipelineGoogleCloudStorageDestinationAcl BUCKETNOT_OWNERNOT_READ = new ObservabilityPipelineGoogleCloudStorageDestinationAcl("bucket-owner-read");
  public static final ObservabilityPipelineGoogleCloudStorageDestinationAcl BUCKETNOT_OWNERNOT_FULLNOT_CONTROL = new ObservabilityPipelineGoogleCloudStorageDestinationAcl("bucket-owner-full-control");


  ObservabilityPipelineGoogleCloudStorageDestinationAcl(String value) {
    super(value, allowedValues);
  }

  public static class ObservabilityPipelineGoogleCloudStorageDestinationAclSerializer extends StdSerializer<ObservabilityPipelineGoogleCloudStorageDestinationAcl> {
      public ObservabilityPipelineGoogleCloudStorageDestinationAclSerializer(Class<ObservabilityPipelineGoogleCloudStorageDestinationAcl> t) {
          super(t);
      }

      public ObservabilityPipelineGoogleCloudStorageDestinationAclSerializer() {
          this(null);
      }

      @Override
      public void serialize(ObservabilityPipelineGoogleCloudStorageDestinationAcl value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
          jgen.writeObject(value.value);
      }
  }

  @JsonCreator
  public static ObservabilityPipelineGoogleCloudStorageDestinationAcl fromValue(String value) {
    return new ObservabilityPipelineGoogleCloudStorageDestinationAcl(value);
  }
}
