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

/** The type of the configuration file schema resource. */
@JsonSerialize(
    using = FleetConfigFileSchemaV2ResourceType.FleetConfigFileSchemaV2ResourceTypeSerializer.class)
public class FleetConfigFileSchemaV2ResourceType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("config_file_schema"));

  public static final FleetConfigFileSchemaV2ResourceType CONFIG_FILE_SCHEMA =
      new FleetConfigFileSchemaV2ResourceType("config_file_schema");

  FleetConfigFileSchemaV2ResourceType(String value) {
    super(value, allowedValues);
  }

  public static class FleetConfigFileSchemaV2ResourceTypeSerializer
      extends StdSerializer<FleetConfigFileSchemaV2ResourceType> {
    public FleetConfigFileSchemaV2ResourceTypeSerializer(
        Class<FleetConfigFileSchemaV2ResourceType> t) {
      super(t);
    }

    public FleetConfigFileSchemaV2ResourceTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        FleetConfigFileSchemaV2ResourceType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static FleetConfigFileSchemaV2ResourceType fromValue(String value) {
    return new FleetConfigFileSchemaV2ResourceType(value);
  }
}
