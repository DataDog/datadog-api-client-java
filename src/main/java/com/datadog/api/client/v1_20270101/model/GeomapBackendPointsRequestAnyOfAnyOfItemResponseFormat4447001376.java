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
        GeomapBackendPointsRequestAnyOfAnyOfItemResponseFormat4447001376
            .GeomapBackendPointsRequestAnyOfAnyOfItemResponseFormat4447001376Serializer.class)
public class GeomapBackendPointsRequestAnyOfAnyOfItemResponseFormat4447001376
    extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("tabular"));

  public static final GeomapBackendPointsRequestAnyOfAnyOfItemResponseFormat4447001376 TABULAR =
      new GeomapBackendPointsRequestAnyOfAnyOfItemResponseFormat4447001376("tabular");

  GeomapBackendPointsRequestAnyOfAnyOfItemResponseFormat4447001376(String value) {
    super(value, allowedValues);
  }

  public static class GeomapBackendPointsRequestAnyOfAnyOfItemResponseFormat4447001376Serializer
      extends StdSerializer<GeomapBackendPointsRequestAnyOfAnyOfItemResponseFormat4447001376> {
    public GeomapBackendPointsRequestAnyOfAnyOfItemResponseFormat4447001376Serializer(
        Class<GeomapBackendPointsRequestAnyOfAnyOfItemResponseFormat4447001376> t) {
      super(t);
    }

    public GeomapBackendPointsRequestAnyOfAnyOfItemResponseFormat4447001376Serializer() {
      this(null);
    }

    @Override
    public void serialize(
        GeomapBackendPointsRequestAnyOfAnyOfItemResponseFormat4447001376 value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static GeomapBackendPointsRequestAnyOfAnyOfItemResponseFormat4447001376 fromValue(
      String value) {
    return new GeomapBackendPointsRequestAnyOfAnyOfItemResponseFormat4447001376(value);
  }
}
