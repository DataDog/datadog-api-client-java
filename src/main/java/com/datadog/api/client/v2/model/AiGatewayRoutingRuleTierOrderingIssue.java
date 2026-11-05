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
 * Stored tier ordering is inconsistent. mixed means targets have different supported orderings, and
 * unknown means a target has an unsupported ordering. The tier is reported as configured without
 * weights. Replace the rule to repair it. Omitted for consistent tiers. A forced deletion cannot
 * rewrite a surviving tier with an unknown issue.
 */
@JsonSerialize(
    using =
        AiGatewayRoutingRuleTierOrderingIssue.AiGatewayRoutingRuleTierOrderingIssueSerializer.class)
public class AiGatewayRoutingRuleTierOrderingIssue extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("mixed", "unknown"));

  public static final AiGatewayRoutingRuleTierOrderingIssue MIXED =
      new AiGatewayRoutingRuleTierOrderingIssue("mixed");
  public static final AiGatewayRoutingRuleTierOrderingIssue UNKNOWN =
      new AiGatewayRoutingRuleTierOrderingIssue("unknown");

  AiGatewayRoutingRuleTierOrderingIssue(String value) {
    super(value, allowedValues);
  }

  public static class AiGatewayRoutingRuleTierOrderingIssueSerializer
      extends StdSerializer<AiGatewayRoutingRuleTierOrderingIssue> {
    public AiGatewayRoutingRuleTierOrderingIssueSerializer(
        Class<AiGatewayRoutingRuleTierOrderingIssue> t) {
      super(t);
    }

    public AiGatewayRoutingRuleTierOrderingIssueSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        AiGatewayRoutingRuleTierOrderingIssue value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static AiGatewayRoutingRuleTierOrderingIssue fromValue(String value) {
    return new AiGatewayRoutingRuleTierOrderingIssue(value);
  }
}
