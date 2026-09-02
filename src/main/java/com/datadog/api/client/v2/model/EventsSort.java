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

/** The sort parameters when querying events. */
@JsonSerialize(using = EventsSort.EventsSortSerializer.class)
public class EventsSort extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("timestamp", "-timestamp"));

  public static final EventsSort TIMESTAMP_ASCENDING = new EventsSort("timestamp");
  public static final EventsSort TIMESTAMP_DESCENDING = new EventsSort("-timestamp");

  EventsSort(String value) {
    super(value, allowedValues);
  }

  public static class EventsSortSerializer extends StdSerializer<EventsSort> {
    public EventsSortSerializer(Class<EventsSort> t) {
      super(t);
    }

    public EventsSortSerializer() {
      this(null);
    }

    @Override
    public void serialize(EventsSort value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static EventsSort fromValue(String value) {
    return new EventsSort(value);
  }
}
