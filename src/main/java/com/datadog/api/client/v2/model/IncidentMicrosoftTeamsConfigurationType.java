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

/** Microsoft Teams configuration resource type. */
@JsonSerialize(
    using =
        IncidentMicrosoftTeamsConfigurationType.IncidentMicrosoftTeamsConfigurationTypeSerializer
            .class)
public class IncidentMicrosoftTeamsConfigurationType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("microsoft_teams_configurations"));

  public static final IncidentMicrosoftTeamsConfigurationType MICROSOFT_TEAMS_CONFIGURATIONS =
      new IncidentMicrosoftTeamsConfigurationType("microsoft_teams_configurations");

  IncidentMicrosoftTeamsConfigurationType(String value) {
    super(value, allowedValues);
  }

  public static class IncidentMicrosoftTeamsConfigurationTypeSerializer
      extends StdSerializer<IncidentMicrosoftTeamsConfigurationType> {
    public IncidentMicrosoftTeamsConfigurationTypeSerializer(
        Class<IncidentMicrosoftTeamsConfigurationType> t) {
      super(t);
    }

    public IncidentMicrosoftTeamsConfigurationTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        IncidentMicrosoftTeamsConfigurationType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static IncidentMicrosoftTeamsConfigurationType fromValue(String value) {
    return new IncidentMicrosoftTeamsConfigurationType(value);
  }
}
