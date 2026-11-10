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

/** Rule category. Omitted for custom rules. */
@JsonSerialize(
    using =
        ArbitraryRuleResponseDataAttributesRuleCategory
            .ArbitraryRuleResponseDataAttributesRuleCategorySerializer.class)
public class ArbitraryRuleResponseDataAttributesRuleCategory extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("custom", "ai_gateway"));

  public static final ArbitraryRuleResponseDataAttributesRuleCategory CUSTOM =
      new ArbitraryRuleResponseDataAttributesRuleCategory("custom");
  public static final ArbitraryRuleResponseDataAttributesRuleCategory AI_GATEWAY =
      new ArbitraryRuleResponseDataAttributesRuleCategory("ai_gateway");

  ArbitraryRuleResponseDataAttributesRuleCategory(String value) {
    super(value, allowedValues);
  }

  public static class ArbitraryRuleResponseDataAttributesRuleCategorySerializer
      extends StdSerializer<ArbitraryRuleResponseDataAttributesRuleCategory> {
    public ArbitraryRuleResponseDataAttributesRuleCategorySerializer(
        Class<ArbitraryRuleResponseDataAttributesRuleCategory> t) {
      super(t);
    }

    public ArbitraryRuleResponseDataAttributesRuleCategorySerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ArbitraryRuleResponseDataAttributesRuleCategory value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ArbitraryRuleResponseDataAttributesRuleCategory fromValue(String value) {
    return new ArbitraryRuleResponseDataAttributesRuleCategory(value);
  }
}
