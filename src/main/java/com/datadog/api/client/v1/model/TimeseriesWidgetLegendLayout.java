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

/** Layout of the legend. */
@JsonSerialize(using = TimeseriesWidgetLegendLayout.TimeseriesWidgetLegendLayoutSerializer.class)
public class TimeseriesWidgetLegendLayout extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("auto", "horizontal", "vertical"));

  public static final TimeseriesWidgetLegendLayout AUTO = new TimeseriesWidgetLegendLayout("auto");
  public static final TimeseriesWidgetLegendLayout HORIZONTAL =
      new TimeseriesWidgetLegendLayout("horizontal");
  public static final TimeseriesWidgetLegendLayout VERTICAL =
      new TimeseriesWidgetLegendLayout("vertical");

  TimeseriesWidgetLegendLayout(String value) {
    super(value, allowedValues);
  }

  public static class TimeseriesWidgetLegendLayoutSerializer
      extends StdSerializer<TimeseriesWidgetLegendLayout> {
    public TimeseriesWidgetLegendLayoutSerializer(Class<TimeseriesWidgetLegendLayout> t) {
      super(t);
    }

    public TimeseriesWidgetLegendLayoutSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        TimeseriesWidgetLegendLayout value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static TimeseriesWidgetLegendLayout fromValue(String value) {
    return new TimeseriesWidgetLegendLayout(value);
  }
}
