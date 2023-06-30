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
@JsonSerialize(
    using = ServiceDefinitionV2Dot1Version.ServiceDefinitionV2Dot1VersionSerializer.class)
public class ServiceDefinitionV2Dot1Version extends ModelEnum<String> {

  public static final ServiceDefinitionV2Dot1Version V2_1 =
      new ServiceDefinitionV2Dot1Version("v2.1");

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("v2.1"));

  ServiceDefinitionV2Dot1Version(String value) {
    this.value = value;
    this.localAllowedValues = allowedValues;
  }

  public static class ServiceDefinitionV2Dot1VersionSerializer
      extends StdSerializer<ServiceDefinitionV2Dot1Version> {
    public ServiceDefinitionV2Dot1VersionSerializer(Class<ServiceDefinitionV2Dot1Version> t) {
      super(t);
    }

    public ServiceDefinitionV2Dot1VersionSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ServiceDefinitionV2Dot1Version value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ServiceDefinitionV2Dot1Version fromValue(String value) {
    return new ServiceDefinitionV2Dot1Version(value);
  }
}
