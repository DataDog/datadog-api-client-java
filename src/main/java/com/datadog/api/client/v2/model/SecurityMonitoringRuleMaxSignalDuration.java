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
 * A signal will "close" regardless of the query being matched once the time exceeds the maximum
 * duration. This time is calculated from the first seen timestamp.
 */
@JsonSerialize(
    using =
        SecurityMonitoringRuleMaxSignalDuration.SecurityMonitoringRuleMaxSignalDurationSerializer
            .class)
public class SecurityMonitoringRuleMaxSignalDuration extends ModelEnum<Integer> {

  private static final Set<Integer> allowedValues =
      new HashSet<Integer>(
          Arrays.asList(0, 60, 300, 600, 900, 1800, 3600, 7200, 10800, 21600, 43200, 86400));

  public static final SecurityMonitoringRuleMaxSignalDuration ZERO_MINUTES =
      new SecurityMonitoringRuleMaxSignalDuration(0);
  public static final SecurityMonitoringRuleMaxSignalDuration ONE_MINUTE =
      new SecurityMonitoringRuleMaxSignalDuration(60);
  public static final SecurityMonitoringRuleMaxSignalDuration FIVE_MINUTES =
      new SecurityMonitoringRuleMaxSignalDuration(300);
  public static final SecurityMonitoringRuleMaxSignalDuration TEN_MINUTES =
      new SecurityMonitoringRuleMaxSignalDuration(600);
  public static final SecurityMonitoringRuleMaxSignalDuration FIFTEEN_MINUTES =
      new SecurityMonitoringRuleMaxSignalDuration(900);
  public static final SecurityMonitoringRuleMaxSignalDuration THIRTY_MINUTES =
      new SecurityMonitoringRuleMaxSignalDuration(1800);
  public static final SecurityMonitoringRuleMaxSignalDuration ONE_HOUR =
      new SecurityMonitoringRuleMaxSignalDuration(3600);
  public static final SecurityMonitoringRuleMaxSignalDuration TWO_HOURS =
      new SecurityMonitoringRuleMaxSignalDuration(7200);
  public static final SecurityMonitoringRuleMaxSignalDuration THREE_HOURS =
      new SecurityMonitoringRuleMaxSignalDuration(10800);
  public static final SecurityMonitoringRuleMaxSignalDuration SIX_HOURS =
      new SecurityMonitoringRuleMaxSignalDuration(21600);
  public static final SecurityMonitoringRuleMaxSignalDuration TWELVE_HOURS =
      new SecurityMonitoringRuleMaxSignalDuration(43200);
  public static final SecurityMonitoringRuleMaxSignalDuration ONE_DAY =
      new SecurityMonitoringRuleMaxSignalDuration(86400);

  SecurityMonitoringRuleMaxSignalDuration(Integer value) {
    super(value, allowedValues);
  }

  public static class SecurityMonitoringRuleMaxSignalDurationSerializer
      extends StdSerializer<SecurityMonitoringRuleMaxSignalDuration> {
    public SecurityMonitoringRuleMaxSignalDurationSerializer(
        Class<SecurityMonitoringRuleMaxSignalDuration> t) {
      super(t);
    }

    public SecurityMonitoringRuleMaxSignalDurationSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SecurityMonitoringRuleMaxSignalDuration value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SecurityMonitoringRuleMaxSignalDuration fromValue(Integer value) {
    return new SecurityMonitoringRuleMaxSignalDuration(value);
  }
}
