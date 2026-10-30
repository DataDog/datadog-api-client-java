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

/**
 * The policy action for a tool named by the property. Tool policies override the recommendation
 * after evaluation; they do not skip evaluation. Any BLOCK takes precedence over PASS and EVALUATE.
 * The Supply Chain Firewall is applied afterward and can still return DENY.
 */
@JsonSerialize(using = AIGuardToolPolicyAction.AIGuardToolPolicyActionSerializer.class)
public class AIGuardToolPolicyAction extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("PASS", "BLOCK", "EVALUATE"));

  public static final AIGuardToolPolicyAction PASS = new AIGuardToolPolicyAction("PASS");
  public static final AIGuardToolPolicyAction BLOCK = new AIGuardToolPolicyAction("BLOCK");
  public static final AIGuardToolPolicyAction EVALUATE = new AIGuardToolPolicyAction("EVALUATE");

  AIGuardToolPolicyAction(String value) {
    super(value, allowedValues);
  }

  public static class AIGuardToolPolicyActionSerializer
      extends StdSerializer<AIGuardToolPolicyAction> {
    public AIGuardToolPolicyActionSerializer(Class<AIGuardToolPolicyAction> t) {
      super(t);
    }

    public AIGuardToolPolicyActionSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        AIGuardToolPolicyAction value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static AIGuardToolPolicyAction fromValue(String value) {
    return new AIGuardToolPolicyAction(value);
  }
}
