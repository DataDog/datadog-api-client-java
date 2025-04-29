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

/** Applies the rule to all fields. */
@JsonSerialize(
    using =
        ObservabilityPipelineSensitiveDataScannerProcessorScopeAllTarget
            .ObservabilityPipelineSensitiveDataScannerProcessorScopeAllTargetSerializer.class)
public class ObservabilityPipelineSensitiveDataScannerProcessorScopeAllTarget
    extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("all"));

  public static final ObservabilityPipelineSensitiveDataScannerProcessorScopeAllTarget ALL =
      new ObservabilityPipelineSensitiveDataScannerProcessorScopeAllTarget("all");

  ObservabilityPipelineSensitiveDataScannerProcessorScopeAllTarget(String value) {
    super(value, allowedValues);
  }

  public static class ObservabilityPipelineSensitiveDataScannerProcessorScopeAllTargetSerializer
      extends StdSerializer<ObservabilityPipelineSensitiveDataScannerProcessorScopeAllTarget> {
    public ObservabilityPipelineSensitiveDataScannerProcessorScopeAllTargetSerializer(
        Class<ObservabilityPipelineSensitiveDataScannerProcessorScopeAllTarget> t) {
      super(t);
    }

    public ObservabilityPipelineSensitiveDataScannerProcessorScopeAllTargetSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ObservabilityPipelineSensitiveDataScannerProcessorScopeAllTarget value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ObservabilityPipelineSensitiveDataScannerProcessorScopeAllTarget fromValue(
      String value) {
    return new ObservabilityPipelineSensitiveDataScannerProcessorScopeAllTarget(value);
  }
}
