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
 * The duration in days during which values are learned, and after which signals will be generated
 * for values that weren't learned. If set to 0, a signal will be generated for all new values after
 * the first value is learned.
 */
@JsonSerialize(
    using =
        SecurityMonitoringRuleNewValueOptionsLearningDuration
            .SecurityMonitoringRuleNewValueOptionsLearningDurationSerializer.class)
public class SecurityMonitoringRuleNewValueOptionsLearningDuration extends ModelEnum<Integer> {

  private static final Set<Integer> allowedValues = new HashSet<Integer>(Arrays.asList(0, 1, 7));

  public static final SecurityMonitoringRuleNewValueOptionsLearningDuration ZERO_DAYS =
      new SecurityMonitoringRuleNewValueOptionsLearningDuration(0);
  public static final SecurityMonitoringRuleNewValueOptionsLearningDuration ONE_DAY =
      new SecurityMonitoringRuleNewValueOptionsLearningDuration(1);
  public static final SecurityMonitoringRuleNewValueOptionsLearningDuration SEVEN_DAYS =
      new SecurityMonitoringRuleNewValueOptionsLearningDuration(7);

  SecurityMonitoringRuleNewValueOptionsLearningDuration(Integer value) {
    super(value, allowedValues);
  }

  public static class SecurityMonitoringRuleNewValueOptionsLearningDurationSerializer
      extends StdSerializer<SecurityMonitoringRuleNewValueOptionsLearningDuration> {
    public SecurityMonitoringRuleNewValueOptionsLearningDurationSerializer(
        Class<SecurityMonitoringRuleNewValueOptionsLearningDuration> t) {
      super(t);
    }

    public SecurityMonitoringRuleNewValueOptionsLearningDurationSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SecurityMonitoringRuleNewValueOptionsLearningDuration value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SecurityMonitoringRuleNewValueOptionsLearningDuration fromValue(Integer value) {
    return new SecurityMonitoringRuleNewValueOptionsLearningDuration(value);
  }
}
