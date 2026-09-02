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

/** Define how you want to align the text on the widget. */
@JsonSerialize(using = WidgetTickEdge.WidgetTickEdgeSerializer.class)
public class WidgetTickEdge extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("bottom", "left", "right", "top"));

  public static final WidgetTickEdge BOTTOM = new WidgetTickEdge("bottom");
  public static final WidgetTickEdge LEFT = new WidgetTickEdge("left");
  public static final WidgetTickEdge RIGHT = new WidgetTickEdge("right");
  public static final WidgetTickEdge TOP = new WidgetTickEdge("top");

  WidgetTickEdge(String value) {
    super(value, allowedValues);
  }

  public static class WidgetTickEdgeSerializer extends StdSerializer<WidgetTickEdge> {
    public WidgetTickEdgeSerializer(Class<WidgetTickEdge> t) {
      super(t);
    }

    public WidgetTickEdgeSerializer() {
      this(null);
    }

    @Override
    public void serialize(WidgetTickEdge value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static WidgetTickEdge fromValue(String value) {
    return new WidgetTickEdge(value);
  }
}
