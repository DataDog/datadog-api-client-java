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

/** Incident impact resource type. */
@JsonSerialize(using = IncidentImpactType.IncidentImpactTypeSerializer.class)
public class IncidentImpactType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("incident_impacts"));

  public static final IncidentImpactType INCIDENT_IMPACTS =
      new IncidentImpactType("incident_impacts");

  IncidentImpactType(String value) {
    super(value, allowedValues);
  }

  public static class IncidentImpactTypeSerializer extends StdSerializer<IncidentImpactType> {
    public IncidentImpactTypeSerializer(Class<IncidentImpactType> t) {
      super(t);
    }

    public IncidentImpactTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(IncidentImpactType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static IncidentImpactType fromValue(String value) {
    return new IncidentImpactType(value);
  }
}
