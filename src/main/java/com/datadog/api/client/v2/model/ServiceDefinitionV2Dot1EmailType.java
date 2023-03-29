/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

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

/** Contact type. */
@JsonSerialize(
    using = ServiceDefinitionV2Dot1EmailType.ServiceDefinitionV2Dot1EmailTypeSerializer.class)
public class ServiceDefinitionV2Dot1EmailType {

  public static final ServiceDefinitionV2Dot1EmailType EMAIL =
      new ServiceDefinitionV2Dot1EmailType("email");

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("email"));

  private String value;

  public boolean isValid() {
    return allowedValues.contains(this.value);
  }

  ServiceDefinitionV2Dot1EmailType(String value) {
    this.value = value;
  }

  public static class ServiceDefinitionV2Dot1EmailTypeSerializer
      extends StdSerializer<ServiceDefinitionV2Dot1EmailType> {
    public ServiceDefinitionV2Dot1EmailTypeSerializer(Class<ServiceDefinitionV2Dot1EmailType> t) {
      super(t);
    }

    public ServiceDefinitionV2Dot1EmailTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ServiceDefinitionV2Dot1EmailType value, JsonGenerator jgen, SerializerProvider provider)
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

  /** Return true if this ServiceDefinitionV2Dot1EmailType object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return this.value.equals(((ServiceDefinitionV2Dot1EmailType) o).value);
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
  public static ServiceDefinitionV2Dot1EmailType fromValue(String value) {
    return new ServiceDefinitionV2Dot1EmailType(value);
  }
}
