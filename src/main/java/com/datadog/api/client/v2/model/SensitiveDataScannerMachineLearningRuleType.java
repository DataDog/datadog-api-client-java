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

/** Type of a rule based on a standard machine learning rule. */
@JsonSerialize(
    using =
        SensitiveDataScannerMachineLearningRuleType
            .SensitiveDataScannerMachineLearningRuleTypeSerializer.class)
public class SensitiveDataScannerMachineLearningRuleType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("machine_learning_standard_rule"));

  public static final SensitiveDataScannerMachineLearningRuleType MACHINE_LEARNING_STANDARD_RULE =
      new SensitiveDataScannerMachineLearningRuleType("machine_learning_standard_rule");

  SensitiveDataScannerMachineLearningRuleType(String value) {
    super(value, allowedValues);
  }

  public static class SensitiveDataScannerMachineLearningRuleTypeSerializer
      extends StdSerializer<SensitiveDataScannerMachineLearningRuleType> {
    public SensitiveDataScannerMachineLearningRuleTypeSerializer(
        Class<SensitiveDataScannerMachineLearningRuleType> t) {
      super(t);
    }

    public SensitiveDataScannerMachineLearningRuleTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SensitiveDataScannerMachineLearningRuleType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SensitiveDataScannerMachineLearningRuleType fromValue(String value) {
    return new SensitiveDataScannerMachineLearningRuleType(value);
  }
}
