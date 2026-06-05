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
 * The rate limit mode. <code>custom</code> enforces a fixed session limit, while <code>adaptive
 * </code> dynamically adjusts retention.
 */
@JsonSerialize(using = RumRateLimitMode.RumRateLimitModeSerializer.class)
public class RumRateLimitMode extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("custom", "adaptive"));

  public static final RumRateLimitMode CUSTOM = new RumRateLimitMode("custom");
  public static final RumRateLimitMode ADAPTIVE = new RumRateLimitMode("adaptive");

  RumRateLimitMode(String value) {
    super(value, allowedValues);
  }

  public static class RumRateLimitModeSerializer extends StdSerializer<RumRateLimitMode> {
    public RumRateLimitModeSerializer(Class<RumRateLimitMode> t) {
      super(t);
    }

    public RumRateLimitModeSerializer() {
      this(null);
    }

    @Override
    public void serialize(RumRateLimitMode value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static RumRateLimitMode fromValue(String value) {
    return new RumRateLimitMode(value);
  }
}
