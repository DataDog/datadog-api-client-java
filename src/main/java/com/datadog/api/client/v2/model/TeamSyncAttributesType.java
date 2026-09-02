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
 * The type of synchronization operation. "link" connects teams by matching names. "provision"
 * creates new teams when no match is found.
 */
@JsonSerialize(using = TeamSyncAttributesType.TeamSyncAttributesTypeSerializer.class)
public class TeamSyncAttributesType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("link", "provision"));

  public static final TeamSyncAttributesType LINK = new TeamSyncAttributesType("link");
  public static final TeamSyncAttributesType PROVISION = new TeamSyncAttributesType("provision");

  TeamSyncAttributesType(String value) {
    super(value, allowedValues);
  }

  public static class TeamSyncAttributesTypeSerializer
      extends StdSerializer<TeamSyncAttributesType> {
    public TeamSyncAttributesTypeSerializer(Class<TeamSyncAttributesType> t) {
      super(t);
    }

    public TeamSyncAttributesTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        TeamSyncAttributesType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static TeamSyncAttributesType fromValue(String value) {
    return new TeamSyncAttributesType(value);
  }
}
