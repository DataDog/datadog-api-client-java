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

/** Show the absolute or the relative change. */
@JsonSerialize(using = WidgetChangeType.WidgetChangeTypeSerializer.class)
public class WidgetChangeType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("absolute", "relative"));

  public static final WidgetChangeType ABSOLUTE = new WidgetChangeType("absolute");
  public static final WidgetChangeType RELATIVE = new WidgetChangeType("relative");

  WidgetChangeType(String value) {
    super(value, allowedValues);
  }

  public static class WidgetChangeTypeSerializer extends StdSerializer<WidgetChangeType> {
    public WidgetChangeTypeSerializer(Class<WidgetChangeType> t) {
      super(t);
    }

    public WidgetChangeTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(WidgetChangeType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static WidgetChangeType fromValue(String value) {
    return new WidgetChangeType(value);
  }
}
