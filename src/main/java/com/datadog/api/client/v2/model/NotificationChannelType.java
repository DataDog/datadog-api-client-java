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

/** Indicates that the resource is of type 'notification_channels'. */
@JsonSerialize(using = NotificationChannelType.NotificationChannelTypeSerializer.class)
public class NotificationChannelType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("notification_channels"));

  public static final NotificationChannelType NOTIFICATION_CHANNELS =
      new NotificationChannelType("notification_channels");

  NotificationChannelType(String value) {
    super(value, allowedValues);
  }

  public static class NotificationChannelTypeSerializer
      extends StdSerializer<NotificationChannelType> {
    public NotificationChannelTypeSerializer(Class<NotificationChannelType> t) {
      super(t);
    }

    public NotificationChannelTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        NotificationChannelType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static NotificationChannelType fromValue(String value) {
    return new NotificationChannelType(value);
  }
}
