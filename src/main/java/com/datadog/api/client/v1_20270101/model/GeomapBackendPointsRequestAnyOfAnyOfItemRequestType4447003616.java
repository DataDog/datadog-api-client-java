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
        GeomapBackendPointsRequestAnyOfAnyOfItemRequestType4447003616
            .GeomapBackendPointsRequestAnyOfAnyOfItemRequestType4447003616Serializer.class)
public class GeomapBackendPointsRequestAnyOfAnyOfItemRequestType4447003616
    extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("data_projection"));

  public static final GeomapBackendPointsRequestAnyOfAnyOfItemRequestType4447003616
      DATA_PROJECTION =
          new GeomapBackendPointsRequestAnyOfAnyOfItemRequestType4447003616("data_projection");

  GeomapBackendPointsRequestAnyOfAnyOfItemRequestType4447003616(String value) {
    super(value, allowedValues);
  }

  public static class GeomapBackendPointsRequestAnyOfAnyOfItemRequestType4447003616Serializer
      extends StdSerializer<GeomapBackendPointsRequestAnyOfAnyOfItemRequestType4447003616> {
    public GeomapBackendPointsRequestAnyOfAnyOfItemRequestType4447003616Serializer(
        Class<GeomapBackendPointsRequestAnyOfAnyOfItemRequestType4447003616> t) {
      super(t);
    }

    public GeomapBackendPointsRequestAnyOfAnyOfItemRequestType4447003616Serializer() {
      this(null);
    }

    @Override
    public void serialize(
        GeomapBackendPointsRequestAnyOfAnyOfItemRequestType4447003616 value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static GeomapBackendPointsRequestAnyOfAnyOfItemRequestType4447003616 fromValue(
      String value) {
    return new GeomapBackendPointsRequestAnyOfAnyOfItemRequestType4447003616(value);
  }
}
