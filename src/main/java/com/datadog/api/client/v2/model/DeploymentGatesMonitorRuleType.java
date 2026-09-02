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

/** The type identifier for a monitor rule. */
@JsonSerialize(
    using = DeploymentGatesMonitorRuleType.DeploymentGatesMonitorRuleTypeSerializer.class)
public class DeploymentGatesMonitorRuleType extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("monitor"));

  public static final DeploymentGatesMonitorRuleType MONITOR =
      new DeploymentGatesMonitorRuleType("monitor");

  DeploymentGatesMonitorRuleType(String value) {
    super(value, allowedValues);
  }

  public static class DeploymentGatesMonitorRuleTypeSerializer
      extends StdSerializer<DeploymentGatesMonitorRuleType> {
    public DeploymentGatesMonitorRuleTypeSerializer(Class<DeploymentGatesMonitorRuleType> t) {
      super(t);
    }

    public DeploymentGatesMonitorRuleTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        DeploymentGatesMonitorRuleType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static DeploymentGatesMonitorRuleType fromValue(String value) {
    return new DeploymentGatesMonitorRuleType(value);
  }
}
