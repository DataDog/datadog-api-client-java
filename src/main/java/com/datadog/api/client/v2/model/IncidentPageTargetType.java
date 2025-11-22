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

/** Type of page target for incident pages. */
@JsonSerialize(using = IncidentPageTargetType.IncidentPageTargetTypeSerializer.class)
public class IncidentPageTargetType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("team_handle", "team_uuid", "user_uuid"));

  public static final IncidentPageTargetType TEAM_HANDLE =
      new IncidentPageTargetType("team_handle");
  public static final IncidentPageTargetType TEAM_UUID = new IncidentPageTargetType("team_uuid");
  public static final IncidentPageTargetType USER_UUID = new IncidentPageTargetType("user_uuid");

  IncidentPageTargetType(String value) {
    super(value, allowedValues);
  }

  public static class IncidentPageTargetTypeSerializer
      extends StdSerializer<IncidentPageTargetType> {
    public IncidentPageTargetTypeSerializer(Class<IncidentPageTargetType> t) {
      super(t);
    }

    public IncidentPageTargetTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        IncidentPageTargetType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static IncidentPageTargetType fromValue(String value) {
    return new IncidentPageTargetType(value);
  }
}
