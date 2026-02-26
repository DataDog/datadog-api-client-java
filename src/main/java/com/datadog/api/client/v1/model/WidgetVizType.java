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

/** Whether to display the Alert Graph as a timeseries or a top list. */
@JsonSerialize(using = WidgetVizType.WidgetVizTypeSerializer.class)
public class WidgetVizType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("timeseries", "toplist"));

  public static final WidgetVizType TIMESERIES = new WidgetVizType("timeseries");
  public static final WidgetVizType TOPLIST = new WidgetVizType("toplist");

  WidgetVizType(String value) {
    super(value, allowedValues);
  }

  public static class WidgetVizTypeSerializer extends StdSerializer<WidgetVizType> {
    public WidgetVizTypeSerializer(Class<WidgetVizType> t) {
      super(t);
    }

    public WidgetVizTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(WidgetVizType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static WidgetVizType fromValue(String value) {
    return new WidgetVizType(value);
  }
}
