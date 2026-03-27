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

/** Optional authentication strategy for HTTP requests. */
@JsonSerialize(
    using =
        ObservabilityPipelineHttpClientSourceAuthStrategy
            .ObservabilityPipelineHttpClientSourceAuthStrategySerializer.class)
public class ObservabilityPipelineHttpClientSourceAuthStrategy extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("none", "basic", "bearer", "custom"));

  public static final ObservabilityPipelineHttpClientSourceAuthStrategy NONE =
      new ObservabilityPipelineHttpClientSourceAuthStrategy("none");
  public static final ObservabilityPipelineHttpClientSourceAuthStrategy BASIC =
      new ObservabilityPipelineHttpClientSourceAuthStrategy("basic");
  public static final ObservabilityPipelineHttpClientSourceAuthStrategy BEARER =
      new ObservabilityPipelineHttpClientSourceAuthStrategy("bearer");
  public static final ObservabilityPipelineHttpClientSourceAuthStrategy CUSTOM =
      new ObservabilityPipelineHttpClientSourceAuthStrategy("custom");

  ObservabilityPipelineHttpClientSourceAuthStrategy(String value) {
    super(value, allowedValues);
  }

  public static class ObservabilityPipelineHttpClientSourceAuthStrategySerializer
      extends StdSerializer<ObservabilityPipelineHttpClientSourceAuthStrategy> {
    public ObservabilityPipelineHttpClientSourceAuthStrategySerializer(
        Class<ObservabilityPipelineHttpClientSourceAuthStrategy> t) {
      super(t);
    }

    public ObservabilityPipelineHttpClientSourceAuthStrategySerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ObservabilityPipelineHttpClientSourceAuthStrategy value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ObservabilityPipelineHttpClientSourceAuthStrategy fromValue(String value) {
    return new ObservabilityPipelineHttpClientSourceAuthStrategy(value);
  }
}
