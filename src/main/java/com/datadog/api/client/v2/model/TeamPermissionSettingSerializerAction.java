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

/** The identifier for the action */
@JsonSerialize(
    using =
        TeamPermissionSettingSerializerAction.TeamPermissionSettingSerializerActionSerializer.class)
public class TeamPermissionSettingSerializerAction extends ModelEnum<String> {

  public static final TeamPermissionSettingSerializerAction MANAGE_MEMBERSHIP =
      new TeamPermissionSettingSerializerAction("manage_membership");
  public static final TeamPermissionSettingSerializerAction EDIT =
      new TeamPermissionSettingSerializerAction("edit");

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("manage_membership", "edit"));

  TeamPermissionSettingSerializerAction(String value) {
    this.value = value;
    this.localAllowedValues = allowedValues;
  }

  public static class TeamPermissionSettingSerializerActionSerializer
      extends StdSerializer<TeamPermissionSettingSerializerAction> {
    public TeamPermissionSettingSerializerActionSerializer(
        Class<TeamPermissionSettingSerializerAction> t) {
      super(t);
    }

    public TeamPermissionSettingSerializerActionSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        TeamPermissionSettingSerializerAction value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static TeamPermissionSettingSerializerAction fromValue(String value) {
    return new TeamPermissionSettingSerializerAction(value);
  }
}
