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

/** The alert type of events generated from the email address. */
@JsonSerialize(using = EventEmailAddressAlertType.EventEmailAddressAlertTypeSerializer.class)
public class EventEmailAddressAlertType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("info", "warn", "error", "success"));

  public static final EventEmailAddressAlertType INFO = new EventEmailAddressAlertType("info");
  public static final EventEmailAddressAlertType WARN = new EventEmailAddressAlertType("warn");
  public static final EventEmailAddressAlertType ERROR = new EventEmailAddressAlertType("error");
  public static final EventEmailAddressAlertType SUCCESS =
      new EventEmailAddressAlertType("success");

  EventEmailAddressAlertType(String value) {
    super(value, allowedValues);
  }

  public static class EventEmailAddressAlertTypeSerializer
      extends StdSerializer<EventEmailAddressAlertType> {
    public EventEmailAddressAlertTypeSerializer(Class<EventEmailAddressAlertType> t) {
      super(t);
    }

    public EventEmailAddressAlertTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        EventEmailAddressAlertType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static EventEmailAddressAlertType fromValue(String value) {
    return new EventEmailAddressAlertType(value);
  }
}
