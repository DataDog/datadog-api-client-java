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

/** Reason that the statistical result is marked as unreliable. */
@JsonSerialize(
    using =
        ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItemsUnreliableReason
            .ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItemsUnreliableReasonSerializer
            .class)
public class ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItemsUnreliableReason
    extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "CONTROL_DENOMINATOR_NEAR_ZERO",
              "TREATMENT_DENOMINATOR_NEAR_ZERO",
              "CONTROL_AND_TREATMENT_DENOMINATORS_NEAR_ZERO",
              "CONTROL_MEAN_NEAR_ZERO",
              "ZERO_VARIANCE",
              "UNKNOWN"));

  public static final
  ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItemsUnreliableReason
      CONTROL_DENOMINATOR_NEAR_ZERO =
          new ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItemsUnreliableReason(
              "CONTROL_DENOMINATOR_NEAR_ZERO");
  public static final
  ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItemsUnreliableReason
      TREATMENT_DENOMINATOR_NEAR_ZERO =
          new ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItemsUnreliableReason(
              "TREATMENT_DENOMINATOR_NEAR_ZERO");
  public static final
  ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItemsUnreliableReason
      CONTROL_AND_TREATMENT_DENOMINATORS_NEAR_ZERO =
          new ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItemsUnreliableReason(
              "CONTROL_AND_TREATMENT_DENOMINATORS_NEAR_ZERO");
  public static final
  ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItemsUnreliableReason
      CONTROL_MEAN_NEAR_ZERO =
          new ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItemsUnreliableReason(
              "CONTROL_MEAN_NEAR_ZERO");
  public static final
  ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItemsUnreliableReason
      ZERO_VARIANCE =
          new ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItemsUnreliableReason(
              "ZERO_VARIANCE");
  public static final
  ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItemsUnreliableReason UNKNOWN =
      new ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItemsUnreliableReason(
          "UNKNOWN");

  ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItemsUnreliableReason(
      String value) {
    super(value, allowedValues);
  }

  public static
  class ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItemsUnreliableReasonSerializer
      extends StdSerializer<
          ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItemsUnreliableReason> {
    public
    ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItemsUnreliableReasonSerializer(
        Class<ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItemsUnreliableReason>
            t) {
      super(t);
    }

    public
    ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItemsUnreliableReasonSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItemsUnreliableReason value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static
  ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItemsUnreliableReason fromValue(
      String value) {
    return new ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItemsUnreliableReason(
        value);
  }
}
