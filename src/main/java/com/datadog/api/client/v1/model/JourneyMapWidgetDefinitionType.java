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

/** Type of the Journey Paths widget. */
@JsonSerialize(
    using = JourneyMapWidgetDefinitionType.JourneyMapWidgetDefinitionTypeSerializer.class)
public class JourneyMapWidgetDefinitionType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("journey_map"));

  public static final JourneyMapWidgetDefinitionType JOURNEY_MAP =
      new JourneyMapWidgetDefinitionType("journey_map");

  JourneyMapWidgetDefinitionType(String value) {
    super(value, allowedValues);
  }

  public static class JourneyMapWidgetDefinitionTypeSerializer
      extends StdSerializer<JourneyMapWidgetDefinitionType> {
    public JourneyMapWidgetDefinitionTypeSerializer(Class<JourneyMapWidgetDefinitionType> t) {
      super(t);
    }

    public JourneyMapWidgetDefinitionTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        JourneyMapWidgetDefinitionType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static JourneyMapWidgetDefinitionType fromValue(String value) {
    return new JourneyMapWidgetDefinitionType(value);
  }
}
