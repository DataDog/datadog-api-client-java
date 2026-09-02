/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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

/** Data source for Product Analytics Extended queries. */
@JsonSerialize(
    using =
        FormulaAndFunctionProductAnalyticsExtendedDataSource
            .FormulaAndFunctionProductAnalyticsExtendedDataSourceSerializer.class)
public class FormulaAndFunctionProductAnalyticsExtendedDataSource extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("product_analytics_extended"));

  public static final FormulaAndFunctionProductAnalyticsExtendedDataSource
      PRODUCT_ANALYTICS_EXTENDED =
          new FormulaAndFunctionProductAnalyticsExtendedDataSource("product_analytics_extended");

  FormulaAndFunctionProductAnalyticsExtendedDataSource(String value) {
    super(value, allowedValues);
  }

  public static class FormulaAndFunctionProductAnalyticsExtendedDataSourceSerializer
      extends StdSerializer<FormulaAndFunctionProductAnalyticsExtendedDataSource> {
    public FormulaAndFunctionProductAnalyticsExtendedDataSourceSerializer(
        Class<FormulaAndFunctionProductAnalyticsExtendedDataSource> t) {
      super(t);
    }

    public FormulaAndFunctionProductAnalyticsExtendedDataSourceSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        FormulaAndFunctionProductAnalyticsExtendedDataSource value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static FormulaAndFunctionProductAnalyticsExtendedDataSource fromValue(String value) {
    return new FormulaAndFunctionProductAnalyticsExtendedDataSource(value);
  }
}
