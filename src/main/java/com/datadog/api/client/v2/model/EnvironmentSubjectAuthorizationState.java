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
 * Whether assignment requests for this environment require subject authorization. Allowed values
 * are <code>disabled</code> and <code>enabled</code>. Enabling requires a provider ID formatted as
 * a nonzero UUID. If omitted on create, defaults to <code>disabled</code>. If omitted on update,
 * the stored state is preserved. <code>null</code> is not accepted. This setting applies only to
 * the current Datadog site and is not copied to other sites. Before you enable it, configure an
 * eligible Custom OIDC provider in the same organization and site, and verify that the provider's
 * keys are published. Assignment requests fail when the required verification configuration is
 * unavailable.
 */
@JsonSerialize(
    using =
        EnvironmentSubjectAuthorizationState.EnvironmentSubjectAuthorizationStateSerializer.class)
public class EnvironmentSubjectAuthorizationState extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("disabled", "enabled"));

  public static final EnvironmentSubjectAuthorizationState DISABLED =
      new EnvironmentSubjectAuthorizationState("disabled");
  public static final EnvironmentSubjectAuthorizationState ENABLED =
      new EnvironmentSubjectAuthorizationState("enabled");

  EnvironmentSubjectAuthorizationState(String value) {
    super(value, allowedValues);
  }

  public static class EnvironmentSubjectAuthorizationStateSerializer
      extends StdSerializer<EnvironmentSubjectAuthorizationState> {
    public EnvironmentSubjectAuthorizationStateSerializer(
        Class<EnvironmentSubjectAuthorizationState> t) {
      super(t);
    }

    public EnvironmentSubjectAuthorizationStateSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        EnvironmentSubjectAuthorizationState value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static EnvironmentSubjectAuthorizationState fromValue(String value) {
    return new EnvironmentSubjectAuthorizationState(value);
  }
}
