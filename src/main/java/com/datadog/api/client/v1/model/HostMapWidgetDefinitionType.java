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

/** Type of the host map widget. */
@JsonSerialize(using = HostMapWidgetDefinitionType.HostMapWidgetDefinitionTypeSerializer.class)
public class HostMapWidgetDefinitionType extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("hostmap"));

  public static final HostMapWidgetDefinitionType HOSTMAP =
      new HostMapWidgetDefinitionType("hostmap");

  HostMapWidgetDefinitionType(String value) {
    super(value, allowedValues);
  }

  public static class HostMapWidgetDefinitionTypeSerializer
      extends StdSerializer<HostMapWidgetDefinitionType> {
    public HostMapWidgetDefinitionTypeSerializer(Class<HostMapWidgetDefinitionType> t) {
      super(t);
    }

    public HostMapWidgetDefinitionTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        HostMapWidgetDefinitionType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static HostMapWidgetDefinitionType fromValue(String value) {
    return new HostMapWidgetDefinitionType(value);
  }
}
