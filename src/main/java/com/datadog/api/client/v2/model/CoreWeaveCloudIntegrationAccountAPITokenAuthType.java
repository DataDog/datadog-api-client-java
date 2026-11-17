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

/** The authentication method type. */
@JsonSerialize(
    using =
        CoreWeaveCloudIntegrationAccountAPITokenAuthType
            .CoreWeaveCloudIntegrationAccountAPITokenAuthTypeSerializer.class)
public class CoreWeaveCloudIntegrationAccountAPITokenAuthType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("coreweave_api_token"));

  public static final CoreWeaveCloudIntegrationAccountAPITokenAuthType COREWEAVE_API_TOKEN =
      new CoreWeaveCloudIntegrationAccountAPITokenAuthType("coreweave_api_token");

  CoreWeaveCloudIntegrationAccountAPITokenAuthType(String value) {
    super(value, allowedValues);
  }

  public static class CoreWeaveCloudIntegrationAccountAPITokenAuthTypeSerializer
      extends StdSerializer<CoreWeaveCloudIntegrationAccountAPITokenAuthType> {
    public CoreWeaveCloudIntegrationAccountAPITokenAuthTypeSerializer(
        Class<CoreWeaveCloudIntegrationAccountAPITokenAuthType> t) {
      super(t);
    }

    public CoreWeaveCloudIntegrationAccountAPITokenAuthTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        CoreWeaveCloudIntegrationAccountAPITokenAuthType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static CoreWeaveCloudIntegrationAccountAPITokenAuthType fromValue(String value) {
    return new CoreWeaveCloudIntegrationAccountAPITokenAuthType(value);
  }
}
