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

/**
 * The overall status of the gate evaluation. - <code>in_progress</code>: The evaluation is still
 * running. - <code>pass</code>: All rules passed successfully and the deployment is allowed to
 * proceed. - <code>fail</code>: One or more rules did not pass; the deployment should not proceed.
 */
@JsonSerialize(
    using =
        DeploymentGatesEvaluationResultResponseAttributesGateStatus
            .DeploymentGatesEvaluationResultResponseAttributesGateStatusSerializer.class)
public class DeploymentGatesEvaluationResultResponseAttributesGateStatus extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("in_progress", "pass", "fail"));

  public static final DeploymentGatesEvaluationResultResponseAttributesGateStatus IN_PROGRESS =
      new DeploymentGatesEvaluationResultResponseAttributesGateStatus("in_progress");
  public static final DeploymentGatesEvaluationResultResponseAttributesGateStatus PASS =
      new DeploymentGatesEvaluationResultResponseAttributesGateStatus("pass");
  public static final DeploymentGatesEvaluationResultResponseAttributesGateStatus FAIL =
      new DeploymentGatesEvaluationResultResponseAttributesGateStatus("fail");

  DeploymentGatesEvaluationResultResponseAttributesGateStatus(String value) {
    super(value, allowedValues);
  }

  public static class DeploymentGatesEvaluationResultResponseAttributesGateStatusSerializer
      extends StdSerializer<DeploymentGatesEvaluationResultResponseAttributesGateStatus> {
    public DeploymentGatesEvaluationResultResponseAttributesGateStatusSerializer(
        Class<DeploymentGatesEvaluationResultResponseAttributesGateStatus> t) {
      super(t);
    }

    public DeploymentGatesEvaluationResultResponseAttributesGateStatusSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        DeploymentGatesEvaluationResultResponseAttributesGateStatus value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static DeploymentGatesEvaluationResultResponseAttributesGateStatus fromValue(
      String value) {
    return new DeploymentGatesEvaluationResultResponseAttributesGateStatus(value);
  }
}
