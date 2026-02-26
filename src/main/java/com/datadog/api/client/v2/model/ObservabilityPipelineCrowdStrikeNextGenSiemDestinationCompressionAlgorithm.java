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

/** Compression algorithm for log events. */
@JsonSerialize(
    using =
        ObservabilityPipelineCrowdStrikeNextGenSiemDestinationCompressionAlgorithm
            .ObservabilityPipelineCrowdStrikeNextGenSiemDestinationCompressionAlgorithmSerializer
            .class)
public class ObservabilityPipelineCrowdStrikeNextGenSiemDestinationCompressionAlgorithm
    extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("gzip", "zlib"));

  public static final ObservabilityPipelineCrowdStrikeNextGenSiemDestinationCompressionAlgorithm
      GZIP = new ObservabilityPipelineCrowdStrikeNextGenSiemDestinationCompressionAlgorithm("gzip");
  public static final ObservabilityPipelineCrowdStrikeNextGenSiemDestinationCompressionAlgorithm
      ZLIB = new ObservabilityPipelineCrowdStrikeNextGenSiemDestinationCompressionAlgorithm("zlib");

  ObservabilityPipelineCrowdStrikeNextGenSiemDestinationCompressionAlgorithm(String value) {
    super(value, allowedValues);
  }

  public static
  class ObservabilityPipelineCrowdStrikeNextGenSiemDestinationCompressionAlgorithmSerializer
      extends StdSerializer<
          ObservabilityPipelineCrowdStrikeNextGenSiemDestinationCompressionAlgorithm> {
    public ObservabilityPipelineCrowdStrikeNextGenSiemDestinationCompressionAlgorithmSerializer(
        Class<ObservabilityPipelineCrowdStrikeNextGenSiemDestinationCompressionAlgorithm> t) {
      super(t);
    }

    public ObservabilityPipelineCrowdStrikeNextGenSiemDestinationCompressionAlgorithmSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ObservabilityPipelineCrowdStrikeNextGenSiemDestinationCompressionAlgorithm value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ObservabilityPipelineCrowdStrikeNextGenSiemDestinationCompressionAlgorithm
      fromValue(String value) {
    return new ObservabilityPipelineCrowdStrikeNextGenSiemDestinationCompressionAlgorithm(value);
  }
}
