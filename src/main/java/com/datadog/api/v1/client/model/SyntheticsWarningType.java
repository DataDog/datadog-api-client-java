/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.datadog.api.v1.client.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.datadog.api.v1.client.JSON;


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
 * User locator used.
 */
@JsonSerialize(using = SyntheticsWarningType.SyntheticsWarningTypeSerializer.class)
public class SyntheticsWarningType {
  
  public static final SyntheticsWarningType USER_LOCATOR = new SyntheticsWarningType("user_locator");

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("user_locator"));

  private String value;

  public boolean isValid() {
    return allowedValues.contains(this.value);
  }

  SyntheticsWarningType(String value) {
    this.value = value;
  }

  public static class SyntheticsWarningTypeSerializer extends StdSerializer<SyntheticsWarningType> {
      public SyntheticsWarningTypeSerializer(Class<SyntheticsWarningType> t) {
          super(t);
      }

      public SyntheticsWarningTypeSerializer() {
          this(null);
      }

      @Override
      public void serialize(SyntheticsWarningType value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
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
   * Return true if this SyntheticsWarningType object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return this.value.equals(((SyntheticsWarningType) o).value);
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
  public static SyntheticsWarningType fromValue(String value) {
    return new SyntheticsWarningType(value);
  }
}

