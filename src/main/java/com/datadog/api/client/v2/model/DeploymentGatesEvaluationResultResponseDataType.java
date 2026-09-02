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

/** JSON:API type for a deployment gate evaluation result response. */
@JsonSerialize(
    using =
        DeploymentGatesEvaluationResultResponseDataType
            .DeploymentGatesEvaluationResultResponseDataTypeSerializer.class)
public class DeploymentGatesEvaluationResultResponseDataType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("deployment_gates_evaluation_result_response"));

  public static final DeploymentGatesEvaluationResultResponseDataType
      DEPLOYMENT_GATES_EVALUATION_RESULT_RESPONSE =
          new DeploymentGatesEvaluationResultResponseDataType(
              "deployment_gates_evaluation_result_response");

  DeploymentGatesEvaluationResultResponseDataType(String value) {
    super(value, allowedValues);
  }

  public static class DeploymentGatesEvaluationResultResponseDataTypeSerializer
      extends StdSerializer<DeploymentGatesEvaluationResultResponseDataType> {
    public DeploymentGatesEvaluationResultResponseDataTypeSerializer(
        Class<DeploymentGatesEvaluationResultResponseDataType> t) {
      super(t);
    }

    public DeploymentGatesEvaluationResultResponseDataTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        DeploymentGatesEvaluationResultResponseDataType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static DeploymentGatesEvaluationResultResponseDataType fromValue(String value) {
    return new DeploymentGatesEvaluationResultResponseDataType(value);
  }
}
