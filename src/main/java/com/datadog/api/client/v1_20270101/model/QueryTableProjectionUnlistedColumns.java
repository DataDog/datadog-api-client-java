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
    using = QueryTableProjectionUnlistedColumns.QueryTableProjectionUnlistedColumnsSerializer.class)
public class QueryTableProjectionUnlistedColumns extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("show", "hide"));

  public static final QueryTableProjectionUnlistedColumns SHOW =
      new QueryTableProjectionUnlistedColumns("show");
  public static final QueryTableProjectionUnlistedColumns HIDE =
      new QueryTableProjectionUnlistedColumns("hide");

  QueryTableProjectionUnlistedColumns(String value) {
    super(value, allowedValues);
  }

  public static class QueryTableProjectionUnlistedColumnsSerializer
      extends StdSerializer<QueryTableProjectionUnlistedColumns> {
    public QueryTableProjectionUnlistedColumnsSerializer(
        Class<QueryTableProjectionUnlistedColumns> t) {
      super(t);
    }

    public QueryTableProjectionUnlistedColumnsSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        QueryTableProjectionUnlistedColumns value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static QueryTableProjectionUnlistedColumns fromValue(String value) {
    return new QueryTableProjectionUnlistedColumns(value);
  }
}
