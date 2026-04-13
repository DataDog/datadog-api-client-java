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
    using = SecureEmbedViewingPreferencesTheme.SecureEmbedViewingPreferencesThemeSerializer.class)
public class SecureEmbedViewingPreferencesTheme extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("system", "light", "dark"));

  public static final SecureEmbedViewingPreferencesTheme SYSTEM =
      new SecureEmbedViewingPreferencesTheme("system");
  public static final SecureEmbedViewingPreferencesTheme LIGHT =
      new SecureEmbedViewingPreferencesTheme("light");
  public static final SecureEmbedViewingPreferencesTheme DARK =
      new SecureEmbedViewingPreferencesTheme("dark");

  SecureEmbedViewingPreferencesTheme(String value) {
    super(value, allowedValues);
  }

  public static class SecureEmbedViewingPreferencesThemeSerializer
      extends StdSerializer<SecureEmbedViewingPreferencesTheme> {
    public SecureEmbedViewingPreferencesThemeSerializer(
        Class<SecureEmbedViewingPreferencesTheme> t) {
      super(t);
    }

    public SecureEmbedViewingPreferencesThemeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SecureEmbedViewingPreferencesTheme value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SecureEmbedViewingPreferencesTheme fromValue(String value) {
    return new SecureEmbedViewingPreferencesTheme(value);
  }
}
