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

/** Deployment gate resource type. */
@JsonSerialize(using = DeploymentGateDataType.DeploymentGateDataTypeSerializer.class)
public class DeploymentGateDataType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("deployment_gate"));

  public static final DeploymentGateDataType DEPLOYMENT_GATE =
      new DeploymentGateDataType("deployment_gate");

  DeploymentGateDataType(String value) {
    super(value, allowedValues);
  }

  public static class DeploymentGateDataTypeSerializer
      extends StdSerializer<DeploymentGateDataType> {
    public DeploymentGateDataTypeSerializer(Class<DeploymentGateDataType> t) {
      super(t);
    }

    public DeploymentGateDataTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        DeploymentGateDataType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static DeploymentGateDataType fromValue(String value) {
    return new DeploymentGateDataType(value);
  }
}
