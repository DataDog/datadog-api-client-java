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

/** The comparison window type. */
@JsonSerialize(using = ComparisonDurationType.ComparisonDurationTypeSerializer.class)
public class ComparisonDurationType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "previous_timeframe",
              "custom_timeframe",
              "previous_day",
              "previous_week",
              "previous_month"));

  public static final ComparisonDurationType PREVIOUS_TIMEFRAME =
      new ComparisonDurationType("previous_timeframe");
  public static final ComparisonDurationType CUSTOM_TIMEFRAME =
      new ComparisonDurationType("custom_timeframe");
  public static final ComparisonDurationType PREVIOUS_DAY =
      new ComparisonDurationType("previous_day");
  public static final ComparisonDurationType PREVIOUS_WEEK =
      new ComparisonDurationType("previous_week");
  public static final ComparisonDurationType PREVIOUS_MONTH =
      new ComparisonDurationType("previous_month");

  ComparisonDurationType(String value) {
    super(value, allowedValues);
  }

  public static class ComparisonDurationTypeSerializer
      extends StdSerializer<ComparisonDurationType> {
    public ComparisonDurationTypeSerializer(Class<ComparisonDurationType> t) {
      super(t);
    }

    public ComparisonDurationTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ComparisonDurationType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ComparisonDurationType fromValue(String value) {
    return new ComparisonDurationType(value);
  }
}
