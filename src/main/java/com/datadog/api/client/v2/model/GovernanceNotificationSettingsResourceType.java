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

/** Governance notification settings resource type. */
@JsonSerialize(
    using =
        GovernanceNotificationSettingsResourceType
            .GovernanceNotificationSettingsResourceTypeSerializer.class)
public class GovernanceNotificationSettingsResourceType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("governance_notification_settings"));

  public static final GovernanceNotificationSettingsResourceType GOVERNANCE_NOTIFICATION_SETTINGS =
      new GovernanceNotificationSettingsResourceType("governance_notification_settings");

  GovernanceNotificationSettingsResourceType(String value) {
    super(value, allowedValues);
  }

  public static class GovernanceNotificationSettingsResourceTypeSerializer
      extends StdSerializer<GovernanceNotificationSettingsResourceType> {
    public GovernanceNotificationSettingsResourceTypeSerializer(
        Class<GovernanceNotificationSettingsResourceType> t) {
      super(t);
    }

    public GovernanceNotificationSettingsResourceTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        GovernanceNotificationSettingsResourceType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static GovernanceNotificationSettingsResourceType fromValue(String value) {
    return new GovernanceNotificationSettingsResourceType(value);
  }
}
