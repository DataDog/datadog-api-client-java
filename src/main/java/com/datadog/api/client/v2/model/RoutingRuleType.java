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

/** Team routing rules resource type. */
@JsonSerialize(using = RoutingRuleType.RoutingRuleTypeSerializer.class)
public class RoutingRuleType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("team_routing_rules"));

  public static final RoutingRuleType TEAM_ROUTING_RULES =
      new RoutingRuleType("team_routing_rules");

  RoutingRuleType(String value) {
    super(value, allowedValues);
  }

  public static class RoutingRuleTypeSerializer extends StdSerializer<RoutingRuleType> {
    public RoutingRuleTypeSerializer(Class<RoutingRuleType> t) {
      super(t);
    }

    public RoutingRuleTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(RoutingRuleType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static RoutingRuleType fromValue(String value) {
    return new RoutingRuleType(value);
  }
}
