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

/** ECS deployment state, populated only for deployment failures. */
@JsonSerialize(
    using = RemediationDeploymentRolloutState.RemediationDeploymentRolloutStateSerializer.class)
public class RemediationDeploymentRolloutState extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("IN_PROGRESS", "COMPLETED", "FAILED"));

  public static final RemediationDeploymentRolloutState IN_PROGRESS =
      new RemediationDeploymentRolloutState("IN_PROGRESS");
  public static final RemediationDeploymentRolloutState COMPLETED =
      new RemediationDeploymentRolloutState("COMPLETED");
  public static final RemediationDeploymentRolloutState FAILED =
      new RemediationDeploymentRolloutState("FAILED");

  RemediationDeploymentRolloutState(String value) {
    super(value, allowedValues);
  }

  public static class RemediationDeploymentRolloutStateSerializer
      extends StdSerializer<RemediationDeploymentRolloutState> {
    public RemediationDeploymentRolloutStateSerializer(Class<RemediationDeploymentRolloutState> t) {
      super(t);
    }

    public RemediationDeploymentRolloutStateSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        RemediationDeploymentRolloutState value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static RemediationDeploymentRolloutState fromValue(String value) {
    return new RemediationDeploymentRolloutState(value);
  }
}
