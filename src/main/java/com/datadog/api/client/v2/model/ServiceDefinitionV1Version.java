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

/** Schema version being used. */
@JsonSerialize(using = ServiceDefinitionV1Version.ServiceDefinitionV1VersionSerializer.class)
public class ServiceDefinitionV1Version {

  public static final ServiceDefinitionV1Version V1 = new ServiceDefinitionV1Version("v1");

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("v1"));

  private String value;

  public boolean isValid() {
    return allowedValues.contains(this.value);
  }

  ServiceDefinitionV1Version(String value) {
    this.value = value;
  }

  public static class ServiceDefinitionV1VersionSerializer
      extends StdSerializer<ServiceDefinitionV1Version> {
    public ServiceDefinitionV1VersionSerializer(Class<ServiceDefinitionV1Version> t) {
      super(t);
    }

    public ServiceDefinitionV1VersionSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ServiceDefinitionV1Version value, JsonGenerator jgen, SerializerProvider provider)
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

  /** Return true if this ServiceDefinitionV1Version object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return this.value.equals(((ServiceDefinitionV1Version) o).value);
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
  public static ServiceDefinitionV1Version fromValue(String value) {
    return new ServiceDefinitionV1Version(value);
  }
}
