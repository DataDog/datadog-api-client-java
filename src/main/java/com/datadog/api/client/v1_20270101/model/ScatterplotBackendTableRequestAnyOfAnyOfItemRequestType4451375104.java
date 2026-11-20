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
        ScatterplotBackendTableRequestAnyOfAnyOfItemRequestType4451375104
            .ScatterplotBackendTableRequestAnyOfAnyOfItemRequestType4451375104Serializer.class)
public class ScatterplotBackendTableRequestAnyOfAnyOfItemRequestType4451375104
    extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("data_projection"));

  public static final ScatterplotBackendTableRequestAnyOfAnyOfItemRequestType4451375104
      DATA_PROJECTION =
          new ScatterplotBackendTableRequestAnyOfAnyOfItemRequestType4451375104("data_projection");

  ScatterplotBackendTableRequestAnyOfAnyOfItemRequestType4451375104(String value) {
    super(value, allowedValues);
  }

  public static class ScatterplotBackendTableRequestAnyOfAnyOfItemRequestType4451375104Serializer
      extends StdSerializer<ScatterplotBackendTableRequestAnyOfAnyOfItemRequestType4451375104> {
    public ScatterplotBackendTableRequestAnyOfAnyOfItemRequestType4451375104Serializer(
        Class<ScatterplotBackendTableRequestAnyOfAnyOfItemRequestType4451375104> t) {
      super(t);
    }

    public ScatterplotBackendTableRequestAnyOfAnyOfItemRequestType4451375104Serializer() {
      this(null);
    }

    @Override
    public void serialize(
        ScatterplotBackendTableRequestAnyOfAnyOfItemRequestType4451375104 value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ScatterplotBackendTableRequestAnyOfAnyOfItemRequestType4451375104 fromValue(
      String value) {
    return new ScatterplotBackendTableRequestAnyOfAnyOfItemRequestType4451375104(value);
  }
}
