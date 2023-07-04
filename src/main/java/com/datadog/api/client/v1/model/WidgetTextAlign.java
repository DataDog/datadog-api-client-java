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

/** How to align the text on the widget. */
@JsonSerialize(using = WidgetTextAlign.WidgetTextAlignSerializer.class)
public class WidgetTextAlign extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("center", "left", "right"));

  public static final WidgetTextAlign CENTER = new WidgetTextAlign("center");
  public static final WidgetTextAlign LEFT = new WidgetTextAlign("left");
  public static final WidgetTextAlign RIGHT = new WidgetTextAlign("right");

  WidgetTextAlign(String value) {
    super(value, allowedValues);
  }

  public static class WidgetTextAlignSerializer extends StdSerializer<WidgetTextAlign> {
    public WidgetTextAlignSerializer(Class<WidgetTextAlign> t) {
      super(t);
    }

    public WidgetTextAlignSerializer() {
      this(null);
    }

    @Override
    public void serialize(WidgetTextAlign value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static WidgetTextAlign fromValue(String value) {
    return new WidgetTextAlign(value);
  }
}
