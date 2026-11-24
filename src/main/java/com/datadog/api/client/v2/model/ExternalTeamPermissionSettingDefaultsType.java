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

/** Resource type for external team permission setting defaults. */
@JsonSerialize(
    using =
        ExternalTeamPermissionSettingDefaultsType
            .ExternalTeamPermissionSettingDefaultsTypeSerializer.class)
public class ExternalTeamPermissionSettingDefaultsType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("external_team_permission_setting_defaults"));

  public static final ExternalTeamPermissionSettingDefaultsType
      EXTERNAL_TEAM_PERMISSION_SETTING_DEFAULTS =
          new ExternalTeamPermissionSettingDefaultsType(
              "external_team_permission_setting_defaults");

  ExternalTeamPermissionSettingDefaultsType(String value) {
    super(value, allowedValues);
  }

  public static class ExternalTeamPermissionSettingDefaultsTypeSerializer
      extends StdSerializer<ExternalTeamPermissionSettingDefaultsType> {
    public ExternalTeamPermissionSettingDefaultsTypeSerializer(
        Class<ExternalTeamPermissionSettingDefaultsType> t) {
      super(t);
    }

    public ExternalTeamPermissionSettingDefaultsTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ExternalTeamPermissionSettingDefaultsType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ExternalTeamPermissionSettingDefaultsType fromValue(String value) {
    return new ExternalTeamPermissionSettingDefaultsType(value);
  }
}
