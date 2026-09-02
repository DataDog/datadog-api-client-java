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

/** The compression algorithm applied when sending data to Elasticsearch. */
@JsonSerialize(
    using =
        ObservabilityPipelineElasticsearchDestinationCompressionAlgorithm
            .ObservabilityPipelineElasticsearchDestinationCompressionAlgorithmSerializer.class)
public class ObservabilityPipelineElasticsearchDestinationCompressionAlgorithm
    extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("none", "gzip", "zlib", "zstd", "snappy"));

  public static final ObservabilityPipelineElasticsearchDestinationCompressionAlgorithm NONE =
      new ObservabilityPipelineElasticsearchDestinationCompressionAlgorithm("none");
  public static final ObservabilityPipelineElasticsearchDestinationCompressionAlgorithm GZIP =
      new ObservabilityPipelineElasticsearchDestinationCompressionAlgorithm("gzip");
  public static final ObservabilityPipelineElasticsearchDestinationCompressionAlgorithm ZLIB =
      new ObservabilityPipelineElasticsearchDestinationCompressionAlgorithm("zlib");
  public static final ObservabilityPipelineElasticsearchDestinationCompressionAlgorithm ZSTD =
      new ObservabilityPipelineElasticsearchDestinationCompressionAlgorithm("zstd");
  public static final ObservabilityPipelineElasticsearchDestinationCompressionAlgorithm SNAPPY =
      new ObservabilityPipelineElasticsearchDestinationCompressionAlgorithm("snappy");

  ObservabilityPipelineElasticsearchDestinationCompressionAlgorithm(String value) {
    super(value, allowedValues);
  }

  public static class ObservabilityPipelineElasticsearchDestinationCompressionAlgorithmSerializer
      extends StdSerializer<ObservabilityPipelineElasticsearchDestinationCompressionAlgorithm> {
    public ObservabilityPipelineElasticsearchDestinationCompressionAlgorithmSerializer(
        Class<ObservabilityPipelineElasticsearchDestinationCompressionAlgorithm> t) {
      super(t);
    }

    public ObservabilityPipelineElasticsearchDestinationCompressionAlgorithmSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ObservabilityPipelineElasticsearchDestinationCompressionAlgorithm value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ObservabilityPipelineElasticsearchDestinationCompressionAlgorithm fromValue(
      String value) {
    return new ObservabilityPipelineElasticsearchDestinationCompressionAlgorithm(value);
  }
}
