/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.UUID;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.openapitools.jackson.nullable.JsonNullable;

import com.datadog.api.client.JsonTimeSerializer;

import com.datadog.api.client.ModelEnum;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;

import java.util.Set;
import java.util.HashSet;

/**
   * <p>Link type.</p>
 */
@JsonSerialize(using = ServiceDefinitionV2Dot1LinkType.ServiceDefinitionV2Dot1LinkTypeSerializer.class)
public class ServiceDefinitionV2Dot1LinkType extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("doc", "repo", "runbook", "dashboard", "other"));

  public static final ServiceDefinitionV2Dot1LinkType DOC = new ServiceDefinitionV2Dot1LinkType("doc");
  public static final ServiceDefinitionV2Dot1LinkType REPO = new ServiceDefinitionV2Dot1LinkType("repo");
  public static final ServiceDefinitionV2Dot1LinkType RUNBOOK = new ServiceDefinitionV2Dot1LinkType("runbook");
  public static final ServiceDefinitionV2Dot1LinkType DASHBOARD = new ServiceDefinitionV2Dot1LinkType("dashboard");
  public static final ServiceDefinitionV2Dot1LinkType OTHER = new ServiceDefinitionV2Dot1LinkType("other");


  ServiceDefinitionV2Dot1LinkType(String value) {
    super(value, allowedValues);
  }

  public static class ServiceDefinitionV2Dot1LinkTypeSerializer extends StdSerializer<ServiceDefinitionV2Dot1LinkType> {
      public ServiceDefinitionV2Dot1LinkTypeSerializer(Class<ServiceDefinitionV2Dot1LinkType> t) {
          super(t);
      }

      public ServiceDefinitionV2Dot1LinkTypeSerializer() {
          this(null);
      }

      @Override
      public void serialize(ServiceDefinitionV2Dot1LinkType value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
          jgen.writeObject(value.value);
      }
  }

  @JsonCreator
  public static ServiceDefinitionV2Dot1LinkType fromValue(String value) {
    return new ServiceDefinitionV2Dot1LinkType(value);
  }
}
