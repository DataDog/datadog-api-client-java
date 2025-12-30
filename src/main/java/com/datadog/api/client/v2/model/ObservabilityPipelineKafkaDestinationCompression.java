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

/** Compression codec for Kafka messages. */
@JsonSerialize(
    using =
        ObservabilityPipelineKafkaDestinationCompression
            .ObservabilityPipelineKafkaDestinationCompressionSerializer.class)
public class ObservabilityPipelineKafkaDestinationCompression extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("none", "gzip", "snappy", "lz4", "zstd"));

  public static final ObservabilityPipelineKafkaDestinationCompression NONE =
      new ObservabilityPipelineKafkaDestinationCompression("none");
  public static final ObservabilityPipelineKafkaDestinationCompression GZIP =
      new ObservabilityPipelineKafkaDestinationCompression("gzip");
  public static final ObservabilityPipelineKafkaDestinationCompression SNAPPY =
      new ObservabilityPipelineKafkaDestinationCompression("snappy");
  public static final ObservabilityPipelineKafkaDestinationCompression LZ4 =
      new ObservabilityPipelineKafkaDestinationCompression("lz4");
  public static final ObservabilityPipelineKafkaDestinationCompression ZSTD =
      new ObservabilityPipelineKafkaDestinationCompression("zstd");

  ObservabilityPipelineKafkaDestinationCompression(String value) {
    super(value, allowedValues);
  }

  public static class ObservabilityPipelineKafkaDestinationCompressionSerializer
      extends StdSerializer<ObservabilityPipelineKafkaDestinationCompression> {
    public ObservabilityPipelineKafkaDestinationCompressionSerializer(
        Class<ObservabilityPipelineKafkaDestinationCompression> t) {
      super(t);
    }

    public ObservabilityPipelineKafkaDestinationCompressionSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ObservabilityPipelineKafkaDestinationCompression value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ObservabilityPipelineKafkaDestinationCompression fromValue(String value) {
    return new ObservabilityPipelineKafkaDestinationCompression(value);
  }
}
