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

/** Defines how to compare key fields for enrichment table lookups. */
@JsonSerialize(
    using =
        ObservabilityPipelineEnrichmentTableFileKeyItemsComparison
            .ObservabilityPipelineEnrichmentTableFileKeyItemsComparisonSerializer.class)
public class ObservabilityPipelineEnrichmentTableFileKeyItemsComparison extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("equals"));

  public static final ObservabilityPipelineEnrichmentTableFileKeyItemsComparison EQUALS =
      new ObservabilityPipelineEnrichmentTableFileKeyItemsComparison("equals");

  ObservabilityPipelineEnrichmentTableFileKeyItemsComparison(String value) {
    super(value, allowedValues);
  }

  public static class ObservabilityPipelineEnrichmentTableFileKeyItemsComparisonSerializer
      extends StdSerializer<ObservabilityPipelineEnrichmentTableFileKeyItemsComparison> {
    public ObservabilityPipelineEnrichmentTableFileKeyItemsComparisonSerializer(
        Class<ObservabilityPipelineEnrichmentTableFileKeyItemsComparison> t) {
      super(t);
    }

    public ObservabilityPipelineEnrichmentTableFileKeyItemsComparisonSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ObservabilityPipelineEnrichmentTableFileKeyItemsComparison value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ObservabilityPipelineEnrichmentTableFileKeyItemsComparison fromValue(String value) {
    return new ObservabilityPipelineEnrichmentTableFileKeyItemsComparison(value);
  }
}
