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

/** Type of deployment gate rule. */
@JsonSerialize(
    using = DeploymentGateRuleEvaluationType.DeploymentGateRuleEvaluationTypeSerializer.class)
public class DeploymentGateRuleEvaluationType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("monitor", "faulty_deployment_detection"));

  public static final DeploymentGateRuleEvaluationType MONITOR =
      new DeploymentGateRuleEvaluationType("monitor");
  public static final DeploymentGateRuleEvaluationType FAULTY_DEPLOYMENT_DETECTION =
      new DeploymentGateRuleEvaluationType("faulty_deployment_detection");

  DeploymentGateRuleEvaluationType(String value) {
    super(value, allowedValues);
  }

  public static class DeploymentGateRuleEvaluationTypeSerializer
      extends StdSerializer<DeploymentGateRuleEvaluationType> {
    public DeploymentGateRuleEvaluationTypeSerializer(Class<DeploymentGateRuleEvaluationType> t) {
      super(t);
    }

    public DeploymentGateRuleEvaluationTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        DeploymentGateRuleEvaluationType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static DeploymentGateRuleEvaluationType fromValue(String value) {
    return new DeploymentGateRuleEvaluationType(value);
  }
}
