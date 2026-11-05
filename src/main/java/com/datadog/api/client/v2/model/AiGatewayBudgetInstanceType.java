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

/** Budget instance counter resource type. */
@JsonSerialize(using = AiGatewayBudgetInstanceType.AiGatewayBudgetInstanceTypeSerializer.class)
public class AiGatewayBudgetInstanceType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("budget-instances"));

  public static final AiGatewayBudgetInstanceType BUDGET_INSTANCES =
      new AiGatewayBudgetInstanceType("budget-instances");

  AiGatewayBudgetInstanceType(String value) {
    super(value, allowedValues);
  }

  public static class AiGatewayBudgetInstanceTypeSerializer
      extends StdSerializer<AiGatewayBudgetInstanceType> {
    public AiGatewayBudgetInstanceTypeSerializer(Class<AiGatewayBudgetInstanceType> t) {
      super(t);
    }

    public AiGatewayBudgetInstanceTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        AiGatewayBudgetInstanceType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static AiGatewayBudgetInstanceType fromValue(String value) {
    return new AiGatewayBudgetInstanceType(value);
  }
}
