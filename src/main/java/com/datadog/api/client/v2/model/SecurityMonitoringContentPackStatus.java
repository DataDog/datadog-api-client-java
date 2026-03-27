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

/** The current status of a content pack */
@JsonSerialize(
    using = SecurityMonitoringContentPackStatus.SecurityMonitoringContentPackStatusSerializer.class)
public class SecurityMonitoringContentPackStatus extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList("install", "activate", "initializing", "active", "warning", "broken"));

  public static final SecurityMonitoringContentPackStatus INSTALL =
      new SecurityMonitoringContentPackStatus("install");
  public static final SecurityMonitoringContentPackStatus ACTIVATE =
      new SecurityMonitoringContentPackStatus("activate");
  public static final SecurityMonitoringContentPackStatus INITIALIZING =
      new SecurityMonitoringContentPackStatus("initializing");
  public static final SecurityMonitoringContentPackStatus ACTIVE =
      new SecurityMonitoringContentPackStatus("active");
  public static final SecurityMonitoringContentPackStatus WARNING =
      new SecurityMonitoringContentPackStatus("warning");
  public static final SecurityMonitoringContentPackStatus BROKEN =
      new SecurityMonitoringContentPackStatus("broken");

  SecurityMonitoringContentPackStatus(String value) {
    super(value, allowedValues);
  }

  public static class SecurityMonitoringContentPackStatusSerializer
      extends StdSerializer<SecurityMonitoringContentPackStatus> {
    public SecurityMonitoringContentPackStatusSerializer(
        Class<SecurityMonitoringContentPackStatus> t) {
      super(t);
    }

    public SecurityMonitoringContentPackStatusSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SecurityMonitoringContentPackStatus value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SecurityMonitoringContentPackStatus fromValue(String value) {
    return new SecurityMonitoringContentPackStatus(value);
  }
}
