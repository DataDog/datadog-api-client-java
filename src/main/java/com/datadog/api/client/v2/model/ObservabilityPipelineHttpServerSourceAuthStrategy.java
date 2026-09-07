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

/** HTTP authentication method. */
@JsonSerialize(
    using =
        ObservabilityPipelineHttpServerSourceAuthStrategy
            .ObservabilityPipelineHttpServerSourceAuthStrategySerializer.class)
public class ObservabilityPipelineHttpServerSourceAuthStrategy extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("none", "plain"));

  public static final ObservabilityPipelineHttpServerSourceAuthStrategy NONE =
      new ObservabilityPipelineHttpServerSourceAuthStrategy("none");
  public static final ObservabilityPipelineHttpServerSourceAuthStrategy PLAIN =
      new ObservabilityPipelineHttpServerSourceAuthStrategy("plain");

  ObservabilityPipelineHttpServerSourceAuthStrategy(String value) {
    super(value, allowedValues);
  }

  public static class ObservabilityPipelineHttpServerSourceAuthStrategySerializer
      extends StdSerializer<ObservabilityPipelineHttpServerSourceAuthStrategy> {
    public ObservabilityPipelineHttpServerSourceAuthStrategySerializer(
        Class<ObservabilityPipelineHttpServerSourceAuthStrategy> t) {
      super(t);
    }

    public ObservabilityPipelineHttpServerSourceAuthStrategySerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ObservabilityPipelineHttpServerSourceAuthStrategy value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ObservabilityPipelineHttpServerSourceAuthStrategy fromValue(String value) {
    return new ObservabilityPipelineHttpServerSourceAuthStrategy(value);
  }
}
