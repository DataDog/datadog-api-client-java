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

/** The verdict a guardrail applied to a plan or investigation. */
@JsonSerialize(using = RemediationGuardrailVerdict.RemediationGuardrailVerdictSerializer.class)
public class RemediationGuardrailVerdict extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("allowed", "approval_required", "denied"));

  public static final RemediationGuardrailVerdict ALLOWED =
      new RemediationGuardrailVerdict("allowed");
  public static final RemediationGuardrailVerdict APPROVAL_REQUIRED =
      new RemediationGuardrailVerdict("approval_required");
  public static final RemediationGuardrailVerdict DENIED =
      new RemediationGuardrailVerdict("denied");

  RemediationGuardrailVerdict(String value) {
    super(value, allowedValues);
  }

  public static class RemediationGuardrailVerdictSerializer
      extends StdSerializer<RemediationGuardrailVerdict> {
    public RemediationGuardrailVerdictSerializer(Class<RemediationGuardrailVerdict> t) {
      super(t);
    }

    public RemediationGuardrailVerdictSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        RemediationGuardrailVerdict value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static RemediationGuardrailVerdict fromValue(String value) {
    return new RemediationGuardrailVerdict(value);
  }
}
