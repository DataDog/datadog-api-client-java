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

/** Integration ID sourced from integration manifests. */
@JsonSerialize(
    using = EventSystemAttributesIntegrationId.EventSystemAttributesIntegrationIdSerializer.class)
public class EventSystemAttributesIntegrationId extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("custom-events"));

  public static final EventSystemAttributesIntegrationId CUSTOM_EVENTS =
      new EventSystemAttributesIntegrationId("custom-events");

  EventSystemAttributesIntegrationId(String value) {
    super(value, allowedValues);
  }

  public static class EventSystemAttributesIntegrationIdSerializer
      extends StdSerializer<EventSystemAttributesIntegrationId> {
    public EventSystemAttributesIntegrationIdSerializer(
        Class<EventSystemAttributesIntegrationId> t) {
      super(t);
    }

    public EventSystemAttributesIntegrationIdSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        EventSystemAttributesIntegrationId value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static EventSystemAttributesIntegrationId fromValue(String value) {
    return new EventSystemAttributesIntegrationId(value);
  }
}
