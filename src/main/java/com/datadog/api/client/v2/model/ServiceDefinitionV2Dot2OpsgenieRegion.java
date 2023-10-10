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
    using =
        ServiceDefinitionV2Dot2OpsgenieRegion.ServiceDefinitionV2Dot2OpsgenieRegionSerializer.class)
public class ServiceDefinitionV2Dot2OpsgenieRegion extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("US", "EU"));

  public static final ServiceDefinitionV2Dot2OpsgenieRegion US =
      new ServiceDefinitionV2Dot2OpsgenieRegion("US");
  public static final ServiceDefinitionV2Dot2OpsgenieRegion EU =
      new ServiceDefinitionV2Dot2OpsgenieRegion("EU");

  ServiceDefinitionV2Dot2OpsgenieRegion(String value) {
    super(value, allowedValues);
  }

  public static class ServiceDefinitionV2Dot2OpsgenieRegionSerializer
      extends StdSerializer<ServiceDefinitionV2Dot2OpsgenieRegion> {
    public ServiceDefinitionV2Dot2OpsgenieRegionSerializer(
        Class<ServiceDefinitionV2Dot2OpsgenieRegion> t) {
      super(t);
    }

    public ServiceDefinitionV2Dot2OpsgenieRegionSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ServiceDefinitionV2Dot2OpsgenieRegion value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ServiceDefinitionV2Dot2OpsgenieRegion fromValue(String value) {
    return new ServiceDefinitionV2Dot2OpsgenieRegion(value);
  }
}
