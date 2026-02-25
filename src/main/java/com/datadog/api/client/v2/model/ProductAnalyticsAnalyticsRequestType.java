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

/** The resource type for analytics requests. */
@JsonSerialize(
    using =
        ProductAnalyticsAnalyticsRequestType.ProductAnalyticsAnalyticsRequestTypeSerializer.class)
public class ProductAnalyticsAnalyticsRequestType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("formula_analytics_extended_request"));

  public static final ProductAnalyticsAnalyticsRequestType FORMULA_ANALYTICS_EXTENDED_REQUEST =
      new ProductAnalyticsAnalyticsRequestType("formula_analytics_extended_request");

  ProductAnalyticsAnalyticsRequestType(String value) {
    super(value, allowedValues);
  }

  public static class ProductAnalyticsAnalyticsRequestTypeSerializer
      extends StdSerializer<ProductAnalyticsAnalyticsRequestType> {
    public ProductAnalyticsAnalyticsRequestTypeSerializer(
        Class<ProductAnalyticsAnalyticsRequestType> t) {
      super(t);
    }

    public ProductAnalyticsAnalyticsRequestTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ProductAnalyticsAnalyticsRequestType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ProductAnalyticsAnalyticsRequestType fromValue(String value) {
    return new ProductAnalyticsAnalyticsRequestType(value);
  }
}
