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

/** The type of the column in a dataset definition. */
@JsonSerialize(
    using =
        SecurityMonitoringDatasetDefinitionColumnType
            .SecurityMonitoringDatasetDefinitionColumnTypeSerializer.class)
public class SecurityMonitoringDatasetDefinitionColumnType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("string", "integer", "double", "boolean"));

  public static final SecurityMonitoringDatasetDefinitionColumnType STRING =
      new SecurityMonitoringDatasetDefinitionColumnType("string");
  public static final SecurityMonitoringDatasetDefinitionColumnType INTEGER =
      new SecurityMonitoringDatasetDefinitionColumnType("integer");
  public static final SecurityMonitoringDatasetDefinitionColumnType DOUBLE =
      new SecurityMonitoringDatasetDefinitionColumnType("double");
  public static final SecurityMonitoringDatasetDefinitionColumnType BOOLEAN =
      new SecurityMonitoringDatasetDefinitionColumnType("boolean");

  SecurityMonitoringDatasetDefinitionColumnType(String value) {
    super(value, allowedValues);
  }

  public static class SecurityMonitoringDatasetDefinitionColumnTypeSerializer
      extends StdSerializer<SecurityMonitoringDatasetDefinitionColumnType> {
    public SecurityMonitoringDatasetDefinitionColumnTypeSerializer(
        Class<SecurityMonitoringDatasetDefinitionColumnType> t) {
      super(t);
    }

    public SecurityMonitoringDatasetDefinitionColumnTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SecurityMonitoringDatasetDefinitionColumnType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SecurityMonitoringDatasetDefinitionColumnType fromValue(String value) {
    return new SecurityMonitoringDatasetDefinitionColumnType(value);
  }
}
