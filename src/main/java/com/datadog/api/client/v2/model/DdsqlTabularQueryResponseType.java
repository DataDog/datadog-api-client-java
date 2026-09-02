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

/** JSON:API resource type for a DDSQL tabular query response. */
@JsonSerialize(using = DdsqlTabularQueryResponseType.DdsqlTabularQueryResponseTypeSerializer.class)
public class DdsqlTabularQueryResponseType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("ddsql_query_response"));

  public static final DdsqlTabularQueryResponseType DDSQL_QUERY_RESPONSE =
      new DdsqlTabularQueryResponseType("ddsql_query_response");

  DdsqlTabularQueryResponseType(String value) {
    super(value, allowedValues);
  }

  public static class DdsqlTabularQueryResponseTypeSerializer
      extends StdSerializer<DdsqlTabularQueryResponseType> {
    public DdsqlTabularQueryResponseTypeSerializer(Class<DdsqlTabularQueryResponseType> t) {
      super(t);
    }

    public DdsqlTabularQueryResponseTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        DdsqlTabularQueryResponseType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static DdsqlTabularQueryResponseType fromValue(String value) {
    return new DdsqlTabularQueryResponseType(value);
  }
}
