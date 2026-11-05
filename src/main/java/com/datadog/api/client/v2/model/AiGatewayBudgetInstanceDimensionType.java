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

/** Budget split dimension values resource type. */
@JsonSerialize(
    using =
        AiGatewayBudgetInstanceDimensionType.AiGatewayBudgetInstanceDimensionTypeSerializer.class)
public class AiGatewayBudgetInstanceDimensionType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("budget-instance-dimensions"));

  public static final AiGatewayBudgetInstanceDimensionType BUDGET_INSTANCE_DIMENSIONS =
      new AiGatewayBudgetInstanceDimensionType("budget-instance-dimensions");

  AiGatewayBudgetInstanceDimensionType(String value) {
    super(value, allowedValues);
  }

  public static class AiGatewayBudgetInstanceDimensionTypeSerializer
      extends StdSerializer<AiGatewayBudgetInstanceDimensionType> {
    public AiGatewayBudgetInstanceDimensionTypeSerializer(
        Class<AiGatewayBudgetInstanceDimensionType> t) {
      super(t);
    }

    public AiGatewayBudgetInstanceDimensionTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        AiGatewayBudgetInstanceDimensionType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static AiGatewayBudgetInstanceDimensionType fromValue(String value) {
    return new AiGatewayBudgetInstanceDimensionType(value);
  }
}
