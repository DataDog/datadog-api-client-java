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

/** Type of the bar chart widget. */
@JsonSerialize(using = BarChartWidgetDefinitionType.BarChartWidgetDefinitionTypeSerializer.class)
public class BarChartWidgetDefinitionType extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("bar_chart"));

  public static final BarChartWidgetDefinitionType BAR_CHART =
      new BarChartWidgetDefinitionType("bar_chart");

  BarChartWidgetDefinitionType(String value) {
    super(value, allowedValues);
  }

  public static class BarChartWidgetDefinitionTypeSerializer
      extends StdSerializer<BarChartWidgetDefinitionType> {
    public BarChartWidgetDefinitionTypeSerializer(Class<BarChartWidgetDefinitionType> t) {
      super(t);
    }

    public BarChartWidgetDefinitionTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        BarChartWidgetDefinitionType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static BarChartWidgetDefinitionType fromValue(String value) {
    return new BarChartWidgetDefinitionType(value);
  }
}
