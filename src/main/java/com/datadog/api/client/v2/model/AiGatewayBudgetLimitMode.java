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
 * How the budget limit applies. <code>shared</code> is one limit for all matching traffic. <code>
 * per_instance</code> is one limit for each counter of a template budget that splits by value.
 */
@JsonSerialize(using = AiGatewayBudgetLimitMode.AiGatewayBudgetLimitModeSerializer.class)
public class AiGatewayBudgetLimitMode extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("shared", "per_instance"));

  public static final AiGatewayBudgetLimitMode SHARED = new AiGatewayBudgetLimitMode("shared");
  public static final AiGatewayBudgetLimitMode PER_INSTANCE =
      new AiGatewayBudgetLimitMode("per_instance");

  AiGatewayBudgetLimitMode(String value) {
    super(value, allowedValues);
  }

  public static class AiGatewayBudgetLimitModeSerializer
      extends StdSerializer<AiGatewayBudgetLimitMode> {
    public AiGatewayBudgetLimitModeSerializer(Class<AiGatewayBudgetLimitMode> t) {
      super(t);
    }

    public AiGatewayBudgetLimitModeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        AiGatewayBudgetLimitMode value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static AiGatewayBudgetLimitMode fromValue(String value) {
    return new AiGatewayBudgetLimitMode(value);
  }
}
