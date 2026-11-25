/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1_20270101.model;

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

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonSerialize(
    using = LogsPatternStreamQueryDataSource.LogsPatternStreamQueryDataSourceSerializer.class)
public class LogsPatternStreamQueryDataSource extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("logs_pattern_stream"));

  public static final LogsPatternStreamQueryDataSource LOGS_PATTERN_STREAM =
      new LogsPatternStreamQueryDataSource("logs_pattern_stream");

  LogsPatternStreamQueryDataSource(String value) {
    super(value, allowedValues);
  }

  public static class LogsPatternStreamQueryDataSourceSerializer
      extends StdSerializer<LogsPatternStreamQueryDataSource> {
    public LogsPatternStreamQueryDataSourceSerializer(Class<LogsPatternStreamQueryDataSource> t) {
      super(t);
    }

    public LogsPatternStreamQueryDataSourceSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        LogsPatternStreamQueryDataSource value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static LogsPatternStreamQueryDataSource fromValue(String value) {
    return new LogsPatternStreamQueryDataSource(value);
  }
}
