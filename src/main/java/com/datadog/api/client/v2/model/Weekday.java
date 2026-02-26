/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

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

/** A day of the week. */
@JsonSerialize(using = Weekday.WeekdaySerializer.class)
public class Weekday extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday"));

  public static final Weekday MONDAY = new Weekday("monday");
  public static final Weekday TUESDAY = new Weekday("tuesday");
  public static final Weekday WEDNESDAY = new Weekday("wednesday");
  public static final Weekday THURSDAY = new Weekday("thursday");
  public static final Weekday FRIDAY = new Weekday("friday");
  public static final Weekday SATURDAY = new Weekday("saturday");
  public static final Weekday SUNDAY = new Weekday("sunday");

  Weekday(String value) {
    super(value, allowedValues);
  }

  public static class WeekdaySerializer extends StdSerializer<Weekday> {
    public WeekdaySerializer(Class<Weekday> t) {
      super(t);
    }

    public WeekdaySerializer() {
      this(null);
    }

    @Override
    public void serialize(Weekday value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static Weekday fromValue(String value) {
    return new Weekday(value);
  }
}
