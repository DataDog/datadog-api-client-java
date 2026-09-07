/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.UUID;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.openapitools.jackson.nullable.JsonNullable;

import com.datadog.api.client.JsonTimeSerializer;

import com.datadog.api.client.ModelEnum;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;

import java.util.Set;
import java.util.HashSet;

/**
   * <p>Type of parser for a Synthetic global variable from a synthetics test.</p>
 */
@JsonSerialize(using = SyntheticsGlobalVariableParserType.SyntheticsGlobalVariableParserTypeSerializer.class)
public class SyntheticsGlobalVariableParserType extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("raw", "json_path", "regex", "x_path"));

  public static final SyntheticsGlobalVariableParserType RAW = new SyntheticsGlobalVariableParserType("raw");
  public static final SyntheticsGlobalVariableParserType JSON_PATH = new SyntheticsGlobalVariableParserType("json_path");
  public static final SyntheticsGlobalVariableParserType REGEX = new SyntheticsGlobalVariableParserType("regex");
  public static final SyntheticsGlobalVariableParserType X_PATH = new SyntheticsGlobalVariableParserType("x_path");


  SyntheticsGlobalVariableParserType(String value) {
    super(value, allowedValues);
  }

  public static class SyntheticsGlobalVariableParserTypeSerializer extends StdSerializer<SyntheticsGlobalVariableParserType> {
      public SyntheticsGlobalVariableParserTypeSerializer(Class<SyntheticsGlobalVariableParserType> t) {
          super(t);
      }

      public SyntheticsGlobalVariableParserTypeSerializer() {
          this(null);
      }

      @Override
      public void serialize(SyntheticsGlobalVariableParserType value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
          jgen.writeObject(value.value);
      }
  }

  @JsonCreator
  public static SyntheticsGlobalVariableParserType fromValue(String value) {
    return new SyntheticsGlobalVariableParserType(value);
  }
}
