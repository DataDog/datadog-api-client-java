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

/** The Azure credential kind. The value should always be <code>client_secret_credential</code>. */
@JsonSerialize(
    using =
        ObservabilityPipelineAzureDataExplorerDestinationAuthClientSecretKind
            .ObservabilityPipelineAzureDataExplorerDestinationAuthClientSecretKindSerializer.class)
public class ObservabilityPipelineAzureDataExplorerDestinationAuthClientSecretKind
    extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("client_secret_credential"));

  public static final ObservabilityPipelineAzureDataExplorerDestinationAuthClientSecretKind
      CLIENT_SECRET_CREDENTIAL =
          new ObservabilityPipelineAzureDataExplorerDestinationAuthClientSecretKind(
              "client_secret_credential");

  ObservabilityPipelineAzureDataExplorerDestinationAuthClientSecretKind(String value) {
    super(value, allowedValues);
  }

  public static
  class ObservabilityPipelineAzureDataExplorerDestinationAuthClientSecretKindSerializer
      extends StdSerializer<ObservabilityPipelineAzureDataExplorerDestinationAuthClientSecretKind> {
    public ObservabilityPipelineAzureDataExplorerDestinationAuthClientSecretKindSerializer(
        Class<ObservabilityPipelineAzureDataExplorerDestinationAuthClientSecretKind> t) {
      super(t);
    }

    public ObservabilityPipelineAzureDataExplorerDestinationAuthClientSecretKindSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ObservabilityPipelineAzureDataExplorerDestinationAuthClientSecretKind value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ObservabilityPipelineAzureDataExplorerDestinationAuthClientSecretKind fromValue(
      String value) {
    return new ObservabilityPipelineAzureDataExplorerDestinationAuthClientSecretKind(value);
  }
}
