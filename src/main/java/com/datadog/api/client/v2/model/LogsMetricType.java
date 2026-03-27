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

/** The type of the resource. The value should always be logs_metrics. */
@JsonSerialize(using = LogsMetricType.LogsMetricTypeSerializer.class)
public class LogsMetricType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("logs_metrics"));

  public static final LogsMetricType LOGS_METRICS = new LogsMetricType("logs_metrics");

  LogsMetricType(String value) {
    super(value, allowedValues);
  }

  public static class LogsMetricTypeSerializer extends StdSerializer<LogsMetricType> {
    public LogsMetricTypeSerializer(Class<LogsMetricType> t) {
      super(t);
    }

    public LogsMetricTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(LogsMetricType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static LogsMetricType fromValue(String value) {
    return new LogsMetricType(value);
  }
}
