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

/** Contact type. */
@JsonSerialize(using = ServiceDefinitionV2EmailType.ServiceDefinitionV2EmailTypeSerializer.class)
public class ServiceDefinitionV2EmailType extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("email"));

  public static final ServiceDefinitionV2EmailType EMAIL =
      new ServiceDefinitionV2EmailType("email");

  ServiceDefinitionV2EmailType(String value) {
    super(value, allowedValues);
  }

  public static class ServiceDefinitionV2EmailTypeSerializer
      extends StdSerializer<ServiceDefinitionV2EmailType> {
    public ServiceDefinitionV2EmailTypeSerializer(Class<ServiceDefinitionV2EmailType> t) {
      super(t);
    }

    public ServiceDefinitionV2EmailTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ServiceDefinitionV2EmailType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ServiceDefinitionV2EmailType fromValue(String value) {
    return new ServiceDefinitionV2EmailType(value);
  }
}
