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
 * A time window is specified to match when at least one of the cases matches true. This is a
 * sliding window and evaluates in real time. For third party detection method, this field is not
 * used.
 */
@JsonSerialize(
    using =
        SecurityMonitoringRuleEvaluationWindow.SecurityMonitoringRuleEvaluationWindowSerializer
            .class)
public class SecurityMonitoringRuleEvaluationWindow extends ModelEnum<Integer> {

  private static final Set<Integer> allowedValues =
      new HashSet<Integer>(
          Arrays.asList(0, 60, 300, 600, 900, 1800, 3600, 7200, 10800, 21600, 43200, 86400));

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
  public static final SecurityMonitoringRuleEvaluationWindow THREE_HOURS =
      new SecurityMonitoringRuleEvaluationWindow(10800);
  public static final SecurityMonitoringRuleEvaluationWindow SIX_HOURS =
      new SecurityMonitoringRuleEvaluationWindow(21600);
  public static final SecurityMonitoringRuleEvaluationWindow TWELVE_HOURS =
      new SecurityMonitoringRuleEvaluationWindow(43200);
  public static final SecurityMonitoringRuleEvaluationWindow ONE_DAY =
      new SecurityMonitoringRuleEvaluationWindow(86400);

  SecurityMonitoringRuleEvaluationWindow(Integer value) {
    super(value, allowedValues);
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

  @JsonCreator
  public static SecurityMonitoringRuleEvaluationWindow fromValue(Integer value) {
    return new SecurityMonitoringRuleEvaluationWindow(value);
  }
}
