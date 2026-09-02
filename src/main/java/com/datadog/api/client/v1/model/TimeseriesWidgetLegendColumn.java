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

/** Legend column. */
@JsonSerialize(using = TimeseriesWidgetLegendColumn.TimeseriesWidgetLegendColumnSerializer.class)
public class TimeseriesWidgetLegendColumn extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("value", "avg", "sum", "min", "max"));

  public static final TimeseriesWidgetLegendColumn VALUE =
      new TimeseriesWidgetLegendColumn("value");
  public static final TimeseriesWidgetLegendColumn AVG = new TimeseriesWidgetLegendColumn("avg");
  public static final TimeseriesWidgetLegendColumn SUM = new TimeseriesWidgetLegendColumn("sum");
  public static final TimeseriesWidgetLegendColumn MIN = new TimeseriesWidgetLegendColumn("min");
  public static final TimeseriesWidgetLegendColumn MAX = new TimeseriesWidgetLegendColumn("max");

  TimeseriesWidgetLegendColumn(String value) {
    super(value, allowedValues);
  }

  public static class TimeseriesWidgetLegendColumnSerializer
      extends StdSerializer<TimeseriesWidgetLegendColumn> {
    public TimeseriesWidgetLegendColumnSerializer(Class<TimeseriesWidgetLegendColumn> t) {
      super(t);
    }

    public TimeseriesWidgetLegendColumnSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        TimeseriesWidgetLegendColumn value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static TimeseriesWidgetLegendColumn fromValue(String value) {
    return new TimeseriesWidgetLegendColumn(value);
  }
}
