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

/** The query type. */
@JsonSerialize(using = QueryType.QueryTypeSerializer.class)
public class QueryType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("action", "stateVariable", "dataTransform"));

  public static final QueryType ACTION = new QueryType("action");
  public static final QueryType STATEVARIABLE = new QueryType("stateVariable");
  public static final QueryType DATATRANSFORM = new QueryType("dataTransform");

  QueryType(String value) {
    super(value, allowedValues);
  }

  public static class QueryTypeSerializer extends StdSerializer<QueryType> {
    public QueryTypeSerializer(Class<QueryType> t) {
      super(t);
    }

    public QueryTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(QueryType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static QueryType fromValue(String value) {
    return new QueryType(value);
  }
}
