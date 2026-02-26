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

/** OCI tenancy product resource type. */
@JsonSerialize(using = TenancyProductsDataType.TenancyProductsDataTypeSerializer.class)
public class TenancyProductsDataType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("oci_tenancy_product"));

  public static final TenancyProductsDataType OCI_TENANCY_PRODUCT =
      new TenancyProductsDataType("oci_tenancy_product");

  TenancyProductsDataType(String value) {
    super(value, allowedValues);
  }

  public static class TenancyProductsDataTypeSerializer
      extends StdSerializer<TenancyProductsDataType> {
    public TenancyProductsDataTypeSerializer(Class<TenancyProductsDataType> t) {
      super(t);
    }

    public TenancyProductsDataTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        TenancyProductsDataType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static TenancyProductsDataType fromValue(String value) {
    return new TenancyProductsDataType(value);
  }
}
