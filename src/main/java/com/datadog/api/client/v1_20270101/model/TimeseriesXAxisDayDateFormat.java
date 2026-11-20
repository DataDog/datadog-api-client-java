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
@JsonSerialize(using = TimeseriesXAxisDayDateFormat.TimeseriesXAxisDayDateFormatSerializer.class)
public class TimeseriesXAxisDayDateFormat extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "MMM d", "MMM d, yyyy", "MM/dd/yyyy", "dd/MM/yyyy", "MMMM d, yyyy", "auto"));

  public static final TimeseriesXAxisDayDateFormat MMM_D =
      new TimeseriesXAxisDayDateFormat("MMM d");
  public static final TimeseriesXAxisDayDateFormat MMM_D__YYYY =
      new TimeseriesXAxisDayDateFormat("MMM d, yyyy");
  public static final TimeseriesXAxisDayDateFormat MM_DD_YYYY =
      new TimeseriesXAxisDayDateFormat("MM/dd/yyyy");
  public static final TimeseriesXAxisDayDateFormat DD_MM_YYYY =
      new TimeseriesXAxisDayDateFormat("dd/MM/yyyy");
  public static final TimeseriesXAxisDayDateFormat MMMM_D__YYYY =
      new TimeseriesXAxisDayDateFormat("MMMM d, yyyy");
  public static final TimeseriesXAxisDayDateFormat AUTO = new TimeseriesXAxisDayDateFormat("auto");

  TimeseriesXAxisDayDateFormat(String value) {
    super(value, allowedValues);
  }

  public static class TimeseriesXAxisDayDateFormatSerializer
      extends StdSerializer<TimeseriesXAxisDayDateFormat> {
    public TimeseriesXAxisDayDateFormatSerializer(Class<TimeseriesXAxisDayDateFormat> t) {
      super(t);
    }

    public TimeseriesXAxisDayDateFormatSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        TimeseriesXAxisDayDateFormat value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static TimeseriesXAxisDayDateFormat fromValue(String value) {
    return new TimeseriesXAxisDayDateFormat(value);
  }
}
