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

/** Indicates that the resource is of type 'policies'. */
@JsonSerialize(
    using =
        RoutingRuleRelationshipsPolicyDataType.RoutingRuleRelationshipsPolicyDataTypeSerializer
            .class)
public class RoutingRuleRelationshipsPolicyDataType extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("policies"));

  public static final RoutingRuleRelationshipsPolicyDataType POLICIES =
      new RoutingRuleRelationshipsPolicyDataType("policies");

  RoutingRuleRelationshipsPolicyDataType(String value) {
    super(value, allowedValues);
  }

  public static class RoutingRuleRelationshipsPolicyDataTypeSerializer
      extends StdSerializer<RoutingRuleRelationshipsPolicyDataType> {
    public RoutingRuleRelationshipsPolicyDataTypeSerializer(
        Class<RoutingRuleRelationshipsPolicyDataType> t) {
      super(t);
    }

    public RoutingRuleRelationshipsPolicyDataTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        RoutingRuleRelationshipsPolicyDataType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static RoutingRuleRelationshipsPolicyDataType fromValue(String value) {
    return new RoutingRuleRelationshipsPolicyDataType(value);
  }
}
