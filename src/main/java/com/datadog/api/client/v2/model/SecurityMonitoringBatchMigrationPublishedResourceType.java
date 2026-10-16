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

/** The type of resource for a published batch migration resource. */
@JsonSerialize(
    using =
        SecurityMonitoringBatchMigrationPublishedResourceType
            .SecurityMonitoringBatchMigrationPublishedResourceTypeSerializer.class)
public class SecurityMonitoringBatchMigrationPublishedResourceType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("batchMigrationPublishedResource"));

  public static final SecurityMonitoringBatchMigrationPublishedResourceType
      BATCH_MIGRATION_PUBLISHED_RESOURCE =
          new SecurityMonitoringBatchMigrationPublishedResourceType(
              "batchMigrationPublishedResource");

  SecurityMonitoringBatchMigrationPublishedResourceType(String value) {
    super(value, allowedValues);
  }

  public static class SecurityMonitoringBatchMigrationPublishedResourceTypeSerializer
      extends StdSerializer<SecurityMonitoringBatchMigrationPublishedResourceType> {
    public SecurityMonitoringBatchMigrationPublishedResourceTypeSerializer(
        Class<SecurityMonitoringBatchMigrationPublishedResourceType> t) {
      super(t);
    }

    public SecurityMonitoringBatchMigrationPublishedResourceTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SecurityMonitoringBatchMigrationPublishedResourceType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SecurityMonitoringBatchMigrationPublishedResourceType fromValue(String value) {
    return new SecurityMonitoringBatchMigrationPublishedResourceType(value);
  }
}
