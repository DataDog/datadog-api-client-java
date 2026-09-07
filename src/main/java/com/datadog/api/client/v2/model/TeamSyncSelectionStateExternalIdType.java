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
 * The type of external identifier for the selection state item. For GitHub synchronization, the
 * allowed values are <code>team</code> and <code>organization</code>.
 */
@JsonSerialize(
    using =
        TeamSyncSelectionStateExternalIdType.TeamSyncSelectionStateExternalIdTypeSerializer.class)
public class TeamSyncSelectionStateExternalIdType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("team", "organization"));

  public static final TeamSyncSelectionStateExternalIdType TEAM =
      new TeamSyncSelectionStateExternalIdType("team");
  public static final TeamSyncSelectionStateExternalIdType ORGANIZATION =
      new TeamSyncSelectionStateExternalIdType("organization");

  TeamSyncSelectionStateExternalIdType(String value) {
    super(value, allowedValues);
  }

  public static class TeamSyncSelectionStateExternalIdTypeSerializer
      extends StdSerializer<TeamSyncSelectionStateExternalIdType> {
    public TeamSyncSelectionStateExternalIdTypeSerializer(
        Class<TeamSyncSelectionStateExternalIdType> t) {
      super(t);
    }

    public TeamSyncSelectionStateExternalIdTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        TeamSyncSelectionStateExternalIdType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static TeamSyncSelectionStateExternalIdType fromValue(String value) {
    return new TeamSyncSelectionStateExternalIdType(value);
  }
}
