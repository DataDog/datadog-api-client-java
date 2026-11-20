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
@JsonSerialize(using = SloWidgetTimeWindow.SloWidgetTimeWindowSerializer.class)
public class SloWidgetTimeWindow extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "week_to_date",
              "month_to_date",
              "7d",
              "30d",
              "90d",
              "previous_week",
              "previous_month",
              "global_time"));

  public static final SloWidgetTimeWindow WEEK_TO_DATE = new SloWidgetTimeWindow("week_to_date");
  public static final SloWidgetTimeWindow MONTH_TO_DATE = new SloWidgetTimeWindow("month_to_date");
  public static final SloWidgetTimeWindow SEVEN_D = new SloWidgetTimeWindow("7d");
  public static final SloWidgetTimeWindow THIRTY_D = new SloWidgetTimeWindow("30d");
  public static final SloWidgetTimeWindow NINETY_D = new SloWidgetTimeWindow("90d");
  public static final SloWidgetTimeWindow PREVIOUS_WEEK = new SloWidgetTimeWindow("previous_week");
  public static final SloWidgetTimeWindow PREVIOUS_MONTH =
      new SloWidgetTimeWindow("previous_month");
  public static final SloWidgetTimeWindow GLOBAL_TIME = new SloWidgetTimeWindow("global_time");

  SloWidgetTimeWindow(String value) {
    super(value, allowedValues);
  }

  public static class SloWidgetTimeWindowSerializer extends StdSerializer<SloWidgetTimeWindow> {
    public SloWidgetTimeWindowSerializer(Class<SloWidgetTimeWindow> t) {
      super(t);
    }

    public SloWidgetTimeWindowSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SloWidgetTimeWindow value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SloWidgetTimeWindow fromValue(String value) {
    return new SloWidgetTimeWindow(value);
  }
}
