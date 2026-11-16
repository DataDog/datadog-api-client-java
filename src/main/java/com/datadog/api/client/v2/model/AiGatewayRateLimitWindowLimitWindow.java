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
 * The rolling window that a limit applies to. For per-minute limits, use the <code>*_per_minute
 * </code> fields instead.
 */
@JsonSerialize(
    using = AiGatewayRateLimitWindowLimitWindow.AiGatewayRateLimitWindowLimitWindowSerializer.class)
public class AiGatewayRateLimitWindowLimitWindow extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("5m", "15m", "30m", "1h", "3h", "6h", "12h", "24h"));

  public static final AiGatewayRateLimitWindowLimitWindow FIVE_MINUTES =
      new AiGatewayRateLimitWindowLimitWindow("5m");
  public static final AiGatewayRateLimitWindowLimitWindow FIFTEEN_MINUTES =
      new AiGatewayRateLimitWindowLimitWindow("15m");
  public static final AiGatewayRateLimitWindowLimitWindow THIRTY_MINUTES =
      new AiGatewayRateLimitWindowLimitWindow("30m");
  public static final AiGatewayRateLimitWindowLimitWindow ONE_HOUR =
      new AiGatewayRateLimitWindowLimitWindow("1h");
  public static final AiGatewayRateLimitWindowLimitWindow THREE_HOURS =
      new AiGatewayRateLimitWindowLimitWindow("3h");
  public static final AiGatewayRateLimitWindowLimitWindow SIX_HOURS =
      new AiGatewayRateLimitWindowLimitWindow("6h");
  public static final AiGatewayRateLimitWindowLimitWindow TWELVE_HOURS =
      new AiGatewayRateLimitWindowLimitWindow("12h");
  public static final AiGatewayRateLimitWindowLimitWindow TWENTY_FOUR_HOURS =
      new AiGatewayRateLimitWindowLimitWindow("24h");

  AiGatewayRateLimitWindowLimitWindow(String value) {
    super(value, allowedValues);
  }

  public static class AiGatewayRateLimitWindowLimitWindowSerializer
      extends StdSerializer<AiGatewayRateLimitWindowLimitWindow> {
    public AiGatewayRateLimitWindowLimitWindowSerializer(
        Class<AiGatewayRateLimitWindowLimitWindow> t) {
      super(t);
    }

    public AiGatewayRateLimitWindowLimitWindowSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        AiGatewayRateLimitWindowLimitWindow value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static AiGatewayRateLimitWindowLimitWindow fromValue(String value) {
    return new AiGatewayRateLimitWindowLimitWindow(value);
  }
}
