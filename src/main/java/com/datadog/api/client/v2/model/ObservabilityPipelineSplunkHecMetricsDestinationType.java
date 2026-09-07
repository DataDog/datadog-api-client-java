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

/** The destination type. Always <code>splunk_hec_metrics</code>. */
@JsonSerialize(
    using =
        ObservabilityPipelineSplunkHecMetricsDestinationType
            .ObservabilityPipelineSplunkHecMetricsDestinationTypeSerializer.class)
public class ObservabilityPipelineSplunkHecMetricsDestinationType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("splunk_hec_metrics"));

  public static final ObservabilityPipelineSplunkHecMetricsDestinationType SPLUNK_HEC_METRICS =
      new ObservabilityPipelineSplunkHecMetricsDestinationType("splunk_hec_metrics");

  ObservabilityPipelineSplunkHecMetricsDestinationType(String value) {
    super(value, allowedValues);
  }

  public static class ObservabilityPipelineSplunkHecMetricsDestinationTypeSerializer
      extends StdSerializer<ObservabilityPipelineSplunkHecMetricsDestinationType> {
    public ObservabilityPipelineSplunkHecMetricsDestinationTypeSerializer(
        Class<ObservabilityPipelineSplunkHecMetricsDestinationType> t) {
      super(t);
    }

    public ObservabilityPipelineSplunkHecMetricsDestinationTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ObservabilityPipelineSplunkHecMetricsDestinationType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ObservabilityPipelineSplunkHecMetricsDestinationType fromValue(String value) {
    return new ObservabilityPipelineSplunkHecMetricsDestinationType(value);
  }
}
