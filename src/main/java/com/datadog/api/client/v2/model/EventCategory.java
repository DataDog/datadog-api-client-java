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

/** Event category identifying the type of event. */
@JsonSerialize(using = EventCategory.EventCategorySerializer.class)
public class EventCategory extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("change", "alert"));

  public static final EventCategory CHANGE = new EventCategory("change");
  public static final EventCategory ALERT = new EventCategory("alert");

  EventCategory(String value) {
    super(value, allowedValues);
  }

  public static class EventCategorySerializer extends StdSerializer<EventCategory> {
    public EventCategorySerializer(Class<EventCategory> t) {
      super(t);
    }

    public EventCategorySerializer() {
      this(null);
    }

    @Override
    public void serialize(EventCategory value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static EventCategory fromValue(String value) {
    return new EventCategory(value);
  }
}
