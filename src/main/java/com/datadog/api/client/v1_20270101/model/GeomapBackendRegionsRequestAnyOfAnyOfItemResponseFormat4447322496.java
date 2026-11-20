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
        GeomapBackendRegionsRequestAnyOfAnyOfItemResponseFormat4447322496
            .GeomapBackendRegionsRequestAnyOfAnyOfItemResponseFormat4447322496Serializer.class)
public class GeomapBackendRegionsRequestAnyOfAnyOfItemResponseFormat4447322496
    extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("scalar"));

  public static final GeomapBackendRegionsRequestAnyOfAnyOfItemResponseFormat4447322496 SCALAR =
      new GeomapBackendRegionsRequestAnyOfAnyOfItemResponseFormat4447322496("scalar");

  GeomapBackendRegionsRequestAnyOfAnyOfItemResponseFormat4447322496(String value) {
    super(value, allowedValues);
  }

  public static class GeomapBackendRegionsRequestAnyOfAnyOfItemResponseFormat4447322496Serializer
      extends StdSerializer<GeomapBackendRegionsRequestAnyOfAnyOfItemResponseFormat4447322496> {
    public GeomapBackendRegionsRequestAnyOfAnyOfItemResponseFormat4447322496Serializer(
        Class<GeomapBackendRegionsRequestAnyOfAnyOfItemResponseFormat4447322496> t) {
      super(t);
    }

    public GeomapBackendRegionsRequestAnyOfAnyOfItemResponseFormat4447322496Serializer() {
      this(null);
    }

    @Override
    public void serialize(
        GeomapBackendRegionsRequestAnyOfAnyOfItemResponseFormat4447322496 value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static GeomapBackendRegionsRequestAnyOfAnyOfItemResponseFormat4447322496 fromValue(
      String value) {
    return new GeomapBackendRegionsRequestAnyOfAnyOfItemResponseFormat4447322496(value);
  }
}
