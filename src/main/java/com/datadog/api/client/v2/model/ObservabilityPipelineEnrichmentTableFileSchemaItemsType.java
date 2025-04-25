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

/** Declares allowed data types for enrichment table columns. */
@JsonSerialize(
    using =
        ObservabilityPipelineEnrichmentTableFileSchemaItemsType
            .ObservabilityPipelineEnrichmentTableFileSchemaItemsTypeSerializer.class)
public class ObservabilityPipelineEnrichmentTableFileSchemaItemsType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList("string", "boolean", "integer", "float", "date", "timestamp"));

  public static final ObservabilityPipelineEnrichmentTableFileSchemaItemsType STRING =
      new ObservabilityPipelineEnrichmentTableFileSchemaItemsType("string");
  public static final ObservabilityPipelineEnrichmentTableFileSchemaItemsType BOOLEAN =
      new ObservabilityPipelineEnrichmentTableFileSchemaItemsType("boolean");
  public static final ObservabilityPipelineEnrichmentTableFileSchemaItemsType INTEGER =
      new ObservabilityPipelineEnrichmentTableFileSchemaItemsType("integer");
  public static final ObservabilityPipelineEnrichmentTableFileSchemaItemsType FLOAT =
      new ObservabilityPipelineEnrichmentTableFileSchemaItemsType("float");
  public static final ObservabilityPipelineEnrichmentTableFileSchemaItemsType DATE =
      new ObservabilityPipelineEnrichmentTableFileSchemaItemsType("date");
  public static final ObservabilityPipelineEnrichmentTableFileSchemaItemsType TIMESTAMP =
      new ObservabilityPipelineEnrichmentTableFileSchemaItemsType("timestamp");

  ObservabilityPipelineEnrichmentTableFileSchemaItemsType(String value) {
    super(value, allowedValues);
  }

  public static class ObservabilityPipelineEnrichmentTableFileSchemaItemsTypeSerializer
      extends StdSerializer<ObservabilityPipelineEnrichmentTableFileSchemaItemsType> {
    public ObservabilityPipelineEnrichmentTableFileSchemaItemsTypeSerializer(
        Class<ObservabilityPipelineEnrichmentTableFileSchemaItemsType> t) {
      super(t);
    }

    public ObservabilityPipelineEnrichmentTableFileSchemaItemsTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ObservabilityPipelineEnrichmentTableFileSchemaItemsType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ObservabilityPipelineEnrichmentTableFileSchemaItemsType fromValue(String value) {
    return new ObservabilityPipelineEnrichmentTableFileSchemaItemsType(value);
  }
}
