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
 * How a tier orders its targets. Omission preserves the saved same-position tier on update; null
 * resets to configured. New tiers default to configured. The weighted_affinity ordering distributes
 * first-choice assignments by relative target weights and accepts only model targets with an
 * explicit provider, without repeated provider and model pairs in the same tier. The <code>
 * classified</code> ordering is allowed only in the first tier and requires a classifier,
 * destination rubrics, and one default destination. Its targets are model targets that each name
 * one provider, not "*". Besides the default, it needs 1 to 9 destinations, each with a different
 * rubric. Classified routing is in Preview: saving a classified tier returns 403 Forbidden unless
 * the feature is enabled for the organization.
 */
@JsonSerialize(
    using =
        AiGatewayNullableRoutingRuleTierOrdering.AiGatewayNullableRoutingRuleTierOrderingSerializer
            .class)
public class AiGatewayNullableRoutingRuleTierOrdering extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("configured", "weighted_affinity", "classified"));

  public static final AiGatewayNullableRoutingRuleTierOrdering CONFIGURED =
      new AiGatewayNullableRoutingRuleTierOrdering("configured");
  public static final AiGatewayNullableRoutingRuleTierOrdering WEIGHTED_AFFINITY =
      new AiGatewayNullableRoutingRuleTierOrdering("weighted_affinity");
  public static final AiGatewayNullableRoutingRuleTierOrdering CLASSIFIED =
      new AiGatewayNullableRoutingRuleTierOrdering("classified");

  AiGatewayNullableRoutingRuleTierOrdering(String value) {
    super(value, allowedValues);
  }

  public static class AiGatewayNullableRoutingRuleTierOrderingSerializer
      extends StdSerializer<AiGatewayNullableRoutingRuleTierOrdering> {
    public AiGatewayNullableRoutingRuleTierOrderingSerializer(
        Class<AiGatewayNullableRoutingRuleTierOrdering> t) {
      super(t);
    }

    public AiGatewayNullableRoutingRuleTierOrderingSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        AiGatewayNullableRoutingRuleTierOrdering value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static AiGatewayNullableRoutingRuleTierOrdering fromValue(String value) {
    return new AiGatewayNullableRoutingRuleTierOrdering(value);
  }
}
