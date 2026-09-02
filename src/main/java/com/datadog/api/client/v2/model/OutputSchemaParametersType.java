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
   * <p>The definition of <code>OutputSchemaParametersType</code> object.</p>
 */
@JsonSerialize(using = OutputSchemaParametersType.OutputSchemaParametersTypeSerializer.class)
public class OutputSchemaParametersType extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("STRING", "NUMBER", "BOOLEAN", "OBJECT", "ARRAY_STRING", "ARRAY_NUMBER", "ARRAY_BOOLEAN", "ARRAY_OBJECT"));

  public static final OutputSchemaParametersType STRING = new OutputSchemaParametersType("STRING");
  public static final OutputSchemaParametersType NUMBER = new OutputSchemaParametersType("NUMBER");
  public static final OutputSchemaParametersType BOOLEAN = new OutputSchemaParametersType("BOOLEAN");
  public static final OutputSchemaParametersType OBJECT = new OutputSchemaParametersType("OBJECT");
  public static final OutputSchemaParametersType ARRAY_STRING = new OutputSchemaParametersType("ARRAY_STRING");
  public static final OutputSchemaParametersType ARRAY_NUMBER = new OutputSchemaParametersType("ARRAY_NUMBER");
  public static final OutputSchemaParametersType ARRAY_BOOLEAN = new OutputSchemaParametersType("ARRAY_BOOLEAN");
  public static final OutputSchemaParametersType ARRAY_OBJECT = new OutputSchemaParametersType("ARRAY_OBJECT");


  OutputSchemaParametersType(String value) {
    super(value, allowedValues);
  }

  public static class OutputSchemaParametersTypeSerializer extends StdSerializer<OutputSchemaParametersType> {
      public OutputSchemaParametersTypeSerializer(Class<OutputSchemaParametersType> t) {
          super(t);
      }

      public OutputSchemaParametersTypeSerializer() {
          this(null);
      }

      @Override
      public void serialize(OutputSchemaParametersType value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
          jgen.writeObject(value.value);
      }
  }

  @JsonCreator
  public static OutputSchemaParametersType fromValue(String value) {
    return new OutputSchemaParametersType(value);
  }
}
