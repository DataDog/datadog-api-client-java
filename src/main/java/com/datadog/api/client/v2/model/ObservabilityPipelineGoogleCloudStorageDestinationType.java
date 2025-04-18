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

/** The destination type. Always <code>google_cloud_storage</code>. */
@JsonSerialize(
    using =
        ObservabilityPipelineGoogleCloudStorageDestinationType
            .ObservabilityPipelineGoogleCloudStorageDestinationTypeSerializer.class)
public class ObservabilityPipelineGoogleCloudStorageDestinationType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("google_cloud_storage"));

  public static final ObservabilityPipelineGoogleCloudStorageDestinationType GOOGLE_CLOUD_STORAGE =
      new ObservabilityPipelineGoogleCloudStorageDestinationType("google_cloud_storage");

  ObservabilityPipelineGoogleCloudStorageDestinationType(String value) {
    super(value, allowedValues);
  }

  public static class ObservabilityPipelineGoogleCloudStorageDestinationTypeSerializer
      extends StdSerializer<ObservabilityPipelineGoogleCloudStorageDestinationType> {
    public ObservabilityPipelineGoogleCloudStorageDestinationTypeSerializer(
        Class<ObservabilityPipelineGoogleCloudStorageDestinationType> t) {
      super(t);
    }

    public ObservabilityPipelineGoogleCloudStorageDestinationTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ObservabilityPipelineGoogleCloudStorageDestinationType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ObservabilityPipelineGoogleCloudStorageDestinationType fromValue(String value) {
    return new ObservabilityPipelineGoogleCloudStorageDestinationType(value);
  }
}
