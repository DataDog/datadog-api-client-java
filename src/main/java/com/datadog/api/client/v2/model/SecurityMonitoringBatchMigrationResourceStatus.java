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
 * The status of a batch migration resource. <code>completed</code> resources have a translation in
 * <code>output</code> that is ready to be published. <code>duplicate</code> is reserved for future
 * duplicate rule detection.
 */
@JsonSerialize(
    using =
        SecurityMonitoringBatchMigrationResourceStatus
            .SecurityMonitoringBatchMigrationResourceStatusSerializer.class)
public class SecurityMonitoringBatchMigrationResourceStatus extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "pending",
              "in_progress",
              "completed",
              "canceled",
              "failed",
              "publishing",
              "published",
              "duplicate"));

  public static final SecurityMonitoringBatchMigrationResourceStatus PENDING =
      new SecurityMonitoringBatchMigrationResourceStatus("pending");
  public static final SecurityMonitoringBatchMigrationResourceStatus IN_PROGRESS =
      new SecurityMonitoringBatchMigrationResourceStatus("in_progress");
  public static final SecurityMonitoringBatchMigrationResourceStatus COMPLETED =
      new SecurityMonitoringBatchMigrationResourceStatus("completed");
  public static final SecurityMonitoringBatchMigrationResourceStatus CANCELED =
      new SecurityMonitoringBatchMigrationResourceStatus("canceled");
  public static final SecurityMonitoringBatchMigrationResourceStatus FAILED =
      new SecurityMonitoringBatchMigrationResourceStatus("failed");
  public static final SecurityMonitoringBatchMigrationResourceStatus PUBLISHING =
      new SecurityMonitoringBatchMigrationResourceStatus("publishing");
  public static final SecurityMonitoringBatchMigrationResourceStatus PUBLISHED =
      new SecurityMonitoringBatchMigrationResourceStatus("published");
  public static final SecurityMonitoringBatchMigrationResourceStatus DUPLICATE =
      new SecurityMonitoringBatchMigrationResourceStatus("duplicate");

  SecurityMonitoringBatchMigrationResourceStatus(String value) {
    super(value, allowedValues);
  }

  public static class SecurityMonitoringBatchMigrationResourceStatusSerializer
      extends StdSerializer<SecurityMonitoringBatchMigrationResourceStatus> {
    public SecurityMonitoringBatchMigrationResourceStatusSerializer(
        Class<SecurityMonitoringBatchMigrationResourceStatus> t) {
      super(t);
    }

    public SecurityMonitoringBatchMigrationResourceStatusSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SecurityMonitoringBatchMigrationResourceStatus value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SecurityMonitoringBatchMigrationResourceStatus fromValue(String value) {
    return new SecurityMonitoringBatchMigrationResourceStatus(value);
  }
}
