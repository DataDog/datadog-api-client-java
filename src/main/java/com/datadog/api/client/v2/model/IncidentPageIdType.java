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

/** Incident page ID type. */
@JsonSerialize(using = IncidentPageIdType.IncidentPageIdTypeSerializer.class)
public class IncidentPageIdType extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("page_uuid"));

  public static final IncidentPageIdType PAGE_UUID = new IncidentPageIdType("page_uuid");

  IncidentPageIdType(String value) {
    super(value, allowedValues);
  }

  public static class IncidentPageIdTypeSerializer extends StdSerializer<IncidentPageIdType> {
    public IncidentPageIdTypeSerializer(Class<IncidentPageIdType> t) {
      super(t);
    }

    public IncidentPageIdTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(IncidentPageIdType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static IncidentPageIdType fromValue(String value) {
    return new IncidentPageIdType(value);
  }
}
