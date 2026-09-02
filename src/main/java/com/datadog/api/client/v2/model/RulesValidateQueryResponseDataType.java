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

/** Validate response resource type. */
@JsonSerialize(
    using = RulesValidateQueryResponseDataType.RulesValidateQueryResponseDataTypeSerializer.class)
public class RulesValidateQueryResponseDataType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("validate_response"));

  public static final RulesValidateQueryResponseDataType VALIDATE_RESPONSE =
      new RulesValidateQueryResponseDataType("validate_response");

  RulesValidateQueryResponseDataType(String value) {
    super(value, allowedValues);
  }

  public static class RulesValidateQueryResponseDataTypeSerializer
      extends StdSerializer<RulesValidateQueryResponseDataType> {
    public RulesValidateQueryResponseDataTypeSerializer(
        Class<RulesValidateQueryResponseDataType> t) {
      super(t);
    }

    public RulesValidateQueryResponseDataTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        RulesValidateQueryResponseDataType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static RulesValidateQueryResponseDataType fromValue(String value) {
    return new RulesValidateQueryResponseDataType(value);
  }
}
