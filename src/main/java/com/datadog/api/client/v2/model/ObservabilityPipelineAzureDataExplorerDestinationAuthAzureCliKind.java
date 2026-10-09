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

/** The Azure credential kind. The value should always be <code>azure_cli</code>. */
@JsonSerialize(
    using =
        ObservabilityPipelineAzureDataExplorerDestinationAuthAzureCliKind
            .ObservabilityPipelineAzureDataExplorerDestinationAuthAzureCliKindSerializer.class)
public class ObservabilityPipelineAzureDataExplorerDestinationAuthAzureCliKind
    extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("azure_cli"));

  public static final ObservabilityPipelineAzureDataExplorerDestinationAuthAzureCliKind AZURE_CLI =
      new ObservabilityPipelineAzureDataExplorerDestinationAuthAzureCliKind("azure_cli");

  ObservabilityPipelineAzureDataExplorerDestinationAuthAzureCliKind(String value) {
    super(value, allowedValues);
  }

  public static class ObservabilityPipelineAzureDataExplorerDestinationAuthAzureCliKindSerializer
      extends StdSerializer<ObservabilityPipelineAzureDataExplorerDestinationAuthAzureCliKind> {
    public ObservabilityPipelineAzureDataExplorerDestinationAuthAzureCliKindSerializer(
        Class<ObservabilityPipelineAzureDataExplorerDestinationAuthAzureCliKind> t) {
      super(t);
    }

    public ObservabilityPipelineAzureDataExplorerDestinationAuthAzureCliKindSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ObservabilityPipelineAzureDataExplorerDestinationAuthAzureCliKind value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ObservabilityPipelineAzureDataExplorerDestinationAuthAzureCliKind fromValue(
      String value) {
    return new ObservabilityPipelineAzureDataExplorerDestinationAuthAzureCliKind(value);
  }
}
