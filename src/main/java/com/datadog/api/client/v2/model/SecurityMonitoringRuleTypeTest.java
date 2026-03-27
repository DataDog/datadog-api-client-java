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
    using = SecurityMonitoringRuleTypeTest.SecurityMonitoringRuleTypeTestSerializer.class)
public class SecurityMonitoringRuleTypeTest extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("log_detection"));

  public static final SecurityMonitoringRuleTypeTest LOG_DETECTION =
      new SecurityMonitoringRuleTypeTest("log_detection");

  SecurityMonitoringRuleTypeTest(String value) {
    super(value, allowedValues);
  }

  public static class SecurityMonitoringRuleTypeTestSerializer
      extends StdSerializer<SecurityMonitoringRuleTypeTest> {
    public SecurityMonitoringRuleTypeTestSerializer(Class<SecurityMonitoringRuleTypeTest> t) {
      super(t);
    }

    public SecurityMonitoringRuleTypeTestSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SecurityMonitoringRuleTypeTest value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SecurityMonitoringRuleTypeTest fromValue(String value) {
    return new SecurityMonitoringRuleTypeTest(value);
  }
}
