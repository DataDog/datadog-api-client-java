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

/** The resource type identifier for a retention scalar or retention timeseries request. */
@JsonSerialize(
    using =
        ProductAnalyticsFormulaRetentionRequestType
            .ProductAnalyticsFormulaRetentionRequestTypeSerializer.class)
public class ProductAnalyticsFormulaRetentionRequestType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("formula_retention_request"));

  public static final ProductAnalyticsFormulaRetentionRequestType FORMULA_RETENTION_REQUEST =
      new ProductAnalyticsFormulaRetentionRequestType("formula_retention_request");

  ProductAnalyticsFormulaRetentionRequestType(String value) {
    super(value, allowedValues);
  }

  public static class ProductAnalyticsFormulaRetentionRequestTypeSerializer
      extends StdSerializer<ProductAnalyticsFormulaRetentionRequestType> {
    public ProductAnalyticsFormulaRetentionRequestTypeSerializer(
        Class<ProductAnalyticsFormulaRetentionRequestType> t) {
      super(t);
    }

    public ProductAnalyticsFormulaRetentionRequestTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ProductAnalyticsFormulaRetentionRequestType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ProductAnalyticsFormulaRetentionRequestType fromValue(String value) {
    return new ProductAnalyticsFormulaRetentionRequestType(value);
  }
}
