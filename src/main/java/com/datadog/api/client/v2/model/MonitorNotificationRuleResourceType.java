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

/** Monitor notification rule resource type. */
@JsonSerialize(
    using = MonitorNotificationRuleResourceType.MonitorNotificationRuleResourceTypeSerializer.class)
public class MonitorNotificationRuleResourceType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("monitor-notification-rule"));

  public static final MonitorNotificationRuleResourceType MONITOR_NOTIFICATION_RULE =
      new MonitorNotificationRuleResourceType("monitor-notification-rule");

  MonitorNotificationRuleResourceType(String value) {
    super(value, allowedValues);
  }

  public static class MonitorNotificationRuleResourceTypeSerializer
      extends StdSerializer<MonitorNotificationRuleResourceType> {
    public MonitorNotificationRuleResourceTypeSerializer(
        Class<MonitorNotificationRuleResourceType> t) {
      super(t);
    }

    public MonitorNotificationRuleResourceTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        MonitorNotificationRuleResourceType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static MonitorNotificationRuleResourceType fromValue(String value) {
    return new MonitorNotificationRuleResourceType(value);
  }
}
