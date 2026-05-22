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
 * JSON:API resource type for an entity integration configuration. Always <code>
 * entity_integration_configs</code>.
 */
@JsonSerialize(using = EntityIntegrationConfigType.EntityIntegrationConfigTypeSerializer.class)
public class EntityIntegrationConfigType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("entity_integration_configs"));

  public static final EntityIntegrationConfigType ENTITY_INTEGRATION_CONFIGS =
      new EntityIntegrationConfigType("entity_integration_configs");

  EntityIntegrationConfigType(String value) {
    super(value, allowedValues);
  }

  public static class EntityIntegrationConfigTypeSerializer
      extends StdSerializer<EntityIntegrationConfigType> {
    public EntityIntegrationConfigTypeSerializer(Class<EntityIntegrationConfigType> t) {
      super(t);
    }

    public EntityIntegrationConfigTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        EntityIntegrationConfigType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static EntityIntegrationConfigType fromValue(String value) {
    return new EntityIntegrationConfigType(value);
  }
}
