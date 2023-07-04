/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.datadog.api.client.ModelEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/** Opsgenie instance region. */
@JsonSerialize(
    using = ServiceDefinitionV2OpsgenieRegion.ServiceDefinitionV2OpsgenieRegionSerializer.class)
public class ServiceDefinitionV2OpsgenieRegion extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("US", "EU"));

  public static final ServiceDefinitionV2OpsgenieRegion US =
      new ServiceDefinitionV2OpsgenieRegion("US");
  public static final ServiceDefinitionV2OpsgenieRegion EU =
      new ServiceDefinitionV2OpsgenieRegion("EU");

  ServiceDefinitionV2OpsgenieRegion(String value) {
    super(value, allowedValues);
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

  @JsonCreator
  public static ServiceDefinitionV2OpsgenieRegion fromValue(String value) {
    return new ServiceDefinitionV2OpsgenieRegion(value);
  }
}
