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

/** Indicates that the action is an escalation policy action. */
@JsonSerialize(using = EscalationPolicyActionType.EscalationPolicyActionTypeSerializer.class)
public class EscalationPolicyActionType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("escalation_policy"));

  public static final EscalationPolicyActionType ESCALATION_POLICY =
      new EscalationPolicyActionType("escalation_policy");

  EscalationPolicyActionType(String value) {
    super(value, allowedValues);
  }

  public static class EscalationPolicyActionTypeSerializer
      extends StdSerializer<EscalationPolicyActionType> {
    public EscalationPolicyActionTypeSerializer(Class<EscalationPolicyActionType> t) {
      super(t);
    }

    public EscalationPolicyActionTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        EscalationPolicyActionType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static EscalationPolicyActionType fromValue(String value) {
    return new EscalationPolicyActionType(value);
  }
}
