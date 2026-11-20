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
        QueryTableBackendRequestAnyOfAnyOfItemResponseFormat4450132960
            .QueryTableBackendRequestAnyOfAnyOfItemResponseFormat4450132960Serializer.class)
public class QueryTableBackendRequestAnyOfAnyOfItemResponseFormat4450132960
    extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("scalar"));

  public static final QueryTableBackendRequestAnyOfAnyOfItemResponseFormat4450132960 SCALAR =
      new QueryTableBackendRequestAnyOfAnyOfItemResponseFormat4450132960("scalar");

  QueryTableBackendRequestAnyOfAnyOfItemResponseFormat4450132960(String value) {
    super(value, allowedValues);
  }

  public static class QueryTableBackendRequestAnyOfAnyOfItemResponseFormat4450132960Serializer
      extends StdSerializer<QueryTableBackendRequestAnyOfAnyOfItemResponseFormat4450132960> {
    public QueryTableBackendRequestAnyOfAnyOfItemResponseFormat4450132960Serializer(
        Class<QueryTableBackendRequestAnyOfAnyOfItemResponseFormat4450132960> t) {
      super(t);
    }

    public QueryTableBackendRequestAnyOfAnyOfItemResponseFormat4450132960Serializer() {
      this(null);
    }

    @Override
    public void serialize(
        QueryTableBackendRequestAnyOfAnyOfItemResponseFormat4450132960 value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static QueryTableBackendRequestAnyOfAnyOfItemResponseFormat4450132960 fromValue(
      String value) {
    return new QueryTableBackendRequestAnyOfAnyOfItemResponseFormat4450132960(value);
  }
}
