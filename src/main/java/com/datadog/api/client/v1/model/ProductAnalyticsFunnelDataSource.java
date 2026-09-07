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

/** Data source for user journey funnel queries. */
@JsonSerialize(
    using = ProductAnalyticsFunnelDataSource.ProductAnalyticsFunnelDataSourceSerializer.class)
public class ProductAnalyticsFunnelDataSource extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("product_analytics_journey"));

  public static final ProductAnalyticsFunnelDataSource PRODUCT_ANALYTICS_JOURNEY =
      new ProductAnalyticsFunnelDataSource("product_analytics_journey");

  ProductAnalyticsFunnelDataSource(String value) {
    super(value, allowedValues);
  }

  public static class ProductAnalyticsFunnelDataSourceSerializer
      extends StdSerializer<ProductAnalyticsFunnelDataSource> {
    public ProductAnalyticsFunnelDataSourceSerializer(Class<ProductAnalyticsFunnelDataSource> t) {
      super(t);
    }

    public ProductAnalyticsFunnelDataSourceSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ProductAnalyticsFunnelDataSource value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ProductAnalyticsFunnelDataSource fromValue(String value) {
    return new ProductAnalyticsFunnelDataSource(value);
  }
}
