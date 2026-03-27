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
   * <p>Custom attributes type</p>
 */
@JsonSerialize(using = CustomAttributeType.CustomAttributeTypeSerializer.class)
public class CustomAttributeType extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("URL", "TEXT", "NUMBER", "SELECT"));

  public static final CustomAttributeType URL = new CustomAttributeType("URL");
  public static final CustomAttributeType TEXT = new CustomAttributeType("TEXT");
  public static final CustomAttributeType NUMBER = new CustomAttributeType("NUMBER");
  public static final CustomAttributeType SELECT = new CustomAttributeType("SELECT");


  CustomAttributeType(String value) {
    super(value, allowedValues);
  }

  public static class CustomAttributeTypeSerializer extends StdSerializer<CustomAttributeType> {
      public CustomAttributeTypeSerializer(Class<CustomAttributeType> t) {
          super(t);
      }

      public CustomAttributeTypeSerializer() {
          this(null);
      }

      @Override
      public void serialize(CustomAttributeType value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
          jgen.writeObject(value.value);
      }
  }

  @JsonCreator
  public static CustomAttributeType fromValue(String value) {
    return new CustomAttributeType(value);
  }
}
