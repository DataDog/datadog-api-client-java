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
 * Optional reasoning effort preference for this model destination. Must be supported by the
 * selected model and provider. For provider "*", every eligible provider must support the level. An
 * explicit value overrides the request's reasoning setting, subject to model-group policy. Omitted
 * or null preserves request and provider behavior; none is an explicit level, not the default. On
 * update, omission preserves a saved target override; null explicitly clears it. Routing-rule
 * references cannot set this field; each referenced model destination owns its override. If an
 * override cannot be applied at runtime, the gateway keeps the destination and restores the
 * caller's original reasoning settings, or preserves the provider default when omitted. It rechecks
 * all applicable route and model-group policies against those settings before sending. Model-group
 * max_reasoning_level enforces hard limits; the override is not an additional cap. Normal fallback
 * applies if governance denies the resulting request or the destination cannot otherwise serve it.
 * Metrics and span tags record the override outcome and incompatibility reason. When response
 * headers have not already been committed, <code>X-Ai-Gateway-Reasoning-Override</code> reports
 * applied or not_applied for the returned attempt, and <code>X-Ai-Gateway-Reasoning-Override-Reason
 * </code> reports the reason when not applied.
 */
@JsonSerialize(
    using = AiGatewayRoutingReasoningLevel.AiGatewayRoutingReasoningLevelSerializer.class)
public class AiGatewayRoutingReasoningLevel extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList("none", "minimal", "low", "medium", "high", "xhigh", "max"));

  public static final AiGatewayRoutingReasoningLevel NONE =
      new AiGatewayRoutingReasoningLevel("none");
  public static final AiGatewayRoutingReasoningLevel MINIMAL =
      new AiGatewayRoutingReasoningLevel("minimal");
  public static final AiGatewayRoutingReasoningLevel LOW =
      new AiGatewayRoutingReasoningLevel("low");
  public static final AiGatewayRoutingReasoningLevel MEDIUM =
      new AiGatewayRoutingReasoningLevel("medium");
  public static final AiGatewayRoutingReasoningLevel HIGH =
      new AiGatewayRoutingReasoningLevel("high");
  public static final AiGatewayRoutingReasoningLevel XHIGH =
      new AiGatewayRoutingReasoningLevel("xhigh");
  public static final AiGatewayRoutingReasoningLevel MAX =
      new AiGatewayRoutingReasoningLevel("max");

  AiGatewayRoutingReasoningLevel(String value) {
    super(value, allowedValues);
  }

  public static class AiGatewayRoutingReasoningLevelSerializer
      extends StdSerializer<AiGatewayRoutingReasoningLevel> {
    public AiGatewayRoutingReasoningLevelSerializer(Class<AiGatewayRoutingReasoningLevel> t) {
      super(t);
    }

    public AiGatewayRoutingReasoningLevelSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        AiGatewayRoutingReasoningLevel value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static AiGatewayRoutingReasoningLevel fromValue(String value) {
    return new AiGatewayRoutingReasoningLevel(value);
  }
}
