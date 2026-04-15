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

/** Type of calendar interval. */
@JsonSerialize(using = CalendarIntervalType.CalendarIntervalTypeSerializer.class)
public class CalendarIntervalType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList("day", "week", "month", "year", "quarter", "minute", "hour"));

  public static final CalendarIntervalType DAY = new CalendarIntervalType("day");
  public static final CalendarIntervalType WEEK = new CalendarIntervalType("week");
  public static final CalendarIntervalType MONTH = new CalendarIntervalType("month");
  public static final CalendarIntervalType YEAR = new CalendarIntervalType("year");
  public static final CalendarIntervalType QUARTER = new CalendarIntervalType("quarter");
  public static final CalendarIntervalType MINUTE = new CalendarIntervalType("minute");
  public static final CalendarIntervalType HOUR = new CalendarIntervalType("hour");

  CalendarIntervalType(String value) {
    super(value, allowedValues);
  }

  public static class CalendarIntervalTypeSerializer extends StdSerializer<CalendarIntervalType> {
    public CalendarIntervalTypeSerializer(Class<CalendarIntervalType> t) {
      super(t);
    }

    public CalendarIntervalTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        CalendarIntervalType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static CalendarIntervalType fromValue(String value) {
    return new CalendarIntervalType(value);
  }
}
