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
        FlatSortByAnyOfAnyOfItemProperty4446002432
            .FlatSortByAnyOfAnyOfItemProperty4446002432Serializer.class)
public class FlatSortByAnyOfAnyOfItemProperty4446002432 extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("label"));

  public static final FlatSortByAnyOfAnyOfItemProperty4446002432 LABEL =
      new FlatSortByAnyOfAnyOfItemProperty4446002432("label");

  FlatSortByAnyOfAnyOfItemProperty4446002432(String value) {
    super(value, allowedValues);
  }

  public static class FlatSortByAnyOfAnyOfItemProperty4446002432Serializer
      extends StdSerializer<FlatSortByAnyOfAnyOfItemProperty4446002432> {
    public FlatSortByAnyOfAnyOfItemProperty4446002432Serializer(
        Class<FlatSortByAnyOfAnyOfItemProperty4446002432> t) {
      super(t);
    }

    public FlatSortByAnyOfAnyOfItemProperty4446002432Serializer() {
      this(null);
    }

    @Override
    public void serialize(
        FlatSortByAnyOfAnyOfItemProperty4446002432 value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static FlatSortByAnyOfAnyOfItemProperty4446002432 fromValue(String value) {
    return new FlatSortByAnyOfAnyOfItemProperty4446002432(value);
  }
}
