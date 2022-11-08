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

/** Type of the request body. */
@JsonSerialize(using = SyntheticsTestRequestBodyType.SyntheticsTestRequestBodyTypeSerializer.class)
public class SyntheticsTestRequestBodyType {

  public static final SyntheticsTestRequestBodyType TEXT_PLAIN =
      new SyntheticsTestRequestBodyType("text/plain");
  public static final SyntheticsTestRequestBodyType APPLICATION_JSON =
      new SyntheticsTestRequestBodyType("application/json");
  public static final SyntheticsTestRequestBodyType TEXT_XML =
      new SyntheticsTestRequestBodyType("text/xml");
  public static final SyntheticsTestRequestBodyType TEXT_HTML =
      new SyntheticsTestRequestBodyType("text/html");
  public static final SyntheticsTestRequestBodyType APPLICATION_X_WWW_FORM_URLENCODED =
      new SyntheticsTestRequestBodyType("application/x-www-form-urlencoded");
  public static final SyntheticsTestRequestBodyType GRAPHQL =
      new SyntheticsTestRequestBodyType("graphql");

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "text/plain",
              "application/json",
              "text/xml",
              "text/html",
              "application/x-www-form-urlencoded",
              "graphql"));

  private String value;

  public boolean isValid() {
    return allowedValues.contains(this.value);
  }

  SyntheticsTestRequestBodyType(String value) {
    this.value = value;
  }

  public static class SyntheticsTestRequestBodyTypeSerializer
      extends StdSerializer<SyntheticsTestRequestBodyType> {
    public SyntheticsTestRequestBodyTypeSerializer(Class<SyntheticsTestRequestBodyType> t) {
      super(t);
    }

    public SyntheticsTestRequestBodyTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SyntheticsTestRequestBodyType value, JsonGenerator jgen, SerializerProvider provider)
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

  /** Return true if this SyntheticsTestRequestBodyType object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return this.value.equals(((SyntheticsTestRequestBodyType) o).value);
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
  public static SyntheticsTestRequestBodyType fromValue(String value) {
    return new SyntheticsTestRequestBodyType(value);
  }
}
