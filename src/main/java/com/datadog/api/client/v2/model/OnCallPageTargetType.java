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

/** The kind of target, <code>team_id</code> | <code>team_handle</code> | <code>user_id</code>. */
@JsonSerialize(using = OnCallPageTargetType.OnCallPageTargetTypeSerializer.class)
public class OnCallPageTargetType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("team_id", "team_handle", "user_id"));

  public static final OnCallPageTargetType TEAM_ID = new OnCallPageTargetType("team_id");
  public static final OnCallPageTargetType TEAM_HANDLE = new OnCallPageTargetType("team_handle");
  public static final OnCallPageTargetType USER_ID = new OnCallPageTargetType("user_id");

  OnCallPageTargetType(String value) {
    super(value, allowedValues);
  }

  public static class OnCallPageTargetTypeSerializer extends StdSerializer<OnCallPageTargetType> {
    public OnCallPageTargetTypeSerializer(Class<OnCallPageTargetType> t) {
      super(t);
    }

    public OnCallPageTargetTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        OnCallPageTargetType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static OnCallPageTargetType fromValue(String value) {
    return new OnCallPageTargetType(value);
  }
}
