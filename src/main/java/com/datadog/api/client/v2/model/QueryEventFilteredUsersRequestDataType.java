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

/** Query event filtered users request resource type. */
@JsonSerialize(
    using =
        QueryEventFilteredUsersRequestDataType.QueryEventFilteredUsersRequestDataTypeSerializer
            .class)
public class QueryEventFilteredUsersRequestDataType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("query_event_filtered_users_request"));

  public static final QueryEventFilteredUsersRequestDataType QUERY_EVENT_FILTERED_USERS_REQUEST =
      new QueryEventFilteredUsersRequestDataType("query_event_filtered_users_request");

  QueryEventFilteredUsersRequestDataType(String value) {
    super(value, allowedValues);
  }

  public static class QueryEventFilteredUsersRequestDataTypeSerializer
      extends StdSerializer<QueryEventFilteredUsersRequestDataType> {
    public QueryEventFilteredUsersRequestDataTypeSerializer(
        Class<QueryEventFilteredUsersRequestDataType> t) {
      super(t);
    }

    public QueryEventFilteredUsersRequestDataTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        QueryEventFilteredUsersRequestDataType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static QueryEventFilteredUsersRequestDataType fromValue(String value) {
    return new QueryEventFilteredUsersRequestDataType(value);
  }
}
