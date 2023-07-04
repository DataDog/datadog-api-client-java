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

/** Specifies storage type as indexes or online-archives */
@JsonSerialize(using = LogsStorageTier.LogsStorageTierSerializer.class)
public class LogsStorageTier extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("indexes", "online-archives"));

  public static final LogsStorageTier INDEXES = new LogsStorageTier("indexes");
  public static final LogsStorageTier ONLINE_ARCHIVES = new LogsStorageTier("online-archives");

  LogsStorageTier(String value) {
    super(value, allowedValues);
  }

  public static class LogsStorageTierSerializer extends StdSerializer<LogsStorageTier> {
    public LogsStorageTierSerializer(Class<LogsStorageTier> t) {
      super(t);
    }

    public LogsStorageTierSerializer() {
      this(null);
    }

    @Override
    public void serialize(LogsStorageTier value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static LogsStorageTier fromValue(String value) {
    return new LogsStorageTier(value);
  }
}
