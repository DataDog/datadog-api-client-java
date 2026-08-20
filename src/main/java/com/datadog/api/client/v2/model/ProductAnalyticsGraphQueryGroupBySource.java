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

/** Audience dimension to group by, instead of an event facet. */
@JsonSerialize(
    using =
        ProductAnalyticsGraphQueryGroupBySource.ProductAnalyticsGraphQueryGroupBySourceSerializer
            .class)
public class ProductAnalyticsGraphQueryGroupBySource extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "product_analytics_audience_filters.users",
              "product_analytics_audience_filters.accounts"));

  public static final ProductAnalyticsGraphQueryGroupBySource USERS =
      new ProductAnalyticsGraphQueryGroupBySource("product_analytics_audience_filters.users");
  public static final ProductAnalyticsGraphQueryGroupBySource ACCOUNTS =
      new ProductAnalyticsGraphQueryGroupBySource("product_analytics_audience_filters.accounts");

  ProductAnalyticsGraphQueryGroupBySource(String value) {
    super(value, allowedValues);
  }

  public static class ProductAnalyticsGraphQueryGroupBySourceSerializer
      extends StdSerializer<ProductAnalyticsGraphQueryGroupBySource> {
    public ProductAnalyticsGraphQueryGroupBySourceSerializer(
        Class<ProductAnalyticsGraphQueryGroupBySource> t) {
      super(t);
    }

    public ProductAnalyticsGraphQueryGroupBySourceSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ProductAnalyticsGraphQueryGroupBySource value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ProductAnalyticsGraphQueryGroupBySource fromValue(String value) {
    return new ProductAnalyticsGraphQueryGroupBySource(value);
  }
}
