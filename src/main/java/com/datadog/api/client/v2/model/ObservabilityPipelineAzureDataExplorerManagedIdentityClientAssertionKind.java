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
        ObservabilityPipelineAzureDataExplorerManagedIdentityClientAssertionKind
            .ObservabilityPipelineAzureDataExplorerManagedIdentityClientAssertionKindSerializer
            .class)
public class ObservabilityPipelineAzureDataExplorerManagedIdentityClientAssertionKind
    extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("managed_identity_client_assertion"));

  public static final ObservabilityPipelineAzureDataExplorerManagedIdentityClientAssertionKind
      MANAGED_IDENTITY_CLIENT_ASSERTION =
          new ObservabilityPipelineAzureDataExplorerManagedIdentityClientAssertionKind(
              "managed_identity_client_assertion");

  ObservabilityPipelineAzureDataExplorerManagedIdentityClientAssertionKind(String value) {
    super(value, allowedValues);
  }

  public static
  class ObservabilityPipelineAzureDataExplorerManagedIdentityClientAssertionKindSerializer
      extends StdSerializer<
          ObservabilityPipelineAzureDataExplorerManagedIdentityClientAssertionKind> {
    public ObservabilityPipelineAzureDataExplorerManagedIdentityClientAssertionKindSerializer(
        Class<ObservabilityPipelineAzureDataExplorerManagedIdentityClientAssertionKind> t) {
      super(t);
    }

    public ObservabilityPipelineAzureDataExplorerManagedIdentityClientAssertionKindSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ObservabilityPipelineAzureDataExplorerManagedIdentityClientAssertionKind value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ObservabilityPipelineAzureDataExplorerManagedIdentityClientAssertionKind fromValue(
      String value) {
    return new ObservabilityPipelineAzureDataExplorerManagedIdentityClientAssertionKind(value);
  }
}
