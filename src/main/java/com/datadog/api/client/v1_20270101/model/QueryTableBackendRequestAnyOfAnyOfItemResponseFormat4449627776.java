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
        QueryTableBackendRequestAnyOfAnyOfItemResponseFormat4449627776
            .QueryTableBackendRequestAnyOfAnyOfItemResponseFormat4449627776Serializer.class)
public class QueryTableBackendRequestAnyOfAnyOfItemResponseFormat4449627776
    extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("tabular"));

  public static final QueryTableBackendRequestAnyOfAnyOfItemResponseFormat4449627776 TABULAR =
      new QueryTableBackendRequestAnyOfAnyOfItemResponseFormat4449627776("tabular");

  QueryTableBackendRequestAnyOfAnyOfItemResponseFormat4449627776(String value) {
    super(value, allowedValues);
  }

  public static class QueryTableBackendRequestAnyOfAnyOfItemResponseFormat4449627776Serializer
      extends StdSerializer<QueryTableBackendRequestAnyOfAnyOfItemResponseFormat4449627776> {
    public QueryTableBackendRequestAnyOfAnyOfItemResponseFormat4449627776Serializer(
        Class<QueryTableBackendRequestAnyOfAnyOfItemResponseFormat4449627776> t) {
      super(t);
    }

    public QueryTableBackendRequestAnyOfAnyOfItemResponseFormat4449627776Serializer() {
      this(null);
    }

    @Override
    public void serialize(
        QueryTableBackendRequestAnyOfAnyOfItemResponseFormat4449627776 value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static QueryTableBackendRequestAnyOfAnyOfItemResponseFormat4449627776 fromValue(
      String value) {
    return new QueryTableBackendRequestAnyOfAnyOfItemResponseFormat4449627776(value);
  }
}
