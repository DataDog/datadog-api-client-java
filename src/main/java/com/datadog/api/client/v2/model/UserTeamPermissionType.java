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

/** User team permission type */
@JsonSerialize(using = UserTeamPermissionType.UserTeamPermissionTypeSerializer.class)
public class UserTeamPermissionType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("user_team_permissions"));

  public static final UserTeamPermissionType USER_TEAM_PERMISSIONS =
      new UserTeamPermissionType("user_team_permissions");

  UserTeamPermissionType(String value) {
    super(value, allowedValues);
  }

  public static class UserTeamPermissionTypeSerializer
      extends StdSerializer<UserTeamPermissionType> {
    public UserTeamPermissionTypeSerializer(Class<UserTeamPermissionType> t) {
      super(t);
    }

    public UserTeamPermissionTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        UserTeamPermissionType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static UserTeamPermissionType fromValue(String value) {
    return new UserTeamPermissionType(value);
  }
}
