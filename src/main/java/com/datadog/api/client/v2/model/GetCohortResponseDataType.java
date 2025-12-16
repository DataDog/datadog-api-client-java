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
@JsonSerialize(using = GetCohortResponseDataType.GetCohortResponseDataTypeSerializer.class)
public class GetCohortResponseDataType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("cohort_response"));

  public static final GetCohortResponseDataType COHORT_RESPONSE =
      new GetCohortResponseDataType("cohort_response");

  GetCohortResponseDataType(String value) {
    super(value, allowedValues);
  }

  public static class GetCohortResponseDataTypeSerializer
      extends StdSerializer<GetCohortResponseDataType> {
    public GetCohortResponseDataTypeSerializer(Class<GetCohortResponseDataType> t) {
      super(t);
    }

    public GetCohortResponseDataTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        GetCohortResponseDataType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static GetCohortResponseDataType fromValue(String value) {
    return new GetCohortResponseDataType(value);
  }
}
