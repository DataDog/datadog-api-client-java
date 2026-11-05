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

/** Type of routing target. */
@JsonSerialize(
    using = AiGatewayRoutingRuleTargetType.AiGatewayRoutingRuleTargetTypeSerializer.class)
public class AiGatewayRoutingRuleTargetType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("model", "routing-rule"));

  public static final AiGatewayRoutingRuleTargetType MODEL =
      new AiGatewayRoutingRuleTargetType("model");
  public static final AiGatewayRoutingRuleTargetType ROUTING_RULE =
      new AiGatewayRoutingRuleTargetType("routing-rule");

  AiGatewayRoutingRuleTargetType(String value) {
    super(value, allowedValues);
  }

  public static class AiGatewayRoutingRuleTargetTypeSerializer
      extends StdSerializer<AiGatewayRoutingRuleTargetType> {
    public AiGatewayRoutingRuleTargetTypeSerializer(Class<AiGatewayRoutingRuleTargetType> t) {
      super(t);
    }

    public AiGatewayRoutingRuleTargetTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        AiGatewayRoutingRuleTargetType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static AiGatewayRoutingRuleTargetType fromValue(String value) {
    return new AiGatewayRoutingRuleTargetType(value);
  }
}
