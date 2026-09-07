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

/** The entity whose retention is measured. */
@JsonSerialize(
    using = ProductAnalyticsRetentionEntity.ProductAnalyticsRetentionEntitySerializer.class)
public class ProductAnalyticsRetentionEntity extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("@usr.id", "@account.id"));

  public static final ProductAnalyticsRetentionEntity USER_ID =
      new ProductAnalyticsRetentionEntity("@usr.id");
  public static final ProductAnalyticsRetentionEntity ACCOUNT_ID =
      new ProductAnalyticsRetentionEntity("@account.id");

  ProductAnalyticsRetentionEntity(String value) {
    super(value, allowedValues);
  }

  public static class ProductAnalyticsRetentionEntitySerializer
      extends StdSerializer<ProductAnalyticsRetentionEntity> {
    public ProductAnalyticsRetentionEntitySerializer(Class<ProductAnalyticsRetentionEntity> t) {
      super(t);
    }

    public ProductAnalyticsRetentionEntitySerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ProductAnalyticsRetentionEntity value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ProductAnalyticsRetentionEntity fromValue(String value) {
    return new ProductAnalyticsRetentionEntity(value);
  }
}
