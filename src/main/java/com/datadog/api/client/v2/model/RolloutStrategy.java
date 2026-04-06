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

/** The progression strategy used by a progressive rollout. */
@JsonSerialize(using = RolloutStrategy.RolloutStrategySerializer.class)
public class RolloutStrategy extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("UNIFORM_INTERVALS", "NO_ROLLOUT"));

  public static final RolloutStrategy UNIFORM_INTERVALS = new RolloutStrategy("UNIFORM_INTERVALS");
  public static final RolloutStrategy NO_ROLLOUT = new RolloutStrategy("NO_ROLLOUT");

  RolloutStrategy(String value) {
    super(value, allowedValues);
  }

  public static class RolloutStrategySerializer extends StdSerializer<RolloutStrategy> {
    public RolloutStrategySerializer(Class<RolloutStrategy> t) {
      super(t);
    }

    public RolloutStrategySerializer() {
      this(null);
    }

    @Override
    public void serialize(RolloutStrategy value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static RolloutStrategy fromValue(String value) {
    return new RolloutStrategy(value);
  }
}
