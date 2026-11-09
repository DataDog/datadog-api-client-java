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
 * How a tier orders its targets. Omitted or null defaults to configured, which preserves target
 * order. The weighted_affinity ordering distributes first-choice assignments by relative target
 * weights and accepts only model targets with an explicit provider, without repeated provider and
 * model pairs in the same tier. The classified ordering lets a decision model pick one destination
 * for each request by its rubric. It is allowed only on the first tier, and it needs a classifier
 * and exactly one default destination.
 *
 * <p><strong>Note</strong>: Classified routing is in Preview and may not be available for all
 * organizations. Saving a classified tier returns 403 Forbidden unless the feature is enabled for
 * your organization.
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
