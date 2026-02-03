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

/** The state of the investigation. */
@JsonSerialize(
    using =
        SecurityMonitoringSignalInvestigationState
            .SecurityMonitoringSignalInvestigationStateSerializer.class)
public class SecurityMonitoringSignalInvestigationState extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("investigating", "completed"));

  public static final SecurityMonitoringSignalInvestigationState INVESTIGATING =
      new SecurityMonitoringSignalInvestigationState("investigating");
  public static final SecurityMonitoringSignalInvestigationState COMPLETED =
      new SecurityMonitoringSignalInvestigationState("completed");

  SecurityMonitoringSignalInvestigationState(String value) {
    super(value, allowedValues);
  }

  public static class SecurityMonitoringSignalInvestigationStateSerializer
      extends StdSerializer<SecurityMonitoringSignalInvestigationState> {
    public SecurityMonitoringSignalInvestigationStateSerializer(
        Class<SecurityMonitoringSignalInvestigationState> t) {
      super(t);
    }

    public SecurityMonitoringSignalInvestigationStateSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SecurityMonitoringSignalInvestigationState value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SecurityMonitoringSignalInvestigationState fromValue(String value) {
    return new SecurityMonitoringSignalInvestigationState(value);
  }
}
