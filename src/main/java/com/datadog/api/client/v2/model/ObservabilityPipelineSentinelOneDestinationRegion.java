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

/** The SentinelOne region to send logs to. */
@JsonSerialize(
    using =
        ObservabilityPipelineSentinelOneDestinationRegion
            .ObservabilityPipelineSentinelOneDestinationRegionSerializer.class)
public class ObservabilityPipelineSentinelOneDestinationRegion extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("us", "eu", "ca", "data_set_us"));

  public static final ObservabilityPipelineSentinelOneDestinationRegion US =
      new ObservabilityPipelineSentinelOneDestinationRegion("us");
  public static final ObservabilityPipelineSentinelOneDestinationRegion EU =
      new ObservabilityPipelineSentinelOneDestinationRegion("eu");
  public static final ObservabilityPipelineSentinelOneDestinationRegion CA =
      new ObservabilityPipelineSentinelOneDestinationRegion("ca");
  public static final ObservabilityPipelineSentinelOneDestinationRegion DATA_SET_US =
      new ObservabilityPipelineSentinelOneDestinationRegion("data_set_us");

  ObservabilityPipelineSentinelOneDestinationRegion(String value) {
    super(value, allowedValues);
  }

  public static class ObservabilityPipelineSentinelOneDestinationRegionSerializer
      extends StdSerializer<ObservabilityPipelineSentinelOneDestinationRegion> {
    public ObservabilityPipelineSentinelOneDestinationRegionSerializer(
        Class<ObservabilityPipelineSentinelOneDestinationRegion> t) {
      super(t);
    }

    public ObservabilityPipelineSentinelOneDestinationRegionSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ObservabilityPipelineSentinelOneDestinationRegion value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ObservabilityPipelineSentinelOneDestinationRegion fromValue(String value) {
    return new ObservabilityPipelineSentinelOneDestinationRegion(value);
  }
}
