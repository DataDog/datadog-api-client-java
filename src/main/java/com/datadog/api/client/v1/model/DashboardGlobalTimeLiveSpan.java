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

/** Dashboard global time live_span selection */
@JsonSerialize(using = DashboardGlobalTimeLiveSpan.DashboardGlobalTimeLiveSpanSerializer.class)
public class DashboardGlobalTimeLiveSpan {

  public static final DashboardGlobalTimeLiveSpan PAST_FIFTEEN_MINUTES =
      new DashboardGlobalTimeLiveSpan("15m");
  public static final DashboardGlobalTimeLiveSpan PAST_ONE_HOUR =
      new DashboardGlobalTimeLiveSpan("1h");
  public static final DashboardGlobalTimeLiveSpan PAST_FOUR_HOURS =
      new DashboardGlobalTimeLiveSpan("4h");
  public static final DashboardGlobalTimeLiveSpan PAST_ONE_DAY =
      new DashboardGlobalTimeLiveSpan("1d");
  public static final DashboardGlobalTimeLiveSpan PAST_TWO_DAYS =
      new DashboardGlobalTimeLiveSpan("2d");
  public static final DashboardGlobalTimeLiveSpan PAST_ONE_WEEK =
      new DashboardGlobalTimeLiveSpan("1w");
  public static final DashboardGlobalTimeLiveSpan PAST_ONE_MONTH =
      new DashboardGlobalTimeLiveSpan("1mo");
  public static final DashboardGlobalTimeLiveSpan PAST_THREE_MONTHS =
      new DashboardGlobalTimeLiveSpan("3mo");

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("15m", "1h", "4h", "1d", "2d", "1w", "1mo", "3mo"));

  private String value;

  public boolean isValid() {
    return allowedValues.contains(this.value);
  }

  DashboardGlobalTimeLiveSpan(String value) {
    this.value = value;
  }

  public static class DashboardGlobalTimeLiveSpanSerializer
      extends StdSerializer<DashboardGlobalTimeLiveSpan> {
    public DashboardGlobalTimeLiveSpanSerializer(Class<DashboardGlobalTimeLiveSpan> t) {
      super(t);
    }

    public DashboardGlobalTimeLiveSpanSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        DashboardGlobalTimeLiveSpan value, JsonGenerator jgen, SerializerProvider provider)
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

  /** Return true if this DashboardGlobalTimeLiveSpan object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return this.value.equals(((DashboardGlobalTimeLiveSpan) o).value);
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
  public static DashboardGlobalTimeLiveSpan fromValue(String value) {
    return new DashboardGlobalTimeLiveSpan(value);
  }
}
