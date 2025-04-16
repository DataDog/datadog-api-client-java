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
        EscalationPolicyCreateRequestDataAttributesStepsItemsAssignment
            .EscalationPolicyCreateRequestDataAttributesStepsItemsAssignmentSerializer.class)
public class EscalationPolicyCreateRequestDataAttributesStepsItemsAssignment
    extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("default", "round-robin"));

  public static final EscalationPolicyCreateRequestDataAttributesStepsItemsAssignment DEFAULT =
      new EscalationPolicyCreateRequestDataAttributesStepsItemsAssignment("default");
  public static final EscalationPolicyCreateRequestDataAttributesStepsItemsAssignment ROUND_ROBIN =
      new EscalationPolicyCreateRequestDataAttributesStepsItemsAssignment("round-robin");

  EscalationPolicyCreateRequestDataAttributesStepsItemsAssignment(String value) {
    super(value, allowedValues);
  }

  public static class EscalationPolicyCreateRequestDataAttributesStepsItemsAssignmentSerializer
      extends StdSerializer<EscalationPolicyCreateRequestDataAttributesStepsItemsAssignment> {
    public EscalationPolicyCreateRequestDataAttributesStepsItemsAssignmentSerializer(
        Class<EscalationPolicyCreateRequestDataAttributesStepsItemsAssignment> t) {
      super(t);
    }

    public EscalationPolicyCreateRequestDataAttributesStepsItemsAssignmentSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        EscalationPolicyCreateRequestDataAttributesStepsItemsAssignment value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static EscalationPolicyCreateRequestDataAttributesStepsItemsAssignment fromValue(
      String value) {
    return new EscalationPolicyCreateRequestDataAttributesStepsItemsAssignment(value);
  }
}
