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

/** The compression algorithm applied to outbound HTTP requests. */
@JsonSerialize(
    using =
        ObservabilityPipelineClickhouseDestinationCompressionAlgorithm
            .ObservabilityPipelineClickhouseDestinationCompressionAlgorithmSerializer.class)
public class ObservabilityPipelineClickhouseDestinationCompressionAlgorithm
    extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("gzip", "none"));

  public static final ObservabilityPipelineClickhouseDestinationCompressionAlgorithm GZIP =
      new ObservabilityPipelineClickhouseDestinationCompressionAlgorithm("gzip");
  public static final ObservabilityPipelineClickhouseDestinationCompressionAlgorithm NONE =
      new ObservabilityPipelineClickhouseDestinationCompressionAlgorithm("none");

  ObservabilityPipelineClickhouseDestinationCompressionAlgorithm(String value) {
    super(value, allowedValues);
  }

  public static class ObservabilityPipelineClickhouseDestinationCompressionAlgorithmSerializer
      extends StdSerializer<ObservabilityPipelineClickhouseDestinationCompressionAlgorithm> {
    public ObservabilityPipelineClickhouseDestinationCompressionAlgorithmSerializer(
        Class<ObservabilityPipelineClickhouseDestinationCompressionAlgorithm> t) {
      super(t);
    }

    public ObservabilityPipelineClickhouseDestinationCompressionAlgorithmSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ObservabilityPipelineClickhouseDestinationCompressionAlgorithm value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ObservabilityPipelineClickhouseDestinationCompressionAlgorithm fromValue(
      String value) {
    return new ObservabilityPipelineClickhouseDestinationCompressionAlgorithm(value);
  }
}
