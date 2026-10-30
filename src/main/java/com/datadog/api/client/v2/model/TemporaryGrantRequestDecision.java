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

/** Approve the exact submitted total and expiry, or deny the request. */
@JsonSerialize(using = TemporaryGrantRequestDecision.TemporaryGrantRequestDecisionSerializer.class)
public class TemporaryGrantRequestDecision extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("approved", "denied"));

  public static final TemporaryGrantRequestDecision APPROVED =
      new TemporaryGrantRequestDecision("approved");
  public static final TemporaryGrantRequestDecision DENIED =
      new TemporaryGrantRequestDecision("denied");

  TemporaryGrantRequestDecision(String value) {
    super(value, allowedValues);
  }

  public static class TemporaryGrantRequestDecisionSerializer
      extends StdSerializer<TemporaryGrantRequestDecision> {
    public TemporaryGrantRequestDecisionSerializer(Class<TemporaryGrantRequestDecision> t) {
      super(t);
    }

    public TemporaryGrantRequestDecisionSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        TemporaryGrantRequestDecision value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static TemporaryGrantRequestDecision fromValue(String value) {
    return new TemporaryGrantRequestDecision(value);
  }
}
