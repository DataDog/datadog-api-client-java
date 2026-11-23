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

/** Type of a custom rule. */
@JsonSerialize(
    using =
        SensitiveDataScannerCustomRegexRuleType.SensitiveDataScannerCustomRegexRuleTypeSerializer
            .class)
public class SensitiveDataScannerCustomRegexRuleType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("regex_custom_rule"));

  public static final SensitiveDataScannerCustomRegexRuleType REGEX_CUSTOM_RULE =
      new SensitiveDataScannerCustomRegexRuleType("regex_custom_rule");

  SensitiveDataScannerCustomRegexRuleType(String value) {
    super(value, allowedValues);
  }

  public static class SensitiveDataScannerCustomRegexRuleTypeSerializer
      extends StdSerializer<SensitiveDataScannerCustomRegexRuleType> {
    public SensitiveDataScannerCustomRegexRuleTypeSerializer(
        Class<SensitiveDataScannerCustomRegexRuleType> t) {
      super(t);
    }

    public SensitiveDataScannerCustomRegexRuleTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SensitiveDataScannerCustomRegexRuleType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SensitiveDataScannerCustomRegexRuleType fromValue(String value) {
    return new SensitiveDataScannerCustomRegexRuleType(value);
  }
}
