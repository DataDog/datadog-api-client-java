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

/** The processor type. The value should always be <code>sensitive_data_scanner</code>. */
@JsonSerialize(
    using =
        ObservabilityPipelineSensitiveDataScannerProcessorType
            .ObservabilityPipelineSensitiveDataScannerProcessorTypeSerializer.class)
public class ObservabilityPipelineSensitiveDataScannerProcessorType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("sensitive_data_scanner"));

  public static final ObservabilityPipelineSensitiveDataScannerProcessorType
      SENSITIVE_DATA_SCANNER =
          new ObservabilityPipelineSensitiveDataScannerProcessorType("sensitive_data_scanner");

  ObservabilityPipelineSensitiveDataScannerProcessorType(String value) {
    super(value, allowedValues);
  }

  public static class ObservabilityPipelineSensitiveDataScannerProcessorTypeSerializer
      extends StdSerializer<ObservabilityPipelineSensitiveDataScannerProcessorType> {
    public ObservabilityPipelineSensitiveDataScannerProcessorTypeSerializer(
        Class<ObservabilityPipelineSensitiveDataScannerProcessorType> t) {
      super(t);
    }

    public ObservabilityPipelineSensitiveDataScannerProcessorTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ObservabilityPipelineSensitiveDataScannerProcessorType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ObservabilityPipelineSensitiveDataScannerProcessorType fromValue(String value) {
    return new ObservabilityPipelineSensitiveDataScannerProcessorType(value);
  }
}
