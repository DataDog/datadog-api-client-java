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

/** How a tier orders its targets. */
@JsonSerialize(
    using = AiGatewayRoutingRuleTierOrdering.AiGatewayRoutingRuleTierOrderingSerializer.class)
public class AiGatewayRoutingRuleTierOrdering extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("configured", "weighted_affinity"));

  public static final AiGatewayRoutingRuleTierOrdering CONFIGURED =
      new AiGatewayRoutingRuleTierOrdering("configured");
  public static final AiGatewayRoutingRuleTierOrdering WEIGHTED_AFFINITY =
      new AiGatewayRoutingRuleTierOrdering("weighted_affinity");

  AiGatewayRoutingRuleTierOrdering(String value) {
    super(value, allowedValues);
  }

  public static class AiGatewayRoutingRuleTierOrderingSerializer
      extends StdSerializer<AiGatewayRoutingRuleTierOrdering> {
    public AiGatewayRoutingRuleTierOrderingSerializer(Class<AiGatewayRoutingRuleTierOrdering> t) {
      super(t);
    }

    public AiGatewayRoutingRuleTierOrderingSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        AiGatewayRoutingRuleTierOrdering value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static AiGatewayRoutingRuleTierOrdering fromValue(String value) {
    return new AiGatewayRoutingRuleTierOrdering(value);
  }
}
