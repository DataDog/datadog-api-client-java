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

/** Bar chart widget stacked display type. */
@JsonSerialize(using = BarChartWidgetStackedType.BarChartWidgetStackedTypeSerializer.class)
public class BarChartWidgetStackedType extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("stacked"));

  public static final BarChartWidgetStackedType STACKED = new BarChartWidgetStackedType("stacked");

  BarChartWidgetStackedType(String value) {
    super(value, allowedValues);
  }

  public static class BarChartWidgetStackedTypeSerializer
      extends StdSerializer<BarChartWidgetStackedType> {
    public BarChartWidgetStackedTypeSerializer(Class<BarChartWidgetStackedType> t) {
      super(t);
    }

    public BarChartWidgetStackedTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        BarChartWidgetStackedType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static BarChartWidgetStackedType fromValue(String value) {
    return new BarChartWidgetStackedType(value);
  }
}
