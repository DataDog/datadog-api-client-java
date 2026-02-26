/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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

/** Type of the SLO List widget. */
@JsonSerialize(using = SLOListWidgetDefinitionType.SLOListWidgetDefinitionTypeSerializer.class)
public class SLOListWidgetDefinitionType extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("slo_list"));

  public static final SLOListWidgetDefinitionType SLO_LIST =
      new SLOListWidgetDefinitionType("slo_list");

  SLOListWidgetDefinitionType(String value) {
    super(value, allowedValues);
  }

  public static class SLOListWidgetDefinitionTypeSerializer
      extends StdSerializer<SLOListWidgetDefinitionType> {
    public SLOListWidgetDefinitionTypeSerializer(Class<SLOListWidgetDefinitionType> t) {
      super(t);
    }

    public SLOListWidgetDefinitionTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SLOListWidgetDefinitionType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SLOListWidgetDefinitionType fromValue(String value) {
    return new SLOListWidgetDefinitionType(value);
  }
}
