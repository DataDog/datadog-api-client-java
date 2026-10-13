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

/** The type of the user-assigned managed identity ID. */
@JsonSerialize(
    using =
        ObservabilityPipelineAzureDataExplorerDestinationManagedIdentityIdType
            .ObservabilityPipelineAzureDataExplorerDestinationManagedIdentityIdTypeSerializer.class)
public class ObservabilityPipelineAzureDataExplorerDestinationManagedIdentityIdType
    extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("client_id", "object_id", "resource_id"));

  public static final ObservabilityPipelineAzureDataExplorerDestinationManagedIdentityIdType
      CLIENT_ID =
          new ObservabilityPipelineAzureDataExplorerDestinationManagedIdentityIdType("client_id");
  public static final ObservabilityPipelineAzureDataExplorerDestinationManagedIdentityIdType
      OBJECT_ID =
          new ObservabilityPipelineAzureDataExplorerDestinationManagedIdentityIdType("object_id");
  public static final ObservabilityPipelineAzureDataExplorerDestinationManagedIdentityIdType
      RESOURCE_ID =
          new ObservabilityPipelineAzureDataExplorerDestinationManagedIdentityIdType("resource_id");

  ObservabilityPipelineAzureDataExplorerDestinationManagedIdentityIdType(String value) {
    super(value, allowedValues);
  }

  public static
  class ObservabilityPipelineAzureDataExplorerDestinationManagedIdentityIdTypeSerializer
      extends StdSerializer<
          ObservabilityPipelineAzureDataExplorerDestinationManagedIdentityIdType> {
    public ObservabilityPipelineAzureDataExplorerDestinationManagedIdentityIdTypeSerializer(
        Class<ObservabilityPipelineAzureDataExplorerDestinationManagedIdentityIdType> t) {
      super(t);
    }

    public ObservabilityPipelineAzureDataExplorerDestinationManagedIdentityIdTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ObservabilityPipelineAzureDataExplorerDestinationManagedIdentityIdType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ObservabilityPipelineAzureDataExplorerDestinationManagedIdentityIdType fromValue(
      String value) {
    return new ObservabilityPipelineAzureDataExplorerDestinationManagedIdentityIdType(value);
  }
}
