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

/** The type identifier for a faulty deployment detection rule. */
@JsonSerialize(using = DeploymentGatesFDDRuleType.DeploymentGatesFDDRuleTypeSerializer.class)
public class DeploymentGatesFDDRuleType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("faulty_deployment_detection"));

  public static final DeploymentGatesFDDRuleType FAULTY_DEPLOYMENT_DETECTION =
      new DeploymentGatesFDDRuleType("faulty_deployment_detection");

  DeploymentGatesFDDRuleType(String value) {
    super(value, allowedValues);
  }

  public static class DeploymentGatesFDDRuleTypeSerializer
      extends StdSerializer<DeploymentGatesFDDRuleType> {
    public DeploymentGatesFDDRuleTypeSerializer(Class<DeploymentGatesFDDRuleType> t) {
      super(t);
    }

    public DeploymentGatesFDDRuleTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        DeploymentGatesFDDRuleType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static DeploymentGatesFDDRuleType fromValue(String value) {
    return new DeploymentGatesFDDRuleType(value);
  }
}
