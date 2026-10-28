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

/** Object related to an incident responder. */
@JsonSerialize(
    using = IncidentResponderRelatedObject.IncidentResponderRelatedObjectSerializer.class)
public class IncidentResponderRelatedObject extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("users", "role_assignments"));

  public static final IncidentResponderRelatedObject USERS =
      new IncidentResponderRelatedObject("users");
  public static final IncidentResponderRelatedObject ROLE_ASSIGNMENTS =
      new IncidentResponderRelatedObject("role_assignments");

  IncidentResponderRelatedObject(String value) {
    super(value, allowedValues);
  }

  public static class IncidentResponderRelatedObjectSerializer
      extends StdSerializer<IncidentResponderRelatedObject> {
    public IncidentResponderRelatedObjectSerializer(Class<IncidentResponderRelatedObject> t) {
      super(t);
    }

    public IncidentResponderRelatedObjectSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        IncidentResponderRelatedObject value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static IncidentResponderRelatedObject fromValue(String value) {
    return new IncidentResponderRelatedObject(value);
  }
}
