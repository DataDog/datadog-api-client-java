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

/** The type of the response. */
@JsonSerialize(
    using =
        SecurityMonitoringDatasetDependenciesType
            .SecurityMonitoringDatasetDependenciesTypeSerializer.class)
public class SecurityMonitoringDatasetDependenciesType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("security_monitoring_dataset_dependencies"));

  public static final SecurityMonitoringDatasetDependenciesType
      SECURITY_MONITORING_DATASET_DEPENDENCIES =
          new SecurityMonitoringDatasetDependenciesType("security_monitoring_dataset_dependencies");

  SecurityMonitoringDatasetDependenciesType(String value) {
    super(value, allowedValues);
  }

  public static class SecurityMonitoringDatasetDependenciesTypeSerializer
      extends StdSerializer<SecurityMonitoringDatasetDependenciesType> {
    public SecurityMonitoringDatasetDependenciesTypeSerializer(
        Class<SecurityMonitoringDatasetDependenciesType> t) {
      super(t);
    }

    public SecurityMonitoringDatasetDependenciesTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SecurityMonitoringDatasetDependenciesType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SecurityMonitoringDatasetDependenciesType fromValue(String value) {
    return new SecurityMonitoringDatasetDependenciesType(value);
  }
}
