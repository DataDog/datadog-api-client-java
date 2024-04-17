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

/** Specifies the evaluation result (Signal or Finding). */
@JsonSerialize(
    using =
        SecurityMonitoringNotificationRuleTriggerSource
            .SecurityMonitoringNotificationRuleTriggerSourceSerializer.class)
public class SecurityMonitoringNotificationRuleTriggerSource extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("security_signals", "security_findings"));

  public static final SecurityMonitoringNotificationRuleTriggerSource SECURITY_SIGNALS =
      new SecurityMonitoringNotificationRuleTriggerSource("security_signals");
  public static final SecurityMonitoringNotificationRuleTriggerSource SECURITY_FINDINGS =
      new SecurityMonitoringNotificationRuleTriggerSource("security_findings");

  SecurityMonitoringNotificationRuleTriggerSource(String value) {
    super(value, allowedValues);
  }

  public static class SecurityMonitoringNotificationRuleTriggerSourceSerializer
      extends StdSerializer<SecurityMonitoringNotificationRuleTriggerSource> {
    public SecurityMonitoringNotificationRuleTriggerSourceSerializer(
        Class<SecurityMonitoringNotificationRuleTriggerSource> t) {
      super(t);
    }

    public SecurityMonitoringNotificationRuleTriggerSourceSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SecurityMonitoringNotificationRuleTriggerSource value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SecurityMonitoringNotificationRuleTriggerSource fromValue(String value) {
    return new SecurityMonitoringNotificationRuleTriggerSource(value);
  }
}
