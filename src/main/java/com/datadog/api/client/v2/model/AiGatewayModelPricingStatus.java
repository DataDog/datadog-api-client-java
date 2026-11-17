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

/** Whether the gateway has a price for the model. */
@JsonSerialize(using = AiGatewayModelPricingStatus.AiGatewayModelPricingStatusSerializer.class)
public class AiGatewayModelPricingStatus extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("priced", "unpriced"));

  public static final AiGatewayModelPricingStatus PRICED =
      new AiGatewayModelPricingStatus("priced");
  public static final AiGatewayModelPricingStatus UNPRICED =
      new AiGatewayModelPricingStatus("unpriced");

  AiGatewayModelPricingStatus(String value) {
    super(value, allowedValues);
  }

  public static class AiGatewayModelPricingStatusSerializer
      extends StdSerializer<AiGatewayModelPricingStatus> {
    public AiGatewayModelPricingStatusSerializer(Class<AiGatewayModelPricingStatus> t) {
      super(t);
    }

    public AiGatewayModelPricingStatusSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        AiGatewayModelPricingStatus value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static AiGatewayModelPricingStatus fromValue(String value) {
    return new AiGatewayModelPricingStatus(value);
  }
}
