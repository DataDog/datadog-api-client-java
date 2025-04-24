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

/** The New Relic region. */
@JsonSerialize(
    using =
        ObservabilityPipelineNewRelicDestinationRegion
            .ObservabilityPipelineNewRelicDestinationRegionSerializer.class)
public class ObservabilityPipelineNewRelicDestinationRegion extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("us", "eu"));

  public static final ObservabilityPipelineNewRelicDestinationRegion US =
      new ObservabilityPipelineNewRelicDestinationRegion("us");
  public static final ObservabilityPipelineNewRelicDestinationRegion EU =
      new ObservabilityPipelineNewRelicDestinationRegion("eu");

  ObservabilityPipelineNewRelicDestinationRegion(String value) {
    super(value, allowedValues);
  }

  public static class ObservabilityPipelineNewRelicDestinationRegionSerializer
      extends StdSerializer<ObservabilityPipelineNewRelicDestinationRegion> {
    public ObservabilityPipelineNewRelicDestinationRegionSerializer(
        Class<ObservabilityPipelineNewRelicDestinationRegion> t) {
      super(t);
    }

    public ObservabilityPipelineNewRelicDestinationRegionSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ObservabilityPipelineNewRelicDestinationRegion value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ObservabilityPipelineNewRelicDestinationRegion fromValue(String value) {
    return new ObservabilityPipelineNewRelicDestinationRegion(value);
  }
}
