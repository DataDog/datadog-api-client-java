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

/** Timeseries is made using an area or bars. */
@JsonSerialize(using = TimeseriesBackgroundType.TimeseriesBackgroundTypeSerializer.class)
public class TimeseriesBackgroundType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("bars", "area"));

  public static final TimeseriesBackgroundType BARS = new TimeseriesBackgroundType("bars");
  public static final TimeseriesBackgroundType AREA = new TimeseriesBackgroundType("area");

  TimeseriesBackgroundType(String value) {
    super(value, allowedValues);
  }

  public static class TimeseriesBackgroundTypeSerializer
      extends StdSerializer<TimeseriesBackgroundType> {
    public TimeseriesBackgroundTypeSerializer(Class<TimeseriesBackgroundType> t) {
      super(t);
    }

    public TimeseriesBackgroundTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        TimeseriesBackgroundType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static TimeseriesBackgroundType fromValue(String value) {
    return new TimeseriesBackgroundType(value);
  }
}
