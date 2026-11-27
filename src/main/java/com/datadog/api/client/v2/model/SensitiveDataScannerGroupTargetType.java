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
 * Type of target whose scanning groups are served by the target-scoped group routes. <code>
 * llm_observability</code> is Agent Observability, <code>ai_guard</code> is AI Guard.
 */
@JsonSerialize(
    using = SensitiveDataScannerGroupTargetType.SensitiveDataScannerGroupTargetTypeSerializer.class)
public class SensitiveDataScannerGroupTargetType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("llm_observability", "ai_guard"));

  public static final SensitiveDataScannerGroupTargetType LLM_OBSERVABILITY =
      new SensitiveDataScannerGroupTargetType("llm_observability");
  public static final SensitiveDataScannerGroupTargetType AI_GUARD =
      new SensitiveDataScannerGroupTargetType("ai_guard");

  SensitiveDataScannerGroupTargetType(String value) {
    super(value, allowedValues);
  }

  public static class SensitiveDataScannerGroupTargetTypeSerializer
      extends StdSerializer<SensitiveDataScannerGroupTargetType> {
    public SensitiveDataScannerGroupTargetTypeSerializer(
        Class<SensitiveDataScannerGroupTargetType> t) {
      super(t);
    }

    public SensitiveDataScannerGroupTargetTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SensitiveDataScannerGroupTargetType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SensitiveDataScannerGroupTargetType fromValue(String value) {
    return new SensitiveDataScannerGroupTargetType(value);
  }
}
