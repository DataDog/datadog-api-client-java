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
        LogsArrayProcessorOperationSelectType.LogsArrayProcessorOperationSelectTypeSerializer.class)
public class LogsArrayProcessorOperationSelectType extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("select"));

  public static final LogsArrayProcessorOperationSelectType SELECT =
      new LogsArrayProcessorOperationSelectType("select");

  LogsArrayProcessorOperationSelectType(String value) {
    super(value, allowedValues);
  }

  public static class LogsArrayProcessorOperationSelectTypeSerializer
      extends StdSerializer<LogsArrayProcessorOperationSelectType> {
    public LogsArrayProcessorOperationSelectTypeSerializer(
        Class<LogsArrayProcessorOperationSelectType> t) {
      super(t);
    }

    public LogsArrayProcessorOperationSelectTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        LogsArrayProcessorOperationSelectType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static LogsArrayProcessorOperationSelectType fromValue(String value) {
    return new LogsArrayProcessorOperationSelectType(value);
  }
}
