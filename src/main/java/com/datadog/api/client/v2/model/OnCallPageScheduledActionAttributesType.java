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

/** The kind of action that is scheduled. */
@JsonSerialize(
    using =
        OnCallPageScheduledActionAttributesType.OnCallPageScheduledActionAttributesTypeSerializer
            .class)
public class OnCallPageScheduledActionAttributesType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("escalate", "resolve", "release", "retrigger"));

  public static final OnCallPageScheduledActionAttributesType ESCALATE =
      new OnCallPageScheduledActionAttributesType("escalate");
  public static final OnCallPageScheduledActionAttributesType RESOLVE =
      new OnCallPageScheduledActionAttributesType("resolve");
  public static final OnCallPageScheduledActionAttributesType RELEASE =
      new OnCallPageScheduledActionAttributesType("release");
  public static final OnCallPageScheduledActionAttributesType RETRIGGER =
      new OnCallPageScheduledActionAttributesType("retrigger");

  OnCallPageScheduledActionAttributesType(String value) {
    super(value, allowedValues);
  }

  public static class OnCallPageScheduledActionAttributesTypeSerializer
      extends StdSerializer<OnCallPageScheduledActionAttributesType> {
    public OnCallPageScheduledActionAttributesTypeSerializer(
        Class<OnCallPageScheduledActionAttributesType> t) {
      super(t);
    }

    public OnCallPageScheduledActionAttributesTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        OnCallPageScheduledActionAttributesType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static OnCallPageScheduledActionAttributesType fromValue(String value) {
    return new OnCallPageScheduledActionAttributesType(value);
  }
}
