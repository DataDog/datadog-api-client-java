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

/** The resource type identifier for an analytics list response. */
@JsonSerialize(
    using =
        ProductAnalyticsAnalyticsListResponseType
            .ProductAnalyticsAnalyticsListResponseTypeSerializer.class)
public class ProductAnalyticsAnalyticsListResponseType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("list_response"));

  public static final ProductAnalyticsAnalyticsListResponseType LIST_RESPONSE =
      new ProductAnalyticsAnalyticsListResponseType("list_response");

  ProductAnalyticsAnalyticsListResponseType(String value) {
    super(value, allowedValues);
  }

  public static class ProductAnalyticsAnalyticsListResponseTypeSerializer
      extends StdSerializer<ProductAnalyticsAnalyticsListResponseType> {
    public ProductAnalyticsAnalyticsListResponseTypeSerializer(
        Class<ProductAnalyticsAnalyticsListResponseType> t) {
      super(t);
    }

    public ProductAnalyticsAnalyticsListResponseTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ProductAnalyticsAnalyticsListResponseType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ProductAnalyticsAnalyticsListResponseType fromValue(String value) {
    return new ProductAnalyticsAnalyticsListResponseType(value);
  }
}
