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

/**
 * How the SKU is priced. <code>usage</code> prices each billable usage unit, and <code>percent
 * </code> prices a percentage; percent-priced SKUs have no <code>billing_units</code>.
 */
@JsonSerialize(using = ProductCatalogSKUPricingType.ProductCatalogSKUPricingTypeSerializer.class)
public class ProductCatalogSKUPricingType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("usage", "percent"));

  public static final ProductCatalogSKUPricingType USAGE =
      new ProductCatalogSKUPricingType("usage");
  public static final ProductCatalogSKUPricingType PERCENT =
      new ProductCatalogSKUPricingType("percent");

  ProductCatalogSKUPricingType(String value) {
    super(value, allowedValues);
  }

  public static class ProductCatalogSKUPricingTypeSerializer
      extends StdSerializer<ProductCatalogSKUPricingType> {
    public ProductCatalogSKUPricingTypeSerializer(Class<ProductCatalogSKUPricingType> t) {
      super(t);
    }

    public ProductCatalogSKUPricingTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ProductCatalogSKUPricingType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ProductCatalogSKUPricingType fromValue(String value) {
    return new ProductCatalogSKUPricingType(value);
  }
}
