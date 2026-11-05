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

/** Action taken when spend exceeds the budget. */
@JsonSerialize(using = AiGatewayBudgetEnforcement.AiGatewayBudgetEnforcementSerializer.class)
public class AiGatewayBudgetEnforcement extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("BLOCK", "NOTIFY"));

  public static final AiGatewayBudgetEnforcement BLOCK = new AiGatewayBudgetEnforcement("BLOCK");
  public static final AiGatewayBudgetEnforcement NOTIFY = new AiGatewayBudgetEnforcement("NOTIFY");

  AiGatewayBudgetEnforcement(String value) {
    super(value, allowedValues);
  }

  public static class AiGatewayBudgetEnforcementSerializer
      extends StdSerializer<AiGatewayBudgetEnforcement> {
    public AiGatewayBudgetEnforcementSerializer(Class<AiGatewayBudgetEnforcement> t) {
      super(t);
    }

    public AiGatewayBudgetEnforcementSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        AiGatewayBudgetEnforcement value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static AiGatewayBudgetEnforcement fromValue(String value) {
    return new AiGatewayBudgetEnforcement(value);
  }
}
