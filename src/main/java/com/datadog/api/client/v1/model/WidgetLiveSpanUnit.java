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

/** Unit of the time span. */
@JsonSerialize(using = WidgetLiveSpanUnit.WidgetLiveSpanUnitSerializer.class)
public class WidgetLiveSpanUnit extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("minute", "hour", "day", "week", "month", "year"));

  public static final WidgetLiveSpanUnit MINUTE = new WidgetLiveSpanUnit("minute");
  public static final WidgetLiveSpanUnit HOUR = new WidgetLiveSpanUnit("hour");
  public static final WidgetLiveSpanUnit DAY = new WidgetLiveSpanUnit("day");
  public static final WidgetLiveSpanUnit WEEK = new WidgetLiveSpanUnit("week");
  public static final WidgetLiveSpanUnit MONTH = new WidgetLiveSpanUnit("month");
  public static final WidgetLiveSpanUnit YEAR = new WidgetLiveSpanUnit("year");

  WidgetLiveSpanUnit(String value) {
    super(value, allowedValues);
  }

  public static class WidgetLiveSpanUnitSerializer extends StdSerializer<WidgetLiveSpanUnit> {
    public WidgetLiveSpanUnitSerializer(Class<WidgetLiveSpanUnit> t) {
      super(t);
    }

    public WidgetLiveSpanUnitSerializer() {
      this(null);
    }

    @Override
    public void serialize(WidgetLiveSpanUnit value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static WidgetLiveSpanUnit fromValue(String value) {
    return new WidgetLiveSpanUnit(value);
  }
}
