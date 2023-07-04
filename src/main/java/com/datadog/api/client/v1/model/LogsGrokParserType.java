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

/** Type of logs grok parser. */
@JsonSerialize(using = LogsGrokParserType.LogsGrokParserTypeSerializer.class)
public class LogsGrokParserType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("grok-parser"));

  public static final LogsGrokParserType GROK_PARSER = new LogsGrokParserType("grok-parser");

  LogsGrokParserType(String value) {
    super(value, allowedValues);
  }

  public static class LogsGrokParserTypeSerializer extends StdSerializer<LogsGrokParserType> {
    public LogsGrokParserTypeSerializer(Class<LogsGrokParserType> t) {
      super(t);
    }

    public LogsGrokParserTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(LogsGrokParserType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static LogsGrokParserType fromValue(String value) {
    return new LogsGrokParserType(value);
  }
}
