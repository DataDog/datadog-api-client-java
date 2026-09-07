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

/** The resource type identifier for a retention list request. */
@JsonSerialize(
    using =
        ProductAnalyticsRetentionListRequestType.ProductAnalyticsRetentionListRequestTypeSerializer
            .class)
public class ProductAnalyticsRetentionListRequestType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("retention_list_request"));

  public static final ProductAnalyticsRetentionListRequestType RETENTION_LIST_REQUEST =
      new ProductAnalyticsRetentionListRequestType("retention_list_request");

  ProductAnalyticsRetentionListRequestType(String value) {
    super(value, allowedValues);
  }

  public static class ProductAnalyticsRetentionListRequestTypeSerializer
      extends StdSerializer<ProductAnalyticsRetentionListRequestType> {
    public ProductAnalyticsRetentionListRequestTypeSerializer(
        Class<ProductAnalyticsRetentionListRequestType> t) {
      super(t);
    }

    public ProductAnalyticsRetentionListRequestTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ProductAnalyticsRetentionListRequestType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ProductAnalyticsRetentionListRequestType fromValue(String value) {
    return new ProductAnalyticsRetentionListRequestType(value);
  }
}
