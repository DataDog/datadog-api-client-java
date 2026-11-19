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
 * How the filter compares the tag. <code>is</code>, <code>is_not</code>, <code>contains</code>,
 * <code>does_not_contain</code>, <code>like</code> (glob), and <code>not_like</code> compare the
 * tag values with <code>values</code>. <code>all</code> matches resources that have the tag and
 * <code>untagged</code> matches resources that do not, so both ignore <code>values</code>.
 */
@JsonSerialize(
    using =
        CostRecommendationCustomRuleFilterType.CostRecommendationCustomRuleFilterTypeSerializer
            .class)
public class CostRecommendationCustomRuleFilterType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "is",
              "is_not",
              "contains",
              "does_not_contain",
              "like",
              "not_like",
              "all",
              "untagged"));

  public static final CostRecommendationCustomRuleFilterType IS =
      new CostRecommendationCustomRuleFilterType("is");
  public static final CostRecommendationCustomRuleFilterType IS_NOT =
      new CostRecommendationCustomRuleFilterType("is_not");
  public static final CostRecommendationCustomRuleFilterType CONTAINS =
      new CostRecommendationCustomRuleFilterType("contains");
  public static final CostRecommendationCustomRuleFilterType DOES_NOT_CONTAIN =
      new CostRecommendationCustomRuleFilterType("does_not_contain");
  public static final CostRecommendationCustomRuleFilterType LIKE =
      new CostRecommendationCustomRuleFilterType("like");
  public static final CostRecommendationCustomRuleFilterType NOT_LIKE =
      new CostRecommendationCustomRuleFilterType("not_like");
  public static final CostRecommendationCustomRuleFilterType ALL =
      new CostRecommendationCustomRuleFilterType("all");
  public static final CostRecommendationCustomRuleFilterType UNTAGGED =
      new CostRecommendationCustomRuleFilterType("untagged");

  CostRecommendationCustomRuleFilterType(String value) {
    super(value, allowedValues);
  }

  public static class CostRecommendationCustomRuleFilterTypeSerializer
      extends StdSerializer<CostRecommendationCustomRuleFilterType> {
    public CostRecommendationCustomRuleFilterTypeSerializer(
        Class<CostRecommendationCustomRuleFilterType> t) {
      super(t);
    }

    public CostRecommendationCustomRuleFilterTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        CostRecommendationCustomRuleFilterType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static CostRecommendationCustomRuleFilterType fromValue(String value) {
    return new CostRecommendationCustomRuleFilterType(value);
  }
}
