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

/** Approval state for a remediation step. */
@JsonSerialize(using = RemediationStepApprovalState.RemediationStepApprovalStateSerializer.class)
public class RemediationStepApprovalState extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("pending_approval", "approved", "rejected"));

  public static final RemediationStepApprovalState PENDING_APPROVAL =
      new RemediationStepApprovalState("pending_approval");
  public static final RemediationStepApprovalState APPROVED =
      new RemediationStepApprovalState("approved");
  public static final RemediationStepApprovalState REJECTED =
      new RemediationStepApprovalState("rejected");

  RemediationStepApprovalState(String value) {
    super(value, allowedValues);
  }

  public static class RemediationStepApprovalStateSerializer
      extends StdSerializer<RemediationStepApprovalState> {
    public RemediationStepApprovalStateSerializer(Class<RemediationStepApprovalState> t) {
      super(t);
    }

    public RemediationStepApprovalStateSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        RemediationStepApprovalState value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static RemediationStepApprovalState fromValue(String value) {
    return new RemediationStepApprovalState(value);
  }
}
