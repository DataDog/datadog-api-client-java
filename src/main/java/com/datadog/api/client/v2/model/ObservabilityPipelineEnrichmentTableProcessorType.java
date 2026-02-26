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

/** The processor type. The value should always be <code>enrichment_table</code>. */
@JsonSerialize(
    using =
        ObservabilityPipelineEnrichmentTableProcessorType
            .ObservabilityPipelineEnrichmentTableProcessorTypeSerializer.class)
public class ObservabilityPipelineEnrichmentTableProcessorType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("enrichment_table"));

  public static final ObservabilityPipelineEnrichmentTableProcessorType ENRICHMENT_TABLE =
      new ObservabilityPipelineEnrichmentTableProcessorType("enrichment_table");

  ObservabilityPipelineEnrichmentTableProcessorType(String value) {
    super(value, allowedValues);
  }

  public static class ObservabilityPipelineEnrichmentTableProcessorTypeSerializer
      extends StdSerializer<ObservabilityPipelineEnrichmentTableProcessorType> {
    public ObservabilityPipelineEnrichmentTableProcessorTypeSerializer(
        Class<ObservabilityPipelineEnrichmentTableProcessorType> t) {
      super(t);
    }

    public ObservabilityPipelineEnrichmentTableProcessorTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ObservabilityPipelineEnrichmentTableProcessorType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ObservabilityPipelineEnrichmentTableProcessorType fromValue(String value) {
    return new ObservabilityPipelineEnrichmentTableProcessorType(value);
  }
}
