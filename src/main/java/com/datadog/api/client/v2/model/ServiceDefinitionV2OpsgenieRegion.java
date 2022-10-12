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

/** Opsgenie instance region. */
@JsonSerialize(
    using = ServiceDefinitionV2OpsgenieRegion.ServiceDefinitionV2OpsgenieRegionSerializer.class)
public class ServiceDefinitionV2OpsgenieRegion {

  public static final ServiceDefinitionV2OpsgenieRegion US =
      new ServiceDefinitionV2OpsgenieRegion("US");
  public static final ServiceDefinitionV2OpsgenieRegion EU =
      new ServiceDefinitionV2OpsgenieRegion("EU");

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("US", "EU"));

  private String value;

  public boolean isValid() {
    return allowedValues.contains(this.value);
  }

  ServiceDefinitionV2OpsgenieRegion(String value) {
    this.value = value;
  }

  public static class ServiceDefinitionV2OpsgenieRegionSerializer
      extends StdSerializer<ServiceDefinitionV2OpsgenieRegion> {
    public ServiceDefinitionV2OpsgenieRegionSerializer(Class<ServiceDefinitionV2OpsgenieRegion> t) {
      super(t);
    }

    public ServiceDefinitionV2OpsgenieRegionSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ServiceDefinitionV2OpsgenieRegion value, JsonGenerator jgen, SerializerProvider provider)
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

  /** Return true if this ServiceDefinitionV2OpsgenieRegion object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return this.value.equals(((ServiceDefinitionV2OpsgenieRegion) o).value);
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
  public static ServiceDefinitionV2OpsgenieRegion fromValue(String value) {
    return new ServiceDefinitionV2OpsgenieRegion(value);
  }
}
