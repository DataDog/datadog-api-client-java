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

/** Time-ascending <code>asc</code> or time-descending <code>desc</code> results. */
@JsonSerialize(using = LogsSort.LogsSortSerializer.class)
public class LogsSort extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("asc", "desc"));

  public static final LogsSort TIME_ASCENDING = new LogsSort("asc");
  public static final LogsSort TIME_DESCENDING = new LogsSort("desc");

  LogsSort(String value) {
    super(value, allowedValues);
  }

  public static class LogsSortSerializer extends StdSerializer<LogsSort> {
    public LogsSortSerializer(Class<LogsSort> t) {
      super(t);
    }

    public LogsSortSerializer() {
      this(null);
    }

    @Override
    public void serialize(LogsSort value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static LogsSort fromValue(String value) {
    return new LogsSort(value);
  }
}
