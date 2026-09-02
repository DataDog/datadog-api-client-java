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

/** Type for audit trail content pack details. */
@JsonSerialize(
    using =
        SecurityMonitoringContentPackAuditDetailsType
            .SecurityMonitoringContentPackAuditDetailsTypeSerializer.class)
public class SecurityMonitoringContentPackAuditDetailsType extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("audit"));

  public static final SecurityMonitoringContentPackAuditDetailsType AUDIT =
      new SecurityMonitoringContentPackAuditDetailsType("audit");

  SecurityMonitoringContentPackAuditDetailsType(String value) {
    super(value, allowedValues);
  }

  public static class SecurityMonitoringContentPackAuditDetailsTypeSerializer
      extends StdSerializer<SecurityMonitoringContentPackAuditDetailsType> {
    public SecurityMonitoringContentPackAuditDetailsTypeSerializer(
        Class<SecurityMonitoringContentPackAuditDetailsType> t) {
      super(t);
    }

    public SecurityMonitoringContentPackAuditDetailsTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SecurityMonitoringContentPackAuditDetailsType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SecurityMonitoringContentPackAuditDetailsType fromValue(String value) {
    return new SecurityMonitoringContentPackAuditDetailsType(value);
  }
}
