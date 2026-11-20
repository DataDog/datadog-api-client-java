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
@JsonSerialize(using = Day.DaySerializer.class)
public class Day extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday"));

  public static final Day MONDAY = new Day("monday");
  public static final Day TUESDAY = new Day("tuesday");
  public static final Day WEDNESDAY = new Day("wednesday");
  public static final Day THURSDAY = new Day("thursday");
  public static final Day FRIDAY = new Day("friday");
  public static final Day SATURDAY = new Day("saturday");
  public static final Day SUNDAY = new Day("sunday");

  Day(String value) {
    super(value, allowedValues);
  }

  public static class DaySerializer extends StdSerializer<Day> {
    public DaySerializer(Class<Day> t) {
      super(t);
    }

    public DaySerializer() {
      this(null);
    }

    @Override
    public void serialize(Day value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static Day fromValue(String value) {
    return new Day(value);
  }
}
