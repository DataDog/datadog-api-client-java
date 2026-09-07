/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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

/** Aggregation type for user journey funnel compute. */
@JsonSerialize(
    using =
        ProductAnalyticsFunnelComputeAggregation.ProductAnalyticsFunnelComputeAggregationSerializer
            .class)
public class ProductAnalyticsFunnelComputeAggregation extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("cardinality", "count"));

  public static final ProductAnalyticsFunnelComputeAggregation CARDINALITY =
      new ProductAnalyticsFunnelComputeAggregation("cardinality");
  public static final ProductAnalyticsFunnelComputeAggregation COUNT =
      new ProductAnalyticsFunnelComputeAggregation("count");

  ProductAnalyticsFunnelComputeAggregation(String value) {
    super(value, allowedValues);
  }

  public static class ProductAnalyticsFunnelComputeAggregationSerializer
      extends StdSerializer<ProductAnalyticsFunnelComputeAggregation> {
    public ProductAnalyticsFunnelComputeAggregationSerializer(
        Class<ProductAnalyticsFunnelComputeAggregation> t) {
      super(t);
    }

    public ProductAnalyticsFunnelComputeAggregationSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ProductAnalyticsFunnelComputeAggregation value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ProductAnalyticsFunnelComputeAggregation fromValue(String value) {
    return new ProductAnalyticsFunnelComputeAggregation(value);
  }
}
