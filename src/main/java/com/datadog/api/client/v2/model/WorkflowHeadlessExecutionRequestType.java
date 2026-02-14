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

/** The type for workflow headless execution request */
@JsonSerialize(
    using =
        WorkflowHeadlessExecutionRequestType.WorkflowHeadlessExecutionRequestTypeSerializer.class)
public class WorkflowHeadlessExecutionRequestType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("workflow_headless_execution_request"));

  public static final WorkflowHeadlessExecutionRequestType WORKFLOW_HEADLESS_EXECUTION_REQUEST =
      new WorkflowHeadlessExecutionRequestType("workflow_headless_execution_request");

  WorkflowHeadlessExecutionRequestType(String value) {
    super(value, allowedValues);
  }

  public static class WorkflowHeadlessExecutionRequestTypeSerializer
      extends StdSerializer<WorkflowHeadlessExecutionRequestType> {
    public WorkflowHeadlessExecutionRequestTypeSerializer(
        Class<WorkflowHeadlessExecutionRequestType> t) {
      super(t);
    }

    public WorkflowHeadlessExecutionRequestTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        WorkflowHeadlessExecutionRequestType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static WorkflowHeadlessExecutionRequestType fromValue(String value) {
    return new WorkflowHeadlessExecutionRequestType(value);
  }
}
