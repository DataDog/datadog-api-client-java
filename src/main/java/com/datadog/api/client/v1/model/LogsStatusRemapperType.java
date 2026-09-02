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

/** Type of logs status remapper. */
@JsonSerialize(using = LogsStatusRemapperType.LogsStatusRemapperTypeSerializer.class)
public class LogsStatusRemapperType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("status-remapper"));

  public static final LogsStatusRemapperType STATUS_REMAPPER =
      new LogsStatusRemapperType("status-remapper");

  LogsStatusRemapperType(String value) {
    super(value, allowedValues);
  }

  public static class LogsStatusRemapperTypeSerializer
      extends StdSerializer<LogsStatusRemapperType> {
    public LogsStatusRemapperTypeSerializer(Class<LogsStatusRemapperType> t) {
      super(t);
    }

    public LogsStatusRemapperTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        LogsStatusRemapperType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static LogsStatusRemapperType fromValue(String value) {
    return new LogsStatusRemapperType(value);
  }
}
