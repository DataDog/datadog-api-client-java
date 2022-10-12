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
@JsonSerialize(using = ServiceDefinitionV2LinkType.ServiceDefinitionV2LinkTypeSerializer.class)
public class ServiceDefinitionV2LinkType {

  public static final ServiceDefinitionV2LinkType DOC = new ServiceDefinitionV2LinkType("doc");
  public static final ServiceDefinitionV2LinkType WIKI = new ServiceDefinitionV2LinkType("wiki");
  public static final ServiceDefinitionV2LinkType RUNBOOK =
      new ServiceDefinitionV2LinkType("runbook");
  public static final ServiceDefinitionV2LinkType URL = new ServiceDefinitionV2LinkType("url");
  public static final ServiceDefinitionV2LinkType REPO = new ServiceDefinitionV2LinkType("repo");
  public static final ServiceDefinitionV2LinkType DASHBOARD =
      new ServiceDefinitionV2LinkType("dashboard");
  public static final ServiceDefinitionV2LinkType ONCALL =
      new ServiceDefinitionV2LinkType("oncall");
  public static final ServiceDefinitionV2LinkType CODE = new ServiceDefinitionV2LinkType("code");
  public static final ServiceDefinitionV2LinkType LINK = new ServiceDefinitionV2LinkType("link");

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "doc", "wiki", "runbook", "url", "repo", "dashboard", "oncall", "code", "link"));

  private String value;

  public boolean isValid() {
    return allowedValues.contains(this.value);
  }

  ServiceDefinitionV2LinkType(String value) {
    this.value = value;
  }

  public static class ServiceDefinitionV2LinkTypeSerializer
      extends StdSerializer<ServiceDefinitionV2LinkType> {
    public ServiceDefinitionV2LinkTypeSerializer(Class<ServiceDefinitionV2LinkType> t) {
      super(t);
    }

    public ServiceDefinitionV2LinkTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ServiceDefinitionV2LinkType value, JsonGenerator jgen, SerializerProvider provider)
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

  /** Return true if this ServiceDefinitionV2LinkType object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return this.value.equals(((ServiceDefinitionV2LinkType) o).value);
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
  public static ServiceDefinitionV2LinkType fromValue(String value) {
    return new ServiceDefinitionV2LinkType(value);
  }
}
