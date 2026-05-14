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

/** The category of the security rule. */
@JsonSerialize(using = RuleBasedViewRuleCategory.RuleBasedViewRuleCategorySerializer.class)
public class RuleBasedViewRuleCategory extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList("cloud_configuration", "infrastructure_configuration", "api_security"));

  public static final RuleBasedViewRuleCategory CLOUD_CONFIGURATION =
      new RuleBasedViewRuleCategory("cloud_configuration");
  public static final RuleBasedViewRuleCategory INFRASTRUCTURE_CONFIGURATION =
      new RuleBasedViewRuleCategory("infrastructure_configuration");
  public static final RuleBasedViewRuleCategory API_SECURITY =
      new RuleBasedViewRuleCategory("api_security");

  RuleBasedViewRuleCategory(String value) {
    super(value, allowedValues);
  }

  public static class RuleBasedViewRuleCategorySerializer
      extends StdSerializer<RuleBasedViewRuleCategory> {
    public RuleBasedViewRuleCategorySerializer(Class<RuleBasedViewRuleCategory> t) {
      super(t);
    }

    public RuleBasedViewRuleCategorySerializer() {
      this(null);
    }

    @Override
    public void serialize(
        RuleBasedViewRuleCategory value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static RuleBasedViewRuleCategory fromValue(String value) {
    return new RuleBasedViewRuleCategory(value);
  }
}
