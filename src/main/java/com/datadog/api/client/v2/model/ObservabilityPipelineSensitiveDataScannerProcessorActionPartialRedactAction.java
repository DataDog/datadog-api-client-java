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
 * Action type that redacts part of the sensitive data while preserving a configurable number of
 * characters, typically used for masking purposes (e.g., show last 4 digits of a credit card).
 */
@JsonSerialize(
    using =
        ObservabilityPipelineSensitiveDataScannerProcessorActionPartialRedactAction
            .ObservabilityPipelineSensitiveDataScannerProcessorActionPartialRedactActionSerializer
            .class)
public class ObservabilityPipelineSensitiveDataScannerProcessorActionPartialRedactAction
    extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("partial_redact"));

  public static final ObservabilityPipelineSensitiveDataScannerProcessorActionPartialRedactAction
      PARTIAL_REDACT =
          new ObservabilityPipelineSensitiveDataScannerProcessorActionPartialRedactAction(
              "partial_redact");

  ObservabilityPipelineSensitiveDataScannerProcessorActionPartialRedactAction(String value) {
    super(value, allowedValues);
  }

  public static
  class ObservabilityPipelineSensitiveDataScannerProcessorActionPartialRedactActionSerializer
      extends StdSerializer<
          ObservabilityPipelineSensitiveDataScannerProcessorActionPartialRedactAction> {
    public ObservabilityPipelineSensitiveDataScannerProcessorActionPartialRedactActionSerializer(
        Class<ObservabilityPipelineSensitiveDataScannerProcessorActionPartialRedactAction> t) {
      super(t);
    }

    public ObservabilityPipelineSensitiveDataScannerProcessorActionPartialRedactActionSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ObservabilityPipelineSensitiveDataScannerProcessorActionPartialRedactAction value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ObservabilityPipelineSensitiveDataScannerProcessorActionPartialRedactAction
      fromValue(String value) {
    return new ObservabilityPipelineSensitiveDataScannerProcessorActionPartialRedactAction(value);
  }
}
