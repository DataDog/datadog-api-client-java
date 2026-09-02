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

/** Type of logs trace remapper. */
@JsonSerialize(using = LogsTraceRemapperType.LogsTraceRemapperTypeSerializer.class)
public class LogsTraceRemapperType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("trace-id-remapper"));

  public static final LogsTraceRemapperType TRACE_ID_REMAPPER =
      new LogsTraceRemapperType("trace-id-remapper");

  LogsTraceRemapperType(String value) {
    super(value, allowedValues);
  }

  public static class LogsTraceRemapperTypeSerializer extends StdSerializer<LogsTraceRemapperType> {
    public LogsTraceRemapperTypeSerializer(Class<LogsTraceRemapperType> t) {
      super(t);
    }

    public LogsTraceRemapperTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        LogsTraceRemapperType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static LogsTraceRemapperType fromValue(String value) {
    return new LogsTraceRemapperType(value);
  }
}
