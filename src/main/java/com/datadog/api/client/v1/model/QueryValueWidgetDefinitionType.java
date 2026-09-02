/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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

/** Type of the query value widget. */
@JsonSerialize(
    using = QueryValueWidgetDefinitionType.QueryValueWidgetDefinitionTypeSerializer.class)
public class QueryValueWidgetDefinitionType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("query_value"));

  public static final QueryValueWidgetDefinitionType QUERY_VALUE =
      new QueryValueWidgetDefinitionType("query_value");

  QueryValueWidgetDefinitionType(String value) {
    super(value, allowedValues);
  }

  public static class QueryValueWidgetDefinitionTypeSerializer
      extends StdSerializer<QueryValueWidgetDefinitionType> {
    public QueryValueWidgetDefinitionTypeSerializer(Class<QueryValueWidgetDefinitionType> t) {
      super(t);
    }

    public QueryValueWidgetDefinitionTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        QueryValueWidgetDefinitionType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static QueryValueWidgetDefinitionType fromValue(String value) {
    return new QueryValueWidgetDefinitionType(value);
  }
}
