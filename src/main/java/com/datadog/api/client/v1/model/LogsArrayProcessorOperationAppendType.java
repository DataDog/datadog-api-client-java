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

/** Operation type. */
@JsonSerialize(
    using =
        LogsArrayProcessorOperationAppendType.LogsArrayProcessorOperationAppendTypeSerializer.class)
public class LogsArrayProcessorOperationAppendType extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("append"));

  public static final LogsArrayProcessorOperationAppendType APPEND =
      new LogsArrayProcessorOperationAppendType("append");

  LogsArrayProcessorOperationAppendType(String value) {
    super(value, allowedValues);
  }

  public static class LogsArrayProcessorOperationAppendTypeSerializer
      extends StdSerializer<LogsArrayProcessorOperationAppendType> {
    public LogsArrayProcessorOperationAppendTypeSerializer(
        Class<LogsArrayProcessorOperationAppendType> t) {
      super(t);
    }

    public LogsArrayProcessorOperationAppendTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        LogsArrayProcessorOperationAppendType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static LogsArrayProcessorOperationAppendType fromValue(String value) {
    return new LogsArrayProcessorOperationAppendType(value);
  }
}
