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
 * Specifies how this escalation step will assign targets (example <code>default</code> or <code>
 * round-robin</code>).
 */
@JsonSerialize(
    using =
        EscalationPolicyStepAttributesAssignment.EscalationPolicyStepAttributesAssignmentSerializer
            .class)
public class EscalationPolicyStepAttributesAssignment extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("default", "round-robin"));

  public static final EscalationPolicyStepAttributesAssignment DEFAULT =
      new EscalationPolicyStepAttributesAssignment("default");
  public static final EscalationPolicyStepAttributesAssignment ROUND_ROBIN =
      new EscalationPolicyStepAttributesAssignment("round-robin");

  EscalationPolicyStepAttributesAssignment(String value) {
    super(value, allowedValues);
  }

  public static class EscalationPolicyStepAttributesAssignmentSerializer
      extends StdSerializer<EscalationPolicyStepAttributesAssignment> {
    public EscalationPolicyStepAttributesAssignmentSerializer(
        Class<EscalationPolicyStepAttributesAssignment> t) {
      super(t);
    }

    public EscalationPolicyStepAttributesAssignmentSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        EscalationPolicyStepAttributesAssignment value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static EscalationPolicyStepAttributesAssignment fromValue(String value) {
    return new EscalationPolicyStepAttributesAssignment(value);
  }
}
