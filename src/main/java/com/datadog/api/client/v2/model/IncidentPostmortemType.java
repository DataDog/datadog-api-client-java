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

/** Incident postmortem resource type. */
@JsonSerialize(using = IncidentPostmortemType.IncidentPostmortemTypeSerializer.class)
public class IncidentPostmortemType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("incident_postmortems"));

  public static final IncidentPostmortemType INCIDENT_POSTMORTEMS =
      new IncidentPostmortemType("incident_postmortems");

  IncidentPostmortemType(String value) {
    super(value, allowedValues);
  }

  public static class IncidentPostmortemTypeSerializer
      extends StdSerializer<IncidentPostmortemType> {
    public IncidentPostmortemTypeSerializer(Class<IncidentPostmortemType> t) {
      super(t);
    }

    public IncidentPostmortemTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        IncidentPostmortemType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static IncidentPostmortemType fromValue(String value) {
    return new IncidentPostmortemType(value);
  }
}
