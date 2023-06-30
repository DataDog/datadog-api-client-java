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
@JsonSerialize(using = ServiceDefinitionV2SlackType.ServiceDefinitionV2SlackTypeSerializer.class)
public class ServiceDefinitionV2SlackType extends ModelEnum<String> {

  public static final ServiceDefinitionV2SlackType SLACK =
      new ServiceDefinitionV2SlackType("slack");

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("slack"));

  ServiceDefinitionV2SlackType(String value) {
    this.value = value;
    this.localAllowedValues = allowedValues;
  }

  public static class ServiceDefinitionV2SlackTypeSerializer
      extends StdSerializer<ServiceDefinitionV2SlackType> {
    public ServiceDefinitionV2SlackTypeSerializer(Class<ServiceDefinitionV2SlackType> t) {
      super(t);
    }

    public ServiceDefinitionV2SlackTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ServiceDefinitionV2SlackType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ServiceDefinitionV2SlackType fromValue(String value) {
    return new ServiceDefinitionV2SlackType(value);
  }
}
