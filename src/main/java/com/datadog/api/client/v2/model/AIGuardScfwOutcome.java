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

/** The Supply Chain Firewall outcome for a package, a matched rule, or the whole request. */
@JsonSerialize(using = AIGuardScfwOutcome.AIGuardScfwOutcomeSerializer.class)
public class AIGuardScfwOutcome extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("ALLOW", "WARN", "BLOCK"));

  public static final AIGuardScfwOutcome ALLOW = new AIGuardScfwOutcome("ALLOW");
  public static final AIGuardScfwOutcome WARN = new AIGuardScfwOutcome("WARN");
  public static final AIGuardScfwOutcome BLOCK = new AIGuardScfwOutcome("BLOCK");

  AIGuardScfwOutcome(String value) {
    super(value, allowedValues);
  }

  public static class AIGuardScfwOutcomeSerializer extends StdSerializer<AIGuardScfwOutcome> {
    public AIGuardScfwOutcomeSerializer(Class<AIGuardScfwOutcome> t) {
      super(t);
    }

    public AIGuardScfwOutcomeSerializer() {
      this(null);
    }

    @Override
    public void serialize(AIGuardScfwOutcome value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static AIGuardScfwOutcome fromValue(String value) {
    return new AIGuardScfwOutcome(value);
  }
}
