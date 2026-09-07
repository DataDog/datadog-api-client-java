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

/** Type of lines displayed. */
@JsonSerialize(using = WidgetLineType.WidgetLineTypeSerializer.class)
public class WidgetLineType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("dashed", "dotted", "solid"));

  public static final WidgetLineType DASHED = new WidgetLineType("dashed");
  public static final WidgetLineType DOTTED = new WidgetLineType("dotted");
  public static final WidgetLineType SOLID = new WidgetLineType("solid");

  WidgetLineType(String value) {
    super(value, allowedValues);
  }

  public static class WidgetLineTypeSerializer extends StdSerializer<WidgetLineType> {
    public WidgetLineTypeSerializer(Class<WidgetLineType> t) {
      super(t);
    }

    public WidgetLineTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(WidgetLineType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static WidgetLineType fromValue(String value) {
    return new WidgetLineType(value);
  }
}
