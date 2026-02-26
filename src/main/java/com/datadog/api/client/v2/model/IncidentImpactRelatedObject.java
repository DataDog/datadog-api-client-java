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

/** A reference to a resource related to an incident impact. */
@JsonSerialize(using = IncidentImpactRelatedObject.IncidentImpactRelatedObjectSerializer.class)
public class IncidentImpactRelatedObject extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("incident", "created_by_user", "last_modified_by_user"));

  public static final IncidentImpactRelatedObject INCIDENT =
      new IncidentImpactRelatedObject("incident");
  public static final IncidentImpactRelatedObject CREATED_BY_USER =
      new IncidentImpactRelatedObject("created_by_user");
  public static final IncidentImpactRelatedObject LAST_MODIFIED_BY_USER =
      new IncidentImpactRelatedObject("last_modified_by_user");

  IncidentImpactRelatedObject(String value) {
    super(value, allowedValues);
  }

  public static class IncidentImpactRelatedObjectSerializer
      extends StdSerializer<IncidentImpactRelatedObject> {
    public IncidentImpactRelatedObjectSerializer(Class<IncidentImpactRelatedObject> t) {
      super(t);
    }

    public IncidentImpactRelatedObjectSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        IncidentImpactRelatedObject value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static IncidentImpactRelatedObject fromValue(String value) {
    return new IncidentImpactRelatedObject(value);
  }
}
