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
 * The origin of a batch migration. Always <code>batch_migration</code> for batch migrations created
 * through this API.
 */
@JsonSerialize(
    using =
        SecurityMonitoringBatchMigrationInputSource
            .SecurityMonitoringBatchMigrationInputSourceSerializer.class)
public class SecurityMonitoringBatchMigrationInputSource extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("batch_migration", "threat_hunting", "user"));

  public static final SecurityMonitoringBatchMigrationInputSource BATCH_MIGRATION =
      new SecurityMonitoringBatchMigrationInputSource("batch_migration");
  public static final SecurityMonitoringBatchMigrationInputSource THREAT_HUNTING =
      new SecurityMonitoringBatchMigrationInputSource("threat_hunting");
  public static final SecurityMonitoringBatchMigrationInputSource USER =
      new SecurityMonitoringBatchMigrationInputSource("user");

  SecurityMonitoringBatchMigrationInputSource(String value) {
    super(value, allowedValues);
  }

  public static class SecurityMonitoringBatchMigrationInputSourceSerializer
      extends StdSerializer<SecurityMonitoringBatchMigrationInputSource> {
    public SecurityMonitoringBatchMigrationInputSourceSerializer(
        Class<SecurityMonitoringBatchMigrationInputSource> t) {
      super(t);
    }

    public SecurityMonitoringBatchMigrationInputSourceSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SecurityMonitoringBatchMigrationInputSource value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SecurityMonitoringBatchMigrationInputSource fromValue(String value) {
    return new SecurityMonitoringBatchMigrationInputSource(value);
  }
}
