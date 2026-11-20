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
        QueryValueBackendRequestAnyOfAnyOfItemRequestType4450439776
            .QueryValueBackendRequestAnyOfAnyOfItemRequestType4450439776Serializer.class)
public class QueryValueBackendRequestAnyOfAnyOfItemRequestType4450439776 extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("ddsql"));

  public static final QueryValueBackendRequestAnyOfAnyOfItemRequestType4450439776 DDSQL =
      new QueryValueBackendRequestAnyOfAnyOfItemRequestType4450439776("ddsql");

  QueryValueBackendRequestAnyOfAnyOfItemRequestType4450439776(String value) {
    super(value, allowedValues);
  }

  public static class QueryValueBackendRequestAnyOfAnyOfItemRequestType4450439776Serializer
      extends StdSerializer<QueryValueBackendRequestAnyOfAnyOfItemRequestType4450439776> {
    public QueryValueBackendRequestAnyOfAnyOfItemRequestType4450439776Serializer(
        Class<QueryValueBackendRequestAnyOfAnyOfItemRequestType4450439776> t) {
      super(t);
    }

    public QueryValueBackendRequestAnyOfAnyOfItemRequestType4450439776Serializer() {
      this(null);
    }

    @Override
    public void serialize(
        QueryValueBackendRequestAnyOfAnyOfItemRequestType4450439776 value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static QueryValueBackendRequestAnyOfAnyOfItemRequestType4450439776 fromValue(
      String value) {
    return new QueryValueBackendRequestAnyOfAnyOfItemRequestType4450439776(value);
  }
}
