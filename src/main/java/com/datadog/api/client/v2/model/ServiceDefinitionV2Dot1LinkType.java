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

/** Link type. */
@JsonSerialize(
    using = ServiceDefinitionV2Dot1LinkType.ServiceDefinitionV2Dot1LinkTypeSerializer.class)
public class ServiceDefinitionV2Dot1LinkType {

  public static final ServiceDefinitionV2Dot1LinkType DOC =
      new ServiceDefinitionV2Dot1LinkType("doc");
  public static final ServiceDefinitionV2Dot1LinkType REPO =
      new ServiceDefinitionV2Dot1LinkType("repo");
  public static final ServiceDefinitionV2Dot1LinkType RUNBOOK =
      new ServiceDefinitionV2Dot1LinkType("runbook");
  public static final ServiceDefinitionV2Dot1LinkType DASHBOARD =
      new ServiceDefinitionV2Dot1LinkType("dashboard");
  public static final ServiceDefinitionV2Dot1LinkType OTHER =
      new ServiceDefinitionV2Dot1LinkType("other");

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("doc", "repo", "runbook", "dashboard", "other"));

  private String value;

  public boolean isValid() {
    return allowedValues.contains(this.value);
  }

  ServiceDefinitionV2Dot1LinkType(String value) {
    this.value = value;
  }

  public static class ServiceDefinitionV2Dot1LinkTypeSerializer
      extends StdSerializer<ServiceDefinitionV2Dot1LinkType> {
    public ServiceDefinitionV2Dot1LinkTypeSerializer(Class<ServiceDefinitionV2Dot1LinkType> t) {
      super(t);
    }

    public ServiceDefinitionV2Dot1LinkTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ServiceDefinitionV2Dot1LinkType value, JsonGenerator jgen, SerializerProvider provider)
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

  /** Return true if this ServiceDefinitionV2Dot1LinkType object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return this.value.equals(((ServiceDefinitionV2Dot1LinkType) o).value);
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
  public static ServiceDefinitionV2Dot1LinkType fromValue(String value) {
    return new ServiceDefinitionV2Dot1LinkType(value);
  }
}
