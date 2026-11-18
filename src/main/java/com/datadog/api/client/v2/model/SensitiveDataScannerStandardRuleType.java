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

/** Type of standard rule, based on how it detects sensitive data. */
@JsonSerialize(
    using =
        SensitiveDataScannerStandardRuleType.SensitiveDataScannerStandardRuleTypeSerializer.class)
public class SensitiveDataScannerStandardRuleType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("regex_standard_rule", "machine_learning_standard_rule"));

  public static final SensitiveDataScannerStandardRuleType REGEX_STANDARD_RULE =
      new SensitiveDataScannerStandardRuleType("regex_standard_rule");
  public static final SensitiveDataScannerStandardRuleType MACHINE_LEARNING_STANDARD_RULE =
      new SensitiveDataScannerStandardRuleType("machine_learning_standard_rule");

  SensitiveDataScannerStandardRuleType(String value) {
    super(value, allowedValues);
  }

  public static class SensitiveDataScannerStandardRuleTypeSerializer
      extends StdSerializer<SensitiveDataScannerStandardRuleType> {
    public SensitiveDataScannerStandardRuleTypeSerializer(
        Class<SensitiveDataScannerStandardRuleType> t) {
      super(t);
    }

    public SensitiveDataScannerStandardRuleTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SensitiveDataScannerStandardRuleType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SensitiveDataScannerStandardRuleType fromValue(String value) {
    return new SensitiveDataScannerStandardRuleType(value);
  }
}
