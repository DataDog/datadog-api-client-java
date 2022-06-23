/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.v2.client.model;

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
 * A number of occurrences after which signals will be generated for values that weren't learned.
 */
@JsonSerialize(
    using =
        SecurityMonitoringRuleNewValueOptionsLearningThreshold
            .SecurityMonitoringRuleNewValueOptionsLearningThresholdSerializer.class)
public class SecurityMonitoringRuleNewValueOptionsLearningThreshold {

  public static final SecurityMonitoringRuleNewValueOptionsLearningThreshold ZERO_OCCURRENCES =
      new SecurityMonitoringRuleNewValueOptionsLearningThreshold(0);
  public static final SecurityMonitoringRuleNewValueOptionsLearningThreshold ONE_OCCURRENCE =
      new SecurityMonitoringRuleNewValueOptionsLearningThreshold(1);

  private static final Set<Integer> allowedValues = new HashSet<Integer>(Arrays.asList(0, 1));

  private Integer value;

  public boolean isValid() {
    return allowedValues.contains(this.value);
  }

  SecurityMonitoringRuleNewValueOptionsLearningThreshold(Integer value) {
    this.value = value;
  }

  public static class SecurityMonitoringRuleNewValueOptionsLearningThresholdSerializer
      extends StdSerializer<SecurityMonitoringRuleNewValueOptionsLearningThreshold> {
    public SecurityMonitoringRuleNewValueOptionsLearningThresholdSerializer(
        Class<SecurityMonitoringRuleNewValueOptionsLearningThreshold> t) {
      super(t);
    }

    public SecurityMonitoringRuleNewValueOptionsLearningThresholdSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SecurityMonitoringRuleNewValueOptionsLearningThreshold value,
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
   * Return true if this SecurityMonitoringRuleNewValueOptionsLearningThreshold object is equal to
   * o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return this.value.equals(((SecurityMonitoringRuleNewValueOptionsLearningThreshold) o).value);
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
  public static SecurityMonitoringRuleNewValueOptionsLearningThreshold fromValue(Integer value) {
    return new SecurityMonitoringRuleNewValueOptionsLearningThreshold(value);
  }
}
