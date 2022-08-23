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

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;

import java.util.Set;
import java.util.HashSet;

/**
   * <p>If the <code>target_type</code> of the remapper is <code>attribute</code>, try to cast the value to a new specific type.
   * If the cast is not possible, the original type is kept. <code>string</code>, <code>integer</code>, or <code>double</code> are the possible types.
   * If the <code>target_type</code> is <code>tag</code>, this parameter may not be specified.</p>
 */
@JsonSerialize(using = TargetFormatType.TargetFormatTypeSerializer.class)
public class TargetFormatType {

  public static final TargetFormatType AUTO = new TargetFormatType("auto");
  public static final TargetFormatType STRING = new TargetFormatType("string");
  public static final TargetFormatType INTEGER = new TargetFormatType("integer");
  public static final TargetFormatType DOUBLE = new TargetFormatType("double");

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("auto", "string", "integer", "double"));

  private String value;

  public boolean isValid() {
    return allowedValues.contains(this.value);
  }

  TargetFormatType(String value) {
    this.value = value;
  }

  public static class TargetFormatTypeSerializer extends StdSerializer<TargetFormatType> {
      public TargetFormatTypeSerializer(Class<TargetFormatType> t) {
          super(t);
      }

      public TargetFormatTypeSerializer() {
          this(null);
      }

      @Override
      public void serialize(TargetFormatType value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
          jgen.writeObject(value.value);
      }
  }

  @JsonValue
  public String getValue() {
    return this.value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  /**
   * Return true if this TargetFormatType object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return this.value.equals(((TargetFormatType) o).value);
  }

  @Override
  public int hashCode() {
      return Objects.hash(value);
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static TargetFormatType fromValue(String value) {
    return new TargetFormatType(value);
  }
}
