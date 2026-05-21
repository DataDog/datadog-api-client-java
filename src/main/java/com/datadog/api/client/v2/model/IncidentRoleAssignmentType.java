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

/** Incident role assignment resource type. */
@JsonSerialize(using = IncidentRoleAssignmentType.IncidentRoleAssignmentTypeSerializer.class)
public class IncidentRoleAssignmentType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("incident_role_assignments"));

  public static final IncidentRoleAssignmentType INCIDENT_ROLE_ASSIGNMENTS =
      new IncidentRoleAssignmentType("incident_role_assignments");

  IncidentRoleAssignmentType(String value) {
    super(value, allowedValues);
  }

  public static class IncidentRoleAssignmentTypeSerializer
      extends StdSerializer<IncidentRoleAssignmentType> {
    public IncidentRoleAssignmentTypeSerializer(Class<IncidentRoleAssignmentType> t) {
      super(t);
    }

    public IncidentRoleAssignmentTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        IncidentRoleAssignmentType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static IncidentRoleAssignmentType fromValue(String value) {
    return new IncidentRoleAssignmentType(value);
  }
}
