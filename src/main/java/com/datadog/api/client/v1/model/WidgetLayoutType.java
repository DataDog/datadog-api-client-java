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

/** Layout type of the group. */
@JsonSerialize(using = WidgetLayoutType.WidgetLayoutTypeSerializer.class)
public class WidgetLayoutType extends ModelEnum<String> {

  public static final WidgetLayoutType ORDERED = new WidgetLayoutType("ordered");

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("ordered"));

  WidgetLayoutType(String value) {
    this.value = value;
    this.localAllowedValues = allowedValues;
  }

  public static class WidgetLayoutTypeSerializer extends StdSerializer<WidgetLayoutType> {
    public WidgetLayoutTypeSerializer(Class<WidgetLayoutType> t) {
      super(t);
    }

    public WidgetLayoutTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(WidgetLayoutType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static WidgetLayoutType fromValue(String value) {
    return new WidgetLayoutType(value);
  }
}
