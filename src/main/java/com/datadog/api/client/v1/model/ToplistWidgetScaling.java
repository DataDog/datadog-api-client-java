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

/** Top list widget scaling definition. */
@JsonSerialize(using = ToplistWidgetScaling.ToplistWidgetScalingSerializer.class)
public class ToplistWidgetScaling extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("absolute", "relative"));

  public static final ToplistWidgetScaling ABSOLUTE = new ToplistWidgetScaling("absolute");
  public static final ToplistWidgetScaling RELATIVE = new ToplistWidgetScaling("relative");

  ToplistWidgetScaling(String value) {
    super(value, allowedValues);
  }

  public static class ToplistWidgetScalingSerializer extends StdSerializer<ToplistWidgetScaling> {
    public ToplistWidgetScalingSerializer(Class<ToplistWidgetScaling> t) {
      super(t);
    }

    public ToplistWidgetScalingSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ToplistWidgetScaling value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ToplistWidgetScaling fromValue(String value) {
    return new ToplistWidgetScaling(value);
  }
}
