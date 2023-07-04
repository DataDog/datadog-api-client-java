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

/** Sensitive Data Scanner standard pattern type. */
@JsonSerialize(
    using =
        SensitiveDataScannerStandardPatternType.SensitiveDataScannerStandardPatternTypeSerializer
            .class)
public class SensitiveDataScannerStandardPatternType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("sensitive_data_scanner_standard_pattern"));

  public static final SensitiveDataScannerStandardPatternType
      SENSITIVE_DATA_SCANNER_STANDARD_PATTERN =
          new SensitiveDataScannerStandardPatternType("sensitive_data_scanner_standard_pattern");

  SensitiveDataScannerStandardPatternType(String value) {
    super(value, allowedValues);
  }

  public static class SensitiveDataScannerStandardPatternTypeSerializer
      extends StdSerializer<SensitiveDataScannerStandardPatternType> {
    public SensitiveDataScannerStandardPatternTypeSerializer(
        Class<SensitiveDataScannerStandardPatternType> t) {
      super(t);
    }

    public SensitiveDataScannerStandardPatternTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SensitiveDataScannerStandardPatternType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SensitiveDataScannerStandardPatternType fromValue(String value) {
    return new SensitiveDataScannerStandardPatternType(value);
  }
}
