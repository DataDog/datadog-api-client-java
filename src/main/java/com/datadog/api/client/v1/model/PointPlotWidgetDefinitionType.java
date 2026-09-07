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

/** Type of the point plot widget. */
@JsonSerialize(using = PointPlotWidgetDefinitionType.PointPlotWidgetDefinitionTypeSerializer.class)
public class PointPlotWidgetDefinitionType extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("point_plot"));

  public static final PointPlotWidgetDefinitionType POINT_PLOT =
      new PointPlotWidgetDefinitionType("point_plot");

  PointPlotWidgetDefinitionType(String value) {
    super(value, allowedValues);
  }

  public static class PointPlotWidgetDefinitionTypeSerializer
      extends StdSerializer<PointPlotWidgetDefinitionType> {
    public PointPlotWidgetDefinitionTypeSerializer(Class<PointPlotWidgetDefinitionType> t) {
      super(t);
    }

    public PointPlotWidgetDefinitionTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        PointPlotWidgetDefinitionType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static PointPlotWidgetDefinitionType fromValue(String value) {
    return new PointPlotWidgetDefinitionType(value);
  }
}
