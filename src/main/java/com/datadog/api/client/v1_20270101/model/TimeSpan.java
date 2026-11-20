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
@JsonSerialize(using = TimeSpan.TimeSpanSerializer.class)
public class TimeSpan extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "1m", "5m", "10m", "15m", "30m", "1h", "4h", "1d", "2d", "1w", "1mo", "3mo", "6mo",
              "1y"));

  public static final TimeSpan ONE_M = new TimeSpan("1m");
  public static final TimeSpan FIVE_M = new TimeSpan("5m");
  public static final TimeSpan TEN_M = new TimeSpan("10m");
  public static final TimeSpan FIFTEEN_M = new TimeSpan("15m");
  public static final TimeSpan THIRTY_M = new TimeSpan("30m");
  public static final TimeSpan ONE_H = new TimeSpan("1h");
  public static final TimeSpan FOUR_H = new TimeSpan("4h");
  public static final TimeSpan ONE_D = new TimeSpan("1d");
  public static final TimeSpan TWO_D = new TimeSpan("2d");
  public static final TimeSpan ONE_W = new TimeSpan("1w");
  public static final TimeSpan ONE_MO = new TimeSpan("1mo");
  public static final TimeSpan THREE_MO = new TimeSpan("3mo");
  public static final TimeSpan SIX_MO = new TimeSpan("6mo");
  public static final TimeSpan ONE_Y = new TimeSpan("1y");

  TimeSpan(String value) {
    super(value, allowedValues);
  }

  public static class TimeSpanSerializer extends StdSerializer<TimeSpan> {
    public TimeSpanSerializer(Class<TimeSpan> t) {
      super(t);
    }

    public TimeSpanSerializer() {
      this(null);
    }

    @Override
    public void serialize(TimeSpan value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static TimeSpan fromValue(String value) {
    return new TimeSpan(value);
  }
}
