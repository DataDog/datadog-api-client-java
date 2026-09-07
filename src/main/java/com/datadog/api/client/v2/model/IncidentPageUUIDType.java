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

/** Resource type for a page UUID response. */
@JsonSerialize(using = IncidentPageUUIDType.IncidentPageUUIDTypeSerializer.class)
public class IncidentPageUUIDType extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("page_uuid"));

  public static final IncidentPageUUIDType PAGE_UUID = new IncidentPageUUIDType("page_uuid");

  IncidentPageUUIDType(String value) {
    super(value, allowedValues);
  }

  public static class IncidentPageUUIDTypeSerializer extends StdSerializer<IncidentPageUUIDType> {
    public IncidentPageUUIDTypeSerializer(Class<IncidentPageUUIDType> t) {
      super(t);
    }

    public IncidentPageUUIDTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        IncidentPageUUIDType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static IncidentPageUUIDType fromValue(String value) {
    return new IncidentPageUUIDType(value);
  }
}
