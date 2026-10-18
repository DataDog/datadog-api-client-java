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
 * The status of a batch migration. A batch migration is created as <code>draft</code> and moves to
 * <code>in_progress</code> when started. It moves to <code>completed</code> once no resource is
 * <code>pending</code> or <code>in_progress</code>, or to <code>canceled</code> when canceled.
 */
@JsonSerialize(
    using =
        SecurityMonitoringBatchMigrationStatus.SecurityMonitoringBatchMigrationStatusSerializer
            .class)
public class SecurityMonitoringBatchMigrationStatus extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("draft", "in_progress", "canceled", "completed"));

  public static final SecurityMonitoringBatchMigrationStatus DRAFT =
      new SecurityMonitoringBatchMigrationStatus("draft");
  public static final SecurityMonitoringBatchMigrationStatus IN_PROGRESS =
      new SecurityMonitoringBatchMigrationStatus("in_progress");
  public static final SecurityMonitoringBatchMigrationStatus CANCELED =
      new SecurityMonitoringBatchMigrationStatus("canceled");
  public static final SecurityMonitoringBatchMigrationStatus COMPLETED =
      new SecurityMonitoringBatchMigrationStatus("completed");

  SecurityMonitoringBatchMigrationStatus(String value) {
    super(value, allowedValues);
  }

  public static class SecurityMonitoringBatchMigrationStatusSerializer
      extends StdSerializer<SecurityMonitoringBatchMigrationStatus> {
    public SecurityMonitoringBatchMigrationStatusSerializer(
        Class<SecurityMonitoringBatchMigrationStatus> t) {
      super(t);
    }

    public SecurityMonitoringBatchMigrationStatusSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SecurityMonitoringBatchMigrationStatus value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SecurityMonitoringBatchMigrationStatus fromValue(String value) {
    return new SecurityMonitoringBatchMigrationStatus(value);
  }
}
