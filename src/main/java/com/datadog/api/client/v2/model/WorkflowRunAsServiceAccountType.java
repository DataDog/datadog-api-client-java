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

/** The service account run-as type. */
@JsonSerialize(
    using = WorkflowRunAsServiceAccountType.WorkflowRunAsServiceAccountTypeSerializer.class)
public class WorkflowRunAsServiceAccountType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("service_account"));

  public static final WorkflowRunAsServiceAccountType SERVICE_ACCOUNT =
      new WorkflowRunAsServiceAccountType("service_account");

  WorkflowRunAsServiceAccountType(String value) {
    super(value, allowedValues);
  }

  public static class WorkflowRunAsServiceAccountTypeSerializer
      extends StdSerializer<WorkflowRunAsServiceAccountType> {
    public WorkflowRunAsServiceAccountTypeSerializer(Class<WorkflowRunAsServiceAccountType> t) {
      super(t);
    }

    public WorkflowRunAsServiceAccountTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        WorkflowRunAsServiceAccountType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static WorkflowRunAsServiceAccountType fromValue(String value) {
    return new WorkflowRunAsServiceAccountType(value);
  }
}
