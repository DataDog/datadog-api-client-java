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
@JsonSerialize(using = QueryTableDatePattern.QueryTableDatePatternSerializer.class)
public class QueryTableDatePattern extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "MMM dd yyyy", "MMM d", "MMM d, yyyy", "MM/dd/yyyy", "dd/MM/yyyy", "MMMM d, yyyy"));

  public static final QueryTableDatePattern MMM_DD_YYYY = new QueryTableDatePattern("MMM dd yyyy");
  public static final QueryTableDatePattern MMM_D = new QueryTableDatePattern("MMM d");
  public static final QueryTableDatePattern MMM_D__YYYY = new QueryTableDatePattern("MMM d, yyyy");
  public static final QueryTableDatePattern MM_DD_YYYY = new QueryTableDatePattern("MM/dd/yyyy");
  public static final QueryTableDatePattern DD_MM_YYYY = new QueryTableDatePattern("dd/MM/yyyy");
  public static final QueryTableDatePattern MMMM_D__YYYY =
      new QueryTableDatePattern("MMMM d, yyyy");

  QueryTableDatePattern(String value) {
    super(value, allowedValues);
  }

  public static class QueryTableDatePatternSerializer extends StdSerializer<QueryTableDatePattern> {
    public QueryTableDatePatternSerializer(Class<QueryTableDatePattern> t) {
      super(t);
    }

    public QueryTableDatePatternSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        QueryTableDatePattern value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static QueryTableDatePattern fromValue(String value) {
    return new QueryTableDatePattern(value);
  }
}
