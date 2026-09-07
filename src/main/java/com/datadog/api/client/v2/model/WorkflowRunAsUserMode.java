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

/** The effective type of identity used to run the workflow. */
@JsonSerialize(using = WorkflowRunAsUserMode.WorkflowRunAsUserModeSerializer.class)
public class WorkflowRunAsUserMode extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("owner", "service_account", "initiator"));

  public static final WorkflowRunAsUserMode OWNER = new WorkflowRunAsUserMode("owner");
  public static final WorkflowRunAsUserMode SERVICE_ACCOUNT =
      new WorkflowRunAsUserMode("service_account");
  public static final WorkflowRunAsUserMode INITIATOR = new WorkflowRunAsUserMode("initiator");

  WorkflowRunAsUserMode(String value) {
    super(value, allowedValues);
  }

  public static class WorkflowRunAsUserModeSerializer extends StdSerializer<WorkflowRunAsUserMode> {
    public WorkflowRunAsUserModeSerializer(Class<WorkflowRunAsUserMode> t) {
      super(t);
    }

    public WorkflowRunAsUserModeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        WorkflowRunAsUserMode value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static WorkflowRunAsUserMode fromValue(String value) {
    return new WorkflowRunAsUserMode(value);
  }
}
