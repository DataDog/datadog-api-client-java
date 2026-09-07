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

/** How often the sync process should be run. Defaults to <code>once</code> when not provided. */
@JsonSerialize(using = TeamSyncAttributesFrequency.TeamSyncAttributesFrequencySerializer.class)
public class TeamSyncAttributesFrequency extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("once", "continuously", "paused"));

  public static final TeamSyncAttributesFrequency ONCE = new TeamSyncAttributesFrequency("once");
  public static final TeamSyncAttributesFrequency CONTINUOUSLY =
      new TeamSyncAttributesFrequency("continuously");
  public static final TeamSyncAttributesFrequency PAUSED =
      new TeamSyncAttributesFrequency("paused");

  TeamSyncAttributesFrequency(String value) {
    super(value, allowedValues);
  }

  public static class TeamSyncAttributesFrequencySerializer
      extends StdSerializer<TeamSyncAttributesFrequency> {
    public TeamSyncAttributesFrequencySerializer(Class<TeamSyncAttributesFrequency> t) {
      super(t);
    }

    public TeamSyncAttributesFrequencySerializer() {
      this(null);
    }

    @Override
    public void serialize(
        TeamSyncAttributesFrequency value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static TeamSyncAttributesFrequency fromValue(String value) {
    return new TeamSyncAttributesFrequency(value);
  }
}
