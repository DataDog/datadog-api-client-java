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
        QueryValueBackendRequestAnyOfAnyOfItemResponseFormat4450609856
            .QueryValueBackendRequestAnyOfAnyOfItemResponseFormat4450609856Serializer.class)
public class QueryValueBackendRequestAnyOfAnyOfItemResponseFormat4450609856
    extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("scalar"));

  public static final QueryValueBackendRequestAnyOfAnyOfItemResponseFormat4450609856 SCALAR =
      new QueryValueBackendRequestAnyOfAnyOfItemResponseFormat4450609856("scalar");

  QueryValueBackendRequestAnyOfAnyOfItemResponseFormat4450609856(String value) {
    super(value, allowedValues);
  }

  public static class QueryValueBackendRequestAnyOfAnyOfItemResponseFormat4450609856Serializer
      extends StdSerializer<QueryValueBackendRequestAnyOfAnyOfItemResponseFormat4450609856> {
    public QueryValueBackendRequestAnyOfAnyOfItemResponseFormat4450609856Serializer(
        Class<QueryValueBackendRequestAnyOfAnyOfItemResponseFormat4450609856> t) {
      super(t);
    }

    public QueryValueBackendRequestAnyOfAnyOfItemResponseFormat4450609856Serializer() {
      this(null);
    }

    @Override
    public void serialize(
        QueryValueBackendRequestAnyOfAnyOfItemResponseFormat4450609856 value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static QueryValueBackendRequestAnyOfAnyOfItemResponseFormat4450609856 fromValue(
      String value) {
    return new QueryValueBackendRequestAnyOfAnyOfItemResponseFormat4450609856(value);
  }
}
