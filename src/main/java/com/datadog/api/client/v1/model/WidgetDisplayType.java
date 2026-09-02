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

/** Type of display to use for the request. */
@JsonSerialize(using = WidgetDisplayType.WidgetDisplayTypeSerializer.class)
public class WidgetDisplayType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("area", "bars", "line", "overlay"));

  public static final WidgetDisplayType AREA = new WidgetDisplayType("area");
  public static final WidgetDisplayType BARS = new WidgetDisplayType("bars");
  public static final WidgetDisplayType LINE = new WidgetDisplayType("line");
  public static final WidgetDisplayType OVERLAY = new WidgetDisplayType("overlay");

  WidgetDisplayType(String value) {
    super(value, allowedValues);
  }

  public static class WidgetDisplayTypeSerializer extends StdSerializer<WidgetDisplayType> {
    public WidgetDisplayTypeSerializer(Class<WidgetDisplayType> t) {
      super(t);
    }

    public WidgetDisplayTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(WidgetDisplayType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static WidgetDisplayType fromValue(String value) {
    return new WidgetDisplayType(value);
  }
}
