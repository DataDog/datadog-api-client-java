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

/** Query account request resource type. */
@JsonSerialize(using = QueryAccountRequestDataType.QueryAccountRequestDataTypeSerializer.class)
public class QueryAccountRequestDataType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("query_account_request"));

  public static final QueryAccountRequestDataType QUERY_ACCOUNT_REQUEST =
      new QueryAccountRequestDataType("query_account_request");

  QueryAccountRequestDataType(String value) {
    super(value, allowedValues);
  }

  public static class QueryAccountRequestDataTypeSerializer
      extends StdSerializer<QueryAccountRequestDataType> {
    public QueryAccountRequestDataTypeSerializer(Class<QueryAccountRequestDataType> t) {
      super(t);
    }

    public QueryAccountRequestDataTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        QueryAccountRequestDataType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static QueryAccountRequestDataType fromValue(String value) {
    return new QueryAccountRequestDataType(value);
  }
}
