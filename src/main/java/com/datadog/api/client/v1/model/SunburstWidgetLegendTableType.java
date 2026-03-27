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

/** Whether or not to show a table legend. */
@JsonSerialize(using = SunburstWidgetLegendTableType.SunburstWidgetLegendTableTypeSerializer.class)
public class SunburstWidgetLegendTableType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("table", "none"));

  public static final SunburstWidgetLegendTableType TABLE =
      new SunburstWidgetLegendTableType("table");
  public static final SunburstWidgetLegendTableType NONE =
      new SunburstWidgetLegendTableType("none");

  SunburstWidgetLegendTableType(String value) {
    super(value, allowedValues);
  }

  public static class SunburstWidgetLegendTableTypeSerializer
      extends StdSerializer<SunburstWidgetLegendTableType> {
    public SunburstWidgetLegendTableTypeSerializer(Class<SunburstWidgetLegendTableType> t) {
      super(t);
    }

    public SunburstWidgetLegendTableTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SunburstWidgetLegendTableType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SunburstWidgetLegendTableType fromValue(String value) {
    return new SunburstWidgetLegendTableType(value);
  }
}
