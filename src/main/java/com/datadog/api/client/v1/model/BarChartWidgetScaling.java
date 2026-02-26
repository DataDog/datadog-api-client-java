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

/** Bar chart widget scaling definition. */
@JsonSerialize(using = BarChartWidgetScaling.BarChartWidgetScalingSerializer.class)
public class BarChartWidgetScaling extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("absolute", "relative"));

  public static final BarChartWidgetScaling ABSOLUTE = new BarChartWidgetScaling("absolute");
  public static final BarChartWidgetScaling RELATIVE = new BarChartWidgetScaling("relative");

  BarChartWidgetScaling(String value) {
    super(value, allowedValues);
  }

  public static class BarChartWidgetScalingSerializer extends StdSerializer<BarChartWidgetScaling> {
    public BarChartWidgetScalingSerializer(Class<BarChartWidgetScaling> t) {
      super(t);
    }

    public BarChartWidgetScalingSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        BarChartWidgetScaling value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static BarChartWidgetScaling fromValue(String value) {
    return new BarChartWidgetScaling(value);
  }
}
