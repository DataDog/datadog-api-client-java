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
@JsonSerialize(using = DashboardInlineSchema43.DashboardInlineSchema43Serializer.class)
public class DashboardInlineSchema43 extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "global",
              "alert",
              "full_week",
              "full_month",
              "week_to_date",
              "month_to_date",
              "year_to_date"));

  public static final DashboardInlineSchema43 GLOBAL = new DashboardInlineSchema43("global");
  public static final DashboardInlineSchema43 ALERT = new DashboardInlineSchema43("alert");
  public static final DashboardInlineSchema43 FULL_WEEK = new DashboardInlineSchema43("full_week");
  public static final DashboardInlineSchema43 FULL_MONTH =
      new DashboardInlineSchema43("full_month");
  public static final DashboardInlineSchema43 WEEK_TO_DATE =
      new DashboardInlineSchema43("week_to_date");
  public static final DashboardInlineSchema43 MONTH_TO_DATE =
      new DashboardInlineSchema43("month_to_date");
  public static final DashboardInlineSchema43 YEAR_TO_DATE =
      new DashboardInlineSchema43("year_to_date");

  DashboardInlineSchema43(String value) {
    super(value, allowedValues);
  }

  public static class DashboardInlineSchema43Serializer
      extends StdSerializer<DashboardInlineSchema43> {
    public DashboardInlineSchema43Serializer(Class<DashboardInlineSchema43> t) {
      super(t);
    }

    public DashboardInlineSchema43Serializer() {
      this(null);
    }

    @Override
    public void serialize(
        DashboardInlineSchema43 value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static DashboardInlineSchema43 fromValue(String value) {
    return new DashboardInlineSchema43(value);
  }
}
