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

/** The type of resource for a dataset version history response. */
@JsonSerialize(
    using =
        SecurityMonitoringDatasetVersionHistoryType
            .SecurityMonitoringDatasetVersionHistoryTypeSerializer.class)
public class SecurityMonitoringDatasetVersionHistoryType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("dataset_version_history"));

  public static final SecurityMonitoringDatasetVersionHistoryType DATASET_VERSION_HISTORY =
      new SecurityMonitoringDatasetVersionHistoryType("dataset_version_history");

  SecurityMonitoringDatasetVersionHistoryType(String value) {
    super(value, allowedValues);
  }

  public static class SecurityMonitoringDatasetVersionHistoryTypeSerializer
      extends StdSerializer<SecurityMonitoringDatasetVersionHistoryType> {
    public SecurityMonitoringDatasetVersionHistoryTypeSerializer(
        Class<SecurityMonitoringDatasetVersionHistoryType> t) {
      super(t);
    }

    public SecurityMonitoringDatasetVersionHistoryTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SecurityMonitoringDatasetVersionHistoryType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SecurityMonitoringDatasetVersionHistoryType fromValue(String value) {
    return new SecurityMonitoringDatasetVersionHistoryType(value);
  }
}
