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

/** The state of the credentials configured on the entity context sync. */
@JsonSerialize(
    using =
        SecurityMonitoringIntegrationConfigState.SecurityMonitoringIntegrationConfigStateSerializer
            .class)
public class SecurityMonitoringIntegrationConfigState extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("valid", "invalid", "initializing"));

  public static final SecurityMonitoringIntegrationConfigState VALID =
      new SecurityMonitoringIntegrationConfigState("valid");
  public static final SecurityMonitoringIntegrationConfigState INVALID =
      new SecurityMonitoringIntegrationConfigState("invalid");
  public static final SecurityMonitoringIntegrationConfigState INITIALIZING =
      new SecurityMonitoringIntegrationConfigState("initializing");

  SecurityMonitoringIntegrationConfigState(String value) {
    super(value, allowedValues);
  }

  public static class SecurityMonitoringIntegrationConfigStateSerializer
      extends StdSerializer<SecurityMonitoringIntegrationConfigState> {
    public SecurityMonitoringIntegrationConfigStateSerializer(
        Class<SecurityMonitoringIntegrationConfigState> t) {
      super(t);
    }

    public SecurityMonitoringIntegrationConfigStateSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SecurityMonitoringIntegrationConfigState value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SecurityMonitoringIntegrationConfigState fromValue(String value) {
    return new SecurityMonitoringIntegrationConfigState(value);
  }
}
