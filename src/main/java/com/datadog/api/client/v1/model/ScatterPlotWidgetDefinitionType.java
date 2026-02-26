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

/** Type of the scatter plot widget. */
@JsonSerialize(
    using = ScatterPlotWidgetDefinitionType.ScatterPlotWidgetDefinitionTypeSerializer.class)
public class ScatterPlotWidgetDefinitionType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("scatterplot"));

  public static final ScatterPlotWidgetDefinitionType SCATTERPLOT =
      new ScatterPlotWidgetDefinitionType("scatterplot");

  ScatterPlotWidgetDefinitionType(String value) {
    super(value, allowedValues);
  }

  public static class ScatterPlotWidgetDefinitionTypeSerializer
      extends StdSerializer<ScatterPlotWidgetDefinitionType> {
    public ScatterPlotWidgetDefinitionTypeSerializer(Class<ScatterPlotWidgetDefinitionType> t) {
      super(t);
    }

    public ScatterPlotWidgetDefinitionTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ScatterPlotWidgetDefinitionType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ScatterPlotWidgetDefinitionType fromValue(String value) {
    return new ScatterPlotWidgetDefinitionType(value);
  }
}
