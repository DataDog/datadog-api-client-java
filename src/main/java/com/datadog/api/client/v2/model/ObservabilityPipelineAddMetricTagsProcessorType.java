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

/** The processor type. The value must be <code>add_metric_tags</code>. */
@JsonSerialize(
    using =
        ObservabilityPipelineAddMetricTagsProcessorType
            .ObservabilityPipelineAddMetricTagsProcessorTypeSerializer.class)
public class ObservabilityPipelineAddMetricTagsProcessorType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("add_metric_tags"));

  public static final ObservabilityPipelineAddMetricTagsProcessorType ADD_METRIC_TAGS =
      new ObservabilityPipelineAddMetricTagsProcessorType("add_metric_tags");

  ObservabilityPipelineAddMetricTagsProcessorType(String value) {
    super(value, allowedValues);
  }

  public static class ObservabilityPipelineAddMetricTagsProcessorTypeSerializer
      extends StdSerializer<ObservabilityPipelineAddMetricTagsProcessorType> {
    public ObservabilityPipelineAddMetricTagsProcessorTypeSerializer(
        Class<ObservabilityPipelineAddMetricTagsProcessorType> t) {
      super(t);
    }

    public ObservabilityPipelineAddMetricTagsProcessorTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ObservabilityPipelineAddMetricTagsProcessorType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ObservabilityPipelineAddMetricTagsProcessorType fromValue(String value) {
    return new ObservabilityPipelineAddMetricTagsProcessorType(value);
  }
}
