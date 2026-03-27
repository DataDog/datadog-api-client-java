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

/** Notification templates resource type. */
@JsonSerialize(
    using = IncidentNotificationTemplateType.IncidentNotificationTemplateTypeSerializer.class)
public class IncidentNotificationTemplateType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("notification_templates"));

  public static final IncidentNotificationTemplateType NOTIFICATION_TEMPLATES =
      new IncidentNotificationTemplateType("notification_templates");

  IncidentNotificationTemplateType(String value) {
    super(value, allowedValues);
  }

  public static class IncidentNotificationTemplateTypeSerializer
      extends StdSerializer<IncidentNotificationTemplateType> {
    public IncidentNotificationTemplateTypeSerializer(Class<IncidentNotificationTemplateType> t) {
      super(t);
    }

    public IncidentNotificationTemplateTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        IncidentNotificationTemplateType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static IncidentNotificationTemplateType fromValue(String value) {
    return new IncidentNotificationTemplateType(value);
  }
}
