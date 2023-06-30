/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

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

/** Direction of sort. */
@JsonSerialize(using = QuerySortOrder.QuerySortOrderSerializer.class)
public class QuerySortOrder extends ModelEnum<String> {

  public static final QuerySortOrder ASC = new QuerySortOrder("asc");
  public static final QuerySortOrder DESC = new QuerySortOrder("desc");

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("asc", "desc"));

  QuerySortOrder(String value) {
    this.value = value;
    this.localAllowedValues = allowedValues;
  }

  public static class QuerySortOrderSerializer extends StdSerializer<QuerySortOrder> {
    public QuerySortOrderSerializer(Class<QuerySortOrder> t) {
      super(t);
    }

    public QuerySortOrderSerializer() {
      this(null);
    }

    @Override
    public void serialize(QuerySortOrder value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static QuerySortOrder fromValue(String value) {
    return new QuerySortOrder(value);
  }
}
