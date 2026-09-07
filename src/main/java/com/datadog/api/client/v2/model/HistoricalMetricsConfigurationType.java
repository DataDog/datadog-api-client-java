/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

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

/** The historical metrics configuration resource type. */
@JsonSerialize(
    using = HistoricalMetricsConfigurationType.HistoricalMetricsConfigurationTypeSerializer.class)
public class HistoricalMetricsConfigurationType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("historical_metrics_configurations"));

  public static final HistoricalMetricsConfigurationType HISTORICAL_METRICS_CONFIGURATIONS =
      new HistoricalMetricsConfigurationType("historical_metrics_configurations");

  HistoricalMetricsConfigurationType(String value) {
    super(value, allowedValues);
  }

  public static class HistoricalMetricsConfigurationTypeSerializer
      extends StdSerializer<HistoricalMetricsConfigurationType> {
    public HistoricalMetricsConfigurationTypeSerializer(
        Class<HistoricalMetricsConfigurationType> t) {
      super(t);
    }

    public HistoricalMetricsConfigurationTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        HistoricalMetricsConfigurationType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static HistoricalMetricsConfigurationType fromValue(String value) {
    return new HistoricalMetricsConfigurationType(value);
  }
}
