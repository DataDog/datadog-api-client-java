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

/** The resource type identifier for a retention grid request. */
@JsonSerialize(
    using =
        ProductAnalyticsRetentionGridRequestType.ProductAnalyticsRetentionGridRequestTypeSerializer
            .class)
public class ProductAnalyticsRetentionGridRequestType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("retention_grid_request"));

  public static final ProductAnalyticsRetentionGridRequestType RETENTION_GRID_REQUEST =
      new ProductAnalyticsRetentionGridRequestType("retention_grid_request");

  ProductAnalyticsRetentionGridRequestType(String value) {
    super(value, allowedValues);
  }

  public static class ProductAnalyticsRetentionGridRequestTypeSerializer
      extends StdSerializer<ProductAnalyticsRetentionGridRequestType> {
    public ProductAnalyticsRetentionGridRequestTypeSerializer(
        Class<ProductAnalyticsRetentionGridRequestType> t) {
      super(t);
    }

    public ProductAnalyticsRetentionGridRequestTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ProductAnalyticsRetentionGridRequestType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ProductAnalyticsRetentionGridRequestType fromValue(String value) {
    return new ProductAnalyticsRetentionGridRequestType(value);
  }
}
