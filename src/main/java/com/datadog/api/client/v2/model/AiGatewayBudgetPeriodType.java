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

/** AI Gateway budget period resource type. */
@JsonSerialize(using = AiGatewayBudgetPeriodType.AiGatewayBudgetPeriodTypeSerializer.class)
public class AiGatewayBudgetPeriodType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("budget-periods"));

  public static final AiGatewayBudgetPeriodType BUDGET_PERIODS =
      new AiGatewayBudgetPeriodType("budget-periods");

  AiGatewayBudgetPeriodType(String value) {
    super(value, allowedValues);
  }

  public static class AiGatewayBudgetPeriodTypeSerializer
      extends StdSerializer<AiGatewayBudgetPeriodType> {
    public AiGatewayBudgetPeriodTypeSerializer(Class<AiGatewayBudgetPeriodType> t) {
      super(t);
    }

    public AiGatewayBudgetPeriodTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        AiGatewayBudgetPeriodType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static AiGatewayBudgetPeriodType fromValue(String value) {
    return new AiGatewayBudgetPeriodType(value);
  }
}
