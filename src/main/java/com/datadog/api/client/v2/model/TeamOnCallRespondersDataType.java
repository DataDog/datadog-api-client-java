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
 * Represents the resource type for a group of users assigned to handle on-call duties within a
 * team.
 */
@JsonSerialize(using = TeamOnCallRespondersDataType.TeamOnCallRespondersDataTypeSerializer.class)
public class TeamOnCallRespondersDataType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("team_oncall_responders"));

  public static final TeamOnCallRespondersDataType TEAM_ONCALL_RESPONDERS =
      new TeamOnCallRespondersDataType("team_oncall_responders");

  TeamOnCallRespondersDataType(String value) {
    super(value, allowedValues);
  }

  public static class TeamOnCallRespondersDataTypeSerializer
      extends StdSerializer<TeamOnCallRespondersDataType> {
    public TeamOnCallRespondersDataTypeSerializer(Class<TeamOnCallRespondersDataType> t) {
      super(t);
    }

    public TeamOnCallRespondersDataTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        TeamOnCallRespondersDataType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static TeamOnCallRespondersDataType fromValue(String value) {
    return new TeamOnCallRespondersDataType(value);
  }
}
