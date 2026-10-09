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

/** The destination type. The value should always be <code>azure_data_explorer</code>. */
@JsonSerialize(
    using =
        ObservabilityPipelineAzureDataExplorerDestinationType
            .ObservabilityPipelineAzureDataExplorerDestinationTypeSerializer.class)
public class ObservabilityPipelineAzureDataExplorerDestinationType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("azure_data_explorer"));

  public static final ObservabilityPipelineAzureDataExplorerDestinationType AZURE_DATA_EXPLORER =
      new ObservabilityPipelineAzureDataExplorerDestinationType("azure_data_explorer");

  ObservabilityPipelineAzureDataExplorerDestinationType(String value) {
    super(value, allowedValues);
  }

  public static class ObservabilityPipelineAzureDataExplorerDestinationTypeSerializer
      extends StdSerializer<ObservabilityPipelineAzureDataExplorerDestinationType> {
    public ObservabilityPipelineAzureDataExplorerDestinationTypeSerializer(
        Class<ObservabilityPipelineAzureDataExplorerDestinationType> t) {
      super(t);
    }

    public ObservabilityPipelineAzureDataExplorerDestinationTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ObservabilityPipelineAzureDataExplorerDestinationType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ObservabilityPipelineAzureDataExplorerDestinationType fromValue(String value) {
    return new ObservabilityPipelineAzureDataExplorerDestinationType(value);
  }
}
