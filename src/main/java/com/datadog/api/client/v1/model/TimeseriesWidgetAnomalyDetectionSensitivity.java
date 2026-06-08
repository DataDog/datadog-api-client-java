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
 * Sensitivity level for anomaly detection. Use <code>never_detect</code> to disable anomaly
 * detection.
 */
@JsonSerialize(
    using =
        TimeseriesWidgetAnomalyDetectionSensitivity
            .TimeseriesWidgetAnomalyDetectionSensitivitySerializer.class)
public class TimeseriesWidgetAnomalyDetectionSensitivity extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("never_detect"));

  public static final TimeseriesWidgetAnomalyDetectionSensitivity NEVER_DETECT =
      new TimeseriesWidgetAnomalyDetectionSensitivity("never_detect");

  TimeseriesWidgetAnomalyDetectionSensitivity(String value) {
    super(value, allowedValues);
  }

  public static class TimeseriesWidgetAnomalyDetectionSensitivitySerializer
      extends StdSerializer<TimeseriesWidgetAnomalyDetectionSensitivity> {
    public TimeseriesWidgetAnomalyDetectionSensitivitySerializer(
        Class<TimeseriesWidgetAnomalyDetectionSensitivity> t) {
      super(t);
    }

    public TimeseriesWidgetAnomalyDetectionSensitivitySerializer() {
      this(null);
    }

    @Override
    public void serialize(
        TimeseriesWidgetAnomalyDetectionSensitivity value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static TimeseriesWidgetAnomalyDetectionSensitivity fromValue(String value) {
    return new TimeseriesWidgetAnomalyDetectionSensitivity(value);
  }
}
