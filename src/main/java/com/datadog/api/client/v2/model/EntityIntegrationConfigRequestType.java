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

/**
 * JSON:API resource type for the entity integration configuration create or update request. Always
 * <code>entity_integration_config_requests</code>.
 */
@JsonSerialize(
    using = EntityIntegrationConfigRequestType.EntityIntegrationConfigRequestTypeSerializer.class)
public class EntityIntegrationConfigRequestType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("entity_integration_config_requests"));

  public static final EntityIntegrationConfigRequestType ENTITY_INTEGRATION_CONFIG_REQUESTS =
      new EntityIntegrationConfigRequestType("entity_integration_config_requests");

  EntityIntegrationConfigRequestType(String value) {
    super(value, allowedValues);
  }

  public static class EntityIntegrationConfigRequestTypeSerializer
      extends StdSerializer<EntityIntegrationConfigRequestType> {
    public EntityIntegrationConfigRequestTypeSerializer(
        Class<EntityIntegrationConfigRequestType> t) {
      super(t);
    }

    public EntityIntegrationConfigRequestTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        EntityIntegrationConfigRequestType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static EntityIntegrationConfigRequestType fromValue(String value) {
    return new EntityIntegrationConfigRequestType(value);
  }
}
