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

/** The level of remote shell access granted for the target paths. */
@JsonSerialize(
    using =
        ExecutionPolicyRemoteActionRshellAccess.ExecutionPolicyRemoteActionRshellAccessSerializer
            .class)
public class ExecutionPolicyRemoteActionRshellAccess extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("read_only", "read_write"));

  public static final ExecutionPolicyRemoteActionRshellAccess READ_ONLY =
      new ExecutionPolicyRemoteActionRshellAccess("read_only");
  public static final ExecutionPolicyRemoteActionRshellAccess READ_WRITE =
      new ExecutionPolicyRemoteActionRshellAccess("read_write");

  ExecutionPolicyRemoteActionRshellAccess(String value) {
    super(value, allowedValues);
  }

  public static class ExecutionPolicyRemoteActionRshellAccessSerializer
      extends StdSerializer<ExecutionPolicyRemoteActionRshellAccess> {
    public ExecutionPolicyRemoteActionRshellAccessSerializer(
        Class<ExecutionPolicyRemoteActionRshellAccess> t) {
      super(t);
    }

    public ExecutionPolicyRemoteActionRshellAccessSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ExecutionPolicyRemoteActionRshellAccess value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ExecutionPolicyRemoteActionRshellAccess fromValue(String value) {
    return new ExecutionPolicyRemoteActionRshellAccess(value);
  }
}
