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

/** Statistical method used to calculate this result. */
@JsonSerialize(
    using =
        ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItemsMethod
            .ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItemsMethodSerializer
            .class)
public class ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItemsMethod
    extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "FIXED_SAMPLE", "BAYESIAN", "SEQUENTIAL", "SEQUENTIAL_FIXED_HYBRID", "UNKNOWN"));

  public static final ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItemsMethod
      FIXED_SAMPLE =
          new ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItemsMethod(
              "FIXED_SAMPLE");
  public static final ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItemsMethod
      BAYESIAN =
          new ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItemsMethod(
              "BAYESIAN");
  public static final ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItemsMethod
      SEQUENTIAL =
          new ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItemsMethod(
              "SEQUENTIAL");
  public static final ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItemsMethod
      SEQUENTIAL_FIXED_HYBRID =
          new ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItemsMethod(
              "SEQUENTIAL_FIXED_HYBRID");
  public static final ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItemsMethod
      UNKNOWN =
          new ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItemsMethod(
              "UNKNOWN");

  ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItemsMethod(String value) {
    super(value, allowedValues);
  }

  public static
  class ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItemsMethodSerializer
      extends StdSerializer<
          ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItemsMethod> {
    public ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItemsMethodSerializer(
        Class<ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItemsMethod> t) {
      super(t);
    }

    public ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItemsMethodSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItemsMethod value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItemsMethod
      fromValue(String value) {
    return new ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItemsMethod(value);
  }
}
