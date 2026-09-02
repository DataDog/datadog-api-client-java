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

/**
 * The type of AI memory violation result indicating whether it is a true positive or false
 * positive.
 */
@JsonSerialize(using = AiMemoryViolationType.AiMemoryViolationTypeSerializer.class)
public class AiMemoryViolationType extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("TP", "FP"));

  public static final AiMemoryViolationType TP = new AiMemoryViolationType("TP");
  public static final AiMemoryViolationType FP = new AiMemoryViolationType("FP");

  AiMemoryViolationType(String value) {
    super(value, allowedValues);
  }

  public static class AiMemoryViolationTypeSerializer extends StdSerializer<AiMemoryViolationType> {
    public AiMemoryViolationTypeSerializer(Class<AiMemoryViolationType> t) {
      super(t);
    }

    public AiMemoryViolationTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        AiMemoryViolationType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static AiMemoryViolationType fromValue(String value) {
    return new AiMemoryViolationType(value);
  }
}
