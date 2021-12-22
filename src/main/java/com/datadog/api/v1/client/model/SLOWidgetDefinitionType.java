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
 * Type of the SLO widget.
 */
@JsonSerialize(using = SLOWidgetDefinitionType.SLOWidgetDefinitionTypeSerializer.class)
public class SLOWidgetDefinitionType {
  
  public static final SLOWidgetDefinitionType SLO = new SLOWidgetDefinitionType("slo");

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("slo"));

  private String value;

  public boolean isValid() {
    return allowedValues.contains(this.value);
  }

  SLOWidgetDefinitionType(String value) {
    this.value = value;
  }

  public static class SLOWidgetDefinitionTypeSerializer extends StdSerializer<SLOWidgetDefinitionType> {
      public SLOWidgetDefinitionTypeSerializer(Class<SLOWidgetDefinitionType> t) {
          super(t);
      }

      public SLOWidgetDefinitionTypeSerializer() {
          this(null);
      }

      @Override
      public void serialize(SLOWidgetDefinitionType value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
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
   * Return true if this SLOWidgetDefinitionType object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return this.value.equals(((SLOWidgetDefinitionType) o).value);
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
  public static SLOWidgetDefinitionType fromValue(String value) {
    return new SLOWidgetDefinitionType(value);
  }
}

