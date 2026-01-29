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

/** JSON:API type for DORA deployment patch request. */
@JsonSerialize(
    using = DORADeploymentPatchRequestDataType.DORADeploymentPatchRequestDataTypeSerializer.class)
public class DORADeploymentPatchRequestDataType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("dora_deployment_patch_request"));

  public static final DORADeploymentPatchRequestDataType DORA_DEPLOYMENT_PATCH_REQUEST =
      new DORADeploymentPatchRequestDataType("dora_deployment_patch_request");

  DORADeploymentPatchRequestDataType(String value) {
    super(value, allowedValues);
  }

  public static class DORADeploymentPatchRequestDataTypeSerializer
      extends StdSerializer<DORADeploymentPatchRequestDataType> {
    public DORADeploymentPatchRequestDataTypeSerializer(
        Class<DORADeploymentPatchRequestDataType> t) {
      super(t);
    }

    public DORADeploymentPatchRequestDataTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        DORADeploymentPatchRequestDataType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static DORADeploymentPatchRequestDataType fromValue(String value) {
    return new DORADeploymentPatchRequestDataType(value);
  }
}
