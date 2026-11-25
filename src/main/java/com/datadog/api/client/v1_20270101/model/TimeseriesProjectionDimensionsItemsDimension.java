/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1_20270101.model;

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

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonSerialize(
    using =
        TimeseriesProjectionDimensionsItemsDimension
            .TimeseriesProjectionDimensionsItemsDimensionSerializer.class)
public class TimeseriesProjectionDimensionsItemsDimension extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("group", "time", "value"));

  public static final TimeseriesProjectionDimensionsItemsDimension GROUP =
      new TimeseriesProjectionDimensionsItemsDimension("group");
  public static final TimeseriesProjectionDimensionsItemsDimension TIME =
      new TimeseriesProjectionDimensionsItemsDimension("time");
  public static final TimeseriesProjectionDimensionsItemsDimension VALUE =
      new TimeseriesProjectionDimensionsItemsDimension("value");

  TimeseriesProjectionDimensionsItemsDimension(String value) {
    super(value, allowedValues);
  }

  public static class TimeseriesProjectionDimensionsItemsDimensionSerializer
      extends StdSerializer<TimeseriesProjectionDimensionsItemsDimension> {
    public TimeseriesProjectionDimensionsItemsDimensionSerializer(
        Class<TimeseriesProjectionDimensionsItemsDimension> t) {
      super(t);
    }

    public TimeseriesProjectionDimensionsItemsDimensionSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        TimeseriesProjectionDimensionsItemsDimension value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static TimeseriesProjectionDimensionsItemsDimension fromValue(String value) {
    return new TimeseriesProjectionDimensionsItemsDimension(value);
  }
}
