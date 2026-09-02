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

/** The version of the product catalog contract to return. */
@JsonSerialize(using = ProductCatalogSKUsAPIVersion.ProductCatalogSKUsAPIVersionSerializer.class)
public class ProductCatalogSKUsAPIVersion extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("v1"));

  public static final ProductCatalogSKUsAPIVersion V1 = new ProductCatalogSKUsAPIVersion("v1");

  ProductCatalogSKUsAPIVersion(String value) {
    super(value, allowedValues);
  }

  public static class ProductCatalogSKUsAPIVersionSerializer
      extends StdSerializer<ProductCatalogSKUsAPIVersion> {
    public ProductCatalogSKUsAPIVersionSerializer(Class<ProductCatalogSKUsAPIVersion> t) {
      super(t);
    }

    public ProductCatalogSKUsAPIVersionSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ProductCatalogSKUsAPIVersion value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ProductCatalogSKUsAPIVersion fromValue(String value) {
    return new ProductCatalogSKUsAPIVersion(value);
  }
}
