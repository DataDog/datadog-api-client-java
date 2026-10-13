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

/**
 * The Azure credential kind. The value should always be <code>managed_identity_client_assertion
 * </code>.
 */
@JsonSerialize(
    using =
        ObservabilityPipelineAzureDataExplorerDestinationAuthManagedIdentityClientAssertionKind
            .ObservabilityPipelineAzureDataExplorerDestinationAuthManagedIdentityClientAssertionKindSerializer
            .class)
public class ObservabilityPipelineAzureDataExplorerDestinationAuthManagedIdentityClientAssertionKind
    extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("managed_identity_client_assertion"));

  public static final
  ObservabilityPipelineAzureDataExplorerDestinationAuthManagedIdentityClientAssertionKind
      MANAGED_IDENTITY_CLIENT_ASSERTION =
          new ObservabilityPipelineAzureDataExplorerDestinationAuthManagedIdentityClientAssertionKind(
              "managed_identity_client_assertion");

  ObservabilityPipelineAzureDataExplorerDestinationAuthManagedIdentityClientAssertionKind(
      String value) {
    super(value, allowedValues);
  }

  public static
  class ObservabilityPipelineAzureDataExplorerDestinationAuthManagedIdentityClientAssertionKindSerializer
      extends StdSerializer<
          ObservabilityPipelineAzureDataExplorerDestinationAuthManagedIdentityClientAssertionKind> {
    public
    ObservabilityPipelineAzureDataExplorerDestinationAuthManagedIdentityClientAssertionKindSerializer(
        Class<
                ObservabilityPipelineAzureDataExplorerDestinationAuthManagedIdentityClientAssertionKind>
            t) {
      super(t);
    }

    public
    ObservabilityPipelineAzureDataExplorerDestinationAuthManagedIdentityClientAssertionKindSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ObservabilityPipelineAzureDataExplorerDestinationAuthManagedIdentityClientAssertionKind
            value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static
  ObservabilityPipelineAzureDataExplorerDestinationAuthManagedIdentityClientAssertionKind fromValue(
      String value) {
    return new ObservabilityPipelineAzureDataExplorerDestinationAuthManagedIdentityClientAssertionKind(
        value);
  }
}
