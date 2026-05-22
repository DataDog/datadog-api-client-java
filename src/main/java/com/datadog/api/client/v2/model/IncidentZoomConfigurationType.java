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

/** Zoom configuration resource type. */
@JsonSerialize(using = IncidentZoomConfigurationType.IncidentZoomConfigurationTypeSerializer.class)
public class IncidentZoomConfigurationType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("zoom_configurations"));

  public static final IncidentZoomConfigurationType ZOOM_CONFIGURATIONS =
      new IncidentZoomConfigurationType("zoom_configurations");

  IncidentZoomConfigurationType(String value) {
    super(value, allowedValues);
  }

  public static class IncidentZoomConfigurationTypeSerializer
      extends StdSerializer<IncidentZoomConfigurationType> {
    public IncidentZoomConfigurationTypeSerializer(Class<IncidentZoomConfigurationType> t) {
      super(t);
    }

    public IncidentZoomConfigurationTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        IncidentZoomConfigurationType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static IncidentZoomConfigurationType fromValue(String value) {
    return new IncidentZoomConfigurationType(value);
  }
}
