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
@JsonSerialize(using = EventSystemAttributesCategory.EventSystemAttributesCategorySerializer.class)
public class EventSystemAttributesCategory extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("change", "alert"));

  public static final EventSystemAttributesCategory CHANGE =
      new EventSystemAttributesCategory("change");
  public static final EventSystemAttributesCategory ALERT =
      new EventSystemAttributesCategory("alert");

  EventSystemAttributesCategory(String value) {
    super(value, allowedValues);
  }

  public static class EventSystemAttributesCategorySerializer
      extends StdSerializer<EventSystemAttributesCategory> {
    public EventSystemAttributesCategorySerializer(Class<EventSystemAttributesCategory> t) {
      super(t);
    }

    public EventSystemAttributesCategorySerializer() {
      this(null);
    }

    @Override
    public void serialize(
        EventSystemAttributesCategory value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static EventSystemAttributesCategory fromValue(String value) {
    return new EventSystemAttributesCategory(value);
  }
}
