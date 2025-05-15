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
 * Once a signal is generated, the signal will remain "open" if a case is matched at least once
 * within this keep alive window. For third party detection method, this field is not used.
 */
@JsonSerialize(
    using = SecurityMonitoringRuleKeepAlive.SecurityMonitoringRuleKeepAliveSerializer.class)
public class SecurityMonitoringRuleKeepAlive extends ModelEnum<Integer> {

  private static final Set<Integer> allowedValues =
      new HashSet<Integer>(
          Arrays.asList(0, 60, 300, 600, 900, 1800, 3600, 7200, 10800, 21600, 43200, 86400));

  public static final SecurityMonitoringRuleKeepAlive ZERO_MINUTES =
      new SecurityMonitoringRuleKeepAlive(0);
  public static final SecurityMonitoringRuleKeepAlive ONE_MINUTE =
      new SecurityMonitoringRuleKeepAlive(60);
  public static final SecurityMonitoringRuleKeepAlive FIVE_MINUTES =
      new SecurityMonitoringRuleKeepAlive(300);
  public static final SecurityMonitoringRuleKeepAlive TEN_MINUTES =
      new SecurityMonitoringRuleKeepAlive(600);
  public static final SecurityMonitoringRuleKeepAlive FIFTEEN_MINUTES =
      new SecurityMonitoringRuleKeepAlive(900);
  public static final SecurityMonitoringRuleKeepAlive THIRTY_MINUTES =
      new SecurityMonitoringRuleKeepAlive(1800);
  public static final SecurityMonitoringRuleKeepAlive ONE_HOUR =
      new SecurityMonitoringRuleKeepAlive(3600);
  public static final SecurityMonitoringRuleKeepAlive TWO_HOURS =
      new SecurityMonitoringRuleKeepAlive(7200);
  public static final SecurityMonitoringRuleKeepAlive THREE_HOURS =
      new SecurityMonitoringRuleKeepAlive(10800);
  public static final SecurityMonitoringRuleKeepAlive SIX_HOURS =
      new SecurityMonitoringRuleKeepAlive(21600);
  public static final SecurityMonitoringRuleKeepAlive TWELVE_HOURS =
      new SecurityMonitoringRuleKeepAlive(43200);
  public static final SecurityMonitoringRuleKeepAlive ONE_DAY =
      new SecurityMonitoringRuleKeepAlive(86400);

  SecurityMonitoringRuleKeepAlive(Integer value) {
    super(value, allowedValues);
  }

  public static class SecurityMonitoringRuleKeepAliveSerializer
      extends StdSerializer<SecurityMonitoringRuleKeepAlive> {
    public SecurityMonitoringRuleKeepAliveSerializer(Class<SecurityMonitoringRuleKeepAlive> t) {
      super(t);
    }

    public SecurityMonitoringRuleKeepAliveSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SecurityMonitoringRuleKeepAlive value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SecurityMonitoringRuleKeepAlive fromValue(Integer value) {
    return new SecurityMonitoringRuleKeepAlive(value);
  }
}
