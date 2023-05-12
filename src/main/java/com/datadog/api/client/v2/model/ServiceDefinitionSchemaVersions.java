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

/** Schema versions */
@JsonSerialize(
    using = ServiceDefinitionSchemaVersions.ServiceDefinitionSchemaVersionsSerializer.class)
public class ServiceDefinitionSchemaVersions {

  public static final ServiceDefinitionSchemaVersions V1 =
      new ServiceDefinitionSchemaVersions("v1");
  public static final ServiceDefinitionSchemaVersions V2 =
      new ServiceDefinitionSchemaVersions("v2");
  public static final ServiceDefinitionSchemaVersions V2_1 =
      new ServiceDefinitionSchemaVersions("v2.1");

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("v1", "v2", "v2.1"));

  private String value;

  public boolean isValid() {
    return allowedValues.contains(this.value);
  }

  ServiceDefinitionSchemaVersions(String value) {
    this.value = value;
  }

  public static class ServiceDefinitionSchemaVersionsSerializer
      extends StdSerializer<ServiceDefinitionSchemaVersions> {
    public ServiceDefinitionSchemaVersionsSerializer(Class<ServiceDefinitionSchemaVersions> t) {
      super(t);
    }

    public ServiceDefinitionSchemaVersionsSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ServiceDefinitionSchemaVersions value, JsonGenerator jgen, SerializerProvider provider)
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

  /** Return true if this ServiceDefinitionSchemaVersions object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return this.value.equals(((ServiceDefinitionSchemaVersions) o).value);
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
  public static ServiceDefinitionSchemaVersions fromValue(String value) {
    return new ServiceDefinitionSchemaVersions(value);
  }
}
