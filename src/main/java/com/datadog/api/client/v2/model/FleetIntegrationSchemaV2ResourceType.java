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

/** The type of the integration schema resource. */
@JsonSerialize(
    using =
        FleetIntegrationSchemaV2ResourceType.FleetIntegrationSchemaV2ResourceTypeSerializer.class)
public class FleetIntegrationSchemaV2ResourceType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("integration_schema"));

  public static final FleetIntegrationSchemaV2ResourceType INTEGRATION_SCHEMA =
      new FleetIntegrationSchemaV2ResourceType("integration_schema");

  FleetIntegrationSchemaV2ResourceType(String value) {
    super(value, allowedValues);
  }

  public static class FleetIntegrationSchemaV2ResourceTypeSerializer
      extends StdSerializer<FleetIntegrationSchemaV2ResourceType> {
    public FleetIntegrationSchemaV2ResourceTypeSerializer(
        Class<FleetIntegrationSchemaV2ResourceType> t) {
      super(t);
    }

    public FleetIntegrationSchemaV2ResourceTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        FleetIntegrationSchemaV2ResourceType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static FleetIntegrationSchemaV2ResourceType fromValue(String value) {
    return new FleetIntegrationSchemaV2ResourceType(value);
  }
}
