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

/** The metric that a window limit counts. <code>cost</code> counts priced spend in microcents. */
@JsonSerialize(
    using = AiGatewayRateLimitWindowLimitMetric.AiGatewayRateLimitWindowLimitMetricSerializer.class)
public class AiGatewayRateLimitWindowLimitMetric extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("requests", "input_tokens", "output_tokens", "cost"));

  public static final AiGatewayRateLimitWindowLimitMetric REQUESTS =
      new AiGatewayRateLimitWindowLimitMetric("requests");
  public static final AiGatewayRateLimitWindowLimitMetric INPUT_TOKENS =
      new AiGatewayRateLimitWindowLimitMetric("input_tokens");
  public static final AiGatewayRateLimitWindowLimitMetric OUTPUT_TOKENS =
      new AiGatewayRateLimitWindowLimitMetric("output_tokens");
  public static final AiGatewayRateLimitWindowLimitMetric COST =
      new AiGatewayRateLimitWindowLimitMetric("cost");

  AiGatewayRateLimitWindowLimitMetric(String value) {
    super(value, allowedValues);
  }

  public static class AiGatewayRateLimitWindowLimitMetricSerializer
      extends StdSerializer<AiGatewayRateLimitWindowLimitMetric> {
    public AiGatewayRateLimitWindowLimitMetricSerializer(
        Class<AiGatewayRateLimitWindowLimitMetric> t) {
      super(t);
    }

    public AiGatewayRateLimitWindowLimitMetricSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        AiGatewayRateLimitWindowLimitMetric value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static AiGatewayRateLimitWindowLimitMetric fromValue(String value) {
    return new AiGatewayRateLimitWindowLimitMetric(value);
  }
}
