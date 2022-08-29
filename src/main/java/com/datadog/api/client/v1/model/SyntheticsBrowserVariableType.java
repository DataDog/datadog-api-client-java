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

/** Type of browser test variable. */
@JsonSerialize(using = SyntheticsBrowserVariableType.SyntheticsBrowserVariableTypeSerializer.class)
public class SyntheticsBrowserVariableType {

  public static final SyntheticsBrowserVariableType ELEMENT =
      new SyntheticsBrowserVariableType("element");
  public static final SyntheticsBrowserVariableType EMAIL =
      new SyntheticsBrowserVariableType("email");
  public static final SyntheticsBrowserVariableType GLOBAL =
      new SyntheticsBrowserVariableType("global");
  public static final SyntheticsBrowserVariableType JAVASCRIPT =
      new SyntheticsBrowserVariableType("javascript");
  public static final SyntheticsBrowserVariableType TEXT =
      new SyntheticsBrowserVariableType("text");

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("element", "email", "global", "javascript", "text"));

  private String value;

  public boolean isValid() {
    return allowedValues.contains(this.value);
  }

  SyntheticsBrowserVariableType(String value) {
    this.value = value;
  }

  public static class SyntheticsBrowserVariableTypeSerializer
      extends StdSerializer<SyntheticsBrowserVariableType> {
    public SyntheticsBrowserVariableTypeSerializer(Class<SyntheticsBrowserVariableType> t) {
      super(t);
    }

    public SyntheticsBrowserVariableTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SyntheticsBrowserVariableType value, JsonGenerator jgen, SerializerProvider provider)
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

  /** Return true if this SyntheticsBrowserVariableType object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return this.value.equals(((SyntheticsBrowserVariableType) o).value);
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
  public static SyntheticsBrowserVariableType fromValue(String value) {
    return new SyntheticsBrowserVariableType(value);
  }
}
