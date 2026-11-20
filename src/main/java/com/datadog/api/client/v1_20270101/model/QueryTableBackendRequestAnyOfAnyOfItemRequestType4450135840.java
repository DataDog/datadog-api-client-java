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
        QueryTableBackendRequestAnyOfAnyOfItemRequestType4450135840
            .QueryTableBackendRequestAnyOfAnyOfItemRequestType4450135840Serializer.class)
public class QueryTableBackendRequestAnyOfAnyOfItemRequestType4450135840 extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("advanced_query"));

  public static final QueryTableBackendRequestAnyOfAnyOfItemRequestType4450135840 ADVANCED_QUERY =
      new QueryTableBackendRequestAnyOfAnyOfItemRequestType4450135840("advanced_query");

  QueryTableBackendRequestAnyOfAnyOfItemRequestType4450135840(String value) {
    super(value, allowedValues);
  }

  public static class QueryTableBackendRequestAnyOfAnyOfItemRequestType4450135840Serializer
      extends StdSerializer<QueryTableBackendRequestAnyOfAnyOfItemRequestType4450135840> {
    public QueryTableBackendRequestAnyOfAnyOfItemRequestType4450135840Serializer(
        Class<QueryTableBackendRequestAnyOfAnyOfItemRequestType4450135840> t) {
      super(t);
    }

    public QueryTableBackendRequestAnyOfAnyOfItemRequestType4450135840Serializer() {
      this(null);
    }

    @Override
    public void serialize(
        QueryTableBackendRequestAnyOfAnyOfItemRequestType4450135840 value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static QueryTableBackendRequestAnyOfAnyOfItemRequestType4450135840 fromValue(
      String value) {
    return new QueryTableBackendRequestAnyOfAnyOfItemRequestType4450135840(value);
  }
}
