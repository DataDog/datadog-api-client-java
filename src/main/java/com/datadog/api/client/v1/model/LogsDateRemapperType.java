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

/** Type of logs date remapper. */
@JsonSerialize(using = LogsDateRemapperType.LogsDateRemapperTypeSerializer.class)
public class LogsDateRemapperType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("date-remapper"));

  public static final LogsDateRemapperType DATE_REMAPPER =
      new LogsDateRemapperType("date-remapper");

  LogsDateRemapperType(String value) {
    super(value, allowedValues);
  }

  public static class LogsDateRemapperTypeSerializer extends StdSerializer<LogsDateRemapperType> {
    public LogsDateRemapperTypeSerializer(Class<LogsDateRemapperType> t) {
      super(t);
    }

    public LogsDateRemapperTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        LogsDateRemapperType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static LogsDateRemapperType fromValue(String value) {
    return new LogsDateRemapperType(value);
  }
}
