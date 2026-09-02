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
 * The theme of the shared dashboard view. <code>system</code> follows the viewer's system default.
 */
@JsonSerialize(
    using =
        SharedDashboardViewingPreferencesTheme.SharedDashboardViewingPreferencesThemeSerializer
            .class)
public class SharedDashboardViewingPreferencesTheme extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("system", "light", "dark"));

  public static final SharedDashboardViewingPreferencesTheme SYSTEM =
      new SharedDashboardViewingPreferencesTheme("system");
  public static final SharedDashboardViewingPreferencesTheme LIGHT =
      new SharedDashboardViewingPreferencesTheme("light");
  public static final SharedDashboardViewingPreferencesTheme DARK =
      new SharedDashboardViewingPreferencesTheme("dark");

  SharedDashboardViewingPreferencesTheme(String value) {
    super(value, allowedValues);
  }

  public static class SharedDashboardViewingPreferencesThemeSerializer
      extends StdSerializer<SharedDashboardViewingPreferencesTheme> {
    public SharedDashboardViewingPreferencesThemeSerializer(
        Class<SharedDashboardViewingPreferencesTheme> t) {
      super(t);
    }

    public SharedDashboardViewingPreferencesThemeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SharedDashboardViewingPreferencesTheme value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SharedDashboardViewingPreferencesTheme fromValue(String value) {
    return new SharedDashboardViewingPreferencesTheme(value);
  }
}
