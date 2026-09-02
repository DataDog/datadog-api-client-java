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

/** The type of the resource. The value should always be <code>custom_rule</code>. */
@JsonSerialize(
    using =
        ApplicationSecurityWafCustomRuleType.ApplicationSecurityWafCustomRuleTypeSerializer.class)
public class ApplicationSecurityWafCustomRuleType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("custom_rule"));

  public static final ApplicationSecurityWafCustomRuleType CUSTOM_RULE =
      new ApplicationSecurityWafCustomRuleType("custom_rule");

  ApplicationSecurityWafCustomRuleType(String value) {
    super(value, allowedValues);
  }

  public static class ApplicationSecurityWafCustomRuleTypeSerializer
      extends StdSerializer<ApplicationSecurityWafCustomRuleType> {
    public ApplicationSecurityWafCustomRuleTypeSerializer(
        Class<ApplicationSecurityWafCustomRuleType> t) {
      super(t);
    }

    public ApplicationSecurityWafCustomRuleTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ApplicationSecurityWafCustomRuleType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ApplicationSecurityWafCustomRuleType fromValue(String value) {
    return new ApplicationSecurityWafCustomRuleType(value);
  }
}
