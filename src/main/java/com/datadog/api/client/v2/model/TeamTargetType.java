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

/** Indicates that the resource is of type <code>teams</code>. */
@JsonSerialize(using = TeamTargetType.TeamTargetTypeSerializer.class)
public class TeamTargetType extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("teams"));

  public static final TeamTargetType TEAMS = new TeamTargetType("teams");

  TeamTargetType(String value) {
    super(value, allowedValues);
  }

  public static class TeamTargetTypeSerializer extends StdSerializer<TeamTargetType> {
    public TeamTargetTypeSerializer(Class<TeamTargetType> t) {
      super(t);
    }

    public TeamTargetTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(TeamTargetType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static TeamTargetType fromValue(String value) {
    return new TeamTargetType(value);
  }
}
