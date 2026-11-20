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
@JsonSerialize(using = CalendarIntervalWeekType.CalendarIntervalWeekTypeSerializer.class)
public class CalendarIntervalWeekType extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("week"));

  public static final CalendarIntervalWeekType WEEK = new CalendarIntervalWeekType("week");

  CalendarIntervalWeekType(String value) {
    super(value, allowedValues);
  }

  public static class CalendarIntervalWeekTypeSerializer
      extends StdSerializer<CalendarIntervalWeekType> {
    public CalendarIntervalWeekTypeSerializer(Class<CalendarIntervalWeekType> t) {
      super(t);
    }

    public CalendarIntervalWeekTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        CalendarIntervalWeekType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static CalendarIntervalWeekType fromValue(String value) {
    return new CalendarIntervalWeekType(value);
  }
}
