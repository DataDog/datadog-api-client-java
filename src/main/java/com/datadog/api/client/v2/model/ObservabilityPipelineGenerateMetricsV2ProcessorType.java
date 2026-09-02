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

/** The processor type. Always <code>generate_metrics</code>. */
@JsonSerialize(
    using =
        ObservabilityPipelineGenerateMetricsV2ProcessorType
            .ObservabilityPipelineGenerateMetricsV2ProcessorTypeSerializer.class)
public class ObservabilityPipelineGenerateMetricsV2ProcessorType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("generate_metrics"));

  public static final ObservabilityPipelineGenerateMetricsV2ProcessorType GENERATE_METRICS =
      new ObservabilityPipelineGenerateMetricsV2ProcessorType("generate_metrics");

  ObservabilityPipelineGenerateMetricsV2ProcessorType(String value) {
    super(value, allowedValues);
  }

  public static class ObservabilityPipelineGenerateMetricsV2ProcessorTypeSerializer
      extends StdSerializer<ObservabilityPipelineGenerateMetricsV2ProcessorType> {
    public ObservabilityPipelineGenerateMetricsV2ProcessorTypeSerializer(
        Class<ObservabilityPipelineGenerateMetricsV2ProcessorType> t) {
      super(t);
    }

    public ObservabilityPipelineGenerateMetricsV2ProcessorTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ObservabilityPipelineGenerateMetricsV2ProcessorType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ObservabilityPipelineGenerateMetricsV2ProcessorType fromValue(String value) {
    return new ObservabilityPipelineGenerateMetricsV2ProcessorType(value);
  }
}
