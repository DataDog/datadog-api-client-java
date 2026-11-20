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
@JsonSerialize(using = GeomapPointsProjectionType.GeomapPointsProjectionTypeSerializer.class)
public class GeomapPointsProjectionType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("geomap_points"));

  public static final GeomapPointsProjectionType GEOMAP_POINTS =
      new GeomapPointsProjectionType("geomap_points");

  GeomapPointsProjectionType(String value) {
    super(value, allowedValues);
  }

  public static class GeomapPointsProjectionTypeSerializer
      extends StdSerializer<GeomapPointsProjectionType> {
    public GeomapPointsProjectionTypeSerializer(Class<GeomapPointsProjectionType> t) {
      super(t);
    }

    public GeomapPointsProjectionTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        GeomapPointsProjectionType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static GeomapPointsProjectionType fromValue(String value) {
    return new GeomapPointsProjectionType(value);
  }
}
