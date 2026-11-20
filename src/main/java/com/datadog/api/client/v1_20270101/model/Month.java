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
@JsonSerialize(using = Month.MonthSerializer.class)
public class Month extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "january",
              "february",
              "march",
              "april",
              "may",
              "june",
              "july",
              "august",
              "september",
              "october",
              "november",
              "december"));

  public static final Month JANUARY = new Month("january");
  public static final Month FEBRUARY = new Month("february");
  public static final Month MARCH = new Month("march");
  public static final Month APRIL = new Month("april");
  public static final Month MAY = new Month("may");
  public static final Month JUNE = new Month("june");
  public static final Month JULY = new Month("july");
  public static final Month AUGUST = new Month("august");
  public static final Month SEPTEMBER = new Month("september");
  public static final Month OCTOBER = new Month("october");
  public static final Month NOVEMBER = new Month("november");
  public static final Month DECEMBER = new Month("december");

  Month(String value) {
    super(value, allowedValues);
  }

  public static class MonthSerializer extends StdSerializer<Month> {
    public MonthSerializer(Class<Month> t) {
      super(t);
    }

    public MonthSerializer() {
      this(null);
    }

    @Override
    public void serialize(Month value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static Month fromValue(String value) {
    return new Month(value);
  }
}
