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

/** Storage class used for objects stored in GCS. */
@JsonSerialize(
    using =
        ObservabilityPipelineGoogleCloudStorageDestinationStorageClass
            .ObservabilityPipelineGoogleCloudStorageDestinationStorageClassSerializer.class)
public class ObservabilityPipelineGoogleCloudStorageDestinationStorageClass
    extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("STANDARD", "NEARLINE", "COLDLINE", "ARCHIVE"));

  public static final ObservabilityPipelineGoogleCloudStorageDestinationStorageClass STANDARD =
      new ObservabilityPipelineGoogleCloudStorageDestinationStorageClass("STANDARD");
  public static final ObservabilityPipelineGoogleCloudStorageDestinationStorageClass NEARLINE =
      new ObservabilityPipelineGoogleCloudStorageDestinationStorageClass("NEARLINE");
  public static final ObservabilityPipelineGoogleCloudStorageDestinationStorageClass COLDLINE =
      new ObservabilityPipelineGoogleCloudStorageDestinationStorageClass("COLDLINE");
  public static final ObservabilityPipelineGoogleCloudStorageDestinationStorageClass ARCHIVE =
      new ObservabilityPipelineGoogleCloudStorageDestinationStorageClass("ARCHIVE");

  ObservabilityPipelineGoogleCloudStorageDestinationStorageClass(String value) {
    super(value, allowedValues);
  }

  public static class ObservabilityPipelineGoogleCloudStorageDestinationStorageClassSerializer
      extends StdSerializer<ObservabilityPipelineGoogleCloudStorageDestinationStorageClass> {
    public ObservabilityPipelineGoogleCloudStorageDestinationStorageClassSerializer(
        Class<ObservabilityPipelineGoogleCloudStorageDestinationStorageClass> t) {
      super(t);
    }

    public ObservabilityPipelineGoogleCloudStorageDestinationStorageClassSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ObservabilityPipelineGoogleCloudStorageDestinationStorageClass value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ObservabilityPipelineGoogleCloudStorageDestinationStorageClass fromValue(
      String value) {
    return new ObservabilityPipelineGoogleCloudStorageDestinationStorageClass(value);
  }
}
