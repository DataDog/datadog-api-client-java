/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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

/** The theme of the shared dashboard view. "system" follows your system's default viewing theme. */
@JsonSerialize(using = ViewingPreferencesTheme.ViewingPreferencesThemeSerializer.class)
public class ViewingPreferencesTheme extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("system", "light", "dark"));

  public static final ViewingPreferencesTheme SYSTEM = new ViewingPreferencesTheme("system");
  public static final ViewingPreferencesTheme LIGHT = new ViewingPreferencesTheme("light");
  public static final ViewingPreferencesTheme DARK = new ViewingPreferencesTheme("dark");

  ViewingPreferencesTheme(String value) {
    super(value, allowedValues);
  }

  public static class ViewingPreferencesThemeSerializer
      extends StdSerializer<ViewingPreferencesTheme> {
    public ViewingPreferencesThemeSerializer(Class<ViewingPreferencesTheme> t) {
      super(t);
    }

    public ViewingPreferencesThemeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ViewingPreferencesTheme value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ViewingPreferencesTheme fromValue(String value) {
    return new ViewingPreferencesTheme(value);
  }
}
