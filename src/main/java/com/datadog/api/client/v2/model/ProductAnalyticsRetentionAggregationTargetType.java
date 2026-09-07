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

/** The discriminator identifying a target selected by aggregation. */
@JsonSerialize(
    using =
        ProductAnalyticsRetentionAggregationTargetType
            .ProductAnalyticsRetentionAggregationTargetTypeSerializer.class)
public class ProductAnalyticsRetentionAggregationTargetType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("aggregation"));

  public static final ProductAnalyticsRetentionAggregationTargetType AGGREGATION =
      new ProductAnalyticsRetentionAggregationTargetType("aggregation");

  ProductAnalyticsRetentionAggregationTargetType(String value) {
    super(value, allowedValues);
  }

  public static class ProductAnalyticsRetentionAggregationTargetTypeSerializer
      extends StdSerializer<ProductAnalyticsRetentionAggregationTargetType> {
    public ProductAnalyticsRetentionAggregationTargetTypeSerializer(
        Class<ProductAnalyticsRetentionAggregationTargetType> t) {
      super(t);
    }

    public ProductAnalyticsRetentionAggregationTargetTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ProductAnalyticsRetentionAggregationTargetType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ProductAnalyticsRetentionAggregationTargetType fromValue(String value) {
    return new ProductAnalyticsRetentionAggregationTargetType(value);
  }
}
