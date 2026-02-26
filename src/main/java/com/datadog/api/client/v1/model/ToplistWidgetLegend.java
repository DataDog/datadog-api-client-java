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

/** Top list widget stacked legend behavior. */
@JsonSerialize(using = ToplistWidgetLegend.ToplistWidgetLegendSerializer.class)
public class ToplistWidgetLegend extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("automatic", "inline", "none"));

  public static final ToplistWidgetLegend AUTOMATIC = new ToplistWidgetLegend("automatic");
  public static final ToplistWidgetLegend INLINE = new ToplistWidgetLegend("inline");
  public static final ToplistWidgetLegend NONE = new ToplistWidgetLegend("none");

  ToplistWidgetLegend(String value) {
    super(value, allowedValues);
  }

  public static class ToplistWidgetLegendSerializer extends StdSerializer<ToplistWidgetLegend> {
    public ToplistWidgetLegendSerializer(Class<ToplistWidgetLegend> t) {
      super(t);
    }

    public ToplistWidgetLegendSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ToplistWidgetLegend value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ToplistWidgetLegend fromValue(String value) {
    return new ToplistWidgetLegend(value);
  }
}
