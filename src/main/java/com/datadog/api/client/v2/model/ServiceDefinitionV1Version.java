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

/** Schema version being used. */
@JsonSerialize(using = ServiceDefinitionV1Version.ServiceDefinitionV1VersionSerializer.class)
public class ServiceDefinitionV1Version extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("v1"));

  public static final ServiceDefinitionV1Version V1 = new ServiceDefinitionV1Version("v1");

  ServiceDefinitionV1Version(String value) {
    super(value, allowedValues);
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

  @JsonCreator
  public static ServiceDefinitionV1Version fromValue(String value) {
    return new ServiceDefinitionV1Version(value);
  }
}
