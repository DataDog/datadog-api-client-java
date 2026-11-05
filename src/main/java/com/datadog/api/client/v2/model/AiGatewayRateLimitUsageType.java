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

/** AI Gateway rate limit usage resource type. */
@JsonSerialize(using = AiGatewayRateLimitUsageType.AiGatewayRateLimitUsageTypeSerializer.class)
public class AiGatewayRateLimitUsageType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("rate-limit-usage"));

  public static final AiGatewayRateLimitUsageType RATE_LIMIT_USAGE =
      new AiGatewayRateLimitUsageType("rate-limit-usage");

  AiGatewayRateLimitUsageType(String value) {
    super(value, allowedValues);
  }

  public static class AiGatewayRateLimitUsageTypeSerializer
      extends StdSerializer<AiGatewayRateLimitUsageType> {
    public AiGatewayRateLimitUsageTypeSerializer(Class<AiGatewayRateLimitUsageType> t) {
      super(t);
    }

    public AiGatewayRateLimitUsageTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        AiGatewayRateLimitUsageType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static AiGatewayRateLimitUsageType fromValue(String value) {
    return new AiGatewayRateLimitUsageType(value);
  }
}
