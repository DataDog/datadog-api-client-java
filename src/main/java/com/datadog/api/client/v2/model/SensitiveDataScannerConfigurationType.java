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

/** Sensitive Data Scanner configuration type. */
@JsonSerialize(
    using =
        SensitiveDataScannerConfigurationType.SensitiveDataScannerConfigurationTypeSerializer.class)
public class SensitiveDataScannerConfigurationType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("sensitive_data_scanner_configuration"));

  public static final SensitiveDataScannerConfigurationType SENSITIVE_DATA_SCANNER_CONFIGURATIONS =
      new SensitiveDataScannerConfigurationType("sensitive_data_scanner_configuration");

  SensitiveDataScannerConfigurationType(String value) {
    super(value, allowedValues);
  }

  public static class SensitiveDataScannerConfigurationTypeSerializer
      extends StdSerializer<SensitiveDataScannerConfigurationType> {
    public SensitiveDataScannerConfigurationTypeSerializer(
        Class<SensitiveDataScannerConfigurationType> t) {
      super(t);
    }

    public SensitiveDataScannerConfigurationTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SensitiveDataScannerConfigurationType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SensitiveDataScannerConfigurationType fromValue(String value) {
    return new SensitiveDataScannerConfigurationType(value);
  }
}
