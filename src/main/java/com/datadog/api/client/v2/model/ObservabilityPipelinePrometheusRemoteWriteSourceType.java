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

/** The source type. The value should always be <code>prometheus_remote_write</code>. */
@JsonSerialize(
    using =
        ObservabilityPipelinePrometheusRemoteWriteSourceType
            .ObservabilityPipelinePrometheusRemoteWriteSourceTypeSerializer.class)
public class ObservabilityPipelinePrometheusRemoteWriteSourceType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("prometheus_remote_write"));

  public static final ObservabilityPipelinePrometheusRemoteWriteSourceType PROMETHEUS_REMOTE_WRITE =
      new ObservabilityPipelinePrometheusRemoteWriteSourceType("prometheus_remote_write");

  ObservabilityPipelinePrometheusRemoteWriteSourceType(String value) {
    super(value, allowedValues);
  }

  public static class ObservabilityPipelinePrometheusRemoteWriteSourceTypeSerializer
      extends StdSerializer<ObservabilityPipelinePrometheusRemoteWriteSourceType> {
    public ObservabilityPipelinePrometheusRemoteWriteSourceTypeSerializer(
        Class<ObservabilityPipelinePrometheusRemoteWriteSourceType> t) {
      super(t);
    }

    public ObservabilityPipelinePrometheusRemoteWriteSourceTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ObservabilityPipelinePrometheusRemoteWriteSourceType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ObservabilityPipelinePrometheusRemoteWriteSourceType fromValue(String value) {
    return new ObservabilityPipelinePrometheusRemoteWriteSourceType(value);
  }
}
