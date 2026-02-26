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

/** Horizontal alignment. */
@JsonSerialize(using = WidgetHorizontalAlign.WidgetHorizontalAlignSerializer.class)
public class WidgetHorizontalAlign extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("center", "left", "right"));

  public static final WidgetHorizontalAlign CENTER = new WidgetHorizontalAlign("center");
  public static final WidgetHorizontalAlign LEFT = new WidgetHorizontalAlign("left");
  public static final WidgetHorizontalAlign RIGHT = new WidgetHorizontalAlign("right");

  WidgetHorizontalAlign(String value) {
    super(value, allowedValues);
  }

  public static class WidgetHorizontalAlignSerializer extends StdSerializer<WidgetHorizontalAlign> {
    public WidgetHorizontalAlignSerializer(Class<WidgetHorizontalAlign> t) {
      super(t);
    }

    public WidgetHorizontalAlignSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        WidgetHorizontalAlign value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static WidgetHorizontalAlign fromValue(String value) {
    return new WidgetHorizontalAlign(value);
  }
}
