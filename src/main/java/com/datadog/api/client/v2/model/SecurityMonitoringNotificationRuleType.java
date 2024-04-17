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

/** The type of the resource. The value should always be <code>notification_rules</code>. */
@JsonSerialize(
    using =
        SecurityMonitoringNotificationRuleType.SecurityMonitoringNotificationRuleTypeSerializer
            .class)
public class SecurityMonitoringNotificationRuleType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("notification_rules"));

  public static final SecurityMonitoringNotificationRuleType NOTIFICATION_RULES =
      new SecurityMonitoringNotificationRuleType("notification_rules");

  SecurityMonitoringNotificationRuleType(String value) {
    super(value, allowedValues);
  }

  public static class SecurityMonitoringNotificationRuleTypeSerializer
      extends StdSerializer<SecurityMonitoringNotificationRuleType> {
    public SecurityMonitoringNotificationRuleTypeSerializer(
        Class<SecurityMonitoringNotificationRuleType> t) {
      super(t);
    }

    public SecurityMonitoringNotificationRuleTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SecurityMonitoringNotificationRuleType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SecurityMonitoringNotificationRuleType fromValue(String value) {
    return new SecurityMonitoringNotificationRuleType(value);
  }
}
