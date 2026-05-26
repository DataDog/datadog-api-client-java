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

/**
 * How the delta is expressed: <code>absolute</code> (raw difference), <code>relative</code>
 * (percentage), or <code>both</code>.
 */
@JsonSerialize(
    using = QueryValueWidgetComparisonType.QueryValueWidgetComparisonTypeSerializer.class)
public class QueryValueWidgetComparisonType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("absolute", "relative", "both"));

  public static final QueryValueWidgetComparisonType ABSOLUTE =
      new QueryValueWidgetComparisonType("absolute");
  public static final QueryValueWidgetComparisonType RELATIVE =
      new QueryValueWidgetComparisonType("relative");
  public static final QueryValueWidgetComparisonType BOTH =
      new QueryValueWidgetComparisonType("both");

  QueryValueWidgetComparisonType(String value) {
    super(value, allowedValues);
  }

  public static class QueryValueWidgetComparisonTypeSerializer
      extends StdSerializer<QueryValueWidgetComparisonType> {
    public QueryValueWidgetComparisonTypeSerializer(Class<QueryValueWidgetComparisonType> t) {
      super(t);
    }

    public QueryValueWidgetComparisonTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        QueryValueWidgetComparisonType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static QueryValueWidgetComparisonType fromValue(String value) {
    return new QueryValueWidgetComparisonType(value);
  }
}
