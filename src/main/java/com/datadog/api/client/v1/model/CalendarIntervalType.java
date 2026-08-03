/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.UUID;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.openapitools.jackson.nullable.JsonNullable;

import com.datadog.api.client.JsonTimeSerializer;

import com.datadog.api.client.ModelEnum;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;

import java.util.Set;
import java.util.HashSet;

/**
   * <p>Type of calendar interval.</p>
 */
@JsonSerialize(using = CalendarIntervalType.CalendarIntervalTypeSerializer.class)
public class CalendarIntervalType extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("day", "week", "month", "year", "quarter", "minute", "hour"));

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
      public void serialize(CalendarIntervalType value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
          jgen.writeObject(value.value);
      }
  }

  @JsonCreator
  public static CalendarIntervalType fromValue(String value) {
    return new CalendarIntervalType(value);
  }
}
