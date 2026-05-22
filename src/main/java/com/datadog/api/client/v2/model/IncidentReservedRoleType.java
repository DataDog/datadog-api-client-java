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

/** Incident reserved role resource type. */
@JsonSerialize(using = IncidentReservedRoleType.IncidentReservedRoleTypeSerializer.class)
public class IncidentReservedRoleType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("incident_reserved_roles"));

  public static final IncidentReservedRoleType INCIDENT_RESERVED_ROLES =
      new IncidentReservedRoleType("incident_reserved_roles");

  IncidentReservedRoleType(String value) {
    super(value, allowedValues);
  }

  public static class IncidentReservedRoleTypeSerializer
      extends StdSerializer<IncidentReservedRoleType> {
    public IncidentReservedRoleTypeSerializer(Class<IncidentReservedRoleType> t) {
      super(t);
    }

    public IncidentReservedRoleTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        IncidentReservedRoleType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static IncidentReservedRoleType fromValue(String value) {
    return new IncidentReservedRoleType(value);
  }
}
