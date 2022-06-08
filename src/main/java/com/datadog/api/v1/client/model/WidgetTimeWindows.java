/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.v1.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/** Define a time window. */
@JsonSerialize(using = WidgetTimeWindows.WidgetTimeWindowsSerializer.class)
public class WidgetTimeWindows {

  public static final WidgetTimeWindows SEVEN_DAYS = new WidgetTimeWindows("7d");
  public static final WidgetTimeWindows THIRTY_DAYS = new WidgetTimeWindows("30d");
  public static final WidgetTimeWindows NINETY_DAYS = new WidgetTimeWindows("90d");
  public static final WidgetTimeWindows WEEK_TO_DATE = new WidgetTimeWindows("week_to_date");
  public static final WidgetTimeWindows PREVIOUS_WEEK = new WidgetTimeWindows("previous_week");
  public static final WidgetTimeWindows MONTH_TO_DATE = new WidgetTimeWindows("month_to_date");
  public static final WidgetTimeWindows PREVIOUS_MONTH = new WidgetTimeWindows("previous_month");
  public static final WidgetTimeWindows GLOBAL_TIME = new WidgetTimeWindows("global_time");

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "7d",
              "30d",
              "90d",
              "week_to_date",
              "previous_week",
              "month_to_date",
              "previous_month",
              "global_time"));

  private String value;

  public boolean isValid() {
    return allowedValues.contains(this.value);
  }

  WidgetTimeWindows(String value) {
    this.value = value;
  }

  public static class WidgetTimeWindowsSerializer extends StdSerializer<WidgetTimeWindows> {
    public WidgetTimeWindowsSerializer(Class<WidgetTimeWindows> t) {
      super(t);
    }

    public WidgetTimeWindowsSerializer() {
      this(null);
    }

    @Override
    public void serialize(WidgetTimeWindows value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonValue
  public String getValue() {
    return this.value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  /** Return true if this WidgetTimeWindows object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return this.value.equals(((WidgetTimeWindows) o).value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value);
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static WidgetTimeWindows fromValue(String value) {
    return new WidgetTimeWindows(value);
  }
}
