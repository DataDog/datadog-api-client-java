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

/** Object related to an incident that can be included in the response. */
@JsonSerialize(using = IncidentImportRelatedObject.IncidentImportRelatedObjectSerializer.class)
public class IncidentImportRelatedObject extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "last_modified_by_user",
              "created_by_user",
              "commander_user",
              "declared_by_user",
              "incident_type"));

  public static final IncidentImportRelatedObject LAST_MODIFIED_BY_USER =
      new IncidentImportRelatedObject("last_modified_by_user");
  public static final IncidentImportRelatedObject CREATED_BY_USER =
      new IncidentImportRelatedObject("created_by_user");
  public static final IncidentImportRelatedObject COMMANDER_USER =
      new IncidentImportRelatedObject("commander_user");
  public static final IncidentImportRelatedObject DECLARED_BY_USER =
      new IncidentImportRelatedObject("declared_by_user");
  public static final IncidentImportRelatedObject INCIDENT_TYPE =
      new IncidentImportRelatedObject("incident_type");

  IncidentImportRelatedObject(String value) {
    super(value, allowedValues);
  }

  public static class IncidentImportRelatedObjectSerializer
      extends StdSerializer<IncidentImportRelatedObject> {
    public IncidentImportRelatedObjectSerializer(Class<IncidentImportRelatedObject> t) {
      super(t);
    }

    public IncidentImportRelatedObjectSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        IncidentImportRelatedObject value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static IncidentImportRelatedObject fromValue(String value) {
    return new IncidentImportRelatedObject(value);
  }
}
