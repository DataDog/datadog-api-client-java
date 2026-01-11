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

/** */
@JsonSerialize(using = GetCohortUsersRequestDataType.GetCohortUsersRequestDataTypeSerializer.class)
public class GetCohortUsersRequestDataType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("cohort_users_request"));

  public static final GetCohortUsersRequestDataType COHORT_USERS_REQUEST =
      new GetCohortUsersRequestDataType("cohort_users_request");

  GetCohortUsersRequestDataType(String value) {
    super(value, allowedValues);
  }

  public static class GetCohortUsersRequestDataTypeSerializer
      extends StdSerializer<GetCohortUsersRequestDataType> {
    public GetCohortUsersRequestDataTypeSerializer(Class<GetCohortUsersRequestDataType> t) {
      super(t);
    }

    public GetCohortUsersRequestDataTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        GetCohortUsersRequestDataType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static GetCohortUsersRequestDataType fromValue(String value) {
    return new GetCohortUsersRequestDataType(value);
  }
}
