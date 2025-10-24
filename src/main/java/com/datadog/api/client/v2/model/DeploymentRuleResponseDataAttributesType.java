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

/** The type of the deployment rule. */
@JsonSerialize(
    using =
        DeploymentRuleResponseDataAttributesType.DeploymentRuleResponseDataAttributesTypeSerializer
            .class)
public class DeploymentRuleResponseDataAttributesType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("faulty_deployment_detection", "monitor"));

  public static final DeploymentRuleResponseDataAttributesType FAULTY_DEPLOYMENT_DETECTION =
      new DeploymentRuleResponseDataAttributesType("faulty_deployment_detection");
  public static final DeploymentRuleResponseDataAttributesType MONITOR =
      new DeploymentRuleResponseDataAttributesType("monitor");

  DeploymentRuleResponseDataAttributesType(String value) {
    super(value, allowedValues);
  }

  public static class DeploymentRuleResponseDataAttributesTypeSerializer
      extends StdSerializer<DeploymentRuleResponseDataAttributesType> {
    public DeploymentRuleResponseDataAttributesTypeSerializer(
        Class<DeploymentRuleResponseDataAttributesType> t) {
      super(t);
    }

    public DeploymentRuleResponseDataAttributesTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        DeploymentRuleResponseDataAttributesType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static DeploymentRuleResponseDataAttributesType fromValue(String value) {
    return new DeploymentRuleResponseDataAttributesType(value);
  }
}
