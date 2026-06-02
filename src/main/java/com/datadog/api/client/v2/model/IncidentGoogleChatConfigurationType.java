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

/** Google Chat configuration resource type. */
@JsonSerialize(
    using = IncidentGoogleChatConfigurationType.IncidentGoogleChatConfigurationTypeSerializer.class)
public class IncidentGoogleChatConfigurationType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("google_chat_configurations"));

  public static final IncidentGoogleChatConfigurationType GOOGLE_CHAT_CONFIGURATIONS =
      new IncidentGoogleChatConfigurationType("google_chat_configurations");

  IncidentGoogleChatConfigurationType(String value) {
    super(value, allowedValues);
  }

  public static class IncidentGoogleChatConfigurationTypeSerializer
      extends StdSerializer<IncidentGoogleChatConfigurationType> {
    public IncidentGoogleChatConfigurationTypeSerializer(
        Class<IncidentGoogleChatConfigurationType> t) {
      super(t);
    }

    public IncidentGoogleChatConfigurationTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        IncidentGoogleChatConfigurationType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static IncidentGoogleChatConfigurationType fromValue(String value) {
    return new IncidentGoogleChatConfigurationType(value);
  }
}
