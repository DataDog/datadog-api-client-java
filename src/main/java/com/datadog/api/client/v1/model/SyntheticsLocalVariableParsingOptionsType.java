/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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
   * <p>Property of the Synthetic Test Response to extract into a local variable.</p>
 */
@JsonSerialize(using = SyntheticsLocalVariableParsingOptionsType.SyntheticsLocalVariableParsingOptionsTypeSerializer.class)
public class SyntheticsLocalVariableParsingOptionsType extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("grpc_message", "grpc_metadata", "http_body", "http_header", "http_status_code"));

  public static final SyntheticsLocalVariableParsingOptionsType GRPC_MESSAGE = new SyntheticsLocalVariableParsingOptionsType("grpc_message");
  public static final SyntheticsLocalVariableParsingOptionsType GRPC_METADATA = new SyntheticsLocalVariableParsingOptionsType("grpc_metadata");
  public static final SyntheticsLocalVariableParsingOptionsType HTTP_BODY = new SyntheticsLocalVariableParsingOptionsType("http_body");
  public static final SyntheticsLocalVariableParsingOptionsType HTTP_HEADER = new SyntheticsLocalVariableParsingOptionsType("http_header");
  public static final SyntheticsLocalVariableParsingOptionsType HTTP_STATUS_CODE = new SyntheticsLocalVariableParsingOptionsType("http_status_code");


  SyntheticsLocalVariableParsingOptionsType(String value) {
    super(value, allowedValues);
  }

  public static class SyntheticsLocalVariableParsingOptionsTypeSerializer extends StdSerializer<SyntheticsLocalVariableParsingOptionsType> {
      public SyntheticsLocalVariableParsingOptionsTypeSerializer(Class<SyntheticsLocalVariableParsingOptionsType> t) {
          super(t);
      }

      public SyntheticsLocalVariableParsingOptionsTypeSerializer() {
          this(null);
      }

      @Override
      public void serialize(SyntheticsLocalVariableParsingOptionsType value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
          jgen.writeObject(value.value);
      }
  }

  @JsonCreator
  public static SyntheticsLocalVariableParsingOptionsType fromValue(String value) {
    return new SyntheticsLocalVariableParsingOptionsType(value);
  }
}
