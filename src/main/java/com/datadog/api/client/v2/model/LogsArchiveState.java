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

/** The state of the archive. */
@JsonSerialize(using = LogsArchiveState.LogsArchiveStateSerializer.class)
public class LogsArchiveState extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("UNKNOWN", "WORKING", "FAILING", "WORKING_AUTH_LEGACY"));

  public static final LogsArchiveState UNKNOWN = new LogsArchiveState("UNKNOWN");
  public static final LogsArchiveState WORKING = new LogsArchiveState("WORKING");
  public static final LogsArchiveState FAILING = new LogsArchiveState("FAILING");
  public static final LogsArchiveState WORKING_AUTH_LEGACY =
      new LogsArchiveState("WORKING_AUTH_LEGACY");

  LogsArchiveState(String value) {
    super(value, allowedValues);
  }

  public static class LogsArchiveStateSerializer extends StdSerializer<LogsArchiveState> {
    public LogsArchiveStateSerializer(Class<LogsArchiveState> t) {
      super(t);
    }

    public LogsArchiveStateSerializer() {
      this(null);
    }

    @Override
    public void serialize(LogsArchiveState value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static LogsArchiveState fromValue(String value) {
    return new LogsArchiveState(value);
  }
}
