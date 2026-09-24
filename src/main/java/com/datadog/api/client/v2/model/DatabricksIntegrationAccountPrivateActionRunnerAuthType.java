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
        DatabricksIntegrationAccountPrivateActionRunnerAuthType
            .DatabricksIntegrationAccountPrivateActionRunnerAuthTypeSerializer.class)
public class DatabricksIntegrationAccountPrivateActionRunnerAuthType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("private_action_runner"));

  public static final DatabricksIntegrationAccountPrivateActionRunnerAuthType
      PRIVATE_ACTION_RUNNER =
          new DatabricksIntegrationAccountPrivateActionRunnerAuthType("private_action_runner");

  DatabricksIntegrationAccountPrivateActionRunnerAuthType(String value) {
    super(value, allowedValues);
  }

  public static class DatabricksIntegrationAccountPrivateActionRunnerAuthTypeSerializer
      extends StdSerializer<DatabricksIntegrationAccountPrivateActionRunnerAuthType> {
    public DatabricksIntegrationAccountPrivateActionRunnerAuthTypeSerializer(
        Class<DatabricksIntegrationAccountPrivateActionRunnerAuthType> t) {
      super(t);
    }

    public DatabricksIntegrationAccountPrivateActionRunnerAuthTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        DatabricksIntegrationAccountPrivateActionRunnerAuthType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static DatabricksIntegrationAccountPrivateActionRunnerAuthType fromValue(String value) {
    return new DatabricksIntegrationAccountPrivateActionRunnerAuthType(value);
  }
}
