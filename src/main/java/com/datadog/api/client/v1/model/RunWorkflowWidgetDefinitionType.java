/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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

/** Type of the run workflow widget. */
@JsonSerialize(
    using = RunWorkflowWidgetDefinitionType.RunWorkflowWidgetDefinitionTypeSerializer.class)
public class RunWorkflowWidgetDefinitionType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("run_workflow"));

  public static final RunWorkflowWidgetDefinitionType RUN_WORKFLOW =
      new RunWorkflowWidgetDefinitionType("run_workflow");

  RunWorkflowWidgetDefinitionType(String value) {
    super(value, allowedValues);
  }

  public static class RunWorkflowWidgetDefinitionTypeSerializer
      extends StdSerializer<RunWorkflowWidgetDefinitionType> {
    public RunWorkflowWidgetDefinitionTypeSerializer(Class<RunWorkflowWidgetDefinitionType> t) {
      super(t);
    }

    public RunWorkflowWidgetDefinitionTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        RunWorkflowWidgetDefinitionType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static RunWorkflowWidgetDefinitionType fromValue(String value) {
    return new RunWorkflowWidgetDefinitionType(value);
  }
}
