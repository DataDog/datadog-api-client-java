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

/**
 * Controls how groups or monitors are treated if an evaluation does not return any data points. The
 * default option results in different behavior depending on the monitor query type. For monitors
 * using Count queries, an empty monitor evaluation is treated as 0 and is compared to the threshold
 * conditions. For monitors using any query type other than Count, for example Gauge, Measure, or
 * Rate, the monitor shows the last known status. This option is only available for APM Trace
 * Analytics, Audit Trail, CI, Error Tracking, Event, Logs, and RUM monitors.
 */
@JsonSerialize(using = OnMissingDataOption.OnMissingDataOptionSerializer.class)
public class OnMissingDataOption extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList("default", "show_no_data", "show_and_notify_no_data", "resolve"));

  public static final OnMissingDataOption DEFAULT = new OnMissingDataOption("default");
  public static final OnMissingDataOption SHOW_NO_DATA = new OnMissingDataOption("show_no_data");
  public static final OnMissingDataOption SHOW_AND_NOTIFY_NO_DATA =
      new OnMissingDataOption("show_and_notify_no_data");
  public static final OnMissingDataOption RESOLVE = new OnMissingDataOption("resolve");

  OnMissingDataOption(String value) {
    super(value, allowedValues);
  }

  public static class OnMissingDataOptionSerializer extends StdSerializer<OnMissingDataOption> {
    public OnMissingDataOptionSerializer(Class<OnMissingDataOption> t) {
      super(t);
    }

    public OnMissingDataOptionSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        OnMissingDataOption value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static OnMissingDataOption fromValue(String value) {
    return new OnMissingDataOption(value);
  }
}
