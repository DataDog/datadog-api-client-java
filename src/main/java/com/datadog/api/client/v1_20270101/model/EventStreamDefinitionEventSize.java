/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1_20270101.model;

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

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonSerialize(
    using = EventStreamDefinitionEventSize.EventStreamDefinitionEventSizeSerializer.class)
public class EventStreamDefinitionEventSize extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("s", "l"));

  public static final EventStreamDefinitionEventSize S = new EventStreamDefinitionEventSize("s");
  public static final EventStreamDefinitionEventSize L = new EventStreamDefinitionEventSize("l");

  EventStreamDefinitionEventSize(String value) {
    super(value, allowedValues);
  }

  public static class EventStreamDefinitionEventSizeSerializer
      extends StdSerializer<EventStreamDefinitionEventSize> {
    public EventStreamDefinitionEventSizeSerializer(Class<EventStreamDefinitionEventSize> t) {
      super(t);
    }

    public EventStreamDefinitionEventSizeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        EventStreamDefinitionEventSize value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static EventStreamDefinitionEventSize fromValue(String value) {
    return new EventStreamDefinitionEventSize(value);
  }
}
