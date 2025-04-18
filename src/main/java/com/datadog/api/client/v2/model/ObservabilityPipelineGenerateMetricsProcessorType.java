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

/** The processor type. Always <code>generate_datadog_metrics</code>. */
@JsonSerialize(
    using =
        ObservabilityPipelineGenerateMetricsProcessorType
            .ObservabilityPipelineGenerateMetricsProcessorTypeSerializer.class)
public class ObservabilityPipelineGenerateMetricsProcessorType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("generate_datadog_metrics"));

  public static final ObservabilityPipelineGenerateMetricsProcessorType GENERATE_DATADOG_METRICS =
      new ObservabilityPipelineGenerateMetricsProcessorType("generate_datadog_metrics");

  ObservabilityPipelineGenerateMetricsProcessorType(String value) {
    super(value, allowedValues);
  }

  public static class ObservabilityPipelineGenerateMetricsProcessorTypeSerializer
      extends StdSerializer<ObservabilityPipelineGenerateMetricsProcessorType> {
    public ObservabilityPipelineGenerateMetricsProcessorTypeSerializer(
        Class<ObservabilityPipelineGenerateMetricsProcessorType> t) {
      super(t);
    }

    public ObservabilityPipelineGenerateMetricsProcessorTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ObservabilityPipelineGenerateMetricsProcessorType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ObservabilityPipelineGenerateMetricsProcessorType fromValue(String value) {
    return new ObservabilityPipelineGenerateMetricsProcessorType(value);
  }
}
