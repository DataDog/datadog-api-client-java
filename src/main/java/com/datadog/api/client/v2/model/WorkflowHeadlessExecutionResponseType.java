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

/** The type for workflow headless execution response */
@JsonSerialize(
    using =
        WorkflowHeadlessExecutionResponseType.WorkflowHeadlessExecutionResponseTypeSerializer.class)
public class WorkflowHeadlessExecutionResponseType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("workflow_headless_execution"));

  public static final WorkflowHeadlessExecutionResponseType WORKFLOW_HEADLESS_EXECUTION =
      new WorkflowHeadlessExecutionResponseType("workflow_headless_execution");

  WorkflowHeadlessExecutionResponseType(String value) {
    super(value, allowedValues);
  }

  public static class WorkflowHeadlessExecutionResponseTypeSerializer
      extends StdSerializer<WorkflowHeadlessExecutionResponseType> {
    public WorkflowHeadlessExecutionResponseTypeSerializer(
        Class<WorkflowHeadlessExecutionResponseType> t) {
      super(t);
    }

    public WorkflowHeadlessExecutionResponseTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        WorkflowHeadlessExecutionResponseType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static WorkflowHeadlessExecutionResponseType fromValue(String value) {
    return new WorkflowHeadlessExecutionResponseType(value);
  }
}
