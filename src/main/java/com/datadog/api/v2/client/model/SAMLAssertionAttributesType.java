/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.v2.client.model;

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

/** SAML assertion attributes resource type. */
@JsonSerialize(using = SAMLAssertionAttributesType.SAMLAssertionAttributesTypeSerializer.class)
public class SAMLAssertionAttributesType {

  public static final SAMLAssertionAttributesType SAML_ASSERTION_ATTRIBUTES =
      new SAMLAssertionAttributesType("saml_assertion_attributes");

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("saml_assertion_attributes"));

  private String value;

  public boolean isValid() {
    return allowedValues.contains(this.value);
  }

  SAMLAssertionAttributesType(String value) {
    this.value = value;
  }

  public static class SAMLAssertionAttributesTypeSerializer
      extends StdSerializer<SAMLAssertionAttributesType> {
    public SAMLAssertionAttributesTypeSerializer(Class<SAMLAssertionAttributesType> t) {
      super(t);
    }

    public SAMLAssertionAttributesTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SAMLAssertionAttributesType value, JsonGenerator jgen, SerializerProvider provider)
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

  /** Return true if this SAMLAssertionAttributesType object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return this.value.equals(((SAMLAssertionAttributesType) o).value);
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
  public static SAMLAssertionAttributesType fromValue(String value) {
    return new SAMLAssertionAttributesType(value);
  }
}
