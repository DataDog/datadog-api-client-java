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
 * Severity associated with this critical asset. Either an explicit severity can be set, or the
 * severity can be increased or decreased.
 */
@JsonSerialize(
    using =
        SecurityMonitoringCriticalAssetSeverity.SecurityMonitoringCriticalAssetSeveritySerializer
            .class)
public class SecurityMonitoringCriticalAssetSeverity extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList("info", "low", "medium", "high", "critical", "increase", "decrease"));

  public static final SecurityMonitoringCriticalAssetSeverity INFO =
      new SecurityMonitoringCriticalAssetSeverity("info");
  public static final SecurityMonitoringCriticalAssetSeverity LOW =
      new SecurityMonitoringCriticalAssetSeverity("low");
  public static final SecurityMonitoringCriticalAssetSeverity MEDIUM =
      new SecurityMonitoringCriticalAssetSeverity("medium");
  public static final SecurityMonitoringCriticalAssetSeverity HIGH =
      new SecurityMonitoringCriticalAssetSeverity("high");
  public static final SecurityMonitoringCriticalAssetSeverity CRITICAL =
      new SecurityMonitoringCriticalAssetSeverity("critical");
  public static final SecurityMonitoringCriticalAssetSeverity INCREASE =
      new SecurityMonitoringCriticalAssetSeverity("increase");
  public static final SecurityMonitoringCriticalAssetSeverity DECREASE =
      new SecurityMonitoringCriticalAssetSeverity("decrease");

  SecurityMonitoringCriticalAssetSeverity(String value) {
    super(value, allowedValues);
  }

  public static class SecurityMonitoringCriticalAssetSeveritySerializer
      extends StdSerializer<SecurityMonitoringCriticalAssetSeverity> {
    public SecurityMonitoringCriticalAssetSeveritySerializer(
        Class<SecurityMonitoringCriticalAssetSeverity> t) {
      super(t);
    }

    public SecurityMonitoringCriticalAssetSeveritySerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SecurityMonitoringCriticalAssetSeverity value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SecurityMonitoringCriticalAssetSeverity fromValue(String value) {
    return new SecurityMonitoringCriticalAssetSeverity(value);
  }
}
