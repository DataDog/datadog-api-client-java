/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1_20270101.model;

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

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonSerialize(
    using =
        GeomapBackendPointsRequestAnyOfAnyOfItemRequestType
            .GeomapBackendPointsRequestAnyOfAnyOfItemRequestTypeSerializer.class)
public class GeomapBackendPointsRequestAnyOfAnyOfItemRequestType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("network_devices_geomap"));

  public static final GeomapBackendPointsRequestAnyOfAnyOfItemRequestType NETWORK_DEVICES_GEOMAP =
      new GeomapBackendPointsRequestAnyOfAnyOfItemRequestType("network_devices_geomap");

  GeomapBackendPointsRequestAnyOfAnyOfItemRequestType(String value) {
    super(value, allowedValues);
  }

  public static class GeomapBackendPointsRequestAnyOfAnyOfItemRequestTypeSerializer
      extends StdSerializer<GeomapBackendPointsRequestAnyOfAnyOfItemRequestType> {
    public GeomapBackendPointsRequestAnyOfAnyOfItemRequestTypeSerializer(
        Class<GeomapBackendPointsRequestAnyOfAnyOfItemRequestType> t) {
      super(t);
    }

    public GeomapBackendPointsRequestAnyOfAnyOfItemRequestTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        GeomapBackendPointsRequestAnyOfAnyOfItemRequestType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static GeomapBackendPointsRequestAnyOfAnyOfItemRequestType fromValue(String value) {
    return new GeomapBackendPointsRequestAnyOfAnyOfItemRequestType(value);
  }
}
