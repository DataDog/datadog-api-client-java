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

/** Indicates whether to redact characters from the first or last part of the matched value. */
@JsonSerialize(
    using =
        ObservabilityPipelineSensitiveDataScannerProcessorActionPartialRedactOptionsDirection
            .ObservabilityPipelineSensitiveDataScannerProcessorActionPartialRedactOptionsDirectionSerializer
            .class)
public class ObservabilityPipelineSensitiveDataScannerProcessorActionPartialRedactOptionsDirection
    extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("first", "last"));

  public static final
  ObservabilityPipelineSensitiveDataScannerProcessorActionPartialRedactOptionsDirection FIRST =
      new ObservabilityPipelineSensitiveDataScannerProcessorActionPartialRedactOptionsDirection(
          "first");
  public static final
  ObservabilityPipelineSensitiveDataScannerProcessorActionPartialRedactOptionsDirection LAST =
      new ObservabilityPipelineSensitiveDataScannerProcessorActionPartialRedactOptionsDirection(
          "last");

  ObservabilityPipelineSensitiveDataScannerProcessorActionPartialRedactOptionsDirection(
      String value) {
    super(value, allowedValues);
  }

  public static
  class ObservabilityPipelineSensitiveDataScannerProcessorActionPartialRedactOptionsDirectionSerializer
      extends StdSerializer<
          ObservabilityPipelineSensitiveDataScannerProcessorActionPartialRedactOptionsDirection> {
    public
    ObservabilityPipelineSensitiveDataScannerProcessorActionPartialRedactOptionsDirectionSerializer(
        Class<ObservabilityPipelineSensitiveDataScannerProcessorActionPartialRedactOptionsDirection>
            t) {
      super(t);
    }

    public
    ObservabilityPipelineSensitiveDataScannerProcessorActionPartialRedactOptionsDirectionSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ObservabilityPipelineSensitiveDataScannerProcessorActionPartialRedactOptionsDirection value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static
  ObservabilityPipelineSensitiveDataScannerProcessorActionPartialRedactOptionsDirection fromValue(
      String value) {
    return new ObservabilityPipelineSensitiveDataScannerProcessorActionPartialRedactOptionsDirection(
        value);
  }
}
