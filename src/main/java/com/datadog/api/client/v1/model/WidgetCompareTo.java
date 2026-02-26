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

/** Timeframe used for the change comparison. */
@JsonSerialize(using = WidgetCompareTo.WidgetCompareToSerializer.class)
public class WidgetCompareTo extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList("hour_before", "day_before", "week_before", "month_before"));

  public static final WidgetCompareTo HOUR_BEFORE = new WidgetCompareTo("hour_before");
  public static final WidgetCompareTo DAY_BEFORE = new WidgetCompareTo("day_before");
  public static final WidgetCompareTo WEEK_BEFORE = new WidgetCompareTo("week_before");
  public static final WidgetCompareTo MONTH_BEFORE = new WidgetCompareTo("month_before");

  WidgetCompareTo(String value) {
    super(value, allowedValues);
  }

  public static class WidgetCompareToSerializer extends StdSerializer<WidgetCompareTo> {
    public WidgetCompareToSerializer(Class<WidgetCompareTo> t) {
      super(t);
    }

    public WidgetCompareToSerializer() {
      this(null);
    }

    @Override
    public void serialize(WidgetCompareTo value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static WidgetCompareTo fromValue(String value) {
    return new WidgetCompareTo(value);
  }
}
