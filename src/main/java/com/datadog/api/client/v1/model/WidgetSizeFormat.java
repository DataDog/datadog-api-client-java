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

/** Size of the widget. */
@JsonSerialize(using = WidgetSizeFormat.WidgetSizeFormatSerializer.class)
public class WidgetSizeFormat extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("small", "medium", "large"));

  public static final WidgetSizeFormat SMALL = new WidgetSizeFormat("small");
  public static final WidgetSizeFormat MEDIUM = new WidgetSizeFormat("medium");
  public static final WidgetSizeFormat LARGE = new WidgetSizeFormat("large");

  WidgetSizeFormat(String value) {
    super(value, allowedValues);
  }

  public static class WidgetSizeFormatSerializer extends StdSerializer<WidgetSizeFormat> {
    public WidgetSizeFormatSerializer(Class<WidgetSizeFormat> t) {
      super(t);
    }

    public WidgetSizeFormatSerializer() {
      this(null);
    }

    @Override
    public void serialize(WidgetSizeFormat value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static WidgetSizeFormat fromValue(String value) {
    return new WidgetSizeFormat(value);
  }
}
