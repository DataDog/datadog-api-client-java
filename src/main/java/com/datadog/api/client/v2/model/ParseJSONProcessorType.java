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

/** The type of processor. */
@JsonSerialize(using = ParseJSONProcessorType.ParseJSONProcessorTypeSerializer.class)
public class ParseJSONProcessorType extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("parse_json"));

  public static final ParseJSONProcessorType PARSE_JSON = new ParseJSONProcessorType("parse_json");

  ParseJSONProcessorType(String value) {
    super(value, allowedValues);
  }

  public static class ParseJSONProcessorTypeSerializer
      extends StdSerializer<ParseJSONProcessorType> {
    public ParseJSONProcessorTypeSerializer(Class<ParseJSONProcessorType> t) {
      super(t);
    }

    public ParseJSONProcessorTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ParseJSONProcessorType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ParseJSONProcessorType fromValue(String value) {
    return new ParseJSONProcessorType(value);
  }
}
