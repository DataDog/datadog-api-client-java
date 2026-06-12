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

/** The role of the message author in the conversation. */
@JsonSerialize(using = AIGuardMessageRole.AIGuardMessageRoleSerializer.class)
public class AIGuardMessageRole extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("user", "assistant", "system", "tool", "developer"));

  public static final AIGuardMessageRole USER = new AIGuardMessageRole("user");
  public static final AIGuardMessageRole ASSISTANT = new AIGuardMessageRole("assistant");
  public static final AIGuardMessageRole SYSTEM = new AIGuardMessageRole("system");
  public static final AIGuardMessageRole TOOL = new AIGuardMessageRole("tool");
  public static final AIGuardMessageRole DEVELOPER = new AIGuardMessageRole("developer");

  AIGuardMessageRole(String value) {
    super(value, allowedValues);
  }

  public static class AIGuardMessageRoleSerializer extends StdSerializer<AIGuardMessageRole> {
    public AIGuardMessageRoleSerializer(Class<AIGuardMessageRole> t) {
      super(t);
    }

    public AIGuardMessageRoleSerializer() {
      this(null);
    }

    @Override
    public void serialize(AIGuardMessageRole value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static AIGuardMessageRole fromValue(String value) {
    return new AIGuardMessageRole(value);
  }
}
