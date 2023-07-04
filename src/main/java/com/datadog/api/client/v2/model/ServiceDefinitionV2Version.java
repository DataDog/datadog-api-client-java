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
@JsonSerialize(using = ServiceDefinitionV2Version.ServiceDefinitionV2VersionSerializer.class)
public class ServiceDefinitionV2Version extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("v2"));

  public static final ServiceDefinitionV2Version V2 = new ServiceDefinitionV2Version("v2");

  ServiceDefinitionV2Version(String value) {
    super(value, allowedValues);
  }

  public static class ServiceDefinitionV2VersionSerializer
      extends StdSerializer<ServiceDefinitionV2Version> {
    public ServiceDefinitionV2VersionSerializer(Class<ServiceDefinitionV2Version> t) {
      super(t);
    }

    public ServiceDefinitionV2VersionSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ServiceDefinitionV2Version value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ServiceDefinitionV2Version fromValue(String value) {
    return new ServiceDefinitionV2Version(value);
  }
}
