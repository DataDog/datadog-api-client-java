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

/** Type of logs attribute remapper. */
@JsonSerialize(using = LogsAttributeRemapperType.LogsAttributeRemapperTypeSerializer.class)
public class LogsAttributeRemapperType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("attribute-remapper"));

  public static final LogsAttributeRemapperType ATTRIBUTE_REMAPPER =
      new LogsAttributeRemapperType("attribute-remapper");

  LogsAttributeRemapperType(String value) {
    super(value, allowedValues);
  }

  public static class LogsAttributeRemapperTypeSerializer
      extends StdSerializer<LogsAttributeRemapperType> {
    public LogsAttributeRemapperTypeSerializer(Class<LogsAttributeRemapperType> t) {
      super(t);
    }

    public LogsAttributeRemapperTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        LogsAttributeRemapperType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static LogsAttributeRemapperType fromValue(String value) {
    return new LogsAttributeRemapperType(value);
  }
}
