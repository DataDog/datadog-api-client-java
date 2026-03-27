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

/** The priority of the event's monitor. For example, <code>normal</code> or <code>low</code>. */
@JsonSerialize(using = EventPriority.EventPrioritySerializer.class)
public class EventPriority extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("normal", "low"));

  public static final EventPriority NORMAL = new EventPriority("normal");
  public static final EventPriority LOW = new EventPriority("low");

  EventPriority(String value) {
    super(value, allowedValues);
  }

  public static class EventPrioritySerializer extends StdSerializer<EventPriority> {
    public EventPrioritySerializer(Class<EventPriority> t) {
      super(t);
    }

    public EventPrioritySerializer() {
      this(null);
    }

    @Override
    public void serialize(EventPriority value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static EventPriority fromValue(String value) {
    return new EventPriority(value);
  }
}
