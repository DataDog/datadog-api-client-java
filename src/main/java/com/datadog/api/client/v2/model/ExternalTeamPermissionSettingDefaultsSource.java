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

/** The external integration source for the permission setting default. */
@JsonSerialize(
    using =
        ExternalTeamPermissionSettingDefaultsSource
            .ExternalTeamPermissionSettingDefaultsSourceSerializer.class)
public class ExternalTeamPermissionSettingDefaultsSource extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("github", "scim", "servicenow"));

  public static final ExternalTeamPermissionSettingDefaultsSource GITHUB =
      new ExternalTeamPermissionSettingDefaultsSource("github");
  public static final ExternalTeamPermissionSettingDefaultsSource SCIM =
      new ExternalTeamPermissionSettingDefaultsSource("scim");
  public static final ExternalTeamPermissionSettingDefaultsSource SERVICENOW =
      new ExternalTeamPermissionSettingDefaultsSource("servicenow");

  ExternalTeamPermissionSettingDefaultsSource(String value) {
    super(value, allowedValues);
  }

  public static class ExternalTeamPermissionSettingDefaultsSourceSerializer
      extends StdSerializer<ExternalTeamPermissionSettingDefaultsSource> {
    public ExternalTeamPermissionSettingDefaultsSourceSerializer(
        Class<ExternalTeamPermissionSettingDefaultsSource> t) {
      super(t);
    }

    public ExternalTeamPermissionSettingDefaultsSourceSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ExternalTeamPermissionSettingDefaultsSource value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ExternalTeamPermissionSettingDefaultsSource fromValue(String value) {
    return new ExternalTeamPermissionSettingDefaultsSource(value);
  }
}
