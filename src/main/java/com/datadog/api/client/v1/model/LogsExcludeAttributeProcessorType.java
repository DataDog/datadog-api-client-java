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

/** Type of logs exclude attribute processor. */
@JsonSerialize(
    using = LogsExcludeAttributeProcessorType.LogsExcludeAttributeProcessorTypeSerializer.class)
public class LogsExcludeAttributeProcessorType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("exclude-attribute"));

  public static final LogsExcludeAttributeProcessorType EXCLUDE_ATTRIBUTE =
      new LogsExcludeAttributeProcessorType("exclude-attribute");

  LogsExcludeAttributeProcessorType(String value) {
    super(value, allowedValues);
  }

  public static class LogsExcludeAttributeProcessorTypeSerializer
      extends StdSerializer<LogsExcludeAttributeProcessorType> {
    public LogsExcludeAttributeProcessorTypeSerializer(Class<LogsExcludeAttributeProcessorType> t) {
      super(t);
    }

    public LogsExcludeAttributeProcessorTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        LogsExcludeAttributeProcessorType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static LogsExcludeAttributeProcessorType fromValue(String value) {
    return new LogsExcludeAttributeProcessorType(value);
  }
}
