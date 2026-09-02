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

/** Time unit for a fixed-length retention interval. */
@JsonSerialize(
    using =
        ProductAnalyticsRetentionFixedTimeIntervalUnit
            .ProductAnalyticsRetentionFixedTimeIntervalUnitSerializer.class)
public class ProductAnalyticsRetentionFixedTimeIntervalUnit extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("day", "week", "month"));

  public static final ProductAnalyticsRetentionFixedTimeIntervalUnit DAY =
      new ProductAnalyticsRetentionFixedTimeIntervalUnit("day");
  public static final ProductAnalyticsRetentionFixedTimeIntervalUnit WEEK =
      new ProductAnalyticsRetentionFixedTimeIntervalUnit("week");
  public static final ProductAnalyticsRetentionFixedTimeIntervalUnit MONTH =
      new ProductAnalyticsRetentionFixedTimeIntervalUnit("month");

  ProductAnalyticsRetentionFixedTimeIntervalUnit(String value) {
    super(value, allowedValues);
  }

  public static class ProductAnalyticsRetentionFixedTimeIntervalUnitSerializer
      extends StdSerializer<ProductAnalyticsRetentionFixedTimeIntervalUnit> {
    public ProductAnalyticsRetentionFixedTimeIntervalUnitSerializer(
        Class<ProductAnalyticsRetentionFixedTimeIntervalUnit> t) {
      super(t);
    }

    public ProductAnalyticsRetentionFixedTimeIntervalUnitSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ProductAnalyticsRetentionFixedTimeIntervalUnit value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ProductAnalyticsRetentionFixedTimeIntervalUnit fromValue(String value) {
    return new ProductAnalyticsRetentionFixedTimeIntervalUnit(value);
  }
}
