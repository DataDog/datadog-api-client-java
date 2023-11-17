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

/** JSON:API type for DORA incident events. */
@JsonSerialize(using = DORAIncidentType.DORAIncidentTypeSerializer.class)
public class DORAIncidentType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("dora_incident"));

  public static final DORAIncidentType DORA_INCIDENT = new DORAIncidentType("dora_incident");

  DORAIncidentType(String value) {
    super(value, allowedValues);
  }

  public static class DORAIncidentTypeSerializer extends StdSerializer<DORAIncidentType> {
    public DORAIncidentTypeSerializer(Class<DORAIncidentType> t) {
      super(t);
    }

    public DORAIncidentTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(DORAIncidentType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static DORAIncidentType fromValue(String value) {
    return new DORAIncidentType(value);
  }
}
