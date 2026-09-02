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

/** The data source identifier for occurrence queries. */
@JsonSerialize(
    using =
        ProductAnalyticsOccurrenceQueryDataSource
            .ProductAnalyticsOccurrenceQueryDataSourceSerializer.class)
public class ProductAnalyticsOccurrenceQueryDataSource extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("product_analytics_occurrence"));

  public static final ProductAnalyticsOccurrenceQueryDataSource PRODUCT_ANALYTICS_OCCURRENCE =
      new ProductAnalyticsOccurrenceQueryDataSource("product_analytics_occurrence");

  ProductAnalyticsOccurrenceQueryDataSource(String value) {
    super(value, allowedValues);
  }

  public static class ProductAnalyticsOccurrenceQueryDataSourceSerializer
      extends StdSerializer<ProductAnalyticsOccurrenceQueryDataSource> {
    public ProductAnalyticsOccurrenceQueryDataSourceSerializer(
        Class<ProductAnalyticsOccurrenceQueryDataSource> t) {
      super(t);
    }

    public ProductAnalyticsOccurrenceQueryDataSourceSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ProductAnalyticsOccurrenceQueryDataSource value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ProductAnalyticsOccurrenceQueryDataSource fromValue(String value) {
    return new ProductAnalyticsOccurrenceQueryDataSource(value);
  }
}
