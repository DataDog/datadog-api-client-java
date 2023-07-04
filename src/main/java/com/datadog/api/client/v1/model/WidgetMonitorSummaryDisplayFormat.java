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

/** What to display on the widget. */
@JsonSerialize(
    using = WidgetMonitorSummaryDisplayFormat.WidgetMonitorSummaryDisplayFormatSerializer.class)
public class WidgetMonitorSummaryDisplayFormat extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("counts", "countsAndList", "list"));

  public static final WidgetMonitorSummaryDisplayFormat COUNTS =
      new WidgetMonitorSummaryDisplayFormat("counts");
  public static final WidgetMonitorSummaryDisplayFormat COUNTS_AND_LIST =
      new WidgetMonitorSummaryDisplayFormat("countsAndList");
  public static final WidgetMonitorSummaryDisplayFormat LIST =
      new WidgetMonitorSummaryDisplayFormat("list");

  WidgetMonitorSummaryDisplayFormat(String value) {
    super(value, allowedValues);
  }

  public static class WidgetMonitorSummaryDisplayFormatSerializer
      extends StdSerializer<WidgetMonitorSummaryDisplayFormat> {
    public WidgetMonitorSummaryDisplayFormatSerializer(Class<WidgetMonitorSummaryDisplayFormat> t) {
      super(t);
    }

    public WidgetMonitorSummaryDisplayFormatSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        WidgetMonitorSummaryDisplayFormat value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static WidgetMonitorSummaryDisplayFormat fromValue(String value) {
    return new WidgetMonitorSummaryDisplayFormat(value);
  }
}
