/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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
 * If an alert event is enabled, set its type. For example, <code>error</code>, <code>warning</code>
 * , <code>info</code>, <code>success</code>, <code>user_update</code>, <code>recommendation</code>,
 * and <code>snapshot</code>.
 */
@JsonSerialize(using = EventAlertType.EventAlertTypeSerializer.class)
public class EventAlertType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "error", "warning", "info", "success", "user_update", "recommendation", "snapshot"));

  public static final EventAlertType ERROR = new EventAlertType("error");
  public static final EventAlertType WARNING = new EventAlertType("warning");
  public static final EventAlertType INFO = new EventAlertType("info");
  public static final EventAlertType SUCCESS = new EventAlertType("success");
  public static final EventAlertType USER_UPDATE = new EventAlertType("user_update");
  public static final EventAlertType RECOMMENDATION = new EventAlertType("recommendation");
  public static final EventAlertType SNAPSHOT = new EventAlertType("snapshot");

  EventAlertType(String value) {
    super(value, allowedValues);
  }

  public static class EventAlertTypeSerializer extends StdSerializer<EventAlertType> {
    public EventAlertTypeSerializer(Class<EventAlertType> t) {
      super(t);
    }

    public EventAlertTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(EventAlertType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static EventAlertType fromValue(String value) {
    return new EventAlertType(value);
  }
}
