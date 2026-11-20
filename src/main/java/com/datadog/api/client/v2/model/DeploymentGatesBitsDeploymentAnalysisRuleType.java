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

/** The type identifier for a Bits Deployment Analysis rule. */
@JsonSerialize(
    using =
        DeploymentGatesBitsDeploymentAnalysisRuleType
            .DeploymentGatesBitsDeploymentAnalysisRuleTypeSerializer.class)
public class DeploymentGatesBitsDeploymentAnalysisRuleType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("bits_deployment_analysis"));

  public static final DeploymentGatesBitsDeploymentAnalysisRuleType BITS_DEPLOYMENT_ANALYSIS =
      new DeploymentGatesBitsDeploymentAnalysisRuleType("bits_deployment_analysis");

  DeploymentGatesBitsDeploymentAnalysisRuleType(String value) {
    super(value, allowedValues);
  }

  public static class DeploymentGatesBitsDeploymentAnalysisRuleTypeSerializer
      extends StdSerializer<DeploymentGatesBitsDeploymentAnalysisRuleType> {
    public DeploymentGatesBitsDeploymentAnalysisRuleTypeSerializer(
        Class<DeploymentGatesBitsDeploymentAnalysisRuleType> t) {
      super(t);
    }

    public DeploymentGatesBitsDeploymentAnalysisRuleTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        DeploymentGatesBitsDeploymentAnalysisRuleType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static DeploymentGatesBitsDeploymentAnalysisRuleType fromValue(String value) {
    return new DeploymentGatesBitsDeploymentAnalysisRuleType(value);
  }
}
