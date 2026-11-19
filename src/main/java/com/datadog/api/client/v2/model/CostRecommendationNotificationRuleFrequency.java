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
 * How often the digest is sent. <code>weekly</code> and <code>biweekly</code> use <code>
 * weekly_execution_day</code> and <code>weekly_execution_time</code>; <code>every_30</code> and
 * <code>every_90</code> (days) use <code>interval_execution_date</code> and <code>
 * interval_execution_time</code>.
 */
@JsonSerialize(
    using =
        CostRecommendationNotificationRuleFrequency
            .CostRecommendationNotificationRuleFrequencySerializer.class)
public class CostRecommendationNotificationRuleFrequency extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("weekly", "biweekly", "every_30", "every_90"));

  public static final CostRecommendationNotificationRuleFrequency WEEKLY =
      new CostRecommendationNotificationRuleFrequency("weekly");
  public static final CostRecommendationNotificationRuleFrequency BIWEEKLY =
      new CostRecommendationNotificationRuleFrequency("biweekly");
  public static final CostRecommendationNotificationRuleFrequency EVERY_30 =
      new CostRecommendationNotificationRuleFrequency("every_30");
  public static final CostRecommendationNotificationRuleFrequency EVERY_90 =
      new CostRecommendationNotificationRuleFrequency("every_90");

  CostRecommendationNotificationRuleFrequency(String value) {
    super(value, allowedValues);
  }

  public static class CostRecommendationNotificationRuleFrequencySerializer
      extends StdSerializer<CostRecommendationNotificationRuleFrequency> {
    public CostRecommendationNotificationRuleFrequencySerializer(
        Class<CostRecommendationNotificationRuleFrequency> t) {
      super(t);
    }

    public CostRecommendationNotificationRuleFrequencySerializer() {
      this(null);
    }

    @Override
    public void serialize(
        CostRecommendationNotificationRuleFrequency value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static CostRecommendationNotificationRuleFrequency fromValue(String value) {
    return new CostRecommendationNotificationRuleFrequency(value);
  }
}
