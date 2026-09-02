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

/** Team membership type */
@JsonSerialize(using = UserTeamType.UserTeamTypeSerializer.class)
public class UserTeamType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("team_memberships"));

  public static final UserTeamType TEAM_MEMBERSHIPS = new UserTeamType("team_memberships");

  UserTeamType(String value) {
    super(value, allowedValues);
  }

  public static class UserTeamTypeSerializer extends StdSerializer<UserTeamType> {
    public UserTeamTypeSerializer(Class<UserTeamType> t) {
      super(t);
    }

    public UserTeamTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(UserTeamType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static UserTeamType fromValue(String value) {
    return new UserTeamType(value);
  }
}
