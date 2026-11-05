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

/** Effective source of the model pricing data. */
@JsonSerialize(
    using =
        AiGatewayModelPricingEffectiveSource.AiGatewayModelPricingEffectiveSourceSerializer.class)
public class AiGatewayModelPricingEffectiveSource extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("catalog_auto", "model_override", "unknown"));

  public static final AiGatewayModelPricingEffectiveSource CATALOG_AUTO =
      new AiGatewayModelPricingEffectiveSource("catalog_auto");
  public static final AiGatewayModelPricingEffectiveSource MODEL_OVERRIDE =
      new AiGatewayModelPricingEffectiveSource("model_override");
  public static final AiGatewayModelPricingEffectiveSource UNKNOWN =
      new AiGatewayModelPricingEffectiveSource("unknown");

  AiGatewayModelPricingEffectiveSource(String value) {
    super(value, allowedValues);
  }

  public static class AiGatewayModelPricingEffectiveSourceSerializer
      extends StdSerializer<AiGatewayModelPricingEffectiveSource> {
    public AiGatewayModelPricingEffectiveSourceSerializer(
        Class<AiGatewayModelPricingEffectiveSource> t) {
      super(t);
    }

    public AiGatewayModelPricingEffectiveSourceSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        AiGatewayModelPricingEffectiveSource value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static AiGatewayModelPricingEffectiveSource fromValue(String value) {
    return new AiGatewayModelPricingEffectiveSource(value);
  }
}
