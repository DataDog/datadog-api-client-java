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

/** Type of the Synthetic test, <code>api</code>. */
@JsonSerialize(using = SyntheticsAPITestType.SyntheticsAPITestTypeSerializer.class)
public class SyntheticsAPITestType {

  public static final SyntheticsAPITestType API = new SyntheticsAPITestType("api");

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("api"));

  private String value;

  public boolean isValid() {
    return allowedValues.contains(this.value);
  }

  SyntheticsAPITestType(String value) {
    this.value = value;
  }

  public static class SyntheticsAPITestTypeSerializer extends StdSerializer<SyntheticsAPITestType> {
    public SyntheticsAPITestTypeSerializer(Class<SyntheticsAPITestType> t) {
      super(t);
    }

    public SyntheticsAPITestTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SyntheticsAPITestType value, JsonGenerator jgen, SerializerProvider provider)
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

  /** Return true if this SyntheticsAPITestType object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return this.value.equals(((SyntheticsAPITestType) o).value);
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
  public static SyntheticsAPITestType fromValue(String value) {
    return new SyntheticsAPITestType(value);
  }
}