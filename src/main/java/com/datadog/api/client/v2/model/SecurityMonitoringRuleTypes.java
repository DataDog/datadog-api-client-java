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

/** Security monitoring rule types. */
@JsonSerialize(using = SecurityMonitoringRuleTypes.SecurityMonitoringRuleTypesSerializer.class)
public class SecurityMonitoringRuleTypes extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "application_security",
              "log_detection",
              "cloud_configuration",
              "infrastructure_configuration",
              "workload_security",
              "signal_correlation",
              "vulnerability_management"));

  public static final SecurityMonitoringRuleTypes APPLICATION_SECURITY =
      new SecurityMonitoringRuleTypes("application_security");
  public static final SecurityMonitoringRuleTypes LOG_DETECTION =
      new SecurityMonitoringRuleTypes("log_detection");
  public static final SecurityMonitoringRuleTypes CLOUD_CONFIGURATION =
      new SecurityMonitoringRuleTypes("cloud_configuration");
  public static final SecurityMonitoringRuleTypes INFRASTRUCTURE_CONFIGURATION =
      new SecurityMonitoringRuleTypes("infrastructure_configuration");
  public static final SecurityMonitoringRuleTypes WORKLOAD_SECURITY =
      new SecurityMonitoringRuleTypes("workload_security");
  public static final SecurityMonitoringRuleTypes SIGNAL_CORRELATION =
      new SecurityMonitoringRuleTypes("signal_correlation");
  public static final SecurityMonitoringRuleTypes VULNERABILITY_MANAGEMENT =
      new SecurityMonitoringRuleTypes("vulnerability_management");

  SecurityMonitoringRuleTypes(String value) {
    super(value, allowedValues);
  }

  public static class SecurityMonitoringRuleTypesSerializer
      extends StdSerializer<SecurityMonitoringRuleTypes> {
    public SecurityMonitoringRuleTypesSerializer(Class<SecurityMonitoringRuleTypes> t) {
      super(t);
    }

    public SecurityMonitoringRuleTypesSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SecurityMonitoringRuleTypes value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SecurityMonitoringRuleTypes fromValue(String value) {
    return new SecurityMonitoringRuleTypes(value);
  }
}
