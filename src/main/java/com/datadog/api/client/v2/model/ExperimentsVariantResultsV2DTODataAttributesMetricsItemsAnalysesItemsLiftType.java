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

/** Whether the reported lift is relative or absolute. */
@JsonSerialize(
    using =
        ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItemsLiftType
            .ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItemsLiftTypeSerializer
            .class)
public class ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItemsLiftType
    extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("RELATIVE", "ABSOLUTE", "UNKNOWN"));

  public static final ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItemsLiftType
      RELATIVE =
          new ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItemsLiftType(
              "RELATIVE");
  public static final ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItemsLiftType
      ABSOLUTE =
          new ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItemsLiftType(
              "ABSOLUTE");
  public static final ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItemsLiftType
      UNKNOWN =
          new ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItemsLiftType(
              "UNKNOWN");

  ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItemsLiftType(String value) {
    super(value, allowedValues);
  }

  public static
  class ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItemsLiftTypeSerializer
      extends StdSerializer<
          ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItemsLiftType> {
    public ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItemsLiftTypeSerializer(
        Class<ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItemsLiftType> t) {
      super(t);
    }

    public
    ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItemsLiftTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItemsLiftType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItemsLiftType
      fromValue(String value) {
    return new ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItemsLiftType(value);
  }
}
