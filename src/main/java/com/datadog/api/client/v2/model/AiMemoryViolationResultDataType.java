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

/** AI memory violation result resource type. */
@JsonSerialize(
    using = AiMemoryViolationResultDataType.AiMemoryViolationResultDataTypeSerializer.class)
public class AiMemoryViolationResultDataType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("ai_memory_violation_result"));

  public static final AiMemoryViolationResultDataType AI_MEMORY_VIOLATION_RESULT =
      new AiMemoryViolationResultDataType("ai_memory_violation_result");

  AiMemoryViolationResultDataType(String value) {
    super(value, allowedValues);
  }

  public static class AiMemoryViolationResultDataTypeSerializer
      extends StdSerializer<AiMemoryViolationResultDataType> {
    public AiMemoryViolationResultDataTypeSerializer(Class<AiMemoryViolationResultDataType> t) {
      super(t);
    }

    public AiMemoryViolationResultDataTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        AiMemoryViolationResultDataType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static AiMemoryViolationResultDataType fromValue(String value) {
    return new AiMemoryViolationResultDataType(value);
  }
}
