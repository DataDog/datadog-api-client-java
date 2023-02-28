/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/** Property of the Synthetics Test Response to use for a Synthetics global variable. */
@JsonSerialize(
    using =
        SyntheticsGlobalVariableParseTestOptionsType
            .SyntheticsGlobalVariableParseTestOptionsTypeSerializer.class)
public class SyntheticsGlobalVariableParseTestOptionsType {

  public static final SyntheticsGlobalVariableParseTestOptionsType HTTP_BODY =
      new SyntheticsGlobalVariableParseTestOptionsType("http_body");
  public static final SyntheticsGlobalVariableParseTestOptionsType HTTP_HEADER =
      new SyntheticsGlobalVariableParseTestOptionsType("http_header");
  public static final SyntheticsGlobalVariableParseTestOptionsType LOCAL_VARIABLE =
      new SyntheticsGlobalVariableParseTestOptionsType("local_variable");

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("http_body", "http_header", "local_variable"));

  private String value;

  public boolean isValid() {
    return allowedValues.contains(this.value);
  }

  SyntheticsGlobalVariableParseTestOptionsType(String value) {
    this.value = value;
  }

  public static class SyntheticsGlobalVariableParseTestOptionsTypeSerializer
      extends StdSerializer<SyntheticsGlobalVariableParseTestOptionsType> {
    public SyntheticsGlobalVariableParseTestOptionsTypeSerializer(
        Class<SyntheticsGlobalVariableParseTestOptionsType> t) {
      super(t);
    }

    public SyntheticsGlobalVariableParseTestOptionsTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SyntheticsGlobalVariableParseTestOptionsType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
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

  /** Return true if this SyntheticsGlobalVariableParseTestOptionsType object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return this.value.equals(((SyntheticsGlobalVariableParseTestOptionsType) o).value);
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
  public static SyntheticsGlobalVariableParseTestOptionsType fromValue(String value) {
    return new SyntheticsGlobalVariableParseTestOptionsType(value);
  }
}
