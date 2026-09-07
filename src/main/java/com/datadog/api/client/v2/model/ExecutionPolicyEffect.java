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

/** Whether the policy allows or denies matching actions. */
@JsonSerialize(using = ExecutionPolicyEffect.ExecutionPolicyEffectSerializer.class)
public class ExecutionPolicyEffect extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("allow", "deny"));

  public static final ExecutionPolicyEffect ALLOW = new ExecutionPolicyEffect("allow");
  public static final ExecutionPolicyEffect DENY = new ExecutionPolicyEffect("deny");

  ExecutionPolicyEffect(String value) {
    super(value, allowedValues);
  }

  public static class ExecutionPolicyEffectSerializer extends StdSerializer<ExecutionPolicyEffect> {
    public ExecutionPolicyEffectSerializer(Class<ExecutionPolicyEffect> t) {
      super(t);
    }

    public ExecutionPolicyEffectSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ExecutionPolicyEffect value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ExecutionPolicyEffect fromValue(String value) {
    return new ExecutionPolicyEffect(value);
  }
}
