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

/** The type of the resource. */
@JsonSerialize(
    using =
        SecurityMonitoringRuleBulkExportDataType.SecurityMonitoringRuleBulkExportDataTypeSerializer
            .class)
public class SecurityMonitoringRuleBulkExportDataType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("security_monitoring_rules_bulk_export"));

  public static final SecurityMonitoringRuleBulkExportDataType
      SECURITY_MONITORING_RULES_BULK_EXPORT =
          new SecurityMonitoringRuleBulkExportDataType("security_monitoring_rules_bulk_export");

  SecurityMonitoringRuleBulkExportDataType(String value) {
    super(value, allowedValues);
  }

  public static class SecurityMonitoringRuleBulkExportDataTypeSerializer
      extends StdSerializer<SecurityMonitoringRuleBulkExportDataType> {
    public SecurityMonitoringRuleBulkExportDataTypeSerializer(
        Class<SecurityMonitoringRuleBulkExportDataType> t) {
      super(t);
    }

    public SecurityMonitoringRuleBulkExportDataTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SecurityMonitoringRuleBulkExportDataType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SecurityMonitoringRuleBulkExportDataType fromValue(String value) {
    return new SecurityMonitoringRuleBulkExportDataType(value);
  }
}
