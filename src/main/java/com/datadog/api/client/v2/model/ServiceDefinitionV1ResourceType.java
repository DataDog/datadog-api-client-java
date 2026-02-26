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

/** Link type. */
@JsonSerialize(
    using = ServiceDefinitionV1ResourceType.ServiceDefinitionV1ResourceTypeSerializer.class)
public class ServiceDefinitionV1ResourceType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "doc", "wiki", "runbook", "url", "repo", "dashboard", "oncall", "code", "link"));

  public static final ServiceDefinitionV1ResourceType DOC =
      new ServiceDefinitionV1ResourceType("doc");
  public static final ServiceDefinitionV1ResourceType WIKI =
      new ServiceDefinitionV1ResourceType("wiki");
  public static final ServiceDefinitionV1ResourceType RUNBOOK =
      new ServiceDefinitionV1ResourceType("runbook");
  public static final ServiceDefinitionV1ResourceType URL =
      new ServiceDefinitionV1ResourceType("url");
  public static final ServiceDefinitionV1ResourceType REPO =
      new ServiceDefinitionV1ResourceType("repo");
  public static final ServiceDefinitionV1ResourceType DASHBOARD =
      new ServiceDefinitionV1ResourceType("dashboard");
  public static final ServiceDefinitionV1ResourceType ONCALL =
      new ServiceDefinitionV1ResourceType("oncall");
  public static final ServiceDefinitionV1ResourceType CODE =
      new ServiceDefinitionV1ResourceType("code");
  public static final ServiceDefinitionV1ResourceType LINK =
      new ServiceDefinitionV1ResourceType("link");

  ServiceDefinitionV1ResourceType(String value) {
    super(value, allowedValues);
  }

  public static class ServiceDefinitionV1ResourceTypeSerializer
      extends StdSerializer<ServiceDefinitionV1ResourceType> {
    public ServiceDefinitionV1ResourceTypeSerializer(Class<ServiceDefinitionV1ResourceType> t) {
      super(t);
    }

    public ServiceDefinitionV1ResourceTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ServiceDefinitionV1ResourceType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ServiceDefinitionV1ResourceType fromValue(String value) {
    return new ServiceDefinitionV1ResourceType(value);
  }
}
