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

/** The retention metric to compute, either an absolute count or a rate. */
@JsonSerialize(
    using =
        ProductAnalyticsRetentionComputeMetric.ProductAnalyticsRetentionComputeMetricSerializer
            .class)
public class ProductAnalyticsRetentionComputeMetric extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("__dd.retention", "__dd.retention_rate"));

  public static final ProductAnalyticsRetentionComputeMetric RETENTION =
      new ProductAnalyticsRetentionComputeMetric("__dd.retention");
  public static final ProductAnalyticsRetentionComputeMetric RETENTION_RATE =
      new ProductAnalyticsRetentionComputeMetric("__dd.retention_rate");

  ProductAnalyticsRetentionComputeMetric(String value) {
    super(value, allowedValues);
  }

  public static class ProductAnalyticsRetentionComputeMetricSerializer
      extends StdSerializer<ProductAnalyticsRetentionComputeMetric> {
    public ProductAnalyticsRetentionComputeMetricSerializer(
        Class<ProductAnalyticsRetentionComputeMetric> t) {
      super(t);
    }

    public ProductAnalyticsRetentionComputeMetricSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ProductAnalyticsRetentionComputeMetric value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ProductAnalyticsRetentionComputeMetric fromValue(String value) {
    return new ProductAnalyticsRetentionComputeMetric(value);
  }
}
