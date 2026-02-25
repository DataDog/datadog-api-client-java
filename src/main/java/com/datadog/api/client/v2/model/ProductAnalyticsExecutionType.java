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

/** Override the query execution strategy. */
@JsonSerialize(using = ProductAnalyticsExecutionType.ProductAnalyticsExecutionTypeSerializer.class)
public class ProductAnalyticsExecutionType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList("simple", "background", "trino-multistep", "materialized-view"));

  public static final ProductAnalyticsExecutionType SIMPLE =
      new ProductAnalyticsExecutionType("simple");
  public static final ProductAnalyticsExecutionType BACKGROUND =
      new ProductAnalyticsExecutionType("background");
  public static final ProductAnalyticsExecutionType TRINO_MULTISTEP =
      new ProductAnalyticsExecutionType("trino-multistep");
  public static final ProductAnalyticsExecutionType MATERIALIZED_VIEW =
      new ProductAnalyticsExecutionType("materialized-view");

  ProductAnalyticsExecutionType(String value) {
    super(value, allowedValues);
  }

  public static class ProductAnalyticsExecutionTypeSerializer
      extends StdSerializer<ProductAnalyticsExecutionType> {
    public ProductAnalyticsExecutionTypeSerializer(Class<ProductAnalyticsExecutionType> t) {
      super(t);
    }

    public ProductAnalyticsExecutionTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ProductAnalyticsExecutionType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ProductAnalyticsExecutionType fromValue(String value) {
    return new ProductAnalyticsExecutionType(value);
  }
}
