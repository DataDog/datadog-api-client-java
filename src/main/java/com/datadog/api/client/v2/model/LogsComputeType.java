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

/** The type of compute */
@JsonSerialize(using = LogsComputeType.LogsComputeTypeSerializer.class)
public class LogsComputeType extends ModelEnum<String> {

  public static final LogsComputeType TIMESERIES = new LogsComputeType("timeseries");
  public static final LogsComputeType TOTAL = new LogsComputeType("total");

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("timeseries", "total"));

  LogsComputeType(String value) {
    this.value = value;
    this.localAllowedValues = allowedValues;
  }

  public static class LogsComputeTypeSerializer extends StdSerializer<LogsComputeType> {
    public LogsComputeTypeSerializer(Class<LogsComputeType> t) {
      super(t);
    }

    public LogsComputeTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(LogsComputeType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static LogsComputeType fromValue(String value) {
    return new LogsComputeType(value);
  }
}
