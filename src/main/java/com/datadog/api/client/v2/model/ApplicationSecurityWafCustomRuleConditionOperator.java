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

/** Operator to use for the WAF Condition. */
@JsonSerialize(
    using =
        ApplicationSecurityWafCustomRuleConditionOperator
            .ApplicationSecurityWafCustomRuleConditionOperatorSerializer.class)
public class ApplicationSecurityWafCustomRuleConditionOperator extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "match_regex",
              "!match_regex",
              "phrase_match",
              "!phrase_match",
              "is_xss",
              "is_sqli",
              "exact_match",
              "!exact_match",
              "ip_match",
              "!ip_match",
              "capture_data"));

  public static final ApplicationSecurityWafCustomRuleConditionOperator MATCH_REGEX =
      new ApplicationSecurityWafCustomRuleConditionOperator("match_regex");
  public static final ApplicationSecurityWafCustomRuleConditionOperator NOT_MATCH_REGEX =
      new ApplicationSecurityWafCustomRuleConditionOperator("!match_regex");
  public static final ApplicationSecurityWafCustomRuleConditionOperator PHRASE_MATCH =
      new ApplicationSecurityWafCustomRuleConditionOperator("phrase_match");
  public static final ApplicationSecurityWafCustomRuleConditionOperator NOT_PHRASE_MATCH =
      new ApplicationSecurityWafCustomRuleConditionOperator("!phrase_match");
  public static final ApplicationSecurityWafCustomRuleConditionOperator IS_XSS =
      new ApplicationSecurityWafCustomRuleConditionOperator("is_xss");
  public static final ApplicationSecurityWafCustomRuleConditionOperator IS_SQLI =
      new ApplicationSecurityWafCustomRuleConditionOperator("is_sqli");
  public static final ApplicationSecurityWafCustomRuleConditionOperator EXACT_MATCH =
      new ApplicationSecurityWafCustomRuleConditionOperator("exact_match");
  public static final ApplicationSecurityWafCustomRuleConditionOperator NOT_EXACT_MATCH =
      new ApplicationSecurityWafCustomRuleConditionOperator("!exact_match");
  public static final ApplicationSecurityWafCustomRuleConditionOperator IP_MATCH =
      new ApplicationSecurityWafCustomRuleConditionOperator("ip_match");
  public static final ApplicationSecurityWafCustomRuleConditionOperator NOT_IP_MATCH =
      new ApplicationSecurityWafCustomRuleConditionOperator("!ip_match");
  public static final ApplicationSecurityWafCustomRuleConditionOperator CAPTURE_DATA =
      new ApplicationSecurityWafCustomRuleConditionOperator("capture_data");

  ApplicationSecurityWafCustomRuleConditionOperator(String value) {
    super(value, allowedValues);
  }

  public static class ApplicationSecurityWafCustomRuleConditionOperatorSerializer
      extends StdSerializer<ApplicationSecurityWafCustomRuleConditionOperator> {
    public ApplicationSecurityWafCustomRuleConditionOperatorSerializer(
        Class<ApplicationSecurityWafCustomRuleConditionOperator> t) {
      super(t);
    }

    public ApplicationSecurityWafCustomRuleConditionOperatorSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ApplicationSecurityWafCustomRuleConditionOperator value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ApplicationSecurityWafCustomRuleConditionOperator fromValue(String value) {
    return new ApplicationSecurityWafCustomRuleConditionOperator(value);
  }
}
