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
 * Action type that completely replaces the matched sensitive data with a fixed replacement string
 * to remove all visibility.
 */
@JsonSerialize(
    using =
        ObservabilityPipelineSensitiveDataScannerProcessorActionRedactAction
            .ObservabilityPipelineSensitiveDataScannerProcessorActionRedactActionSerializer.class)
public class ObservabilityPipelineSensitiveDataScannerProcessorActionRedactAction
    extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("redact"));

  public static final ObservabilityPipelineSensitiveDataScannerProcessorActionRedactAction REDACT =
      new ObservabilityPipelineSensitiveDataScannerProcessorActionRedactAction("redact");

  ObservabilityPipelineSensitiveDataScannerProcessorActionRedactAction(String value) {
    super(value, allowedValues);
  }

  public static class ObservabilityPipelineSensitiveDataScannerProcessorActionRedactActionSerializer
      extends StdSerializer<ObservabilityPipelineSensitiveDataScannerProcessorActionRedactAction> {
    public ObservabilityPipelineSensitiveDataScannerProcessorActionRedactActionSerializer(
        Class<ObservabilityPipelineSensitiveDataScannerProcessorActionRedactAction> t) {
      super(t);
    }

    public ObservabilityPipelineSensitiveDataScannerProcessorActionRedactActionSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ObservabilityPipelineSensitiveDataScannerProcessorActionRedactAction value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ObservabilityPipelineSensitiveDataScannerProcessorActionRedactAction fromValue(
      String value) {
    return new ObservabilityPipelineSensitiveDataScannerProcessorActionRedactAction(value);
  }
}
