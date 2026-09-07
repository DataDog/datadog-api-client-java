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

/** Type of comparison duration. */
@JsonSerialize(using = FunnelComparisonDurationType.FunnelComparisonDurationTypeSerializer.class)
public class FunnelComparisonDurationType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "previous_timeframe",
              "custom_timeframe",
              "previous_day",
              "previous_week",
              "previous_month"));

  public static final FunnelComparisonDurationType PREVIOUS_TIMEFRAME =
      new FunnelComparisonDurationType("previous_timeframe");
  public static final FunnelComparisonDurationType CUSTOM_TIMEFRAME =
      new FunnelComparisonDurationType("custom_timeframe");
  public static final FunnelComparisonDurationType PREVIOUS_DAY =
      new FunnelComparisonDurationType("previous_day");
  public static final FunnelComparisonDurationType PREVIOUS_WEEK =
      new FunnelComparisonDurationType("previous_week");
  public static final FunnelComparisonDurationType PREVIOUS_MONTH =
      new FunnelComparisonDurationType("previous_month");

  FunnelComparisonDurationType(String value) {
    super(value, allowedValues);
  }

  public static class FunnelComparisonDurationTypeSerializer
      extends StdSerializer<FunnelComparisonDurationType> {
    public FunnelComparisonDurationTypeSerializer(Class<FunnelComparisonDurationType> t) {
      super(t);
    }

    public FunnelComparisonDurationTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        FunnelComparisonDurationType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static FunnelComparisonDurationType fromValue(String value) {
    return new FunnelComparisonDurationType(value);
  }
}
