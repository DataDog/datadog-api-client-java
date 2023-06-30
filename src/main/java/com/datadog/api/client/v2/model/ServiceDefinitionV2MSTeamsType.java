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
@JsonSerialize(
    using = ServiceDefinitionV2MSTeamsType.ServiceDefinitionV2MSTeamsTypeSerializer.class)
public class ServiceDefinitionV2MSTeamsType extends ModelEnum<String> {

  public static final ServiceDefinitionV2MSTeamsType MICROSOFT_TEAMS =
      new ServiceDefinitionV2MSTeamsType("microsoft-teams");

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("microsoft-teams"));

  ServiceDefinitionV2MSTeamsType(String value) {
    this.value = value;
    this.localAllowedValues = allowedValues;
  }

  public static class ServiceDefinitionV2MSTeamsTypeSerializer
      extends StdSerializer<ServiceDefinitionV2MSTeamsType> {
    public ServiceDefinitionV2MSTeamsTypeSerializer(Class<ServiceDefinitionV2MSTeamsType> t) {
      super(t);
    }

    public ServiceDefinitionV2MSTeamsTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ServiceDefinitionV2MSTeamsType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ServiceDefinitionV2MSTeamsType fromValue(String value) {
    return new ServiceDefinitionV2MSTeamsType(value);
  }
}
