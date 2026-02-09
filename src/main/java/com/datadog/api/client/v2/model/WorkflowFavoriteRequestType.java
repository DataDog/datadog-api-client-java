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

/** The type for workflow favorite request */
@JsonSerialize(using = WorkflowFavoriteRequestType.WorkflowFavoriteRequestTypeSerializer.class)
public class WorkflowFavoriteRequestType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("workflow_favorite_request"));

  public static final WorkflowFavoriteRequestType WORKFLOW_FAVORITE_REQUEST =
      new WorkflowFavoriteRequestType("workflow_favorite_request");

  WorkflowFavoriteRequestType(String value) {
    super(value, allowedValues);
  }

  public static class WorkflowFavoriteRequestTypeSerializer
      extends StdSerializer<WorkflowFavoriteRequestType> {
    public WorkflowFavoriteRequestTypeSerializer(Class<WorkflowFavoriteRequestType> t) {
      super(t);
    }

    public WorkflowFavoriteRequestTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        WorkflowFavoriteRequestType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static WorkflowFavoriteRequestType fromValue(String value) {
    return new WorkflowFavoriteRequestType(value);
  }
}
