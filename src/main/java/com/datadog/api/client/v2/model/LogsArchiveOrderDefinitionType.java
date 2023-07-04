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

/** Type of the archive order definition. */
@JsonSerialize(
    using = LogsArchiveOrderDefinitionType.LogsArchiveOrderDefinitionTypeSerializer.class)
public class LogsArchiveOrderDefinitionType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("archive_order"));

  public static final LogsArchiveOrderDefinitionType ARCHIVE_ORDER =
      new LogsArchiveOrderDefinitionType("archive_order");

  LogsArchiveOrderDefinitionType(String value) {
    super(value, allowedValues);
  }

  public static class LogsArchiveOrderDefinitionTypeSerializer
      extends StdSerializer<LogsArchiveOrderDefinitionType> {
    public LogsArchiveOrderDefinitionTypeSerializer(Class<LogsArchiveOrderDefinitionType> t) {
      super(t);
    }

    public LogsArchiveOrderDefinitionTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        LogsArchiveOrderDefinitionType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static LogsArchiveOrderDefinitionType fromValue(String value) {
    return new LogsArchiveOrderDefinitionType(value);
  }
}
