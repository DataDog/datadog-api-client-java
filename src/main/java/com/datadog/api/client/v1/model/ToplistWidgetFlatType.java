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

/** Top list widget flat display type. */
@JsonSerialize(using = ToplistWidgetFlatType.ToplistWidgetFlatTypeSerializer.class)
public class ToplistWidgetFlatType extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("flat"));

  public static final ToplistWidgetFlatType FLAT = new ToplistWidgetFlatType("flat");

  ToplistWidgetFlatType(String value) {
    super(value, allowedValues);
  }

  public static class ToplistWidgetFlatTypeSerializer extends StdSerializer<ToplistWidgetFlatType> {
    public ToplistWidgetFlatTypeSerializer(Class<ToplistWidgetFlatType> t) {
      super(t);
    }

    public ToplistWidgetFlatTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ToplistWidgetFlatType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ToplistWidgetFlatType fromValue(String value) {
    return new ToplistWidgetFlatType(value);
  }
}
