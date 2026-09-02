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

/** Rulesets resource type. */
@JsonSerialize(
    using =
        GetMultipleRulesetsResponseDataAttributesRulesetsItemsDataType
            .GetMultipleRulesetsResponseDataAttributesRulesetsItemsDataTypeSerializer.class)
public class GetMultipleRulesetsResponseDataAttributesRulesetsItemsDataType
    extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("rulesets"));

  public static final GetMultipleRulesetsResponseDataAttributesRulesetsItemsDataType RULESETS =
      new GetMultipleRulesetsResponseDataAttributesRulesetsItemsDataType("rulesets");

  GetMultipleRulesetsResponseDataAttributesRulesetsItemsDataType(String value) {
    super(value, allowedValues);
  }

  public static class GetMultipleRulesetsResponseDataAttributesRulesetsItemsDataTypeSerializer
      extends StdSerializer<GetMultipleRulesetsResponseDataAttributesRulesetsItemsDataType> {
    public GetMultipleRulesetsResponseDataAttributesRulesetsItemsDataTypeSerializer(
        Class<GetMultipleRulesetsResponseDataAttributesRulesetsItemsDataType> t) {
      super(t);
    }

    public GetMultipleRulesetsResponseDataAttributesRulesetsItemsDataTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        GetMultipleRulesetsResponseDataAttributesRulesetsItemsDataType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static GetMultipleRulesetsResponseDataAttributesRulesetsItemsDataType fromValue(
      String value) {
    return new GetMultipleRulesetsResponseDataAttributesRulesetsItemsDataType(value);
  }
}
