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
        ScatterplotBackendTableRequestAnyOfAnyOfItemResponseFormat4451371744
            .ScatterplotBackendTableRequestAnyOfAnyOfItemResponseFormat4451371744Serializer.class)
public class ScatterplotBackendTableRequestAnyOfAnyOfItemResponseFormat4451371744
    extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("scalar"));

  public static final ScatterplotBackendTableRequestAnyOfAnyOfItemResponseFormat4451371744 SCALAR =
      new ScatterplotBackendTableRequestAnyOfAnyOfItemResponseFormat4451371744("scalar");

  ScatterplotBackendTableRequestAnyOfAnyOfItemResponseFormat4451371744(String value) {
    super(value, allowedValues);
  }

  public static class ScatterplotBackendTableRequestAnyOfAnyOfItemResponseFormat4451371744Serializer
      extends StdSerializer<ScatterplotBackendTableRequestAnyOfAnyOfItemResponseFormat4451371744> {
    public ScatterplotBackendTableRequestAnyOfAnyOfItemResponseFormat4451371744Serializer(
        Class<ScatterplotBackendTableRequestAnyOfAnyOfItemResponseFormat4451371744> t) {
      super(t);
    }

    public ScatterplotBackendTableRequestAnyOfAnyOfItemResponseFormat4451371744Serializer() {
      this(null);
    }

    @Override
    public void serialize(
        ScatterplotBackendTableRequestAnyOfAnyOfItemResponseFormat4451371744 value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ScatterplotBackendTableRequestAnyOfAnyOfItemResponseFormat4451371744 fromValue(
      String value) {
    return new ScatterplotBackendTableRequestAnyOfAnyOfItemResponseFormat4451371744(value);
  }
}
