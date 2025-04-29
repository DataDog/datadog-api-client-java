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
 * Action type that replaces the matched sensitive data with a hashed representation, preserving
 * structure while securing content.
 */
@JsonSerialize(
    using =
        ObservabilityPipelineSensitiveDataScannerProcessorActionHashAction
            .ObservabilityPipelineSensitiveDataScannerProcessorActionHashActionSerializer.class)
public class ObservabilityPipelineSensitiveDataScannerProcessorActionHashAction
    extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("hash"));

  public static final ObservabilityPipelineSensitiveDataScannerProcessorActionHashAction HASH =
      new ObservabilityPipelineSensitiveDataScannerProcessorActionHashAction("hash");

  ObservabilityPipelineSensitiveDataScannerProcessorActionHashAction(String value) {
    super(value, allowedValues);
  }

  public static class ObservabilityPipelineSensitiveDataScannerProcessorActionHashActionSerializer
      extends StdSerializer<ObservabilityPipelineSensitiveDataScannerProcessorActionHashAction> {
    public ObservabilityPipelineSensitiveDataScannerProcessorActionHashActionSerializer(
        Class<ObservabilityPipelineSensitiveDataScannerProcessorActionHashAction> t) {
      super(t);
    }

    public ObservabilityPipelineSensitiveDataScannerProcessorActionHashActionSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ObservabilityPipelineSensitiveDataScannerProcessorActionHashAction value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ObservabilityPipelineSensitiveDataScannerProcessorActionHashAction fromValue(
      String value) {
    return new ObservabilityPipelineSensitiveDataScannerProcessorActionHashAction(value);
  }
}
