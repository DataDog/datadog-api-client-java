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

/** Which color to use on the widget. */
@JsonSerialize(using = WidgetColorPreference.WidgetColorPreferenceSerializer.class)
public class WidgetColorPreference extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("background", "text"));

  public static final WidgetColorPreference BACKGROUND = new WidgetColorPreference("background");
  public static final WidgetColorPreference TEXT = new WidgetColorPreference("text");

  WidgetColorPreference(String value) {
    super(value, allowedValues);
  }

  public static class WidgetColorPreferenceSerializer extends StdSerializer<WidgetColorPreference> {
    public WidgetColorPreferenceSerializer(Class<WidgetColorPreference> t) {
      super(t);
    }

    public WidgetColorPreferenceSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        WidgetColorPreference value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static WidgetColorPreference fromValue(String value) {
    return new WidgetColorPreference(value);
  }
}
