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

/** The available timeframes depend on the widget you are using. */
@JsonSerialize(using = WidgetLiveSpan.WidgetLiveSpanSerializer.class)
public class WidgetLiveSpan extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "1m",
              "5m",
              "10m",
              "15m",
              "30m",
              "1h",
              "4h",
              "1d",
              "2d",
              "1w",
              "1mo",
              "3mo",
              "6mo",
              "week_to_date",
              "month_to_date",
              "1y",
              "alert"));

  public static final WidgetLiveSpan PAST_ONE_MINUTE = new WidgetLiveSpan("1m");
  public static final WidgetLiveSpan PAST_FIVE_MINUTES = new WidgetLiveSpan("5m");
  public static final WidgetLiveSpan PAST_TEN_MINUTES = new WidgetLiveSpan("10m");
  public static final WidgetLiveSpan PAST_FIFTEEN_MINUTES = new WidgetLiveSpan("15m");
  public static final WidgetLiveSpan PAST_THIRTY_MINUTES = new WidgetLiveSpan("30m");
  public static final WidgetLiveSpan PAST_ONE_HOUR = new WidgetLiveSpan("1h");
  public static final WidgetLiveSpan PAST_FOUR_HOURS = new WidgetLiveSpan("4h");
  public static final WidgetLiveSpan PAST_ONE_DAY = new WidgetLiveSpan("1d");
  public static final WidgetLiveSpan PAST_TWO_DAYS = new WidgetLiveSpan("2d");
  public static final WidgetLiveSpan PAST_ONE_WEEK = new WidgetLiveSpan("1w");
  public static final WidgetLiveSpan PAST_ONE_MONTH = new WidgetLiveSpan("1mo");
  public static final WidgetLiveSpan PAST_THREE_MONTHS = new WidgetLiveSpan("3mo");
  public static final WidgetLiveSpan PAST_SIX_MONTHS = new WidgetLiveSpan("6mo");
  public static final WidgetLiveSpan WEEK_TO_DATE = new WidgetLiveSpan("week_to_date");
  public static final WidgetLiveSpan MONTH_TO_DATE = new WidgetLiveSpan("month_to_date");
  public static final WidgetLiveSpan PAST_ONE_YEAR = new WidgetLiveSpan("1y");
  public static final WidgetLiveSpan ALERT = new WidgetLiveSpan("alert");

  WidgetLiveSpan(String value) {
    super(value, allowedValues);
  }

  public static class WidgetLiveSpanSerializer extends StdSerializer<WidgetLiveSpan> {
    public WidgetLiveSpanSerializer(Class<WidgetLiveSpan> t) {
      super(t);
    }

    public WidgetLiveSpanSerializer() {
      this(null);
    }

    @Override
    public void serialize(WidgetLiveSpan value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static WidgetLiveSpan fromValue(String value) {
    return new WidgetLiveSpan(value);
  }
}
