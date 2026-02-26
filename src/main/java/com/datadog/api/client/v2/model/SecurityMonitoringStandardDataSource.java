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

/** Source of events, either logs, audit trail, or Datadog events. */
@JsonSerialize(
    using =
        SecurityMonitoringStandardDataSource.SecurityMonitoringStandardDataSourceSerializer.class)
public class SecurityMonitoringStandardDataSource extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "logs", "audit", "app_sec_spans", "spans", "security_runtime", "network", "events"));

  public static final SecurityMonitoringStandardDataSource LOGS =
      new SecurityMonitoringStandardDataSource("logs");
  public static final SecurityMonitoringStandardDataSource AUDIT =
      new SecurityMonitoringStandardDataSource("audit");
  public static final SecurityMonitoringStandardDataSource APP_SEC_SPANS =
      new SecurityMonitoringStandardDataSource("app_sec_spans");
  public static final SecurityMonitoringStandardDataSource SPANS =
      new SecurityMonitoringStandardDataSource("spans");
  public static final SecurityMonitoringStandardDataSource SECURITY_RUNTIME =
      new SecurityMonitoringStandardDataSource("security_runtime");
  public static final SecurityMonitoringStandardDataSource NETWORK =
      new SecurityMonitoringStandardDataSource("network");
  public static final SecurityMonitoringStandardDataSource EVENTS =
      new SecurityMonitoringStandardDataSource("events");

  SecurityMonitoringStandardDataSource(String value) {
    super(value, allowedValues);
  }

  public static class SecurityMonitoringStandardDataSourceSerializer
      extends StdSerializer<SecurityMonitoringStandardDataSource> {
    public SecurityMonitoringStandardDataSourceSerializer(
        Class<SecurityMonitoringStandardDataSource> t) {
      super(t);
    }

    public SecurityMonitoringStandardDataSourceSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SecurityMonitoringStandardDataSource value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SecurityMonitoringStandardDataSource fromValue(String value) {
    return new SecurityMonitoringStandardDataSource(value);
  }
}
