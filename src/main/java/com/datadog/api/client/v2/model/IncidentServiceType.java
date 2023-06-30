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

/** Incident service resource type. */
@JsonSerialize(using = IncidentServiceType.IncidentServiceTypeSerializer.class)
public class IncidentServiceType extends ModelEnum<String> {

  public static final IncidentServiceType SERVICES = new IncidentServiceType("services");

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("services"));

  IncidentServiceType(String value) {
    this.value = value;
    this.localAllowedValues = allowedValues;
  }

  public static class IncidentServiceTypeSerializer extends StdSerializer<IncidentServiceType> {
    public IncidentServiceTypeSerializer(Class<IncidentServiceType> t) {
      super(t);
    }

    public IncidentServiceTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        IncidentServiceType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static IncidentServiceType fromValue(String value) {
    return new IncidentServiceType(value);
  }
}
