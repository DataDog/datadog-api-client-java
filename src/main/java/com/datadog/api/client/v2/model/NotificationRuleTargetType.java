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

/** The type of notification target. */
@JsonSerialize(using = NotificationRuleTargetType.NotificationRuleTargetTypeSerializer.class)
public class NotificationRuleTargetType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "EMAIL",
              "SLACK_CHANNEL",
              "SLACK_USER",
              "WEBHOOK",
              "PAGERDUTY_SERVICE",
              "MS_TEAMS_CHANNEL"));

  public static final NotificationRuleTargetType EMAIL = new NotificationRuleTargetType("EMAIL");
  public static final NotificationRuleTargetType SLACK_CHANNEL =
      new NotificationRuleTargetType("SLACK_CHANNEL");
  public static final NotificationRuleTargetType SLACK_USER =
      new NotificationRuleTargetType("SLACK_USER");
  public static final NotificationRuleTargetType WEBHOOK =
      new NotificationRuleTargetType("WEBHOOK");
  public static final NotificationRuleTargetType PAGERDUTY_SERVICE =
      new NotificationRuleTargetType("PAGERDUTY_SERVICE");
  public static final NotificationRuleTargetType MS_TEAMS_CHANNEL =
      new NotificationRuleTargetType("MS_TEAMS_CHANNEL");

  NotificationRuleTargetType(String value) {
    super(value, allowedValues);
  }

  public static class NotificationRuleTargetTypeSerializer
      extends StdSerializer<NotificationRuleTargetType> {
    public NotificationRuleTargetTypeSerializer(Class<NotificationRuleTargetType> t) {
      super(t);
    }

    public NotificationRuleTargetTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        NotificationRuleTargetType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static NotificationRuleTargetType fromValue(String value) {
    return new NotificationRuleTargetType(value);
  }
}
