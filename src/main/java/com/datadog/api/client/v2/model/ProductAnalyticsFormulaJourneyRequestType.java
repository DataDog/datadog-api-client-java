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

/** The resource type identifier for a journey timeseries or scalar request. */
@JsonSerialize(
    using =
        ProductAnalyticsFormulaJourneyRequestType
            .ProductAnalyticsFormulaJourneyRequestTypeSerializer.class)
public class ProductAnalyticsFormulaJourneyRequestType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("formula_journey_request"));

  public static final ProductAnalyticsFormulaJourneyRequestType FORMULA_JOURNEY_REQUEST =
      new ProductAnalyticsFormulaJourneyRequestType("formula_journey_request");

  ProductAnalyticsFormulaJourneyRequestType(String value) {
    super(value, allowedValues);
  }

  public static class ProductAnalyticsFormulaJourneyRequestTypeSerializer
      extends StdSerializer<ProductAnalyticsFormulaJourneyRequestType> {
    public ProductAnalyticsFormulaJourneyRequestTypeSerializer(
        Class<ProductAnalyticsFormulaJourneyRequestType> t) {
      super(t);
    }

    public ProductAnalyticsFormulaJourneyRequestTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ProductAnalyticsFormulaJourneyRequestType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ProductAnalyticsFormulaJourneyRequestType fromValue(String value) {
    return new ProductAnalyticsFormulaJourneyRequestType(value);
  }
}
