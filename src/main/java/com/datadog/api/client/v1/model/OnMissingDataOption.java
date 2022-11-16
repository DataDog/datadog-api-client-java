/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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

/**
 * Controls how groups or monitors are treated if an evaluation does not return any data points. The
 * default option results in different behavior depending on the monitor query type. For monitors
 * using Count queries, an empty monitor evaluation is treated as 0 and is compared to the threshold
 * conditions. For monitors using any query type other than Count, for example Gauge, Measure, or
 * Rate, the monitor shows the last known status. This option is only available for APM Trace
 * Analytics, Audit Trail, CI, Error Tracking, Event, Logs, and RUM monitors.
 */
@JsonSerialize(using = OnMissingDataOption.OnMissingDataOptionSerializer.class)
public class OnMissingDataOption {

  public static final OnMissingDataOption DEFAULT = new OnMissingDataOption("default");
  public static final OnMissingDataOption SHOW_NO_DATA = new OnMissingDataOption("show_no_data");
  public static final OnMissingDataOption SHOW_AND_NOTIFY_NO_DATA =
      new OnMissingDataOption("show_and_notify_no_data");
  public static final OnMissingDataOption RESOLVE = new OnMissingDataOption("resolve");

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList("default", "show_no_data", "show_and_notify_no_data", "resolve"));

  private String value;

  public boolean isValid() {
    return allowedValues.contains(this.value);
  }

  OnMissingDataOption(String value) {
    this.value = value;
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

  @JsonValue
  public String getValue() {
    return this.value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  /** Return true if this OnMissingDataOption object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return this.value.equals(((OnMissingDataOption) o).value);
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
  public static OnMissingDataOption fromValue(String value) {
    return new OnMissingDataOption(value);
  }
}
