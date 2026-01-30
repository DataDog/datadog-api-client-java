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

/** The rule type. */
@JsonSerialize(
    using = SecurityMonitoringRuleTypeCreate.SecurityMonitoringRuleTypeCreateSerializer.class)
public class SecurityMonitoringRuleTypeCreate extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "api_security",
              "application_security",
              "log_detection",
              "workload_activity",
              "workload_security"));

  public static final SecurityMonitoringRuleTypeCreate API_SECURITY =
      new SecurityMonitoringRuleTypeCreate("api_security");
  public static final SecurityMonitoringRuleTypeCreate APPLICATION_SECURITY =
      new SecurityMonitoringRuleTypeCreate("application_security");
  public static final SecurityMonitoringRuleTypeCreate LOG_DETECTION =
      new SecurityMonitoringRuleTypeCreate("log_detection");
  public static final SecurityMonitoringRuleTypeCreate WORKLOAD_ACTIVITY =
      new SecurityMonitoringRuleTypeCreate("workload_activity");
  public static final SecurityMonitoringRuleTypeCreate WORKLOAD_SECURITY =
      new SecurityMonitoringRuleTypeCreate("workload_security");

  SecurityMonitoringRuleTypeCreate(String value) {
    super(value, allowedValues);
  }

  public static class SecurityMonitoringRuleTypeCreateSerializer
      extends StdSerializer<SecurityMonitoringRuleTypeCreate> {
    public SecurityMonitoringRuleTypeCreateSerializer(Class<SecurityMonitoringRuleTypeCreate> t) {
      super(t);
    }

    public SecurityMonitoringRuleTypeCreateSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SecurityMonitoringRuleTypeCreate value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SecurityMonitoringRuleTypeCreate fromValue(String value) {
    return new SecurityMonitoringRuleTypeCreate(value);
  }
}
