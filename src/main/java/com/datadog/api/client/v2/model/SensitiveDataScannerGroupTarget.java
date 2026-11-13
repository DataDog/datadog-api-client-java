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

/** Datadog product whose scanning groups are served by the target-scoped group routes. */
@JsonSerialize(
    using = SensitiveDataScannerGroupTarget.SensitiveDataScannerGroupTargetSerializer.class)
public class SensitiveDataScannerGroupTarget extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("llm_observability"));

  public static final SensitiveDataScannerGroupTarget LLM_OBSERVABILITY =
      new SensitiveDataScannerGroupTarget("llm_observability");

  SensitiveDataScannerGroupTarget(String value) {
    super(value, allowedValues);
  }

  public static class SensitiveDataScannerGroupTargetSerializer
      extends StdSerializer<SensitiveDataScannerGroupTarget> {
    public SensitiveDataScannerGroupTargetSerializer(Class<SensitiveDataScannerGroupTarget> t) {
      super(t);
    }

    public SensitiveDataScannerGroupTargetSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SensitiveDataScannerGroupTarget value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SensitiveDataScannerGroupTarget fromValue(String value) {
    return new SensitiveDataScannerGroupTarget(value);
  }
}
