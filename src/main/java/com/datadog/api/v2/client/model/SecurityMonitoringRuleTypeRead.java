/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.v2.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/** The rule type. */
@JsonSerialize(
    using = SecurityMonitoringRuleTypeRead.SecurityMonitoringRuleTypeReadSerializer.class)
public class SecurityMonitoringRuleTypeRead {

  public static final SecurityMonitoringRuleTypeRead LOG_DETECTION =
      new SecurityMonitoringRuleTypeRead("log_detection");
  public static final SecurityMonitoringRuleTypeRead INFRASTRUCTURE_CONFIGURATION =
      new SecurityMonitoringRuleTypeRead("infrastructure_configuration");
  public static final SecurityMonitoringRuleTypeRead WORKLOAD_SECURITY =
      new SecurityMonitoringRuleTypeRead("workload_security");
  public static final SecurityMonitoringRuleTypeRead CLOUD_CONFIGURATION =
      new SecurityMonitoringRuleTypeRead("cloud_configuration");

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "log_detection",
              "infrastructure_configuration",
              "workload_security",
              "cloud_configuration"));

  private String value;

  public boolean isValid() {
    return allowedValues.contains(this.value);
  }

  SecurityMonitoringRuleTypeRead(String value) {
    this.value = value;
  }

  public static class SecurityMonitoringRuleTypeReadSerializer
      extends StdSerializer<SecurityMonitoringRuleTypeRead> {
    public SecurityMonitoringRuleTypeReadSerializer(Class<SecurityMonitoringRuleTypeRead> t) {
      super(t);
    }

    public SecurityMonitoringRuleTypeReadSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SecurityMonitoringRuleTypeRead value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonValue
  public String getValue() {
    return this.value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  /** Return true if this SecurityMonitoringRuleTypeRead object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return this.value.equals(((SecurityMonitoringRuleTypeRead) o).value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value);
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static SecurityMonitoringRuleTypeRead fromValue(String value) {
    return new SecurityMonitoringRuleTypeRead(value);
  }
}
