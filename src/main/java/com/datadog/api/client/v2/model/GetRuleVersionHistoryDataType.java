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

/** Type of data. */
@JsonSerialize(using = GetRuleVersionHistoryDataType.GetRuleVersionHistoryDataTypeSerializer.class)
public class GetRuleVersionHistoryDataType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("GetRuleVersionHistoryResponse"));

  public static final GetRuleVersionHistoryDataType GETRULEVERSIONHISTORYRESPONSE =
      new GetRuleVersionHistoryDataType("GetRuleVersionHistoryResponse");

  GetRuleVersionHistoryDataType(String value) {
    super(value, allowedValues);
  }

  public static class GetRuleVersionHistoryDataTypeSerializer
      extends StdSerializer<GetRuleVersionHistoryDataType> {
    public GetRuleVersionHistoryDataTypeSerializer(Class<GetRuleVersionHistoryDataType> t) {
      super(t);
    }

    public GetRuleVersionHistoryDataTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        GetRuleVersionHistoryDataType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static GetRuleVersionHistoryDataType fromValue(String value) {
    return new GetRuleVersionHistoryDataType(value);
  }
}
