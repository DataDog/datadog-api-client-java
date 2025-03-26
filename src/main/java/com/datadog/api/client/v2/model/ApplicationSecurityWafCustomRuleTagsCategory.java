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

/**
 * The category of the WAF Rule, can be either <code>business_logic</code>, <code>attack_attempt
 * </code> or <code>security_response</code>.
 */
@JsonSerialize(
    using =
        ApplicationSecurityWafCustomRuleTagsCategory
            .ApplicationSecurityWafCustomRuleTagsCategorySerializer.class)
public class ApplicationSecurityWafCustomRuleTagsCategory extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("attack_attempt", "business_logic", "security_response"));

  public static final ApplicationSecurityWafCustomRuleTagsCategory ATTACK_ATTEMPT =
      new ApplicationSecurityWafCustomRuleTagsCategory("attack_attempt");
  public static final ApplicationSecurityWafCustomRuleTagsCategory BUSINESS_LOGIC =
      new ApplicationSecurityWafCustomRuleTagsCategory("business_logic");
  public static final ApplicationSecurityWafCustomRuleTagsCategory SECURITY_RESPONSE =
      new ApplicationSecurityWafCustomRuleTagsCategory("security_response");

  ApplicationSecurityWafCustomRuleTagsCategory(String value) {
    super(value, allowedValues);
  }

  public static class ApplicationSecurityWafCustomRuleTagsCategorySerializer
      extends StdSerializer<ApplicationSecurityWafCustomRuleTagsCategory> {
    public ApplicationSecurityWafCustomRuleTagsCategorySerializer(
        Class<ApplicationSecurityWafCustomRuleTagsCategory> t) {
      super(t);
    }

    public ApplicationSecurityWafCustomRuleTagsCategorySerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ApplicationSecurityWafCustomRuleTagsCategory value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ApplicationSecurityWafCustomRuleTagsCategory fromValue(String value) {
    return new ApplicationSecurityWafCustomRuleTagsCategory(value);
  }
}
