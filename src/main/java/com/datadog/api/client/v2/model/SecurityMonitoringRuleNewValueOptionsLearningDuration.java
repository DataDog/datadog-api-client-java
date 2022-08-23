/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
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
public class SecurityMonitoringRuleNewValueOptionsLearningDuration {

  public static final SecurityMonitoringRuleNewValueOptionsLearningDuration ZERO_DAYS =
      new SecurityMonitoringRuleNewValueOptionsLearningDuration(0);
  public static final SecurityMonitoringRuleNewValueOptionsLearningDuration ONE_DAY =
      new SecurityMonitoringRuleNewValueOptionsLearningDuration(1);
  public static final SecurityMonitoringRuleNewValueOptionsLearningDuration SEVEN_DAYS =
      new SecurityMonitoringRuleNewValueOptionsLearningDuration(7);

  private static final Set<Integer> allowedValues = new HashSet<Integer>(Arrays.asList(0, 1, 7));

  private Integer value;

  public boolean isValid() {
    return allowedValues.contains(this.value);
  }

  SecurityMonitoringRuleNewValueOptionsLearningDuration(Integer value) {
    this.value = value;
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

  @JsonValue
  public Integer getValue() {
    return this.value;
  }

  public void setValue(Integer value) {
    this.value = value;
  }

  /**
   * Return true if this SecurityMonitoringRuleNewValueOptionsLearningDuration object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return this.value.equals(((SecurityMonitoringRuleNewValueOptionsLearningDuration) o).value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value);
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static SecurityMonitoringRuleNewValueOptionsLearningDuration fromValue(Integer value) {
    return new SecurityMonitoringRuleNewValueOptionsLearningDuration(value);
  }
}
