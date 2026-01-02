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

/** The destination type. The value should always be <code>cloud_prem</code>. */
@JsonSerialize(
    using =
        ObservabilityPipelineCloudPremDestinationType
            .ObservabilityPipelineCloudPremDestinationTypeSerializer.class)
public class ObservabilityPipelineCloudPremDestinationType extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("cloud_prem"));

  public static final ObservabilityPipelineCloudPremDestinationType CLOUD_PREM =
      new ObservabilityPipelineCloudPremDestinationType("cloud_prem");

  ObservabilityPipelineCloudPremDestinationType(String value) {
    super(value, allowedValues);
  }

  public static class ObservabilityPipelineCloudPremDestinationTypeSerializer
      extends StdSerializer<ObservabilityPipelineCloudPremDestinationType> {
    public ObservabilityPipelineCloudPremDestinationTypeSerializer(
        Class<ObservabilityPipelineCloudPremDestinationType> t) {
      super(t);
    }

    public ObservabilityPipelineCloudPremDestinationTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ObservabilityPipelineCloudPremDestinationType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ObservabilityPipelineCloudPremDestinationType fromValue(String value) {
    return new ObservabilityPipelineCloudPremDestinationType(value);
  }
}
