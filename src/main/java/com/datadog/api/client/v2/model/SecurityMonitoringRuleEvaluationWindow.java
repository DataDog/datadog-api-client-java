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
 * A time window is specified to match when at least one of the cases matches true. This is a
 * sliding window and evaluates in real time.
 */
@JsonSerialize(
    using =
        SecurityMonitoringRuleEvaluationWindow.SecurityMonitoringRuleEvaluationWindowSerializer
            .class)
public class SecurityMonitoringRuleEvaluationWindow {

  public static final SecurityMonitoringRuleEvaluationWindow ZERO_MINUTES =
      new SecurityMonitoringRuleEvaluationWindow(0);
  public static final SecurityMonitoringRuleEvaluationWindow ONE_MINUTE =
      new SecurityMonitoringRuleEvaluationWindow(60);
  public static final SecurityMonitoringRuleEvaluationWindow FIVE_MINUTES =
      new SecurityMonitoringRuleEvaluationWindow(300);
  public static final SecurityMonitoringRuleEvaluationWindow TEN_MINUTES =
      new SecurityMonitoringRuleEvaluationWindow(600);
  public static final SecurityMonitoringRuleEvaluationWindow FIFTEEN_MINUTES =
      new SecurityMonitoringRuleEvaluationWindow(900);
  public static final SecurityMonitoringRuleEvaluationWindow THIRTY_MINUTES =
      new SecurityMonitoringRuleEvaluationWindow(1800);
  public static final SecurityMonitoringRuleEvaluationWindow ONE_HOUR =
      new SecurityMonitoringRuleEvaluationWindow(3600);
  public static final SecurityMonitoringRuleEvaluationWindow TWO_HOURS =
      new SecurityMonitoringRuleEvaluationWindow(7200);

  private static final Set<Integer> allowedValues =
      new HashSet<Integer>(Arrays.asList(0, 60, 300, 600, 900, 1800, 3600, 7200));

  private Integer value;

  public boolean isValid() {
    return allowedValues.contains(this.value);
  }

  SecurityMonitoringRuleEvaluationWindow(Integer value) {
    this.value = value;
  }

  public static class SecurityMonitoringRuleEvaluationWindowSerializer
      extends StdSerializer<SecurityMonitoringRuleEvaluationWindow> {
    public SecurityMonitoringRuleEvaluationWindowSerializer(
        Class<SecurityMonitoringRuleEvaluationWindow> t) {
      super(t);
    }

    public SecurityMonitoringRuleEvaluationWindowSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SecurityMonitoringRuleEvaluationWindow value,
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

  /** Return true if this SecurityMonitoringRuleEvaluationWindow object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return this.value.equals(((SecurityMonitoringRuleEvaluationWindow) o).value);
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
  public static SecurityMonitoringRuleEvaluationWindow fromValue(Integer value) {
    return new SecurityMonitoringRuleEvaluationWindow(value);
  }
}
