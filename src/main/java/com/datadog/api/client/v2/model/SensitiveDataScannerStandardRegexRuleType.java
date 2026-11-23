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

/** Type of a rule based on a standard regex rule. */
@JsonSerialize(
    using =
        SensitiveDataScannerStandardRegexRuleType
            .SensitiveDataScannerStandardRegexRuleTypeSerializer.class)
public class SensitiveDataScannerStandardRegexRuleType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("regex_standard_rule"));

  public static final SensitiveDataScannerStandardRegexRuleType REGEX_STANDARD_RULE =
      new SensitiveDataScannerStandardRegexRuleType("regex_standard_rule");

  SensitiveDataScannerStandardRegexRuleType(String value) {
    super(value, allowedValues);
  }

  public static class SensitiveDataScannerStandardRegexRuleTypeSerializer
      extends StdSerializer<SensitiveDataScannerStandardRegexRuleType> {
    public SensitiveDataScannerStandardRegexRuleTypeSerializer(
        Class<SensitiveDataScannerStandardRegexRuleType> t) {
      super(t);
    }

    public SensitiveDataScannerStandardRegexRuleTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SensitiveDataScannerStandardRegexRuleType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SensitiveDataScannerStandardRegexRuleType fromValue(String value) {
    return new SensitiveDataScannerStandardRegexRuleType(value);
  }
}
