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

/** Identifies this as an infrastructure-backed host map request. */
@JsonSerialize(
    using =
        HostMapWidgetInfrastructureRequestRequestType
            .HostMapWidgetInfrastructureRequestRequestTypeSerializer.class)
public class HostMapWidgetInfrastructureRequestRequestType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("infrastructure_hostmap"));

  public static final HostMapWidgetInfrastructureRequestRequestType INFRASTRUCTURE_HOSTMAP =
      new HostMapWidgetInfrastructureRequestRequestType("infrastructure_hostmap");

  HostMapWidgetInfrastructureRequestRequestType(String value) {
    super(value, allowedValues);
  }

  public static class HostMapWidgetInfrastructureRequestRequestTypeSerializer
      extends StdSerializer<HostMapWidgetInfrastructureRequestRequestType> {
    public HostMapWidgetInfrastructureRequestRequestTypeSerializer(
        Class<HostMapWidgetInfrastructureRequestRequestType> t) {
      super(t);
    }

    public HostMapWidgetInfrastructureRequestRequestTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        HostMapWidgetInfrastructureRequestRequestType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static HostMapWidgetInfrastructureRequestRequestType fromValue(String value) {
    return new HostMapWidgetInfrastructureRequestRequestType(value);
  }
}
