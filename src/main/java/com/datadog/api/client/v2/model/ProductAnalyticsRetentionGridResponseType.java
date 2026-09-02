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

/** The resource type identifier for a retention grid response. */
@JsonSerialize(
    using =
        ProductAnalyticsRetentionGridResponseType
            .ProductAnalyticsRetentionGridResponseTypeSerializer.class)
public class ProductAnalyticsRetentionGridResponseType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("retention_grid_response"));

  public static final ProductAnalyticsRetentionGridResponseType RETENTION_GRID_RESPONSE =
      new ProductAnalyticsRetentionGridResponseType("retention_grid_response");

  ProductAnalyticsRetentionGridResponseType(String value) {
    super(value, allowedValues);
  }

  public static class ProductAnalyticsRetentionGridResponseTypeSerializer
      extends StdSerializer<ProductAnalyticsRetentionGridResponseType> {
    public ProductAnalyticsRetentionGridResponseTypeSerializer(
        Class<ProductAnalyticsRetentionGridResponseType> t) {
      super(t);
    }

    public ProductAnalyticsRetentionGridResponseTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ProductAnalyticsRetentionGridResponseType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ProductAnalyticsRetentionGridResponseType fromValue(String value) {
    return new ProductAnalyticsRetentionGridResponseType(value);
  }
}
