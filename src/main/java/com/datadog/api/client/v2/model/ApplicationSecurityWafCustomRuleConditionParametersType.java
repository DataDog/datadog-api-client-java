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

/** The type of the value to compare against. Only used with the equals and !equals operator. */
@JsonSerialize(
    using =
        ApplicationSecurityWafCustomRuleConditionParametersType
            .ApplicationSecurityWafCustomRuleConditionParametersTypeSerializer.class)
public class ApplicationSecurityWafCustomRuleConditionParametersType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("boolean", "signed", "unsigned", "float", "string"));

  public static final ApplicationSecurityWafCustomRuleConditionParametersType BOOLEAN =
      new ApplicationSecurityWafCustomRuleConditionParametersType("boolean");
  public static final ApplicationSecurityWafCustomRuleConditionParametersType SIGNED =
      new ApplicationSecurityWafCustomRuleConditionParametersType("signed");
  public static final ApplicationSecurityWafCustomRuleConditionParametersType UNSIGNED =
      new ApplicationSecurityWafCustomRuleConditionParametersType("unsigned");
  public static final ApplicationSecurityWafCustomRuleConditionParametersType FLOAT =
      new ApplicationSecurityWafCustomRuleConditionParametersType("float");
  public static final ApplicationSecurityWafCustomRuleConditionParametersType STRING =
      new ApplicationSecurityWafCustomRuleConditionParametersType("string");

  ApplicationSecurityWafCustomRuleConditionParametersType(String value) {
    super(value, allowedValues);
  }

  public static class ApplicationSecurityWafCustomRuleConditionParametersTypeSerializer
      extends StdSerializer<ApplicationSecurityWafCustomRuleConditionParametersType> {
    public ApplicationSecurityWafCustomRuleConditionParametersTypeSerializer(
        Class<ApplicationSecurityWafCustomRuleConditionParametersType> t) {
      super(t);
    }

    public ApplicationSecurityWafCustomRuleConditionParametersTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ApplicationSecurityWafCustomRuleConditionParametersType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ApplicationSecurityWafCustomRuleConditionParametersType fromValue(String value) {
    return new ApplicationSecurityWafCustomRuleConditionParametersType(value);
  }
}
