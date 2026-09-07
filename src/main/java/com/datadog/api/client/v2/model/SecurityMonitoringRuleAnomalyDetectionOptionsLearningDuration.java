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
 * Learning duration in hours. Anomaly detection waits for at least this amount of historical data
 * before it starts evaluating.
 */
@JsonSerialize(
    using =
        SecurityMonitoringRuleAnomalyDetectionOptionsLearningDuration
            .SecurityMonitoringRuleAnomalyDetectionOptionsLearningDurationSerializer.class)
public class SecurityMonitoringRuleAnomalyDetectionOptionsLearningDuration
    extends ModelEnum<Integer> {

  private static final Set<Integer> allowedValues =
      new HashSet<Integer>(Arrays.asList(1, 6, 12, 24, 48, 168, 336));

  public static final SecurityMonitoringRuleAnomalyDetectionOptionsLearningDuration ONE_HOUR =
      new SecurityMonitoringRuleAnomalyDetectionOptionsLearningDuration(1);
  public static final SecurityMonitoringRuleAnomalyDetectionOptionsLearningDuration SIX_HOURS =
      new SecurityMonitoringRuleAnomalyDetectionOptionsLearningDuration(6);
  public static final SecurityMonitoringRuleAnomalyDetectionOptionsLearningDuration TWELVE_HOURS =
      new SecurityMonitoringRuleAnomalyDetectionOptionsLearningDuration(12);
  public static final SecurityMonitoringRuleAnomalyDetectionOptionsLearningDuration ONE_DAY =
      new SecurityMonitoringRuleAnomalyDetectionOptionsLearningDuration(24);
  public static final SecurityMonitoringRuleAnomalyDetectionOptionsLearningDuration TWO_DAYS =
      new SecurityMonitoringRuleAnomalyDetectionOptionsLearningDuration(48);
  public static final SecurityMonitoringRuleAnomalyDetectionOptionsLearningDuration ONE_WEEK =
      new SecurityMonitoringRuleAnomalyDetectionOptionsLearningDuration(168);
  public static final SecurityMonitoringRuleAnomalyDetectionOptionsLearningDuration TWO_WEEKS =
      new SecurityMonitoringRuleAnomalyDetectionOptionsLearningDuration(336);

  SecurityMonitoringRuleAnomalyDetectionOptionsLearningDuration(Integer value) {
    super(value, allowedValues);
  }

  public static class SecurityMonitoringRuleAnomalyDetectionOptionsLearningDurationSerializer
      extends StdSerializer<SecurityMonitoringRuleAnomalyDetectionOptionsLearningDuration> {
    public SecurityMonitoringRuleAnomalyDetectionOptionsLearningDurationSerializer(
        Class<SecurityMonitoringRuleAnomalyDetectionOptionsLearningDuration> t) {
      super(t);
    }

    public SecurityMonitoringRuleAnomalyDetectionOptionsLearningDurationSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SecurityMonitoringRuleAnomalyDetectionOptionsLearningDuration value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SecurityMonitoringRuleAnomalyDetectionOptionsLearningDuration fromValue(
      Integer value) {
    return new SecurityMonitoringRuleAnomalyDetectionOptionsLearningDuration(value);
  }
}
