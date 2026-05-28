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

/** Compression algorithm applied when sending metrics to Splunk HEC. */
@JsonSerialize(
    using =
        ObservabilityPipelineSplunkHecMetricsDestinationCompression
            .ObservabilityPipelineSplunkHecMetricsDestinationCompressionSerializer.class)
public class ObservabilityPipelineSplunkHecMetricsDestinationCompression extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("none", "gzip"));

  public static final ObservabilityPipelineSplunkHecMetricsDestinationCompression NONE =
      new ObservabilityPipelineSplunkHecMetricsDestinationCompression("none");
  public static final ObservabilityPipelineSplunkHecMetricsDestinationCompression GZIP =
      new ObservabilityPipelineSplunkHecMetricsDestinationCompression("gzip");

  ObservabilityPipelineSplunkHecMetricsDestinationCompression(String value) {
    super(value, allowedValues);
  }

  public static class ObservabilityPipelineSplunkHecMetricsDestinationCompressionSerializer
      extends StdSerializer<ObservabilityPipelineSplunkHecMetricsDestinationCompression> {
    public ObservabilityPipelineSplunkHecMetricsDestinationCompressionSerializer(
        Class<ObservabilityPipelineSplunkHecMetricsDestinationCompression> t) {
      super(t);
    }

    public ObservabilityPipelineSplunkHecMetricsDestinationCompressionSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ObservabilityPipelineSplunkHecMetricsDestinationCompression value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ObservabilityPipelineSplunkHecMetricsDestinationCompression fromValue(
      String value) {
    return new ObservabilityPipelineSplunkHecMetricsDestinationCompression(value);
  }
}
