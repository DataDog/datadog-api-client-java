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
 * The notification status for the given rule type. <code>SUCCESS</code> means a matching event was
 * found and the notification was sent successfully. <code>DEFAULT</code> means no matching event
 * was found and a default placeholder notification was sent instead. <code>ERROR</code> means an
 * error occurred while sending the notification.
 */
@JsonSerialize(
    using =
        NotificationRulePreviewNotificationStatus
            .NotificationRulePreviewNotificationStatusSerializer.class)
public class NotificationRulePreviewNotificationStatus extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("SUCCESS", "DEFAULT", "ERROR"));

  public static final NotificationRulePreviewNotificationStatus SUCCESS =
      new NotificationRulePreviewNotificationStatus("SUCCESS");
  public static final NotificationRulePreviewNotificationStatus DEFAULT =
      new NotificationRulePreviewNotificationStatus("DEFAULT");
  public static final NotificationRulePreviewNotificationStatus ERROR =
      new NotificationRulePreviewNotificationStatus("ERROR");

  NotificationRulePreviewNotificationStatus(String value) {
    super(value, allowedValues);
  }

  public static class NotificationRulePreviewNotificationStatusSerializer
      extends StdSerializer<NotificationRulePreviewNotificationStatus> {
    public NotificationRulePreviewNotificationStatusSerializer(
        Class<NotificationRulePreviewNotificationStatus> t) {
      super(t);
    }

    public NotificationRulePreviewNotificationStatusSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        NotificationRulePreviewNotificationStatus value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static NotificationRulePreviewNotificationStatus fromValue(String value) {
    return new NotificationRulePreviewNotificationStatus(value);
  }
}
