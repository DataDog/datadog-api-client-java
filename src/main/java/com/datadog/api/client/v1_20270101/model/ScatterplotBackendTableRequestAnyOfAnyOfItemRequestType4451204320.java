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
        ScatterplotBackendTableRequestAnyOfAnyOfItemRequestType4451204320
            .ScatterplotBackendTableRequestAnyOfAnyOfItemRequestType4451204320Serializer.class)
public class ScatterplotBackendTableRequestAnyOfAnyOfItemRequestType4451204320
    extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("local_dataset"));

  public static final ScatterplotBackendTableRequestAnyOfAnyOfItemRequestType4451204320
      LOCAL_DATASET =
          new ScatterplotBackendTableRequestAnyOfAnyOfItemRequestType4451204320("local_dataset");

  ScatterplotBackendTableRequestAnyOfAnyOfItemRequestType4451204320(String value) {
    super(value, allowedValues);
  }

  public static class ScatterplotBackendTableRequestAnyOfAnyOfItemRequestType4451204320Serializer
      extends StdSerializer<ScatterplotBackendTableRequestAnyOfAnyOfItemRequestType4451204320> {
    public ScatterplotBackendTableRequestAnyOfAnyOfItemRequestType4451204320Serializer(
        Class<ScatterplotBackendTableRequestAnyOfAnyOfItemRequestType4451204320> t) {
      super(t);
    }

    public ScatterplotBackendTableRequestAnyOfAnyOfItemRequestType4451204320Serializer() {
      this(null);
    }

    @Override
    public void serialize(
        ScatterplotBackendTableRequestAnyOfAnyOfItemRequestType4451204320 value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ScatterplotBackendTableRequestAnyOfAnyOfItemRequestType4451204320 fromValue(
      String value) {
    return new ScatterplotBackendTableRequestAnyOfAnyOfItemRequestType4451204320(value);
  }
}
